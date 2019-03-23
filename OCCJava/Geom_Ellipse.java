package opencascade;

/**
 *  Describes an ellipse in 3D space.
 *  An ellipse is defined by its major and minor radii and,
 *  as with any conic curve, is positioned in space with a
 *  right-handed coordinate system (gp_Ax2 object) where:
 *  - the origin is the center of the ellipse,
 *  - the "X Direction" defines the major axis, and
 *  - the "Y Direction" defines the minor axis.
 *  The origin, "X Direction" and "Y Direction" of this
 *  coordinate system define the plane of the ellipse. The
 *  coordinate system is the local coordinate system of the ellipse.
 *  The "main Direction" of this coordinate system is the
 *  vector normal to the plane of the ellipse. The axis, of
 *  which the origin and unit vector are respectively the
 *  origin and "main Direction" of the local coordinate
 *  system, is termed the "Axis" or "main Axis" of the ellipse.
 *  The "main Direction" of the local coordinate system
 *  gives an explicit orientation to the ellipse (definition of
 *  the trigonometric sense), determining the direction in
 *  which the parameter increases along the ellipse.
 *  The Geom_Ellipse ellipse is parameterized by an angle:
 *  P(U) = O + MajorRad*Cos(U)*XDir + MinorRad*Sin(U)*YDir
 *  where:
 *  - P is the point of parameter U,
 *  - O, XDir and YDir are respectively the origin, "X
 *  Direction" and "Y Direction" of its local coordinate system,
 *  - MajorRad and MinorRad are the major and minor radii of the ellipse.
 *  The "X Axis" of the local coordinate system therefore
 *  defines the origin of the parameter of the ellipse.
 *  An ellipse is a closed and periodic curve. The period
 *  is 2.*Pi and the parameter range is [ 0, 2.*Pi [.
 */
public class Geom_Ellipse extends Geom_Conic {
  Geom_Ellipse(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Constructs an ellipse by conversion of the gp_Elips ellipse E.
   */
  public Geom_Ellipse( gp_Elips  E) {
    this(OCCwrapJavaJNI.new_Geom_Ellipse__SWIG_0(gp_Elips.getCPtr(E), E), true);
  }

  /**
   *  Constructs an ellipse
   *  defined by its major and minor radii, MajorRadius
   *  and MinorRadius, where A2 locates the ellipse
   *  and defines its orientation in 3D space such that:
   *  - the center of the ellipse is the origin of A2,
   *  - the "X Direction" of A2 defines the major axis
   *  of the ellipse, i.e. the major radius
   *  MajorRadius is measured along this axis,
   *  - the "Y Direction" of A2 defines the minor axis
   *  of the ellipse, i.e. the minor radius
   *  MinorRadius is measured along this axis,
   *  - A2 is the local coordinate system of the ellipse.
   *  Exceptions
   *  Standard_ConstructionError if:
   *  - MajorRadius is less than MinorRadius, or
   *  - MinorRadius is less than 0.
   *  Warning The Geom package does not prevent the
   *  construction of an ellipse where MajorRadius and
   *  MinorRadius are equal.
   */
  public Geom_Ellipse( gp_Ax2  A2, double MajorRadius, double MinorRadius) {
    this(OCCwrapJavaJNI.new_Geom_Ellipse__SWIG_1(gp_Ax2.getCPtr(A2), A2, MajorRadius, MinorRadius), true);
  }

  /**
   *  Converts the gp_Elips ellipse E into this ellipse.
   */
  public void SetElips( gp_Elips  E) {
    OCCwrapJavaJNI.Geom_Ellipse_SetElips(swigCPtr, this, gp_Elips.getCPtr(E), E);
  }

  /**
   *  Assigns a value to the major radius of this ellipse.
   *  ConstructionError raised if MajorRadius < MinorRadius.
   */
  public void SetMajorRadius(double MajorRadius) {
    OCCwrapJavaJNI.Geom_Ellipse_SetMajorRadius(swigCPtr, this, MajorRadius);
  }

  /**
   *  Assigns a value to the minor radius of this ellipse.
   *  ConstructionError raised if MajorRadius < MinorRadius or if MinorRadius < 0.
   */
  public void SetMinorRadius(double MinorRadius) {
    OCCwrapJavaJNI.Geom_Ellipse_SetMinorRadius(swigCPtr, this, MinorRadius);
  }

  /**
   *  returns the non transient ellipse from gp with the same
   */
  public gp_Elips Elips() {
    return new gp_Elips(OCCwrapJavaJNI.Geom_Ellipse_Elips(swigCPtr, this), true);
  }

  /**
   *  This directrix is the line normal to the XAxis of the ellipse
   *  in the local plane (Z = 0) at a distance d = MajorRadius / e
   *  from the center of the ellipse, where e is the eccentricity of
   *  the ellipse.
   *  This line is parallel to the "YAxis". The intersection point
   *  between directrix1 and the "XAxis" is the "Location" point
   *  of the directrix1. This point is on the positive side of
   *  the "XAxis".
   *  Raised if Eccentricity = 0.0. (The ellipse degenerates
   *  into a circle)
   */
  public gp_Ax1 Directrix1() {
    return new gp_Ax1(OCCwrapJavaJNI.Geom_Ellipse_Directrix1(swigCPtr, this), true);
  }

  /**
   *  This line is obtained by the symmetrical transformation
   *  of "Directrix1" with respect to the "YAxis" of the ellipse.
   * 
   *  Raised if Eccentricity = 0.0. (The ellipse degenerates into a
   *  circle).
   */
  public gp_Ax1 Directrix2() {
    return new gp_Ax1(OCCwrapJavaJNI.Geom_Ellipse_Directrix2(swigCPtr, this), true);
  }

  /**
   *  Computes the focal distance. It is the distance between the
   *  the two focus of the ellipse.
   */
  public double Focal() {
    return OCCwrapJavaJNI.Geom_Ellipse_Focal(swigCPtr, this);
  }

  /**
   *  Returns the first focus of the ellipse. This focus is on the
   *  positive side of the "XAxis" of the ellipse.
   */
  public gp_Pnt Focus1() {
    return new gp_Pnt(OCCwrapJavaJNI.Geom_Ellipse_Focus1(swigCPtr, this), true);
  }

  /**
   *  Returns the second focus of the ellipse. This focus is on
   *  the negative side of the "XAxis" of the ellipse.
   */
  public gp_Pnt Focus2() {
    return new gp_Pnt(OCCwrapJavaJNI.Geom_Ellipse_Focus2(swigCPtr, this), true);
  }

  /**
   *  Returns the major  radius of this ellipse.
   */
  public double MajorRadius() {
    return OCCwrapJavaJNI.Geom_Ellipse_MajorRadius(swigCPtr, this);
  }

  /**
   *  Returns the minor radius of this ellipse.
   */
  public double MinorRadius() {
    return OCCwrapJavaJNI.Geom_Ellipse_MinorRadius(swigCPtr, this);
  }

  /**
   *  Returns p = (1 - e * e) * MajorRadius where e is the eccentricity
   *  of the ellipse.
   *  Returns 0 if MajorRadius = 0
   */
  public double Parameter() {
    return OCCwrapJavaJNI.Geom_Ellipse_Parameter(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_Ellipse_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Ellipse_get_type_descriptor(), true );
  }

  public static  Geom_Ellipse  DownCast( Standard_Transient  T) {
    return new Geom_Ellipse ( OCCwrapJavaJNI.Geom_Ellipse_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Ellipse_TypeOf(), true );
  }

}
