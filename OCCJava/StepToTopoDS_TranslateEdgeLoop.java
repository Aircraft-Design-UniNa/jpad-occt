package opencascade;

public class StepToTopoDS_TranslateEdgeLoop extends StepToTopoDS_Root {

  private long swigCPtr;
  StepToTopoDS_TranslateEdgeLoop(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_TranslateEdgeLoop_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  StepToTopoDS_TranslateEdgeLoop(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_TranslateEdgeLoop_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(StepToTopoDS_TranslateEdgeLoop obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_TranslateEdgeLoop(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public StepToTopoDS_TranslateEdgeLoop() {
    this(OCCwrapJavaJNI.new_StepToTopoDS_TranslateEdgeLoop__SWIG_0(), true);
  }

  public StepToTopoDS_TranslateEdgeLoop( StepShape_FaceBound  FB,  TopoDS_Face  F,  Geom_Surface  S,  StepGeom_Surface  SS, long ss, StepToTopoDS_Tool T, StepToTopoDS_NMTool NMTool) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_TranslateEdgeLoop__SWIG_1( StepShape_FaceBound.getCPtr(FB) , FB, TopoDS_Face.getCPtr(F), F,  Geom_Surface.getCPtr(S) , S,  StepGeom_Surface.getCPtr(SS) , SS, ss, StepToTopoDS_Tool.getCPtr(T), T, StepToTopoDS_NMTool.getCPtr(NMTool), NMTool), true);
  }

  public void Init( StepShape_FaceBound  FB,  TopoDS_Face  F,  Geom_Surface  S,  StepGeom_Surface  SS, long ss, StepToTopoDS_Tool T, StepToTopoDS_NMTool NMTool) {
    OCCwrapJavaJNI.StepToTopoDS_TranslateEdgeLoop_Init(swigCPtr, this,  StepShape_FaceBound.getCPtr(FB) , FB, TopoDS_Face.getCPtr(F), F,  Geom_Surface.getCPtr(S) , S,  StepGeom_Surface.getCPtr(SS) , SS, ss, StepToTopoDS_Tool.getCPtr(T), T, StepToTopoDS_NMTool.getCPtr(NMTool), NMTool);
  }

  public  TopoDS_Shape  Value() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_TranslateEdgeLoop_Value(swigCPtr, this), true);
    return ret;
  }

  public StepToTopoDS_TranslateEdgeLoopError Error() {
    return StepToTopoDS_TranslateEdgeLoopError.swigToEnum(OCCwrapJavaJNI.StepToTopoDS_TranslateEdgeLoop_Error(swigCPtr, this));
  }

}
