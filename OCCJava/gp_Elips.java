package opencascade;

/**
 *  Describes an ellipse in 3D space.
 *  An ellipse is defined by its major and minor radii and
 *  positioned in space with a coordinate system (a gp_Ax2 object) as follows:
 *  -   the origin of the coordinate system is the center of the ellipse,
 *  -   its "X Direction" defines the major axis of the ellipse, and
 *  - its "Y Direction" defines the minor axis of the ellipse.
 *  Together, the origin, "X Direction" and "Y Direction" of
 *  this coordinate system define the plane of the ellipse.
 *  This coordinate system is the "local coordinate system"
 *  of the ellipse. In this coordinate system, the equation of
 *  the ellipse is:
 *  X*X / (MajorRadius**2) + Y*Y / (MinorRadius**2) = 1.0
 *  The "main Direction" of the local coordinate system gives
 *  the normal vector to the plane of the ellipse. This vector
 *  gives an implicit orientation to the ellipse (definition of the
 *  trigonometric sense). We refer to the "main Axis" of the
 *  local coordinate system as the "Axis" of the ellipse.
 *  See Also
 *  gce_MakeElips which provides functions for more
 *  complex ellipse constructions
 *  Geom_Ellipse which provides additional functions for
 *  constructing ellipses and works, in particular, with the
 *  parametric equations of ellipses
 */
