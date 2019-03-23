package opencascade;

/**
 *  Splits a surfaces of revolution, cylindrical, toroidal,
 *  conical, spherical so that each resulting segment covers
 *  not more than defined number of degrees.
 */
public class ShapeUpgrade_SplitSurfaceAngle extends ShapeUpgrade_SplitSurface {
  ShapeUpgrade_SplitSurfaceAngle(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor.
   */
  public ShapeUpgrade_SplitSurfaceAngle(double MaxAngle) {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_SplitSurfaceAngle(MaxAngle), true);
  }

  /**
   *  Set maximal angle
   */
  public void SetMaxAngle(double MaxAngle) {
    OCCwrapJavaJNI.ShapeUpgrade_SplitSurfaceAngle_SetMaxAngle(swigCPtr, this, MaxAngle);
  }

  /**
   *  Returns maximal angle
   */
  public double MaxAngle() {
    return OCCwrapJavaJNI.ShapeUpgrade_SplitSurfaceAngle_MaxAngle(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_SplitSurfaceAngle_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_SplitSurfaceAngle_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_SplitSurfaceAngle  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_SplitSurfaceAngle ( OCCwrapJavaJNI.ShapeUpgrade_SplitSurfaceAngle_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_SplitSurfaceAngle_TypeOf(), true );
  }

}
