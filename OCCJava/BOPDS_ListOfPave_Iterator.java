package opencascade;

public class BOPDS_ListOfPave_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BOPDS_ListOfPave_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BOPDS_ListOfPave_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BOPDS_ListOfPave_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPDS_ListOfPave_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BOPDS_ListOfPave_Iterator(BOPDS_ListOfPave arg0) {
    this(OCCwrapJavaJNI.new_BOPDS_ListOfPave_Iterator(BOPDS_ListOfPave.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.BOPDS_ListOfPave_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.BOPDS_ListOfPave_Iterator_Next(swigCPtr, this);
  }

  public  BOPDS_Pave  Value() {
    BOPDS_Pave ret = new BOPDS_Pave(OCCwrapJavaJNI.BOPDS_ListOfPave_Iterator_Value(swigCPtr, this), false, this);
    return ret;
  }

  public  BOPDS_Pave  ChangeValue() {
    BOPDS_Pave ret = new BOPDS_Pave(OCCwrapJavaJNI.BOPDS_ListOfPave_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret;
  }

}
