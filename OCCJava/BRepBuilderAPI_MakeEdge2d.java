package opencascade;

/**
 *  Provides methods to build edges.
 * 
 *  The   methods have  the  following   syntax, where
 *  TheCurve is one of Lin2d, Circ2d, ...
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
 *  Create(C : TheCurve; P1, P2 : Pnt2d from gp)
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
public class BRepBuilderAPI_MakeEdge2d extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepBuilderAPI_MakeEdge2d(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge2d_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepBuilderAPI_MakeEdge2d(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge2d_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepBuilderAPI_MakeEdge2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepBuilderAPI_MakeEdge2d(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BRepBuilderAPI_MakeEdge2d( TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_0(TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2), true);
  }

  public BRepBuilderAPI_MakeEdge2d( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_1(gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2), true);
  }

  public BRepBuilderAPI_MakeEdge2d( gp_Lin2d  L) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_2(gp_Lin2d.getCPtr(L), L), true);
  }

  public BRepBuilderAPI_MakeEdge2d( gp_Lin2d  L, double p1, double p2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_3(gp_Lin2d.getCPtr(L), L, p1, p2), true);
  }

  public BRepBuilderAPI_MakeEdge2d( gp_Lin2d  L,  gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_4(gp_Lin2d.getCPtr(L), L, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2), true);
  }

  public BRepBuilderAPI_MakeEdge2d( gp_Lin2d  L,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_5(gp_Lin2d.getCPtr(L), L, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2), true);
  }

  public BRepBuilderAPI_MakeEdge2d( gp_Circ2d  L) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_6(gp_Circ2d.getCPtr(L), L), true);
  }

  public BRepBuilderAPI_MakeEdge2d( gp_Circ2d  L, double p1, double p2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_7(gp_Circ2d.getCPtr(L), L, p1, p2), true);
  }

  public BRepBuilderAPI_MakeEdge2d( gp_Circ2d  L,  gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_8(gp_Circ2d.getCPtr(L), L, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2), true);
  }

  public BRepBuilderAPI_MakeEdge2d( gp_Circ2d  L,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_9(gp_Circ2d.getCPtr(L), L, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2), true);
  }

  public BRepBuilderAPI_MakeEdge2d( gp_Elips2d  L) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_10(gp_Elips2d.getCPtr(L), L), true);
  }

  public BRepBuilderAPI_MakeEdge2d( gp_Elips2d  L, double p1, double p2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_11(gp_Elips2d.getCPtr(L), L, p1, p2), true);
  }

  public BRepBuilderAPI_MakeEdge2d( gp_Elips2d  L,  gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_12(gp_Elips2d.getCPtr(L), L, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2), true);
  }

  public BRepBuilderAPI_MakeEdge2d( gp_Elips2d  L,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_13(gp_Elips2d.getCPtr(L), L, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2), true);
  }

  public BRepBuilderAPI_MakeEdge2d( gp_Hypr2d  L) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_14(gp_Hypr2d.getCPtr(L), L), true);
  }

  public BRepBuilderAPI_MakeEdge2d( gp_Hypr2d  L, double p1, double p2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_15(gp_Hypr2d.getCPtr(L), L, p1, p2), true);
  }

  public BRepBuilderAPI_MakeEdge2d( gp_Hypr2d  L,  gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_16(gp_Hypr2d.getCPtr(L), L, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2), true);
  }

  public BRepBuilderAPI_MakeEdge2d( gp_Hypr2d  L,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_17(gp_Hypr2d.getCPtr(L), L, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2), true);
  }

  public BRepBuilderAPI_MakeEdge2d( gp_Parab2d  L) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_18(gp_Parab2d.getCPtr(L), L), true);
  }

  public BRepBuilderAPI_MakeEdge2d( gp_Parab2d  L, double p1, double p2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_19(gp_Parab2d.getCPtr(L), L, p1, p2), true);
  }

  public BRepBuilderAPI_MakeEdge2d( gp_Parab2d  L,  gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_20(gp_Parab2d.getCPtr(L), L, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2), true);
  }

  public BRepBuilderAPI_MakeEdge2d( gp_Parab2d  L,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_21(gp_Parab2d.getCPtr(L), L, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2), true);
  }

  public BRepBuilderAPI_MakeEdge2d( Geom2d_Curve  L) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_22( Geom2d_Curve.getCPtr(L) , L), true);
  }

  public BRepBuilderAPI_MakeEdge2d( Geom2d_Curve  L, double p1, double p2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_23( Geom2d_Curve.getCPtr(L) , L, p1, p2), true);
  }

  public BRepBuilderAPI_MakeEdge2d( Geom2d_Curve  L,  gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_24( Geom2d_Curve.getCPtr(L) , L, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2), true);
  }

  public BRepBuilderAPI_MakeEdge2d( Geom2d_Curve  L,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_25( Geom2d_Curve.getCPtr(L) , L, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2), true);
  }

  public BRepBuilderAPI_MakeEdge2d( Geom2d_Curve  L,  gp_Pnt2d  P1,  gp_Pnt2d  P2, double p1, double p2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_26( Geom2d_Curve.getCPtr(L) , L, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2, p1, p2), true);
  }

  public BRepBuilderAPI_MakeEdge2d( Geom2d_Curve  L,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2, double p1, double p2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeEdge2d__SWIG_27( Geom2d_Curve.getCPtr(L) , L, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2, p1, p2), true);
  }

  public void Init( Geom2d_Curve  C) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge2d_Init__SWIG_0(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C);
  }

  public void Init( Geom2d_Curve  C, double p1, double p2) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge2d_Init__SWIG_1(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C, p1, p2);
  }

  public void Init( Geom2d_Curve  C,  gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge2d_Init__SWIG_2(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2);
  }

  public void Init( Geom2d_Curve  C,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge2d_Init__SWIG_3(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2);
  }

  public void Init( Geom2d_Curve  C,  gp_Pnt2d  P1,  gp_Pnt2d  P2, double p1, double p2) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge2d_Init__SWIG_4(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2, p1, p2);
  }

  public void Init( Geom2d_Curve  C,  TopoDS_Vertex  V1,  TopoDS_Vertex  V2, double p1, double p2) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge2d_Init__SWIG_5(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2, p1, p2);
  }

  /**
   *  Returns the error description when NotDone.
   */
  public BRepBuilderAPI_EdgeError Error() {
    return BRepBuilderAPI_EdgeError.swigToEnum(OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge2d_Error(swigCPtr, this));
  }

  public  TopoDS_Edge  Edge() {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge2d_Edge(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the first vertex of the edge. May be Null.
   */
  public  TopoDS_Vertex  Vertex1() {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge2d_Vertex1(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the second vertex of the edge. May be Null.
   */
  public  TopoDS_Vertex  Vertex2() {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.BRepBuilderAPI_MakeEdge2d_Vertex2(swigCPtr, this), true);
    return ret;
  }

}
