package opencascade;

/**
 *  This class is used to store information relative to the minimum distance between two shapes.
 */
public class BRepExtrema_SolutionElem {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepExtrema_SolutionElem(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepExtrema_SolutionElem(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepExtrema_SolutionElem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepExtrema_SolutionElem(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor
   */
  public BRepExtrema_SolutionElem() {
    this(OCCwrapJavaJNI.new_BRepExtrema_SolutionElem__SWIG_0(), true);
  }

  /**
   *  This constructor is used when the solution of a distance is a Vertex.
   *  The different initialized fields are:
   *  @param theDist    the distance
   *  @param thePoint   the solution point
   *  @param theSolType the type of solution
   *  @param theVertex  and the Vertex
   */
  public BRepExtrema_SolutionElem(double theDist,  gp_Pnt  thePoint, BRepExtrema_SupportType theSolType,  TopoDS_Vertex  theVertex) {
    this(OCCwrapJavaJNI.new_BRepExtrema_SolutionElem__SWIG_1(theDist, gp_Pnt.getCPtr(thePoint), thePoint, theSolType.swigValue(), TopoDS_Vertex.getCPtr(theVertex), theVertex), true);
  }

  /**
   *  This constructor is used when the  solution of distance is on an Edge.
   *  The different initialized fields are:
   *  @param theDist    the distance
   *  @param thePoint   the solution point
   *  @param theSolType the type of solution
   *  @param theEdge    the Edge
   *  @param theParam   the parameter to locate the solution
   */
  public BRepExtrema_SolutionElem(double theDist,  gp_Pnt  thePoint, BRepExtrema_SupportType theSolType,  TopoDS_Edge  theEdge, double theParam) {
    this(OCCwrapJavaJNI.new_BRepExtrema_SolutionElem__SWIG_2(theDist, gp_Pnt.getCPtr(thePoint), thePoint, theSolType.swigValue(), TopoDS_Edge.getCPtr(theEdge), theEdge, theParam), true);
  }

  /**
   *  This constructor is used when the  solution of distance is in a Face.
   *  The different initialized fields are:
   *  @param theDist    the distance
   *  @param thePoint   the solution point
   *  @param theSolType the type of solution
   *  @param theFace    the Face
   *  @param theU       U parameter to locate the solution
   *  @param theV       V parameter to locate the solution
   */
  public BRepExtrema_SolutionElem(double theDist,  gp_Pnt  thePoint, BRepExtrema_SupportType theSolType,  TopoDS_Face  theFace, double theU, double theV) {
    this(OCCwrapJavaJNI.new_BRepExtrema_SolutionElem__SWIG_3(theDist, gp_Pnt.getCPtr(thePoint), thePoint, theSolType.swigValue(), TopoDS_Face.getCPtr(theFace), theFace, theU, theV), true);
  }

  /**
   *  Returns the value of the minimum distance.
   */
  public double Dist() {
    return OCCwrapJavaJNI.BRepExtrema_SolutionElem_Dist(swigCPtr, this);
  }

  /**
   *  Returns the solution point.
   */
  public  gp_Pnt  Point() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.BRepExtrema_SolutionElem_Point(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the Support type:
   *    IsVertex => The solution is a vertex.
   *    IsOnEdge => The solution belongs to an Edge.
   *    IsInFace => The solution is inside a Face.
   */
  public BRepExtrema_SupportType SupportKind() {
    return BRepExtrema_SupportType.swigToEnum(OCCwrapJavaJNI.BRepExtrema_SolutionElem_SupportKind(swigCPtr, this));
  }

  /**
   *  Returns the vertex if the solution is a Vertex.
   */
  public  TopoDS_Vertex  Vertex() {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.BRepExtrema_SolutionElem_Vertex(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the vertex if the solution is an Edge.
   */
  public  TopoDS_Edge  Edge() {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepExtrema_SolutionElem_Edge(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the vertex if the solution is an Face.
   */
  public  TopoDS_Face  Face() {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.BRepExtrema_SolutionElem_Face(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the parameter value if the solution is on Edge.
   */
  public void EdgeParameter(double[] theParam) {
    OCCwrapJavaJNI.BRepExtrema_SolutionElem_EdgeParameter(swigCPtr, this, theParam);
  }

  /**
   *  Returns the parameters U and V if the solution is in a Face.
   */
  public void FaceParameter(double[] theU, double[] theV) {
    OCCwrapJavaJNI.BRepExtrema_SolutionElem_FaceParameter(swigCPtr, this, theU, theV);
  }

}
