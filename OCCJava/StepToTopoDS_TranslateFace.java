package opencascade;

public class StepToTopoDS_TranslateFace extends StepToTopoDS_Root {

  private long swigCPtr;
  StepToTopoDS_TranslateFace(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_TranslateFace_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  StepToTopoDS_TranslateFace(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_TranslateFace_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(StepToTopoDS_TranslateFace obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_TranslateFace(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public StepToTopoDS_TranslateFace() {
    this(OCCwrapJavaJNI.new_StepToTopoDS_TranslateFace__SWIG_0(), true);
  }

  public StepToTopoDS_TranslateFace( StepShape_FaceSurface  FS, StepToTopoDS_Tool T, StepToTopoDS_NMTool NMTool) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_TranslateFace__SWIG_1( StepShape_FaceSurface.getCPtr(FS) , FS, StepToTopoDS_Tool.getCPtr(T), T, StepToTopoDS_NMTool.getCPtr(NMTool), NMTool), true);
  }

  public void Init( StepShape_FaceSurface  FS, StepToTopoDS_Tool T, StepToTopoDS_NMTool NMTool) {
    OCCwrapJavaJNI.StepToTopoDS_TranslateFace_Init(swigCPtr, this,  StepShape_FaceSurface.getCPtr(FS) , FS, StepToTopoDS_Tool.getCPtr(T), T, StepToTopoDS_NMTool.getCPtr(NMTool), NMTool);
  }

  public  TopoDS_Shape  Value() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_TranslateFace_Value(swigCPtr, this), true);
    return ret;
  }

  public StepToTopoDS_TranslateFaceError Error() {
    return StepToTopoDS_TranslateFaceError.swigToEnum(OCCwrapJavaJNI.StepToTopoDS_TranslateFace_Error(swigCPtr, this));
  }

}
