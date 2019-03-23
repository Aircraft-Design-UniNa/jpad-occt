package opencascade;

/**
 *  Tool for fixing selfintersecting wire
 *  and intersecting wires
 */
public class ShapeFix_IntersectionTool {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeFix_IntersectionTool(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeFix_IntersectionTool(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeFix_IntersectionTool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeFix_IntersectionTool(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructor
   */
  public ShapeFix_IntersectionTool( ShapeBuild_ReShape  context, double preci, double maxtol) {
    this(OCCwrapJavaJNI.new_ShapeFix_IntersectionTool__SWIG_0( ShapeBuild_ReShape.getCPtr(context) , context, preci, maxtol), true);
  }

  public ShapeFix_IntersectionTool( ShapeBuild_ReShape  context, double preci) {
    this(OCCwrapJavaJNI.new_ShapeFix_IntersectionTool__SWIG_1( ShapeBuild_ReShape.getCPtr(context) , context, preci), true);
  }

  public  ShapeBuild_ReShape  Context() {
    return new ShapeBuild_ReShape ( OCCwrapJavaJNI.ShapeFix_IntersectionTool_Context(swigCPtr, this), true );
  }

  /**
   *  Split edge on two new edges using new vertex "vert"
   *  and "param" - parameter for splitting
   *  The "face" is necessary for pcurves and using TransferParameterProj
   */
  public long SplitEdge( TopoDS_Edge  edge, double param,  TopoDS_Vertex  vert,  TopoDS_Face  face, TopoDS_Edge newE1, TopoDS_Edge newE2, double preci) {
    return OCCwrapJavaJNI.ShapeFix_IntersectionTool_SplitEdge(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, param, TopoDS_Vertex.getCPtr(vert), vert, TopoDS_Face.getCPtr(face), face, TopoDS_Edge.getCPtr(newE1), newE1, TopoDS_Edge.getCPtr(newE2), newE2, preci);
  }

  /**
   *  Cut edge by parameters pend and cut
   */
  public long CutEdge( TopoDS_Edge  edge, double pend, double cut,  TopoDS_Face  face, long[] iscutline) {
    return OCCwrapJavaJNI.ShapeFix_IntersectionTool_CutEdge(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, pend, cut, TopoDS_Face.getCPtr(face), face, iscutline);
  }

  public long FixSelfIntersectWire( ShapeExtend_WireData  sewd,  TopoDS_Face  face, int[] NbSplit, int[] NbCut, int[] NbRemoved) {
    return OCCwrapJavaJNI.ShapeFix_IntersectionTool_FixSelfIntersectWire(swigCPtr, this,  ShapeExtend_WireData.getCPtr(sewd) , sewd, TopoDS_Face.getCPtr(face), face, NbSplit, NbCut, NbRemoved);
  }

  public long FixIntersectingWires(TopoDS_Face face) {
    return OCCwrapJavaJNI.ShapeFix_IntersectionTool_FixIntersectingWires(swigCPtr, this, TopoDS_Face.getCPtr(face), face);
  }

}
