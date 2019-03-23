package opencascade;

/**
 *  This class is used to model construction geometry.
 *  The specific geometric construction of the
 *  attribute is defined by an element of the
 *  enumeration TDataXtd_GeometryEnum.
 *  This attribute may  also be used to qualify  underlying
 *  geometry  of   the  associated NamedShape.     for
 *  Constructuion element by example.
 */
public class TDataXtd_Geometry extends TDF_Attribute {
  TDataXtd_Geometry(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static  TDataXtd_Geometry  Set( TDF_Label  label) {
    return new TDataXtd_Geometry ( OCCwrapJavaJNI.TDataXtd_Geometry_Set(TDF_Label.getCPtr(label), label), true );
  }

  /**
   *  Returns the label L used to define the type of
   *  geometric construction for the geometry attribute.
   */
  public static TDataXtd_GeometryEnum Type( TDF_Label  L) {
    return TDataXtd_GeometryEnum.swigToEnum(OCCwrapJavaJNI.TDataXtd_Geometry_Type__SWIG_0(TDF_Label.getCPtr(L), L));
  }

  /**
   *  Returns the topological attribute S used to define
   *  the type of geometric construction for the geometry attribute.
   */
  public static TDataXtd_GeometryEnum Type( TNaming_NamedShape  S) {
    return TDataXtd_GeometryEnum.swigToEnum(OCCwrapJavaJNI.TDataXtd_Geometry_Type__SWIG_1( TNaming_NamedShape.getCPtr(S) , S));
  }

  /**
   *  Returns the point attribute defined by the label L and the point G.
   */
  public static long Point( TDF_Label  L, gp_Pnt G) {
    return OCCwrapJavaJNI.TDataXtd_Geometry_Point__SWIG_0(TDF_Label.getCPtr(L), L, gp_Pnt.getCPtr(G), G);
  }

  /**
   *  Returns the point attribute defined by the topological attribute S and the point G.
   */
  public static long Point( TNaming_NamedShape  S, gp_Pnt G) {
    return OCCwrapJavaJNI.TDataXtd_Geometry_Point__SWIG_1( TNaming_NamedShape.getCPtr(S) , S, gp_Pnt.getCPtr(G), G);
  }

  /**
   *  Returns the axis attribute defined by the label L and the axis G.
   */
  public static long Axis( TDF_Label  L, gp_Ax1 G) {
    return OCCwrapJavaJNI.TDataXtd_Geometry_Axis__SWIG_0(TDF_Label.getCPtr(L), L, gp_Ax1.getCPtr(G), G);
  }

  /**
   *  Returns the axis attribute defined by the topological attribute S and the axis G.
   */
  public static long Axis( TNaming_NamedShape  S, gp_Ax1 G) {
    return OCCwrapJavaJNI.TDataXtd_Geometry_Axis__SWIG_1( TNaming_NamedShape.getCPtr(S) , S, gp_Ax1.getCPtr(G), G);
  }

  /**
   *  Returns the line attribute defined by the label L and the line G.
   */
  public static long Line( TDF_Label  L, gp_Lin G) {
    return OCCwrapJavaJNI.TDataXtd_Geometry_Line__SWIG_0(TDF_Label.getCPtr(L), L, gp_Lin.getCPtr(G), G);
  }

  /**
   *  Returns the line attribute defined by the topological attribute S and the line G.
   */
  public static long Line( TNaming_NamedShape  S, gp_Lin G) {
    return OCCwrapJavaJNI.TDataXtd_Geometry_Line__SWIG_1( TNaming_NamedShape.getCPtr(S) , S, gp_Lin.getCPtr(G), G);
  }

  /**
   *  Returns the circle attribute defined by the label L and the circle G.
   */
  public static long Circle( TDF_Label  L, gp_Circ G) {
    return OCCwrapJavaJNI.TDataXtd_Geometry_Circle__SWIG_0(TDF_Label.getCPtr(L), L, gp_Circ.getCPtr(G), G);
  }

  /**
   *  Returns the circle attribute defined by the topological attribute S and the circle G.
   */
  public static long Circle( TNaming_NamedShape  S, gp_Circ G) {
    return OCCwrapJavaJNI.TDataXtd_Geometry_Circle__SWIG_1( TNaming_NamedShape.getCPtr(S) , S, gp_Circ.getCPtr(G), G);
  }

  /**
   *  Returns the ellipse attribute defined by the label L and the ellipse G.
   */
  public static long Ellipse( TDF_Label  L, gp_Elips G) {
    return OCCwrapJavaJNI.TDataXtd_Geometry_Ellipse__SWIG_0(TDF_Label.getCPtr(L), L, gp_Elips.getCPtr(G), G);
  }

  /**
   *  Returns the ellipse attribute defined by the
   *  topological attribute S and the ellipse G.
   */
  public static long Ellipse( TNaming_NamedShape  S, gp_Elips G) {
    return OCCwrapJavaJNI.TDataXtd_Geometry_Ellipse__SWIG_1( TNaming_NamedShape.getCPtr(S) , S, gp_Elips.getCPtr(G), G);
  }

  /**
   *  Returns the plane attribute defined by the label L and the plane G.
   */
  public static long Plane( TDF_Label  L, gp_Pln G) {
    return OCCwrapJavaJNI.TDataXtd_Geometry_Plane__SWIG_0(TDF_Label.getCPtr(L), L, gp_Pln.getCPtr(G), G);
  }

  /**
   *  Returns the plane attribute defined by the
   *  topological attribute S and the plane G.
   */
  public static long Plane( TNaming_NamedShape  S, gp_Pln G) {
    return OCCwrapJavaJNI.TDataXtd_Geometry_Plane__SWIG_1( TNaming_NamedShape.getCPtr(S) , S, gp_Pln.getCPtr(G), G);
  }

  /**
   *  Returns the cylinder attribute defined by the label L and the cylinder G.
   */
  public static long Cylinder( TDF_Label  L, gp_Cylinder G) {
    return OCCwrapJavaJNI.TDataXtd_Geometry_Cylinder__SWIG_0(TDF_Label.getCPtr(L), L, gp_Cylinder.getCPtr(G), G);
  }

  /**
   *  Returns the cylinder attribute defined by the
   *  topological attribute S and the cylinder G.
   */
  public static long Cylinder( TNaming_NamedShape  S, gp_Cylinder G) {
    return OCCwrapJavaJNI.TDataXtd_Geometry_Cylinder__SWIG_1( TNaming_NamedShape.getCPtr(S) , S, gp_Cylinder.getCPtr(G), G);
  }

  /**
   *  This and the next methods are used to  retrieve  underlying geometry of  the
   *  NamedShape, even   if  noone Geometry   Attribute  is
   *  associated  .  if not  found or not compliant geometry return False.
   */
  public TDataXtd_Geometry() {
    this(OCCwrapJavaJNI.new_TDataXtd_Geometry(), true);
  }

  /**
   *  Returns the type of geometric construction T of this attribute.
   *  T will be a value of the enumeration TDataXtd_GeometryEnum.
   */
  public void SetType(TDataXtd_GeometryEnum T) {
    OCCwrapJavaJNI.TDataXtd_Geometry_SetType(swigCPtr, this, T.swigValue());
  }

  public TDataXtd_GeometryEnum GetGeometryType() {
    return TDataXtd_GeometryEnum.swigToEnum(OCCwrapJavaJNI.TDataXtd_Geometry_GetGeometryType(swigCPtr, this));
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataXtd_Geometry_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataXtd_Geometry_get_type_descriptor(), true );
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataXtd_Geometry_GetId(), true);
  }

  public static  TDataXtd_Geometry  DownCast( Standard_Transient  T) {
    return new TDataXtd_Geometry ( OCCwrapJavaJNI.TDataXtd_Geometry_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataXtd_Geometry_TypeOf(), true );
  }

}
