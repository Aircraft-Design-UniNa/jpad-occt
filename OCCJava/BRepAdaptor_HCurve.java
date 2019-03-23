package opencascade;

public class BRepAdaptor_HCurve extends Adaptor3d_HCurve {
  BRepAdaptor_HCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates an empty GenHCurve.
   */
  public BRepAdaptor_HCurve() {
    this(OCCwrapJavaJNI.new_BRepAdaptor_HCurve__SWIG_0(), true);
  }

  /**
   *  Creates a GenHCurve from a Curve
   */
  public BRepAdaptor_HCurve( BRepAdaptor_Curve  C) {
    this(OCCwrapJavaJNI.new_BRepAdaptor_HCurve__SWIG_1(BRepAdaptor_Curve.getCPtr(C), C), true);
  }

  /**
   *  Sets the field of the GenHCurve.
   */
  public void Set( BRepAdaptor_Curve  C) {
    OCCwrapJavaJNI.BRepAdaptor_HCurve_Set(swigCPtr, this, BRepAdaptor_Curve.getCPtr(C), C);
  }

  /**
   *  Returns the curve used to create the GenHCurve.
   */
  public  BRepAdaptor_Curve  ChangeCurve() {
    BRepAdaptor_Curve ret = new BRepAdaptor_Curve(OCCwrapJavaJNI.BRepAdaptor_HCurve_ChangeCurve(swigCPtr, this), false, this);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.BRepAdaptor_HCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepAdaptor_HCurve_get_type_descriptor(), true );
  }

  public static  BRepAdaptor_HCurve  DownCast( Standard_Transient  T) {
    return new BRepAdaptor_HCurve ( OCCwrapJavaJNI.BRepAdaptor_HCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepAdaptor_HCurve_TypeOf(), true );
  }

}
