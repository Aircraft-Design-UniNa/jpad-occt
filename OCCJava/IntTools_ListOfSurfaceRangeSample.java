package opencascade;

public class IntTools_ListOfSurfaceRangeSample {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntTools_ListOfSurfaceRangeSample(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntTools_ListOfSurfaceRangeSample(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntTools_ListOfSurfaceRangeSample obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntTools_ListOfSurfaceRangeSample(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntTools_ListOfSurfaceRangeSample() {
    this(OCCwrapJavaJNI.new_IntTools_ListOfSurfaceRangeSample__SWIG_0(), true);
  }

  public IntTools_ListOfSurfaceRangeSample( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_IntTools_ListOfSurfaceRangeSample__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public IntTools_ListOfSurfaceRangeSample( IntTools_ListOfSurfaceRangeSample  theOther) {
    this(OCCwrapJavaJNI.new_IntTools_ListOfSurfaceRangeSample__SWIG_2(IntTools_ListOfSurfaceRangeSample.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_Size(swigCPtr, this);
  }

  public  IntTools_ListOfSurfaceRangeSample  Assign( IntTools_ListOfSurfaceRangeSample  theOther) {
    IntTools_ListOfSurfaceRangeSample ret = new IntTools_ListOfSurfaceRangeSample(OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_Assign(swigCPtr, this, IntTools_ListOfSurfaceRangeSample.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_Clear__SWIG_1(swigCPtr, this);
  }

  public  IntTools_SurfaceRangeSample  First() {
    IntTools_SurfaceRangeSample ret = new IntTools_SurfaceRangeSample(OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_First(swigCPtr, this), false, this);
    return ret;
  }

  public  IntTools_SurfaceRangeSample  Last() {
    IntTools_SurfaceRangeSample ret = new IntTools_SurfaceRangeSample(OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_Last(swigCPtr, this), false, this);
    return ret;
  }

  public  IntTools_SurfaceRangeSample  Append( IntTools_SurfaceRangeSample  theItem) {
    IntTools_SurfaceRangeSample ret = new IntTools_SurfaceRangeSample(OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_Append__SWIG_0(swigCPtr, this, IntTools_SurfaceRangeSample.getCPtr(theItem), theItem), false, this);
    return ret;
  }

  public void Append( IntTools_SurfaceRangeSample  theItem,  IntTools_ListOfSurfaceRangeSample_Iterator  theIter) {
    OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_Append__SWIG_1(swigCPtr, this, IntTools_SurfaceRangeSample.getCPtr(theItem), theItem,  IntTools_ListOfSurfaceRangeSample_Iterator.getCPtr(theIter) , theIter);
  }

  public void Append( IntTools_ListOfSurfaceRangeSample  theOther) {
    OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_Append__SWIG_2(swigCPtr, this, IntTools_ListOfSurfaceRangeSample.getCPtr(theOther), theOther);
  }

  public  IntTools_SurfaceRangeSample  Prepend( IntTools_SurfaceRangeSample  theItem) {
    IntTools_SurfaceRangeSample ret = new IntTools_SurfaceRangeSample(OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_Prepend__SWIG_0(swigCPtr, this, IntTools_SurfaceRangeSample.getCPtr(theItem), theItem), false, this);
    return ret;
  }

  public void Prepend( IntTools_ListOfSurfaceRangeSample  theOther) {
    OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_Prepend__SWIG_1(swigCPtr, this, IntTools_ListOfSurfaceRangeSample.getCPtr(theOther), theOther);
  }

  public void RemoveFirst() {
    OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_RemoveFirst(swigCPtr, this);
  }

  public void Remove( IntTools_ListOfSurfaceRangeSample_Iterator  theIter) {
    OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_Remove(swigCPtr, this,  IntTools_ListOfSurfaceRangeSample_Iterator.getCPtr(theIter) , theIter);
  }

  public  IntTools_SurfaceRangeSample  InsertBefore( IntTools_SurfaceRangeSample  theItem,  IntTools_ListOfSurfaceRangeSample_Iterator  theIter) {
    IntTools_SurfaceRangeSample ret = new IntTools_SurfaceRangeSample(OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_InsertBefore__SWIG_0(swigCPtr, this, IntTools_SurfaceRangeSample.getCPtr(theItem), theItem,  IntTools_ListOfSurfaceRangeSample_Iterator.getCPtr(theIter) , theIter), false, this);
    return ret;
  }

  public void InsertBefore( IntTools_ListOfSurfaceRangeSample  theOther,  IntTools_ListOfSurfaceRangeSample_Iterator  theIter) {
    OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_InsertBefore__SWIG_1(swigCPtr, this, IntTools_ListOfSurfaceRangeSample.getCPtr(theOther), theOther,  IntTools_ListOfSurfaceRangeSample_Iterator.getCPtr(theIter) , theIter);
  }

  public  IntTools_SurfaceRangeSample  InsertAfter( IntTools_SurfaceRangeSample  theItem,  IntTools_ListOfSurfaceRangeSample_Iterator  theIter) {
    IntTools_SurfaceRangeSample ret = new IntTools_SurfaceRangeSample(OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_InsertAfter__SWIG_0(swigCPtr, this, IntTools_SurfaceRangeSample.getCPtr(theItem), theItem,  IntTools_ListOfSurfaceRangeSample_Iterator.getCPtr(theIter) , theIter), false, this);
    return ret;
  }

  public void InsertAfter( IntTools_ListOfSurfaceRangeSample  theOther,  IntTools_ListOfSurfaceRangeSample_Iterator  theIter) {
    OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_InsertAfter__SWIG_1(swigCPtr, this, IntTools_ListOfSurfaceRangeSample.getCPtr(theOther), theOther,  IntTools_ListOfSurfaceRangeSample_Iterator.getCPtr(theIter) , theIter);
  }

  public void Reverse() {
    OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_Reverse(swigCPtr, this);
  }

}
