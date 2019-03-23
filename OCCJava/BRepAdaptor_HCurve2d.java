package opencascade;

public class BRepAdaptor_HCurve2d extends Adaptor2d_HCurve2d {
  BRepAdaptor_HCurve2d(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates an empty GenHCurve2d.
   */
  public BRepAdaptor_HCurve2d() {
    this(OCCwrapJavaJNI.new_BRepAdaptor_HCurve2d__SWIG_0(), true);
  }

  /**
   *  Creates a GenHCurve2d from a Curve
   */
  public BRepAdaptor_HCurve2d( BRepAdaptor_Curve2d  C) {
    this(OCCwrapJavaJNI.new_BRepAdaptor_HCurve2d__SWIG_1(BRepAdaptor_Curve2d.getCPtr(C), C), true);
  }

  /**
   *  Sets the field of the GenHCurve2d.
   */
  public void Set( BRepAdaptor_Curve2d  C) {
    OCCwrapJavaJNI.BRepAdaptor_HCurve2d_Set(swigCPtr, this, BRepAdaptor_Curve2d.getCPtr(C), C);
  }

  /**
   *  Returns the curve used to create the GenHCurve.
   */
  public  BRepAdaptor_Curve2d  ChangeCurve2d() {
    BRepAdaptor_Curve2d ret = new BRepAdaptor_Curve2d(OCCwrapJavaJNI.BRepAdaptor_HCurve2d_ChangeCurve2d(swigCPtr, this), false, this);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.BRepAdaptor_HCurve2d_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepAdaptor_HCurve2d_get_type_descriptor(), true );
  }

  public static  BRepAdaptor_HCurve2d  DownCast( Standard_Transient  T) {
    return new BRepAdaptor_HCurve2d ( OCCwrapJavaJNI.BRepAdaptor_HCurve2d_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepAdaptor_HCurve2d_TypeOf(), true );
  }

}
