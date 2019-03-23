package opencascade;

/**
 *  Describes a coordinate system in 3D space. Unlike a
 *  gp_Ax2 coordinate system, a gp_Ax3 can be
 *  right-handed ("direct sense") or left-handed ("indirect sense").
 *  A coordinate system is defined by:
 *  -   its origin (also referred to as its "Location point"), and
 *  -   three orthogonal unit vectors, termed the "X
 *  Direction", the "Y Direction" and the "Direction" (also
 *  referred to as the "main Direction").
 *  The "Direction" of the coordinate system is called its
 *  "main Direction" because whenever this unit vector is
 *  modified, the "X Direction" and the "Y Direction" are
 *  recomputed. However, when we modify either the "X
 *  Direction" or the "Y Direction", "Direction" is not modified.
 *  "Direction" is also the "Z Direction".
 *  The "main Direction" is always parallel to the cross
 *  product of its "X Direction" and "Y Direction".
 *  If the coordinate system is right-handed, it satisfies the equation:
 *  "main Direction" = "X Direction" ^ "Y Direction"
 *  and if it is left-handed, it satisfies the equation:
 *  "main Direction" = -"X Direction" ^ "Y Direction"
 *  A coordinate system is used:
 *  -   to describe geometric entities, in particular to position
 *  them. The local coordinate system of a geometric
 *  entity serves the same purpose as the STEP function
 *  "axis placement three axes", or
 *  -   to define geometric transformations.
 *  Note:
 *  -   We refer to the "X Axis", "Y Axis" and "Z Axis",
 *  respectively, as the axes having:
 *  -   the origin of the coordinate system as their origin, and
 *  -   the unit vectors "X Direction", "Y Direction" and
 *  "main Direction", respectively, as their unit vectors.
 *  -   The "Z Axis" is also the "main Axis".
 *  -   gp_Ax2 is used to define a coordinate system that must be always right-handed.
 */
public class gp_Ax3 {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Ax3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Ax3(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Ax3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Ax3 ptr) { Ptr = ptr; }
    public gp_Ax3 AsReference () { return Ptr; }
    public gp_Ax3 AsCopy () { return Ptr.MakeCopy(); }
    public gp_Ax3 Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Ax3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an object corresponding to the reference
   *  coordinate system (OXYZ).
   */
  public gp_Ax3() {
    this(OCCwrapJavaJNI.new_gp_Ax3__SWIG_0(), true);
  }

  /**
   *  Creates  a  coordinate  system from a right-handed
   *  coordinate system.
   */
  public gp_Ax3( gp_Ax2  A) {
    this(OCCwrapJavaJNI.new_gp_Ax3__SWIG_1(gp_Ax2.getCPtr(A), A), true);
  }

  /**
   *  Creates a  right handed axis placement with the
   *  "Location"  point  P  and  two  directions, N    gives the
   *  "Direction" and Vx gives the "XDirection".
   *  Raises ConstructionError if N and Vx are parallel (same or opposite orientation).
   */
  public gp_Ax3( gp_Pnt  P,  gp_Dir  N,  gp_Dir  Vx) {
    this(OCCwrapJavaJNI.new_gp_Ax3__SWIG_2(gp_Pnt.getCPtr(P), P, gp_Dir.getCPtr(N), N, gp_Dir.getCPtr(Vx), Vx), true);
  }

  /**
   *  Creates an axis placement with the  "Location" point <P>
   *  and the normal direction <V>.
   */
  public gp_Ax3( gp_Pnt  P,  gp_Dir  V) {
    this(OCCwrapJavaJNI.new_gp_Ax3__SWIG_3(gp_Pnt.getCPtr(P), P, gp_Dir.getCPtr(V), V), true);
  }

  /**
   *  Reverses the X direction of <me>.
   */
  public void XReverse() {
    OCCwrapJavaJNI.gp_Ax3_XReverse(swigCPtr, this);
  }

  /**
   *  Reverses the Y direction of <me>.
   */
  public void YReverse() {
    OCCwrapJavaJNI.gp_Ax3_YReverse(swigCPtr, this);
  }

  /**
   *  Reverses the Z direction of <me>.
   */
  public void ZReverse() {
    OCCwrapJavaJNI.gp_Ax3_ZReverse(swigCPtr, this);
  }

