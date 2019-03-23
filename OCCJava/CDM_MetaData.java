package opencascade;

public class CDM_MetaData extends Standard_Transient {
  CDM_MetaData(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static  CDM_MetaData  LookUp( TCollection_ExtendedString  aFolder,  TCollection_ExtendedString  aName,  TCollection_ExtendedString  aPath,  TCollection_ExtendedString  aFileName, long ReadOnly) {
    return new CDM_MetaData ( OCCwrapJavaJNI.CDM_MetaData_LookUp__SWIG_0(TCollection_ExtendedString.getCPtr(aFolder), aFolder, TCollection_ExtendedString.getCPtr(aName), aName, TCollection_ExtendedString.getCPtr(aPath), aPath, TCollection_ExtendedString.getCPtr(aFileName), aFileName, ReadOnly), true );
  }

  public static  CDM_MetaData  LookUp( TCollection_ExtendedString  aFolder,  TCollection_ExtendedString  aName,  TCollection_ExtendedString  aPath,  TCollection_ExtendedString  aVersion,  TCollection_ExtendedString  aFileName, long ReadOnly) {
    return new CDM_MetaData ( OCCwrapJavaJNI.CDM_MetaData_LookUp__SWIG_1(TCollection_ExtendedString.getCPtr(aFolder), aFolder, TCollection_ExtendedString.getCPtr(aName), aName, TCollection_ExtendedString.getCPtr(aPath), aPath, TCollection_ExtendedString.getCPtr(aVersion), aVersion, TCollection_ExtendedString.getCPtr(aFileName), aFileName, ReadOnly), true );
  }

  public long IsRetrieved() {
    return OCCwrapJavaJNI.CDM_MetaData_IsRetrieved(swigCPtr, this);
  }

  public  CDM_Document  Document() {
    return new CDM_Document ( OCCwrapJavaJNI.CDM_MetaData_Document(swigCPtr, this), true );
  }

  /**
   *  returns the folder in which the meta-data has to be created
   *  or has to be found.
   */
  public TCollection_ExtendedString Folder() {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.CDM_MetaData_Folder(swigCPtr, this), true);
  }

  /**
   *  returns the name under which the meta-data has to be created
   *  or has to be found.
   */
  public TCollection_ExtendedString Name() {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.CDM_MetaData_Name(swigCPtr, this), true);
  }

  /**
   *  returns the version under which the meta-data has to be found.
   *  Warning: raises NoSuchObject from Standard if no Version has been defined
   */
  public TCollection_ExtendedString Version() {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.CDM_MetaData_Version(swigCPtr, this), true);
  }

  /**
   *  indicates that the version has to be taken into account when
   *  searching the corresponding meta-data.
   */
  public long HasVersion() {
    return OCCwrapJavaJNI.CDM_MetaData_HasVersion(swigCPtr, this);
  }

  public TCollection_ExtendedString FileName() {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.CDM_MetaData_FileName(swigCPtr, this), true);
  }

  public SWIGTYPE_p_Standard_OStream Print(SWIGTYPE_p_Standard_OStream anOStream) {
    return new SWIGTYPE_p_Standard_OStream(OCCwrapJavaJNI.CDM_MetaData_Print(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(anOStream)), false);
  }

  public TCollection_ExtendedString Path() {
    return new TCollection_ExtendedString(OCCwrapJavaJNI.CDM_MetaData_Path(swigCPtr, this), true);
  }

  public void UnsetDocument() {
    OCCwrapJavaJNI.CDM_MetaData_UnsetDocument(swigCPtr, this);
  }

  public long IsReadOnly() {
    return OCCwrapJavaJNI.CDM_MetaData_IsReadOnly(swigCPtr, this);
  }

  public void SetIsReadOnly() {
    OCCwrapJavaJNI.CDM_MetaData_SetIsReadOnly(swigCPtr, this);
  }

  public void UnsetIsReadOnly() {
    OCCwrapJavaJNI.CDM_MetaData_UnsetIsReadOnly(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.CDM_MetaData_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.CDM_MetaData_get_type_descriptor(), true );
  }

  public static  CDM_MetaData  DownCast( Standard_Transient  T) {
    return new CDM_MetaData ( OCCwrapJavaJNI.CDM_MetaData_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.CDM_MetaData_TypeOf(), true );
  }

}
