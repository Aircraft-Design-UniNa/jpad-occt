package opencascade;

public class StepShape_HArray1OfOrientedClosedShell extends Standard_Transient {
  StepShape_HArray1OfOrientedClosedShell(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public StepShape_HArray1OfOrientedClosedShell(int theLower, int theUpper,  StepShape_OrientedClosedShell  theValue) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfOrientedClosedShell__SWIG_0(theLower, theUpper,  StepShape_OrientedClosedShell.getCPtr(theValue) , theValue), true);
  }

  public StepShape_HArray1OfOrientedClosedShell(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfOrientedClosedShell__SWIG_1(theLower, theUpper), true);
  }

  public StepShape_HArray1OfOrientedClosedShell( StepShape_Array1OfOrientedClosedShell  theOther) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfOrientedClosedShell__SWIG_2(StepShape_Array1OfOrientedClosedShell.getCPtr(theOther), theOther), true);
  }

  public  StepShape_Array1OfOrientedClosedShell  Array1() {
    StepShape_Array1OfOrientedClosedShell ret = new StepShape_Array1OfOrientedClosedShell(OCCwrapJavaJNI.StepShape_HArray1OfOrientedClosedShell_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  StepShape_Array1OfOrientedClosedShell  ChangeArray1() {
    StepShape_Array1OfOrientedClosedShell ret = new StepShape_Array1OfOrientedClosedShell(OCCwrapJavaJNI.StepShape_HArray1OfOrientedClosedShell_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.StepShape_HArray1OfOrientedClosedShell_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepShape_HArray1OfOrientedClosedShell_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepShape_HArray1OfOrientedClosedShell_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepShape_HArray1OfOrientedClosedShell_Upper(swigCPtr, this);
  }

  public  StepShape_OrientedClosedShell  Value(int theIndex) {
    return new StepShape_OrientedClosedShell ( OCCwrapJavaJNI.StepShape_HArray1OfOrientedClosedShell_Value(swigCPtr, this, theIndex), true );
  }

  public  StepShape_OrientedClosedShell  ChangeValue(int theIndex) {
    return new StepShape_OrientedClosedShell ( OCCwrapJavaJNI.StepShape_HArray1OfOrientedClosedShell_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  StepShape_OrientedClosedShell  theItem) {
    OCCwrapJavaJNI.StepShape_HArray1OfOrientedClosedShell_SetValue(swigCPtr, this, theIndex,  StepShape_OrientedClosedShell.getCPtr(theItem) , theItem);
  }

  public static  StepShape_HArray1OfOrientedClosedShell  DownCast( Standard_Transient  T) {
    return new StepShape_HArray1OfOrientedClosedShell ( OCCwrapJavaJNI.StepShape_HArray1OfOrientedClosedShell_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_HArray1OfOrientedClosedShell_TypeOf(), true );
  }

}
