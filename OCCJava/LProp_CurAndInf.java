package opencascade;

/**
 *  Stores the parameters of a curve 2d or 3d corresponding
 *  to the curvature's extremas and the Inflection's Points.
 */
public class LProp_CurAndInf {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  LProp_CurAndInf(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  LProp_CurAndInf(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(LProp_CurAndInf obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_LProp_CurAndInf(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public LProp_CurAndInf() {
    this(OCCwrapJavaJNI.new_LProp_CurAndInf(), true);
  }

  public void AddInflection(double Param) {
    OCCwrapJavaJNI.LProp_CurAndInf_AddInflection(swigCPtr, this, Param);
  }

  public void AddExtCur(double Param, long IsMin) {
    OCCwrapJavaJNI.LProp_CurAndInf_AddExtCur(swigCPtr, this, Param, IsMin);
  }

  public void Clear() {
    OCCwrapJavaJNI.LProp_CurAndInf_Clear(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.LProp_CurAndInf_IsEmpty(swigCPtr, this);
  }

  /**
   *  Returns the number of points.
   *  The Points are stored to increasing parameter.
   */
  public int NbPoints() {
    return OCCwrapJavaJNI.LProp_CurAndInf_NbPoints(swigCPtr, this);
  }

  /**
   *  Returns the parameter of the Nth point.
   *  raises if N not in the range [1,NbPoints()]
   */
  public double Parameter(int N) {
    return OCCwrapJavaJNI.LProp_CurAndInf_Parameter(swigCPtr, this, N);
  }

  /**
   *  Returns
   *  - MinCur if the Nth parameter corresponds to
   *  a minimum of the radius of curvature.
   *  - MaxCur if the Nth parameter corresponds to
   *  a maximum of the radius of curvature.
   *  - Inflection if the parameter corresponds to
   *  a point of inflection.
   *  raises if N not in the range [1,NbPoints()]
   */
  public LProp_CIType Type(int N) {
    return LProp_CIType.swigToEnum(OCCwrapJavaJNI.LProp_CurAndInf_Type(swigCPtr, this, N));
  }

}
