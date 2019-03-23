package opencascade;

public class StepToTopoDS_TranslateVertex extends StepToTopoDS_Root {

  private long swigCPtr;
  StepToTopoDS_TranslateVertex(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_TranslateVertex_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  StepToTopoDS_TranslateVertex(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_TranslateVertex_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(StepToTopoDS_TranslateVertex obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_TranslateVertex(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public StepToTopoDS_TranslateVertex() {
    this(OCCwrapJavaJNI.new_StepToTopoDS_TranslateVertex__SWIG_0(), true);
  }

  public StepToTopoDS_TranslateVertex( StepShape_Vertex  V, StepToTopoDS_Tool T, StepToTopoDS_NMTool NMTool) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_TranslateVertex__SWIG_1( StepShape_Vertex.getCPtr(V) , V, StepToTopoDS_Tool.getCPtr(T), T, StepToTopoDS_NMTool.getCPtr(NMTool), NMTool), true);
  }

  public void Init( StepShape_Vertex  V, StepToTopoDS_Tool T, StepToTopoDS_NMTool NMTool) {
    OCCwrapJavaJNI.StepToTopoDS_TranslateVertex_Init(swigCPtr, this,  StepShape_Vertex.getCPtr(V) , V, StepToTopoDS_Tool.getCPtr(T), T, StepToTopoDS_NMTool.getCPtr(NMTool), NMTool);
  }

  public  TopoDS_Shape  Value() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_TranslateVertex_Value(swigCPtr, this), true);
    return ret;
  }

  public StepToTopoDS_TranslateVertexError Error() {
    return StepToTopoDS_TranslateVertexError.swigToEnum(OCCwrapJavaJNI.StepToTopoDS_TranslateVertex_Error(swigCPtr, this));
  }

}
