package opencascade;

/**
 *  This class provides a polygon in 3D space, based on the triangulation
 *  of a surface. It may be the approximate representation of a
 *  curve on the surface, or more generally the shape.
 *  A PolygonOnTriangulation is defined by a table of
 *  nodes. Each node is an index in the table of nodes specific
 *  to a triangulation, and represents a point on the surface. If
 *  the polygon is closed, the index of the point of closure is
 *  repeated at the end of the table of nodes.
 *  If the polygon is an approximate representation of a curve
 *  on a surface, you can associate with each of its nodes the
 *  value of the parameter of the corresponding point on the
 *  curve.represents a 3d Polygon
 */
public class Poly_PolygonOnTriangulation extends Standard_Transient {
  Poly_PolygonOnTriangulation(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Constructs a 3D polygon on the triangulation of a shape,
   *  defined by the table of nodes, <Nodes>.
   */
  public Poly_PolygonOnTriangulation( TColStd_Array1OfInteger  Nodes) {
    this(OCCwrapJavaJNI.new_Poly_PolygonOnTriangulation__SWIG_0(TColStd_Array1OfInteger.getCPtr(Nodes), Nodes), true);
  }

  /**
   *  Constructs a 3D polygon on the triangulation of a shape, defined by:
   *  -   the table of nodes, Nodes, and the table of parameters, <Parameters>.
   *  where:
   *  -   a node value is an index in the table of nodes specific
   *  to an existing triangulation of a shape
   *  -   and a parameter value is the value of the parameter of
   *  the corresponding point on the curve approximated by
   *  the constructed polygon.
   *  Warning
   *  The tables Nodes and Parameters must be the same size.
   *  This property is not checked at construction time.
   */
  public Poly_PolygonOnTriangulation( TColStd_Array1OfInteger  Nodes,  TColStd_Array1OfReal  Parameters) {
    this(OCCwrapJavaJNI.new_Poly_PolygonOnTriangulation__SWIG_1(TColStd_Array1OfInteger.getCPtr(Nodes), Nodes, TColStd_Array1OfReal.getCPtr(Parameters), Parameters), true);
  }

  public  Poly_PolygonOnTriangulation  Copy() {
    return new Poly_PolygonOnTriangulation ( OCCwrapJavaJNI.Poly_PolygonOnTriangulation_Copy(swigCPtr, this), true );
  }

  /**
   *  Returns the deflection of this polygon
   */
  public double Deflection() {
    return OCCwrapJavaJNI.Poly_PolygonOnTriangulation_Deflection__SWIG_0(swigCPtr, this);
  }

  /**
   *  Sets the deflection of this polygon to D.
   *  See more on deflection in Poly_Polygones2D.
   */
  public void Deflection(double D) {
    OCCwrapJavaJNI.Poly_PolygonOnTriangulation_Deflection__SWIG_1(swigCPtr, this, D);
  }

  /**
   *  Returns the number of nodes for this polygon.
   *  Note: If the polygon is closed, the point of closure is
   *  repeated at the end of its table of nodes. Thus, on a closed
   *  triangle, the function NbNodes returns 4.
   */
  public int NbNodes() {
    return OCCwrapJavaJNI.Poly_PolygonOnTriangulation_NbNodes(swigCPtr, this);
  }

  /**
   *  Returns the table of nodes for this polygon. A node value
   *  is an index in the table of nodes specific to an existing
   *  triangulation of a shape.
   */
  public  TColStd_Array1OfInteger  Nodes() {
    TColStd_Array1OfInteger ret = new TColStd_Array1OfInteger(OCCwrapJavaJNI.Poly_PolygonOnTriangulation_Nodes(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns true if parameters are associated with the nodes in this polygon.
   */
  public long HasParameters() {
    return OCCwrapJavaJNI.Poly_PolygonOnTriangulation_HasParameters(swigCPtr, this);
  }

  public  TColStd_HArray1OfReal  Parameters() {
    return new TColStd_HArray1OfReal ( OCCwrapJavaJNI.Poly_PolygonOnTriangulation_Parameters(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Poly_PolygonOnTriangulation_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Poly_PolygonOnTriangulation_get_type_descriptor(), true );
  }

  public static  Poly_PolygonOnTriangulation  DownCast( Standard_Transient  T) {
    return new Poly_PolygonOnTriangulation ( OCCwrapJavaJNI.Poly_PolygonOnTriangulation_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Poly_PolygonOnTriangulation_TypeOf(), true );
  }

}
