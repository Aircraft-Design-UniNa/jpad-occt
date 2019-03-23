package opencascade;

public class CDM_Application extends Standard_Transient {
  CDM_Application(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public  Resource_Manager  Resources() {
    return new Resource_Manager ( OCCwrapJavaJNI.CDM_Application_Resources(swigCPtr, this), true );
  }

  public  Message_Messenger  MessageDriver() {
    return new Message_Messenger ( OCCwrapJavaJNI.CDM_Application_MessageDriver(swigCPtr, this), true );
  }

  /**
   *  this method is called before the update of a document.
   *  By default, writes in MessageDriver().
   */
  public void BeginOfUpdate( CDM_Document  aDocument) {
    OCCwrapJavaJNI.CDM_Application_BeginOfUpdate(swigCPtr, this,  CDM_Document.getCPtr(aDocument) , aDocument);
  }

  /**
   *  this method is called affter the update of a document.
   *  By default, writes in MessageDriver().
   */
  public void EndOfUpdate( CDM_Document  aDocument, long theStatus,  TCollection_ExtendedString  ErrorString) {
    OCCwrapJavaJNI.CDM_Application_EndOfUpdate(swigCPtr, this,  CDM_Document.getCPtr(aDocument) , aDocument, theStatus, TCollection_ExtendedString.getCPtr(ErrorString), ErrorString);
  }

  /**
   *  writes the string in the application MessagerDriver.
   */
  public void Write(SWIGTYPE_p_Standard_ExtString aString) {
    OCCwrapJavaJNI.CDM_Application_Write(swigCPtr, this, SWIGTYPE_p_Standard_ExtString.getCPtr(aString));
  }

  /**
   *  Returns the application name.
   */
  public TCollection_ExtendedString Name() {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.CDM_Application_Name(swigCPtr, this), true);
  }

  /**
   *  Returns the application version.
   */
  public TCollection_AsciiString Version() {
    return new TCollection_AsciiString(OCCwrapJavaJNI.CDM_Application_Version(swigCPtr, this), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.CDM_Application_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.CDM_Application_get_type_descriptor(), true );
  }

  public static  CDM_Application  DownCast( Standard_Transient  T) {
    return new CDM_Application ( OCCwrapJavaJNI.CDM_Application_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.CDM_Application_TypeOf(), true );
  }

}
