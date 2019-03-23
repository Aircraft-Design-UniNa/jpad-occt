package opencascade;

public class StepToTopoDS_TranslateVertexLoop extends StepToTopoDS_Root {

  private long swigCPtr;
  StepToTopoDS_TranslateVertexLoop(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_TranslateVertexLoop_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  StepToTopoDS_TranslateVertexLoop(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_TranslateVertexLoop_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(StepToTopoDS_TranslateVertexLoop obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_TranslateVertexLoop(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public StepToTopoDS_TranslateVertexLoop() {
    this(OCCwrapJavaJNI.new_StepToTopoDS_TranslateVertexLoop__SWIG_0(), true);
  }

  public StepToTopoDS_TranslateVertexLoop( StepShape_VertexLoop  VL, StepToTopoDS_Tool T, StepToTopoDS_NMTool NMTool) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_TranslateVertexLoop__SWIG_1( StepShape_VertexLoop.getCPtr(VL) , VL, StepToTopoDS_Tool.getCPtr(T), T, StepToTopoDS_NMTool.getCPtr(NMTool), NMTool), true);
  }

  public void Init( StepShape_VertexLoop  VL, StepToTopoDS_Tool T, StepToTopoDS_NMTool NMTool) {
    OCCwrapJavaJNI.StepToTopoDS_TranslateVertexLoop_Init(swigCPtr, this,  StepShape_VertexLoop.getCPtr(VL) , VL, StepToTopoDS_Tool.getCPtr(T), T, StepToTopoDS_NMTool.getCPtr(NMTool), NMTool);
  }

  public  TopoDS_Shape  Value() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_TranslateVertexLoop_Value(swigCPtr, this), true);
    return ret;
  }

  public StepToTopoDS_TranslateVertexLoopError Error() {
    return StepToTopoDS_TranslateVertexLoopError.swigToEnum(OCCwrapJavaJNI.StepToTopoDS_TranslateVertexLoop_Error(swigCPtr, this));
  }

}
