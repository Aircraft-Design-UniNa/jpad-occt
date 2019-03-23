package opencascade;

/**
 *  Definition of an intersection point between two
 *  2D curves.
 */
public class IntRes2d_IntersectionPoint {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntRes2d_IntersectionPoint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntRes2d_IntersectionPoint(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntRes2d_IntersectionPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (IntRes2d_IntersectionPoint ptr) { Ptr = ptr; }
    public IntRes2d_IntersectionPoint AsReference () { return Ptr; }
    public IntRes2d_IntersectionPoint AsCopy () { return Ptr.MakeCopy(); }
    public IntRes2d_IntersectionPoint Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntRes2d_IntersectionPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor.
   */
  public IntRes2d_IntersectionPoint() {
    this(OCCwrapJavaJNI.new_IntRes2d_IntersectionPoint__SWIG_0(), true);
  }

  /**
   *  Creates an IntersectionPoint.
   *  if ReversedFlag is False, the parameter Uc1(resp. Uc2)
   *  and the Transition Trans1 (resp. Trans2) refer to
   *  the first curve (resp. second curve) otherwise Uc1
   *  and Trans1 (resp. Uc2 and Trans2) refer to the
   *  second curve (resp. the first curve).
   */
  public IntRes2d_IntersectionPoint( gp_Pnt2d  P, double Uc1, double Uc2,  IntRes2d_Transition  Trans1,  IntRes2d_Transition  Trans2, long ReversedFlag) {
    this(OCCwrapJavaJNI.new_IntRes2d_IntersectionPoint__SWIG_1(gp_Pnt2d.getCPtr(P), P, Uc1, Uc2, IntRes2d_Transition.getCPtr(Trans1), Trans1, IntRes2d_Transition.getCPtr(Trans2), Trans2, ReversedFlag), true);
  }

  /**
   *  Sets the values for an existing intersection
   *  point. The meaning of the parameters are the same
   *  as for the Create.
   */
  public void SetValues( gp_Pnt2d  P, double Uc1, double Uc2,  IntRes2d_Transition  Trans1,  IntRes2d_Transition  Trans2, long ReversedFlag) {
    OCCwrapJavaJNI.IntRes2d_IntersectionPoint_SetValues(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, Uc1, Uc2, IntRes2d_Transition.getCPtr(Trans1), Trans1, IntRes2d_Transition.getCPtr(Trans2), Trans2, ReversedFlag);
  }

  /**
   *  Returns the value of the coordinates of the
   *  intersection point in the 2D space.
   */
  public  gp_Pnt2d  Value() {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.IntRes2d_IntersectionPoint_Value(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the parameter on the first curve.
   */
  public double ParamOnFirst() {
    return OCCwrapJavaJNI.IntRes2d_IntersectionPoint_ParamOnFirst(swigCPtr, this);
  }

  /**
   *  Returns the parameter on the second curve.
   */
  public double ParamOnSecond() {
    return OCCwrapJavaJNI.IntRes2d_IntersectionPoint_ParamOnSecond(swigCPtr, this);
  }

  /**
   *  Returns the transition of the 1st curve compared to
   *  the 2nd one.
   */
  public  IntRes2d_Transition  TransitionOfFirst() {
    IntRes2d_Transition ret = new IntRes2d_Transition(OCCwrapJavaJNI.IntRes2d_IntersectionPoint_TransitionOfFirst(swigCPtr, this), true);
    return ret;
  }

  /**
   *  returns the transition of the 2nd curve compared to
   *  the 1st one.
   */
  public  IntRes2d_Transition  TransitionOfSecond() {
    IntRes2d_Transition ret = new IntRes2d_Transition(OCCwrapJavaJNI.IntRes2d_IntersectionPoint_TransitionOfSecond(swigCPtr, this), true);
    return ret;
  }

}
