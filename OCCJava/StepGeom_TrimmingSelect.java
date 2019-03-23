package opencascade;

public class StepGeom_TrimmingSelect extends StepData_SelectType {

  private long swigCPtr;
  StepGeom_TrimmingSelect(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.StepGeom_TrimmingSelect_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  StepGeom_TrimmingSelect(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.StepGeom_TrimmingSelect_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(StepGeom_TrimmingSelect obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepGeom_TrimmingSelect(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Returns a TrimmingSelect SelectType
   */
  public StepGeom_TrimmingSelect() {
    this(OCCwrapJavaJNI.new_StepGeom_TrimmingSelect(), true);
  }

  public  StepGeom_CartesianPoint  CartesianPoint() {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_TrimmingSelect_CartesianPoint(swigCPtr, this), true );
  }

  /**
   *  sets the ParameterValue as Real
   */
  public void SetParameterValue(double aParameterValue) {
    OCCwrapJavaJNI.StepGeom_TrimmingSelect_SetParameterValue(swigCPtr, this, aParameterValue);
  }

  /**
   *  returns Value as a Real (0.0 if not a Real)
   */
  public double ParameterValue() {
    return OCCwrapJavaJNI.StepGeom_TrimmingSelect_ParameterValue(swigCPtr, this);
  }

}
