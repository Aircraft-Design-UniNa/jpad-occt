package opencascade;

public class GeomLProp_SLProps {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GeomLProp_SLProps(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GeomLProp_SLProps(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GeomLProp_SLProps obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomLProp_SLProps(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Initializes the local properties of the surface <S>
   *  for the parameter values (<U>, <V>).
   *  The current point and the derivatives are
   *  computed at the same time, which allows an
   *  optimization of the computation time.
   *  <N> indicates the maximum number of derivations to
   *  be done (0, 1, or 2). For example, to compute
   *  only the tangent, N should be equal to 1.
   *  <Resolution> is the linear tolerance (it is used to test
   *  if a vector is null).
   */
  public GeomLProp_SLProps( Geom_Surface  S, double U, double V, int N, double Resolution) {
    this(OCCwrapJavaJNI.new_GeomLProp_SLProps__SWIG_0( Geom_Surface.getCPtr(S) , S, U, V, N, Resolution), true);
  }

  /**
   *  idem as previous constructor but without setting the value
   *  of parameters <U> and <V>.
   */
  public GeomLProp_SLProps( Geom_Surface  S, int N, double Resolution) {
    this(OCCwrapJavaJNI.new_GeomLProp_SLProps__SWIG_1( Geom_Surface.getCPtr(S) , S, N, Resolution), true);
  }

  /**
   *  idem as previous constructor but without setting the value
   *  of parameters <U> and <V> and the surface.
   *  the surface can have an empty constructor.
   */
  public GeomLProp_SLProps(int N, double Resolution) {
    this(OCCwrapJavaJNI.new_GeomLProp_SLProps__SWIG_2(N, Resolution), true);
  }

  /**
   *  Initializes the local properties of the surface S
   *  for the new surface.
   */
  public void SetSurface( Geom_Surface  S) {
    OCCwrapJavaJNI.GeomLProp_SLProps_SetSurface(swigCPtr, this,  Geom_Surface.getCPtr(S) , S);
  }

  /**
   *  Initializes the local properties of the surface S
   *  for the new parameter values (<U>, <V>).
   */
  public void SetParameters(double U, double V) {
    OCCwrapJavaJNI.GeomLProp_SLProps_SetParameters(swigCPtr, this, U, V);
  }

  /**
   *  Returns the point.
   */
  public  gp_Pnt  Value() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.GeomLProp_SLProps_Value(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the first U derivative.
   *  The derivative is computed if it has not been yet.
   */
  public  gp_Vec  D1U() {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.GeomLProp_SLProps_D1U(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the first V derivative.
   *  The derivative is computed if it has not been yet.
   */
  public  gp_Vec  D1V() {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.GeomLProp_SLProps_D1V(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the second U derivatives
   *  The derivative is computed if it has not been yet.
   */
  public  gp_Vec  D2U() {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.GeomLProp_SLProps_D2U(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the second V derivative.
   *  The derivative is computed if it has not been yet.
   */
  public  gp_Vec  D2V() {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.GeomLProp_SLProps_D2V(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the second UV cross-derivative.
   *  The derivative is computed if it has not been yet.
   */
  public  gp_Vec  DUV() {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.GeomLProp_SLProps_DUV(swigCPtr, this), true);
    return ret;
  }

  /**
   *  returns True if the U tangent is defined.
   *  For example, the tangent is not defined if the
   *  two first U derivatives are null.
   */
  public long IsTangentUDefined() {
    return OCCwrapJavaJNI.GeomLProp_SLProps_IsTangentUDefined(swigCPtr, this);
  }

  /**
   *  Returns the tangent direction <D> on the iso-V.
   */
  public void TangentU(gp_Dir D) {
    OCCwrapJavaJNI.GeomLProp_SLProps_TangentU(swigCPtr, this, gp_Dir.getCPtr(D), D);
  }

  /**
   *  returns if the V tangent is defined.
   *  For example, the tangent is not defined if the
   *  two first V derivatives are null.
   */
  public long IsTangentVDefined() {
    return OCCwrapJavaJNI.GeomLProp_SLProps_IsTangentVDefined(swigCPtr, this);
  }

  /**
   *  Returns the tangent direction <D> on the iso-V.
   */
  public void TangentV(gp_Dir D) {
    OCCwrapJavaJNI.GeomLProp_SLProps_TangentV(swigCPtr, this, gp_Dir.getCPtr(D), D);
  }

  /**
   *  Tells if the normal is defined.
   */
  public long IsNormalDefined() {
    return OCCwrapJavaJNI.GeomLProp_SLProps_IsNormalDefined(swigCPtr, this);
  }

  /**
   *  Returns the normal direction.
   */
  public  gp_Dir  Normal() {
    gp_Dir ret = new gp_Dir(OCCwrapJavaJNI.GeomLProp_SLProps_Normal(swigCPtr, this), true);
    return ret;
  }

  /**
   *  returns True if the curvature is defined.
   */
  public long IsCurvatureDefined() {
    return OCCwrapJavaJNI.GeomLProp_SLProps_IsCurvatureDefined(swigCPtr, this);
  }

  /**
   *  returns True if the point is umbilic (i.e. if the
   *  curvature is constant).
   */
  public long IsUmbilic() {
    return OCCwrapJavaJNI.GeomLProp_SLProps_IsUmbilic(swigCPtr, this);
  }

  /**
   *  Returns the maximum curvature
   */
  public double MaxCurvature() {
    return OCCwrapJavaJNI.GeomLProp_SLProps_MaxCurvature(swigCPtr, this);
  }

  /**
   *  Returns the minimum curvature
   */
  public double MinCurvature() {
    return OCCwrapJavaJNI.GeomLProp_SLProps_MinCurvature(swigCPtr, this);
  }

  /**
   *  Returns the direction of the maximum and minimum curvature
   *  <MaxD> and <MinD>
   */
  public void CurvatureDirections(gp_Dir MaxD, gp_Dir MinD) {
    OCCwrapJavaJNI.GeomLProp_SLProps_CurvatureDirections(swigCPtr, this, gp_Dir.getCPtr(MaxD), MaxD, gp_Dir.getCPtr(MinD), MinD);
  }

  /**
   *  Returns the mean curvature.
   */
  public double MeanCurvature() {
    return OCCwrapJavaJNI.GeomLProp_SLProps_MeanCurvature(swigCPtr, this);
  }

  /**
   *  Returns the Gaussian curvature
   */
  public double GaussianCurvature() {
    return OCCwrapJavaJNI.GeomLProp_SLProps_GaussianCurvature(swigCPtr, this);
  }

}
