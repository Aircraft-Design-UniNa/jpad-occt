package opencascade;

/**
 *  Converts a surface to the analitical form with given
 *  precision. Conversion is done only the surface is bspline
 *  of bezier and this can be approximed by some analytical
 *  surface with that precision.
 */
public class ShapeCustom_Surface {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeCustom_Surface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeCustom_Surface(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeCustom_Surface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeCustom_Surface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ShapeCustom_Surface() {
    this(OCCwrapJavaJNI.new_ShapeCustom_Surface__SWIG_0(), true);
  }

  public ShapeCustom_Surface( Geom_Surface  S) {
    this(OCCwrapJavaJNI.new_ShapeCustom_Surface__SWIG_1( Geom_Surface.getCPtr(S) , S), true);
  }

  public void Init( Geom_Surface  S) {
    OCCwrapJavaJNI.ShapeCustom_Surface_Init(swigCPtr, this,  Geom_Surface.getCPtr(S) , S);
  }

  /**
   *  Returns maximal deviation of converted surface from the original
   *  one computed by last call to ConvertToAnalytical
   */
  public double Gap() {
    return OCCwrapJavaJNI.ShapeCustom_Surface_Gap(swigCPtr, this);
  }

  public  Geom_Surface  ConvertToAnalytical(double tol, long substitute) {
    return new Geom_Surface ( OCCwrapJavaJNI.ShapeCustom_Surface_ConvertToAnalytical(swigCPtr, this, tol, substitute), true );
  }

  public  Geom_Surface  ConvertToPeriodic(long substitute, double preci) {
    return new Geom_Surface ( OCCwrapJavaJNI.ShapeCustom_Surface_ConvertToPeriodic__SWIG_0(swigCPtr, this, substitute, preci), true );
  }

  public  Geom_Surface  ConvertToPeriodic(long substitute) {
    return new Geom_Surface ( OCCwrapJavaJNI.ShapeCustom_Surface_ConvertToPeriodic__SWIG_1(swigCPtr, this, substitute), true );
  }

}
