package opencascade;

/**
 *  Describes an axis in 3D space.
 *  An axis is defined by:
 *  -   its origin (also referred to as its "Location point"), and
 *  -   its unit vector (referred to as its "Direction" or "main   Direction").
 *  An axis is used:
 *  -   to describe 3D geometric entities (for example, the
 *  axis of a revolution entity). It serves the same purpose
 *  as the STEP function "axis placement one axis", or
 *  -   to define geometric transformations (axis of
 *  symmetry, axis of rotation, and so on).
 *  For example, this entity can be used to locate a geometric entity
 *  or to define a symmetry axis.
 */
public class gp_Ax1 {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Ax1(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Ax1(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Ax1 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Ax1 ptr) { Ptr = ptr; }
    public gp_Ax1 AsReference () { return Ptr; }
    public gp_Ax1 AsCopy () { return Ptr.MakeCopy(); }
    public gp_Ax1 Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Ax1(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an axis object representing Z axis of
   *  the reference co-ordinate system.
   */
  public gp_Ax1() {
    this(OCCwrapJavaJNI.new_gp_Ax1__SWIG_0(), true);
  }

  /**
   *  P is the location point and V is the direction of <me>.
   */
  public gp_Ax1( gp_Pnt  P,  gp_Dir  V) {
    this(OCCwrapJavaJNI.new_gp_Ax1__SWIG_1(gp_Pnt.getCPtr(P), P, gp_Dir.getCPtr(V), V), true);
  }

  /**
   *  Assigns V as the "Direction"  of this axis.
   */
  public void SetDirection( gp_Dir  V) {
    OCCwrapJavaJNI.gp_Ax1_SetDirection(swigCPtr, this, gp_Dir.getCPtr(V), V);
  }

  /**
   *  Assigns  P as the origin of this axis.
   */
  public void SetLocation( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Ax1_SetLocation(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Returns the direction of <me>.
   */
  public  gp_Dir  Direction() {
    gp_Dir ret = new gp_Dir(OCCwrapJavaJNI.gp_Ax1_Direction(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the location point of <me>.
   */
  public  gp_Pnt  Location() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.gp_Ax1_Location(swigCPtr, this), true);
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
  public long IsCoaxial( gp_Ax1  Other, double AngularTolerance, double LinearTolerance) {
    return OCCwrapJavaJNI.gp_Ax1_IsCoaxial(swigCPtr, this, gp_Ax1.getCPtr(Other), Other, AngularTolerance, LinearTolerance);
  }

  /**
   *  Returns True if the direction of the <me> and <Other>
   *  are normal to each other.
   *  That is, if the angle between the two axes is equal to Pi/2.
   *  Note: the tolerance criterion is given by AngularTolerance..
   */
  public long IsNormal( gp_Ax1  Other, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Ax1_IsNormal(swigCPtr, this, gp_Ax1.getCPtr(Other), Other, AngularTolerance);
  }

  /**
   *  Returns True if the direction of <me> and <Other> are
   *  parallel with opposite orientation. That is, if the angle
   *  between the two axes is equal to Pi.
   *  Note: the tolerance criterion is given by AngularTolerance.
   */
  public long IsOpposite( gp_Ax1  Other, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Ax1_IsOpposite(swigCPtr, this, gp_Ax1.getCPtr(Other), Other, AngularTolerance);
  }

  /**
   *  Returns True if the direction of <me> and <Other> are
   *  parallel with same orientation or opposite orientation. That
   *  is, if the angle between the two axes is equal to 0 or Pi.
   *  Note: the tolerance criterion is given by
   *  AngularTolerance.
   */
  public long IsParallel( gp_Ax1  Other, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Ax1_IsParallel(swigCPtr, this, gp_Ax1.getCPtr(Other), Other, AngularTolerance);
  }

  /**
   *  Computes the angular value, in radians, between <me>.Direction() and
   *  <Other>.Direction(). Returns the angle between 0 and 2*PI
   *  radians.
   */
  public double Angle( gp_Ax1  Other) {
    return OCCwrapJavaJNI.gp_Ax1_Angle(swigCPtr, this, gp_Ax1.getCPtr(Other), Other);
  }

  /**
   *  Reverses the unit vector of this axis.
   *  and  assigns the result to this axis.
   */
  public void Reverse() {
    OCCwrapJavaJNI.gp_Ax1_Reverse(swigCPtr, this);
  }

  /**
   *  Reverses the unit vector of this axis and creates a new one.
   */
  public gp_Ax1 Reversed() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Ax1_Reversed(swigCPtr, this), true);
  }

  /**
   *  Performs the symmetrical transformation of an axis
   *  placement with respect to the point P which is the
   *  center of the symmetry and assigns the result to this axis.
   */
  public void Mirror( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Ax1_Mirror__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of an axis
   *  placement with respect to the point P which is the
   *  center of the symmetry and creates a new axis.
   */
  public gp_Ax1 Mirrored( gp_Pnt  P) {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Ax1_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P), true);
  }

  /**
   *  Performs the symmetrical transformation of an axis
   *  placement with respect to an axis placement which
   *  is the axis of the symmetry and assigns the result to this axis.
   */
  public void Mirror( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Ax1_Mirror__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Performs the symmetrical transformation of an axis
   *  placement with respect to an axis placement which
   *  is the axis of the symmetry and creates a new axis.
   */
  public gp_Ax1 Mirrored( gp_Ax1  A1) {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Ax1_Mirrored__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1), true);
  }

  /**
   *  Performs the symmetrical transformation of an axis
   *  placement with respect to a plane. The axis placement
   *  <A2> locates the plane of the symmetry :
   *  (Location, XDirection, YDirection) and assigns the result to this axis.
   */
  public void Mirror(gp_Ax2 A2) {
    OCCwrapJavaJNI.gp_Ax1_Mirror__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Performs the symmetrical transformation of an axis
   *  placement with respect to a plane. The axis placement
   *  <A2> locates the plane of the symmetry :
   *  (Location, XDirection, YDirection) and creates a new axis.
   */
  public gp_Ax1 Mirrored(gp_Ax2 A2) {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Ax1_Mirrored__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2), true);
  }

  /**
   *  Rotates this axis at an angle Ang (in radians) about the axis A1
   *  and assigns the result to this axis.
   */
  public void Rotate( gp_Ax1  A1, double Ang) {
    OCCwrapJavaJNI.gp_Ax1_Rotate(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang);
  }

  /**
   *  Rotates this axis at an angle Ang (in radians) about the axis A1
   *  and creates a new one.
   */
  public gp_Ax1 Rotated( gp_Ax1  A1, double Ang) {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Ax1_Rotated(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang), true);
  }

