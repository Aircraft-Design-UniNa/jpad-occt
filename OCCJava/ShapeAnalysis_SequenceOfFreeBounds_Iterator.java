package opencascade;

public class ShapeAnalysis_SequenceOfFreeBounds_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeAnalysis_SequenceOfFreeBounds_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeAnalysis_SequenceOfFreeBounds_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeAnalysis_SequenceOfFreeBounds_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeAnalysis_SequenceOfFreeBounds_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ShapeAnalysis_SequenceOfFreeBounds_Iterator(ShapeAnalysis_SequenceOfFreeBounds arg0) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_SequenceOfFreeBounds_Iterator(ShapeAnalysis_SequenceOfFreeBounds.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Iterator_Next(swigCPtr, this);
  }

  public  ShapeAnalysis_FreeBoundData  Value() {
    return new ShapeAnalysis_FreeBoundData ( OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Iterator_Value(swigCPtr, this), true );
  }

  public  ShapeAnalysis_FreeBoundData  ChangeValue() {
    return new ShapeAnalysis_FreeBoundData ( OCCwrapJavaJNI.ShapeAnalysis_SequenceOfFreeBounds_Iterator_ChangeValue(swigCPtr, this), true );
  }

}
