package opencascade;

public class TColGeom_HArray2OfSurface extends Standard_Transient {
  TColGeom_HArray2OfSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColGeom_HArray2OfSurface(int theRowLow, int theRowUpp, int theColLow, int theColUpp,  Geom_Surface  theValue) {
    this(OCCwrapJavaJNI.new_TColGeom_HArray2OfSurface__SWIG_0(theRowLow, theRowUpp, theColLow, theColUpp,  Geom_Surface.getCPtr(theValue) , theValue), true);
  }

  public TColGeom_HArray2OfSurface(int theRowLow, int theRowUpp, int theColLow, int theColUpp) {
    this(OCCwrapJavaJNI.new_TColGeom_HArray2OfSurface__SWIG_1(theRowLow, theRowUpp, theColLow, theColUpp), true);
  }

  public TColGeom_HArray2OfSurface( TColGeom_Array2OfSurface  theOther) {
    this(OCCwrapJavaJNI.new_TColGeom_HArray2OfSurface__SWIG_2(TColGeom_Array2OfSurface.getCPtr(theOther), theOther), true);
  }

  public  TColGeom_Array2OfSurface  Array2() {
    TColGeom_Array2OfSurface ret = new TColGeom_Array2OfSurface(OCCwrapJavaJNI.TColGeom_HArray2OfSurface_Array2(swigCPtr, this), false, this);
    return ret;
  }

  public  TColGeom_Array2OfSurface  ChangeArray2() {
    TColGeom_Array2OfSurface ret = new TColGeom_Array2OfSurface(OCCwrapJavaJNI.TColGeom_HArray2OfSurface_ChangeArray2(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TColGeom_HArray2OfSurface_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColGeom_HArray2OfSurface_Length(swigCPtr, this);
  }

  public int RowLength() {
    return OCCwrapJavaJNI.TColGeom_HArray2OfSurface_RowLength(swigCPtr, this);
  }

  public int ColLength() {
    return OCCwrapJavaJNI.TColGeom_HArray2OfSurface_ColLength(swigCPtr, this);
  }

  public int LowerRow() {
    return OCCwrapJavaJNI.TColGeom_HArray2OfSurface_LowerRow(swigCPtr, this);
  }

  public int UpperRow() {
    return OCCwrapJavaJNI.TColGeom_HArray2OfSurface_UpperRow(swigCPtr, this);
  }

  public int LowerCol() {
    return OCCwrapJavaJNI.TColGeom_HArray2OfSurface_LowerCol(swigCPtr, this);
  }

  public int UpperCol() {
    return OCCwrapJavaJNI.TColGeom_HArray2OfSurface_UpperCol(swigCPtr, this);
  }

  public  Geom_Surface  Value(int theRow, int theCol) {
    return new Geom_Surface ( OCCwrapJavaJNI.TColGeom_HArray2OfSurface_Value(swigCPtr, this, theRow, theCol), true );
  }

  public  Geom_Surface  ChangeValue(int theRow, int theCol) {
    return new Geom_Surface ( OCCwrapJavaJNI.TColGeom_HArray2OfSurface_ChangeValue(swigCPtr, this, theRow, theCol), true );
  }

  public void SetValue(int theRow, int theCol,  Geom_Surface  theItem) {
    OCCwrapJavaJNI.TColGeom_HArray2OfSurface_SetValue(swigCPtr, this, theRow, theCol,  Geom_Surface.getCPtr(theItem) , theItem);
  }

  public static  TColGeom_HArray2OfSurface  DownCast( Standard_Transient  T) {
    return new TColGeom_HArray2OfSurface ( OCCwrapJavaJNI.TColGeom_HArray2OfSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColGeom_HArray2OfSurface_TypeOf(), true );
  }

}
