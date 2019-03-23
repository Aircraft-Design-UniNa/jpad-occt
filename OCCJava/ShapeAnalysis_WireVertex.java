package opencascade;

/**
 *  Analyzes and records status of vertices in a Wire
 * 
 *  The Wire has formerly been loaded in a ShapeExtend_WireData
 *  For each Vertex, a status and some data can be attached
 *  (case found, position and parameters)
 *  Then, these informations can be used to fix problems
 */
public class ShapeAnalysis_WireVertex {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeAnalysis_WireVertex(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeAnalysis_WireVertex(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeAnalysis_WireVertex obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeAnalysis_WireVertex(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor
   */
  public ShapeAnalysis_WireVertex() {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_WireVertex(), true);
  }

  public void Init( TopoDS_Wire  wire, double preci) {
    OCCwrapJavaJNI.ShapeAnalysis_WireVertex_Init__SWIG_0(swigCPtr, this, TopoDS_Wire.getCPtr(wire), wire, preci);
  }

  public void Init( ShapeExtend_WireData  swbd, double preci) {
    OCCwrapJavaJNI.ShapeAnalysis_WireVertex_Init__SWIG_1(swigCPtr, this,  ShapeExtend_WireData.getCPtr(swbd) , swbd, preci);
  }

  public void Load( TopoDS_Wire  wire) {
    OCCwrapJavaJNI.ShapeAnalysis_WireVertex_Load__SWIG_0(swigCPtr, this, TopoDS_Wire.getCPtr(wire), wire);
  }

  public void Load( ShapeExtend_WireData  sbwd) {
    OCCwrapJavaJNI.ShapeAnalysis_WireVertex_Load__SWIG_1(swigCPtr, this,  ShapeExtend_WireData.getCPtr(sbwd) , sbwd);
  }

  /**
   *  Sets the precision for work
   *  Analysing: for each Vertex, comparison between the end of the
   *  preceeding edge and the start of the following edge
   *  Each Vertex rank corresponds to the End Vertex of the Edge of
   *  same rank, in the ShapeExtend_WireData. I.E. for Vertex <num>,
   *  Edge <num> is the preceeding one, <num+1> is the following one
   */
  public void SetPrecision(double preci) {
    OCCwrapJavaJNI.ShapeAnalysis_WireVertex_SetPrecision(swigCPtr, this, preci);
  }

  public void Analyze() {
    OCCwrapJavaJNI.ShapeAnalysis_WireVertex_Analyze(swigCPtr, this);
  }

  /**
   *  Records status "Same Vertex" (logically) on Vertex <num>
   */
  public void SetSameVertex(int num) {
    OCCwrapJavaJNI.ShapeAnalysis_WireVertex_SetSameVertex(swigCPtr, this, num);
  }

  /**
   *  Records status "Same Coords" (at the Vertices Tolerances)
   */
  public void SetSameCoords(int num) {
    OCCwrapJavaJNI.ShapeAnalysis_WireVertex_SetSameCoords(swigCPtr, this, num);
  }

  /**
   *  Records status "Close Coords" (at the Precision of <me>)
   */
  public void SetClose(int num) {
    OCCwrapJavaJNI.ShapeAnalysis_WireVertex_SetClose(swigCPtr, this, num);
  }

  /**
   *  <num> is the End of preceeding Edge, and its projection on the
   *  following one lies on it at the Precision of <me>
   *  <ufol> gives the parameter on the following edge
   */
  public void SetEnd(int num,  gp_XYZ  pos, double ufol) {
    OCCwrapJavaJNI.ShapeAnalysis_WireVertex_SetEnd(swigCPtr, this, num, gp_XYZ.getCPtr(pos), pos, ufol);
  }

  /**
   *  <num> is the Start of following Edge, its projection on the
   *  preceeding one lies on it at the Precision of <me>
   *  <upre> gives the parameter on the preceeding edge
   */
  public void SetStart(int num,  gp_XYZ  pos, double upre) {
    OCCwrapJavaJNI.ShapeAnalysis_WireVertex_SetStart(swigCPtr, this, num, gp_XYZ.getCPtr(pos), pos, upre);
  }

  /**
   *  <num> is the Intersection of both Edges
   *  <upre> is the parameter on preceeding edge, <ufol> on
   *  following edge
   */
  public void SetInters(int num,  gp_XYZ  pos, double upre, double ufol) {
    OCCwrapJavaJNI.ShapeAnalysis_WireVertex_SetInters(swigCPtr, this, num, gp_XYZ.getCPtr(pos), pos, upre, ufol);
  }

  /**
   *  <num> cannot be said as same vertex
   */
  public void SetDisjoined(int num) {
    OCCwrapJavaJNI.ShapeAnalysis_WireVertex_SetDisjoined(swigCPtr, this, num);
  }

  /**
   *  Returns True if analysis was performed, else returns False
   */
  public long IsDone() {
    return OCCwrapJavaJNI.ShapeAnalysis_WireVertex_IsDone(swigCPtr, this);
  }

  /**
   *  Returns precision value used in analysis
   */
  public double Precision() {
    return OCCwrapJavaJNI.ShapeAnalysis_WireVertex_Precision(swigCPtr, this);
  }

  /**
   *  Returns the number of edges in analyzed wire (i.e. the
   *  length of all arrays)
   */
  public int NbEdges() {
    return OCCwrapJavaJNI.ShapeAnalysis_WireVertex_NbEdges(swigCPtr, this);
  }

  public  ShapeExtend_WireData  WireData() {
    return new ShapeExtend_WireData ( OCCwrapJavaJNI.ShapeAnalysis_WireVertex_WireData(swigCPtr, this), true );
  }

  /**
   *  Returns the recorded status for a vertex
   *  More detail by method Data
   */
  public int Status(int num) {
    return OCCwrapJavaJNI.ShapeAnalysis_WireVertex_Status(swigCPtr, this, num);
  }

  public gp_XYZ Position(int num) {
    return new gp_XYZ(OCCwrapJavaJNI.ShapeAnalysis_WireVertex_Position(swigCPtr, this, num), true);
  }

  public double UPrevious(int num) {
    return OCCwrapJavaJNI.ShapeAnalysis_WireVertex_UPrevious(swigCPtr, this, num);
  }

  public double UFollowing(int num) {
    return OCCwrapJavaJNI.ShapeAnalysis_WireVertex_UFollowing(swigCPtr, this, num);
  }

  /**
   *  Returns the recorded status for a vertex
   *  With its recorded position and parameters on both edges
   *  These values are relevant regarding the status:
   *  Status  Meaning   Position  Preceeding  Following
   *  0       Same       no        no          no
   *  1       SameCoord  no        no          no
   *  2       Close      no        no          no
   *  3       End        yes       no          yes
   *  4       Start      yes       yes         no
   *  5       Inters     yes       yes         yes
   *  -1       Disjoined  no        no          no
   */
  public int Data(int num, gp_XYZ pos, double[] upre, double[] ufol) {
    return OCCwrapJavaJNI.ShapeAnalysis_WireVertex_Data(swigCPtr, this, num, gp_XYZ.getCPtr(pos), pos, upre, ufol);
  }

  /**
   *  For a given status, returns the rank of the vertex which
   *  follows <num> and has the same status. 0 if no more
   *  Acts as an iterator, starts on the first one
   */
  public int NextStatus(int stat, int num) {
    return OCCwrapJavaJNI.ShapeAnalysis_WireVertex_NextStatus__SWIG_0(swigCPtr, this, stat, num);
  }

  public int NextStatus(int stat) {
    return OCCwrapJavaJNI.ShapeAnalysis_WireVertex_NextStatus__SWIG_1(swigCPtr, this, stat);
  }

  /**
   *  For a given criter, returns the rank of the vertex which
   *  follows <num> and has the same status. 0 if no more
   *  Acts as an iterator, starts on the first one
   *  Criters are:
   *  0: same vertex (status 0)
   *  1: a solution exists (status >= 0)
   *  2: same coords (i.e. same params) (status 0 1 2)
   *  3: same coods but not same vertex (status 1 2)
   *  4: redefined coords (status 3 4 5)
   *  -1: no solution (status -1)
   */
  public int NextCriter(int crit, int num) {
    return OCCwrapJavaJNI.ShapeAnalysis_WireVertex_NextCriter__SWIG_0(swigCPtr, this, crit, num);
  }

  public int NextCriter(int crit) {
    return OCCwrapJavaJNI.ShapeAnalysis_WireVertex_NextCriter__SWIG_1(swigCPtr, this, crit);
  }

}
