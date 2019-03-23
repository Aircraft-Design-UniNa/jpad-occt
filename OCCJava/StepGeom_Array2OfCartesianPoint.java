package opencascade;

public class StepGeom_Array2OfCartesianPoint {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepGeom_Array2OfCartesianPoint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepGeom_Array2OfCartesianPoint(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepGeom_Array2OfCartesianPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepGeom_Array2OfCartesianPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StepGeom_Array2OfCartesianPoint(int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_StepGeom_Array2OfCartesianPoint__SWIG_0(theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public StepGeom_Array2OfCartesianPoint( StepGeom_Array2OfCartesianPoint  theOther) {
    this(OCCwrapJavaJNI.new_StepGeom_Array2OfCartesianPoint__SWIG_1(StepGeom_Array2OfCartesianPoint.getCPtr(theOther), theOther), true);
  }

  public StepGeom_Array2OfCartesianPoint( StepGeom_CartesianPoint  theBegin, int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_StepGeom_Array2OfCartesianPoint__SWIG_2( StepGeom_CartesianPoint.getCPtr(theBegin) , theBegin, theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public void Init( StepGeom_CartesianPoint  theValue) {
    OCCwrapJavaJNI.StepGeom_Array2OfCartesianPoint_Init(swigCPtr, this,  StepGeom_CartesianPoint.getCPtr(theValue) , theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.StepGeom_Array2OfCartesianPoint_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepGeom_Array2OfCartesianPoint_Length(swigCPtr, this);
  }

  public int RowLength() {
    return OCCwrapJavaJNI.StepGeom_Array2OfCartesianPoint_RowLength(swigCPtr, this);
  }

  public int ColLength() {
    return OCCwrapJavaJNI.StepGeom_Array2OfCartesianPoint_ColLength(swigCPtr, this);
  }

  public int LowerRow() {
    return OCCwrapJavaJNI.StepGeom_Array2OfCartesianPoint_LowerRow(swigCPtr, this);
  }

  public int UpperRow() {
    return OCCwrapJavaJNI.StepGeom_Array2OfCartesianPoint_UpperRow(swigCPtr, this);
  }

  public int LowerCol() {
    return OCCwrapJavaJNI.StepGeom_Array2OfCartesianPoint_LowerCol(swigCPtr, this);
  }

  public int UpperCol() {
    return OCCwrapJavaJNI.StepGeom_Array2OfCartesianPoint_UpperCol(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.StepGeom_Array2OfCartesianPoint_IsDeletable(swigCPtr, this);
  }

  public  StepGeom_Array2OfCartesianPoint  Assign( StepGeom_Array2OfCartesianPoint  theOther) {
    StepGeom_Array2OfCartesianPoint ret = new StepGeom_Array2OfCartesianPoint(OCCwrapJavaJNI.StepGeom_Array2OfCartesianPoint_Assign(swigCPtr, this, StepGeom_Array2OfCartesianPoint.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  StepGeom_CartesianPoint  Value(int theRow, int theCol) {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_Array2OfCartesianPoint_Value(swigCPtr, this, theRow, theCol), true );
  }

  public  StepGeom_CartesianPoint  ChangeValue(int theRow, int theCol) {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_Array2OfCartesianPoint_ChangeValue(swigCPtr, this, theRow, theCol), true );
  }

  public void SetValue(int theRow, int theCol,  StepGeom_CartesianPoint  theItem) {
    OCCwrapJavaJNI.StepGeom_Array2OfCartesianPoint_SetValue(swigCPtr, this, theRow, theCol,  StepGeom_CartesianPoint.getCPtr(theItem) , theItem);
  }

}
