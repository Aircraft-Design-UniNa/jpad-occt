package opencascade;

public class StepShape_HArray1OfFaceBound extends Standard_Transient {
  StepShape_HArray1OfFaceBound(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public StepShape_HArray1OfFaceBound(int theLower, int theUpper,  StepShape_FaceBound  theValue) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfFaceBound__SWIG_0(theLower, theUpper,  StepShape_FaceBound.getCPtr(theValue) , theValue), true);
  }

  public StepShape_HArray1OfFaceBound(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfFaceBound__SWIG_1(theLower, theUpper), true);
  }

  public StepShape_HArray1OfFaceBound( StepShape_Array1OfFaceBound  theOther) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfFaceBound__SWIG_2(StepShape_Array1OfFaceBound.getCPtr(theOther), theOther), true);
  }

  public  StepShape_Array1OfFaceBound  Array1() {
    StepShape_Array1OfFaceBound ret = new StepShape_Array1OfFaceBound(OCCwrapJavaJNI.StepShape_HArray1OfFaceBound_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  StepShape_Array1OfFaceBound  ChangeArray1() {
    StepShape_Array1OfFaceBound ret = new StepShape_Array1OfFaceBound(OCCwrapJavaJNI.StepShape_HArray1OfFaceBound_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.StepShape_HArray1OfFaceBound_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepShape_HArray1OfFaceBound_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepShape_HArray1OfFaceBound_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepShape_HArray1OfFaceBound_Upper(swigCPtr, this);
  }

  public  StepShape_FaceBound  Value(int theIndex) {
    return new StepShape_FaceBound ( OCCwrapJavaJNI.StepShape_HArray1OfFaceBound_Value(swigCPtr, this, theIndex), true );
  }

  public  StepShape_FaceBound  ChangeValue(int theIndex) {
    return new StepShape_FaceBound ( OCCwrapJavaJNI.StepShape_HArray1OfFaceBound_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  StepShape_FaceBound  theItem) {
    OCCwrapJavaJNI.StepShape_HArray1OfFaceBound_SetValue(swigCPtr, this, theIndex,  StepShape_FaceBound.getCPtr(theItem) , theItem);
  }

  public static  StepShape_HArray1OfFaceBound  DownCast( Standard_Transient  T) {
    return new StepShape_HArray1OfFaceBound ( OCCwrapJavaJNI.StepShape_HArray1OfFaceBound_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_HArray1OfFaceBound_TypeOf(), true );
  }

}
