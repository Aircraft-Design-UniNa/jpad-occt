package opencascade;

/**
 *  Describes a circle in the plane (2D space).
 *  A circle is defined by its radius and positioned in the
 *  plane with a coordinate system (a gp_Ax22d object) as follows:
 *  -   the origin of the coordinate system is the center of the circle, and
 *  -   the orientation (direct or indirect) of the coordinate
 *  system gives an implicit orientation to the circle (and
 *  defines its trigonometric sense).
 *  This positioning coordinate system is the "local
 *  coordinate system" of the circle.
 *  Note: when a gp_Circ2d circle is converted into a
 *  Geom2d_Circle circle, some implicit properties of the
 *  circle are used explicitly:
 *  -   the implicit orientation corresponds to the direction in
 *  which parameter values increase,
 *  -   the starting point for parameterization is that of the "X
 *  Axis" of the local coordinate system (i.e. the "X Axis" of the circle).
 *  See Also
 *  GccAna and Geom2dGcc packages which provide
 *  functions for constructing circles defined by geometric constraints
 *  gce_MakeCirc2d which provides functions for more
 *  complex circle constructions
 *  Geom2d_Circle which provides additional functions for
 *  constructing circles and works, with the parametric
 *  equations of circles in particular  gp_Ax22d
 */
public class gp_Circ2d {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Circ2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Circ2d(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Circ2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Circ2d ptr) { Ptr = ptr; }
    public gp_Circ2d AsReference () { return Ptr; }
    public gp_Circ2d AsCopy () { return Ptr.MakeCopy(); }
    public gp_Circ2d Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Circ2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  creates an indefinite circle.
   */
  public gp_Circ2d() {
    this(OCCwrapJavaJNI.new_gp_Circ2d__SWIG_0(), true);
  }

  /**
   *  The location point of XAxis is the center of the circle.
   *  Warnings :
   *  It is not forbidden to create a circle with Radius = 0.0   Raises ConstructionError if Radius < 0.0.
   *  Raised if Radius < 0.0.
   */
  public gp_Circ2d( gp_Ax2d  XAxis, double Radius, long Sense) {
    this(OCCwrapJavaJNI.new_gp_Circ2d__SWIG_1(gp_Ax2d.getCPtr(XAxis), XAxis, Radius, Sense), true);
  }

  /**
   *  Axis defines the Xaxis and Yaxis of the circle which defines
   *  the origin and the sense of parametrization.
   *  The location point of Axis is the center of the circle.
   *  Warnings :
   *  It is not forbidden to create a circle with Radius = 0.0 Raises ConstructionError if Radius < 0.0.
   *  Raised if Radius < 0.0.
   */
  public gp_Circ2d( gp_Ax2d  XAxis, double Radius) {
    this(OCCwrapJavaJNI.new_gp_Circ2d__SWIG_2(gp_Ax2d.getCPtr(XAxis), XAxis, Radius), true);
  }

  public gp_Circ2d( gp_Ax22d  Axis, double Radius) {
    this(OCCwrapJavaJNI.new_gp_Circ2d__SWIG_3(gp_Ax22d.getCPtr(Axis), Axis, Radius), true);
  }

