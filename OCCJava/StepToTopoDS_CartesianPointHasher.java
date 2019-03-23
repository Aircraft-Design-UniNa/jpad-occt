package opencascade;

public class StepToTopoDS_CartesianPointHasher {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepToTopoDS_CartesianPointHasher(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepToTopoDS_CartesianPointHasher(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepToTopoDS_CartesianPointHasher obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_CartesianPointHasher(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Returns a HasCode value  for  the  CartesianPoint
   */
  public static int HashCode( StepGeom_CartesianPoint  K, int Upper) {
    return OCCwrapJavaJNI.StepToTopoDS_CartesianPointHasher_HashCode( StepGeom_CartesianPoint.getCPtr(K) , K, Upper);
  }

  /**
   *  Returns True  when the two  CartesianPoint are the same
   */
  public static long IsEqual( StepGeom_CartesianPoint  K1,  StepGeom_CartesianPoint  K2) {
    return OCCwrapJavaJNI.StepToTopoDS_CartesianPointHasher_IsEqual( StepGeom_CartesianPoint.getCPtr(K1) , K1,  StepGeom_CartesianPoint.getCPtr(K2) , K2);
  }

  public StepToTopoDS_CartesianPointHasher() {
    this(OCCwrapJavaJNI.new_StepToTopoDS_CartesianPointHasher(), true);
  }

}
