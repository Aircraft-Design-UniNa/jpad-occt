package opencascade;

/**
 *  Describes a solid shape which
 *  - references an underlying solid shape with the
 *  potential to be given a location and an orientation
 *  - has a location for the underlying shape, giving its
 *  placement in the local coordinate system
 *  - has an orientation for the underlying shape, in
 *  terms of its geometry (as opposed to orientation in
 *  relation to other shapes).
 */
public class TopoDS_Solid extends TopoDS_Shape {
  private long swigCPtr;
  TopoDS_Solid(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.TopoDS_Solid_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn);
  }

  TopoDS_Solid(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.TopoDS_Solid_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn, Parent);
  }

  static long getCPtr(TopoDS_Solid obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object
  // requiring explicit decision to use it either as a reference or as a copy
  /*public class CRef {
    public CRef (TopoDS_Solid ptr) { Ptr = ptr; }
    public TopoDS_Solid AsReference () { return Ptr; }
    public TopoDS_Solid AsCopy () { return Ptr.MakeCopy(); }
    public TopoDS_Solid Ptr;
  }*/ 
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopoDS_Solid(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Constructs an Undefined Solid.
   */
  public TopoDS_Solid() {
    this(OCCwrapJavaJNI.new_TopoDS_Solid(), true);
  }

}
