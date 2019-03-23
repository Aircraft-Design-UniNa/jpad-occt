package opencascade;

public class BRepExtrema_ExtPF {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepExtrema_ExtPF(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepExtrema_ExtPF(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepExtrema_ExtPF obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepExtrema_ExtPF(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BRepExtrema_ExtPF() {
    this(OCCwrapJavaJNI.new_BRepExtrema_ExtPF__SWIG_0(), true);
  }

  /**
   *  It calculates all the distances. 
   */
  public BRepExtrema_ExtPF( TopoDS_Vertex  TheVertex,  TopoDS_Face  TheFace, Extrema_ExtFlag TheFlag, Extrema_ExtAlgo TheAlgo) {
    this(OCCwrapJavaJNI.new_BRepExtrema_ExtPF__SWIG_1(TopoDS_Vertex.getCPtr(TheVertex), TheVertex, TopoDS_Face.getCPtr(TheFace), TheFace, TheFlag.swigValue(), TheAlgo.swigValue()), true);
  }

  public BRepExtrema_ExtPF( TopoDS_Vertex  TheVertex,  TopoDS_Face  TheFace, Extrema_ExtFlag TheFlag) {
    this(OCCwrapJavaJNI.new_BRepExtrema_ExtPF__SWIG_2(TopoDS_Vertex.getCPtr(TheVertex), TheVertex, TopoDS_Face.getCPtr(TheFace), TheFace, TheFlag.swigValue()), true);
  }

  public BRepExtrema_ExtPF( TopoDS_Vertex  TheVertex,  TopoDS_Face  TheFace) {
    this(OCCwrapJavaJNI.new_BRepExtrema_ExtPF__SWIG_3(TopoDS_Vertex.getCPtr(TheVertex), TheVertex, TopoDS_Face.getCPtr(TheFace), TheFace), true);
  }

  public void Initialize( TopoDS_Face  TheFace, Extrema_ExtFlag TheFlag, Extrema_ExtAlgo TheAlgo) {
    OCCwrapJavaJNI.BRepExtrema_ExtPF_Initialize__SWIG_0(swigCPtr, this, TopoDS_Face.getCPtr(TheFace), TheFace, TheFlag.swigValue(), TheAlgo.swigValue());
  }

  public void Initialize( TopoDS_Face  TheFace, Extrema_ExtFlag TheFlag) {
    OCCwrapJavaJNI.BRepExtrema_ExtPF_Initialize__SWIG_1(swigCPtr, this, TopoDS_Face.getCPtr(TheFace), TheFace, TheFlag.swigValue());
  }

  public void Initialize( TopoDS_Face  TheFace) {
    OCCwrapJavaJNI.BRepExtrema_ExtPF_Initialize__SWIG_2(swigCPtr, this, TopoDS_Face.getCPtr(TheFace), TheFace);
  }

  /**
   *  An exception is raised if the fields have not been initialized. 
   *  Be careful: this method uses the Face only for classify not for the fields. 
   */
  public void Perform( TopoDS_Vertex  TheVertex,  TopoDS_Face  TheFace) {
    OCCwrapJavaJNI.BRepExtrema_ExtPF_Perform(swigCPtr, this, TopoDS_Vertex.getCPtr(TheVertex), TheVertex, TopoDS_Face.getCPtr(TheFace), TheFace);
  }

  /**
   *  True if the distances are found. 
   */
  public long IsDone() {
    return OCCwrapJavaJNI.BRepExtrema_ExtPF_IsDone(swigCPtr, this);
  }

  /**
   *  Returns the number of extremum distances. 
   */
  public int NbExt() {
    return OCCwrapJavaJNI.BRepExtrema_ExtPF_NbExt(swigCPtr, this);
  }

  /**
   *  Returns the value of the <N>th extremum square distance. 
   */
  public double SquareDistance(int N) {
    return OCCwrapJavaJNI.BRepExtrema_ExtPF_SquareDistance(swigCPtr, this, N);
  }

  /**
   *  Returns the parameters on the Face of the <N>th extremum distance. 
   */
  public void Parameter(int N, double[] U, double[] V) {
    OCCwrapJavaJNI.BRepExtrema_ExtPF_Parameter(swigCPtr, this, N, U, V);
  }

  /**
   *  Returns the Point of the <N>th extremum distance. 
   */
  public gp_Pnt Point(int N) {
    return new gp_Pnt(OCCwrapJavaJNI.BRepExtrema_ExtPF_Point(swigCPtr, this, N), true);
  }

  public void SetFlag(Extrema_ExtFlag F) {
    OCCwrapJavaJNI.BRepExtrema_ExtPF_SetFlag(swigCPtr, this, F.swigValue());
  }

  public void SetAlgo(Extrema_ExtAlgo A) {
    OCCwrapJavaJNI.BRepExtrema_ExtPF_SetAlgo(swigCPtr, this, A.swigValue());
  }

}
