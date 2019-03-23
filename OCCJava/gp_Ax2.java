package opencascade;

/**
 *  Describes a right-handed coordinate system in 3D space.
 *  A coordinate system is defined by:
 *  -   its origin (also referred to as its "Location point"), and
 *  -   three orthogonal unit vectors, termed respectively the
 *  "X Direction", the "Y Direction" and the "Direction" (also
 *  referred to as the "main Direction").
 *  The "Direction" of the coordinate system is called its
 *  "main Direction" because whenever this unit vector is
 *  modified, the "X Direction" and the "Y Direction" are
 *  recomputed. However, when we modify either the "X
 *  Direction" or the "Y Direction", "Direction" is not modified.
 *  The "main Direction" is also the "Z Direction".
 *  Since an Ax2 coordinate system is right-handed, its
 *  "main Direction" is always equal to the cross product of
 *  its "X Direction" and "Y Direction". (To define a
 *  left-handed coordinate system, use gp_Ax3.)
 *  A coordinate system is used:
 *  -   to describe geometric entities, in particular to position
 *  them. The local coordinate system of a geometric
 *  entity serves the same purpose as the STEP function
 *  "axis placement two axes", or
 *  -   to define geometric transformations.
 *  Note: we refer to the "X Axis", "Y Axis" and "Z Axis",
 *  respectively, as to axes having:
 *  - the origin of the coordinate system as their origin, and
 *  -   the unit vectors "X Direction", "Y Direction" and "main
 *  Direction", respectively, as their unit vectors.
 *  The "Z Axis" is also the "main Axis".
 */
public class gp_Ax2 {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Ax2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Ax2(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Ax2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Ax2 ptr) { Ptr = ptr; }
    public gp_Ax2 AsReference () { return Ptr; }
    public gp_Ax2 AsCopy () { return Ptr.MakeCopy(); }
    public gp_Ax2 Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Ax2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an object corresponding to the reference
   *  coordinate system (OXYZ).
   */
  public gp_Ax2() {
    this(OCCwrapJavaJNI.new_gp_Ax2__SWIG_0(), true);
  }

  /**
   *  Creates an axis placement with an origin P such that:
   *  -   N is the Direction, and
   *  -   the "X Direction" is normal to N, in the plane
   *  defined by the vectors (N, Vx): "X
   *  Direction" = (N ^ Vx) ^ N,
   *  Exception: raises ConstructionError if N and Vx are parallel (same or opposite orientation).
   */
  public gp_Ax2( gp_Pnt  P,  gp_Dir  N,  gp_Dir  Vx) {
    this(OCCwrapJavaJNI.new_gp_Ax2__SWIG_1(gp_Pnt.getCPtr(P), P, gp_Dir.getCPtr(N), N, gp_Dir.getCPtr(Vx), Vx), true);
  }

  /**
   *  Creates -   a coordinate system with an origin P, where V
   *  gives the "main Direction" (here, "X Direction" and "Y
   *  Direction" are defined automatically).
   */
  public gp_Ax2( gp_Pnt  P,  gp_Dir  V) {
    this(OCCwrapJavaJNI.new_gp_Ax2__SWIG_2(gp_Pnt.getCPtr(P), P, gp_Dir.getCPtr(V), V), true);
  }

