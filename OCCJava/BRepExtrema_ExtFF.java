package opencascade;

public class BRepExtrema_ExtFF {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepExtrema_ExtFF(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepExtrema_ExtFF(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepExtrema_ExtFF obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepExtrema_ExtFF(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BRepExtrema_ExtFF() {
    this(OCCwrapJavaJNI.new_BRepExtrema_ExtFF__SWIG_0(), true);
  }

  /**
   *  It calculates all the distances. 
   */
  public BRepExtrema_ExtFF( TopoDS_Face  F1,  TopoDS_Face  F2) {
    this(OCCwrapJavaJNI.new_BRepExtrema_ExtFF__SWIG_1(TopoDS_Face.getCPtr(F1), F1, TopoDS_Face.getCPtr(F2), F2), true);
  }

  public void Initialize( TopoDS_Face  F2) {
    OCCwrapJavaJNI.BRepExtrema_ExtFF_Initialize(swigCPtr, this, TopoDS_Face.getCPtr(F2), F2);
  }

  /**
   *  An exception is raised if the fields have not been initialized. 
   *  Be careful: this method uses the Face F2 only for classify, not for the fields. 
   */
  public void Perform( TopoDS_Face  F1,  TopoDS_Face  F2) {
    OCCwrapJavaJNI.BRepExtrema_ExtFF_Perform(swigCPtr, this, TopoDS_Face.getCPtr(F1), F1, TopoDS_Face.getCPtr(F2), F2);
  }

  /**
   *  True if the distances are found. 
   */
  public long IsDone() {
    return OCCwrapJavaJNI.BRepExtrema_ExtFF_IsDone(swigCPtr, this);
  }

  /**
   *  Returns True if the surfaces are parallel. 
   */
  public long IsParallel() {
    return OCCwrapJavaJNI.BRepExtrema_ExtFF_IsParallel(swigCPtr, this);
  }

  /**
   *  Returns the number of extremum distances. 
   */
  public int NbExt() {
    return OCCwrapJavaJNI.BRepExtrema_ExtFF_NbExt(swigCPtr, this);
  }

  /**
   *  Returns the value of the <N>th extremum square distance. 
   */
  public double SquareDistance(int N) {
    return OCCwrapJavaJNI.BRepExtrema_ExtFF_SquareDistance(swigCPtr, this, N);
  }

  /**
   *  Returns the parameters on the Face F1 of the <N>th extremum distance. 
   */
  public void ParameterOnFace1(int N, double[] U, double[] V) {
    OCCwrapJavaJNI.BRepExtrema_ExtFF_ParameterOnFace1(swigCPtr, this, N, U, V);
  }

  /**
   *  Returns the parameters on the Face F2 of the <N>th extremum distance. 
   */
  public void ParameterOnFace2(int N, double[] U, double[] V) {
    OCCwrapJavaJNI.BRepExtrema_ExtFF_ParameterOnFace2(swigCPtr, this, N, U, V);
  }

  /**
   *  Returns the Point of the <N>th extremum distance. 
   */
  public gp_Pnt PointOnFace1(int N) {
    return new gp_Pnt(OCCwrapJavaJNI.BRepExtrema_ExtFF_PointOnFace1(swigCPtr, this, N), true);
  }

  /**
   *  Returns the Point of the <N>th extremum distance. 
   */
  public gp_Pnt PointOnFace2(int N) {
    return new gp_Pnt(OCCwrapJavaJNI.BRepExtrema_ExtFF_PointOnFace2(swigCPtr, this, N), true);
  }

}
