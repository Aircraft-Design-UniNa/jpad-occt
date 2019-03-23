package opencascade;

/**
 *  define an order 2 derivatives of a 3d valued
 *  function of a 2d variable
 */
public class Plate_D2 {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Plate_D2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Plate_D2(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Plate_D2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (Plate_D2 ptr) { Ptr = ptr; }
    public Plate_D2 AsReference () { return Ptr; }
    public Plate_D2 AsCopy () { return Ptr.MakeCopy(); }
    public Plate_D2 Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Plate_D2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Plate_D2( gp_XYZ  duu,  gp_XYZ  duv,  gp_XYZ  dvv) {
    this(OCCwrapJavaJNI.new_Plate_D2__SWIG_0(gp_XYZ.getCPtr(duu), duu, gp_XYZ.getCPtr(duv), duv, gp_XYZ.getCPtr(dvv), dvv), true);
  }

  public Plate_D2( Plate_D2  ref) {
    this(OCCwrapJavaJNI.new_Plate_D2__SWIG_1(Plate_D2.getCPtr(ref), ref), true);
  }

}
