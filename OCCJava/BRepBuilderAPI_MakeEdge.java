package opencascade;

/**
 *  Provides methods to build edges.
 * 
 *  The   methods have  the  following   syntax, where
 *  TheCurve is one of Lin, Circ, ...
 * 
 *  Create(C : TheCurve)
 * 
 *  Makes an edge on  the whole curve.  Add vertices
 *  on finite curves.
 * 
 *  Create(C : TheCurve; p1,p2 : Real)
 * 
 *  Make an edge  on the curve between parameters p1
 *  and p2. if p2 < p1 the edge will be REVERSED. If
 *  p1  or p2 is infinite the  curve will be open in
 *  that  direction. Vertices are created for finite
 *  values of p1 and p2.
 * 
 *  Create(C : TheCurve; P1, P2 : Pnt from gp)
 * 
 *  Make an edge on the curve  between the points P1
 *  and P2. The  points are projected on   the curve
 *  and the   previous method is  used. An  error is
 *  raised if the points are not on the curve.
 * 
 *  Create(C : TheCurve; V1, V2 : Vertex from TopoDS)
 * 
 *  Make an edge  on the curve  between the vertices
 *  V1 and V2. Same as the  previous but no vertices
 *  are created. If a vertex is  Null the curve will
 *  be open in this direction.
 */
