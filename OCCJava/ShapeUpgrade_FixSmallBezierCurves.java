package opencascade;

public class ShapeUpgrade_FixSmallBezierCurves extends ShapeUpgrade_FixSmallCurves {
  ShapeUpgrade_FixSmallBezierCurves(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public ShapeUpgrade_FixSmallBezierCurves() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_FixSmallBezierCurves(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_FixSmallBezierCurves_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_FixSmallBezierCurves_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_FixSmallBezierCurves  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_FixSmallBezierCurves ( OCCwrapJavaJNI.ShapeUpgrade_FixSmallBezierCurves_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_FixSmallBezierCurves_TypeOf(), true );
  }

}
