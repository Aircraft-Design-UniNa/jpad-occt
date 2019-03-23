package opencascade;

public class TColgp_HArray2OfXY extends Standard_Transient {
  TColgp_HArray2OfXY(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColgp_HArray2OfXY(int theRowLow, int theRowUpp, int theColLow, int theColUpp,  gp_XY  theValue) {
    this(OCCwrapJavaJNI.new_TColgp_HArray2OfXY__SWIG_0(theRowLow, theRowUpp, theColLow, theColUpp, gp_XY.getCPtr(theValue), theValue), true);
  }

  public TColgp_HArray2OfXY(int theRowLow, int theRowUpp, int theColLow, int theColUpp) {
    this(OCCwrapJavaJNI.new_TColgp_HArray2OfXY__SWIG_1(theRowLow, theRowUpp, theColLow, theColUpp), true);
  }

  public TColgp_HArray2OfXY( TColgp_Array2OfXY  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_HArray2OfXY__SWIG_2(TColgp_Array2OfXY.getCPtr(theOther), theOther), true);
  }

  public  TColgp_Array2OfXY  Array2() {
    TColgp_Array2OfXY ret = new TColgp_Array2OfXY(OCCwrapJavaJNI.TColgp_HArray2OfXY_Array2(swigCPtr, this), false, this);
    return ret;
  }

  public  TColgp_Array2OfXY  ChangeArray2() {
    TColgp_Array2OfXY ret = new TColgp_Array2OfXY(OCCwrapJavaJNI.TColgp_HArray2OfXY_ChangeArray2(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_HArray2OfXY_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_HArray2OfXY_Length(swigCPtr, this);
  }

  public int RowLength() {
    return OCCwrapJavaJNI.TColgp_HArray2OfXY_RowLength(swigCPtr, this);
  }

  public int ColLength() {
    return OCCwrapJavaJNI.TColgp_HArray2OfXY_ColLength(swigCPtr, this);
  }

  public int LowerRow() {
    return OCCwrapJavaJNI.TColgp_HArray2OfXY_LowerRow(swigCPtr, this);
  }

  public int UpperRow() {
    return OCCwrapJavaJNI.TColgp_HArray2OfXY_UpperRow(swigCPtr, this);
  }

  public int LowerCol() {
    return OCCwrapJavaJNI.TColgp_HArray2OfXY_LowerCol(swigCPtr, this);
  }

  public int UpperCol() {
    return OCCwrapJavaJNI.TColgp_HArray2OfXY_UpperCol(swigCPtr, this);
  }

  public  gp_XY  Value(int theRow, int theCol) {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_HArray2OfXY_Value(swigCPtr, this, theRow, theCol), true);
    return ret;
  }

  public gp_XY ChangeValue(int theRow, int theCol) {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.TColgp_HArray2OfXY_ChangeValue(swigCPtr, this, theRow, theCol), false, this);
    return ret; //new gp_XY.CRef (ret);
  }

  public void SetValue(int theRow, int theCol,  gp_XY  theItem) {
    OCCwrapJavaJNI.TColgp_HArray2OfXY_SetValue(swigCPtr, this, theRow, theCol, gp_XY.getCPtr(theItem), theItem);
  }

  public static  TColgp_HArray2OfXY  DownCast( Standard_Transient  T) {
    return new TColgp_HArray2OfXY ( OCCwrapJavaJNI.TColgp_HArray2OfXY_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColgp_HArray2OfXY_TypeOf(), true );
  }

}
