package opencascade;

public class Law_Laws_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Law_Laws_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Law_Laws_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Law_Laws_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Law_Laws_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Law_Laws_Iterator(Law_Laws arg0) {
    this(OCCwrapJavaJNI.new_Law_Laws_Iterator(Law_Laws.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.Law_Laws_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.Law_Laws_Iterator_Next(swigCPtr, this);
  }

  public  Law_Function  Value() {
    return new Law_Function ( OCCwrapJavaJNI.Law_Laws_Iterator_Value(swigCPtr, this), true );
  }

  public  Law_Function  ChangeValue() {
    return new Law_Function ( OCCwrapJavaJNI.Law_Laws_Iterator_ChangeValue(swigCPtr, this), true );
  }

}
