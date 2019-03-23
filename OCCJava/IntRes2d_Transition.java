package opencascade;

/**
 *  Definition of    the  type  of   transition    near an
 *  intersection point between  two curves. The transition
 *  is either a "true transition", which means that one of
 *  the curves goes inside or outside  the area defined by
 *  the other curve  near  the intersection, or  a  "touch
 *  transition" which means that the  first curve does not
 *  cross  the  other one,  or an  "undecided" transition,
 *  which means that the curves are superposed.
 */
public class IntRes2d_Transition {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntRes2d_Transition(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntRes2d_Transition(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntRes2d_Transition obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (IntRes2d_Transition ptr) { Ptr = ptr; }
    public IntRes2d_Transition AsReference () { return Ptr; }
    public IntRes2d_Transition AsCopy () { return Ptr.MakeCopy(); }
    public IntRes2d_Transition Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntRes2d_Transition(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor.
   */
  public IntRes2d_Transition() {
    this(OCCwrapJavaJNI.new_IntRes2d_Transition__SWIG_0(), true);
  }

  /**
   *  Creates an IN or OUT transition.
   */
  public IntRes2d_Transition(long Tangent, IntRes2d_Position Pos, IntRes2d_TypeTrans Type) {
    this(OCCwrapJavaJNI.new_IntRes2d_Transition__SWIG_1(Tangent, Pos.swigValue(), Type.swigValue()), true);
  }

  /**
   *  Creates a TOUCH transition.
   */
  public IntRes2d_Transition(long Tangent, IntRes2d_Position Pos, IntRes2d_Situation Situ, long Oppos) {
    this(OCCwrapJavaJNI.new_IntRes2d_Transition__SWIG_2(Tangent, Pos.swigValue(), Situ.swigValue(), Oppos), true);
  }

  /**
   *  Creates an UNDECIDED transition.
   */
  public IntRes2d_Transition(IntRes2d_Position Pos) {
    this(OCCwrapJavaJNI.new_IntRes2d_Transition__SWIG_3(Pos.swigValue()), true);
  }

  /**
   *  Sets the values of an IN or OUT transition.
   */
  public void SetValue(long Tangent, IntRes2d_Position Pos, IntRes2d_TypeTrans Type) {
    OCCwrapJavaJNI.IntRes2d_Transition_SetValue__SWIG_0(swigCPtr, this, Tangent, Pos.swigValue(), Type.swigValue());
  }

  /**
   *  Sets the values of a TOUCH transition.
   */
  public void SetValue(long Tangent, IntRes2d_Position Pos, IntRes2d_Situation Situ, long Oppos) {
    OCCwrapJavaJNI.IntRes2d_Transition_SetValue__SWIG_1(swigCPtr, this, Tangent, Pos.swigValue(), Situ.swigValue(), Oppos);
  }

  /**
   *  Sets the values of an UNDECIDED transition.
   */
  public void SetValue(IntRes2d_Position Pos) {
    OCCwrapJavaJNI.IntRes2d_Transition_SetValue__SWIG_2(swigCPtr, this, Pos.swigValue());
  }

  /**
   *  Sets the value of the position.
   */
  public void SetPosition(IntRes2d_Position Pos) {
    OCCwrapJavaJNI.IntRes2d_Transition_SetPosition(swigCPtr, this, Pos.swigValue());
  }

  /**
   *  Indicates if the  intersection is at the beginning
   *  (IntRes2d_Head),  at the end (IntRes2d_End), or in
   *  the middle (IntRes2d_Middle) of the curve.
   */
  public IntRes2d_Position PositionOnCurve() {
    return IntRes2d_Position.swigToEnum(OCCwrapJavaJNI.IntRes2d_Transition_PositionOnCurve(swigCPtr, this));
  }

  /**
   *  Returns the type of transition at the intersection.
   *  It may be IN or OUT or TOUCH, or UNDECIDED if the
   *  two first derivatives are not enough to give
   *  the tangent to one of the two curves.
   */
  public IntRes2d_TypeTrans TransitionType() {
    return IntRes2d_TypeTrans.swigToEnum(OCCwrapJavaJNI.IntRes2d_Transition_TransitionType(swigCPtr, this));
  }

  /**
   *  Returns TRUE when the 2 curves are tangent at the
   *  intersection point.
   *  Theexception DomainError is raised if the type of
   *  transition is UNDECIDED.
   */
  public long IsTangent() {
    return OCCwrapJavaJNI.IntRes2d_Transition_IsTangent(swigCPtr, this);
  }

  /**
   *  returns a significant value if TransitionType returns
   *  TOUCH. In this case, the function returns :
   *  INSIDE when the curve remains inside the other one,
   *  OUTSIDE when it remains outside the other one,
   *  UNKNOWN when the calculus, based on the second derivatives
   *  cannot give the result.
   *  If TransitionType returns IN or OUT or UNDECIDED, the
   *  exception DomainError is raised.
   */
  public IntRes2d_Situation Situation() {
    return IntRes2d_Situation.swigToEnum(OCCwrapJavaJNI.IntRes2d_Transition_Situation(swigCPtr, this));
  }

  /**
   *  returns a  significant value   if   TransitionType
   *  returns TOUCH. In this  case, the function returns
   *  true   when  the  2   curves   locally define  two
   *  different  parts of the  space.  If TransitionType
   *  returns  IN or   OUT or UNDECIDED,  the  exception
   *  DomainError is raised.
   */
  public long IsOpposite() {
    return OCCwrapJavaJNI.IntRes2d_Transition_IsOpposite(swigCPtr, this);
  }

}
