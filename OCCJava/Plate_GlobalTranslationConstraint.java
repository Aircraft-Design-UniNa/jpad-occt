package opencascade;

/**
 *  force a set of UV points to translate without deformation
 */
public class Plate_GlobalTranslationConstraint {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Plate_GlobalTranslationConstraint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Plate_GlobalTranslationConstraint(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Plate_GlobalTranslationConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (Plate_GlobalTranslationConstraint ptr) { Ptr = ptr; }
    public Plate_GlobalTranslationConstraint AsReference () { return Ptr; }
    public Plate_GlobalTranslationConstraint AsCopy () { return Ptr.MakeCopy(); }
    public Plate_GlobalTranslationConstraint Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Plate_GlobalTranslationConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Plate_GlobalTranslationConstraint( TColgp_SequenceOfXY  SOfXY) {
    this(OCCwrapJavaJNI.new_Plate_GlobalTranslationConstraint(TColgp_SequenceOfXY.getCPtr(SOfXY), SOfXY), true);
  }

  public  Plate_LinearXYZConstraint  LXYZC() {
    Plate_LinearXYZConstraint ret = new Plate_LinearXYZConstraint(OCCwrapJavaJNI.Plate_GlobalTranslationConstraint_LXYZC(swigCPtr, this), true);
    return ret;
  }

}
