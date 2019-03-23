package opencascade;

/**
 *  This class implements the basis services for an offset curve
 *  in 3D space. The Offset curve in this package can be a self
 *  intersecting curve even if the basis curve does not
 *  self-intersect. The self intersecting portions are not deleted
 *  at the construction time.
 *  An offset curve is a curve at constant distance (Offset) from
 *  a basis curve in a reference direction V. The offset curve
 *  takes its parametrization from the basis curve.
 *  The Offset curve is in the direction of the normal N
 *  defined with the cross product  T^V, where the vector T
 *  is given by the first derivative on the basis curve with
 *  non zero length.
 *  The distance offset may be positive or negative to indicate the
 *  preferred side of the curve :
 *  . distance offset >0 => the curve is in the direction of N
 *  . distance offset <0 => the curve is in the direction of - N
 * 
 *  On the Offset curve :
 *  Value (U) = BasisCurve.Value(U) + (Offset * (T ^ V)) / ||T ^ V||
 * 
 *  At any point the Offset direction V must not be parallel to the
 *  vector T and the vector T must not have null length else the
 *  offset curve is not defined. So the offset curve has not the
 *  same continuity as the basis curve.
 * 
 *  Warnings :
 * 
 *  In this package we suppose that the continuity of the offset
 *  curve is one degree less than the continuity of the basis
 *  curve and we don't check that at any point ||T^V|| != 0.0
 * 
 *  So to evaluate the curve it is better to check that the offset
 *  curve is well defined at any point because an exception could
 *  be raised. The check is not done in this package at the creation
 *  of the offset curve because the control needs the use of an
 *  algorithm which cannot be implemented in this package.
 * 
 *  The OffsetCurve is closed if the first point and the last point
 *  are the same (The distance between these two points is lower or
 *  equal to the Resolution sea package gp) . The OffsetCurve can be
 *  closed even if the basis curve is not closed.
 */
public class Geom_OffsetCurve extends Geom_Curve {
  Geom_OffsetCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  C is the basis curve, Offset is the distance between <me> and
   *  the basis curve at any point. V defines the fixed reference
   *  direction (offset direction). If P is a point on the basis
   *  curve and T the first derivative with non zero length
   *  at this point, the corresponding point on the offset curve is
   *  in the direction of the vector-product N = V ^ T   where
   *  N is a unitary vector.
   *  If isNotCheckC0 = TRUE checking if basis curve has C0-continuity
   *  is not made.
   *  Warnings :
   *  In this package the entities are not shared. The OffsetCurve is
   *  built with a copy of the curve C. So when C is modified the
   *  OffsetCurve is not modified
   * 
   *  Raised if the basis curve C is not at least C1.
   *  Warnings :
   *  No check is done to know if ||V^T|| != 0.0 at any point.
   */
  public Geom_OffsetCurve( Geom_Curve  C, double Offset,  gp_Dir  V, long isNotCheckC0) {
    this(OCCwrapJavaJNI.new_Geom_OffsetCurve__SWIG_0( Geom_Curve.getCPtr(C) , C, Offset, gp_Dir.getCPtr(V), V, isNotCheckC0), true);
  }

  public Geom_OffsetCurve( Geom_Curve  C, double Offset,  gp_Dir  V) {
    this(OCCwrapJavaJNI.new_Geom_OffsetCurve__SWIG_1( Geom_Curve.getCPtr(C) , C, Offset, gp_Dir.getCPtr(V), V), true);
  }

  /**
   *  Changes this offset curve by assigning C
   *  as the basis curve from which it is built.
   *  If isNotCheckC0 = TRUE checking if basis curve
   *  has C0-continuity is not made.
   *  Exceptions
   *  Standard_ConstructionError if the curve C is not at least "C1" continuous.
   */
  public void SetBasisCurve( Geom_Curve  C, long isNotCheckC0) {
    OCCwrapJavaJNI.Geom_OffsetCurve_SetBasisCurve__SWIG_0(swigCPtr, this,  Geom_Curve.getCPtr(C) , C, isNotCheckC0);
  }

  public void SetBasisCurve( Geom_Curve  C) {
    OCCwrapJavaJNI.Geom_OffsetCurve_SetBasisCurve__SWIG_1(swigCPtr, this,  Geom_Curve.getCPtr(C) , C);
  }

  /**
   *  Changes this offset curve by assigning V as the
   *  reference vector used to compute the offset direction.
   */
  public void SetDirection( gp_Dir  V) {
    OCCwrapJavaJNI.Geom_OffsetCurve_SetDirection(swigCPtr, this, gp_Dir.getCPtr(V), V);
  }

  /**
   *  Changes this offset curve by assigning D as the offset value.
   */
  public void SetOffsetValue(double D) {
    OCCwrapJavaJNI.Geom_OffsetCurve_SetOffsetValue(swigCPtr, this, D);
  }

  public  Geom_Curve  BasisCurve() {
    return new Geom_Curve ( OCCwrapJavaJNI.Geom_OffsetCurve_BasisCurve(swigCPtr, this), true );
  }

  /**
   *  Returns the reference vector of this offset curve.
   *  Value and derivatives
   *  Warnings :
   *  The exception UndefinedValue or UndefinedDerivative is
   *  raised if it is not possible to compute a unique offset
   *  direction.
   *  If T is the first derivative with not null length and
   *  V the offset direction the relation ||T(U) ^ V|| != 0
   *  must be satisfied to evaluate the offset curve.
   *  No check is done at the creation time and we suppose
   *  in this package that the offset curve is well defined.
   */
  public  gp_Dir  Direction() {
    gp_Dir ret = new gp_Dir(OCCwrapJavaJNI.Geom_OffsetCurve_Direction(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the offset value of this offset curve.
   */
  public double Offset() {
    return OCCwrapJavaJNI.Geom_OffsetCurve_Offset(swigCPtr, this);
  }

  /**
   *  Returns continuity of the basis curve.
   */
  public GeomAbs_Shape GetBasisCurveContinuity() {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.Geom_OffsetCurve_GetBasisCurveContinuity(swigCPtr, this));
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_OffsetCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_OffsetCurve_get_type_descriptor(), true );
  }

  public static  Geom_OffsetCurve  DownCast( Standard_Transient  T) {
    return new Geom_OffsetCurve ( OCCwrapJavaJNI.Geom_OffsetCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_OffsetCurve_TypeOf(), true );
  }

}
