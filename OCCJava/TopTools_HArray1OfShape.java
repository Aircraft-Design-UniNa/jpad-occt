package opencascade;

public class TopTools_HArray1OfShape extends Standard_Transient {
  TopTools_HArray1OfShape(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TopTools_HArray1OfShape(int theLower, int theUpper,  TopoDS_Shape  theValue) {
    this(OCCwrapJavaJNI.new_TopTools_HArray1OfShape__SWIG_0(theLower, theUpper, TopoDS_Shape.getCPtr(theValue), theValue), true);
  }

  public TopTools_HArray1OfShape(int theLower, int theUpper) {
    this(OCCwrapJavaJNI.new_TopTools_HArray1OfShape__SWIG_1(theLower, theUpper), true);
  }

  public TopTools_HArray1OfShape( TopTools_Array1OfShape  theOther) {
    this(OCCwrapJavaJNI.new_TopTools_HArray1OfShape__SWIG_2(TopTools_Array1OfShape.getCPtr(theOther), theOther), true);
  }

  public  TopTools_Array1OfShape  Array1() {
    TopTools_Array1OfShape ret = new TopTools_Array1OfShape(OCCwrapJavaJNI.TopTools_HArray1OfShape_Array1(swigCPtr, this), false, this);
    return ret;
  }

  public  TopTools_Array1OfShape  ChangeArray1() {
    TopTools_Array1OfShape ret = new TopTools_Array1OfShape(OCCwrapJavaJNI.TopTools_HArray1OfShape_ChangeArray1(swigCPtr, this), false, this);
    return ret;
  }

  public int Size() {
    return OCCwrapJavaJNI.TopTools_HArray1OfShape_Size(swigCPtr, this);
  }

  public int Length() {
    return OCCwrapJavaJNI.TopTools_HArray1OfShape_Length(swigCPtr, this);
  }

  public int Lower() {
    return OCCwrapJavaJNI.TopTools_HArray1OfShape_Lower(swigCPtr, this);
  }

  public int Upper() {
    return OCCwrapJavaJNI.TopTools_HArray1OfShape_Upper(swigCPtr, this);
  }

  public  TopoDS_Shape  Value(int theIndex) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_HArray1OfShape_Value(swigCPtr, this, theIndex), true);
    return ret;
  }

  public TopoDS_Shape ChangeValue(int theIndex) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopTools_HArray1OfShape_ChangeValue(swigCPtr, this, theIndex), false, this);
    return ret; //new TopoDS_Shape.CRef (ret);
  }

  public void SetValue(int theIndex,  TopoDS_Shape  theItem) {
    OCCwrapJavaJNI.TopTools_HArray1OfShape_SetValue(swigCPtr, this, theIndex, TopoDS_Shape.getCPtr(theItem), theItem);
  }

  public static  TopTools_HArray1OfShape  DownCast( Standard_Transient  T) {
    return new TopTools_HArray1OfShape ( OCCwrapJavaJNI.TopTools_HArray1OfShape_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TopTools_HArray1OfShape_TypeOf(), true );
  }

}
