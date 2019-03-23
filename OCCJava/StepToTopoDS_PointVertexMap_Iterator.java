package opencascade;

public class StepToTopoDS_PointVertexMap_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepToTopoDS_PointVertexMap_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepToTopoDS_PointVertexMap_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepToTopoDS_PointVertexMap_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_PointVertexMap_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepToTopoDS_PointVertexMap_Iterator(StepToTopoDS_PointVertexMap arg0) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_PointVertexMap_Iterator(StepToTopoDS_PointVertexMap.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.StepToTopoDS_PointVertexMap_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.StepToTopoDS_PointVertexMap_Iterator_Next(swigCPtr, this);
  }

  public  StepGeom_CartesianPoint  Key() {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepToTopoDS_PointVertexMap_Iterator_Key(swigCPtr, this), true );
  }

  public  TopoDS_Vertex  Value() {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.StepToTopoDS_PointVertexMap_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public TopoDS_Vertex ChangeValue() {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.StepToTopoDS_PointVertexMap_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new TopoDS_Vertex.CRef (ret);
  }

}
