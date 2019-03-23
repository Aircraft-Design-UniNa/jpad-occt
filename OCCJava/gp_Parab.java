package opencascade;

/**
 *  Describes a parabola in 3D space.
 *  A parabola is defined by its focal length (that is, the
 *  distance between its focus and apex) and positioned in
 *  space with a coordinate system (a gp_Ax2 object)
 *  where:
 *  -   the origin of the coordinate system is on the apex of
 *  the parabola,
 *  -   the "X Axis" of the coordinate system is the axis of
 *  symmetry; the parabola is on the positive side of this axis, and
 *  -   the origin, "X Direction" and "Y Direction" of the
 *  coordinate system define the plane of the parabola.
 *  The equation of the parabola in this coordinate system,
 *  which is the "local coordinate system" of the parabola, is:
 *  Y**2 = (2*P) * X.
 *  where P, referred to as the parameter of the parabola, is
 *  the distance between the focus and the directrix (P is
 *  twice the focal length).
 *  The "main Direction" of the local coordinate system gives
 *  the normal vector to the plane of the parabola.
 *  See Also
 *  gce_MakeParab which provides functions for more
 *  complex parabola constructions
 *  Geom_Parabola which provides additional functions for
 *  constructing parabolas and works, in particular, with the
 *  parametric equations of parabolas
 */
