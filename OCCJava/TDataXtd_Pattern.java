package opencascade;

/**
 *  a general pattern model
 */
public class TDataXtd_Pattern extends TDF_Attribute {
  TDataXtd_Pattern(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns the ID of the attribute.
   */
  public  Standard_GUID  PatternID() {
    Standard_GUID ret = new Standard_GUID(OCCwrapJavaJNI.TDataXtd_Pattern_PatternID(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Give the number of transformation
   */
  public int NbTrsfs() {
    return OCCwrapJavaJNI.TDataXtd_Pattern_NbTrsfs(swigCPtr, this);
  }

  /**
   *  Give the transformations
   */
  public void ComputeTrsfs( TDataXtd_Array1OfTrsf  Trsfs) {
    OCCwrapJavaJNI.TDataXtd_Pattern_ComputeTrsfs(swigCPtr, this, TDataXtd_Array1OfTrsf.getCPtr(Trsfs), Trsfs);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataXtd_Pattern_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataXtd_Pattern_get_type_descriptor(), true );
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataXtd_Pattern_GetId(), true);
  }

  public static  TDataXtd_Pattern  DownCast( Standard_Transient  T) {
    return new TDataXtd_Pattern ( OCCwrapJavaJNI.TDataXtd_Pattern_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataXtd_Pattern_TypeOf(), true );
  }

}
