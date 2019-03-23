package opencascade;

public class TColStd_HArray1OfListOfInteger extends Standard_Transient {
  TColStd_HArray1OfListOfInteger(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColStd_HArray1OfListOfInteger(int theLower, int theUpper,  TColStd_ListOfInteger  theValue) {
    this(OCCwrapJavaJNI.new_TColStd_HArray1OfListOfInteger__SWIG_0(theLower, theUpper, TColStd_ListOfInteger.getCPtr(theValue), theValue), true);
  }

  public TColStd_HArray1OfListOfInteger(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_HArray1OfListOfInteger__SWIG_1(theLower, theUpper), true);
  }

  public TColStd_HArray1OfListOfInteger( TColStd_Array1OfListOfInteger  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_HArray1OfListOfInteger__SWIG_2(TColStd_Array1OfListOfInteger.getCPtr(theOther), theOther), true);
  }

  public  TColStd_Array1OfListOfInteger  Array1() {
    TColStd_Array1OfListOfInteger ret = new TColStd_Array1OfListOfInteger(OCCwrapJavaJNI.TColStd_HArray1OfListOfInteger_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  TColStd_Array1OfListOfInteger  ChangeArray1() {
    TColStd_Array1OfListOfInteger ret = new TColStd_Array1OfListOfInteger(OCCwrapJavaJNI.TColStd_HArray1OfListOfInteger_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_HArray1OfListOfInteger_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_HArray1OfListOfInteger_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_HArray1OfListOfInteger_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_HArray1OfListOfInteger_Upper(swigCPtr, this);
  }

  public  TColStd_ListOfInteger  Value(int theIndex) {
    TColStd_ListOfInteger ret = new TColStd_ListOfInteger(OCCwrapJavaJNI.TColStd_HArray1OfListOfInteger_Value(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public  TColStd_ListOfInteger  ChangeValue(int theIndex) {
    TColStd_ListOfInteger ret = new TColStd_ListOfInteger(OCCwrapJavaJNI.TColStd_HArray1OfListOfInteger_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public void SetValue(int theIndex,  TColStd_ListOfInteger  theItem) {
    OCCwrapJavaJNI.TColStd_HArray1OfListOfInteger_SetValue(swigCPtr, this, theIndex, TColStd_ListOfInteger.getCPtr(theItem), theItem);
  }

  public static  TColStd_HArray1OfListOfInteger  DownCast( Standard_Transient  T) {
    return new TColStd_HArray1OfListOfInteger ( OCCwrapJavaJNI.TColStd_HArray1OfListOfInteger_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColStd_HArray1OfListOfInteger_TypeOf(), true );
  }

}
