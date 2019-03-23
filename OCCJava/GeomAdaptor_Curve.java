package opencascade;

/**
 *  This class provides an interface between the services provided by any
 *  curve from the package Geom and those required of the curve by algorithms which use it.
 *  Creation of the loaded curve the curve is C1 by piece.
 * 
 *  Polynomial coefficients of BSpline curves used for their evaluation are
 *  cached for better performance. Therefore these evaluations are not
 *  thread-safe and parallel evaluations need to be prevented.
 */
public class GeomAdaptor_Curve extends Adaptor3d_Curve {

  private long swigCPtr;
  GeomAdaptor_Curve(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.GeomAdaptor_Curve_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  GeomAdaptor_Curve(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.GeomAdaptor_Curve_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(GeomAdaptor_Curve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomAdaptor_Curve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public GeomAdaptor_Curve() {
    this(OCCwrapJavaJNI.new_GeomAdaptor_Curve__SWIG_0(), true);
  }

  public GeomAdaptor_Curve( Geom_Curve  C) {
    this(OCCwrapJavaJNI.new_GeomAdaptor_Curve__SWIG_1( Geom_Curve.getCPtr(C) , C), true);
  }

  /**
   *  ConstructionError is raised if Ufirst>Ulast
   */
  public GeomAdaptor_Curve( Geom_Curve  C, double UFirst, double ULast) {
    this(OCCwrapJavaJNI.new_GeomAdaptor_Curve__SWIG_2( Geom_Curve.getCPtr(C) , C, UFirst, ULast), true);
  }

  public void Load( Geom_Curve  C) {
    OCCwrapJavaJNI.GeomAdaptor_Curve_Load__SWIG_0(swigCPtr, this,  Geom_Curve.getCPtr(C) , C);
  }

  /**
   *  ConstructionError is raised if Ufirst>Ulast
   */
  public void Load( Geom_Curve  C, double UFirst, double ULast) {
    OCCwrapJavaJNI.GeomAdaptor_Curve_Load__SWIG_1(swigCPtr, this,  Geom_Curve.getCPtr(C) , C, UFirst, ULast);
  }

  public  Geom_Curve  Curve() {
    return new Geom_Curve ( OCCwrapJavaJNI.GeomAdaptor_Curve_Curve(swigCPtr, this), true );
  }

}
