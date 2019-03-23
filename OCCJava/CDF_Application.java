package opencascade;

public class CDF_Application extends CDM_Application {
  CDF_Application(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static  CDF_Application  Load( Standard_GUID  aGUID) {
    return new CDF_Application ( OCCwrapJavaJNI.CDF_Application_Load(Standard_GUID.getCPtr(aGUID), aGUID), true );
  }

  /**
   *  puts the document in the current session directory
   *  and calls the virtual method Activate on it.
   */
  public void Open( CDM_Document  aDocument) {
    OCCwrapJavaJNI.CDF_Application_Open(swigCPtr, this,  CDM_Document.getCPtr(aDocument) , aDocument);
  }

  public CDM_CanCloseStatus CanClose( CDM_Document  aDocument) {
    return CDM_CanCloseStatus.swigToEnum(OCCwrapJavaJNI.CDF_Application_CanClose(swigCPtr, this,  CDM_Document.getCPtr(aDocument) , aDocument));
  }

  /**
   *  removes the document of the current session directory
   *  and closes the document;
   */
  public void Close( CDM_Document  aDocument) {
    OCCwrapJavaJNI.CDF_Application_Close(swigCPtr, this,  CDM_Document.getCPtr(aDocument) , aDocument);
  }

  public  CDM_Document  Retrieve( TCollection_ExtendedString  aFolder,  TCollection_ExtendedString  aName, long UseStorageConfiguration) {
    return new CDM_Document ( OCCwrapJavaJNI.CDF_Application_Retrieve__SWIG_0(swigCPtr, this, TCollection_ExtendedString.getCPtr(aFolder), aFolder, TCollection_ExtendedString.getCPtr(aName), aName, UseStorageConfiguration), true );
  }

  public  CDM_Document  Retrieve( TCollection_ExtendedString  aFolder,  TCollection_ExtendedString  aName) {
    return new CDM_Document ( OCCwrapJavaJNI.CDF_Application_Retrieve__SWIG_1(swigCPtr, this, TCollection_ExtendedString.getCPtr(aFolder), aFolder, TCollection_ExtendedString.getCPtr(aName), aName), true );
  }

  public  CDM_Document  Retrieve( TCollection_ExtendedString  aFolder,  TCollection_ExtendedString  aName,  TCollection_ExtendedString  aVersion, long UseStorageConfiguration) {
    return new CDM_Document ( OCCwrapJavaJNI.CDF_Application_Retrieve__SWIG_2(swigCPtr, this, TCollection_ExtendedString.getCPtr(aFolder), aFolder, TCollection_ExtendedString.getCPtr(aName), aName, TCollection_ExtendedString.getCPtr(aVersion), aVersion, UseStorageConfiguration), true );
  }

  public  CDM_Document  Retrieve( TCollection_ExtendedString  aFolder,  TCollection_ExtendedString  aName,  TCollection_ExtendedString  aVersion) {
    return new CDM_Document ( OCCwrapJavaJNI.CDF_Application_Retrieve__SWIG_3(swigCPtr, this, TCollection_ExtendedString.getCPtr(aFolder), aFolder, TCollection_ExtendedString.getCPtr(aName), aName, TCollection_ExtendedString.getCPtr(aVersion), aVersion), true );
  }

  public PCDM_ReaderStatus CanRetrieve( TCollection_ExtendedString  aFolder,  TCollection_ExtendedString  aName) {
    return PCDM_ReaderStatus.swigToEnum(OCCwrapJavaJNI.CDF_Application_CanRetrieve__SWIG_0(swigCPtr, this, TCollection_ExtendedString.getCPtr(aFolder), aFolder, TCollection_ExtendedString.getCPtr(aName), aName));
  }

  public PCDM_ReaderStatus CanRetrieve( TCollection_ExtendedString  aFolder,  TCollection_ExtendedString  aName,  TCollection_ExtendedString  aVersion) {
    return PCDM_ReaderStatus.swigToEnum(OCCwrapJavaJNI.CDF_Application_CanRetrieve__SWIG_1(swigCPtr, this, TCollection_ExtendedString.getCPtr(aFolder), aFolder, TCollection_ExtendedString.getCPtr(aName), aName, TCollection_ExtendedString.getCPtr(aVersion), aVersion));
  }

  /**
   *  Checks  status  after  Retrieve
   */
  public PCDM_ReaderStatus GetRetrieveStatus() {
    return PCDM_ReaderStatus.swigToEnum(OCCwrapJavaJNI.CDF_Application_GetRetrieveStatus(swigCPtr, this));
  }

  public  CDM_Document  Read(SWIGTYPE_p_Standard_IStream theIStream) {
    return new CDM_Document ( OCCwrapJavaJNI.CDF_Application_Read(swigCPtr, this, SWIGTYPE_p_Standard_IStream.getCPtr(theIStream)), true );
  }

  public SWIGTYPE_p_opencascade__handleT_PCDM_StorageDriver_t WriterFromFormat( TCollection_ExtendedString  aFormat) {
    return new SWIGTYPE_p_opencascade__handleT_PCDM_StorageDriver_t(OCCwrapJavaJNI.CDF_Application_WriterFromFormat(swigCPtr, this, TCollection_ExtendedString.getCPtr(aFormat), aFormat), true);
  }

  /**
   *  try to  retrieve a Format  directly in the  file or in
   *  application   resource  by using   extension. returns
   *  True if found;
   */
  public long Format( TCollection_ExtendedString  aFileName, TCollection_ExtendedString theFormat) {
    return OCCwrapJavaJNI.CDF_Application_Format(swigCPtr, this, TCollection_ExtendedString.getCPtr(aFileName), aFileName, TCollection_ExtendedString.getCPtr(theFormat), theFormat);
  }

  public SWIGTYPE_p_Standard_ExtString DefaultFolder() {
    return new SWIGTYPE_p_Standard_ExtString(OCCwrapJavaJNI.CDF_Application_DefaultFolder(swigCPtr, this), true);
  }

  public long SetDefaultFolder(SWIGTYPE_p_Standard_ExtString aFolder) {
    return OCCwrapJavaJNI.CDF_Application_SetDefaultFolder(swigCPtr, this, SWIGTYPE_p_Standard_ExtString.getCPtr(aFolder));
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.CDF_Application_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.CDF_Application_get_type_descriptor(), true );
  }

  public static  CDF_Application  DownCast( Standard_Transient  T) {
    return new CDF_Application ( OCCwrapJavaJNI.CDF_Application_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.CDF_Application_TypeOf(), true );
  }

}
