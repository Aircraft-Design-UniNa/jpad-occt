package opencascade;

/**
 *  Defines geometric modifications to a shape, i.e.
 *  changes to faces, edges and vertices.
 */
public class BRepTools_Modification extends Standard_Transient {
  BRepTools_Modification(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns true if the face, F, has been modified.
   *  If the face has been modified:
   *  - S is the new geometry of the face,
   *  - L is its new location, and
   *  - Tol is the new tolerance.
   *  The flag, RevWires, is set to true when the
   *  modification reverses the normal of the surface, (i.e.
   *  the wires have to be reversed).
   *  The flag, RevFace, is set to true if the orientation of
   *  the modified face changes in the shells which contain it.
   *  If the face has not been modified this function returns
   *  false, and the values of S, L, Tol, RevWires and
   *  RevFace are not significant.
   */
  public long NewSurface( TopoDS_Face  F,  Geom_Surface  S, TopLoc_Location L, double[] Tol, long[] RevWires, long[] RevFace) {
    return OCCwrapJavaJNI.BRepTools_Modification_NewSurface(swigCPtr, this, TopoDS_Face.getCPtr(F), F,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L, Tol, RevWires, RevFace);
  }

  /**
   *  Returns true if the face has been modified according to changed triangulation.
   *  If the face has been modified:
   *  - T is a new triangulation on the face
   */
  public long NewTriangulation( TopoDS_Face  F,  Poly_Triangulation  T) {
    return OCCwrapJavaJNI.BRepTools_Modification_NewTriangulation(swigCPtr, this, TopoDS_Face.getCPtr(F), F,  Poly_Triangulation.getCPtr(T) , T);
  }

  /**
   *  Returns true if the edge, E, has been modified.
   *  If the edge has been modified:
   *  - C is the new geometry associated with the edge,
   *  - L is its new location, and
   *  - Tol is the new tolerance.
   *  If the edge has not been modified, this function
   *  returns false, and the values of C, L and Tol are not significant.
   */
  public long NewCurve( TopoDS_Edge  E,  Geom_Curve  C, TopLoc_Location L, double[] Tol) {
    return OCCwrapJavaJNI.BRepTools_Modification_NewCurve(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Geom_Curve.getCPtr(C) , C, TopLoc_Location.getCPtr(L), L, Tol);
  }

  /**
   *  Returns true if the edge has been modified according to changed polygon.
   *  If the edge has been modified:
   *  - P is a new polygon
   */
  public long NewPolygon( TopoDS_Edge  E,  Poly_Polygon3D  P) {
    return OCCwrapJavaJNI.BRepTools_Modification_NewPolygon(swigCPtr, this, TopoDS_Edge.getCPtr(E), E,  Poly_Polygon3D.getCPtr(P) , P);
  }

  /**
   *  Returns true if the edge has been modified according to changed polygon on triangulation.
   *  If the edge has been modified:
   *  - P is a new polygon on triangulation
   */
  public long NewPolygonOnTriangulation( TopoDS_Edge  E,  TopoDS_Face  F,  Poly_PolygonOnTriangulation  P) {
    return OCCwrapJavaJNI.BRepTools_Modification_NewPolygonOnTriangulation(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F,  Poly_PolygonOnTriangulation.getCPtr(P) , P);
  }

  /**
   *  Returns true if the vertex V has been modified.
   *  If V has been modified:
   *  - P is the new geometry of the vertex, and
   *  - Tol is the new tolerance.
   *  If the vertex has not been modified this function
   *  returns false, and the values of P and Tol are not significant.
   */
  public long NewPoint( TopoDS_Vertex  V, gp_Pnt P, double[] Tol) {
    return OCCwrapJavaJNI.BRepTools_Modification_NewPoint(swigCPtr, this, TopoDS_Vertex.getCPtr(V), V, gp_Pnt.getCPtr(P), P, Tol);
  }

  /**
   *  Returns true if the edge, E, has a new curve on
   *  surface on the face, F.
   *  If a new curve exists:
   *  - C is the new geometry of the edge,
   *  - L is the new location, and
   *  - Tol is the new tolerance.
   *  NewE is the new edge created from E, and NewF is
   *  the new face created from F.
   *  If there is no new curve on the face, this function
   *  returns false, and the values of C, L and Tol are not significant.
   */
  public long NewCurve2d( TopoDS_Edge  E,  TopoDS_Face  F,  TopoDS_Edge  NewE,  TopoDS_Face  NewF,  Geom2d_Curve  C, double[] Tol) {
    return OCCwrapJavaJNI.BRepTools_Modification_NewCurve2d(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F, TopoDS_Edge.getCPtr(NewE), NewE, TopoDS_Face.getCPtr(NewF), NewF,  Geom2d_Curve.getCPtr(C) , C, Tol);
  }

  /**
   *  Returns true if the vertex V has a new parameter on the edge E.
   *  If a new parameter exists:
   *  - P is the parameter, and
   *  - Tol is the new tolerance.
   *  If there is no new parameter this function returns
   *  false, and the values of P and Tol are not significant.
   */
  public long NewParameter( TopoDS_Vertex  V,  TopoDS_Edge  E, double[] P, double[] Tol) {
    return OCCwrapJavaJNI.BRepTools_Modification_NewParameter(swigCPtr, this, TopoDS_Vertex.getCPtr(V), V, TopoDS_Edge.getCPtr(E), E, P, Tol);
  }

  /**
   *  Returns the  continuity of  <NewE> between <NewF1>
   *  and <NewF2>.
   *  <NewE> is the new  edge created from <E>.  <NewF1>
   *  (resp. <NewF2>) is the new  face created from <F1>
   *  (resp. <F2>).
   */
  public GeomAbs_Shape Continuity( TopoDS_Edge  E,  TopoDS_Face  F1,  TopoDS_Face  F2,  TopoDS_Edge  NewE,  TopoDS_Face  NewF1,  TopoDS_Face  NewF2) {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.BRepTools_Modification_Continuity(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F1), F1, TopoDS_Face.getCPtr(F2), F2, TopoDS_Edge.getCPtr(NewE), NewE, TopoDS_Face.getCPtr(NewF1), NewF1, TopoDS_Face.getCPtr(NewF2), NewF2));
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.BRepTools_Modification_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepTools_Modification_get_type_descriptor(), true );
  }

  public static  BRepTools_Modification  DownCast( Standard_Transient  T) {
    return new BRepTools_Modification ( OCCwrapJavaJNI.BRepTools_Modification_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepTools_Modification_TypeOf(), true );
  }

}
