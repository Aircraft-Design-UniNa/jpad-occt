package opencascade;

public class TColStd_Array1OfTransient {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_Array1OfTransient(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_Array1OfTransient(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_Array1OfTransient obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_Array1OfTransient(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_Array1OfTransient() {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfTransient__SWIG_0(), true);
  }

  public TColStd_Array1OfTransient(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfTransient__SWIG_1(theLower, theUpper), true);
  }

  public TColStd_Array1OfTransient( TColStd_Array1OfTransient  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfTransient__SWIG_2(TColStd_Array1OfTransient.getCPtr(theOther), theOther), true);
  }

  public TColStd_Array1OfTransient( Standard_Transient  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array1OfTransient__SWIG_4( Standard_Transient.getCPtr(theBegin) , theBegin, theLower, theUpper), true);
  }

  public void Init( Standard_Transient  theValue) {
    OCCwrapJavaJNI.TColStd_Array1OfTransient_Init(swigCPtr, this,  Standard_Transient.getCPtr(theValue) , theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_Array1OfTransient_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_Array1OfTransient_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_Array1OfTransient_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_Array1OfTransient_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_Array1OfTransient_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColStd_Array1OfTransient_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.TColStd_Array1OfTransient_IsAllocated(swigCPtr, this);
  }

  public  TColStd_Array1OfTransient  Assign( TColStd_Array1OfTransient  theOther) {
    TColStd_Array1OfTransient ret = new TColStd_Array1OfTransient(OCCwrapJavaJNI.TColStd_Array1OfTransient_Assign(swigCPtr, this, TColStd_Array1OfTransient.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TColStd_Array1OfTransient  Move( TColStd_Array1OfTransient  theOther) {
    TColStd_Array1OfTransient ret = new TColStd_Array1OfTransient(OCCwrapJavaJNI.TColStd_Array1OfTransient_Move(swigCPtr, this, TColStd_Array1OfTransient.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  Standard_Transient  First() {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_Array1OfTransient_First(swigCPtr, this), true );
  }

  public  Standard_Transient  ChangeFirst() {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_Array1OfTransient_ChangeFirst(swigCPtr, this), true );
  }

  public  Standard_Transient  Last() {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_Array1OfTransient_Last(swigCPtr, this), true );
  }

  public  Standard_Transient  ChangeLast() {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_Array1OfTransient_ChangeLast(swigCPtr, this), true );
  }

  public  Standard_Transient  Value(int theIndex) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_Array1OfTransient_Value(swigCPtr, this, theIndex), true );
  }

  public  Standard_Transient  ChangeValue(int theIndex) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_Array1OfTransient_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  Standard_Transient  theItem) {
    OCCwrapJavaJNI.TColStd_Array1OfTransient_SetValue(swigCPtr, this, theIndex,  Standard_Transient.getCPtr(theItem) , theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.TColStd_Array1OfTransient_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
