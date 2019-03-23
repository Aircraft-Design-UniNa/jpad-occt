package opencascade;

/**
 *  Splits a 3d curve with a criterion.
 */
public class ShapeUpgrade_SplitCurve3d extends ShapeUpgrade_SplitCurve {
  ShapeUpgrade_SplitCurve3d(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor.
   */
  public ShapeUpgrade_SplitCurve3d() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_SplitCurve3d(), true);
  }

  /**
   *  Initializes with curve with its first and last parameters.
   */
  public void Init( Geom_Curve  C) {
    OCCwrapJavaJNI.ShapeUpgrade_SplitCurve3d_Init__SWIG_0(swigCPtr, this,  Geom_Curve.getCPtr(C) , C);
  }

  /**
   *  Initializes with curve with its parameters.
   */
  public void Init( Geom_Curve  C, double First, double Last) {
    OCCwrapJavaJNI.ShapeUpgrade_SplitCurve3d_Init__SWIG_1(swigCPtr, this,  Geom_Curve.getCPtr(C) , C, First, Last);
  }

  public  TColGeom_HArray1OfCurve  GetCurves() {
    return new TColGeom_HArray1OfCurve ( OCCwrapJavaJNI.ShapeUpgrade_SplitCurve3d_GetCurves(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_SplitCurve3d_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_SplitCurve3d_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_SplitCurve3d  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_SplitCurve3d ( OCCwrapJavaJNI.ShapeUpgrade_SplitCurve3d_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_SplitCurve3d_TypeOf(), true );
  }

}
