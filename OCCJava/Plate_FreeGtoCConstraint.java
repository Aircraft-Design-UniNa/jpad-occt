package opencascade;

/**
 *  define a G1, G2 or G3 constraint on the Plate using weaker
 *  constraint than GtoCConstraint
 */
public class Plate_FreeGtoCConstraint {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Plate_FreeGtoCConstraint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Plate_FreeGtoCConstraint(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Plate_FreeGtoCConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (Plate_FreeGtoCConstraint ptr) { Ptr = ptr; }
    public Plate_FreeGtoCConstraint AsReference () { return Ptr; }
    public Plate_FreeGtoCConstraint AsCopy () { return Ptr.MakeCopy(); }
    public Plate_FreeGtoCConstraint Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Plate_FreeGtoCConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Plate_FreeGtoCConstraint( gp_XY  point2d,  Plate_D1  D1S,  Plate_D1  D1T, double IncrementalLoad, int orientation) {
    this(OCCwrapJavaJNI.new_Plate_FreeGtoCConstraint__SWIG_0(gp_XY.getCPtr(point2d), point2d, Plate_D1.getCPtr(D1S), D1S, Plate_D1.getCPtr(D1T), D1T, IncrementalLoad, orientation), true);
  }

  public Plate_FreeGtoCConstraint( gp_XY  point2d,  Plate_D1  D1S,  Plate_D1  D1T, double IncrementalLoad) {
    this(OCCwrapJavaJNI.new_Plate_FreeGtoCConstraint__SWIG_1(gp_XY.getCPtr(point2d), point2d, Plate_D1.getCPtr(D1S), D1S, Plate_D1.getCPtr(D1T), D1T, IncrementalLoad), true);
  }

  public Plate_FreeGtoCConstraint( gp_XY  point2d,  Plate_D1  D1S,  Plate_D1  D1T) {
    this(OCCwrapJavaJNI.new_Plate_FreeGtoCConstraint__SWIG_2(gp_XY.getCPtr(point2d), point2d, Plate_D1.getCPtr(D1S), D1S, Plate_D1.getCPtr(D1T), D1T), true);
  }

  public Plate_FreeGtoCConstraint( gp_XY  point2d,  Plate_D1  D1S,  Plate_D1  D1T,  Plate_D2  D2S,  Plate_D2  D2T, double IncrementalLoad, int orientation) {
    this(OCCwrapJavaJNI.new_Plate_FreeGtoCConstraint__SWIG_3(gp_XY.getCPtr(point2d), point2d, Plate_D1.getCPtr(D1S), D1S, Plate_D1.getCPtr(D1T), D1T, Plate_D2.getCPtr(D2S), D2S, Plate_D2.getCPtr(D2T), D2T, IncrementalLoad, orientation), true);
  }

  public Plate_FreeGtoCConstraint( gp_XY  point2d,  Plate_D1  D1S,  Plate_D1  D1T,  Plate_D2  D2S,  Plate_D2  D2T, double IncrementalLoad) {
    this(OCCwrapJavaJNI.new_Plate_FreeGtoCConstraint__SWIG_4(gp_XY.getCPtr(point2d), point2d, Plate_D1.getCPtr(D1S), D1S, Plate_D1.getCPtr(D1T), D1T, Plate_D2.getCPtr(D2S), D2S, Plate_D2.getCPtr(D2T), D2T, IncrementalLoad), true);
  }

  public Plate_FreeGtoCConstraint( gp_XY  point2d,  Plate_D1  D1S,  Plate_D1  D1T,  Plate_D2  D2S,  Plate_D2  D2T) {
    this(OCCwrapJavaJNI.new_Plate_FreeGtoCConstraint__SWIG_5(gp_XY.getCPtr(point2d), point2d, Plate_D1.getCPtr(D1S), D1S, Plate_D1.getCPtr(D1T), D1T, Plate_D2.getCPtr(D2S), D2S, Plate_D2.getCPtr(D2T), D2T), true);
  }

  public Plate_FreeGtoCConstraint( gp_XY  point2d,  Plate_D1  D1S,  Plate_D1  D1T,  Plate_D2  D2S,  Plate_D2  D2T,  Plate_D3  D3S,  Plate_D3  D3T, double IncrementalLoad, int orientation) {
    this(OCCwrapJavaJNI.new_Plate_FreeGtoCConstraint__SWIG_6(gp_XY.getCPtr(point2d), point2d, Plate_D1.getCPtr(D1S), D1S, Plate_D1.getCPtr(D1T), D1T, Plate_D2.getCPtr(D2S), D2S, Plate_D2.getCPtr(D2T), D2T, Plate_D3.getCPtr(D3S), D3S, Plate_D3.getCPtr(D3T), D3T, IncrementalLoad, orientation), true);
  }

  public Plate_FreeGtoCConstraint( gp_XY  point2d,  Plate_D1  D1S,  Plate_D1  D1T,  Plate_D2  D2S,  Plate_D2  D2T,  Plate_D3  D3S,  Plate_D3  D3T, double IncrementalLoad) {
    this(OCCwrapJavaJNI.new_Plate_FreeGtoCConstraint__SWIG_7(gp_XY.getCPtr(point2d), point2d, Plate_D1.getCPtr(D1S), D1S, Plate_D1.getCPtr(D1T), D1T, Plate_D2.getCPtr(D2S), D2S, Plate_D2.getCPtr(D2T), D2T, Plate_D3.getCPtr(D3S), D3S, Plate_D3.getCPtr(D3T), D3T, IncrementalLoad), true);
  }

  public Plate_FreeGtoCConstraint( gp_XY  point2d,  Plate_D1  D1S,  Plate_D1  D1T,  Plate_D2  D2S,  Plate_D2  D2T,  Plate_D3  D3S,  Plate_D3  D3T) {
    this(OCCwrapJavaJNI.new_Plate_FreeGtoCConstraint__SWIG_8(gp_XY.getCPtr(point2d), point2d, Plate_D1.getCPtr(D1S), D1S, Plate_D1.getCPtr(D1T), D1T, Plate_D2.getCPtr(D2S), D2S, Plate_D2.getCPtr(D2T), D2T, Plate_D3.getCPtr(D3S), D3S, Plate_D3.getCPtr(D3T), D3T), true);
  }

  public  int  nb_PPC() { return OCCwrapJavaJNI.Plate_FreeGtoCConstraint_nb_PPC(swigCPtr, this); }

  public  Plate_PinpointConstraint  GetPPC(int Index) {
    Plate_PinpointConstraint ret = new Plate_PinpointConstraint(OCCwrapJavaJNI.Plate_FreeGtoCConstraint_GetPPC(swigCPtr, this, Index), true);
    return ret;
  }

  public  int  nb_LSC() { return OCCwrapJavaJNI.Plate_FreeGtoCConstraint_nb_LSC(swigCPtr, this); }

  public  Plate_LinearScalarConstraint  LSC(int Index) {
    Plate_LinearScalarConstraint ret = new Plate_LinearScalarConstraint(OCCwrapJavaJNI.Plate_FreeGtoCConstraint_LSC(swigCPtr, this, Index), true);
    return ret;
  }

}
