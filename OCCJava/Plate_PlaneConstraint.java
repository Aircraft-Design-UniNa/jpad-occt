package opencascade;

/**
 *  constraint a point to belong to a Plane
 */
public class Plate_PlaneConstraint {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Plate_PlaneConstraint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Plate_PlaneConstraint(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Plate_PlaneConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (Plate_PlaneConstraint ptr) { Ptr = ptr; }
    public Plate_PlaneConstraint AsReference () { return Ptr; }
    public Plate_PlaneConstraint AsCopy () { return Ptr.MakeCopy(); }
    public Plate_PlaneConstraint Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Plate_PlaneConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Plate_PlaneConstraint( gp_XY  point2d,  gp_Pln  pln, int iu, int iv) {
    this(OCCwrapJavaJNI.new_Plate_PlaneConstraint__SWIG_0(gp_XY.getCPtr(point2d), point2d, gp_Pln.getCPtr(pln), pln, iu, iv), true);
  }

  public Plate_PlaneConstraint( gp_XY  point2d,  gp_Pln  pln, int iu) {
    this(OCCwrapJavaJNI.new_Plate_PlaneConstraint__SWIG_1(gp_XY.getCPtr(point2d), point2d, gp_Pln.getCPtr(pln), pln, iu), true);
  }

  public Plate_PlaneConstraint( gp_XY  point2d,  gp_Pln  pln) {
    this(OCCwrapJavaJNI.new_Plate_PlaneConstraint__SWIG_2(gp_XY.getCPtr(point2d), point2d, gp_Pln.getCPtr(pln), pln), true);
  }

  public  Plate_LinearScalarConstraint  LSC() {
    Plate_LinearScalarConstraint ret = new Plate_LinearScalarConstraint(OCCwrapJavaJNI.Plate_PlaneConstraint_LSC(swigCPtr, this), true);
    return ret;
  }

}
