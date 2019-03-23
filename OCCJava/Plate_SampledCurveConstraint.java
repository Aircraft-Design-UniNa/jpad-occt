package opencascade;

/**
 *  define m PinPointConstraint driven by m unknown
 */
public class Plate_SampledCurveConstraint {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Plate_SampledCurveConstraint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Plate_SampledCurveConstraint(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Plate_SampledCurveConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (Plate_SampledCurveConstraint ptr) { Ptr = ptr; }
    public Plate_SampledCurveConstraint AsReference () { return Ptr; }
    public Plate_SampledCurveConstraint AsCopy () { return Ptr.MakeCopy(); }
    public Plate_SampledCurveConstraint Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Plate_SampledCurveConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Plate_SampledCurveConstraint( Plate_SequenceOfPinpointConstraint  SOPPC, int n) {
    this(OCCwrapJavaJNI.new_Plate_SampledCurveConstraint(Plate_SequenceOfPinpointConstraint.getCPtr(SOPPC), SOPPC, n), true);
  }

  public  Plate_LinearXYZConstraint  LXYZC() {
    Plate_LinearXYZConstraint ret = new Plate_LinearXYZConstraint(OCCwrapJavaJNI.Plate_SampledCurveConstraint_LXYZC(swigCPtr, this), true);
    return ret;
  }

}
