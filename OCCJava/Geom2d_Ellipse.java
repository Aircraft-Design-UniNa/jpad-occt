package opencascade;

/**
 *  Describes an ellipse in the plane (2D space).
 *  An ellipse is defined by its major and minor radii and,
 *  as with any conic curve, is positioned in the plane
 *  with a coordinate system (gp_Ax22d object) where:
 *  - the origin is the center of the ellipse,
 *  - the "X Direction" defines the major axis, and
 *  - the "Y Direction" defines the minor axis.
 *  This coordinate system is the local coordinate system of the ellipse.
 *  The orientation (direct or indirect) of the local
 *  coordinate system gives an explicit orientation to the
 *  ellipse, determining the direction in which the
 *  parameter increases along the ellipse.
 *  The Geom2d_Ellipse ellipse is parameterized by an angle:
 *  P(U) = O + MajorRad*Cos(U)*XDir + MinorRad*Sin(U)*YDir
 *  where:
 *  - P is the point of parameter U,
 *  - O, XDir and YDir are respectively the origin, "X
 *  Direction" and "Y Direction" of its local coordinate system,
 *  - MajorRad and MinorRad are the major and
 *  minor radii of the ellipse.
 *  The "X Axis" of the local coordinate system therefore
 *  defines the origin of the parameter of the ellipse.
 *  An ellipse is a closed and periodic curve. The period
 *  is 2.*Pi and the parameter range is [ 0,2.*Pi [.
 *  See Also
 *  GCE2d_MakeEllipse which provides functions for
 *  more complex ellipse constructions
 *  gp_Ax22d
 *  gp_Elips2d for an equivalent, non-parameterized data structure
 */
