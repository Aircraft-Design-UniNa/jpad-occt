package opencascade;

/**
 *  The GeomConvert package provides some global functions as follows
 *  -   converting classical Geom curves into BSpline curves,
 *  -   segmenting BSpline curves, particularly at knots
 *  values: this function may be used in conjunction with the
 *  GeomConvert_BSplineCurveKnotSplitting
 *  class to segment a BSpline curve into arcs which
 *  comply with required continuity levels,
 *  -   converting classical Geom surfaces into BSpline surfaces, and
 *  -   segmenting BSpline surfaces, particularly at
 *  knots values: this function may be used in conjunction with the
 *  GeomConvert_BSplineSurfaceKnotSplitting
 *  class to segment a BSpline surface into patches
 *  which comply with required continuity levels.
 *  All geometric entities used in this package are bounded.
 * 
 *  References :
 *  . Generating the Bezier Points of B-spline curves and surfaces
 *  (Wolfgang Bohm) CAGD volume 13 number 6 november 1981
 *  . On NURBS: A Survey  (Leslie Piegl) IEEE Computer Graphics and
 *  Application January 1991
 *  . Curve and surface construction using rational B-splines
 *  (Leslie Piegl and Wayne Tiller) CAD Volume 19 number 9 november
 *  1987
 *  . A survey of curve and surface methods in CAGD (Wolfgang BOHM)
 *  CAGD 1 1984
 */
public class GeomConvert {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GeomConvert(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GeomConvert(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GeomConvert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomConvert(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static  Geom_BSplineCurve  SplitBSplineCurve( Geom_BSplineCurve  C, int FromK1, int ToK2, long SameOrientation) {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.GeomConvert_SplitBSplineCurve__SWIG_0( Geom_BSplineCurve.getCPtr(C) , C, FromK1, ToK2, SameOrientation), true );
  }

  public static  Geom_BSplineCurve  SplitBSplineCurve( Geom_BSplineCurve  C, int FromK1, int ToK2) {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.GeomConvert_SplitBSplineCurve__SWIG_1( Geom_BSplineCurve.getCPtr(C) , C, FromK1, ToK2), true );
  }

  public static  Geom_BSplineCurve  SplitBSplineCurve( Geom_BSplineCurve  C, double FromU1, double ToU2, double ParametricTolerance, long SameOrientation) {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.GeomConvert_SplitBSplineCurve__SWIG_2( Geom_BSplineCurve.getCPtr(C) , C, FromU1, ToU2, ParametricTolerance, SameOrientation), true );
  }

