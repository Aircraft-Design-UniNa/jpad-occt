package opencascade;

public class TColStd_HArray1OfTransient extends Standard_Transient {
  TColStd_HArray1OfTransient(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColStd_HArray1OfTransient(int theLower, int theUpper,  Standard_Transient  theValue) {
    this(OCCwrapJavaJNI.new_TColStd_HArray1OfTransient__SWIG_0(theLower, theUpper,  Standard_Transient.getCPtr(theValue) , theValue), true);
  }

  public TColStd_HArray1OfTransient(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_HArray1OfTransient__SWIG_1(theLower, theUpper), true);
  }

  public TColStd_HArray1OfTransient( TColStd_Array1OfTransient  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_HArray1OfTransient__SWIG_2(TColStd_Array1OfTransient.getCPtr(theOther), theOther), true);
  }

  public  TColStd_Array1OfTransient  Array1() {
    TColStd_Array1OfTransient ret = new TColStd_Array1OfTransient(OCCwrapJavaJNI.TColStd_HArray1OfTransient_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  TColStd_Array1OfTransient  ChangeArray1() {
    TColStd_Array1OfTransient ret = new TColStd_Array1OfTransient(OCCwrapJavaJNI.TColStd_HArray1OfTransient_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_HArray1OfTransient_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_HArray1OfTransient_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_HArray1OfTransient_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_HArray1OfTransient_Upper(swigCPtr, this);
  }

  public  Standard_Transient  Value(int theIndex) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_HArray1OfTransient_Value(swigCPtr, this, theIndex), true );
  }

  public  Standard_Transient  ChangeValue(int theIndex) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_HArray1OfTransient_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  Standard_Transient  theItem) {
    OCCwrapJavaJNI.TColStd_HArray1OfTransient_SetValue(swigCPtr, this, theIndex,  Standard_Transient.getCPtr(theItem) , theItem);
  }

  public static  TColStd_HArray1OfTransient  DownCast( Standard_Transient  T) {
    return new TColStd_HArray1OfTransient ( OCCwrapJavaJNI.TColStd_HArray1OfTransient_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColStd_HArray1OfTransient_TypeOf(), true );
  }

}
