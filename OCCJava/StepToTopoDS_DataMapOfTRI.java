package opencascade;

public class StepToTopoDS_DataMapOfTRI {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepToTopoDS_DataMapOfTRI(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepToTopoDS_DataMapOfTRI(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepToTopoDS_DataMapOfTRI obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_DataMapOfTRI(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepToTopoDS_DataMapOfTRI() {
    this(OCCwrapJavaJNI.new_StepToTopoDS_DataMapOfTRI__SWIG_0(), true);
  }

  public StepToTopoDS_DataMapOfTRI(int theNbBuckets,  NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_DataMapOfTRI__SWIG_1(theNbBuckets,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public StepToTopoDS_DataMapOfTRI(int theNbBuckets) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_DataMapOfTRI__SWIG_2(theNbBuckets), true);
  }

  public StepToTopoDS_DataMapOfTRI( StepToTopoDS_DataMapOfTRI  theOther) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_DataMapOfTRI__SWIG_3(StepToTopoDS_DataMapOfTRI.getCPtr(theOther), theOther), true);
  }

  public void Exchange( StepToTopoDS_DataMapOfTRI  theOther) {
    OCCwrapJavaJNI.StepToTopoDS_DataMapOfTRI_Exchange(swigCPtr, this, StepToTopoDS_DataMapOfTRI.getCPtr(theOther), theOther);
  }

  public  StepToTopoDS_DataMapOfTRI  Assign( StepToTopoDS_DataMapOfTRI  theOther) {
    StepToTopoDS_DataMapOfTRI ret = new StepToTopoDS_DataMapOfTRI(OCCwrapJavaJNI.StepToTopoDS_DataMapOfTRI_Assign(swigCPtr, this, StepToTopoDS_DataMapOfTRI.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void ReSize(int N) {
    OCCwrapJavaJNI.StepToTopoDS_DataMapOfTRI_ReSize(swigCPtr, this, N);
  }

  public long Bind( StepShape_TopologicalRepresentationItem  theKey,  TopoDS_Shape  theItem) {
    return OCCwrapJavaJNI.StepToTopoDS_DataMapOfTRI_Bind(swigCPtr, this,  StepShape_TopologicalRepresentationItem.getCPtr(theKey) , theKey, TopoDS_Shape.getCPtr(theItem), theItem);
  }

  public long IsBound( StepShape_TopologicalRepresentationItem  theKey) {
    return OCCwrapJavaJNI.StepToTopoDS_DataMapOfTRI_IsBound(swigCPtr, this,  StepShape_TopologicalRepresentationItem.getCPtr(theKey) , theKey);
  }

  public long UnBind( StepShape_TopologicalRepresentationItem  theKey) {
    return OCCwrapJavaJNI.StepToTopoDS_DataMapOfTRI_UnBind(swigCPtr, this,  StepShape_TopologicalRepresentationItem.getCPtr(theKey) , theKey);
  }

  public  TopoDS_Shape  Find( StepShape_TopologicalRepresentationItem  theKey) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_DataMapOfTRI_Find__SWIG_0(swigCPtr, this,  StepShape_TopologicalRepresentationItem.getCPtr(theKey) , theKey), true);
    return ret;
  }

  public long Find( StepShape_TopologicalRepresentationItem  theKey, TopoDS_Shape theValue) {
    return OCCwrapJavaJNI.StepToTopoDS_DataMapOfTRI_Find__SWIG_1(swigCPtr, this,  StepShape_TopologicalRepresentationItem.getCPtr(theKey) , theKey, TopoDS_Shape.getCPtr(theValue), theValue);
  }

  public TopoDS_Shape ChangeFind( StepShape_TopologicalRepresentationItem  theKey) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_DataMapOfTRI_ChangeFind(swigCPtr, this,  StepShape_TopologicalRepresentationItem.getCPtr(theKey) , theKey), false, this);
    return ret; //new TopoDS_Shape.CRef (ret);
  }

  public void Clear(long doReleaseMemory) {
    OCCwrapJavaJNI.StepToTopoDS_DataMapOfTRI_Clear__SWIG_0(swigCPtr, this, doReleaseMemory);
  }

  public void Clear() {
    OCCwrapJavaJNI.StepToTopoDS_DataMapOfTRI_Clear__SWIG_1(swigCPtr, this);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.StepToTopoDS_DataMapOfTRI_Clear__SWIG_2(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public int Size() {
    return OCCwrapJavaJNI.StepToTopoDS_DataMapOfTRI_Size(swigCPtr, this);
  }

}
