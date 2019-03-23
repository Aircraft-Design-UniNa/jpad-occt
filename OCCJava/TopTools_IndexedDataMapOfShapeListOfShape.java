package opencascade;

public class TopTools_IndexedDataMapOfShapeListOfShape {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TopTools_IndexedDataMapOfShapeListOfShape(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TopTools_IndexedDataMapOfShapeListOfShape(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TopTools_IndexedDataMapOfShapeListOfShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopTools_IndexedDataMapOfShapeListOfShape(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TopTools_IndexedDataMapOfShapeListOfShape() {
    this(OCCwrapJavaJNI.new_TopTools_IndexedDataMapOfShapeListOfShape__SWIG_0(), true);
  }

  public TopTools_IndexedDataMapOfShapeListOfShape(int theNbBuckets,  NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TopTools_IndexedDataMapOfShapeListOfShape__SWIG_1(theNbBuckets,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TopTools_IndexedDataMapOfShapeListOfShape(int theNbBuckets) {
    this(OCCwrapJavaJNI.new_TopTools_IndexedDataMapOfShapeListOfShape__SWIG_2(theNbBuckets), true);
  }

  public TopTools_IndexedDataMapOfShapeListOfShape( TopTools_IndexedDataMapOfShapeListOfShape  theOther) {
    this(OCCwrapJavaJNI.new_TopTools_IndexedDataMapOfShapeListOfShape__SWIG_3(TopTools_IndexedDataMapOfShapeListOfShape.getCPtr(theOther), theOther), true);
  }

  public void Exchange( TopTools_IndexedDataMapOfShapeListOfShape  theOther) {
    OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_Exchange(swigCPtr, this, TopTools_IndexedDataMapOfShapeListOfShape.getCPtr(theOther), theOther);
  }

  public  TopTools_IndexedDataMapOfShapeListOfShape  Assign( TopTools_IndexedDataMapOfShapeListOfShape  theOther) {
    TopTools_IndexedDataMapOfShapeListOfShape ret = new TopTools_IndexedDataMapOfShapeListOfShape(OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_Assign(swigCPtr, this, TopTools_IndexedDataMapOfShapeListOfShape.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void ReSize(int N) {
    OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_ReSize(swigCPtr, this, N);
  }

  public int Add( TopoDS_Shape  theKey1,  TopTools_ListOfShape  theItem) {
    return OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_Add(swigCPtr, this, TopoDS_Shape.getCPtr(theKey1), theKey1, TopTools_ListOfShape.getCPtr(theItem), theItem);
  }

  public long Contains( TopoDS_Shape  theKey1) {
    return OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_Contains(swigCPtr, this, TopoDS_Shape.getCPtr(theKey1), theKey1);
  }

  public void Substitute(int theIndex,  TopoDS_Shape  theKey1,  TopTools_ListOfShape  theItem) {
    OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_Substitute(swigCPtr, this, theIndex, TopoDS_Shape.getCPtr(theKey1), theKey1, TopTools_ListOfShape.getCPtr(theItem), theItem);
  }

  public void Swap(int theIndex1, int theIndex2) {
    OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_Swap(swigCPtr, this, theIndex1, theIndex2);
  }

  public void RemoveLast() {
    OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_RemoveLast(swigCPtr, this);
  }

  public void RemoveFromIndex(int theIndex) {
    OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_RemoveFromIndex(swigCPtr, this, theIndex);
  }

  public void RemoveKey( TopoDS_Shape  theKey1) {
    OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_RemoveKey(swigCPtr, this, TopoDS_Shape.getCPtr(theKey1), theKey1);
  }

  public  TopoDS_Shape  FindKey(int theIndex) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_FindKey(swigCPtr, this, theIndex), true);
    return ret;
  }

  public  TopTools_ListOfShape  FindFromIndex(int theIndex) {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_FindFromIndex(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public  TopTools_ListOfShape  ChangeFromIndex(int theIndex) {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_ChangeFromIndex(swigCPtr, this, theIndex), false, this);
    return ret;
  }

  public int FindIndex( TopoDS_Shape  theKey1) {
    return OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_FindIndex(swigCPtr, this, TopoDS_Shape.getCPtr(theKey1), theKey1);
  }

  public  TopTools_ListOfShape  FindFromKey( TopoDS_Shape  theKey1) {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_FindFromKey__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(theKey1), theKey1), false, this);
    return ret;
  }

  public  TopTools_ListOfShape  ChangeFromKey( TopoDS_Shape  theKey1) {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_ChangeFromKey(swigCPtr, this, TopoDS_Shape.getCPtr(theKey1), theKey1), false, this);
    return ret;
  }

  public long FindFromKey( TopoDS_Shape  theKey1,  TopTools_ListOfShape  theValue) {
    return OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_FindFromKey__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(theKey1), theKey1, TopTools_ListOfShape.getCPtr(theValue), theValue);
  }

  public void Clear(long doReleaseMemory) {
    OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_Clear__SWIG_0(swigCPtr, this, doReleaseMemory);
  }

  public void Clear() {
    OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_Clear__SWIG_1(swigCPtr, this);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_Clear__SWIG_2(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public int Size() {
    return OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_Size(swigCPtr, this);
  }

}
