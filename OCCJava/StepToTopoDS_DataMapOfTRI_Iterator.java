package opencascade;

public class StepToTopoDS_DataMapOfTRI_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepToTopoDS_DataMapOfTRI_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepToTopoDS_DataMapOfTRI_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepToTopoDS_DataMapOfTRI_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_DataMapOfTRI_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepToTopoDS_DataMapOfTRI_Iterator(StepToTopoDS_DataMapOfTRI arg0) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_DataMapOfTRI_Iterator(StepToTopoDS_DataMapOfTRI.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.StepToTopoDS_DataMapOfTRI_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.StepToTopoDS_DataMapOfTRI_Iterator_Next(swigCPtr, this);
  }

  public  StepShape_TopologicalRepresentationItem  Key() {
    return new StepShape_TopologicalRepresentationItem ( OCCwrapJavaJNI.StepToTopoDS_DataMapOfTRI_Iterator_Key(swigCPtr, this), true );
  }

  public  TopoDS_Shape  Value() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_DataMapOfTRI_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public TopoDS_Shape ChangeValue() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_DataMapOfTRI_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new TopoDS_Shape.CRef (ret);
  }

}
