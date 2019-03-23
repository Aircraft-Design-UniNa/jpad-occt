package opencascade;

/**
 *  define an order 3 derivatives of a 3d valued
 *  function of a 2d variable
 */
public class Plate_D3 {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Plate_D3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Plate_D3(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Plate_D3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (Plate_D3 ptr) { Ptr = ptr; }
    public Plate_D3 AsReference () { return Ptr; }
    public Plate_D3 AsCopy () { return Ptr.MakeCopy(); }
    public Plate_D3 Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Plate_D3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Plate_D3( gp_XYZ  duuu,  gp_XYZ  duuv,  gp_XYZ  duvv,  gp_XYZ  dvvv) {
    this(OCCwrapJavaJNI.new_Plate_D3__SWIG_0(gp_XYZ.getCPtr(duuu), duuu, gp_XYZ.getCPtr(duuv), duuv, gp_XYZ.getCPtr(duvv), duvv, gp_XYZ.getCPtr(dvvv), dvvv), true);
  }

  public Plate_D3( Plate_D3  ref) {
    this(OCCwrapJavaJNI.new_Plate_D3__SWIG_1(Plate_D3.getCPtr(ref), ref), true);
  }

}
