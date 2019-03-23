package opencascade;

public class TColStd_ListOfInteger_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_ListOfInteger_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_ListOfInteger_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_ListOfInteger_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_ListOfInteger_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_ListOfInteger_Iterator(TColStd_ListOfInteger arg0) {
    this(OCCwrapJavaJNI.new_TColStd_ListOfInteger_Iterator(TColStd_ListOfInteger.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TColStd_ListOfInteger_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TColStd_ListOfInteger_Iterator_Next(swigCPtr, this);
  }

  public  int  Value() { return OCCwrapJavaJNI.TColStd_ListOfInteger_Iterator_Value(swigCPtr, this); }

  public int[] ChangeValue() {return OCCwrapJavaJNI.TColStd_ListOfInteger_Iterator_ChangeValue(swigCPtr, this);}

}
