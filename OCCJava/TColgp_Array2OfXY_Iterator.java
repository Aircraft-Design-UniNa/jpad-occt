package opencascade;

public class TColgp_Array2OfXY_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColgp_Array2OfXY_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColgp_Array2OfXY_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColgp_Array2OfXY_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColgp_Array2OfXY_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColgp_Array2OfXY_Iterator(TColgp_Array2OfXY arg0) {
    this(OCCwrapJavaJNI.new_TColgp_Array2OfXY_Iterator(TColgp_Array2OfXY.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TColgp_Array2OfXY_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TColgp_Array2OfXY_Iterator_Next(swigCPtr, this);
  }

  public  gp_XY  Value() {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_Array2OfXY_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public gp_XY ChangeValue() {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_Array2OfXY_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new gp_XY.CRef (ret);
  }

}
