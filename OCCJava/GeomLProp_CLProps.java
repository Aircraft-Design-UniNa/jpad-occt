package opencascade;

public class GeomLProp_CLProps {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GeomLProp_CLProps(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GeomLProp_CLProps(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GeomLProp_CLProps obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomLProp_CLProps(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Initializes the local properties of the curve <C>
   *  The current point and the derivatives are
   *  computed at the same time, which allows an
   *  optimization of the computation time.
   *  <N> indicates the maximum number of derivations to
   *  be done (0, 1, 2 or 3). For example, to compute
   *  only the tangent, N should be equal to 1.
   *  <Resolution> is the linear tolerance (it is used to test
   *  if a vector is null).
   */
  public GeomLProp_CLProps( Geom_Curve  C, int N, double Resolution) {
    this(OCCwrapJavaJNI.new_GeomLProp_CLProps__SWIG_0( Geom_Curve.getCPtr(C) , C, N, Resolution), true);
  }

  /**
   *  Same as previous constructor but here the parameter is
   *  set to the value <U>.
   *  All the computations done will be related to <C> and <U>.
   */
  public GeomLProp_CLProps( Geom_Curve  C, double U, int N, double Resolution) {
    this(OCCwrapJavaJNI.new_GeomLProp_CLProps__SWIG_1( Geom_Curve.getCPtr(C) , C, U, N, Resolution), true);
  }

  /**
   *  Same as previous constructor but here the parameter is
   *  set to the value <U> and the curve is set
   *  with SetCurve.
   *  the curve can have a empty constructor
   *  All the computations done will be related to <C> and <U>
   *  when the functions "set" will be done.
   */
  public GeomLProp_CLProps(int N, double Resolution) {
    this(OCCwrapJavaJNI.new_GeomLProp_CLProps__SWIG_2(N, Resolution), true);
  }

  /**
   *  Initializes the local properties of the curve
   *  for the parameter value <U>.
   */
  public void SetParameter(double U) {
    OCCwrapJavaJNI.GeomLProp_CLProps_SetParameter(swigCPtr, this, U);
  }

  /**
   *  Initializes the local properties of the curve
   *  for the new curve.
   */
  public void SetCurve( Geom_Curve  C) {
    OCCwrapJavaJNI.GeomLProp_CLProps_SetCurve(swigCPtr, this,  Geom_Curve.getCPtr(C) , C);
  }

  /**
   *  Returns the Point.
   */
  public  gp_Pnt  Value() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.GeomLProp_CLProps_Value(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the first derivative.
   *  The derivative is computed if it has not been yet.
   */
  public  gp_Vec  D1() {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.GeomLProp_CLProps_D1(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the second derivative.
   *  The derivative is computed if it has not been yet.
   */
  public  gp_Vec  D2() {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.GeomLProp_CLProps_D2(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the third derivative.
   *  The derivative is computed if it has not been yet.
   */
  public  gp_Vec  D3() {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.GeomLProp_CLProps_D3(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns True if the tangent is defined.
   *  For example, the tangent is not defined if the
   *  three first derivatives are all null.
   */
  public long IsTangentDefined() {
    return OCCwrapJavaJNI.GeomLProp_CLProps_IsTangentDefined(swigCPtr, this);
  }

  /**
   *  output  the tangent direction <D>
   */
  public void Tangent(gp_Dir D) {
    OCCwrapJavaJNI.GeomLProp_CLProps_Tangent(swigCPtr, this, gp_Dir.getCPtr(D), D);
  }

  /**
   *  Returns the curvature.
   */
  public double Curvature() {
    return OCCwrapJavaJNI.GeomLProp_CLProps_Curvature(swigCPtr, this);
  }

  /**
   *  Returns the normal direction <N>.
   */
  public void Normal(gp_Dir N) {
    OCCwrapJavaJNI.GeomLProp_CLProps_Normal(swigCPtr, this, gp_Dir.getCPtr(N), N);
  }

  /**
   *  Returns the centre of curvature <P>.
   */
  public void CentreOfCurvature(gp_Pnt P) {
    OCCwrapJavaJNI.GeomLProp_CLProps_CentreOfCurvature(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

}
