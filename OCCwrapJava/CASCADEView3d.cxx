// File:    CASCADEView3d.cxx
// Created: Wed Jul 18 11:11:22 2001
// Author:<avo@TIREX>


#ifdef _WIN32
# include <windows.h>
#endif

#include <Standard_Stream.hxx>

#include <jawt_md.h>

#include "CASCADEView3d.hxx"

#include <V3d_View.hxx>
//#pragma comment(lib, "TKV3d.lib")
#ifdef _WIN32
# include <WNT_Window.hxx>
# include <OpenGl_GraphicDriver.hxx>
//#pragma comment(lib, "TKOpenGl.lib")
#else
# include <Xw_Window.hxx>
# include <OpenGl_GraphicDriver.hxx>
#endif  // _WIN32

#define RETURN_ERROR(msg) {cout << "Error: '"<< msg <<"'" << endl;return;}

void ThrowException(JNIEnv *env, const char* message)
{
    env->ExceptionClear();
    jclass newExcCls;
    newExcCls = env->FindClass("java/lang/RuntimeException");
    if (newExcCls != 0) {
        env->ThrowNew(newExcCls, message);
    }
    return;
}

void* GetHandle(JNIEnv *env, jobject jView)
{
  jclass cls1 = env->FindClass("opencascade/Standard_Transient");
  jclass jClass = 0;
  if (cls1){
    jClass = (jclass) env->NewGlobalRef(cls1);
  }
  jfieldID jHIDfid = 0;
  if (jClass) {
    jHIDfid = env->GetFieldID(jClass, "swigCPtr", "J");
  }
  return (void*)env->GetLongField(jView, jHIDfid);
}

/*
 * Class:     CASCADEView3d
 * Method:    paint
 * Signature: (Ljava/awt/Graphics;)V
 */
