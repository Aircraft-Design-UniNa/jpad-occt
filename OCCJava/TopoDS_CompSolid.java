package opencascade;

/**
 *  Describes a composite solid which
 *  - references an underlying composite solid with the
 *  potential to be given a location and an orientation
 *  - has a location for the underlying composite solid,
 *  giving its placement in the local coordinate system
 *  - has an orientation for the underlying composite
 *  solid, in terms of its geometry (as opposed to
 *  orientation in relation to other shapes).
 *  Casts shape S to the more specialized return type, CompSolid.
 */
public class TopoDS_CompSolid extends TopoDS_Shape {
  private long swigCPtr;
  TopoDS_CompSolid(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.TopoDS_CompSolid_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn);
  }

  TopoDS_CompSolid(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.TopoDS_CompSolid_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn, Parent);
  }

  static long getCPtr(TopoDS_CompSolid obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object
  // requiring explicit decision to use it either as a reference or as a copy
  /*public class CRef {
    public CRef (TopoDS_CompSolid ptr) { Ptr = ptr; }
    public TopoDS_CompSolid AsReference () { return Ptr; }
    public TopoDS_CompSolid AsCopy () { return Ptr.MakeCopy(); }
    public TopoDS_CompSolid Ptr;
  }*/ 
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopoDS_CompSolid(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Constructs an Undefined CompSolid.
   */
  public TopoDS_CompSolid() {
    this(OCCwrapJavaJNI.new_TopoDS_CompSolid(), true);
  }

}
