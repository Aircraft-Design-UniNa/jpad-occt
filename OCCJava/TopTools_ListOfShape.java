package opencascade;

public class TopTools_ListOfShape {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TopTools_ListOfShape(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TopTools_ListOfShape(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TopTools_ListOfShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopTools_ListOfShape(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TopTools_ListOfShape() {
    this(OCCwrapJavaJNI.new_TopTools_ListOfShape__SWIG_0(), true);
  }

  public TopTools_ListOfShape( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_TopTools_ListOfShape__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public TopTools_ListOfShape( TopTools_ListOfShape  theOther) {
    this(OCCwrapJavaJNI.new_TopTools_ListOfShape__SWIG_2(TopTools_ListOfShape.getCPtr(theOther), theOther), true);
  }

  public int Size() {
    return OCCwrapJavaJNI.TopTools_ListOfShape_Size(swigCPtr, this);
  }

  public  TopTools_ListOfShape  Assign( TopTools_ListOfShape  theOther) {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.TopTools_ListOfShape_Assign(swigCPtr, this, TopTools_ListOfShape.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public void Clear( NCollection_BaseAllocator  theAllocator) {
    OCCwrapJavaJNI.TopTools_ListOfShape_Clear__SWIG_0(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator);
  }

  public void Clear() {
    OCCwrapJavaJNI.TopTools_ListOfShape_Clear__SWIG_1(swigCPtr, this);
  }

  public  TopoDS_Shape  First() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_ListOfShape_First(swigCPtr, this), true);
    return ret;
  }

  public  TopoDS_Shape  Last() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_ListOfShape_Last(swigCPtr, this), true);
    return ret;
  }

  public TopoDS_Shape Append( TopoDS_Shape  theItem) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_ListOfShape_Append__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(theItem), theItem), false, this);
    return ret; //new TopoDS_Shape.CRef (ret);
  }

  public void Append( TopoDS_Shape  theItem,  TopTools_ListOfShape_Iterator  theIter) {
    OCCwrapJavaJNI.TopTools_ListOfShape_Append__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(theItem), theItem,  TopTools_ListOfShape_Iterator.getCPtr(theIter) , theIter);
  }

  public void Append( TopTools_ListOfShape  theOther) {
    OCCwrapJavaJNI.TopTools_ListOfShape_Append__SWIG_2(swigCPtr, this, TopTools_ListOfShape.getCPtr(theOther), theOther);
  }

  public TopoDS_Shape Prepend( TopoDS_Shape  theItem) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_ListOfShape_Prepend__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(theItem), theItem), false, this);
    return ret; //new TopoDS_Shape.CRef (ret);
  }

  public void Prepend( TopTools_ListOfShape  theOther) {
    OCCwrapJavaJNI.TopTools_ListOfShape_Prepend__SWIG_1(swigCPtr, this, TopTools_ListOfShape.getCPtr(theOther), theOther);
  }

  public void RemoveFirst() {
    OCCwrapJavaJNI.TopTools_ListOfShape_RemoveFirst(swigCPtr, this);
  }

  public void Remove( TopTools_ListOfShape_Iterator  theIter) {
    OCCwrapJavaJNI.TopTools_ListOfShape_Remove(swigCPtr, this,  TopTools_ListOfShape_Iterator.getCPtr(theIter) , theIter);
  }

  public TopoDS_Shape InsertBefore( TopoDS_Shape  theItem,  TopTools_ListOfShape_Iterator  theIter) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_ListOfShape_InsertBefore__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(theItem), theItem,  TopTools_ListOfShape_Iterator.getCPtr(theIter) , theIter), false, this);
    return ret; //new TopoDS_Shape.CRef (ret);
  }

  public void InsertBefore( TopTools_ListOfShape  theOther,  TopTools_ListOfShape_Iterator  theIter) {
    OCCwrapJavaJNI.TopTools_ListOfShape_InsertBefore__SWIG_1(swigCPtr, this, TopTools_ListOfShape.getCPtr(theOther), theOther,  TopTools_ListOfShape_Iterator.getCPtr(theIter) , theIter);
  }

  public TopoDS_Shape InsertAfter( TopoDS_Shape  theItem,  TopTools_ListOfShape_Iterator  theIter) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_ListOfShape_InsertAfter__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(theItem), theItem,  TopTools_ListOfShape_Iterator.getCPtr(theIter) , theIter), false, this);
    return ret; //new TopoDS_Shape.CRef (ret);
  }

  public void InsertAfter( TopTools_ListOfShape  theOther,  TopTools_ListOfShape_Iterator  theIter) {
    OCCwrapJavaJNI.TopTools_ListOfShape_InsertAfter__SWIG_1(swigCPtr, this, TopTools_ListOfShape.getCPtr(theOther), theOther,  TopTools_ListOfShape_Iterator.getCPtr(theIter) , theIter);
  }

  public void Reverse() {
    OCCwrapJavaJNI.TopTools_ListOfShape_Reverse(swigCPtr, this);
  }

}
