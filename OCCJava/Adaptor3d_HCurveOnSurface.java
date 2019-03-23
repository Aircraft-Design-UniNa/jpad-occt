package opencascade;

public class Adaptor3d_HCurveOnSurface extends Adaptor3d_HCurve {
  Adaptor3d_HCurveOnSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates an empty GenHCurve.
   */
  public Adaptor3d_HCurveOnSurface() {
    this(OCCwrapJavaJNI.new_Adaptor3d_HCurveOnSurface__SWIG_0(), true);
  }

  /**
   *  Creates a GenHCurve from a Curve
   */
  public Adaptor3d_HCurveOnSurface( Adaptor3d_CurveOnSurface  C) {
    this(OCCwrapJavaJNI.new_Adaptor3d_HCurveOnSurface__SWIG_1(Adaptor3d_CurveOnSurface.getCPtr(C), C), true);
  }

  /**
   *  Sets the field of the GenHCurve.
   */
  public void Set( Adaptor3d_CurveOnSurface  C) {
    OCCwrapJavaJNI.Adaptor3d_HCurveOnSurface_Set(swigCPtr, this, Adaptor3d_CurveOnSurface.getCPtr(C), C);
  }

  /**
   *  Returns the curve used to create the GenHCurve.
   */
  public  Adaptor3d_CurveOnSurface  ChangeCurve() {
    Adaptor3d_CurveOnSurface ret = new Adaptor3d_CurveOnSurface(OCCwrapJavaJNI.Adaptor3d_HCurveOnSurface_ChangeCurve(swigCPtr, this), false, this);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Adaptor3d_HCurveOnSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Adaptor3d_HCurveOnSurface_get_type_descriptor(), true );
  }

  public static  Adaptor3d_HCurveOnSurface  DownCast( Standard_Transient  T) {
    return new Adaptor3d_HCurveOnSurface ( OCCwrapJavaJNI.Adaptor3d_HCurveOnSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Adaptor3d_HCurveOnSurface_TypeOf(), true );
  }

}
