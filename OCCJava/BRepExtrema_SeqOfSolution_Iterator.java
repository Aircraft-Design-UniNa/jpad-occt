package opencascade;

public class BRepExtrema_SeqOfSolution_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepExtrema_SeqOfSolution_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepExtrema_SeqOfSolution_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepExtrema_SeqOfSolution_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepExtrema_SeqOfSolution_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BRepExtrema_SeqOfSolution_Iterator(BRepExtrema_SeqOfSolution arg0) {
    this(OCCwrapJavaJNI.new_BRepExtrema_SeqOfSolution_Iterator(BRepExtrema_SeqOfSolution.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Iterator_Next(swigCPtr, this);
  }

  public  BRepExtrema_SolutionElem  Value() {
    BRepExtrema_SolutionElem ret = new BRepExtrema_SolutionElem(OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Iterator_Value(swigCPtr, this), false, this);
    return ret;
  }

  public  BRepExtrema_SolutionElem  ChangeValue() {
    BRepExtrema_SolutionElem ret = new BRepExtrema_SolutionElem(OCCwrapJavaJNI.BRepExtrema_SeqOfSolution_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret;
  }

}
