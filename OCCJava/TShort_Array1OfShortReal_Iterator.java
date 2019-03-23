package opencascade;

public class TShort_Array1OfShortReal_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TShort_Array1OfShortReal_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TShort_Array1OfShortReal_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TShort_Array1OfShortReal_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TShort_Array1OfShortReal_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TShort_Array1OfShortReal_Iterator(TShort_Array1OfShortReal arg0) {
    this(OCCwrapJavaJNI.new_TShort_Array1OfShortReal_Iterator(TShort_Array1OfShortReal.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TShort_Array1OfShortReal_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TShort_Array1OfShortReal_Iterator_Next(swigCPtr, this);
  }

  public  float  Value() { return OCCwrapJavaJNI.TShort_Array1OfShortReal_Iterator_Value(swigCPtr, this); }

  public float[] ChangeValue() {return OCCwrapJavaJNI.TShort_Array1OfShortReal_Iterator_ChangeValue(swigCPtr, this);}

}