  /**
   *  Changes the location point (center) of the circle.
   */
  public void SetLocation( gp_Pnt2d  P) {
    OCCwrapJavaJNI.gp_Circ2d_SetLocation(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Changes the X axis of the circle.
   */
  public void SetXAxis( gp_Ax2d  A) {
    OCCwrapJavaJNI.gp_Circ2d_SetXAxis(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  Changes the X axis of the circle.
   */
  public void SetAxis( gp_Ax22d  A) {
    OCCwrapJavaJNI.gp_Circ2d_SetAxis(swigCPtr, this, gp_Ax22d.getCPtr(A), A);
  }

  /**
   *  Changes the Y axis of the circle.
   */
  public void SetYAxis( gp_Ax2d  A) {
    OCCwrapJavaJNI.gp_Circ2d_SetYAxis(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  Modifies the radius of this circle.
   *  This class does not prevent the creation of a circle where
   *  Radius is null.
   *  Exceptions
   *  Standard_ConstructionError if Radius is negative.
   */
  public void SetRadius(double Radius) {
    OCCwrapJavaJNI.gp_Circ2d_SetRadius(swigCPtr, this, Radius);
  }

  /**
   *  Computes the area of the circle.
   */
  public double Area() {
    return OCCwrapJavaJNI.gp_Circ2d_Area(swigCPtr, this);
  }

  /**
   *  Returns the normalized coefficients from the implicit equation
   *  of the circle :
   *  A * (X**2) + B * (Y**2) + 2*C*(X*Y) + 2*D*X + 2*E*Y + F = 0.0
   */
  public void Coefficients(double[] A, double[] B, double[] C, double[] D, double[] E, double[] F) {
    OCCwrapJavaJNI.gp_Circ2d_Coefficients(swigCPtr, this, A, B, C, D, E, F);
  }

  /**
   *  Does <me> contain P ?
   *  Returns True if the distance between P and any point on
   *  the circumference of the circle is lower of equal to
   *  <LinearTolerance>.
   */
  public long Contains( gp_Pnt2d  P, double LinearTolerance) {
    return OCCwrapJavaJNI.gp_Circ2d_Contains(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, LinearTolerance);
  }

  /**
   *  Computes the minimum of distance between the point P and any
   *  point on the circumference of the circle.
   */
  public double Distance( gp_Pnt2d  P) {
    return OCCwrapJavaJNI.gp_Circ2d_Distance(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Computes the square distance between <me> and the point P.
   */
  public double SquareDistance( gp_Pnt2d  P) {
    return OCCwrapJavaJNI.gp_Circ2d_SquareDistance(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  computes the circumference of the circle.
   */
  public double Length() {
    return OCCwrapJavaJNI.gp_Circ2d_Length(swigCPtr, this);
  }

  /**
   *  Returns the location point (center) of the circle.
   */
  public  gp_Pnt2d  Location() {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.gp_Circ2d_Location(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the radius value of the circle.
   */
  public double Radius() {
    return OCCwrapJavaJNI.gp_Circ2d_Radius(swigCPtr, this);
  }

  /**
   *  returns the position of the circle.
   */
  public  gp_Ax22d  Axis() {
    gp_Ax22d ret = new gp_Ax22d(OCCwrapJavaJNI.gp_Circ2d_Axis(swigCPtr, this), true);
    return ret;
  }

  /**
   *  returns the position of the circle. Idem Axis(me).
   */
  public  gp_Ax22d  Position() {
    gp_Ax22d ret = new gp_Ax22d(OCCwrapJavaJNI.gp_Circ2d_Position(swigCPtr, this), true);
    return ret;
  }

  /**
   *  returns the X axis of the circle.
   */
  public gp_Ax2d XAxis() {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Circ2d_XAxis(swigCPtr, this), true);
  }

  /**
   *  Returns the Y axis of the circle.
   *  Reverses the direction of the circle.
   */
  public gp_Ax2d YAxis() {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Circ2d_YAxis(swigCPtr, this), true);
  }

  /**
   *  Reverses the orientation of the local coordinate system
   *  of this circle (the "Y Direction" is reversed) and therefore
   *  changes the implicit orientation of this circle.
   *  Reverse assigns the result to this circle,
   */
  public void Reverse() {
    OCCwrapJavaJNI.gp_Circ2d_Reverse(swigCPtr, this);
  }

  /**
   *  Reverses the orientation of the local coordinate system
   *  of this circle (the "Y Direction" is reversed) and therefore
   *  changes the implicit orientation of this circle.
   *  Reversed creates a new circle.
   */
  public gp_Circ2d Reversed() {
    return new gp_Circ2d(OCCwrapJavaJNI.gp_Circ2d_Reversed(swigCPtr, this), true);
  }

  /**
   *  Returns true if the local coordinate system is direct
   *  and false in the other case.
   */
  public long IsDirect() {
    return OCCwrapJavaJNI.gp_Circ2d_IsDirect(swigCPtr, this);
  }

  public void Mirror( gp_Pnt2d  P) {
    OCCwrapJavaJNI.gp_Circ2d_Mirror__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of a circle with respect
   *  to the point P which is the center of the symmetry
   */
  public gp_Circ2d Mirrored( gp_Pnt2d  P) {
    return new gp_Circ2d(OCCwrapJavaJNI.gp_Circ2d_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P), true);
  }

  public void Mirror( gp_Ax2d  A) {
    OCCwrapJavaJNI.gp_Circ2d_Mirror__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  Performs the symmetrical transformation of a circle with respect
   *  to an axis placement which is the axis of the symmetry.
   */
  public gp_Circ2d Mirrored( gp_Ax2d  A) {
    return new gp_Circ2d(OCCwrapJavaJNI.gp_Circ2d_Mirrored__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A), true);
  }

  public void Rotate( gp_Pnt2d  P, double Ang) {
    OCCwrapJavaJNI.gp_Circ2d_Rotate(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, Ang);
  }

  /**
   *  Rotates a circle. P is the center of the rotation.
   *  Ang is the angular value of the rotation in radians.
   */
  public gp_Circ2d Rotated( gp_Pnt2d  P, double Ang) {
    return new gp_Circ2d(OCCwrapJavaJNI.gp_Circ2d_Rotated(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, Ang), true);
  }

  public void Scale( gp_Pnt2d  P, double S) {
    OCCwrapJavaJNI.gp_Circ2d_Scale(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, S);
  }

  /**
   *  Scales a circle. S is the scaling value.
   *  Warnings :
   *  If S is negative the radius stay positive but
   *  the "XAxis" and the "YAxis" are  reversed as for
   *  an ellipse.
   */
  public gp_Circ2d Scaled( gp_Pnt2d  P, double S) {
    return new gp_Circ2d(OCCwrapJavaJNI.gp_Circ2d_Scaled(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, S), true);
  }

  public void Transform( gp_Trsf2d  T) {
    OCCwrapJavaJNI.gp_Circ2d_Transform(swigCPtr, this, gp_Trsf2d.getCPtr(T), T);
  }

  /**
   *  Transforms a circle with the transformation T from class Trsf2d.
   */
  public gp_Circ2d Transformed( gp_Trsf2d  T) {
    return new gp_Circ2d(OCCwrapJavaJNI.gp_Circ2d_Transformed(swigCPtr, this, gp_Trsf2d.getCPtr(T), T), true);
  }

  public void Translate( gp_Vec2d  V) {
    OCCwrapJavaJNI.gp_Circ2d_Translate__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V);
  }

  /**
   *  Translates a circle in the direction of the vector V.
   *  The magnitude of the translation is the vector's magnitude.
   */
  public gp_Circ2d Translated( gp_Vec2d  V) {
    return new gp_Circ2d(OCCwrapJavaJNI.gp_Circ2d_Translated__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V), true);
  }

  public void Translate( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    OCCwrapJavaJNI.gp_Circ2d_Translate__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2);
  }

  /**
   *  Translates a circle from the point P1 to the point P2.
   */
  public gp_Circ2d Translated( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    return new gp_Circ2d(OCCwrapJavaJNI.gp_Circ2d_Translated__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2), true);
  }

}
