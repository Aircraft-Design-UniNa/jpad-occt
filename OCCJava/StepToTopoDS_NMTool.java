package opencascade;

/**
 *  Provides data to process non-manifold topology when
 *  reading from STEP.
 */
public class StepToTopoDS_NMTool {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepToTopoDS_NMTool(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepToTopoDS_NMTool(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepToTopoDS_NMTool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_NMTool(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepToTopoDS_NMTool() {
    this(OCCwrapJavaJNI.new_StepToTopoDS_NMTool__SWIG_0(), true);
  }

  public StepToTopoDS_NMTool( StepToTopoDS_DataMapOfRI  MapOfRI,  StepToTopoDS_DataMapOfRINames  MapOfRINames) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_NMTool__SWIG_1(StepToTopoDS_DataMapOfRI.getCPtr(MapOfRI), MapOfRI, StepToTopoDS_DataMapOfRINames.getCPtr(MapOfRINames), MapOfRINames), true);
  }

  public void Init( StepToTopoDS_DataMapOfRI  MapOfRI,  StepToTopoDS_DataMapOfRINames  MapOfRINames) {
    OCCwrapJavaJNI.StepToTopoDS_NMTool_Init(swigCPtr, this, StepToTopoDS_DataMapOfRI.getCPtr(MapOfRI), MapOfRI, StepToTopoDS_DataMapOfRINames.getCPtr(MapOfRINames), MapOfRINames);
  }

  public void SetActive(long isActive) {
    OCCwrapJavaJNI.StepToTopoDS_NMTool_SetActive(swigCPtr, this, isActive);
  }

  public long IsActive() {
    return OCCwrapJavaJNI.StepToTopoDS_NMTool_IsActive(swigCPtr, this);
  }

  public void CleanUp() {
    OCCwrapJavaJNI.StepToTopoDS_NMTool_CleanUp(swigCPtr, this);
  }

  public long IsBound( StepRepr_RepresentationItem  RI) {
    return OCCwrapJavaJNI.StepToTopoDS_NMTool_IsBound__SWIG_0(swigCPtr, this,  StepRepr_RepresentationItem.getCPtr(RI) , RI);
  }

  public long IsBound( TCollection_AsciiString  RIName) {
    return OCCwrapJavaJNI.StepToTopoDS_NMTool_IsBound__SWIG_1(swigCPtr, this, TCollection_AsciiString.getCPtr(RIName), RIName);
  }

  public void Bind( StepRepr_RepresentationItem  RI,  TopoDS_Shape  S) {
    OCCwrapJavaJNI.StepToTopoDS_NMTool_Bind__SWIG_0(swigCPtr, this,  StepRepr_RepresentationItem.getCPtr(RI) , RI, TopoDS_Shape.getCPtr(S), S);
  }

  public void Bind( TCollection_AsciiString  RIName,  TopoDS_Shape  S) {
    OCCwrapJavaJNI.StepToTopoDS_NMTool_Bind__SWIG_1(swigCPtr, this, TCollection_AsciiString.getCPtr(RIName), RIName, TopoDS_Shape.getCPtr(S), S);
  }

  public  TopoDS_Shape  Find( StepRepr_RepresentationItem  RI) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_NMTool_Find__SWIG_0(swigCPtr, this,  StepRepr_RepresentationItem.getCPtr(RI) , RI), true);
    return ret;
  }

  public  TopoDS_Shape  Find( TCollection_AsciiString  RIName) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_NMTool_Find__SWIG_1(swigCPtr, this, TCollection_AsciiString.getCPtr(RIName), RIName), true);
    return ret;
  }

  public void RegisterNMEdge( TopoDS_Shape  Edge) {
    OCCwrapJavaJNI.StepToTopoDS_NMTool_RegisterNMEdge(swigCPtr, this, TopoDS_Shape.getCPtr(Edge), Edge);
  }

  public long IsSuspectedAsClosing( TopoDS_Shape  BaseShell,  TopoDS_Shape  SuspectedShell) {
    return OCCwrapJavaJNI.StepToTopoDS_NMTool_IsSuspectedAsClosing(swigCPtr, this, TopoDS_Shape.getCPtr(BaseShell), BaseShell, TopoDS_Shape.getCPtr(SuspectedShell), SuspectedShell);
  }

  public long IsPureNMShell( TopoDS_Shape  Shell) {
    return OCCwrapJavaJNI.StepToTopoDS_NMTool_IsPureNMShell(swigCPtr, this, TopoDS_Shape.getCPtr(Shell), Shell);
  }

  public void SetIDEASCase(long IDEASCase) {
    OCCwrapJavaJNI.StepToTopoDS_NMTool_SetIDEASCase(swigCPtr, this, IDEASCase);
  }

  public long IsIDEASCase() {
    return OCCwrapJavaJNI.StepToTopoDS_NMTool_IsIDEASCase(swigCPtr, this);
  }

}
