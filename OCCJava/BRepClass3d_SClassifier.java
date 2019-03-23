package opencascade;

/**
 *  Provides an algorithm to classify a point in a solid.
 */
public class BRepClass3d_SClassifier {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepClass3d_SClassifier(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepClass3d_SClassifier(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepClass3d_SClassifier obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepClass3d_SClassifier(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor.
   */
  public BRepClass3d_SClassifier() {
    this(OCCwrapJavaJNI.new_BRepClass3d_SClassifier__SWIG_0(), true);
  }

  /**
   *  Constructor to classify the point P with the
   *  tolerance Tol on the solid S.
   */
  public BRepClass3d_SClassifier( BRepClass3d_SolidExplorer  S,  gp_Pnt  P, double Tol) {
    this(OCCwrapJavaJNI.new_BRepClass3d_SClassifier__SWIG_1(BRepClass3d_SolidExplorer.getCPtr(S), S, gp_Pnt.getCPtr(P), P, Tol), true);
  }

  /**
   *  Classify the point P with the
   *  tolerance Tol on the solid S.
   */
  public void Perform( BRepClass3d_SolidExplorer  S,  gp_Pnt  P, double Tol) {
    OCCwrapJavaJNI.BRepClass3d_SClassifier_Perform(swigCPtr, this, BRepClass3d_SolidExplorer.getCPtr(S), S, gp_Pnt.getCPtr(P), P, Tol);
  }

  /**
   *  Classify an infinite point with the
   *  tolerance Tol on the solid S.
   */
  public void PerformInfinitePoint( BRepClass3d_SolidExplorer  S, double Tol) {
    OCCwrapJavaJNI.BRepClass3d_SClassifier_PerformInfinitePoint(swigCPtr, this, BRepClass3d_SolidExplorer.getCPtr(S), S, Tol);
  }

  /**
   *  Returns True if the classification has been
   *  computed by rejection.
   *  The State is then OUT.
   */
  public long Rejected() {
    return OCCwrapJavaJNI.BRepClass3d_SClassifier_Rejected(swigCPtr, this);
  }

  /**
   *  Returns the result of the classification.
   */
  public TopAbs_State State() {
    return TopAbs_State.swigToEnum(OCCwrapJavaJNI.BRepClass3d_SClassifier_State(swigCPtr, this));
  }

  /**
   *  Returns True when the point is a point of a face.
   */
  public long IsOnAFace() {
    return OCCwrapJavaJNI.BRepClass3d_SClassifier_IsOnAFace(swigCPtr, this);
  }

  /**
   *  Returns the face used to determine the
   *  classification. When the state is ON, this is the
   *  face containing the point.
   * 
   *  When Rejected() returns True, Face() has no signification.
   */
  public TopoDS_Face Face() {
    return new TopoDS_Face(OCCwrapJavaJNI.BRepClass3d_SClassifier_Face(swigCPtr, this), true);
  }

}
