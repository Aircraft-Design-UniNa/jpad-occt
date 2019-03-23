package opencascade;

/**
 *  Stores a pair of Points from step
 */
public class StepToTopoDS_PointPair {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepToTopoDS_PointPair(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepToTopoDS_PointPair(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepToTopoDS_PointPair obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_PointPair(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepToTopoDS_PointPair( StepGeom_CartesianPoint  P1,  StepGeom_CartesianPoint  P2) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_PointPair( StepGeom_CartesianPoint.getCPtr(P1) , P1,  StepGeom_CartesianPoint.getCPtr(P2) , P2), true);
  }

}
