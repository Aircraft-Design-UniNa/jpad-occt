package opencascade;

/**
 *  A framework for an attribute composed of a real number array.
 */
public class TDataStd_RealArray extends TDF_Attribute {
  TDataStd_RealArray(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataStd_RealArray_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_RealArray_get_type_descriptor(), true );
  }

  public static  TDataStd_RealArray  Set( TDF_Label  label, int lower, int upper, long isDelta) {
    return new TDataStd_RealArray ( OCCwrapJavaJNI.TDataStd_RealArray_Set__SWIG_0(TDF_Label.getCPtr(label), label, lower, upper, isDelta), true );
  }

  public static  TDataStd_RealArray  Set( TDF_Label  label, int lower, int upper) {
    return new TDataStd_RealArray ( OCCwrapJavaJNI.TDataStd_RealArray_Set__SWIG_1(TDF_Label.getCPtr(label), label, lower, upper), true );
  }

  public static  TDataStd_RealArray  Set( TDF_Label  label,  Standard_GUID  theGuid, int lower, int upper, long isDelta) {
    return new TDataStd_RealArray ( OCCwrapJavaJNI.TDataStd_RealArray_Set__SWIG_2(TDF_Label.getCPtr(label), label, Standard_GUID.getCPtr(theGuid), theGuid, lower, upper, isDelta), true );
  }

  public static  TDataStd_RealArray  Set( TDF_Label  label,  Standard_GUID  theGuid, int lower, int upper) {
    return new TDataStd_RealArray ( OCCwrapJavaJNI.TDataStd_RealArray_Set__SWIG_3(TDF_Label.getCPtr(label), label, Standard_GUID.getCPtr(theGuid), theGuid, lower, upper), true );
  }

  /**
   *  Initialize the inner array with bounds from <lower> to <upper>
   */
  public void Init(int lower, int upper) {
    OCCwrapJavaJNI.TDataStd_RealArray_Init(swigCPtr, this, lower, upper);
  }

  /**
   *  Sets the explicit GUID (user defined) for the attribute.
   */
  public void SetID( Standard_GUID  theGuid) {
    OCCwrapJavaJNI.TDataStd_RealArray_SetID__SWIG_0(swigCPtr, this, Standard_GUID.getCPtr(theGuid), theGuid);
  }

  /**
   *  Sets default GUID for the attribute.
   */
  public void SetID() {
    OCCwrapJavaJNI.TDataStd_RealArray_SetID__SWIG_1(swigCPtr, this);
  }

  /**
   *  Sets  the   <Index>th  element  of   the  array to <Value>
   *  OutOfRange exception is raised if <Index> doesn't respect Lower and Upper bounds of the internal  array.
   */
  public void SetValue(int Index, double Value) {
    OCCwrapJavaJNI.TDataStd_RealArray_SetValue(swigCPtr, this, Index, Value);
  }

  /**
   *  Return the value of  the  <Index>th element of the array
   */
  public double Value(int Index) {
    return OCCwrapJavaJNI.TDataStd_RealArray_Value(swigCPtr, this, Index);
  }

  /**
   *  Returns the lower boundary of the array.
   */
  public int Lower() {
    return OCCwrapJavaJNI.TDataStd_RealArray_Lower(swigCPtr, this);
  }

  /**
   *  Returns the upper boundary of the array.
   */
  public int Upper() {
    return OCCwrapJavaJNI.TDataStd_RealArray_Upper(swigCPtr, this);
  }

  /**
   *  Returns the number of elements of the array of reals
   *  in terms of the number of elements it contains.
   */
  public int Length() {
    return OCCwrapJavaJNI.TDataStd_RealArray_Length(swigCPtr, this);
  }

  /**
   *  Sets the inner array <myValue> of the RealArray attribute
   *  to <newArray>. If value of <newArray> differs from <myValue>,
   *  Backup performed and myValue refers to new instance of HArray1OfReal
   *  that holds <newArray> values
   *  If <isCheckItems> equal True each item of <newArray> will be checked with each
   *  item of <myValue> for coincidence (to avoid backup).
   */
  public void ChangeArray( TColStd_HArray1OfReal  newArray, long isCheckItems) {
    OCCwrapJavaJNI.TDataStd_RealArray_ChangeArray__SWIG_0(swigCPtr, this,  TColStd_HArray1OfReal.getCPtr(newArray) , newArray, isCheckItems);
  }

  public void ChangeArray( TColStd_HArray1OfReal  newArray) {
    OCCwrapJavaJNI.TDataStd_RealArray_ChangeArray__SWIG_1(swigCPtr, this,  TColStd_HArray1OfReal.getCPtr(newArray) , newArray);
  }

  public  TColStd_HArray1OfReal  Array() {
    return new TColStd_HArray1OfReal ( OCCwrapJavaJNI.TDataStd_RealArray_Array(swigCPtr, this), true );
  }

  public long GetDelta() {
    return OCCwrapJavaJNI.TDataStd_RealArray_GetDelta(swigCPtr, this);
  }

  /**
   *  for  internal  use  only!
   */
  public void SetDelta(long isDelta) {
    OCCwrapJavaJNI.TDataStd_RealArray_SetDelta(swigCPtr, this, isDelta);
  }

  public TDataStd_RealArray() {
    this(OCCwrapJavaJNI.new_TDataStd_RealArray(), true);
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataStd_RealArray_GetId(), true);
  }

  public static  TDataStd_RealArray  DownCast( Standard_Transient  T) {
    return new TDataStd_RealArray ( OCCwrapJavaJNI.TDataStd_RealArray_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_RealArray_TypeOf(), true );
  }

}
