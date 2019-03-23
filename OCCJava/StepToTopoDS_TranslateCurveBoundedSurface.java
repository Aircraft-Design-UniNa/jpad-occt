package opencascade;

/**
 *  Translate curve_bounded_surface into TopoDS_Face
 */
public class StepToTopoDS_TranslateCurveBoundedSurface extends StepToTopoDS_Root {

  private long swigCPtr;
  StepToTopoDS_TranslateCurveBoundedSurface(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_TranslateCurveBoundedSurface_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  StepToTopoDS_TranslateCurveBoundedSurface(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_TranslateCurveBoundedSurface_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(StepToTopoDS_TranslateCurveBoundedSurface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_TranslateCurveBoundedSurface(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Create empty tool
   */
  public StepToTopoDS_TranslateCurveBoundedSurface() {
    this(OCCwrapJavaJNI.new_StepToTopoDS_TranslateCurveBoundedSurface__SWIG_0(), true);
  }

  /**
   *  Translate surface
   */
  public StepToTopoDS_TranslateCurveBoundedSurface( StepGeom_CurveBoundedSurface  CBS,  Transfer_TransientProcess  TP) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_TranslateCurveBoundedSurface__SWIG_1( StepGeom_CurveBoundedSurface.getCPtr(CBS) , CBS,  Transfer_TransientProcess.getCPtr(TP) , TP), true);
  }

  /**
   *  Translate surface
   */
  public long Init( StepGeom_CurveBoundedSurface  CBS,  Transfer_TransientProcess  TP) {
    return OCCwrapJavaJNI.StepToTopoDS_TranslateCurveBoundedSurface_Init(swigCPtr, this,  StepGeom_CurveBoundedSurface.getCPtr(CBS) , CBS,  Transfer_TransientProcess.getCPtr(TP) , TP);
  }

  /**
   *  Returns result of last translation or null wire if failed.
   */
  public  TopoDS_Face  Value() {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.StepToTopoDS_TranslateCurveBoundedSurface_Value(swigCPtr, this), true);
    return ret;
  }

}
