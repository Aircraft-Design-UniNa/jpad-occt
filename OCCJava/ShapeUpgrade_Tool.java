package opencascade;

/**
 *  Tool is a root class for splitting classes
 *  Provides context for recording changes, basic
 *  precision value and limit (minimal and maximal)
 *  values for tolerances
 */
public class ShapeUpgrade_Tool extends Standard_Transient {
  ShapeUpgrade_Tool(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor
   */
  public ShapeUpgrade_Tool() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_Tool(), true);
  }

  /**
   *  Copy all fields from another Root object
   */
  public void Set( ShapeUpgrade_Tool  tool) {
    OCCwrapJavaJNI.ShapeUpgrade_Tool_Set(swigCPtr, this,  ShapeUpgrade_Tool.getCPtr(tool) , tool);
  }

  /**
   *  Sets context
   */
  public void SetContext( ShapeBuild_ReShape  context) {
    OCCwrapJavaJNI.ShapeUpgrade_Tool_SetContext(swigCPtr, this,  ShapeBuild_ReShape.getCPtr(context) , context);
  }

  public  ShapeBuild_ReShape  Context() {
    return new ShapeBuild_ReShape ( OCCwrapJavaJNI.ShapeUpgrade_Tool_Context(swigCPtr, this), true );
  }

  /**
   *  Sets basic precision value
   */
  public void SetPrecision(double preci) {
    OCCwrapJavaJNI.ShapeUpgrade_Tool_SetPrecision(swigCPtr, this, preci);
  }

  /**
   *  Returns basic precision value
   */
  public double Precision() {
    return OCCwrapJavaJNI.ShapeUpgrade_Tool_Precision(swigCPtr, this);
  }

  /**
   *  Sets minimal allowed tolerance
   */
  public void SetMinTolerance(double mintol) {
    OCCwrapJavaJNI.ShapeUpgrade_Tool_SetMinTolerance(swigCPtr, this, mintol);
  }

  /**
   *  Returns minimal allowed tolerance
   */
  public double MinTolerance() {
    return OCCwrapJavaJNI.ShapeUpgrade_Tool_MinTolerance(swigCPtr, this);
  }

  /**
   *  Sets maximal allowed tolerance
   */
  public void SetMaxTolerance(double maxtol) {
    OCCwrapJavaJNI.ShapeUpgrade_Tool_SetMaxTolerance(swigCPtr, this, maxtol);
  }

  /**
   *  Returns maximal allowed tolerance
   */
  public double MaxTolerance() {
    return OCCwrapJavaJNI.ShapeUpgrade_Tool_MaxTolerance(swigCPtr, this);
  }

  /**
   *  Returns tolerance limited by [myMinTol,myMaxTol]
   */
  public double LimitTolerance(double toler) {
    return OCCwrapJavaJNI.ShapeUpgrade_Tool_LimitTolerance(swigCPtr, this, toler);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_Tool_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_Tool_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_Tool  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_Tool ( OCCwrapJavaJNI.ShapeUpgrade_Tool_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_Tool_TypeOf(), true );
  }

}
