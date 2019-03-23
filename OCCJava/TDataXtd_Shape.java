package opencascade;

/**
 *  A Shape is associated in the framework with :
 *  a NamedShape attribute
 */
public class TDataXtd_Shape extends TDF_Attribute {
  TDataXtd_Shape(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  class methods
   *  =============
   *  try to retrieve a Shape attribute at <current> label
   *  or in  fathers  label of  <current>. Returns True  if
   *  found and set <S>.
   */
  public static long Find( TDF_Label  current,  TDataXtd_Shape  S) {
    return OCCwrapJavaJNI.TDataXtd_Shape_Find(TDF_Label.getCPtr(current), current,  TDataXtd_Shape.getCPtr(S) , S);
  }

  public static  TDataXtd_Shape  New( TDF_Label  label) {
    return new TDataXtd_Shape ( OCCwrapJavaJNI.TDataXtd_Shape_New(TDF_Label.getCPtr(label), label), true );
  }

  public static  TDataXtd_Shape  Set( TDF_Label  label,  TopoDS_Shape  shape) {
    return new TDataXtd_Shape ( OCCwrapJavaJNI.TDataXtd_Shape_Set(TDF_Label.getCPtr(label), label, TopoDS_Shape.getCPtr(shape), shape), true );
  }

  /**
   *  the Shape from  associated NamedShape attribute
   *  is returned.
   */
  public static TopoDS_Shape Get( TDF_Label  label) {
    return new TopoDS_Shape(OCCwrapJavaJNI.TDataXtd_Shape_Get(TDF_Label.getCPtr(label), label), true);
  }

  public TDataXtd_Shape() {
    this(OCCwrapJavaJNI.new_TDataXtd_Shape(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDataXtd_Shape_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataXtd_Shape_get_type_descriptor(), true );
  }

  public static Standard_GUID GetId() {
    return new Standard_GUID(OCCwrapJavaJNI.TDataXtd_Shape_GetId(), true);
  }

  public static  TDataXtd_Shape  DownCast( Standard_Transient  T) {
    return new TDataXtd_Shape ( OCCwrapJavaJNI.TDataXtd_Shape_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDataXtd_Shape_TypeOf(), true );
  }

}