  /**
   *  Assigns the origin and "main Direction" of the axis A1 to
   *  this coordinate system, then recomputes its "X Direction" and "Y Direction".
   *  Note:
   *  -   The new "X Direction" is computed as follows:
   *  new "X Direction" = V1 ^(previous "X Direction" ^ V)
   *  where V is the "Direction" of A1.
   *  -   The orientation of this coordinate system
   *  (right-handed or left-handed) is not modified.
   *  Raises ConstructionError  if the "Direction" of <A1> and the "XDirection" of <me>
   *  are parallel (same or opposite orientation) because it is
   *  impossible to calculate the new "XDirection" and the new
   *  "YDirection".
   */
  public void SetAxis( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Ax3_SetAxis(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Changes the main direction of this coordinate system,
   *  then recomputes its "X Direction" and "Y Direction".
   *  Note:
   *  -   The new "X Direction" is computed as follows:
   *  new "X Direction" = V ^ (previous "X Direction" ^ V).
   *  -   The orientation of this coordinate system (left- or right-handed) is not modified.
   *  Raises ConstructionError if <V< and the previous "XDirection" are parallel
   *  because it is impossible to calculate the new "XDirection"
   *  and the new "YDirection".
   */
  public void SetDirection( gp_Dir  V) {
    OCCwrapJavaJNI.gp_Ax3_SetDirection(swigCPtr, this, gp_Dir.getCPtr(V), V);
  }

  /**
   *  Changes the "Location" point (origin) of <me>.
   */
  public void SetLocation( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Ax3_SetLocation(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Changes the "Xdirection" of <me>. The main direction
   *  "Direction" is not modified, the "Ydirection" is modified.
   *  If <Vx> is not normal to the main direction then <XDirection>
   *  is computed as follows XDirection = Direction ^ (Vx ^ Direction).
   *  Raises ConstructionError if <Vx> is parallel (same or opposite
   *  orientation) to the main direction of <me>
   */
  public void SetXDirection( gp_Dir  Vx) {
    OCCwrapJavaJNI.gp_Ax3_SetXDirection(swigCPtr, this, gp_Dir.getCPtr(Vx), Vx);
  }

  /**
   *  Changes the "Ydirection" of <me>. The main direction is not
   *  modified but the "Xdirection" is changed.
   *  If <Vy> is not normal to the main direction then "YDirection"
   *  is computed as  follows
   *  YDirection = Direction ^ (<Vy> ^ Direction).
   *  Raises ConstructionError if <Vy> is parallel to the main direction of <me>
   */
  public void SetYDirection( gp_Dir  Vy) {
    OCCwrapJavaJNI.gp_Ax3_SetYDirection(swigCPtr, this, gp_Dir.getCPtr(Vy), Vy);
  }

  /**
   *  Computes the angular value between the main direction of
   *  <me> and the main direction of <Other>. Returns the angle
   *  between 0 and PI in radians.
   */
  public double Angle( gp_Ax3  Other) {
    return OCCwrapJavaJNI.gp_Ax3_Angle(swigCPtr, this, gp_Ax3.getCPtr(Other), Other);
  }

  /**
   *  Returns the main axis of <me>. It is the "Location" point
   *  and the main "Direction".
   */
  public  gp_Ax1  Axis() {
    gp_Ax1 ret = new gp_Ax1(OCCwrapJavaJNI.gp_Ax3_Axis(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Computes a right-handed coordinate system with the
   *  same "X Direction" and "Y Direction" as those of this
   *  coordinate system, then recomputes the "main Direction".
   *  If this coordinate system is right-handed, the result
   *  returned is the same coordinate system. If this
   *  coordinate system is left-handed, the result is reversed.
   */
  public gp_Ax2 Ax2() {
    return new gp_Ax2(OCCwrapJavaJNI.gp_Ax3_Ax2(swigCPtr, this), true);
  }

  /**
   *  Returns the main direction of <me>.
   */
  public  gp_Dir  Direction() {
    gp_Dir ret = new gp_Dir(OCCwrapJavaJNI.gp_Ax3_Direction(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the "Location" point (origin) of <me>.
   */
  public  gp_Pnt  Location() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.gp_Ax3_Location(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the "XDirection" of <me>.
   */
  public  gp_Dir  XDirection() {
    gp_Dir ret = new gp_Dir(OCCwrapJavaJNI.gp_Ax3_XDirection(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the "YDirection" of <me>.
   */
  public  gp_Dir  YDirection() {
    gp_Dir ret = new gp_Dir(OCCwrapJavaJNI.gp_Ax3_YDirection(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns  True if  the  coordinate  system is right-handed. i.e.
   *  XDirection().Crossed(YDirection()).Dot(Direction()) > 0
   */
  public long Direct() {
    return OCCwrapJavaJNI.gp_Ax3_Direct(swigCPtr, this);
  }

  /**
   *  Returns True if
   *  . the distance between the "Location" point of <me> and
   *  <Other> is lower or equal to LinearTolerance and
   *  . the distance between the "Location" point of <Other> and
   *  <me> is lower or equal to LinearTolerance and
   *  . the main direction of <me> and the main direction of
   *  <Other> are parallel (same or opposite orientation).
   */
  public long IsCoplanar( gp_Ax3  Other, double LinearTolerance, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Ax3_IsCoplanar__SWIG_0(swigCPtr, this, gp_Ax3.getCPtr(Other), Other, LinearTolerance, AngularTolerance);
  }

  /**
   *  Returns True if
   *  . the distance between <me> and the "Location" point of A1
   *  is lower of equal to LinearTolerance and
   *  . the distance between A1 and the "Location" point of <me>
   *  is lower or equal to LinearTolerance and
   *  . the main direction of <me> and the direction of A1 are normal.
   */
  public long IsCoplanar( gp_Ax1  A1, double LinearTolerance, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Ax3_IsCoplanar__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, LinearTolerance, AngularTolerance);
  }

  public void Mirror( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Ax3_Mirror__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of an axis
   *  placement with respect to the point P which is the
   *  center of the symmetry.
   *  Warnings :
   *  The main direction of the axis placement is not changed.
   *  The "XDirection" and the "YDirection" are reversed.
   *  So the axis placement stay right handed.
   */
  public gp_Ax3 Mirrored( gp_Pnt  P) {
    return new gp_Ax3(OCCwrapJavaJNI.gp_Ax3_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P), true);
  }

  public void Mirror( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Ax3_Mirror__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Performs the symmetrical transformation of an axis
   *  placement with respect to an axis placement which
   *  is the axis of the symmetry.
   *  The transformation is performed on the "Location"
   *  point, on the "XDirection" and "YDirection".
   *  The resulting main "Direction" is the cross product between
   *  the "XDirection" and the "YDirection" after transformation.
   */
  public gp_Ax3 Mirrored( gp_Ax1  A1) {
    return new gp_Ax3(OCCwrapJavaJNI.gp_Ax3_Mirrored__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1), true);
  }

  public void Mirror( gp_Ax2  A2) {
    OCCwrapJavaJNI.gp_Ax3_Mirror__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Performs the symmetrical transformation of an axis
   *  placement with respect to a plane.
   *  The axis placement  <A2> locates the plane of the symmetry :
   *  (Location, XDirection, YDirection).
   *  The transformation is performed on the "Location"
   *  point, on the "XDirection" and "YDirection".
   *  The resulting main "Direction" is the cross product between
   *  the "XDirection" and the "YDirection" after transformation.
   */
  public gp_Ax3 Mirrored( gp_Ax2  A2) {
    return new gp_Ax3(OCCwrapJavaJNI.gp_Ax3_Mirrored__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2), true);
  }

  public void Rotate( gp_Ax1  A1, double Ang) {
    OCCwrapJavaJNI.gp_Ax3_Rotate(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang);
  }

  /**
   *  Rotates an axis placement. <A1> is the axis of the
   *  rotation . Ang is the angular value of the rotation
   *  in radians.
   */
  public gp_Ax3 Rotated( gp_Ax1  A1, double Ang) {
    return new gp_Ax3(OCCwrapJavaJNI.gp_Ax3_Rotated(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang), true);
  }

  public void Scale( gp_Pnt  P, double S) {
    OCCwrapJavaJNI.gp_Ax3_Scale(swigCPtr, this, gp_Pnt.getCPtr(P), P, S);
  }

  /**
   *  Applies a scaling transformation on the axis placement.
   *  The "Location" point of the axisplacement is modified.
   *  Warnings :
   *  If the scale <S> is negative :
   *  . the main direction of the axis placement is not changed.
   *  . The "XDirection" and the "YDirection" are reversed.
   *  So the axis placement stay right handed.
   */
  public gp_Ax3 Scaled( gp_Pnt  P, double S) {
    return new gp_Ax3(OCCwrapJavaJNI.gp_Ax3_Scaled(swigCPtr, this, gp_Pnt.getCPtr(P), P, S), true);
  }

  public void Transform( gp_Trsf  T) {
    OCCwrapJavaJNI.gp_Ax3_Transform(swigCPtr, this, gp_Trsf.getCPtr(T), T);
  }

  /**
   *  Transforms an axis placement with a Trsf.
   *  The "Location" point, the "XDirection" and the
   *  "YDirection" are transformed with T.  The resulting
   *  main "Direction" of <me> is the cross product between
   *  the "XDirection" and the "YDirection" after transformation.
   */
  public gp_Ax3 Transformed( gp_Trsf  T) {
    return new gp_Ax3(OCCwrapJavaJNI.gp_Ax3_Transformed(swigCPtr, this, gp_Trsf.getCPtr(T), T), true);
  }

  public void Translate( gp_Vec  V) {
    OCCwrapJavaJNI.gp_Ax3_Translate__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V);
  }

  /**
   *  Translates an axis plaxement in the direction of the vector
   *  <V>. The magnitude of the translation is the vector's magnitude.
   */
  public gp_Ax3 Translated( gp_Vec  V) {
    return new gp_Ax3(OCCwrapJavaJNI.gp_Ax3_Translated__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V), true);
  }

  public void Translate( gp_Pnt  P1,  gp_Pnt  P2) {
    OCCwrapJavaJNI.gp_Ax3_Translate__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Translates an axis placement from the point <P1> to the
   *  point <P2>.
   */
  public gp_Ax3 Translated( gp_Pnt  P1,  gp_Pnt  P2) {
    return new gp_Ax3(OCCwrapJavaJNI.gp_Ax3_Translated__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

}
