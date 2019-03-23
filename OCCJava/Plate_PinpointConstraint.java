package opencascade;

/**
 *  define a constraint on the Plate
 */
public class Plate_PinpointConstraint {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Plate_PinpointConstraint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Plate_PinpointConstraint(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Plate_PinpointConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (Plate_PinpointConstraint ptr) { Ptr = ptr; }
    public Plate_PinpointConstraint AsReference () { return Ptr; }
    public Plate_PinpointConstraint AsCopy () { return Ptr.MakeCopy(); }
    public Plate_PinpointConstraint Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Plate_PinpointConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Plate_PinpointConstraint() {
    this(OCCwrapJavaJNI.new_Plate_PinpointConstraint__SWIG_0(), true);
  }

  public Plate_PinpointConstraint( gp_XY  point2d,  gp_XYZ  ImposedValue, int iu, int iv) {
    this(OCCwrapJavaJNI.new_Plate_PinpointConstraint__SWIG_1(gp_XY.getCPtr(point2d), point2d, gp_XYZ.getCPtr(ImposedValue), ImposedValue, iu, iv), true);
  }

  public Plate_PinpointConstraint( gp_XY  point2d,  gp_XYZ  ImposedValue, int iu) {
    this(OCCwrapJavaJNI.new_Plate_PinpointConstraint__SWIG_2(gp_XY.getCPtr(point2d), point2d, gp_XYZ.getCPtr(ImposedValue), ImposedValue, iu), true);
  }

  public Plate_PinpointConstraint( gp_XY  point2d,  gp_XYZ  ImposedValue) {
    this(OCCwrapJavaJNI.new_Plate_PinpointConstraint__SWIG_3(gp_XY.getCPtr(point2d), point2d, gp_XYZ.getCPtr(ImposedValue), ImposedValue), true);
  }

  public  gp_XY  Pnt2d() {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.Plate_PinpointConstraint_Pnt2d(swigCPtr, this), true);
    return ret;
  }

  public  int  Idu() { return OCCwrapJavaJNI.Plate_PinpointConstraint_Idu(swigCPtr, this); }

  public  int  Idv() { return OCCwrapJavaJNI.Plate_PinpointConstraint_Idv(swigCPtr, this); }

  public  gp_XYZ  Value() {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.Plate_PinpointConstraint_Value(swigCPtr, this), true);
    return ret;
  }

}
