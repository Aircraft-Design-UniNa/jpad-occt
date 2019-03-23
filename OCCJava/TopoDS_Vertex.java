package opencascade;

/**
 *  Describes a vertex which
 *  - references an underlying vertex with the potential
 *  to be given a location and an orientation
 *  - has a location for the underlying vertex, giving its
 *  placement in the local coordinate system
 *  - has an orientation for the underlying vertex, in
 *  terms of its geometry (as opposed to orientation in
 *  relation to other shapes).
 */
public class TopoDS_Vertex extends TopoDS_Shape {
  private long swigCPtr;
  TopoDS_Vertex(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.TopoDS_Vertex_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn);
  }

  TopoDS_Vertex(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.TopoDS_Vertex_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn, Parent);
  }

  static long getCPtr(TopoDS_Vertex obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object
  // requiring explicit decision to use it either as a reference or as a copy
  /*public class CRef {
    public CRef (TopoDS_Vertex ptr) { Ptr = ptr; }
    public TopoDS_Vertex AsReference () { return Ptr; }
    public TopoDS_Vertex AsCopy () { return Ptr.MakeCopy(); }
    public TopoDS_Vertex Ptr;
  }*/ 
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopoDS_Vertex(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Undefined Vertex.
   */
  public TopoDS_Vertex() {
    this(OCCwrapJavaJNI.new_TopoDS_Vertex(), true);
  }

}
