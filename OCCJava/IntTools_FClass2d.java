package opencascade;

/**
 *  Class provides an algorithm to classify a 2d Point
 *  in 2d space of face using boundaries of the face.
 */
public class IntTools_FClass2d {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntTools_FClass2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntTools_FClass2d(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntTools_FClass2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntTools_FClass2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor
   */
  public IntTools_FClass2d() {
    this(OCCwrapJavaJNI.new_IntTools_FClass2d__SWIG_0(), true);
  }

  /**
   *  Initializes algorithm by the face F
   *  and tolerance Tol
   */
  public IntTools_FClass2d( TopoDS_Face  F, double Tol) {
    this(OCCwrapJavaJNI.new_IntTools_FClass2d__SWIG_1(TopoDS_Face.getCPtr(F), F, Tol), true);
  }

  /**
   *  Initializes algorithm by the face F
   *  and tolerance Tol
   */
  public void Init( TopoDS_Face  F, double Tol) {
    OCCwrapJavaJNI.IntTools_FClass2d_Init(swigCPtr, this, TopoDS_Face.getCPtr(F), F, Tol);
  }

  /**
   *  Returns state of infinite 2d point relatively to (0, 0)
   */
  public TopAbs_State PerformInfinitePoint() {
    return TopAbs_State.swigToEnum(OCCwrapJavaJNI.IntTools_FClass2d_PerformInfinitePoint(swigCPtr, this));
  }

  /**
   *  Returns state of the 2d point Puv.
   *  If RecadreOnPeriodic is true (defalut value),
   *  for the periodic surface 2d point, adjusted to period, is
   *  classified.
   */
  public TopAbs_State Perform( gp_Pnt2d  Puv, long RecadreOnPeriodic) {
    return TopAbs_State.swigToEnum(OCCwrapJavaJNI.IntTools_FClass2d_Perform__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(Puv), Puv, RecadreOnPeriodic));
  }

  public TopAbs_State Perform( gp_Pnt2d  Puv) {
    return TopAbs_State.swigToEnum(OCCwrapJavaJNI.IntTools_FClass2d_Perform__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(Puv), Puv));
  }

  /**
   *  Destructor
   */
  public void Destroy() {
    OCCwrapJavaJNI.IntTools_FClass2d_Destroy(swigCPtr, this);
  }

  /**
   *  Test a point with +- an offset (Tol) and returns
   *  On if some points are OUT an some are IN
   *  (Caution: Internal use . see the code for more details)
   */
  public TopAbs_State TestOnRestriction( gp_Pnt2d  Puv, double Tol, long RecadreOnPeriodic) {
    return TopAbs_State.swigToEnum(OCCwrapJavaJNI.IntTools_FClass2d_TestOnRestriction__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(Puv), Puv, Tol, RecadreOnPeriodic));
  }

  public TopAbs_State TestOnRestriction( gp_Pnt2d  Puv, double Tol) {
    return TopAbs_State.swigToEnum(OCCwrapJavaJNI.IntTools_FClass2d_TestOnRestriction__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(Puv), Puv, Tol));
  }

  public long IsHole() {
    return OCCwrapJavaJNI.IntTools_FClass2d_IsHole(swigCPtr, this);
  }

}
