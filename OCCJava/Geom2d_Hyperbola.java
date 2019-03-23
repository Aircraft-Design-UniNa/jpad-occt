package opencascade;

/**
 *  Describes a branch of a hyperbola in the plane (2D space).
 *  A hyperbola is defined by its major and minor radii
 *  and, as with any conic curve, is positioned in the
 *  plane with a coordinate system (gp_Ax22d object) where:
 *  - the origin is the center of the hyperbola,
 *  - the "X Direction" defines the major axis, and
 *  - the "Y Direction" defines the minor axis.
 *  This coordinate system is the local coordinate
 *  system of the hyperbola.
 *  The branch of the hyperbola described is the one
 *  located on the positive side of the major axis.
 *  The orientation (direct or indirect) of the local
 *  coordinate system gives an explicit orientation to the
 *  hyperbola, determining the direction in which the
 *  parameter increases along the hyperbola.
 *  The Geom2d_Hyperbola hyperbola is parameterized as follows:
 *  P(U) = O + MajRad*Cosh(U)*XDir + MinRad*Sinh(U)*YDir
 *  where:
 *  - P is the point of parameter U,
 *  - O, XDir and YDir are respectively the origin, "X
 *  Direction" and "Y Direction" of its local coordinate system,
 *  - MajRad and MinRad are the major and minor radii of the hyperbola.
 *  The "X Axis" of the local coordinate system therefore
 *  defines the origin of the parameter of the hyperbola.
 *  The parameter range is ] -infinite,+infinite [.
 *  The following diagram illustrates the respective
 *  positions, in the plane of the hyperbola, of the three
 *  branches of hyperbolas constructed using the
 *  functions OtherBranch, ConjugateBranch1 and
 *  ConjugateBranch2:
 *  ^YAxis
 *  |
 *  FirstConjugateBranch
 *  |
 *  Other         |          Main
 *  --------------------- C
 *  --------------------->XAxis
 *  Branch       |
 *  Branch
 *  |
 *  SecondConjugateBranch
 *  |
 *  Warning
 *  The value of the major radius (on the major axis) can
 *  be less than the value of the minor radius (on the minor axis).
 *  See Also
 *  GCE2d_MakeHyperbola which provides functions for
 *  more complex hyperbola constructions
 *  gp_Ax22d
 *  gp_Hypr2d for an equivalent, non-parameterized data structure
 */
