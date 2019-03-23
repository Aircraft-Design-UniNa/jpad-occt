package opencascade;

/**
 *  This class is intended to output free bounds of the shape
 *  (free bounds are the wires consisting of edges referenced by the
 *  only face).
 *  This class works on two distinct types of shapes when analyzing
 *  their free bounds:
 *  1. compound of faces.
 *  Analyzer of sewing algorithm (BRepAlgo_Sewing) is used for
 *  for forecasting free bounds that would be obtained after
 *  performing sewing
 *  2. compound of shells.
 *  Actual free bounds (edges shared by the only face in the shell)
 *  are output in this case. ShapeAnalysis_Shell is used for that.
 * 
 *  When connecting edges into the wires algorithm tries to build
 *  wires of maximum length. Two options are provided for a user
 *  to extract closed sub-contours out of closed and/or open contours.
 * 
 *  Free bounds are returned as two compounds, one for closed and one
 *  for open wires.
 * 
 *  This class also provides some static methods for advanced use:
 *  connecting edges/wires to wires, extracting closed sub-wires out
 *  of wires, dispatching wires into compounds for closed and open
 *  wires.
 *  NOTE. Ends of the edge or wire mean hereafter their end vertices.
 */
public class ShapeAnalysis_FreeBounds {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeAnalysis_FreeBounds(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeAnalysis_FreeBounds(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeAnalysis_FreeBounds obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeAnalysis_FreeBounds(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor
   */
  public ShapeAnalysis_FreeBounds() {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_FreeBounds__SWIG_0(), true);
  }

  /**
   *  Builds forecasting free bounds of the <shape>.
   *  <shape> should be a compound of faces.
   *  This constructor is to be used for forecasting free edges
   *  with help of sewing analyzer BRepAlgo_Sewing which is called
   *  with tolerance <toler>.
   *  Free edges are connected into wires only when their ends are
   *  at distance less than <toler>.
   *  If <splitclosed> is True extracts closed sub-wires out of
   *  built closed wires.
   *  If <splitopen> is True extracts closed sub-wires out of
   *  built open wires.
   */
  public ShapeAnalysis_FreeBounds( TopoDS_Shape  shape, double toler, long splitclosed, long splitopen) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_FreeBounds__SWIG_1(TopoDS_Shape.getCPtr(shape), shape, toler, splitclosed, splitopen), true);
  }

