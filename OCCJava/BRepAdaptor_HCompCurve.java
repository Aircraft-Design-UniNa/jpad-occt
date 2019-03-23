package opencascade;

public class BRepAdaptor_HCompCurve extends Adaptor3d_HCurve {
  BRepAdaptor_HCompCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates an empty GenHCurve.
   */
  public BRepAdaptor_HCompCurve() {
    this(OCCwrapJavaJNI.new_BRepAdaptor_HCompCurve__SWIG_0(), true);
  }

  /**
   *  Creates a GenHCurve from a Curve
   */
  public BRepAdaptor_HCompCurve( BRepAdaptor_CompCurve  C) {
    this(OCCwrapJavaJNI.new_BRepAdaptor_HCompCurve__SWIG_1(BRepAdaptor_CompCurve.getCPtr(C), C), true);
  }

  /**
   *  Sets the field of the GenHCurve.
   */
  public void Set( BRepAdaptor_CompCurve  C) {
    OCCwrapJavaJNI.BRepAdaptor_HCompCurve_Set(swigCPtr, this, BRepAdaptor_CompCurve.getCPtr(C), C);
  }

  /**
   *  Returns the curve used to create the GenHCurve.
   */
  public  BRepAdaptor_CompCurve  ChangeCurve() {
    BRepAdaptor_CompCurve ret = new BRepAdaptor_CompCurve(OCCwrapJavaJNI.BRepAdaptor_HCompCurve_ChangeCurve(swigCPtr, this), false, this);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.BRepAdaptor_HCompCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepAdaptor_HCompCurve_get_type_descriptor(), true );
  }

  public static  BRepAdaptor_HCompCurve  DownCast( Standard_Transient  T) {
    return new BRepAdaptor_HCompCurve ( OCCwrapJavaJNI.BRepAdaptor_HCompCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepAdaptor_HCompCurve_TypeOf(), true );
  }

}
