package opencascade;

/**
 *  Create a  shape by sweeping a shape  (the profile)
 *  along a wire (the spine).
 * 
 *  For each edge  or vertex from the spine  the  user
 *  may ask for the shape generated from each subshape
 *  of the profile.
 */
public class BRepFill_Pipe {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepFill_Pipe(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepFill_Pipe(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepFill_Pipe obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepFill_Pipe(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BRepFill_Pipe() {
    this(OCCwrapJavaJNI.new_BRepFill_Pipe__SWIG_0(), true);
  }

  public BRepFill_Pipe( TopoDS_Wire  Spine,  TopoDS_Shape  Profile, GeomFill_Trihedron aMode, long ForceApproxC1, long GeneratePartCase) {
    this(OCCwrapJavaJNI.new_BRepFill_Pipe__SWIG_1(TopoDS_Wire.getCPtr(Spine), Spine, TopoDS_Shape.getCPtr(Profile), Profile, aMode.swigValue(), ForceApproxC1, GeneratePartCase), true);
  }

  public BRepFill_Pipe( TopoDS_Wire  Spine,  TopoDS_Shape  Profile, GeomFill_Trihedron aMode, long ForceApproxC1) {
    this(OCCwrapJavaJNI.new_BRepFill_Pipe__SWIG_2(TopoDS_Wire.getCPtr(Spine), Spine, TopoDS_Shape.getCPtr(Profile), Profile, aMode.swigValue(), ForceApproxC1), true);
  }

  public BRepFill_Pipe( TopoDS_Wire  Spine,  TopoDS_Shape  Profile, GeomFill_Trihedron aMode) {
    this(OCCwrapJavaJNI.new_BRepFill_Pipe__SWIG_3(TopoDS_Wire.getCPtr(Spine), Spine, TopoDS_Shape.getCPtr(Profile), Profile, aMode.swigValue()), true);
  }

  public BRepFill_Pipe( TopoDS_Wire  Spine,  TopoDS_Shape  Profile) {
    this(OCCwrapJavaJNI.new_BRepFill_Pipe__SWIG_4(TopoDS_Wire.getCPtr(Spine), Spine, TopoDS_Shape.getCPtr(Profile), Profile), true);
  }

  public void Perform( TopoDS_Wire  Spine,  TopoDS_Shape  Profile, long GeneratePartCase) {
    OCCwrapJavaJNI.BRepFill_Pipe_Perform__SWIG_0(swigCPtr, this, TopoDS_Wire.getCPtr(Spine), Spine, TopoDS_Shape.getCPtr(Profile), Profile, GeneratePartCase);
  }

  public void Perform( TopoDS_Wire  Spine,  TopoDS_Shape  Profile) {
    OCCwrapJavaJNI.BRepFill_Pipe_Perform__SWIG_1(swigCPtr, this, TopoDS_Wire.getCPtr(Spine), Spine, TopoDS_Shape.getCPtr(Profile), Profile);
  }

  public  TopoDS_Shape  Spine() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepFill_Pipe_Spine(swigCPtr, this), true);
    return ret;
  }

  public  TopoDS_Shape  Profile() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepFill_Pipe_Profile(swigCPtr, this), true);
    return ret;
  }

  public  TopoDS_Shape  Shape() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepFill_Pipe_Shape(swigCPtr, this), true);
    return ret;
  }

  public double ErrorOnSurface() {
    return OCCwrapJavaJNI.BRepFill_Pipe_ErrorOnSurface(swigCPtr, this);
  }

  public  TopoDS_Shape  FirstShape() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepFill_Pipe_FirstShape(swigCPtr, this), true);
    return ret;
  }

  public  TopoDS_Shape  LastShape() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepFill_Pipe_LastShape(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the  list   of shapes generated   from the
   *  shape <S>.
   */
  public void Generated( TopoDS_Shape  S,  TopTools_ListOfShape  L) {
    OCCwrapJavaJNI.BRepFill_Pipe_Generated(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, TopTools_ListOfShape.getCPtr(L), L);
  }

  /**
   *  Returns the face created from an edge of the spine
   *  and an edge of the profile.
   *  if the edges are not in the spine or the profile
   */
  public TopoDS_Face Face( TopoDS_Edge  ESpine,  TopoDS_Edge  EProfile) {
    return new TopoDS_Face(OCCwrapJavaJNI.BRepFill_Pipe_Face(swigCPtr, this, TopoDS_Edge.getCPtr(ESpine), ESpine, TopoDS_Edge.getCPtr(EProfile), EProfile), true);
  }

  /**
   *  Returns the edge created from an edge of the spine
   *  and a vertex of the profile.
   *  if the edge or the vertex are not in  the spine or
   *  the profile.
   */
  public TopoDS_Edge Edge( TopoDS_Edge  ESpine,  TopoDS_Vertex  VProfile) {
    return new TopoDS_Edge(OCCwrapJavaJNI.BRepFill_Pipe_Edge(swigCPtr, this, TopoDS_Edge.getCPtr(ESpine), ESpine, TopoDS_Vertex.getCPtr(VProfile), VProfile), true);
  }

  /**
   *  Returns  the shape created from the profile at the
   *  position of the vertex VSpine.
   *  if the vertex is not in the Spine
   */
  public TopoDS_Shape Section( TopoDS_Vertex  VSpine) {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepFill_Pipe_Section(swigCPtr, this, TopoDS_Vertex.getCPtr(VSpine), VSpine), true);
  }

  /**
   *  Create a Wire by sweeping the Point along the <spine>
   *  if the <Spine> is undefined
   */
  public TopoDS_Wire PipeLine( gp_Pnt  Point) {
    return new TopoDS_Wire(OCCwrapJavaJNI.BRepFill_Pipe_PipeLine(swigCPtr, this, gp_Pnt.getCPtr(Point), Point), true);
  }

}
