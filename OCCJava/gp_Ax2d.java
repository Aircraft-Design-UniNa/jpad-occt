package opencascade;

/**
 *  Describes an axis in the plane (2D space).
 *  An axis is defined by:
 *  -   its origin (also referred to as its "Location point"),   and
 *  -   its unit vector (referred to as its "Direction").
 *  An axis implicitly defines a direct, right-handed
 *  coordinate system in 2D space by:
 *  -   its origin,
 *  - its "Direction" (giving the "X Direction" of the coordinate system), and
 *  -   the unit vector normal to "Direction" (positive angle
 *  measured in the trigonometric sense).
 *  An axis is used:
 *  -   to describe 2D geometric entities (for example, the
 *  axis which defines angular coordinates on a circle).
 *  It serves for the same purpose as the STEP function
 *  "axis placement one axis", or
 *  -   to define geometric transformations (axis of
 *  symmetry, axis of rotation, and so on).
 *  Note: to define a left-handed 2D coordinate system, use gp_Ax22d.
 */
public class gp_Ax2d {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Ax2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Ax2d(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Ax2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Ax2d ptr) { Ptr = ptr; }
    public gp_Ax2d AsReference () { return Ptr; }
    public gp_Ax2d AsCopy () { return Ptr.MakeCopy(); }
    public gp_Ax2d Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Ax2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an axis object representing X axis of
   *  the reference co-ordinate system.
   */
  public gp_Ax2d() {
    this(OCCwrapJavaJNI.new_gp_Ax2d__SWIG_0(), true);
  }

  /**
   *  Creates an Ax2d. <P> is the "Location" point of
   *  the axis placement and V is the "Direction" of
   *  the axis placement.
   */
  public gp_Ax2d( gp_Pnt2d  P,  gp_Dir2d  V) {
    this(OCCwrapJavaJNI.new_gp_Ax2d__SWIG_1(gp_Pnt2d.getCPtr(P), P, gp_Dir2d.getCPtr(V), V), true);
  }

  /**
   *  Changes the "Location" point (origin) of <me>.
   */
  public void SetLocation( gp_Pnt2d  Locat) {
    OCCwrapJavaJNI.gp_Ax2d_SetLocation(swigCPtr, this, gp_Pnt2d.getCPtr(Locat), Locat);
  }

  /**
   *  Changes the direction of <me>.
   */
  public void SetDirection( gp_Dir2d  V) {
    OCCwrapJavaJNI.gp_Ax2d_SetDirection(swigCPtr, this, gp_Dir2d.getCPtr(V), V);
  }

