package opencascade;

/**
 *  Describes a face which
 *  - references an underlying face with the potential to
 *  be given a location and an orientation
 *  - has a location for the underlying face, giving its
 *  placement in the local coordinate system
 *  - has an orientation for the underlying face, in terms
 *  of its geometry (as opposed to orientation in relation to other shapes).
 */
public class TopoDS_Face extends TopoDS_Shape {
  private long swigCPtr;
  TopoDS_Face(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.TopoDS_Face_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn);
  }

  TopoDS_Face(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.TopoDS_Face_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn, Parent);
  }

  static long getCPtr(TopoDS_Face obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object
  // requiring explicit decision to use it either as a reference or as a copy
  /*public class CRef {
    public CRef (TopoDS_Face ptr) { Ptr = ptr; }
    public TopoDS_Face AsReference () { return Ptr; }
    public TopoDS_Face AsCopy () { return Ptr.MakeCopy(); }
    public TopoDS_Face Ptr;
  }*/ 
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopoDS_Face(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Undefined Face.
   */
  public TopoDS_Face() {
    this(OCCwrapJavaJNI.new_TopoDS_Face(), true);
  }

}
