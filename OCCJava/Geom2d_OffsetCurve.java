package opencascade;

/**
 *  This class implements the basis services for the creation,
 *  edition, modification and evaluation of planar offset curve.
 *  The offset curve is obtained by offsetting by distance along
 *  the normal to a basis curve defined in 2D space.
 *  The offset curve in this package can be a self intersecting
 *  curve even if the basis curve does not self-intersect.
 *  The self intersecting portions are not deleted at the
 *  construction time.
 *  An offset curve is a curve at constant distance (Offset) from a
 *  basis curve and the offset curve takes its parametrization from
 *  the basis curve. The Offset curve is in the direction of the
 *  normal to the basis curve N.
 *  The distance offset may be positive or negative to indicate the
 *  preferred side of the curve :
 *  . distance offset >0 => the curve is in the direction of N
 *  . distance offset >0 => the curve is in the direction of - N
 *  On the Offset curve :
 *  Value(u) = BasisCurve.Value(U) + (Offset * (T ^ Z)) / ||T ^ Z||
 *  where T is the tangent vector to the basis curve and Z the
 *  direction of the normal vector to the plane of the curve,
 *  N = T ^ Z defines the offset direction and should not have
 *  null length.
 * 
 *  Warnings :
 *  In this package we suppose that the continuity of the offset
 *  curve is one degree less than the continuity of the
 *  basis curve and we don't check that at any point ||T^Z|| != 0.0
 * 
 *  So to evaluate the curve it is better to check that the offset
 *  curve is well defined at any point because an exception could
 *  be raised. The check is not done in this package at the creation
 *  of the offset curve because the control needs the use of an
 *  algorithm which cannot be implemented in this package.
 *  The OffsetCurve is closed if the first point and the last point
 *  are the same (The distance between these two points is lower or
 *  equal to the Resolution sea package gp) . The OffsetCurve can be
 *  closed even if the basis curve is not closed.
 */
public class Geom2d_OffsetCurve extends Geom2d_Curve {
  Geom2d_OffsetCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Constructs a curve offset from the basis curve C,
   *  where Offset is the distance between the offset
   *  curve and the basis curve at any point.
   *  A point on the offset curve is built by measuring the
   *  offset value along a normal vector at a point on C.
   *  This normal vector is obtained by rotating the
   *  vector tangential to C at 90 degrees in the
   *  anti-trigonometric sense. The side of C on which
   *  the offset value is measured is indicated by this
   *  normal vector if Offset is positive, or in the inverse
   *  sense if Offset is negative.
   *  If isNotCheckC0 = TRUE checking if basis curve has C0-continuity
   *  is not made.
   *  Warnings :
   *  In this package the entities are not shared. The OffsetCurve is
   *  built with a copy of the curve C. So when C is modified the
   *  OffsetCurve is not modified
   *  Warning!  if isNotCheckC0 = false,
   *  ConstructionError  raised if the basis curve C is not at least C1.
   *  No check is done to know if ||V^Z|| != 0.0 at any point.
   */
  public Geom2d_OffsetCurve( Geom2d_Curve  C, double Offset, long isNotCheckC0) {
    this(OCCwrapJavaJNI.new_Geom2d_OffsetCurve__SWIG_0( Geom2d_Curve.getCPtr(C) , C, Offset, isNotCheckC0), true);
  }

  public Geom2d_OffsetCurve( Geom2d_Curve  C, double Offset) {
    this(OCCwrapJavaJNI.new_Geom2d_OffsetCurve__SWIG_1( Geom2d_Curve.getCPtr(C) , C, Offset), true);
  }

  /**
   *  Changes this offset curve by assigning C as the
   *  basis curve from which it is built.
   *  If isNotCheckC0 = TRUE checking if basis curve has C0-continuity
   *  is not made.
   *  Exceptions
   *  if isNotCheckC0 = false,
   *  Standard_ConstructionError if the curve C is not at least "C1" continuous.
   */
  public void SetBasisCurve( Geom2d_Curve  C, long isNotCheckC0) {
    OCCwrapJavaJNI.Geom2d_OffsetCurve_SetBasisCurve__SWIG_0(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C, isNotCheckC0);
  }

  public void SetBasisCurve( Geom2d_Curve  C) {
    OCCwrapJavaJNI.Geom2d_OffsetCurve_SetBasisCurve__SWIG_1(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C);
  }

  /**
   *  Changes this offset curve by assigning D as the offset value.
   */
  public void SetOffsetValue(double D) {
    OCCwrapJavaJNI.Geom2d_OffsetCurve_SetOffsetValue(swigCPtr, this, D);
  }

  public  Geom2d_Curve  BasisCurve() {
    return new Geom2d_Curve ( OCCwrapJavaJNI.Geom2d_OffsetCurve_BasisCurve(swigCPtr, this), true );
  }

  /**
   *  Returns the offset value of this offset curve.
   */
  public double Offset() {
    return OCCwrapJavaJNI.Geom2d_OffsetCurve_Offset(swigCPtr, this);
  }

  /**
   *  Returns continuity of the basis curve.
   */
  public GeomAbs_Shape GetBasisCurveContinuity() {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.Geom2d_OffsetCurve_GetBasisCurveContinuity(swigCPtr, this));
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom2d_OffsetCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_OffsetCurve_get_type_descriptor(), true );
  }

  public static  Geom2d_OffsetCurve  DownCast( Standard_Transient  T) {
    return new Geom2d_OffsetCurve ( OCCwrapJavaJNI.Geom2d_OffsetCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_OffsetCurve_TypeOf(), true );
  }

}
