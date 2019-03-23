package opencascade;

public class StepToTopoDS_PointPairHasher {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepToTopoDS_PointPairHasher(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepToTopoDS_PointPairHasher(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepToTopoDS_PointPairHasher obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_PointPairHasher(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Returns a HasCode value  for  the  PointPair
   */
  public static int HashCode( StepToTopoDS_PointPair  K, int Upper) {
    return OCCwrapJavaJNI.StepToTopoDS_PointPairHasher_HashCode(StepToTopoDS_PointPair.getCPtr(K), K, Upper);
  }

  /**
   *  Returns True  when the two  PointPair are the same
   */
  public static long IsEqual( StepToTopoDS_PointPair  K1,  StepToTopoDS_PointPair  K2) {
    return OCCwrapJavaJNI.StepToTopoDS_PointPairHasher_IsEqual(StepToTopoDS_PointPair.getCPtr(K1), K1, StepToTopoDS_PointPair.getCPtr(K2), K2);
  }

  public StepToTopoDS_PointPairHasher() {
    this(OCCwrapJavaJNI.new_StepToTopoDS_PointPairHasher(), true);
  }

}
