package opencascade;

public class StepToTopoDS_PointVertexMap {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepToTopoDS_PointVertexMap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepToTopoDS_PointVertexMap(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepToTopoDS_PointVertexMap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_PointVertexMap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepToTopoDS_PointVertexMap() {
    this(OCCwrapJavaJNI.new_StepToTopoDS_PointVertexMap__SWIG_0(), true);
  }

  public StepToTopoDS_PointVertexMap(int theNbBuckets,  NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_PointVertexMap__SWIG_1(theNbBuckets,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public StepToTopoDS_PointVertexMap(int theNbBuckets) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_PointVertexMap__SWIG_2(theNbBuckets), true);
  }

  public StepToTopoDS_PointVertexMap( StepToTopoDS_PointVertexMap  theOther) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_PointVertexMap__SWIG_3(StepToTopoDS_PointVertexMap.getCPtr(theOther), theOther), true);
  }

  public void Exchange( StepToTopoDS_PointVertexMap  theOther) {
    OCCwrapJavaJNI.StepToTopoDS_PointVertexMap_Exchange(swigCPtr, this, StepToTopoDS_PointVertexMap.getCPtr(theOther), theOther);
  }

  public  StepToTopoDS_PointVertexMap  Assign( StepToTopoDS_PointVertexMap  theOther) {
    StepToTopoDS_PointVertexMap ret = new StepToTopoDS_PointVertexMap(OCCwrapJavaJNI.StepToTopoDS_PointVertexMap_Assign(swigCPtr, this, StepToTopoDS_PointVertexMap.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void ReSize(int N) {
    OCCwrapJavaJNI.StepToTopoDS_PointVertexMap_ReSize(swigCPtr, this, N);
  }

  public long Bind( StepGeom_CartesianPoint  theKey,  TopoDS_Vertex  theItem) {
    return OCCwrapJavaJNI.StepToTopoDS_PointVertexMap_Bind(swigCPtr, this,  StepGeom_CartesianPoint.getCPtr(theKey) , theKey, TopoDS_Vertex.getCPtr(theItem), theItem);
  }

  public long IsBound( StepGeom_CartesianPoint  theKey) {
    return OCCwrapJavaJNI.StepToTopoDS_PointVertexMap_IsBound(swigCPtr, this,  StepGeom_CartesianPoint.getCPtr(theKey) , theKey);
  }

  public long UnBind( StepGeom_CartesianPoint  theKey) {
    return OCCwrapJavaJNI.StepToTopoDS_PointVertexMap_UnBind(swigCPtr, this,  StepGeom_CartesianPoint.getCPtr(theKey) , theKey);
  }

  public  TopoDS_Vertex  Find( StepGeom_CartesianPoint  theKey) {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.StepToTopoDS_PointVertexMap_Find__SWIG_0(swigCPtr, this,  StepGeom_CartesianPoint.getCPtr(theKey) , theKey), true);
    return ret;
  }

  public long Find( StepGeom_CartesianPoint  theKey, TopoDS_Vertex theValue) {
    return OCCwrapJavaJNI.StepToTopoDS_PointVertexMap_Find__SWIG_1(swigCPtr, this,  StepGeom_CartesianPoint.getCPtr(theKey) , theKey, TopoDS_Vertex.getCPtr(theValue), theValue);
  }

  public TopoDS_Vertex ChangeFind( StepGeom_CartesianPoint  theKey) {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.StepToTopoDS_PointVertexMap_ChangeFind(swigCPtr, this,  StepGeom_CartesianPoint.getCPtr(theKey) , theKey), false, this);
    return ret; //new TopoDS_Vertex.CRef (ret);
  }

  public void Clear(long doReleaseMemory) {
    OCCwrapJavaJNI.StepToTopoDS_PointVertexMap_Clear__SWIG_0(swigCPtr, this, doReleaseMemory);
  }

  public void Clear() {
    OCCwrapJavaJNI.StepToTopoDS_PointVertexMap_Clear__SWIG_1(swigCPtr, this);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.StepToTopoDS_PointVertexMap_Clear__SWIG_2(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public int Size() {
    return OCCwrapJavaJNI.StepToTopoDS_PointVertexMap_Size(swigCPtr, this);
  }

}
