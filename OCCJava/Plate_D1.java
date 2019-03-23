package opencascade;

/**
 *  define an order 1 derivatives of a 3d valued
 *  function of a 2d variable
 */
public class Plate_D1 {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Plate_D1(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Plate_D1(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Plate_D1 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (Plate_D1 ptr) { Ptr = ptr; }
    public Plate_D1 AsReference () { return Ptr; }
    public Plate_D1 AsCopy () { return Ptr.MakeCopy(); }
    public Plate_D1 Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Plate_D1(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Plate_D1( gp_XYZ  du,  gp_XYZ  dv) {
    this(OCCwrapJavaJNI.new_Plate_D1__SWIG_0(gp_XYZ.getCPtr(du), du, gp_XYZ.getCPtr(dv), dv), true);
  }

  public Plate_D1( Plate_D1  ref) {
    this(OCCwrapJavaJNI.new_Plate_D1__SWIG_1(Plate_D1.getCPtr(ref), ref), true);
  }

  public  gp_XYZ  DU() {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.Plate_D1_DU(swigCPtr, this), true);
    return ret;
  }

  public  gp_XYZ  DV() {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.Plate_D1_DV(swigCPtr, this), true);
    return ret;
  }

}
