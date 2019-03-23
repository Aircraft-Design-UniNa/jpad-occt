package opencascade;

/**
 *  Defines an infinite conical surface.
 *  A cone is defined by its half-angle at the apex and
 *  positioned in space with a coordinate system (a gp_Ax3
 *  object) and a "reference radius" where:
 *  -   the "main Axis" of the coordinate system is the axis of   revolution of the cone,
 *  -   the plane defined by the origin, the "X Direction" and
 *  the "Y Direction" of the coordinate system is the
 *  reference plane of the cone; the intersection of the
 *  cone with this reference plane is a circle of radius
 *  equal to the reference radius,
 *  if the half-angle is positive, the apex of the cone is on
 *  the negative side of the "main Axis" of the coordinate
 *  system. If the half-angle is negative, the apex is on the   positive side.
 *  This coordinate system is the "local coordinate system" of the cone.
 *  Note: when a gp_Cone cone is converted into a
 *  Geom_ConicalSurface cone, some implicit properties of
 *  its local coordinate system are used explicitly:
 *  -   its origin, "X Direction", "Y Direction" and "main
 *  Direction" are used directly to define the parametric
 *  directions on the cone and the origin of the parameters,
 *  -   its implicit orientation (right-handed or left-handed)
 *  gives the orientation (direct or indirect) of the
 *  Geom_ConicalSurface cone.
 *  See Also
 *  gce_MakeCone which provides functions for more
 *  complex cone constructions
 *  Geom_ConicalSurface which provides additional
 *  functions for constructing cones and works, in particular,
 *  with the parametric equations of cones gp_Ax3
 */
