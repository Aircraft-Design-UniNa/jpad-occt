package opencascade;

/**
 *  An applicative document is an instance of a class inheriting CDM_Document.
 *  These documents have the following properties:
 *  - they can have references to other documents.
 *  - the modifications of a document are propagated to the referencing
 *  documents.
 *  - a  document can be   stored in different formats, with  or
 *  without a persistent model.
 *  - the drivers  for  storing  and retrieving documents  are
 *  plugged in when necessary.
 *  - a  document has a modification counter. This counter is
 *  incremented when the document is  modified.  When a document
 *  is stored,  the current  counter  value is memorized as the
 *  last storage  version of the   document.  A document  is
 *  considered to be  modified   when the  counter value  is
 *  different from the storage version.  Once  the document is
 *  saved  the storage  version  and the  counter  value are
 *  identical.  The document  is  now  not considered  to  be
 *  modified.
 *  - a reference is a link between two documents. A reference has two
 *  components: the "From Document" and the "To Document". When
 *  a reference is created, an identifier of the reference is generated.
 *  This identifier is unique in the scope of the From Document and
 *  is conserved during storage and retrieval. This means that the
 *  referenced document will be always accessible through this
 *  identifier.
 *  - a reference memorizes the counter value of the To Document when
 *  the reference is created. The From Document is considered to
 *  be up to date relative to the To Document when the
 *  reference counter value is equal to the To Document counter value.
 *  -  retrieval of a document  having references does not imply
 *  the retrieving of the referenced documents.
 */
public class CDM_Document extends Standard_Transient {
  CDM_Document(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
  
  public synchronized void disposeUnused() {}

  /**
   *  The Update  method  will be called  once  for each
   *  reference, but it  should not perform any computation,
   *  to avoid multiple computation of a same document.
   */
  public void Update( CDM_Document  aToDocument, int aReferenceIdentifier,  long  aModifContext) {
    OCCwrapJavaJNI.CDM_Document_Update__SWIG_0(swigCPtr, this,  CDM_Document.getCPtr(aToDocument) , aToDocument, aReferenceIdentifier,  aModifContext );
  }

  /**
   *  This method Update   will be called
   *  to signal the end   of the modified references list.
   *  The    document     should    be  recomputed     and
   *  UpdateFromDocuments  should be called.  Update should
   *  returns True in case  of success, false otherwise.  In
   *  case of Failure, additional information can be given in
   *  ErrorString.
   */
  public long Update(TCollection_ExtendedString ErrorString) {
    return OCCwrapJavaJNI.CDM_Document_Update__SWIG_1(swigCPtr, this, TCollection_ExtendedString.getCPtr(ErrorString), ErrorString);
  }

  /**
   *  The Storage Format is the key which is used to determine in the
   *  application resources the storage driver plugin, the file
   *  extension and other data used to store the document.
   */
  public TCollection_ExtendedString StorageFormat() {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.CDM_Document_StorageFormat(swigCPtr, this), true);
  }

  /**
   *  by default empties the extensions.
   */
  public void Extensions( TColStd_SequenceOfExtendedString  Extensions) {
    OCCwrapJavaJNI.CDM_Document_Extensions(swigCPtr, this, TColStd_SequenceOfExtendedString.getCPtr(Extensions), Extensions);
  }

  /**
   *  This method can be redefined to extract another document in
   *  a different format. For example, to extract a Shape
   *  from an applicative document.
   */
  public long GetAlternativeDocument( TCollection_ExtendedString  aFormat,  CDM_Document  anAlternativeDocument) {
    return OCCwrapJavaJNI.CDM_Document_GetAlternativeDocument(swigCPtr, this, TCollection_ExtendedString.getCPtr(aFormat), aFormat,  CDM_Document.getCPtr(anAlternativeDocument) , anAlternativeDocument);
  }

  /**
   *  Creates a reference from this document to {anOtherDocument}.
   *  Returns a reference identifier. This reference identifier
   *  is unique in the document and will not be used for the
   *  next references, even after the storing of the document.
   *  If there is already a reference between the two documents,
   *  the reference is not created, but its reference identifier
   *  is returned.
   */
  public int CreateReference( CDM_Document  anOtherDocument) {
    return OCCwrapJavaJNI.CDM_Document_CreateReference__SWIG_0(swigCPtr, this,  CDM_Document.getCPtr(anOtherDocument) , anOtherDocument);
  }

