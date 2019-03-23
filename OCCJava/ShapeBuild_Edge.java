package opencascade;

/**
 *  This class provides low-level operators for building an edge
 *  3d curve, copying edge with replaced vertices etc.
 */
public class ShapeBuild_Edge {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeBuild_Edge(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeBuild_Edge(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeBuild_Edge obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeBuild_Edge(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Copy edge and replace one or both its vertices to a given
   *  one(s). Vertex V1 replaces FORWARD vertex, and V2 - REVERSED,
   *  as they are found by TopoDS_Iterator.
   *  If V1 or V2 is NULL, the original vertex is taken
   */
  public TopoDS_Edge CopyReplaceVertices( TopoDS_Edge  edge,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    return new TopoDS_Edge(OCCwrapJavaJNI.ShapeBuild_Edge_CopyReplaceVertices(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2), true);
  }

  /**
   *  Copies ranges for curve3d and all common pcurves from
   *  edge <fromedge> into edge <toedge>.
   */
  public void CopyRanges( TopoDS_Edge  toedge,  TopoDS_Edge  fromedge, double alpha, double beta) {
    OCCwrapJavaJNI.ShapeBuild_Edge_CopyRanges__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(toedge), toedge, TopoDS_Edge.getCPtr(fromedge), fromedge, alpha, beta);
  }

  public void CopyRanges( TopoDS_Edge  toedge,  TopoDS_Edge  fromedge, double alpha) {
    OCCwrapJavaJNI.ShapeBuild_Edge_CopyRanges__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(toedge), toedge, TopoDS_Edge.getCPtr(fromedge), fromedge, alpha);
  }

  public void CopyRanges( TopoDS_Edge  toedge,  TopoDS_Edge  fromedge) {
    OCCwrapJavaJNI.ShapeBuild_Edge_CopyRanges__SWIG_2(swigCPtr, this, TopoDS_Edge.getCPtr(toedge), toedge, TopoDS_Edge.getCPtr(fromedge), fromedge);
  }

  /**
   *  Sets range on 3d curve only.
   */
  public void SetRange3d( TopoDS_Edge  edge, double first, double last) {
    OCCwrapJavaJNI.ShapeBuild_Edge_SetRange3d(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, first, last);
  }

  /**
   *  Makes a copy of pcurves from edge <fromedge> into edge
   *  <toedge>. Pcurves which are already present in <toedge>,
   *  are replaced by copies, other are copied. Ranges are also
   *  copied.
   */
  public void CopyPCurves( TopoDS_Edge  toedge,  TopoDS_Edge  fromedge) {
    OCCwrapJavaJNI.ShapeBuild_Edge_CopyPCurves(swigCPtr, this, TopoDS_Edge.getCPtr(toedge), toedge, TopoDS_Edge.getCPtr(fromedge), fromedge);
  }

  /**
   *  Make a copy of <edge> by call to CopyReplaceVertices()
   *  (i.e. construct new TEdge with the same pcurves and vertices).
   *  If <sharepcurves> is False, pcurves are also replaced by
   *  their copies with help of method CopyPCurves
   */
  public TopoDS_Edge Copy( TopoDS_Edge  edge, long sharepcurves) {
    return new TopoDS_Edge(OCCwrapJavaJNI.ShapeBuild_Edge_Copy__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, sharepcurves), true);
  }

