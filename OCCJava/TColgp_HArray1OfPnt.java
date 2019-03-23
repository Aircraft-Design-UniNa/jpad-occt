package opencascade;

public class TColgp_HArray1OfPnt extends Standard_Transient {
  TColgp_HArray1OfPnt(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColgp_HArray1OfPnt(int theLower, int theUpper,  gp_Pnt  theValue) {
    this(OCCwrapJavaJNI.new_TColgp_HArray1OfPnt__SWIG_0(theLower, theUpper, gp_Pnt.getCPtr(theValue), theValue), true);
  }

  public TColgp_HArray1OfPnt(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColgp_HArray1OfPnt__SWIG_1(theLower, theUpper), true);
  }

  public TColgp_HArray1OfPnt( TColgp_Array1OfPnt  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_HArray1OfPnt__SWIG_2(TColgp_Array1OfPnt.getCPtr(theOther), theOther), true);
  }

  public  TColgp_Array1OfPnt  Array1() {
    TColgp_Array1OfPnt ret = new TColgp_Array1OfPnt(OCCwrapJavaJNI.TColgp_HArray1OfPnt_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  TColgp_Array1OfPnt  ChangeArray1() {
    TColgp_Array1OfPnt ret = new TColgp_Array1OfPnt(OCCwrapJavaJNI.TColgp_HArray1OfPnt_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_HArray1OfPnt_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_HArray1OfPnt_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColgp_HArray1OfPnt_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColgp_HArray1OfPnt_Upper(swigCPtr, this);
  }

  public  gp_Pnt  Value(int theIndex) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_HArray1OfPnt_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public gp_Pnt ChangeValue(int theIndex) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_HArray1OfPnt_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new gp_Pnt.CRef (ret);
  }

  public void SetValue(int theIndex,  gp_Pnt  theItem) {
    OCCwrapJavaJNI.TColgp_HArray1OfPnt_SetValue(swigCPtr, this, theIndex, gp_Pnt.getCPtr(theItem), theItem);
  }

  public static  TColgp_HArray1OfPnt  DownCast( Standard_Transient  T) {
    return new TColgp_HArray1OfPnt ( OCCwrapJavaJNI.TColgp_HArray1OfPnt_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColgp_HArray1OfPnt_TypeOf(), true );
  }

}
