package opencascade;

/**
 *  defines required type for Color in directory part
 *  an effective Color entity must inherits it
 */
public class IGESData_ColorEntity extends IGESData_IGESEntity {
  IGESData_ColorEntity(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static String get_type_name() {
    return OCCwrapJavaJNI.IGESData_ColorEntity_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.IGESData_ColorEntity_get_type_descriptor(), true );
  }

  public static  IGESData_ColorEntity  DownCast( Standard_Transient  T) {
    return new IGESData_ColorEntity ( OCCwrapJavaJNI.IGESData_ColorEntity_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.IGESData_ColorEntity_TypeOf(), true );
  }

  public IGESData_ColorEntity() {
    this(OCCwrapJavaJNI.new_IGESData_ColorEntity(), true);
  }

}
