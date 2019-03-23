package opencascade;

public class BOPDS_MapOfPaveBlock_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BOPDS_MapOfPaveBlock_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BOPDS_MapOfPaveBlock_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BOPDS_MapOfPaveBlock_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPDS_MapOfPaveBlock_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BOPDS_MapOfPaveBlock_Iterator(BOPDS_MapOfPaveBlock arg0) {
    this(OCCwrapJavaJNI.new_BOPDS_MapOfPaveBlock_Iterator(BOPDS_MapOfPaveBlock.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Iterator_Next(swigCPtr, this);
  }

  public  BOPDS_PaveBlock  Value() {
    return new BOPDS_PaveBlock ( OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Iterator_Value(swigCPtr, this), true );
  }

  public  BOPDS_PaveBlock  ChangeValue() {
    return new BOPDS_PaveBlock ( OCCwrapJavaJNI.BOPDS_MapOfPaveBlock_Iterator_ChangeValue(swigCPtr, this), true );
  }

}
