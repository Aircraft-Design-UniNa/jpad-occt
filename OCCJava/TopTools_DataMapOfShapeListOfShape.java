package opencascade;

public class TopTools_DataMapOfShapeListOfShape {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TopTools_DataMapOfShapeListOfShape(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TopTools_DataMapOfShapeListOfShape(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TopTools_DataMapOfShapeListOfShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopTools_DataMapOfShapeListOfShape(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TopTools_DataMapOfShapeListOfShape() {
    this(OCCwrapJavaJNI.new_TopTools_DataMapOfShapeListOfShape__SWIG_0(), true);
  }

  public TopTools_DataMapOfShapeListOfShape(int theNbBuckets,  NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TopTools_DataMapOfShapeListOfShape__SWIG_1(theNbBuckets,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TopTools_DataMapOfShapeListOfShape(int theNbBuckets) {
    this(OCCwrapJavaJNI.new_TopTools_DataMapOfShapeListOfShape__SWIG_2(theNbBuckets), true);
  }

  public TopTools_DataMapOfShapeListOfShape( TopTools_DataMapOfShapeListOfShape  theOther) {
    this(OCCwrapJavaJNI.new_TopTools_DataMapOfShapeListOfShape__SWIG_3(TopTools_DataMapOfShapeListOfShape.getCPtr(theOther), theOther), true);
  }

  public void Exchange( TopTools_DataMapOfShapeListOfShape  theOther) {
    OCCwrapJavaJNI.TopTools_DataMapOfShapeListOfShape_Exchange(swigCPtr, this, TopTools_DataMapOfShapeListOfShape.getCPtr(theOther), theOther);
  }

  public  TopTools_DataMapOfShapeListOfShape  Assign( TopTools_DataMapOfShapeListOfShape  theOther) {
    TopTools_DataMapOfShapeListOfShape ret = new TopTools_DataMapOfShapeListOfShape(OCCwrapJavaJNI.TopTools_DataMapOfShapeListOfShape_Assign(swigCPtr, this, TopTools_DataMapOfShapeListOfShape.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void ReSize(int N) {
    OCCwrapJavaJNI.TopTools_DataMapOfShapeListOfShape_ReSize(swigCPtr, this, N);
  }

  public long Bind( TopoDS_Shape  theKey,  TopTools_ListOfShape  theItem) {
    return OCCwrapJavaJNI.TopTools_DataMapOfShapeListOfShape_Bind(swigCPtr, this, TopoDS_Shape.getCPtr(theKey), theKey, TopTools_ListOfShape.getCPtr(theItem), theItem);
  }

  public long IsBound( TopoDS_Shape  theKey) {
    return OCCwrapJavaJNI.TopTools_DataMapOfShapeListOfShape_IsBound(swigCPtr, this, TopoDS_Shape.getCPtr(theKey), theKey);
  }

  public long UnBind( TopoDS_Shape  theKey) {
    return OCCwrapJavaJNI.TopTools_DataMapOfShapeListOfShape_UnBind(swigCPtr, this, TopoDS_Shape.getCPtr(theKey), theKey);
  }

  public  TopTools_ListOfShape  Find( TopoDS_Shape  theKey) {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.TopTools_DataMapOfShapeListOfShape_Find__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(theKey), theKey), false, this);
    return ret;
  }

  public long Find( TopoDS_Shape  theKey,  TopTools_ListOfShape  theValue) {
    return OCCwrapJavaJNI.TopTools_DataMapOfShapeListOfShape_Find__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(theKey), theKey, TopTools_ListOfShape.getCPtr(theValue), theValue);
  }

  public  TopTools_ListOfShape  ChangeFind( TopoDS_Shape  theKey) {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.TopTools_DataMapOfShapeListOfShape_ChangeFind(swigCPtr, this, TopoDS_Shape.getCPtr(theKey), theKey), false, this);
    return ret;
  }

  public void Clear(long doReleaseMemory) {
    OCCwrapJavaJNI.TopTools_DataMapOfShapeListOfShape_Clear__SWIG_0(swigCPtr, this, doReleaseMemory);
  }

  public void Clear() {
    OCCwrapJavaJNI.TopTools_DataMapOfShapeListOfShape_Clear__SWIG_1(swigCPtr, this);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TopTools_DataMapOfShapeListOfShape_Clear__SWIG_2(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public int Size() {
    return OCCwrapJavaJNI.TopTools_DataMapOfShapeListOfShape_Size(swigCPtr, this);
  }

}
