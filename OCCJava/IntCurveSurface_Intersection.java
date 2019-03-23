package opencascade;

public class IntCurveSurface_Intersection {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntCurveSurface_Intersection(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntCurveSurface_Intersection(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntCurveSurface_Intersection obj) {
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
   *  returns the <done> field.
   */
  public long IsDone() {
    return OCCwrapJavaJNI.IntCurveSurface_Intersection_IsDone(swigCPtr, this);
  }

  /**
   *  returns the number of IntersectionPoint
   *  if IsDone returns True.
   *  else NotDone is raised.
   */
  public int NbPoints() {
    return OCCwrapJavaJNI.IntCurveSurface_Intersection_NbPoints(swigCPtr, this);
  }

  /**
   *  returns the IntersectionPoint of range <Index>
   *  raises NotDone if the computation has failed or if
   *  the computation has not been done
   *  raises OutOfRange if Index is not in the range <1..NbPoints>
   */
  public  IntCurveSurface_IntersectionPoint  Point(int Index) {
    IntCurveSurface_IntersectionPoint ret = new IntCurveSurface_IntersectionPoint(OCCwrapJavaJNI.IntCurveSurface_Intersection_Point(swigCPtr, this, Index), true);
    return ret;
  }

  /**
   *  returns the number of IntersectionSegment
   *  if IsDone returns True.
   *  else NotDone is raised.
   */
  public int NbSegments() {
    return OCCwrapJavaJNI.IntCurveSurface_Intersection_NbSegments(swigCPtr, this);
  }

  /**
   *  returns the IntersectionSegment of range <Index>
   *  raises NotDone if the computation has failed or if
   *  the computation has not been done
   *  raises OutOfRange if Index is not in the range <1..NbSegment>
   */
  public  IntCurveSurface_IntersectionSegment  Segment(int Index) {
    IntCurveSurface_IntersectionSegment ret = new IntCurveSurface_IntersectionSegment(OCCwrapJavaJNI.IntCurveSurface_Intersection_Segment(swigCPtr, this, Index), true);
    return ret;
  }

  /**
   *  Returns true if curve is parallel or belongs surface
   *  This case is recognized only for some pairs 
   *  of analytical curves and surfaces (plane - line, ...)
   */
  public long IsParallel() {
    return OCCwrapJavaJNI.IntCurveSurface_Intersection_IsParallel(swigCPtr, this);
  }

  /**
   *  Dump all the fields.
   */
  public void Dump() {
    OCCwrapJavaJNI.IntCurveSurface_Intersection_Dump(swigCPtr, this);
  }

}