public class Geom2d_Hyperbola extends Geom2d_Conic {
  Geom2d_Hyperbola(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates  an Hyperbola from a non persistent one from package gp
   */
  public Geom2d_Hyperbola( gp_Hypr2d  H) {
    this(OCCwrapJavaJNI.new_Geom2d_Hyperbola__SWIG_0(gp_Hypr2d.getCPtr(H), H), true);
  }

  /**
   *  MajorAxis is the "XAxis" of the hyperbola.
   *  The YAxis is in the direct sense if "Sense" is True;
   *  The major radius of the hyperbola is on this "XAxis" and
   *  the minor radius is on the "YAxis" of the hyperbola.
   *  Raised if MajorRadius < 0.0 or if MinorRadius < 0.0
   */
  public Geom2d_Hyperbola( gp_Ax2d  MajorAxis, double MajorRadius, double MinorRadius, long Sense) {
    this(OCCwrapJavaJNI.new_Geom2d_Hyperbola__SWIG_1(gp_Ax2d.getCPtr(MajorAxis), MajorAxis, MajorRadius, MinorRadius, Sense), true);
  }

  /**
   *  The XDirection of "Axis" is the "XAxis" of the hyperbola and
   *  the YDirection of "Axis" is the "YAxis".
   *  The major radius of the hyperbola is on this "XAxis" and
   *  the minor radius is on the "YAxis" of the hyperbola.
   *  Raised if MajorRadius < 0.0 or if MinorRadius < 0.0
   */
  public Geom2d_Hyperbola( gp_Ax2d  MajorAxis, double MajorRadius, double MinorRadius) {
    this(OCCwrapJavaJNI.new_Geom2d_Hyperbola__SWIG_2(gp_Ax2d.getCPtr(MajorAxis), MajorAxis, MajorRadius, MinorRadius), true);
  }

  public Geom2d_Hyperbola( gp_Ax22d  Axis, double MajorRadius, double MinorRadius) {
    this(OCCwrapJavaJNI.new_Geom2d_Hyperbola__SWIG_3(gp_Ax22d.getCPtr(Axis), Axis, MajorRadius, MinorRadius), true);
  }

  /**
   *  Converts the gp_Hypr2d hyperbola H into this hyperbola.
   */
  public void SetHypr2d( gp_Hypr2d  H) {
    OCCwrapJavaJNI.Geom2d_Hyperbola_SetHypr2d(swigCPtr, this, gp_Hypr2d.getCPtr(H), H);
  }

  /**
   *  Assigns a value to the major or minor radius of this hyperbola.
   *  Exceptions
   *  Standard_ConstructionError if:
   *  - MajorRadius is less than 0.0,
   *  - MinorRadius is less than 0.0.
   */
  public void SetMajorRadius(double MajorRadius) {
    OCCwrapJavaJNI.Geom2d_Hyperbola_SetMajorRadius(swigCPtr, this, MajorRadius);
  }

  /**
   *  Assigns a value to the major or minor radius of this hyperbola.
   *  Exceptions
   *  Standard_ConstructionError if:
   *  - MajorRadius is less than 0.0,
   *  - MinorRadius is less than 0.0.
   */
  public void SetMinorRadius(double MinorRadius) {
    OCCwrapJavaJNI.Geom2d_Hyperbola_SetMinorRadius(swigCPtr, this, MinorRadius);
  }

  /**
   *  Converts this hyperbola into a gp_Hypr2d one.
   */
  public gp_Hypr2d Hypr2d() {
    return new gp_Hypr2d(OCCwrapJavaJNI.Geom2d_Hyperbola_Hypr2d(swigCPtr, this), true);
  }

  /**
   *  In the local coordinate system of the hyperbola the
   *  equation of the hyperbola is (X*X)/(A*A) - (Y*Y)/(B*B) = 1.0
   *  and the equation of the first asymptote is Y = (B/A)*X
   *  where A is the major radius of the hyperbola and B is the
   *  minor radius of the hyperbola.
   *  Raised if MajorRadius = 0.0
   */
  public gp_Ax2d Asymptote1() {
    return new gp_Ax2d(OCCwrapJavaJNI.Geom2d_Hyperbola_Asymptote1(swigCPtr, this), true);
  }

  /**
   *  In the local coordinate system of the hyperbola the
   *  equation of the hyperbola is (X*X)/(A*A) - (Y*Y)/(B*B) = 1.0
   *  and the equation of the first asymptote is Y = -(B/A)*X.
   *  where A is the major radius of the hyperbola and B is the
   *  minor radius of the hyperbola.
   *  raised if MajorRadius = 0.0
   */
  public gp_Ax2d Asymptote2() {
    return new gp_Ax2d(OCCwrapJavaJNI.Geom2d_Hyperbola_Asymptote2(swigCPtr, this), true);
  }

  /**
   *  Computes the first conjugate branch relative to this hyperbola.
   *  Note: The diagram given under the class purpose
   *  indicates where these two branches of hyperbola are
   *  positioned in relation to this branch of hyperbola.
   */
  public gp_Hypr2d ConjugateBranch1() {
    return new gp_Hypr2d(OCCwrapJavaJNI.Geom2d_Hyperbola_ConjugateBranch1(swigCPtr, this), true);
  }

  /**
   *  Computes the second conjugate branch relative to this hyperbola.
   *  Note: The diagram given under the class purpose
   *  indicates where these two branches of hyperbola are
   *  positioned in relation to this branch of hyperbola.
   */
  public gp_Hypr2d ConjugateBranch2() {
    return new gp_Hypr2d(OCCwrapJavaJNI.Geom2d_Hyperbola_ConjugateBranch2(swigCPtr, this), true);
  }

  /**
   *  This directrix is the line normal to the XAxis of the hyperbola
   *  in the local plane (Z = 0) at a distance d = MajorRadius / e
   *  from the center of the hyperbola, where e is the eccentricity of
   *  the hyperbola.
   *  This line is parallel to the "YAxis". The intersection point
   *  between directrix1 and the "XAxis" is the location point of the
   *  directrix1. This point is on the positive side of the "XAxis".
   */
  public gp_Ax2d Directrix1() {
    return new gp_Ax2d(OCCwrapJavaJNI.Geom2d_Hyperbola_Directrix1(swigCPtr, this), true);
  }

  /**
   *  This line is obtained by the symmetrical transformation
   *  of "Directrix1" with respect to the "YAxis" of the hyperbola.
   */
  public gp_Ax2d Directrix2() {
    return new gp_Ax2d(OCCwrapJavaJNI.Geom2d_Hyperbola_Directrix2(swigCPtr, this), true);
  }

  /**
   *  Computes the focal distance. It is the distance between the
   *  two focus of the hyperbola.
   */
  public double Focal() {
    return OCCwrapJavaJNI.Geom2d_Hyperbola_Focal(swigCPtr, this);
  }

  /**
   *  Returns the first focus of the hyperbola. This focus is on the
   *  positive side of the "XAxis" of the hyperbola.
   */
  public gp_Pnt2d Focus1() {
    return new gp_Pnt2d(OCCwrapJavaJNI.Geom2d_Hyperbola_Focus1(swigCPtr, this), true);
  }

  /**
   *  Returns the second focus of the hyperbola. This focus is on the
   *  negative side of the "XAxis" of the hyperbola.
   */
  public gp_Pnt2d Focus2() {
    return new gp_Pnt2d(OCCwrapJavaJNI.Geom2d_Hyperbola_Focus2(swigCPtr, this), true);
  }

  /**
   *  Returns the major or minor radius of this hyperbola.
   *  The major radius is also the distance between the
   *  center of the hyperbola and the apex of the main
   *  branch (located on the "X Axis" of the hyperbola).
   */
  public double MajorRadius() {
    return OCCwrapJavaJNI.Geom2d_Hyperbola_MajorRadius(swigCPtr, this);
  }

  /**
   *  Returns the major or minor radius of this hyperbola.
   *  The minor radius is also the distance between the
   *  center of the hyperbola and the apex of a conjugate
   *  branch (located on the "Y Axis" of the hyperbola).
   */
  public double MinorRadius() {
    return OCCwrapJavaJNI.Geom2d_Hyperbola_MinorRadius(swigCPtr, this);
  }

  /**
   *  Computes the "other" branch of this hyperbola. This
   *  is a symmetrical branch with respect to the center of this hyperbola.
   *  Note: The diagram given under the class purpose
   *  indicates where the "other" branch is positioned in
   *  relation to this branch of the hyperbola.
   *  ^ YAxis
   *  |
   *  FirstConjugateBranch
   *  |
   *  Other   | Main
   *  ---------------------------- C
   *  ------------------------------------------&gtXAxis
   *  Branch |  Branch
   *  |
   *  |
   *  SecondConjugateBranch
   *  |
   *  Warning
   *  The major radius can be less than the minor radius.
   */
  public gp_Hypr2d OtherBranch() {
    return new gp_Hypr2d(OCCwrapJavaJNI.Geom2d_Hyperbola_OtherBranch(swigCPtr, this), true);
  }

  /**
   *  Computes the parameter of this hyperbola.
   *  The parameter is:
   *  p = (e*e - 1) * MajorRadius
   *  where e is the eccentricity of this hyperbola and
   *  MajorRadius its major radius.
   *  Exceptions
   *  Standard_DomainError if the major radius of this
   *  hyperbola is null.
   */
  public double Parameter() {
    return OCCwrapJavaJNI.Geom2d_Hyperbola_Parameter(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom2d_Hyperbola_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Hyperbola_get_type_descriptor(), true );
  }

  public static  Geom2d_Hyperbola  DownCast( Standard_Transient  T) {
    return new Geom2d_Hyperbola ( OCCwrapJavaJNI.Geom2d_Hyperbola_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Hyperbola_TypeOf(), true );
  }

}
