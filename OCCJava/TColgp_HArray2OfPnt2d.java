package opencascade;

public class TColgp_HArray2OfPnt2d extends Standard_Transient {
  TColgp_HArray2OfPnt2d(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColgp_HArray2OfPnt2d(int theRowLow, int theRowUpp, int theColLow, int theColUpp,  gp_Pnt2d  theValue) {
    this(OCCwrapJavaJNI.new_TColgp_HArray2OfPnt2d__SWIG_0(theRowLow, theRowUpp, theColLow, theColUpp, gp_Pnt2d.getCPtr(theValue), theValue), true);
  }

  public TColgp_HArray2OfPnt2d(int theRowLow, int theRowUpp, int theColLow, int theColUpp) {
    this(OCCwrapJavaJNI.new_TColgp_HArray2OfPnt2d__SWIG_1(theRowLow, theRowUpp, theColLow, theColUpp), true);
  }

  public TColgp_HArray2OfPnt2d( TColgp_Array2OfPnt2d  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_HArray2OfPnt2d__SWIG_2(TColgp_Array2OfPnt2d.getCPtr(theOther), theOther), true);
  }

  public  TColgp_Array2OfPnt2d  Array2() {
    TColgp_Array2OfPnt2d ret = new TColgp_Array2OfPnt2d(OCCwrapJavaJNI.TColgp_HArray2OfPnt2d_Array2(swigCPtr, this), false, this);
    return ret;
  }

  public  TColgp_Array2OfPnt2d  ChangeArray2() {
    TColgp_Array2OfPnt2d ret = new TColgp_Array2OfPnt2d(OCCwrapJavaJNI.TColgp_HArray2OfPnt2d_ChangeArray2(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_HArray2OfPnt2d_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_HArray2OfPnt2d_Length(swigCPtr, this);
  }

  public int RowLength() {
    return OCCwrapJavaJNI.TColgp_HArray2OfPnt2d_RowLength(swigCPtr, this);
  }

  public int ColLength() {
    return OCCwrapJavaJNI.TColgp_HArray2OfPnt2d_ColLength(swigCPtr, this);
  }

  public int LowerRow() {
    return OCCwrapJavaJNI.TColgp_HArray2OfPnt2d_LowerRow(swigCPtr, this);
  }

  public int UpperRow() {
    return OCCwrapJavaJNI.TColgp_HArray2OfPnt2d_UpperRow(swigCPtr, this);
  }

  public int LowerCol() {
    return OCCwrapJavaJNI.TColgp_HArray2OfPnt2d_LowerCol(swigCPtr, this);
  }

  public int UpperCol() {
    return OCCwrapJavaJNI.TColgp_HArray2OfPnt2d_UpperCol(swigCPtr, this);
  }

  public  gp_Pnt2d  Value(int theRow, int theCol) {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.TColgp_HArray2OfPnt2d_Value(swigCPtr, this, theRow, theCol), true);
    return ret;
  }

  public gp_Pnt2d ChangeValue(int theRow, int theCol) {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.TColgp_HArray2OfPnt2d_ChangeValue(swigCPtr, this, theRow, theCol), false, this);
    return ret; //new gp_Pnt2d.CRef (ret);
  }

  public void SetValue(int theRow, int theCol,  gp_Pnt2d  theItem) {
    OCCwrapJavaJNI.TColgp_HArray2OfPnt2d_SetValue(swigCPtr, this, theRow, theCol, gp_Pnt2d.getCPtr(theItem), theItem);
  }

  public static  TColgp_HArray2OfPnt2d  DownCast( Standard_Transient  T) {
    return new TColgp_HArray2OfPnt2d ( OCCwrapJavaJNI.TColgp_HArray2OfPnt2d_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColgp_HArray2OfPnt2d_TypeOf(), true );
  }

}
