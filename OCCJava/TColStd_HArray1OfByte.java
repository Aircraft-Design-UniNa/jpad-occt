package opencascade;

public class TColStd_HArray1OfByte extends Standard_Transient {
  TColStd_HArray1OfByte(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColStd_HArray1OfByte(int theLower, int theUpper,  short  theValue) {
    this(OCCwrapJavaJNI.new_TColStd_HArray1OfByte__SWIG_0(theLower, theUpper,  theValue ), true);
  }

  public TColStd_HArray1OfByte(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_HArray1OfByte__SWIG_1(theLower, theUpper), true);
  }

  public TColStd_HArray1OfByte( TColStd_Array1OfByte  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_HArray1OfByte__SWIG_2(TColStd_Array1OfByte.getCPtr(theOther), theOther), true);
  }

  public  TColStd_Array1OfByte  Array1() {
    TColStd_Array1OfByte ret = new TColStd_Array1OfByte(OCCwrapJavaJNI.TColStd_HArray1OfByte_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  TColStd_Array1OfByte  ChangeArray1() {
    TColStd_Array1OfByte ret = new TColStd_Array1OfByte(OCCwrapJavaJNI.TColStd_HArray1OfByte_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_HArray1OfByte_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_HArray1OfByte_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_HArray1OfByte_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_HArray1OfByte_Upper(swigCPtr, this);
  }

  public  short  Value(int theIndex) { return OCCwrapJavaJNI.TColStd_HArray1OfByte_Value(swigCPtr, this, theIndex); }

  public short[] ChangeValue(int theIndex) {return OCCwrapJavaJNI.TColStd_HArray1OfByte_ChangeValue(swigCPtr, this, theIndex);}

  public void SetValue(int theIndex,  short  theItem) {
    OCCwrapJavaJNI.TColStd_HArray1OfByte_SetValue(swigCPtr, this, theIndex,  theItem );
  }

  public static  TColStd_HArray1OfByte  DownCast( Standard_Transient  T) {
    return new TColStd_HArray1OfByte ( OCCwrapJavaJNI.TColStd_HArray1OfByte_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColStd_HArray1OfByte_TypeOf(), true );
  }

}
