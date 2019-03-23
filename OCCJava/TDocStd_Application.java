package opencascade;

public class TDocStd_Application extends CDF_Application {
  TDocStd_Application(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Constructs the new instance and registers it in CDM_Session
   */
  public TDocStd_Application() {
    this(OCCwrapJavaJNI.new_TDocStd_Application(), true);
  }

  /**
   *  Check if meta data driver was successfully loaded
   *  by the application constructor
   */
  public long IsDriverLoaded() {
    return OCCwrapJavaJNI.TDocStd_Application_IsDriverLoaded(swigCPtr, this);
  }

  /**
   *  Returns the name of the file containing the
   *  resources of this application, for support of legacy
   *  method of loading formats data from resource files.
   * 
   *  Method DefineFormat() can be used to define all necessary
   *  parameters explicitly without actually using resource files.
   * 
   *  In a resource file, the application associates the 
   *  schema name of the document with the storage and
   *  retrieval plug-ins that are to be loaded for each
   *  document. On retrieval, the application reads the
   *  schema name in the heading of the CSF file and
   *  loads the plug-in indicated in the resource file.
   *  This plug-in instantiates the actual driver for
   *  transient-persistent conversion.
   *  Your application can bring this process into play
   *  by defining a class which inherits
   *  CDF_Application and redefines the function
   *  which returns the appropriate resources file. At
   *  this point, the function Retrieve and the class
   *  CDF_Store can be called. This allows you to
   *  deal with storage and retrieval of - as well as
   *  copying and pasting - documents.
   *  To implement a class like this, several virtual
   *  functions should be redefined. In particular, you
   *  must redefine the abstract function Resources
   *  inherited from the superclass CDM_Application.
   * 
   *  Default implementation returns empty string.
   */
  public String ResourcesName() {
    return OCCwrapJavaJNI.TDocStd_Application_ResourcesName(swigCPtr, this);
  }

  /**
   *  Sets up resources and registers read and storage drivers for
   *  the specified format.
   *  
   *  @param theFormat - unique name for the format, used to identify it.
   *  @param theDescription - textual description of the format.
   *  @param theExtension - extension of the files in that format. 
   *                        The same extension can be used by several formats.
   *  @param theReader - instance of the read driver for the format.
   *                     Null value is allowed (no possibility to read).
   *  @param theWriter - instance of the write driver for the format.
   *                     Null value is allowed (no possibility to write).
   */
  public void DefineFormat( TCollection_AsciiString  theFormat,  TCollection_AsciiString  theDescription,  TCollection_AsciiString  theExtension, SWIGTYPE_p_opencascade__handleT_PCDM_RetrievalDriver_t theReader, SWIGTYPE_p_opencascade__handleT_PCDM_StorageDriver_t theWriter) {
    OCCwrapJavaJNI.TDocStd_Application_DefineFormat(swigCPtr, this, TCollection_AsciiString.getCPtr(theFormat), theFormat, TCollection_AsciiString.getCPtr(theDescription), theDescription, TCollection_AsciiString.getCPtr(theExtension), theExtension, SWIGTYPE_p_opencascade__handleT_PCDM_RetrievalDriver_t.getCPtr(theReader), SWIGTYPE_p_opencascade__handleT_PCDM_StorageDriver_t.getCPtr(theWriter));
  }

  /**
   *  Returns the sequence of reading formats supported by the application.
   * 
   *  @param theFormats - sequence of reading formats. Output parameter.
   */
  public void ReadingFormats( TColStd_SequenceOfAsciiString  theFormats) {
    OCCwrapJavaJNI.TDocStd_Application_ReadingFormats(swigCPtr, this, TColStd_SequenceOfAsciiString.getCPtr(theFormats), theFormats);
  }

  /**
   *  Returns the sequence of writing formats supported by the application.
   * 
   *  @param theFormats - sequence of writing formats. Output parameter.
   */
  public void WritingFormats( TColStd_SequenceOfAsciiString  theFormats) {
    OCCwrapJavaJNI.TDocStd_Application_WritingFormats(swigCPtr, this, TColStd_SequenceOfAsciiString.getCPtr(theFormats), theFormats);
  }

  /**
   *  returns the number of documents handled by the current applicative session.
   */
  public int NbDocuments() {
    return OCCwrapJavaJNI.TDocStd_Application_NbDocuments(swigCPtr, this);
  }

  /**
   *  Constructs the new document aDoc.
   *  aDoc is identified by the index index which is
   *  any integer between 1 and n where n is the
   *  number of documents returned by NbDocument.
   *  Example
   *  Handle(TDocStd_Application)
   *  anApp;
   *  if (!CafTest::Find(A)) return 1;
   *  Handle(TDocStd) aDoc;
   *  Standard_Integer nbdoc = anApp->NbDocuments();
   *  for (Standard_Integer i = 1; i <= nbdoc; i++) {
   *  aApp->GetDocument(i,aDoc);
   */
  public void GetDocument(int index,  TDocStd_Document  aDoc) {
    OCCwrapJavaJNI.TDocStd_Application_GetDocument(swigCPtr, this, index,  TDocStd_Document.getCPtr(aDoc) , aDoc);
  }

  /**
   *  Constructs the empty new document aDoc.
   *  This document will have the format format.
   *  If InitDocument is redefined for a specific
   *  application, the new document is handled by the
   *  applicative session.
   */
  public void NewDocument( TCollection_ExtendedString  format,  TDocStd_Document  aDoc) {
    OCCwrapJavaJNI.TDocStd_Application_NewDocument(swigCPtr, this, TCollection_ExtendedString.getCPtr(format), format,  TDocStd_Document.getCPtr(aDoc) , aDoc);
  }

  /**
   *  Initialize the document aDoc for the applicative session.
   *  This virtual function is called by NewDocument
   *  and is to be redefined for each specific application.
   *  Modified flag (different of disk version)
   *  =============
   *  to open/save a document
   *  =======================
   */
  public void InitDocument( TDocStd_Document  aDoc) {
    OCCwrapJavaJNI.TDocStd_Application_InitDocument(swigCPtr, this,  TDocStd_Document.getCPtr(aDoc) , aDoc);
  }

  /**
   *  Close the given document. the document is not any more
   *  handled by the applicative session.
   */
  public void Close( TDocStd_Document  aDoc) {
    OCCwrapJavaJNI.TDocStd_Application_Close(swigCPtr, this,  TDocStd_Document.getCPtr(aDoc) , aDoc);
  }

  /**
   *  Returns an index for the document found in the
   *  path path in this applicative session.
   *  If the returned value is 0, the document is not
   *  present in the applicative session.
   *  This method can be used for the interactive part
   *  of an application. For instance, on a call to
   *  Open, the document to be opened may already
   *  be in memory. IsInSession checks to see if this
   *  is the case. Open can be made to depend on
   *  the value of the index returned: if IsInSession
   *  returns 0, the document is opened; if it returns
   *  another value, a message is displayed asking the
   *  user if he wants to override the version of the
   *  document in memory.
   *  Example:
   *  Standard_Integer insession = A->IsInSession(aDoc);
   *  if (insession > 0) {
   *  cout << "document " << insession << " is already in session" << endl;
   *  return 0;
   *  }
   */
  public int IsInSession( TCollection_ExtendedString  path) {
    return OCCwrapJavaJNI.TDocStd_Application_IsInSession(swigCPtr, this, TCollection_ExtendedString.getCPtr(path), path);
  }

  /**
   *  Retrieves the document aDoc stored under the
   *  name aName in the directory directory.
   *  In order not to override a version of aDoc which
   *  is already in memory, this method can be made
   *  to depend on the value returned by IsInSession.
   */
  public PCDM_ReaderStatus Open( TCollection_ExtendedString  path,  TDocStd_Document  aDoc) {
    return PCDM_ReaderStatus.swigToEnum(OCCwrapJavaJNI.TDocStd_Application_Open__SWIG_0(swigCPtr, this, TCollection_ExtendedString.getCPtr(path), path,  TDocStd_Document.getCPtr(aDoc) , aDoc));
  }

  /**
   *  Retrieves aDoc from standard SEEKABLE stream theIStream.
   *  the stream should support SEEK fuctionality
   */
  public PCDM_ReaderStatus Open(SWIGTYPE_p_Standard_IStream theIStream,  TDocStd_Document  theDoc) {
    return PCDM_ReaderStatus.swigToEnum(OCCwrapJavaJNI.TDocStd_Application_Open__SWIG_1(swigCPtr, this, SWIGTYPE_p_Standard_IStream.getCPtr(theIStream),  TDocStd_Document.getCPtr(theDoc) , theDoc));
  }

  /**
   *  Save the  active document  in the file  <name> in the
   *  path <path> ; o verwrites  the file  if  it already exists.
   */
  public PCDM_StoreStatus SaveAs( TDocStd_Document  aDoc,  TCollection_ExtendedString  path) {
    return PCDM_StoreStatus.swigToEnum(OCCwrapJavaJNI.TDocStd_Application_SaveAs__SWIG_0(swigCPtr, this,  TDocStd_Document.getCPtr(aDoc) , aDoc, TCollection_ExtendedString.getCPtr(path), path));
  }

  /**
   *  Save theDoc to standard SEEKABLE stream theOStream.
   *  the stream should support SEEK fuctionality
   */
  public PCDM_StoreStatus SaveAs( TDocStd_Document  theDoc, SWIGTYPE_p_Standard_OStream theOStream) {
    return PCDM_StoreStatus.swigToEnum(OCCwrapJavaJNI.TDocStd_Application_SaveAs__SWIG_1(swigCPtr, this,  TDocStd_Document.getCPtr(theDoc) , theDoc, SWIGTYPE_p_Standard_OStream.getCPtr(theOStream)));
  }

  /**
   *  Save aDoc active document.
   *  Exceptions:
   *  Standard_NotImplemented if the document
   *  was not retrieved in the applicative session by using Open.
   */
  public PCDM_StoreStatus Save( TDocStd_Document  aDoc) {
    return PCDM_StoreStatus.swigToEnum(OCCwrapJavaJNI.TDocStd_Application_Save__SWIG_0(swigCPtr, this,  TDocStd_Document.getCPtr(aDoc) , aDoc));
  }

  /**
   *  Save the  active document  in the file  <name> in the
   *  path <path>  .  overwrite  the file  if  it
   *  already exist.
   */
  public PCDM_StoreStatus SaveAs( TDocStd_Document  aDoc,  TCollection_ExtendedString  path, TCollection_ExtendedString theStatusMessage) {
    return PCDM_StoreStatus.swigToEnum(OCCwrapJavaJNI.TDocStd_Application_SaveAs__SWIG_2(swigCPtr, this,  TDocStd_Document.getCPtr(aDoc) , aDoc, TCollection_ExtendedString.getCPtr(path), path, TCollection_ExtendedString.getCPtr(theStatusMessage), theStatusMessage));
  }

  /**
   *  Save theDoc TO standard SEEKABLE stream theOStream.
   *  the stream should support SEEK fuctionality
   */
  public PCDM_StoreStatus SaveAs( TDocStd_Document  theDoc, SWIGTYPE_p_Standard_OStream theOStream, TCollection_ExtendedString theStatusMessage) {
    return PCDM_StoreStatus.swigToEnum(OCCwrapJavaJNI.TDocStd_Application_SaveAs__SWIG_3(swigCPtr, this,  TDocStd_Document.getCPtr(theDoc) , theDoc, SWIGTYPE_p_Standard_OStream.getCPtr(theOStream), TCollection_ExtendedString.getCPtr(theStatusMessage), theStatusMessage));
  }

  /**
   *  Save the document overwriting the previous file
   */
  public PCDM_StoreStatus Save( TDocStd_Document  aDoc, TCollection_ExtendedString theStatusMessage) {
    return PCDM_StoreStatus.swigToEnum(OCCwrapJavaJNI.TDocStd_Application_Save__SWIG_1(swigCPtr, this,  TDocStd_Document.getCPtr(aDoc) , aDoc, TCollection_ExtendedString.getCPtr(theStatusMessage), theStatusMessage));
  }

  /**
   *  Notification that is fired at each OpenTransaction event.
   */
  public void OnOpenTransaction( TDocStd_Document  theDoc) {
    OCCwrapJavaJNI.TDocStd_Application_OnOpenTransaction(swigCPtr, this,  TDocStd_Document.getCPtr(theDoc) , theDoc);
  }

  /**
   *  Notification that is fired at each CommitTransaction event.
   */
  public void OnCommitTransaction( TDocStd_Document  theDoc) {
    OCCwrapJavaJNI.TDocStd_Application_OnCommitTransaction(swigCPtr, this,  TDocStd_Document.getCPtr(theDoc) , theDoc);
  }

  /**
   *  Notification that is fired at each AbortTransaction event.
   */
  public void OnAbortTransaction( TDocStd_Document  theDoc) {
    OCCwrapJavaJNI.TDocStd_Application_OnAbortTransaction(swigCPtr, this,  TDocStd_Document.getCPtr(theDoc) , theDoc);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDocStd_Application_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDocStd_Application_get_type_descriptor(), true );
  }

  public static  TDocStd_Application  DownCast( Standard_Transient  T) {
    return new TDocStd_Application ( OCCwrapJavaJNI.TDocStd_Application_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDocStd_Application_TypeOf(), true );
  }

}
