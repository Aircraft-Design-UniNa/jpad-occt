package opencascade;

/**
 *  This  class  is  used  to  approximate a  BsplineCurve
 *  passing  through an  array  of points,  with  a  given Continuity.
 *  Describes functions for building a 3D BSpline
 *  curve which approximates a set of points.
 *  A PointsToBSpline object provides a framework for:
 *  -   defining the data of the BSpline curve to be built,
 *  -   implementing the approximation algorithm, and consulting the results.
 */
public class GeomAPI_PointsToBSpline {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GeomAPI_PointsToBSpline(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GeomAPI_PointsToBSpline(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GeomAPI_PointsToBSpline obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomAPI_PointsToBSpline(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructs an empty approximation algorithm.
   *  Use an Init function to define and build the BSpline curve.
   */
  public GeomAPI_PointsToBSpline() {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSpline__SWIG_0(), true);
  }

  /**
   *  Approximate  a BSpline  Curve passing  through  an
   *  array of  Point.  The resulting BSpline will  have
   *  the following properties:
   *  1- his degree will be in the range [Degmin,Degmax]
   *  2- his  continuity will be  at  least <Continuity>
   *  3- the distance from the point <Points> to the
   *  BSpline will be lower to Tol3D
   */
  public GeomAPI_PointsToBSpline( TColgp_Array1OfPnt  Points, int DegMin, int DegMax, GeomAbs_Shape Continuity, double Tol3D) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSpline__SWIG_1(TColgp_Array1OfPnt.getCPtr(Points), Points, DegMin, DegMax, Continuity.swigValue(), Tol3D), true);
  }

