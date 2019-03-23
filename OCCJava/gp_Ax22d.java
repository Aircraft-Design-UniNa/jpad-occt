package opencascade;

/**
 *  Describes a coordinate system in a plane (2D space).
 *  A coordinate system is defined by:
 *  -   its origin (also referred to as its "Location point"), and
 *  -   two orthogonal unit vectors, respectively, called the "X
 *  Direction" and the "Y Direction".
 *  A gp_Ax22d may be right-handed ("direct sense") or
 *  left-handed ("inverse" or "indirect sense").
 *  You use a gp_Ax22d to:
 *  - describe 2D geometric entities, in particular to position
 *  them. The local coordinate system of a geometric
 *  entity serves for the same purpose as the STEP
 *  function "axis placement two axes", or
 *  -   define geometric transformations.
 *  Note: we refer to the "X Axis" and "Y Axis" as the axes having:
 *  -   the origin of the coordinate system as their origin, and
 *  -   the unit vectors "X Direction" and "Y Direction",
 *  respectively, as their unit vectors.
 */
public class gp_Ax22d {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Ax22d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Ax22d(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Ax22d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Ax22d ptr) { Ptr = ptr; }
    public gp_Ax22d AsReference () { return Ptr; }
    public gp_Ax22d AsCopy () { return Ptr.MakeCopy(); }
    public gp_Ax22d Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Ax22d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an object representing the reference
   *  co-ordinate system (OXY).
   */
  public gp_Ax22d() {
    this(OCCwrapJavaJNI.new_gp_Ax22d__SWIG_0(), true);
  }

  /**
   *  Creates a coordinate system with origin P and where:
   *  -   Vx is the "X Direction", and
   *  -   the "Y Direction" is orthogonal to Vx and
   *  oriented so that the cross products Vx^"Y
   *  Direction" and Vx^Vy have the same sign.
   *  Raises ConstructionError if Vx and Vy are parallel (same or opposite orientation).
   */
  public gp_Ax22d( gp_Pnt2d  P,  gp_Dir2d  Vx,  gp_Dir2d  Vy) {
    this(OCCwrapJavaJNI.new_gp_Ax22d__SWIG_1(gp_Pnt2d.getCPtr(P), P, gp_Dir2d.getCPtr(Vx), Vx, gp_Dir2d.getCPtr(Vy), Vy), true);
  }

  /**
   *  Creates -   a coordinate system with origin P and "X Direction"
   *  V, which is:
   *  -   right-handed if Sense is true (default value), or
   *  -   left-handed if Sense is false
   */
  public gp_Ax22d( gp_Pnt2d  P,  gp_Dir2d  V, long Sense) {
    this(OCCwrapJavaJNI.new_gp_Ax22d__SWIG_2(gp_Pnt2d.getCPtr(P), P, gp_Dir2d.getCPtr(V), V, Sense), true);
  }

  /**
   *  Creates -   a coordinate system where its origin is the origin of
   *  A and its "X Direction" is the unit vector of A, which   is:
   *  -   right-handed if Sense is true (default value), or
   *  -   left-handed if Sense is false.
   */
  public gp_Ax22d( gp_Pnt2d  P,  gp_Dir2d  V) {
    this(OCCwrapJavaJNI.new_gp_Ax22d__SWIG_3(gp_Pnt2d.getCPtr(P), P, gp_Dir2d.getCPtr(V), V), true);
  }

  public gp_Ax22d( gp_Ax2d  A, long Sense) {
    this(OCCwrapJavaJNI.new_gp_Ax22d__SWIG_4(gp_Ax2d.getCPtr(A), A, Sense), true);
  }

  public gp_Ax22d( gp_Ax2d  A) {
    this(OCCwrapJavaJNI.new_gp_Ax22d__SWIG_5(gp_Ax2d.getCPtr(A), A), true);
  }

  /**
   *  Assigns the origin and the two unit vectors of the
   *  coordinate system A1 to this coordinate system.
   */
  public void SetAxis( gp_Ax22d  A1) {
    OCCwrapJavaJNI.gp_Ax22d_SetAxis(swigCPtr, this, gp_Ax22d.getCPtr(A1), A1);
  }

  /**
   *  Changes the XAxis and YAxis ("Location" point and "Direction")
   *  of <me>.
   *  The "YDirection" is recomputed in the same sense as before.
   */
  public void SetXAxis( gp_Ax2d  A1) {
    OCCwrapJavaJNI.gp_Ax22d_SetXAxis(swigCPtr, this, gp_Ax2d.getCPtr(A1), A1);
  }

  /**
   *  Changes the XAxis and YAxis ("Location" point and "Direction") of <me>.
   *  The "XDirection" is recomputed in the same sense as before.
   */
  public void SetYAxis( gp_Ax2d  A1) {
    OCCwrapJavaJNI.gp_Ax22d_SetYAxis(swigCPtr, this, gp_Ax2d.getCPtr(A1), A1);
  }

