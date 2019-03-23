package opencascade;

public class StepToTopoDS_TranslatePolyLoop extends StepToTopoDS_Root {

  private long swigCPtr;
  StepToTopoDS_TranslatePolyLoop(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_TranslatePolyLoop_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  StepToTopoDS_TranslatePolyLoop(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_TranslatePolyLoop_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(StepToTopoDS_TranslatePolyLoop obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_TranslatePolyLoop(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public StepToTopoDS_TranslatePolyLoop() {
    this(OCCwrapJavaJNI.new_StepToTopoDS_TranslatePolyLoop__SWIG_0(), true);
  }

  public StepToTopoDS_TranslatePolyLoop( StepShape_PolyLoop  PL, StepToTopoDS_Tool T,  Geom_Surface  S,  TopoDS_Face  F) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_TranslatePolyLoop__SWIG_1( StepShape_PolyLoop.getCPtr(PL) , PL, StepToTopoDS_Tool.getCPtr(T), T,  Geom_Surface.getCPtr(S) , S, TopoDS_Face.getCPtr(F), F), true);
  }

  public void Init( StepShape_PolyLoop  PL, StepToTopoDS_Tool T,  Geom_Surface  S,  TopoDS_Face  F) {
    OCCwrapJavaJNI.StepToTopoDS_TranslatePolyLoop_Init(swigCPtr, this,  StepShape_PolyLoop.getCPtr(PL) , PL, StepToTopoDS_Tool.getCPtr(T), T,  Geom_Surface.getCPtr(S) , S, TopoDS_Face.getCPtr(F), F);
  }

  public  TopoDS_Shape  Value() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_TranslatePolyLoop_Value(swigCPtr, this), true);
    return ret;
  }

  public StepToTopoDS_TranslatePolyLoopError Error() {
    return StepToTopoDS_TranslatePolyLoopError.swigToEnum(OCCwrapJavaJNI.StepToTopoDS_TranslatePolyLoop_Error(swigCPtr, this));
  }

}
