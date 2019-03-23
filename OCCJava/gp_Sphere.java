package opencascade;

/**
 *  Describes a sphere.
 *  A sphere is defined by its radius and positioned in space
 *  with a coordinate system (a gp_Ax3 object). The origin of
 *  the coordinate system is the center of the sphere. This
 *  coordinate system is the "local coordinate system" of the sphere.
 *  Note: when a gp_Sphere sphere is converted into a
 *  Geom_SphericalSurface sphere, some implicit
 *  properties of its local coordinate system are used explicitly:
 *  -   its origin, "X Direction", "Y Direction" and "main
 *  Direction" are used directly to define the parametric
 *  directions on the sphere and the origin of the parameters,
 *  -   its implicit orientation (right-handed or left-handed)
 *  gives the orientation (direct, indirect) to the
 *  Geom_SphericalSurface sphere.
 *  See Also
 *  gce_MakeSphere which provides functions for more
 *  complex sphere constructions
 *  Geom_SphericalSurface which provides additional
 *  functions for constructing spheres and works, in
 *  particular, with the parametric equations of spheres.
 */
public class gp_Sphere {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Sphere(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Sphere(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Sphere obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Sphere ptr) { Ptr = ptr; }
    public gp_Sphere AsReference () { return Ptr; }
    public gp_Sphere AsCopy () { return Ptr.MakeCopy(); }
    public gp_Sphere Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Sphere(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an indefinite sphere.
   */
  public gp_Sphere() {
    this(OCCwrapJavaJNI.new_gp_Sphere__SWIG_0(), true);
  }

  /**
   *  Constructs a sphere with radius Radius, centered on the origin
   *  of A3.  A3 is the local coordinate system of the sphere.
   *  Warnings :
   *  It is not forbidden to create a sphere with null radius.
   *  Raises ConstructionError if Radius < 0.0
   */
  public gp_Sphere( gp_Ax3  A3, double Radius) {
    this(OCCwrapJavaJNI.new_gp_Sphere__SWIG_1(gp_Ax3.getCPtr(A3), A3, Radius), true);
  }

  /**
   *  Changes the center of the sphere.
   */
  public void SetLocation( gp_Pnt  Loc) {
    OCCwrapJavaJNI.gp_Sphere_SetLocation(swigCPtr, this, gp_Pnt.getCPtr(Loc), Loc);
  }

  /**
   *  Changes the local coordinate system of the sphere.
   */
  public void SetPosition( gp_Ax3  A3) {
    OCCwrapJavaJNI.gp_Sphere_SetPosition(swigCPtr, this, gp_Ax3.getCPtr(A3), A3);
  }

  /**
   *  Assigns R the radius of the Sphere.
   *  Warnings :
   *  It is not forbidden to create a sphere with null radius.
   *  Raises ConstructionError if R < 0.0
   */
  public void SetRadius(double R) {
    OCCwrapJavaJNI.gp_Sphere_SetRadius(swigCPtr, this, R);
  }

  /**
   *  Computes the aera of the sphere.
   */
  public double Area() {
    return OCCwrapJavaJNI.gp_Sphere_Area(swigCPtr, this);
  }

  /**
   *  Computes the coefficients of the implicit equation of the quadric
   *  in the absolute cartesian coordinates system :
   *  A1.X**2 + A2.Y**2 + A3.Z**2 + 2.(B1.X.Y + B2.X.Z + B3.Y.Z) +
   *  2.(C1.X + C2.Y + C3.Z) + D = 0.0
   */
  public void Coefficients(double[] A1, double[] A2, double[] A3, double[] B1, double[] B2, double[] B3, double[] C1, double[] C2, double[] C3, double[] D) {
    OCCwrapJavaJNI.gp_Sphere_Coefficients(swigCPtr, this, A1, A2, A3, B1, B2, B3, C1, C2, C3, D);
  }

  /**
   *  Reverses the   U   parametrization of   the sphere
   *  reversing the YAxis.
   */
  public void UReverse() {
    OCCwrapJavaJNI.gp_Sphere_UReverse(swigCPtr, this);
  }

  /**
   *  Reverses the   V   parametrization of   the  sphere
   *  reversing the ZAxis.
   */
  public void VReverse() {
    OCCwrapJavaJNI.gp_Sphere_VReverse(swigCPtr, this);
  }

  /**
   *  Returns true if the local coordinate system of this sphere
   *  is right-handed.
   */
  public long Direct() {
    return OCCwrapJavaJNI.gp_Sphere_Direct(swigCPtr, this);
  }

  /**
   *  --- Purpose ;
   *  Returns the center of the sphere.
   */
  public  gp_Pnt  Location() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.gp_Sphere_Location(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the local coordinates system of the sphere.
   */
  public  gp_Ax3  Position() {
    gp_Ax3 ret = new gp_Ax3(OCCwrapJavaJNI.gp_Sphere_Position(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the radius of the sphere.
   */
  public double Radius() {
    return OCCwrapJavaJNI.gp_Sphere_Radius(swigCPtr, this);
  }

  /**
   *  Computes the volume of the sphere
   */
  public double Volume() {
    return OCCwrapJavaJNI.gp_Sphere_Volume(swigCPtr, this);
  }

  /**
   *  Returns the axis X of the sphere.
   */
  public gp_Ax1 XAxis() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Sphere_XAxis(swigCPtr, this), true);
  }

  /**
   *  Returns the axis Y of the sphere.
   */
  public gp_Ax1 YAxis() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Sphere_YAxis(swigCPtr, this), true);
  }

  public void Mirror( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Sphere_Mirror__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of a sphere
   *  with respect to the point P which is the center of the
   *  symmetry.
   */
  public gp_Sphere Mirrored( gp_Pnt  P) {
    return new gp_Sphere(OCCwrapJavaJNI.gp_Sphere_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P), true);
  }

  public void Mirror( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Sphere_Mirror__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Performs the symmetrical transformation of a sphere with
   *  respect to an axis placement which is the axis of the
   *  symmetry.
   */
  public gp_Sphere Mirrored( gp_Ax1  A1) {
    return new gp_Sphere(OCCwrapJavaJNI.gp_Sphere_Mirrored__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1), true);
  }

  public void Mirror( gp_Ax2  A2) {
    OCCwrapJavaJNI.gp_Sphere_Mirror__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Performs the symmetrical transformation of a sphere with respect
   *  to a plane. The axis placement A2 locates the plane of the
   *  of the symmetry : (Location, XDirection, YDirection).
   */
  public gp_Sphere Mirrored( gp_Ax2  A2) {
    return new gp_Sphere(OCCwrapJavaJNI.gp_Sphere_Mirrored__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2), true);
  }

  public void Rotate( gp_Ax1  A1, double Ang) {
    OCCwrapJavaJNI.gp_Sphere_Rotate(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang);
  }

  /**
   *  Rotates a sphere. A1 is the axis of the rotation.
   *  Ang is the angular value of the rotation in radians.
   */
  public gp_Sphere Rotated( gp_Ax1  A1, double Ang) {
    return new gp_Sphere(OCCwrapJavaJNI.gp_Sphere_Rotated(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang), true);
  }

  public void Scale( gp_Pnt  P, double S) {
    OCCwrapJavaJNI.gp_Sphere_Scale(swigCPtr, this, gp_Pnt.getCPtr(P), P, S);
  }

  /**
   *  Scales a sphere. S is the scaling value.
   *  The absolute value of S is used to scale the sphere
   */
  public gp_Sphere Scaled( gp_Pnt  P, double S) {
    return new gp_Sphere(OCCwrapJavaJNI.gp_Sphere_Scaled(swigCPtr, this, gp_Pnt.getCPtr(P), P, S), true);
  }

  public void Transform( gp_Trsf  T) {
    OCCwrapJavaJNI.gp_Sphere_Transform(swigCPtr, this, gp_Trsf.getCPtr(T), T);
  }

  /**
   *  Transforms a sphere with the transformation T from class Trsf.
   */
  public gp_Sphere Transformed( gp_Trsf  T) {
    return new gp_Sphere(OCCwrapJavaJNI.gp_Sphere_Transformed(swigCPtr, this, gp_Trsf.getCPtr(T), T), true);
  }

  public void Translate( gp_Vec  V) {
    OCCwrapJavaJNI.gp_Sphere_Translate__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V);
  }

  /**
   *  Translates a sphere in the direction of the vector V.
   *  The magnitude of the translation is the vector's magnitude.
   */
  public gp_Sphere Translated( gp_Vec  V) {
    return new gp_Sphere(OCCwrapJavaJNI.gp_Sphere_Translated__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V), true);
  }

  public void Translate( gp_Pnt  P1,  gp_Pnt  P2) {
    OCCwrapJavaJNI.gp_Sphere_Translate__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Translates a sphere from the point P1 to the point P2.
   */
  public gp_Sphere Translated( gp_Pnt  P1,  gp_Pnt  P2) {
    return new gp_Sphere(OCCwrapJavaJNI.gp_Sphere_Translated__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

}