  public static  Geom_BSplineCurve  SplitBSplineCurve( Geom_BSplineCurve  C, double FromU1, double ToU2, double ParametricTolerance) {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.GeomConvert_SplitBSplineCurve__SWIG_3( Geom_BSplineCurve.getCPtr(C) , C, FromU1, ToU2, ParametricTolerance), true );
  }

  public static  Geom_BSplineSurface  SplitBSplineSurface( Geom_BSplineSurface  S, int FromUK1, int ToUK2, int FromVK1, int ToVK2, long SameUOrientation, long SameVOrientation) {
    return new Geom_BSplineSurface ( OCCwrapJavaJNI.GeomConvert_SplitBSplineSurface__SWIG_0( Geom_BSplineSurface.getCPtr(S) , S, FromUK1, ToUK2, FromVK1, ToVK2, SameUOrientation, SameVOrientation), true );
  }

  public static  Geom_BSplineSurface  SplitBSplineSurface( Geom_BSplineSurface  S, int FromUK1, int ToUK2, int FromVK1, int ToVK2, long SameUOrientation) {
    return new Geom_BSplineSurface ( OCCwrapJavaJNI.GeomConvert_SplitBSplineSurface__SWIG_1( Geom_BSplineSurface.getCPtr(S) , S, FromUK1, ToUK2, FromVK1, ToVK2, SameUOrientation), true );
  }

  public static  Geom_BSplineSurface  SplitBSplineSurface( Geom_BSplineSurface  S, int FromUK1, int ToUK2, int FromVK1, int ToVK2) {
    return new Geom_BSplineSurface ( OCCwrapJavaJNI.GeomConvert_SplitBSplineSurface__SWIG_2( Geom_BSplineSurface.getCPtr(S) , S, FromUK1, ToUK2, FromVK1, ToVK2), true );
  }

  public static  Geom_BSplineSurface  SplitBSplineSurface( Geom_BSplineSurface  S, int FromK1, int ToK2, long USplit, long SameOrientation) {
    return new Geom_BSplineSurface ( OCCwrapJavaJNI.GeomConvert_SplitBSplineSurface__SWIG_3( Geom_BSplineSurface.getCPtr(S) , S, FromK1, ToK2, USplit, SameOrientation), true );
  }

  public static  Geom_BSplineSurface  SplitBSplineSurface( Geom_BSplineSurface  S, int FromK1, int ToK2, long USplit) {
    return new Geom_BSplineSurface ( OCCwrapJavaJNI.GeomConvert_SplitBSplineSurface__SWIG_4( Geom_BSplineSurface.getCPtr(S) , S, FromK1, ToK2, USplit), true );
  }

  public static  Geom_BSplineSurface  SplitBSplineSurface( Geom_BSplineSurface  S, double FromU1, double ToU2, double FromV1, double ToV2, double ParametricTolerance, long SameUOrientation, long SameVOrientation) {
    return new Geom_BSplineSurface ( OCCwrapJavaJNI.GeomConvert_SplitBSplineSurface__SWIG_5( Geom_BSplineSurface.getCPtr(S) , S, FromU1, ToU2, FromV1, ToV2, ParametricTolerance, SameUOrientation, SameVOrientation), true );
  }

  public static  Geom_BSplineSurface  SplitBSplineSurface( Geom_BSplineSurface  S, double FromU1, double ToU2, double FromV1, double ToV2, double ParametricTolerance, long SameUOrientation) {
    return new Geom_BSplineSurface ( OCCwrapJavaJNI.GeomConvert_SplitBSplineSurface__SWIG_6( Geom_BSplineSurface.getCPtr(S) , S, FromU1, ToU2, FromV1, ToV2, ParametricTolerance, SameUOrientation), true );
  }

  public static  Geom_BSplineSurface  SplitBSplineSurface( Geom_BSplineSurface  S, double FromU1, double ToU2, double FromV1, double ToV2, double ParametricTolerance) {
    return new Geom_BSplineSurface ( OCCwrapJavaJNI.GeomConvert_SplitBSplineSurface__SWIG_7( Geom_BSplineSurface.getCPtr(S) , S, FromU1, ToU2, FromV1, ToV2, ParametricTolerance), true );
  }

  public static  Geom_BSplineSurface  SplitBSplineSurface( Geom_BSplineSurface  S, double FromParam1, double ToParam2, long USplit, double ParametricTolerance, long SameOrientation) {
    return new Geom_BSplineSurface ( OCCwrapJavaJNI.GeomConvert_SplitBSplineSurface__SWIG_8( Geom_BSplineSurface.getCPtr(S) , S, FromParam1, ToParam2, USplit, ParametricTolerance, SameOrientation), true );
  }

  public static  Geom_BSplineSurface  SplitBSplineSurface( Geom_BSplineSurface  S, double FromParam1, double ToParam2, long USplit, double ParametricTolerance) {
    return new Geom_BSplineSurface ( OCCwrapJavaJNI.GeomConvert_SplitBSplineSurface__SWIG_9( Geom_BSplineSurface.getCPtr(S) , S, FromParam1, ToParam2, USplit, ParametricTolerance), true );
  }

  public static  Geom_BSplineCurve  CurveToBSplineCurve( Geom_Curve  C, Convert_ParameterisationType Parameterisation) {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.GeomConvert_CurveToBSplineCurve__SWIG_0( Geom_Curve.getCPtr(C) , C, Parameterisation.swigValue()), true );
  }

  public static  Geom_BSplineCurve  CurveToBSplineCurve( Geom_Curve  C) {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.GeomConvert_CurveToBSplineCurve__SWIG_1( Geom_Curve.getCPtr(C) , C), true );
  }

  public static  Geom_BSplineSurface  SurfaceToBSplineSurface( Geom_Surface  S) {
    return new Geom_BSplineSurface ( OCCwrapJavaJNI.GeomConvert_SurfaceToBSplineSurface( Geom_Surface.getCPtr(S) , S), true );
  }

  /**
   *  This Method concatenates G1 the ArrayOfCurves as far
   *  as it  is possible.
   *  ArrayOfCurves[0..N-1]
   *  ArrayOfToler contains the  biggest tolerance of the two
   *  points shared by two consecutives curves.
   *  Its dimension: [0..N-2]
   *  ClosedG1     indicates if the ArrayOfCurves is closed.
   *  In this case ClosedG1 contains the biggest tolerance
   *  of the two points which are at the closure.
   *  Otherwise its value is 0.0
   */
  public static void ConcatG1( TColGeom_Array1OfBSplineCurve  ArrayOfCurves,  TColStd_Array1OfReal  ArrayOfToler,  TColGeom_HArray1OfBSplineCurve  ArrayOfConcatenated, long ClosedG1Flag, double ClosedTolerance) {
    OCCwrapJavaJNI.GeomConvert_ConcatG1(TColGeom_Array1OfBSplineCurve.getCPtr(ArrayOfCurves), ArrayOfCurves, TColStd_Array1OfReal.getCPtr(ArrayOfToler), ArrayOfToler,  TColGeom_HArray1OfBSplineCurve.getCPtr(ArrayOfConcatenated) , ArrayOfConcatenated, ClosedG1Flag, ClosedTolerance);
  }

  /**
   *  This Method concatenates C1 the ArrayOfCurves as far
   *  as it is possible.
   *  ArrayOfCurves[0..N-1]
   *  ArrayOfToler contains the  biggest tolerance of the two
   *  points shared by two consecutives curves.
   *  Its dimension: [0..N-2]
   *  ClosedG1     indicates if the ArrayOfCurves is closed.
   *  In this case ClosedG1 contains the biggest tolerance
   *  of the two points which are at the closure.
   *  Otherwise its value is 0.0
   */
  public static void ConcatC1( TColGeom_Array1OfBSplineCurve  ArrayOfCurves,  TColStd_Array1OfReal  ArrayOfToler,  TColStd_HArray1OfInteger  ArrayOfIndices,  TColGeom_HArray1OfBSplineCurve  ArrayOfConcatenated, long ClosedG1Flag, double ClosedTolerance) {
    OCCwrapJavaJNI.GeomConvert_ConcatC1__SWIG_0(TColGeom_Array1OfBSplineCurve.getCPtr(ArrayOfCurves), ArrayOfCurves, TColStd_Array1OfReal.getCPtr(ArrayOfToler), ArrayOfToler,  TColStd_HArray1OfInteger.getCPtr(ArrayOfIndices) , ArrayOfIndices,  TColGeom_HArray1OfBSplineCurve.getCPtr(ArrayOfConcatenated) , ArrayOfConcatenated, ClosedG1Flag, ClosedTolerance);
  }

  /**
   *  This Method concatenates C1 the ArrayOfCurves as far
   *  as it is possible.
   *  ArrayOfCurves[0..N-1]
   *  ArrayOfToler contains the  biggest tolerance of the two
   *  points shared by two consecutives curves.
   *  Its dimension: [0..N-2]
   *  ClosedG1     indicates if the ArrayOfCurves is closed.
   *  In this case ClosedG1 contains the biggest tolerance
   *  of the two points which are at the closure.
   *  Otherwise its value is 0.0
   */
  public static void ConcatC1( TColGeom_Array1OfBSplineCurve  ArrayOfCurves,  TColStd_Array1OfReal  ArrayOfToler,  TColStd_HArray1OfInteger  ArrayOfIndices,  TColGeom_HArray1OfBSplineCurve  ArrayOfConcatenated, long ClosedG1Flag, double ClosedTolerance, double AngularTolerance) {
    OCCwrapJavaJNI.GeomConvert_ConcatC1__SWIG_1(TColGeom_Array1OfBSplineCurve.getCPtr(ArrayOfCurves), ArrayOfCurves, TColStd_Array1OfReal.getCPtr(ArrayOfToler), ArrayOfToler,  TColStd_HArray1OfInteger.getCPtr(ArrayOfIndices) , ArrayOfIndices,  TColGeom_HArray1OfBSplineCurve.getCPtr(ArrayOfConcatenated) , ArrayOfConcatenated, ClosedG1Flag, ClosedTolerance, AngularTolerance);
  }

  /**
   *  This  Method reduces as far as   it is possible the
   *  multiplicities of  the  knots of  the BSpline BS.(keeping  the
   *  geometry).  It returns a new BSpline which  could still be C0.
   *  tolerance is a  geometrical tolerance.
   *  The  Angular toleranceis in radians  and mesures  the angle of
   *  the tangents  on  the left and on  the right  to decide if  the
   *  curve is G1 or not at a given point
   */
  public static void C0BSplineToC1BSplineCurve( Geom_BSplineCurve  BS, double tolerance, double AngularTolerance) {
    OCCwrapJavaJNI.GeomConvert_C0BSplineToC1BSplineCurve__SWIG_0( Geom_BSplineCurve.getCPtr(BS) , BS, tolerance, AngularTolerance);
  }

  public static void C0BSplineToC1BSplineCurve( Geom_BSplineCurve  BS, double tolerance) {
    OCCwrapJavaJNI.GeomConvert_C0BSplineToC1BSplineCurve__SWIG_1( Geom_BSplineCurve.getCPtr(BS) , BS, tolerance);
  }

  /**
   *  This Method   reduces as far  as  it is possible  the
   *  multiplicities  of  the knots  of the BSpline  BS.(keeping the geometry).
   *  It returns an array of BSpline C1. tolerance is a geometrical tolerance.
   */
  public static void C0BSplineToArrayOfC1BSplineCurve( Geom_BSplineCurve  BS,  TColGeom_HArray1OfBSplineCurve  tabBS, double tolerance) {
    OCCwrapJavaJNI.GeomConvert_C0BSplineToArrayOfC1BSplineCurve__SWIG_0( Geom_BSplineCurve.getCPtr(BS) , BS,  TColGeom_HArray1OfBSplineCurve.getCPtr(tabBS) , tabBS, tolerance);
  }

  /**
   *  This   Method reduces as far   as it is  possible the
   *  multiplicities of  the  knots of  the  BSpline BS.(keeping the
   *  geometry).  It returns an array of BSpline C1.  tolerance is a
   *  geometrical tolerance : it  allows for the maximum deformation
   *  The  Angular tolerance is in  radians and mesures the angle of
   *  the tangents on the left and on the right to decide if the curve
   *  is C1 or not at a given point
   */
  public static void C0BSplineToArrayOfC1BSplineCurve( Geom_BSplineCurve  BS,  TColGeom_HArray1OfBSplineCurve  tabBS, double AngularTolerance, double tolerance) {
    OCCwrapJavaJNI.GeomConvert_C0BSplineToArrayOfC1BSplineCurve__SWIG_1( Geom_BSplineCurve.getCPtr(BS) , BS,  TColGeom_HArray1OfBSplineCurve.getCPtr(tabBS) , tabBS, AngularTolerance, tolerance);
  }

  public GeomConvert() {
    this(OCCwrapJavaJNI.new_GeomConvert(), true);
  }

}
