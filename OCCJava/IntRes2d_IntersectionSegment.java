package opencascade;

/**
 *  Definition of an intersection curve between
 *  two 2D curves.
 */
public class IntRes2d_IntersectionSegment {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntRes2d_IntersectionSegment(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntRes2d_IntersectionSegment(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntRes2d_IntersectionSegment obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (IntRes2d_IntersectionSegment ptr) { Ptr = ptr; }
    public IntRes2d_IntersectionSegment AsReference () { return Ptr; }
    public IntRes2d_IntersectionSegment AsCopy () { return Ptr.MakeCopy(); }
    public IntRes2d_IntersectionSegment Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntRes2d_IntersectionSegment(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor.
   */
  public IntRes2d_IntersectionSegment() {
    this(OCCwrapJavaJNI.new_IntRes2d_IntersectionSegment__SWIG_0(), true);
  }

  public IntRes2d_IntersectionSegment( IntRes2d_IntersectionPoint  P1,  IntRes2d_IntersectionPoint  P2, long Oppos, long ReverseFlag) {
    this(OCCwrapJavaJNI.new_IntRes2d_IntersectionSegment__SWIG_1(IntRes2d_IntersectionPoint.getCPtr(P1), P1, IntRes2d_IntersectionPoint.getCPtr(P2), P2, Oppos, ReverseFlag), true);
  }

  public IntRes2d_IntersectionSegment( IntRes2d_IntersectionPoint  P, long First, long Oppos, long ReverseFlag) {
    this(OCCwrapJavaJNI.new_IntRes2d_IntersectionSegment__SWIG_2(IntRes2d_IntersectionPoint.getCPtr(P), P, First, Oppos, ReverseFlag), true);
  }

  /**
   *  Creates an infinite segment of intersection.
   */
  public IntRes2d_IntersectionSegment(long Oppos) {
    this(OCCwrapJavaJNI.new_IntRes2d_IntersectionSegment__SWIG_3(Oppos), true);
  }

  /**
   *  Returns FALSE if the intersection segment has got
   *  the same orientation on both curves.
   */
  public long IsOpposite() {
    return OCCwrapJavaJNI.IntRes2d_IntersectionSegment_IsOpposite(swigCPtr, this);
  }

  /**
   *  Returns True if the segment is  limited by a first
   *  point.   This  point defines  the lowest parameter
   *  admitted on the first  curve for the  segment.  If
   *  IsOpposite  returns  False, it  defines the lowest
   *  parameter on the  second curve, otherwise,  it  is
   *  the highest parameter on the second curve.
   */
  public long HasFirstPoint() {
    return OCCwrapJavaJNI.IntRes2d_IntersectionSegment_HasFirstPoint(swigCPtr, this);
  }

  /**
   *  Returns the  first point   of the segment    as an
   *  IntersectionPoint (with    a    transition).   The
   *  exception  DomainError  is raised if HasFirstPoint
   *  returns False.
   */
  public  IntRes2d_IntersectionPoint  FirstPoint() {
    IntRes2d_IntersectionPoint ret = new IntRes2d_IntersectionPoint(OCCwrapJavaJNI.IntRes2d_IntersectionSegment_FirstPoint(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns True if the segment  is  limited by a last
   *  point.  This point  defines  the highest parameter
   *  admitted on the  first curve for  the segment.  If
   *  IsOpposite returns  False, it  defines the highest
   *  parameter on  the  second curve, otherwise, it  is
   *  the lowest parameter on the second curve.
   */
  public long HasLastPoint() {
    return OCCwrapJavaJNI.IntRes2d_IntersectionSegment_HasLastPoint(swigCPtr, this);
  }

  /**
   *  Returns   the  last point  of the    segment as an
   *  IntersectionPoint   (with  a    transition).   The
   *  exception        DomainError     is   raised    if
   *  HasLastExtremity returns False.
   */
  public  IntRes2d_IntersectionPoint  LastPoint() {
    IntRes2d_IntersectionPoint ret = new IntRes2d_IntersectionPoint(OCCwrapJavaJNI.IntRes2d_IntersectionSegment_LastPoint(swigCPtr, this), true);
    return ret;
  }

}
