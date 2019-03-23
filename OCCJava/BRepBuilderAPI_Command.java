package opencascade;

/**
 *  Root class for all commands in BRepBuilderAPI.
 * 
 *  Provides :
 * 
 *  * Managements of the notDone flag.
 * 
 *  * Catching of exceptions (not implemented).
 * 
 *  * Logging (not implemented).
 */
public class BRepBuilderAPI_Command {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepBuilderAPI_Command(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepBuilderAPI_Command(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepBuilderAPI_Command obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepBuilderAPI_Command(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public long IsDone() {
    return OCCwrapJavaJNI.BRepBuilderAPI_Command_IsDone(swigCPtr, this);
  }

  /**
   *  Raises NotDone if done is false.
   */
  public void Check() {
    OCCwrapJavaJNI.BRepBuilderAPI_Command_Check(swigCPtr, this);
  }

}
