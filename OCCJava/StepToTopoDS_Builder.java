package opencascade;

public class StepToTopoDS_Builder extends StepToTopoDS_Root {

  private long swigCPtr;
  StepToTopoDS_Builder(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_Builder_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  StepToTopoDS_Builder(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_Builder_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(StepToTopoDS_Builder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_Builder(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public StepToTopoDS_Builder() {
    this(OCCwrapJavaJNI.new_StepToTopoDS_Builder__SWIG_0(), true);
  }

  public StepToTopoDS_Builder( StepShape_ManifoldSolidBrep  S,  Transfer_TransientProcess  TP) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_Builder__SWIG_1( StepShape_ManifoldSolidBrep.getCPtr(S) , S,  Transfer_TransientProcess.getCPtr(TP) , TP), true);
  }

  public StepToTopoDS_Builder( StepShape_BrepWithVoids  S,  Transfer_TransientProcess  TP) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_Builder__SWIG_2( StepShape_BrepWithVoids.getCPtr(S) , S,  Transfer_TransientProcess.getCPtr(TP) , TP), true);
  }

  public StepToTopoDS_Builder( StepShape_FacetedBrep  S,  Transfer_TransientProcess  TP) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_Builder__SWIG_3( StepShape_FacetedBrep.getCPtr(S) , S,  Transfer_TransientProcess.getCPtr(TP) , TP), true);
  }

  public StepToTopoDS_Builder( StepShape_FacetedBrepAndBrepWithVoids  S,  Transfer_TransientProcess  TP) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_Builder__SWIG_4( StepShape_FacetedBrepAndBrepWithVoids.getCPtr(S) , S,  Transfer_TransientProcess.getCPtr(TP) , TP), true);
  }

  public StepToTopoDS_Builder( StepShape_ShellBasedSurfaceModel  S,  Transfer_TransientProcess  TP, StepToTopoDS_NMTool NMTool) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_Builder__SWIG_5( StepShape_ShellBasedSurfaceModel.getCPtr(S) , S,  Transfer_TransientProcess.getCPtr(TP) , TP, StepToTopoDS_NMTool.getCPtr(NMTool), NMTool), true);
  }

  public void Init( StepShape_ManifoldSolidBrep  S,  Transfer_TransientProcess  TP) {
    OCCwrapJavaJNI.StepToTopoDS_Builder_Init__SWIG_0(swigCPtr, this,  StepShape_ManifoldSolidBrep.getCPtr(S) , S,  Transfer_TransientProcess.getCPtr(TP) , TP);
  }

  public void Init( StepShape_BrepWithVoids  S,  Transfer_TransientProcess  TP) {
    OCCwrapJavaJNI.StepToTopoDS_Builder_Init__SWIG_1(swigCPtr, this,  StepShape_BrepWithVoids.getCPtr(S) , S,  Transfer_TransientProcess.getCPtr(TP) , TP);
  }

  public void Init( StepShape_FacetedBrep  S,  Transfer_TransientProcess  TP) {
    OCCwrapJavaJNI.StepToTopoDS_Builder_Init__SWIG_2(swigCPtr, this,  StepShape_FacetedBrep.getCPtr(S) , S,  Transfer_TransientProcess.getCPtr(TP) , TP);
  }

  public void Init( StepShape_FacetedBrepAndBrepWithVoids  S,  Transfer_TransientProcess  TP) {
    OCCwrapJavaJNI.StepToTopoDS_Builder_Init__SWIG_3(swigCPtr, this,  StepShape_FacetedBrepAndBrepWithVoids.getCPtr(S) , S,  Transfer_TransientProcess.getCPtr(TP) , TP);
  }

  public void Init( StepShape_ShellBasedSurfaceModel  S,  Transfer_TransientProcess  TP, StepToTopoDS_NMTool NMTool) {
    OCCwrapJavaJNI.StepToTopoDS_Builder_Init__SWIG_4(swigCPtr, this,  StepShape_ShellBasedSurfaceModel.getCPtr(S) , S,  Transfer_TransientProcess.getCPtr(TP) , TP, StepToTopoDS_NMTool.getCPtr(NMTool), NMTool);
  }

  public void Init( StepShape_EdgeBasedWireframeModel  S,  Transfer_TransientProcess  TP) {
    OCCwrapJavaJNI.StepToTopoDS_Builder_Init__SWIG_5(swigCPtr, this,  StepShape_EdgeBasedWireframeModel.getCPtr(S) , S,  Transfer_TransientProcess.getCPtr(TP) , TP);
  }

  public void Init( StepShape_FaceBasedSurfaceModel  S,  Transfer_TransientProcess  TP) {
    OCCwrapJavaJNI.StepToTopoDS_Builder_Init__SWIG_6(swigCPtr, this,  StepShape_FaceBasedSurfaceModel.getCPtr(S) , S,  Transfer_TransientProcess.getCPtr(TP) , TP);
  }

  public void Init( StepShape_GeometricSet  S,  Transfer_TransientProcess  TP,  Transfer_ActorOfTransientProcess  RA, long isManifold) {
    OCCwrapJavaJNI.StepToTopoDS_Builder_Init__SWIG_7(swigCPtr, this,  StepShape_GeometricSet.getCPtr(S) , S,  Transfer_TransientProcess.getCPtr(TP) , TP,  Transfer_ActorOfTransientProcess.getCPtr(RA) , RA, isManifold);
  }

  public void Init( StepShape_GeometricSet  S,  Transfer_TransientProcess  TP,  Transfer_ActorOfTransientProcess  RA) {
    OCCwrapJavaJNI.StepToTopoDS_Builder_Init__SWIG_8(swigCPtr, this,  StepShape_GeometricSet.getCPtr(S) , S,  Transfer_TransientProcess.getCPtr(TP) , TP,  Transfer_ActorOfTransientProcess.getCPtr(RA) , RA);
  }

  public void Init( StepShape_GeometricSet  S,  Transfer_TransientProcess  TP) {
    OCCwrapJavaJNI.StepToTopoDS_Builder_Init__SWIG_9(swigCPtr, this,  StepShape_GeometricSet.getCPtr(S) , S,  Transfer_TransientProcess.getCPtr(TP) , TP);
  }

  public  TopoDS_Shape  Value() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_Builder_Value(swigCPtr, this), true);
    return ret;
  }

  public StepToTopoDS_BuilderError Error() {
    return StepToTopoDS_BuilderError.swigToEnum(OCCwrapJavaJNI.StepToTopoDS_Builder_Error(swigCPtr, this));
  }

}
