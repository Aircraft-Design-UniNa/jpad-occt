package opencascade;

/**
 *  Describes a branch of a hyperbola in 3D space.
 *  A hyperbola is defined by its major and minor radii
 *  and, as with any conic curve, is positioned in space
 *  with a right-handed coordinate system (gp_Ax2 object) where:
 *  - the origin is the center of the hyperbola,
 *  - the "X Direction" defines the major axis, and
 *  - the "Y Direction" defines the minor axis.
 *  The origin, "X Direction" and "Y Direction" of this
 *  coordinate system define the plane of the hyperbola.
 *  The coordinate system is the local coordinate
 *  system of the hyperbola.
 *  The branch of the hyperbola described is the one
 *  located on the positive side of the major axis.
 *  The "main Direction" of the local coordinate system is
 *  a vector normal to the plane of the hyperbola. The
 *  axis, of which the origin and unit vector are
 *  respectively the origin and "main Direction" of the
 *  local coordinate system, is termed the "Axis" or "main
 *  Axis" of the hyperbola.
 *  The "main Direction" of the local coordinate system
 *  gives an explicit orientation to the hyperbola,
 *  determining the direction in which the parameter
 *  increases along the hyperbola.
 *  The Geom_Hyperbola hyperbola is parameterized as follows:
 *  P(U) = O + MajRad*Cosh(U)*XDir + MinRad*Sinh(U)*YDir, where:
 *  - P is the point of parameter U,
 *  - O, XDir and YDir are respectively the origin, "X
 *  Direction" and "Y Direction" of its local coordinate system,
 *  - MajRad and MinRad are the major and minor radii of the hyperbola.
 *  The "X Axis" of the local coordinate system therefore
 *  defines the origin of the parameter of the hyperbola.
 *  The parameter range is ] -infinite, +infinite [.
 *  The following diagram illustrates the respective
 *  positions, in the plane of the hyperbola, of the three
 *  branches of hyperbolas constructed using the
 *  functions OtherBranch, ConjugateBranch1 and
 *  ConjugateBranch2: Defines the main branch of an hyperbola.
 *  ^YAxis
 *  |
 *  FirstConjugateBranch
 *  |
 *  Other            |                Main
 *  --------------------- C ------------------------------>XAxis
 *  Branch           |                Branch
 *  |
 *  SecondConjugateBranch
 *  |
 *  Warning
 *  The value of the major radius (on the major axis) can
 *  be less than the value of the minor radius (on the minor axis).
 */
