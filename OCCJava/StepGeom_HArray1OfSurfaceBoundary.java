package opencascade;

public class StepGeom_HArray1OfSurfaceBoundary extends Standard_Transient {
  StepGeom_HArray1OfSurfaceBoundary(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public StepGeom_HArray1OfSurfaceBoundary(int theLower, int theUpper,  StepGeom_SurfaceBoundary  theValue) {
    this(OCCwrapJavaJNI.new_StepGeom_HArray1OfSurfaceBoundary__SWIG_0(theLower, theUpper, StepGeom_SurfaceBoundary.getCPtr(theValue), theValue), true);
  }

  public StepGeom_HArray1OfSurfaceBoundary(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepGeom_HArray1OfSurfaceBoundary__SWIG_1(theLower, theUpper), true);
  }

  public StepGeom_HArray1OfSurfaceBoundary( StepGeom_Array1OfSurfaceBoundary  theOther) {
    this(OCCwrapJavaJNI.new_StepGeom_HArray1OfSurfaceBoundary__SWIG_2(StepGeom_Array1OfSurfaceBoundary.getCPtr(theOther), theOther), true);
  }

  public  StepGeom_Array1OfSurfaceBoundary  Array1() {
    StepGeom_Array1OfSurfaceBoundary ret = new StepGeom_Array1OfSurfaceBoundary(OCCwrapJavaJNI.StepGeom_HArray1OfSurfaceBoundary_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  StepGeom_Array1OfSurfaceBoundary  ChangeArray1() {
    StepGeom_Array1OfSurfaceBoundary ret = new StepGeom_Array1OfSurfaceBoundary(OCCwrapJavaJNI.StepGeom_HArray1OfSurfaceBoundary_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.StepGeom_HArray1OfSurfaceBoundary_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepGeom_HArray1OfSurfaceBoundary_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepGeom_HArray1OfSurfaceBoundary_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepGeom_HArray1OfSurfaceBoundary_Upper(swigCPtr, this);
  }

  public  StepGeom_SurfaceBoundary  Value(int theIndex) {
    StepGeom_SurfaceBoundary ret = new StepGeom_SurfaceBoundary(OCCwrapJavaJNI.StepGeom_HArray1OfSurfaceBoundary_Value(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public  StepGeom_SurfaceBoundary  ChangeValue(int theIndex) {
    StepGeom_SurfaceBoundary ret = new StepGeom_SurfaceBoundary(OCCwrapJavaJNI.StepGeom_HArray1OfSurfaceBoundary_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public void SetValue(int theIndex,  StepGeom_SurfaceBoundary  theItem) {
    OCCwrapJavaJNI.StepGeom_HArray1OfSurfaceBoundary_SetValue(swigCPtr, this, theIndex, StepGeom_SurfaceBoundary.getCPtr(theItem), theItem);
  }

  public static  StepGeom_HArray1OfSurfaceBoundary  DownCast( Standard_Transient  T) {
    return new StepGeom_HArray1OfSurfaceBoundary ( OCCwrapJavaJNI.StepGeom_HArray1OfSurfaceBoundary_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_HArray1OfSurfaceBoundary_TypeOf(), true );
  }

}
