package opencascade;

public class BRepExtrema_ExtPC {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepExtrema_ExtPC(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepExtrema_ExtPC(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepExtrema_ExtPC obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepExtrema_ExtPC(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BRepExtrema_ExtPC() {
    this(OCCwrapJavaJNI.new_BRepExtrema_ExtPC__SWIG_0(), true);
  }

  /**
   *  It calculates all the distances. 
   */
  public BRepExtrema_ExtPC( TopoDS_Vertex  V,  TopoDS_Edge  E) {
    this(OCCwrapJavaJNI.new_BRepExtrema_ExtPC__SWIG_1(TopoDS_Vertex.getCPtr(V), V, TopoDS_Edge.getCPtr(E), E), true);
  }

  public void Initialize( TopoDS_Edge  E) {
    OCCwrapJavaJNI.BRepExtrema_ExtPC_Initialize(swigCPtr, this, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  An exception is raised if the fields have not been initialized. 
   */
  public void Perform( TopoDS_Vertex  V) {
    OCCwrapJavaJNI.BRepExtrema_ExtPC_Perform(swigCPtr, this, TopoDS_Vertex.getCPtr(V), V);
  }

  /**
   *  True if the distances are found. 
   */
  public long IsDone() {
    return OCCwrapJavaJNI.BRepExtrema_ExtPC_IsDone(swigCPtr, this);
  }

  /**
   *  Returns the number of extremum distances. 
   */
  public int NbExt() {
    return OCCwrapJavaJNI.BRepExtrema_ExtPC_NbExt(swigCPtr, this);
  }

  /**
   *  Returns True if the <N>th extremum distance is a minimum. 
   */
  public long IsMin(int N) {
    return OCCwrapJavaJNI.BRepExtrema_ExtPC_IsMin(swigCPtr, this, N);
  }

  /**
   *  Returns the value of the <N>th extremum square distance. 
   */
  public double SquareDistance(int N) {
    return OCCwrapJavaJNI.BRepExtrema_ExtPC_SquareDistance(swigCPtr, this, N);
  }

  /**
   *  Returns the parameter on the edge of the <N>th extremum distance. 
   */
  public double Parameter(int N) {
    return OCCwrapJavaJNI.BRepExtrema_ExtPC_Parameter(swigCPtr, this, N);
  }

  public gp_Pnt Point(int N) {
    return new gp_Pnt(OCCwrapJavaJNI.BRepExtrema_ExtPC_Point(swigCPtr, this, N), true);
  }

  /**
   *  if the curve is a trimmed curve, 
   *  dist1 is a square distance between <P> and the point 
   *  of parameter FirstParameter <pnt1> and 
   *  dist2 is a square distance between <P> and the point 
   *  of parameter LastParameter <pnt2>. 
   */
  public void TrimmedSquareDistances(double[] dist1, double[] dist2, gp_Pnt pnt1, gp_Pnt pnt2) {
    OCCwrapJavaJNI.BRepExtrema_ExtPC_TrimmedSquareDistances(swigCPtr, this, dist1, dist2, gp_Pnt.getCPtr(pnt1), pnt1, gp_Pnt.getCPtr(pnt2), pnt2);
  }

}
