package opencascade;

/**
 *  This Tool Class provides Information to build
 *  a Cas.Cad BRep from a ProSTEP Shape model.
 */
public class StepToTopoDS_Tool {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepToTopoDS_Tool(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepToTopoDS_Tool(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepToTopoDS_Tool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_Tool(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepToTopoDS_Tool() {
    this(OCCwrapJavaJNI.new_StepToTopoDS_Tool__SWIG_0(), true);
  }

  public StepToTopoDS_Tool(StepToTopoDS_DataMapOfTRI Map,  Transfer_TransientProcess  TP) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_Tool__SWIG_1(StepToTopoDS_DataMapOfTRI.getCPtr(Map), Map,  Transfer_TransientProcess.getCPtr(TP) , TP), true);
  }

  public void Init(StepToTopoDS_DataMapOfTRI Map,  Transfer_TransientProcess  TP) {
    OCCwrapJavaJNI.StepToTopoDS_Tool_Init(swigCPtr, this, StepToTopoDS_DataMapOfTRI.getCPtr(Map), Map,  Transfer_TransientProcess.getCPtr(TP) , TP);
  }

  public long IsBound( StepShape_TopologicalRepresentationItem  TRI) {
    return OCCwrapJavaJNI.StepToTopoDS_Tool_IsBound(swigCPtr, this,  StepShape_TopologicalRepresentationItem.getCPtr(TRI) , TRI);
  }

  public void Bind( StepShape_TopologicalRepresentationItem  TRI,  TopoDS_Shape  S) {
    OCCwrapJavaJNI.StepToTopoDS_Tool_Bind(swigCPtr, this,  StepShape_TopologicalRepresentationItem.getCPtr(TRI) , TRI, TopoDS_Shape.getCPtr(S), S);
  }

  public  TopoDS_Shape  Find( StepShape_TopologicalRepresentationItem  TRI) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_Tool_Find(swigCPtr, this,  StepShape_TopologicalRepresentationItem.getCPtr(TRI) , TRI), true);
    return ret;
  }

  public void ClearEdgeMap() {
    OCCwrapJavaJNI.StepToTopoDS_Tool_ClearEdgeMap(swigCPtr, this);
  }

  public long IsEdgeBound(StepToTopoDS_PointPair PP) {
    return OCCwrapJavaJNI.StepToTopoDS_Tool_IsEdgeBound(swigCPtr, this, StepToTopoDS_PointPair.getCPtr(PP), PP);
  }

  public void BindEdge(StepToTopoDS_PointPair PP,  TopoDS_Edge  E) {
    OCCwrapJavaJNI.StepToTopoDS_Tool_BindEdge(swigCPtr, this, StepToTopoDS_PointPair.getCPtr(PP), PP, TopoDS_Edge.getCPtr(E), E);
  }

  public  TopoDS_Edge  FindEdge(StepToTopoDS_PointPair PP) {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.StepToTopoDS_Tool_FindEdge(swigCPtr, this, StepToTopoDS_PointPair.getCPtr(PP), PP), true);
    return ret;
  }

  public void ClearVertexMap() {
    OCCwrapJavaJNI.StepToTopoDS_Tool_ClearVertexMap(swigCPtr, this);
  }

  public long IsVertexBound( StepGeom_CartesianPoint  PG) {
    return OCCwrapJavaJNI.StepToTopoDS_Tool_IsVertexBound(swigCPtr, this,  StepGeom_CartesianPoint.getCPtr(PG) , PG);
  }

  public void BindVertex( StepGeom_CartesianPoint  P,  TopoDS_Vertex  V) {
    OCCwrapJavaJNI.StepToTopoDS_Tool_BindVertex(swigCPtr, this,  StepGeom_CartesianPoint.getCPtr(P) , P, TopoDS_Vertex.getCPtr(V), V);
  }

  public  TopoDS_Vertex  FindVertex( StepGeom_CartesianPoint  P) {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.StepToTopoDS_Tool_FindVertex(swigCPtr, this,  StepGeom_CartesianPoint.getCPtr(P) , P), true);
    return ret;
  }

  public void ComputePCurve(long B) {
    OCCwrapJavaJNI.StepToTopoDS_Tool_ComputePCurve__SWIG_0(swigCPtr, this, B);
  }

  public long ComputePCurve() {
    return OCCwrapJavaJNI.StepToTopoDS_Tool_ComputePCurve__SWIG_1(swigCPtr, this);
  }

  public  Transfer_TransientProcess  TransientProcess() {
    return new Transfer_TransientProcess ( OCCwrapJavaJNI.StepToTopoDS_Tool_TransientProcess(swigCPtr, this), true );
  }

  public void AddContinuity( Geom_Surface  GeomSurf) {
    OCCwrapJavaJNI.StepToTopoDS_Tool_AddContinuity__SWIG_0(swigCPtr, this,  Geom_Surface.getCPtr(GeomSurf) , GeomSurf);
  }

  public void AddContinuity( Geom_Curve  GeomCurve) {
    OCCwrapJavaJNI.StepToTopoDS_Tool_AddContinuity__SWIG_1(swigCPtr, this,  Geom_Curve.getCPtr(GeomCurve) , GeomCurve);
  }

  public void AddContinuity( Geom2d_Curve  GeomCur2d) {
    OCCwrapJavaJNI.StepToTopoDS_Tool_AddContinuity__SWIG_2(swigCPtr, this,  Geom2d_Curve.getCPtr(GeomCur2d) , GeomCur2d);
  }

  public int C0Surf() {
    return OCCwrapJavaJNI.StepToTopoDS_Tool_C0Surf(swigCPtr, this);
  }

  public int C1Surf() {
    return OCCwrapJavaJNI.StepToTopoDS_Tool_C1Surf(swigCPtr, this);
  }

  public int C2Surf() {
    return OCCwrapJavaJNI.StepToTopoDS_Tool_C2Surf(swigCPtr, this);
  }

  public int C0Cur2() {
    return OCCwrapJavaJNI.StepToTopoDS_Tool_C0Cur2(swigCPtr, this);
  }

  public int C1Cur2() {
    return OCCwrapJavaJNI.StepToTopoDS_Tool_C1Cur2(swigCPtr, this);
  }

  public int C2Cur2() {
    return OCCwrapJavaJNI.StepToTopoDS_Tool_C2Cur2(swigCPtr, this);
  }

  public int C0Cur3() {
    return OCCwrapJavaJNI.StepToTopoDS_Tool_C0Cur3(swigCPtr, this);
  }

  public int C1Cur3() {
    return OCCwrapJavaJNI.StepToTopoDS_Tool_C1Cur3(swigCPtr, this);
  }

  public int C2Cur3() {
    return OCCwrapJavaJNI.StepToTopoDS_Tool_C2Cur3(swigCPtr, this);
  }

}
