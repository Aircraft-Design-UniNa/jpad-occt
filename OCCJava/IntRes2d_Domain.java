package opencascade;

/**
 *  Definition of the domain of parameter on a 2d-curve.
 *  Most of the time, a domain is defined by two extremities.
 *  An extremity is made of :
 *  - a point in 2d-space (Pnt2d from gp),
 *  - a parameter on the curve,
 *  - a tolerance in the 2d-space.
 *  Sometimes, it can be made of 0 or 1 point ( for an infinite
 *  or semi-infinite line for example).
 * 
 *  For Intersection algorithms, Ellipses and Circles
 *  Domains must be closed.
 *  So, SetEquivalentParameters(.,.) method must be called
 *  after initializing the first and the last bounds.
 */
public class IntRes2d_Domain {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntRes2d_Domain(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntRes2d_Domain(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntRes2d_Domain obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (IntRes2d_Domain ptr) { Ptr = ptr; }
    public IntRes2d_Domain AsReference () { return Ptr; }
    public IntRes2d_Domain AsCopy () { return Ptr.MakeCopy(); }
    public IntRes2d_Domain Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntRes2d_Domain(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an infinite Domain (HasFirstPoint = False
   *  and HasLastPoint = False).
   */
  public IntRes2d_Domain() {
    this(OCCwrapJavaJNI.new_IntRes2d_Domain__SWIG_0(), true);
  }

  /**
   *  Creates a bounded Domain.
   */
  public IntRes2d_Domain( gp_Pnt2d  Pnt1, double Par1, double Tol1,  gp_Pnt2d  Pnt2, double Par2, double Tol2) {
    this(OCCwrapJavaJNI.new_IntRes2d_Domain__SWIG_1(gp_Pnt2d.getCPtr(Pnt1), Pnt1, Par1, Tol1, gp_Pnt2d.getCPtr(Pnt2), Pnt2, Par2, Tol2), true);
  }

  /**
   *  Creates a semi-infinite Domain. If First is set to
   *  True, the given point is the first point of the domain,
   *  otherwise it is the last point.
   */
  public IntRes2d_Domain( gp_Pnt2d  Pnt, double Par, double Tol, long First) {
    this(OCCwrapJavaJNI.new_IntRes2d_Domain__SWIG_2(gp_Pnt2d.getCPtr(Pnt), Pnt, Par, Tol, First), true);
  }

  /**
   *  Sets the values for a bounded domain.
   */
  public void SetValues( gp_Pnt2d  Pnt1, double Par1, double Tol1,  gp_Pnt2d  Pnt2, double Par2, double Tol2) {
    OCCwrapJavaJNI.IntRes2d_Domain_SetValues__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(Pnt1), Pnt1, Par1, Tol1, gp_Pnt2d.getCPtr(Pnt2), Pnt2, Par2, Tol2);
  }

  /**
   *  Sets the values for an infinite domain.
   */
  public void SetValues() {
    OCCwrapJavaJNI.IntRes2d_Domain_SetValues__SWIG_1(swigCPtr, this);
  }

  /**
   *  Sets the values for a semi-infinite domain.
   */
  public void SetValues( gp_Pnt2d  Pnt, double Par, double Tol, long First) {
    OCCwrapJavaJNI.IntRes2d_Domain_SetValues__SWIG_2(swigCPtr, this, gp_Pnt2d.getCPtr(Pnt), Pnt, Par, Tol, First);
  }

  /**
   *  Defines a closed domain.
   */
  public void SetEquivalentParameters(double zero, double period) {
    OCCwrapJavaJNI.IntRes2d_Domain_SetEquivalentParameters(swigCPtr, this, zero, period);
  }

  /**
   *  Returns True if the domain has a first point, i-e
   *  a point defining the lowest admitted parameter on the
   *  curve.
   */
  public long HasFirstPoint() {
    return OCCwrapJavaJNI.IntRes2d_Domain_HasFirstPoint(swigCPtr, this);
  }

  /**
   *  Returns the parameter of the first point of the domain
   *  The exception DomainError is raised if HasFirstPoint
   *  returns False.
   */
  public double FirstParameter() {
    return OCCwrapJavaJNI.IntRes2d_Domain_FirstParameter(swigCPtr, this);
  }

  /**
   *  Returns the first point of the domain.
   *  The exception DomainError is raised if HasFirstPoint
   *  returns False.
   */
  public  gp_Pnt2d  FirstPoint() {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.IntRes2d_Domain_FirstPoint(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the tolerance of the first (left) bound.
   *  The exception DomainError is raised if HasFirstPoint
   *  returns False.
   */
  public double FirstTolerance() {
    return OCCwrapJavaJNI.IntRes2d_Domain_FirstTolerance(swigCPtr, this);
  }

  /**
   *  Returns True if the domain has a last point, i-e
   *  a point defining the highest admitted parameter on the
   *  curve.
   */
  public long HasLastPoint() {
    return OCCwrapJavaJNI.IntRes2d_Domain_HasLastPoint(swigCPtr, this);
  }

  /**
   *  Returns the parameter of the last point of the domain.
   *  The exception DomainError is raised if HasLastPoint
   *  returns False.
   */
  public double LastParameter() {
    return OCCwrapJavaJNI.IntRes2d_Domain_LastParameter(swigCPtr, this);
  }

  /**
   *  Returns the last point of the domain.
   *  The exception DomainError is raised if HasLastPoint
   *  returns False.
   */
  public  gp_Pnt2d  LastPoint() {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.IntRes2d_Domain_LastPoint(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the tolerance of the last (right) bound.
   *  The exception DomainError is raised if HasLastPoint
   *  returns False.
   */
  public double LastTolerance() {
    return OCCwrapJavaJNI.IntRes2d_Domain_LastTolerance(swigCPtr, this);
  }

  /**
   *  Returns True if the domain is closed.
   */
  public long IsClosed() {
    return OCCwrapJavaJNI.IntRes2d_Domain_IsClosed(swigCPtr, this);
  }

  /**
   *  Returns Equivalent parameters if the domain is closed.
   *  Otherwise, the exception DomainError is raised.
   */
  public void EquivalentParameters(double[] zero, double[] zeroplusperiod) {
    OCCwrapJavaJNI.IntRes2d_Domain_EquivalentParameters(swigCPtr, this, zero, zeroplusperiod);
  }

}
