package opencascade;

public class AppDef_BSplineCompute {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  AppDef_BSplineCompute(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  AppDef_BSplineCompute(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(AppDef_BSplineCompute obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_AppDef_BSplineCompute(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  The MultiLine <Line> will be approximated until tolerances
   *  will be reached.
   *  The approximation will be done from degreemin to degreemax
   *  with a cutting if the corresponding boolean is True.
   *  If <Squares> is True, the computation will be done with
   *  no iteration at all.
   * 
   *  The multiplicities of the internal knots is set by
   *  default.
   */
  public AppDef_BSplineCompute( AppDef_MultiLine  Line, int degreemin, int degreemax, double Tolerance3d, double Tolerance2d, int NbIterations, long cutting, Approx_ParametrizationType parametrization, long Squares) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_0(AppDef_MultiLine.getCPtr(Line), Line, degreemin, degreemax, Tolerance3d, Tolerance2d, NbIterations, cutting, parametrization.swigValue(), Squares), true);
  }

  /**
   *  The MultiLine <Line> will be approximated until tolerances
   *  will be reached.
   *  The approximation will be done from degreemin to degreemax
   *  with a cutting if the corresponding boolean is True.
   *  If <Squares> is True, the computation will be done with
   *  no iteration at all.
   */
  public AppDef_BSplineCompute( AppDef_MultiLine  Line, int degreemin, int degreemax, double Tolerance3d, double Tolerance2d, int NbIterations, long cutting, Approx_ParametrizationType parametrization) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_1(AppDef_MultiLine.getCPtr(Line), Line, degreemin, degreemax, Tolerance3d, Tolerance2d, NbIterations, cutting, parametrization.swigValue()), true);
  }

