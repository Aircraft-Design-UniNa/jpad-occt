package opencascade;

public class StepGeom_Axis2Placement extends StepData_SelectType {

  private long swigCPtr;
  StepGeom_Axis2Placement(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.StepGeom_Axis2Placement_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  StepGeom_Axis2Placement(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.StepGeom_Axis2Placement_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(StepGeom_Axis2Placement obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepGeom_Axis2Placement(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Returns a Axis2Placement SelectType
   */
  public StepGeom_Axis2Placement() {
    this(OCCwrapJavaJNI.new_StepGeom_Axis2Placement(), true);
  }

  public  StepGeom_Axis2Placement2d  Axis2Placement2d() {
    return new StepGeom_Axis2Placement2d ( OCCwrapJavaJNI.StepGeom_Axis2Placement_Axis2Placement2d(swigCPtr, this), true );
  }

  public  StepGeom_Axis2Placement3d  Axis2Placement3d() {
    return new StepGeom_Axis2Placement3d ( OCCwrapJavaJNI.StepGeom_Axis2Placement_Axis2Placement3d(swigCPtr, this), true );
  }

}
