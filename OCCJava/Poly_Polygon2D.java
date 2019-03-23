package opencascade;

/**
 *  Provides a polygon in 2D space (for example, in the
 *  parametric space of a surface). It is generally an
 *  approximate representation of a curve.
 *  A Polygon2D is defined by a table of nodes. Each node is
 *  a 2D point. If the polygon is closed, the point of closure is
 *  repeated at the end of the table of nodes.
 */
public class Poly_Polygon2D extends Standard_Transient {
  Poly_Polygon2D(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Constructs a 2D polygon defined by the table of points, <Nodes>.
   */
  public Poly_Polygon2D( TColgp_Array1OfPnt2d  Nodes) {
    this(OCCwrapJavaJNI.new_Poly_Polygon2D(TColgp_Array1OfPnt2d.getCPtr(Nodes), Nodes), true);
  }

  /**
   *  Returns the deflection of this polygon.
   *  Deflection is used in cases where the polygon is an
   *  approximate representation of a curve. Deflection
   *  represents the maximum distance permitted between any
   *  point on the curve and the corresponding point on the polygon.
   *  By default the deflection value is equal to 0. An algorithm
   *  using this 2D polygon with a deflection value equal to 0
   *  considers that it is working with a true polygon and not with
   *  an approximate representation of a curve. The Deflection
   *  function is used to modify the deflection value of this polygon.
   *  The deflection value can be used by any algorithm working  with 2D polygons.
   *  For example:
   *  -   An algorithm may use a unique deflection value for all
   *  its polygons. In this case it is not necessary to use the
   *  Deflection function.
   *  -   Or an algorithm may want to attach a different
   *  deflection to each polygon. In this case, the Deflection
   *  function is used to set a value on each polygon, and
   *  later to fetch the value.
   */
  public double Deflection() {
    return OCCwrapJavaJNI.Poly_Polygon2D_Deflection__SWIG_0(swigCPtr, this);
  }

  /**
   *  Sets the deflection of this polygon to D
   */
  public void Deflection(double D) {
    OCCwrapJavaJNI.Poly_Polygon2D_Deflection__SWIG_1(swigCPtr, this, D);
  }

  /**
   *  Returns the number of nodes in this polygon.
   *  Note: If the polygon is closed, the point of closure is
   *  repeated at the end of its table of nodes. Thus, on a closed
   *  triangle, the function NbNodes returns 4.
   */
  public int NbNodes() {
    return OCCwrapJavaJNI.Poly_Polygon2D_NbNodes(swigCPtr, this);
  }

  /**
   *  Returns the table of nodes for this polygon.
   */
  public  TColgp_Array1OfPnt2d  Nodes() {
    TColgp_Array1OfPnt2d ret = new TColgp_Array1OfPnt2d(OCCwrapJavaJNI.Poly_Polygon2D_Nodes(swigCPtr, this), false, this);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Poly_Polygon2D_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Poly_Polygon2D_get_type_descriptor(), true );
  }

  public static  Poly_Polygon2D  DownCast( Standard_Transient  T) {
    return new Poly_Polygon2D ( OCCwrapJavaJNI.Poly_Polygon2D_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Poly_Polygon2D_TypeOf(), true );
  }

}