  /**
   *  Approximate  a BSpline  Curve passing  through  an
   *  array of  Point.  The resulting BSpline will  have
   *  the following properties:
   *  1- his degree will be in the range [Degmin,Degmax]
   *  2- his  continuity will be  at  least <Continuity>
   *  3- the distance from the point <Points> to the
   *  BSpline will be lower to Tol3D
   */
  public GeomAPI_PointsToBSpline( TColgp_Array1OfPnt  Points, int DegMin, int DegMax, GeomAbs_Shape Continuity) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSpline__SWIG_2(TColgp_Array1OfPnt.getCPtr(Points), Points, DegMin, DegMax, Continuity.swigValue()), true);
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
   *  BSpline will be lower to Tol3D
   */
  public GeomAPI_PointsToBSpline( TColgp_Array1OfPnt  Points, int DegMin, int DegMax) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSpline__SWIG_3(TColgp_Array1OfPnt.getCPtr(Points), Points, DegMin, DegMax), true);
  }

  /**
   *  Approximate a BSpline Curve  passing through an
   *  array of Point using variational smoothing algorithm,
   *  which tries to minimize additional criterium:
   *  Weight1*CurveLength + Weight2*Curvature + Weight3*Torsion
   */
  public GeomAPI_PointsToBSpline( TColgp_Array1OfPnt  Points, int DegMin) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSpline__SWIG_4(TColgp_Array1OfPnt.getCPtr(Points), Points, DegMin), true);
  }

  public GeomAPI_PointsToBSpline( TColgp_Array1OfPnt  Points) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSpline__SWIG_5(TColgp_Array1OfPnt.getCPtr(Points), Points), true);
  }

  public GeomAPI_PointsToBSpline( TColgp_Array1OfPnt  Points, Approx_ParametrizationType ParType, int DegMin, int DegMax, GeomAbs_Shape Continuity, double Tol3D) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSpline__SWIG_6(TColgp_Array1OfPnt.getCPtr(Points), Points, ParType.swigValue(), DegMin, DegMax, Continuity.swigValue(), Tol3D), true);
  }

  public GeomAPI_PointsToBSpline( TColgp_Array1OfPnt  Points, Approx_ParametrizationType ParType, int DegMin, int DegMax, GeomAbs_Shape Continuity) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSpline__SWIG_7(TColgp_Array1OfPnt.getCPtr(Points), Points, ParType.swigValue(), DegMin, DegMax, Continuity.swigValue()), true);
  }

  public GeomAPI_PointsToBSpline( TColgp_Array1OfPnt  Points, Approx_ParametrizationType ParType, int DegMin, int DegMax) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSpline__SWIG_8(TColgp_Array1OfPnt.getCPtr(Points), Points, ParType.swigValue(), DegMin, DegMax), true);
  }

  public GeomAPI_PointsToBSpline( TColgp_Array1OfPnt  Points, Approx_ParametrizationType ParType, int DegMin) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSpline__SWIG_9(TColgp_Array1OfPnt.getCPtr(Points), Points, ParType.swigValue(), DegMin), true);
  }

  public GeomAPI_PointsToBSpline( TColgp_Array1OfPnt  Points, Approx_ParametrizationType ParType) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSpline__SWIG_10(TColgp_Array1OfPnt.getCPtr(Points), Points, ParType.swigValue()), true);
  }

  public GeomAPI_PointsToBSpline( TColgp_Array1OfPnt  Points,  TColStd_Array1OfReal  Parameters, int DegMin, int DegMax, GeomAbs_Shape Continuity, double Tol3D) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSpline__SWIG_11(TColgp_Array1OfPnt.getCPtr(Points), Points, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, DegMin, DegMax, Continuity.swigValue(), Tol3D), true);
  }

  public GeomAPI_PointsToBSpline( TColgp_Array1OfPnt  Points,  TColStd_Array1OfReal  Parameters, int DegMin, int DegMax, GeomAbs_Shape Continuity) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSpline__SWIG_12(TColgp_Array1OfPnt.getCPtr(Points), Points, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, DegMin, DegMax, Continuity.swigValue()), true);
  }

  public GeomAPI_PointsToBSpline( TColgp_Array1OfPnt  Points,  TColStd_Array1OfReal  Parameters, int DegMin, int DegMax) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSpline__SWIG_13(TColgp_Array1OfPnt.getCPtr(Points), Points, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, DegMin, DegMax), true);
  }

  public GeomAPI_PointsToBSpline( TColgp_Array1OfPnt  Points,  TColStd_Array1OfReal  Parameters, int DegMin) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSpline__SWIG_14(TColgp_Array1OfPnt.getCPtr(Points), Points, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, DegMin), true);
  }

  public GeomAPI_PointsToBSpline( TColgp_Array1OfPnt  Points,  TColStd_Array1OfReal  Parameters) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSpline__SWIG_15(TColgp_Array1OfPnt.getCPtr(Points), Points, TColStd_Array1OfReal.getCPtr(Parameters), Parameters), true);
  }

  public GeomAPI_PointsToBSpline( TColgp_Array1OfPnt  Points, double Weight1, double Weight2, double Weight3, int DegMax, GeomAbs_Shape Continuity, double Tol3D) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSpline__SWIG_16(TColgp_Array1OfPnt.getCPtr(Points), Points, Weight1, Weight2, Weight3, DegMax, Continuity.swigValue(), Tol3D), true);
  }

  public GeomAPI_PointsToBSpline( TColgp_Array1OfPnt  Points, double Weight1, double Weight2, double Weight3, int DegMax, GeomAbs_Shape Continuity) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSpline__SWIG_17(TColgp_Array1OfPnt.getCPtr(Points), Points, Weight1, Weight2, Weight3, DegMax, Continuity.swigValue()), true);
  }

  public GeomAPI_PointsToBSpline( TColgp_Array1OfPnt  Points, double Weight1, double Weight2, double Weight3, int DegMax) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSpline__SWIG_18(TColgp_Array1OfPnt.getCPtr(Points), Points, Weight1, Weight2, Weight3, DegMax), true);
  }

  public GeomAPI_PointsToBSpline( TColgp_Array1OfPnt  Points, double Weight1, double Weight2, double Weight3) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSpline__SWIG_19(TColgp_Array1OfPnt.getCPtr(Points), Points, Weight1, Weight2, Weight3), true);
  }

  /**
   *  Approximate  a BSpline  Curve passing  through  an
   *  array of  Point.  The resulting BSpline will  have
   *  the following properties:
   *  1- his degree will be in the range [Degmin,Degmax]
   *  2- his  continuity will be  at  least <Continuity>
   *  3- the distance from the point <Points> to the
   *  BSpline will be lower to Tol3D
   */
  public void Init( TColgp_Array1OfPnt  Points, int DegMin, int DegMax, GeomAbs_Shape Continuity, double Tol3D) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSpline_Init__SWIG_0(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(Points), Points, DegMin, DegMax, Continuity.swigValue(), Tol3D);
  }

  /**
   *  Approximate  a BSpline  Curve passing  through  an
   *  array of  Point.  The resulting BSpline will  have
   *  the following properties:
   *  1- his degree will be in the range [Degmin,Degmax]
   *  2- his  continuity will be  at  least <Continuity>
   *  3- the distance from the point <Points> to the
   *  BSpline will be lower to Tol3D
   */
  public void Init( TColgp_Array1OfPnt  Points, int DegMin, int DegMax, GeomAbs_Shape Continuity) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSpline_Init__SWIG_1(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(Points), Points, DegMin, DegMax, Continuity.swigValue());
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
   *  BSpline will be lower to Tol3D
   */
  public void Init( TColgp_Array1OfPnt  Points, int DegMin, int DegMax) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSpline_Init__SWIG_2(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(Points), Points, DegMin, DegMax);
  }

  /**
   *  Approximate a BSpline Curve  passing through an
   *  array of Point using variational smoothing algorithm,
   *  which tries to minimize additional criterium:
   *  Weight1*CurveLength + Weight2*Curvature + Weight3*Torsion
   */
  public void Init( TColgp_Array1OfPnt  Points, int DegMin) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSpline_Init__SWIG_3(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(Points), Points, DegMin);
  }

  public void Init( TColgp_Array1OfPnt  Points) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSpline_Init__SWIG_4(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(Points), Points);
  }

  public void Init( TColgp_Array1OfPnt  Points, Approx_ParametrizationType ParType, int DegMin, int DegMax, GeomAbs_Shape Continuity, double Tol3D) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSpline_Init__SWIG_5(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(Points), Points, ParType.swigValue(), DegMin, DegMax, Continuity.swigValue(), Tol3D);
  }

  public void Init( TColgp_Array1OfPnt  Points, Approx_ParametrizationType ParType, int DegMin, int DegMax, GeomAbs_Shape Continuity) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSpline_Init__SWIG_6(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(Points), Points, ParType.swigValue(), DegMin, DegMax, Continuity.swigValue());
  }

  public void Init( TColgp_Array1OfPnt  Points, Approx_ParametrizationType ParType, int DegMin, int DegMax) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSpline_Init__SWIG_7(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(Points), Points, ParType.swigValue(), DegMin, DegMax);
  }

  public void Init( TColgp_Array1OfPnt  Points, Approx_ParametrizationType ParType, int DegMin) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSpline_Init__SWIG_8(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(Points), Points, ParType.swigValue(), DegMin);
  }

  public void Init( TColgp_Array1OfPnt  Points, Approx_ParametrizationType ParType) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSpline_Init__SWIG_9(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(Points), Points, ParType.swigValue());
  }

  public void Init( TColgp_Array1OfPnt  Points,  TColStd_Array1OfReal  Parameters, int DegMin, int DegMax, GeomAbs_Shape Continuity, double Tol3D) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSpline_Init__SWIG_10(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(Points), Points, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, DegMin, DegMax, Continuity.swigValue(), Tol3D);
  }

  public void Init( TColgp_Array1OfPnt  Points,  TColStd_Array1OfReal  Parameters, int DegMin, int DegMax, GeomAbs_Shape Continuity) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSpline_Init__SWIG_11(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(Points), Points, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, DegMin, DegMax, Continuity.swigValue());
  }

  public void Init( TColgp_Array1OfPnt  Points,  TColStd_Array1OfReal  Parameters, int DegMin, int DegMax) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSpline_Init__SWIG_12(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(Points), Points, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, DegMin, DegMax);
  }

  public void Init( TColgp_Array1OfPnt  Points,  TColStd_Array1OfReal  Parameters, int DegMin) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSpline_Init__SWIG_13(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(Points), Points, TColStd_Array1OfReal.getCPtr(Parameters), Parameters, DegMin);
  }

  public void Init( TColgp_Array1OfPnt  Points,  TColStd_Array1OfReal  Parameters) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSpline_Init__SWIG_14(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(Points), Points, TColStd_Array1OfReal.getCPtr(Parameters), Parameters);
  }

  public void Init( TColgp_Array1OfPnt  Points, double Weight1, double Weight2, double Weight3, int DegMax, GeomAbs_Shape Continuity, double Tol3D) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSpline_Init__SWIG_15(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(Points), Points, Weight1, Weight2, Weight3, DegMax, Continuity.swigValue(), Tol3D);
  }

  public void Init( TColgp_Array1OfPnt  Points, double Weight1, double Weight2, double Weight3, int DegMax, GeomAbs_Shape Continuity) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSpline_Init__SWIG_16(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(Points), Points, Weight1, Weight2, Weight3, DegMax, Continuity.swigValue());
  }

  public void Init( TColgp_Array1OfPnt  Points, double Weight1, double Weight2, double Weight3, int DegMax) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSpline_Init__SWIG_17(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(Points), Points, Weight1, Weight2, Weight3, DegMax);
  }

  public void Init( TColgp_Array1OfPnt  Points, double Weight1, double Weight2, double Weight3) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSpline_Init__SWIG_18(swigCPtr, this, TColgp_Array1OfPnt.getCPtr(Points), Points, Weight1, Weight2, Weight3);
  }

  public  Geom_BSplineCurve  Curve() {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.GeomAPI_PointsToBSpline_Curve(swigCPtr, this), true );
  }

  public long IsDone() {
    return OCCwrapJavaJNI.GeomAPI_PointsToBSpline_IsDone(swigCPtr, this);
  }

}
