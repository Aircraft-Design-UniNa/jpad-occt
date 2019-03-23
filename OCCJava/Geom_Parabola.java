package opencascade;

/**
 *  Describes a parabola in 3D space.
 *  A parabola is defined by its focal length (i.e. the
 *  distance between its focus and its apex) and is
 *  positioned in space with a coordinate system
 *  (gp_Ax2 object) where:
 *  - the origin is the apex of the parabola,
 *  - the "X Axis" defines the axis of symmetry; the
 *  parabola is on the positive side of this axis,
 *  - the origin, "X Direction" and "Y Direction" define the
 *  plane of the parabola.
 *  This coordinate system is the local coordinate
 *  system of the parabola.
 *  The "main Direction" of this coordinate system is a
 *  vector normal to the plane of the parabola. The axis,
 *  of which the origin and unit vector are respectively the
 *  origin and "main Direction" of the local coordinate
 *  system, is termed the "Axis" or "main Axis" of the parabola.
 *  The "main Direction" of the local coordinate system
 *  gives an explicit orientation to the parabola,
 *  determining the direction in which the parameter
 *  increases along the parabola.
 *  The Geom_Parabola parabola is parameterized as follows:
 *  P(U) = O + U*U/(4.*F)*XDir + U*YDir
 *  where:
 *  - P is the point of parameter U,
 *  - O, XDir and YDir are respectively the origin, "X
 *  Direction" and "Y Direction" of its local coordinate system,
 *  - F is the focal length of the parabola.
 *  The parameter of the parabola is therefore its Y
 *  coordinate in the local coordinate system, with the "X
 *  Axis" of the local coordinate system defining the origin
 *  of the parameter.
 *  The parameter range is ] -infinite, +infinite [.
 */
public class Geom_Parabola extends Geom_Conic {
  Geom_Parabola(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates a parabola from a non transient one.
   */
  public Geom_Parabola( gp_Parab  Prb) {
    this(OCCwrapJavaJNI.new_Geom_Parabola__SWIG_0(gp_Parab.getCPtr(Prb), Prb), true);
  }

  /**
   *  Creates a parabola with its local coordinate system "A2"
   *  and it's focal length "Focal".
   *  The XDirection of A2 defines the axis of symmetry of the
   *  parabola. The YDirection of A2 is parallel to the directrix
   *  of the parabola. The Location point of A2 is the vertex of
   *  the parabola
   *  Raised if Focal < 0.0
   */
  public Geom_Parabola( gp_Ax2  A2, double Focal) {
    this(OCCwrapJavaJNI.new_Geom_Parabola__SWIG_1(gp_Ax2.getCPtr(A2), A2, Focal), true);
  }

  /**
   *  D is the directrix of the parabola and F the focus point.
   *  The symmetry axis (XAxis) of the parabola is normal to the
   *  directrix and pass through the focus point F, but its
   *  location point is the vertex of the parabola.
   *  The YAxis of the parabola is parallel to D and its location
   *  point is the vertex of the parabola. The normal to the plane
   *  of the parabola is the cross product between the XAxis and the
   *  YAxis.
   */
  public Geom_Parabola( gp_Ax1  D,  gp_Pnt  F) {
    this(OCCwrapJavaJNI.new_Geom_Parabola__SWIG_2(gp_Ax1.getCPtr(D), D, gp_Pnt.getCPtr(F), F), true);
  }

  /**
   *  Assigns the value Focal to the focal distance of this parabola.
   *  Exceptions Standard_ConstructionError if Focal is negative.
   */
  public void SetFocal(double Focal) {
    OCCwrapJavaJNI.Geom_Parabola_SetFocal(swigCPtr, this, Focal);
  }

  /**
   *  Converts the gp_Parab parabola Prb into this parabola.
   */
  public void SetParab( gp_Parab  Prb) {
    OCCwrapJavaJNI.Geom_Parabola_SetParab(swigCPtr, this, gp_Parab.getCPtr(Prb), Prb);
  }

  /**
   *  Returns the non transient parabola from gp with the same
   *  geometric properties as <me>.
   */
  public gp_Parab Parab() {
    return new gp_Parab(OCCwrapJavaJNI.Geom_Parabola_Parab(swigCPtr, this), true);
  }

  /**
   *  Computes the directrix of this parabola.
   *  This is a line normal to the axis of symmetry, in the
   *  plane of this parabola, located on the negative side
   *  of its axis of symmetry, at a distance from the apex
   *  equal to the focal length.
   *  The directrix is returned as an axis (gp_Ax1 object),
   *  where the origin is located on the "X Axis" of this parabola.
   */
  public gp_Ax1 Directrix() {
    return new gp_Ax1(OCCwrapJavaJNI.Geom_Parabola_Directrix(swigCPtr, this), true);
  }

  /**
   *  Computes the focus of this parabola. The focus is on the
   *  positive side of the "X Axis" of the local coordinate
   *  system of the parabola.
   */
  public gp_Pnt Focus() {
    return new gp_Pnt(OCCwrapJavaJNI.Geom_Parabola_Focus(swigCPtr, this), true);
  }

  /**
   *  Computes the focal distance of this parabola
   *  The focal distance is the distance between the apex
   *  and the focus of the parabola.
   */
  public double Focal() {
    return OCCwrapJavaJNI.Geom_Parabola_Focal(swigCPtr, this);
  }

  /**
   *  Computes the parameter of this parabola which is the
   *  distance between its focus and its directrix. This
   *  distance is twice the focal length.
   *  If P is the parameter of the parabola, the equation of
   *  the parabola in its local coordinate system is: Y**2 = 2.*P*X.
   */
  public double Parameter() {
    return OCCwrapJavaJNI.Geom_Parabola_Parameter(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_Parabola_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Parabola_get_type_descriptor(), true );
  }

  public static  Geom_Parabola  DownCast( Standard_Transient  T) {
    return new Geom_Parabola ( OCCwrapJavaJNI.Geom_Parabola_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Parabola_TypeOf(), true );
  }

}
