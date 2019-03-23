package opencascade;

/**
 *  This class provides default services for an
 *  AttributeDelta on an ADDITION action.
 * 
 *  Applying this AttributeDelta means REMOVING its
 *  attribute.
 */
public class TDF_DeltaOnAddition extends TDF_AttributeDelta {
  TDF_DeltaOnAddition(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates a TDF_DeltaOnAddition.
   */
  public TDF_DeltaOnAddition( TDF_Attribute  anAtt) {
    this(OCCwrapJavaJNI.new_TDF_DeltaOnAddition( TDF_Attribute.getCPtr(anAtt) , anAtt), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDF_DeltaOnAddition_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_DeltaOnAddition_get_type_descriptor(), true );
  }

  public static  TDF_DeltaOnAddition  DownCast( Standard_Transient  T) {
    return new TDF_DeltaOnAddition ( OCCwrapJavaJNI.TDF_DeltaOnAddition_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_DeltaOnAddition_TypeOf(), true );
  }

}
