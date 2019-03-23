package opencascade;

/**
 *  An interface between the services provided by any
 *  curve from the package Geom2d and those required
 *  of the curve by algorithms which use it.
 * 
 *  Polynomial coefficients of BSpline curves used for their evaluation are
 *  cached for better performance. Therefore these evaluations are not
 *  thread-safe and parallel evaluations need to be prevented.
 */
public class Geom2dAdaptor_Curve extends Adaptor2d_Curve2d {

  private long swigCPtr;
  Geom2dAdaptor_Curve(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.Geom2dAdaptor_Curve_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  Geom2dAdaptor_Curve(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.Geom2dAdaptor_Curve_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(Geom2dAdaptor_Curve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Geom2dAdaptor_Curve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Geom2dAdaptor_Curve() {
    this(OCCwrapJavaJNI.new_Geom2dAdaptor_Curve__SWIG_0(), true);
  }

  public Geom2dAdaptor_Curve( Geom2d_Curve  C) {
    this(OCCwrapJavaJNI.new_Geom2dAdaptor_Curve__SWIG_1( Geom2d_Curve.getCPtr(C) , C), true);
  }

  /**
   *  ConstructionError is raised if Ufirst>Ulast
   */
  public Geom2dAdaptor_Curve( Geom2d_Curve  C, double UFirst, double ULast) {
    this(OCCwrapJavaJNI.new_Geom2dAdaptor_Curve__SWIG_2( Geom2d_Curve.getCPtr(C) , C, UFirst, ULast), true);
  }

  public void Load( Geom2d_Curve  C) {
    OCCwrapJavaJNI.Geom2dAdaptor_Curve_Load__SWIG_0(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C);
  }

  /**
   *  ConstructionError is raised if Ufirst>Ulast
   */
  public void Load( Geom2d_Curve  C, double UFirst, double ULast) {
    OCCwrapJavaJNI.Geom2dAdaptor_Curve_Load__SWIG_1(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C, UFirst, ULast);
  }

  public  Geom2d_Curve  Curve() {
    return new Geom2d_Curve ( OCCwrapJavaJNI.Geom2dAdaptor_Curve_Curve(swigCPtr, this), true );
  }

}
