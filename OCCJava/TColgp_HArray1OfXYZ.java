package opencascade;

public class TColgp_HArray1OfXYZ extends Standard_Transient {
  TColgp_HArray1OfXYZ(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColgp_HArray1OfXYZ(int theLower, int theUpper,  gp_XYZ  theValue) {
    this(OCCwrapJavaJNI.new_TColgp_HArray1OfXYZ__SWIG_0(theLower, theUpper, gp_XYZ.getCPtr(theValue), theValue), true);
  }

  public TColgp_HArray1OfXYZ(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColgp_HArray1OfXYZ__SWIG_1(theLower, theUpper), true);
  }

  public TColgp_HArray1OfXYZ( TColgp_Array1OfXYZ  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_HArray1OfXYZ__SWIG_2(TColgp_Array1OfXYZ.getCPtr(theOther), theOther), true);
  }

  public  TColgp_Array1OfXYZ  Array1() {
    TColgp_Array1OfXYZ ret = new TColgp_Array1OfXYZ(OCCwrapJavaJNI.TColgp_HArray1OfXYZ_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  TColgp_Array1OfXYZ  ChangeArray1() {
    TColgp_Array1OfXYZ ret = new TColgp_Array1OfXYZ(OCCwrapJavaJNI.TColgp_HArray1OfXYZ_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_HArray1OfXYZ_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_HArray1OfXYZ_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColgp_HArray1OfXYZ_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColgp_HArray1OfXYZ_Upper(swigCPtr, this);
  }

  public  gp_XYZ  Value(int theIndex) {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_HArray1OfXYZ_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public gp_XYZ ChangeValue(int theIndex) {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_HArray1OfXYZ_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new gp_XYZ.CRef (ret);
  }

  public void SetValue(int theIndex,  gp_XYZ  theItem) {
    OCCwrapJavaJNI.TColgp_HArray1OfXYZ_SetValue(swigCPtr, this, theIndex, gp_XYZ.getCPtr(theItem), theItem);
  }

  public static  TColgp_HArray1OfXYZ  DownCast( Standard_Transient  T) {
    return new TColgp_HArray1OfXYZ ( OCCwrapJavaJNI.TColgp_HArray1OfXYZ_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColgp_HArray1OfXYZ_TypeOf(), true );
  }

}
