package opencascade;

public class TopTools_IndexedDataMapOfShapeListOfShape_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TopTools_IndexedDataMapOfShapeListOfShape_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TopTools_IndexedDataMapOfShapeListOfShape_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TopTools_IndexedDataMapOfShapeListOfShape_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopTools_IndexedDataMapOfShapeListOfShape_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TopTools_IndexedDataMapOfShapeListOfShape_Iterator(TopTools_IndexedDataMapOfShapeListOfShape arg0) {
    this(OCCwrapJavaJNI.new_TopTools_IndexedDataMapOfShapeListOfShape_Iterator(TopTools_IndexedDataMapOfShapeListOfShape.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_Iterator_Next(swigCPtr, this);
  }

  public  TopoDS_Shape  Key() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_Iterator_Key(swigCPtr, this), true);
    return ret;
  }

  public  TopTools_ListOfShape  Value() {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_Iterator_Value(swigCPtr, this), false, this);
    return ret;
  }

  public  TopTools_ListOfShape  ChangeValue() {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.TopTools_IndexedDataMapOfShapeListOfShape_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret;
  }

}
