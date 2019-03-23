package opencascade;

/**
 *  constraint a point to belong to a straight line
 */
public class Plate_LineConstraint {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Plate_LineConstraint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Plate_LineConstraint(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Plate_LineConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (Plate_LineConstraint ptr) { Ptr = ptr; }
    public Plate_LineConstraint AsReference () { return Ptr; }
    public Plate_LineConstraint AsCopy () { return Ptr.MakeCopy(); }
    public Plate_LineConstraint Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Plate_LineConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Plate_LineConstraint( gp_XY  point2d,  gp_Lin  lin, int iu, int iv) {
    this(OCCwrapJavaJNI.new_Plate_LineConstraint__SWIG_0(gp_XY.getCPtr(point2d), point2d, gp_Lin.getCPtr(lin), lin, iu, iv), true);
  }

  public Plate_LineConstraint( gp_XY  point2d,  gp_Lin  lin, int iu) {
    this(OCCwrapJavaJNI.new_Plate_LineConstraint__SWIG_1(gp_XY.getCPtr(point2d), point2d, gp_Lin.getCPtr(lin), lin, iu), true);
  }

  public Plate_LineConstraint( gp_XY  point2d,  gp_Lin  lin) {
    this(OCCwrapJavaJNI.new_Plate_LineConstraint__SWIG_2(gp_XY.getCPtr(point2d), point2d, gp_Lin.getCPtr(lin), lin), true);
  }

  public  Plate_LinearScalarConstraint  LSC() {
    Plate_LinearScalarConstraint ret = new Plate_LinearScalarConstraint(OCCwrapJavaJNI.Plate_LineConstraint_LSC(swigCPtr, this), true);
    return ret;
  }

}
