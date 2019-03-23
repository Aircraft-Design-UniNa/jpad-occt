package opencascade;

public class TColStd_Array2OfTransient {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_Array2OfTransient(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_Array2OfTransient(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_Array2OfTransient obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_Array2OfTransient(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColStd_Array2OfTransient(int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array2OfTransient__SWIG_0(theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public TColStd_Array2OfTransient( TColStd_Array2OfTransient  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_Array2OfTransient__SWIG_1(TColStd_Array2OfTransient.getCPtr(theOther), theOther), true);
  }

  public TColStd_Array2OfTransient( Standard_Transient  theBegin, int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_TColStd_Array2OfTransient__SWIG_2( Standard_Transient.getCPtr(theBegin) , theBegin, theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public void Init( Standard_Transient  theValue) {
    OCCwrapJavaJNI.TColStd_Array2OfTransient_Init(swigCPtr, this,  Standard_Transient.getCPtr(theValue) , theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_Array2OfTransient_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_Array2OfTransient_Length(swigCPtr, this);
  }

  public int RowLength() {
    return OCCwrapJavaJNI.TColStd_Array2OfTransient_RowLength(swigCPtr, this);
  }

  public int ColLength() {
    return OCCwrapJavaJNI.TColStd_Array2OfTransient_ColLength(swigCPtr, this);
  }

  public int LowerRow() {
    return OCCwrapJavaJNI.TColStd_Array2OfTransient_LowerRow(swigCPtr, this);
  }

  public int UpperRow() {
    return OCCwrapJavaJNI.TColStd_Array2OfTransient_UpperRow(swigCPtr, this);
  }

  public int LowerCol() {
    return OCCwrapJavaJNI.TColStd_Array2OfTransient_LowerCol(swigCPtr, this);
  }

  public int UpperCol() {
    return OCCwrapJavaJNI.TColStd_Array2OfTransient_UpperCol(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColStd_Array2OfTransient_IsDeletable(swigCPtr, this);
  }

  public  TColStd_Array2OfTransient  Assign( TColStd_Array2OfTransient  theOther) {
    TColStd_Array2OfTransient ret = new TColStd_Array2OfTransient(OCCwrapJavaJNI.TColStd_Array2OfTransient_Assign(swigCPtr, this, TColStd_Array2OfTransient.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  Standard_Transient  Value(int theRow, int theCol) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_Array2OfTransient_Value(swigCPtr, this, theRow, theCol), true );
  }

  public  Standard_Transient  ChangeValue(int theRow, int theCol) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_Array2OfTransient_ChangeValue(swigCPtr, this, theRow, theCol), true );
  }

  public void SetValue(int theRow, int theCol,  Standard_Transient  theItem) {
    OCCwrapJavaJNI.TColStd_Array2OfTransient_SetValue(swigCPtr, this, theRow, theCol,  Standard_Transient.getCPtr(theItem) , theItem);
  }

}