  /**
   *  Initializes the fields of the algorithm.
   */
  public AppDef_BSplineCompute( AppDef_MultiLine  Line, int degreemin, int degreemax, double Tolerance3d, double Tolerance2d, int NbIterations, long cutting) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_2(AppDef_MultiLine.getCPtr(Line), Line, degreemin, degreemax, Tolerance3d, Tolerance2d, NbIterations, cutting), true);
  }

  /**
   *  Initializes the fields of the algorithm.
   */
  public AppDef_BSplineCompute( AppDef_MultiLine  Line, int degreemin, int degreemax, double Tolerance3d, double Tolerance2d, int NbIterations) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_3(AppDef_MultiLine.getCPtr(Line), Line, degreemin, degreemax, Tolerance3d, Tolerance2d, NbIterations), true);
  }

  public AppDef_BSplineCompute( AppDef_MultiLine  Line, int degreemin, int degreemax, double Tolerance3d, double Tolerance2d) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_4(AppDef_MultiLine.getCPtr(Line), Line, degreemin, degreemax, Tolerance3d, Tolerance2d), true);
  }

  public AppDef_BSplineCompute( AppDef_MultiLine  Line, int degreemin, int degreemax, double Tolerance3d) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_5(AppDef_MultiLine.getCPtr(Line), Line, degreemin, degreemax, Tolerance3d), true);
  }

  public AppDef_BSplineCompute( AppDef_MultiLine  Line, int degreemin, int degreemax) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_6(AppDef_MultiLine.getCPtr(Line), Line, degreemin, degreemax), true);
  }

  public AppDef_BSplineCompute( AppDef_MultiLine  Line, int degreemin) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_7(AppDef_MultiLine.getCPtr(Line), Line, degreemin), true);
  }

  public AppDef_BSplineCompute( AppDef_MultiLine  Line) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_8(AppDef_MultiLine.getCPtr(Line), Line), true);
  }

  public AppDef_BSplineCompute( AppDef_MultiLine  Line,  math_Vector  Parameters, int degreemin, int degreemax, double Tolerance3d, double Tolerance2d, int NbIterations, long cutting, long Squares) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_9(AppDef_MultiLine.getCPtr(Line), Line, math_Vector.getCPtr(Parameters), Parameters, degreemin, degreemax, Tolerance3d, Tolerance2d, NbIterations, cutting, Squares), true);
  }

  public AppDef_BSplineCompute( AppDef_MultiLine  Line,  math_Vector  Parameters, int degreemin, int degreemax, double Tolerance3d, double Tolerance2d, int NbIterations, long cutting) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_10(AppDef_MultiLine.getCPtr(Line), Line, math_Vector.getCPtr(Parameters), Parameters, degreemin, degreemax, Tolerance3d, Tolerance2d, NbIterations, cutting), true);
  }

  public AppDef_BSplineCompute( AppDef_MultiLine  Line,  math_Vector  Parameters, int degreemin, int degreemax, double Tolerance3d, double Tolerance2d, int NbIterations) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_11(AppDef_MultiLine.getCPtr(Line), Line, math_Vector.getCPtr(Parameters), Parameters, degreemin, degreemax, Tolerance3d, Tolerance2d, NbIterations), true);
  }

  public AppDef_BSplineCompute( AppDef_MultiLine  Line,  math_Vector  Parameters, int degreemin, int degreemax, double Tolerance3d, double Tolerance2d) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_12(AppDef_MultiLine.getCPtr(Line), Line, math_Vector.getCPtr(Parameters), Parameters, degreemin, degreemax, Tolerance3d, Tolerance2d), true);
  }

  public AppDef_BSplineCompute( AppDef_MultiLine  Line,  math_Vector  Parameters, int degreemin, int degreemax, double Tolerance3d) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_13(AppDef_MultiLine.getCPtr(Line), Line, math_Vector.getCPtr(Parameters), Parameters, degreemin, degreemax, Tolerance3d), true);
  }

  public AppDef_BSplineCompute( AppDef_MultiLine  Line,  math_Vector  Parameters, int degreemin, int degreemax) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_14(AppDef_MultiLine.getCPtr(Line), Line, math_Vector.getCPtr(Parameters), Parameters, degreemin, degreemax), true);
  }

  public AppDef_BSplineCompute( AppDef_MultiLine  Line,  math_Vector  Parameters, int degreemin) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_15(AppDef_MultiLine.getCPtr(Line), Line, math_Vector.getCPtr(Parameters), Parameters, degreemin), true);
  }

  public AppDef_BSplineCompute( AppDef_MultiLine  Line,  math_Vector  Parameters) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_16(AppDef_MultiLine.getCPtr(Line), Line, math_Vector.getCPtr(Parameters), Parameters), true);
  }

  public AppDef_BSplineCompute( math_Vector  Parameters, int degreemin, int degreemax, double Tolerance3d, double Tolerance2d, int NbIterations, long cutting, long Squares) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_17(math_Vector.getCPtr(Parameters), Parameters, degreemin, degreemax, Tolerance3d, Tolerance2d, NbIterations, cutting, Squares), true);
  }

  public AppDef_BSplineCompute( math_Vector  Parameters, int degreemin, int degreemax, double Tolerance3d, double Tolerance2d, int NbIterations, long cutting) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_18(math_Vector.getCPtr(Parameters), Parameters, degreemin, degreemax, Tolerance3d, Tolerance2d, NbIterations, cutting), true);
  }

  public AppDef_BSplineCompute( math_Vector  Parameters, int degreemin, int degreemax, double Tolerance3d, double Tolerance2d, int NbIterations) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_19(math_Vector.getCPtr(Parameters), Parameters, degreemin, degreemax, Tolerance3d, Tolerance2d, NbIterations), true);
  }

  public AppDef_BSplineCompute( math_Vector  Parameters, int degreemin, int degreemax, double Tolerance3d, double Tolerance2d) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_20(math_Vector.getCPtr(Parameters), Parameters, degreemin, degreemax, Tolerance3d, Tolerance2d), true);
  }

  public AppDef_BSplineCompute( math_Vector  Parameters, int degreemin, int degreemax, double Tolerance3d) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_21(math_Vector.getCPtr(Parameters), Parameters, degreemin, degreemax, Tolerance3d), true);
  }

  public AppDef_BSplineCompute( math_Vector  Parameters, int degreemin, int degreemax) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_22(math_Vector.getCPtr(Parameters), Parameters, degreemin, degreemax), true);
  }

  public AppDef_BSplineCompute( math_Vector  Parameters, int degreemin) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_23(math_Vector.getCPtr(Parameters), Parameters, degreemin), true);
  }

  public AppDef_BSplineCompute( math_Vector  Parameters) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_24(math_Vector.getCPtr(Parameters), Parameters), true);
  }

  public AppDef_BSplineCompute(int degreemin, int degreemax, double Tolerance3d, double Tolerance2d, int NbIterations, long cutting, Approx_ParametrizationType parametrization, long Squares) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_25(degreemin, degreemax, Tolerance3d, Tolerance2d, NbIterations, cutting, parametrization.swigValue(), Squares), true);
  }

  public AppDef_BSplineCompute(int degreemin, int degreemax, double Tolerance3d, double Tolerance2d, int NbIterations, long cutting, Approx_ParametrizationType parametrization) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_26(degreemin, degreemax, Tolerance3d, Tolerance2d, NbIterations, cutting, parametrization.swigValue()), true);
  }

  public AppDef_BSplineCompute(int degreemin, int degreemax, double Tolerance3d, double Tolerance2d, int NbIterations, long cutting) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_27(degreemin, degreemax, Tolerance3d, Tolerance2d, NbIterations, cutting), true);
  }

  public AppDef_BSplineCompute(int degreemin, int degreemax, double Tolerance3d, double Tolerance2d, int NbIterations) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_28(degreemin, degreemax, Tolerance3d, Tolerance2d, NbIterations), true);
  }

  public AppDef_BSplineCompute(int degreemin, int degreemax, double Tolerance3d, double Tolerance2d) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_29(degreemin, degreemax, Tolerance3d, Tolerance2d), true);
  }

  public AppDef_BSplineCompute(int degreemin, int degreemax, double Tolerance3d) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_30(degreemin, degreemax, Tolerance3d), true);
  }

  public AppDef_BSplineCompute(int degreemin, int degreemax) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_31(degreemin, degreemax), true);
  }

  public AppDef_BSplineCompute(int degreemin) {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_32(degreemin), true);
  }

  public AppDef_BSplineCompute() {
    this(OCCwrapJavaJNI.new_AppDef_BSplineCompute__SWIG_33(), true);
  }

  /**
   *  Constructs an interpolation of the MultiLine <Line>
   *  The result will be a C2 curve of degree 3.
   */
  public void Interpol( AppDef_MultiLine  Line) {
    OCCwrapJavaJNI.AppDef_BSplineCompute_Interpol(swigCPtr, this, AppDef_MultiLine.getCPtr(Line), Line);
  }

  /**
   *  Initializes the fields of the algorithm.
   */
  public void Init(int degreemin, int degreemax, double Tolerance3d, double Tolerance2d, int NbIterations, long cutting, Approx_ParametrizationType parametrization, long Squares) {
    OCCwrapJavaJNI.AppDef_BSplineCompute_Init__SWIG_0(swigCPtr, this, degreemin, degreemax, Tolerance3d, Tolerance2d, NbIterations, cutting, parametrization.swigValue(), Squares);
  }

  public void Init(int degreemin, int degreemax, double Tolerance3d, double Tolerance2d, int NbIterations, long cutting, Approx_ParametrizationType parametrization) {
    OCCwrapJavaJNI.AppDef_BSplineCompute_Init__SWIG_1(swigCPtr, this, degreemin, degreemax, Tolerance3d, Tolerance2d, NbIterations, cutting, parametrization.swigValue());
  }

  public void Init(int degreemin, int degreemax, double Tolerance3d, double Tolerance2d, int NbIterations, long cutting) {
    OCCwrapJavaJNI.AppDef_BSplineCompute_Init__SWIG_2(swigCPtr, this, degreemin, degreemax, Tolerance3d, Tolerance2d, NbIterations, cutting);
  }

  public void Init(int degreemin, int degreemax, double Tolerance3d, double Tolerance2d, int NbIterations) {
    OCCwrapJavaJNI.AppDef_BSplineCompute_Init__SWIG_3(swigCPtr, this, degreemin, degreemax, Tolerance3d, Tolerance2d, NbIterations);
  }

  public void Init(int degreemin, int degreemax, double Tolerance3d, double Tolerance2d) {
    OCCwrapJavaJNI.AppDef_BSplineCompute_Init__SWIG_4(swigCPtr, this, degreemin, degreemax, Tolerance3d, Tolerance2d);
  }

  public void Init(int degreemin, int degreemax, double Tolerance3d) {
    OCCwrapJavaJNI.AppDef_BSplineCompute_Init__SWIG_5(swigCPtr, this, degreemin, degreemax, Tolerance3d);
  }

  public void Init(int degreemin, int degreemax) {
    OCCwrapJavaJNI.AppDef_BSplineCompute_Init__SWIG_6(swigCPtr, this, degreemin, degreemax);
  }

  public void Init(int degreemin) {
    OCCwrapJavaJNI.AppDef_BSplineCompute_Init__SWIG_7(swigCPtr, this, degreemin);
  }

  public void Init() {
    OCCwrapJavaJNI.AppDef_BSplineCompute_Init__SWIG_8(swigCPtr, this);
  }

  /**
   *  runs the algorithm after having initialized the fields.
   */
  public void Perform( AppDef_MultiLine  Line) {
    OCCwrapJavaJNI.AppDef_BSplineCompute_Perform(swigCPtr, this, AppDef_MultiLine.getCPtr(Line), Line);
  }

  /**
   *  The approximation will begin with the
   *  set of  parameters <ThePar>.
   */
  public void SetParameters( math_Vector  ThePar) {
    OCCwrapJavaJNI.AppDef_BSplineCompute_SetParameters(swigCPtr, this, math_Vector.getCPtr(ThePar), ThePar);
  }

  /**
   *  The approximation will be done with the
   *  set of knots <Knots>. The multiplicities will be set
   *  with the degree and the desired continuity.
   */
  public void SetKnots( TColStd_Array1OfReal  Knots) {
    OCCwrapJavaJNI.AppDef_BSplineCompute_SetKnots(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Knots), Knots);
  }

  /**
   *  The approximation will be done with the
   *  set of knots <Knots> and the multiplicities <Mults>.
   */
  public void SetKnotsAndMultiplicities( TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults) {
    OCCwrapJavaJNI.AppDef_BSplineCompute_SetKnotsAndMultiplicities(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults);
  }

  /**
   *  changes the degrees of the approximation.
   */
  public void SetDegrees(int degreemin, int degreemax) {
    OCCwrapJavaJNI.AppDef_BSplineCompute_SetDegrees(swigCPtr, this, degreemin, degreemax);
  }

  /**
   *  Changes the tolerances of the approximation.
   */
  public void SetTolerances(double Tolerance3d, double Tolerance2d) {
    OCCwrapJavaJNI.AppDef_BSplineCompute_SetTolerances(swigCPtr, this, Tolerance3d, Tolerance2d);
  }

  /**
   *  sets the continuity of the spline.
   *  if C = 2, the spline will be C2.
   */
  public void SetContinuity(int C) {
    OCCwrapJavaJNI.AppDef_BSplineCompute_SetContinuity(swigCPtr, this, C);
  }

  /**
   *  changes the first and the last constraint points.
   */
  public void SetConstraints(AppParCurves_Constraint firstC, AppParCurves_Constraint lastC) {
    OCCwrapJavaJNI.AppDef_BSplineCompute_SetConstraints(swigCPtr, this, firstC.swigValue(), lastC.swigValue());
  }

  /**
   *  returns False if at a moment of the approximation,
   *  the status NoApproximation has been sent by the user
   *  when more points were needed.
   */
  public long IsAllApproximated() {
    return OCCwrapJavaJNI.AppDef_BSplineCompute_IsAllApproximated(swigCPtr, this);
  }

  /**
   *  returns False if the status NoPointsAdded has been sent.
   */
  public long IsToleranceReached() {
    return OCCwrapJavaJNI.AppDef_BSplineCompute_IsToleranceReached(swigCPtr, this);
  }

  /**
   *  returns the tolerances 2d and 3d of the MultiBSpCurve.
   */
  public void Error(double[] tol3d, double[] tol2d) {
    OCCwrapJavaJNI.AppDef_BSplineCompute_Error(swigCPtr, this, tol3d, tol2d);
  }

  /**
   *  returns the result of the approximation.
   */
  public  AppParCurves_MultiBSpCurve  Value() {
    AppParCurves_MultiBSpCurve ret = new AppParCurves_MultiBSpCurve(OCCwrapJavaJNI.AppDef_BSplineCompute_Value(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  returns the result of the approximation.
   */
  public  AppParCurves_MultiBSpCurve  ChangeValue() {
    AppParCurves_MultiBSpCurve ret = new AppParCurves_MultiBSpCurve(OCCwrapJavaJNI.AppDef_BSplineCompute_ChangeValue(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  returns the new parameters of the approximation
   *  corresponding to the points of the MultiBSpCurve.
   */
  public  TColStd_Array1OfReal  Parameters() {
    TColStd_Array1OfReal ret = new TColStd_Array1OfReal(OCCwrapJavaJNI.AppDef_BSplineCompute_Parameters(swigCPtr, this), false, this);
    return ret;
  }

}
