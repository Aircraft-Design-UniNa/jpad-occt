package opencascade;

/**
 *  This class is used to approximate or interpolate
 *  a BSplineSurface passing through an  Array2 of
 *  points, with a given continuity.
 *  Describes functions for building a BSpline
 *  surface which approximates or interpolates a set of points.
 *  A PointsToBSplineSurface object provides a framework for:
 *  -   defining the data of the BSpline surface to be built,
 *  -   implementing the approximation algorithm
 *  or the interpolation algorithm, and consulting the results.
 */
public class GeomAPI_PointsToBSplineSurface {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GeomAPI_PointsToBSplineSurface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GeomAPI_PointsToBSplineSurface(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GeomAPI_PointsToBSplineSurface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomAPI_PointsToBSplineSurface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructs an empty algorithm for
   *  approximation or interpolation of a surface.
   *  Use:
   *  -   an Init function to define and build the
   *  BSpline surface by approximation, or
   *  -   an Interpolate function to define and build
   *  the BSpline surface by interpolation.
   */
  public GeomAPI_PointsToBSplineSurface() {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSplineSurface__SWIG_0(), true);
  }

  /**
   *  Approximates  a BSpline  Surface passing  through  an
   *  array of  Points.  The resulting BSpline will  have
   *  the following properties:
   *  1- his degree will be in the range [Degmin,Degmax]
   *  2- his  continuity will be  at  least <Continuity>
   *  3- the distance from the point <Points> to the
   *  BSpline will be lower to Tol3D
   */
  public GeomAPI_PointsToBSplineSurface( TColgp_Array2OfPnt  Points, int DegMin, int DegMax, GeomAbs_Shape Continuity, double Tol3D) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSplineSurface__SWIG_1(TColgp_Array2OfPnt.getCPtr(Points), Points, DegMin, DegMax, Continuity.swigValue(), Tol3D), true);
  }

  /**
   *  Approximates  a BSpline  Surface passing  through  an
   *  array of  Points.  The resulting BSpline will  have
   *  the following properties:
   *  1- his degree will be in the range [Degmin,Degmax]
   *  2- his  continuity will be  at  least <Continuity>
   *  3- the distance from the point <Points> to the
   *  BSpline will be lower to Tol3D
   */
  public GeomAPI_PointsToBSplineSurface( TColgp_Array2OfPnt  Points, int DegMin, int DegMax, GeomAbs_Shape Continuity) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSplineSurface__SWIG_2(TColgp_Array2OfPnt.getCPtr(Points), Points, DegMin, DegMax, Continuity.swigValue()), true);
  }

  /**
   *  Approximates  a BSpline  Surface passing  through  an
   *  array of  points using variational smoothing algorithm,
   *  which tries to minimize additional criterium:
   *  Weight1*CurveLength + Weight2*Curvature + Weight3*Torsion
   */
  public GeomAPI_PointsToBSplineSurface( TColgp_Array2OfPnt  Points, int DegMin, int DegMax) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSplineSurface__SWIG_3(TColgp_Array2OfPnt.getCPtr(Points), Points, DegMin, DegMax), true);
  }

  /**
   *  Approximates  a BSpline  Surface passing  through  an
   *  array of  Points.
   * 
   *  The points will be constructed as follow:
   *  P(i,j) = gp_Pnt( X0 + (i-1)*dX ,
   *  Y0 + (j-1)*dY ,
   *  ZPoints(i,j)   )
   * 
   *  The resulting BSpline will  have the following
   *  properties:
   *  1- his degree will be in the range [Degmin,Degmax]
   *  2- his  continuity will be  at  least <Continuity>
   *  3- the distance from the point <Points> to the
   *  BSpline will be lower to Tol3D
   *  4- the parametrization of the surface will verify:
   *  S->Value( U, V) = gp_Pnt( U, V, Z(U,V) );
   */
  public GeomAPI_PointsToBSplineSurface( TColgp_Array2OfPnt  Points, int DegMin) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSplineSurface__SWIG_4(TColgp_Array2OfPnt.getCPtr(Points), Points, DegMin), true);
  }

  public GeomAPI_PointsToBSplineSurface( TColgp_Array2OfPnt  Points) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSplineSurface__SWIG_5(TColgp_Array2OfPnt.getCPtr(Points), Points), true);
  }

  public GeomAPI_PointsToBSplineSurface( TColgp_Array2OfPnt  Points, Approx_ParametrizationType ParType, int DegMin, int DegMax, GeomAbs_Shape Continuity, double Tol3D) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSplineSurface__SWIG_6(TColgp_Array2OfPnt.getCPtr(Points), Points, ParType.swigValue(), DegMin, DegMax, Continuity.swigValue(), Tol3D), true);
  }

  public GeomAPI_PointsToBSplineSurface( TColgp_Array2OfPnt  Points, Approx_ParametrizationType ParType, int DegMin, int DegMax, GeomAbs_Shape Continuity) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSplineSurface__SWIG_7(TColgp_Array2OfPnt.getCPtr(Points), Points, ParType.swigValue(), DegMin, DegMax, Continuity.swigValue()), true);
  }

  public GeomAPI_PointsToBSplineSurface( TColgp_Array2OfPnt  Points, Approx_ParametrizationType ParType, int DegMin, int DegMax) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSplineSurface__SWIG_8(TColgp_Array2OfPnt.getCPtr(Points), Points, ParType.swigValue(), DegMin, DegMax), true);
  }

  public GeomAPI_PointsToBSplineSurface( TColgp_Array2OfPnt  Points, Approx_ParametrizationType ParType, int DegMin) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSplineSurface__SWIG_9(TColgp_Array2OfPnt.getCPtr(Points), Points, ParType.swigValue(), DegMin), true);
  }

  public GeomAPI_PointsToBSplineSurface( TColgp_Array2OfPnt  Points, Approx_ParametrizationType ParType) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSplineSurface__SWIG_10(TColgp_Array2OfPnt.getCPtr(Points), Points, ParType.swigValue()), true);
  }

  public GeomAPI_PointsToBSplineSurface( TColgp_Array2OfPnt  Points, double Weight1, double Weight2, double Weight3, int DegMax, GeomAbs_Shape Continuity, double Tol3D) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSplineSurface__SWIG_11(TColgp_Array2OfPnt.getCPtr(Points), Points, Weight1, Weight2, Weight3, DegMax, Continuity.swigValue(), Tol3D), true);
  }

  public GeomAPI_PointsToBSplineSurface( TColgp_Array2OfPnt  Points, double Weight1, double Weight2, double Weight3, int DegMax, GeomAbs_Shape Continuity) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSplineSurface__SWIG_12(TColgp_Array2OfPnt.getCPtr(Points), Points, Weight1, Weight2, Weight3, DegMax, Continuity.swigValue()), true);
  }

  public GeomAPI_PointsToBSplineSurface( TColgp_Array2OfPnt  Points, double Weight1, double Weight2, double Weight3, int DegMax) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSplineSurface__SWIG_13(TColgp_Array2OfPnt.getCPtr(Points), Points, Weight1, Weight2, Weight3, DegMax), true);
  }

  public GeomAPI_PointsToBSplineSurface( TColgp_Array2OfPnt  Points, double Weight1, double Weight2, double Weight3) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSplineSurface__SWIG_14(TColgp_Array2OfPnt.getCPtr(Points), Points, Weight1, Weight2, Weight3), true);
  }

  public GeomAPI_PointsToBSplineSurface( TColStd_Array2OfReal  ZPoints, double X0, double dX, double Y0, double dY, int DegMin, int DegMax, GeomAbs_Shape Continuity, double Tol3D) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSplineSurface__SWIG_15(TColStd_Array2OfReal.getCPtr(ZPoints), ZPoints, X0, dX, Y0, dY, DegMin, DegMax, Continuity.swigValue(), Tol3D), true);
  }

  public GeomAPI_PointsToBSplineSurface( TColStd_Array2OfReal  ZPoints, double X0, double dX, double Y0, double dY, int DegMin, int DegMax, GeomAbs_Shape Continuity) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSplineSurface__SWIG_16(TColStd_Array2OfReal.getCPtr(ZPoints), ZPoints, X0, dX, Y0, dY, DegMin, DegMax, Continuity.swigValue()), true);
  }

  public GeomAPI_PointsToBSplineSurface( TColStd_Array2OfReal  ZPoints, double X0, double dX, double Y0, double dY, int DegMin, int DegMax) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSplineSurface__SWIG_17(TColStd_Array2OfReal.getCPtr(ZPoints), ZPoints, X0, dX, Y0, dY, DegMin, DegMax), true);
  }

  public GeomAPI_PointsToBSplineSurface( TColStd_Array2OfReal  ZPoints, double X0, double dX, double Y0, double dY, int DegMin) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSplineSurface__SWIG_18(TColStd_Array2OfReal.getCPtr(ZPoints), ZPoints, X0, dX, Y0, dY, DegMin), true);
  }

  public GeomAPI_PointsToBSplineSurface( TColStd_Array2OfReal  ZPoints, double X0, double dX, double Y0, double dY) {
    this(OCCwrapJavaJNI.new_GeomAPI_PointsToBSplineSurface__SWIG_19(TColStd_Array2OfReal.getCPtr(ZPoints), ZPoints, X0, dX, Y0, dY), true);
  }

  /**
   *  Approximates  a BSpline Surface passing  through  an
   *  array of  Point.  The resulting BSpline will  have
   *  the following properties:
   *  1- his degree will be in the range [Degmin,Degmax]
   *  2- his  continuity will be  at  least <Continuity>
   *  3- the distance from the point <Points> to the
   *  BSpline will be lower to Tol3D
   */
  public void Init( TColgp_Array2OfPnt  Points, int DegMin, int DegMax, GeomAbs_Shape Continuity, double Tol3D) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Init__SWIG_0(swigCPtr, this, TColgp_Array2OfPnt.getCPtr(Points), Points, DegMin, DegMax, Continuity.swigValue(), Tol3D);
  }

  /**
   *  Approximates  a BSpline  Surface passing  through  an
   *  array of  Points.
   * 
   *  The points will be constructed as follow:
   *  P(i,j) = gp_Pnt( X0 + (i-1)*dX ,
   *  Y0 + (j-1)*dY ,
   *  ZPoints(i,j)   )
   * 
   *  The resulting BSpline will  have the following
   *  properties:
   *  1- his degree will be in the range [Degmin,Degmax]
   *  2- his  continuity will be  at  least <Continuity>
   *  3- the distance from the point <Points> to the
   *  BSpline will be lower to Tol3D
   *  4- the parametrization of the surface will verify:
   *  S->Value( U, V) = gp_Pnt( U, V, Z(U,V) );
   */
  public void Init( TColgp_Array2OfPnt  Points, int DegMin, int DegMax, GeomAbs_Shape Continuity) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Init__SWIG_1(swigCPtr, this, TColgp_Array2OfPnt.getCPtr(Points), Points, DegMin, DegMax, Continuity.swigValue());
  }

  /**
   *  Approximates  a BSpline Surface passing  through  an
   *  array of  Point.  The resulting BSpline will  have
   *  the following properties:
   *  1- his degree will be in the range [Degmin,Degmax]
   *  2- his  continuity will be  at  least <Continuity>
   *  3- the distance from the point <Points> to the
   *  BSpline will be lower to Tol3D
   */
  public void Init( TColgp_Array2OfPnt  Points, int DegMin, int DegMax) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Init__SWIG_2(swigCPtr, this, TColgp_Array2OfPnt.getCPtr(Points), Points, DegMin, DegMax);
  }

  /**
   *  Approximates  a BSpline Surface passing  through  an
   *  array of  point using variational smoothing algorithm,
   *  which tries to minimize additional criterium:
   *  Weight1*CurveLength + Weight2*Curvature + Weight3*Torsion
   */
  public void Init( TColgp_Array2OfPnt  Points, int DegMin) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Init__SWIG_3(swigCPtr, this, TColgp_Array2OfPnt.getCPtr(Points), Points, DegMin);
  }

  public void Init( TColgp_Array2OfPnt  Points) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Init__SWIG_4(swigCPtr, this, TColgp_Array2OfPnt.getCPtr(Points), Points);
  }

  /**
   *  Interpolates  a BSpline Surface passing  through  an
   *  array of  Point.  The resulting BSpline will  have
   *  the following properties:
   *  1- his degree will be 3.
   *  2- his  continuity will be  C2.
   */
  public void Interpolate( TColgp_Array2OfPnt  Points) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Interpolate__SWIG_0(swigCPtr, this, TColgp_Array2OfPnt.getCPtr(Points), Points);
  }

  /**
   *  Interpolates  a BSpline Surface passing  through  an
   *  array of  Point.  The resulting BSpline will  have
   *  the following properties:
   *  1- his degree will be 3.
   *  2- his  continuity will be  C2.
   */
  public void Interpolate( TColgp_Array2OfPnt  Points, Approx_ParametrizationType ParType) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Interpolate__SWIG_1(swigCPtr, this, TColgp_Array2OfPnt.getCPtr(Points), Points, ParType.swigValue());
  }

  public void Init( TColStd_Array2OfReal  ZPoints, double X0, double dX, double Y0, double dY, int DegMin, int DegMax, GeomAbs_Shape Continuity, double Tol3D) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Init__SWIG_5(swigCPtr, this, TColStd_Array2OfReal.getCPtr(ZPoints), ZPoints, X0, dX, Y0, dY, DegMin, DegMax, Continuity.swigValue(), Tol3D);
  }

  public void Init( TColStd_Array2OfReal  ZPoints, double X0, double dX, double Y0, double dY, int DegMin, int DegMax, GeomAbs_Shape Continuity) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Init__SWIG_6(swigCPtr, this, TColStd_Array2OfReal.getCPtr(ZPoints), ZPoints, X0, dX, Y0, dY, DegMin, DegMax, Continuity.swigValue());
  }

  public void Init( TColStd_Array2OfReal  ZPoints, double X0, double dX, double Y0, double dY, int DegMin, int DegMax) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Init__SWIG_7(swigCPtr, this, TColStd_Array2OfReal.getCPtr(ZPoints), ZPoints, X0, dX, Y0, dY, DegMin, DegMax);
  }

  public void Init( TColStd_Array2OfReal  ZPoints, double X0, double dX, double Y0, double dY, int DegMin) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Init__SWIG_8(swigCPtr, this, TColStd_Array2OfReal.getCPtr(ZPoints), ZPoints, X0, dX, Y0, dY, DegMin);
  }

  public void Init( TColStd_Array2OfReal  ZPoints, double X0, double dX, double Y0, double dY) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Init__SWIG_9(swigCPtr, this, TColStd_Array2OfReal.getCPtr(ZPoints), ZPoints, X0, dX, Y0, dY);
  }

  /**
   *  Interpolates  a BSpline  Surface passing  through  an
   *  array of  Points.
   * 
   *  The points will be constructed as follow:
   *  P(i,j) = gp_Pnt( X0 + (i-1)*dX ,
   *  Y0 + (j-1)*dY ,
   *  ZPoints(i,j)   )
   * 
   *  The resulting BSpline will  have the following
   *  properties:
   *  1- his degree will be 3
   *  2- his  continuity will be  C2.
   *  4- the parametrization of the surface will verify:
   *  S->Value( U, V) = gp_Pnt( U, V, Z(U,V) );
   */
  public void Interpolate( TColStd_Array2OfReal  ZPoints, double X0, double dX, double Y0, double dY) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Interpolate__SWIG_2(swigCPtr, this, TColStd_Array2OfReal.getCPtr(ZPoints), ZPoints, X0, dX, Y0, dY);
  }

  public void Init( TColgp_Array2OfPnt  Points, Approx_ParametrizationType ParType, int DegMin, int DegMax, GeomAbs_Shape Continuity, double Tol3D) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Init__SWIG_10(swigCPtr, this, TColgp_Array2OfPnt.getCPtr(Points), Points, ParType.swigValue(), DegMin, DegMax, Continuity.swigValue(), Tol3D);
  }

  public void Init( TColgp_Array2OfPnt  Points, Approx_ParametrizationType ParType, int DegMin, int DegMax, GeomAbs_Shape Continuity) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Init__SWIG_11(swigCPtr, this, TColgp_Array2OfPnt.getCPtr(Points), Points, ParType.swigValue(), DegMin, DegMax, Continuity.swigValue());
  }

  public void Init( TColgp_Array2OfPnt  Points, Approx_ParametrizationType ParType, int DegMin, int DegMax) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Init__SWIG_12(swigCPtr, this, TColgp_Array2OfPnt.getCPtr(Points), Points, ParType.swigValue(), DegMin, DegMax);
  }

  public void Init( TColgp_Array2OfPnt  Points, Approx_ParametrizationType ParType, int DegMin) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Init__SWIG_13(swigCPtr, this, TColgp_Array2OfPnt.getCPtr(Points), Points, ParType.swigValue(), DegMin);
  }

  public void Init( TColgp_Array2OfPnt  Points, Approx_ParametrizationType ParType) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Init__SWIG_14(swigCPtr, this, TColgp_Array2OfPnt.getCPtr(Points), Points, ParType.swigValue());
  }

  public void Init( TColgp_Array2OfPnt  Points, double Weight1, double Weight2, double Weight3, int DegMax, GeomAbs_Shape Continuity, double Tol3D) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Init__SWIG_15(swigCPtr, this, TColgp_Array2OfPnt.getCPtr(Points), Points, Weight1, Weight2, Weight3, DegMax, Continuity.swigValue(), Tol3D);
  }

  public void Init( TColgp_Array2OfPnt  Points, double Weight1, double Weight2, double Weight3, int DegMax, GeomAbs_Shape Continuity) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Init__SWIG_16(swigCPtr, this, TColgp_Array2OfPnt.getCPtr(Points), Points, Weight1, Weight2, Weight3, DegMax, Continuity.swigValue());
  }

  public void Init( TColgp_Array2OfPnt  Points, double Weight1, double Weight2, double Weight3, int DegMax) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Init__SWIG_17(swigCPtr, this, TColgp_Array2OfPnt.getCPtr(Points), Points, Weight1, Weight2, Weight3, DegMax);
  }

  public void Init( TColgp_Array2OfPnt  Points, double Weight1, double Weight2, double Weight3) {
    OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Init__SWIG_18(swigCPtr, this, TColgp_Array2OfPnt.getCPtr(Points), Points, Weight1, Weight2, Weight3);
  }

  public  Geom_BSplineSurface  Surface() {
    return new Geom_BSplineSurface ( OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_Surface(swigCPtr, this), true );
  }

  public long IsDone() {
    return OCCwrapJavaJNI.GeomAPI_PointsToBSplineSurface_IsDone(swigCPtr, this);
  }

}