  /**
   *  Applies a scaling transformation to this axis with:
   *  -   scale factor S, and
   *  -   center P and assigns the result to this axis.
   */
  public void Scale( gp_Pnt  P, double S) {
    OCCwrapJavaJNI.gp_Ax1_Scale(swigCPtr, this, gp_Pnt.getCPtr(P), P, S);
  }

  /**
   *  Applies a scaling transformation to this axis with:
   *  -   scale factor S, and
   *  -   center P and creates a new axis.
   */
  public gp_Ax1 Scaled( gp_Pnt  P, double S) {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Ax1_Scaled(swigCPtr, this, gp_Pnt.getCPtr(P), P, S), true);
  }

  /**
   *  Applies the transformation T to this axis.
   *  and assigns the result to this axis.
   */
  public void Transform( gp_Trsf  T) {
    OCCwrapJavaJNI.gp_Ax1_Transform(swigCPtr, this, gp_Trsf.getCPtr(T), T);
  }

  /**
   *  Applies the transformation T to this axis and creates a new one.
   * 
   *  Translates an axis plaxement in the direction of the vector
   *  <V>. The magnitude of the translation is the vector's magnitude.
   */
  public gp_Ax1 Transformed( gp_Trsf  T) {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Ax1_Transformed(swigCPtr, this, gp_Trsf.getCPtr(T), T), true);
  }

  /**
   *  Translates this axis by the vector V,
   *  and assigns the result to this axis.
   */
  public void Translate( gp_Vec  V) {
    OCCwrapJavaJNI.gp_Ax1_Translate__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V);
  }

  /**
   *  Translates this axis by the vector V,
   *  and creates a new one.
   */
  public gp_Ax1 Translated( gp_Vec  V) {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Ax1_Translated__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V), true);
  }

  /**
   *  Translates this axis by:
   *  the vector (P1, P2) defined from point P1 to point P2.
   *  and assigns the result to this axis.
   */
  public void Translate( gp_Pnt  P1,  gp_Pnt  P2) {
    OCCwrapJavaJNI.gp_Ax1_Translate__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Translates this axis by:
   *  the vector (P1, P2) defined from point P1 to point P2.
   *  and creates a new one.
   */
  public gp_Ax1 Translated( gp_Pnt  P1,  gp_Pnt  P2) {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Ax1_Translated__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

}