  /**
   *  Returns the origin of <me>.
   */
  public  gp_Pnt2d  Location() {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.gp_Ax2d_Location(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the direction of <me>.
   */
  public  gp_Dir2d  Direction() {
    gp_Dir2d ret = new gp_Dir2d(OCCwrapJavaJNI.gp_Ax2d_Direction(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns True if  :
   *  . the angle between <me> and <Other> is lower or equal
   *  to <AngularTolerance> and
   *  . the distance between <me>.Location() and <Other> is lower
   *  or equal to <LinearTolerance> and
   *  . the distance between <Other>.Location() and <me> is lower
   *  or equal to LinearTolerance.
   */
  public long IsCoaxial( gp_Ax2d  Other, double AngularTolerance, double LinearTolerance) {
    return OCCwrapJavaJNI.gp_Ax2d_IsCoaxial(swigCPtr, this, gp_Ax2d.getCPtr(Other), Other, AngularTolerance, LinearTolerance);
  }

  /**
   *  Returns true if this axis and the axis Other are normal to
   *  each other. That is, if the angle between the two axes is equal to Pi/2 or -Pi/2.
   *  Note: the tolerance criterion is given by AngularTolerance.
   */
  public long IsNormal( gp_Ax2d  Other, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Ax2d_IsNormal(swigCPtr, this, gp_Ax2d.getCPtr(Other), Other, AngularTolerance);
  }

  /**
   *  Returns true if this axis and the axis Other are parallel,
   *  and have opposite orientations. That is, if the angle
   *  between the two axes is equal to Pi or -Pi.
   *  Note: the tolerance criterion is given by AngularTolerance.
   */
  public long IsOpposite( gp_Ax2d  Other, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Ax2d_IsOpposite(swigCPtr, this, gp_Ax2d.getCPtr(Other), Other, AngularTolerance);
  }

  /**
   *  Returns true if this axis and the axis Other are parallel,
   *  and have either the same or opposite orientations. That
   *  is, if the angle between the two axes is equal to 0, Pi or -Pi.
   *  Note: the tolerance criterion is given by AngularTolerance.
   */
  public long IsParallel( gp_Ax2d  Other, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Ax2d_IsParallel(swigCPtr, this, gp_Ax2d.getCPtr(Other), Other, AngularTolerance);
  }

  /**
   *  Computes the angle, in radians, between this axis and
   *  the axis Other. The value of the angle is between -Pi and Pi.
   */
  public double Angle( gp_Ax2d  Other) {
    return OCCwrapJavaJNI.gp_Ax2d_Angle(swigCPtr, this, gp_Ax2d.getCPtr(Other), Other);
  }

  /**
   *  Reverses the direction of <me> and assigns the result to this axis.
   */
  public void Reverse() {
    OCCwrapJavaJNI.gp_Ax2d_Reverse(swigCPtr, this);
  }

  /**
   *  Computes a new axis placement with a direction opposite to
   *  the direction of <me>.
   */
  public gp_Ax2d Reversed() {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Ax2d_Reversed(swigCPtr, this), true);
  }

  public void Mirror( gp_Pnt2d  P) {
    OCCwrapJavaJNI.gp_Ax2d_Mirror__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of an axis
   *  placement with respect to the point P which is the
   *  center of the symmetry.
   */
  public gp_Ax2d Mirrored( gp_Pnt2d  P) {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Ax2d_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P), true);
  }

  public void Mirror( gp_Ax2d  A) {
    OCCwrapJavaJNI.gp_Ax2d_Mirror__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  Performs the symmetrical transformation of an axis
   *  placement with respect to an axis placement which
   *  is the axis of the symmetry.
   */
  public gp_Ax2d Mirrored( gp_Ax2d  A) {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Ax2d_Mirrored__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A), true);
  }

  public void Rotate( gp_Pnt2d  P, double Ang) {
    OCCwrapJavaJNI.gp_Ax2d_Rotate(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, Ang);
  }

  /**
   *  Rotates an axis placement. <P> is the center of the
   *  rotation . Ang is the angular value of the rotation
   *  in radians.
   */
  public gp_Ax2d Rotated( gp_Pnt2d  P, double Ang) {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Ax2d_Rotated(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, Ang), true);
  }

  public void Scale( gp_Pnt2d  P, double S) {
    OCCwrapJavaJNI.gp_Ax2d_Scale(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, S);
  }

  /**
   *  Applies a scaling transformation on the axis placement.
   *  The "Location" point of the axisplacement is modified.
   *  The "Direction" is reversed if the scale is negative.
   */
  public gp_Ax2d Scaled( gp_Pnt2d  P, double S) {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Ax2d_Scaled(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, S), true);
  }

  public void Transform( gp_Trsf2d  T) {
    OCCwrapJavaJNI.gp_Ax2d_Transform(swigCPtr, this, gp_Trsf2d.getCPtr(T), T);
  }

  /**
   *  Transforms an axis placement with a Trsf.
   */
  public gp_Ax2d Transformed( gp_Trsf2d  T) {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Ax2d_Transformed(swigCPtr, this, gp_Trsf2d.getCPtr(T), T), true);
  }

  public void Translate( gp_Vec2d  V) {
    OCCwrapJavaJNI.gp_Ax2d_Translate__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V);
  }

  /**
   *  Translates an axis placement in the direction of the vector
   *  <V>. The magnitude of the translation is the vector's magnitude.
   */
  public gp_Ax2d Translated( gp_Vec2d  V) {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Ax2d_Translated__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V), true);
  }

  public void Translate( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    OCCwrapJavaJNI.gp_Ax2d_Translate__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2);
  }

  /**
   *  Translates an axis placement from the point <P1> to the
   *  point <P2>.
   */
  public gp_Ax2d Translated( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Ax2d_Translated__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2), true);
  }

}
