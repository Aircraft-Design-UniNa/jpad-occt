package opencascade;

/**
 *  Describes a portion of a curve (termed the "basis
 *  curve") limited by two parameter values inside the
 *  parametric domain of the basis curve.
 *  The trimmed curve is defined by:
 *  - the basis curve, and
 *  - the two parameter values which limit it.
 *  The trimmed curve can either have the same
 *  orientation as the basis curve or the opposite orientation.
 */
public class Geom_TrimmedCurve extends Geom_BoundedCurve {
  Geom_TrimmedCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Constructs a trimmed curve from the basis curve C
   *  which is limited between parameter values U1 and U2.
   *  Note: - U1 can be greater or less than U2; in both cases,
   *  the returned curve is oriented from U1 to U2.
   *  - If the basis curve C is periodic, there is an
   *  ambiguity because two parts are available. In this
   *  case, the trimmed curve has the same orientation
   *  as the basis curve if Sense is true (default value)
   *  or the opposite orientation if Sense is false.
   *  - If the curve is closed but not periodic, it is not
   *  possible to keep the part of the curve which
   *  includes the junction point (except if the junction
   *  point is at the beginning or at the end of the
   *  trimmed curve). If you tried to do this, you could
   *  alter the fundamental characteristics of the basis
   *  curve, which are used, for example, to compute
   *  the derivatives of the trimmed curve. The rules
   *  for a closed curve are therefore the same as
   *  those for an open curve.
   *  Warning: The trimmed curve is built from a copy of curve C.
   *  Therefore, when C is modified, the trimmed curve
   *  is not modified.
   *  - If the basis curve is periodic and theAdjustPeriodic is True,
   *  the bounds of the trimmed curve may be different from U1 and U2
   *  if the parametric origin of the basis curve is within
   *  the arc of the trimmed curve. In this case, the
   *  modified parameter will be equal to U1 or U2
   *  plus or minus the period.
   *  When theAdjustPeriodic is False, parameters U1 and U2 will be
   *  the same, without adjustment into the first period.
   *  Exceptions
   *  Standard_ConstructionError if:
   *  - C is not periodic and U1 or U2 is outside the
   *  bounds of C, or
   *  - U1 is equal to U2.
   */
  public Geom_TrimmedCurve( Geom_Curve  C, double U1, double U2, long Sense, long theAdjustPeriodic) {
    this(OCCwrapJavaJNI.new_Geom_TrimmedCurve__SWIG_0( Geom_Curve.getCPtr(C) , C, U1, U2, Sense, theAdjustPeriodic), true);
  }

  public Geom_TrimmedCurve( Geom_Curve  C, double U1, double U2, long Sense) {
    this(OCCwrapJavaJNI.new_Geom_TrimmedCurve__SWIG_1( Geom_Curve.getCPtr(C) , C, U1, U2, Sense), true);
  }

  public Geom_TrimmedCurve( Geom_Curve  C, double U1, double U2) {
    this(OCCwrapJavaJNI.new_Geom_TrimmedCurve__SWIG_2( Geom_Curve.getCPtr(C) , C, U1, U2), true);
  }

  /**
   *  Changes this trimmed curve, by redefining the
   *  parameter values U1 and U2 which limit its basis curve.
   *  Note: If the basis curve is periodic, the trimmed curve
   *  has the same orientation as the basis curve if Sense
   *  is true (default value) or the opposite orientation if Sense is false.
   *  Warning
   *  If the basis curve is periodic and theAdjustPeriodic is True,
   *  the bounds of the trimmed curve may be different from U1 and U2 if the
   *  parametric origin of the basis curve is within the arc of
   *  the trimmed curve. In this case, the modified
   *  parameter will be equal to U1 or U2 plus or minus the period.
   *  When theAdjustPeriodic is False, parameters U1 and U2 will be
   *  the same, without adjustment into the first period.
   *  Exceptions
   *  Standard_ConstructionError if:
   *  - the basis curve is not periodic, and either U1 or U2
   *  are outside the bounds of the basis curve, or
   *  - U1 is equal to U2.
   */
  public void SetTrim(double U1, double U2, long Sense, long theAdjustPeriodic) {
    OCCwrapJavaJNI.Geom_TrimmedCurve_SetTrim__SWIG_0(swigCPtr, this, U1, U2, Sense, theAdjustPeriodic);
  }

  public void SetTrim(double U1, double U2, long Sense) {
    OCCwrapJavaJNI.Geom_TrimmedCurve_SetTrim__SWIG_1(swigCPtr, this, U1, U2, Sense);
  }

  public void SetTrim(double U1, double U2) {
    OCCwrapJavaJNI.Geom_TrimmedCurve_SetTrim__SWIG_2(swigCPtr, this, U1, U2);
  }

  public  Geom_Curve  BasisCurve() {
    return new Geom_Curve ( OCCwrapJavaJNI.Geom_TrimmedCurve_BasisCurve(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_TrimmedCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_TrimmedCurve_get_type_descriptor(), true );
  }

  public static  Geom_TrimmedCurve  DownCast( Standard_Transient  T) {
    return new Geom_TrimmedCurve ( OCCwrapJavaJNI.Geom_TrimmedCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_TrimmedCurve_TypeOf(), true );
  }

}
