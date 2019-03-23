package opencascade;

/**
 *  defines required type for LabelDisplay in directory part
 *  an effective LabelDisplay entity must inherits it
 */
public class IGESData_LabelDisplayEntity extends IGESData_IGESEntity {
  IGESData_LabelDisplayEntity(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static String get_type_name() {
    return OCCwrapJavaJNI.IGESData_LabelDisplayEntity_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.IGESData_LabelDisplayEntity_get_type_descriptor(), true );
  }

  public static  IGESData_LabelDisplayEntity  DownCast( Standard_Transient  T) {
    return new IGESData_LabelDisplayEntity ( OCCwrapJavaJNI.IGESData_LabelDisplayEntity_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.IGESData_LabelDisplayEntity_TypeOf(), true );
  }

  public IGESData_LabelDisplayEntity() {
    this(OCCwrapJavaJNI.new_IGESData_LabelDisplayEntity(), true);
  }

}
