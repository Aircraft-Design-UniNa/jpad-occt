package opencascade;

public class StepGeom_HArray1OfCartesianPoint extends Standard_Transient {
  StepGeom_HArray1OfCartesianPoint(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public StepGeom_HArray1OfCartesianPoint(int theLower, int theUpper,  StepGeom_CartesianPoint  theValue) {
    this(OCCwrapJavaJNI.new_StepGeom_HArray1OfCartesianPoint__SWIG_0(theLower, theUpper,  StepGeom_CartesianPoint.getCPtr(theValue) , theValue), true);
  }

  public StepGeom_HArray1OfCartesianPoint(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepGeom_HArray1OfCartesianPoint__SWIG_1(theLower, theUpper), true);
  }

  public StepGeom_HArray1OfCartesianPoint( StepGeom_Array1OfCartesianPoint  theOther) {
    this(OCCwrapJavaJNI.new_StepGeom_HArray1OfCartesianPoint__SWIG_2(StepGeom_Array1OfCartesianPoint.getCPtr(theOther), theOther), true);
  }

  public  StepGeom_Array1OfCartesianPoint  Array1() {
    StepGeom_Array1OfCartesianPoint ret = new StepGeom_Array1OfCartesianPoint(OCCwrapJavaJNI.StepGeom_HArray1OfCartesianPoint_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  StepGeom_Array1OfCartesianPoint  ChangeArray1() {
    StepGeom_Array1OfCartesianPoint ret = new StepGeom_Array1OfCartesianPoint(OCCwrapJavaJNI.StepGeom_HArray1OfCartesianPoint_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.StepGeom_HArray1OfCartesianPoint_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepGeom_HArray1OfCartesianPoint_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepGeom_HArray1OfCartesianPoint_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepGeom_HArray1OfCartesianPoint_Upper(swigCPtr, this);
  }

  public  StepGeom_CartesianPoint  Value(int theIndex) {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_HArray1OfCartesianPoint_Value(swigCPtr, this, theIndex), true );
  }

  public  StepGeom_CartesianPoint  ChangeValue(int theIndex) {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_HArray1OfCartesianPoint_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  StepGeom_CartesianPoint  theItem) {
    OCCwrapJavaJNI.StepGeom_HArray1OfCartesianPoint_SetValue(swigCPtr, this, theIndex,  StepGeom_CartesianPoint.getCPtr(theItem) , theItem);
  }

  public static  StepGeom_HArray1OfCartesianPoint  DownCast( Standard_Transient  T) {
    return new StepGeom_HArray1OfCartesianPoint ( OCCwrapJavaJNI.StepGeom_HArray1OfCartesianPoint_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_HArray1OfCartesianPoint_TypeOf(), true );
  }

}
