package opencascade;

public class StepGeom_HArray2OfCartesianPoint extends Standard_Transient {
  StepGeom_HArray2OfCartesianPoint(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public StepGeom_HArray2OfCartesianPoint(int theRowLow, int theRowUpp, int theColLow, int theColUpp,  StepGeom_CartesianPoint  theValue) {
    this(OCCwrapJavaJNI.new_StepGeom_HArray2OfCartesianPoint__SWIG_0(theRowLow, theRowUpp, theColLow, theColUpp,  StepGeom_CartesianPoint.getCPtr(theValue) , theValue), true);
  }

  public StepGeom_HArray2OfCartesianPoint(int theRowLow, int theRowUpp, int theColLow, int theColUpp) {
    this(OCCwrapJavaJNI.new_StepGeom_HArray2OfCartesianPoint__SWIG_1(theRowLow, theRowUpp, theColLow, theColUpp), true);
  }

  public StepGeom_HArray2OfCartesianPoint( StepGeom_Array2OfCartesianPoint  theOther) {
    this(OCCwrapJavaJNI.new_StepGeom_HArray2OfCartesianPoint__SWIG_2(StepGeom_Array2OfCartesianPoint.getCPtr(theOther), theOther), true);
  }

  public  StepGeom_Array2OfCartesianPoint  Array2() {
    StepGeom_Array2OfCartesianPoint ret = new StepGeom_Array2OfCartesianPoint(OCCwrapJavaJNI.StepGeom_HArray2OfCartesianPoint_Array2(swigCPtr, this), false, this);
    return ret;
  }

  public  StepGeom_Array2OfCartesianPoint  ChangeArray2() {
    StepGeom_Array2OfCartesianPoint ret = new StepGeom_Array2OfCartesianPoint(OCCwrapJavaJNI.StepGeom_HArray2OfCartesianPoint_ChangeArray2(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.StepGeom_HArray2OfCartesianPoint_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.StepGeom_HArray2OfCartesianPoint_Length(swigCPtr, this);
  }

  public int RowLength() {
    return OCCwrapJavaJNI.StepGeom_HArray2OfCartesianPoint_RowLength(swigCPtr, this);
  }

  public int ColLength() {
    return OCCwrapJavaJNI.StepGeom_HArray2OfCartesianPoint_ColLength(swigCPtr, this);
  }

  public int LowerRow() {
    return OCCwrapJavaJNI.StepGeom_HArray2OfCartesianPoint_LowerRow(swigCPtr, this);
  }

  public int UpperRow() {
    return OCCwrapJavaJNI.StepGeom_HArray2OfCartesianPoint_UpperRow(swigCPtr, this);
  }

  public int LowerCol() {
    return OCCwrapJavaJNI.StepGeom_HArray2OfCartesianPoint_LowerCol(swigCPtr, this);
  }

  public int UpperCol() {
    return OCCwrapJavaJNI.StepGeom_HArray2OfCartesianPoint_UpperCol(swigCPtr, this);
  }

  public  StepGeom_CartesianPoint  Value(int theRow, int theCol) {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_HArray2OfCartesianPoint_Value(swigCPtr, this, theRow, theCol), true );
  }

  public  StepGeom_CartesianPoint  ChangeValue(int theRow, int theCol) {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_HArray2OfCartesianPoint_ChangeValue(swigCPtr, this, theRow, theCol), true );
  }

  public void SetValue(int theRow, int theCol,  StepGeom_CartesianPoint  theItem) {
    OCCwrapJavaJNI.StepGeom_HArray2OfCartesianPoint_SetValue(swigCPtr, this, theRow, theCol,  StepGeom_CartesianPoint.getCPtr(theItem) , theItem);
  }

  public static  StepGeom_HArray2OfCartesianPoint  DownCast( Standard_Transient  T) {
    return new StepGeom_HArray2OfCartesianPoint ( OCCwrapJavaJNI.StepGeom_HArray2OfCartesianPoint_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_HArray2OfCartesianPoint_TypeOf(), true );
  }

}
