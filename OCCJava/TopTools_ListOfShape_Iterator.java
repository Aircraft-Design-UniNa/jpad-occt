package opencascade;

public class TopTools_ListOfShape_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TopTools_ListOfShape_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TopTools_ListOfShape_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TopTools_ListOfShape_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopTools_ListOfShape_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TopTools_ListOfShape_Iterator(TopTools_ListOfShape arg0) {
    this(OCCwrapJavaJNI.new_TopTools_ListOfShape_Iterator(TopTools_ListOfShape.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TopTools_ListOfShape_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TopTools_ListOfShape_Iterator_Next(swigCPtr, this);
  }

  public  TopoDS_Shape  Value() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_ListOfShape_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public TopoDS_Shape ChangeValue() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_ListOfShape_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new TopoDS_Shape.CRef (ret);
  }

}
