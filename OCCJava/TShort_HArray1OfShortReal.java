package opencascade;

public class TShort_HArray1OfShortReal extends Standard_Transient {
  TShort_HArray1OfShortReal(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TShort_HArray1OfShortReal(int theLower, int theUpper,  float  theValue) {
    this(OCCwrapJavaJNI.new_TShort_HArray1OfShortReal__SWIG_0(theLower, theUpper,  theValue ), true);
  }

  public TShort_HArray1OfShortReal(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TShort_HArray1OfShortReal__SWIG_1(theLower, theUpper), true);
  }

  public TShort_HArray1OfShortReal( TShort_Array1OfShortReal  theOther) {
    this(OCCwrapJavaJNI.new_TShort_HArray1OfShortReal__SWIG_2(TShort_Array1OfShortReal.getCPtr(theOther), theOther), true);
  }

  public  TShort_Array1OfShortReal  Array1() {
    TShort_Array1OfShortReal ret = new TShort_Array1OfShortReal(OCCwrapJavaJNI.TShort_HArray1OfShortReal_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  TShort_Array1OfShortReal  ChangeArray1() {
    TShort_Array1OfShortReal ret = new TShort_Array1OfShortReal(OCCwrapJavaJNI.TShort_HArray1OfShortReal_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TShort_HArray1OfShortReal_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TShort_HArray1OfShortReal_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TShort_HArray1OfShortReal_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TShort_HArray1OfShortReal_Upper(swigCPtr, this);
  }

  public  float  Value(int theIndex) { return OCCwrapJavaJNI.TShort_HArray1OfShortReal_Value(swigCPtr, this, theIndex); }

  public float[] ChangeValue(int theIndex) {return OCCwrapJavaJNI.TShort_HArray1OfShortReal_ChangeValue(swigCPtr, this, theIndex);}

  public void SetValue(int theIndex,  float  theItem) {
    OCCwrapJavaJNI.TShort_HArray1OfShortReal_SetValue(swigCPtr, this, theIndex,  theItem );
  }

  public static  TShort_HArray1OfShortReal  DownCast( Standard_Transient  T) {
    return new TShort_HArray1OfShortReal ( OCCwrapJavaJNI.TShort_HArray1OfShortReal_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TShort_HArray1OfShortReal_TypeOf(), true );
  }

}
