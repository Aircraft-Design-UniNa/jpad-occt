package opencascade;

/**
 *  This class is intended to output free bounds of the shape
 *  (free bounds are the wires consisting of edges referenced by the
 *  only face).
 *  For building free bounds it uses ShapeAnalysis_FreeBounds class.
 *  This class complements it with the feature to reduce the number
 *  of open wires.
 *  This reduction is performed with help of connecting several
 *  adjacent open wires one to another what can lead to:
 *  1. making an open wire with greater length out of several
 *  open wires
 *  2. making closed wire out of several open wires
 * 
 *  The connecting open wires is performed with a user-given
 *  tolerance.
 * 
 *  When connecting several open wires into one wire their previous
 *  end vertices are replaced with new connecting vertices. After
 *  that all the edges in the shape sharing previous vertices inside
 *  the shape are updated with new vertices. Thus source shape can
 *  be modified.
 * 
 *  Since interface of this class is the same as one of
 *  ShapeAnalysis_FreeBounds refer to its CDL for details.
 */
public class ShapeFix_FreeBounds {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeFix_FreeBounds(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeFix_FreeBounds(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeFix_FreeBounds obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeFix_FreeBounds(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor
   */
  public ShapeFix_FreeBounds() {
    this(OCCwrapJavaJNI.new_ShapeFix_FreeBounds__SWIG_0(), true);
  }

  /**
   *  Builds forecasting free bounds of the <shape> and connects
   *  open wires with tolerance <closetoler>.
   *  <shape> should be a compound of faces.
   *  Tolerance <closetoler> should be greater than tolerance
   *  <sewtoler> used for initializing sewing analyzer, otherwise
   *  connection of open wires is not performed.
   */
  public ShapeFix_FreeBounds( TopoDS_Shape  shape, double sewtoler, double closetoler, long splitclosed, long splitopen) {
    this(OCCwrapJavaJNI.new_ShapeFix_FreeBounds__SWIG_1(TopoDS_Shape.getCPtr(shape), shape, sewtoler, closetoler, splitclosed, splitopen), true);
  }

  /**
   *  Builds actual free bounds of the <shape> and connects
   *  open wires with tolerance <closetoler>.
   *  <shape> should be a compound of shells.
   */
  public ShapeFix_FreeBounds( TopoDS_Shape  shape, double closetoler, long splitclosed, long splitopen) {
    this(OCCwrapJavaJNI.new_ShapeFix_FreeBounds__SWIG_2(TopoDS_Shape.getCPtr(shape), shape, closetoler, splitclosed, splitopen), true);
  }

  /**
   *  Returns compound of closed wires out of free edges.
   */
  public  TopoDS_Compound  GetClosedWires() {
    TopoDS_Compound ret = new TopoDS_Compound(OCCwrapJavaJNI.ShapeFix_FreeBounds_GetClosedWires(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns compound of open wires out of free edges.
   */
  public  TopoDS_Compound  GetOpenWires() {
    TopoDS_Compound ret = new TopoDS_Compound(OCCwrapJavaJNI.ShapeFix_FreeBounds_GetOpenWires(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns modified source shape.
   */
  public  TopoDS_Shape  GetShape() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.ShapeFix_FreeBounds_GetShape(swigCPtr, this), true);
    return ret;
  }

}
