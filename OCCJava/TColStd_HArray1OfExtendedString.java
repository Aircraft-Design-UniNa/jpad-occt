package opencascade;

public class TColStd_HArray1OfExtendedString extends Standard_Transient {
  TColStd_HArray1OfExtendedString(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColStd_HArray1OfExtendedString(int theLower, int theUpper,  TCollection_ExtendedString  theValue) {
    this(OCCwrapJavaJNI.new_TColStd_HArray1OfExtendedString__SWIG_0(theLower, theUpper, TCollection_ExtendedString.getCPtr(theValue), theValue), true);
  }

  public TColStd_HArray1OfExtendedString(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_HArray1OfExtendedString__SWIG_1(theLower, theUpper), true);
  }

  public TColStd_HArray1OfExtendedString( TColStd_Array1OfExtendedString  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_HArray1OfExtendedString__SWIG_2(TColStd_Array1OfExtendedString.getCPtr(theOther), theOther), true);
  }

  public  TColStd_Array1OfExtendedString  Array1() {
    TColStd_Array1OfExtendedString ret = new TColStd_Array1OfExtendedString(OCCwrapJavaJNI.TColStd_HArray1OfExtendedString_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  TColStd_Array1OfExtendedString  ChangeArray1() {
    TColStd_Array1OfExtendedString ret = new TColStd_Array1OfExtendedString(OCCwrapJavaJNI.TColStd_HArray1OfExtendedString_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_HArray1OfExtendedString_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_HArray1OfExtendedString_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_HArray1OfExtendedString_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_HArray1OfExtendedString_Upper(swigCPtr, this);
  }

  public  TCollection_ExtendedString  Value(int theIndex) {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TColStd_HArray1OfExtendedString_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public TCollection_ExtendedString ChangeValue(int theIndex) {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TColStd_HArray1OfExtendedString_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new TCollection_ExtendedString.CRef (ret);
  }

  public void SetValue(int theIndex,  TCollection_ExtendedString  theItem) {
    OCCwrapJavaJNI.TColStd_HArray1OfExtendedString_SetValue(swigCPtr, this, theIndex, TCollection_ExtendedString.getCPtr(theItem), theItem);
  }

  public static  TColStd_HArray1OfExtendedString  DownCast( Standard_Transient  T) {
    return new TColStd_HArray1OfExtendedString ( OCCwrapJavaJNI.TColStd_HArray1OfExtendedString_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColStd_HArray1OfExtendedString_TypeOf(), true );
  }

}
