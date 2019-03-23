package opencascade;

public class Quantity_Array1OfColor {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Quantity_Array1OfColor(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Quantity_Array1OfColor(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Quantity_Array1OfColor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Quantity_Array1OfColor(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Quantity_Array1OfColor() {
    this(OCCwrapJavaJNI.new_Quantity_Array1OfColor__SWIG_0(), true);
  }

  public Quantity_Array1OfColor(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_Quantity_Array1OfColor__SWIG_1(theLower, theUpper), true);
  }

  public Quantity_Array1OfColor( Quantity_Array1OfColor  theOther) {
    this(OCCwrapJavaJNI.new_Quantity_Array1OfColor__SWIG_2(Quantity_Array1OfColor.getCPtr(theOther), theOther), true);
  }

  public Quantity_Array1OfColor( Quantity_Color  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_Quantity_Array1OfColor__SWIG_4(Quantity_Color.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( Quantity_Color  theValue) {
    OCCwrapJavaJNI.Quantity_Array1OfColor_Init(swigCPtr, this, Quantity_Color.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.Quantity_Array1OfColor_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.Quantity_Array1OfColor_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.Quantity_Array1OfColor_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.Quantity_Array1OfColor_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.Quantity_Array1OfColor_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.Quantity_Array1OfColor_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.Quantity_Array1OfColor_IsAllocated(swigCPtr, this);
  }

  public  Quantity_Array1OfColor  Assign( Quantity_Array1OfColor  theOther) {
    Quantity_Array1OfColor ret = new Quantity_Array1OfColor(OCCwrapJavaJNI.Quantity_Array1OfColor_Assign(swigCPtr, this, Quantity_Array1OfColor.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  Quantity_Array1OfColor  Move( Quantity_Array1OfColor  theOther) {
    Quantity_Array1OfColor ret = new Quantity_Array1OfColor(OCCwrapJavaJNI.Quantity_Array1OfColor_Move(swigCPtr, this, Quantity_Array1OfColor.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  Quantity_Color  First() {
    Quantity_Color ret = new Quantity_Color(OCCwrapJavaJNI.Quantity_Array1OfColor_First(swigCPtr, this), true);
    return ret;
  }

  public Quantity_Color ChangeFirst() {
    Quantity_Color ret = new Quantity_Color(OCCwrapJavaJNI.Quantity_Array1OfColor_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new Quantity_Color.CRef (ret);
  }

  public  Quantity_Color  Last() {
    Quantity_Color ret = new Quantity_Color(OCCwrapJavaJNI.Quantity_Array1OfColor_Last(swigCPtr, this), true);
    return ret;
  }

  public Quantity_Color ChangeLast() {
    Quantity_Color ret = new Quantity_Color(OCCwrapJavaJNI.Quantity_Array1OfColor_ChangeLast(swigCPtr, this), false, this);
    return ret; //new Quantity_Color.CRef (ret);
  }

  public  Quantity_Color  Value(int theIndex) {
    Quantity_Color ret = new Quantity_Color(OCCwrapJavaJNI.Quantity_Array1OfColor_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public Quantity_Color ChangeValue(int theIndex) {
    Quantity_Color ret = new Quantity_Color(OCCwrapJavaJNI.Quantity_Array1OfColor_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new Quantity_Color.CRef (ret);
  }

  public void SetValue(int theIndex,  Quantity_Color  theItem) {
    OCCwrapJavaJNI.Quantity_Array1OfColor_SetValue(swigCPtr, this, theIndex, Quantity_Color.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.Quantity_Array1OfColor_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
