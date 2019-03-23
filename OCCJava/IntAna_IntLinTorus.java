package opencascade;

/**
 *  Intersection between a line and a torus.
 */
public class IntAna_IntLinTorus {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntAna_IntLinTorus(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntAna_IntLinTorus(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntAna_IntLinTorus obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (IntAna_IntLinTorus ptr) { Ptr = ptr; }
    public IntAna_IntLinTorus AsReference () { return Ptr; }
    public IntAna_IntLinTorus AsCopy () { return Ptr.MakeCopy(); }
    public IntAna_IntLinTorus Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntAna_IntLinTorus(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntAna_IntLinTorus() {
    this(OCCwrapJavaJNI.new_IntAna_IntLinTorus__SWIG_0(), true);
  }

  /**
   *  Creates the intersection between a line and a torus.
   */
  public IntAna_IntLinTorus( gp_Lin  L,  gp_Torus  T) {
    this(OCCwrapJavaJNI.new_IntAna_IntLinTorus__SWIG_1(gp_Lin.getCPtr(L), L, gp_Torus.getCPtr(T), T), true);
  }

  /**
   *  Intersects a line and a torus.
   */
  public void Perform( gp_Lin  L,  gp_Torus  T) {
    OCCwrapJavaJNI.IntAna_IntLinTorus_Perform(swigCPtr, this, gp_Lin.getCPtr(L), L, gp_Torus.getCPtr(T), T);
  }

  /**
   *  Returns True if the computation was successful.
   */
  public long IsDone() {
    return OCCwrapJavaJNI.IntAna_IntLinTorus_IsDone(swigCPtr, this);
  }

  /**
   *  Returns the number of intersection points.
   */
  public int NbPoints() {
    return OCCwrapJavaJNI.IntAna_IntLinTorus_NbPoints(swigCPtr, this);
  }

  /**
   *  Returns the intersection point of range Index.
   */
  public  gp_Pnt  Value(int Index) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.IntAna_IntLinTorus_Value(swigCPtr, this, Index), true);
    return ret;
  }

  /**
   *  Returns the parameter on the line of the intersection
   *  point of range Index.
   */
  public double ParamOnLine(int Index) {
    return OCCwrapJavaJNI.IntAna_IntLinTorus_ParamOnLine(swigCPtr, this, Index);
  }

  /**
   *  Returns the parameters on the torus of the intersection
   *  point of range Index.
   */
  public void ParamOnTorus(int Index, double[] FI, double[] THETA) {
    OCCwrapJavaJNI.IntAna_IntLinTorus_ParamOnTorus(swigCPtr, this, Index, FI, THETA);
  }

}
