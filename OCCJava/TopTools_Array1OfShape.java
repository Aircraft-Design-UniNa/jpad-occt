package opencascade;

public class TopTools_Array1OfShape {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TopTools_Array1OfShape(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TopTools_Array1OfShape(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TopTools_Array1OfShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopTools_Array1OfShape(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TopTools_Array1OfShape() {
    this(OCCwrapJavaJNI.new_TopTools_Array1OfShape__SWIG_0(), true);
  }

  public TopTools_Array1OfShape(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TopTools_Array1OfShape__SWIG_1(theLower, theUpper), true);
  }

  public TopTools_Array1OfShape( TopTools_Array1OfShape  theOther) {
    this(OCCwrapJavaJNI.new_TopTools_Array1OfShape__SWIG_2(TopTools_Array1OfShape.getCPtr(theOther), theOther), true);
  }

  public TopTools_Array1OfShape( TopoDS_Shape  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TopTools_Array1OfShape__SWIG_4(TopoDS_Shape.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( TopoDS_Shape  theValue) {
    OCCwrapJavaJNI.TopTools_Array1OfShape_Init(swigCPtr, this, TopoDS_Shape.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.TopTools_Array1OfShape_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TopTools_Array1OfShape_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TopTools_Array1OfShape_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TopTools_Array1OfShape_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TopTools_Array1OfShape_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TopTools_Array1OfShape_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.TopTools_Array1OfShape_IsAllocated(swigCPtr, this);
  }

  public  TopTools_Array1OfShape  Assign( TopTools_Array1OfShape  theOther) {
    TopTools_Array1OfShape ret = new TopTools_Array1OfShape(OCCwrapJavaJNI.TopTools_Array1OfShape_Assign(swigCPtr, this, TopTools_Array1OfShape.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TopTools_Array1OfShape  Move( TopTools_Array1OfShape  theOther) {
    TopTools_Array1OfShape ret = new TopTools_Array1OfShape(OCCwrapJavaJNI.TopTools_Array1OfShape_Move(swigCPtr, this, TopTools_Array1OfShape.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TopoDS_Shape  First() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_Array1OfShape_First(swigCPtr, this), true);
    return ret;
  }

  public TopoDS_Shape ChangeFirst() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_Array1OfShape_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new TopoDS_Shape.CRef (ret);
  }

  public  TopoDS_Shape  Last() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_Array1OfShape_Last(swigCPtr, this), true);
    return ret;
  }

  public TopoDS_Shape ChangeLast() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_Array1OfShape_ChangeLast(swigCPtr, this), false, this);
    return ret; //new TopoDS_Shape.CRef (ret);
  }

  public  TopoDS_Shape  Value(int theIndex) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_Array1OfShape_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public TopoDS_Shape ChangeValue(int theIndex) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_Array1OfShape_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new TopoDS_Shape.CRef (ret);
  }

  public void SetValue(int theIndex,  TopoDS_Shape  theItem) {
    OCCwrapJavaJNI.TopTools_Array1OfShape_SetValue(swigCPtr, this, theIndex, TopoDS_Shape.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.TopTools_Array1OfShape_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