public class Geom_Hyperbola extends Geom_Conic {
  Geom_Hyperbola(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Constructs a hyperbola by conversion of the gp_Hypr hyperbola H.
   */
  public Geom_Hyperbola( gp_Hypr  H) {
    this(OCCwrapJavaJNI.new_Geom_Hyperbola__SWIG_0(gp_Hypr.getCPtr(H), H), true);
  }

  /**
   *  Constructs a hyperbola defined by its major and
   *  minor radii, MajorRadius and MinorRadius, where A2 locates the
   *  hyperbola and defines its orientation in 3D space such that:
   *  - the center of the hyperbola is the origin of A2,
   *  - the "X Direction" of A2 defines the major axis
   *  of the hyperbola, i.e. the major radius
   *  MajorRadius is measured along this axis,
   *  - the "Y Direction" of A2 defines the minor axis
   *  of the hyperbola, i.e. the minor radius
   *  MinorRadius is measured along this axis,
   *  - A2 is the local coordinate system of the   hyperbola.
   *  Exceptions
   *  Standard_ConstructionError if:
   *  - MajorRadius is less than 0.0,
   *  - MinorRadius is less than 0.0.
   */
  public Geom_Hyperbola( gp_Ax2  A2, double MajorRadius, double MinorRadius) {
    this(OCCwrapJavaJNI.new_Geom_Hyperbola__SWIG_1(gp_Ax2.getCPtr(A2), A2, MajorRadius, MinorRadius), true);
  }

  /**
   *  Converts the gp_Hypr hyperbola H into this hyperbola.
   */
  public void SetHypr( gp_Hypr  H) {
    OCCwrapJavaJNI.Geom_Hyperbola_SetHypr(swigCPtr, this, gp_Hypr.getCPtr(H), H);
  }

  /**
   *  Assigns a value to the major radius of this hyperbola.
   *  Exceptions
   *  Standard_ConstructionError if:
   *  - MajorRadius is less than 0.0, or
   *  - MinorRadius is less than 0.0.Raised if MajorRadius < 0.0
   */
  public void SetMajorRadius(double MajorRadius) {
    OCCwrapJavaJNI.Geom_Hyperbola_SetMajorRadius(swigCPtr, this, MajorRadius);
  }

  /**
   *  Assigns a value to the minor radius of this hyperbola.
   *  Exceptions
   *  Standard_ConstructionError if:
   *  - MajorRadius is less than 0.0, or
   *  - MinorRadius is less than 0.0.Raised if MajorRadius < 0.0
   */
  public void SetMinorRadius(double MinorRadius) {
    OCCwrapJavaJNI.Geom_Hyperbola_SetMinorRadius(swigCPtr, this, MinorRadius);
  }

  /**
   *  returns the non transient parabola from gp with the same
   *  geometric properties as <me>.
   */
  public gp_Hypr Hypr() {
    return new gp_Hypr(OCCwrapJavaJNI.Geom_Hyperbola_Hypr(swigCPtr, this), true);
  }

  /**
   *  In the local coordinate system of the hyperbola the equation of
   *  the hyperbola is (X*X)/(A*A) - (Y*Y)/(B*B) = 1.0 and the
   *  equation of the first asymptote is Y = (B/A)*X.
   *  Raises ConstructionError if MajorRadius = 0.0
   */
  public gp_Ax1 Asymptote1() {
    return new gp_Ax1(OCCwrapJavaJNI.Geom_Hyperbola_Asymptote1(swigCPtr, this), true);
  }

  /**
   *  In the local coordinate system of the hyperbola the equation of
   *  the hyperbola is (X*X)/(A*A) - (Y*Y)/(B*B) = 1.0 and the
   *  equation of the first asymptote is Y = -(B/A)*X.
   *  Raises ConstructionError if MajorRadius = 0.0
   */
  public gp_Ax1 Asymptote2() {
    return new gp_Ax1(OCCwrapJavaJNI.Geom_Hyperbola_Asymptote2(swigCPtr, this), true);
  }

  /**
   *  This branch of hyperbola is on the positive side of the
   *  YAxis of <me>.
   */
  public gp_Hypr ConjugateBranch1() {
    return new gp_Hypr(OCCwrapJavaJNI.Geom_Hyperbola_ConjugateBranch1(swigCPtr, this), true);
  }

  /**
   *  This branch of hyperbola is on the negative side of the
   *  YAxis of <me>.
   *  Note: The diagram given under the class purpose
   *  indicates where these two branches of hyperbola are
   *  positioned in relation to this branch of hyperbola.
   */
  public gp_Hypr ConjugateBranch2() {
    return new gp_Hypr(OCCwrapJavaJNI.Geom_Hyperbola_ConjugateBranch2(swigCPtr, this), true);
  }

  /**
   *  This directrix is the line normal to the XAxis of the hyperbola
   *  in the local plane (Z = 0) at a distance d = MajorRadius / e
   *  from the center of the hyperbola, where e is the eccentricity of
   *  the hyperbola.
   *  This line is parallel to the YAxis. The intersection point between
   *  directrix1 and the XAxis is the location point of the directrix1.
   *  This point is on the positive side of the XAxis.
   */
  public gp_Ax1 Directrix1() {
    return new gp_Ax1(OCCwrapJavaJNI.Geom_Hyperbola_Directrix1(swigCPtr, this), true);
  }

  /**
   *  This line is obtained by the symmetrical transformation
   *  of "directrix1" with respect to the YAxis of the hyperbola.
   */
  public gp_Ax1 Directrix2() {
    return new gp_Ax1(OCCwrapJavaJNI.Geom_Hyperbola_Directrix2(swigCPtr, this), true);
  }

  /**
   *  Computes the focal distance. It is the distance between the
   *  two focus of the hyperbola.
   */
  public double Focal() {
    return OCCwrapJavaJNI.Geom_Hyperbola_Focal(swigCPtr, this);
  }

  /**
   *  Returns the first focus of the hyperbola. This focus is on the
   *  positive side of the XAxis of the hyperbola.
   */
  public gp_Pnt Focus1() {
    return new gp_Pnt(OCCwrapJavaJNI.Geom_Hyperbola_Focus1(swigCPtr, this), true);
  }

  /**
   *  Returns the second focus of the hyperbola. This focus is on the
   *  negative side of the XAxis of the hyperbola.
   */
  public gp_Pnt Focus2() {
    return new gp_Pnt(OCCwrapJavaJNI.Geom_Hyperbola_Focus2(swigCPtr, this), true);
  }

  /**
   *  Returns the major or minor radius of this hyperbola.
   *  The major radius is also the distance between the
   *  center of the hyperbola and the apex of the main
   *  branch (located on the "X Axis" of the hyperbola).
   */
  public double MajorRadius() {
    return OCCwrapJavaJNI.Geom_Hyperbola_MajorRadius(swigCPtr, this);
  }

  /**
   *  Returns the major or minor radius of this hyperbola.
   *  The minor radius is also the distance between the
   *  center of the hyperbola and the apex of a conjugate
   *  branch (located on the "Y Axis" of the hyperbola).
   */
  public double MinorRadius() {
    return OCCwrapJavaJNI.Geom_Hyperbola_MinorRadius(swigCPtr, this);
  }

  /**
   *  Computes the "other" branch of this hyperbola. This
   *  is the symmetrical branch with respect to the center of this hyperbola.
   *  Note: The diagram given under the class purpose
   *  indicates where the "other" branch is positioned in
   *  relation to this branch of the hyperbola.
   */
  public gp_Hypr OtherBranch() {
    return new gp_Hypr(OCCwrapJavaJNI.Geom_Hyperbola_OtherBranch(swigCPtr, this), true);
  }

  /**
   *  Returns p = (e * e - 1) * MajorRadius where e is the
   *  eccentricity of the hyperbola.
   *  raised if MajorRadius = 0.0
   */
  public double Parameter() {
    return OCCwrapJavaJNI.Geom_Hyperbola_Parameter(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_Hyperbola_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Hyperbola_get_type_descriptor(), true );
  }

  public static  Geom_Hyperbola  DownCast( Standard_Transient  T) {
    return new Geom_Hyperbola ( OCCwrapJavaJNI.Geom_Hyperbola_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Hyperbola_TypeOf(), true );
  }

}
