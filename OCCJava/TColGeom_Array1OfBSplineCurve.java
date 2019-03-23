package opencascade;

public class TColGeom_Array1OfBSplineCurve {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColGeom_Array1OfBSplineCurve(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColGeom_Array1OfBSplineCurve(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColGeom_Array1OfBSplineCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColGeom_Array1OfBSplineCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColGeom_Array1OfBSplineCurve() {
    this(OCCwrapJavaJNI.new_TColGeom_Array1OfBSplineCurve__SWIG_0(), true);
  }

  public TColGeom_Array1OfBSplineCurve(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColGeom_Array1OfBSplineCurve__SWIG_1(theLower, theUpper), true);
  }

  public TColGeom_Array1OfBSplineCurve( TColGeom_Array1OfBSplineCurve  theOther) {
    this(OCCwrapJavaJNI.new_TColGeom_Array1OfBSplineCurve__SWIG_2(TColGeom_Array1OfBSplineCurve.getCPtr(theOther), theOther), true);
  }

  public TColGeom_Array1OfBSplineCurve( Geom_BSplineCurve  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TColGeom_Array1OfBSplineCurve__SWIG_4( Geom_BSplineCurve.getCPtr(theBegin) , theBegin, theLower, theUpper), true);
  }

  public void Init( Geom_BSplineCurve  theValue) {
    OCCwrapJavaJNI.TColGeom_Array1OfBSplineCurve_Init(swigCPtr, this,  Geom_BSplineCurve.getCPtr(theValue) , theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.TColGeom_Array1OfBSplineCurve_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TColGeom_Array1OfBSplineCurve_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColGeom_Array1OfBSplineCurve_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TColGeom_Array1OfBSplineCurve_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TColGeom_Array1OfBSplineCurve_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.TColGeom_Array1OfBSplineCurve_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.TColGeom_Array1OfBSplineCurve_IsAllocated(swigCPtr, this);
  }

  public  TColGeom_Array1OfBSplineCurve  Assign( TColGeom_Array1OfBSplineCurve  theOther) {
    TColGeom_Array1OfBSplineCurve ret = new TColGeom_Array1OfBSplineCurve(OCCwrapJavaJNI.TColGeom_Array1OfBSplineCurve_Assign(swigCPtr, this, TColGeom_Array1OfBSplineCurve.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  TColGeom_Array1OfBSplineCurve  Move( TColGeom_Array1OfBSplineCurve  theOther) {
    TColGeom_Array1OfBSplineCurve ret = new TColGeom_Array1OfBSplineCurve(OCCwrapJavaJNI.TColGeom_Array1OfBSplineCurve_Move(swigCPtr, this, TColGeom_Array1OfBSplineCurve.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  Geom_BSplineCurve  First() {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.TColGeom_Array1OfBSplineCurve_First(swigCPtr, this), true );
  }

  public  Geom_BSplineCurve  ChangeFirst() {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.TColGeom_Array1OfBSplineCurve_ChangeFirst(swigCPtr, this), true );
  }

  public  Geom_BSplineCurve  Last() {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.TColGeom_Array1OfBSplineCurve_Last(swigCPtr, this), true );
  }

  public  Geom_BSplineCurve  ChangeLast() {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.TColGeom_Array1OfBSplineCurve_ChangeLast(swigCPtr, this), true );
  }

  public  Geom_BSplineCurve  Value(int theIndex) {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.TColGeom_Array1OfBSplineCurve_Value(swigCPtr, this, theIndex), true );
  }

  public  Geom_BSplineCurve  ChangeValue(int theIndex) {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.TColGeom_Array1OfBSplineCurve_ChangeValue(swigCPtr, this, theIndex), true );
  }

  public void SetValue(int theIndex,  Geom_BSplineCurve  theItem) {
    OCCwrapJavaJNI.TColGeom_Array1OfBSplineCurve_SetValue(swigCPtr, this, theIndex,  Geom_BSplineCurve.getCPtr(theItem) , theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.TColGeom_Array1OfBSplineCurve_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
