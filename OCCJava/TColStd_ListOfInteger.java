package opencascade;

public class TColStd_ListOfInteger {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_ListOfInteger(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_ListOfInteger(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_ListOfInteger obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_ListOfInteger(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_ListOfInteger() {
    this(OCCwrapJavaJNI.new_TColStd_ListOfInteger__SWIG_0(), true);
  }

  public TColStd_ListOfInteger( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TColStd_ListOfInteger__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TColStd_ListOfInteger( TColStd_ListOfInteger  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_ListOfInteger__SWIG_2(TColStd_ListOfInteger.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_ListOfInteger_Size(swigCPtr, this);
  }

  public  TColStd_ListOfInteger  Assign( TColStd_ListOfInteger  theOther) {
    TColStd_ListOfInteger ret = new TColStd_ListOfInteger(OCCwrapJavaJNI.TColStd_ListOfInteger_Assign(swigCPtr, this, TColStd_ListOfInteger.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TColStd_ListOfInteger_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.TColStd_ListOfInteger_Clear__SWIG_1(swigCPtr, this);
  }

  public  int  First() { return OCCwrapJavaJNI.TColStd_ListOfInteger_First(swigCPtr, this); }

  public  int  Last() { return OCCwrapJavaJNI.TColStd_ListOfInteger_Last(swigCPtr, this); }

  public int[] Append( int  theItem) {return OCCwrapJavaJNI.TColStd_ListOfInteger_Append__SWIG_0(swigCPtr, this,  theItem );}

  public void Append( int  theItem,  TColStd_ListOfInteger_Iterator  theIter) {
    OCCwrapJavaJNI.TColStd_ListOfInteger_Append__SWIG_1(swigCPtr, this,  theItem ,  TColStd_ListOfInteger_Iterator.getCPtr(theIter) , theIter);
  }

  public void Append( TColStd_ListOfInteger  theOther) {
    OCCwrapJavaJNI.TColStd_ListOfInteger_Append__SWIG_2(swigCPtr, this, TColStd_ListOfInteger.getCPtr(theOther), theOther);
  }

  public int[] Prepend( int  theItem) {return OCCwrapJavaJNI.TColStd_ListOfInteger_Prepend__SWIG_0(swigCPtr, this,  theItem );}

  public void Prepend( TColStd_ListOfInteger  theOther) {
    OCCwrapJavaJNI.TColStd_ListOfInteger_Prepend__SWIG_1(swigCPtr, this, TColStd_ListOfInteger.getCPtr(theOther), theOther);
  }

  public void RemoveFirst() {
    OCCwrapJavaJNI.TColStd_ListOfInteger_RemoveFirst(swigCPtr, this);
  }

  public void Remove( TColStd_ListOfInteger_Iterator  theIter) {
    OCCwrapJavaJNI.TColStd_ListOfInteger_Remove(swigCPtr, this,  TColStd_ListOfInteger_Iterator.getCPtr(theIter) , theIter);
  }

  public int[] InsertBefore( int  theItem,  TColStd_ListOfInteger_Iterator  theIter) {return OCCwrapJavaJNI.TColStd_ListOfInteger_InsertBefore__SWIG_0(swigCPtr, this,  theItem ,  TColStd_ListOfInteger_Iterator.getCPtr(theIter) , theIter);}

  public void InsertBefore( TColStd_ListOfInteger  theOther,  TColStd_ListOfInteger_Iterator  theIter) {
    OCCwrapJavaJNI.TColStd_ListOfInteger_InsertBefore__SWIG_1(swigCPtr, this, TColStd_ListOfInteger.getCPtr(theOther), theOther,  TColStd_ListOfInteger_Iterator.getCPtr(theIter) , theIter);
  }

  public int[] InsertAfter( int  theItem,  TColStd_ListOfInteger_Iterator  theIter) {return OCCwrapJavaJNI.TColStd_ListOfInteger_InsertAfter__SWIG_0(swigCPtr, this,  theItem ,  TColStd_ListOfInteger_Iterator.getCPtr(theIter) , theIter);}

  public void InsertAfter( TColStd_ListOfInteger  theOther,  TColStd_ListOfInteger_Iterator  theIter) {
    OCCwrapJavaJNI.TColStd_ListOfInteger_InsertAfter__SWIG_1(swigCPtr, this, TColStd_ListOfInteger.getCPtr(theOther), theOther,  TColStd_ListOfInteger_Iterator.getCPtr(theIter) , theIter);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TColStd_ListOfInteger_Reverse(swigCPtr, this);
  }

}
