package opencascade;

/**
 *  A set of AttributeDelta for a given transaction
 *  number and reference time number.
 *  A delta set is available at <aSourceTime>. If
 *  applied, it restores the TDF_Data in the state it
 *  was at <aTargetTime>.
 */
public class TDF_Delta extends Standard_Transient {
  TDF_Delta(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates a delta.
   */
  public TDF_Delta() {
    this(OCCwrapJavaJNI.new_TDF_Delta(), true);
  }

  /**
   *  Returns true if there is nothing to undo.
   */
  public long IsEmpty() {
    return OCCwrapJavaJNI.TDF_Delta_IsEmpty(swigCPtr, this);
  }

  /**
   *  Returns true if the Undo action of <me> is
   *  applicable at <aCurrentTime>.
   */
  public long IsApplicable(int aCurrentTime) {
    return OCCwrapJavaJNI.TDF_Delta_IsApplicable(swigCPtr, this, aCurrentTime);
  }

  /**
   *  Returns the field <myBeginTime>.
   */
  public int BeginTime() {
    return OCCwrapJavaJNI.TDF_Delta_BeginTime(swigCPtr, this);
  }

  /**
   *  Returns the field <myEndTime>.
   */
  public int EndTime() {
    return OCCwrapJavaJNI.TDF_Delta_EndTime(swigCPtr, this);
  }

  /**
   *  Adds in <aLabelList> the labels of the attribute deltas.
   *  Caution: <aLabelList> is not cleared before use.
   */
  public void Labels(TDF_LabelList aLabelList) {
    OCCwrapJavaJNI.TDF_Delta_Labels(swigCPtr, this, TDF_LabelList.getCPtr(aLabelList), aLabelList);
  }

  /**
   *  Returns a name associated with this delta.
   */
  public TCollection_ExtendedString Name() {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.TDF_Delta_Name(swigCPtr, this), true);
  }

  /**
   *  Associates a name <theName> with this delta
   */
  public void SetName( TCollection_ExtendedString  theName) {
    OCCwrapJavaJNI.TDF_Delta_SetName(swigCPtr, this, TCollection_ExtendedString.getCPtr(theName), theName);
  }

  public void Dump(SWIGTYPE_p_Standard_OStream OS) {
    OCCwrapJavaJNI.TDF_Delta_Dump(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(OS));
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDF_Delta_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_Delta_get_type_descriptor(), true );
  }

  public static  TDF_Delta  DownCast( Standard_Transient  T) {
    return new TDF_Delta ( OCCwrapJavaJNI.TDF_Delta_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_Delta_TypeOf(), true );
  }

}
