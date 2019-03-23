package opencascade;

public class Plate_HArray1OfPinpointConstraint extends Standard_Transient {
  Plate_HArray1OfPinpointConstraint(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public Plate_HArray1OfPinpointConstraint(int theLower, int theUpper,  Plate_PinpointConstraint  theValue) {
    this(OCCwrapJavaJNI.new_Plate_HArray1OfPinpointConstraint__SWIG_0(theLower, theUpper, Plate_PinpointConstraint.getCPtr(theValue), theValue), true);
  }

  public Plate_HArray1OfPinpointConstraint(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_Plate_HArray1OfPinpointConstraint__SWIG_1(theLower, theUpper), true);
  }

  public Plate_HArray1OfPinpointConstraint( Plate_Array1OfPinpointConstraint  theOther) {
    this(OCCwrapJavaJNI.new_Plate_HArray1OfPinpointConstraint__SWIG_2(Plate_Array1OfPinpointConstraint.getCPtr(theOther), theOther), true);
  }

  public  Plate_Array1OfPinpointConstraint  Array1() {
    Plate_Array1OfPinpointConstraint ret = new Plate_Array1OfPinpointConstraint(OCCwrapJavaJNI.Plate_HArray1OfPinpointConstraint_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  Plate_Array1OfPinpointConstraint  ChangeArray1() {
    Plate_Array1OfPinpointConstraint ret = new Plate_Array1OfPinpointConstraint(OCCwrapJavaJNI.Plate_HArray1OfPinpointConstraint_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.Plate_HArray1OfPinpointConstraint_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.Plate_HArray1OfPinpointConstraint_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.Plate_HArray1OfPinpointConstraint_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.Plate_HArray1OfPinpointConstraint_Upper(swigCPtr, this);
  }

  public  Plate_PinpointConstraint  Value(int theIndex) {
    Plate_PinpointConstraint ret = new Plate_PinpointConstraint(OCCwrapJavaJNI.Plate_HArray1OfPinpointConstraint_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public Plate_PinpointConstraint ChangeValue(int theIndex) {
    Plate_PinpointConstraint ret = new Plate_PinpointConstraint(OCCwrapJavaJNI.Plate_HArray1OfPinpointConstraint_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new Plate_PinpointConstraint.CRef (ret);
  }

  public void SetValue(int theIndex,  Plate_PinpointConstraint  theItem) {
    OCCwrapJavaJNI.Plate_HArray1OfPinpointConstraint_SetValue(swigCPtr, this, theIndex, Plate_PinpointConstraint.getCPtr(theItem), theItem);
  }

  public static  Plate_HArray1OfPinpointConstraint  DownCast( Standard_Transient  T) {
    return new Plate_HArray1OfPinpointConstraint ( OCCwrapJavaJNI.Plate_HArray1OfPinpointConstraint_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Plate_HArray1OfPinpointConstraint_TypeOf(), true );
  }

}
