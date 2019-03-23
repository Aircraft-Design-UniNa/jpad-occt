package opencascade;

/**
 *  Describes a branch of a hyperbola in 3D space.
 *  A hyperbola is defined by its major and minor radii and
 *  positioned in space with a coordinate system (a gp_Ax2
 *  object) of which:
 *  -   the origin is the center of the hyperbola,
 *  -   the "X Direction" defines the major axis of the
 *  hyperbola, and
 *  - the "Y Direction" defines the minor axis of the hyperbola.
 *  The origin, "X Direction" and "Y Direction" of this
 *  coordinate system together define the plane of the
 *  hyperbola. This coordinate system is the "local
 *  coordinate system" of the hyperbola. In this coordinate
 *  system, the equation of the hyperbola is:
 *  X*X/(MajorRadius**2)-Y*Y/(MinorRadius**2) = 1.0
 *  The branch of the hyperbola described is the one located
 *  on the positive side of the major axis.
 *  The "main Direction" of the local coordinate system is a
 *  normal vector to the plane of the hyperbola. This vector
 *  gives an implicit orientation to the hyperbola. We refer to
 *  the "main Axis" of the local coordinate system as the
 *  "Axis" of the hyperbola.
 *  The following schema shows the plane of the hyperbola,
 *  and in it, the respective positions of the three branches of
 *  hyperbolas constructed with the functions OtherBranch,
 *  ConjugateBranch1, and ConjugateBranch2:
 * 
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
 *  |                  ^YAxis
 *  Warning
 *  The major radius can be less than the minor radius.
 *  See Also
 *  gce_MakeHypr which provides functions for more
 *  complex hyperbola constructions
 *  Geom_Hyperbola which provides additional functions for
 *  constructing hyperbolas and works, in particular, with the
 *  parametric equations of hyperbolas
 */
public class gp_Hypr {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Hypr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Hypr(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Hypr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Hypr ptr) { Ptr = ptr; }
    public gp_Hypr AsReference () { return Ptr; }
    public gp_Hypr AsCopy () { return Ptr.MakeCopy(); }
    public gp_Hypr Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Hypr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates of an indefinite hyperbola.
   */
  public gp_Hypr() {
    this(OCCwrapJavaJNI.new_gp_Hypr__SWIG_0(), true);
  }

  /**
   *  Creates a hyperbola with radii MajorRadius and
   *  MinorRadius, positioned in the space by the
   *  coordinate system A2 such that:
   *  -   the origin of A2 is the center of the hyperbola,
   *  -   the "X Direction" of A2 defines the major axis of
   *  the hyperbola, that is, the major radius
   *  MajorRadius is measured along this axis, and
   *  -   the "Y Direction" of A2 defines the minor axis of
   *  the hyperbola, that is, the minor radius
   *  MinorRadius is measured along this axis.
   *  Note: This class does not prevent the creation of a
   *  hyperbola where:
   *  -   MajorAxis is equal to MinorAxis, or
   *  -   MajorAxis is less than MinorAxis.
   *  Exceptions
   *  Standard_ConstructionError if MajorAxis or MinorAxis is negative.
   *  Raises ConstructionError if MajorRadius < 0.0 or MinorRadius < 0.0
   *  Raised if MajorRadius < 0.0 or MinorRadius < 0.0
   */
  public gp_Hypr( gp_Ax2  A2, double MajorRadius, double MinorRadius) {
    this(OCCwrapJavaJNI.new_gp_Hypr__SWIG_1(gp_Ax2.getCPtr(A2), A2, MajorRadius, MinorRadius), true);
  }

