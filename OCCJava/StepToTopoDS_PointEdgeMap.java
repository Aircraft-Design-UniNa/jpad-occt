package opencascade;

public class StepToTopoDS_PointEdgeMap {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepToTopoDS_PointEdgeMap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepToTopoDS_PointEdgeMap(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepToTopoDS_PointEdgeMap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_PointEdgeMap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepToTopoDS_PointEdgeMap() {
    this(OCCwrapJavaJNI.new_StepToTopoDS_PointEdgeMap__SWIG_0(), true);
  }

  public StepToTopoDS_PointEdgeMap(int theNbBuckets,  NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_PointEdgeMap__SWIG_1(theNbBuckets,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public StepToTopoDS_PointEdgeMap(int theNbBuckets) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_PointEdgeMap__SWIG_2(theNbBuckets), true);
  }

  public StepToTopoDS_PointEdgeMap( StepToTopoDS_PointEdgeMap  theOther) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_PointEdgeMap__SWIG_3(StepToTopoDS_PointEdgeMap.getCPtr(theOther), theOther), true);
  }

  public void Exchange( StepToTopoDS_PointEdgeMap  theOther) {
    OCCwrapJavaJNI.StepToTopoDS_PointEdgeMap_Exchange(swigCPtr, this, StepToTopoDS_PointEdgeMap.getCPtr(theOther), theOther);
  }

  public  StepToTopoDS_PointEdgeMap  Assign( StepToTopoDS_PointEdgeMap  theOther) {
    StepToTopoDS_PointEdgeMap ret = new StepToTopoDS_PointEdgeMap(OCCwrapJavaJNI.StepToTopoDS_PointEdgeMap_Assign(swigCPtr, this, StepToTopoDS_PointEdgeMap.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void ReSize(int N) {
    OCCwrapJavaJNI.StepToTopoDS_PointEdgeMap_ReSize(swigCPtr, this, N);
  }

  public long Bind( StepToTopoDS_PointPair  theKey,  TopoDS_Edge  theItem) {
    return OCCwrapJavaJNI.StepToTopoDS_PointEdgeMap_Bind(swigCPtr, this, StepToTopoDS_PointPair.getCPtr(theKey), theKey, TopoDS_Edge.getCPtr(theItem), theItem);
  }

  public long IsBound( StepToTopoDS_PointPair  theKey) {
    return OCCwrapJavaJNI.StepToTopoDS_PointEdgeMap_IsBound(swigCPtr, this, StepToTopoDS_PointPair.getCPtr(theKey), theKey);
  }

  public long UnBind( StepToTopoDS_PointPair  theKey) {
    return OCCwrapJavaJNI.StepToTopoDS_PointEdgeMap_UnBind(swigCPtr, this, StepToTopoDS_PointPair.getCPtr(theKey), theKey);
  }

  public  TopoDS_Edge  Find( StepToTopoDS_PointPair  theKey) {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.StepToTopoDS_PointEdgeMap_Find__SWIG_0(swigCPtr, this, StepToTopoDS_PointPair.getCPtr(theKey), theKey), true);
    return ret;
  }

  public long Find( StepToTopoDS_PointPair  theKey, TopoDS_Edge theValue) {
    return OCCwrapJavaJNI.StepToTopoDS_PointEdgeMap_Find__SWIG_1(swigCPtr, this, StepToTopoDS_PointPair.getCPtr(theKey), theKey, TopoDS_Edge.getCPtr(theValue), theValue);
  }

  public TopoDS_Edge ChangeFind( StepToTopoDS_PointPair  theKey) {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.StepToTopoDS_PointEdgeMap_ChangeFind(swigCPtr, this, StepToTopoDS_PointPair.getCPtr(theKey), theKey), false, this);
    return ret; //new TopoDS_Edge.CRef (ret);
  }

  public void Clear(long doReleaseMemory) {
    OCCwrapJavaJNI.StepToTopoDS_PointEdgeMap_Clear__SWIG_0(swigCPtr, this, doReleaseMemory);
  }

  public void Clear() {
    OCCwrapJavaJNI.StepToTopoDS_PointEdgeMap_Clear__SWIG_1(swigCPtr, this);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.StepToTopoDS_PointEdgeMap_Clear__SWIG_2(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public int Size() {
    return OCCwrapJavaJNI.StepToTopoDS_PointEdgeMap_Size(swigCPtr, this);
  }

}
