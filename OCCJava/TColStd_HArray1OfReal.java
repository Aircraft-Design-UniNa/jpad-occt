package opencascade;

public class TColStd_HArray1OfReal extends Standard_Transient {
  TColStd_HArray1OfReal(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColStd_HArray1OfReal(int theLower, int theUpper,  double  theValue) {
    this(OCCwrapJavaJNI.new_TColStd_HArray1OfReal__SWIG_0(theLower, theUpper,  theValue ), true);
  }

  public TColStd_HArray1OfReal(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColStd_HArray1OfReal__SWIG_1(theLower, theUpper), true);
  }

  public TColStd_HArray1OfReal( TColStd_Array1OfReal  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_HArray1OfReal__SWIG_2(TColStd_Array1OfReal.getCPtr(theOther), theOther), true);
  }

  public  TColStd_Array1OfReal  Array1() {
    TColStd_Array1OfReal ret = new TColStd_Array1OfReal(OCCwrapJavaJNI.TColStd_HArray1OfReal_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  TColStd_Array1OfReal  ChangeArray1() {
    TColStd_Array1OfReal ret = new TColStd_Array1OfReal(OCCwrapJavaJNI.TColStd_HArray1OfReal_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_HArray1OfReal_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_HArray1OfReal_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColStd_HArray1OfReal_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColStd_HArray1OfReal_Upper(swigCPtr, this);
  }

  public  double  Value(int theIndex) { return OCCwrapJavaJNI.TColStd_HArray1OfReal_Value(swigCPtr, this, theIndex); }

  public double[] ChangeValue(int theIndex) {return OCCwrapJavaJNI.TColStd_HArray1OfReal_ChangeValue(swigCPtr, this, theIndex);}

  public void SetValue(int theIndex,  double  theItem) {
    OCCwrapJavaJNI.TColStd_HArray1OfReal_SetValue(swigCPtr, this, theIndex,  theItem );
  }

  public static  TColStd_HArray1OfReal  DownCast( Standard_Transient  T) {
    return new TColStd_HArray1OfReal ( OCCwrapJavaJNI.TColStd_HArray1OfReal_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColStd_HArray1OfReal_TypeOf(), true );
  }

}
