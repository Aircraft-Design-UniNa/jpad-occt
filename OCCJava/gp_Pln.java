package opencascade;

/**
 *  Describes a plane.
 *  A plane is positioned in space with a coordinate system
 *  (a gp_Ax3 object), such that the plane is defined by the
 *  origin, "X Direction" and "Y Direction" of this coordinate
 *  system, which is the "local coordinate system" of the
 *  plane. The "main Direction" of the coordinate system is a
 *  vector normal to the plane. It gives the plane an implicit
 *  orientation such that the plane is said to be "direct", if the
 *  coordinate system is right-handed, or "indirect" in the other case.
 *  Note: when a gp_Pln plane is converted into a
 *  Geom_Plane plane, some implicit properties of its local
 *  coordinate system are used explicitly:
 *  -   its origin defines the origin of the two parameters of
 *  the planar surface,
 *  -   its implicit orientation is also that of the Geom_Plane.
 *  See Also
 *  gce_MakePln which provides functions for more complex
 *  plane constructions
 *  Geom_Plane which provides additional functions for
 *  constructing planes and works, in particular, with the
 *  parametric equations of planes
 */
public class gp_Pln {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Pln(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Pln(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Pln obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Pln ptr) { Ptr = ptr; }
    public gp_Pln AsReference () { return Ptr; }
    public gp_Pln AsCopy () { return Ptr.MakeCopy(); }
    public gp_Pln Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Pln(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a plane coincident with OXY plane of the
   *  reference coordinate system.
   */
  public gp_Pln() {
    this(OCCwrapJavaJNI.new_gp_Pln__SWIG_0(), true);
  }

  /**
   *  The coordinate system of the plane is defined with the axis
   *  placement A3.
   *  The "Direction" of A3 defines the normal to the plane.
   *  The "Location" of A3 defines the location (origin) of the plane.
   *  The "XDirection" and "YDirection" of A3 define the "XAxis" and
   *  the "YAxis" of the plane used to parametrize the plane.
   */
  public gp_Pln( gp_Ax3  A3) {
    this(OCCwrapJavaJNI.new_gp_Pln__SWIG_1(gp_Ax3.getCPtr(A3), A3), true);
  }

  /**
   *  Creates a plane with the  "Location" point <P>
   *  and the normal direction <V>.
   */
  public gp_Pln( gp_Pnt  P,  gp_Dir  V) {
    this(OCCwrapJavaJNI.new_gp_Pln__SWIG_2(gp_Pnt.getCPtr(P), P, gp_Dir.getCPtr(V), V), true);
  }

  /**
   *  Creates a plane from its cartesian equation :
   *  A * X + B * Y + C * Z + D = 0.0
   *  Raises ConstructionError if Sqrt (A*A + B*B + C*C) <= Resolution from gp.
   */
  public gp_Pln(double A, double B, double C, double D) {
    this(OCCwrapJavaJNI.new_gp_Pln__SWIG_3(A, B, C, D), true);
  }

  /**
   *  Returns the coefficients of the plane's cartesian equation :
   *  A * X + B * Y + C * Z + D = 0.
   */
  public void Coefficients(double[] A, double[] B, double[] C, double[] D) {
    OCCwrapJavaJNI.gp_Pln_Coefficients(swigCPtr, this, A, B, C, D);
  }

  /**
   *  Modifies this plane, by redefining its local coordinate system so that
   *  -   its origin and "main Direction" become those of the
   *  axis A1 (the "X Direction" and "Y Direction" are then recomputed).
   *  Raises ConstructionError if the A1 is parallel to the "XAxis" of the plane.
   */
  public void SetAxis( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Pln_SetAxis(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Changes the origin of the plane.
   */
  public void SetLocation( gp_Pnt  Loc) {
    OCCwrapJavaJNI.gp_Pln_SetLocation(swigCPtr, this, gp_Pnt.getCPtr(Loc), Loc);
  }

  /**
   *  Changes the local coordinate system of the plane.
   */
  public void SetPosition( gp_Ax3  A3) {
    OCCwrapJavaJNI.gp_Pln_SetPosition(swigCPtr, this, gp_Ax3.getCPtr(A3), A3);
  }

  /**
   *  Reverses the   U   parametrization of   the  plane
   *  reversing the XAxis.
   */
  public void UReverse() {
    OCCwrapJavaJNI.gp_Pln_UReverse(swigCPtr, this);
  }

  /**
   *  Reverses the   V   parametrization of   the  plane
   *  reversing the YAxis.
   */
  public void VReverse() {
    OCCwrapJavaJNI.gp_Pln_VReverse(swigCPtr, this);
  }

  /**
   *  returns true if the Ax3 is right handed.
   */
  public long Direct() {
    return OCCwrapJavaJNI.gp_Pln_Direct(swigCPtr, this);
  }

  /**
   *  Returns the plane's normal Axis.
   */
  public  gp_Ax1  Axis() {
    gp_Ax1 ret = new gp_Ax1(OCCwrapJavaJNI.gp_Pln_Axis(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the plane's location (origin).
   */
  public  gp_Pnt  Location() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.gp_Pln_Location(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the local coordinate system of the plane .
   */
  public  gp_Ax3  Position() {
    gp_Ax3 ret = new gp_Ax3(OCCwrapJavaJNI.gp_Pln_Position(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Computes the distance between <me> and the point <P>.
   */
  public double Distance( gp_Pnt  P) {
    return OCCwrapJavaJNI.gp_Pln_Distance__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Computes the distance between <me> and the line <L>.
   */
  public double Distance( gp_Lin  L) {
    return OCCwrapJavaJNI.gp_Pln_Distance__SWIG_1(swigCPtr, this, gp_Lin.getCPtr(L), L);
  }

  /**
   *  Computes the distance between two planes.
   */
  public double Distance( gp_Pln  Other) {
    return OCCwrapJavaJNI.gp_Pln_Distance__SWIG_2(swigCPtr, this, gp_Pln.getCPtr(Other), Other);
  }

  /**
   *  Computes the square distance between <me> and the point <P>.
   */
  public double SquareDistance( gp_Pnt  P) {
    return OCCwrapJavaJNI.gp_Pln_SquareDistance__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Computes the square distance between <me> and the line <L>.
   */
  public double SquareDistance( gp_Lin  L) {
    return OCCwrapJavaJNI.gp_Pln_SquareDistance__SWIG_1(swigCPtr, this, gp_Lin.getCPtr(L), L);
  }

  /**
   *  Computes the square distance between two planes.
   */
  public double SquareDistance( gp_Pln  Other) {
    return OCCwrapJavaJNI.gp_Pln_SquareDistance__SWIG_2(swigCPtr, this, gp_Pln.getCPtr(Other), Other);
  }

  /**
   *  Returns the X axis of the plane.
   */
  public gp_Ax1 XAxis() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Pln_XAxis(swigCPtr, this), true);
  }

  /**
   *  Returns the Y axis  of the plane.
   */
  public gp_Ax1 YAxis() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Pln_YAxis(swigCPtr, this), true);
  }

  /**
   *  Returns true if this plane contains the point P. This means that
   *  -   the distance between point P and this plane is less
   *  than or equal to LinearTolerance, or
   *  -   line L is normal to the "main Axis" of the local
   *  coordinate system of this plane, within the tolerance
   *  AngularTolerance, and the distance between the origin
   *  of line L and this plane is less than or equal to
   *  LinearTolerance.
   */
  public long Contains( gp_Pnt  P, double LinearTolerance) {
    return OCCwrapJavaJNI.gp_Pln_Contains__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P, LinearTolerance);
  }

  /**
   *  Returns true if this plane contains the line L. This means that
   *  -   the distance between point P and this plane is less
   *  than or equal to LinearTolerance, or
   *  -   line L is normal to the "main Axis" of the local
   *  coordinate system of this plane, within the tolerance
   *  AngularTolerance, and the distance between the origin
   *  of line L and this plane is less than or equal to
   *  LinearTolerance.
   */
  public long Contains( gp_Lin  L, double LinearTolerance, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Pln_Contains__SWIG_1(swigCPtr, this, gp_Lin.getCPtr(L), L, LinearTolerance, AngularTolerance);
  }

  public void Mirror( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Pln_Mirror__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of a plane with respect
   *  to the point <P> which is the center of the symmetry
   *  Warnings :
   *  The normal direction to the plane is not changed.
   *  The "XAxis" and the "YAxis" are reversed.
   */
  public gp_Pln Mirrored( gp_Pnt  P) {
    return new gp_Pln(OCCwrapJavaJNI.gp_Pln_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P), true);
  }

  public void Mirror( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Pln_Mirror__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Performs   the symmetrical transformation  of a
   *  plane with respect to an axis placement  which is the axis
   *  of  the symmetry.  The  transformation is performed on the
   *  "Location" point, on  the "XAxis"  and the "YAxis".    The
   *  resulting normal  direction  is  the cross product between
   *  the "XDirection" and the "YDirection" after transformation
   *  if  the  initial plane was right  handed,  else  it is the
   *  opposite.
   */
  public gp_Pln Mirrored( gp_Ax1  A1) {
    return new gp_Pln(OCCwrapJavaJNI.gp_Pln_Mirrored__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1), true);
  }

  public void Mirror( gp_Ax2  A2) {
    OCCwrapJavaJNI.gp_Pln_Mirror__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Performs the  symmetrical transformation  of  a
   *  plane    with respect to    an axis  placement.   The axis
   *  placement  <A2> locates the plane  of  the symmetry.   The
   *  transformation is performed  on  the  "Location" point, on
   *  the  "XAxis" and  the    "YAxis".  The resulting    normal
   *  direction is the cross  product between   the "XDirection"
   *  and the "YDirection"  after  transformation if the initial
   *  plane was right handed, else it is the opposite.
   */
  public gp_Pln Mirrored( gp_Ax2  A2) {
    return new gp_Pln(OCCwrapJavaJNI.gp_Pln_Mirrored__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2), true);
  }

  public void Rotate( gp_Ax1  A1, double Ang) {
    OCCwrapJavaJNI.gp_Pln_Rotate(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang);
  }

  /**
   *  rotates a plane. A1 is the axis of the rotation.
   *  Ang is the angular value of the rotation in radians.
   */
  public gp_Pln Rotated( gp_Ax1  A1, double Ang) {
    return new gp_Pln(OCCwrapJavaJNI.gp_Pln_Rotated(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang), true);
  }

  public void Scale( gp_Pnt  P, double S) {
    OCCwrapJavaJNI.gp_Pln_Scale(swigCPtr, this, gp_Pnt.getCPtr(P), P, S);
  }

  /**
   *  Scales a plane. S is the scaling value.
   */
  public gp_Pln Scaled( gp_Pnt  P, double S) {
    return new gp_Pln(OCCwrapJavaJNI.gp_Pln_Scaled(swigCPtr, this, gp_Pnt.getCPtr(P), P, S), true);
  }

  public void Transform( gp_Trsf  T) {
    OCCwrapJavaJNI.gp_Pln_Transform(swigCPtr, this, gp_Trsf.getCPtr(T), T);
  }

  /**
   *  Transforms a plane with the transformation T from class Trsf.
   *  The transformation is performed on the "Location"
   *  point, on the "XAxis" and the "YAxis".
   *  The resulting normal direction is the cross product between
   *  the "XDirection" and the "YDirection" after transformation.
   */
  public gp_Pln Transformed( gp_Trsf  T) {
    return new gp_Pln(OCCwrapJavaJNI.gp_Pln_Transformed(swigCPtr, this, gp_Trsf.getCPtr(T), T), true);
  }

  public void Translate( gp_Vec  V) {
    OCCwrapJavaJNI.gp_Pln_Translate__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V);
  }

  /**
   *  Translates a plane in the direction of the vector V.
   *  The magnitude of the translation is the vector's magnitude.
   */
  public gp_Pln Translated( gp_Vec  V) {
    return new gp_Pln(OCCwrapJavaJNI.gp_Pln_Translated__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V), true);
  }

  public void Translate( gp_Pnt  P1,  gp_Pnt  P2) {
    OCCwrapJavaJNI.gp_Pln_Translate__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Translates a plane from the point P1 to the point P2.
   */
  public gp_Pln Translated( gp_Pnt  P1,  gp_Pnt  P2) {
    return new gp_Pln(OCCwrapJavaJNI.gp_Pln_Translated__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

}
