package opencascade;

/**
 *  This class provides the analytic intersection between
 *  a conic defined as an element of gp (Lin,Circ,Elips,
 *  Parab,Hypr) and a quadric as defined in the class
 *  Quadric from IntAna.
 *  The intersection between a conic and a plane is treated
 *  as a special case.
 * 
 *  The result of the intersection are points (Pnt from
 *  gp), associated with the parameter on the conic.
 * 
 *  A call to an Intersection  L:Lin from gp and
 *  SPH: Sphere from gp can be written either :
 *  IntAna_IntConicQuad Inter(L,IntAna_Quadric(SPH))
 *  or :
 *  IntAna_IntConicQuad Inter(L,SPH) (it is necessary
 *  to include IntAna_Quadric.hxx in this case)
 */
public class IntAna_IntConicQuad {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntAna_IntConicQuad(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntAna_IntConicQuad(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntAna_IntConicQuad obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (IntAna_IntConicQuad ptr) { Ptr = ptr; }
    public IntAna_IntConicQuad AsReference () { return Ptr; }
    public IntAna_IntConicQuad AsCopy () { return Ptr.MakeCopy(); }
    public IntAna_IntConicQuad Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntAna_IntConicQuad(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor.
   */
  public IntAna_IntConicQuad() {
    this(OCCwrapJavaJNI.new_IntAna_IntConicQuad__SWIG_0(), true);
  }

  /**
   *  Creates the intersection between a line and a quadric.
   */
  public IntAna_IntConicQuad( gp_Lin  L,  IntAna_Quadric  Q) {
    this(OCCwrapJavaJNI.new_IntAna_IntConicQuad__SWIG_1(gp_Lin.getCPtr(L), L, IntAna_Quadric.getCPtr(Q), Q), true);
  }

  /**
   *  Intersects a line and a quadric.
   */
  public void Perform( gp_Lin  L,  IntAna_Quadric  Q) {
    OCCwrapJavaJNI.IntAna_IntConicQuad_Perform__SWIG_0(swigCPtr, this, gp_Lin.getCPtr(L), L, IntAna_Quadric.getCPtr(Q), Q);
  }

  /**
   *  Creates the intersection between a circle and a quadric.
   */
  public IntAna_IntConicQuad( gp_Circ  C,  IntAna_Quadric  Q) {
    this(OCCwrapJavaJNI.new_IntAna_IntConicQuad__SWIG_2(gp_Circ.getCPtr(C), C, IntAna_Quadric.getCPtr(Q), Q), true);
  }

  /**
   *  Intersects a circle and a quadric.
   */
  public void Perform( gp_Circ  C,  IntAna_Quadric  Q) {
    OCCwrapJavaJNI.IntAna_IntConicQuad_Perform__SWIG_1(swigCPtr, this, gp_Circ.getCPtr(C), C, IntAna_Quadric.getCPtr(Q), Q);
  }

  /**
   *  Creates the intersection between an ellipse and a quadric.
   */
  public IntAna_IntConicQuad( gp_Elips  E,  IntAna_Quadric  Q) {
    this(OCCwrapJavaJNI.new_IntAna_IntConicQuad__SWIG_3(gp_Elips.getCPtr(E), E, IntAna_Quadric.getCPtr(Q), Q), true);
  }

  /**
   *  Intersects an ellipse and a quadric.
   */
  public void Perform( gp_Elips  E,  IntAna_Quadric  Q) {
    OCCwrapJavaJNI.IntAna_IntConicQuad_Perform__SWIG_2(swigCPtr, this, gp_Elips.getCPtr(E), E, IntAna_Quadric.getCPtr(Q), Q);
  }

  /**
   *  Creates the intersection between a parabola and a quadric.
   */
  public IntAna_IntConicQuad( gp_Parab  P,  IntAna_Quadric  Q) {
    this(OCCwrapJavaJNI.new_IntAna_IntConicQuad__SWIG_4(gp_Parab.getCPtr(P), P, IntAna_Quadric.getCPtr(Q), Q), true);
  }

  /**
   *  Intersects a parabola and a quadric.
   */
  public void Perform( gp_Parab  P,  IntAna_Quadric  Q) {
    OCCwrapJavaJNI.IntAna_IntConicQuad_Perform__SWIG_3(swigCPtr, this, gp_Parab.getCPtr(P), P, IntAna_Quadric.getCPtr(Q), Q);
  }

  /**
   *  Creates the intersection between an hyperbola and
   *  a quadric.
   */
  public IntAna_IntConicQuad( gp_Hypr  H,  IntAna_Quadric  Q) {
    this(OCCwrapJavaJNI.new_IntAna_IntConicQuad__SWIG_5(gp_Hypr.getCPtr(H), H, IntAna_Quadric.getCPtr(Q), Q), true);
  }

  /**
   *  Intersects an hyperbola and a quadric.
   */
  public void Perform( gp_Hypr  H,  IntAna_Quadric  Q) {
    OCCwrapJavaJNI.IntAna_IntConicQuad_Perform__SWIG_4(swigCPtr, this, gp_Hypr.getCPtr(H), H, IntAna_Quadric.getCPtr(Q), Q);
  }

  /**
   *  Intersection between a line and a plane.
   *  Tolang is used to determine if the angle between two
   *  vectors is null.
   *  Tol is used to check the distance between line and plane
   *  on the distance <Len> from the origin of the line.
   */
  public IntAna_IntConicQuad( gp_Lin  L,  gp_Pln  P, double Tolang, double Tol, double Len) {
    this(OCCwrapJavaJNI.new_IntAna_IntConicQuad__SWIG_6(gp_Lin.getCPtr(L), L, gp_Pln.getCPtr(P), P, Tolang, Tol, Len), true);
  }

  /**
   *  Intersection between a circle and a plane.
   *  Tolang is used to determine if the angle between two
   *  vectors is null.
   *  Tol is used to determine if a distance is null.
   */
  public IntAna_IntConicQuad( gp_Lin  L,  gp_Pln  P, double Tolang, double Tol) {
    this(OCCwrapJavaJNI.new_IntAna_IntConicQuad__SWIG_7(gp_Lin.getCPtr(L), L, gp_Pln.getCPtr(P), P, Tolang, Tol), true);
  }

  /**
   *  Intersection between an ellipse and a plane.
   *  Tolang is used to determine if the angle between two
   *  vectors is null.
   *  Tol is used to determine if a distance is null.
   */
  public IntAna_IntConicQuad( gp_Lin  L,  gp_Pln  P, double Tolang) {
    this(OCCwrapJavaJNI.new_IntAna_IntConicQuad__SWIG_8(gp_Lin.getCPtr(L), L, gp_Pln.getCPtr(P), P, Tolang), true);
  }

  /**
   *  Intersects a line and a plane.
   *  Tolang is used to determine if the angle between two
   *  vectors is null.
   *  Tol is used to check the distance between line and plane
   *  on the distance <Len> from the origin of the line.
   */
  public void Perform( gp_Lin  L,  gp_Pln  P, double Tolang, double Tol, double Len) {
    OCCwrapJavaJNI.IntAna_IntConicQuad_Perform__SWIG_5(swigCPtr, this, gp_Lin.getCPtr(L), L, gp_Pln.getCPtr(P), P, Tolang, Tol, Len);
  }

  /**
   *  Intersects a circle and a plane.
   *  Tolang is used to determine if the angle between two
   *  vectors is null.
   *  Tol is used to determine if a distance is null.
   */
  public void Perform( gp_Lin  L,  gp_Pln  P, double Tolang, double Tol) {
    OCCwrapJavaJNI.IntAna_IntConicQuad_Perform__SWIG_6(swigCPtr, this, gp_Lin.getCPtr(L), L, gp_Pln.getCPtr(P), P, Tolang, Tol);
  }

  /**
   *  Intersects an ellipse and a plane.
   *  Tolang is used to determine if the angle between two
   *  vectors is null.
   *  Tol is used to determine if a distance is null.
   */
  public void Perform( gp_Lin  L,  gp_Pln  P, double Tolang) {
    OCCwrapJavaJNI.IntAna_IntConicQuad_Perform__SWIG_7(swigCPtr, this, gp_Lin.getCPtr(L), L, gp_Pln.getCPtr(P), P, Tolang);
  }

  /**
   *  Intersection between a parabola and a plane.
   *  Tolang is used to determine if the angle between two
   *  vectors is null.
   */
  public IntAna_IntConicQuad( gp_Circ  C,  gp_Pln  P, double Tolang, double Tol) {
    this(OCCwrapJavaJNI.new_IntAna_IntConicQuad__SWIG_9(gp_Circ.getCPtr(C), C, gp_Pln.getCPtr(P), P, Tolang, Tol), true);
  }

  /**
   *  Intersects a parabola and a plane.
   *  Tolang is used to determine if the angle between two
   *  vectors is null.
   */
  public void Perform( gp_Circ  C,  gp_Pln  P, double Tolang, double Tol) {
    OCCwrapJavaJNI.IntAna_IntConicQuad_Perform__SWIG_8(swigCPtr, this, gp_Circ.getCPtr(C), C, gp_Pln.getCPtr(P), P, Tolang, Tol);
  }

  /**
   *  Intersection between an hyperbola and a plane.
   *  Tolang is used to determine if the angle between two
   *  vectors is null.
   */
  public IntAna_IntConicQuad( gp_Elips  E,  gp_Pln  P, double Tolang, double Tol) {
    this(OCCwrapJavaJNI.new_IntAna_IntConicQuad__SWIG_10(gp_Elips.getCPtr(E), E, gp_Pln.getCPtr(P), P, Tolang, Tol), true);
  }

  /**
   *  Intersects an hyperbola and a plane.
   *  Tolang is used to determine if the angle between two
   *  vectors is null.
   */
  public void Perform( gp_Elips  E,  gp_Pln  P, double Tolang, double Tol) {
    OCCwrapJavaJNI.IntAna_IntConicQuad_Perform__SWIG_9(swigCPtr, this, gp_Elips.getCPtr(E), E, gp_Pln.getCPtr(P), P, Tolang, Tol);
  }

  public IntAna_IntConicQuad( gp_Parab  Pb,  gp_Pln  P, double Tolang) {
    this(OCCwrapJavaJNI.new_IntAna_IntConicQuad__SWIG_11(gp_Parab.getCPtr(Pb), Pb, gp_Pln.getCPtr(P), P, Tolang), true);
  }

  public void Perform( gp_Parab  Pb,  gp_Pln  P, double Tolang) {
    OCCwrapJavaJNI.IntAna_IntConicQuad_Perform__SWIG_10(swigCPtr, this, gp_Parab.getCPtr(Pb), Pb, gp_Pln.getCPtr(P), P, Tolang);
  }

  public IntAna_IntConicQuad( gp_Hypr  H,  gp_Pln  P, double Tolang) {
    this(OCCwrapJavaJNI.new_IntAna_IntConicQuad__SWIG_12(gp_Hypr.getCPtr(H), H, gp_Pln.getCPtr(P), P, Tolang), true);
  }

  public void Perform( gp_Hypr  H,  gp_Pln  P, double Tolang) {
    OCCwrapJavaJNI.IntAna_IntConicQuad_Perform__SWIG_11(swigCPtr, this, gp_Hypr.getCPtr(H), H, gp_Pln.getCPtr(P), P, Tolang);
  }

  /**
   *  Returns TRUE if the creation completed.
   */
  public long IsDone() {
    return OCCwrapJavaJNI.IntAna_IntConicQuad_IsDone(swigCPtr, this);
  }

  /**
   *  Returns TRUE if the conic is in the quadric.
   */
  public long IsInQuadric() {
    return OCCwrapJavaJNI.IntAna_IntConicQuad_IsInQuadric(swigCPtr, this);
  }

  /**
   *  Returns TRUE if the line is in a quadric which
   *  is parallel to the quadric.
   */
  public long IsParallel() {
    return OCCwrapJavaJNI.IntAna_IntConicQuad_IsParallel(swigCPtr, this);
  }

  /**
   *  Returns the number of intersection point.
   */
  public int NbPoints() {
    return OCCwrapJavaJNI.IntAna_IntConicQuad_NbPoints(swigCPtr, this);
  }

  /**
   *  Returns the point of range N.
   */
  public  gp_Pnt  Point(int N) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.IntAna_IntConicQuad_Point(swigCPtr, this, N), true);
    return ret;
  }

  /**
   *  Returns the parameter on the line of the intersection
   *  point of range N.
   */
  public double ParamOnConic(int N) {
    return OCCwrapJavaJNI.IntAna_IntConicQuad_ParamOnConic(swigCPtr, this, N);
  }

}
