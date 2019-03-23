package opencascade;

public class TColgp_HArray2OfPnt extends Standard_Transient {
  TColgp_HArray2OfPnt(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColgp_HArray2OfPnt(int theRowLow, int theRowUpp, int theColLow, int theColUpp,  gp_Pnt  theValue) {
    this(OCCwrapJavaJNI.new_TColgp_HArray2OfPnt__SWIG_0(theRowLow, theRowUpp, theColLow, theColUpp, gp_Pnt.getCPtr(theValue), theValue), true);
  }

  public TColgp_HArray2OfPnt(int theRowLow, int theRowUpp, int theColLow, int theColUpp) {
    this(OCCwrapJavaJNI.new_TColgp_HArray2OfPnt__SWIG_1(theRowLow, theRowUpp, theColLow, theColUpp), true);
  }

  public TColgp_HArray2OfPnt( TColgp_Array2OfPnt  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_HArray2OfPnt__SWIG_2(TColgp_Array2OfPnt.getCPtr(theOther), theOther), true);
  }

  public  TColgp_Array2OfPnt  Array2() {
    TColgp_Array2OfPnt ret = new TColgp_Array2OfPnt(OCCwrapJavaJNI.TColgp_HArray2OfPnt_Array2(swigCPtr, this), false, this);
    return ret;
  }

  public  TColgp_Array2OfPnt  ChangeArray2() {
    TColgp_Array2OfPnt ret = new TColgp_Array2OfPnt(OCCwrapJavaJNI.TColgp_HArray2OfPnt_ChangeArray2(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_HArray2OfPnt_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_HArray2OfPnt_Length(swigCPtr, this);
  }

  public int RowLength() {
    return OCCwrapJavaJNI.TColgp_HArray2OfPnt_RowLength(swigCPtr, this);
  }

  public int ColLength() {
    return OCCwrapJavaJNI.TColgp_HArray2OfPnt_ColLength(swigCPtr, this);
  }

  public int LowerRow() {
    return OCCwrapJavaJNI.TColgp_HArray2OfPnt_LowerRow(swigCPtr, this);
  }

  public int UpperRow() {
    return OCCwrapJavaJNI.TColgp_HArray2OfPnt_UpperRow(swigCPtr, this);
  }

  public int LowerCol() {
    return OCCwrapJavaJNI.TColgp_HArray2OfPnt_LowerCol(swigCPtr, this);
  }

  public int UpperCol() {
    return OCCwrapJavaJNI.TColgp_HArray2OfPnt_UpperCol(swigCPtr, this);
  }

  public  gp_Pnt  Value(int theRow, int theCol) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_HArray2OfPnt_Value(swigCPtr, this, theRow, theCol), true);
    return ret;
  }

  public gp_Pnt ChangeValue(int theRow, int theCol) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.TColgp_HArray2OfPnt_ChangeValue(swigCPtr, this, theRow, theCol), false, this);
    return ret; //new gp_Pnt.CRef (ret);
  }

  public void SetValue(int theRow, int theCol,  gp_Pnt  theItem) {
    OCCwrapJavaJNI.TColgp_HArray2OfPnt_SetValue(swigCPtr, this, theRow, theCol, gp_Pnt.getCPtr(theItem), theItem);
  }

  public static  TColgp_HArray2OfPnt  DownCast( Standard_Transient  T) {
    return new TColgp_HArray2OfPnt ( OCCwrapJavaJNI.TColgp_HArray2OfPnt_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColgp_HArray2OfPnt_TypeOf(), true );
  }

}
