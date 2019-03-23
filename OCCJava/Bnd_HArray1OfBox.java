package opencascade;

public class Bnd_HArray1OfBox extends Standard_Transient {
  Bnd_HArray1OfBox(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public Bnd_HArray1OfBox(int theLower, int theUpper,  Bnd_Box  theValue) {
    this(OCCwrapJavaJNI.new_Bnd_HArray1OfBox__SWIG_0(theLower, theUpper, Bnd_Box.getCPtr(theValue), theValue), true);
  }

  public Bnd_HArray1OfBox(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_Bnd_HArray1OfBox__SWIG_1(theLower, theUpper), true);
  }

  public Bnd_HArray1OfBox( Bnd_Array1OfBox  theOther) {
    this(OCCwrapJavaJNI.new_Bnd_HArray1OfBox__SWIG_2(Bnd_Array1OfBox.getCPtr(theOther), theOther), true);
  }

  public  Bnd_Array1OfBox  Array1() {
    Bnd_Array1OfBox ret = new Bnd_Array1OfBox(OCCwrapJavaJNI.Bnd_HArray1OfBox_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  Bnd_Array1OfBox  ChangeArray1() {
    Bnd_Array1OfBox ret = new Bnd_Array1OfBox(OCCwrapJavaJNI.Bnd_HArray1OfBox_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.Bnd_HArray1OfBox_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.Bnd_HArray1OfBox_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.Bnd_HArray1OfBox_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.Bnd_HArray1OfBox_Upper(swigCPtr, this);
  }

  public  Bnd_Box  Value(int theIndex) {
    Bnd_Box ret = new Bnd_Box(OCCwrapJavaJNI.Bnd_HArray1OfBox_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public Bnd_Box ChangeValue(int theIndex) {
    Bnd_Box ret = new Bnd_Box(OCCwrapJavaJNI.Bnd_HArray1OfBox_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new Bnd_Box.CRef (ret);
  }

  public void SetValue(int theIndex,  Bnd_Box  theItem) {
    OCCwrapJavaJNI.Bnd_HArray1OfBox_SetValue(swigCPtr, this, theIndex, Bnd_Box.getCPtr(theItem), theItem);
  }

  public static  Bnd_HArray1OfBox  DownCast( Standard_Transient  T) {
    return new Bnd_HArray1OfBox ( OCCwrapJavaJNI.Bnd_HArray1OfBox_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Bnd_HArray1OfBox_TypeOf(), true );
  }

}
