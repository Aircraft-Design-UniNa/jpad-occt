package opencascade;

/**
 *  Geometric intersections between two natural quadrics
 *  (Sphere , Cylinder , Cone , Pln from gp).
 *  The possible intersections are :
 *  - 1 point
 *  - 1 or 2 line(s)
 *  - 1 Point and 1 Line
 *  - 1 circle
 *  - 1 ellipse
 *  - 1 parabola
 *  - 1 or 2 hyperbola(s).
 *  - Empty : there is no intersection between the two quadrics.
 *  - Same  : the quadrics are identical
 *  - NoGeometricSolution : there may be an intersection, but it
 *  is necessary to use an analytic algorithm to determine
 *  it. See class IntQuadQuad from IntAna.
 */
public class IntAna_QuadQuadGeo {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntAna_QuadQuadGeo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntAna_QuadQuadGeo(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntAna_QuadQuadGeo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (IntAna_QuadQuadGeo ptr) { Ptr = ptr; }
    public IntAna_QuadQuadGeo AsReference () { return Ptr; }
    public IntAna_QuadQuadGeo AsCopy () { return Ptr.MakeCopy(); }
    public IntAna_QuadQuadGeo Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntAna_QuadQuadGeo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor.
   */
  public IntAna_QuadQuadGeo() {
    this(OCCwrapJavaJNI.new_IntAna_QuadQuadGeo__SWIG_0(), true);
  }

  /**
   *  Creates the intersection between two planes.
   *  TolAng is the angular tolerance used to determine
   *  if the planes are parallel.
   *  Tol is the tolerance used to determine if the planes
   *  are identical (only when they are parallel).
   */
  public IntAna_QuadQuadGeo( gp_Pln  P1,  gp_Pln  P2, double TolAng, double Tol) {
    this(OCCwrapJavaJNI.new_IntAna_QuadQuadGeo__SWIG_1(gp_Pln.getCPtr(P1), P1, gp_Pln.getCPtr(P2), P2, TolAng, Tol), true);
  }

  /**
   *  Intersects two planes.
   *  TolAng is the angular tolerance used to determine
   *  if the planes are parallel.
   *  Tol is the tolerance used to determine if the planes
   *  are identical (only when they are parallel).
   */
  public void Perform( gp_Pln  P1,  gp_Pln  P2, double TolAng, double Tol) {
    OCCwrapJavaJNI.IntAna_QuadQuadGeo_Perform__SWIG_0(swigCPtr, this, gp_Pln.getCPtr(P1), P1, gp_Pln.getCPtr(P2), P2, TolAng, Tol);
  }

  /**
   *  Creates the intersection between a plane and a cylinder.
   *  TolAng is the angular tolerance used to determine
   *  if the axis of the cylinder is parallel to the plane.
   *  Tol is the tolerance used to determine if the result
   *  is a circle or an ellipse. If the maximum distance between
   *  the ellipse solution and the circle centered at the ellipse
   *  center is less than Tol, the result will be the circle.
   *  H is the height of the cylinder <Cyl>. It is  used to check
   *  whether the plane and cylinder are parallel.
   */
  public IntAna_QuadQuadGeo( gp_Pln  P,  gp_Cylinder  C, double Tolang, double Tol, double H) {
    this(OCCwrapJavaJNI.new_IntAna_QuadQuadGeo__SWIG_2(gp_Pln.getCPtr(P), P, gp_Cylinder.getCPtr(C), C, Tolang, Tol, H), true);
  }

  /**
   *  Creates the intersection between a plane and a sphere.
   */
  public IntAna_QuadQuadGeo( gp_Pln  P,  gp_Cylinder  C, double Tolang, double Tol) {
    this(OCCwrapJavaJNI.new_IntAna_QuadQuadGeo__SWIG_3(gp_Pln.getCPtr(P), P, gp_Cylinder.getCPtr(C), C, Tolang, Tol), true);
  }

  /**
   *  Intersects a plane and a cylinder.
   *  TolAng is the angular tolerance used to determine
   *  if the axis of the cylinder is parallel to the plane.
   *  Tol is the tolerance used to determine if the result
   *  is a circle or an ellipse. If the maximum distance between
   *  the ellipse solution and the circle centered at the ellipse
   *  center is less than Tol, the result will be the circle.
   *  H is the height of the cylinder <Cyl>. It is  used to check
   *  whether the plane and cylinder are parallel.
   */
  public void Perform( gp_Pln  P,  gp_Cylinder  C, double Tolang, double Tol, double H) {
    OCCwrapJavaJNI.IntAna_QuadQuadGeo_Perform__SWIG_1(swigCPtr, this, gp_Pln.getCPtr(P), P, gp_Cylinder.getCPtr(C), C, Tolang, Tol, H);
  }

  /**
   *  Intersects a plane and a sphere.
   */
  public void Perform( gp_Pln  P,  gp_Cylinder  C, double Tolang, double Tol) {
    OCCwrapJavaJNI.IntAna_QuadQuadGeo_Perform__SWIG_2(swigCPtr, this, gp_Pln.getCPtr(P), P, gp_Cylinder.getCPtr(C), C, Tolang, Tol);
  }

  /**
   *  Creates the intersection between a plane and a cone.
   *  TolAng is the angular tolerance used to determine
   *  if the axis of the cone is parallel or perpendicular
   *  to the plane, and if the generating line of the cone
   *  is parallel to the plane.
   *  Tol is the tolerance used to determine if the apex
   *  of the cone is in the plane.
   */
  public IntAna_QuadQuadGeo( gp_Pln  P,  gp_Sphere  S) {
    this(OCCwrapJavaJNI.new_IntAna_QuadQuadGeo__SWIG_4(gp_Pln.getCPtr(P), P, gp_Sphere.getCPtr(S), S), true);
  }

  /**
   *  Intersects a plane and a cone.
   *  TolAng is the angular tolerance used to determine
   *  if the axis of the cone is parallel or perpendicular
   *  to the plane, and if the generating line of the cone
   *  is parallel to the plane.
   *  Tol is the tolerance used to determine if the apex
   *  of the cone is in the plane.
   */
  public void Perform( gp_Pln  P,  gp_Sphere  S) {
    OCCwrapJavaJNI.IntAna_QuadQuadGeo_Perform__SWIG_3(swigCPtr, this, gp_Pln.getCPtr(P), P, gp_Sphere.getCPtr(S), S);
  }

  /**
   *  Creates the intersection between two cylinders.
   */
  public IntAna_QuadQuadGeo( gp_Pln  P,  gp_Cone  C, double Tolang, double Tol) {
    this(OCCwrapJavaJNI.new_IntAna_QuadQuadGeo__SWIG_5(gp_Pln.getCPtr(P), P, gp_Cone.getCPtr(C), C, Tolang, Tol), true);
  }

  /**
   *  Intersects two cylinders
   */
  public void Perform( gp_Pln  P,  gp_Cone  C, double Tolang, double Tol) {
    OCCwrapJavaJNI.IntAna_QuadQuadGeo_Perform__SWIG_4(swigCPtr, this, gp_Pln.getCPtr(P), P, gp_Cone.getCPtr(C), C, Tolang, Tol);
  }

  /**
   *  Creates the intersection between a Cylinder and a Sphere.
   */
  public IntAna_QuadQuadGeo( gp_Cylinder  Cyl1,  gp_Cylinder  Cyl2, double Tol) {
    this(OCCwrapJavaJNI.new_IntAna_QuadQuadGeo__SWIG_6(gp_Cylinder.getCPtr(Cyl1), Cyl1, gp_Cylinder.getCPtr(Cyl2), Cyl2, Tol), true);
  }

  /**
   *  Intersects a cylinder and a sphere.
   */
  public void Perform( gp_Cylinder  Cyl1,  gp_Cylinder  Cyl2, double Tol) {
    OCCwrapJavaJNI.IntAna_QuadQuadGeo_Perform__SWIG_5(swigCPtr, this, gp_Cylinder.getCPtr(Cyl1), Cyl1, gp_Cylinder.getCPtr(Cyl2), Cyl2, Tol);
  }

  /**
   *  Creates the intersection between a Cylinder and a Cone
   */
  public IntAna_QuadQuadGeo( gp_Cylinder  Cyl,  gp_Sphere  Sph, double Tol) {
    this(OCCwrapJavaJNI.new_IntAna_QuadQuadGeo__SWIG_7(gp_Cylinder.getCPtr(Cyl), Cyl, gp_Sphere.getCPtr(Sph), Sph, Tol), true);
  }

  /**
   *  Intersects a cylinder and a cone.
   */
  public void Perform( gp_Cylinder  Cyl,  gp_Sphere  Sph, double Tol) {
    OCCwrapJavaJNI.IntAna_QuadQuadGeo_Perform__SWIG_6(swigCPtr, this, gp_Cylinder.getCPtr(Cyl), Cyl, gp_Sphere.getCPtr(Sph), Sph, Tol);
  }

  /**
   *  Creates the intersection between two Spheres.
   */
  public IntAna_QuadQuadGeo( gp_Cylinder  Cyl,  gp_Cone  Con, double Tol) {
    this(OCCwrapJavaJNI.new_IntAna_QuadQuadGeo__SWIG_8(gp_Cylinder.getCPtr(Cyl), Cyl, gp_Cone.getCPtr(Con), Con, Tol), true);
  }

  /**
   *  Intersects a two spheres.
   */
  public void Perform( gp_Cylinder  Cyl,  gp_Cone  Con, double Tol) {
    OCCwrapJavaJNI.IntAna_QuadQuadGeo_Perform__SWIG_7(swigCPtr, this, gp_Cylinder.getCPtr(Cyl), Cyl, gp_Cone.getCPtr(Con), Con, Tol);
  }

  /**
   *  Creates the intersection beween a Sphere and a Cone.
   */
  public IntAna_QuadQuadGeo( gp_Sphere  Sph1,  gp_Sphere  Sph2, double Tol) {
    this(OCCwrapJavaJNI.new_IntAna_QuadQuadGeo__SWIG_9(gp_Sphere.getCPtr(Sph1), Sph1, gp_Sphere.getCPtr(Sph2), Sph2, Tol), true);
  }

  /**
   *  Intersects a sphere and a cone.
   */
  public void Perform( gp_Sphere  Sph1,  gp_Sphere  Sph2, double Tol) {
    OCCwrapJavaJNI.IntAna_QuadQuadGeo_Perform__SWIG_8(swigCPtr, this, gp_Sphere.getCPtr(Sph1), Sph1, gp_Sphere.getCPtr(Sph2), Sph2, Tol);
  }

  /**
   *  Creates the intersection beween two cones.
   */
  public IntAna_QuadQuadGeo( gp_Sphere  Sph,  gp_Cone  Con, double Tol) {
    this(OCCwrapJavaJNI.new_IntAna_QuadQuadGeo__SWIG_10(gp_Sphere.getCPtr(Sph), Sph, gp_Cone.getCPtr(Con), Con, Tol), true);
  }

  /**
   *  Intersects two cones.
   */
  public void Perform( gp_Sphere  Sph,  gp_Cone  Con, double Tol) {
    OCCwrapJavaJNI.IntAna_QuadQuadGeo_Perform__SWIG_9(swigCPtr, this, gp_Sphere.getCPtr(Sph), Sph, gp_Cone.getCPtr(Con), Con, Tol);
  }

  /**
   *  Creates the intersection beween plane and torus.
   */
  public IntAna_QuadQuadGeo( gp_Cone  Con1,  gp_Cone  Con2, double Tol) {
    this(OCCwrapJavaJNI.new_IntAna_QuadQuadGeo__SWIG_11(gp_Cone.getCPtr(Con1), Con1, gp_Cone.getCPtr(Con2), Con2, Tol), true);
  }

  /**
   *  Intersects plane and torus.
   */
  public void Perform( gp_Cone  Con1,  gp_Cone  Con2, double Tol) {
    OCCwrapJavaJNI.IntAna_QuadQuadGeo_Perform__SWIG_10(swigCPtr, this, gp_Cone.getCPtr(Con1), Con1, gp_Cone.getCPtr(Con2), Con2, Tol);
  }

  /**
   *  Creates the intersection beween cylinder and torus.
   */
  public IntAna_QuadQuadGeo( gp_Pln  Pln,  gp_Torus  Tor, double Tol) {
    this(OCCwrapJavaJNI.new_IntAna_QuadQuadGeo__SWIG_12(gp_Pln.getCPtr(Pln), Pln, gp_Torus.getCPtr(Tor), Tor, Tol), true);
  }

  /**
   *  Intersects cylinder and torus.
   */
  public void Perform( gp_Pln  Pln,  gp_Torus  Tor, double Tol) {
    OCCwrapJavaJNI.IntAna_QuadQuadGeo_Perform__SWIG_11(swigCPtr, this, gp_Pln.getCPtr(Pln), Pln, gp_Torus.getCPtr(Tor), Tor, Tol);
  }

  /**
   *  Creates the intersection beween cone and torus.
   */
  public IntAna_QuadQuadGeo( gp_Cylinder  Cyl,  gp_Torus  Tor, double Tol) {
    this(OCCwrapJavaJNI.new_IntAna_QuadQuadGeo__SWIG_13(gp_Cylinder.getCPtr(Cyl), Cyl, gp_Torus.getCPtr(Tor), Tor, Tol), true);
  }

  /**
   *  Intersects cone and torus.
   */
  public void Perform( gp_Cylinder  Cyl,  gp_Torus  Tor, double Tol) {
    OCCwrapJavaJNI.IntAna_QuadQuadGeo_Perform__SWIG_12(swigCPtr, this, gp_Cylinder.getCPtr(Cyl), Cyl, gp_Torus.getCPtr(Tor), Tor, Tol);
  }

  /**
   *  Creates the intersection beween sphere and torus.
   */
  public IntAna_QuadQuadGeo( gp_Cone  Con,  gp_Torus  Tor, double Tol) {
    this(OCCwrapJavaJNI.new_IntAna_QuadQuadGeo__SWIG_14(gp_Cone.getCPtr(Con), Con, gp_Torus.getCPtr(Tor), Tor, Tol), true);
  }

  /**
   *  Intersects sphere and torus.
   */
  public void Perform( gp_Cone  Con,  gp_Torus  Tor, double Tol) {
    OCCwrapJavaJNI.IntAna_QuadQuadGeo_Perform__SWIG_13(swigCPtr, this, gp_Cone.getCPtr(Con), Con, gp_Torus.getCPtr(Tor), Tor, Tol);
  }

  /**
   *  Creates the intersection beween two toruses.
   */
  public IntAna_QuadQuadGeo( gp_Sphere  Sph,  gp_Torus  Tor, double Tol) {
    this(OCCwrapJavaJNI.new_IntAna_QuadQuadGeo__SWIG_15(gp_Sphere.getCPtr(Sph), Sph, gp_Torus.getCPtr(Tor), Tor, Tol), true);
  }

  /**
   *  Intersects two toruses.
   */
  public void Perform( gp_Sphere  Sph,  gp_Torus  Tor, double Tol) {
    OCCwrapJavaJNI.IntAna_QuadQuadGeo_Perform__SWIG_14(swigCPtr, this, gp_Sphere.getCPtr(Sph), Sph, gp_Torus.getCPtr(Tor), Tor, Tol);
  }

  public IntAna_QuadQuadGeo( gp_Torus  Tor1,  gp_Torus  Tor2, double Tol) {
    this(OCCwrapJavaJNI.new_IntAna_QuadQuadGeo__SWIG_16(gp_Torus.getCPtr(Tor1), Tor1, gp_Torus.getCPtr(Tor2), Tor2, Tol), true);
  }

  public void Perform( gp_Torus  Tor1,  gp_Torus  Tor2, double Tol) {
    OCCwrapJavaJNI.IntAna_QuadQuadGeo_Perform__SWIG_15(swigCPtr, this, gp_Torus.getCPtr(Tor1), Tor1, gp_Torus.getCPtr(Tor2), Tor2, Tol);
  }

  /**
   *  Returns Standard_True if the computation was successful.
   */
  public long IsDone() {
    return OCCwrapJavaJNI.IntAna_QuadQuadGeo_IsDone(swigCPtr, this);
  }

  /**
   *  Returns the type of intersection.
   */
  public IntAna_ResultType TypeInter() {
    return IntAna_ResultType.swigToEnum(OCCwrapJavaJNI.IntAna_QuadQuadGeo_TypeInter(swigCPtr, this));
  }

  /**
   *  Returns the number of interesections.
   *  The possible intersections are :
   *  - 1 point
   *  - 1 or 2 line(s)
   *  - 1 Point and 1 Line
   *  - 1 circle
   *  - 1 ellipse
   *  - 1 parabola
   *  - 1 or 2 hyperbola(s).
   */
  public int NbSolutions() {
    return OCCwrapJavaJNI.IntAna_QuadQuadGeo_NbSolutions(swigCPtr, this);
  }

  /**
   *  Returns the point solution of range Num.
   */
  public gp_Pnt Point(int Num) {
    return new gp_Pnt(OCCwrapJavaJNI.IntAna_QuadQuadGeo_Point(swigCPtr, this, Num), true);
  }

  /**
   *  Returns the line solution of range Num.
   */
  public gp_Lin Line(int Num) {
    return new gp_Lin(OCCwrapJavaJNI.IntAna_QuadQuadGeo_Line(swigCPtr, this, Num), true);
  }

  /**
   *  Returns the circle solution of range Num.
   */
  public gp_Circ Circle(int Num) {
    return new gp_Circ(OCCwrapJavaJNI.IntAna_QuadQuadGeo_Circle(swigCPtr, this, Num), true);
  }

  /**
   *  Returns the ellipse solution of range Num.
   */
  public gp_Elips Ellipse(int Num) {
    return new gp_Elips(OCCwrapJavaJNI.IntAna_QuadQuadGeo_Ellipse(swigCPtr, this, Num), true);
  }

  /**
   *  Returns the parabola solution of range Num.
   */
  public gp_Parab Parabola(int Num) {
    return new gp_Parab(OCCwrapJavaJNI.IntAna_QuadQuadGeo_Parabola(swigCPtr, this, Num), true);
  }

  /**
   *  Returns the hyperbola solution of range Num.
   */
  public gp_Hypr Hyperbola(int Num) {
    return new gp_Hypr(OCCwrapJavaJNI.IntAna_QuadQuadGeo_Hyperbola(swigCPtr, this, Num), true);
  }

  public long HasCommonGen() {
    return OCCwrapJavaJNI.IntAna_QuadQuadGeo_HasCommonGen(swigCPtr, this);
  }

  public  gp_Pnt  PChar() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.IntAna_QuadQuadGeo_PChar(swigCPtr, this), true);
    return ret;
  }

}
