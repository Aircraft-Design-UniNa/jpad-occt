package opencascade;

public class TColGeom_Array2OfSurface {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColGeom_Array2OfSurface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColGeom_Array2OfSurface(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColGeom_Array2OfSurface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColGeom_Array2OfSurface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColGeom_Array2OfSurface(int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_TColGeom_Array2OfSurface__SWIG_0(theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public TColGeom_Array2OfSurface( TColGeom_Array2OfSurface  theOther) {
    this(OCCwrapJavaJNI.new_TColGeom_Array2OfSurface__SWIG_1(TColGeom_Array2OfSurface.getCPtr(theOther), theOther), true);
  }

  public TColGeom_Array2OfSurface( Geom_Surface  theBegin, int theRowLower, int theRowUpper, int theColLower, int theColUpper) {
    this(OCCwrapJavaJNI.new_TColGeom_Array2OfSurface__SWIG_2( Geom_Surface.getCPtr(theBegin) , theBegin, theRowLower, theRowUpper, theColLower, theColUpper), true);
  }

  public void Init( Geom_Surface  theValue) {
    OCCwrapJavaJNI.TColGeom_Array2OfSurface_Init(swigCPtr, this,  Geom_Surface.getCPtr(theValue) , theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColGeom_Array2OfSurface_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColGeom_Array2OfSurface_Length(swigCPtr, this);
  }

  public int RowLength() {
    return OCCwrapJavaJNI.TColGeom_Array2OfSurface_RowLength(swigCPtr, this);
  }

  public int ColLength() {
    return OCCwrapJavaJNI.TColGeom_Array2OfSurface_ColLength(swigCPtr, this);
  }

  public int LowerRow() {
    return OCCwrapJavaJNI.TColGeom_Array2OfSurface_LowerRow(swigCPtr, this);
  }

  public int UpperRow() {
    return OCCwrapJavaJNI.TColGeom_Array2OfSurface_UpperRow(swigCPtr, this);
  }

  public int LowerCol() {
    return OCCwrapJavaJNI.TColGeom_Array2OfSurface_LowerCol(swigCPtr, this);
  }

  public int UpperCol() {
    return OCCwrapJavaJNI.TColGeom_Array2OfSurface_UpperCol(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColGeom_Array2OfSurface_IsDeletable(swigCPtr, this);
  }

  public  TColGeom_Array2OfSurface  Assign( TColGeom_Array2OfSurface  theOther) {
    TColGeom_Array2OfSurface ret = new TColGeom_Array2OfSurface(OCCwrapJavaJNI.TColGeom_Array2OfSurface_Assign(swigCPtr, this, TColGeom_Array2OfSurface.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  Geom_Surface  Value(int theRow, int theCol) {
    return new Geom_Surface ( OCCwrapJavaJNI.TColGeom_Array2OfSurface_Value(swigCPtr, this, theRow, theCol), true );
  }

  public  Geom_Surface  ChangeValue(int theRow, int theCol) {
    return new Geom_Surface ( OCCwrapJavaJNI.TColGeom_Array2OfSurface_ChangeValue(swigCPtr, this, theRow, theCol), true );
  }

  public void SetValue(int theRow, int theCol,  Geom_Surface  theItem) {
    OCCwrapJavaJNI.TColGeom_Array2OfSurface_SetValue(swigCPtr, this, theRow, theCol,  Geom_Surface.getCPtr(theItem) , theItem);
  }

}
