package opencascade;

/**
 *  This  class  is  used  to  approximate a  BsplineCurve
 *  passing  through an  array  of points,  with  a  given
 *  Continuity.
 *  Describes functions for building a 2D BSpline
 *  curve which approximates a set of points.
 *  A PointsToBSpline object provides a framework for:
 *  -   defining the data of the BSpline curve to be built,
 *  -   implementing the approximation algorithm, and
 *  -   consulting the results
 */
public class Geom2dAPI_PointsToBSpline {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Geom2dAPI_PointsToBSpline(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Geom2dAPI_PointsToBSpline(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Geom2dAPI_PointsToBSpline obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Geom2dAPI_PointsToBSpline(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructs an empty approximation algorithm.
   *  Use an Init function to define and build the BSpline curve.
   */
  public Geom2dAPI_PointsToBSpline() {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_0(), true);
  }

  /**
   *  Approximate  a BSpline  Curve passing  through  an
   *  array of  Point.  The resulting BSpline will  have
   *  the following properties:
   *  1- his degree will be in the range [Degmin,Degmax]
   *  2- his  continuity will be  at  least <Continuity>
   *  3- the distance from the point <Points> to the
   *  BSpline will be lower to Tol2D
   */
  public Geom2dAPI_PointsToBSpline( TColgp_Array1OfPnt2d  Points, int DegMin, int DegMax, GeomAbs_Shape Continuity, double Tol2D) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_1(TColgp_Array1OfPnt2d.getCPtr(Points), Points, DegMin, DegMax, Continuity.swigValue(), Tol2D), true);
  }

