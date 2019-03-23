package opencascade;

/**
 *  Describes a line in 2D space.
 *  A line is positioned in the plane with an axis (a gp_Ax2d
 *  object) which gives the line its origin and unit vector. A
 *  line and an axis are similar objects, thus, we can convert
 *  one into the other.
 *  A line provides direct access to the majority of the edit
 *  and query functions available on its positioning axis. In
 *  addition, however, a line has specific functions for
 *  computing distances and positions.
 *  See Also
 *  GccAna and Geom2dGcc packages which provide
 *  functions for constructing lines defined by geometric
 *  constraints
 *  gce_MakeLin2d which provides functions for more
 *  complex line constructions
 *  Geom2d_Line which provides additional functions for
 *  constructing lines and works, in particular, with the
 *  parametric equations of lines
 */
public class gp_Lin2d {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Lin2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Lin2d(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Lin2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Lin2d ptr) { Ptr = ptr; }
    public gp_Lin2d AsReference () { return Ptr; }
    public gp_Lin2d AsCopy () { return Ptr.MakeCopy(); }
    public gp_Lin2d Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Lin2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a Line corresponding to X axis of the
   *  reference coordinate system.
   */
  public gp_Lin2d() {
    this(OCCwrapJavaJNI.new_gp_Lin2d__SWIG_0(), true);
  }

  /**
   *  Creates a line located with A.
   */
  public gp_Lin2d( gp_Ax2d  A) {
    this(OCCwrapJavaJNI.new_gp_Lin2d__SWIG_1(gp_Ax2d.getCPtr(A), A), true);
  }

  /**
   *  <P> is the location point (origin) of the line and
   *  <V> is the direction of the line.
   */
  public gp_Lin2d( gp_Pnt2d  P,  gp_Dir2d  V) {
    this(OCCwrapJavaJNI.new_gp_Lin2d__SWIG_2(gp_Pnt2d.getCPtr(P), P, gp_Dir2d.getCPtr(V), V), true);
  }

  /**
   *  Creates the line from the equation A*X + B*Y + C = 0.0 Raises ConstructionError if Sqrt(A*A + B*B) <= Resolution from gp.
   *  Raised if Sqrt(A*A + B*B) <= Resolution from gp.
   */
  public gp_Lin2d(double A, double B, double C) {
    this(OCCwrapJavaJNI.new_gp_Lin2d__SWIG_3(A, B, C), true);
  }

  public void Reverse() {
    OCCwrapJavaJNI.gp_Lin2d_Reverse(swigCPtr, this);
  }

  /**
   *  Reverses the positioning axis of this line.
   *  Note:
   *  -   Reverse assigns the result to this line, while
   *  -   Reversed creates a new one.
   */
  public gp_Lin2d Reversed() {
    return new gp_Lin2d(OCCwrapJavaJNI.gp_Lin2d_Reversed(swigCPtr, this), true);
  }

  /**
   *  Changes the direction of the line.
   */
  public void SetDirection( gp_Dir2d  V) {
    OCCwrapJavaJNI.gp_Lin2d_SetDirection(swigCPtr, this, gp_Dir2d.getCPtr(V), V);
  }

