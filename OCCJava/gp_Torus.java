package opencascade;

/**
 *  Describes a torus.
 *  A torus is defined by its major and minor radii and
 *  positioned in space with a coordinate system (a gp_Ax3
 *  object) as follows:
 *  -   The origin of the coordinate system is the center of the torus;
 *  -   The surface is obtained by rotating a circle of radius
 *  equal to the minor radius of the torus about the "main
 *  Direction" of the coordinate system. This circle is
 *  located in the plane defined by the origin, the "X
 *  Direction" and the "main Direction" of the coordinate
 *  system. It is centered on the "X Axis" of this coordinate
 *  system, and located at a distance, from the origin of
 *  this coordinate system, equal to the major radius of the   torus;
 *  -   The "X Direction" and "Y Direction" define the
 *  reference plane of the torus.
 *  The coordinate system described above is the "local
 *  coordinate system" of the torus.
 *  Note: when a gp_Torus torus is converted into a
 *  Geom_ToroidalSurface torus, some implicit properties
 *  of its local coordinate system are used explicitly:
 *  -   its origin, "X Direction", "Y Direction" and "main
 *  Direction" are used directly to define the parametric
 *  directions on the torus and the origin of the parameters,
 *  -   its implicit orientation (right-handed or left-handed)
 *  gives the orientation (direct, indirect) to the
 *  Geom_ToroidalSurface torus.
 *  See Also
 *  gce_MakeTorus which provides functions for more
 *  complex torus constructions
 *  Geom_ToroidalSurface which provides additional
 *  functions for constructing tori and works, in particular,
 *  with the parametric equations of tori.
 */
