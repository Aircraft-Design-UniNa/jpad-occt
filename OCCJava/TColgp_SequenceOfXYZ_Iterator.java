package opencascade;

public class TColgp_SequenceOfXYZ_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColgp_SequenceOfXYZ_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColgp_SequenceOfXYZ_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColgp_SequenceOfXYZ_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColgp_SequenceOfXYZ_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColgp_SequenceOfXYZ_Iterator(TColgp_SequenceOfXYZ arg0) {
    this(OCCwrapJavaJNI.new_TColgp_SequenceOfXYZ_Iterator(TColgp_SequenceOfXYZ.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Iterator_Next(swigCPtr, this);
  }

  public  gp_XYZ  Value() {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public gp_XYZ ChangeValue() {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_SequenceOfXYZ_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new gp_XYZ.CRef (ret);
  }

}
