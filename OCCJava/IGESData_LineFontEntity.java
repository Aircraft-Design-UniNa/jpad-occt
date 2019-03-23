package opencascade;

/**
 *  defines required type for LineFont in directory part
 *  an effective LineFont entity must inherits it
 */
public class IGESData_LineFontEntity extends IGESData_IGESEntity {
  IGESData_LineFontEntity(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static String get_type_name() {
    return OCCwrapJavaJNI.IGESData_LineFontEntity_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.IGESData_LineFontEntity_get_type_descriptor(), true );
  }

  public static  IGESData_LineFontEntity  DownCast( Standard_Transient  T) {
    return new IGESData_LineFontEntity ( OCCwrapJavaJNI.IGESData_LineFontEntity_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.IGESData_LineFontEntity_TypeOf(), true );
  }

  public IGESData_LineFontEntity() {
    this(OCCwrapJavaJNI.new_IGESData_LineFontEntity(), true);
  }

}
