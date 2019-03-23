package opencascade;

public class StepToTopoDS_DataMapOfRI {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepToTopoDS_DataMapOfRI(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepToTopoDS_DataMapOfRI(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepToTopoDS_DataMapOfRI obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_DataMapOfRI(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepToTopoDS_DataMapOfRI() {
    this(OCCwrapJavaJNI.new_StepToTopoDS_DataMapOfRI__SWIG_0(), true);
  }

  public StepToTopoDS_DataMapOfRI(int theNbBuckets,  NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_DataMapOfRI__SWIG_1(theNbBuckets,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public StepToTopoDS_DataMapOfRI(int theNbBuckets) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_DataMapOfRI__SWIG_2(theNbBuckets), true);
  }

  public StepToTopoDS_DataMapOfRI( StepToTopoDS_DataMapOfRI  theOther) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_DataMapOfRI__SWIG_3(StepToTopoDS_DataMapOfRI.getCPtr(theOther), theOther), true);
  }

  public void Exchange( StepToTopoDS_DataMapOfRI  theOther) {
    OCCwrapJavaJNI.StepToTopoDS_DataMapOfRI_Exchange(swigCPtr, this, StepToTopoDS_DataMapOfRI.getCPtr(theOther), theOther);
  }

  public  StepToTopoDS_DataMapOfRI  Assign( StepToTopoDS_DataMapOfRI  theOther) {
    StepToTopoDS_DataMapOfRI ret = new StepToTopoDS_DataMapOfRI(OCCwrapJavaJNI.StepToTopoDS_DataMapOfRI_Assign(swigCPtr, this, StepToTopoDS_DataMapOfRI.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void ReSize(int N) {
    OCCwrapJavaJNI.StepToTopoDS_DataMapOfRI_ReSize(swigCPtr, this, N);
  }

  public long Bind( StepRepr_RepresentationItem  theKey,  TopoDS_Shape  theItem) {
    return OCCwrapJavaJNI.StepToTopoDS_DataMapOfRI_Bind(swigCPtr, this,  StepRepr_RepresentationItem.getCPtr(theKey) , theKey, TopoDS_Shape.getCPtr(theItem), theItem);
  }

  public long IsBound( StepRepr_RepresentationItem  theKey) {
    return OCCwrapJavaJNI.StepToTopoDS_DataMapOfRI_IsBound(swigCPtr, this,  StepRepr_RepresentationItem.getCPtr(theKey) , theKey);
  }

  public long UnBind( StepRepr_RepresentationItem  theKey) {
    return OCCwrapJavaJNI.StepToTopoDS_DataMapOfRI_UnBind(swigCPtr, this,  StepRepr_RepresentationItem.getCPtr(theKey) , theKey);
  }

  public  TopoDS_Shape  Find( StepRepr_RepresentationItem  theKey) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_DataMapOfRI_Find__SWIG_0(swigCPtr, this,  StepRepr_RepresentationItem.getCPtr(theKey) , theKey), true);
    return ret;
  }

  public long Find( StepRepr_RepresentationItem  theKey, TopoDS_Shape theValue) {
    return OCCwrapJavaJNI.StepToTopoDS_DataMapOfRI_Find__SWIG_1(swigCPtr, this,  StepRepr_RepresentationItem.getCPtr(theKey) , theKey, TopoDS_Shape.getCPtr(theValue), theValue);
  }

  public TopoDS_Shape ChangeFind( StepRepr_RepresentationItem  theKey) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_DataMapOfRI_ChangeFind(swigCPtr, this,  StepRepr_RepresentationItem.getCPtr(theKey) , theKey), false, this);
    return ret; //new TopoDS_Shape.CRef (ret);
  }

  public void Clear(long doReleaseMemory) {
    OCCwrapJavaJNI.StepToTopoDS_DataMapOfRI_Clear__SWIG_0(swigCPtr, this, doReleaseMemory);
  }

  public void Clear() {
    OCCwrapJavaJNI.StepToTopoDS_DataMapOfRI_Clear__SWIG_1(swigCPtr, this);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.StepToTopoDS_DataMapOfRI_Clear__SWIG_2(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public int Size() {
    return OCCwrapJavaJNI.StepToTopoDS_DataMapOfRI_Size(swigCPtr, this);
  }

}
