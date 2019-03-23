package opencascade;

/**
 *  A framework providing advanced tolerance control.
 *  It is used to build Shapes.
 *  If tolerance control is required, you are advised to:
 *  1. build a default precision for topology, using the
 *  classes provided in the BRepAPI package
 *  2. update the tolerance of the resulting shape.
 *  Note that only vertices, edges and faces have
 *  meaningful tolerance control. The tolerance value
 *  must always comply with the condition that face
 *  tolerances are more restrictive than edge tolerances
 *  which are more restrictive than vertex tolerances. In
 *  other words: Tol(Vertex) >= Tol(Edge) >= Tol(Face).
 *  Other rules in setting tolerance include:
 *  - you can open up tolerance but should never restrict it
 *  - an edge cannot be included within the fusion of the
 *  tolerance spheres of two vertices
 */
public class BRep_Builder extends TopoDS_Builder {

  private long swigCPtr;
  BRep_Builder(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRep_Builder_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRep_Builder(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRep_Builder_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRep_Builder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRep_Builder(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Makes an undefined Face.
   */
  public void MakeFace(TopoDS_Face F) {
    OCCwrapJavaJNI.BRep_Builder_MakeFace__SWIG_0(swigCPtr, this, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Makes a Face with a surface.
   */
  public void MakeFace(TopoDS_Face F,  Geom_Surface  S, double Tol) {
    OCCwrapJavaJNI.BRep_Builder_MakeFace__SWIG_1(swigCPtr, this, TopoDS_Face.getCPtr(F), F,  Geom_Surface.getCPtr(S) , S, Tol);
  }

  /**
   *  Makes a Face with a surface and a location.
   */
  public void MakeFace(TopoDS_Face F,  Geom_Surface  S,  TopLoc_Location  L, double Tol) {
    OCCwrapJavaJNI.BRep_Builder_MakeFace__SWIG_2(swigCPtr, this, TopoDS_Face.getCPtr(F), F,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L, Tol);
  }

  /**
   *  Makes a Face with a triangulation. The triangulation
   *  is in the same reference system than the TFace.
   */
  public void MakeFace(TopoDS_Face F,  Poly_Triangulation  T) {
    OCCwrapJavaJNI.BRep_Builder_MakeFace__SWIG_3(swigCPtr, this, TopoDS_Face.getCPtr(F), F,  Poly_Triangulation.getCPtr(T) , T);
  }

  /**
   *  Updates the face F using the tolerance value Tol,
   *  surface S and location Location.
   */
  public void UpdateFace( TopoDS_Face  F,  Geom_Surface  S,  TopLoc_Location  L, double Tol) {
    OCCwrapJavaJNI.BRep_Builder_UpdateFace__SWIG_0(swigCPtr, this, TopoDS_Face.getCPtr(F), F,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L, Tol);
  }

  /**
   *  Changes a  face triangulation.
   * 
   *  A null Triangulation removes the triangulation.
   */
  public void UpdateFace( TopoDS_Face  F,  Poly_Triangulation  T) {
    OCCwrapJavaJNI.BRep_Builder_UpdateFace__SWIG_1(swigCPtr, this, TopoDS_Face.getCPtr(F), F,  Poly_Triangulation.getCPtr(T) , T);
  }

  /**
   *  Updates the face Tolerance.
   */
  public void UpdateFace( TopoDS_Face  F, double Tol) {
    OCCwrapJavaJNI.BRep_Builder_UpdateFace__SWIG_2(swigCPtr, this, TopoDS_Face.getCPtr(F), F, Tol);
  }

  /**
   *  Sets the  NaturalRestriction flag of  the face.
   */
  public void NaturalRestriction( TopoDS_Face  F, long N) {
    OCCwrapJavaJNI.BRep_Builder_NaturalRestriction(swigCPtr, this, TopoDS_Face.getCPtr(F), F, N);
  }

  /**
   *  Makes an undefined Edge (no geometry).
   */
  public void MakeEdge(TopoDS_Edge E) {
    OCCwrapJavaJNI.BRep_Builder_MakeEdge__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Makes an Edge with a curve.
   */
  public void MakeEdge(TopoDS_Edge E,  Geom_Curve  C, double Tol) {
    OCCwrapJavaJNI.BRep_Builder_MakeEdge__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Geom_Curve.getCPtr(C) , C, Tol);
  }

  /**
   *  Makes an Edge with a curve and a location.
   */
  public void MakeEdge(TopoDS_Edge E,  Geom_Curve  C,  TopLoc_Location  L, double Tol) {
    OCCwrapJavaJNI.BRep_Builder_MakeEdge__SWIG_2(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Geom_Curve.getCPtr(C) , C, TopLoc_Location.getCPtr(L), L, Tol);
  }

  /**
   *  Makes an Edge with a polygon 3d.
   */
  public void MakeEdge(TopoDS_Edge E,  Poly_Polygon3D  P) {
    OCCwrapJavaJNI.BRep_Builder_MakeEdge__SWIG_3(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Poly_Polygon3D.getCPtr(P) , P);
  }

  /**
   *  makes an Edge polygon on Triangulation.
   */
  public void MakeEdge(TopoDS_Edge E,  Poly_PolygonOnTriangulation  N,  Poly_Triangulation  T) {
    OCCwrapJavaJNI.BRep_Builder_MakeEdge__SWIG_4(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Poly_PolygonOnTriangulation.getCPtr(N) , N,  Poly_Triangulation.getCPtr(T) , T);
  }

  /**
   *  makes an Edge polygon on Triangulation.
   */
  public void MakeEdge(TopoDS_Edge E,  Poly_PolygonOnTriangulation  N,  Poly_Triangulation  T,  TopLoc_Location  L) {
    OCCwrapJavaJNI.BRep_Builder_MakeEdge__SWIG_5(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Poly_PolygonOnTriangulation.getCPtr(N) , N,  Poly_Triangulation.getCPtr(T) , T, TopLoc_Location.getCPtr(L), L);
  }

  /**
   *  Sets a 3D curve for the edge.
   *  If <C> is a null handle, remove any existing 3d curve.
   */
  public void UpdateEdge( TopoDS_Edge  E,  Geom_Curve  C, double Tol) {
    OCCwrapJavaJNI.BRep_Builder_UpdateEdge__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Geom_Curve.getCPtr(C) , C, Tol);
  }

  /**
   *  Sets a 3D curve for the edge.
   *  If <C> is a null handle, remove any existing 3d curve.
   */
  public void UpdateEdge( TopoDS_Edge  E,  Geom_Curve  C,  TopLoc_Location  L, double Tol) {
    OCCwrapJavaJNI.BRep_Builder_UpdateEdge__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Geom_Curve.getCPtr(C) , C, TopLoc_Location.getCPtr(L), L, Tol);
  }

  /**
   *  Sets a pcurve for the edge on the face.
   *  If <C> is a null handle, remove any existing pcurve.
   */
  public void UpdateEdge( TopoDS_Edge  E,  Geom2d_Curve  C,  TopoDS_Face  F, double Tol) {
    OCCwrapJavaJNI.BRep_Builder_UpdateEdge__SWIG_2(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Geom2d_Curve.getCPtr(C) , C, TopoDS_Face.getCPtr(F), F, Tol);
  }

  /**
   *  Sets pcurves for the edge on the  closed face.  If
   *  <C1> or <C2> is a null handle, remove any existing
   *  pcurve.
   */
  public void UpdateEdge( TopoDS_Edge  E,  Geom2d_Curve  C1,  Geom2d_Curve  C2,  TopoDS_Face  F, double Tol) {
    OCCwrapJavaJNI.BRep_Builder_UpdateEdge__SWIG_3(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Geom2d_Curve.getCPtr(C1) , C1,  Geom2d_Curve.getCPtr(C2) , C2, TopoDS_Face.getCPtr(F), F, Tol);
  }

  /**
   *  Sets a pcurve for the edge on the face.
   *  If <C> is a null handle, remove any existing pcurve.
   */
  public void UpdateEdge( TopoDS_Edge  E,  Geom2d_Curve  C,  Geom_Surface  S,  TopLoc_Location  L, double Tol) {
    OCCwrapJavaJNI.BRep_Builder_UpdateEdge__SWIG_4(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Geom2d_Curve.getCPtr(C) , C,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L, Tol);
  }

  /**
   *  Sets a pcurve for the edge on the face.
   *  If <C> is a null handle, remove any existing pcurve.
   *  Sets UV bounds for curve repsentation
   */
  public void UpdateEdge( TopoDS_Edge  E,  Geom2d_Curve  C,  Geom_Surface  S,  TopLoc_Location  L, double Tol,  gp_Pnt2d  Pf,  gp_Pnt2d  Pl) {
    OCCwrapJavaJNI.BRep_Builder_UpdateEdge__SWIG_5(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Geom2d_Curve.getCPtr(C) , C,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L, Tol, gp_Pnt2d.getCPtr(Pf), Pf, gp_Pnt2d.getCPtr(Pl), Pl);
  }

  /**
   *  Sets pcurves for the edge on the closed surface.
   *  <C1> or <C2> is a null handle, remove any existing
   *  pcurve.
   */
  public void UpdateEdge( TopoDS_Edge  E,  Geom2d_Curve  C1,  Geom2d_Curve  C2,  Geom_Surface  S,  TopLoc_Location  L, double Tol) {
    OCCwrapJavaJNI.BRep_Builder_UpdateEdge__SWIG_6(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Geom2d_Curve.getCPtr(C1) , C1,  Geom2d_Curve.getCPtr(C2) , C2,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L, Tol);
  }

  /**
   *  Sets pcurves for the edge on the closed surface.
   *  <C1> or <C2> is a null handle, remove any existing
   *  pcurve.
   *  Sets UV bounds for curve repsentation
   */
  public void UpdateEdge( TopoDS_Edge  E,  Geom2d_Curve  C1,  Geom2d_Curve  C2,  Geom_Surface  S,  TopLoc_Location  L, double Tol,  gp_Pnt2d  Pf,  gp_Pnt2d  Pl) {
    OCCwrapJavaJNI.BRep_Builder_UpdateEdge__SWIG_7(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Geom2d_Curve.getCPtr(C1) , C1,  Geom2d_Curve.getCPtr(C2) , C2,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L, Tol, gp_Pnt2d.getCPtr(Pf), Pf, gp_Pnt2d.getCPtr(Pl), Pl);
  }

  /**
   *  Changes an Edge 3D polygon.
   *  A null Polygon removes the 3d Polygon.
   */
  public void UpdateEdge( TopoDS_Edge  E,  Poly_Polygon3D  P) {
    OCCwrapJavaJNI.BRep_Builder_UpdateEdge__SWIG_8(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Poly_Polygon3D.getCPtr(P) , P);
  }

  /**
   *  Changes an Edge 3D polygon.
   *  A null Polygon removes the 3d Polygon.
   */
  public void UpdateEdge( TopoDS_Edge  E,  Poly_Polygon3D  P,  TopLoc_Location  L) {
    OCCwrapJavaJNI.BRep_Builder_UpdateEdge__SWIG_9(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Poly_Polygon3D.getCPtr(P) , P, TopLoc_Location.getCPtr(L), L);
  }

  /**
   *  Changes an Edge polygon on Triangulation.
   */
  public void UpdateEdge( TopoDS_Edge  E,  Poly_PolygonOnTriangulation  N,  Poly_Triangulation  T) {
    OCCwrapJavaJNI.BRep_Builder_UpdateEdge__SWIG_10(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Poly_PolygonOnTriangulation.getCPtr(N) , N,  Poly_Triangulation.getCPtr(T) , T);
  }

  /**
   *  Changes an Edge polygon on Triangulation.
   */
  public void UpdateEdge( TopoDS_Edge  E,  Poly_PolygonOnTriangulation  N,  Poly_Triangulation  T,  TopLoc_Location  L) {
    OCCwrapJavaJNI.BRep_Builder_UpdateEdge__SWIG_11(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Poly_PolygonOnTriangulation.getCPtr(N) , N,  Poly_Triangulation.getCPtr(T) , T, TopLoc_Location.getCPtr(L), L);
  }

  /**
   *  Changes an Edge polygon on Triangulation.
   */
  public void UpdateEdge( TopoDS_Edge  E,  Poly_PolygonOnTriangulation  N1,  Poly_PolygonOnTriangulation  N2,  Poly_Triangulation  T) {
    OCCwrapJavaJNI.BRep_Builder_UpdateEdge__SWIG_12(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Poly_PolygonOnTriangulation.getCPtr(N1) , N1,  Poly_PolygonOnTriangulation.getCPtr(N2) , N2,  Poly_Triangulation.getCPtr(T) , T);
  }

  /**
   *  Changes an Edge polygon on Triangulation.
   */
  public void UpdateEdge( TopoDS_Edge  E,  Poly_PolygonOnTriangulation  N1,  Poly_PolygonOnTriangulation  N2,  Poly_Triangulation  T,  TopLoc_Location  L) {
    OCCwrapJavaJNI.BRep_Builder_UpdateEdge__SWIG_13(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Poly_PolygonOnTriangulation.getCPtr(N1) , N1,  Poly_PolygonOnTriangulation.getCPtr(N2) , N2,  Poly_Triangulation.getCPtr(T) , T, TopLoc_Location.getCPtr(L), L);
  }

  /**
   *  Changes Edge polygon on a face.
   */
  public void UpdateEdge( TopoDS_Edge  E,  Poly_Polygon2D  P,  TopoDS_Face  S) {
    OCCwrapJavaJNI.BRep_Builder_UpdateEdge__SWIG_14(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Poly_Polygon2D.getCPtr(P) , P, TopoDS_Face.getCPtr(S), S);
  }

  /**
   *  Changes Edge polygon on a face.
   */
  public void UpdateEdge( TopoDS_Edge  E,  Poly_Polygon2D  P,  Geom_Surface  S,  TopLoc_Location  T) {
    OCCwrapJavaJNI.BRep_Builder_UpdateEdge__SWIG_15(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Poly_Polygon2D.getCPtr(P) , P,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(T), T);
  }

  /**
   *  Changes Edge polygons on a face.
   * 
   *  A null Polygon removes the 2d Polygon.
   */
  public void UpdateEdge( TopoDS_Edge  E,  Poly_Polygon2D  P1,  Poly_Polygon2D  P2,  TopoDS_Face  S) {
    OCCwrapJavaJNI.BRep_Builder_UpdateEdge__SWIG_16(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Poly_Polygon2D.getCPtr(P1) , P1,  Poly_Polygon2D.getCPtr(P2) , P2, TopoDS_Face.getCPtr(S), S);
  }

  /**
   *  Changes Edge polygons on a face.
   * 
   *  A null Polygon removes the 2d Polygon.
   */
  public void UpdateEdge( TopoDS_Edge  E,  Poly_Polygon2D  P1,  Poly_Polygon2D  P2,  Geom_Surface  S,  TopLoc_Location  L) {
    OCCwrapJavaJNI.BRep_Builder_UpdateEdge__SWIG_17(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Poly_Polygon2D.getCPtr(P1) , P1,  Poly_Polygon2D.getCPtr(P2) , P2,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L);
  }

  /**
   *  Updates the edge tolerance.
   */
  public void UpdateEdge( TopoDS_Edge  E, double Tol) {
    OCCwrapJavaJNI.BRep_Builder_UpdateEdge__SWIG_18(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, Tol);
  }

  /**
   *  Sets the geometric continuity on the edge.
   */
  public void Continuity( TopoDS_Edge  E,  TopoDS_Face  F1,  TopoDS_Face  F2, GeomAbs_Shape C) {
    OCCwrapJavaJNI.BRep_Builder_Continuity__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F1), F1, TopoDS_Face.getCPtr(F2), F2, C.swigValue());
  }

  /**
   *  Sets the geometric continuity on the edge.
   */
  public void Continuity( TopoDS_Edge  E,  Geom_Surface  S1,  Geom_Surface  S2,  TopLoc_Location  L1,  TopLoc_Location  L2, GeomAbs_Shape C) {
    OCCwrapJavaJNI.BRep_Builder_Continuity__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Geom_Surface.getCPtr(S1) , S1,  Geom_Surface.getCPtr(S2) , S2, TopLoc_Location.getCPtr(L1), L1, TopLoc_Location.getCPtr(L2), L2, C.swigValue());
  }

