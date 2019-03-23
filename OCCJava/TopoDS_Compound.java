package opencascade;

/**
 *  Describes a compound which
 *  - references an underlying compound with the
 *  potential to be given a location and an orientation
 *  - has a location for the underlying compound, giving
 *  its placement in the local coordinate system
 *  - has an orientation for the underlying compound, in
 *  terms of its geometry (as opposed to orientation in
 *  relation to other shapes).
 *  Casts shape S to the more specialized return type, Compound.
 */
public class TopoDS_Compound extends TopoDS_Shape {
  private long swigCPtr;
  TopoDS_Compound(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.TopoDS_Compound_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn);
  }

  TopoDS_Compound(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.TopoDS_Compound_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn, Parent);
  }

  static long getCPtr(TopoDS_Compound obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object
  // requiring explicit decision to use it either as a reference or as a copy
  /*public class CRef {
    public CRef (TopoDS_Compound ptr) { Ptr = ptr; }
    public TopoDS_Compound AsReference () { return Ptr; }
    public TopoDS_Compound AsCopy () { return Ptr.MakeCopy(); }
    public TopoDS_Compound Ptr;
  }*/ 
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopoDS_Compound(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Constructs an Undefined Compound.
   */
  public TopoDS_Compound() {
    this(OCCwrapJavaJNI.new_TopoDS_Compound(), true);
  }

}
