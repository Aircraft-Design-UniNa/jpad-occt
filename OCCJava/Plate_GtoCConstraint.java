package opencascade;

/**
 *  define a G1, G2  or G3 constraint on the Plate
 */
public class Plate_GtoCConstraint {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Plate_GtoCConstraint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Plate_GtoCConstraint(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Plate_GtoCConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (Plate_GtoCConstraint ptr) { Ptr = ptr; }
    public Plate_GtoCConstraint AsReference () { return Ptr; }
    public Plate_GtoCConstraint AsCopy () { return Ptr.MakeCopy(); }
    public Plate_GtoCConstraint Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Plate_GtoCConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Plate_GtoCConstraint( Plate_GtoCConstraint  ref) {
    this(OCCwrapJavaJNI.new_Plate_GtoCConstraint__SWIG_0(Plate_GtoCConstraint.getCPtr(ref), ref), true);
  }

  public Plate_GtoCConstraint( gp_XY  point2d,  Plate_D1  D1S,  Plate_D1  D1T) {
    this(OCCwrapJavaJNI.new_Plate_GtoCConstraint__SWIG_1(gp_XY.getCPtr(point2d), point2d, Plate_D1.getCPtr(D1S), D1S, Plate_D1.getCPtr(D1T), D1T), true);
  }

  public Plate_GtoCConstraint( gp_XY  point2d,  Plate_D1  D1S,  Plate_D1  D1T,  gp_XYZ  nP) {
    this(OCCwrapJavaJNI.new_Plate_GtoCConstraint__SWIG_2(gp_XY.getCPtr(point2d), point2d, Plate_D1.getCPtr(D1S), D1S, Plate_D1.getCPtr(D1T), D1T, gp_XYZ.getCPtr(nP), nP), true);
  }

  public Plate_GtoCConstraint( gp_XY  point2d,  Plate_D1  D1S,  Plate_D1  D1T,  Plate_D2  D2S,  Plate_D2  D2T) {
    this(OCCwrapJavaJNI.new_Plate_GtoCConstraint__SWIG_3(gp_XY.getCPtr(point2d), point2d, Plate_D1.getCPtr(D1S), D1S, Plate_D1.getCPtr(D1T), D1T, Plate_D2.getCPtr(D2S), D2S, Plate_D2.getCPtr(D2T), D2T), true);
  }

  public Plate_GtoCConstraint( gp_XY  point2d,  Plate_D1  D1S,  Plate_D1  D1T,  Plate_D2  D2S,  Plate_D2  D2T,  gp_XYZ  nP) {
    this(OCCwrapJavaJNI.new_Plate_GtoCConstraint__SWIG_4(gp_XY.getCPtr(point2d), point2d, Plate_D1.getCPtr(D1S), D1S, Plate_D1.getCPtr(D1T), D1T, Plate_D2.getCPtr(D2S), D2S, Plate_D2.getCPtr(D2T), D2T, gp_XYZ.getCPtr(nP), nP), true);
  }

  public Plate_GtoCConstraint( gp_XY  point2d,  Plate_D1  D1S,  Plate_D1  D1T,  Plate_D2  D2S,  Plate_D2  D2T,  Plate_D3  D3S,  Plate_D3  D3T) {
    this(OCCwrapJavaJNI.new_Plate_GtoCConstraint__SWIG_5(gp_XY.getCPtr(point2d), point2d, Plate_D1.getCPtr(D1S), D1S, Plate_D1.getCPtr(D1T), D1T, Plate_D2.getCPtr(D2S), D2S, Plate_D2.getCPtr(D2T), D2T, Plate_D3.getCPtr(D3S), D3S, Plate_D3.getCPtr(D3T), D3T), true);
  }

  public Plate_GtoCConstraint( gp_XY  point2d,  Plate_D1  D1S,  Plate_D1  D1T,  Plate_D2  D2S,  Plate_D2  D2T,  Plate_D3  D3S,  Plate_D3  D3T,  gp_XYZ  nP) {
    this(OCCwrapJavaJNI.new_Plate_GtoCConstraint__SWIG_6(gp_XY.getCPtr(point2d), point2d, Plate_D1.getCPtr(D1S), D1S, Plate_D1.getCPtr(D1T), D1T, Plate_D2.getCPtr(D2S), D2S, Plate_D2.getCPtr(D2T), D2T, Plate_D3.getCPtr(D3S), D3S, Plate_D3.getCPtr(D3T), D3T, gp_XYZ.getCPtr(nP), nP), true);
  }

  public  int  nb_PPC() { return OCCwrapJavaJNI.Plate_GtoCConstraint_nb_PPC(swigCPtr, this); }

  public  Plate_PinpointConstraint  GetPPC(int Index) {
    Plate_PinpointConstraint ret = new Plate_PinpointConstraint(OCCwrapJavaJNI.Plate_GtoCConstraint_GetPPC(swigCPtr, this, Index), true);
    return ret;
  }

  public  Plate_D1  D1SurfInit() {
    Plate_D1 ret = new Plate_D1(OCCwrapJavaJNI.Plate_GtoCConstraint_D1SurfInit(swigCPtr, this), true);
    return ret;
  }

}