  /**
   *  Removes the reference between the From Document and the
   *  To Document identified by a reference identifier.
   */
  public void RemoveReference(int aReferenceIdentifier) {
    OCCwrapJavaJNI.CDM_Document_RemoveReference(swigCPtr, this, aReferenceIdentifier);
  }

  /**
   *  Removes all references having this document for From Document.
   */
  public void RemoveAllReferences() {
    OCCwrapJavaJNI.CDM_Document_RemoveAllReferences(swigCPtr, this);
  }

  public  CDM_Document  Document(int aReferenceIdentifier) {
    return new CDM_Document ( OCCwrapJavaJNI.CDM_Document_Document(swigCPtr, this, aReferenceIdentifier), true );
  }

  /**
   *  returns True if   the  To Document of the  reference
   *  identified by aReferenceIdentifier is in session,  False
   *  if it corresponds to a not yet retrieved document.
   */
  public long IsInSession(int aReferenceIdentifier) {
    return OCCwrapJavaJNI.CDM_Document_IsInSession(swigCPtr, this, aReferenceIdentifier);
  }

  /**
   *  returns True if   the  To Document of the  reference
   *  identified by aReferenceIdentifier has already been stored,
   *  False  otherwise.
   */
  public long IsStored(int aReferenceIdentifier) {
    return OCCwrapJavaJNI.CDM_Document_IsStored__SWIG_0(swigCPtr, this, aReferenceIdentifier);
  }

