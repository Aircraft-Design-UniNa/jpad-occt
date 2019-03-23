package opencascade;

public class StepRepr_HArray1OfRepresentationItem extends Standard_Transient {
  StepRepr_HArray1OfRepresentationItem(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public StepRepr_HArray1OfRepresentationItem(int theLower, int theUpper,  StepRepr_RepresentationItem  theValue) {
    this(OCCwrapJavaJNI.new_StepRepr_HArray1OfRepresentationItem__SWIG_0(theLower, theUpper,  StepRepr_RepresentationItem.getCPtr(theValue) , theValue), true);
  }

  public StepRepr_HArray1OfRepresentationItem(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepRepr_HArray1OfRepresentationItem__SWIG_1(theLower, theUpper), true);
  }

  public StepRepr_HArray1OfRepresentationItem( StepRepr_Array1OfRepresentationItem  theOther) {
    this(OCCwrapJavaJNI.new_StepRepr_HArray1OfRepresentationItem__SWIG_2(StepRepr_Array1OfRepresentationItem.getCPtr(theOther), theOther), true);
  }

  public  StepRepr_Array1OfRepresentationItem  Array1() {
    StepRepr_Array1OfRepresentationItem ret = new StepRepr_Array1OfRepresentationItem(OCCwrapJavaJNI.StepRepr_HArray1OfRepresentationItem_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  StepRepr_Array1OfRepresentationItem  ChangeArray1() {
    StepRepr_Array1OfRepresentationItem ret = new StepRepr_Array1OfRepresentationItem(OCCwrapJavaJNI.StepRepr_HArray1OfRepresentationItem_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.StepRepr_HArray1OfRepresentationItem_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepRepr_HArray1OfRepresentationItem_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepRepr_HArray1OfRepresentationItem_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepRepr_HArray1OfRepresentationItem_Upper(swigCPtr, this);
  }

  public  StepRepr_RepresentationItem  Value(int theIndex) {
    return new StepRepr_RepresentationItem ( OCCwrapJavaJNI.StepRepr_HArray1OfRepresentationItem_Value(swigCPtr, this, theIndex), true );
  }

  public  StepRepr_RepresentationItem  ChangeValue(int theIndex) {
    return new StepRepr_RepresentationItem ( OCCwrapJavaJNI.StepRepr_HArray1OfRepresentationItem_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  StepRepr_RepresentationItem  theItem) {
    OCCwrapJavaJNI.StepRepr_HArray1OfRepresentationItem_SetValue(swigCPtr, this, theIndex,  StepRepr_RepresentationItem.getCPtr(theItem) , theItem);
  }

  public static  StepRepr_HArray1OfRepresentationItem  DownCast( Standard_Transient  T) {
    return new StepRepr_HArray1OfRepresentationItem ( OCCwrapJavaJNI.StepRepr_HArray1OfRepresentationItem_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepRepr_HArray1OfRepresentationItem_TypeOf(), true );
  }

}
