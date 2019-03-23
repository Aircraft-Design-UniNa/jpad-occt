package opencascade;

/**
 *  This class discribes the services we need to
 *  implement Delta and Undo/Redo services.
 * 
 *  AttributeDeltas are applied in an unpredictable
 *  order. But by the redefinition of the method
 *  IsNowApplicable, a condition can be verified
 *  before application. If the AttributeDelta is not
 *  yet applicable, it is put at the end of the
 *  AttributeDelta list, to be treated later. If a
 *  dead lock if found on the list, the
 *  AttributeDeltas are forced to be applied in an
 *  unpredictable order.
 */
public class TDF_AttributeDelta extends Standard_Transient {
  TDF_AttributeDelta(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Applies the delta to the attribute.
   */
  public void Apply() {
    OCCwrapJavaJNI.TDF_AttributeDelta_Apply(swigCPtr, this);
  }

  /**
   *  Returns the label concerned by <me>.
   */
  public TDF_Label Label() {
    return new TDF_Label(OCCwrapJavaJNI.TDF_AttributeDelta_Label(swigCPtr, this), true);
  }

  public  TDF_Attribute  Attribute() {
    return new TDF_Attribute ( OCCwrapJavaJNI.TDF_AttributeDelta_Attribute(swigCPtr, this), true );
  }

  /**
   *  Returns the ID of the attribute concerned by <me>.
   */
  public Standard_GUID ID() {
    return new Standard_GUID(OCCwrapJavaJNI.TDF_AttributeDelta_ID(swigCPtr, this), true);
  }

  /**
   *  Dumps the contents.
   */
  public SWIGTYPE_p_Standard_OStream Dump(SWIGTYPE_p_Standard_OStream OS) {
    return new SWIGTYPE_p_Standard_OStream(OCCwrapJavaJNI.TDF_AttributeDelta_Dump(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(OS)), false);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDF_AttributeDelta_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_AttributeDelta_get_type_descriptor(), true );
  }

  public static  TDF_AttributeDelta  DownCast( Standard_Transient  T) {
    return new TDF_AttributeDelta ( OCCwrapJavaJNI.TDF_AttributeDelta_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_AttributeDelta_TypeOf(), true );
  }

}
