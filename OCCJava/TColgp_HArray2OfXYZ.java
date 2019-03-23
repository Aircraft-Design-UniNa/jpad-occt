package opencascade;

public class TColgp_HArray2OfXYZ extends Standard_Transient {
  TColgp_HArray2OfXYZ(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColgp_HArray2OfXYZ(int theRowLow, int theRowUpp, int theColLow, int theColUpp,  gp_XYZ  theValue) {
    this(OCCwrapJavaJNI.new_TColgp_HArray2OfXYZ__SWIG_0(theRowLow, theRowUpp, theColLow, theColUpp, gp_XYZ.getCPtr(theValue), theValue), true);
  }

  public TColgp_HArray2OfXYZ(int theRowLow, int theRowUpp, int theColLow, int theColUpp) {
    this(OCCwrapJavaJNI.new_TColgp_HArray2OfXYZ__SWIG_1(theRowLow, theRowUpp, theColLow, theColUpp), true);
  }

  public TColgp_HArray2OfXYZ( TColgp_Array2OfXYZ  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_HArray2OfXYZ__SWIG_2(TColgp_Array2OfXYZ.getCPtr(theOther), theOther), true);
  }

  public  TColgp_Array2OfXYZ  Array2() {
    TColgp_Array2OfXYZ ret = new TColgp_Array2OfXYZ(OCCwrapJavaJNI.TColgp_HArray2OfXYZ_Array2(swigCPtr, this), false, this);
    return ret;
  }

  public  TColgp_Array2OfXYZ  ChangeArray2() {
    TColgp_Array2OfXYZ ret = new TColgp_Array2OfXYZ(OCCwrapJavaJNI.TColgp_HArray2OfXYZ_ChangeArray2(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_HArray2OfXYZ_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_HArray2OfXYZ_Length(swigCPtr, this);
  }

  public int RowLength() {
    return OCCwrapJavaJNI.TColgp_HArray2OfXYZ_RowLength(swigCPtr, this);
  }

  public int ColLength() {
    return OCCwrapJavaJNI.TColgp_HArray2OfXYZ_ColLength(swigCPtr, this);
  }

  public int LowerRow() {
    return OCCwrapJavaJNI.TColgp_HArray2OfXYZ_LowerRow(swigCPtr, this);
  }

  public int UpperRow() {
    return OCCwrapJavaJNI.TColgp_HArray2OfXYZ_UpperRow(swigCPtr, this);
  }

  public int LowerCol() {
    return OCCwrapJavaJNI.TColgp_HArray2OfXYZ_LowerCol(swigCPtr, this);
  }

  public int UpperCol() {
    return OCCwrapJavaJNI.TColgp_HArray2OfXYZ_UpperCol(swigCPtr, this);
  }

  public  gp_XYZ  Value(int theRow, int theCol) {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_HArray2OfXYZ_Value(swigCPtr, this, theRow, theCol), true);
    return ret;
  }

  public gp_XYZ ChangeValue(int theRow, int theCol) {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.TColgp_HArray2OfXYZ_ChangeValue(swigCPtr, this, theRow, theCol), false, this);
    return ret; //new gp_XYZ.CRef (ret);
  }

  public void SetValue(int theRow, int theCol,  gp_XYZ  theItem) {
    OCCwrapJavaJNI.TColgp_HArray2OfXYZ_SetValue(swigCPtr, this, theRow, theCol, gp_XYZ.getCPtr(theItem), theItem);
  }

  public static  TColgp_HArray2OfXYZ  DownCast( Standard_Transient  T) {
    return new TColgp_HArray2OfXYZ ( OCCwrapJavaJNI.TColgp_HArray2OfXYZ_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColgp_HArray2OfXYZ_TypeOf(), true );
  }

}
