package opencascade;

/**
 *  This class provides default services for an
 *  AttributeDelta on a MODIFICATION action.
 * 
 *  Applying this AttributeDelta means GOING BACK to
 *  the attribute previously registered state.
 */
public class TDF_DeltaOnModification extends TDF_AttributeDelta {
  TDF_DeltaOnModification(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDF_DeltaOnModification_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_DeltaOnModification_get_type_descriptor(), true );
  }

  public static  TDF_DeltaOnModification  DownCast( Standard_Transient  T) {
    return new TDF_DeltaOnModification ( OCCwrapJavaJNI.TDF_DeltaOnModification_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_DeltaOnModification_TypeOf(), true );
  }

}