JNIEXPORT void JNICALL Java_CASCADEView3d_paint (JNIEnv *env, jobject theCanvas, jobject theGraphics){
  (void)theGraphics;
  jclass jViewPort3dClass = env->FindClass("CASCADEView3d");
  if(!jViewPort3dClass)RETURN_ERROR("cant find canvas class");
  jfieldID jIsWindowID = env->GetFieldID(jViewPort3dClass, "hasWindow", "Z");
  if(!jIsWindowID)RETURN_ERROR("cant find the boolean field id");
  jboolean jIsWindow = env->GetBooleanField(theCanvas, jIsWindowID);

  Handle(V3d_View) theView;
  Handle(V3d_Viewer) theViewer;

  if(!jIsWindow){
    // get the window view and viewer
    jfieldID jViewID = env->GetFieldID(jViewPort3dClass, "myView", "Lopencascade/V3d_View;");
    if(!jViewID) RETURN_ERROR("cant find the view field id");
    jobject jView = env->GetObjectField(theCanvas, jViewID);

    if(!jView) { // viewer and view are not created, create them now.
      Standard_ExtString aViewerName = TCollection_ExtendedString ("V3d_Viewer in SimpleViewer").ToExtString();
#ifdef _WIN32
      static Handle(OpenGl_GraphicDriver) defaultDevice;
      if (defaultDevice.IsNull()) {
        Aspect_DisplayConnection* aDisplayConnection = new Aspect_DisplayConnection();
        defaultDevice = new OpenGl_GraphicDriver(aDisplayConnection);
      }

      theViewer = new V3d_Viewer(defaultDevice, aViewerName);
#else
      static Handle(OpenGl_GraphicDriver) defaultDevice;
    
      if (defaultDevice.IsNull()) {
        Aspect_DisplayConnection* aDisplayConnection = new Aspect_DisplayConnection();
        defaultDevice = new OpenGl_GraphicDriver(aDisplayConnection);
      }
      theViewer = new V3d_Viewer(defaultDevice, aViewerName);
#endif //_WIN32
      theView = theViewer->CreateView();
      // store the values into the fields
    }else {
      void *ptrView = GetHandle(env, jView);
      if (ptrView != NULL) {
    theView = *((Handle(V3d_View)*)ptrView);
      }else{
    cout << "Error: cant get V3d_View from canvas field" << endl;
      }
    }

// start paste
    if (!theView.IsNull()){
      // get drawing surface
      //-----------------------------------------------
      JAWT awt;
      JAWT_DrawingSurface* ds;
      JAWT_DrawingSurfaceInfo* dsi;
#ifdef _WIN32
      JAWT_Win32DrawingSurfaceInfo* dsi_win;
#else
      JAWT_X11DrawingSurfaceInfo* dsi_x11;
#endif //_WIN32
      jboolean result;
      jint lock;

      // Get the AWT
      awt.version = JAWT_VERSION_1_3;
      result = JAWT_GetAWT(env, &awt);
      if (result == JNI_FALSE)
        {
          cout << "AWT not found" << endl;
          ThrowException(env, "AWT not found\n");
          return;
        }

      // Get the drawing surface
      ds = awt.GetDrawingSurface(env, theCanvas);
      if (ds == NULL)
        {
          cout << "NULL drawing surface" << endl;
          ThrowException(env, "NULL drawing surface\n");
          return;
        }

      // Lock the drawing surface
      lock = ds->Lock(ds);
      if ((lock & JAWT_LOCK_ERROR) != 0)
        {
          cout << "Error locking surface" << endl;
          ThrowException(env, "Error locking surface\n");
          awt.FreeDrawingSurface(ds);
          return;
        }

      // Get the drawing surface info
      dsi = ds->GetDrawingSurfaceInfo(ds);
      if (dsi == NULL)
        {
          cout << "Error getting surface info" << endl;
          ThrowException(env, "Error getting surface info\n");
          ds->Unlock(ds);
          awt.FreeDrawingSurface(ds);
          return;
        }

      // Get the platform-specific drawing info
      Aspect_Handle theWindow;
#ifdef _WIN32
      dsi_win = (JAWT_Win32DrawingSurfaceInfo*)dsi->platformInfo;
      theWindow = dsi_win->hwnd;
#else
      dsi_x11 = (JAWT_X11DrawingSurfaceInfo*)dsi->platformInfo;
      theWindow = dsi_x11->drawable;
#endif

          if (jIsWindow == JNI_FALSE)
        {
#ifdef _WIN32
          LONG_PTR wd = GetWindowLongPtr (( HWND )theWindow, GWLP_USERDATA);
          LONG_PTR wProc = GetWindowLongPtr (( HWND )theWindow, GWLP_WNDPROC);
#endif


#ifdef _WIN32
          Handle(WNT_Window) w = new WNT_Window(theWindow);
#else
          Handle(Xw_Window) w = new Xw_Window(theView->Viewer()->Driver()->GetDisplayConnection(), (Window)theWindow);
#endif
          theView->SetWindow(w); 

#ifdef _WIN32
          SetWindowLongPtr ((HWND) theWindow, GWLP_USERDATA, wd);
         SetWindowLongPtr ((HWND) theWindow, GWLP_WNDPROC, wProc);
#endif

          jIsWindow = JNI_TRUE;
        }
          
      env->SetBooleanField(theCanvas, jIsWindowID, jIsWindow);

      // Free the AWT
      //-----------------------------------------------

      // Free the drawing surface info
      ds->FreeDrawingSurfaceInfo(dsi);

      // Unlock the drawing surface
      ds->Unlock(ds);

      // Free the drawing surface
      awt.FreeDrawingSurface(ds);
    }else{
      cout << "Error: Cant obtain V3d_View" << endl;
    }
/////////////////////////// end paste
} // end !hasWindow. 

// get stored view field
  jfieldID jViewID = env->GetFieldID(jViewPort3dClass, "myView", "Lopencascade/V3d_View;");
  jobject jView = env->GetObjectField(theCanvas, jViewID);
  if(!jView){
    ThrowException(env, "Error getting viewer while has window ?\n");
    return;
  }
  void *ptrView = GetHandle(env, jView);
  if (ptrView != NULL)
    theView = *((Handle(V3d_View)*)ptrView);

// paint routine.
  if(theView.IsNull()){
    ThrowException(env, "Error getting V3d_View ?\n");
    return;
  }

      JAWT awt;
      JAWT_DrawingSurface* ds;
      jboolean result;
      jint lock;

      // Get the AWT
      awt.version = JAWT_VERSION_1_3;
      result = JAWT_GetAWT(env, &awt);
      if (result == JNI_FALSE)
        {
          cout << "AWT not found" << endl;
          ThrowException(env, "AWT not found\n");
          return;
        }

      // Get the drawing surface
      ds = awt.GetDrawingSurface(env, theCanvas);
      if (ds == NULL)
        {
          cout << "NULL drawing surface" << endl;
          ThrowException(env, "NULL drawing surface\n");
          return;
        }

      // Lock the drawing surface
      lock = ds->Lock(ds);
      if ((lock & JAWT_LOCK_ERROR) != 0)
        {
          cout << "Error locking surface" << endl;
          ThrowException(env, "Error locking surface\n");
          awt.FreeDrawingSurface(ds);
          return;
        }

      // Redraw V3d_View after locking AWT drawing surface

      jfieldID jNeedResizeID = env->GetFieldID(jViewPort3dClass, "needResize", "Z");
      if(!jNeedResizeID){ 
          ds->Unlock(ds);
          awt.FreeDrawingSurface(ds);
          ThrowException(env, "cant find the needREsize field id"); 
          return; 
      }

      jboolean jNeedResize = env->GetBooleanField(theCanvas, jNeedResizeID);
      if(jNeedResize == JNI_TRUE){  
          theView->MustBeResized();
          jNeedResize = JNI_FALSE;
          env->SetBooleanField(theCanvas, jNeedResizeID, jNeedResize);
      }
          theView->Redraw();
      ds->Unlock(ds);

      // Free the drawing surface
      awt.FreeDrawingSurface(ds);
}
