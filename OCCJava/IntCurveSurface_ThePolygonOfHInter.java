package opencascade;

public class IntCurveSurface_ThePolygonOfHInter {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntCurveSurface_ThePolygonOfHInter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntCurveSurface_ThePolygonOfHInter(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntCurveSurface_ThePolygonOfHInter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntCurveSurface_ThePolygonOfHInter(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntCurveSurface_ThePolygonOfHInter( Adaptor3d_HCurve  Curve, int NbPnt) {
    this(OCCwrapJavaJNI.new_IntCurveSurface_ThePolygonOfHInter__SWIG_0( Adaptor3d_HCurve.getCPtr(Curve) , Curve, NbPnt), true);
  }

  public IntCurveSurface_ThePolygonOfHInter( Adaptor3d_HCurve  Curve, double U1, double U2, int NbPnt) {
    this(OCCwrapJavaJNI.new_IntCurveSurface_ThePolygonOfHInter__SWIG_1( Adaptor3d_HCurve.getCPtr(Curve) , Curve, U1, U2, NbPnt), true);
  }

  public IntCurveSurface_ThePolygonOfHInter( Adaptor3d_HCurve  Curve,  TColStd_Array1OfReal  Upars) {
    this(OCCwrapJavaJNI.new_IntCurveSurface_ThePolygonOfHInter__SWIG_2( Adaptor3d_HCurve.getCPtr(Curve) , Curve, TColStd_Array1OfReal.getCPtr(Upars), Upars), true);
  }

  /**
   *  Give the bounding box of the polygon.
   */
  public  Bnd_Box  Bounding() {
    Bnd_Box ret = new Bnd_Box(OCCwrapJavaJNI.IntCurveSurface_ThePolygonOfHInter_Bounding(swigCPtr, this), true);
    return ret;
  }

  public double DeflectionOverEstimation() {
    return OCCwrapJavaJNI.IntCurveSurface_ThePolygonOfHInter_DeflectionOverEstimation(swigCPtr, this);
  }

  public void SetDeflectionOverEstimation(double x) {
    OCCwrapJavaJNI.IntCurveSurface_ThePolygonOfHInter_SetDeflectionOverEstimation(swigCPtr, this, x);
  }

  public void Closed(long clos) {
    OCCwrapJavaJNI.IntCurveSurface_ThePolygonOfHInter_Closed__SWIG_0(swigCPtr, this, clos);
  }

  public long Closed() {
    return OCCwrapJavaJNI.IntCurveSurface_ThePolygonOfHInter_Closed__SWIG_1(swigCPtr, this);
  }

  /**
   *  Give the number of Segments in the polyline.
   */
  public int NbSegments() {
    return OCCwrapJavaJNI.IntCurveSurface_ThePolygonOfHInter_NbSegments(swigCPtr, this);
  }

  /**
   *  Give the point of range Index in the Polygon.
   */
  public  gp_Pnt  BeginOfSeg(int Index) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.IntCurveSurface_ThePolygonOfHInter_BeginOfSeg(swigCPtr, this, Index), true);
    return ret;
  }

  /**
   *  Give the point of range Index in the Polygon.
   */
  public  gp_Pnt  EndOfSeg(int Index) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.IntCurveSurface_ThePolygonOfHInter_EndOfSeg(swigCPtr, this, Index), true);
    return ret;
  }

  /**
   *  Returns the parameter (On the curve)
   *  of the first point of the Polygon
   */
  public double InfParameter() {
    return OCCwrapJavaJNI.IntCurveSurface_ThePolygonOfHInter_InfParameter(swigCPtr, this);
  }

  /**
   *  Returns the parameter (On the curve)
   *  of the last point of the Polygon
   */
  public double SupParameter() {
    return OCCwrapJavaJNI.IntCurveSurface_ThePolygonOfHInter_SupParameter(swigCPtr, this);
  }

  /**
   *  Give an approximation of the parameter on the curve
   *  according to the discretization of the Curve.
   */
  public double ApproxParamOnCurve(int Index, double ParamOnLine) {
    return OCCwrapJavaJNI.IntCurveSurface_ThePolygonOfHInter_ApproxParamOnCurve(swigCPtr, this, Index, ParamOnLine);
  }

  public void Dump() {
    OCCwrapJavaJNI.IntCurveSurface_ThePolygonOfHInter_Dump(swigCPtr, this);
  }

}