  /**
   *  Builds actual free bounds of the <shape>.
   *  <shape> should be a compound of shells.
   *  This constructor is to be used for getting free edges (ones
   *  referenced by the only face) with help of analyzer
   *  ShapeAnalysis_Shell.
   *  Free edges are connected into wires only when they share the
   *  same vertex.
   *  If <splitclosed> is True extracts closed sub-wires out of
   *  built closed wires.
   *  If <splitopen> is True extracts closed sub-wires out of
   *  built open wires.
   */
  public ShapeAnalysis_FreeBounds( TopoDS_Shape  shape, double toler, long splitclosed) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_FreeBounds__SWIG_2(TopoDS_Shape.getCPtr(shape), shape, toler, splitclosed), true);
  }

  public ShapeAnalysis_FreeBounds( TopoDS_Shape  shape, double toler) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_FreeBounds__SWIG_3(TopoDS_Shape.getCPtr(shape), shape, toler), true);
  }

  public ShapeAnalysis_FreeBounds( TopoDS_Shape  shape, long splitclosed, long splitopen, long checkinternaledges) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_FreeBounds__SWIG_4(TopoDS_Shape.getCPtr(shape), shape, splitclosed, splitopen, checkinternaledges), true);
  }

  public ShapeAnalysis_FreeBounds( TopoDS_Shape  shape, long splitclosed, long splitopen) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_FreeBounds__SWIG_5(TopoDS_Shape.getCPtr(shape), shape, splitclosed, splitopen), true);
  }

  public ShapeAnalysis_FreeBounds( TopoDS_Shape  shape, long splitclosed) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_FreeBounds__SWIG_6(TopoDS_Shape.getCPtr(shape), shape, splitclosed), true);
  }

  public ShapeAnalysis_FreeBounds( TopoDS_Shape  shape) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_FreeBounds__SWIG_7(TopoDS_Shape.getCPtr(shape), shape), true);
  }

  /**
   *  Returns compound of closed wires out of free edges.
   */
  public  TopoDS_Compound  GetClosedWires() {
    TopoDS_Compound ret = new TopoDS_Compound(OCCwrapJavaJNI.ShapeAnalysis_FreeBounds_GetClosedWires(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns compound of open wires out of free edges.
   */
  public  TopoDS_Compound  GetOpenWires() {
    TopoDS_Compound ret = new TopoDS_Compound(OCCwrapJavaJNI.ShapeAnalysis_FreeBounds_GetOpenWires(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Builds sequnce of <wires> out of sequence of not sorted
   *  <edges>.
   *  Tries to build wires of maximum length. Building a wire is
   *  stopped when no edges can be connected to it at its head or
   *  at its tail.
   * 
   *  Orientation of the edge can change when connecting.
   *  If <shared> is True connection is performed only when
   *  adjacent edges share the same vertex.
   *  If <shared> is False connection is performed only when
   *  ends of adjacent edges are at distance less than <toler>.
   */
  public static void ConnectEdgesToWires( TopTools_HSequenceOfShape  edges, double toler, long shared,  TopTools_HSequenceOfShape  wires) {
    OCCwrapJavaJNI.ShapeAnalysis_FreeBounds_ConnectEdgesToWires( TopTools_HSequenceOfShape.getCPtr(edges) , edges, toler, shared,  TopTools_HSequenceOfShape.getCPtr(wires) , wires);
  }

  public static void ConnectWiresToWires( TopTools_HSequenceOfShape  iwires, double toler, long shared,  TopTools_HSequenceOfShape  owires) {
    OCCwrapJavaJNI.ShapeAnalysis_FreeBounds_ConnectWiresToWires__SWIG_0( TopTools_HSequenceOfShape.getCPtr(iwires) , iwires, toler, shared,  TopTools_HSequenceOfShape.getCPtr(owires) , owires);
  }

  /**
   *  Builds sequnce of <owires> out of sequence of not sorted
   *  <iwires>.
   *  Tries to build wires of maximum length. Building a wire is
   *  stopped when no wires can be connected to it at its head or
   *  at its tail.
   * 
   *  Orientation of the wire can change when connecting.
   *  If <shared> is True connection is performed only when
   *  adjacent wires share the same vertex.
   *  If <shared> is False connection is performed only when
   *  ends of adjacent wires are at distance less than <toler>.
   *  Map <vertices> stores the correspondence between original
   *  end vertices of the wires and new connecting vertices.
   */
  public static void ConnectWiresToWires( TopTools_HSequenceOfShape  iwires, double toler, long shared,  TopTools_HSequenceOfShape  owires,  TopTools_DataMapOfShapeShape  vertices) {
    OCCwrapJavaJNI.ShapeAnalysis_FreeBounds_ConnectWiresToWires__SWIG_1( TopTools_HSequenceOfShape.getCPtr(iwires) , iwires, toler, shared,  TopTools_HSequenceOfShape.getCPtr(owires) , owires, TopTools_DataMapOfShapeShape.getCPtr(vertices), vertices);
  }

  /**
   *  Extracts closed sub-wires out of <wires> and adds them
   *  to <closed>, open wires remained after extraction are put
   *  into <open>.
   *  If <shared> is True extraction is performed only when
   *  edges share the same vertex.
   *  If <shared> is False connection is performed only when
   *  ends of the edges are at distance less than <toler>.
   */
  public static void SplitWires( TopTools_HSequenceOfShape  wires, double toler, long shared,  TopTools_HSequenceOfShape  closed,  TopTools_HSequenceOfShape  open) {
    OCCwrapJavaJNI.ShapeAnalysis_FreeBounds_SplitWires( TopTools_HSequenceOfShape.getCPtr(wires) , wires, toler, shared,  TopTools_HSequenceOfShape.getCPtr(closed) , closed,  TopTools_HSequenceOfShape.getCPtr(open) , open);
  }

  /**
   *  Dispatches sequence of <wires> into two compounds
   *  <closed> for closed wires and <open> for open wires.
   *  If a compound is not empty wires are added into it.
   */
  public static void DispatchWires( TopTools_HSequenceOfShape  wires, TopoDS_Compound closed, TopoDS_Compound open) {
    OCCwrapJavaJNI.ShapeAnalysis_FreeBounds_DispatchWires( TopTools_HSequenceOfShape.getCPtr(wires) , wires, TopoDS_Compound.getCPtr(closed), closed, TopoDS_Compound.getCPtr(open), open);
  }

}
