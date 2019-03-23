package opencascade;

/**
 *  Defines a portion of a curve limited by two values of
 *  parameters inside the parametric domain of the curve.
 *  The trimmed curve is defined by:
 *  - the basis curve, and
 *  - the two parameter values which limit it.
 *  The trimmed curve can either have the same
 *  orientation as the basis curve or the opposite orientation.
 */
public class Geom2d_TrimmedCurve extends Geom2d_BoundedCurve {
  Geom2d_TrimmedCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates a trimmed curve from the basis curve C limited between
   *  U1 and U2.
   * 
   *  . U1 can be greater or lower than U2.
   *  . The returned curve is oriented from U1 to U2.
   *  . If the basis curve C is periodic there is an ambiguity
   *  because two parts are available. In this case by default
   *  the trimmed curve has the same orientation as the basis
   *  curve (Sense = True). If Sense = False then the orientation
   *  of the trimmed curve is opposite to the orientation of the
   *  basis curve C.
   *  If the curve is closed but not periodic it is not possible
   *  to keep the part of the curve including the junction point
   *  (except if the junction point is at the beginning or
   *  at the end of the trimmed curve) because you could lose the
   *  fundamental characteristics of the basis curve which are
   *  used for example to compute the derivatives of the trimmed
   *  curve. So for a closed curve the rules are the same as for
   *  a open curve.
   *  Warnings :
   *  In this package the entities are not shared. The TrimmedCurve is
   *  built with a copy of the curve C. So when C is modified the
   *  TrimmedCurve is not modified
   *  Warnings :
   *  If <C> is periodic and <theAdjustPeriodic> is True, parametrics
   *  bounds of the TrimmedCurve, can be different to [<U1>;<U2>},
   *  if <U1> or <U2> are not in the principal period.
   *  Include :
   *  For more explanation see the scheme given with this class.
   *  Raises ConstructionError the C is not periodic and U1 or U2 are out of
   *  the bounds of C.
   *  Raised if U1 = U2.
   */
  public Geom2d_TrimmedCurve( Geom2d_Curve  C, double U1, double U2, long Sense, long theAdjustPeriodic) {
    this(OCCwrapJavaJNI.new_Geom2d_TrimmedCurve__SWIG_0( Geom2d_Curve.getCPtr(C) , C, U1, U2, Sense, theAdjustPeriodic), true);
  }

  public Geom2d_TrimmedCurve( Geom2d_Curve  C, double U1, double U2, long Sense) {
    this(OCCwrapJavaJNI.new_Geom2d_TrimmedCurve__SWIG_1( Geom2d_Curve.getCPtr(C) , C, U1, U2, Sense), true);
  }

  public Geom2d_TrimmedCurve( Geom2d_Curve  C, double U1, double U2) {
    this(OCCwrapJavaJNI.new_Geom2d_TrimmedCurve__SWIG_2( Geom2d_Curve.getCPtr(C) , C, U1, U2), true);
  }

  /**
   *  Changes this trimmed curve, by redefining the
   *  parameter values U1 and U2, which limit its basis curve.
   *  Note: If the basis curve is periodic, the trimmed curve
   *  has the same orientation as the basis curve if Sense
   *  is true (default value) or the opposite orientation if Sense is false.
   *  Warning
   *  If the basis curve is periodic and theAdjustPeriodic is True,
   *  the bounds of the trimmed curve may be different from U1 and U2 if the
   *  parametric origin of the basis curve is within the arc
   *  of the trimmed curve. In this case, the modified
   *  parameter will be equal to U1 or U2 plus or minus the period.
   *  If theAdjustPeriodic is False, parameters U1 and U2 will stay unchanged.
   *  Exceptions
   *  Standard_ConstructionError if:
   *  - the basis curve is not periodic, and either U1 or U2
   *  are outside the bounds of the basis curve, or
   *  - U1 is equal to U2.
   */
  public void SetTrim(double U1, double U2, long Sense, long theAdjustPeriodic) {
    OCCwrapJavaJNI.Geom2d_TrimmedCurve_SetTrim__SWIG_0(swigCPtr, this, U1, U2, Sense, theAdjustPeriodic);
  }

  public void SetTrim(double U1, double U2, long Sense) {
    OCCwrapJavaJNI.Geom2d_TrimmedCurve_SetTrim__SWIG_1(swigCPtr, this, U1, U2, Sense);
  }

  public void SetTrim(double U1, double U2) {
    OCCwrapJavaJNI.Geom2d_TrimmedCurve_SetTrim__SWIG_2(swigCPtr, this, U1, U2);
  }

  public  Geom2d_Curve  BasisCurve() {
    return new Geom2d_Curve ( OCCwrapJavaJNI.Geom2d_TrimmedCurve_BasisCurve(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom2d_TrimmedCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_TrimmedCurve_get_type_descriptor(), true );
  }

  public static  Geom2d_TrimmedCurve  DownCast( Standard_Transient  T) {
    return new Geom2d_TrimmedCurve ( OCCwrapJavaJNI.Geom2d_TrimmedCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_TrimmedCurve_TypeOf(), true );
  }

}
