package opencascade;

/**
 *  Describes a wire which
 *  - references an underlying wire with the potential to
 *  be given a location and an orientation
 *  - has a location for the underlying wire, giving its
 *  placement in the local coordinate system
 *  - has an orientation for the underlying wire, in terms
 *  of its geometry (as opposed to orientation in relation to other shapes).
 */
public class TopoDS_Wire extends TopoDS_Shape {
  private long swigCPtr;
  TopoDS_Wire(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.TopoDS_Wire_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn);
  }

  TopoDS_Wire(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.TopoDS_Wire_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn, Parent);
  }

  static long getCPtr(TopoDS_Wire obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object
  // requiring explicit decision to use it either as a reference or as a copy
  /*public class CRef {
    public CRef (TopoDS_Wire ptr) { Ptr = ptr; }
    public TopoDS_Wire AsReference () { return Ptr; }
    public TopoDS_Wire AsCopy () { return Ptr.MakeCopy(); }
    public TopoDS_Wire Ptr;
  }*/ 
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopoDS_Wire(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Undefined Wire.
   */
  public TopoDS_Wire() {
    this(OCCwrapJavaJNI.new_TopoDS_Wire(), true);
  }

}
