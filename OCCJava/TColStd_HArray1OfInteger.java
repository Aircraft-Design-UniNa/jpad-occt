package opencascade;

public class TColStd_HArray1OfInteger extends Standard_Transient {
  TColStd_HArray1OfInteger(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColStd_HArray1OfInteger(int theLower, int theUpper,  int  theValue) {
    this(OCCwrapJavaJNI.new_TColStd_HArray1OfInteger__SWIG_0(theLower, theUpper,  theValue ), true);
  }

  public TColStd_HArray1OfInteger(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_HArray1OfInteger__SWIG_1(theLower, theUpper), true);
  }

  public TColStd_HArray1OfInteger( TColStd_Array1OfInteger  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_HArray1OfInteger__SWIG_2(TColStd_Array1OfInteger.getCPtr(theOther), theOther), true);
  }

  public  TColStd_Array1OfInteger  Array1() {
    TColStd_Array1OfInteger ret = new TColStd_Array1OfInteger(OCCwrapJavaJNI.TColStd_HArray1OfInteger_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  TColStd_Array1OfInteger  ChangeArray1() {
    TColStd_Array1OfInteger ret = new TColStd_Array1OfInteger(OCCwrapJavaJNI.TColStd_HArray1OfInteger_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_HArray1OfInteger_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_HArray1OfInteger_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_HArray1OfInteger_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_HArray1OfInteger_Upper(swigCPtr, this);
  }

  public  int  Value(int theIndex) { return OCCwrapJavaJNI.TColStd_HArray1OfInteger_Value(swigCPtr, this, theIndex); }

  public int[] ChangeValue(int theIndex) {return OCCwrapJavaJNI.TColStd_HArray1OfInteger_ChangeValue(swigCPtr, this, theIndex);}

  public void SetValue(int theIndex,  int  theItem) {
    OCCwrapJavaJNI.TColStd_HArray1OfInteger_SetValue(swigCPtr, this, theIndex,  theItem );
  }

  public static  TColStd_HArray1OfInteger  DownCast( Standard_Transient  T) {
    return new TColStd_HArray1OfInteger ( OCCwrapJavaJNI.TColStd_HArray1OfInteger_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColStd_HArray1OfInteger_TypeOf(), true );
  }

}
