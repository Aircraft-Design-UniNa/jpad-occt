package opencascade;

/**
 *  defines required type for Transf in directory part
 *  an effective Transf entity must inherits it
 */
public class IGESData_TransfEntity extends IGESData_IGESEntity {
  IGESData_TransfEntity(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  gives value of the transformation, as a GTrsf
   *  To be defined by an effective class of Transformation Entity
   *  Warning : Must take in account Composition : if a TransfEntity has in
   *  its Directory Part, a Transf, this means that it is Compound,
   *  Value must return the global result
   */
  public gp_GTrsf Value() {
    return new gp_GTrsf(OCCwrapJavaJNI.IGESData_TransfEntity_Value(swigCPtr, this), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.IGESData_TransfEntity_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.IGESData_TransfEntity_get_type_descriptor(), true );
  }

  public static  IGESData_TransfEntity  DownCast( Standard_Transient  T) {
    return new IGESData_TransfEntity ( OCCwrapJavaJNI.IGESData_TransfEntity_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.IGESData_TransfEntity_TypeOf(), true );
  }

}
