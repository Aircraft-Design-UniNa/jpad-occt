package opencascade;

/**
 *  define on or several constraints as linear combination of
 *  PinPointConstraint unlike the LinearScalarConstraint, usage
 *  of this kind of constraint preserve the X,Y and Z uncoupling.
 */
public class Plate_LinearXYZConstraint {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Plate_LinearXYZConstraint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Plate_LinearXYZConstraint(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Plate_LinearXYZConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (Plate_LinearXYZConstraint ptr) { Ptr = ptr; }
    public Plate_LinearXYZConstraint AsReference () { return Ptr; }
    public Plate_LinearXYZConstraint AsCopy () { return Ptr.MakeCopy(); }
    public Plate_LinearXYZConstraint Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Plate_LinearXYZConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Plate_LinearXYZConstraint() {
    this(OCCwrapJavaJNI.new_Plate_LinearXYZConstraint__SWIG_0(), true);
  }

  public Plate_LinearXYZConstraint( Plate_Array1OfPinpointConstraint  thePPC,  TColStd_Array1OfReal  theCoeff) {
    this(OCCwrapJavaJNI.new_Plate_LinearXYZConstraint__SWIG_1(Plate_Array1OfPinpointConstraint.getCPtr(thePPC), thePPC, TColStd_Array1OfReal.getCPtr(theCoeff), theCoeff), true);
  }

  public Plate_LinearXYZConstraint( Plate_Array1OfPinpointConstraint  thePPC,  TColStd_Array2OfReal  theCoeff) {
    this(OCCwrapJavaJNI.new_Plate_LinearXYZConstraint__SWIG_2(Plate_Array1OfPinpointConstraint.getCPtr(thePPC), thePPC, TColStd_Array2OfReal.getCPtr(theCoeff), theCoeff), true);
  }

  public Plate_LinearXYZConstraint(int ColLen, int RowLen) {
    this(OCCwrapJavaJNI.new_Plate_LinearXYZConstraint__SWIG_3(ColLen, RowLen), true);
  }

  public  Plate_Array1OfPinpointConstraint  GetPPC() {
    Plate_Array1OfPinpointConstraint ret = new Plate_Array1OfPinpointConstraint(OCCwrapJavaJNI.Plate_LinearXYZConstraint_GetPPC(swigCPtr, this), false, this);
    return ret;
  }

  public  TColStd_Array2OfReal  Coeff() {
    TColStd_Array2OfReal ret = new TColStd_Array2OfReal(OCCwrapJavaJNI.Plate_LinearXYZConstraint_Coeff(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Sets   the PinPointConstraint of   index Index to
   *  Value raise if Index is greater than the length of
   *  PPC or the Row length of coeff or lower  than 1
   */
  public void SetPPC(int Index,  Plate_PinpointConstraint  Value) {
    OCCwrapJavaJNI.Plate_LinearXYZConstraint_SetPPC(swigCPtr, this, Index, Plate_PinpointConstraint.getCPtr(Value), Value);
  }

  /**
   *  Sets the coeff  of index (Row,Col)  to Value
   *  raise if  Row (respectively Col)  is greater than the
   *  Row (respectively Column) length of coeff
   */
  public void SetCoeff(int Row, int Col, double Value) {
    OCCwrapJavaJNI.Plate_LinearXYZConstraint_SetCoeff(swigCPtr, this, Row, Col, Value);
  }

}
