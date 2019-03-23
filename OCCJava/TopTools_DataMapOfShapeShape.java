package opencascade;

public class TopTools_DataMapOfShapeShape {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TopTools_DataMapOfShapeShape(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TopTools_DataMapOfShapeShape(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TopTools_DataMapOfShapeShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopTools_DataMapOfShapeShape(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TopTools_DataMapOfShapeShape() {
    this(OCCwrapJavaJNI.new_TopTools_DataMapOfShapeShape__SWIG_0(), true);
  }

  public TopTools_DataMapOfShapeShape(int theNbBuckets,  NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TopTools_DataMapOfShapeShape__SWIG_1(theNbBuckets,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TopTools_DataMapOfShapeShape(int theNbBuckets) {
    this(OCCwrapJavaJNI.new_TopTools_DataMapOfShapeShape__SWIG_2(theNbBuckets), true);
  }

  public TopTools_DataMapOfShapeShape( TopTools_DataMapOfShapeShape  theOther) {
    this(OCCwrapJavaJNI.new_TopTools_DataMapOfShapeShape__SWIG_3(TopTools_DataMapOfShapeShape.getCPtr(theOther), theOther), true);
  }

  public void Exchange( TopTools_DataMapOfShapeShape  theOther) {
    OCCwrapJavaJNI.TopTools_DataMapOfShapeShape_Exchange(swigCPtr, this, TopTools_DataMapOfShapeShape.getCPtr(theOther), theOther);
  }

  public  TopTools_DataMapOfShapeShape  Assign( TopTools_DataMapOfShapeShape  theOther) {
    TopTools_DataMapOfShapeShape ret = new TopTools_DataMapOfShapeShape(OCCwrapJavaJNI.TopTools_DataMapOfShapeShape_Assign(swigCPtr, this, TopTools_DataMapOfShapeShape.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void ReSize(int N) {
    OCCwrapJavaJNI.TopTools_DataMapOfShapeShape_ReSize(swigCPtr, this, N);
  }

  public long Bind( TopoDS_Shape  theKey,  TopoDS_Shape  theItem) {
    return OCCwrapJavaJNI.TopTools_DataMapOfShapeShape_Bind(swigCPtr, this, TopoDS_Shape.getCPtr(theKey), theKey, TopoDS_Shape.getCPtr(theItem), theItem);
  }

  public long IsBound( TopoDS_Shape  theKey) {
    return OCCwrapJavaJNI.TopTools_DataMapOfShapeShape_IsBound(swigCPtr, this, TopoDS_Shape.getCPtr(theKey), theKey);
  }

  public long UnBind( TopoDS_Shape  theKey) {
    return OCCwrapJavaJNI.TopTools_DataMapOfShapeShape_UnBind(swigCPtr, this, TopoDS_Shape.getCPtr(theKey), theKey);
  }

  public  TopoDS_Shape  Find( TopoDS_Shape  theKey) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_DataMapOfShapeShape_Find__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(theKey), theKey), true);
    return ret;
  }

  public long Find( TopoDS_Shape  theKey, TopoDS_Shape theValue) {
    return OCCwrapJavaJNI.TopTools_DataMapOfShapeShape_Find__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(theKey), theKey, TopoDS_Shape.getCPtr(theValue), theValue);
  }

  public TopoDS_Shape ChangeFind( TopoDS_Shape  theKey) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_DataMapOfShapeShape_ChangeFind(swigCPtr, this, TopoDS_Shape.getCPtr(theKey), theKey), false, this);
    return ret; //new TopoDS_Shape.CRef (ret);
  }

  public void Clear(long doReleaseMemory) {
    OCCwrapJavaJNI.TopTools_DataMapOfShapeShape_Clear__SWIG_0(swigCPtr, this, doReleaseMemory);
  }

  public void Clear() {
    OCCwrapJavaJNI.TopTools_DataMapOfShapeShape_Clear__SWIG_1(swigCPtr, this);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TopTools_DataMapOfShapeShape_Clear__SWIG_2(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public int Size() {
    return OCCwrapJavaJNI.TopTools_DataMapOfShapeShape_Size(swigCPtr, this);
  }

}
