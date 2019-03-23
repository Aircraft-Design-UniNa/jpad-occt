package opencascade;

public class TColgp_HArray1OfVec extends Standard_Transient {
  TColgp_HArray1OfVec(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColgp_HArray1OfVec(int theLower, int theUpper,  gp_Vec  theValue) {
    this(OCCwrapJavaJNI.new_TColgp_HArray1OfVec__SWIG_0(theLower, theUpper, gp_Vec.getCPtr(theValue), theValue), true);
  }

  public TColgp_HArray1OfVec(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColgp_HArray1OfVec__SWIG_1(theLower, theUpper), true);
  }

  public TColgp_HArray1OfVec( TColgp_Array1OfVec  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_HArray1OfVec__SWIG_2(TColgp_Array1OfVec.getCPtr(theOther), theOther), true);
  }

  public  TColgp_Array1OfVec  Array1() {
    TColgp_Array1OfVec ret = new TColgp_Array1OfVec(OCCwrapJavaJNI.TColgp_HArray1OfVec_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  TColgp_Array1OfVec  ChangeArray1() {
    TColgp_Array1OfVec ret = new TColgp_Array1OfVec(OCCwrapJavaJNI.TColgp_HArray1OfVec_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_HArray1OfVec_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_HArray1OfVec_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColgp_HArray1OfVec_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColgp_HArray1OfVec_Upper(swigCPtr, this);
  }

  public  gp_Vec  Value(int theIndex) {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.TColgp_HArray1OfVec_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public gp_Vec ChangeValue(int theIndex) {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.TColgp_HArray1OfVec_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new gp_Vec.CRef (ret);
  }

  public void SetValue(int theIndex,  gp_Vec  theItem) {
    OCCwrapJavaJNI.TColgp_HArray1OfVec_SetValue(swigCPtr, this, theIndex, gp_Vec.getCPtr(theItem), theItem);
  }

  public static  TColgp_HArray1OfVec  DownCast( Standard_Transient  T) {
    return new TColgp_HArray1OfVec ( OCCwrapJavaJNI.TColgp_HArray1OfVec_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColgp_HArray1OfVec_TypeOf(), true );
  }

}
