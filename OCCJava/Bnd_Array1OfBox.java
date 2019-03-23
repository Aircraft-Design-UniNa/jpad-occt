package opencascade;

public class Bnd_Array1OfBox {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Bnd_Array1OfBox(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Bnd_Array1OfBox(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Bnd_Array1OfBox obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Bnd_Array1OfBox(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Bnd_Array1OfBox() {
    this(OCCwrapJavaJNI.new_Bnd_Array1OfBox__SWIG_0(), true);
  }

  public Bnd_Array1OfBox(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_Bnd_Array1OfBox__SWIG_1(theLower, theUpper), true);
  }

  public Bnd_Array1OfBox( Bnd_Array1OfBox  theOther) {
    this(OCCwrapJavaJNI.new_Bnd_Array1OfBox__SWIG_2(Bnd_Array1OfBox.getCPtr(theOther), theOther), true);
  }

  public Bnd_Array1OfBox( Bnd_Box  theBegin, int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_Bnd_Array1OfBox__SWIG_4(Bnd_Box.getCPtr(theBegin), theBegin, theLower, theUpper), true);
  }

  public void Init( Bnd_Box  theValue) {
    OCCwrapJavaJNI.Bnd_Array1OfBox_Init(swigCPtr, this, Bnd_Box.getCPtr(theValue), theValue);
  }

  public int Size() {
    return OCCwrapJavaJNI.Bnd_Array1OfBox_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.Bnd_Array1OfBox_Length(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.Bnd_Array1OfBox_IsEmpty(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.Bnd_Array1OfBox_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.Bnd_Array1OfBox_Upper(swigCPtr, this);
  }

  public long IsDeletable() {
    return OCCwrapJavaJNI.Bnd_Array1OfBox_IsDeletable(swigCPtr, this);
  }

  public long IsAllocated() {
    return OCCwrapJavaJNI.Bnd_Array1OfBox_IsAllocated(swigCPtr, this);
  }

  public  Bnd_Array1OfBox  Assign( Bnd_Array1OfBox  theOther) {
    Bnd_Array1OfBox ret = new Bnd_Array1OfBox(OCCwrapJavaJNI.Bnd_Array1OfBox_Assign(swigCPtr, this, Bnd_Array1OfBox.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  Bnd_Array1OfBox  Move( Bnd_Array1OfBox  theOther) {
    Bnd_Array1OfBox ret = new Bnd_Array1OfBox(OCCwrapJavaJNI.Bnd_Array1OfBox_Move(swigCPtr, this, Bnd_Array1OfBox.getCPtr(theOther), theOther), false, this);
    return ret;
  }

  public  Bnd_Box  First() {
    Bnd_Box ret = new Bnd_Box(OCCwrapJavaJNI.Bnd_Array1OfBox_First(swigCPtr, this), true);
    return ret;
  }

  public Bnd_Box ChangeFirst() {
    Bnd_Box ret = new Bnd_Box(OCCwrapJavaJNI.Bnd_Array1OfBox_ChangeFirst(swigCPtr, this), false, this);
    return ret; //new Bnd_Box.CRef (ret);
  }

  public  Bnd_Box  Last() {
    Bnd_Box ret = new Bnd_Box(OCCwrapJavaJNI.Bnd_Array1OfBox_Last(swigCPtr, this), true);
    return ret;
  }

  public Bnd_Box ChangeLast() {
    Bnd_Box ret = new Bnd_Box(OCCwrapJavaJNI.Bnd_Array1OfBox_ChangeLast(swigCPtr, this), false, this);
    return ret; //new Bnd_Box.CRef (ret);
  }

  public  Bnd_Box  Value(int theIndex) {
    Bnd_Box ret = new Bnd_Box(OCCwrapJavaJNI.Bnd_Array1OfBox_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public Bnd_Box ChangeValue(int theIndex) {
    Bnd_Box ret = new Bnd_Box(OCCwrapJavaJNI.Bnd_Array1OfBox_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new Bnd_Box.CRef (ret);
  }

  public void SetValue(int theIndex,  Bnd_Box  theItem) {
    OCCwrapJavaJNI.Bnd_Array1OfBox_SetValue(swigCPtr, this, theIndex, Bnd_Box.getCPtr(theItem), theItem);
  }

  public void Resize(int theLower, int theUpper, long theToCopyData) {
    OCCwrapJavaJNI.Bnd_Array1OfBox_Resize(swigCPtr, this, theLower, theUpper, theToCopyData);
  }

}
