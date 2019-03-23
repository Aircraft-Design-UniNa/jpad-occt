package opencascade;

/**
 *  The class is a container of one 3D curve, two 2D curves and two Tolerance values.
 *  It is used in the Face/Face intersection algorithm to store the results
 *  of intersection. In this context:
 *  **the 3D curve** is the intersection curve;
 *  **the 2D curves** are the PCurves of the 3D curve on the intersecting faces;
 *  **the tolerance** is the valid tolerance for 3D curve computed as
 *  maximal deviation between 3D curve and 2D curves (or surfaces in case there are no 2D curves);
 *  **the tangential tolerance** is the maximal distance from 3D curve to the
 *  end of the tangential zone between faces in terms of their tolerance values.
 */
public class IntTools_Curve {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntTools_Curve(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntTools_Curve(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntTools_Curve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntTools_Curve(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor
   */
  public IntTools_Curve() {
    this(OCCwrapJavaJNI.new_IntTools_Curve__SWIG_0(), true);
  }

  /**
   *  Constructor taking 3d curve, two 2d curves and two tolerance values
   */
  public IntTools_Curve( Geom_Curve  the3dCurve3d,  Geom2d_Curve  the2dCurve1,  Geom2d_Curve  the2dCurve2, double theTolerance, double theTangentialTolerance) {
    this(OCCwrapJavaJNI.new_IntTools_Curve__SWIG_1( Geom_Curve.getCPtr(the3dCurve3d) , the3dCurve3d,  Geom2d_Curve.getCPtr(the2dCurve1) , the2dCurve1,  Geom2d_Curve.getCPtr(the2dCurve2) , the2dCurve2, theTolerance, theTangentialTolerance), true);
  }

  public IntTools_Curve( Geom_Curve  the3dCurve3d,  Geom2d_Curve  the2dCurve1,  Geom2d_Curve  the2dCurve2, double theTolerance) {
    this(OCCwrapJavaJNI.new_IntTools_Curve__SWIG_2( Geom_Curve.getCPtr(the3dCurve3d) , the3dCurve3d,  Geom2d_Curve.getCPtr(the2dCurve1) , the2dCurve1,  Geom2d_Curve.getCPtr(the2dCurve2) , the2dCurve2, theTolerance), true);
  }

  public IntTools_Curve( Geom_Curve  the3dCurve3d,  Geom2d_Curve  the2dCurve1,  Geom2d_Curve  the2dCurve2) {
    this(OCCwrapJavaJNI.new_IntTools_Curve__SWIG_3( Geom_Curve.getCPtr(the3dCurve3d) , the3dCurve3d,  Geom2d_Curve.getCPtr(the2dCurve1) , the2dCurve1,  Geom2d_Curve.getCPtr(the2dCurve2) , the2dCurve2), true);
  }

  /**
   *  Sets the curves
   */
  public void SetCurves( Geom_Curve  the3dCurve,  Geom2d_Curve  the2dCurve1,  Geom2d_Curve  the2dCurve2) {
    OCCwrapJavaJNI.IntTools_Curve_SetCurves(swigCPtr, this,  Geom_Curve.getCPtr(the3dCurve) , the3dCurve,  Geom2d_Curve.getCPtr(the2dCurve1) , the2dCurve1,  Geom2d_Curve.getCPtr(the2dCurve2) , the2dCurve2);
  }

  /**
   *  Sets the 3d curve
   */
  public void SetCurve( Geom_Curve  the3dCurve) {
    OCCwrapJavaJNI.IntTools_Curve_SetCurve(swigCPtr, this,  Geom_Curve.getCPtr(the3dCurve) , the3dCurve);
  }

  /**
   *  Sets the first 2d curve
   */
  public void SetFirstCurve2d( Geom2d_Curve  the2dCurve1) {
    OCCwrapJavaJNI.IntTools_Curve_SetFirstCurve2d(swigCPtr, this,  Geom2d_Curve.getCPtr(the2dCurve1) , the2dCurve1);
  }

  /**
   *  Sets the second 2d curve
   */
  public void SetSecondCurve2d( Geom2d_Curve  the2dCurve2) {
    OCCwrapJavaJNI.IntTools_Curve_SetSecondCurve2d(swigCPtr, this,  Geom2d_Curve.getCPtr(the2dCurve2) , the2dCurve2);
  }

  /**
   *  Sets the tolerance for the curve
   */
  public void SetTolerance(double theTolerance) {
    OCCwrapJavaJNI.IntTools_Curve_SetTolerance(swigCPtr, this, theTolerance);
  }

  /**
   *  Sets the tangential tolerance
   */
  public void SetTangentialTolerance(double theTangentialTolerance) {
    OCCwrapJavaJNI.IntTools_Curve_SetTangentialTolerance(swigCPtr, this, theTangentialTolerance);
  }

  public  Geom_Curve  Curve() {
    return new Geom_Curve ( OCCwrapJavaJNI.IntTools_Curve_Curve(swigCPtr, this), true );
  }

  public  Geom2d_Curve  FirstCurve2d() {
    return new Geom2d_Curve ( OCCwrapJavaJNI.IntTools_Curve_FirstCurve2d(swigCPtr, this), true );
  }

  public  Geom2d_Curve  SecondCurve2d() {
    return new Geom2d_Curve ( OCCwrapJavaJNI.IntTools_Curve_SecondCurve2d(swigCPtr, this), true );
  }

  /**
   *  Returns the tolerance
   */
  public double Tolerance() {
    return OCCwrapJavaJNI.IntTools_Curve_Tolerance(swigCPtr, this);
  }

  /**
   *  Returns the tangential tolerance
   */
  public double TangentialTolerance() {
    return OCCwrapJavaJNI.IntTools_Curve_TangentialTolerance(swigCPtr, this);
  }

  /**
   *  Returns TRUE if 3d curve is BoundedCurve
   */
  public long HasBounds() {
    return OCCwrapJavaJNI.IntTools_Curve_HasBounds(swigCPtr, this);
  }

  /**
   *  If the 3d curve is bounded curve the method will return TRUE
   *  and modify the output parameters with boundary parameters of
   *  the curve and corresponded 3d points.
   *  If the curve does not have bounds, the method will return false
   *  and the output parameters will stay untouched.
   */
  public long Bounds(double[] theFirst, double[] theLast, gp_Pnt theFirstPnt, gp_Pnt theLastPnt) {
    return OCCwrapJavaJNI.IntTools_Curve_Bounds(swigCPtr, this, theFirst, theLast, gp_Pnt.getCPtr(theFirstPnt), theFirstPnt, gp_Pnt.getCPtr(theLastPnt), theLastPnt);
  }

  /**
   *  Computes 3d point corresponded to the given parameter if this
   *  parameter is inside the boundaries of the curve.
   *  Returns TRUE in this case. 
   *  Otherwise, the point will not be computed and the method will return FALSE.
   */
  public long D0( double  thePar, gp_Pnt thePnt) {
    return OCCwrapJavaJNI.IntTools_Curve_D0(swigCPtr, this,  thePar , gp_Pnt.getCPtr(thePnt), thePnt);
  }

  /**
   *  Returns the type of the 3d curve
   */
  public GeomAbs_CurveType Type() {
    return GeomAbs_CurveType.swigToEnum(OCCwrapJavaJNI.IntTools_Curve_Type(swigCPtr, this));
  }

}