  /**
   *  Approximate  a BSpline  Curve passing  through  an
   *  array of  Point.  Of coordinates :
   * 
   *  X = X0 + DX * (i-YValues.Lower())
   *  Y = YValues(i)
   * 
   *  With i in the range YValues.Lower(), YValues.Upper()
   * 
   *  The BSpline will be parametrized  from t = X0 to
   *  X0 + DX * (YValues.Upper() - YValues.Lower())
   * 
   *  And will satisfy X(t) = t
   * 
   *  The resulting BSpline will  have
   *  the following properties:
   *  1- his degree will be in the range [Degmin,Degmax]
   *  2- his  continuity will be  at  least <Continuity>
   *  3- the distance from the point <Points> to the
   *  BSpline will be lower to Tol2D
   */
  public Geom2dAPI_PointsToBSpline( TColgp_Array1OfPnt2d  Points, int DegMin, int DegMax, GeomAbs_Shape Continuity) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_2(TColgp_Array1OfPnt2d.getCPtr(Points), Points, DegMin, DegMax, Continuity.swigValue()), true);
  }

  /**
   *  Approximate  a BSpline  Curve passing  through  an
   *  array of  Point.  The resulting BSpline will  have
   *  the following properties:
   *  1- his degree will be in the range [Degmin,Degmax]
   *  2- his  continuity will be  at  least <Continuity>
   *  3- the distance from the point <Points> to the
   *  BSpline will be lower to Tol2D
   */
  public Geom2dAPI_PointsToBSpline( TColgp_Array1OfPnt2d  Points, int DegMin, int DegMax) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_3(TColgp_Array1OfPnt2d.getCPtr(Points), Points, DegMin, DegMax), true);
  }

  /**
   *  Approximate  a  BSpline  Curve  passing through an
   *  array of Point,  which parameters are given by the
   *  array <Parameters>.
   *  The resulting  BSpline   will have the   following
   *  properties:
   *  1- his degree will be in the range [Degmin,Degmax]
   *  2- his  continuity will be  at  least <Continuity>
   *  3- the distance from the point <Points> to the
   *  BSpline will be lower to Tol2D
   */
  public Geom2dAPI_PointsToBSpline( TColgp_Array1OfPnt2d  Points, int DegMin) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_4(TColgp_Array1OfPnt2d.getCPtr(Points), Points, DegMin), true);
  }

  /**
   *  Approximate a BSpline Curve  passing through an
   *  array of Point using variational smoothing algorithm,
   *  which tries to minimize additional criterium:
   *  Weight1*CurveLength + Weight2*Curvature + Weight3*Torsion
   */
  public Geom2dAPI_PointsToBSpline( TColgp_Array1OfPnt2d  Points) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_5(TColgp_Array1OfPnt2d.getCPtr(Points), Points), true);
  }

  public Geom2dAPI_PointsToBSpline( TColStd_Array1OfReal  YValues, double X0, double DX, int DegMin, int DegMax, GeomAbs_Shape Continuity, double Tol2D) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_6(TColStd_Array1OfReal.getCPtr(YValues), YValues, X0, DX, DegMin, DegMax, Continuity.swigValue(), Tol2D), true);
  }

  public Geom2dAPI_PointsToBSpline( TColStd_Array1OfReal  YValues, double X0, double DX, int DegMin, int DegMax, GeomAbs_Shape Continuity) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_7(TColStd_Array1OfReal.getCPtr(YValues), YValues, X0, DX, DegMin, DegMax, Continuity.swigValue()), true);
  }

  public Geom2dAPI_PointsToBSpline( TColStd_Array1OfReal  YValues, double X0, double DX, int DegMin, int DegMax) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_8(TColStd_Array1OfReal.getCPtr(YValues), YValues, X0, DX, DegMin, DegMax), true);
  }

  public Geom2dAPI_PointsToBSpline( TColStd_Array1OfReal  YValues, double X0, double DX, int DegMin) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_9(TColStd_Array1OfReal.getCPtr(YValues), YValues, X0, DX, DegMin), true);
  }

  public Geom2dAPI_PointsToBSpline( TColStd_Array1OfReal  YValues, double X0, double DX) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_10(TColStd_Array1OfReal.getCPtr(YValues), YValues, X0, DX), true);
  }

  public Geom2dAPI_PointsToBSpline( TColgp_Array1OfPnt2d  Points, Approx_ParametrizationType ParType, int DegMin, int DegMax, GeomAbs_Shape Continuity, double Tol2D) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_11(TColgp_Array1OfPnt2d.getCPtr(Points), Points, ParType.swigValue(), DegMin, DegMax, Continuity.swigValue(), Tol2D), true);
  }

  public Geom2dAPI_PointsToBSpline( TColgp_Array1OfPnt2d  Points, Approx_ParametrizationType ParType, int DegMin, int DegMax, GeomAbs_Shape Continuity) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_12(TColgp_Array1OfPnt2d.getCPtr(Points), Points, ParType.swigValue(), DegMin, DegMax, Continuity.swigValue()), true);
  }

  public Geom2dAPI_PointsToBSpline( TColgp_Array1OfPnt2d  Points, Approx_ParametrizationType ParType, int DegMin, int DegMax) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_13(TColgp_Array1OfPnt2d.getCPtr(Points), Points, ParType.swigValue(), DegMin, DegMax), true);
  }

  public Geom2dAPI_PointsToBSpline( TColgp_Array1OfPnt2d  Points, Approx_ParametrizationType ParType, int DegMin) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_14(TColgp_Array1OfPnt2d.getCPtr(Points), Points, ParType.swigValue(), DegMin), true);
  }

  public Geom2dAPI_PointsToBSpline( TColgp_Array1OfPnt2d  Points, Approx_ParametrizationType ParType) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_15(TColgp_Array1OfPnt2d.getCPtr(Points), Points, ParType.swigValue()), true);
  }

  public Geom2dAPI_PointsToBSpline( TColgp_Array1OfPnt2d  Points,  TColStd_Array1OfReal  Parameters, int DegMin, int DegMax, GeomAbs_Shape Continuity, double Tol2D) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_16(TColgp_Array1OfPnt2d.getCPtr(Points), Points, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, DegMin, DegMax, Continuity.swigValue(), Tol2D), true);
  }

  public Geom2dAPI_PointsToBSpline( TColgp_Array1OfPnt2d  Points,  TColStd_Array1OfReal  Parameters, int DegMin, int DegMax, GeomAbs_Shape Continuity) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_17(TColgp_Array1OfPnt2d.getCPtr(Points), Points, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, DegMin, DegMax, Continuity.swigValue()), true);
  }

  public Geom2dAPI_PointsToBSpline( TColgp_Array1OfPnt2d  Points,  TColStd_Array1OfReal  Parameters, int DegMin, int DegMax) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_18(TColgp_Array1OfPnt2d.getCPtr(Points), Points, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, DegMin, DegMax), true);
  }

  public Geom2dAPI_PointsToBSpline( TColgp_Array1OfPnt2d  Points,  TColStd_Array1OfReal  Parameters, int DegMin) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_19(TColgp_Array1OfPnt2d.getCPtr(Points), Points, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, DegMin), true);
  }

  public Geom2dAPI_PointsToBSpline( TColgp_Array1OfPnt2d  Points,  TColStd_Array1OfReal  Parameters) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_20(TColgp_Array1OfPnt2d.getCPtr(Points), Points, TColStd_Array1OfReal.getCPtr(Parameters), Parameters), true);
  }

  public Geom2dAPI_PointsToBSpline( TColgp_Array1OfPnt2d  Points, double Weight1, double Weight2, double Weight3, int DegMax, GeomAbs_Shape Continuity, double Tol3D) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_21(TColgp_Array1OfPnt2d.getCPtr(Points), Points, Weight1, Weight2, Weight3, DegMax, Continuity.swigValue(), Tol3D), true);
  }

  public Geom2dAPI_PointsToBSpline( TColgp_Array1OfPnt2d  Points, double Weight1, double Weight2, double Weight3, int DegMax, GeomAbs_Shape Continuity) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_22(TColgp_Array1OfPnt2d.getCPtr(Points), Points, Weight1, Weight2, Weight3, DegMax, Continuity.swigValue()), true);
  }

  public Geom2dAPI_PointsToBSpline( TColgp_Array1OfPnt2d  Points, double Weight1, double Weight2, double Weight3, int DegMax) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_23(TColgp_Array1OfPnt2d.getCPtr(Points), Points, Weight1, Weight2, Weight3, DegMax), true);
  }

  public Geom2dAPI_PointsToBSpline( TColgp_Array1OfPnt2d  Points, double Weight1, double Weight2, double Weight3) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_PointsToBSpline__SWIG_24(TColgp_Array1OfPnt2d.getCPtr(Points), Points, Weight1, Weight2, Weight3), true);
  }

  /**
   *  Approximate  a BSpline  Curve passing  through  an
   *  array of  Point.  The resulting BSpline will  have
   *  the following properties:
   *  1- his degree will be in the range [Degmin,Degmax]
   *  2- his  continuity will be  at  least <Continuity>
   *  3- the distance from the point <Points> to the
   *  BSpline will be lower to Tol2D
   */
  public void Init( TColgp_Array1OfPnt2d  Points, int DegMin, int DegMax, GeomAbs_Shape Continuity, double Tol2D) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_0(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(Points), Points, DegMin, DegMax, Continuity.swigValue(), Tol2D);
  }

  /**
   *  Approximate  a BSpline  Curve passing  through  an
   *  array of  Point.  Of coordinates :
   * 
   *  X = X0 + DX * (i-YValues.Lower())
   *  Y = YValues(i)
   * 
   *  With i in the range YValues.Lower(), YValues.Upper()
   * 
   *  The BSpline will be parametrized  from t = X0 to
   *  X0 + DX * (YValues.Upper() - YValues.Lower())
   * 
   *  And will satisfy X(t) = t
   * 
   *  The resulting BSpline will  have
   *  the following properties:
   *  1- his degree will be in the range [Degmin,Degmax]
   *  2- his  continuity will be  at  least <Continuity>
   *  3- the distance from the point <Points> to the
   *  BSpline will be lower to Tol2D
   */
  public void Init( TColgp_Array1OfPnt2d  Points, int DegMin, int DegMax, GeomAbs_Shape Continuity) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_1(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(Points), Points, DegMin, DegMax, Continuity.swigValue());
  }

  /**
   *  Approximate  a BSpline  Curve passing  through  an
   *  array of  Point.  The resulting BSpline will  have
   *  the following properties:
   *  1- his degree will be in the range [Degmin,Degmax]
   *  2- his  continuity will be  at  least <Continuity>
   *  3- the distance from the point <Points> to the
   *  BSpline will be lower to Tol2D
   */
  public void Init( TColgp_Array1OfPnt2d  Points, int DegMin, int DegMax) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_2(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(Points), Points, DegMin, DegMax);
  }

  /**
   *  Approximate  a  BSpline  Curve  passing through an
   *  array of Point,  which parameters are given by the
   *  array <Parameters>.
   *  The resulting  BSpline   will have the   following
   *  properties:
   *  1- his degree will be in the range [Degmin,Degmax]
   *  2- his  continuity will be  at  least <Continuity>
   *  3- the distance from the point <Points> to the
   *  BSpline will be lower to Tol2D
   */
  public void Init( TColgp_Array1OfPnt2d  Points, int DegMin) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_3(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(Points), Points, DegMin);
  }

  /**
   *  Approximate a BSpline Curve  passing through an
   *  array of Point using variational smoothing algorithm,
   *  which tries to minimize additional criterium:
   *  Weight1*CurveLength + Weight2*Curvature + Weight3*Torsion
   */
  public void Init( TColgp_Array1OfPnt2d  Points) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_4(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(Points), Points);
  }

  public void Init( TColStd_Array1OfReal  YValues, double X0, double DX, int DegMin, int DegMax, GeomAbs_Shape Continuity, double Tol2D) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_5(swigCPtr, this, TColStd_Array1OfReal.getCPtr(YValues), YValues, X0, DX, DegMin, DegMax, Continuity.swigValue(), Tol2D);
  }

  public void Init( TColStd_Array1OfReal  YValues, double X0, double DX, int DegMin, int DegMax, GeomAbs_Shape Continuity) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_6(swigCPtr, this, TColStd_Array1OfReal.getCPtr(YValues), YValues, X0, DX, DegMin, DegMax, Continuity.swigValue());
  }

  public void Init( TColStd_Array1OfReal  YValues, double X0, double DX, int DegMin, int DegMax) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_7(swigCPtr, this, TColStd_Array1OfReal.getCPtr(YValues), YValues, X0, DX, DegMin, DegMax);
  }

  public void Init( TColStd_Array1OfReal  YValues, double X0, double DX, int DegMin) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_8(swigCPtr, this, TColStd_Array1OfReal.getCPtr(YValues), YValues, X0, DX, DegMin);
  }

  public void Init( TColStd_Array1OfReal  YValues, double X0, double DX) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_9(swigCPtr, this, TColStd_Array1OfReal.getCPtr(YValues), YValues, X0, DX);
  }

  public void Init( TColgp_Array1OfPnt2d  Points, Approx_ParametrizationType ParType, int DegMin, int DegMax, GeomAbs_Shape Continuity, double Tol2D) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_10(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(Points), Points, ParType.swigValue(), DegMin, DegMax, Continuity.swigValue(), Tol2D);
  }

  public void Init( TColgp_Array1OfPnt2d  Points, Approx_ParametrizationType ParType, int DegMin, int DegMax, GeomAbs_Shape Continuity) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_11(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(Points), Points, ParType.swigValue(), DegMin, DegMax, Continuity.swigValue());
  }

  public void Init( TColgp_Array1OfPnt2d  Points, Approx_ParametrizationType ParType, int DegMin, int DegMax) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_12(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(Points), Points, ParType.swigValue(), DegMin, DegMax);
  }

  public void Init( TColgp_Array1OfPnt2d  Points, Approx_ParametrizationType ParType, int DegMin) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_13(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(Points), Points, ParType.swigValue(), DegMin);
  }

  public void Init( TColgp_Array1OfPnt2d  Points, Approx_ParametrizationType ParType) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_14(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(Points), Points, ParType.swigValue());
  }

  public void Init( TColgp_Array1OfPnt2d  Points,  TColStd_Array1OfReal  Parameters, int DegMin, int DegMax, GeomAbs_Shape Continuity, double Tol2D) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_15(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(Points), Points, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, DegMin, DegMax, Continuity.swigValue(), Tol2D);
  }

  public void Init( TColgp_Array1OfPnt2d  Points,  TColStd_Array1OfReal  Parameters, int DegMin, int DegMax, GeomAbs_Shape Continuity) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_16(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(Points), Points, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, DegMin, DegMax, Continuity.swigValue());
  }

  public void Init( TColgp_Array1OfPnt2d  Points,  TColStd_Array1OfReal  Parameters, int DegMin, int DegMax) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_17(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(Points), Points, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, DegMin, DegMax);
  }

  public void Init( TColgp_Array1OfPnt2d  Points,  TColStd_Array1OfReal  Parameters, int DegMin) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_18(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(Points), Points, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, DegMin);
  }

  public void Init( TColgp_Array1OfPnt2d  Points,  TColStd_Array1OfReal  Parameters) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_19(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(Points), Points, TColStd_Array1OfReal.getCPtr(Parameters), Parameters);
  }

  public void Init( TColgp_Array1OfPnt2d  Points, double Weight1, double Weight2, double Weight3, int DegMax, GeomAbs_Shape Continuity, double Tol2D) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_20(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(Points), Points, Weight1, Weight2, Weight3, DegMax, Continuity.swigValue(), Tol2D);
  }

  public void Init( TColgp_Array1OfPnt2d  Points, double Weight1, double Weight2, double Weight3, int DegMax, GeomAbs_Shape Continuity) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_21(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(Points), Points, Weight1, Weight2, Weight3, DegMax, Continuity.swigValue());
  }

  public void Init( TColgp_Array1OfPnt2d  Points, double Weight1, double Weight2, double Weight3, int DegMax) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_22(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(Points), Points, Weight1, Weight2, Weight3, DegMax);
  }

  public void Init( TColgp_Array1OfPnt2d  Points, double Weight1, double Weight2, double Weight3) {
    OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Init__SWIG_23(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(Points), Points, Weight1, Weight2, Weight3);
  }

  public  Geom2d_BSplineCurve  Curve() {
    return new Geom2d_BSplineCurve ( OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_Curve(swigCPtr, this), true );
  }

  public long IsDone() {
    return OCCwrapJavaJNI.Geom2dAPI_PointsToBSpline_IsDone(swigCPtr, this);
  }

}
