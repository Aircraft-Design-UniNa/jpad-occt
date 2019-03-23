package opencascade;

public class StepShape_HArray1OfConnectedFaceSet extends Standard_Transient {
  StepShape_HArray1OfConnectedFaceSet(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public StepShape_HArray1OfConnectedFaceSet(int theLower, int theUpper,  StepShape_ConnectedFaceSet  theValue) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfConnectedFaceSet__SWIG_0(theLower, theUpper,  StepShape_ConnectedFaceSet.getCPtr(theValue) , theValue), true);
  }

  public StepShape_HArray1OfConnectedFaceSet(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfConnectedFaceSet__SWIG_1(theLower, theUpper), true);
  }

  public StepShape_HArray1OfConnectedFaceSet( StepShape_Array1OfConnectedFaceSet  theOther) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfConnectedFaceSet__SWIG_2(StepShape_Array1OfConnectedFaceSet.getCPtr(theOther), theOther), true);
  }

  public  StepShape_Array1OfConnectedFaceSet  Array1() {
    StepShape_Array1OfConnectedFaceSet ret = new StepShape_Array1OfConnectedFaceSet(OCCwrapJavaJNI.StepShape_HArray1OfConnectedFaceSet_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  StepShape_Array1OfConnectedFaceSet  ChangeArray1() {
    StepShape_Array1OfConnectedFaceSet ret = new StepShape_Array1OfConnectedFaceSet(OCCwrapJavaJNI.StepShape_HArray1OfConnectedFaceSet_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.StepShape_HArray1OfConnectedFaceSet_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepShape_HArray1OfConnectedFaceSet_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepShape_HArray1OfConnectedFaceSet_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepShape_HArray1OfConnectedFaceSet_Upper(swigCPtr, this);
  }

  public  StepShape_ConnectedFaceSet  Value(int theIndex) {
    return new StepShape_ConnectedFaceSet ( OCCwrapJavaJNI.StepShape_HArray1OfConnectedFaceSet_Value(swigCPtr, this, theIndex), true );
  }

  public  StepShape_ConnectedFaceSet  ChangeValue(int theIndex) {
    return new StepShape_ConnectedFaceSet ( OCCwrapJavaJNI.StepShape_HArray1OfConnectedFaceSet_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  StepShape_ConnectedFaceSet  theItem) {
    OCCwrapJavaJNI.StepShape_HArray1OfConnectedFaceSet_SetValue(swigCPtr, this, theIndex,  StepShape_ConnectedFaceSet.getCPtr(theItem) , theItem);
  }

  public static  StepShape_HArray1OfConnectedFaceSet  DownCast( Standard_Transient  T) {
    return new StepShape_HArray1OfConnectedFaceSet ( OCCwrapJavaJNI.StepShape_HArray1OfConnectedFaceSet_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_HArray1OfConnectedFaceSet_TypeOf(), true );
  }

}
