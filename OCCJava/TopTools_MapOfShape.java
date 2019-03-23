package opencascade;

public class TopTools_MapOfShape {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TopTools_MapOfShape(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TopTools_MapOfShape(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TopTools_MapOfShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopTools_MapOfShape(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TopTools_MapOfShape() {
    this(OCCwrapJavaJNI.new_TopTools_MapOfShape__SWIG_0(), true);
  }

  public TopTools_MapOfShape(int theNbBuckets,  NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TopTools_MapOfShape__SWIG_1(theNbBuckets,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TopTools_MapOfShape(int theNbBuckets) {
    this(OCCwrapJavaJNI.new_TopTools_MapOfShape__SWIG_2(theNbBuckets), true);
  }

  public TopTools_MapOfShape( TopTools_MapOfShape  theOther) {
    this(OCCwrapJavaJNI.new_TopTools_MapOfShape__SWIG_3(TopTools_MapOfShape.getCPtr(theOther), theOther), true);
  }

  public void Exchange( TopTools_MapOfShape  theOther) {
    OCCwrapJavaJNI.TopTools_MapOfShape_Exchange(swigCPtr, this, TopTools_MapOfShape.getCPtr(theOther), theOther);
  }

  public  TopTools_MapOfShape  Assign( TopTools_MapOfShape  theOther) {
    TopTools_MapOfShape ret = new TopTools_MapOfShape(OCCwrapJavaJNI.TopTools_MapOfShape_Assign(swigCPtr, this, TopTools_MapOfShape.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void ReSize(int N) {
    OCCwrapJavaJNI.TopTools_MapOfShape_ReSize(swigCPtr, this, N);
  }

  public long Add( TopoDS_Shape  K) {
    return OCCwrapJavaJNI.TopTools_MapOfShape_Add(swigCPtr, this, TopoDS_Shape.getCPtr(K), K);
  }

  public  TopoDS_Shape  Added( TopoDS_Shape  K) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_MapOfShape_Added(swigCPtr, this, TopoDS_Shape.getCPtr(K), K), true);
    return ret;
  }

  public long Contains( TopoDS_Shape  K) {
    return OCCwrapJavaJNI.TopTools_MapOfShape_Contains__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(K), K);
  }

  public long Remove( TopoDS_Shape  K) {
    return OCCwrapJavaJNI.TopTools_MapOfShape_Remove(swigCPtr, this, TopoDS_Shape.getCPtr(K), K);
  }

  public void Clear(long doReleaseMemory) {
    OCCwrapJavaJNI.TopTools_MapOfShape_Clear__SWIG_0(swigCPtr, this, doReleaseMemory);
  }

  public void Clear() {
    OCCwrapJavaJNI.TopTools_MapOfShape_Clear__SWIG_1(swigCPtr, this);
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TopTools_MapOfShape_Clear__SWIG_2(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public int Size() {
    return OCCwrapJavaJNI.TopTools_MapOfShape_Size(swigCPtr, this);
  }

  public long IsEqual( TopTools_MapOfShape  theOther) {
    return OCCwrapJavaJNI.TopTools_MapOfShape_IsEqual(swigCPtr, this, TopTools_MapOfShape.getCPtr(theOther), theOther);
  }

  public long Contains( TopTools_MapOfShape  theOther) {
    return OCCwrapJavaJNI.TopTools_MapOfShape_Contains__SWIG_1(swigCPtr, this, TopTools_MapOfShape.getCPtr(theOther), theOther);
  }

  public void Union( TopTools_MapOfShape  theLeft,  TopTools_MapOfShape  theRight) {
    OCCwrapJavaJNI.TopTools_MapOfShape_Union(swigCPtr, this, TopTools_MapOfShape.getCPtr(theLeft), theLeft, TopTools_MapOfShape.getCPtr(theRight), theRight);
  }

  public long Unite( TopTools_MapOfShape  theOther) {
    return OCCwrapJavaJNI.TopTools_MapOfShape_Unite(swigCPtr, this, TopTools_MapOfShape.getCPtr(theOther), theOther);
  }

  public long HasIntersection( TopTools_MapOfShape  theMap) {
    return OCCwrapJavaJNI.TopTools_MapOfShape_HasIntersection(swigCPtr, this, TopTools_MapOfShape.getCPtr(theMap), theMap);
  }

  public void Intersection( TopTools_MapOfShape  theLeft,  TopTools_MapOfShape  theRight) {
    OCCwrapJavaJNI.TopTools_MapOfShape_Intersection(swigCPtr, this, TopTools_MapOfShape.getCPtr(theLeft), theLeft, TopTools_MapOfShape.getCPtr(theRight), theRight);
  }

  public long Intersect( TopTools_MapOfShape  theOther) {
    return OCCwrapJavaJNI.TopTools_MapOfShape_Intersect(swigCPtr, this, TopTools_MapOfShape.getCPtr(theOther), theOther);
  }

  public void Subtraction( TopTools_MapOfShape  theLeft,  TopTools_MapOfShape  theRight) {
    OCCwrapJavaJNI.TopTools_MapOfShape_Subtraction(swigCPtr, this, TopTools_MapOfShape.getCPtr(theLeft), theLeft, TopTools_MapOfShape.getCPtr(theRight), theRight);
  }

  public long Subtract( TopTools_MapOfShape  theOther) {
    return OCCwrapJavaJNI.TopTools_MapOfShape_Subtract(swigCPtr, this, TopTools_MapOfShape.getCPtr(theOther), theOther);
  }

  public void Difference( TopTools_MapOfShape  theLeft,  TopTools_MapOfShape  theRight) {
    OCCwrapJavaJNI.TopTools_MapOfShape_Difference(swigCPtr, this, TopTools_MapOfShape.getCPtr(theLeft), theLeft, TopTools_MapOfShape.getCPtr(theRight), theRight);
  }

  public long Differ( TopTools_MapOfShape  theOther) {
    return OCCwrapJavaJNI.TopTools_MapOfShape_Differ(swigCPtr, this, TopTools_MapOfShape.getCPtr(theOther), theOther);
  }

}
