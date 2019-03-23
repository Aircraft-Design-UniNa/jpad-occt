package opencascade;

/**
 *  This class Provides a polygon in 3D space. It is generally an approximate representation of a curve.
 *  A Polygon3D is defined by a table of nodes. Each node is
 *  a 3D point. If the polygon is closed, the point of closure is
 *  repeated at the end of the table of nodes.
 *  If the polygon is an approximate representation of a curve,
 *  you can associate with each of its nodes the value of the
 *  parameter of the corresponding point on the curve.
 */
public class Poly_Polygon3D extends Standard_Transient {
  Poly_Polygon3D(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  onstructs a 3D polygon defined by the table of points, Nodes.
   */
  public Poly_Polygon3D( TColgp_Array1OfPnt  Nodes) {
    this(OCCwrapJavaJNI.new_Poly_Polygon3D__SWIG_0(TColgp_Array1OfPnt.getCPtr(Nodes), Nodes), true);
  }

  /**
   *  Constructs a 3D polygon defined by
   *  the table of points, Nodes, and the parallel table of
   *  parameters, Parameters, where each value of the table
   *  Parameters is the parameter of the corresponding point
   *  on the curve approximated by the constructed polygon.
   *  Warning
   *  Both the Nodes and Parameters tables must have the
   *  same bounds. This property is not checked at construction time.
   */
  public Poly_Polygon3D( TColgp_Array1OfPnt  Nodes,  TColStd_Array1OfReal  Parameters) {
    this(OCCwrapJavaJNI.new_Poly_Polygon3D__SWIG_1(TColgp_Array1OfPnt.getCPtr(Nodes), Nodes, TColStd_Array1OfReal.getCPtr(Parameters), Parameters), true);
  }

  public  Poly_Polygon3D  Copy() {
    return new Poly_Polygon3D ( OCCwrapJavaJNI.Poly_Polygon3D_Copy(swigCPtr, this), true );
  }

  /**
   *  Returns the deflection of this polygon
   */
  public double Deflection() {
    return OCCwrapJavaJNI.Poly_Polygon3D_Deflection__SWIG_0(swigCPtr, this);
  }

  /**
   *  Sets the deflection of this polygon to D. See more on deflection in Poly_Polygon2D
   */
  public void Deflection(double D) {
    OCCwrapJavaJNI.Poly_Polygon3D_Deflection__SWIG_1(swigCPtr, this, D);
  }

  /**
   *  Returns the number of nodes in this polygon.
   *  Note: If the polygon is closed, the point of closure is
   *  repeated at the end of its table of nodes. Thus, on a closed
   *  triangle the function NbNodes returns 4.
   */
  public int NbNodes() {
    return OCCwrapJavaJNI.Poly_Polygon3D_NbNodes(swigCPtr, this);
  }

  /**
   *  Returns the table of nodes for this polygon.
   */
  public  TColgp_Array1OfPnt  Nodes() {
    TColgp_Array1OfPnt ret = new TColgp_Array1OfPnt(OCCwrapJavaJNI.Poly_Polygon3D_Nodes(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the table of the parameters associated with each node in this polygon.
   *  HasParameters function checks if   parameters are associated with the nodes of this polygon.
   */
  public long HasParameters() {
    return OCCwrapJavaJNI.Poly_Polygon3D_HasParameters(swigCPtr, this);
  }

  /**
   *  Returns true if parameters are associated with the nodes
   *  in this polygon.
   */
  public  TColStd_Array1OfReal  Parameters() {
    TColStd_Array1OfReal ret = new TColStd_Array1OfReal(OCCwrapJavaJNI.Poly_Polygon3D_Parameters(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the table of the parameters associated with each node in this polygon.
   *  ChangeParameters function returnes the  array as shared. Therefore if the table is selected by
   *  reference you can, by simply modifying it, directly modify
   *  the data structure of this polygon.
   */
  public  TColStd_Array1OfReal  ChangeParameters() {
    TColStd_Array1OfReal ret = new TColStd_Array1OfReal(OCCwrapJavaJNI.Poly_Polygon3D_ChangeParameters(swigCPtr, this), false, this);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Poly_Polygon3D_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Poly_Polygon3D_get_type_descriptor(), true );
  }

  public static  Poly_Polygon3D  DownCast( Standard_Transient  T) {
    return new Poly_Polygon3D ( OCCwrapJavaJNI.Poly_Polygon3D_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Poly_Polygon3D_TypeOf(), true );
  }

}
