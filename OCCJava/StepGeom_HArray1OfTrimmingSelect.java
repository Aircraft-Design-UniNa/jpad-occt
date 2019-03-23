package opencascade;

public class StepGeom_HArray1OfTrimmingSelect extends Standard_Transient {
  StepGeom_HArray1OfTrimmingSelect(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public StepGeom_HArray1OfTrimmingSelect(int theLower, int theUpper,  StepGeom_TrimmingSelect  theValue) {
    this(OCCwrapJavaJNI.new_StepGeom_HArray1OfTrimmingSelect__SWIG_0(theLower, theUpper, StepGeom_TrimmingSelect.getCPtr(theValue), theValue), true);
  }

  public StepGeom_HArray1OfTrimmingSelect(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepGeom_HArray1OfTrimmingSelect__SWIG_1(theLower, theUpper), true);
  }

  public StepGeom_HArray1OfTrimmingSelect( StepGeom_Array1OfTrimmingSelect  theOther) {
    this(OCCwrapJavaJNI.new_StepGeom_HArray1OfTrimmingSelect__SWIG_2(StepGeom_Array1OfTrimmingSelect.getCPtr(theOther), theOther), true);
  }

  public  StepGeom_Array1OfTrimmingSelect  Array1() {
    StepGeom_Array1OfTrimmingSelect ret = new StepGeom_Array1OfTrimmingSelect(OCCwrapJavaJNI.StepGeom_HArray1OfTrimmingSelect_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  StepGeom_Array1OfTrimmingSelect  ChangeArray1() {
    StepGeom_Array1OfTrimmingSelect ret = new StepGeom_Array1OfTrimmingSelect(OCCwrapJavaJNI.StepGeom_HArray1OfTrimmingSelect_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.StepGeom_HArray1OfTrimmingSelect_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepGeom_HArray1OfTrimmingSelect_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepGeom_HArray1OfTrimmingSelect_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepGeom_HArray1OfTrimmingSelect_Upper(swigCPtr, this);
  }

  public  StepGeom_TrimmingSelect  Value(int theIndex) {
    StepGeom_TrimmingSelect ret = new StepGeom_TrimmingSelect(OCCwrapJavaJNI.StepGeom_HArray1OfTrimmingSelect_Value(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public  StepGeom_TrimmingSelect  ChangeValue(int theIndex) {
    StepGeom_TrimmingSelect ret = new StepGeom_TrimmingSelect(OCCwrapJavaJNI.StepGeom_HArray1OfTrimmingSelect_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public void SetValue(int theIndex,  StepGeom_TrimmingSelect  theItem) {
    OCCwrapJavaJNI.StepGeom_HArray1OfTrimmingSelect_SetValue(swigCPtr, this, theIndex, StepGeom_TrimmingSelect.getCPtr(theItem), theItem);
  }

  public static  StepGeom_HArray1OfTrimmingSelect  DownCast( Standard_Transient  T) {
    return new StepGeom_HArray1OfTrimmingSelect ( OCCwrapJavaJNI.StepGeom_HArray1OfTrimmingSelect_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_HArray1OfTrimmingSelect_TypeOf(), true );
  }

}
