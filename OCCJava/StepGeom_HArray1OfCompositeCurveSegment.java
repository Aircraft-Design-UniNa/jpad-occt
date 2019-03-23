package opencascade;

public class StepGeom_HArray1OfCompositeCurveSegment extends Standard_Transient {
  StepGeom_HArray1OfCompositeCurveSegment(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public StepGeom_HArray1OfCompositeCurveSegment(int theLower, int theUpper,  StepGeom_CompositeCurveSegment  theValue) {
    this(OCCwrapJavaJNI.new_StepGeom_HArray1OfCompositeCurveSegment__SWIG_0(theLower, theUpper,  StepGeom_CompositeCurveSegment.getCPtr(theValue) , theValue), true);
  }

  public StepGeom_HArray1OfCompositeCurveSegment(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepGeom_HArray1OfCompositeCurveSegment__SWIG_1(theLower, theUpper), true);
  }

  public StepGeom_HArray1OfCompositeCurveSegment( StepGeom_Array1OfCompositeCurveSegment  theOther) {
    this(OCCwrapJavaJNI.new_StepGeom_HArray1OfCompositeCurveSegment__SWIG_2(StepGeom_Array1OfCompositeCurveSegment.getCPtr(theOther), theOther), true);
  }

  public  StepGeom_Array1OfCompositeCurveSegment  Array1() {
    StepGeom_Array1OfCompositeCurveSegment ret = new StepGeom_Array1OfCompositeCurveSegment(OCCwrapJavaJNI.StepGeom_HArray1OfCompositeCurveSegment_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  StepGeom_Array1OfCompositeCurveSegment  ChangeArray1() {
    StepGeom_Array1OfCompositeCurveSegment ret = new StepGeom_Array1OfCompositeCurveSegment(OCCwrapJavaJNI.StepGeom_HArray1OfCompositeCurveSegment_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.StepGeom_HArray1OfCompositeCurveSegment_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepGeom_HArray1OfCompositeCurveSegment_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepGeom_HArray1OfCompositeCurveSegment_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepGeom_HArray1OfCompositeCurveSegment_Upper(swigCPtr, this);
  }

  public  StepGeom_CompositeCurveSegment  Value(int theIndex) {
    return new StepGeom_CompositeCurveSegment ( OCCwrapJavaJNI.StepGeom_HArray1OfCompositeCurveSegment_Value(swigCPtr, this, theIndex), true );
  }

  public  StepGeom_CompositeCurveSegment  ChangeValue(int theIndex) {
    return new StepGeom_CompositeCurveSegment ( OCCwrapJavaJNI.StepGeom_HArray1OfCompositeCurveSegment_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  StepGeom_CompositeCurveSegment  theItem) {
    OCCwrapJavaJNI.StepGeom_HArray1OfCompositeCurveSegment_SetValue(swigCPtr, this, theIndex,  StepGeom_CompositeCurveSegment.getCPtr(theItem) , theItem);
  }

  public static  StepGeom_HArray1OfCompositeCurveSegment  DownCast( Standard_Transient  T) {
    return new StepGeom_HArray1OfCompositeCurveSegment ( OCCwrapJavaJNI.StepGeom_HArray1OfCompositeCurveSegment_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_HArray1OfCompositeCurveSegment_TypeOf(), true );
  }

}
