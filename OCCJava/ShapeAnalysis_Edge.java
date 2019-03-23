package opencascade;

/**
 *  Tool for analyzing the edge.
 *  Queries geometrical representations of the edge (3d curve, pcurve
 *  on the given face or surface) and topological sub-shapes (bounding
 *  vertices).
 *  Provides methods for analyzing geometry and topology consistency
 *  (3d and pcurve(s) consistency, their adjacency to the vertices).
 */
public class ShapeAnalysis_Edge {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeAnalysis_Edge(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeAnalysis_Edge(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeAnalysis_Edge obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeAnalysis_Edge(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor; initialises Status to OK
   */
  public ShapeAnalysis_Edge() {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_Edge(), true);
  }

  /**
   *  Tells if the edge has a 3d curve
   */
  public long HasCurve3d( TopoDS_Edge  edge) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_HasCurve3d(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge);
  }

  /**
   *  Returns the 3d curve and bounding parameteres for the edge
   *  Returns False if no 3d curve.
   *  If <orient> is True (default), takes orientation into account:
   *  if the edge is reversed, cf and cl are toggled
   */
  public long Curve3d( TopoDS_Edge  edge,  Geom_Curve  C3d, double[] cf, double[] cl, long orient) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_Curve3d__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom_Curve.getCPtr(C3d) , C3d, cf, cl, orient);
  }

  public long Curve3d( TopoDS_Edge  edge,  Geom_Curve  C3d, double[] cf, double[] cl) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_Curve3d__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom_Curve.getCPtr(C3d) , C3d, cf, cl);
  }

  /**
   *  Gives True if the edge has a 3d curve, this curve is closed,
   *  and the edge has the same vertex at start and end
   */
  public long IsClosed3d( TopoDS_Edge  edge) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_IsClosed3d(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge);
  }

  /**
   *  Tells if the Edge has a pcurve on the face.
   */
  public long HasPCurve( TopoDS_Edge  edge,  TopoDS_Face  face) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_HasPCurve__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, TopoDS_Face.getCPtr(face), face);
  }

  /**
   *  Tells if the edge has a pcurve on the surface (with location).
   */
  public long HasPCurve( TopoDS_Edge  edge,  Geom_Surface  surface,  TopLoc_Location  location) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_HasPCurve__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom_Surface.getCPtr(surface) , surface, TopLoc_Location.getCPtr(location), location);
  }

  public long PCurve( TopoDS_Edge  edge,  TopoDS_Face  face,  Geom2d_Curve  C2d, double[] cf, double[] cl, long orient) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_PCurve__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, TopoDS_Face.getCPtr(face), face,  Geom2d_Curve.getCPtr(C2d) , C2d, cf, cl, orient);
  }

  /**
   *  Returns the pcurve and bounding parameteres for the edge
   *  lying on the surface.
   *  Returns False if the edge has no pcurve on this surface.
   *  If <orient> is True (default), takes orientation into account:
   *  if the edge is reversed, cf and cl are toggled
   */
  public long PCurve( TopoDS_Edge  edge,  TopoDS_Face  face,  Geom2d_Curve  C2d, double[] cf, double[] cl) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_PCurve__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, TopoDS_Face.getCPtr(face), face,  Geom2d_Curve.getCPtr(C2d) , C2d, cf, cl);
  }

  public long PCurve( TopoDS_Edge  edge,  Geom_Surface  surface,  TopLoc_Location  location,  Geom2d_Curve  C2d, double[] cf, double[] cl, long orient) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_PCurve__SWIG_2(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom_Surface.getCPtr(surface) , surface, TopLoc_Location.getCPtr(location), location,  Geom2d_Curve.getCPtr(C2d) , C2d, cf, cl, orient);
  }

  public long PCurve( TopoDS_Edge  edge,  Geom_Surface  surface,  TopLoc_Location  location,  Geom2d_Curve  C2d, double[] cf, double[] cl) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_PCurve__SWIG_3(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom_Surface.getCPtr(surface) , surface, TopLoc_Location.getCPtr(location), location,  Geom2d_Curve.getCPtr(C2d) , C2d, cf, cl);
  }

  public long BoundUV( TopoDS_Edge  edge,  TopoDS_Face  face, gp_Pnt2d first, gp_Pnt2d last) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_BoundUV__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, TopoDS_Face.getCPtr(face), face, gp_Pnt2d.getCPtr(first), first, gp_Pnt2d.getCPtr(last), last);
  }

  /**
   *  Returns the ends of pcurve
   *  Calls method PCurve with <orient> equal to True
   */
  public long BoundUV( TopoDS_Edge  edge,  Geom_Surface  surface,  TopLoc_Location  location, gp_Pnt2d first, gp_Pnt2d last) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_BoundUV__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom_Surface.getCPtr(surface) , surface, TopLoc_Location.getCPtr(location), location, gp_Pnt2d.getCPtr(first), first, gp_Pnt2d.getCPtr(last), last);
  }

  public long IsSeam( TopoDS_Edge  edge,  TopoDS_Face  face) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_IsSeam__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, TopoDS_Face.getCPtr(face), face);
  }

  /**
   *  Returns True if the edge has two pcurves on one surface
   */
  public long IsSeam( TopoDS_Edge  edge,  Geom_Surface  surface,  TopLoc_Location  location) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_IsSeam__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom_Surface.getCPtr(surface) , surface, TopLoc_Location.getCPtr(location), location);
  }

  /**
   *  Returns start vertex of the edge (taking edge orientation
   *  into account).
   */
  public TopoDS_Vertex FirstVertex( TopoDS_Edge  edge) {
    return new TopoDS_Vertex(OCCwrapJavaJNI.ShapeAnalysis_Edge_FirstVertex(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge), true);
  }

  /**
   *  Returns end vertex of the edge (taking edge orientation
   *  into account).
   */
  public TopoDS_Vertex LastVertex( TopoDS_Edge  edge) {
    return new TopoDS_Vertex(OCCwrapJavaJNI.ShapeAnalysis_Edge_LastVertex(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge), true);
  }

  public long GetEndTangent2d( TopoDS_Edge  edge,  TopoDS_Face  face, long atEnd, gp_Pnt2d pos, gp_Vec2d tang, double dparam) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_GetEndTangent2d__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, TopoDS_Face.getCPtr(face), face, atEnd, gp_Pnt2d.getCPtr(pos), pos, gp_Vec2d.getCPtr(tang), tang, dparam);
  }

  /**
   *  Returns tangent of the edge pcurve at its start (if atEnd is
   *  False) or end (if True), regarding the orientation of edge.
   *  If edge is REVERSED, tangent is reversed before return.
   *  Returns True if pcurve is available and tangent is computed
   *  and is not null, else False.
   */
  public long GetEndTangent2d( TopoDS_Edge  edge,  TopoDS_Face  face, long atEnd, gp_Pnt2d pos, gp_Vec2d tang) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_GetEndTangent2d__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, TopoDS_Face.getCPtr(face), face, atEnd, gp_Pnt2d.getCPtr(pos), pos, gp_Vec2d.getCPtr(tang), tang);
  }

  public long GetEndTangent2d( TopoDS_Edge  edge,  Geom_Surface  surface,  TopLoc_Location  location, long atEnd, gp_Pnt2d pos, gp_Vec2d tang, double dparam) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_GetEndTangent2d__SWIG_2(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom_Surface.getCPtr(surface) , surface, TopLoc_Location.getCPtr(location), location, atEnd, gp_Pnt2d.getCPtr(pos), pos, gp_Vec2d.getCPtr(tang), tang, dparam);
  }

  public long GetEndTangent2d( TopoDS_Edge  edge,  Geom_Surface  surface,  TopLoc_Location  location, long atEnd, gp_Pnt2d pos, gp_Vec2d tang) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_GetEndTangent2d__SWIG_3(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom_Surface.getCPtr(surface) , surface, TopLoc_Location.getCPtr(location), location, atEnd, gp_Pnt2d.getCPtr(pos), pos, gp_Vec2d.getCPtr(tang), tang);
  }

  /**
   *  Checks the start and/or end vertex of the edge for matching
   *  with 3d curve with the given precision.
   *  <vtx> = 1 : start vertex only
   *  <vtx> = 2 : end vertex only
   *  <vtx> = 0 : both (default)
   *  If preci < 0 the vertices are considered with their own
   *  tolerances, else with the given <preci>.
   */
  public long CheckVerticesWithCurve3d( TopoDS_Edge  edge, double preci, int vtx) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_CheckVerticesWithCurve3d__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, preci, vtx);
  }

  public long CheckVerticesWithCurve3d( TopoDS_Edge  edge, double preci) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_CheckVerticesWithCurve3d__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, preci);
  }

  public long CheckVerticesWithCurve3d( TopoDS_Edge  edge) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_CheckVerticesWithCurve3d__SWIG_2(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge);
  }

  public long CheckVerticesWithPCurve( TopoDS_Edge  edge,  TopoDS_Face  face, double preci, int vtx) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_CheckVerticesWithPCurve__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, TopoDS_Face.getCPtr(face), face, preci, vtx);
  }

  /**
   *  Checks the start and/or end vertex of the edge for matching
   *  with pcurve with the given precision.
   *  <vtx> = 1 : start vertex
   *  <vtx> = 2 : end vertex
   *  <vtx> = 0 : both
   *  If preci < 0 the vertices are considered with their own
   *  tolerances, else with the given <preci>.
   */
  public long CheckVerticesWithPCurve( TopoDS_Edge  edge,  TopoDS_Face  face, double preci) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_CheckVerticesWithPCurve__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, TopoDS_Face.getCPtr(face), face, preci);
  }

  public long CheckVerticesWithPCurve( TopoDS_Edge  edge,  TopoDS_Face  face) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_CheckVerticesWithPCurve__SWIG_2(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, TopoDS_Face.getCPtr(face), face);
  }

  public long CheckVerticesWithPCurve( TopoDS_Edge  edge,  Geom_Surface  surface,  TopLoc_Location  location, double preci, int vtx) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_CheckVerticesWithPCurve__SWIG_3(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom_Surface.getCPtr(surface) , surface, TopLoc_Location.getCPtr(location), location, preci, vtx);
  }

  public long CheckVerticesWithPCurve( TopoDS_Edge  edge,  Geom_Surface  surface,  TopLoc_Location  location, double preci) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_CheckVerticesWithPCurve__SWIG_4(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom_Surface.getCPtr(surface) , surface, TopLoc_Location.getCPtr(location), location, preci);
  }

  public long CheckVerticesWithPCurve( TopoDS_Edge  edge,  Geom_Surface  surface,  TopLoc_Location  location) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_CheckVerticesWithPCurve__SWIG_5(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom_Surface.getCPtr(surface) , surface, TopLoc_Location.getCPtr(location), location);
  }

  public long CheckVertexTolerance( TopoDS_Edge  edge,  TopoDS_Face  face, double[] toler1, double[] toler2) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_CheckVertexTolerance__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, TopoDS_Face.getCPtr(face), face, toler1, toler2);
  }

  /**
   *  Checks if it is necessary to increase tolerances of the edge
   *  vertices to comprise the ends of 3d curve and pcurve on
   *  the given face (first method) or all pcurves stored in an edge
   *  (second one)
   *  toler1 returns necessary tolerance for first vertex,
   *  toler2 returns necessary tolerance for last vertex.
   */
  public long CheckVertexTolerance( TopoDS_Edge  edge, double[] toler1, double[] toler2) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_CheckVertexTolerance__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, toler1, toler2);
  }

  public long CheckCurve3dWithPCurve( TopoDS_Edge  edge,  TopoDS_Face  face) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_CheckCurve3dWithPCurve__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, TopoDS_Face.getCPtr(face), face);
  }

  /**
   *  Checks mutual orientation of 3d curve and pcurve on the
   *  analysis of curves bounding points
   */
  public long CheckCurve3dWithPCurve( TopoDS_Edge  edge,  Geom_Surface  surface,  TopLoc_Location  location) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_CheckCurve3dWithPCurve__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom_Surface.getCPtr(surface) , surface, TopLoc_Location.getCPtr(location), location);
  }

  /**
   *  Returns the status (in the form of True/False) of last Check
   */
  public long Status(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_Status(swigCPtr, this, status.swigValue());
  }

  /**
   *  Checks the edge to be SameParameter.
   *  Calculates the maximal deviation between 3d curve and each
   *  pcurve of the edge on <NbControl> equidistant points (the same
   *  algorithm as in BRepCheck; default value is 23 as in BRepCheck).
   *  This deviation is returned in <maxdev> parameter.
   *  If deviation is greater than tolerance of the edge (i.e.
   *  incorrect flag) returns False, else returns True.
   */
  public long CheckSameParameter( TopoDS_Edge  edge, double[] maxdev, int NbControl) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_CheckSameParameter__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, maxdev, NbControl);
  }

  /**
   *  Checks the edge to be SameParameter.
   *  Calculates the maximal deviation between 3d curve and each
   *  pcurve of the edge on <NbControl> equidistant points (the same
   *  algorithm as in BRepCheck; default value is 23 as in BRepCheck).
   *  This deviation is returned in <maxdev> parameter.
   *  If deviation is greater than tolerance of the edge (i.e.
   *  incorrect flag) returns False, else returns True.
   */
  public long CheckSameParameter( TopoDS_Edge  edge, double[] maxdev) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_CheckSameParameter__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, maxdev);
  }

  public long CheckSameParameter( TopoDS_Edge  theEdge,  TopoDS_Face  theFace, double[] theMaxdev, int theNbControl) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_CheckSameParameter__SWIG_2(swigCPtr, this, TopoDS_Edge.getCPtr(theEdge), theEdge, TopoDS_Face.getCPtr(theFace), theFace, theMaxdev, theNbControl);
  }

  public long CheckSameParameter( TopoDS_Edge  theEdge,  TopoDS_Face  theFace, double[] theMaxdev) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_CheckSameParameter__SWIG_3(swigCPtr, this, TopoDS_Edge.getCPtr(theEdge), theEdge, TopoDS_Face.getCPtr(theFace), theFace, theMaxdev);
  }

  /**
   *  Checks possibility for pcurve thePC to have range [theFirst, theLast] (edge range)
   *  having respect to real first, last parameters of thePC 
   */
  public long CheckPCurveRange(double theFirst, double theLast,  Geom2d_Curve  thePC) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_CheckPCurveRange(swigCPtr, this, theFirst, theLast,  Geom2d_Curve.getCPtr(thePC) , thePC);
  }

  /**
   *  Computes the maximal deviation between the two curve
   *  representations.
   *  dev is an input/output parameter and contains the computed
   *  deviation (should be initialized with 0. for the first call).
   *  Used by CheckSameParameter().
   */
  public static long ComputeDeviation( Adaptor3d_Curve  CRef,  Adaptor3d_Curve  Other, long SameParameter, double[] dev, int NCONTROL) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_ComputeDeviation(Adaptor3d_Curve.getCPtr(CRef), CRef, Adaptor3d_Curve.getCPtr(Other), Other, SameParameter, dev, NCONTROL);
  }

  /**
   *  Checks the first edge is overlapped with second edge.
   *  If distance between two edges is less then theTolOverlap
   *  edges is overlapped.
   *  theDomainDis - length of part of edges on wich edges is overlapped.
   */
  public long CheckOverlapping( TopoDS_Edge  theEdge1,  TopoDS_Edge  theEdge2, double[] theTolOverlap, double theDomainDist) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_CheckOverlapping__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(theEdge1), theEdge1, TopoDS_Edge.getCPtr(theEdge2), theEdge2, theTolOverlap, theDomainDist);
  }

  public long CheckOverlapping( TopoDS_Edge  theEdge1,  TopoDS_Edge  theEdge2, double[] theTolOverlap) {
    return OCCwrapJavaJNI.ShapeAnalysis_Edge_CheckOverlapping__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(theEdge1), theEdge1, TopoDS_Edge.getCPtr(theEdge2), theEdge2, theTolOverlap);
  }

}