public class gp_Torus {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Torus(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Torus(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Torus obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Torus ptr) { Ptr = ptr; }
    public gp_Torus AsReference () { return Ptr; }
    public gp_Torus AsCopy () { return Ptr.MakeCopy(); }
    public gp_Torus Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Torus(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  creates an indefinite Torus.
   */
  public gp_Torus() {
    this(OCCwrapJavaJNI.new_gp_Torus__SWIG_0(), true);
  }

  /**
   *  a torus centered on the origin of coordinate system
   *  A3, with major radius MajorRadius and minor radius
   *  MinorRadius, and with the reference plane defined
   *  by the origin, the "X Direction" and the "Y Direction" of A3.
   *  Warnings :
   *  It is not forbidden to create a torus with
   *  MajorRadius = MinorRadius = 0.0
   *  Raises ConstructionError if MinorRadius < 0.0 or if MajorRadius < 0.0
   */
  public gp_Torus( gp_Ax3  A3, double MajorRadius, double MinorRadius) {
    this(OCCwrapJavaJNI.new_gp_Torus__SWIG_1(gp_Ax3.getCPtr(A3), A3, MajorRadius, MinorRadius), true);
  }

  /**
   *  Modifies this torus, by redefining its local coordinate
   *  system so that:
   *  -   its origin and "main Direction" become those of the
   *  axis A1 (the "X Direction" and "Y Direction" are then recomputed).
   *  Raises ConstructionError if the direction of A1 is parallel to the "XDirection"
   *  of the coordinate system of the toroidal surface.
   */
  public void SetAxis( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Torus_SetAxis(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Changes the location of the torus.
   */
  public void SetLocation( gp_Pnt  Loc) {
    OCCwrapJavaJNI.gp_Torus_SetLocation(swigCPtr, this, gp_Pnt.getCPtr(Loc), Loc);
  }

  /**
   *  Assigns value to the major radius  of this torus.
   *  Raises ConstructionError if MajorRadius - MinorRadius <= Resolution()
   */
  public void SetMajorRadius(double MajorRadius) {
    OCCwrapJavaJNI.gp_Torus_SetMajorRadius(swigCPtr, this, MajorRadius);
  }

  /**
   *  Assigns value to the  minor radius of this torus.
   *  Raises ConstructionError if MinorRadius < 0.0 or if
   *  MajorRadius - MinorRadius <= Resolution from gp.
   */
  public void SetMinorRadius(double MinorRadius) {
    OCCwrapJavaJNI.gp_Torus_SetMinorRadius(swigCPtr, this, MinorRadius);
  }

  /**
   *  Changes the local coordinate system of the surface.
   */
  public void SetPosition( gp_Ax3  A3) {
    OCCwrapJavaJNI.gp_Torus_SetPosition(swigCPtr, this, gp_Ax3.getCPtr(A3), A3);
  }

  /**
   *  Computes the area of the torus.
   */
  public double Area() {
    return OCCwrapJavaJNI.gp_Torus_Area(swigCPtr, this);
  }

  /**
   *  Reverses the   U   parametrization of   the  torus
   *  reversing the YAxis.
   */
  public void UReverse() {
    OCCwrapJavaJNI.gp_Torus_UReverse(swigCPtr, this);
  }

  /**
   *  Reverses the   V   parametrization of   the  torus
   *  reversing the ZAxis.
   */
  public void VReverse() {
    OCCwrapJavaJNI.gp_Torus_VReverse(swigCPtr, this);
  }

  /**
   *  returns true if the Ax3, the local coordinate system of this torus, is right handed.
   */
  public long Direct() {
    return OCCwrapJavaJNI.gp_Torus_Direct(swigCPtr, this);
  }

  /**
   *  returns the symmetry axis of the torus.
   */
  public  gp_Ax1  Axis() {
    gp_Ax1 ret = new gp_Ax1(OCCwrapJavaJNI.gp_Torus_Axis(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Computes the coefficients of the implicit equation of the surface
   *  in the absolute Cartesian coordinate system:
   *      Coef(1) * X^4 + Coef(2) * Y^4 + Coef(3) * Z^4 +
   *      Coef(4) * X^3 * Y + Coef(5) * X^3 * Z + Coef(6) * Y^3 * X +
   *      Coef(7) * Y^3 * Z + Coef(8) * Z^3 * X + Coef(9) * Z^3 * Y +
   *      Coef(10) * X^2 * Y^2 + Coef(11) * X^2 * Z^2 +
   *      Coef(12) * Y^2 * Z^2 + Coef(13) * X^2 * Y * Z +
   *      Coef(14) * X * Y^2 * Z + Coef(15) * X * Y * Z^2 +
   *      Coef(16) * X^3 + Coef(17) * Y^3 + Coef(18) * Z^3 + 
   *      Coef(19) * X^2 * Y + Coef(20) * X^2 * Z + Coef(21) * Y^2 * X +
   *      Coef(22) * Y^2 * Z + Coef(23) * Z^2 * X + Coef(24) * Z^2 * Y +
   *      Coef(25) * X * Y * Z +
   *      Coef(26) * X^2 + Coef(27) * Y^2 + Coef(28) * Z^2 +
   *      Coef(29) * X * Y + Coef(30) * X * Z + Coef(31) * Y * Z +
   *      Coef(32) * X + Coef(33) * Y + Coef(34) *  Z + 
   *      Coef(35) = 0.0
   *  Raises DimensionError if the length of Coef is lower than 35.
   */
  public void Coefficients( TColStd_Array1OfReal  Coef) {
    OCCwrapJavaJNI.gp_Torus_Coefficients(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Coef), Coef);
  }

  /**
   *  Returns the Torus's location.
   */
  public  gp_Pnt  Location() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.gp_Torus_Location(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the local coordinates system of the torus.
   */
  public  gp_Ax3  Position() {
    gp_Ax3 ret = new gp_Ax3(OCCwrapJavaJNI.gp_Torus_Position(swigCPtr, this), true);
    return ret;
  }

  /**
   *  returns the major radius of the torus.
   */
  public double MajorRadius() {
    return OCCwrapJavaJNI.gp_Torus_MajorRadius(swigCPtr, this);
  }

  /**
   *  returns the minor radius of the torus.
   */
  public double MinorRadius() {
    return OCCwrapJavaJNI.gp_Torus_MinorRadius(swigCPtr, this);
  }

  /**
   *  Computes the volume of the torus.
   */
  public double Volume() {
    return OCCwrapJavaJNI.gp_Torus_Volume(swigCPtr, this);
  }

  /**
   *  returns the axis X of the torus.
   */
  public gp_Ax1 XAxis() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Torus_XAxis(swigCPtr, this), true);
  }

  /**
   *  returns the axis Y of the torus.
   */
  public gp_Ax1 YAxis() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Torus_YAxis(swigCPtr, this), true);
  }

  public void Mirror( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Torus_Mirror__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of a torus
   *  with respect to the point P which is the center of the
   *  symmetry.
   */
  public gp_Torus Mirrored( gp_Pnt  P) {
    return new gp_Torus(OCCwrapJavaJNI.gp_Torus_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P), true);
  }

  public void Mirror( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Torus_Mirror__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Performs the symmetrical transformation of a torus with
   *  respect to an axis placement which is the axis of the
   *  symmetry.
   */
  public gp_Torus Mirrored( gp_Ax1  A1) {
    return new gp_Torus(OCCwrapJavaJNI.gp_Torus_Mirrored__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1), true);
  }

  public void Mirror( gp_Ax2  A2) {
    OCCwrapJavaJNI.gp_Torus_Mirror__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Performs the symmetrical transformation of a torus with respect
   *  to a plane. The axis placement A2 locates the plane of the
   *  of the symmetry : (Location, XDirection, YDirection).
   */
  public gp_Torus Mirrored( gp_Ax2  A2) {
    return new gp_Torus(OCCwrapJavaJNI.gp_Torus_Mirrored__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2), true);
  }

  public void Rotate( gp_Ax1  A1, double Ang) {
    OCCwrapJavaJNI.gp_Torus_Rotate(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang);
  }

  /**
   *  Rotates a torus. A1 is the axis of the rotation.
   *  Ang is the angular value of the rotation in radians.
   */
  public gp_Torus Rotated( gp_Ax1  A1, double Ang) {
    return new gp_Torus(OCCwrapJavaJNI.gp_Torus_Rotated(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang), true);
  }

  public void Scale( gp_Pnt  P, double S) {
    OCCwrapJavaJNI.gp_Torus_Scale(swigCPtr, this, gp_Pnt.getCPtr(P), P, S);
  }

  /**
   *  Scales a torus. S is the scaling value.
   *  The absolute value of S is used to scale the torus
   */
  public gp_Torus Scaled( gp_Pnt  P, double S) {
    return new gp_Torus(OCCwrapJavaJNI.gp_Torus_Scaled(swigCPtr, this, gp_Pnt.getCPtr(P), P, S), true);
  }

  public void Transform( gp_Trsf  T) {
    OCCwrapJavaJNI.gp_Torus_Transform(swigCPtr, this, gp_Trsf.getCPtr(T), T);
  }

  /**
   *  Transforms a torus with the transformation T from class Trsf.
   */
  public gp_Torus Transformed( gp_Trsf  T) {
    return new gp_Torus(OCCwrapJavaJNI.gp_Torus_Transformed(swigCPtr, this, gp_Trsf.getCPtr(T), T), true);
  }

  public void Translate( gp_Vec  V) {
    OCCwrapJavaJNI.gp_Torus_Translate__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V);
  }

  /**
   *  Translates a torus in the direction of the vector V.
   *  The magnitude of the translation is the vector's magnitude.
   */
  public gp_Torus Translated( gp_Vec  V) {
    return new gp_Torus(OCCwrapJavaJNI.gp_Torus_Translated__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V), true);
  }

  public void Translate( gp_Pnt  P1,  gp_Pnt  P2) {
    OCCwrapJavaJNI.gp_Torus_Translate__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Translates a torus from the point P1 to the point P2.
   */
  public gp_Torus Translated( gp_Pnt  P1,  gp_Pnt  P2) {
    return new gp_Torus(OCCwrapJavaJNI.gp_Torus_Translated__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

}
