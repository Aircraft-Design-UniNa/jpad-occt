package opencascade;

public class TColGeom_HArray1OfBSplineCurve extends Standard_Transient {
  TColGeom_HArray1OfBSplineCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColGeom_HArray1OfBSplineCurve(int theLower, int theUpper,  Geom_BSplineCurve  theValue) {
    this(OCCwrapJavaJNI.new_TColGeom_HArray1OfBSplineCurve__SWIG_0(theLower, theUpper,  Geom_BSplineCurve.getCPtr(theValue) , theValue), true);
  }

  public TColGeom_HArray1OfBSplineCurve(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColGeom_HArray1OfBSplineCurve__SWIG_1(theLower, theUpper), true);
  }

  public TColGeom_HArray1OfBSplineCurve( TColGeom_Array1OfBSplineCurve  theOther) {
    this(OCCwrapJavaJNI.new_TColGeom_HArray1OfBSplineCurve__SWIG_2(TColGeom_Array1OfBSplineCurve.getCPtr(theOther), theOther), true);
  }

  public  TColGeom_Array1OfBSplineCurve  Array1() {
    TColGeom_Array1OfBSplineCurve ret = new TColGeom_Array1OfBSplineCurve(OCCwrapJavaJNI.TColGeom_HArray1OfBSplineCurve_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  TColGeom_Array1OfBSplineCurve  ChangeArray1() {
    TColGeom_Array1OfBSplineCurve ret = new TColGeom_Array1OfBSplineCurve(OCCwrapJavaJNI.TColGeom_HArray1OfBSplineCurve_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColGeom_HArray1OfBSplineCurve_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColGeom_HArray1OfBSplineCurve_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColGeom_HArray1OfBSplineCurve_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColGeom_HArray1OfBSplineCurve_Upper(swigCPtr, this);
  }

  public  Geom_BSplineCurve  Value(int theIndex) {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.TColGeom_HArray1OfBSplineCurve_Value(swigCPtr, this, theIndex), true );
  }

  public  Geom_BSplineCurve  ChangeValue(int theIndex) {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.TColGeom_HArray1OfBSplineCurve_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  Geom_BSplineCurve  theItem) {
    OCCwrapJavaJNI.TColGeom_HArray1OfBSplineCurve_SetValue(swigCPtr, this, theIndex,  Geom_BSplineCurve.getCPtr(theItem) , theItem);
  }

  public static  TColGeom_HArray1OfBSplineCurve  DownCast( Standard_Transient  T) {
    return new TColGeom_HArray1OfBSplineCurve ( OCCwrapJavaJNI.TColGeom_HArray1OfBSplineCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColGeom_HArray1OfBSplineCurve_TypeOf(), true );
  }

}
