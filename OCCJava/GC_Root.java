package opencascade;

/**
 *  This class implements the common services for
 *  all classes of gce which report error.
 */
public class GC_Root {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GC_Root(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GC_Root(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GC_Root obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GC_Root(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Returns true if the construction is successful.
   */
  public long IsDone() {
    return OCCwrapJavaJNI.GC_Root_IsDone(swigCPtr, this);
  }

  /**
   *  Returns the status of the construction:
   *  -   gce_Done, if the construction is successful, or
   *  -   another value of the gce_ErrorType enumeration
   *  indicating why the construction failed.
   */
  public gce_ErrorType Status() {
    return gce_ErrorType.swigToEnum(OCCwrapJavaJNI.GC_Root_Status(swigCPtr, this));
  }

  public GC_Root() {
    this(OCCwrapJavaJNI.new_GC_Root(), true);
  }

}
