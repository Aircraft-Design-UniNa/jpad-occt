package opencascade;

public class TColgp_HArray2OfVec extends Standard_Transient {
  TColgp_HArray2OfVec(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColgp_HArray2OfVec(int theRowLow, int theRowUpp, int theColLow, int theColUpp,  gp_Vec  theValue) {
    this(OCCwrapJavaJNI.new_TColgp_HArray2OfVec__SWIG_0(theRowLow, theRowUpp, theColLow, theColUpp, gp_Vec.getCPtr(theValue), theValue), true);
  }

  public TColgp_HArray2OfVec(int theRowLow, int theRowUpp, int theColLow, int theColUpp) {
    this(OCCwrapJavaJNI.new_TColgp_HArray2OfVec__SWIG_1(theRowLow, theRowUpp, theColLow, theColUpp), true);
  }

  public TColgp_HArray2OfVec( TColgp_Array2OfVec  theOther) {
    this(OCCwrapJavaJNI.new_TColgp_HArray2OfVec__SWIG_2(TColgp_Array2OfVec.getCPtr(theOther), theOther), true);
  }

  public  TColgp_Array2OfVec  Array2() {
    TColgp_Array2OfVec ret = new TColgp_Array2OfVec(OCCwrapJavaJNI.TColgp_HArray2OfVec_Array2(swigCPtr, this), false, this);
    return ret;
  }

  public  TColgp_Array2OfVec  ChangeArray2() {
    TColgp_Array2OfVec ret = new TColgp_Array2OfVec(OCCwrapJavaJNI.TColgp_HArray2OfVec_ChangeArray2(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColgp_HArray2OfVec_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColgp_HArray2OfVec_Length(swigCPtr, this);
  }

  public int RowLength() {
    return OCCwrapJavaJNI.TColgp_HArray2OfVec_RowLength(swigCPtr, this);
  }

  public int ColLength() {
    return OCCwrapJavaJNI.TColgp_HArray2OfVec_ColLength(swigCPtr, this);
  }

  public int LowerRow() {
    return OCCwrapJavaJNI.TColgp_HArray2OfVec_LowerRow(swigCPtr, this);
  }

  public int UpperRow() {
    return OCCwrapJavaJNI.TColgp_HArray2OfVec_UpperRow(swigCPtr, this);
  }

  public int LowerCol() {
    return OCCwrapJavaJNI.TColgp_HArray2OfVec_LowerCol(swigCPtr, this);
  }

  public int UpperCol() {
    return OCCwrapJavaJNI.TColgp_HArray2OfVec_UpperCol(swigCPtr, this);
  }

  public  gp_Vec  Value(int theRow, int theCol) {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.TColgp_HArray2OfVec_Value(swigCPtr, this, theRow, theCol), true);
    return ret;
  }

  public gp_Vec ChangeValue(int theRow, int theCol) {
    gp_Vec ret = new gp_Vec(OCCwrapJavaJNI.TColgp_HArray2OfVec_ChangeValue(swigCPtr, this, theRow, theCol), false, this);
    return ret; //new gp_Vec.CRef (ret);
  }

  public void SetValue(int theRow, int theCol,  gp_Vec  theItem) {
    OCCwrapJavaJNI.TColgp_HArray2OfVec_SetValue(swigCPtr, this, theRow, theCol, gp_Vec.getCPtr(theItem), theItem);
  }

  public static  TColgp_HArray2OfVec  DownCast( Standard_Transient  T) {
    return new TColgp_HArray2OfVec ( OCCwrapJavaJNI.TColgp_HArray2OfVec_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColgp_HArray2OfVec_TypeOf(), true );
  }

}
