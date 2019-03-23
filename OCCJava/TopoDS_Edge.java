package opencascade;

/**
 *  Describes an edge which
 *  - references an underlying edge with the potential to
 *  be given a location and an orientation
 *  - has a location for the underlying edge, giving its
 *  placement in the local coordinate system
 *  - has an orientation for the underlying edge, in terms
 *  of its geometry (as opposed to orientation in
 *  relation to other shapes).
 */
public class TopoDS_Edge extends TopoDS_Shape {
  private long swigCPtr;
  TopoDS_Edge(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.TopoDS_Edge_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn);
  }

  TopoDS_Edge(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.TopoDS_Edge_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn, Parent);
  }

  static long getCPtr(TopoDS_Edge obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object
  // requiring explicit decision to use it either as a reference or as a copy
  /*public class CRef {
    public CRef (TopoDS_Edge ptr) { Ptr = ptr; }
    public TopoDS_Edge AsReference () { return Ptr; }
    public TopoDS_Edge AsCopy () { return Ptr.MakeCopy(); }
    public TopoDS_Edge Ptr;
  }*/ 
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopoDS_Edge(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Undefined Edge.
   */
  public TopoDS_Edge() {
    this(OCCwrapJavaJNI.new_TopoDS_Edge(), true);
  }

}
