package opencascade;

public class TColgp_HArray1OfXY extends Standard_Transient {
  TColgp_HArray1OfXY(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColgp_HArray1OfXY(int theLower, int theUpper,  gp_XY  theValue) {
    this(OCCwrapJavaJNI.new_TColgp_HArray1OfXY__SWIG_0(theLower, theUpper, gp_XY.getCPtr(theValue), theValue), true);
  }

  public TColgp_HArray1OfXY(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColgp_HArray1OfXY__SWIG_1(theLower, theUpper), true);
  }

  public TColgp_HArray1OfXY( TColgp_Array1OfXY  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_HArray1OfXY__SWIG_2(TColgp_Array1OfXY.getCPtr(theOther), theOther), true);
  }

  public  TColgp_Array1OfXY  Array1() {
    TColgp_Array1OfXY ret = new TColgp_Array1OfXY(OCCwrapJavaJNI.TColgp_HArray1OfXY_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  TColgp_Array1OfXY  ChangeArray1() {
    TColgp_Array1OfXY ret = new TColgp_Array1OfXY(OCCwrapJavaJNI.TColgp_HArray1OfXY_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_HArray1OfXY_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_HArray1OfXY_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColgp_HArray1OfXY_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColgp_HArray1OfXY_Upper(swigCPtr, this);
  }

  public  gp_XY  Value(int theIndex) {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_HArray1OfXY_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public gp_XY ChangeValue(int theIndex) {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_HArray1OfXY_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new gp_XY.CRef (ret);
  }

  public void SetValue(int theIndex,  gp_XY  theItem) {
    OCCwrapJavaJNI.TColgp_HArray1OfXY_SetValue(swigCPtr, this, theIndex, gp_XY.getCPtr(theItem), theItem);
  }

  public static  TColgp_HArray1OfXY  DownCast( Standard_Transient  T) {
    return new TColgp_HArray1OfXY ( OCCwrapJavaJNI.TColgp_HArray1OfXY_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColgp_HArray1OfXY_TypeOf(), true );
  }

}
