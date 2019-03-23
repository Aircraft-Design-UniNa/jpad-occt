package opencascade;

public class StepToTopoDS_PointEdgeMap_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepToTopoDS_PointEdgeMap_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepToTopoDS_PointEdgeMap_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepToTopoDS_PointEdgeMap_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_PointEdgeMap_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepToTopoDS_PointEdgeMap_Iterator(StepToTopoDS_PointEdgeMap arg0) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_PointEdgeMap_Iterator(StepToTopoDS_PointEdgeMap.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.StepToTopoDS_PointEdgeMap_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.StepToTopoDS_PointEdgeMap_Iterator_Next(swigCPtr, this);
  }

  public  StepToTopoDS_PointPair  Key() {
    StepToTopoDS_PointPair ret = new StepToTopoDS_PointPair(OCCwrapJavaJNI.StepToTopoDS_PointEdgeMap_Iterator_Key(swigCPtr, this), false, this);
    return ret;
  }

  public  TopoDS_Edge  Value() {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.StepToTopoDS_PointEdgeMap_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public TopoDS_Edge ChangeValue() {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.StepToTopoDS_PointEdgeMap_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new TopoDS_Edge.CRef (ret);
  }

}
