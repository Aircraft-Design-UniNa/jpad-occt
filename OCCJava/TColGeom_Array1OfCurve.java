package opencascade;

public class TColGeom_Array1OfCurve {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColGeom_Array1OfCurve(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColGeom_Array1OfCurve(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColGeom_Array1OfCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColGeom_Array1OfCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColGeom_Array1OfCurve() {
    this(OCCwrapJavaJNI.new_TColGeom_Array1OfCurve__SWIG_0(), true);
  }

  public TColGeom_Array1OfCurve(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColGeom_Array1OfCurve__SWIG_1(theLower, theUpper), true);
  }

  public TColGeom_Array1OfCurve( TColGeom_Array1OfCurve  theOther) {
    this(OCCwrapJavaJNI.new_TColGeom_Array1OfCurve__SWIG_2(TColGeom_Array1OfCurve.getCPtr(theOther), theOther), true);
  }

  public TColGeom_Array1OfCurve( Geom_Curve  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColGeom_Array1OfCurve__SWIG_4( Geom_Curve.getCPtr(theBegin) , theBegin, theLower, theUpper), true);
  }

  public void Init( Geom_Curve  theValue) {
    OCCwrapJavaJNI.TColGeom_Array1OfCurve_Init(swigCPtr, this,  Geom_Curve.getCPtr(theValue) , theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColGeom_Array1OfCurve_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColGeom_Array1OfCurve_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColGeom_Array1OfCurve_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColGeom_Array1OfCurve_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColGeom_Array1OfCurve_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColGeom_Array1OfCurve_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.TColGeom_Array1OfCurve_IsAllocated(swigCPtr, this);
  }

  public  TColGeom_Array1OfCurve  Assign( TColGeom_Array1OfCurve  theOther) {
    TColGeom_Array1OfCurve ret = new TColGeom_Array1OfCurve(OCCwrapJavaJNI.TColGeom_Array1OfCurve_Assign(swigCPtr, this, TColGeom_Array1OfCurve.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TColGeom_Array1OfCurve  Move( TColGeom_Array1OfCurve  theOther) {
    TColGeom_Array1OfCurve ret = new TColGeom_Array1OfCurve(OCCwrapJavaJNI.TColGeom_Array1OfCurve_Move(swigCPtr, this, TColGeom_Array1OfCurve.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  Geom_Curve  First() {
    return new Geom_Curve ( OCCwrapJavaJNI.TColGeom_Array1OfCurve_First(swigCPtr, this), true );
  }

  public  Geom_Curve  ChangeFirst() {
    return new Geom_Curve ( OCCwrapJavaJNI.TColGeom_Array1OfCurve_ChangeFirst(swigCPtr, this), true );
  }

  public  Geom_Curve  Last() {
    return new Geom_Curve ( OCCwrapJavaJNI.TColGeom_Array1OfCurve_Last(swigCPtr, this), true );
  }

  public  Geom_Curve  ChangeLast() {
    return new Geom_Curve ( OCCwrapJavaJNI.TColGeom_Array1OfCurve_ChangeLast(swigCPtr, this), true );
  }

  public  Geom_Curve  Value(int theIndex) {
    return new Geom_Curve ( OCCwrapJavaJNI.TColGeom_Array1OfCurve_Value(swigCPtr, this, theIndex), true );
  }

  public  Geom_Curve  ChangeValue(int theIndex) {
    return new Geom_Curve ( OCCwrapJavaJNI.TColGeom_Array1OfCurve_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  Geom_Curve  theItem) {
    OCCwrapJavaJNI.TColGeom_Array1OfCurve_SetValue(swigCPtr, this, theIndex,  Geom_Curve.getCPtr(theItem) , theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.TColGeom_Array1OfCurve_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
