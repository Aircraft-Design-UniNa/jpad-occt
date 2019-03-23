package opencascade;

/**
 *  Describes a shell which
 *  - references an underlying shell with the potential to
 *  be given a location and an orientation
 *  - has a location for the underlying shell, giving its
 *  placement in the local coordinate system
 *  - has an orientation for the underlying shell, in terms
 *  of its geometry (as opposed to orientation in relation to other shapes).
 */
public class TopoDS_Shell extends TopoDS_Shape {
  private long swigCPtr;
  TopoDS_Shell(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.TopoDS_Shell_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn);
  }

  TopoDS_Shell(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.TopoDS_Shell_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn, Parent);
  }

  static long getCPtr(TopoDS_Shell obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object
  // requiring explicit decision to use it either as a reference or as a copy
  /*public class CRef {
    public CRef (TopoDS_Shell ptr) { Ptr = ptr; }
    public TopoDS_Shell AsReference () { return Ptr; }
    public TopoDS_Shell AsCopy () { return Ptr.MakeCopy(); }
    public TopoDS_Shell Ptr;
  }*/ 
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopoDS_Shell(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Constructs an Undefined Shell.
   */
  public TopoDS_Shell() {
    this(OCCwrapJavaJNI.new_TopoDS_Shell(), true);
  }

}
