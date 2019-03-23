package opencascade;

/**
 *  converts/splits a 2d curve to a list of beziers
 */
public class ShapeUpgrade_ConvertCurve2dToBezier extends ShapeUpgrade_SplitCurve2d {
  ShapeUpgrade_ConvertCurve2dToBezier(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor.
   */
  public ShapeUpgrade_ConvertCurve2dToBezier() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_ConvertCurve2dToBezier(), true);
  }

  public  TColStd_HSequenceOfReal  SplitParams() {
    return new TColStd_HSequenceOfReal ( OCCwrapJavaJNI.ShapeUpgrade_ConvertCurve2dToBezier_SplitParams(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_ConvertCurve2dToBezier_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_ConvertCurve2dToBezier_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_ConvertCurve2dToBezier  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_ConvertCurve2dToBezier ( OCCwrapJavaJNI.ShapeUpgrade_ConvertCurve2dToBezier_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_ConvertCurve2dToBezier_TypeOf(), true );
  }

}
