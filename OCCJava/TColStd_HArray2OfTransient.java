package opencascade;

public class TColStd_HArray2OfTransient extends Standard_Transient {
  TColStd_HArray2OfTransient(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColStd_HArray2OfTransient(int theRowLow, int theRowUpp, int theColLow, int theColUpp,  Standard_Transient  theValue) {
    this(OCCwrapJavaJNI.new_TColStd_HArray2OfTransient__SWIG_0(theRowLow, theRowUpp, theColLow, theColUpp,  Standard_Transient.getCPtr(theValue) , theValue), true);
  }

  public TColStd_HArray2OfTransient(int theRowLow, int theRowUpp, int theColLow, int theColUpp) {
    this(OCCwrapJavaJNI.new_TColStd_HArray2OfTransient__SWIG_1(theRowLow, theRowUpp, theColLow, theColUpp), true);
  }

  public TColStd_HArray2OfTransient( TColStd_Array2OfTransient  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_HArray2OfTransient__SWIG_2(TColStd_Array2OfTransient.getCPtr(theOther), theOther), true);
  }

  public  TColStd_Array2OfTransient  Array2() {
    TColStd_Array2OfTransient ret = new TColStd_Array2OfTransient(OCCwrapJavaJNI.TColStd_HArray2OfTransient_Array2(swigCPtr, this), false, this);
    return ret;
  }

  public  TColStd_Array2OfTransient  ChangeArray2() {
    TColStd_Array2OfTransient ret = new TColStd_Array2OfTransient(OCCwrapJavaJNI.TColStd_HArray2OfTransient_ChangeArray2(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_HArray2OfTransient_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_HArray2OfTransient_Length(swigCPtr, this);
  }

  public int RowLength() {
    return OCCwrapJavaJNI.TColStd_HArray2OfTransient_RowLength(swigCPtr, this);
  }

  public int ColLength() {
    return OCCwrapJavaJNI.TColStd_HArray2OfTransient_ColLength(swigCPtr, this);
  }

  public int LowerRow() {
    return OCCwrapJavaJNI.TColStd_HArray2OfTransient_LowerRow(swigCPtr, this);
  }

  public int UpperRow() {
    return OCCwrapJavaJNI.TColStd_HArray2OfTransient_UpperRow(swigCPtr, this);
  }

  public int LowerCol() {
    return OCCwrapJavaJNI.TColStd_HArray2OfTransient_LowerCol(swigCPtr, this);
  }

  public int UpperCol() {
    return OCCwrapJavaJNI.TColStd_HArray2OfTransient_UpperCol(swigCPtr, this);
  }

  public  Standard_Transient  Value(int theRow, int theCol) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_HArray2OfTransient_Value(swigCPtr, this, theRow, theCol), true );
  }

  public  Standard_Transient  ChangeValue(int theRow, int theCol) {
    return new Standard_Transient ( OCCwrapJavaJNI.TColStd_HArray2OfTransient_ChangeValue(swigCPtr, this, theRow, theCol), true );
  }

  public void SetValue(int theRow, int theCol,  Standard_Transient  theItem) {
    OCCwrapJavaJNI.TColStd_HArray2OfTransient_SetValue(swigCPtr, this, theRow, theCol,  Standard_Transient.getCPtr(theItem) , theItem);
  }

  public static  TColStd_HArray2OfTransient  DownCast( Standard_Transient  T) {
    return new TColStd_HArray2OfTransient ( OCCwrapJavaJNI.TColStd_HArray2OfTransient_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColStd_HArray2OfTransient_TypeOf(), true );
  }

}
