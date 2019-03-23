package opencascade;

/**
 *  This class provides default services for an
 *  AttributeDelta on a REMOVAL action.
 * 
 *  Applying this AttributeDelta means ADDING its
 *  attribute.
 */
public class TDF_DeltaOnRemoval extends TDF_AttributeDelta {
  TDF_DeltaOnRemoval(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDF_DeltaOnRemoval_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_DeltaOnRemoval_get_type_descriptor(), true );
  }

  public static  TDF_DeltaOnRemoval  DownCast( Standard_Transient  T) {
    return new TDF_DeltaOnRemoval ( OCCwrapJavaJNI.TDF_DeltaOnRemoval_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_DeltaOnRemoval_TypeOf(), true );
  }

}
