package opencascade;

/**
 *  Describes an infinite cylindrical surface.
 *  A cylinder is defined by its radius and positioned in space
 *  with a coordinate system (a gp_Ax3 object), the "main
 *  Axis" of which is the axis of the cylinder. This coordinate
 *  system is the "local coordinate system" of the cylinder.
 *  Note: when a gp_Cylinder cylinder is converted into a
 *  Geom_CylindricalSurface cylinder, some implicit
 *  properties of its local coordinate system are used explicitly:
 *  -   its origin, "X Direction", "Y Direction" and "main
 *  Direction" are used directly to define the parametric
 *  directions on the cylinder and the origin of the parameters,
 *  -   its implicit orientation (right-handed or left-handed)
 *  gives an orientation (direct or indirect) to the
 *  Geom_CylindricalSurface cylinder.
 *  See Also
 *  gce_MakeCylinder which provides functions for more
 *  complex cylinder constructions
 *  Geom_CylindricalSurface which provides additional
 *  functions for constructing cylinders and works, in
 *  particular, with the parametric equations of cylinders gp_Ax3
 */
public class gp_Cylinder {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Cylinder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Cylinder(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Cylinder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Cylinder ptr) { Ptr = ptr; }
    public gp_Cylinder AsReference () { return Ptr; }
    public gp_Cylinder AsCopy () { return Ptr.MakeCopy(); }
    public gp_Cylinder Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Cylinder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a indefinite cylinder.
   */
  public gp_Cylinder() {
    this(OCCwrapJavaJNI.new_gp_Cylinder__SWIG_0(), true);
  }

  /**
   *  Creates a cylinder of radius Radius, whose axis is the "main
   *  Axis" of A3. A3 is the local coordinate system of the cylinder.   Raises ConstructionErrord if R < 0.0
   */
  public gp_Cylinder( gp_Ax3  A3, double Radius) {
    this(OCCwrapJavaJNI.new_gp_Cylinder__SWIG_1(gp_Ax3.getCPtr(A3), A3, Radius), true);
  }

