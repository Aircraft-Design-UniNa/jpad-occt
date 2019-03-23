package opencascade;

public class StepShape_Shell extends StepData_SelectType {

  private long swigCPtr;
  StepShape_Shell(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.StepShape_Shell_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  StepShape_Shell(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.StepShape_Shell_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(StepShape_Shell obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepShape_Shell(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Returns a Shell SelectType
   */
  public StepShape_Shell() {
    this(OCCwrapJavaJNI.new_StepShape_Shell(), true);
  }

  public  StepShape_OpenShell  OpenShell() {
    return new StepShape_OpenShell ( OCCwrapJavaJNI.StepShape_Shell_OpenShell(swigCPtr, this), true );
  }

  public  StepShape_ClosedShell  ClosedShell() {
    return new StepShape_ClosedShell ( OCCwrapJavaJNI.StepShape_Shell_ClosedShell(swigCPtr, this), true );
  }

}
