package opencascade;

/**
 *  Associates a directory in the data framework with
 *  a TDataStd_TagSource attribute.
 *  You can create a new directory label and add
 *  sub-directory or object labels to it,
 */
public class TDataStd_Directory extends TDF_Attribute {
  TDataStd_Directory(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  class methods
   *  =============
   *  Searches for a directory attribute on the label
   *  current, or on one of the father labels of current.
   *  If a directory attribute is found, true is returned,
   *  and the attribute found is set as D.
   */
  public static long Find( TDF_Label  current,  TDataStd_Directory  D) {
    return OCCwrapJavaJNI.TDataStd_Directory_Find(TDF_Label.getCPtr(current), current,  TDataStd_Directory.getCPtr(D) , D);
  }

  public static  TDataStd_Directory  New( TDF_Label  label) {
    return new TDataStd_Directory ( OCCwrapJavaJNI.TDataStd_Directory_New(TDF_Label.getCPtr(label), label), true );
  }

  public static  TDataStd_Directory  AddDirectory( TDataStd_Directory  dir) {
    return new TDataStd_Directory ( OCCwrapJavaJNI.TDataStd_Directory_AddDirectory( TDataStd_Directory.getCPtr(dir) , dir), true );
  }

  /**
   *  Makes new label and returns it to insert
   *  other object attributes (sketch,part...etc...)
   */
  public static TDF_Label MakeObjectLabel( TDataStd_Directory  dir) {
    return new TDF_Label(OCCwrapJavaJNI.TDataStd_Directory_MakeObjectLabel( TDataStd_Directory.getCPtr(dir) , dir), true);
  }

  public TDataStd_Directory() {
    this(OCCwrapJavaJNI.new_TDataStd_Directory(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataStd_Directory_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_Directory_get_type_descriptor(), true );
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataStd_Directory_GetId(), true);
  }

  public static  TDataStd_Directory  DownCast( Standard_Transient  T) {
    return new TDataStd_Directory ( OCCwrapJavaJNI.TDataStd_Directory_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataStd_Directory_TypeOf(), true );
  }

}