  /**
   *  Assigns the origin and "main Direction" of the axis A1 to
   *  this coordinate system, then recomputes its "X Direction" and "Y Direction".
   *  Note: The new "X Direction" is computed as follows:
   *  new "X Direction" = V1 ^(previous "X Direction" ^ V)
   *  where V is the "Direction" of A1.
   *  Exceptions
   *  Standard_ConstructionError if A1 is parallel to the "X
   *  Direction" of this coordinate system.
   */
  public void SetAxis( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Ax2_SetAxis(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Changes the "main Direction" of this coordinate system,
   *  then recomputes its "X Direction" and "Y Direction".
   *  Note: the new "X Direction" is computed as follows:
   *  new "X Direction" = V ^ (previous "X Direction" ^ V)
   *  Exceptions
   *  Standard_ConstructionError if V is parallel to the "X
   *  Direction" of this coordinate system.
   */
  public void SetDirection( gp_Dir  V) {
    OCCwrapJavaJNI.gp_Ax2_SetDirection(swigCPtr, this, gp_Dir.getCPtr(V), V);
  }

  /**
   *  Changes the "Location" point (origin) of <me>.
   */
  public void SetLocation( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Ax2_SetLocation(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Changes the "Xdirection" of <me>. The main direction
   *  "Direction" is not modified, the "Ydirection" is modified.
   *  If <Vx> is not normal to the main direction then <XDirection>
   *  is computed as follows XDirection = Direction ^ (Vx ^ Direction).
   *  Exceptions
   *  Standard_ConstructionError if Vx or Vy is parallel to
   *  the "main Direction" of this coordinate system.
   */
  public void SetXDirection( gp_Dir  Vx) {
    OCCwrapJavaJNI.gp_Ax2_SetXDirection(swigCPtr, this, gp_Dir.getCPtr(Vx), Vx);
  }

  /**
   *  Changes the "Ydirection" of <me>. The main direction is not
   *  modified but the "Xdirection" is changed.
   *  If <Vy> is not normal to the main direction then "YDirection"
   *  is computed as  follows
   *  YDirection = Direction ^ (<Vy> ^ Direction).
   *  Exceptions
   *  Standard_ConstructionError if Vx or Vy is parallel to
   *  the "main Direction" of this coordinate system.
   */
  public void SetYDirection( gp_Dir  Vy) {
    OCCwrapJavaJNI.gp_Ax2_SetYDirection(swigCPtr, this, gp_Dir.getCPtr(Vy), Vy);
  }

  /**
   *  Computes the angular value, in radians, between the main direction of
   *  <me> and the main direction of <Other>. Returns the angle
   *  between 0 and PI in radians.
   */
  public double Angle( gp_Ax2  Other) {
    return OCCwrapJavaJNI.gp_Ax2_Angle(swigCPtr, this, gp_Ax2.getCPtr(Other), Other);
  }

  /**
   *  Returns the main axis of <me>. It is the "Location" point
   *  and the main "Direction".
   */
  public  gp_Ax1  Axis() {
    gp_Ax1 ret = new gp_Ax1(OCCwrapJavaJNI.gp_Ax2_Axis(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the main direction of <me>.
   */
  public  gp_Dir  Direction() {
    gp_Dir ret = new gp_Dir(OCCwrapJavaJNI.gp_Ax2_Direction(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the "Location" point (origin) of <me>.
   */
  public  gp_Pnt  Location() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.gp_Ax2_Location(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the "XDirection" of <me>.
   */
  public  gp_Dir  XDirection() {
    gp_Dir ret = new gp_Dir(OCCwrapJavaJNI.gp_Ax2_XDirection(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the "YDirection" of <me>.
   */
  public  gp_Dir  YDirection() {
    gp_Dir ret = new gp_Dir(OCCwrapJavaJNI.gp_Ax2_YDirection(swigCPtr, this), true);
    return ret;
  }

  public long IsCoplanar( gp_Ax2  Other, double LinearTolerance, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Ax2_IsCoplanar__SWIG_0(swigCPtr, this, gp_Ax2.getCPtr(Other), Other, LinearTolerance, AngularTolerance);
  }

  /**
   *  Returns True if
   *  . the distance between <me> and the "Location" point of A1
   *  is lower of equal to LinearTolerance and
   *  . the main direction of <me> and the direction of A1 are normal.
   *  Note: the tolerance criterion for angular equality is given by AngularTolerance.
   */
  public long IsCoplanar( gp_Ax1  A1, double LinearTolerance, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Ax2_IsCoplanar__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, LinearTolerance, AngularTolerance);
  }

  /**
   *  Performs a symmetrical transformation of this coordinate
   *  system with respect to:
   *  -   the point P, and assigns the result to this coordinate system.
   *  Warning
   *  This transformation is always performed on the origin.
   *  In case of a reflection with respect to a point:
   *  - the main direction of the coordinate system is not changed, and
   *  - the "X Direction" and the "Y Direction" are simply reversed
   *  In case of a reflection with respect to an axis or a plane:
   *  -   the transformation is applied to the "X Direction"
   *  and the "Y Direction", then
   *  -   the "main Direction" is recomputed as the cross
   *  product "X Direction" ^ "Y   Direction".
   *  This maintains the right-handed property of the
   *  coordinate system.
   */
  public void Mirror( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Ax2_Mirror__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Performs a symmetrical transformation of this coordinate
   *  system with respect to:
   *  -   the point P, and creates a new one.
   *  Warning
   *  This transformation is always performed on the origin.
   *  In case of a reflection with respect to a point:
   *  - the main direction of the coordinate system is not changed, and
   *  - the "X Direction" and the "Y Direction" are simply reversed
   *  In case of a reflection with respect to an axis or a plane:
   *  -   the transformation is applied to the "X Direction"
   *  and the "Y Direction", then
   *  -   the "main Direction" is recomputed as the cross
   *  product "X Direction" ^ "Y   Direction".
   *  This maintains the right-handed property of the
   *  coordinate system.
   */
  public gp_Ax2 Mirrored( gp_Pnt  P) {
    return new gp_Ax2(OCCwrapJavaJNI.gp_Ax2_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P), true);
  }

  /**
   *  Performs a symmetrical transformation of this coordinate
   *  system with respect to:
   *  -   the axis A1, and assigns the result to this coordinate systeme.
   *  Warning
   *  This transformation is always performed on the origin.
   *  In case of a reflection with respect to a point:
   *  - the main direction of the coordinate system is not changed, and
   *  - the "X Direction" and the "Y Direction" are simply reversed
   *  In case of a reflection with respect to an axis or a plane:
   *  -   the transformation is applied to the "X Direction"
   *  and the "Y Direction", then
   *  -   the "main Direction" is recomputed as the cross
   *  product "X Direction" ^ "Y   Direction".
   *  This maintains the right-handed property of the
   *  coordinate system.
   */
  public void Mirror( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Ax2_Mirror__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Performs a symmetrical transformation of this coordinate
   *  system with respect to:
   *  -   the axis A1, and  creates a new one.
   *  Warning
   *  This transformation is always performed on the origin.
   *  In case of a reflection with respect to a point:
   *  - the main direction of the coordinate system is not changed, and
   *  - the "X Direction" and the "Y Direction" are simply reversed
   *  In case of a reflection with respect to an axis or a plane:
   *  -   the transformation is applied to the "X Direction"
   *  and the "Y Direction", then
   *  -   the "main Direction" is recomputed as the cross
   *  product "X Direction" ^ "Y   Direction".
   *  This maintains the right-handed property of the
   *  coordinate system.
   */
  public gp_Ax2 Mirrored( gp_Ax1  A1) {
    return new gp_Ax2(OCCwrapJavaJNI.gp_Ax2_Mirrored__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1), true);
  }

  /**
   *  Performs a symmetrical transformation of this coordinate
   *  system with respect to:
   *  -   the plane defined by the origin, "X Direction" and "Y
   *  Direction" of coordinate system A2 and  assigns the result to this coordinate systeme.
   *  Warning
   *  This transformation is always performed on the origin.
   *  In case of a reflection with respect to a point:
   *  - the main direction of the coordinate system is not changed, and
   *  - the "X Direction" and the "Y Direction" are simply reversed
   *  In case of a reflection with respect to an axis or a plane:
   *  -   the transformation is applied to the "X Direction"
   *  and the "Y Direction", then
   *  -   the "main Direction" is recomputed as the cross
   *  product "X Direction" ^ "Y   Direction".
   *  This maintains the right-handed property of the
   *  coordinate system.
   */
  public void Mirror( gp_Ax2  A2) {
    OCCwrapJavaJNI.gp_Ax2_Mirror__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Performs a symmetrical transformation of this coordinate
   *  system with respect to:
   *  -   the plane defined by the origin, "X Direction" and "Y
   *  Direction" of coordinate system A2 and creates a new one.
   *  Warning
   *  This transformation is always performed on the origin.
   *  In case of a reflection with respect to a point:
   *  - the main direction of the coordinate system is not changed, and
   *  - the "X Direction" and the "Y Direction" are simply reversed
   *  In case of a reflection with respect to an axis or a plane:
   *  -   the transformation is applied to the "X Direction"
   *  and the "Y Direction", then
   *  -   the "main Direction" is recomputed as the cross
   *  product "X Direction" ^ "Y   Direction".
   *  This maintains the right-handed property of the
   *  coordinate system.
   */
  public gp_Ax2 Mirrored( gp_Ax2  A2) {
    return new gp_Ax2(OCCwrapJavaJNI.gp_Ax2_Mirrored__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2), true);
  }

  public void Rotate( gp_Ax1  A1, double Ang) {
    OCCwrapJavaJNI.gp_Ax2_Rotate(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang);
  }

  /**
   *  Rotates an axis placement. <A1> is the axis of the
   *  rotation . Ang is the angular value of the rotation
   *  in radians.
   */
  public gp_Ax2 Rotated( gp_Ax1  A1, double Ang) {
    return new gp_Ax2(OCCwrapJavaJNI.gp_Ax2_Rotated(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang), true);
  }

  public void Scale( gp_Pnt  P, double S) {
    OCCwrapJavaJNI.gp_Ax2_Scale(swigCPtr, this, gp_Pnt.getCPtr(P), P, S);
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
  public gp_Ax2 Scaled( gp_Pnt  P, double S) {
    return new gp_Ax2(OCCwrapJavaJNI.gp_Ax2_Scaled(swigCPtr, this, gp_Pnt.getCPtr(P), P, S), true);
  }

  public void Transform( gp_Trsf  T) {
    OCCwrapJavaJNI.gp_Ax2_Transform(swigCPtr, this, gp_Trsf.getCPtr(T), T);
  }

  /**
   *  Transforms an axis placement with a Trsf.
   *  The "Location" point, the "XDirection" and the
   *  "YDirection" are transformed with T.  The resulting
   *  main "Direction" of <me> is the cross product between
   *  the "XDirection" and the "YDirection" after transformation.
   */
  public gp_Ax2 Transformed( gp_Trsf  T) {
    return new gp_Ax2(OCCwrapJavaJNI.gp_Ax2_Transformed(swigCPtr, this, gp_Trsf.getCPtr(T), T), true);
  }

  public void Translate( gp_Vec  V) {
    OCCwrapJavaJNI.gp_Ax2_Translate__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V);
  }

  /**
   *  Translates an axis plaxement in the direction of the vector
   *  <V>. The magnitude of the translation is the vector's magnitude.
   */
  public gp_Ax2 Translated( gp_Vec  V) {
    return new gp_Ax2(OCCwrapJavaJNI.gp_Ax2_Translated__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V), true);
  }

  public void Translate( gp_Pnt  P1,  gp_Pnt  P2) {
    OCCwrapJavaJNI.gp_Ax2_Translate__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Translates an axis placement from the point <P1> to the
   *  point <P2>.
   */
  public gp_Ax2 Translated( gp_Pnt  P1,  gp_Pnt  P2) {
    return new gp_Ax2(OCCwrapJavaJNI.gp_Ax2_Translated__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

}
