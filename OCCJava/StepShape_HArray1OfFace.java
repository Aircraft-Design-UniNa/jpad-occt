package opencascade;

public class StepShape_HArray1OfFace extends Standard_Transient {
  StepShape_HArray1OfFace(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public StepShape_HArray1OfFace(int theLower, int theUpper,  StepShape_Face  theValue) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfFace__SWIG_0(theLower, theUpper,  StepShape_Face.getCPtr(theValue) , theValue), true);
  }

  public StepShape_HArray1OfFace(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfFace__SWIG_1(theLower, theUpper), true);
  }

  public StepShape_HArray1OfFace( StepShape_Array1OfFace  theOther) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfFace__SWIG_2(StepShape_Array1OfFace.getCPtr(theOther), theOther), true);
  }

  public  StepShape_Array1OfFace  Array1() {
    StepShape_Array1OfFace ret = new StepShape_Array1OfFace(OCCwrapJavaJNI.StepShape_HArray1OfFace_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  StepShape_Array1OfFace  ChangeArray1() {
    StepShape_Array1OfFace ret = new StepShape_Array1OfFace(OCCwrapJavaJNI.StepShape_HArray1OfFace_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.StepShape_HArray1OfFace_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepShape_HArray1OfFace_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepShape_HArray1OfFace_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepShape_HArray1OfFace_Upper(swigCPtr, this);
  }

  public  StepShape_Face  Value(int theIndex) {
    return new StepShape_Face ( OCCwrapJavaJNI.StepShape_HArray1OfFace_Value(swigCPtr, this, theIndex), true );
  }

  public  StepShape_Face  ChangeValue(int theIndex) {
    return new StepShape_Face ( OCCwrapJavaJNI.StepShape_HArray1OfFace_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  StepShape_Face  theItem) {
    OCCwrapJavaJNI.StepShape_HArray1OfFace_SetValue(swigCPtr, this, theIndex,  StepShape_Face.getCPtr(theItem) , theItem);
  }

  public static  StepShape_HArray1OfFace  DownCast( Standard_Transient  T) {
    return new StepShape_HArray1OfFace ( OCCwrapJavaJNI.StepShape_HArray1OfFace_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_HArray1OfFace_TypeOf(), true );
  }

}
