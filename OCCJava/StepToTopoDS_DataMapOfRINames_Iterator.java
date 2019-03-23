package opencascade;

public class StepToTopoDS_DataMapOfRINames_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepToTopoDS_DataMapOfRINames_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepToTopoDS_DataMapOfRINames_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepToTopoDS_DataMapOfRINames_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_DataMapOfRINames_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepToTopoDS_DataMapOfRINames_Iterator(StepToTopoDS_DataMapOfRINames arg0) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_DataMapOfRINames_Iterator(StepToTopoDS_DataMapOfRINames.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.StepToTopoDS_DataMapOfRINames_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.StepToTopoDS_DataMapOfRINames_Iterator_Next(swigCPtr, this);
  }

  public  TCollection_AsciiString  Key() {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.StepToTopoDS_DataMapOfRINames_Iterator_Key(swigCPtr, this), true);
    return ret;
  }

  public  TopoDS_Shape  Value() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_DataMapOfRINames_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public TopoDS_Shape ChangeValue() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_DataMapOfRINames_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new TopoDS_Shape.CRef (ret);
  }

}