public class gp_Elips {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Elips(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Elips(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Elips obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Elips ptr) { Ptr = ptr; }
    public gp_Elips AsReference () { return Ptr; }
    public gp_Elips AsCopy () { return Ptr.MakeCopy(); }
    public gp_Elips Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Elips(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an indefinite ellipse.
   */
  public gp_Elips() {
    this(OCCwrapJavaJNI.new_gp_Elips__SWIG_0(), true);
  }

  /**
   *  The major radius of the ellipse is on the "XAxis" and the
   *  minor radius is on the "YAxis" of the ellipse. The "XAxis"
   *  is defined with the "XDirection" of A2 and the "YAxis" is
   *  defined with the "YDirection" of A2.
   *  Warnings :
   *  It is not forbidden to create an ellipse with MajorRadius =
   *  MinorRadius.
   *  Raises ConstructionError if MajorRadius < MinorRadius or MinorRadius < 0.
   */
  public gp_Elips( gp_Ax2  A2, double MajorRadius, double MinorRadius) {
    this(OCCwrapJavaJNI.new_gp_Elips__SWIG_1(gp_Ax2.getCPtr(A2), A2, MajorRadius, MinorRadius), true);
  }

  /**
   *  Changes the axis normal to the plane of the ellipse.
   *  It modifies the definition of this plane.
   *  The "XAxis" and the "YAxis" are recomputed.
   *  The local coordinate system is redefined so that:
   *  -   its origin and "main Direction" become those of the
   *  axis A1 (the "X Direction" and "Y Direction" are then
   *  recomputed in the same way as for any gp_Ax2), or
   *  Raises ConstructionError if the direction of A1
   *  is parallel to the direction of the "XAxis" of the ellipse.
   */
  public void SetAxis( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Elips_SetAxis(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Modifies this ellipse, by redefining its local coordinate
   *  so that its origin becomes P.
   */
  public void SetLocation( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Elips_SetLocation(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  The major radius of the ellipse is on the "XAxis" (major axis)
   *  of the ellipse.
   *  Raises ConstructionError if MajorRadius < MinorRadius.
   */
  public void SetMajorRadius(double MajorRadius) {
    OCCwrapJavaJNI.gp_Elips_SetMajorRadius(swigCPtr, this, MajorRadius);
  }

  /**
   *  The minor radius of the ellipse is on the "YAxis" (minor axis)
   *  of the ellipse.
   *  Raises ConstructionError if MinorRadius > MajorRadius or MinorRadius < 0.
   */
  public void SetMinorRadius(double MinorRadius) {
    OCCwrapJavaJNI.gp_Elips_SetMinorRadius(swigCPtr, this, MinorRadius);
  }

  /**
   *  Modifies this ellipse, by redefining its local coordinate
   *  so that it becomes A2e.
   */
  public void SetPosition( gp_Ax2  A2) {
    OCCwrapJavaJNI.gp_Elips_SetPosition(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Computes the area of the Ellipse.
   */
  public double Area() {
    return OCCwrapJavaJNI.gp_Elips_Area(swigCPtr, this);
  }

  /**
   *  Computes the axis normal to the plane of the ellipse.
   */
  public  gp_Ax1  Axis() {
    gp_Ax1 ret = new gp_Ax1(OCCwrapJavaJNI.gp_Elips_Axis(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Computes the first or second directrix of this ellipse.
   *  These are the lines, in the plane of the ellipse, normal to
   *  the major axis, at a distance equal to
   *  MajorRadius/e from the center of the ellipse, where
   *  e is the eccentricity of the ellipse.
   *  The first directrix (Directrix1) is on the positive side of
   *  the major axis. The second directrix (Directrix2) is on
   *  the negative side.
   *  The directrix is returned as an axis (gp_Ax1 object), the
   *  origin of which is situated on the "X Axis" of the local
   *  coordinate system of this ellipse.
   *  Exceptions
   *  Standard_ConstructionError if the eccentricity is null
   *  (the ellipse has degenerated into a circle).
   */
  public gp_Ax1 Directrix1() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Elips_Directrix1(swigCPtr, this), true);
  }

  /**
   *  This line is obtained by the symmetrical transformation
   *  of "Directrix1" with respect to the "YAxis" of the ellipse.
   *  Exceptions
   *  Standard_ConstructionError if the eccentricity is null
   *  (the ellipse has degenerated into a circle).
   */
  public gp_Ax1 Directrix2() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Elips_Directrix2(swigCPtr, this), true);
  }

  /**
   *  Returns the eccentricity of the ellipse  between 0.0 and 1.0
   *  If f is the distance between the center of the ellipse and
   *  the Focus1 then the eccentricity e = f / MajorRadius.
   *  Raises ConstructionError if MajorRadius = 0.0
   */
  public double Eccentricity() {
    return OCCwrapJavaJNI.gp_Elips_Eccentricity(swigCPtr, this);
  }

  /**
   *  Computes the focal distance. It is the distance between the
   *  two focus focus1 and focus2 of the ellipse.
   */
  public double Focal() {
    return OCCwrapJavaJNI.gp_Elips_Focal(swigCPtr, this);
  }

  /**
   *  Returns the first focus of the ellipse. This focus is on the
   *  positive side of the "XAxis" of the ellipse.
   */
  public gp_Pnt Focus1() {
    return new gp_Pnt(OCCwrapJavaJNI.gp_Elips_Focus1(swigCPtr, this), true);
  }

  /**
   *  Returns the second focus of the ellipse. This focus is on the
   *  negative side of the "XAxis" of the ellipse.
   */
  public gp_Pnt Focus2() {
    return new gp_Pnt(OCCwrapJavaJNI.gp_Elips_Focus2(swigCPtr, this), true);
  }

  /**
   *  Returns the center of the ellipse. It is the "Location"
   *  point of the coordinate system of the ellipse.
   */
  public  gp_Pnt  Location() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.gp_Elips_Location(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the major radius of the ellipse.
   */
  public double MajorRadius() {
    return OCCwrapJavaJNI.gp_Elips_MajorRadius(swigCPtr, this);
  }

  /**
   *  Returns the minor radius of the ellipse.
   */
  public double MinorRadius() {
    return OCCwrapJavaJNI.gp_Elips_MinorRadius(swigCPtr, this);
  }

  /**
   *  Returns p = (1 - e * e) * MajorRadius where e is the eccentricity
   *  of the ellipse.
   *  Returns 0 if MajorRadius = 0
   */
  public double Parameter() {
    return OCCwrapJavaJNI.gp_Elips_Parameter(swigCPtr, this);
  }

  /**
   *  Returns the coordinate system of the ellipse.
   */
  public  gp_Ax2  Position() {
    gp_Ax2 ret = new gp_Ax2(OCCwrapJavaJNI.gp_Elips_Position(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the "XAxis" of the ellipse whose origin
   *  is the center of this ellipse. It is the major axis of the
   *  ellipse.
   */
  public gp_Ax1 XAxis() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Elips_XAxis(swigCPtr, this), true);
  }

  /**
   *  Returns the "YAxis" of the ellipse whose unit vector is the "X Direction" or the "Y Direction"
   *  of the local coordinate system of this ellipse.
   *  This is the minor axis of the ellipse.
   */
  public gp_Ax1 YAxis() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Elips_YAxis(swigCPtr, this), true);
  }

  public void Mirror( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Elips_Mirror__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of an ellipse with
   *  respect to the point P which is the center of the symmetry.
   */
  public gp_Elips Mirrored( gp_Pnt  P) {
    return new gp_Elips(OCCwrapJavaJNI.gp_Elips_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P), true);
  }

  public void Mirror( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Elips_Mirror__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Performs the symmetrical transformation of an ellipse with
   *  respect to an axis placement which is the axis of the symmetry.
   */
  public gp_Elips Mirrored( gp_Ax1  A1) {
    return new gp_Elips(OCCwrapJavaJNI.gp_Elips_Mirrored__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1), true);
  }

  public void Mirror( gp_Ax2  A2) {
    OCCwrapJavaJNI.gp_Elips_Mirror__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Performs the symmetrical transformation of an ellipse with
   *  respect to a plane. The axis placement A2 locates the plane
   *  of the symmetry (Location, XDirection, YDirection).
   */
  public gp_Elips Mirrored( gp_Ax2  A2) {
    return new gp_Elips(OCCwrapJavaJNI.gp_Elips_Mirrored__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2), true);
  }

  public void Rotate( gp_Ax1  A1, double Ang) {
    OCCwrapJavaJNI.gp_Elips_Rotate(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang);
  }

  /**
   *  Rotates an ellipse. A1 is the axis of the rotation.
   *  Ang is the angular value of the rotation in radians.
   */
  public gp_Elips Rotated( gp_Ax1  A1, double Ang) {
    return new gp_Elips(OCCwrapJavaJNI.gp_Elips_Rotated(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang), true);
  }

  public void Scale( gp_Pnt  P, double S) {
    OCCwrapJavaJNI.gp_Elips_Scale(swigCPtr, this, gp_Pnt.getCPtr(P), P, S);
  }

  /**
   *  Scales an ellipse. S is the scaling value.
   */
  public gp_Elips Scaled( gp_Pnt  P, double S) {
    return new gp_Elips(OCCwrapJavaJNI.gp_Elips_Scaled(swigCPtr, this, gp_Pnt.getCPtr(P), P, S), true);
  }

  public void Transform( gp_Trsf  T) {
    OCCwrapJavaJNI.gp_Elips_Transform(swigCPtr, this, gp_Trsf.getCPtr(T), T);
  }

  /**
   *  Transforms an ellipse with the transformation T from class Trsf.
   */
  public gp_Elips Transformed( gp_Trsf  T) {
    return new gp_Elips(OCCwrapJavaJNI.gp_Elips_Transformed(swigCPtr, this, gp_Trsf.getCPtr(T), T), true);
  }

  public void Translate( gp_Vec  V) {
    OCCwrapJavaJNI.gp_Elips_Translate__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V);
  }

  /**
   *  Translates an ellipse in the direction of the vector V.
   *  The magnitude of the translation is the vector's magnitude.
   */
  public gp_Elips Translated( gp_Vec  V) {
    return new gp_Elips(OCCwrapJavaJNI.gp_Elips_Translated__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V), true);
  }

  public void Translate( gp_Pnt  P1,  gp_Pnt  P2) {
    OCCwrapJavaJNI.gp_Elips_Translate__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Translates an ellipse from the point P1 to the point P2.
   */
  public gp_Elips Translated( gp_Pnt  P1,  gp_Pnt  P2) {
    return new gp_Elips(OCCwrapJavaJNI.gp_Elips_Translated__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

}
