package opencascade;

public class TColStd_HArray1OfAsciiString extends Standard_Transient {
  TColStd_HArray1OfAsciiString(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColStd_HArray1OfAsciiString(int theLower, int theUpper,  TCollection_AsciiString  theValue) {
    this(OCCwrapJavaJNI.new_TColStd_HArray1OfAsciiString__SWIG_0(theLower, theUpper, TCollection_AsciiString.getCPtr(theValue), theValue), true);
  }

  public TColStd_HArray1OfAsciiString(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_HArray1OfAsciiString__SWIG_1(theLower, theUpper), true);
  }

  public TColStd_HArray1OfAsciiString( TColStd_Array1OfAsciiString  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_HArray1OfAsciiString__SWIG_2(TColStd_Array1OfAsciiString.getCPtr(theOther), theOther), true);
  }

  public  TColStd_Array1OfAsciiString  Array1() {
    TColStd_Array1OfAsciiString ret = new TColStd_Array1OfAsciiString(OCCwrapJavaJNI.TColStd_HArray1OfAsciiString_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  TColStd_Array1OfAsciiString  ChangeArray1() {
    TColStd_Array1OfAsciiString ret = new TColStd_Array1OfAsciiString(OCCwrapJavaJNI.TColStd_HArray1OfAsciiString_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_HArray1OfAsciiString_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_HArray1OfAsciiString_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_HArray1OfAsciiString_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_HArray1OfAsciiString_Upper(swigCPtr, this);
  }

  public  TCollection_AsciiString  Value(int theIndex) {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TColStd_HArray1OfAsciiString_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public TCollection_AsciiString ChangeValue(int theIndex) {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TColStd_HArray1OfAsciiString_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new TCollection_AsciiString.CRef (ret);
  }

  public void SetValue(int theIndex,  TCollection_AsciiString  theItem) {
    OCCwrapJavaJNI.TColStd_HArray1OfAsciiString_SetValue(swigCPtr, this, theIndex, TCollection_AsciiString.getCPtr(theItem), theItem);
  }

  public static  TColStd_HArray1OfAsciiString  DownCast( Standard_Transient  T) {
    return new TColStd_HArray1OfAsciiString ( OCCwrapJavaJNI.TColStd_HArray1OfAsciiString_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColStd_HArray1OfAsciiString_TypeOf(), true );
  }

}
