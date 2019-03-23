package opencascade;

/**
 *  ExtStringArray Attribute. Handles an array of UNICODE strings (represented by the TCollection_ExtendedString class).
 */
public class TDataStd_ExtStringArray extends TDF_Attribute {
  TDataStd_ExtStringArray(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataStd_ExtStringArray_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_ExtStringArray_get_type_descriptor(), true );
  }

  public static  TDataStd_ExtStringArray  Set( TDF_Label  label, int lower, int upper, long isDelta) {
    return new TDataStd_ExtStringArray ( OCCwrapJavaJNI.TDataStd_ExtStringArray_Set__SWIG_0(TDF_Label.getCPtr(label), label, lower, upper, isDelta), true );
  }

  public static  TDataStd_ExtStringArray  Set( TDF_Label  label, int lower, int upper) {
    return new TDataStd_ExtStringArray ( OCCwrapJavaJNI.TDataStd_ExtStringArray_Set__SWIG_1(TDF_Label.getCPtr(label), label, lower, upper), true );
  }

  public static  TDataStd_ExtStringArray  Set( TDF_Label  label,  Standard_GUID  theGuid, int lower, int upper, long isDelta) {
    return new TDataStd_ExtStringArray ( OCCwrapJavaJNI.TDataStd_ExtStringArray_Set__SWIG_2(TDF_Label.getCPtr(label), label, Standard_GUID.getCPtr(theGuid), theGuid, lower, upper, isDelta), true );
  }

  public static  TDataStd_ExtStringArray  Set( TDF_Label  label,  Standard_GUID  theGuid, int lower, int upper) {
    return new TDataStd_ExtStringArray ( OCCwrapJavaJNI.TDataStd_ExtStringArray_Set__SWIG_3(TDF_Label.getCPtr(label), label, Standard_GUID.getCPtr(theGuid), theGuid, lower, upper), true );
  }

  /**
   *  Initializes the inner array with bounds from <lower> to <upper>
   */
  public void Init(int lower, int upper) {
    OCCwrapJavaJNI.TDataStd_ExtStringArray_Init(swigCPtr, this, lower, upper);
  }

  /**
   *  Sets  the   <Index>th  element  of   the  array to <Value>
   *  OutOfRange exception is raised if <Index> doesn't respect Lower and Upper bounds of the internal  array.
   */
  public void SetValue(int Index,  TCollection_ExtendedString  Value) {
    OCCwrapJavaJNI.TDataStd_ExtStringArray_SetValue(swigCPtr, this, Index, TCollection_ExtendedString.getCPtr(Value), Value);
  }

  /**
   *  Sets the explicit GUID (user defined) for the attribute.
   */
  public void SetID( Standard_GUID  theGuid) {
    OCCwrapJavaJNI.TDataStd_ExtStringArray_SetID__SWIG_0(swigCPtr, this, Standard_GUID.getCPtr(theGuid), theGuid);
  }

  /**
   *  Sets default GUID for the attribute.
   */
  public void SetID() {
    OCCwrapJavaJNI.TDataStd_ExtStringArray_SetID__SWIG_1(swigCPtr, this);
  }

  /**
   *  Returns the value of  the  <Index>th element of the array
   */
  public  TCollection_ExtendedString  Value(int Index) {
    TCollection_ExtendedString ret = new TCollection_ExtendedString(OCCwrapJavaJNI.TDataStd_ExtStringArray_Value(swigCPtr, this, Index), true);
    return ret;
  }

  /**
   *  Return the lower bound.
   */
  public int Lower() {
    return OCCwrapJavaJNI.TDataStd_ExtStringArray_Lower(swigCPtr, this);
  }

  /**
   *  Return the upper bound
   */
  public int Upper() {
    return OCCwrapJavaJNI.TDataStd_ExtStringArray_Upper(swigCPtr, this);
  }

  /**
   *  Return the number of elements of <me>.
   */
  public int Length() {
    return OCCwrapJavaJNI.TDataStd_ExtStringArray_Length(swigCPtr, this);
  }

  /**
   *  Sets the inner array <myValue> of the ExtStringArray attribute to <newArray>.
   *  If value of <newArray> differs from <myValue>, Backup performed and myValue
   *  refers to new instance of HArray1OfExtendedString that holds <newArray> values
   *  If <isCheckItems> equal True each item of <newArray> will be checked with each
   *  item of <myValue> for coincidence (to avoid backup).
   */
  public void ChangeArray( TColStd_HArray1OfExtendedString  newArray, long isCheckItems) {
    OCCwrapJavaJNI.TDataStd_ExtStringArray_ChangeArray__SWIG_0(swigCPtr, this,  TColStd_HArray1OfExtendedString.getCPtr(newArray) , newArray, isCheckItems);
  }

  public void ChangeArray( TColStd_HArray1OfExtendedString  newArray) {
    OCCwrapJavaJNI.TDataStd_ExtStringArray_ChangeArray__SWIG_1(swigCPtr, this,  TColStd_HArray1OfExtendedString.getCPtr(newArray) , newArray);
  }

  public  TColStd_HArray1OfExtendedString  Array() {
    return new TColStd_HArray1OfExtendedString ( OCCwrapJavaJNI.TDataStd_ExtStringArray_Array(swigCPtr, this), true );
  }

  public long GetDelta() {
    return OCCwrapJavaJNI.TDataStd_ExtStringArray_GetDelta(swigCPtr, this);
  }

  /**
   *  for  internal  use  only!
   */
  public void SetDelta(long isDelta) {
    OCCwrapJavaJNI.TDataStd_ExtStringArray_SetDelta(swigCPtr, this, isDelta);
  }

  public TDataStd_ExtStringArray() {
    this(OCCwrapJavaJNI.new_TDataStd_ExtStringArray(), true);
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataStd_ExtStringArray_GetId(), true);
  }

  public static  TDataStd_ExtStringArray  DownCast( Standard_Transient  T) {
    return new TDataStd_ExtStringArray ( OCCwrapJavaJNI.TDataStd_ExtStringArray_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_ExtStringArray_TypeOf(), true );
  }

}
