package opencascade;

/**
 *  Converts curve2d to analytical form with given
 *  precision or simpify curve2d.
 */
public class ShapeCustom_Curve2d {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeCustom_Curve2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeCustom_Curve2d(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeCustom_Curve2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeCustom_Curve2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Check if poleses is in the plane with given precision
   *  Returns false if no.
   */
  public static long IsLinear( TColgp_Array1OfPnt2d  thePoles, double theTolerance, double[] theDeviation) {
    return OCCwrapJavaJNI.ShapeCustom_Curve2d_IsLinear(TColgp_Array1OfPnt2d.getCPtr(thePoles), thePoles, theTolerance, theDeviation);
  }

  public static  Geom2d_Line  ConvertToLine2d( Geom2d_Curve  theCurve, double theFirstIn, double theLastIn, double theTolerance, double[] theNewFirst, double[] theNewLast, double[] theDeviation) {
    return new Geom2d_Line ( OCCwrapJavaJNI.ShapeCustom_Curve2d_ConvertToLine2d( Geom2d_Curve.getCPtr(theCurve) , theCurve, theFirstIn, theLastIn, theTolerance, theNewFirst, theNewLast, theDeviation), true );
  }

  /**
   *  Try to remove knots from bspline where local derivatives are the same.
   *  Remove knots with given precision.
   *  Returns false if Bsplien was not modified
   */
  public static long SimplifyBSpline2d( Geom2d_BSplineCurve  theBSpline2d, double theTolerance) {
    return OCCwrapJavaJNI.ShapeCustom_Curve2d_SimplifyBSpline2d( Geom2d_BSplineCurve.getCPtr(theBSpline2d) , theBSpline2d, theTolerance);
  }

  public ShapeCustom_Curve2d() {
    this(OCCwrapJavaJNI.new_ShapeCustom_Curve2d(), true);
  }

}
