package opencascade;

/**
 *  Rebuilds edges to connect with new vertices, was moved from ShapeBuild.
 *  Makes vertices to be shared to connect edges,
 *  updates positions and tolerances for shared vertices.
 *  Accepts edges bounded by two vertices each.
 */
public class ShapeFix_EdgeConnect {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeFix_EdgeConnect(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeFix_EdgeConnect(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeFix_EdgeConnect obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeFix_EdgeConnect(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ShapeFix_EdgeConnect() {
    this(OCCwrapJavaJNI.new_ShapeFix_EdgeConnect(), true);
  }

  /**
   *  Adds information on connectivity between start vertex
   *  of second edge and end vertex of first edge,
   *  taking edges orientation into account
   */
  public void Add( TopoDS_Edge  aFirst,  TopoDS_Edge  aSecond) {
    OCCwrapJavaJNI.ShapeFix_EdgeConnect_Add__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(aFirst), aFirst, TopoDS_Edge.getCPtr(aSecond), aSecond);
  }

  /**
   *  Adds connectivity information for the whole shape.
   *  Note: edges in wires must be well ordered
   *  Note: flag Closed should be set for closed wires
   */
  public void Add( TopoDS_Shape  aShape) {
    OCCwrapJavaJNI.ShapeFix_EdgeConnect_Add__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(aShape), aShape);
  }

  /**
   *  Builds shared vertices, updates their positions and tolerances
   */
  public void Build() {
    OCCwrapJavaJNI.ShapeFix_EdgeConnect_Build(swigCPtr, this);
  }

  /**
   *  Clears internal data structure
   */
  public void Clear() {
    OCCwrapJavaJNI.ShapeFix_EdgeConnect_Clear(swigCPtr, this);
  }

}
