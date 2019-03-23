package opencascade;

public class TColGeom_Array1OfSurface {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColGeom_Array1OfSurface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColGeom_Array1OfSurface(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColGeom_Array1OfSurface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColGeom_Array1OfSurface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColGeom_Array1OfSurface() {
    this(OCCwrapJavaJNI.new_TColGeom_Array1OfSurface__SWIG_0(), true);
  }

  public TColGeom_Array1OfSurface(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColGeom_Array1OfSurface__SWIG_1(theLower, theUpper), true);
  }

  public TColGeom_Array1OfSurface( TColGeom_Array1OfSurface  theOther) {
    this(OCCwrapJavaJNI.new_TColGeom_Array1OfSurface__SWIG_2(TColGeom_Array1OfSurface.getCPtr(theOther), theOther), true);
  }

  public TColGeom_Array1OfSurface( Geom_Surface  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColGeom_Array1OfSurface__SWIG_4( Geom_Surface.getCPtr(theBegin) , theBegin, theLower, theUpper), true);
  }

  public void Init( Geom_Surface  theValue) {
    OCCwrapJavaJNI.TColGeom_Array1OfSurface_Init(swigCPtr, this,  Geom_Surface.getCPtr(theValue) , theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColGeom_Array1OfSurface_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColGeom_Array1OfSurface_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColGeom_Array1OfSurface_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColGeom_Array1OfSurface_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColGeom_Array1OfSurface_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColGeom_Array1OfSurface_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.TColGeom_Array1OfSurface_IsAllocated(swigCPtr, this);
  }

  public  TColGeom_Array1OfSurface  Assign( TColGeom_Array1OfSurface  theOther) {
    TColGeom_Array1OfSurface ret = new TColGeom_Array1OfSurface(OCCwrapJavaJNI.TColGeom_Array1OfSurface_Assign(swigCPtr, this, TColGeom_Array1OfSurface.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TColGeom_Array1OfSurface  Move( TColGeom_Array1OfSurface  theOther) {
    TColGeom_Array1OfSurface ret = new TColGeom_Array1OfSurface(OCCwrapJavaJNI.TColGeom_Array1OfSurface_Move(swigCPtr, this, TColGeom_Array1OfSurface.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  Geom_Surface  First() {
    return new Geom_Surface ( OCCwrapJavaJNI.TColGeom_Array1OfSurface_First(swigCPtr, this), true );
  }

  public  Geom_Surface  ChangeFirst() {
    return new Geom_Surface ( OCCwrapJavaJNI.TColGeom_Array1OfSurface_ChangeFirst(swigCPtr, this), true );
  }

  public  Geom_Surface  Last() {
    return new Geom_Surface ( OCCwrapJavaJNI.TColGeom_Array1OfSurface_Last(swigCPtr, this), true );
  }

  public  Geom_Surface  ChangeLast() {
    return new Geom_Surface ( OCCwrapJavaJNI.TColGeom_Array1OfSurface_ChangeLast(swigCPtr, this), true );
  }

  public  Geom_Surface  Value(int theIndex) {
    return new Geom_Surface ( OCCwrapJavaJNI.TColGeom_Array1OfSurface_Value(swigCPtr, this, theIndex), true );
  }

  public  Geom_Surface  ChangeValue(int theIndex) {
    return new Geom_Surface ( OCCwrapJavaJNI.TColGeom_Array1OfSurface_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  Geom_Surface  theItem) {
    OCCwrapJavaJNI.TColGeom_Array1OfSurface_SetValue(swigCPtr, this, theIndex,  Geom_Surface.getCPtr(theItem) , theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.TColGeom_Array1OfSurface_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
