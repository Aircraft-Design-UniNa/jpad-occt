package opencascade;

public class TColStd_HArray2OfReal extends Standard_Transient {
  TColStd_HArray2OfReal(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColStd_HArray2OfReal(int theRowLow, int theRowUpp, int theColLow, int theColUpp,  double  theValue) {
    this(OCCwrapJavaJNI.new_TColStd_HArray2OfReal__SWIG_0(theRowLow, theRowUpp, theColLow, theColUpp,  theValue ), true);
  }

  public TColStd_HArray2OfReal(int theRowLow, int theRowUpp, int theColLow, int theColUpp) {
    this(OCCwrapJavaJNI.new_TColStd_HArray2OfReal__SWIG_1(theRowLow, theRowUpp, theColLow, theColUpp), true);
  }

  public TColStd_HArray2OfReal( TColStd_Array2OfReal  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_HArray2OfReal__SWIG_2(TColStd_Array2OfReal.getCPtr(theOther), theOther), true);
  }

  public  TColStd_Array2OfReal  Array2() {
    TColStd_Array2OfReal ret = new TColStd_Array2OfReal(OCCwrapJavaJNI.TColStd_HArray2OfReal_Array2(swigCPtr, this), false, this);
    return ret;
  }

  public  TColStd_Array2OfReal  ChangeArray2() {
    TColStd_Array2OfReal ret = new TColStd_Array2OfReal(OCCwrapJavaJNI.TColStd_HArray2OfReal_ChangeArray2(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColStd_HArray2OfReal_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColStd_HArray2OfReal_Length(swigCPtr, this);
  }

  public int RowLength() {
    return OCCwrapJavaJNI.TColStd_HArray2OfReal_RowLength(swigCPtr, this);
  }

  public int ColLength() {
    return OCCwrapJavaJNI.TColStd_HArray2OfReal_ColLength(swigCPtr, this);
  }

  public int LowerRow() {
    return OCCwrapJavaJNI.TColStd_HArray2OfReal_LowerRow(swigCPtr, this);
  }

  public int UpperRow() {
    return OCCwrapJavaJNI.TColStd_HArray2OfReal_UpperRow(swigCPtr, this);
  }

  public int LowerCol() {
    return OCCwrapJavaJNI.TColStd_HArray2OfReal_LowerCol(swigCPtr, this);
  }

  public int UpperCol() {
    return OCCwrapJavaJNI.TColStd_HArray2OfReal_UpperCol(swigCPtr, this);
  }

  public  double  Value(int theRow, int theCol) { return OCCwrapJavaJNI.TColStd_HArray2OfReal_Value(swigCPtr, this, theRow, theCol); }

  public double[] ChangeValue(int theRow, int theCol) {return OCCwrapJavaJNI.TColStd_HArray2OfReal_ChangeValue(swigCPtr, this, theRow, theCol);}

  public void SetValue(int theRow, int theCol,  double  theItem) {
    OCCwrapJavaJNI.TColStd_HArray2OfReal_SetValue(swigCPtr, this, theRow, theCol,  theItem );
  }

  public static  TColStd_HArray2OfReal  DownCast( Standard_Transient  T) {
    return new TColStd_HArray2OfReal ( OCCwrapJavaJNI.TColStd_HArray2OfReal_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColStd_HArray2OfReal_TypeOf(), true );
  }

}
