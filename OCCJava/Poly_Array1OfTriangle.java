package opencascade;

public class Poly_Array1OfTriangle {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Poly_Array1OfTriangle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Poly_Array1OfTriangle(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Poly_Array1OfTriangle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Poly_Array1OfTriangle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Poly_Array1OfTriangle() {
    this(OCCwrapJavaJNI.new_Poly_Array1OfTriangle__SWIG_0(), true);
  }

  public Poly_Array1OfTriangle(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_Poly_Array1OfTriangle__SWIG_1(theLower, theUpper), true);
  }

  public Poly_Array1OfTriangle( Poly_Array1OfTriangle  theOther) {
    this(OCCwrapJavaJNI.new_Poly_Array1OfTriangle__SWIG_2(Poly_Array1OfTriangle.getCPtr(theOther), theOther), true);
  }

  public Poly_Array1OfTriangle( Poly_Triangle  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_Poly_Array1OfTriangle__SWIG_4(Poly_Triangle.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( Poly_Triangle  theValue) {
    OCCwrapJavaJNI.Poly_Array1OfTriangle_Init(swigCPtr, this, Poly_Triangle.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.Poly_Array1OfTriangle_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.Poly_Array1OfTriangle_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.Poly_Array1OfTriangle_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.Poly_Array1OfTriangle_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.Poly_Array1OfTriangle_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.Poly_Array1OfTriangle_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.Poly_Array1OfTriangle_IsAllocated(swigCPtr, this);
  }

  public  Poly_Array1OfTriangle  Assign( Poly_Array1OfTriangle  theOther) {
    Poly_Array1OfTriangle ret = new Poly_Array1OfTriangle(OCCwrapJavaJNI.Poly_Array1OfTriangle_Assign(swigCPtr, this, Poly_Array1OfTriangle.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  Poly_Array1OfTriangle  Move( Poly_Array1OfTriangle  theOther) {
    Poly_Array1OfTriangle ret = new Poly_Array1OfTriangle(OCCwrapJavaJNI.Poly_Array1OfTriangle_Move(swigCPtr, this, Poly_Array1OfTriangle.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  Poly_Triangle  First() {
    Poly_Triangle ret = new Poly_Triangle(OCCwrapJavaJNI.Poly_Array1OfTriangle_First(swigCPtr, this), true);
    return ret;
  }

  public Poly_Triangle ChangeFirst() {
    Poly_Triangle ret = new Poly_Triangle(OCCwrapJavaJNI.Poly_Array1OfTriangle_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new Poly_Triangle.CRef (ret);
  }

  public  Poly_Triangle  Last() {
    Poly_Triangle ret = new Poly_Triangle(OCCwrapJavaJNI.Poly_Array1OfTriangle_Last(swigCPtr, this), true);
    return ret;
  }

  public Poly_Triangle ChangeLast() {
    Poly_Triangle ret = new Poly_Triangle(OCCwrapJavaJNI.Poly_Array1OfTriangle_ChangeLast(swigCPtr, this), false, this);
    return ret; //new Poly_Triangle.CRef (ret);
  }

  public  Poly_Triangle  Value(int theIndex) {
    Poly_Triangle ret = new Poly_Triangle(OCCwrapJavaJNI.Poly_Array1OfTriangle_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public Poly_Triangle ChangeValue(int theIndex) {
    Poly_Triangle ret = new Poly_Triangle(OCCwrapJavaJNI.Poly_Array1OfTriangle_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new Poly_Triangle.CRef (ret);
  }

  public void SetValue(int theIndex,  Poly_Triangle  theItem) {
    OCCwrapJavaJNI.Poly_Array1OfTriangle_SetValue(swigCPtr, this, theIndex, Poly_Triangle.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.Poly_Array1OfTriangle_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