  /**
   *  returns the name of the metadata of the To Document of
   *  the reference identified by aReferenceIdentifier.
   */
  public TCollection_ExtendedString Name(int aReferenceIdentifier) {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.CDM_Document_Name(swigCPtr, this, aReferenceIdentifier), true);
  }

  /**
   *  call  virtual  method   Update  on  all   referencing
   *  documents.   This method keeps  the list  of the --
   *  documents  to process.It may  be the starting of an
   *  update -- cycle. If  not,  the reentrant calls made by
   *  Update  method (without argument)  will append the
   *  referencing documents to the list and call the Update method
   *  (with arguments). Only the first call to UpdateFromDocuments
   *  generate call to Update().
   */
  public void UpdateFromDocuments( long  aModifContext) {
    OCCwrapJavaJNI.CDM_Document_UpdateFromDocuments(swigCPtr, this,  aModifContext );
  }

  /**
   *  returns the number of references having this document as
   *  From Document.
   */
  public int ToReferencesNumber() {
    return OCCwrapJavaJNI.CDM_Document_ToReferencesNumber(swigCPtr, this);
  }

  /**
   *  returns the number of references having this document as
   *  To Document.
   */
  public int FromReferencesNumber() {
    return OCCwrapJavaJNI.CDM_Document_FromReferencesNumber(swigCPtr, this);
  }

  /**
   *  returns True is this document references aDocument;
   */
  public long ShallowReferences( CDM_Document  aDocument) {
    return OCCwrapJavaJNI.CDM_Document_ShallowReferences(swigCPtr, this,  CDM_Document.getCPtr(aDocument) , aDocument);
  }

  /**
   *  returns True is this document references aDocument;
   */
  public long DeepReferences( CDM_Document  aDocument) {
    return OCCwrapJavaJNI.CDM_Document_DeepReferences(swigCPtr, this,  CDM_Document.getCPtr(aDocument) , aDocument);
  }

  /**
   *  Copies a  reference  to  this document.   This  method
   *  avoid retrieval of referenced document.  The arguments
   *  are  the  original  document  and a  valid  reference
   *  identifier Returns the  local identifier.
   */
  public int CopyReference( CDM_Document  aFromDocument, int aReferenceIdentifier) {
    return OCCwrapJavaJNI.CDM_Document_CopyReference(swigCPtr, this,  CDM_Document.getCPtr(aFromDocument) , aFromDocument, aReferenceIdentifier);
  }

  /**
   *  indicates  that  this document cannot be   modified.
   */
  public long IsReadOnly() {
    return OCCwrapJavaJNI.CDM_Document_IsReadOnly__SWIG_0(swigCPtr, this);
  }

  /**
   *  indicates that the referenced document cannot be modified,
   */
  public long IsReadOnly(int aReferenceIdentifier) {
    return OCCwrapJavaJNI.CDM_Document_IsReadOnly__SWIG_1(swigCPtr, this, aReferenceIdentifier);
  }

  public void SetIsReadOnly() {
    OCCwrapJavaJNI.CDM_Document_SetIsReadOnly(swigCPtr, this);
  }

  public void UnsetIsReadOnly() {
    OCCwrapJavaJNI.CDM_Document_UnsetIsReadOnly(swigCPtr, this);
  }

  /**
   *  Indicates that this document has been modified.
   *  This method increments the modification counter.
   */
  public void Modify() {
    OCCwrapJavaJNI.CDM_Document_Modify(swigCPtr, this);
  }

  /**
   *  returns the current modification counter.
   */
  public int Modifications() {
    return OCCwrapJavaJNI.CDM_Document_Modifications(swigCPtr, this);
  }

  public void UnModify() {
    OCCwrapJavaJNI.CDM_Document_UnModify(swigCPtr, this);
  }

  /**
   *  returns true if the modification counter found in the given
   *  reference is equal to the actual modification counter of
   *  the To Document. This method is able to deal with a reference
   *  to a not retrieved document.
   */
  public long IsUpToDate(int aReferenceIdentifier) {
    return OCCwrapJavaJNI.CDM_Document_IsUpToDate(swigCPtr, this, aReferenceIdentifier);
  }

  /**
   *  Resets the modification counter in the given reference
   *  to the actual modification counter of its To Document.
   *  This method should be called after the application has updated
   *  this document.
   */
  public void SetIsUpToDate(int aReferenceIdentifier) {
    OCCwrapJavaJNI.CDM_Document_SetIsUpToDate(swigCPtr, this, aReferenceIdentifier);
  }

  /**
   *  associates a comment with this document.
   */
  public void SetComment( TCollection_ExtendedString  aComment) {
    OCCwrapJavaJNI.CDM_Document_SetComment(swigCPtr, this, TCollection_ExtendedString.getCPtr(aComment), aComment);
  }

  /**
   *  appends a comment into comments of this document.
   */
  public void AddComment( TCollection_ExtendedString  aComment) {
    OCCwrapJavaJNI.CDM_Document_AddComment(swigCPtr, this, TCollection_ExtendedString.getCPtr(aComment), aComment);
  }

  /**
   *  associates a comments with this document.
   */
  public void SetComments( TColStd_SequenceOfExtendedString  aComments) {
    OCCwrapJavaJNI.CDM_Document_SetComments(swigCPtr, this, TColStd_SequenceOfExtendedString.getCPtr(aComments), aComments);
  }

  /**
   *  returns the associated comments through <aComments>.
   *  Returns empty sequence if no comments are associated.
   */
  public void Comments( TColStd_SequenceOfExtendedString  aComments) {
    OCCwrapJavaJNI.CDM_Document_Comments(swigCPtr, this, TColStd_SequenceOfExtendedString.getCPtr(aComments), aComments);
  }

  /**
   *  returns the first of associated comments. By defaut
   *  the comment is an empty string.
   */
  public SWIGTYPE_p_Standard_ExtString Comment() {
    return new SWIGTYPE_p_Standard_ExtString(OCCwrapJavaJNI.CDM_Document_Comment(swigCPtr, this), true);
  }

  /**
   *  Returns an alphanumeric string identifying this document
   *  in a unique manner in the current process. The presentation
   *  may change when the document is stored.
   *  Tries to get the 'FileFormat`.Presentation resource
   *  This item is used to give a default presentation
   *  to the document.
   */
  public SWIGTYPE_p_Standard_ExtString Presentation() {
    return new SWIGTYPE_p_Standard_ExtString(OCCwrapJavaJNI.CDM_Document_Presentation(swigCPtr, this), true);
  }

  public static  CDM_Document  FindFromPresentation( TCollection_ExtendedString  aPresentation) {
    return new CDM_Document ( OCCwrapJavaJNI.CDM_Document_FindFromPresentation(TCollection_ExtendedString.getCPtr(aPresentation), aPresentation), true );
  }

  /**
   *  indicates whether a document having the given presentation
   *  does exist.
   */
  public static long FindPresentation( TCollection_ExtendedString  aPresentation) {
    return OCCwrapJavaJNI.CDM_Document_FindPresentation(TCollection_ExtendedString.getCPtr(aPresentation), aPresentation);
  }

  public long IsStored() {
    return OCCwrapJavaJNI.CDM_Document_IsStored__SWIG_1(swigCPtr, this);
  }

  /**
   *  returns  the value of  the modification counter at the
   *  time of storage. By default returns 0.
   */
  public int StorageVersion() {
    return OCCwrapJavaJNI.CDM_Document_StorageVersion(swigCPtr, this);
  }

  /**
   *  associates database  information to  a document which
   *  has been stored.  The name of the  document is now the
   *  name which has beenused to store the data.
   */
  public void SetMetaData( CDM_MetaData  aMetaData) {
    OCCwrapJavaJNI.CDM_Document_SetMetaData(swigCPtr, this,  CDM_MetaData.getCPtr(aMetaData) , aMetaData);
  }

  public void UnsetIsStored() {
    OCCwrapJavaJNI.CDM_Document_UnsetIsStored(swigCPtr, this);
  }

  public  CDM_MetaData  MetaData() {
    return new CDM_MetaData ( OCCwrapJavaJNI.CDM_Document_MetaData(swigCPtr, this), true );
  }

  public TCollection_ExtendedString Folder() {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.CDM_Document_Folder(swigCPtr, this), true);
  }

  /**
   *  defines the folder in which the object should be stored.
   */
  public void SetRequestedFolder( TCollection_ExtendedString  aFolder) {
    OCCwrapJavaJNI.CDM_Document_SetRequestedFolder(swigCPtr, this, TCollection_ExtendedString.getCPtr(aFolder), aFolder);
  }

  public TCollection_ExtendedString RequestedFolder() {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.CDM_Document_RequestedFolder(swigCPtr, this), true);
  }

  public long HasRequestedFolder() {
    return OCCwrapJavaJNI.CDM_Document_HasRequestedFolder(swigCPtr, this);
  }

  /**
   *  defines the name under which the object should be stored.
   */
  public void SetRequestedName( TCollection_ExtendedString  aName) {
    OCCwrapJavaJNI.CDM_Document_SetRequestedName(swigCPtr, this, TCollection_ExtendedString.getCPtr(aName), aName);
  }

  /**
   *  determines  under  which the document  is  going to be
   *  store.  By default the name of the document wil be --
   *  used.  If the document has  no name  its presentation
   *  will be used.
   */
  public TCollection_ExtendedString RequestedName() {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.CDM_Document_RequestedName(swigCPtr, this), true);
  }

  public void SetRequestedPreviousVersion( TCollection_ExtendedString  aPreviousVersion) {
    OCCwrapJavaJNI.CDM_Document_SetRequestedPreviousVersion(swigCPtr, this, TCollection_ExtendedString.getCPtr(aPreviousVersion), aPreviousVersion);
  }

  public void UnsetRequestedPreviousVersion() {
    OCCwrapJavaJNI.CDM_Document_UnsetRequestedPreviousVersion(swigCPtr, this);
  }

  public long HasRequestedPreviousVersion() {
    return OCCwrapJavaJNI.CDM_Document_HasRequestedPreviousVersion(swigCPtr, this);
  }

  public TCollection_ExtendedString RequestedPreviousVersion() {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.CDM_Document_RequestedPreviousVersion(swigCPtr, this), true);
  }

  /**
   *  defines the Comment with  which the object should be stored.
   */
  public void SetRequestedComment( TCollection_ExtendedString  aComment) {
    OCCwrapJavaJNI.CDM_Document_SetRequestedComment(swigCPtr, this, TCollection_ExtendedString.getCPtr(aComment), aComment);
  }

  public TCollection_ExtendedString RequestedComment() {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.CDM_Document_RequestedComment(swigCPtr, this), true);
  }

  /**
   *  read (or rereads) the following resource.
   */
  public void LoadResources() {
    OCCwrapJavaJNI.CDM_Document_LoadResources(swigCPtr, this);
  }

  public long FindFileExtension() {
    return OCCwrapJavaJNI.CDM_Document_FindFileExtension(swigCPtr, this);
  }

  /**
   *  gets the Desktop.Domain.Application.`FileFormat`.FileExtension resource.
   */
  public TCollection_ExtendedString FileExtension() {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.CDM_Document_FileExtension(swigCPtr, this), true);
  }

  public long FindDescription() {
    return OCCwrapJavaJNI.CDM_Document_FindDescription(swigCPtr, this);
  }

  /**
   *  gets the `FileFormat`.Description resource.
   */
  public TCollection_ExtendedString Description() {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.CDM_Document_Description(swigCPtr, this), true);
  }

  /**
   *  returns  true  if the   version is greater  than   the
   *  storage version
   */
  public long IsModified() {
    return OCCwrapJavaJNI.CDM_Document_IsModified(swigCPtr, this);
  }

  public SWIGTYPE_p_Standard_OStream Print(SWIGTYPE_p_Standard_OStream anOStream) {
    return new SWIGTYPE_p_Standard_OStream(OCCwrapJavaJNI.CDM_Document_Print(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(anOStream)), false);
  }

  public long IsOpened() {
    return OCCwrapJavaJNI.CDM_Document_IsOpened__SWIG_0(swigCPtr, this);
  }

  public void Open( CDM_Application  anApplication) {
    OCCwrapJavaJNI.CDM_Document_Open(swigCPtr, this,  CDM_Application.getCPtr(anApplication) , anApplication);
  }

  public CDM_CanCloseStatus CanClose() {
    return CDM_CanCloseStatus.swigToEnum(OCCwrapJavaJNI.CDM_Document_CanClose(swigCPtr, this));
  }

  public void Close() {
    OCCwrapJavaJNI.CDM_Document_Close(swigCPtr, this);
  }

  public  CDM_Application  Application() {
    return new CDM_Application ( OCCwrapJavaJNI.CDM_Document_Application(swigCPtr, this), true );
  }

  /**
   *  A  referenced  document  may  indicate   through  this
   *  virtual  method that it does  not allow the closing of
   *  aDocument  which  it references through  the reference
   *  aReferenceIdentifier. By default returns Standard_True;;
   */
  public long CanCloseReference( CDM_Document  aDocument, int aReferenceIdentifier) {
    return OCCwrapJavaJNI.CDM_Document_CanCloseReference(swigCPtr, this,  CDM_Document.getCPtr(aDocument) , aDocument, aReferenceIdentifier);
  }

  /**
   *  A referenced document may update its internal
   *  data structure when {aDocument} which it references
   *  through the reference {aReferenceIdentifier} is being closed.
   *  By default this method does nothing.
   */
  public void CloseReference( CDM_Document  aDocument, int aReferenceIdentifier) {
    OCCwrapJavaJNI.CDM_Document_CloseReference(swigCPtr, this,  CDM_Document.getCPtr(aDocument) , aDocument, aReferenceIdentifier);
  }

  /**
   *  returns true if  the   document corresponding to  the
   *  given   reference has    been retrieved  and  opened.
   *  Otherwise returns false. This method does not retrieve
   *  the referenced document
   */
  public long IsOpened(int aReferenceIdentifier) {
    return OCCwrapJavaJNI.CDM_Document_IsOpened__SWIG_1(swigCPtr, this, aReferenceIdentifier);
  }

  public void CreateReference( CDM_MetaData  aMetaData, int aReferenceIdentifier,  CDM_Application  anApplication, int aToDocumentVersion, long UseStorageConfiguration) {
    OCCwrapJavaJNI.CDM_Document_CreateReference__SWIG_1(swigCPtr, this,  CDM_MetaData.getCPtr(aMetaData) , aMetaData, aReferenceIdentifier,  CDM_Application.getCPtr(anApplication) , anApplication, aToDocumentVersion, UseStorageConfiguration);
  }

  public int CreateReference( CDM_MetaData  aMetaData,  CDM_Application  anApplication, int aDocumentVersion, long UseStorageConfiguration) {
    return OCCwrapJavaJNI.CDM_Document_CreateReference__SWIG_2(swigCPtr, this,  CDM_MetaData.getCPtr(aMetaData) , aMetaData,  CDM_Application.getCPtr(anApplication) , anApplication, aDocumentVersion, UseStorageConfiguration);
  }

  public int ReferenceCounter() {
    return OCCwrapJavaJNI.CDM_Document_ReferenceCounter(swigCPtr, this);
  }

  /**
   *  the following method should be used instead:
   * 
   *  Update(me:mutable; ErrorString: out ExtendedString from TCollection)
   *  returns Boolean from Standard
   */
  public void Update() {
    OCCwrapJavaJNI.CDM_Document_Update__SWIG_2(swigCPtr, this);
  }

  public SWIGTYPE_p_opencascade__handleT_CDM_Reference_t Reference(int aReferenceIdentifier) {
    return new SWIGTYPE_p_opencascade__handleT_CDM_Reference_t(OCCwrapJavaJNI.CDM_Document_Reference(swigCPtr, this, aReferenceIdentifier), true);
  }

  public void SetModifications(int Modifications) {
    OCCwrapJavaJNI.CDM_Document_SetModifications(swigCPtr, this, Modifications);
  }

  public void SetReferenceCounter(int aReferenceCounter) {
    OCCwrapJavaJNI.CDM_Document_SetReferenceCounter(swigCPtr, this, aReferenceCounter);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.CDM_Document_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.CDM_Document_get_type_descriptor(), true );
  }

  public static  CDM_Document  DownCast( Standard_Transient  T) {
    return new CDM_Document ( OCCwrapJavaJNI.CDM_Document_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.CDM_Document_TypeOf(), true );
  }

}