  /**
   *  Modifies this hyperbola, by redefining its local coordinate
   *  system so that:
   *  -   its origin and "main Direction" become those of the
   *  axis A1 (the "X Direction" and "Y Direction" are then
   *  recomputed in the same way as for any gp_Ax2).
   *  Raises ConstructionError if the direction of A1 is parallel to the direction of
   *  the "XAxis" of the hyperbola.
   */
  public void SetAxis( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Hypr_SetAxis(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Modifies this hyperbola, by redefining its local coordinate
   *  system so that its origin becomes P.
   */
  public void SetLocation( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Hypr_SetLocation(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Modifies the major  radius of this hyperbola.
   *  Exceptions
   *  Standard_ConstructionError if MajorRadius is negative.
   */
  public void SetMajorRadius(double MajorRadius) {
    OCCwrapJavaJNI.gp_Hypr_SetMajorRadius(swigCPtr, this, MajorRadius);
  }

  /**
   *  Modifies the minor  radius of this hyperbola.
   *  Exceptions
   *  Standard_ConstructionError if MinorRadius is negative.
   */
  public void SetMinorRadius(double MinorRadius) {
    OCCwrapJavaJNI.gp_Hypr_SetMinorRadius(swigCPtr, this, MinorRadius);
  }

  /**
   *  Modifies this hyperbola, by redefining its local coordinate
   *  system so that it becomes A2.
   */
  public void SetPosition( gp_Ax2  A2) {
    OCCwrapJavaJNI.gp_Hypr_SetPosition(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  In the local coordinate system of the hyperbola the equation of
   *  the hyperbola is (X*X)/(A*A) - (Y*Y)/(B*B) = 1.0 and the
   *  equation of the first asymptote is Y = (B/A)*X
   *  where A is the major radius and B is the minor radius. Raises ConstructionError if MajorRadius = 0.0
   */
  public gp_Ax1 Asymptote1() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Hypr_Asymptote1(swigCPtr, this), true);
  }

  /**
   *  In the local coordinate system of the hyperbola the equation of
   *  the hyperbola is (X*X)/(A*A) - (Y*Y)/(B*B) = 1.0 and the
   *  equation of the first asymptote is Y = -(B/A)*X.
   *  where A is the major radius and B is the minor radius. Raises ConstructionError if MajorRadius = 0.0
   */
  public gp_Ax1 Asymptote2() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Hypr_Asymptote2(swigCPtr, this), true);
  }

  /**
   *  Returns the axis passing through the center,
   *  and normal to the plane of this hyperbola.
   */
  public  gp_Ax1  Axis() {
    gp_Ax1 ret = new gp_Ax1(OCCwrapJavaJNI.gp_Hypr_Axis(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Computes the branch of hyperbola which is on the positive side of the
   *  "YAxis" of <me>.
   */
  public gp_Hypr ConjugateBranch1() {
    return new gp_Hypr(OCCwrapJavaJNI.gp_Hypr_ConjugateBranch1(swigCPtr, this), true);
  }

  /**
   *  Computes the branch of hyperbola which is on the negative side of the
   *  "YAxis" of <me>.
   */
  public gp_Hypr ConjugateBranch2() {
    return new gp_Hypr(OCCwrapJavaJNI.gp_Hypr_ConjugateBranch2(swigCPtr, this), true);
  }

  /**
   *  This directrix is the line normal to the XAxis of the hyperbola
   *  in the local plane (Z = 0) at a distance d = MajorRadius / e
   *  from the center of the hyperbola, where e is the eccentricity of
   *  the hyperbola.
   *  This line is parallel to the "YAxis". The intersection point
   *  between the directrix1 and the "XAxis" is the "Location" point
   *  of the directrix1. This point is on the positive side of the
   *  "XAxis".
   */
  public gp_Ax1 Directrix1() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Hypr_Directrix1(swigCPtr, this), true);
  }

  /**
   *  This line is obtained by the symmetrical transformation
   *  of "Directrix1" with respect to the "YAxis" of the hyperbola.
   */
  public gp_Ax1 Directrix2() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Hypr_Directrix2(swigCPtr, this), true);
  }

  /**
   *  Returns the excentricity of the hyperbola (e > 1).
   *  If f is the distance between the location of the hyperbola
   *  and the Focus1 then the eccentricity e = f / MajorRadius. Raises DomainError if MajorRadius = 0.0
   */
  public double Eccentricity() {
    return OCCwrapJavaJNI.gp_Hypr_Eccentricity(swigCPtr, this);
  }

  /**
   *  Computes the focal distance. It is the distance between the
   *  the two focus of the hyperbola.
   */
  public double Focal() {
    return OCCwrapJavaJNI.gp_Hypr_Focal(swigCPtr, this);
  }

  /**
   *  Returns the first focus of the hyperbola. This focus is on the
   *  positive side of the "XAxis" of the hyperbola.
   */
  public gp_Pnt Focus1() {
    return new gp_Pnt(OCCwrapJavaJNI.gp_Hypr_Focus1(swigCPtr, this), true);
  }

  /**
   *  Returns the second focus of the hyperbola. This focus is on the
   *  negative side of the "XAxis" of the hyperbola.
   */
  public gp_Pnt Focus2() {
    return new gp_Pnt(OCCwrapJavaJNI.gp_Hypr_Focus2(swigCPtr, this), true);
  }

  /**
   *  Returns  the location point of the hyperbola. It is the
   *  intersection point between the "XAxis" and the "YAxis".
   */
  public  gp_Pnt  Location() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.gp_Hypr_Location(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the major radius of the hyperbola. It is the radius
   *  on the "XAxis" of the hyperbola.
   */
  public double MajorRadius() {
    return OCCwrapJavaJNI.gp_Hypr_MajorRadius(swigCPtr, this);
  }

  /**
   *  Returns the minor radius of the hyperbola. It is the radius
   *  on the "YAxis" of the hyperbola.
   */
  public double MinorRadius() {
    return OCCwrapJavaJNI.gp_Hypr_MinorRadius(swigCPtr, this);
  }

  /**
   *  Returns the branch of hyperbola obtained by doing the
   *  symmetrical transformation of <me> with respect to the
   *  "YAxis"  of <me>.
   */
  public gp_Hypr OtherBranch() {
    return new gp_Hypr(OCCwrapJavaJNI.gp_Hypr_OtherBranch(swigCPtr, this), true);
  }

  /**
   *  Returns p = (e * e - 1) * MajorRadius where e is the
   *  eccentricity of the hyperbola.
   *  Raises DomainError if MajorRadius = 0.0
   */
  public double Parameter() {
    return OCCwrapJavaJNI.gp_Hypr_Parameter(swigCPtr, this);
  }

  /**
   *  Returns the coordinate system of the hyperbola.
   */
  public  gp_Ax2  Position() {
    gp_Ax2 ret = new gp_Ax2(OCCwrapJavaJNI.gp_Hypr_Position(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Computes an axis, whose
   *  -   the origin is the center of this hyperbola, and
   *  -   the unit vector is the "X Direction"
   *  of the local coordinate system of this hyperbola.
   *  These axes are, the major axis (the "X
   *  Axis") and  of this hyperboReturns the "XAxis" of the hyperbola.
   */
  public gp_Ax1 XAxis() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Hypr_XAxis(swigCPtr, this), true);
  }

  /**
   *  Computes an axis, whose
   *  -   the origin is the center of this hyperbola, and
   *  -   the unit vector is the "Y Direction"
   *  of the local coordinate system of this hyperbola.
   *  These axes are the minor axis (the "Y Axis") of this hyperbola
   */
  public gp_Ax1 YAxis() {
    return new gp_Ax1(OCCwrapJavaJNI.gp_Hypr_YAxis(swigCPtr, this), true);
  }

  public void Mirror( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Hypr_Mirror__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of an hyperbola with
   *  respect  to the point P which is the center of the symmetry.
   */
  public gp_Hypr Mirrored( gp_Pnt  P) {
    return new gp_Hypr(OCCwrapJavaJNI.gp_Hypr_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P), true);
  }

  public void Mirror( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Hypr_Mirror__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Performs the symmetrical transformation of an hyperbola with
   *  respect to an axis placement which is the axis of the symmetry.
   */
  public gp_Hypr Mirrored( gp_Ax1  A1) {
    return new gp_Hypr(OCCwrapJavaJNI.gp_Hypr_Mirrored__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1), true);
  }

  public void Mirror( gp_Ax2  A2) {
    OCCwrapJavaJNI.gp_Hypr_Mirror__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Performs the symmetrical transformation of an hyperbola with
   *  respect to a plane. The axis placement A2 locates the plane
   *  of the symmetry (Location, XDirection, YDirection).
   */
  public gp_Hypr Mirrored( gp_Ax2  A2) {
    return new gp_Hypr(OCCwrapJavaJNI.gp_Hypr_Mirrored__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2), true);
  }

  public void Rotate( gp_Ax1  A1, double Ang) {
    OCCwrapJavaJNI.gp_Hypr_Rotate(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang);
  }

  /**
   *  Rotates an hyperbola. A1 is the axis of the rotation.
   *  Ang is the angular value of the rotation in radians.
   */
  public gp_Hypr Rotated( gp_Ax1  A1, double Ang) {
    return new gp_Hypr(OCCwrapJavaJNI.gp_Hypr_Rotated(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang), true);
  }

  public void Scale( gp_Pnt  P, double S) {
    OCCwrapJavaJNI.gp_Hypr_Scale(swigCPtr, this, gp_Pnt.getCPtr(P), P, S);
  }

  /**
   *  Scales an hyperbola. S is the scaling value.
   */
  public gp_Hypr Scaled( gp_Pnt  P, double S) {
    return new gp_Hypr(OCCwrapJavaJNI.gp_Hypr_Scaled(swigCPtr, this, gp_Pnt.getCPtr(P), P, S), true);
  }

  public void Transform( gp_Trsf  T) {
    OCCwrapJavaJNI.gp_Hypr_Transform(swigCPtr, this, gp_Trsf.getCPtr(T), T);
  }

  /**
   *  Transforms an hyperbola with the transformation T from
   *  class Trsf.
   */
  public gp_Hypr Transformed( gp_Trsf  T) {
    return new gp_Hypr(OCCwrapJavaJNI.gp_Hypr_Transformed(swigCPtr, this, gp_Trsf.getCPtr(T), T), true);
  }

  public void Translate( gp_Vec  V) {
    OCCwrapJavaJNI.gp_Hypr_Translate__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V);
  }

  /**
   *  Translates an hyperbola in the direction of the vector V.
   *  The magnitude of the translation is the vector's magnitude.
   */
  public gp_Hypr Translated( gp_Vec  V) {
    return new gp_Hypr(OCCwrapJavaJNI.gp_Hypr_Translated__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V), true);
  }

  public void Translate( gp_Pnt  P1,  gp_Pnt  P2) {
    OCCwrapJavaJNI.gp_Hypr_Translate__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Translates an hyperbola from the point P1 to the point P2.
   */
  public gp_Hypr Translated( gp_Pnt  P1,  gp_Pnt  P2) {
    return new gp_Hypr(OCCwrapJavaJNI.gp_Hypr_Translated__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

}
