package opencascade;

/**
 *  Definition of a parametric Curve which is the result
 *  of the intersection between two quadrics.
 */
public class IntAna_Curve {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntAna_Curve(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntAna_Curve(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntAna_Curve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (IntAna_Curve ptr) { Ptr = ptr; }
    public IntAna_Curve AsReference () { return Ptr; }
    public IntAna_Curve AsCopy () { return Ptr.MakeCopy(); }
    public IntAna_Curve Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntAna_Curve(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty Constructor
   */
  public IntAna_Curve() {
    this(OCCwrapJavaJNI.new_IntAna_Curve(), true);
  }

  /**
   *  Sets the parameters used to compute Points and Derivative
   *  on the curve.
   */
  public void SetCylinderQuadValues( gp_Cylinder  Cylinder, double Qxx, double Qyy, double Qzz, double Qxy, double Qxz, double Qyz, double Qx, double Qy, double Qz, double Q1, double Tol, double DomInf, double DomSup, long TwoZForATheta, long ZIsPositive) {
    OCCwrapJavaJNI.IntAna_Curve_SetCylinderQuadValues(swigCPtr, this, gp_Cylinder.getCPtr(Cylinder), Cylinder, Qxx, Qyy, Qzz, Qxy, Qxz, Qyz, Qx, Qy, Qz, Q1, Tol, DomInf, DomSup, TwoZForATheta, ZIsPositive);
  }

  /**
   *  Sets  the parameters used    to compute Points  and
   *  Derivative on the curve.
   */
  public void SetConeQuadValues( gp_Cone  Cone, double Qxx, double Qyy, double Qzz, double Qxy, double Qxz, double Qyz, double Qx, double Qy, double Qz, double Q1, double Tol, double DomInf, double DomSup, long TwoZForATheta, long ZIsPositive) {
    OCCwrapJavaJNI.IntAna_Curve_SetConeQuadValues(swigCPtr, this, gp_Cone.getCPtr(Cone), Cone, Qxx, Qyy, Qzz, Qxy, Qxz, Qyz, Qx, Qy, Qz, Q1, Tol, DomInf, DomSup, TwoZForATheta, ZIsPositive);
  }

  /**
   *  Returns TRUE if the curve is not  infinite  at the
   *  last parameter or at the first parameter of the domain.
   */
  public long IsOpen() {
    return OCCwrapJavaJNI.IntAna_Curve_IsOpen(swigCPtr, this);
  }

  /**
   *  Returns the paramatric domain of the curve.
   */
  public void Domain(double[] Theta1, double[] Theta2) {
    OCCwrapJavaJNI.IntAna_Curve_Domain(swigCPtr, this, Theta1, Theta2);
  }

  /**
   *  Returns TRUE if the function is constant.
   */
  public long IsConstant() {
    return OCCwrapJavaJNI.IntAna_Curve_IsConstant(swigCPtr, this);
  }

  /**
   *  Returns TRUE if the domain is open at the beginning.
   */
  public long IsFirstOpen() {
    return OCCwrapJavaJNI.IntAna_Curve_IsFirstOpen(swigCPtr, this);
  }

  /**
   *  Returns TRUE if the domain is open at the end.
   */
  public long IsLastOpen() {
    return OCCwrapJavaJNI.IntAna_Curve_IsLastOpen(swigCPtr, this);
  }

  /**
   *  Returns the point at parameter Theta on the curve.
   */
  public gp_Pnt Value(double Theta) {
    return new gp_Pnt(OCCwrapJavaJNI.IntAna_Curve_Value(swigCPtr, this, Theta), true);
  }

  /**
   *  Returns the point and the first derivative at parameter
   *  Theta on the curve.
   */
  public long D1u(double Theta, gp_Pnt P, gp_Vec V) {
    return OCCwrapJavaJNI.IntAna_Curve_D1u(swigCPtr, this, Theta, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V), V);
  }

  /**
   *  Tries to find the parameter of the point P on the curve.
   *  If the method returns False, the "projection" is
   *  impossible, and the value of Para is not significant.
   *  If the method returns True, Para is the parameter of the
   *  nearest intersection between the curve and the iso-theta
   *  containing P.
   */
  public long FindParameter( gp_Pnt  P, double[] Para) {
    return OCCwrapJavaJNI.IntAna_Curve_FindParameter(swigCPtr, this, gp_Pnt.getCPtr(P), P, Para);
  }

  /**
   *  If flag is True, the Curve is not defined at the
   *  first parameter of its domain.
   */
  public void SetIsFirstOpen(long Flag) {
    OCCwrapJavaJNI.IntAna_Curve_SetIsFirstOpen(swigCPtr, this, Flag);
  }

  /**
   *  If flag is True, the Curve is not defined at the
   *  first parameter of its domain.
   */
  public void SetIsLastOpen(long Flag) {
    OCCwrapJavaJNI.IntAna_Curve_SetIsLastOpen(swigCPtr, this, Flag);
  }

  /**
   *  Protected function.
   */
  public void InternalUVValue(double Param, double[] U, double[] V, double[] A, double[] B, double[] C, double[] Co, double[] Si, double[] Di) {
    OCCwrapJavaJNI.IntAna_Curve_InternalUVValue(swigCPtr, this, Param, U, V, A, B, C, Co, Si, Di);
  }

  public void SetDomain(double Theta1, double Theta2) {
    OCCwrapJavaJNI.IntAna_Curve_SetDomain(swigCPtr, this, Theta1, Theta2);
  }

}