public class Geom2d_Ellipse extends Geom2d_Conic {
  Geom2d_Ellipse(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates an ellipse by conversion of the gp_Elips2d ellipse E.
   */
  public Geom2d_Ellipse( gp_Elips2d  E) {
    this(OCCwrapJavaJNI.new_Geom2d_Ellipse__SWIG_0(gp_Elips2d.getCPtr(E), E), true);
  }

  /**
   *  Creates an ellipse defined by its major and minor radii,
   *  MajorRadius and MinorRadius, and positioned
   *  in the plane by its major axis MajorAxis; the
   *  center of the ellipse is the origin of MajorAxis
   *  and the unit vector of MajorAxis is the "X
   *  Direction" of the local coordinate system of the
   *  ellipse; this coordinate system is direct if Sense
   *  is true (default value) or indirect if Sense is false.
   *  Warnings :
   *  It is not forbidden to create an ellipse with MajorRadius =
   *  MinorRadius.
   *  Exceptions
   *  Standard_ConstructionError if:
   *  - MajorRadius is less than MinorRadius, or
   *  - MinorRadius is less than 0.
   */
  public Geom2d_Ellipse( gp_Ax2d  MajorAxis, double MajorRadius, double MinorRadius, long Sense) {
    this(OCCwrapJavaJNI.new_Geom2d_Ellipse__SWIG_1(gp_Ax2d.getCPtr(MajorAxis), MajorAxis, MajorRadius, MinorRadius, Sense), true);
  }

  /**
   *  Creates an ellipse defined by its major and minor radii,
   *  MajorRadius and MinorRadius, where the
   *  coordinate system Axis locates the ellipse and
   *  defines its orientation in the plane such that:
   *  - the center of the ellipse is the origin of Axis,
   *  - the "X Direction" of Axis defines the major
   *  axis of the ellipse,
   *  - the "Y Direction" of Axis defines the minor
   *  axis of the ellipse,
   *  - the orientation of Axis (direct or indirect)
   *  gives the orientation of the ellipse.
   *  Warnings :
   *  It is not forbidden to create an ellipse with MajorRadius =
   *  MinorRadius.
   *  Exceptions
   *  Standard_ConstructionError if:
   *  - MajorRadius is less than MinorRadius, or
   *  - MinorRadius is less than 0.
   */
  public Geom2d_Ellipse( gp_Ax2d  MajorAxis, double MajorRadius, double MinorRadius) {
    this(OCCwrapJavaJNI.new_Geom2d_Ellipse__SWIG_2(gp_Ax2d.getCPtr(MajorAxis), MajorAxis, MajorRadius, MinorRadius), true);
  }

  public Geom2d_Ellipse( gp_Ax22d  Axis, double MajorRadius, double MinorRadius) {
    this(OCCwrapJavaJNI.new_Geom2d_Ellipse__SWIG_3(gp_Ax22d.getCPtr(Axis), Axis, MajorRadius, MinorRadius), true);
  }

  /**
   *  Converts the gp_Elips2d ellipse E into this ellipse.
   */
  public void SetElips2d( gp_Elips2d  E) {
    OCCwrapJavaJNI.Geom2d_Ellipse_SetElips2d(swigCPtr, this, gp_Elips2d.getCPtr(E), E);
  }

  /**
   *  Assigns a value to the major radius of this ellipse.
   *  Exceptions
   *  Standard_ConstructionError if:
   *  - the major radius of this ellipse becomes less than
   *  the minor radius, or
   *  - MinorRadius is less than 0.
   */
  public void SetMajorRadius(double MajorRadius) {
    OCCwrapJavaJNI.Geom2d_Ellipse_SetMajorRadius(swigCPtr, this, MajorRadius);
  }

  /**
   *  Assigns a value to the minor radius of this ellipse.
   *  Exceptions
   *  Standard_ConstructionError if:
   *  - the major radius of this ellipse becomes less than
   *  the minor radius, or
   *  - MinorRadius is less than 0.
   */
  public void SetMinorRadius(double MinorRadius) {
    OCCwrapJavaJNI.Geom2d_Ellipse_SetMinorRadius(swigCPtr, this, MinorRadius);
  }

  /**
   *  Converts this ellipse into a gp_Elips2d ellipse.
   */
  public gp_Elips2d Elips2d() {
    return new gp_Elips2d(OCCwrapJavaJNI.Geom2d_Ellipse_Elips2d(swigCPtr, this), true);
  }

  /**
   *  Computes the directrices of this ellipse.
   *  This directrix is the line normal to the XAxis of the ellipse
   *  in the local plane (Z = 0) at a distance d = MajorRadius / e
   *  from the center of the ellipse, where e is the eccentricity of
   *  the ellipse.
   *  This line is parallel to the "YAxis". The intersection point
   *  between directrix1 and the "XAxis" is the "Location" point
   *  of the directrix1. This point is on the positive side of
   *  the "XAxis".
   *  Raises ConstructionError if Eccentricity = 0.0. (The ellipse degenerates
   *  into a circle)
   */
  public gp_Ax2d Directrix1() {
    return new gp_Ax2d(OCCwrapJavaJNI.Geom2d_Ellipse_Directrix1(swigCPtr, this), true);
  }

  /**
   *  This line is obtained by the symmetrical transformation
   *  of "Directrix1" with respect to the "YAxis" of the ellipse.
   *  Raises ConstructionError if Eccentricity = 0.0. (The ellipse degenerates into a
   *  circle).
   */
  public gp_Ax2d Directrix2() {
    return new gp_Ax2d(OCCwrapJavaJNI.Geom2d_Ellipse_Directrix2(swigCPtr, this), true);
  }

  /**
   *  Computes the focal distance. The focal distance is the distance between the center
   *  and a focus of the ellipse.
   */
  public double Focal() {
    return OCCwrapJavaJNI.Geom2d_Ellipse_Focal(swigCPtr, this);
  }

  /**
   *  Returns the first focus of the ellipse. This focus is on the
   *  positive side of the "XAxis" of the ellipse.
   */
  public gp_Pnt2d Focus1() {
    return new gp_Pnt2d(OCCwrapJavaJNI.Geom2d_Ellipse_Focus1(swigCPtr, this), true);
  }

  /**
   *  Returns the second focus of the ellipse. This focus is on
   *  the negative side of the "XAxis" of the ellipse.
   */
  public gp_Pnt2d Focus2() {
    return new gp_Pnt2d(OCCwrapJavaJNI.Geom2d_Ellipse_Focus2(swigCPtr, this), true);
  }

  /**
   *  Returns the major radius of this ellipse.
   */
  public double MajorRadius() {
    return OCCwrapJavaJNI.Geom2d_Ellipse_MajorRadius(swigCPtr, this);
  }

  /**
   *  Returns the minor radius of this ellipse.
   */
  public double MinorRadius() {
    return OCCwrapJavaJNI.Geom2d_Ellipse_MinorRadius(swigCPtr, this);
  }

  /**
   *  Computes the parameter of this ellipse. This value is
   *  given by the formula p = (1 - e * e) * MajorRadius where e is the eccentricity
   *  of the ellipse.
   *  Returns 0 if MajorRadius = 0
   */
  public double Parameter() {
    return OCCwrapJavaJNI.Geom2d_Ellipse_Parameter(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom2d_Ellipse_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Ellipse_get_type_descriptor(), true );
  }

  public static  Geom2d_Ellipse  DownCast( Standard_Transient  T) {
    return new Geom2d_Ellipse ( OCCwrapJavaJNI.Geom2d_Ellipse_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Ellipse_TypeOf(), true );
  }

}
