package opencascade;

/**
 *  This class provides the analytic intersection between a
 *  cylinder or a cone from gp and another quadric, as defined
 *  in the class Quadric from IntAna.
 *  This algorithm is used when the geometric intersection
 *  (class QuadQuadGeo from IntAna) returns no geometric
 *  solution.
 *  The result of the intersection may be
 *  - Curves as defined in the class Curve from IntAna
 *  - Points (Pnt from gp)
 */
public class IntAna_IntQuadQuad {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntAna_IntQuadQuad(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntAna_IntQuadQuad(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntAna_IntQuadQuad obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (IntAna_IntQuadQuad ptr) { Ptr = ptr; }
    public IntAna_IntQuadQuad AsReference () { return Ptr; }
    public IntAna_IntQuadQuad AsCopy () { return Ptr.MakeCopy(); }
    public IntAna_IntQuadQuad Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntAna_IntQuadQuad(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty Constructor
   */
  public IntAna_IntQuadQuad() {
    this(OCCwrapJavaJNI.new_IntAna_IntQuadQuad__SWIG_0(), true);
  }

  /**
   *  Creates the intersection between a cylinder and a quadric .
   *  Tol est a definir plus precisemment.
   */
  public IntAna_IntQuadQuad( gp_Cylinder  C,  IntAna_Quadric  Q, double Tol) {
    this(OCCwrapJavaJNI.new_IntAna_IntQuadQuad__SWIG_1(gp_Cylinder.getCPtr(C), C, IntAna_Quadric.getCPtr(Q), Q, Tol), true);
  }

  /**
   *  Creates the intersection between a cone and a quadric.
   *  Tol est a definir plus precisemment.
   */
  public IntAna_IntQuadQuad( gp_Cone  C,  IntAna_Quadric  Q, double Tol) {
    this(OCCwrapJavaJNI.new_IntAna_IntQuadQuad__SWIG_2(gp_Cone.getCPtr(C), C, IntAna_Quadric.getCPtr(Q), Q, Tol), true);
  }

  /**
   *  Intersects a cylinder and a quadric .
   *  Tol est a definir plus precisemment.
   */
  public void Perform( gp_Cylinder  C,  IntAna_Quadric  Q, double Tol) {
    OCCwrapJavaJNI.IntAna_IntQuadQuad_Perform__SWIG_0(swigCPtr, this, gp_Cylinder.getCPtr(C), C, IntAna_Quadric.getCPtr(Q), Q, Tol);
  }

  /**
   *  Intersects a cone and a quadric.
   *  Tol est a definir plus precisemment.
   */
  public void Perform( gp_Cone  C,  IntAna_Quadric  Q, double Tol) {
    OCCwrapJavaJNI.IntAna_IntQuadQuad_Perform__SWIG_1(swigCPtr, this, gp_Cone.getCPtr(C), C, IntAna_Quadric.getCPtr(Q), Q, Tol);
  }

  /**
   *  Returns True if the computation was successful.
   */
  public long IsDone() {
    return OCCwrapJavaJNI.IntAna_IntQuadQuad_IsDone(swigCPtr, this);
  }

  /**
   *  Returns TRUE if the cylinder, the cone or the sphere
   *  is identical to the quadric.
   */
  public long IdenticalElements() {
    return OCCwrapJavaJNI.IntAna_IntQuadQuad_IdenticalElements(swigCPtr, this);
  }

  /**
   *  Returns the number of curves solution.
   */
  public int NbCurve() {
    return OCCwrapJavaJNI.IntAna_IntQuadQuad_NbCurve(swigCPtr, this);
  }

  /**
   *  Returns the curve of range N.
   */
  public  IntAna_Curve  Curve(int N) {
    IntAna_Curve ret = new IntAna_Curve(OCCwrapJavaJNI.IntAna_IntQuadQuad_Curve(swigCPtr, this, N), true);
    return ret;
  }

  /**
   *  Returns the number of contact point.
   */
  public int NbPnt() {
    return OCCwrapJavaJNI.IntAna_IntQuadQuad_NbPnt(swigCPtr, this);
  }

  /**
   *  Returns the point of range N.
   */
  public  gp_Pnt  Point(int N) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.IntAna_IntQuadQuad_Point(swigCPtr, this, N), true);
    return ret;
  }

  /**
   *  Returns  the paramaters on the  "explicit quadric"
   *  (i.e  the cylinder or the  cone, the
   *  first argument   given to the constructor)  of the
   *  point of  range  N.
   */
  public void Parameters(int N, double[] U1, double[] U2) {
    OCCwrapJavaJNI.IntAna_IntQuadQuad_Parameters(swigCPtr, this, N, U1, U2);
  }

  /**
   *  Returns True if the Curve I  shares its last bound
   *  with another curve.
   */
  public long HasNextCurve(int I) {
    return OCCwrapJavaJNI.IntAna_IntQuadQuad_HasNextCurve(swigCPtr, this, I);
  }

  /**
   *  If  HasNextCurve(I)  returns True,  this  function
   *  returns  the  Index J  of the curve  which   has a
   *  common bound  with the curve   I.  If  theOpposite ==
   *  True , then the last parameter of the curve I, and
   *  the last parameter of  the curve J  give  the same
   *  point. Else the last  parameter of the curve I and
   *  the first parameter  of  the curve J are  the same
   *  point.
   */
  public int NextCurve(int I, long[] theOpposite) {
    return OCCwrapJavaJNI.IntAna_IntQuadQuad_NextCurve(swigCPtr, this, I, theOpposite);
  }

  /**
   *  Returns True if the Curve I shares its first bound
   *  with another curve.
   */
  public long HasPreviousCurve(int I) {
    return OCCwrapJavaJNI.IntAna_IntQuadQuad_HasPreviousCurve(swigCPtr, this, I);
  }

  /**
   *  if HasPreviousCurve(I) returns True, this function
   *  returns the   Index  J of the   curve  which has a
   *  common  bound with the  curve  I.  If theOpposite  ==
   *  True  , then the  first parameter of  the curve I,
   *  and the first parameter of the curve  J  give  the
   *  same point. Else the first  parameter of the curve
   *  I and the last  parameter  of the curve J  are the
   *  same point.
   */
  public int PreviousCurve(int I, long[] theOpposite) {
    return OCCwrapJavaJNI.IntAna_IntQuadQuad_PreviousCurve(swigCPtr, this, I, theOpposite);
  }

}