  /**
   *  Changes the symmetry axis of the cylinder. Raises ConstructionError if the direction of A1 is parallel to the "XDirection"
   *  of the coordinate system of the cylinder.
   */
  public void SetAxis( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Cylinder_SetAxis(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Changes the location of the surface.
   */
  public void SetLocation( gp_Pnt  Loc) {
    OCCwrapJavaJNI.gp_Cylinder_SetLocation(swigCPtr, this, gp_Pnt.getCPtr(Loc), Loc);
  }

  /**
   *  Change the local coordinate system of the surface.
   */
  public void SetPosition( gp_Ax3  A3) {
    OCCwrapJavaJNI.gp_Cylinder_SetPosition(swigCPtr, this, gp_Ax3.getCPtr(A3), A3);
  }

  /**
   *  Modifies the radius of this cylinder.
   *  Exceptions
   *  Standard_ConstructionError if R is negative.
   */
  public void SetRadius(double R) {
    OCCwrapJavaJNI.gp_Cylinder_SetRadius(swigCPtr, this, R);
  }

  /**
   *  Reverses the   U   parametrization of   the cylinder
   *  reversing the YAxis.
   */
  public void UReverse() {
    OCCwrapJavaJNI.gp_Cylinder_UReverse(swigCPtr, this);
  }

  /**
   *  Reverses the   V   parametrization of   the  plane
   *  reversing the Axis.
   */
  public void VReverse() {
    OCCwrapJavaJNI.gp_Cylinder_VReverse(swigCPtr, this);
  }

  /**
   *  Returns true if the local coordinate system of this cylinder is right-handed.
   */
  public long Direct() {
    return OCCwrapJavaJNI.gp_Cylinder_Direct(swigCPtr, this);
  }

  /**
   *  Returns the symmetry axis of the cylinder.
   */
  public  gp_Ax1  Axis() {
    gp_Ax1 ret = new gp_Ax1(OCCwrapJavaJNI.gp_Cylinder_Axis(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Computes the coefficients of the implicit equation of the quadric
   *  in the absolute cartesian coordinate system :
   *  A1.X**2 + A2.Y**2 + A3.Z**2 + 2.(B1.X.Y + B2.X.Z + B3.Y.Z) +
   *  2.(C1.X + C2.Y + C3.Z) + D = 0.0
   */
  public void Coefficients(double[] A1, double[] A2, double[] A3, double[] B1, double[] B2, double[] B3, double[] C1, double[] C2, double[] C3, double[] D) {
    OCCwrapJavaJNI.gp_Cylinder_Coefficients(swigCPtr, this, A1, A2, A3, B1, B2, B3, C1, C2, C3, D);
  }

  /**
   *  Returns the "Location" point of the cylinder.
   */
  public  gp_Pnt  Location() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.gp_Cylinder_Location(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the local coordinate system of the cylinder.
   */
  public  gp_Ax3  Position() {
    gp_Ax3 ret = new gp_Ax3(OCCwrapJavaJNI.gp_Cylinder_Position(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the radius of the cylinder.
   */
  public double Radius() {
    return OCCwrapJavaJNI.gp_Cylinder_Radius(swigCPtr, this);
  }

  /**
   *  Returns the axis X of the cylinder.
   */
  public gp_Ax1 XAxis() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Cylinder_XAxis(swigCPtr, this), true);
  }

  /**
   *  Returns the axis Y of the cylinder.
   */
  public gp_Ax1 YAxis() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Cylinder_YAxis(swigCPtr, this), true);
  }

  public void Mirror( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Cylinder_Mirror__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of a cylinder
   *  with respect to the point P which is the center of the
   *  symmetry.
   */
  public gp_Cylinder Mirrored( gp_Pnt  P) {
    return new gp_Cylinder(OCCwrapJavaJNI.gp_Cylinder_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P), true);
  }

  public void Mirror( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Cylinder_Mirror__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Performs the symmetrical transformation of a cylinder with
   *  respect to an axis placement which is the axis of the
   *  symmetry.
   */
  public gp_Cylinder Mirrored( gp_Ax1  A1) {
    return new gp_Cylinder(OCCwrapJavaJNI.gp_Cylinder_Mirrored__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1), true);
  }

  public void Mirror( gp_Ax2  A2) {
    OCCwrapJavaJNI.gp_Cylinder_Mirror__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Performs the symmetrical transformation of a cylinder with respect
   *  to a plane. The axis placement A2 locates the plane of the
   *  of the symmetry : (Location, XDirection, YDirection).
   */
  public gp_Cylinder Mirrored( gp_Ax2  A2) {
    return new gp_Cylinder(OCCwrapJavaJNI.gp_Cylinder_Mirrored__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2), true);
  }

  public void Rotate( gp_Ax1  A1, double Ang) {
    OCCwrapJavaJNI.gp_Cylinder_Rotate(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang);
  }

  /**
   *  Rotates a cylinder. A1 is the axis of the rotation.
   *  Ang is the angular value of the rotation in radians.
   */
  public gp_Cylinder Rotated( gp_Ax1  A1, double Ang) {
    return new gp_Cylinder(OCCwrapJavaJNI.gp_Cylinder_Rotated(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang), true);
  }

  public void Scale( gp_Pnt  P, double S) {
    OCCwrapJavaJNI.gp_Cylinder_Scale(swigCPtr, this, gp_Pnt.getCPtr(P), P, S);
  }

  /**
   *  Scales a cylinder. S is the scaling value.
   *  The absolute value of S is used to scale the cylinder
   */
  public gp_Cylinder Scaled( gp_Pnt  P, double S) {
    return new gp_Cylinder(OCCwrapJavaJNI.gp_Cylinder_Scaled(swigCPtr, this, gp_Pnt.getCPtr(P), P, S), true);
  }

  public void Transform( gp_Trsf  T) {
    OCCwrapJavaJNI.gp_Cylinder_Transform(swigCPtr, this, gp_Trsf.getCPtr(T), T);
  }

  /**
   *  Transforms a cylinder with the transformation T from class Trsf.
   */
  public gp_Cylinder Transformed( gp_Trsf  T) {
    return new gp_Cylinder(OCCwrapJavaJNI.gp_Cylinder_Transformed(swigCPtr, this, gp_Trsf.getCPtr(T), T), true);
  }

  public void Translate( gp_Vec  V) {
    OCCwrapJavaJNI.gp_Cylinder_Translate__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V);
  }

  /**
   *  Translates a cylinder in the direction of the vector V.
   *  The magnitude of the translation is the vector's magnitude.
   */
  public gp_Cylinder Translated( gp_Vec  V) {
    return new gp_Cylinder(OCCwrapJavaJNI.gp_Cylinder_Translated__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V), true);
  }

  public void Translate( gp_Pnt  P1,  gp_Pnt  P2) {
    OCCwrapJavaJNI.gp_Cylinder_Translate__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Translates a cylinder from the point P1 to the point P2.
   */
  public gp_Cylinder Translated( gp_Pnt  P1,  gp_Pnt  P2) {
    return new gp_Cylinder(OCCwrapJavaJNI.gp_Cylinder_Translated__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

}
