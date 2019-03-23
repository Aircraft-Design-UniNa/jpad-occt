package opencascade;

/**
 *  defines required type for LevelList in directory part
 *  an effective LevelList entity must inherits it
 */
public class IGESData_LevelListEntity extends IGESData_IGESEntity {
  IGESData_LevelListEntity(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Must return the count of levels
   */
  public int NbLevelNumbers() {
    return OCCwrapJavaJNI.IGESData_LevelListEntity_NbLevelNumbers(swigCPtr, this);
  }

  /**
   *  returns the Level Number of <me>, indicated by <num>
   *  raises an exception if num is out of range
   */
  public int LevelNumber(int num) {
    return OCCwrapJavaJNI.IGESData_LevelListEntity_LevelNumber(swigCPtr, this, num);
  }

  /**
   *  returns True if <level> is in the list
   */
  public long HasLevelNumber(int level) {
    return OCCwrapJavaJNI.IGESData_LevelListEntity_HasLevelNumber(swigCPtr, this, level);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.IGESData_LevelListEntity_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.IGESData_LevelListEntity_get_type_descriptor(), true );
  }

  public static  IGESData_LevelListEntity  DownCast( Standard_Transient  T) {
    return new IGESData_LevelListEntity ( OCCwrapJavaJNI.IGESData_LevelListEntity_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.IGESData_LevelListEntity_TypeOf(), true );
  }

}
