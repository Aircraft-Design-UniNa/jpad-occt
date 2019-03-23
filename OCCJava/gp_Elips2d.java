package opencascade;

/**
 *  Describes an ellipse in the plane (2D space).
 *  An ellipse is defined by its major and minor radii and
 *  positioned in the plane with a coordinate system (a
 *  gp_Ax22d object) as follows:
 *  -   the origin of the coordinate system is the center of the ellipse,
 *  -   its "X Direction" defines the major axis of the ellipse, and
 *  -   its "Y Direction" defines the minor axis of the ellipse.
 *  This coordinate system is the "local coordinate system"
 *  of the ellipse. Its orientation (direct or indirect) gives an
 *  implicit orientation to the ellipse. In this coordinate
 *  system, the equation of the ellipse is:
 *  X*X / (MajorRadius**2) + Y*Y / (MinorRadius**2) = 1.0
 *  See Also
 *  gce_MakeElips2d which provides functions for more
 *  complex ellipse constructions
 *  Geom2d_Ellipse which provides additional functions for
 *  constructing ellipses and works, in particular, with the
 *  parametric equations of ellipses
 */
public class gp_Elips2d {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Elips2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Elips2d(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Elips2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Elips2d ptr) { Ptr = ptr; }
    public gp_Elips2d AsReference () { return Ptr; }
    public gp_Elips2d AsCopy () { return Ptr.MakeCopy(); }
    public gp_Elips2d Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Elips2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an indefinite ellipse.
   */
  public gp_Elips2d() {
    this(OCCwrapJavaJNI.new_gp_Elips2d__SWIG_0(), true);
  }

  /**
   *  Creates an ellipse with the major axis, the major and the
   *  minor radius. The location of the MajorAxis is the center
   *  of the  ellipse.
   *  The sense of parametrization is given by Sense.
   *  Warnings :
   *  It is possible to create an ellipse with
   *  MajorRadius = MinorRadius.
   *  Raises ConstructionError if MajorRadius < MinorRadius or MinorRadius < 0.0
   */
  public gp_Elips2d( gp_Ax2d  MajorAxis, double MajorRadius, double MinorRadius, long Sense) {
    this(OCCwrapJavaJNI.new_gp_Elips2d__SWIG_1(gp_Ax2d.getCPtr(MajorAxis), MajorAxis, MajorRadius, MinorRadius, Sense), true);
  }

  /**
   *  Creates an ellipse with radii MajorRadius and
   *  MinorRadius, positioned in the plane by coordinate system A where:
   *  -   the origin of A is the center of the ellipse,
   *  -   the "X Direction" of A defines the major axis of
   *  the ellipse, that is, the major radius MajorRadius
   *  is measured along this axis, and
   *  -   the "Y Direction" of A defines the minor axis of
   *  the ellipse, that is, the minor radius MinorRadius
   *  is measured along this axis, and
   *  -   the orientation (direct or indirect sense) of A
   *  gives the orientation of the ellipse.
   *  Warnings :
   *  It is possible to create an ellipse with
   *  MajorRadius = MinorRadius.
   *  Raises ConstructionError if MajorRadius < MinorRadius or MinorRadius < 0.0
   */
  public gp_Elips2d( gp_Ax2d  MajorAxis, double MajorRadius, double MinorRadius) {
    this(OCCwrapJavaJNI.new_gp_Elips2d__SWIG_2(gp_Ax2d.getCPtr(MajorAxis), MajorAxis, MajorRadius, MinorRadius), true);
  }

  public gp_Elips2d( gp_Ax22d  A, double MajorRadius, double MinorRadius) {
    this(OCCwrapJavaJNI.new_gp_Elips2d__SWIG_3(gp_Ax22d.getCPtr(A), A, MajorRadius, MinorRadius), true);
  }

