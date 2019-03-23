package opencascade;

public class BRepExtrema_ExtCF {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepExtrema_ExtCF(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepExtrema_ExtCF(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepExtrema_ExtCF obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepExtrema_ExtCF(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BRepExtrema_ExtCF() {
    this(OCCwrapJavaJNI.new_BRepExtrema_ExtCF__SWIG_0(), true);
  }

  /**
   *  It calculates all the distances. 
   */
  public BRepExtrema_ExtCF( TopoDS_Edge  E,  TopoDS_Face  F) {
    this(OCCwrapJavaJNI.new_BRepExtrema_ExtCF__SWIG_1(TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F), true);
  }

  public void Initialize( TopoDS_Edge  E,  TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepExtrema_ExtCF_Initialize(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  An exception is raised if the fields have not been initialized. 
   *  Be careful: this method uses the Face only for classify not for the fields. 
   */
  public void Perform( TopoDS_Edge  E,  TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepExtrema_ExtCF_Perform(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  True if the distances are found. 
   */
  public long IsDone() {
    return OCCwrapJavaJNI.BRepExtrema_ExtCF_IsDone(swigCPtr, this);
  }

  /**
   *  Returns the number of extremum distances. 
   */
  public int NbExt() {
    return OCCwrapJavaJNI.BRepExtrema_ExtCF_NbExt(swigCPtr, this);
  }

  /**
   *  Returns the value of the <N>th extremum square distance. 
   */
  public double SquareDistance(int N) {
    return OCCwrapJavaJNI.BRepExtrema_ExtCF_SquareDistance(swigCPtr, this, N);
  }

  /**
   *  Returns True if the curve is on a parallel surface. 
   */
  public long IsParallel() {
    return OCCwrapJavaJNI.BRepExtrema_ExtCF_IsParallel(swigCPtr, this);
  }

  /**
   *  Returns the parameters on the Edge of the <N>th extremum distance. 
   */
  public double ParameterOnEdge(int N) {
    return OCCwrapJavaJNI.BRepExtrema_ExtCF_ParameterOnEdge(swigCPtr, this, N);
  }

  /**
   *  Returns the parameters on the Face of the <N>th extremum distance. 
   */
  public void ParameterOnFace(int N, double[] U, double[] V) {
    OCCwrapJavaJNI.BRepExtrema_ExtCF_ParameterOnFace(swigCPtr, this, N, U, V);
  }

  /**
   *  Returns the Point of the <N>th extremum distance. 
   */
  public gp_Pnt PointOnEdge(int N) {
    return new gp_Pnt(OCCwrapJavaJNI.BRepExtrema_ExtCF_PointOnEdge(swigCPtr, this, N), true);
  }

  /**
   *  Returns the Point of the <N>th extremum distance. 
   */
  public gp_Pnt PointOnFace(int N) {
    return new gp_Pnt(OCCwrapJavaJNI.BRepExtrema_ExtCF_PointOnFace(swigCPtr, this, N), true);
  }

}
