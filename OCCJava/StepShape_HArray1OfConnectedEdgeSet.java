package opencascade;

public class StepShape_HArray1OfConnectedEdgeSet extends Standard_Transient {
  StepShape_HArray1OfConnectedEdgeSet(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public StepShape_HArray1OfConnectedEdgeSet(int theLower, int theUpper,  StepShape_ConnectedEdgeSet  theValue) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfConnectedEdgeSet__SWIG_0(theLower, theUpper,  StepShape_ConnectedEdgeSet.getCPtr(theValue) , theValue), true);
  }

  public StepShape_HArray1OfConnectedEdgeSet(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfConnectedEdgeSet__SWIG_1(theLower, theUpper), true);
  }

  public StepShape_HArray1OfConnectedEdgeSet( StepShape_Array1OfConnectedEdgeSet  theOther) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfConnectedEdgeSet__SWIG_2(StepShape_Array1OfConnectedEdgeSet.getCPtr(theOther), theOther), true);
  }

  public  StepShape_Array1OfConnectedEdgeSet  Array1() {
    StepShape_Array1OfConnectedEdgeSet ret = new StepShape_Array1OfConnectedEdgeSet(OCCwrapJavaJNI.StepShape_HArray1OfConnectedEdgeSet_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  StepShape_Array1OfConnectedEdgeSet  ChangeArray1() {
    StepShape_Array1OfConnectedEdgeSet ret = new StepShape_Array1OfConnectedEdgeSet(OCCwrapJavaJNI.StepShape_HArray1OfConnectedEdgeSet_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.StepShape_HArray1OfConnectedEdgeSet_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepShape_HArray1OfConnectedEdgeSet_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepShape_HArray1OfConnectedEdgeSet_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepShape_HArray1OfConnectedEdgeSet_Upper(swigCPtr, this);
  }

  public  StepShape_ConnectedEdgeSet  Value(int theIndex) {
    return new StepShape_ConnectedEdgeSet ( OCCwrapJavaJNI.StepShape_HArray1OfConnectedEdgeSet_Value(swigCPtr, this, theIndex), true );
  }

  public  StepShape_ConnectedEdgeSet  ChangeValue(int theIndex) {
    return new StepShape_ConnectedEdgeSet ( OCCwrapJavaJNI.StepShape_HArray1OfConnectedEdgeSet_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  StepShape_ConnectedEdgeSet  theItem) {
    OCCwrapJavaJNI.StepShape_HArray1OfConnectedEdgeSet_SetValue(swigCPtr, this, theIndex,  StepShape_ConnectedEdgeSet.getCPtr(theItem) , theItem);
  }

  public static  StepShape_HArray1OfConnectedEdgeSet  DownCast( Standard_Transient  T) {
    return new StepShape_HArray1OfConnectedEdgeSet ( OCCwrapJavaJNI.StepShape_HArray1OfConnectedEdgeSet_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_HArray1OfConnectedEdgeSet_TypeOf(), true );
  }

}
