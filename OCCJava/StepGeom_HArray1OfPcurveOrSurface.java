package opencascade;

public class StepGeom_HArray1OfPcurveOrSurface extends Standard_Transient {
  StepGeom_HArray1OfPcurveOrSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public StepGeom_HArray1OfPcurveOrSurface(int theLower, int theUpper,  StepGeom_PcurveOrSurface  theValue) {
    this(OCCwrapJavaJNI.new_StepGeom_HArray1OfPcurveOrSurface__SWIG_0(theLower, theUpper, StepGeom_PcurveOrSurface.getCPtr(theValue), theValue), true);
  }

  public StepGeom_HArray1OfPcurveOrSurface(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepGeom_HArray1OfPcurveOrSurface__SWIG_1(theLower, theUpper), true);
  }

  public StepGeom_HArray1OfPcurveOrSurface( StepGeom_Array1OfPcurveOrSurface  theOther) {
    this(OCCwrapJavaJNI.new_StepGeom_HArray1OfPcurveOrSurface__SWIG_2(StepGeom_Array1OfPcurveOrSurface.getCPtr(theOther), theOther), true);
  }

  public  StepGeom_Array1OfPcurveOrSurface  Array1() {
    StepGeom_Array1OfPcurveOrSurface ret = new StepGeom_Array1OfPcurveOrSurface(OCCwrapJavaJNI.StepGeom_HArray1OfPcurveOrSurface_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  StepGeom_Array1OfPcurveOrSurface  ChangeArray1() {
    StepGeom_Array1OfPcurveOrSurface ret = new StepGeom_Array1OfPcurveOrSurface(OCCwrapJavaJNI.StepGeom_HArray1OfPcurveOrSurface_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.StepGeom_HArray1OfPcurveOrSurface_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepGeom_HArray1OfPcurveOrSurface_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepGeom_HArray1OfPcurveOrSurface_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepGeom_HArray1OfPcurveOrSurface_Upper(swigCPtr, this);
  }

  public  StepGeom_PcurveOrSurface  Value(int theIndex) {
    StepGeom_PcurveOrSurface ret = new StepGeom_PcurveOrSurface(OCCwrapJavaJNI.StepGeom_HArray1OfPcurveOrSurface_Value(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public  StepGeom_PcurveOrSurface  ChangeValue(int theIndex) {
    StepGeom_PcurveOrSurface ret = new StepGeom_PcurveOrSurface(OCCwrapJavaJNI.StepGeom_HArray1OfPcurveOrSurface_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public void SetValue(int theIndex,  StepGeom_PcurveOrSurface  theItem) {
    OCCwrapJavaJNI.StepGeom_HArray1OfPcurveOrSurface_SetValue(swigCPtr, this, theIndex, StepGeom_PcurveOrSurface.getCPtr(theItem), theItem);
  }

  public static  StepGeom_HArray1OfPcurveOrSurface  DownCast( Standard_Transient  T) {
    return new StepGeom_HArray1OfPcurveOrSurface ( OCCwrapJavaJNI.StepGeom_HArray1OfPcurveOrSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_HArray1OfPcurveOrSurface_TypeOf(), true );
  }

}
