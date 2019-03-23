package opencascade;

public class StepShape_HArray1OfOrientedEdge extends Standard_Transient {
  StepShape_HArray1OfOrientedEdge(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public StepShape_HArray1OfOrientedEdge(int theLower, int theUpper,  StepShape_OrientedEdge  theValue) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfOrientedEdge__SWIG_0(theLower, theUpper,  StepShape_OrientedEdge.getCPtr(theValue) , theValue), true);
  }

  public StepShape_HArray1OfOrientedEdge(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfOrientedEdge__SWIG_1(theLower, theUpper), true);
  }

  public StepShape_HArray1OfOrientedEdge( StepShape_Array1OfOrientedEdge  theOther) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfOrientedEdge__SWIG_2(StepShape_Array1OfOrientedEdge.getCPtr(theOther), theOther), true);
  }

  public  StepShape_Array1OfOrientedEdge  Array1() {
    StepShape_Array1OfOrientedEdge ret = new StepShape_Array1OfOrientedEdge(OCCwrapJavaJNI.StepShape_HArray1OfOrientedEdge_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  StepShape_Array1OfOrientedEdge  ChangeArray1() {
    StepShape_Array1OfOrientedEdge ret = new StepShape_Array1OfOrientedEdge(OCCwrapJavaJNI.StepShape_HArray1OfOrientedEdge_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.StepShape_HArray1OfOrientedEdge_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepShape_HArray1OfOrientedEdge_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepShape_HArray1OfOrientedEdge_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepShape_HArray1OfOrientedEdge_Upper(swigCPtr, this);
  }

  public  StepShape_OrientedEdge  Value(int theIndex) {
    return new StepShape_OrientedEdge ( OCCwrapJavaJNI.StepShape_HArray1OfOrientedEdge_Value(swigCPtr, this, theIndex), true );
  }

  public  StepShape_OrientedEdge  ChangeValue(int theIndex) {
    return new StepShape_OrientedEdge ( OCCwrapJavaJNI.StepShape_HArray1OfOrientedEdge_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  StepShape_OrientedEdge  theItem) {
    OCCwrapJavaJNI.StepShape_HArray1OfOrientedEdge_SetValue(swigCPtr, this, theIndex,  StepShape_OrientedEdge.getCPtr(theItem) , theItem);
  }

  public static  StepShape_HArray1OfOrientedEdge  DownCast( Standard_Transient  T) {
    return new StepShape_HArray1OfOrientedEdge ( OCCwrapJavaJNI.StepShape_HArray1OfOrientedEdge_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_HArray1OfOrientedEdge_TypeOf(), true );
  }

}
