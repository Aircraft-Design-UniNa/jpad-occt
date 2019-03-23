package opencascade;

/**
 *  Law Function based on a BSpline curve 1d.  Package
 *  methods and classes are implemented in package Law
 *  to    construct  the  basis    curve with  several
 *  constraints.
 */
public class Law_BSpFunc extends Law_Function {
  Law_BSpFunc(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public Law_BSpFunc() {
    this(OCCwrapJavaJNI.new_Law_BSpFunc__SWIG_0(), true);
  }

  public Law_BSpFunc( Law_BSpline  C, double First, double Last) {
    this(OCCwrapJavaJNI.new_Law_BSpFunc__SWIG_1( Law_BSpline.getCPtr(C) , C, First, Last), true);
  }

  public  Law_BSpline  Curve() {
    return new Law_BSpline ( OCCwrapJavaJNI.Law_BSpFunc_Curve(swigCPtr, this), true );
  }

  public void SetCurve( Law_BSpline  C) {
    OCCwrapJavaJNI.Law_BSpFunc_SetCurve(swigCPtr, this,  Law_BSpline.getCPtr(C) , C);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Law_BSpFunc_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Law_BSpFunc_get_type_descriptor(), true );
  }

  public static  Law_BSpFunc  DownCast( Standard_Transient  T) {
    return new Law_BSpFunc ( OCCwrapJavaJNI.Law_BSpFunc_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Law_BSpFunc_TypeOf(), true );
  }

}
