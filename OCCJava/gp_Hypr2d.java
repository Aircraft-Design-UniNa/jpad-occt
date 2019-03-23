package opencascade;

/**
 *  Describes a branch of a hyperbola in the plane (2D space).
 *  A hyperbola is defined by its major and minor radii, and
 *  positioned in the plane with a coordinate system (a
 *  gp_Ax22d object) of which:
 *  -   the origin is the center of the hyperbola,
 *  -   the "X Direction" defines the major axis of the hyperbola, and
 *  -   the "Y Direction" defines the minor axis of the hyperbola.
 *  This coordinate system is the "local coordinate system"
 *  of the hyperbola. The orientation of this coordinate
 *  system (direct or indirect) gives an implicit orientation to
 *  the hyperbola. In this coordinate system, the equation of
 *  the hyperbola is:
 *  X*X/(MajorRadius**2)-Y*Y/(MinorRadius**2) = 1.0
 *  The branch of the hyperbola described is the one located
 *  on the positive side of the major axis.
 *  The following schema shows the plane of the hyperbola,
 *  and in it, the respective positions of the three branches of
 *  hyperbolas constructed with the functions OtherBranch,
 *  ConjugateBranch1, and ConjugateBranch2:
 *  ^YAxis
 *  |
 *  FirstConjugateBranch
 *  |
 *  Other            |                Main
 *  --------------------- C ------------------------------>XAxis
 *  Branch           |                Branch
 *  |
 *  |
 *  SecondConjugateBranch
 *  |
 * 
 *  Warning
 *  The major radius can be less than the minor radius.
 *  See Also
 *  gce_MakeHypr2d which provides functions for more
 *  complex hyperbola constructions
 *  Geom2d_Hyperbola which provides additional functions
 *  for constructing hyperbolas and works, in particular, with
 *  the parametric equations of hyperbolas
 */
public class gp_Hypr2d {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Hypr2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Hypr2d(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Hypr2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Hypr2d ptr) { Ptr = ptr; }
    public gp_Hypr2d AsReference () { return Ptr; }
    public gp_Hypr2d AsCopy () { return Ptr.MakeCopy(); }
    public gp_Hypr2d Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Hypr2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates of an indefinite hyperbola.
   */
  public gp_Hypr2d() {
    this(OCCwrapJavaJNI.new_gp_Hypr2d__SWIG_0(), true);
  }

  /**
   *  Creates a hyperbola with radii MajorRadius and
   *  MinorRadius, centered on the origin of MajorAxis
   *  and where the unit vector of MajorAxis is the "X
   *  Direction" of the local coordinate system of the
   *  hyperbola. This coordinate system is direct if Sense
   *  is true (the default value), and indirect if Sense is false.
   *  Warnings :
   *  It is yet  possible to create an Hyperbola with
   *  MajorRadius <= MinorRadius.
   *  Raises ConstructionError if MajorRadius < 0.0 or MinorRadius < 0.0
   */
  public gp_Hypr2d( gp_Ax2d  MajorAxis, double MajorRadius, double MinorRadius, long Sense) {
    this(OCCwrapJavaJNI.new_gp_Hypr2d__SWIG_1(gp_Ax2d.getCPtr(MajorAxis), MajorAxis, MajorRadius, MinorRadius, Sense), true);
  }

  /**
   *  a hyperbola with radii MajorRadius and
   *  MinorRadius, positioned in the plane by coordinate system A where:
   *  -   the origin of A is the center of the hyperbola,
   *  -   the "X Direction" of A defines the major axis of
   *  the hyperbola, that is, the major radius
   *  MajorRadius is measured along this axis, and
   *  -   the "Y Direction" of A defines the minor axis of
   *  the hyperbola, that is, the minor radius
   *  MinorRadius is measured along this axis, and
   *  -   the orientation (direct or indirect sense) of A
   *  gives the implicit orientation of the hyperbola.
   *  Warnings :
   *  It is yet  possible to create an Hyperbola with
   *  MajorRadius <= MinorRadius.
   *  Raises ConstructionError if MajorRadius < 0.0 or MinorRadius < 0.0
   */
  public gp_Hypr2d( gp_Ax2d  MajorAxis, double MajorRadius, double MinorRadius) {
    this(OCCwrapJavaJNI.new_gp_Hypr2d__SWIG_2(gp_Ax2d.getCPtr(MajorAxis), MajorAxis, MajorRadius, MinorRadius), true);
  }

