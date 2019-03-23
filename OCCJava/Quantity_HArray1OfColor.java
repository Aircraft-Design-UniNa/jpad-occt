package opencascade;

public class Quantity_HArray1OfColor extends Standard_Transient {
  Quantity_HArray1OfColor(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public Quantity_HArray1OfColor(int theLower, int theUpper,  Quantity_Color  theValue) {
    this(OCCwrapJavaJNI.new_Quantity_HArray1OfColor__SWIG_0(theLower, theUpper, Quantity_Color.getCPtr(theValue), theValue), true);
  }

  public Quantity_HArray1OfColor(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_Quantity_HArray1OfColor__SWIG_1(theLower, theUpper), true);
  }

  public Quantity_HArray1OfColor( Quantity_Array1OfColor  theOther) {
    this(OCCwrapJavaJNI.new_Quantity_HArray1OfColor__SWIG_2(Quantity_Array1OfColor.getCPtr(theOther), theOther), true);
  }

  public  Quantity_Array1OfColor  Array1() {
    Quantity_Array1OfColor ret = new Quantity_Array1OfColor(OCCwrapJavaJNI.Quantity_HArray1OfColor_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  Quantity_Array1OfColor  ChangeArray1() {
    Quantity_Array1OfColor ret = new Quantity_Array1OfColor(OCCwrapJavaJNI.Quantity_HArray1OfColor_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.Quantity_HArray1OfColor_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.Quantity_HArray1OfColor_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.Quantity_HArray1OfColor_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.Quantity_HArray1OfColor_Upper(swigCPtr, this);
  }

  public  Quantity_Color  Value(int theIndex) {
    Quantity_Color ret = new Quantity_Color(OCCwrapJavaJNI.Quantity_HArray1OfColor_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public Quantity_Color ChangeValue(int theIndex) {
    Quantity_Color ret = new Quantity_Color(OCCwrapJavaJNI.Quantity_HArray1OfColor_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new Quantity_Color.CRef (ret);
  }

  public void SetValue(int theIndex,  Quantity_Color  theItem) {
    OCCwrapJavaJNI.Quantity_HArray1OfColor_SetValue(swigCPtr, this, theIndex, Quantity_Color.getCPtr(theItem), theItem);
  }

  public static  Quantity_HArray1OfColor  DownCast( Standard_Transient  T) {
    return new Quantity_HArray1OfColor ( OCCwrapJavaJNI.Quantity_HArray1OfColor_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Quantity_HArray1OfColor_TypeOf(), true );
  }

}
