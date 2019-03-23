package opencascade;

/**
 *  Splits a  curve with a  criterion.
 */
public class ShapeUpgrade_SplitCurve extends Standard_Transient {
  ShapeUpgrade_SplitCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor.
   */
  public ShapeUpgrade_SplitCurve() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_SplitCurve(), true);
  }

  /**
   *  Initializes with curve first and last parameters.
   */
  public void Init(double First, double Last) {
    OCCwrapJavaJNI.ShapeUpgrade_SplitCurve_Init(swigCPtr, this, First, Last);
  }

  /**
   *  Sets the parameters where splitting has to be done.
   */
  public void SetSplitValues( TColStd_HSequenceOfReal  SplitValues) {
    OCCwrapJavaJNI.ShapeUpgrade_SplitCurve_SetSplitValues(swigCPtr, this,  TColStd_HSequenceOfReal.getCPtr(SplitValues) , SplitValues);
  }

  /**
   *  If Segment is True, the result is composed with
   *  segments of the curve bounded by the SplitValues.  If
   *  Segment is False, the result is composed with trimmed
   *  Curves all based on the same complete curve.
   */
  public void Build(long Segment) {
    OCCwrapJavaJNI.ShapeUpgrade_SplitCurve_Build(swigCPtr, this, Segment);
  }

  public  TColStd_HSequenceOfReal  SplitValues() {
    return new TColStd_HSequenceOfReal ( OCCwrapJavaJNI.ShapeUpgrade_SplitCurve_SplitValues(swigCPtr, this), true );
  }

  /**
   *  Calculates points for correction/splitting of the curve
   */
  public void Compute() {
    OCCwrapJavaJNI.ShapeUpgrade_SplitCurve_Compute(swigCPtr, this);
  }

  /**
   *  Performs correction/splitting of the curve.
   *  First defines splitting values by method Compute(), then calls method Build().
   */
  public void Perform(long Segment) {
    OCCwrapJavaJNI.ShapeUpgrade_SplitCurve_Perform__SWIG_0(swigCPtr, this, Segment);
  }

  public void Perform() {
    OCCwrapJavaJNI.ShapeUpgrade_SplitCurve_Perform__SWIG_1(swigCPtr, this);
  }

  /**
   *  Returns the status
   *  OK    - no splitting is needed
   *  DONE1 - splitting required and gives more than one segment
   *  DONE2 - splitting is required, but gives only one segment (initial)
   *  DONE3 - geometric form of the curve or parametrisation is modified
   */
  public long Status(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeUpgrade_SplitCurve_Status(swigCPtr, this, status.swigValue());
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_SplitCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_SplitCurve_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_SplitCurve  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_SplitCurve ( OCCwrapJavaJNI.ShapeUpgrade_SplitCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_SplitCurve_TypeOf(), true );
  }

}
