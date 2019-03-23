package opencascade;

public class TDataXtd_Array1OfTrsf_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDataXtd_Array1OfTrsf_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDataXtd_Array1OfTrsf_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDataXtd_Array1OfTrsf_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDataXtd_Array1OfTrsf_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TDataXtd_Array1OfTrsf_Iterator(TDataXtd_Array1OfTrsf arg0) {
    this(OCCwrapJavaJNI.new_TDataXtd_Array1OfTrsf_Iterator(TDataXtd_Array1OfTrsf.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_Iterator_Next(swigCPtr, this);
  }

  public  gp_Trsf  Value() {
    gp_Trsf ret = new gp_Trsf(OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public gp_Trsf ChangeValue() {
    gp_Trsf ret = new gp_Trsf(OCCwrapJavaJNI.TDataXtd_Array1OfTrsf_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new gp_Trsf.CRef (ret);
  }

}