  public gp_Hypr2d( gp_Ax22d  A, double MajorRadius, double MinorRadius) {
    this(OCCwrapJavaJNI.new_gp_Hypr2d__SWIG_3(gp_Ax22d.getCPtr(A), A, MajorRadius, MinorRadius), true);
  }

  /**
   *  Modifies this hyperbola, by redefining its local
   *  coordinate system so that its origin becomes P.
   */
  public void SetLocation( gp_Pnt2d  P) {
    OCCwrapJavaJNI.gp_Hypr2d_SetLocation(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Modifies the major or minor radius of this hyperbola.
   *  Exceptions
   *  Standard_ConstructionError if MajorRadius or
   *  MinorRadius is negative.
   */
  public void SetMajorRadius(double MajorRadius) {
    OCCwrapJavaJNI.gp_Hypr2d_SetMajorRadius(swigCPtr, this, MajorRadius);
  }

  /**
   *  Modifies the major or minor radius of this hyperbola.
   *  Exceptions
   *  Standard_ConstructionError if MajorRadius or
   *  MinorRadius is negative.
   */
  public void SetMinorRadius(double MinorRadius) {
    OCCwrapJavaJNI.gp_Hypr2d_SetMinorRadius(swigCPtr, this, MinorRadius);
  }

  /**
   *  Modifies this hyperbola, by redefining its local
   *  coordinate system so that it becomes A.
   */
  public void SetAxis( gp_Ax22d  A) {
    OCCwrapJavaJNI.gp_Hypr2d_SetAxis(swigCPtr, this, gp_Ax22d.getCPtr(A), A);
  }

  /**
   *  Changes the major axis of the hyperbola. The minor axis is
   *  recomputed and the location of the hyperbola too.
   */
  public void SetXAxis( gp_Ax2d  A) {
    OCCwrapJavaJNI.gp_Hypr2d_SetXAxis(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  Changes the minor axis of the hyperbola.The minor axis is
   *  recomputed and the location of the hyperbola too.
   */
  public void SetYAxis( gp_Ax2d  A) {
    OCCwrapJavaJNI.gp_Hypr2d_SetYAxis(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  In the local coordinate system of the hyperbola the equation of
   *  the hyperbola is (X*X)/(A*A) - (Y*Y)/(B*B) = 1.0 and the
   *  equation of the first asymptote is Y = (B/A)*X
   *  where A is the major radius of the hyperbola and B the minor
   *  radius of the hyperbola.
   *  Raises ConstructionError if MajorRadius = 0.0
   */
  public gp_Ax2d Asymptote1() {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Hypr2d_Asymptote1(swigCPtr, this), true);
  }

  /**
   *  In the local coordinate system of the hyperbola the equation of
   *  the hyperbola is (X*X)/(A*A) - (Y*Y)/(B*B) = 1.0 and the
   *  equation of the first asymptote is Y = -(B/A)*X
   *  where A is the major radius of the hyperbola and B the minor
   *  radius of the hyperbola.
   *  Raises ConstructionError if MajorRadius = 0.0
   */
  public gp_Ax2d Asymptote2() {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Hypr2d_Asymptote2(swigCPtr, this), true);
  }

  /**
   *  Computes the coefficients of the implicit equation of
   *  the hyperbola :
   *  A * (X**2) + B * (Y**2) + 2*C*(X*Y) + 2*D*X + 2*E*Y + F = 0.
   */
  public void Coefficients(double[] A, double[] B, double[] C, double[] D, double[] E, double[] F) {
    OCCwrapJavaJNI.gp_Hypr2d_Coefficients(swigCPtr, this, A, B, C, D, E, F);
  }

  /**
   *  Computes the branch of hyperbola which is on the positive side of the
   *  "YAxis" of <me>.
   */
  public gp_Hypr2d ConjugateBranch1() {
    return new gp_Hypr2d(OCCwrapJavaJNI.gp_Hypr2d_ConjugateBranch1(swigCPtr, this), true);
  }

  /**
   *  Computes the branch of hyperbola which is on the negative side of the
   *  "YAxis" of <me>.
   */
  public gp_Hypr2d ConjugateBranch2() {
    return new gp_Hypr2d(OCCwrapJavaJNI.gp_Hypr2d_ConjugateBranch2(swigCPtr, this), true);
  }

  /**
   *  Computes the directrix which is the line normal to the XAxis of the hyperbola
   *  in the local plane (Z = 0) at a distance d = MajorRadius / e
   *  from the center of the hyperbola, where e is the eccentricity of
   *  the hyperbola.
   *  This line is parallel to the "YAxis". The intersection point
   *  between the "Directrix1" and the "XAxis" is the "Location" point
   *  of the "Directrix1".
   *  This point is on the positive side of the "XAxis".
   */
  public gp_Ax2d Directrix1() {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Hypr2d_Directrix1(swigCPtr, this), true);
  }

  /**
   *  This line is obtained by the symmetrical transformation
   *  of "Directrix1" with respect to the "YAxis" of the hyperbola.
   */
  public gp_Ax2d Directrix2() {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Hypr2d_Directrix2(swigCPtr, this), true);
  }

  /**
   *  Returns the excentricity of the hyperbola (e > 1).
   *  If f is the distance between the location of the hyperbola
   *  and the Focus1 then the eccentricity e = f / MajorRadius. Raises DomainError if MajorRadius = 0.0.
   */
  public double Eccentricity() {
    return OCCwrapJavaJNI.gp_Hypr2d_Eccentricity(swigCPtr, this);
  }

  /**
   *  Computes the focal distance. It is the distance between the
   *  "Location" of the hyperbola and "Focus1" or "Focus2".
   */
  public double Focal() {
    return OCCwrapJavaJNI.gp_Hypr2d_Focal(swigCPtr, this);
  }

  /**
   *  Returns the first focus of the hyperbola. This focus is on the
   *  positive side of the "XAxis" of the hyperbola.
   */
  public gp_Pnt2d Focus1() {
    return new gp_Pnt2d(OCCwrapJavaJNI.gp_Hypr2d_Focus1(swigCPtr, this), true);
  }

  /**
   *  Returns the second focus of the hyperbola. This focus is on the
   *  negative side of the "XAxis" of the hyperbola.
   */
  public gp_Pnt2d Focus2() {
    return new gp_Pnt2d(OCCwrapJavaJNI.gp_Hypr2d_Focus2(swigCPtr, this), true);
  }

  /**
   *  Returns  the location point of the hyperbola.
   *  It is the intersection point between the "XAxis" and
   *  the "YAxis".
   */
  public  gp_Pnt2d  Location() {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.gp_Hypr2d_Location(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the major radius of the hyperbola (it is the radius
   *  corresponding to the "XAxis" of the hyperbola).
   */
  public double MajorRadius() {
    return OCCwrapJavaJNI.gp_Hypr2d_MajorRadius(swigCPtr, this);
  }

  /**
   *  Returns the minor radius of the hyperbola (it is the radius
   *  corresponding to the "YAxis" of the hyperbola).
   */
  public double MinorRadius() {
    return OCCwrapJavaJNI.gp_Hypr2d_MinorRadius(swigCPtr, this);
  }

  /**
   *  Returns the branch of hyperbola obtained by doing the
   *  symmetrical transformation of <me> with respect to the
   *  "YAxis" of <me>.
   */
  public gp_Hypr2d OtherBranch() {
    return new gp_Hypr2d(OCCwrapJavaJNI.gp_Hypr2d_OtherBranch(swigCPtr, this), true);
  }

  /**
   *  Returns p = (e * e - 1) * MajorRadius where e is the
   *  eccentricity of the hyperbola.
   *  Raises DomainError if MajorRadius = 0.0
   */
  public double Parameter() {
    return OCCwrapJavaJNI.gp_Hypr2d_Parameter(swigCPtr, this);
  }

  /**
   *  Returns the axisplacement of the hyperbola.
   */
  public  gp_Ax22d  Axis() {
    gp_Ax22d ret = new gp_Ax22d(OCCwrapJavaJNI.gp_Hypr2d_Axis(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Computes an axis whose
   *  -   the origin is the center of this hyperbola, and
   *  -   the unit vector is the "X Direction" or "Y Direction"
   *  respectively of the local coordinate system of this hyperbola
   *  Returns the major axis of the hyperbola.
   */
  public gp_Ax2d XAxis() {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Hypr2d_XAxis(swigCPtr, this), true);
  }

  /**
   *  Computes an axis whose
   *  -   the origin is the center of this hyperbola, and
   *  -   the unit vector is the "X Direction" or "Y Direction"
   *  respectively of the local coordinate system of this hyperbola
   *  Returns the minor axis of the hyperbola.
   */
  public gp_Ax2d YAxis() {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Hypr2d_YAxis(swigCPtr, this), true);
  }

  public void Reverse() {
    OCCwrapJavaJNI.gp_Hypr2d_Reverse(swigCPtr, this);
  }

  /**
   *  Reverses the orientation of the local coordinate system
   *  of this hyperbola (the "Y Axis" is reversed). Therefore,
   *  the implicit orientation of this hyperbola is reversed.
   *  Note:
   *  -   Reverse assigns the result to this hyperbola, while
   *  -   Reversed creates a new one.
   */
  public gp_Hypr2d Reversed() {
    return new gp_Hypr2d(OCCwrapJavaJNI.gp_Hypr2d_Reversed(swigCPtr, this), true);
  }

  /**
   *  Returns true if the local coordinate system is direct
   *  and false in the other case.
   */
  public long IsDirect() {
    return OCCwrapJavaJNI.gp_Hypr2d_IsDirect(swigCPtr, this);
  }

  public void Mirror( gp_Pnt2d  P) {
    OCCwrapJavaJNI.gp_Hypr2d_Mirror__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of an hyperbola with
   *  respect  to the point P which is the center of the symmetry.
   */
  public gp_Hypr2d Mirrored( gp_Pnt2d  P) {
    return new gp_Hypr2d(OCCwrapJavaJNI.gp_Hypr2d_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P), true);
  }

  public void Mirror( gp_Ax2d  A) {
    OCCwrapJavaJNI.gp_Hypr2d_Mirror__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  Performs the symmetrical transformation of an hyperbola with
   *  respect to an axis placement which is the axis of the symmetry.
   */
  public gp_Hypr2d Mirrored( gp_Ax2d  A) {
    return new gp_Hypr2d(OCCwrapJavaJNI.gp_Hypr2d_Mirrored__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A), true);
  }

  public void Rotate( gp_Pnt2d  P, double Ang) {
    OCCwrapJavaJNI.gp_Hypr2d_Rotate(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, Ang);
  }

  /**
   *  Rotates an hyperbola. P is the center of the rotation.
   *  Ang is the angular value of the rotation in radians.
   */
  public gp_Hypr2d Rotated( gp_Pnt2d  P, double Ang) {
    return new gp_Hypr2d(OCCwrapJavaJNI.gp_Hypr2d_Rotated(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, Ang), true);
  }

  public void Scale( gp_Pnt2d  P, double S) {
    OCCwrapJavaJNI.gp_Hypr2d_Scale(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, S);
  }

  /**
   *  Scales an hyperbola. <S> is the scaling value.
   *  If <S> is positive only the location point is
   *  modified. But if <S> is negative the "XAxis" is
   *  reversed and the "YAxis" too.
   */
  public gp_Hypr2d Scaled( gp_Pnt2d  P, double S) {
    return new gp_Hypr2d(OCCwrapJavaJNI.gp_Hypr2d_Scaled(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, S), true);
  }

  public void Transform( gp_Trsf2d  T) {
    OCCwrapJavaJNI.gp_Hypr2d_Transform(swigCPtr, this, gp_Trsf2d.getCPtr(T), T);
  }

  /**
   *  Transforms an hyperbola with the transformation T from
   *  class Trsf2d.
   */
  public gp_Hypr2d Transformed( gp_Trsf2d  T) {
    return new gp_Hypr2d(OCCwrapJavaJNI.gp_Hypr2d_Transformed(swigCPtr, this, gp_Trsf2d.getCPtr(T), T), true);
  }

  public void Translate( gp_Vec2d  V) {
    OCCwrapJavaJNI.gp_Hypr2d_Translate__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V);
  }

  /**
   *  Translates an hyperbola in the direction of the vector V.
   *  The magnitude of the translation is the vector's magnitude.
   */
  public gp_Hypr2d Translated( gp_Vec2d  V) {
    return new gp_Hypr2d(OCCwrapJavaJNI.gp_Hypr2d_Translated__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V), true);
  }

  public void Translate( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    OCCwrapJavaJNI.gp_Hypr2d_Translate__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2);
  }

  /**
   *  Translates an hyperbola from the point P1 to the point P2.
   */
  public gp_Hypr2d Translated( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    return new gp_Hypr2d(OCCwrapJavaJNI.gp_Hypr2d_Translated__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2), true);
  }

}
