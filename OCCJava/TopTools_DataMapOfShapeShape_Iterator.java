package opencascade;

public class TopTools_DataMapOfShapeShape_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TopTools_DataMapOfShapeShape_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TopTools_DataMapOfShapeShape_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TopTools_DataMapOfShapeShape_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopTools_DataMapOfShapeShape_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TopTools_DataMapOfShapeShape_Iterator(TopTools_DataMapOfShapeShape arg0) {
    this(OCCwrapJavaJNI.new_TopTools_DataMapOfShapeShape_Iterator(TopTools_DataMapOfShapeShape.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TopTools_DataMapOfShapeShape_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TopTools_DataMapOfShapeShape_Iterator_Next(swigCPtr, this);
  }

  public  TopoDS_Shape  Key() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_DataMapOfShapeShape_Iterator_Key(swigCPtr, this), true);
    return ret;
  }

  public  TopoDS_Shape  Value() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_DataMapOfShapeShape_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public TopoDS_Shape ChangeValue() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_DataMapOfShapeShape_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new TopoDS_Shape.CRef (ret);
  }

}
