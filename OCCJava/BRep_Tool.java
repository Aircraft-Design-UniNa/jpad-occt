package opencascade;

/**
 *  Provides class methods  to  access to the geometry
 *  of BRep shapes.
 */
public class BRep_Tool {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRep_Tool(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRep_Tool(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRep_Tool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRep_Tool(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  If S is Shell, returns True if it has no free boundaries (edges).
   *  If S is Wire, returns True if it has no free ends (vertices).
   *  (Internal and External sub-shepes are ignored in these checks)
   *  If S is Edge, returns True if its vertices are the same.
   *  For other shape types returns S.Closed().
   */
  public static long IsClosed( TopoDS_Shape  S) {
    return OCCwrapJavaJNI.BRep_Tool_IsClosed__SWIG_0(TopoDS_Shape.getCPtr(S), S);
  }

  public static  Geom_Surface  Surface( TopoDS_Face  F, TopLoc_Location L) {
    return new Geom_Surface ( OCCwrapJavaJNI.BRep_Tool_Surface__SWIG_0(TopoDS_Face.getCPtr(F), F, TopLoc_Location.getCPtr(L), L), true );
  }

  public static  Geom_Surface  Surface( TopoDS_Face  F) {
    return new Geom_Surface ( OCCwrapJavaJNI.BRep_Tool_Surface__SWIG_1(TopoDS_Face.getCPtr(F), F), true );
  }

  public static  Poly_Triangulation  Triangulation( TopoDS_Face  F, TopLoc_Location L) {
    return new Poly_Triangulation ( OCCwrapJavaJNI.BRep_Tool_Triangulation(TopoDS_Face.getCPtr(F), F, TopLoc_Location.getCPtr(L), L), true );
  }

  /**
   *  Returns the tolerance of the face.
   */
  public static double Tolerance( TopoDS_Face  F) {
    return OCCwrapJavaJNI.BRep_Tool_Tolerance__SWIG_0(TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Returns the  NaturalRestriction  flag of the  face.
   */
  public static long NaturalRestriction( TopoDS_Face  F) {
    return OCCwrapJavaJNI.BRep_Tool_NaturalRestriction(TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Returns True if <E> is a 3d curve or a curve on
   *  surface.
   */
  public static long IsGeometric( TopoDS_Edge  E) {
    return OCCwrapJavaJNI.BRep_Tool_IsGeometric(TopoDS_Edge.getCPtr(E), E);
  }

  public static  Geom_Curve  Curve( TopoDS_Edge  E, TopLoc_Location L, double[] First, double[] Last) {
    return new Geom_Curve ( OCCwrapJavaJNI.BRep_Tool_Curve__SWIG_0(TopoDS_Edge.getCPtr(E), E, TopLoc_Location.getCPtr(L), L, First, Last), true );
  }

  public static  Geom_Curve  Curve( TopoDS_Edge  E, double[] First, double[] Last) {
    return new Geom_Curve ( OCCwrapJavaJNI.BRep_Tool_Curve__SWIG_1(TopoDS_Edge.getCPtr(E), E, First, Last), true );
  }

  public static  Poly_Polygon3D  Polygon3D( TopoDS_Edge  E, TopLoc_Location L) {
    return new Poly_Polygon3D ( OCCwrapJavaJNI.BRep_Tool_Polygon3D(TopoDS_Edge.getCPtr(E), E, TopLoc_Location.getCPtr(L), L), true );
  }

  /**
   *  Returns in <C>, <S>, <L> a 2d curve, a surface and
   *  a location for the edge <E>. <C> and <S>  are null
   *  if the  edge has no curve on  surface.  Returns in
   *  <First> and <Last> the parameter range.
   */
  public static  Geom2d_Curve  CurveOnSurface( TopoDS_Edge  E,  TopoDS_Face  F, double[] First, double[] Last, SWIGTYPE_p_unsigned_int theIsStored) {
    return new Geom2d_Curve ( OCCwrapJavaJNI.BRep_Tool_CurveOnSurface__SWIG_0(TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F, First, Last, SWIGTYPE_p_unsigned_int.getCPtr(theIsStored)), true );
  }

  /**
   *  Returns in <C>, <S>, <L> the 2d curve, the surface
   *  and the location for the edge <E> of rank <Index>.
   *  <C> and <S> are null if the index is out of range.
   *  Returns in <First> and <Last> the parameter range.
   */
  public static  Geom2d_Curve  CurveOnSurface( TopoDS_Edge  E,  TopoDS_Face  F, double[] First, double[] Last) {
    return new Geom2d_Curve ( OCCwrapJavaJNI.BRep_Tool_CurveOnSurface__SWIG_1(TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F, First, Last), true );
  }

  public static  Geom2d_Curve  CurveOnSurface( TopoDS_Edge  E,  Geom_Surface  S,  TopLoc_Location  L, double[] First, double[] Last, SWIGTYPE_p_unsigned_int theIsStored) {
    return new Geom2d_Curve ( OCCwrapJavaJNI.BRep_Tool_CurveOnSurface__SWIG_2(TopoDS_Edge.getCPtr(E), E,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L, First, Last, SWIGTYPE_p_unsigned_int.getCPtr(theIsStored)), true );
  }

  public static  Geom2d_Curve  CurveOnSurface( TopoDS_Edge  E,  Geom_Surface  S,  TopLoc_Location  L, double[] First, double[] Last) {
    return new Geom2d_Curve ( OCCwrapJavaJNI.BRep_Tool_CurveOnSurface__SWIG_3(TopoDS_Edge.getCPtr(E), E,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L, First, Last), true );
  }

  public static  Geom2d_Curve  CurveOnPlane( TopoDS_Edge  E,  Geom_Surface  S,  TopLoc_Location  L, double[] First, double[] Last) {
    return new Geom2d_Curve ( OCCwrapJavaJNI.BRep_Tool_CurveOnPlane(TopoDS_Edge.getCPtr(E), E,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L, First, Last), true );
  }

  public static void CurveOnSurface( TopoDS_Edge  E,  Geom2d_Curve  C,  Geom_Surface  S, TopLoc_Location L, double[] First, double[] Last) {
    OCCwrapJavaJNI.BRep_Tool_CurveOnSurface__SWIG_4(TopoDS_Edge.getCPtr(E), E,  Geom2d_Curve.getCPtr(C) , C,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L, First, Last);
  }

  public static void CurveOnSurface( TopoDS_Edge  E,  Geom2d_Curve  C,  Geom_Surface  S, TopLoc_Location L, double[] First, double[] Last, int Index) {
    OCCwrapJavaJNI.BRep_Tool_CurveOnSurface__SWIG_5(TopoDS_Edge.getCPtr(E), E,  Geom2d_Curve.getCPtr(C) , C,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L, First, Last, Index);
  }

  /**
   *  Returns in <C>, <S>, <L> a 2d curve, a surface and
   *  a location for the edge <E>. <C> and <S>  are null
   *  if the  edge has no polygon on  surface.
   */
  public static  Poly_Polygon2D  PolygonOnSurface( TopoDS_Edge  E,  TopoDS_Face  F) {
    return new Poly_Polygon2D ( OCCwrapJavaJNI.BRep_Tool_PolygonOnSurface__SWIG_0(TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F), true );
  }

  /**
   *  Returns in <C>, <S>, <L> the 2d curve, the surface
   *  and the location for the edge <E> of rank <Index>.
   *  <C> and <S> are null if the index is out of range.
   */
  public static  Poly_Polygon2D  PolygonOnSurface( TopoDS_Edge  E,  Geom_Surface  S,  TopLoc_Location  L) {
    return new Poly_Polygon2D ( OCCwrapJavaJNI.BRep_Tool_PolygonOnSurface__SWIG_1(TopoDS_Edge.getCPtr(E), E,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L), true );
  }

  public static void PolygonOnSurface( TopoDS_Edge  E,  Poly_Polygon2D  C,  Geom_Surface  S, TopLoc_Location L) {
    OCCwrapJavaJNI.BRep_Tool_PolygonOnSurface__SWIG_2(TopoDS_Edge.getCPtr(E), E,  Poly_Polygon2D.getCPtr(C) , C,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L);
  }

  public static void PolygonOnSurface( TopoDS_Edge  E,  Poly_Polygon2D  C,  Geom_Surface  S, TopLoc_Location L, int Index) {
    OCCwrapJavaJNI.BRep_Tool_PolygonOnSurface__SWIG_3(TopoDS_Edge.getCPtr(E), E,  Poly_Polygon2D.getCPtr(C) , C,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L, Index);
  }

  /**
   *  Returns in <P>, <T>, <L> a polygon on triangulation, a
   *  triangulation and a location for the edge <E>.
   *  <P>  and  <T>  are null  if  the  edge has no
   *  polygon on  triangulation.
   */
  public static  Poly_PolygonOnTriangulation  PolygonOnTriangulation( TopoDS_Edge  E,  Poly_Triangulation  T,  TopLoc_Location  L) {
    return new Poly_PolygonOnTriangulation ( OCCwrapJavaJNI.BRep_Tool_PolygonOnTriangulation__SWIG_0(TopoDS_Edge.getCPtr(E), E,  Poly_Triangulation.getCPtr(T) , T, TopLoc_Location.getCPtr(L), L), true );
  }

  /**
   *  Returns   in   <P>,  <T>,    <L> a     polygon  on
   *  triangulation,   a triangulation  and a  location for
   *  the edge <E> for the range index.  <C> and <S> are
   *  null if the edge has no polygon on triangulation.
   */
  public static void PolygonOnTriangulation( TopoDS_Edge  E,  Poly_PolygonOnTriangulation  P,  Poly_Triangulation  T, TopLoc_Location L) {
    OCCwrapJavaJNI.BRep_Tool_PolygonOnTriangulation__SWIG_1(TopoDS_Edge.getCPtr(E), E,  Poly_PolygonOnTriangulation.getCPtr(P) , P,  Poly_Triangulation.getCPtr(T) , T, TopLoc_Location.getCPtr(L), L);
  }

  public static void PolygonOnTriangulation( TopoDS_Edge  E,  Poly_PolygonOnTriangulation  P,  Poly_Triangulation  T, TopLoc_Location L, int Index) {
    OCCwrapJavaJNI.BRep_Tool_PolygonOnTriangulation__SWIG_2(TopoDS_Edge.getCPtr(E), E,  Poly_PolygonOnTriangulation.getCPtr(P) , P,  Poly_Triangulation.getCPtr(T) , T, TopLoc_Location.getCPtr(L), L, Index);
  }

  /**
   *  Returns  True  if  <E>  has  two  PCurves  in  the
   *  parametric space of <F>. i.e.  <F>  is on a closed
   *  surface and <E> is on the closing curve.
   */
  public static long IsClosed( TopoDS_Edge  E,  TopoDS_Face  F) {
    return OCCwrapJavaJNI.BRep_Tool_IsClosed__SWIG_1(TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Returns  True  if  <E>  has  two  PCurves  in  the
   *  parametric space  of <S>.  i.e.   <S>  is a closed
   *  surface and <E> is on the closing curve.
   */
  public static long IsClosed( TopoDS_Edge  E,  Geom_Surface  S,  TopLoc_Location  L) {
    return OCCwrapJavaJNI.BRep_Tool_IsClosed__SWIG_2(TopoDS_Edge.getCPtr(E), E,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L);
  }

  /**
   *  Returns  True  if <E> has two arrays of indices in
   *  the triangulation <T>.
   */
  public static long IsClosed( TopoDS_Edge  E,  Poly_Triangulation  T,  TopLoc_Location  L) {
    return OCCwrapJavaJNI.BRep_Tool_IsClosed__SWIG_3(TopoDS_Edge.getCPtr(E), E,  Poly_Triangulation.getCPtr(T) , T, TopLoc_Location.getCPtr(L), L);
  }

  /**
   *  Returns the tolerance for <E>.
   */
  public static double Tolerance( TopoDS_Edge  E) {
    return OCCwrapJavaJNI.BRep_Tool_Tolerance__SWIG_1(TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Returns the SameParameter flag for the edge.
   */
  public static long SameParameter( TopoDS_Edge  E) {
    return OCCwrapJavaJNI.BRep_Tool_SameParameter(TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Returns the SameRange flag for the edge.
   */
  public static long SameRange( TopoDS_Edge  E) {
    return OCCwrapJavaJNI.BRep_Tool_SameRange(TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Returns True  if the edge is degenerated.
   */
  public static long Degenerated( TopoDS_Edge  E) {
    return OCCwrapJavaJNI.BRep_Tool_Degenerated(TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Gets the range of the 3d curve.
   */
  public static void Range( TopoDS_Edge  E, double[] First, double[] Last) {
    OCCwrapJavaJNI.BRep_Tool_Range__SWIG_0(TopoDS_Edge.getCPtr(E), E, First, Last);
  }

  /**
   *  Gets the range  of the edge  on the pcurve on  the
   *  surface.
   */
  public static void Range( TopoDS_Edge  E,  Geom_Surface  S,  TopLoc_Location  L, double[] First, double[] Last) {
    OCCwrapJavaJNI.BRep_Tool_Range__SWIG_1(TopoDS_Edge.getCPtr(E), E,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L, First, Last);
  }

  /**
   *  Gets the range of the edge on the pcurve on the face.
   */
  public static void Range( TopoDS_Edge  E,  TopoDS_Face  F, double[] First, double[] Last) {
    OCCwrapJavaJNI.BRep_Tool_Range__SWIG_2(TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F, First, Last);
  }

  /**
   *  Gets the UV locations of the extremities of the edge.
   */
  public static void UVPoints( TopoDS_Edge  E,  Geom_Surface  S,  TopLoc_Location  L, gp_Pnt2d PFirst, gp_Pnt2d PLast) {
    OCCwrapJavaJNI.BRep_Tool_UVPoints__SWIG_0(TopoDS_Edge.getCPtr(E), E,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L, gp_Pnt2d.getCPtr(PFirst), PFirst, gp_Pnt2d.getCPtr(PLast), PLast);
  }

  /**
   *  Gets the UV locations of the extremities of the edge.
   */
  public static void UVPoints( TopoDS_Edge  E,  TopoDS_Face  F, gp_Pnt2d PFirst, gp_Pnt2d PLast) {
    OCCwrapJavaJNI.BRep_Tool_UVPoints__SWIG_1(TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F, gp_Pnt2d.getCPtr(PFirst), PFirst, gp_Pnt2d.getCPtr(PLast), PLast);
  }

  /**
   *  Sets the UV locations of the extremities of the edge.
   */
  public static void SetUVPoints( TopoDS_Edge  E,  Geom_Surface  S,  TopLoc_Location  L,  gp_Pnt2d  PFirst,  gp_Pnt2d  PLast) {
    OCCwrapJavaJNI.BRep_Tool_SetUVPoints__SWIG_0(TopoDS_Edge.getCPtr(E), E,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L, gp_Pnt2d.getCPtr(PFirst), PFirst, gp_Pnt2d.getCPtr(PLast), PLast);
  }

  /**
   *  Sets the UV locations of the extremities of the edge.
   */
  public static void SetUVPoints( TopoDS_Edge  E,  TopoDS_Face  F,  gp_Pnt2d  PFirst,  gp_Pnt2d  PLast) {
    OCCwrapJavaJNI.BRep_Tool_SetUVPoints__SWIG_1(TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F, gp_Pnt2d.getCPtr(PFirst), PFirst, gp_Pnt2d.getCPtr(PLast), PLast);
  }

  /**
   *  Returns True if the edge is on the surfaces of the
   *  two faces.
   */
  public static long HasContinuity( TopoDS_Edge  E,  TopoDS_Face  F1,  TopoDS_Face  F2) {
    return OCCwrapJavaJNI.BRep_Tool_HasContinuity__SWIG_0(TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F1), F1, TopoDS_Face.getCPtr(F2), F2);
  }

  /**
   *  Returns the continuity.
   */
  public static GeomAbs_Shape Continuity( TopoDS_Edge  E,  TopoDS_Face  F1,  TopoDS_Face  F2) {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.BRep_Tool_Continuity__SWIG_0(TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F1), F1, TopoDS_Face.getCPtr(F2), F2));
  }

  /**
   *  Returns True if the edge is on the surfaces.
   */
  public static long HasContinuity( TopoDS_Edge  E,  Geom_Surface  S1,  Geom_Surface  S2,  TopLoc_Location  L1,  TopLoc_Location  L2) {
    return OCCwrapJavaJNI.BRep_Tool_HasContinuity__SWIG_1(TopoDS_Edge.getCPtr(E), E,  Geom_Surface.getCPtr(S1) , S1,  Geom_Surface.getCPtr(S2) , S2, TopLoc_Location.getCPtr(L1), L1, TopLoc_Location.getCPtr(L2), L2);
  }

  /**
   *  Returns the continuity.
   */
  public static GeomAbs_Shape Continuity( TopoDS_Edge  E,  Geom_Surface  S1,  Geom_Surface  S2,  TopLoc_Location  L1,  TopLoc_Location  L2) {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.BRep_Tool_Continuity__SWIG_1(TopoDS_Edge.getCPtr(E), E,  Geom_Surface.getCPtr(S1) , S1,  Geom_Surface.getCPtr(S2) , S2, TopLoc_Location.getCPtr(L1), L1, TopLoc_Location.getCPtr(L2), L2));
  }

  /**
   *  Returns True if the edge has regularity on some
   *  two surfaces
   */
  public static long HasContinuity( TopoDS_Edge  E) {
    return OCCwrapJavaJNI.BRep_Tool_HasContinuity__SWIG_2(TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Returns the 3d point.
   */
  public static gp_Pnt Pnt( TopoDS_Vertex  V) {
    return new gp_Pnt(OCCwrapJavaJNI.BRep_Tool_Pnt(TopoDS_Vertex.getCPtr(V), V), true);
  }

  /**
   *  Returns the tolerance.
   */
  public static double Tolerance( TopoDS_Vertex  V) {
    return OCCwrapJavaJNI.BRep_Tool_Tolerance__SWIG_2(TopoDS_Vertex.getCPtr(V), V);
  }

  /**
   *  Returns the parameter of <V> on <E>.
   */
  public static double Parameter( TopoDS_Vertex  V,  TopoDS_Edge  E) {
    return OCCwrapJavaJNI.BRep_Tool_Parameter__SWIG_0(TopoDS_Vertex.getCPtr(V), V, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Returns the  parameters  of   the  vertex   on the
   *  pcurve of the edge on the face.
   */
  public static double Parameter( TopoDS_Vertex  V,  TopoDS_Edge  E,  TopoDS_Face  F) {
    return OCCwrapJavaJNI.BRep_Tool_Parameter__SWIG_1(TopoDS_Vertex.getCPtr(V), V, TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Returns the  parameters  of   the  vertex   on the
   *  pcurve of the edge on the surface.
   */
  public static double Parameter( TopoDS_Vertex  V,  TopoDS_Edge  E,  Geom_Surface  S,  TopLoc_Location  L) {
    return OCCwrapJavaJNI.BRep_Tool_Parameter__SWIG_2(TopoDS_Vertex.getCPtr(V), V, TopoDS_Edge.getCPtr(E), E,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L);
  }

  /**
   *  Returns the parameters of the vertex on the face.
   */
  public static gp_Pnt2d Parameters( TopoDS_Vertex  V,  TopoDS_Face  F) {
    return new gp_Pnt2d(OCCwrapJavaJNI.BRep_Tool_Parameters(TopoDS_Vertex.getCPtr(V), V, TopoDS_Face.getCPtr(F), F), true);
  }

  public static double MaxTolerance( TopoDS_Shape  theShape, TopAbs_ShapeEnum theSubShape) {
    return OCCwrapJavaJNI.BRep_Tool_MaxTolerance(TopoDS_Shape.getCPtr(theShape), theShape, theSubShape.swigValue());
  }

  public BRep_Tool() {
    this(OCCwrapJavaJNI.new_BRep_Tool(), true);
  }

}
