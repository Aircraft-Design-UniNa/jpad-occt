package opencascade;

public class GeomAdaptor_GHCurve extends Adaptor3d_HCurve {
  GeomAdaptor_GHCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates an empty GenHCurve.
   */
  public GeomAdaptor_GHCurve() {
    this(OCCwrapJavaJNI.new_GeomAdaptor_GHCurve__SWIG_0(), true);
  }

  /**
   *  Creates a GenHCurve from a Curve
   */
  public GeomAdaptor_GHCurve( GeomAdaptor_Curve  C) {
    this(OCCwrapJavaJNI.new_GeomAdaptor_GHCurve__SWIG_1(GeomAdaptor_Curve.getCPtr(C), C), true);
  }

  /**
   *  Sets the field of the GenHCurve.
   */
  public void Set( GeomAdaptor_Curve  C) {
    OCCwrapJavaJNI.GeomAdaptor_GHCurve_Set(swigCPtr, this, GeomAdaptor_Curve.getCPtr(C), C);
  }

  /**
   *  Returns the curve used to create the GenHCurve.
   */
  public  GeomAdaptor_Curve  ChangeCurve() {
    GeomAdaptor_Curve ret = new GeomAdaptor_Curve(OCCwrapJavaJNI.GeomAdaptor_GHCurve_ChangeCurve(swigCPtr, this), false, this);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.GeomAdaptor_GHCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.GeomAdaptor_GHCurve_get_type_descriptor(), true );
  }

  public static  GeomAdaptor_GHCurve  DownCast( Standard_Transient  T) {
    return new GeomAdaptor_GHCurve ( OCCwrapJavaJNI.GeomAdaptor_GHCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.GeomAdaptor_GHCurve_TypeOf(), true );
  }

}
