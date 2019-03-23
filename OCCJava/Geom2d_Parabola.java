package opencascade;

/**
 *  Describes a parabola in the plane (2D space).
 *  A parabola is defined by its focal length (i.e. the
 *  distance between its focus and its apex) and is
 *  positioned in the plane with a coordinate system
 *  (gp_Ax22d object) where:
 *  - the origin is the apex of the parabola, and
 *  - the "X Axis" defines the axis of symmetry; the
 *  parabola is on the positive side of this axis.
 *  This coordinate system is the local coordinate
 *  system of the parabola.
 *  The orientation (direct or indirect) of the local
 *  coordinate system gives an explicit orientation to the
 *  parabola, determining the direction in which the
 *  parameter increases along the parabola.
 *  The Geom_Parabola parabola is parameterized as follows:
 *  P(U) = O + U*U/(4.*F)*XDir + U*YDir, where:
 *  - P is the point of parameter U,
 *  - O, XDir and YDir are respectively the origin, "X
 *  Direction" and "Y Direction" of its local coordinate system,
 *  - F is the focal length of the parabola.
 *  The parameter of the parabola is therefore its Y
 *  coordinate in the local coordinate system, with the "X
 *  Axis" of the local coordinate system defining the
 *  origin of the parameter.
 *  The parameter range is ] -infinite,+infinite [.
 */
public class Geom2d_Parabola extends Geom2d_Conic {
  Geom2d_Parabola(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates a parabola from a non persistent one.
   */
  public Geom2d_Parabola( gp_Parab2d  Prb) {
    this(OCCwrapJavaJNI.new_Geom2d_Parabola__SWIG_0(gp_Parab2d.getCPtr(Prb), Prb), true);
  }

  /**
   *  Creates a parabola with its "MirrorAxis" and it's focal
   *  length "Focal".
   *  MirrorAxis is the axis of symmetry of the curve, it is the
   *  "XAxis". The "YAxis" is parallel to the directrix of the
   *  parabola and is in the direct sense if Sense is True.
   *  The "Location" point of "MirrorAxis" is the vertex of the parabola
   *  Raised if Focal < 0.0
   */
  public Geom2d_Parabola( gp_Ax2d  MirrorAxis, double Focal, long Sense) {
    this(OCCwrapJavaJNI.new_Geom2d_Parabola__SWIG_1(gp_Ax2d.getCPtr(MirrorAxis), MirrorAxis, Focal, Sense), true);
  }

  /**
   *  Creates a parabola with its Axis and it's focal
   *  length "Focal".
   *  The XDirection of Axis is the axis of symmetry of the curve,
   *  it is the "XAxis". The "YAxis" is parallel to the directrix of the
   *  parabola. The "Location" point of "Axis" is the vertex
   *  of the parabola.
   *  Raised if Focal < 0.0
   */
  public Geom2d_Parabola( gp_Ax2d  MirrorAxis, double Focal) {
    this(OCCwrapJavaJNI.new_Geom2d_Parabola__SWIG_2(gp_Ax2d.getCPtr(MirrorAxis), MirrorAxis, Focal), true);
  }

  /**
   *  D is the directrix of the parabola and F the focus point.
   *  The symmetry axis "XAxis" of the parabola is normal to the
   *  directrix and pass through the focus point F, but its
   *  "Location" point is the vertex of the parabola.
   *  The "YAxis" of the parabola is parallel to D and its "Location"
   *  point is the vertex of the parabola.
   */
  public Geom2d_Parabola( gp_Ax22d  Axis, double Focal) {
    this(OCCwrapJavaJNI.new_Geom2d_Parabola__SWIG_3(gp_Ax22d.getCPtr(Axis), Axis, Focal), true);
  }

  public Geom2d_Parabola( gp_Ax2d  D,  gp_Pnt2d  F) {
    this(OCCwrapJavaJNI.new_Geom2d_Parabola__SWIG_4(gp_Ax2d.getCPtr(D), D, gp_Pnt2d.getCPtr(F), F), true);
  }

  /**
   *  Assigns the value Focal to the focal length of this parabola.
   *  Exceptions Standard_ConstructionError if Focal is negative.
   */
  public void SetFocal(double Focal) {
    OCCwrapJavaJNI.Geom2d_Parabola_SetFocal(swigCPtr, this, Focal);
  }

  /**
   *  Converts the gp_Parab2d parabola Prb into this parabola.
   */
  public void SetParab2d( gp_Parab2d  Prb) {
    OCCwrapJavaJNI.Geom2d_Parabola_SetParab2d(swigCPtr, this, gp_Parab2d.getCPtr(Prb), Prb);
  }

  /**
   *  Returns the non persistent parabola from gp with the same
   *  geometric properties as <me>.
   */
  public gp_Parab2d Parab2d() {
    return new gp_Parab2d(OCCwrapJavaJNI.Geom2d_Parabola_Parab2d(swigCPtr, this), true);
  }

  /**
   *  The directrix is parallel to the "YAxis" of the parabola.
   *  The "Location" point of the directrix is the intersection
   *  point between the directrix and the symmetry axis ("XAxis") of the parabola.
   */
  public gp_Ax2d Directrix() {
    return new gp_Ax2d(OCCwrapJavaJNI.Geom2d_Parabola_Directrix(swigCPtr, this), true);
  }

  /**
   *  Computes the focus of this parabola The focus is on the
   *  positive side of the "X Axis" of the local coordinate system of the parabola.
   */
  public gp_Pnt2d Focus() {
    return new gp_Pnt2d(OCCwrapJavaJNI.Geom2d_Parabola_Focus(swigCPtr, this), true);
  }

  /**
   *  Computes the focal length of this parabola.
   *  The focal length is the distance between the apex and the focus of the parabola.
   */
  public double Focal() {
    return OCCwrapJavaJNI.Geom2d_Parabola_Focal(swigCPtr, this);
  }

  /**
   *  Computes the parameter of this parabola, which is
   *  the distance between its focus and its directrix. This
   *  distance is twice the focal length.
   *  If P is the parameter of the parabola, the equation of
   *  the parabola in its local coordinate system is: Y**2 = 2.*P*X.
   */
  public double Parameter() {
    return OCCwrapJavaJNI.Geom2d_Parabola_Parameter(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom2d_Parabola_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Parabola_get_type_descriptor(), true );
  }

  public static  Geom2d_Parabola  DownCast( Standard_Transient  T) {
    return new Geom2d_Parabola ( OCCwrapJavaJNI.Geom2d_Parabola_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Parabola_TypeOf(), true );
  }

}