public class BRepBuilderAPI_MakeEdge extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepBuilderAPI_MakeEdge(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepBuilderAPI_MakeEdge(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepBuilderAPI_MakeEdge obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepBuilderAPI_MakeEdge(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BRepBuilderAPI_MakeEdge() {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_0(), true);
  }

  public BRepBuilderAPI_MakeEdge( TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_1(TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2), true);
  }

  public BRepBuilderAPI_MakeEdge( gp_Pnt  P1,  gp_Pnt  P2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_2(gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

  public BRepBuilderAPI_MakeEdge( gp_Lin  L) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_3(gp_Lin.getCPtr(L), L), true);
  }

  public BRepBuilderAPI_MakeEdge( gp_Lin  L, double p1, double p2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_4(gp_Lin.getCPtr(L), L, p1, p2), true);
  }

  public BRepBuilderAPI_MakeEdge( gp_Lin  L,  gp_Pnt  P1,  gp_Pnt  P2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_5(gp_Lin.getCPtr(L), L, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

  public BRepBuilderAPI_MakeEdge( gp_Lin  L,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_6(gp_Lin.getCPtr(L), L, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2), true);
  }

  public BRepBuilderAPI_MakeEdge( gp_Circ  L) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_7(gp_Circ.getCPtr(L), L), true);
  }

  public BRepBuilderAPI_MakeEdge( gp_Circ  L, double p1, double p2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_8(gp_Circ.getCPtr(L), L, p1, p2), true);
  }

  public BRepBuilderAPI_MakeEdge( gp_Circ  L,  gp_Pnt  P1,  gp_Pnt  P2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_9(gp_Circ.getCPtr(L), L, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

  public BRepBuilderAPI_MakeEdge( gp_Circ  L,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_10(gp_Circ.getCPtr(L), L, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2), true);
  }

  public BRepBuilderAPI_MakeEdge( gp_Elips  L) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_11(gp_Elips.getCPtr(L), L), true);
  }

  public BRepBuilderAPI_MakeEdge( gp_Elips  L, double p1, double p2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_12(gp_Elips.getCPtr(L), L, p1, p2), true);
  }

  public BRepBuilderAPI_MakeEdge( gp_Elips  L,  gp_Pnt  P1,  gp_Pnt  P2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_13(gp_Elips.getCPtr(L), L, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

  public BRepBuilderAPI_MakeEdge( gp_Elips  L,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_14(gp_Elips.getCPtr(L), L, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2), true);
  }

  public BRepBuilderAPI_MakeEdge( gp_Hypr  L) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_15(gp_Hypr.getCPtr(L), L), true);
  }

  public BRepBuilderAPI_MakeEdge( gp_Hypr  L, double p1, double p2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_16(gp_Hypr.getCPtr(L), L, p1, p2), true);
  }

  public BRepBuilderAPI_MakeEdge( gp_Hypr  L,  gp_Pnt  P1,  gp_Pnt  P2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_17(gp_Hypr.getCPtr(L), L, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

  public BRepBuilderAPI_MakeEdge( gp_Hypr  L,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_18(gp_Hypr.getCPtr(L), L, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2), true);
  }

  public BRepBuilderAPI_MakeEdge( gp_Parab  L) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_19(gp_Parab.getCPtr(L), L), true);
  }

  public BRepBuilderAPI_MakeEdge( gp_Parab  L, double p1, double p2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_20(gp_Parab.getCPtr(L), L, p1, p2), true);
  }

  public BRepBuilderAPI_MakeEdge( gp_Parab  L,  gp_Pnt  P1,  gp_Pnt  P2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_21(gp_Parab.getCPtr(L), L, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

  public BRepBuilderAPI_MakeEdge( gp_Parab  L,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_22(gp_Parab.getCPtr(L), L, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2), true);
  }

  public BRepBuilderAPI_MakeEdge( Geom_Curve  L) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_23( Geom_Curve.getCPtr(L) , L), true);
  }

  public BRepBuilderAPI_MakeEdge( Geom_Curve  L, double p1, double p2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_24( Geom_Curve.getCPtr(L) , L, p1, p2), true);
  }

  public BRepBuilderAPI_MakeEdge( Geom_Curve  L,  gp_Pnt  P1,  gp_Pnt  P2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_25( Geom_Curve.getCPtr(L) , L, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

  public BRepBuilderAPI_MakeEdge( Geom_Curve  L,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_26( Geom_Curve.getCPtr(L) , L, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2), true);
  }

  public BRepBuilderAPI_MakeEdge( Geom_Curve  L,  gp_Pnt  P1,  gp_Pnt  P2, double p1, double p2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_27( Geom_Curve.getCPtr(L) , L, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2, p1, p2), true);
  }

  public BRepBuilderAPI_MakeEdge( Geom_Curve  L,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2, double p1, double p2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_28( Geom_Curve.getCPtr(L) , L, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2, p1, p2), true);
  }

  public BRepBuilderAPI_MakeEdge( Geom2d_Curve  L,  Geom_Surface  S) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_29( Geom2d_Curve.getCPtr(L) , L,  Geom_Surface.getCPtr(S) , S), true);
  }

  public BRepBuilderAPI_MakeEdge( Geom2d_Curve  L,  Geom_Surface  S, double p1, double p2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_30( Geom2d_Curve.getCPtr(L) , L,  Geom_Surface.getCPtr(S) , S, p1, p2), true);
  }

  public BRepBuilderAPI_MakeEdge( Geom2d_Curve  L,  Geom_Surface  S,  gp_Pnt  P1,  gp_Pnt  P2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_31( Geom2d_Curve.getCPtr(L) , L,  Geom_Surface.getCPtr(S) , S, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

  public BRepBuilderAPI_MakeEdge( Geom2d_Curve  L,  Geom_Surface  S,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_32( Geom2d_Curve.getCPtr(L) , L,  Geom_Surface.getCPtr(S) , S, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2), true);
  }

  public BRepBuilderAPI_MakeEdge( Geom2d_Curve  L,  Geom_Surface  S,  gp_Pnt  P1,  gp_Pnt  P2, double p1, double p2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_33( Geom2d_Curve.getCPtr(L) , L,  Geom_Surface.getCPtr(S) , S, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2, p1, p2), true);
  }

  /**
   *  The general method to directly create an edge is to give
   *  -      a 3D curve C as the support (geometric domain) of the edge,
   *  -      two vertices V1 and V2 to limit the curve (definition of the restriction of
   *  the edge), and
   *  -      two real values p1 and p2 which are the parameters for the vertices V1 and V2
   *  on the curve.
   *  The curve may be defined as a 2d curve in the parametric space of a surface: a
   *  pcurve. The surface on which the edge is built is then kept at the level of the edge.
   *  The default tolerance will be associated with this edge.
   *  Rules applied to the arguments:
   *  For the curve:
   *  -      The curve must not be a 'null handle'.
   *  -      If the curve is a trimmed curve the basis curve is used.
   *  For the vertices:
   *  -      Vertices may be null shapes. When V1 or V2 is null the edge is open in the
   *  corresponding direction and the parameter value p1 or p2 must be infinite
   *  (remember that Precision::Infinite() defines an infinite value).
   *  -      The two vertices must be identical if they have the same 3D location.
   *  Identical vertices are used in particular when the curve is closed.
   *  For the parameters:
   *  -      The parameters must be in the parametric range of the curve (or the basis
   *  curve if the curve is trimmed). If this condition is not satisfied the edge is not
   *  built, and the Error function will return BRepAPI_ParameterOutOfRange.
   *  -      Parameter values must not be equal. If this condition is not satisfied (i.e.
   *  if | p1 - p2 | ) the edge is not built, and the Error function will return
   *  BRepAPI_LineThroughIdenticPoints.
   *  Parameter values are expected to be given in increasing order:
   *  C->FirstParameter()
   *  - If the parameter values are given in decreasing order the vertices are switched,
   *  i.e. the "first vertex" is on the point of parameter p2 and the "second vertex" is
   *  on the point of parameter p1. In such a case, to keep the original intent of the
   *  construction, the edge will be oriented "reversed".
   *  - On a periodic curve the parameter values p1 and p2 are adjusted by adding or
   *  subtracting the period to obtain p1 in the parametric range of the curve, and p2]
   *  such that [ p1 , where Period is the period of the curve.
   *  - A parameter value may be infinite. The edge is open in the corresponding
   *  direction. However the corresponding vertex must be a null shape. If this condition
   *  is not satisfied the edge is not built, and the Error function will return
   *  BRepAPI_PointWithInfiniteParameter.
   *  - The distance between the vertex and the point evaluated on the curve with the
   *  parameter, must be lower than the precision of the vertex. If this condition is not
   *  satisfied the edge is not built, and the Error function will return
   *  BRepAPI_DifferentsPointAndParameter.
   *  Other edge constructions
   *  - The parameter values can be omitted, they will be computed by projecting the
   *  vertices on the curve. Note that projection is the only way to evaluate the
   *  parameter values of the vertices on the curve: vertices must be given on the curve,
   *  i.e. the distance from a vertex to the curve must be less than or equal to the
   *  precision of the vertex. If this condition is not satisfied the edge is not built,
   *  and the Error function will return BRepAPI_PointProjectionFailed.
   *  -      3D points can be given in place of vertices. Vertices will be created from the
   *  points (with the default topological precision Precision::Confusion()).
   *  Note:
   *  -      Giving vertices is useful when creating a connected edge.
   *  -      If the parameter values correspond to the extremities of a closed curve,
   *  points must be identical, or at least coincident. If this condition is not
   *  satisfied the edge is not built, and the Error function will return
   *  BRepAPI_DifferentPointsOnClosedCurve.
   *  -      The vertices or points can be omitted if the parameter values are given. The
   *  points will be computed from the parameters on the curve.
   *  The vertices or points and the parameter values can be omitted. The first and last
   *  parameters of the curve will then be used.
   * 
   *  Auxiliary methods
   */
  public BRepBuilderAPI_MakeEdge( Geom2d_Curve  L,  Geom_Surface  S,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2, double p1, double p2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge__SWIG_34( Geom2d_Curve.getCPtr(L) , L,  Geom_Surface.getCPtr(S) , S, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2, p1, p2), true);
  }

  public void Init( Geom_Curve  C) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge_Init__SWIG_0(swigCPtr, this,  Geom_Curve.getCPtr(C) , C);
  }

  public void Init( Geom_Curve  C, double p1, double p2) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge_Init__SWIG_1(swigCPtr, this,  Geom_Curve.getCPtr(C) , C, p1, p2);
  }

  public void Init( Geom_Curve  C,  gp_Pnt  P1,  gp_Pnt  P2) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge_Init__SWIG_2(swigCPtr, this,  Geom_Curve.getCPtr(C) , C, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  public void Init( Geom_Curve  C,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge_Init__SWIG_3(swigCPtr, this,  Geom_Curve.getCPtr(C) , C, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2);
  }

  public void Init( Geom_Curve  C,  gp_Pnt  P1,  gp_Pnt  P2, double p1, double p2) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge_Init__SWIG_4(swigCPtr, this,  Geom_Curve.getCPtr(C) , C, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2, p1, p2);
  }

  public void Init( Geom_Curve  C,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2, double p1, double p2) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge_Init__SWIG_5(swigCPtr, this,  Geom_Curve.getCPtr(C) , C, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2, p1, p2);
  }

  public void Init( Geom2d_Curve  C,  Geom_Surface  S) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge_Init__SWIG_6(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C,  Geom_Surface.getCPtr(S) , S);
  }

  public void Init( Geom2d_Curve  C,  Geom_Surface  S, double p1, double p2) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge_Init__SWIG_7(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C,  Geom_Surface.getCPtr(S) , S, p1, p2);
  }

  public void Init( Geom2d_Curve  C,  Geom_Surface  S,  gp_Pnt  P1,  gp_Pnt  P2) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge_Init__SWIG_8(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C,  Geom_Surface.getCPtr(S) , S, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  public void Init( Geom2d_Curve  C,  Geom_Surface  S,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge_Init__SWIG_9(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C,  Geom_Surface.getCPtr(S) , S, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2);
  }

  public void Init( Geom2d_Curve  C,  Geom_Surface  S,  gp_Pnt  P1,  gp_Pnt  P2, double p1, double p2) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge_Init__SWIG_10(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C,  Geom_Surface.getCPtr(S) , S, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2, p1, p2);
  }

  /**
   *  Defines or redefines the arguments for the construction of an edge.
   *  This function is currently used after the empty constructor BRepAPI_MakeEdge().
   */
  public void Init( Geom2d_Curve  C,  Geom_Surface  S,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2, double p1, double p2) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge_Init__SWIG_11(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C,  Geom_Surface.getCPtr(S) , S, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2, p1, p2);
  }

  /**
   *  Returns the construction status
   *  -   BRepBuilderAPI_EdgeDone if the edge is built, or
   *  -   another value of the BRepBuilderAPI_EdgeError
   *  enumeration indicating the reason of construction failure.
   */
  public BRepBuilderAPI_EdgeError Error() {
    return BRepBuilderAPI_EdgeError.swigToEnum(OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge_Error(swigCPtr, this));
  }

  /**
   *  Returns the constructed edge.
   *  Exceptions StdFail_NotDone if the edge is not built.
   */
  public  TopoDS_Edge  Edge() {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge_Edge(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the first vertex of the edge. May be Null.
   */
  public  TopoDS_Vertex  Vertex1() {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge_Vertex1(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the second vertex of the edge. May be Null.
   * 
   *  Warning
   *  The returned vertex in each function corresponds respectively to
   *  -   the lowest, or
   *  -   the highest parameter on the curve along which the edge is built.
   *  It does not correspond to the first or second vertex
   *  given at the time of the construction, if the edge is oriented reversed.
   *  Exceptions
   *  StdFail_NotDone if the edge is not built.
   */
  public  TopoDS_Vertex  Vertex2() {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge_Vertex2(swigCPtr, this), true);
    return ret;
  }

}
