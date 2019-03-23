package opencascade;

public class TColStd_HArray2OfInteger extends Standard_Transient {
  TColStd_HArray2OfInteger(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColStd_HArray2OfInteger(int theRowLow, int theRowUpp, int theColLow, int theColUpp,  int  theValue) {
    this(OCCwrapJavaJNI.new_TColStd_HArray2OfInteger__SWIG_0(theRowLow, theRowUpp, theColLow, theColUpp,  theValue ), true);
  }

  public TColStd_HArray2OfInteger(int theRowLow, int theRowUpp, int theColLow, int theColUpp) {
    this(OCCwrapJavaJNI.new_TColStd_HArray2OfInteger__SWIG_1(theRowLow, theRowUpp, theColLow, theColUpp), true);
  }

  public TColStd_HArray2OfInteger( TColStd_Array2OfInteger  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_HArray2OfInteger__SWIG_2(TColStd_Array2OfInteger.getCPtr(theOther), theOther), true);
  }

  public  TColStd_Array2OfInteger  Array2() {
    TColStd_Array2OfInteger ret = new TColStd_Array2OfInteger(OCCwrapJavaJNI.TColStd_HArray2OfInteger_Array2(swigCPtr, this), false, this);
    return ret;
  }

  public  TColStd_Array2OfInteger  ChangeArray2() {
    TColStd_Array2OfInteger ret = new TColStd_Array2OfInteger(OCCwrapJavaJNI.TColStd_HArray2OfInteger_ChangeArray2(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_HArray2OfInteger_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_HArray2OfInteger_Length(swigCPtr, this);
  }

  public int RowLength() {
    return OCCwrapJavaJNI.TColStd_HArray2OfInteger_RowLength(swigCPtr, this);
  }

  public int ColLength() {
    return OCCwrapJavaJNI.TColStd_HArray2OfInteger_ColLength(swigCPtr, this);
  }

  public int LowerRow() {
    return OCCwrapJavaJNI.TColStd_HArray2OfInteger_LowerRow(swigCPtr, this);
  }

  public int UpperRow() {
    return OCCwrapJavaJNI.TColStd_HArray2OfInteger_UpperRow(swigCPtr, this);
  }

  public int LowerCol() {
    return OCCwrapJavaJNI.TColStd_HArray2OfInteger_LowerCol(swigCPtr, this);
  }

  public int UpperCol() {
    return OCCwrapJavaJNI.TColStd_HArray2OfInteger_UpperCol(swigCPtr, this);
  }

  public  int  Value(int theRow, int theCol) { return OCCwrapJavaJNI.TColStd_HArray2OfInteger_Value(swigCPtr, this, theRow, theCol); }

  public int[] ChangeValue(int theRow, int theCol) {return OCCwrapJavaJNI.TColStd_HArray2OfInteger_ChangeValue(swigCPtr, this, theRow, theCol);}

  public void SetValue(int theRow, int theCol,  int  theItem) {
    OCCwrapJavaJNI.TColStd_HArray2OfInteger_SetValue(swigCPtr, this, theRow, theCol,  theItem );
  }

  public static  TColStd_HArray2OfInteger  DownCast( Standard_Transient  T) {
    return new TColStd_HArray2OfInteger ( OCCwrapJavaJNI.TColStd_HArray2OfInteger_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColStd_HArray2OfInteger_TypeOf(), true );
  }

}
