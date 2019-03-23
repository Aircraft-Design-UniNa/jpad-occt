package opencascade;

/**
 *  Defines  the root   class  of  all  the  Intersections
 *  between  two 2D-Curves, and  provides all  the methods
 *  about the results of the Intersections Algorithms.
 */
public class IntRes2d_Intersection {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntRes2d_Intersection(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntRes2d_Intersection(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntRes2d_Intersection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  /**
   *  returns TRUE when the computation was successful.
   */
  public long IsDone() {
    return OCCwrapJavaJNI.IntRes2d_Intersection_IsDone(swigCPtr, this);
  }

  /**
   *  Returns TRUE if there is no intersection between the
   *  given arguments.
   *  The exception NotDone is raised if IsDone returns FALSE.
   */
  public long IsEmpty() {
    return OCCwrapJavaJNI.IntRes2d_Intersection_IsEmpty(swigCPtr, this);
  }

  /**
   *  This function returns the number of intersection
   *  points between the 2 curves.
   *  The exception NotDone is raised if IsDone returns FALSE.
   */
  public int NbPoints() {
    return OCCwrapJavaJNI.IntRes2d_Intersection_NbPoints(swigCPtr, this);
  }

  /**
   *  This function returns the intersection point
   *  of range N;
   *  The exception NotDone is raised if IsDone returns FALSE.
   *  The exception OutOfRange is raised if (N <= 0)
   *  or (N > NbPoints).
   */
  public  IntRes2d_IntersectionPoint  Point(int N) {
    IntRes2d_IntersectionPoint ret = new IntRes2d_IntersectionPoint(OCCwrapJavaJNI.IntRes2d_Intersection_Point(swigCPtr, this, N), true);
    return ret;
  }

  /**
   *  This function returns the number of intersection
   *  segments between the two curves.
   *  The exception NotDone is raised if IsDone returns FALSE.
   */
  public int NbSegments() {
    return OCCwrapJavaJNI.IntRes2d_Intersection_NbSegments(swigCPtr, this);
  }

  /**
   *  This function returns the intersection segment
   *  of range N;
   *  The exception NotDone is raised if IsDone returns FALSE.
   *  The exception OutOfRange is raised if (N <= 0)
   *  or (N > NbPoints).
   */
  public  IntRes2d_IntersectionSegment  Segment(int N) {
    IntRes2d_IntersectionSegment ret = new IntRes2d_IntersectionSegment(OCCwrapJavaJNI.IntRes2d_Intersection_Segment(swigCPtr, this, N), true);
    return ret;
  }

  public void SetReversedParameters(long Reverseflag) {
    OCCwrapJavaJNI.IntRes2d_Intersection_SetReversedParameters(swigCPtr, this, Reverseflag);
  }

}
