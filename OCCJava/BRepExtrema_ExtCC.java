package opencascade;

public class BRepExtrema_ExtCC {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepExtrema_ExtCC(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepExtrema_ExtCC(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepExtrema_ExtCC obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepExtrema_ExtCC(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BRepExtrema_ExtCC() {
    this(OCCwrapJavaJNI.new_BRepExtrema_ExtCC__SWIG_0(), true);
  }

  /**
   *  It calculates all the distances. 
   */
  public BRepExtrema_ExtCC( TopoDS_Edge  E1,  TopoDS_Edge  E2) {
    this(OCCwrapJavaJNI.new_BRepExtrema_ExtCC__SWIG_1(TopoDS_Edge.getCPtr(E1), E1, TopoDS_Edge.getCPtr(E2), E2), true);
  }

  public void Initialize( TopoDS_Edge  E2) {
    OCCwrapJavaJNI.BRepExtrema_ExtCC_Initialize(swigCPtr, this, TopoDS_Edge.getCPtr(E2), E2);
  }

  /**
   *  An exception is raised if the fields have not been initialized. 
   */
  public void Perform( TopoDS_Edge  E1) {
    OCCwrapJavaJNI.BRepExtrema_ExtCC_Perform(swigCPtr, this, TopoDS_Edge.getCPtr(E1), E1);
  }

  /**
   *  True if the distances are found. 
   */
  public long IsDone() {
    return OCCwrapJavaJNI.BRepExtrema_ExtCC_IsDone(swigCPtr, this);
  }

  /**
   *  Returns the number of extremum distances. 
   */
  public int NbExt() {
    return OCCwrapJavaJNI.BRepExtrema_ExtCC_NbExt(swigCPtr, this);
  }

  /**
   *  Returns True if E1 and E2 are parallel. 
   */
  public long IsParallel() {
    return OCCwrapJavaJNI.BRepExtrema_ExtCC_IsParallel(swigCPtr, this);
  }

  /**
   *  Returns the value of the <N>th extremum square distance. 
   */
  public double SquareDistance(int N) {
    return OCCwrapJavaJNI.BRepExtrema_ExtCC_SquareDistance(swigCPtr, this, N);
  }

  /**
   *  Returns the parameter on the first edge of the <N>th extremum distance. 
   */
  public double ParameterOnE1(int N) {
    return OCCwrapJavaJNI.BRepExtrema_ExtCC_ParameterOnE1(swigCPtr, this, N);
  }

  /**
   *  Returns the Point of the <N>th extremum distance on the edge E1. 
   */
  public gp_Pnt PointOnE1(int N) {
    return new gp_Pnt(OCCwrapJavaJNI.BRepExtrema_ExtCC_PointOnE1(swigCPtr, this, N), true);
  }

  /**
   *  Returns the parameter on the second edge of the <N>th extremum distance. 
   */
  public double ParameterOnE2(int N) {
    return OCCwrapJavaJNI.BRepExtrema_ExtCC_ParameterOnE2(swigCPtr, this, N);
  }

  /**
   *  Returns the Point of the <N>th extremum distance on the edge E2. 
   */
  public gp_Pnt PointOnE2(int N) {
    return new gp_Pnt(OCCwrapJavaJNI.BRepExtrema_ExtCC_PointOnE2(swigCPtr, this, N), true);
  }

  /**
   *  if the edges is a trimmed curve, 
   *  dist11 is a square distance between the point on E1 
   *  of parameter FirstParameter and the point of 
   *  parameter FirstParameter on E2. 
   */
  public void TrimmedSquareDistances(double[] dist11, double[] distP12, double[] distP21, double[] distP22, gp_Pnt P11, gp_Pnt P12, gp_Pnt P21, gp_Pnt P22) {
    OCCwrapJavaJNI.BRepExtrema_ExtCC_TrimmedSquareDistances(swigCPtr, this, dist11, distP12, distP21, distP22, gp_Pnt.getCPtr(P11), P11, gp_Pnt.getCPtr(P12), P12, gp_Pnt.getCPtr(P21), P21, gp_Pnt.getCPtr(P22), P22);
  }

}
