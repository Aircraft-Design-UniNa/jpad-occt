package opencascade;

/**
 *  Modifies tolerances of sub-shapes (vertices, edges, faces)
 */
public class ShapeFix_ShapeTolerance {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeFix_ShapeTolerance(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeFix_ShapeTolerance(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeFix_ShapeTolerance obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeFix_ShapeTolerance(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ShapeFix_ShapeTolerance() {
    this(OCCwrapJavaJNI.new_ShapeFix_ShapeTolerance(), true);
  }

  /**
   *  Limits tolerances in a shape as follows :
   *  tmin = tmax -> as SetTolerance (forces)
   *  tmin = 0   -> maximum tolerance will be <tmax>
   *  tmax = 0 or not given (more generally, tmax < tmin) ->
   *  <tmax> ignored, minimum will be <tmin>
   *  else, maximum will be <max> and minimum will be <min>
   *  styp = VERTEX : only vertices are set
   *  styp = EDGE   : only edges are set
   *  styp = FACE   : only faces are set
   *  styp = WIRE   : to have edges and their vertices set
   *  styp = other value : all (vertices,edges,faces) are set
   *  Returns True if at least one tolerance of the sub-shape has
   *  been modified
   */
  public long LimitTolerance( TopoDS_Shape  shape, double tmin, double tmax, TopAbs_ShapeEnum styp) {
    return OCCwrapJavaJNI.ShapeFix_ShapeTolerance_LimitTolerance__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, tmin, tmax, styp.swigValue());
  }

  public long LimitTolerance( TopoDS_Shape  shape, double tmin, double tmax) {
    return OCCwrapJavaJNI.ShapeFix_ShapeTolerance_LimitTolerance__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, tmin, tmax);
  }

  public long LimitTolerance( TopoDS_Shape  shape, double tmin) {
    return OCCwrapJavaJNI.ShapeFix_ShapeTolerance_LimitTolerance__SWIG_2(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, tmin);
  }

  /**
   *  Sets (enforces) tolerances in a shape to the given value
   *  styp = VERTEX : only vertices are set
   *  styp = EDGE   : only edges are set
   *  styp = FACE   : only faces are set
   *  styp = WIRE   : to have edges and their vertices set
   *  styp = other value : all (vertices,edges,faces) are set
   */
  public void SetTolerance( TopoDS_Shape  shape, double preci, TopAbs_ShapeEnum styp) {
    OCCwrapJavaJNI.ShapeFix_ShapeTolerance_SetTolerance__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, preci, styp.swigValue());
  }

  public void SetTolerance( TopoDS_Shape  shape, double preci) {
    OCCwrapJavaJNI.ShapeFix_ShapeTolerance_SetTolerance__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, preci);
  }

}
