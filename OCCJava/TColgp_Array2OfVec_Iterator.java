package opencascade;

public class TColgp_Array2OfVec_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColgp_Array2OfVec_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColgp_Array2OfVec_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColgp_Array2OfVec_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColgp_Array2OfVec_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColgp_Array2OfVec_Iterator(TColgp_Array2OfVec arg0) {
    this(OCCwrapJavaJNI.new_TColgp_Array2OfVec_Iterator(TColgp_Array2OfVec.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TColgp_Array2OfVec_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TColgp_Array2OfVec_Iterator_Next(swigCPtr, this);
  }

  public  gp_Vec  Value() {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.TColgp_Array2OfVec_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public gp_Vec ChangeValue() {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.TColgp_Array2OfVec_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new gp_Vec.CRef (ret);
  }

}