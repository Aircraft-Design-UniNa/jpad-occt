package opencascade;

public class StepShape_HArray1OfEdge extends Standard_Transient {
  StepShape_HArray1OfEdge(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public StepShape_HArray1OfEdge(int theLower, int theUpper,  StepShape_Edge  theValue) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfEdge__SWIG_0(theLower, theUpper,  StepShape_Edge.getCPtr(theValue) , theValue), true);
  }

  public StepShape_HArray1OfEdge(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfEdge__SWIG_1(theLower, theUpper), true);
  }

  public StepShape_HArray1OfEdge( StepShape_Array1OfEdge  theOther) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfEdge__SWIG_2(StepShape_Array1OfEdge.getCPtr(theOther), theOther), true);
  }

  public  StepShape_Array1OfEdge  Array1() {
    StepShape_Array1OfEdge ret = new StepShape_Array1OfEdge(OCCwrapJavaJNI.StepShape_HArray1OfEdge_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  StepShape_Array1OfEdge  ChangeArray1() {
    StepShape_Array1OfEdge ret = new StepShape_Array1OfEdge(OCCwrapJavaJNI.StepShape_HArray1OfEdge_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.StepShape_HArray1OfEdge_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepShape_HArray1OfEdge_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepShape_HArray1OfEdge_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepShape_HArray1OfEdge_Upper(swigCPtr, this);
  }

  public  StepShape_Edge  Value(int theIndex) {
    return new StepShape_Edge ( OCCwrapJavaJNI.StepShape_HArray1OfEdge_Value(swigCPtr, this, theIndex), true );
  }

  public  StepShape_Edge  ChangeValue(int theIndex) {
    return new StepShape_Edge ( OCCwrapJavaJNI.StepShape_HArray1OfEdge_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  StepShape_Edge  theItem) {
    OCCwrapJavaJNI.StepShape_HArray1OfEdge_SetValue(swigCPtr, this, theIndex,  StepShape_Edge.getCPtr(theItem) , theItem);
  }

  public static  StepShape_HArray1OfEdge  DownCast( Standard_Transient  T) {
    return new StepShape_HArray1OfEdge ( OCCwrapJavaJNI.StepShape_HArray1OfEdge_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_HArray1OfEdge_TypeOf(), true );
  }

}
