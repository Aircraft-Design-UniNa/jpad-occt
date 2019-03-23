package opencascade;

/**
 *  Tool for splitting and cutting edges; includes methods
 *  used in OverlappingTool and IntersectionTool
 */
public class ShapeFix_SplitTool {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeFix_SplitTool(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeFix_SplitTool(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeFix_SplitTool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeFix_SplitTool(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor
   */
  public ShapeFix_SplitTool() {
    this(OCCwrapJavaJNI.new_ShapeFix_SplitTool(), true);
  }

  /**
   *  Split edge on two new edges using new vertex "vert"
   *  and "param" - parameter for splitting
   *  The "face" is necessary for pcurves and using TransferParameterProj
   */
  public long SplitEdge( TopoDS_Edge  edge, double param,  TopoDS_Vertex  vert,  TopoDS_Face  face, TopoDS_Edge newE1, TopoDS_Edge newE2, double tol3d, double tol2d) {
    return OCCwrapJavaJNI.ShapeFix_SplitTool_SplitEdge__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, param, TopoDS_Vertex.getCPtr(vert), vert, TopoDS_Face.getCPtr(face), face, TopoDS_Edge.getCPtr(newE1), newE1, TopoDS_Edge.getCPtr(newE2), newE2, tol3d, tol2d);
  }

  /**
   *  Split edge on two new edges using new vertex "vert"
   *  and "param1" and "param2" - parameter for splitting and cutting
   *  The "face" is necessary for pcurves and using TransferParameterProj
   */
  public long SplitEdge( TopoDS_Edge  edge, double param1, double param2,  TopoDS_Vertex  vert,  TopoDS_Face  face, TopoDS_Edge newE1, TopoDS_Edge newE2, double tol3d, double tol2d) {
    return OCCwrapJavaJNI.ShapeFix_SplitTool_SplitEdge__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, param1, param2, TopoDS_Vertex.getCPtr(vert), vert, TopoDS_Face.getCPtr(face), face, TopoDS_Edge.getCPtr(newE1), newE1, TopoDS_Edge.getCPtr(newE2), newE2, tol3d, tol2d);
  }

  /**
   *  Cut edge by parameters pend and cut
   */
  public long CutEdge( TopoDS_Edge  edge, double pend, double cut,  TopoDS_Face  face, long[] iscutline) {
    return OCCwrapJavaJNI.ShapeFix_SplitTool_CutEdge(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, pend, cut, TopoDS_Face.getCPtr(face), face, iscutline);
  }

  /**
   *  Split edge on two new edges using two new vertex V1 and V2
   *  and two parameters for splitting - fp and lp correspondingly
   *  The "face" is necessary for pcurves and using TransferParameterProj
   *  aNum - number of edge in SeqE which corresponding to [fp,lp]
   */
  public long SplitEdge( TopoDS_Edge  edge, double fp,  TopoDS_Vertex  V1, double lp,  TopoDS_Vertex  V2,  TopoDS_Face  face,  TopTools_SequenceOfShape  SeqE, int[] aNum,  ShapeBuild_ReShape  context, double tol3d, double tol2d) {
    return OCCwrapJavaJNI.ShapeFix_SplitTool_SplitEdge__SWIG_2(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, fp, TopoDS_Vertex.getCPtr(V1), V1, lp, TopoDS_Vertex.getCPtr(V2), V2, TopoDS_Face.getCPtr(face), face, TopTools_SequenceOfShape.getCPtr(SeqE), SeqE, aNum,  ShapeBuild_ReShape.getCPtr(context) , context, tol3d, tol2d);
  }

}
