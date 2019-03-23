package opencascade;

/**
 *  define on or several constraints  as linear combination of
 *  the X,Y and Z components of a set of PinPointConstraint
 */
public class Plate_LinearScalarConstraint {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Plate_LinearScalarConstraint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Plate_LinearScalarConstraint(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Plate_LinearScalarConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (Plate_LinearScalarConstraint ptr) { Ptr = ptr; }
    public Plate_LinearScalarConstraint AsReference () { return Ptr; }
    public Plate_LinearScalarConstraint AsCopy () { return Ptr.MakeCopy(); }
    public Plate_LinearScalarConstraint Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Plate_LinearScalarConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Plate_LinearScalarConstraint() {
    this(OCCwrapJavaJNI.new_Plate_LinearScalarConstraint__SWIG_0(), true);
  }

  public Plate_LinearScalarConstraint( Plate_PinpointConstraint  thePPC1,  gp_XYZ  theCoeff) {
    this(OCCwrapJavaJNI.new_Plate_LinearScalarConstraint__SWIG_1(Plate_PinpointConstraint.getCPtr(thePPC1), thePPC1, gp_XYZ.getCPtr(theCoeff), theCoeff), true);
  }

  public Plate_LinearScalarConstraint( Plate_Array1OfPinpointConstraint  thePPC,  TColgp_Array1OfXYZ  theCoeff) {
    this(OCCwrapJavaJNI.new_Plate_LinearScalarConstraint__SWIG_2(Plate_Array1OfPinpointConstraint.getCPtr(thePPC), thePPC, TColgp_Array1OfXYZ.getCPtr(theCoeff), theCoeff), true);
  }

  public Plate_LinearScalarConstraint( Plate_Array1OfPinpointConstraint  thePPC,  TColgp_Array2OfXYZ  theCoeff) {
    this(OCCwrapJavaJNI.new_Plate_LinearScalarConstraint__SWIG_3(Plate_Array1OfPinpointConstraint.getCPtr(thePPC), thePPC, TColgp_Array2OfXYZ.getCPtr(theCoeff), theCoeff), true);
  }

  public Plate_LinearScalarConstraint(int ColLen, int RowLen) {
    this(OCCwrapJavaJNI.new_Plate_LinearScalarConstraint__SWIG_4(ColLen, RowLen), true);
  }

  public  Plate_Array1OfPinpointConstraint  GetPPC() {
    Plate_Array1OfPinpointConstraint ret = new Plate_Array1OfPinpointConstraint(OCCwrapJavaJNI.Plate_LinearScalarConstraint_GetPPC(swigCPtr, this), false, this);
    return ret;
  }

  public  TColgp_Array2OfXYZ  Coeff() {
    TColgp_Array2OfXYZ ret = new TColgp_Array2OfXYZ(OCCwrapJavaJNI.Plate_LinearScalarConstraint_Coeff(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Sets   the PinPointConstraint of   index Index to
   *  Value raise if Index is greater than the length of
   *  PPC or the Row length of coeff or lower  than 1
   */
  public void SetPPC(int Index,  Plate_PinpointConstraint  Value) {
    OCCwrapJavaJNI.Plate_LinearScalarConstraint_SetPPC(swigCPtr, this, Index, Plate_PinpointConstraint.getCPtr(Value), Value);
  }

  /**
   *  Sets the coeff  of index (Row,Col)  to Value
   *  raise if  Row (respectively Col)  is greater than the
   *  Row (respectively Column) length of coeff
   */
  public void SetCoeff(int Row, int Col,  gp_XYZ  Value) {
    OCCwrapJavaJNI.Plate_LinearScalarConstraint_SetCoeff(swigCPtr, this, Row, Col, gp_XYZ.getCPtr(Value), Value);
  }

}