  /**
   *  Modifies this ellipse, by redefining its local coordinate system so that
   *  -   its origin becomes P.
   */
  public void SetLocation( gp_Pnt2d  P) {
    OCCwrapJavaJNI.gp_Elips2d_SetLocation(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Changes the value of the major radius.
   *  Raises ConstructionError if MajorRadius < MinorRadius.
   */
  public void SetMajorRadius(double MajorRadius) {
    OCCwrapJavaJNI.gp_Elips2d_SetMajorRadius(swigCPtr, this, MajorRadius);
  }

  /**
   *  Changes the value of the minor radius.
   *  Raises ConstructionError if MajorRadius < MinorRadius or MinorRadius < 0.0
   */
  public void SetMinorRadius(double MinorRadius) {
    OCCwrapJavaJNI.gp_Elips2d_SetMinorRadius(swigCPtr, this, MinorRadius);
  }

  /**
   *  Modifies this ellipse, by redefining its local coordinate system so that
   *  it becomes A.
   */
  public void SetAxis( gp_Ax22d  A) {
    OCCwrapJavaJNI.gp_Elips2d_SetAxis(swigCPtr, this, gp_Ax22d.getCPtr(A), A);
  }

  /**
   *  Modifies this ellipse, by redefining its local coordinate system so that
   *  its origin and its "X Direction"  become those
   *  of the axis A. The "Y  Direction"  is then
   *  recomputed. The orientation of the local coordinate
   *  system is not modified.
   */
  public void SetXAxis( gp_Ax2d  A) {
    OCCwrapJavaJNI.gp_Elips2d_SetXAxis(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  Modifies this ellipse, by redefining its local coordinate system so that
   *  its origin and its "Y Direction"  become those
   *  of the axis A. The "X  Direction"  is then
   *  recomputed. The orientation of the local coordinate
   *  system is not modified.
   */
  public void SetYAxis( gp_Ax2d  A) {
    OCCwrapJavaJNI.gp_Elips2d_SetYAxis(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  Computes the area of the ellipse.
   */
  public double Area() {
    return OCCwrapJavaJNI.gp_Elips2d_Area(swigCPtr, this);
  }

  /**
   *  Returns the coefficients of the implicit equation of the ellipse.
   *  A * (X**2) + B * (Y**2) + 2*C*(X*Y) + 2*D*X + 2*E*Y + F = 0.
   */
  public void Coefficients(double[] A, double[] B, double[] C, double[] D, double[] E, double[] F) {
    OCCwrapJavaJNI.gp_Elips2d_Coefficients(swigCPtr, this, A, B, C, D, E, F);
  }

  /**
   *  This directrix is the line normal to the XAxis of the ellipse
   *  in the local plane (Z = 0) at a distance d = MajorRadius / e
   *  from the center of the ellipse, where e is the eccentricity of
   *  the ellipse.
   *  This line is parallel to the "YAxis". The intersection point
   *  between directrix1 and the "XAxis" is the location point of the
   *  directrix1. This point is on the positive side of the "XAxis".
   * 
   *  Raised if Eccentricity = 0.0. (The ellipse degenerates into a
   *  circle)
   */
  public gp_Ax2d Directrix1() {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Elips2d_Directrix1(swigCPtr, this), true);
  }

  /**
   *  This line is obtained by the symmetrical transformation
   *  of "Directrix1" with respect to the minor axis of the ellipse.
   * 
   *  Raised if Eccentricity = 0.0. (The ellipse degenerates into a
   *  circle).
   */
  public gp_Ax2d Directrix2() {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Elips2d_Directrix2(swigCPtr, this), true);
  }

  /**
   *  Returns the eccentricity of the ellipse  between 0.0 and 1.0
   *  If f is the distance between the center of the ellipse and
   *  the Focus1 then the eccentricity e = f / MajorRadius.
   *  Returns 0 if MajorRadius = 0.
   */
  public double Eccentricity() {
    return OCCwrapJavaJNI.gp_Elips2d_Eccentricity(swigCPtr, this);
  }

  /**
   *  Returns the distance between the center of the ellipse
   *  and focus1 or focus2.
   */
  public double Focal() {
    return OCCwrapJavaJNI.gp_Elips2d_Focal(swigCPtr, this);
  }

  /**
   *  Returns the first focus of the ellipse. This focus is on the
   *  positive side of the major axis of the ellipse.
   */
  public gp_Pnt2d Focus1() {
    return new gp_Pnt2d(OCCwrapJavaJNI.gp_Elips2d_Focus1(swigCPtr, this), true);
  }

  /**
   *  Returns the second focus of the ellipse. This focus is on the
   *  negative side of the major axis of the ellipse.
   */
  public gp_Pnt2d Focus2() {
    return new gp_Pnt2d(OCCwrapJavaJNI.gp_Elips2d_Focus2(swigCPtr, this), true);
  }

  /**
   *  Returns the center of the ellipse.
   */
  public  gp_Pnt2d  Location() {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.gp_Elips2d_Location(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the major radius of the Ellipse.
   */
  public double MajorRadius() {
    return OCCwrapJavaJNI.gp_Elips2d_MajorRadius(swigCPtr, this);
  }

  /**
   *  Returns the minor radius of the Ellipse.
   */
  public double MinorRadius() {
    return OCCwrapJavaJNI.gp_Elips2d_MinorRadius(swigCPtr, this);
  }

  /**
   *  Returns p = (1 - e * e) * MajorRadius where e is the eccentricity
   *  of the ellipse.
   *  Returns 0 if MajorRadius = 0
   */
  public double Parameter() {
    return OCCwrapJavaJNI.gp_Elips2d_Parameter(swigCPtr, this);
  }

  /**
   *  Returns the major axis of the ellipse.
   */
  public  gp_Ax22d  Axis() {
    gp_Ax22d ret = new gp_Ax22d(OCCwrapJavaJNI.gp_Elips2d_Axis(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the major axis of the ellipse.
   */
  public gp_Ax2d XAxis() {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Elips2d_XAxis(swigCPtr, this), true);
  }

  /**
   *  Returns the minor axis of the ellipse.
   *  Reverses the direction of the circle.
   */
  public gp_Ax2d YAxis() {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Elips2d_YAxis(swigCPtr, this), true);
  }

  public void Reverse() {
    OCCwrapJavaJNI.gp_Elips2d_Reverse(swigCPtr, this);
  }

  public gp_Elips2d Reversed() {
    return new gp_Elips2d(OCCwrapJavaJNI.gp_Elips2d_Reversed(swigCPtr, this), true);
  }

  /**
   *  Returns true if the local coordinate system is direct
   *  and false in the other case.
   */
  public long IsDirect() {
    return OCCwrapJavaJNI.gp_Elips2d_IsDirect(swigCPtr, this);
  }

  public void Mirror( gp_Pnt2d  P) {
    OCCwrapJavaJNI.gp_Elips2d_Mirror__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of a ellipse with respect
   *  to the point P which is the center of the symmetry
   */
  public gp_Elips2d Mirrored( gp_Pnt2d  P) {
    return new gp_Elips2d(OCCwrapJavaJNI.gp_Elips2d_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P), true);
  }

  public void Mirror( gp_Ax2d  A) {
    OCCwrapJavaJNI.gp_Elips2d_Mirror__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  Performs the symmetrical transformation of a ellipse with respect
   *  to an axis placement which is the axis of the symmetry.
   */
  public gp_Elips2d Mirrored( gp_Ax2d  A) {
    return new gp_Elips2d(OCCwrapJavaJNI.gp_Elips2d_Mirrored__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A), true);
  }

  public void Rotate( gp_Pnt2d  P, double Ang) {
    OCCwrapJavaJNI.gp_Elips2d_Rotate(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, Ang);
  }

  public gp_Elips2d Rotated( gp_Pnt2d  P, double Ang) {
    return new gp_Elips2d(OCCwrapJavaJNI.gp_Elips2d_Rotated(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, Ang), true);
  }

  public void Scale( gp_Pnt2d  P, double S) {
    OCCwrapJavaJNI.gp_Elips2d_Scale(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, S);
  }

  /**
   *  Scales a ellipse. S is the scaling value.
   */
  public gp_Elips2d Scaled( gp_Pnt2d  P, double S) {
    return new gp_Elips2d(OCCwrapJavaJNI.gp_Elips2d_Scaled(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, S), true);
  }

  public void Transform( gp_Trsf2d  T) {
    OCCwrapJavaJNI.gp_Elips2d_Transform(swigCPtr, this, gp_Trsf2d.getCPtr(T), T);
  }

  /**
   *  Transforms an ellipse with the transformation T from class Trsf2d.
   */
  public gp_Elips2d Transformed( gp_Trsf2d  T) {
    return new gp_Elips2d(OCCwrapJavaJNI.gp_Elips2d_Transformed(swigCPtr, this, gp_Trsf2d.getCPtr(T), T), true);
  }

  public void Translate( gp_Vec2d  V) {
    OCCwrapJavaJNI.gp_Elips2d_Translate__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V);
  }

  /**
   *  Translates a ellipse in the direction of the vector V.
   *  The magnitude of the translation is the vector's magnitude.
   */
  public gp_Elips2d Translated( gp_Vec2d  V) {
    return new gp_Elips2d(OCCwrapJavaJNI.gp_Elips2d_Translated__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V), true);
  }

  public void Translate( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    OCCwrapJavaJNI.gp_Elips2d_Translate__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2);
  }

  /**
   *  Translates a ellipse from the point P1 to the point P2.
   */
  public gp_Elips2d Translated( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    return new gp_Elips2d(OCCwrapJavaJNI.gp_Elips2d_Translated__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2), true);
  }

}
