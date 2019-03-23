package opencascade;

public class StepShape_HArray1OfShell extends Standard_Transient {
  StepShape_HArray1OfShell(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public StepShape_HArray1OfShell(int theLower, int theUpper,  StepShape_Shell  theValue) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfShell__SWIG_0(theLower, theUpper, StepShape_Shell.getCPtr(theValue), theValue), true);
  }

  public StepShape_HArray1OfShell(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfShell__SWIG_1(theLower, theUpper), true);
  }

  public StepShape_HArray1OfShell( StepShape_Array1OfShell  theOther) {
    this(OCCwrapJavaJNI.new_StepShape_HArray1OfShell__SWIG_2(StepShape_Array1OfShell.getCPtr(theOther), theOther), true);
  }

  public  StepShape_Array1OfShell  Array1() {
    StepShape_Array1OfShell ret = new StepShape_Array1OfShell(OCCwrapJavaJNI.StepShape_HArray1OfShell_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  StepShape_Array1OfShell  ChangeArray1() {
    StepShape_Array1OfShell ret = new StepShape_Array1OfShell(OCCwrapJavaJNI.StepShape_HArray1OfShell_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.StepShape_HArray1OfShell_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepShape_HArray1OfShell_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepShape_HArray1OfShell_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepShape_HArray1OfShell_Upper(swigCPtr, this);
  }

  public  StepShape_Shell  Value(int theIndex) {
    StepShape_Shell ret = new StepShape_Shell(OCCwrapJavaJNI.StepShape_HArray1OfShell_Value(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public  StepShape_Shell  ChangeValue(int theIndex) {
    StepShape_Shell ret = new StepShape_Shell(OCCwrapJavaJNI.StepShape_HArray1OfShell_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public void SetValue(int theIndex,  StepShape_Shell  theItem) {
    OCCwrapJavaJNI.StepShape_HArray1OfShell_SetValue(swigCPtr, this, theIndex, StepShape_Shell.getCPtr(theItem), theItem);
  }

  public static  StepShape_HArray1OfShell  DownCast( Standard_Transient  T) {
    return new StepShape_HArray1OfShell ( OCCwrapJavaJNI.StepShape_HArray1OfShell_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_HArray1OfShell_TypeOf(), true );
  }

}
