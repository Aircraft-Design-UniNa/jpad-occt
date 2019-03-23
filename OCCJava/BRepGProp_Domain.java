package opencascade;

/**
 *  Arc iterator. Returns only Forward and Reversed edges from
 *  the face in an undigested order.
 */
public class BRepGProp_Domain {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepGProp_Domain(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepGProp_Domain(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepGProp_Domain obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepGProp_Domain(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor.
   */
  public BRepGProp_Domain() {
    this(OCCwrapJavaJNI.new_BRepGProp_Domain__SWIG_0(), true);
  }

  /**
   *  Constructor. Initializes the domain with the face.
   */
  public BRepGProp_Domain( TopoDS_Face  F) {
    this(OCCwrapJavaJNI.new_BRepGProp_Domain__SWIG_1(TopoDS_Face.getCPtr(F), F), true);
  }

  /**
   *  Initializes the domain with the face.
   */
  public void Init( TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepGProp_Domain_Init__SWIG_0(swigCPtr, this, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Returns True if there is another arc of curve in the list.
   */
  public long More() {
    return OCCwrapJavaJNI.BRepGProp_Domain_More(swigCPtr, this);
  }

  /**
   *  Initializes the exploration with the face already set.
   */
  public void Init() {
    OCCwrapJavaJNI.BRepGProp_Domain_Init__SWIG_1(swigCPtr, this);
  }

  /**
   *  Returns the current edge.
   */
  public  TopoDS_Edge  Value() {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepGProp_Domain_Value(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Sets the index of the arc iterator to the next arc of
   *  curve.
   */
  public void Next() {
    OCCwrapJavaJNI.BRepGProp_Domain_Next(swigCPtr, this);
  }

}
