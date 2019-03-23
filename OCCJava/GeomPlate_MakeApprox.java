package opencascade;

/**
 *  Allows you to convert a GeomPlate surface into a BSpline.
 */
public class GeomPlate_MakeApprox {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GeomPlate_MakeApprox(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GeomPlate_MakeApprox(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GeomPlate_MakeApprox obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomPlate_MakeApprox(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Converts SurfPlate into a Geom_BSplineSurface with
   *  n Bezier pieces (n<=Nbmax) of degree <= dgmax
   *  and an approximation error < Tol3d if possible
   *  the criterion CritPlate is satisfied if possible
   */
  public GeomPlate_MakeApprox( GeomPlate_Surface  SurfPlate, double Tol3d, int Nbmax, int dgmax, double dmax, int CritOrder, GeomAbs_Shape Continuity, double EnlargeCoeff) {
    this(OCCwrapJavaJNI.new_GeomPlate_MakeApprox__SWIG_0( GeomPlate_Surface.getCPtr(SurfPlate) , SurfPlate, Tol3d, Nbmax, dgmax, dmax, CritOrder, Continuity.swigValue(), EnlargeCoeff), true);
  }

  /**
   *  Converts SurfPlate into a Geom_BSplineSurface with
   *  n Bezier pieces (n<=Nbmax) of degree <= dgmax
   *  and an approximation error < Tol3d if possible
   *  if CritOrder = -1 , no criterion is used
   *  if CritOrder = 0 , a PlateG0Criterion is used with max value > 10*dmax
   *  if CritOrder = 1 , a PlateG1Criterion is used with max value > 10*dmax
   *  WARNING : for CritOrder = 0 or 1, only the constraints points of SurfPlate
   *  are used to evaluate the value of the criterion
   */
  public GeomPlate_MakeApprox( GeomPlate_Surface  SurfPlate, double Tol3d, int Nbmax, int dgmax, double dmax, int CritOrder, GeomAbs_Shape Continuity) {
    this(OCCwrapJavaJNI.new_GeomPlate_MakeApprox__SWIG_1( GeomPlate_Surface.getCPtr(SurfPlate) , SurfPlate, Tol3d, Nbmax, dgmax, dmax, CritOrder, Continuity.swigValue()), true);
  }

  public GeomPlate_MakeApprox( GeomPlate_Surface  SurfPlate, double Tol3d, int Nbmax, int dgmax, double dmax, int CritOrder) {
    this(OCCwrapJavaJNI.new_GeomPlate_MakeApprox__SWIG_2( GeomPlate_Surface.getCPtr(SurfPlate) , SurfPlate, Tol3d, Nbmax, dgmax, dmax, CritOrder), true);
  }

  public GeomPlate_MakeApprox( GeomPlate_Surface  SurfPlate, double Tol3d, int Nbmax, int dgmax, double dmax) {
    this(OCCwrapJavaJNI.new_GeomPlate_MakeApprox__SWIG_3( GeomPlate_Surface.getCPtr(SurfPlate) , SurfPlate, Tol3d, Nbmax, dgmax, dmax), true);
  }

  public  Geom_BSplineSurface  Surface() {
    return new Geom_BSplineSurface ( OCCwrapJavaJNI.GeomPlate_MakeApprox_Surface(swigCPtr, this), true );
  }

  /**
   *  Returns the error in computation of the approximation
   *  surface. This is the distance between the entire target
   *  BSpline surface and the entire original surface
   *  generated by BuildPlateSurface and converted by GeomPlate_Surface.
   */
  public double ApproxError() {
    return OCCwrapJavaJNI.GeomPlate_MakeApprox_ApproxError(swigCPtr, this);
  }

  /**
   *  Returns the criterion error in computation of the
   *  approximation surface. This is estimated relative to the
   *  curve and point constraints only.
   */
  public double CriterionError() {
    return OCCwrapJavaJNI.GeomPlate_MakeApprox_CriterionError(swigCPtr, this);
  }

}
