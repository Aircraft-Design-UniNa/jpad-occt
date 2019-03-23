package opencascade;

public class IntRes2d_SequenceOfIntersectionSegment_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntRes2d_SequenceOfIntersectionSegment_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntRes2d_SequenceOfIntersectionSegment_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntRes2d_SequenceOfIntersectionSegment_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntRes2d_SequenceOfIntersectionSegment_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntRes2d_SequenceOfIntersectionSegment_Iterator(IntRes2d_SequenceOfIntersectionSegment arg0) {
    this(OCCwrapJavaJNI.new_IntRes2d_SequenceOfIntersectionSegment_Iterator(IntRes2d_SequenceOfIntersectionSegment.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Iterator_Next(swigCPtr, this);
  }

  public  IntRes2d_IntersectionSegment  Value() {
    IntRes2d_IntersectionSegment ret = new IntRes2d_IntersectionSegment(OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public IntRes2d_IntersectionSegment ChangeValue() {
    IntRes2d_IntersectionSegment ret = new IntRes2d_IntersectionSegment(OCCwrapJavaJNI.IntRes2d_SequenceOfIntersectionSegment_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new IntRes2d_IntersectionSegment.CRef (ret);
  }

}