public class gp_Cone {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Cone(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Cone(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Cone obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Cone ptr) { Ptr = ptr; }
    public gp_Cone AsReference () { return Ptr; }
    public gp_Cone AsCopy () { return Ptr.MakeCopy(); }
    public gp_Cone Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Cone(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an indefinite Cone.
   */
  public gp_Cone() {
    this(OCCwrapJavaJNI.new_gp_Cone__SWIG_0(), true);
  }

  /**
   *  Creates an infinite conical surface. A3 locates the cone
   *  in the space and defines the reference plane of the surface.
   *  Ang is the conical surface semi-angle between 0 and PI/2 radians.
   *  Radius is the radius of the circle in the reference plane of
   *  the cone.
   *  Raises ConstructionError
   *  . if Radius is lower than 0.0
   *  . Ang < Resolution from gp  or Ang >= (PI/2) - Resolution.
   */
  public gp_Cone( gp_Ax3  A3, double Ang, double Radius) {
    this(OCCwrapJavaJNI.new_gp_Cone__SWIG_1(gp_Ax3.getCPtr(A3), A3, Ang, Radius), true);
  }

  /**
   *  Changes the symmetry axis of the cone.  Raises ConstructionError
   *  the direction of A1 is parallel to the "XDirection"
   *  of the coordinate system of the cone.
   */
  public void SetAxis( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Cone_SetAxis(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Changes the location of the cone.
   */
  public void SetLocation( gp_Pnt  Loc) {
    OCCwrapJavaJNI.gp_Cone_SetLocation(swigCPtr, this, gp_Pnt.getCPtr(Loc), Loc);
  }

  /**
   *  Changes the local coordinate system of the cone.
   *  This coordinate system defines the reference plane of the cone.
   */
  public void SetPosition( gp_Ax3  A3) {
    OCCwrapJavaJNI.gp_Cone_SetPosition(swigCPtr, this, gp_Ax3.getCPtr(A3), A3);
  }

  /**
   *  Changes the radius of the cone in the reference plane of
   *  the cone.
   *  Raised if R < 0.0
   */
  public void SetRadius(double R) {
    OCCwrapJavaJNI.gp_Cone_SetRadius(swigCPtr, this, R);
  }

  /**
   *  Changes the semi-angle of the cone.
   *  Ang is the conical surface semi-angle  ]0,PI/2[.
   *  Raises ConstructionError if Ang < Resolution from gp or Ang >= PI/2 - Resolution
   */
  public void SetSemiAngle(double Ang) {
    OCCwrapJavaJNI.gp_Cone_SetSemiAngle(swigCPtr, this, Ang);
  }

  /**
   *  Computes the cone's top. The Apex of the cone is on the
   *  negative side of the symmetry axis of the cone.
   */
  public gp_Pnt Apex() {
    return new gp_Pnt(OCCwrapJavaJNI.gp_Cone_Apex(swigCPtr, this), true);
  }

  /**
   *  Reverses the   U   parametrization of   the  cone
   *  reversing the YAxis.
   */
  public void UReverse() {
    OCCwrapJavaJNI.gp_Cone_UReverse(swigCPtr, this);
  }

  /**
   *  Reverses the   V   parametrization of   the  cone  reversing the ZAxis.
   */
  public void VReverse() {
    OCCwrapJavaJNI.gp_Cone_VReverse(swigCPtr, this);
  }

  /**
   *  Returns true if the local coordinate system of this cone is right-handed.
   */
  public long Direct() {
    return OCCwrapJavaJNI.gp_Cone_Direct(swigCPtr, this);
  }

  /**
   *  returns the symmetry axis of the cone.
   */
  public  gp_Ax1  Axis() {
    gp_Ax1 ret = new gp_Ax1(OCCwrapJavaJNI.gp_Cone_Axis(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Computes the coefficients of the implicit equation of the quadric
   *  in the absolute cartesian coordinates system :
   *  A1.X**2 + A2.Y**2 + A3.Z**2 + 2.(B1.X.Y + B2.X.Z + B3.Y.Z) +
   *  2.(C1.X + C2.Y + C3.Z) + D = 0.0
   */
  public void Coefficients(double[] A1, double[] A2, double[] A3, double[] B1, double[] B2, double[] B3, double[] C1, double[] C2, double[] C3, double[] D) {
    OCCwrapJavaJNI.gp_Cone_Coefficients(swigCPtr, this, A1, A2, A3, B1, B2, B3, C1, C2, C3, D);
  }

  /**
   *  returns the "Location" point of the cone.
   */
  public  gp_Pnt  Location() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.gp_Cone_Location(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the local coordinates system of the cone.
   */
  public  gp_Ax3  Position() {
    gp_Ax3 ret = new gp_Ax3(OCCwrapJavaJNI.gp_Cone_Position(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the radius of the cone in the reference plane.
   */
  public double RefRadius() {
    return OCCwrapJavaJNI.gp_Cone_RefRadius(swigCPtr, this);
  }

  /**
   *  Returns the half-angle at the apex of this cone.
   */
  public double SemiAngle() {
    return OCCwrapJavaJNI.gp_Cone_SemiAngle(swigCPtr, this);
  }

  /**
   *  Returns the XAxis of the reference plane.
   */
  public gp_Ax1 XAxis() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Cone_XAxis(swigCPtr, this), true);
  }

  /**
   *  Returns the YAxis of the reference plane.
   */
  public gp_Ax1 YAxis() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Cone_YAxis(swigCPtr, this), true);
  }

  public void Mirror( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Cone_Mirror__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of a cone
   *  with respect to the point P which is the center of the
   *  symmetry.
   */
  public gp_Cone Mirrored( gp_Pnt  P) {
    return new gp_Cone(OCCwrapJavaJNI.gp_Cone_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P), true);
  }

  public void Mirror( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Cone_Mirror__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Performs the symmetrical transformation of a cone with
   *  respect to an axis placement which is the axis of the
   *  symmetry.
   */
  public gp_Cone Mirrored( gp_Ax1  A1) {
    return new gp_Cone(OCCwrapJavaJNI.gp_Cone_Mirrored__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1), true);
  }

  public void Mirror( gp_Ax2  A2) {
    OCCwrapJavaJNI.gp_Cone_Mirror__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Performs the symmetrical transformation of a cone with respect
   *  to a plane. The axis placement A2 locates the plane of the
   *  of the symmetry : (Location, XDirection, YDirection).
   */
  public gp_Cone Mirrored( gp_Ax2  A2) {
    return new gp_Cone(OCCwrapJavaJNI.gp_Cone_Mirrored__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2), true);
  }

  public void Rotate( gp_Ax1  A1, double Ang) {
    OCCwrapJavaJNI.gp_Cone_Rotate(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang);
  }

  /**
   *  Rotates a cone. A1 is the axis of the rotation.
   *  Ang is the angular value of the rotation in radians.
   */
  public gp_Cone Rotated( gp_Ax1  A1, double Ang) {
    return new gp_Cone(OCCwrapJavaJNI.gp_Cone_Rotated(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang), true);
  }

  public void Scale( gp_Pnt  P, double S) {
    OCCwrapJavaJNI.gp_Cone_Scale(swigCPtr, this, gp_Pnt.getCPtr(P), P, S);
  }

  /**
   *  Scales a cone. S is the scaling value.
   *  The absolute value of S is used to scale the cone
   */
  public gp_Cone Scaled( gp_Pnt  P, double S) {
    return new gp_Cone(OCCwrapJavaJNI.gp_Cone_Scaled(swigCPtr, this, gp_Pnt.getCPtr(P), P, S), true);
  }

  public void Transform( gp_Trsf  T) {
    OCCwrapJavaJNI.gp_Cone_Transform(swigCPtr, this, gp_Trsf.getCPtr(T), T);
  }

  /**
   *  Transforms a cone with the transformation T from class Trsf.
   */
  public gp_Cone Transformed( gp_Trsf  T) {
    return new gp_Cone(OCCwrapJavaJNI.gp_Cone_Transformed(swigCPtr, this, gp_Trsf.getCPtr(T), T), true);
  }

  public void Translate( gp_Vec  V) {
    OCCwrapJavaJNI.gp_Cone_Translate__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V);
  }

  /**
   *  Translates a cone in the direction of the vector V.
   *  The magnitude of the translation is the vector's magnitude.
   */
  public gp_Cone Translated( gp_Vec  V) {
    return new gp_Cone(OCCwrapJavaJNI.gp_Cone_Translated__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V), true);
  }

  public void Translate( gp_Pnt  P1,  gp_Pnt  P2) {
    OCCwrapJavaJNI.gp_Cone_Translate__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Translates a cone from the point P1 to the point P2.
   */
  public gp_Cone Translated( gp_Pnt  P1,  gp_Pnt  P2) {
    return new gp_Cone(OCCwrapJavaJNI.gp_Cone_Translated__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

}
