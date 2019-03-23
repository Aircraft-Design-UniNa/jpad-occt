package opencascade;

public class StepRepr_Array1OfRepresentationItem {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepRepr_Array1OfRepresentationItem(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepRepr_Array1OfRepresentationItem(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepRepr_Array1OfRepresentationItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepRepr_Array1OfRepresentationItem(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepRepr_Array1OfRepresentationItem() {
    this(OCCwrapJavaJNI.new_StepRepr_Array1OfRepresentationItem__SWIG_0(), true);
  }

  public StepRepr_Array1OfRepresentationItem(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepRepr_Array1OfRepresentationItem__SWIG_1(theLower, theUpper), true);
  }

  public StepRepr_Array1OfRepresentationItem( StepRepr_Array1OfRepresentationItem  theOther) {
    this(OCCwrapJavaJNI.new_StepRepr_Array1OfRepresentationItem__SWIG_2(StepRepr_Array1OfRepresentationItem.getCPtr(theOther), theOther), true);
  }

  public StepRepr_Array1OfRepresentationItem( StepRepr_RepresentationItem  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_StepRepr_Array1OfRepresentationItem__SWIG_4( StepRepr_RepresentationItem.getCPtr(theBegin) , theBegin, theLower, theUpper), true);
  }

  public void Init( StepRepr_RepresentationItem  theValue) {
    OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_Init(swigCPtr, this,  StepRepr_RepresentationItem.getCPtr(theValue) , theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_IsAllocated(swigCPtr, this);
  }

  public  StepRepr_Array1OfRepresentationItem  Assign( StepRepr_Array1OfRepresentationItem  theOther) {
    StepRepr_Array1OfRepresentationItem ret = new StepRepr_Array1OfRepresentationItem(OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_Assign(swigCPtr, this, StepRepr_Array1OfRepresentationItem.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepRepr_Array1OfRepresentationItem  Move( StepRepr_Array1OfRepresentationItem  theOther) {
    StepRepr_Array1OfRepresentationItem ret = new StepRepr_Array1OfRepresentationItem(OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_Move(swigCPtr, this, StepRepr_Array1OfRepresentationItem.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepRepr_RepresentationItem  First() {
    return new StepRepr_RepresentationItem ( OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_First(swigCPtr, this), true );
  }

  public  StepRepr_RepresentationItem  ChangeFirst() {
    return new StepRepr_RepresentationItem ( OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_ChangeFirst(swigCPtr, this), true );
  }

  public  StepRepr_RepresentationItem  Last() {
    return new StepRepr_RepresentationItem ( OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_Last(swigCPtr, this), true );
  }

  public  StepRepr_RepresentationItem  ChangeLast() {
    return new StepRepr_RepresentationItem ( OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_ChangeLast(swigCPtr, this), true );
  }

  public  StepRepr_RepresentationItem  Value(int theIndex) {
    return new StepRepr_RepresentationItem ( OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_Value(swigCPtr, this, theIndex), true );
  }

  public  StepRepr_RepresentationItem  ChangeValue(int theIndex) {
    return new StepRepr_RepresentationItem ( OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  StepRepr_RepresentationItem  theItem) {
    OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_SetValue(swigCPtr, this, theIndex,  StepRepr_RepresentationItem.getCPtr(theItem) , theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.StepRepr_Array1OfRepresentationItem_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
