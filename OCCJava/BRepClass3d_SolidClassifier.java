package opencascade;

/**
 *  Provides an algorithm to classify a point in a solid.
 */
public class BRepClass3d_SolidClassifier extends BRepClass3d_SClassifier {

  private long swigCPtr;
  BRepClass3d_SolidClassifier(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepClass3d_SolidClassifier_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepClass3d_SolidClassifier(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepClass3d_SolidClassifier_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepClass3d_SolidClassifier obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepClass3d_SolidClassifier(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  empty constructor
   */
  public BRepClass3d_SolidClassifier() {
    this(OCCwrapJavaJNI.new_BRepClass3d_SolidClassifier__SWIG_0(), true);
  }

  public void Load( TopoDS_Shape  S) {
    OCCwrapJavaJNI.BRepClass3d_SolidClassifier_Load(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

  /**
   *  Constructor from a Shape.
   */
  public BRepClass3d_SolidClassifier( TopoDS_Shape  S) {
    this(OCCwrapJavaJNI.new_BRepClass3d_SolidClassifier__SWIG_1(TopoDS_Shape.getCPtr(S), S), true);
  }

  /**
   *  Constructor to classify the point P with the
   *  tolerance Tol on the solid S.
   */
  public BRepClass3d_SolidClassifier( TopoDS_Shape  S,  gp_Pnt  P, double Tol) {
    this(OCCwrapJavaJNI.new_BRepClass3d_SolidClassifier__SWIG_2(TopoDS_Shape.getCPtr(S), S, gp_Pnt.getCPtr(P), P, Tol), true);
  }

  /**
   *  Classify the point P with the
   *  tolerance Tol on the solid S.
   */
  public void Perform( gp_Pnt  P, double Tol) {
    OCCwrapJavaJNI.BRepClass3d_SolidClassifier_Perform(swigCPtr, this, gp_Pnt.getCPtr(P), P, Tol);
  }

  /**
   *  Classify an infinite point with the
   *  tolerance Tol on the solid S.
   *  Useful for compute the orientation of a solid.
   */
  public void PerformInfinitePoint(double Tol) {
    OCCwrapJavaJNI.BRepClass3d_SolidClassifier_PerformInfinitePoint(swigCPtr, this, Tol);
  }

  public void Destroy() {
    OCCwrapJavaJNI.BRepClass3d_SolidClassifier_Destroy(swigCPtr, this);
  }

}
