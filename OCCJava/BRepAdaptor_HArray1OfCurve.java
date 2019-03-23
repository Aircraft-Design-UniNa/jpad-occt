package opencascade;

public class BRepAdaptor_HArray1OfCurve extends Standard_Transient {
  BRepAdaptor_HArray1OfCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public BRepAdaptor_HArray1OfCurve(int theLower, int theUpper,  BRepAdaptor_Curve  theValue) {
    this(OCCwrapJavaJNI.new_BRepAdaptor_HArray1OfCurve__SWIG_0(theLower, theUpper, BRepAdaptor_Curve.getCPtr(theValue), theValue), true);
  }

  public BRepAdaptor_HArray1OfCurve(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_BRepAdaptor_HArray1OfCurve__SWIG_1(theLower, theUpper), true);
  }

  public BRepAdaptor_HArray1OfCurve( BRepAdaptor_Array1OfCurve  theOther) {
    this(OCCwrapJavaJNI.new_BRepAdaptor_HArray1OfCurve__SWIG_2(BRepAdaptor_Array1OfCurve.getCPtr(theOther), theOther), true);
  }

  public  BRepAdaptor_Array1OfCurve  Array1() {
    BRepAdaptor_Array1OfCurve ret = new BRepAdaptor_Array1OfCurve(OCCwrapJavaJNI.BRepAdaptor_HArray1OfCurve_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  BRepAdaptor_Array1OfCurve  ChangeArray1() {
    BRepAdaptor_Array1OfCurve ret = new BRepAdaptor_Array1OfCurve(OCCwrapJavaJNI.BRepAdaptor_HArray1OfCurve_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.BRepAdaptor_HArray1OfCurve_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.BRepAdaptor_HArray1OfCurve_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.BRepAdaptor_HArray1OfCurve_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.BRepAdaptor_HArray1OfCurve_Upper(swigCPtr, this);
  }

  public  BRepAdaptor_Curve  Value(int theIndex) {
    BRepAdaptor_Curve ret = new BRepAdaptor_Curve(OCCwrapJavaJNI.BRepAdaptor_HArray1OfCurve_Value(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public  BRepAdaptor_Curve  ChangeValue(int theIndex) {
    BRepAdaptor_Curve ret = new BRepAdaptor_Curve(OCCwrapJavaJNI.BRepAdaptor_HArray1OfCurve_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public void SetValue(int theIndex,  BRepAdaptor_Curve  theItem) {
    OCCwrapJavaJNI.BRepAdaptor_HArray1OfCurve_SetValue(swigCPtr, this, theIndex, BRepAdaptor_Curve.getCPtr(theItem), theItem);
  }

  public static  BRepAdaptor_HArray1OfCurve  DownCast( Standard_Transient  T) {
    return new BRepAdaptor_HArray1OfCurve ( OCCwrapJavaJNI.BRepAdaptor_HArray1OfCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepAdaptor_HArray1OfCurve_TypeOf(), true );
  }

}
