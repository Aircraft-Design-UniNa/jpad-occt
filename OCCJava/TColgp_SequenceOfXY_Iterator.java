package opencascade;

public class TColgp_SequenceOfXY_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColgp_SequenceOfXY_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColgp_SequenceOfXY_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColgp_SequenceOfXY_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColgp_SequenceOfXY_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColgp_SequenceOfXY_Iterator(TColgp_SequenceOfXY arg0) {
    this(OCCwrapJavaJNI.new_TColgp_SequenceOfXY_Iterator(TColgp_SequenceOfXY.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TColgp_SequenceOfXY_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TColgp_SequenceOfXY_Iterator_Next(swigCPtr, this);
  }

  public  gp_XY  Value() {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_SequenceOfXY_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public gp_XY ChangeValue() {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_SequenceOfXY_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new gp_XY.CRef (ret);
  }

}
