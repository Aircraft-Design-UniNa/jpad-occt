package opencascade;

/**
 *  Splits a 2d curve with a criterion.
 */
public class ShapeUpgrade_SplitCurve2d extends ShapeUpgrade_SplitCurve {
  ShapeUpgrade_SplitCurve2d(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor.
   */
  public ShapeUpgrade_SplitCurve2d() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_SplitCurve2d(), true);
  }

  /**
   *  Initializes with pcurve with its first and last parameters.
   */
  public void Init( Geom2d_Curve  C) {
    OCCwrapJavaJNI.ShapeUpgrade_SplitCurve2d_Init__SWIG_0(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C);
  }

  /**
   *  Initializes with pcurve with its parameters.
   */
  public void Init( Geom2d_Curve  C, double First, double Last) {
    OCCwrapJavaJNI.ShapeUpgrade_SplitCurve2d_Init__SWIG_1(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C, First, Last);
  }

  public  TColGeom2d_HArray1OfCurve  GetCurves() {
    return new TColGeom2d_HArray1OfCurve ( OCCwrapJavaJNI.ShapeUpgrade_SplitCurve2d_GetCurves(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_SplitCurve2d_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_SplitCurve2d_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_SplitCurve2d  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_SplitCurve2d ( OCCwrapJavaJNI.ShapeUpgrade_SplitCurve2d_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_SplitCurve2d_TypeOf(), true );
  }

}
