package opencascade;

public class TColGeom_HArray1OfCurve extends Standard_Transient {
  TColGeom_HArray1OfCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColGeom_HArray1OfCurve(int theLower, int theUpper,  Geom_Curve  theValue) {
    this(OCCwrapJavaJNI.new_TColGeom_HArray1OfCurve__SWIG_0(theLower, theUpper,  Geom_Curve.getCPtr(theValue) , theValue), true);
  }

  public TColGeom_HArray1OfCurve(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColGeom_HArray1OfCurve__SWIG_1(theLower, theUpper), true);
  }

  public TColGeom_HArray1OfCurve( TColGeom_Array1OfCurve  theOther) {
    this(OCCwrapJavaJNI.new_TColGeom_HArray1OfCurve__SWIG_2(TColGeom_Array1OfCurve.getCPtr(theOther), theOther), true);
  }

  public  TColGeom_Array1OfCurve  Array1() {
    TColGeom_Array1OfCurve ret = new TColGeom_Array1OfCurve(OCCwrapJavaJNI.TColGeom_HArray1OfCurve_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  TColGeom_Array1OfCurve  ChangeArray1() {
    TColGeom_Array1OfCurve ret = new TColGeom_Array1OfCurve(OCCwrapJavaJNI.TColGeom_HArray1OfCurve_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColGeom_HArray1OfCurve_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColGeom_HArray1OfCurve_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColGeom_HArray1OfCurve_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColGeom_HArray1OfCurve_Upper(swigCPtr, this);
  }

  public  Geom_Curve  Value(int theIndex) {
    return new Geom_Curve ( OCCwrapJavaJNI.TColGeom_HArray1OfCurve_Value(swigCPtr, this, theIndex), true );
  }

  public  Geom_Curve  ChangeValue(int theIndex) {
    return new Geom_Curve ( OCCwrapJavaJNI.TColGeom_HArray1OfCurve_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  Geom_Curve  theItem) {
    OCCwrapJavaJNI.TColGeom_HArray1OfCurve_SetValue(swigCPtr, this, theIndex,  Geom_Curve.getCPtr(theItem) , theItem);
  }

  public static  TColGeom_HArray1OfCurve  DownCast( Standard_Transient  T) {
    return new TColGeom_HArray1OfCurve ( OCCwrapJavaJNI.TColGeom_HArray1OfCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColGeom_HArray1OfCurve_TypeOf(), true );
  }

}
