package opencascade;

/**
 *  The WireExplorer is a tool to explore the edges of
 *  a wire in a connection order.
 * 
 *  i.e. each edge is connected to the previous one by
 *  its origin.
 *  If a wire is not closed returns only a segment of edges which
 *  length depends on started in exploration edge. 
 *  Algorithm suggests that wire is valid and has no any defects, which 
 *  can stop edge exploration. Such defects can be loops, wrong orientation of edges
 *  (two edges go in to shared vertex or go out from shared vertex), branching of edges, 
 *  the presens of edges with INTERNAL or EXTERNAL orientation. If wire has
 *  such kind of defects WireExplorer can return not all
 *  edges in a wire. it depends on type of defect and position of starting edge.
 */
public class BRepTools_WireExplorer {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepTools_WireExplorer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepTools_WireExplorer(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepTools_WireExplorer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepTools_WireExplorer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructs an empty explorer (which can be initialized using Init)
   */
  public BRepTools_WireExplorer() {
    this(OCCwrapJavaJNI.new_BRepTools_WireExplorer__SWIG_0(), true);
  }

  /**
   *  IInitializes an exploration  of the wire <W>.
   */
  public BRepTools_WireExplorer( TopoDS_Wire  W) {
    this(OCCwrapJavaJNI.new_BRepTools_WireExplorer__SWIG_1(TopoDS_Wire.getCPtr(W), W), true);
  }

  /**
   *  Initializes an exploration  of the wire <W>.
   *  F is used to select the edge connected to the
   *  previous in the parametric representation of <F>.
   */
  public BRepTools_WireExplorer( TopoDS_Wire  W,  TopoDS_Face  F) {
    this(OCCwrapJavaJNI.new_BRepTools_WireExplorer__SWIG_2(TopoDS_Wire.getCPtr(W), W, TopoDS_Face.getCPtr(F), F), true);
  }

  /**
   *  Initializes an exploration of the wire <W>.
   */
  public void Init( TopoDS_Wire  W) {
    OCCwrapJavaJNI.BRepTools_WireExplorer_Init__SWIG_0(swigCPtr, this, TopoDS_Wire.getCPtr(W), W);
  }

  /**
   *  Initializes an exploration of the wire <W>.
   *  F is used to select the edge connected to the
   *  previous in the parametric representation of <F>.
   */
  public void Init( TopoDS_Wire  W,  TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepTools_WireExplorer_Init__SWIG_1(swigCPtr, this, TopoDS_Wire.getCPtr(W), W, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Initializes an exploration of the wire <W>.
   *  F is used to select the edge connected to the
   *  previous in the parametric representation of <F>.
   *  <UMIn>, <UMax>, <VMin>, <VMax> - the UV bounds of the face <F>.
   */
  public void Init( TopoDS_Wire  W,  TopoDS_Face  F, double UMin, double UMax, double VMin, double VMax) {
    OCCwrapJavaJNI.BRepTools_WireExplorer_Init__SWIG_2(swigCPtr, this, TopoDS_Wire.getCPtr(W), W, TopoDS_Face.getCPtr(F), F, UMin, UMax, VMin, VMax);
  }

  /**
   *  Returns True if there  is a current  edge.
   */
  public long More() {
    return OCCwrapJavaJNI.BRepTools_WireExplorer_More(swigCPtr, this);
  }

  /**
   *  Proceeds to the next edge.
   */
  public void Next() {
    OCCwrapJavaJNI.BRepTools_WireExplorer_Next(swigCPtr, this);
  }

  /**
   *  Returns the current edge.
   */
  public  TopoDS_Edge  Current() {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepTools_WireExplorer_Current(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns an Orientation for the current edge.
   */
  public TopAbs_Orientation Orientation() {
    return TopAbs_Orientation.swigToEnum(OCCwrapJavaJNI.BRepTools_WireExplorer_Orientation(swigCPtr, this));
  }

  /**
   *  Returns the vertex connecting the current  edge to
   *  the previous one.
   */
  public  TopoDS_Vertex  CurrentVertex() {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.BRepTools_WireExplorer_CurrentVertex(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Clears the content of the explorer.
   */
  public void Clear() {
    OCCwrapJavaJNI.BRepTools_WireExplorer_Clear(swigCPtr, this);
  }

}
