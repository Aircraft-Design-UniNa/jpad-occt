package opencascade;

/**
 *  An interface between the services provided by any
 *  surface from the package Geom and those required
 *  of the surface by algorithms which use it.
 *  Creation of the loaded surface the surface is C1 by piece
 * 
 *  Polynomial coefficients of BSpline surfaces used for their evaluation are
 *  cached for better performance. Therefore these evaluations are not
 *  thread-safe and parallel evaluations need to be prevented.
 */
public class GeomAdaptor_Surface extends Adaptor3d_Surface {

  private long swigCPtr;
  GeomAdaptor_Surface(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.GeomAdaptor_Surface_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  GeomAdaptor_Surface(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.GeomAdaptor_Surface_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(GeomAdaptor_Surface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomAdaptor_Surface(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public GeomAdaptor_Surface() {
    this(OCCwrapJavaJNI.new_GeomAdaptor_Surface__SWIG_0(), true);
  }

  public GeomAdaptor_Surface( Geom_Surface  S) {
    this(OCCwrapJavaJNI.new_GeomAdaptor_Surface__SWIG_1( Geom_Surface.getCPtr(S) , S), true);
  }

  /**
   *  ConstructionError is raised if UFirst>ULast or VFirst>VLast
   */
  public GeomAdaptor_Surface( Geom_Surface  S, double UFirst, double ULast, double VFirst, double VLast, double TolU, double TolV) {
    this(OCCwrapJavaJNI.new_GeomAdaptor_Surface__SWIG_2( Geom_Surface.getCPtr(S) , S, UFirst, ULast, VFirst, VLast, TolU, TolV), true);
  }

  public GeomAdaptor_Surface( Geom_Surface  S, double UFirst, double ULast, double VFirst, double VLast, double TolU) {
    this(OCCwrapJavaJNI.new_GeomAdaptor_Surface__SWIG_3( Geom_Surface.getCPtr(S) , S, UFirst, ULast, VFirst, VLast, TolU), true);
  }

  public GeomAdaptor_Surface( Geom_Surface  S, double UFirst, double ULast, double VFirst, double VLast) {
    this(OCCwrapJavaJNI.new_GeomAdaptor_Surface__SWIG_4( Geom_Surface.getCPtr(S) , S, UFirst, ULast, VFirst, VLast), true);
  }

  public void Load( Geom_Surface  S) {
    OCCwrapJavaJNI.GeomAdaptor_Surface_Load__SWIG_0(swigCPtr, this,  Geom_Surface.getCPtr(S) , S);
  }

  /**
   *  ConstructionError is raised if UFirst>ULast or VFirst>VLast
   */
  public void Load( Geom_Surface  S, double UFirst, double ULast, double VFirst, double VLast, double TolU, double TolV) {
    OCCwrapJavaJNI.GeomAdaptor_Surface_Load__SWIG_1(swigCPtr, this,  Geom_Surface.getCPtr(S) , S, UFirst, ULast, VFirst, VLast, TolU, TolV);
  }

  public void Load( Geom_Surface  S, double UFirst, double ULast, double VFirst, double VLast, double TolU) {
    OCCwrapJavaJNI.GeomAdaptor_Surface_Load__SWIG_2(swigCPtr, this,  Geom_Surface.getCPtr(S) , S, UFirst, ULast, VFirst, VLast, TolU);
  }

  public void Load( Geom_Surface  S, double UFirst, double ULast, double VFirst, double VLast) {
    OCCwrapJavaJNI.GeomAdaptor_Surface_Load__SWIG_3(swigCPtr, this,  Geom_Surface.getCPtr(S) , S, UFirst, ULast, VFirst, VLast);
  }

  public  Geom_Surface  Surface() {
    return new Geom_Surface ( OCCwrapJavaJNI.GeomAdaptor_Surface_Surface(swigCPtr, this), true );
  }

}