  /**
   *  Changes the origin of the line.
   */
  public void SetLocation( gp_Pnt2d  P) {
    OCCwrapJavaJNI.gp_Lin2d_SetLocation(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Complete redefinition of the line.
   *  The "Location" point of <A> is the origin of the line.
   *  The "Direction" of <A> is  the direction of the line.
   */
  public void SetPosition( gp_Ax2d  A) {
    OCCwrapJavaJNI.gp_Lin2d_SetPosition(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  Returns the normalized coefficients of the line :
   *  A * X + B * Y + C = 0.
   */
  public void Coefficients(double[] A, double[] B, double[] C) {
    OCCwrapJavaJNI.gp_Lin2d_Coefficients(swigCPtr, this, A, B, C);
  }

  /**
   *  Returns the direction of the line.
   */
  public  gp_Dir2d  Direction() {
    gp_Dir2d ret = new gp_Dir2d(OCCwrapJavaJNI.gp_Lin2d_Direction(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the location point (origin) of the line.
   */
  public  gp_Pnt2d  Location() {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.gp_Lin2d_Location(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the axis placement one axis whith the same
   *  location and direction as <me>.
   */
  public  gp_Ax2d  Position() {
    gp_Ax2d ret = new gp_Ax2d(OCCwrapJavaJNI.gp_Lin2d_Position(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Computes the angle between two lines in radians.
   */
  public double Angle( gp_Lin2d  Other) {
    return OCCwrapJavaJNI.gp_Lin2d_Angle(swigCPtr, this, gp_Lin2d.getCPtr(Other), Other);
  }

  /**
   *  Returns true if this line contains the point P, that is, if the
   *  distance between point P and this line is less than or
   *  equal to LinearTolerance.
   */
  public long Contains( gp_Pnt2d  P, double LinearTolerance) {
    return OCCwrapJavaJNI.gp_Lin2d_Contains(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, LinearTolerance);
  }

  /**
   *  Computes the distance between <me> and the point <P>.
   */
  public double Distance( gp_Pnt2d  P) {
    return OCCwrapJavaJNI.gp_Lin2d_Distance__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Computes the distance between two lines.
   */
  public double Distance( gp_Lin2d  Other) {
    return OCCwrapJavaJNI.gp_Lin2d_Distance__SWIG_1(swigCPtr, this, gp_Lin2d.getCPtr(Other), Other);
  }

  /**
   *  Computes the square distance between <me> and the point
   *  <P>.
   */
  public double SquareDistance( gp_Pnt2d  P) {
    return OCCwrapJavaJNI.gp_Lin2d_SquareDistance__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Computes the square distance between two lines.
   */
  public double SquareDistance( gp_Lin2d  Other) {
    return OCCwrapJavaJNI.gp_Lin2d_SquareDistance__SWIG_1(swigCPtr, this, gp_Lin2d.getCPtr(Other), Other);
  }

  /**
   *  Computes the line normal to the direction of <me>,
   *  passing through the point <P>.
   */
  public gp_Lin2d Normal( gp_Pnt2d  P) {
    return new gp_Lin2d(OCCwrapJavaJNI.gp_Lin2d_Normal(swigCPtr, this, gp_Pnt2d.getCPtr(P), P), true);
  }

  public void Mirror( gp_Pnt2d  P) {
    OCCwrapJavaJNI.gp_Lin2d_Mirror__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of a line
   *  with respect to the point <P> which is the center
   *  of the symmetry
   */
  public gp_Lin2d Mirrored( gp_Pnt2d  P) {
    return new gp_Lin2d(OCCwrapJavaJNI.gp_Lin2d_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P), true);
  }

  public void Mirror( gp_Ax2d  A) {
    OCCwrapJavaJNI.gp_Lin2d_Mirror__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  Performs the symmetrical transformation of a line
   *  with respect to an axis placement which is the axis
   *  of the symmetry.
   */
  public gp_Lin2d Mirrored( gp_Ax2d  A) {
    return new gp_Lin2d(OCCwrapJavaJNI.gp_Lin2d_Mirrored__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A), true);
  }

  public void Rotate( gp_Pnt2d  P, double Ang) {
    OCCwrapJavaJNI.gp_Lin2d_Rotate(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, Ang);
  }

  /**
   *  Rotates a line. P is the center of the rotation.
   *  Ang is the angular value of the rotation in radians.
   */
  public gp_Lin2d Rotated( gp_Pnt2d  P, double Ang) {
    return new gp_Lin2d(OCCwrapJavaJNI.gp_Lin2d_Rotated(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, Ang), true);
  }

  public void Scale( gp_Pnt2d  P, double S) {
    OCCwrapJavaJNI.gp_Lin2d_Scale(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, S);
  }

  /**
   *  Scales a line. S is the scaling value. Only the
   *  origin of the line is modified.
   */
  public gp_Lin2d Scaled( gp_Pnt2d  P, double S) {
    return new gp_Lin2d(OCCwrapJavaJNI.gp_Lin2d_Scaled(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, S), true);
  }

  public void Transform( gp_Trsf2d  T) {
    OCCwrapJavaJNI.gp_Lin2d_Transform(swigCPtr, this, gp_Trsf2d.getCPtr(T), T);
  }

  /**
   *  Transforms a line with the transformation T from class Trsf2d.
   */
  public gp_Lin2d Transformed( gp_Trsf2d  T) {
    return new gp_Lin2d(OCCwrapJavaJNI.gp_Lin2d_Transformed(swigCPtr, this, gp_Trsf2d.getCPtr(T), T), true);
  }

  public void Translate( gp_Vec2d  V) {
    OCCwrapJavaJNI.gp_Lin2d_Translate__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V);
  }

  /**
   *  Translates a line in the direction of the vector V.
   *  The magnitude of the translation is the vector's magnitude.
   */
  public gp_Lin2d Translated( gp_Vec2d  V) {
    return new gp_Lin2d(OCCwrapJavaJNI.gp_Lin2d_Translated__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V), true);
  }

  public void Translate( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    OCCwrapJavaJNI.gp_Lin2d_Translate__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2);
  }

  /**
   *  Translates a line from the point P1 to the point P2.
   */
  public gp_Lin2d Translated( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    return new gp_Lin2d(OCCwrapJavaJNI.gp_Lin2d_Translated__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2), true);
  }

}
