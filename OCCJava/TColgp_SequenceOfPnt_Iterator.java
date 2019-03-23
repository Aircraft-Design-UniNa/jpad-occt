package opencascade;

public class TColgp_SequenceOfPnt_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColgp_SequenceOfPnt_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColgp_SequenceOfPnt_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColgp_SequenceOfPnt_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColgp_SequenceOfPnt_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColgp_SequenceOfPnt_Iterator(TColgp_SequenceOfPnt arg0) {
    this(OCCwrapJavaJNI.new_TColgp_SequenceOfPnt_Iterator(TColgp_SequenceOfPnt.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TColgp_SequenceOfPnt_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TColgp_SequenceOfPnt_Iterator_Next(swigCPtr, this);
  }

  public  gp_Pnt  Value() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_SequenceOfPnt_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public gp_Pnt ChangeValue() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_SequenceOfPnt_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new gp_Pnt.CRef (ret);
  }

}
