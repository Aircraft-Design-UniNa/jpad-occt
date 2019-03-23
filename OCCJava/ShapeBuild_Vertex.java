package opencascade;

/**
 *  Provides low-level functions used for constructing vertices
 */
public class ShapeBuild_Vertex {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeBuild_Vertex(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeBuild_Vertex(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeBuild_Vertex obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeBuild_Vertex(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Combines new vertex from two others. This new one is the
   *  smallest vertex which comprises both of the source vertices.
   *  The function takes into account the positions and tolerances
   *  of the source vertices.
   *  The tolerance of the new vertex will be equal to the minimal
   *  tolerance that is required to comprise source vertices
   *  multiplied by tolFactor (in order to avoid errors because
   *  of discreteness of calculations).
   */
  public TopoDS_Vertex CombineVertex( TopoDS_Vertex  V1,  TopoDS_Vertex  V2, double tolFactor) {
    return new TopoDS_Vertex(OCCwrapJavaJNI.ShapeBuild_Vertex_CombineVertex__SWIG_0(swigCPtr, this, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2, tolFactor), true);
  }

  /**
   *  The same function as above, except that it accepts two points
   *  and two tolerances instead of vertices
   */
  public TopoDS_Vertex CombineVertex( TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    return new TopoDS_Vertex(OCCwrapJavaJNI.ShapeBuild_Vertex_CombineVertex__SWIG_1(swigCPtr, this, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2), true);
  }

  public TopoDS_Vertex CombineVertex( gp_Pnt  pnt1,  gp_Pnt  pnt2, double tol1, double tol2, double tolFactor) {
    return new TopoDS_Vertex(OCCwrapJavaJNI.ShapeBuild_Vertex_CombineVertex__SWIG_2(swigCPtr, this, gp_Pnt.getCPtr(pnt1), pnt1, gp_Pnt.getCPtr(pnt2), pnt2, tol1, tol2, tolFactor), true);
  }

  public TopoDS_Vertex CombineVertex( gp_Pnt  pnt1,  gp_Pnt  pnt2, double tol1, double tol2) {
    return new TopoDS_Vertex(OCCwrapJavaJNI.ShapeBuild_Vertex_CombineVertex__SWIG_3(swigCPtr, this, gp_Pnt.getCPtr(pnt1), pnt1, gp_Pnt.getCPtr(pnt2), pnt2, tol1, tol2), true);
  }

  public ShapeBuild_Vertex() {
    this(OCCwrapJavaJNI.new_ShapeBuild_Vertex(), true);
  }

}