public class gp_Parab {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Parab(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Parab(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Parab obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Parab ptr) { Ptr = ptr; }
    public gp_Parab AsReference () { return Ptr; }
    public gp_Parab AsCopy () { return Ptr.MakeCopy(); }
    public gp_Parab Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Parab(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an indefinite Parabola.
   */
  public gp_Parab() {
    this(OCCwrapJavaJNI.new_gp_Parab__SWIG_0(), true);
  }

  /**
   *  Creates a parabola with its local coordinate system "A2"
   *  and it's focal length "Focal".
   *  The XDirection of A2 defines the axis of symmetry of the
   *  parabola. The YDirection of A2 is parallel to the directrix
   *  of the parabola. The Location point of A2 is the vertex of
   *  the parabola
   *  Raises ConstructionError if Focal < 0.0
   *  Raised if Focal < 0.0
   */
  public gp_Parab( gp_Ax2  A2, double Focal) {
    this(OCCwrapJavaJNI.new_gp_Parab__SWIG_1(gp_Ax2.getCPtr(A2), A2, Focal), true);
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
  public gp_Parab( gp_Ax1  D,  gp_Pnt  F) {
    this(OCCwrapJavaJNI.new_gp_Parab__SWIG_2(gp_Ax1.getCPtr(D), D, gp_Pnt.getCPtr(F), F), true);
  }

  /**
   *  Modifies this parabola by redefining its local coordinate system so that
   *  -   its origin and "main Direction" become those of the
   *  axis A1 (the "X Direction" and "Y Direction" are then
   *  recomputed in the same way as for any gp_Ax2)
   *  Raises ConstructionError if the direction of A1 is parallel to the previous
   *  XAxis of the parabola.
   */
  public void SetAxis( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Parab_SetAxis(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Changes the focal distance of the parabola.
   *  Raises ConstructionError if Focal < 0.0
   */
  public void SetFocal(double Focal) {
    OCCwrapJavaJNI.gp_Parab_SetFocal(swigCPtr, this, Focal);
  }

  /**
   *  Changes the location of the parabola. It is the vertex of
   *  the parabola.
   */
  public void SetLocation( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Parab_SetLocation(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Changes the local coordinate system of the parabola.
   */
  public void SetPosition( gp_Ax2  A2) {
    OCCwrapJavaJNI.gp_Parab_SetPosition(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Returns the main axis of the parabola.
   *  It is the axis normal to the plane of the parabola passing
   *  through the vertex of the parabola.
   */
  public  gp_Ax1  Axis() {
    gp_Ax1 ret = new gp_Ax1(OCCwrapJavaJNI.gp_Parab_Axis(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Computes the directrix of this parabola.
   *  The directrix is:
   *  -   a line parallel to the "Y Direction" of the local
   *  coordinate system of this parabola, and
   *  -   located on the negative side of the axis of symmetry,
   *  at a distance from the apex which is equal to the focal
   *  length of this parabola.
   *  The directrix is returned as an axis (a gp_Ax1 object),
   *  the origin of which is situated on the "X Axis" of this parabola.
   */
  public gp_Ax1 Directrix() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Parab_Directrix(swigCPtr, this), true);
  }

  /**
   *  Returns the distance between the vertex and the focus
   *  of the parabola.
   */
  public double Focal() {
    return OCCwrapJavaJNI.gp_Parab_Focal(swigCPtr, this);
  }

  /**
   *  -   Computes the focus of the parabola.
   */
  public gp_Pnt Focus() {
    return new gp_Pnt(OCCwrapJavaJNI.gp_Parab_Focus(swigCPtr, this), true);
  }

  /**
   *  Returns the vertex of the parabola. It is the "Location"
   *  point of the coordinate system of the parabola.
   */
  public  gp_Pnt  Location() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.gp_Parab_Location(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Computes the parameter of the parabola.
   *  It is the distance between the focus and the directrix of
   *  the parabola. This distance is twice the focal length.
   */
  public double Parameter() {
    return OCCwrapJavaJNI.gp_Parab_Parameter(swigCPtr, this);
  }

  /**
   *  Returns the local coordinate system of the parabola.
   */
  public  gp_Ax2  Position() {
    gp_Ax2 ret = new gp_Ax2(OCCwrapJavaJNI.gp_Parab_Position(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the symmetry axis of the parabola. The location point
   *  of the axis is the vertex of the parabola.
   */
  public gp_Ax1 XAxis() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Parab_XAxis(swigCPtr, this), true);
  }

  /**
   *  It is an axis parallel to the directrix of the parabola.
   *  The location point of this axis is the vertex of the parabola.
   */
  public gp_Ax1 YAxis() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Parab_YAxis(swigCPtr, this), true);
  }

  public void Mirror( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Parab_Mirror__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of a parabola
   *  with respect to the point P which is the center of the
   *  symmetry.
   */
  public gp_Parab Mirrored( gp_Pnt  P) {
    return new gp_Parab(OCCwrapJavaJNI.gp_Parab_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P), true);
  }

  public void Mirror( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Parab_Mirror__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Performs the symmetrical transformation of a parabola
   *  with respect to an axis placement which is the axis of
   *  the symmetry.
   */
  public gp_Parab Mirrored( gp_Ax1  A1) {
    return new gp_Parab(OCCwrapJavaJNI.gp_Parab_Mirrored__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1), true);
  }

  public void Mirror( gp_Ax2  A2) {
    OCCwrapJavaJNI.gp_Parab_Mirror__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Performs the symmetrical transformation of a parabola
   *  with respect to a plane. The axis placement A2 locates
   *  the plane of the symmetry (Location, XDirection, YDirection).
   */
  public gp_Parab Mirrored( gp_Ax2  A2) {
    return new gp_Parab(OCCwrapJavaJNI.gp_Parab_Mirrored__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2), true);
  }

  public void Rotate( gp_Ax1  A1, double Ang) {
    OCCwrapJavaJNI.gp_Parab_Rotate(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang);
  }

  /**
   *  Rotates a parabola. A1 is the axis of the rotation.
   *  Ang is the angular value of the rotation in radians.
   */
  public gp_Parab Rotated( gp_Ax1  A1, double Ang) {
    return new gp_Parab(OCCwrapJavaJNI.gp_Parab_Rotated(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang), true);
  }

  public void Scale( gp_Pnt  P, double S) {
    OCCwrapJavaJNI.gp_Parab_Scale(swigCPtr, this, gp_Pnt.getCPtr(P), P, S);
  }

  /**
   *  Scales a parabola. S is the scaling value.
   *  If S is negative the direction of the symmetry axis
   *  XAxis is reversed and the direction of the YAxis too.
   */
  public gp_Parab Scaled( gp_Pnt  P, double S) {
    return new gp_Parab(OCCwrapJavaJNI.gp_Parab_Scaled(swigCPtr, this, gp_Pnt.getCPtr(P), P, S), true);
  }

  public void Transform( gp_Trsf  T) {
    OCCwrapJavaJNI.gp_Parab_Transform(swigCPtr, this, gp_Trsf.getCPtr(T), T);
  }

  /**
   *  Transforms a parabola with the transformation T from class Trsf.
   */
  public gp_Parab Transformed( gp_Trsf  T) {
    return new gp_Parab(OCCwrapJavaJNI.gp_Parab_Transformed(swigCPtr, this, gp_Trsf.getCPtr(T), T), true);
  }

  public void Translate( gp_Vec  V) {
    OCCwrapJavaJNI.gp_Parab_Translate__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V);
  }

  /**
   *  Translates a parabola in the direction of the vector V.
   *  The magnitude of the translation is the vector's magnitude.
   */
  public gp_Parab Translated( gp_Vec  V) {
    return new gp_Parab(OCCwrapJavaJNI.gp_Parab_Translated__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V), true);
  }

  public void Translate( gp_Pnt  P1,  gp_Pnt  P2) {
    OCCwrapJavaJNI.gp_Parab_Translate__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Translates a parabola from the point P1 to the point P2.
   */
  public gp_Parab Translated( gp_Pnt  P1,  gp_Pnt  P2) {
    return new gp_Parab(OCCwrapJavaJNI.gp_Parab_Translated__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

}
