package opencascade;

public class TopTools_IndexedMapOfShape {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TopTools_IndexedMapOfShape(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TopTools_IndexedMapOfShape(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TopTools_IndexedMapOfShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopTools_IndexedMapOfShape(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TopTools_IndexedMapOfShape() {
    this(OCCwrapJavaJNI.new_TopTools_IndexedMapOfShape__SWIG_0(), true);
  }

  public TopTools_IndexedMapOfShape(int theNbBuckets,  NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TopTools_IndexedMapOfShape__SWIG_1(theNbBuckets,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TopTools_IndexedMapOfShape(int theNbBuckets) {
    this(OCCwrapJavaJNI.new_TopTools_IndexedMapOfShape__SWIG_2(theNbBuckets), true);
  }

  public TopTools_IndexedMapOfShape( TopTools_IndexedMapOfShape  theOther) {
    this(OCCwrapJavaJNI.new_TopTools_IndexedMapOfShape__SWIG_3(TopTools_IndexedMapOfShape.getCPtr(theOther), theOther), true);
  }

  public void Exchange( TopTools_IndexedMapOfShape  theOther) {
    OCCwrapJavaJNI.TopTools_IndexedMapOfShape_Exchange(swigCPtr, this, TopTools_IndexedMapOfShape.getCPtr(theOther), theOther);
  }

  public  TopTools_IndexedMapOfShape  Assign( TopTools_IndexedMapOfShape  theOther) {
    TopTools_IndexedMapOfShape ret = new TopTools_IndexedMapOfShape(OCCwrapJavaJNI.TopTools_IndexedMapOfShape_Assign(swigCPtr, this, TopTools_IndexedMapOfShape.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void ReSize(int theExtent) {
    OCCwrapJavaJNI.TopTools_IndexedMapOfShape_ReSize(swigCPtr, this, theExtent);
  }

  public int Add( TopoDS_Shape  theKey1) {
    return OCCwrapJavaJNI.TopTools_IndexedMapOfShape_Add(swigCPtr, this, TopoDS_Shape.getCPtr(theKey1), theKey1);
  }

  public long Contains( TopoDS_Shape  theKey1) {
    return OCCwrapJavaJNI.TopTools_IndexedMapOfShape_Contains(swigCPtr, this, TopoDS_Shape.getCPtr(theKey1), theKey1);
  }

  public void Substitute(int theIndex,  TopoDS_Shape  theKey1) {
    OCCwrapJavaJNI.TopTools_IndexedMapOfShape_Substitute(swigCPtr, this, theIndex, TopoDS_Shape.getCPtr(theKey1), theKey1);
  }

  public void Swap(int theIndex1, int theIndex2) {
    OCCwrapJavaJNI.TopTools_IndexedMapOfShape_Swap(swigCPtr, this, theIndex1, theIndex2);
  }

  public void RemoveLast() {
    OCCwrapJavaJNI.TopTools_IndexedMapOfShape_RemoveLast(swigCPtr, this);
  }

  public void RemoveFromIndex(int theIndex) {
    OCCwrapJavaJNI.TopTools_IndexedMapOfShape_RemoveFromIndex(swigCPtr, this, theIndex);
  }

  public long RemoveKey( TopoDS_Shape  theKey1) {
    return OCCwrapJavaJNI.TopTools_IndexedMapOfShape_RemoveKey(swigCPtr, this, TopoDS_Shape.getCPtr(theKey1), theKey1);
  }

  public  TopoDS_Shape  FindKey(int theIndex) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_IndexedMapOfShape_FindKey(swigCPtr, this, theIndex), true);
    return ret;
  }

  public int FindIndex( TopoDS_Shape  theKey1) {
    return OCCwrapJavaJNI.TopTools_IndexedMapOfShape_FindIndex(swigCPtr, this, TopoDS_Shape.getCPtr(theKey1), theKey1);
  }

  public void Clear(long doReleaseMemory) {
    OCCwrapJavaJNI.TopTools_IndexedMapOfShape_Clear__SWIG_0(swigCPtr, this, doReleaseMemory);
  }

  public void Clear() {
    OCCwrapJavaJNI.TopTools_IndexedMapOfShape_Clear__SWIG_1(swigCPtr, this);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TopTools_IndexedMapOfShape_Clear__SWIG_2(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public int Size() {
    return OCCwrapJavaJNI.TopTools_IndexedMapOfShape_Size(swigCPtr, this);
  }

}
