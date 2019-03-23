package opencascade;

/**
 *  Converts BSpline curve to periodic
 */
public class ShapeCustom_Curve {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeCustom_Curve(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeCustom_Curve(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeCustom_Curve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeCustom_Curve(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ShapeCustom_Curve() {
    this(OCCwrapJavaJNI.new_ShapeCustom_Curve__SWIG_0(), true);
  }

  public ShapeCustom_Curve( Geom_Curve  C) {
    this(OCCwrapJavaJNI.new_ShapeCustom_Curve__SWIG_1( Geom_Curve.getCPtr(C) , C), true);
  }

  public void Init( Geom_Curve  C) {
    OCCwrapJavaJNI.ShapeCustom_Curve_Init(swigCPtr, this,  Geom_Curve.getCPtr(C) , C);
  }

  public  Geom_Curve  ConvertToPeriodic(long substitute, double preci) {
    return new Geom_Curve ( OCCwrapJavaJNI.ShapeCustom_Curve_ConvertToPeriodic__SWIG_0(swigCPtr, this, substitute, preci), true );
  }

  public  Geom_Curve  ConvertToPeriodic(long substitute) {
    return new Geom_Curve ( OCCwrapJavaJNI.ShapeCustom_Curve_ConvertToPeriodic__SWIG_1(swigCPtr, this, substitute), true );
  }

}
