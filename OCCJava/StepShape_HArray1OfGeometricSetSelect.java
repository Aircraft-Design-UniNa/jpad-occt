package opencascade;

public class StepShape_HArray1OfGeometricSetSelect extends Standard_Transient {
  StepShape_HArray1OfGeometricSetSelect(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public StepShape_HArray1OfGeometricSetSelect(int theLower, int theUpper,  StepShape_GeometricSetSelect  theValue) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfGeometricSetSelect__SWIG_0(theLower, theUpper, StepShape_GeometricSetSelect.getCPtr(theValue), theValue), true);
  }

  public StepShape_HArray1OfGeometricSetSelect(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfGeometricSetSelect__SWIG_1(theLower, theUpper), true);
  }

  public StepShape_HArray1OfGeometricSetSelect( StepShape_Array1OfGeometricSetSelect  theOther) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfGeometricSetSelect__SWIG_2(StepShape_Array1OfGeometricSetSelect.getCPtr(theOther), theOther), true);
  }

  public  StepShape_Array1OfGeometricSetSelect  Array1() {
    StepShape_Array1OfGeometricSetSelect ret = new StepShape_Array1OfGeometricSetSelect(OCCwrapJavaJNI.StepShape_HArray1OfGeometricSetSelect_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  StepShape_Array1OfGeometricSetSelect  ChangeArray1() {
    StepShape_Array1OfGeometricSetSelect ret = new StepShape_Array1OfGeometricSetSelect(OCCwrapJavaJNI.StepShape_HArray1OfGeometricSetSelect_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.StepShape_HArray1OfGeometricSetSelect_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepShape_HArray1OfGeometricSetSelect_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepShape_HArray1OfGeometricSetSelect_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepShape_HArray1OfGeometricSetSelect_Upper(swigCPtr, this);
  }

  public  StepShape_GeometricSetSelect  Value(int theIndex) {
    StepShape_GeometricSetSelect ret = new StepShape_GeometricSetSelect(OCCwrapJavaJNI.StepShape_HArray1OfGeometricSetSelect_Value(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public  StepShape_GeometricSetSelect  ChangeValue(int theIndex) {
    StepShape_GeometricSetSelect ret = new StepShape_GeometricSetSelect(OCCwrapJavaJNI.StepShape_HArray1OfGeometricSetSelect_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public void SetValue(int theIndex,  StepShape_GeometricSetSelect  theItem) {
    OCCwrapJavaJNI.StepShape_HArray1OfGeometricSetSelect_SetValue(swigCPtr, this, theIndex, StepShape_GeometricSetSelect.getCPtr(theItem), theItem);
  }

  public static  StepShape_HArray1OfGeometricSetSelect  DownCast( Standard_Transient  T) {
    return new StepShape_HArray1OfGeometricSetSelect ( OCCwrapJavaJNI.StepShape_HArray1OfGeometricSetSelect_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_HArray1OfGeometricSetSelect_TypeOf(), true );
  }

}
