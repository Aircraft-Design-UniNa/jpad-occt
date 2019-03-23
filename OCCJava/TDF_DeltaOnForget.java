package opencascade;

/**
 *  This class provides default services for an
 *  AttributeDelta on an Forget action.
 * 
 *  Applying this AttributeDelta means RESUMING its
 *  attribute.
 */
public class TDF_DeltaOnForget extends TDF_AttributeDelta {
  TDF_DeltaOnForget(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates a TDF_DeltaOnForget.
   */
  public TDF_DeltaOnForget( TDF_Attribute  anAtt) {
    this(OCCwrapJavaJNI.new_TDF_DeltaOnForget( TDF_Attribute.getCPtr(anAtt) , anAtt), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDF_DeltaOnForget_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_DeltaOnForget_get_type_descriptor(), true );
  }

  public static  TDF_DeltaOnForget  DownCast( Standard_Transient  T) {
    return new TDF_DeltaOnForget ( OCCwrapJavaJNI.TDF_DeltaOnForget_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_DeltaOnForget_TypeOf(), true );
  }

}
