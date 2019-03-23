package opencascade;

/**
 *  Root class for evolution laws.
 */
public class Law_Function extends Standard_Transient {
  Law_Function(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public GeomAbs_Shape Continuity() {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.Law_Function_Continuity(swigCPtr, this));
  }

  /**
   *  Returns  the number  of  intervals for  continuity
   *  <S>. May be one if Continuity(me) >= <S>
   */
  public int NbIntervals(GeomAbs_Shape S) {
    return OCCwrapJavaJNI.Law_Function_NbIntervals(swigCPtr, this, S.swigValue());
  }

  /**
   *  Stores in <T> the  parameters bounding the intervals
   *  of continuity <S>.
   * 
   *  The array must provide  enough room to  accomodate
   *  for the parameters. i.e. T.Length() > NbIntervals()
   */
  public void Intervals( TColStd_Array1OfReal  T, GeomAbs_Shape S) {
    OCCwrapJavaJNI.Law_Function_Intervals(swigCPtr, this, TColStd_Array1OfReal.getCPtr(T), T, S.swigValue());
  }

  /**
   *  Returns the value of the function at the point of parameter X.
   */
  public double Value(double X) {
    return OCCwrapJavaJNI.Law_Function_Value(swigCPtr, this, X);
  }

  /**
   *  Returns the value F and the first derivative D of the
   *  function at the point of parameter X.
   */
  public void D1(double X, double[] F, double[] D) {
    OCCwrapJavaJNI.Law_Function_D1(swigCPtr, this, X, F, D);
  }

  /**
   *  Returns the value, first and seconde derivatives
   *  at parameter X.
   */
  public void D2(double X, double[] F, double[] D, double[] D2) {
    OCCwrapJavaJNI.Law_Function_D2(swigCPtr, this, X, F, D, D2);
  }

  public  Law_Function  Trim(double PFirst, double PLast, double Tol) {
    return new Law_Function ( OCCwrapJavaJNI.Law_Function_Trim(swigCPtr, this, PFirst, PLast, Tol), true );
  }

  /**
   *  Returns the parametric bounds of the function.
   */
  public void Bounds(double[] PFirst, double[] PLast) {
    OCCwrapJavaJNI.Law_Function_Bounds(swigCPtr, this, PFirst, PLast);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Law_Function_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Law_Function_get_type_descriptor(), true );
  }

  public static  Law_Function  DownCast( Standard_Transient  T) {
    return new Law_Function ( OCCwrapJavaJNI.Law_Function_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Law_Function_TypeOf(), true );
  }

}
