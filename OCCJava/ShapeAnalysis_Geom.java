package opencascade;

/**
 *  Analyzing tool aimed to work on primitive geometrical objects
 */
public class ShapeAnalysis_Geom {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeAnalysis_Geom(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeAnalysis_Geom(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeAnalysis_Geom obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeAnalysis_Geom(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Builds a plane out of a set of points in array
   *  Returns in <dmax> the maximal distance between the produced
   *  plane and given points
   */
  public static long NearestPlane( TColgp_Array1OfPnt  Pnts, gp_Pln aPln, double[] Dmax) {
    return OCCwrapJavaJNI.ShapeAnalysis_Geom_NearestPlane(TColgp_Array1OfPnt.getCPtr(Pnts), Pnts, gp_Pln.getCPtr(aPln), aPln, Dmax);
  }

  /**
   *  Builds transfromation object out of matrix.
   *  Matrix must be 3 x 4.
   *  Unit is used as multiplier.
   */
  public static long PositionTrsf( TColStd_HArray2OfReal  coefs, gp_Trsf trsf, double unit, double prec) {
    return OCCwrapJavaJNI.ShapeAnalysis_Geom_PositionTrsf( TColStd_HArray2OfReal.getCPtr(coefs) , coefs, gp_Trsf.getCPtr(trsf), trsf, unit, prec);
  }

  public ShapeAnalysis_Geom() {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_Geom(), true);
  }

}
