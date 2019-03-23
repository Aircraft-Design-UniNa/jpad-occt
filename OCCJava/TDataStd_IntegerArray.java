package opencascade;

/**
 *  Contains an array of integers.
 */
public class TDataStd_IntegerArray extends TDF_Attribute {
  TDataStd_IntegerArray(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataStd_IntegerArray_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_IntegerArray_get_type_descriptor(), true );
  }

  public static  TDataStd_IntegerArray  Set( TDF_Label  label, int lower, int upper, long isDelta) {
    return new TDataStd_IntegerArray ( OCCwrapJavaJNI.TDataStd_IntegerArray_Set__SWIG_0(TDF_Label.getCPtr(label), label, lower, upper, isDelta), true );
  }

  public static  TDataStd_IntegerArray  Set( TDF_Label  label, int lower, int upper) {
    return new TDataStd_IntegerArray ( OCCwrapJavaJNI.TDataStd_IntegerArray_Set__SWIG_1(TDF_Label.getCPtr(label), label, lower, upper), true );
  }

  public static  TDataStd_IntegerArray  Set( TDF_Label  label,  Standard_GUID  theGuid, int lower, int upper, long isDelta) {
    return new TDataStd_IntegerArray ( OCCwrapJavaJNI.TDataStd_IntegerArray_Set__SWIG_2(TDF_Label.getCPtr(label), label, Standard_GUID.getCPtr(theGuid), theGuid, lower, upper, isDelta), true );
  }

  public static  TDataStd_IntegerArray  Set( TDF_Label  label,  Standard_GUID  theGuid, int lower, int upper) {
    return new TDataStd_IntegerArray ( OCCwrapJavaJNI.TDataStd_IntegerArray_Set__SWIG_3(TDF_Label.getCPtr(label), label, Standard_GUID.getCPtr(theGuid), theGuid, lower, upper), true );
  }

  /**
   *  Initialize the inner array with bounds from <lower> to <upper>
   */
  public void Init(int lower, int upper) {
    OCCwrapJavaJNI.TDataStd_IntegerArray_Init(swigCPtr, this, lower, upper);
  }

  /**
   *  Sets  the   <Index>th  element  of   the  array to <Value>
   *  OutOfRange exception is raised if <Index> doesn't respect Lower and Upper bounds of the internal  array.
   */
  public void SetValue(int Index, int Value) {
    OCCwrapJavaJNI.TDataStd_IntegerArray_SetValue(swigCPtr, this, Index, Value);
  }

  /**
   *  Sets the explicit GUID (user defined) for the attribute.
   */
  public void SetID( Standard_GUID  theGuid) {
    OCCwrapJavaJNI.TDataStd_IntegerArray_SetID__SWIG_0(swigCPtr, this, Standard_GUID.getCPtr(theGuid), theGuid);
  }

  /**
   *  Sets default GUID for the attribute.
   */
  public void SetID() {
    OCCwrapJavaJNI.TDataStd_IntegerArray_SetID__SWIG_1(swigCPtr, this);
  }

  /**
   *  Return the value of  the  <Index>th element of the array
   */
  public int Value(int Index) {
    return OCCwrapJavaJNI.TDataStd_IntegerArray_Value(swigCPtr, this, Index);
  }

  /**
   *  Returns the lower boundary of this array of integers.
   */
  public int Lower() {
    return OCCwrapJavaJNI.TDataStd_IntegerArray_Lower(swigCPtr, this);
  }

  /**
   *  Return the upper boundary of this array of integers.
   */
  public int Upper() {
    return OCCwrapJavaJNI.TDataStd_IntegerArray_Upper(swigCPtr, this);
  }

  /**
   *  Returns the length of this array of integers in
   *  terms of the number of elements it contains.
   */
  public int Length() {
    return OCCwrapJavaJNI.TDataStd_IntegerArray_Length(swigCPtr, this);
  }

  /**
   *  Sets the inner array <myValue>  of the IntegerArray attribute to
   *  <newArray>. If value of <newArray> differs from <myValue>, Backup performed
   *  and myValue refers to new instance of HArray1OfInteger that holds <newArray>
   *  values
   *  If <isCheckItems> equal True each item of <newArray> will be checked with each
   *  item of <myValue> for coincidence (to avoid backup).
   */
  public void ChangeArray( TColStd_HArray1OfInteger  newArray, long isCheckItems) {
    OCCwrapJavaJNI.TDataStd_IntegerArray_ChangeArray__SWIG_0(swigCPtr, this,  TColStd_HArray1OfInteger.getCPtr(newArray) , newArray, isCheckItems);
  }

  public void ChangeArray( TColStd_HArray1OfInteger  newArray) {
    OCCwrapJavaJNI.TDataStd_IntegerArray_ChangeArray__SWIG_1(swigCPtr, this,  TColStd_HArray1OfInteger.getCPtr(newArray) , newArray);
  }

  public  TColStd_HArray1OfInteger  Array() {
    return new TColStd_HArray1OfInteger ( OCCwrapJavaJNI.TDataStd_IntegerArray_Array(swigCPtr, this), true );
  }

  public long GetDelta() {
    return OCCwrapJavaJNI.TDataStd_IntegerArray_GetDelta(swigCPtr, this);
  }

  /**
   *  for  internal  use  only!
   */
  public void SetDelta(long isDelta) {
    OCCwrapJavaJNI.TDataStd_IntegerArray_SetDelta(swigCPtr, this, isDelta);
  }

  public TDataStd_IntegerArray() {
    this(OCCwrapJavaJNI.new_TDataStd_IntegerArray(), true);
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataStd_IntegerArray_GetId(), true);
  }

  public static  TDataStd_IntegerArray  DownCast( Standard_Transient  T) {
    return new TDataStd_IntegerArray ( OCCwrapJavaJNI.TDataStd_IntegerArray_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_IntegerArray_TypeOf(), true );
  }

}
