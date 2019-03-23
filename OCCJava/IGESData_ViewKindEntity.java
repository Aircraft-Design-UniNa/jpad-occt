package opencascade;

/**
 *  defines required type for ViewKind in directory part
 *  that is, Single view or Multiple view
 *  An effective ViewKind entity must inherit it and define
 *  IsSingle (True for Single, False for List of Views),
 *  NbViews and ViewItem (especially for a List)
 */
public class IGESData_ViewKindEntity extends IGESData_IGESEntity {
  IGESData_ViewKindEntity(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  says if "me" is a Single View (True) or a List of Views (False)
   */
  public long IsSingle() {
    return OCCwrapJavaJNI.IGESData_ViewKindEntity_IsSingle(swigCPtr, this);
  }

  /**
   *  Returns the count of Views for a List of Views. For a Single
   *  View, may return simply 1
   */
  public int NbViews() {
    return OCCwrapJavaJNI.IGESData_ViewKindEntity_NbViews(swigCPtr, this);
  }

  public  IGESData_ViewKindEntity  ViewItem(int num) {
    return new IGESData_ViewKindEntity ( OCCwrapJavaJNI.IGESData_ViewKindEntity_ViewItem(swigCPtr, this, num), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.IGESData_ViewKindEntity_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.IGESData_ViewKindEntity_get_type_descriptor(), true );
  }

  public static  IGESData_ViewKindEntity  DownCast( Standard_Transient  T) {
    return new IGESData_ViewKindEntity ( OCCwrapJavaJNI.IGESData_ViewKindEntity_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.IGESData_ViewKindEntity_TypeOf(), true );
  }

}