  /**
   *  Sets the same parameter flag for the edge <E>.
   */
  public void SameParameter( TopoDS_Edge  E, long S) {
    OCCwrapJavaJNI.BRep_Builder_SameParameter(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, S);
  }

  /**
   *  Sets the same range flag for the edge <E>.
   */
  public void SameRange( TopoDS_Edge  E, long S) {
    OCCwrapJavaJNI.BRep_Builder_SameRange(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, S);
  }

  /**
   *  Sets the degenerated flag for the edge <E>.
   */
  public void Degenerated( TopoDS_Edge  E, long D) {
    OCCwrapJavaJNI.BRep_Builder_Degenerated(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, D);
  }

  /**
   *  Sets the range of the 3d curve if Only3d=TRUE,
   *  otherwise sets the range to all the representations
   */
  public void Range( TopoDS_Edge  E, double First, double Last, long Only3d) {
    OCCwrapJavaJNI.BRep_Builder_Range__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, First, Last, Only3d);
  }

  /**
   *  Sets the range  of the edge  on the pcurve on  the
   *  surface.
   */
  public void Range( TopoDS_Edge  E, double First, double Last) {
    OCCwrapJavaJNI.BRep_Builder_Range__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, First, Last);
  }

  /**
   *  Sets the range of the edge on the pcurve on the face.
   */
  public void Range( TopoDS_Edge  E,  Geom_Surface  S,  TopLoc_Location  L, double First, double Last) {
    OCCwrapJavaJNI.BRep_Builder_Range__SWIG_2(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L, First, Last);
  }

  public void Range( TopoDS_Edge  E,  TopoDS_Face  F, double First, double Last) {
    OCCwrapJavaJNI.BRep_Builder_Range__SWIG_3(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F, First, Last);
  }

  /**
   *  Add  to <Eout>  the  geometric representations  of
   *  <Ein>.
   */
  public void Transfert( TopoDS_Edge  Ein,  TopoDS_Edge  Eout) {
    OCCwrapJavaJNI.BRep_Builder_Transfert__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(Ein), Ein, TopoDS_Edge.getCPtr(Eout), Eout);
  }

  /**
   *  Makes an udefined vertex without geometry.
   */
  public void MakeVertex(TopoDS_Vertex V) {
    OCCwrapJavaJNI.BRep_Builder_MakeVertex__SWIG_0(swigCPtr, this, TopoDS_Vertex.getCPtr(V), V);
  }

  /**
   *  Makes a vertex from a 3D point.
   */
  public void MakeVertex(TopoDS_Vertex V,  gp_Pnt  P, double Tol) {
    OCCwrapJavaJNI.BRep_Builder_MakeVertex__SWIG_1(swigCPtr, this, TopoDS_Vertex.getCPtr(V), V, gp_Pnt.getCPtr(P), P, Tol);
  }

  /**
   *  Sets a 3D point on the vertex.
   */
  public void UpdateVertex( TopoDS_Vertex  V,  gp_Pnt  P, double Tol) {
    OCCwrapJavaJNI.BRep_Builder_UpdateVertex__SWIG_0(swigCPtr, this, TopoDS_Vertex.getCPtr(V), V, gp_Pnt.getCPtr(P), P, Tol);
  }

  /**
   *  Sets  the parameter  for the   vertex on the  edge
   *  curves.
   */
  public void UpdateVertex( TopoDS_Vertex  V, double P,  TopoDS_Edge  E, double Tol) {
    OCCwrapJavaJNI.BRep_Builder_UpdateVertex__SWIG_1(swigCPtr, this, TopoDS_Vertex.getCPtr(V), V, P, TopoDS_Edge.getCPtr(E), E, Tol);
  }

  /**
   *  Sets  the parameter  for the  vertex  on the  edge
   *  pcurve  on the face.
   */
  public void UpdateVertex( TopoDS_Vertex  V, double P,  TopoDS_Edge  E,  TopoDS_Face  F, double Tol) {
    OCCwrapJavaJNI.BRep_Builder_UpdateVertex__SWIG_2(swigCPtr, this, TopoDS_Vertex.getCPtr(V), V, P, TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F, Tol);
  }

  /**
   *  Sets  the parameter  for the  vertex  on the  edge
   *  pcurve  on the surface.
   */
  public void UpdateVertex( TopoDS_Vertex  V, double P,  TopoDS_Edge  E,  Geom_Surface  S,  TopLoc_Location  L, double Tol) {
    OCCwrapJavaJNI.BRep_Builder_UpdateVertex__SWIG_3(swigCPtr, this, TopoDS_Vertex.getCPtr(V), V, P, TopoDS_Edge.getCPtr(E), E,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L, Tol);
  }

  /**
   *  Sets the parameters for the vertex on the face.
   */
  public void UpdateVertex( TopoDS_Vertex  Ve, double U, double V,  TopoDS_Face  F, double Tol) {
    OCCwrapJavaJNI.BRep_Builder_UpdateVertex__SWIG_4(swigCPtr, this, TopoDS_Vertex.getCPtr(Ve), Ve, U, V, TopoDS_Face.getCPtr(F), F, Tol);
  }

  /**
   *  Updates the vertex tolerance.
   */
  public void UpdateVertex( TopoDS_Vertex  V, double Tol) {
    OCCwrapJavaJNI.BRep_Builder_UpdateVertex__SWIG_5(swigCPtr, this, TopoDS_Vertex.getCPtr(V), V, Tol);
  }

  /**
   *  Transfert the parameters  of   Vin on  Ein as  the
   *  parameter of Vout on Eout.
   */
  public void Transfert( TopoDS_Edge  Ein,  TopoDS_Edge  Eout,  TopoDS_Vertex  Vin,  TopoDS_Vertex  Vout) {
    OCCwrapJavaJNI.BRep_Builder_Transfert__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(Ein), Ein, TopoDS_Edge.getCPtr(Eout), Eout, TopoDS_Vertex.getCPtr(Vin), Vin, TopoDS_Vertex.getCPtr(Vout), Vout);
  }

  public BRep_Builder() {
    this(OCCwrapJavaJNI.new_BRep_Builder(), true);
  }

}
