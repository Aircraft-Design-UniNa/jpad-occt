package opencascade;

/**
 *  An interface between the services provided by a curve
 *  lying on a surface from the package Geom and those
 *  required of the curve by algorithms which use it. The
 *  curve is defined as a 2D curve from the Geom2d
 *  package, in the parametric space of the surface.
 */
public class Adaptor3d_CurveOnSurface extends Adaptor3d_Curve {

  private long swigCPtr;
  Adaptor3d_CurveOnSurface(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.Adaptor3d_CurveOnSurface_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  Adaptor3d_CurveOnSurface(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.Adaptor3d_CurveOnSurface_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(Adaptor3d_CurveOnSurface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Adaptor3d_CurveOnSurface(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Adaptor3d_CurveOnSurface() {
    this(OCCwrapJavaJNI.new_Adaptor3d_CurveOnSurface__SWIG_0(), true);
  }

  public Adaptor3d_CurveOnSurface( Adaptor3d_HSurface  S) {
    this(OCCwrapJavaJNI.new_Adaptor3d_CurveOnSurface__SWIG_1( Adaptor3d_HSurface.getCPtr(S) , S), true);
  }

  /**
   *  Creates a CurveOnSurface from the 2d curve <C> and
   *  the surface <S>.
   */
  public Adaptor3d_CurveOnSurface( Adaptor2d_HCurve2d  C,  Adaptor3d_HSurface  S) {
    this(OCCwrapJavaJNI.new_Adaptor3d_CurveOnSurface__SWIG_2( Adaptor2d_HCurve2d.getCPtr(C) , C,  Adaptor3d_HSurface.getCPtr(S) , S), true);
  }

  /**
   *  Changes the surface.
   */
  public void Load( Adaptor3d_HSurface  S) {
    OCCwrapJavaJNI.Adaptor3d_CurveOnSurface_Load__SWIG_0(swigCPtr, this,  Adaptor3d_HSurface.getCPtr(S) , S);
  }

  /**
   *  Changes the 2d curve.
   */
  public void Load( Adaptor2d_HCurve2d  C) {
    OCCwrapJavaJNI.Adaptor3d_CurveOnSurface_Load__SWIG_1(swigCPtr, this,  Adaptor2d_HCurve2d.getCPtr(C) , C);
  }

  /**
   *  Load both curve and surface.
   */
  public void Load( Adaptor2d_HCurve2d  C,  Adaptor3d_HSurface  S) {
    OCCwrapJavaJNI.Adaptor3d_CurveOnSurface_Load__SWIG_2(swigCPtr, this,  Adaptor2d_HCurve2d.getCPtr(C) , C,  Adaptor3d_HSurface.getCPtr(S) , S);
  }

  public  Adaptor2d_HCurve2d  GetCurve() {
    return new Adaptor2d_HCurve2d ( OCCwrapJavaJNI.Adaptor3d_CurveOnSurface_GetCurve(swigCPtr, this), true );
  }

  public  Adaptor3d_HSurface  GetSurface() {
    return new Adaptor3d_HSurface ( OCCwrapJavaJNI.Adaptor3d_CurveOnSurface_GetSurface(swigCPtr, this), true );
  }

  public  Adaptor2d_HCurve2d  ChangeCurve() {
    return new Adaptor2d_HCurve2d ( OCCwrapJavaJNI.Adaptor3d_CurveOnSurface_ChangeCurve(swigCPtr, this), true );
  }

  public  Adaptor3d_HSurface  ChangeSurface() {
    return new Adaptor3d_HSurface ( OCCwrapJavaJNI.Adaptor3d_CurveOnSurface_ChangeSurface(swigCPtr, this), true );
  }

}