  /**
   *  Changes the "Location" point (origin) of <me>.
   */
  public void SetLocation( gp_Pnt2d  P) {
    OCCwrapJavaJNI.gp_Ax22d_SetLocation(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Assigns Vx to the "X Direction"  of
   *  this coordinate system. The other unit vector of this
   *  coordinate system is recomputed, normal to Vx ,
   *  without modifying the orientation (right-handed or
   *  left-handed) of this coordinate system.
   */
  public void SetXDirection( gp_Dir2d  Vx) {
    OCCwrapJavaJNI.gp_Ax22d_SetXDirection(swigCPtr, this, gp_Dir2d.getCPtr(Vx), Vx);
  }

  /**
   *  Assignsr Vy to the  "Y Direction" of
   *  this coordinate system. The other unit vector of this
   *  coordinate system is recomputed, normal to Vy,
   *  without modifying the orientation (right-handed or
   *  left-handed) of this coordinate system.
   */
  public void SetYDirection( gp_Dir2d  Vy) {
    OCCwrapJavaJNI.gp_Ax22d_SetYDirection(swigCPtr, this, gp_Dir2d.getCPtr(Vy), Vy);
  }

  /**
   *  Returns an axis, for which
   *  -   the origin is that of this coordinate system, and
   *  -   the unit vector is either the "X Direction"  of this coordinate system.
   *  Note: the result is the "X Axis" of this coordinate system.
   */
  public gp_Ax2d XAxis() {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Ax22d_XAxis(swigCPtr, this), true);
  }

  /**
   *  Returns an axis, for which
   *  -   the origin is that of this coordinate system, and
   *  - the unit vector is either the  "Y Direction" of this coordinate system.
   *  Note: the result is the "Y Axis" of this coordinate system.
   */
  public gp_Ax2d YAxis() {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Ax22d_YAxis(swigCPtr, this), true);
  }

  /**
   *  Returns the "Location" point (origin) of <me>.
   */
  public  gp_Pnt2d  Location() {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.gp_Ax22d_Location(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the "XDirection" of <me>.
   */
  public  gp_Dir2d  XDirection() {
    gp_Dir2d ret = new gp_Dir2d(OCCwrapJavaJNI.gp_Ax22d_XDirection(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the "YDirection" of <me>.
   */
  public  gp_Dir2d  YDirection() {
    gp_Dir2d ret = new gp_Dir2d(OCCwrapJavaJNI.gp_Ax22d_YDirection(swigCPtr, this), true);
    return ret;
  }

  public void Mirror( gp_Pnt2d  P) {
    OCCwrapJavaJNI.gp_Ax22d_Mirror__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
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
  public gp_Ax22d Mirrored( gp_Pnt2d  P) {
    return new gp_Ax22d(OCCwrapJavaJNI.gp_Ax22d_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P), true);
  }

  public void Mirror( gp_Ax2d  A) {
    OCCwrapJavaJNI.gp_Ax22d_Mirror__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
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
  public gp_Ax22d Mirrored( gp_Ax2d  A) {
    return new gp_Ax22d(OCCwrapJavaJNI.gp_Ax22d_Mirrored__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A), true);
  }

  public void Rotate( gp_Pnt2d  P, double Ang) {
    OCCwrapJavaJNI.gp_Ax22d_Rotate(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, Ang);
  }

  /**
   *  Rotates an axis placement. <A1> is the axis of the
   *  rotation . Ang is the angular value of the rotation
   *  in radians.
   */
  public gp_Ax22d Rotated( gp_Pnt2d  P, double Ang) {
    return new gp_Ax22d(OCCwrapJavaJNI.gp_Ax22d_Rotated(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, Ang), true);
  }

  public void Scale( gp_Pnt2d  P, double S) {
    OCCwrapJavaJNI.gp_Ax22d_Scale(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, S);
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
  public gp_Ax22d Scaled( gp_Pnt2d  P, double S) {
    return new gp_Ax22d(OCCwrapJavaJNI.gp_Ax22d_Scaled(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, S), true);
  }

  public void Transform( gp_Trsf2d  T) {
    OCCwrapJavaJNI.gp_Ax22d_Transform(swigCPtr, this, gp_Trsf2d.getCPtr(T), T);
  }

  /**
   *  Transforms an axis placement with a Trsf.
   *  The "Location" point, the "XDirection" and the
   *  "YDirection" are transformed with T.  The resulting
   *  main "Direction" of <me> is the cross product between
   *  the "XDirection" and the "YDirection" after transformation.
   */
  public gp_Ax22d Transformed( gp_Trsf2d  T) {
    return new gp_Ax22d(OCCwrapJavaJNI.gp_Ax22d_Transformed(swigCPtr, this, gp_Trsf2d.getCPtr(T), T), true);
  }

  public void Translate( gp_Vec2d  V) {
    OCCwrapJavaJNI.gp_Ax22d_Translate__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V);
  }

  /**
   *  Translates an axis plaxement in the direction of the vector
   *  <V>. The magnitude of the translation is the vector's magnitude.
   */
  public gp_Ax22d Translated( gp_Vec2d  V) {
    return new gp_Ax22d(OCCwrapJavaJNI.gp_Ax22d_Translated__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V), true);
  }

  public void Translate( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    OCCwrapJavaJNI.gp_Ax22d_Translate__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2);
  }

  /**
   *  Translates an axis placement from the point <P1> to the
   *  point <P2>.
   */
  public gp_Ax22d Translated( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    return new gp_Ax22d(OCCwrapJavaJNI.gp_Ax22d_Translated__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2), true);
  }

}
