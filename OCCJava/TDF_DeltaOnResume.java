package opencascade;

/**
 *  This class provides default services for an
 *  AttributeDelta on an Resume action.
 * 
 *  Applying this AttributeDelta means FORGETTING its
 *  attribute.
 */
public class TDF_DeltaOnResume extends TDF_AttributeDelta {
  TDF_DeltaOnResume(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates a TDF_DeltaOnResume.
   */
  public TDF_DeltaOnResume( TDF_Attribute  anAtt) {
    this(OCCwrapJavaJNI.new_TDF_DeltaOnResume( TDF_Attribute.getCPtr(anAtt) , anAtt), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDF_DeltaOnResume_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_DeltaOnResume_get_type_descriptor(), true );
  }

  public static  TDF_DeltaOnResume  DownCast( Standard_Transient  T) {
    return new TDF_DeltaOnResume ( OCCwrapJavaJNI.TDF_DeltaOnResume_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_DeltaOnResume_TypeOf(), true );
  }

}