  public TopoDS_Edge Copy( TopoDS_Edge  edge) {
    return new TopoDS_Edge(OCCwrapJavaJNI.ShapeBuild_Edge_Copy__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge), true);
  }

  /**
   *  Removes the PCurve(s) which could be recorded in an Edge for
   *  the given Face
   */
  public void RemovePCurve( TopoDS_Edge  edge,  TopoDS_Face  face) {
    OCCwrapJavaJNI.ShapeBuild_Edge_RemovePCurve__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, TopoDS_Face.getCPtr(face), face);
  }

  /**
   *  Removes the PCurve(s) which could be recorded in an Edge for
   *  the given Surface
   */
  public void RemovePCurve( TopoDS_Edge  edge,  Geom_Surface  surf) {
    OCCwrapJavaJNI.ShapeBuild_Edge_RemovePCurve__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom_Surface.getCPtr(surf) , surf);
  }

  /**
   *  Removes the PCurve(s) which could be recorded in an Edge for
   *  the given Surface, with given Location
   */
  public void RemovePCurve( TopoDS_Edge  edge,  Geom_Surface  surf,  TopLoc_Location  loc) {
    OCCwrapJavaJNI.ShapeBuild_Edge_RemovePCurve__SWIG_2(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom_Surface.getCPtr(surf) , surf, TopLoc_Location.getCPtr(loc), loc);
  }

  /**
   *  Replace the PCurve in an Edge for the given Face
   *  In case if edge is seam, i.e. has 2 pcurves on that face,
   *  only pcurve corresponding to the orientation of the edge is
   *  replaced
   */
  public void ReplacePCurve( TopoDS_Edge  edge,  Geom2d_Curve  pcurve,  TopoDS_Face  face) {
    OCCwrapJavaJNI.ShapeBuild_Edge_ReplacePCurve(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom2d_Curve.getCPtr(pcurve) , pcurve, TopoDS_Face.getCPtr(face), face);
  }

  /**
   *  Reassign edge pcurve lying on face <old> to another face <sub>.
   *  If edge has two pcurves on <old> face, only one of them will be
   *  reassigned, and other will left alone. Similarly, if edge already
   *  had a pcurve on face <sub>, it will have two pcurves on it.
   *  Returns True if succeeded, False if no pcurve lying on <old> found.
   */
  public long ReassignPCurve( TopoDS_Edge  edge,  TopoDS_Face  old,  TopoDS_Face  sub) {
    return OCCwrapJavaJNI.ShapeBuild_Edge_ReassignPCurve(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, TopoDS_Face.getCPtr(old), old, TopoDS_Face.getCPtr(sub), sub);
  }

  public  Geom2d_Curve  TransformPCurve( Geom2d_Curve  pcurve,  gp_Trsf2d  trans, double uFact, double[] aFirst, double[] aLast) {
    return new Geom2d_Curve ( OCCwrapJavaJNI.ShapeBuild_Edge_TransformPCurve(swigCPtr, this,  Geom2d_Curve.getCPtr(pcurve) , pcurve, gp_Trsf2d.getCPtr(trans), trans, uFact, aFirst, aLast), true );
  }

  /**
   *  Removes the Curve3D recorded in an Edge
   */
  public void RemoveCurve3d( TopoDS_Edge  edge) {
    OCCwrapJavaJNI.ShapeBuild_Edge_RemoveCurve3d(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge);
  }

  /**
   *  Calls BRepTools::BuildCurve3D
   */
  public long BuildCurve3d( TopoDS_Edge  edge) {
    return OCCwrapJavaJNI.ShapeBuild_Edge_BuildCurve3d(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge);
  }

  /**
   *  Makes edge with curve and location
   */
  public void MakeEdge(TopoDS_Edge edge,  Geom_Curve  curve,  TopLoc_Location  L) {
    OCCwrapJavaJNI.ShapeBuild_Edge_MakeEdge__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom_Curve.getCPtr(curve) , curve, TopLoc_Location.getCPtr(L), L);
  }

  /**
   *  Makes edge with curve, location and range [p1, p2]
   */
  public void MakeEdge(TopoDS_Edge edge,  Geom_Curve  curve,  TopLoc_Location  L, double p1, double p2) {
    OCCwrapJavaJNI.ShapeBuild_Edge_MakeEdge__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom_Curve.getCPtr(curve) , curve, TopLoc_Location.getCPtr(L), L, p1, p2);
  }

  /**
   *  Makes edge with pcurve and face
   */
  public void MakeEdge(TopoDS_Edge edge,  Geom2d_Curve  pcurve,  TopoDS_Face  face) {
    OCCwrapJavaJNI.ShapeBuild_Edge_MakeEdge__SWIG_2(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom2d_Curve.getCPtr(pcurve) , pcurve, TopoDS_Face.getCPtr(face), face);
  }

  /**
   *  Makes edge with pcurve, face and range [p1, p2]
   */
  public void MakeEdge(TopoDS_Edge edge,  Geom2d_Curve  pcurve,  TopoDS_Face  face, double p1, double p2) {
    OCCwrapJavaJNI.ShapeBuild_Edge_MakeEdge__SWIG_3(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom2d_Curve.getCPtr(pcurve) , pcurve, TopoDS_Face.getCPtr(face), face, p1, p2);
  }

  /**
   *  Makes edge with pcurve, surface and location
   */
  public void MakeEdge(TopoDS_Edge edge,  Geom2d_Curve  pcurve,  Geom_Surface  S,  TopLoc_Location  L) {
    OCCwrapJavaJNI.ShapeBuild_Edge_MakeEdge__SWIG_4(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom2d_Curve.getCPtr(pcurve) , pcurve,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L);
  }

  /**
   *  Makes edge with pcurve, surface, location and range [p1, p2]
   */
  public void MakeEdge(TopoDS_Edge edge,  Geom2d_Curve  pcurve,  Geom_Surface  S,  TopLoc_Location  L, double p1, double p2) {
    OCCwrapJavaJNI.ShapeBuild_Edge_MakeEdge__SWIG_5(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom2d_Curve.getCPtr(pcurve) , pcurve,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L, p1, p2);
  }

  public ShapeBuild_Edge() {
    this(OCCwrapJavaJNI.new_ShapeBuild_Edge(), true);
  }

}
