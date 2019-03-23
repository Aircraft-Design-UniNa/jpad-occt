package opencascade;

/**
 *  An algorithm for computing local properties of a curve.
 *  These properties include:
 *  - the maximum and minimum curvatures
 *  - the inflection points.
 *  A CurAndInf2d object provides the framework for:
 *  - defining the curve to be analyzed
 *  - implementing the computation algorithms
 *  - consulting the results.
 */
public class Geom2dLProp_CurAndInf2d extends LProp_CurAndInf {

  private long swigCPtr;
  Geom2dLProp_CurAndInf2d(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.Geom2dLProp_CurAndInf2d_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  Geom2dLProp_CurAndInf2d(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.Geom2dLProp_CurAndInf2d_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(Geom2dLProp_CurAndInf2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Geom2dLProp_CurAndInf2d(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Initializes the framework.
   *  Note: The curve on which the local properties are
   *  computed is defined using one of the following
   *  functions: Perform, PerformCurExt or PerformInf.
   */
  public Geom2dLProp_CurAndInf2d() {
    this(OCCwrapJavaJNI.new_Geom2dLProp_CurAndInf2d(), true);
  }

  /**
   *  For the curve C, Computes both the
   *  inflection points and the maximum and minimum curvatures.
   */
  public void Perform( Geom2d_Curve  C) {
    OCCwrapJavaJNI.Geom2dLProp_CurAndInf2d_Perform(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C);
  }

  /**
   *  For the curve C, Computes the locals extremas of curvature.
   */
  public void PerformCurExt( Geom2d_Curve  C) {
    OCCwrapJavaJNI.Geom2dLProp_CurAndInf2d_PerformCurExt(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C);
  }

  /**
   *  For the curve C, Computes the inflections.
   *  After computation, the following functions can be used:
   *  - IsDone to check if the computation was successful
   *  - NbPoints to obtain the number of computed particular points
   *  - Parameter to obtain the parameter on the curve for
   *  each particular point
   *  - Type to check if the point is an inflection point or an
   *  extremum of curvature of the curve C.
   *  Warning
   *  These functions can be used to analyze a series of
   *  curves, however it is necessary to clear the table of
   *  results between each computation.
   */
  public void PerformInf( Geom2d_Curve  C) {
    OCCwrapJavaJNI.Geom2dLProp_CurAndInf2d_PerformInf(swigCPtr, this,  Geom2d_Curve.getCPtr(C) , C);
  }

  /**
   *  True if the solutions are found.
   */
  public long IsDone() {
    return OCCwrapJavaJNI.Geom2dLProp_CurAndInf2d_IsDone(swigCPtr, this);
  }

}
