package opencascade;

/**
 *  Legacy class defining resources name for lite OCAF documents
 */
public class AppStdL_Application extends TDocStd_Application {
  AppStdL_Application(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static String get_type_name() {
    return OCCwrapJavaJNI.AppStdL_Application_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.AppStdL_Application_get_type_descriptor(), true );
  }

  public static  AppStdL_Application  DownCast( Standard_Transient  T) {
    return new AppStdL_Application ( OCCwrapJavaJNI.AppStdL_Application_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.AppStdL_Application_TypeOf(), true );
  }

  public AppStdL_Application() {
    this(OCCwrapJavaJNI.new_AppStdL_Application(), true);
  }

}
