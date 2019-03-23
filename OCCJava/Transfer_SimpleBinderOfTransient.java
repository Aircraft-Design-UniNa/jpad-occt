package opencascade;

/**
 *  An adapted instantiation of SimpleBinder for Transient Result,
 *  i.e. ResultType can be computed from the Result itself,
 *  instead of being static
 */
public class Transfer_SimpleBinderOfTransient extends Transfer_Binder {
  Transfer_SimpleBinderOfTransient(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates an empty SimpleBinderOfTransient
   *  Returns True if a starting object is bound with SEVERAL
   *  results : Here, returns allways False
   *  See Binder itself
   */
  public Transfer_SimpleBinderOfTransient() {
    this(OCCwrapJavaJNI.new_Transfer_SimpleBinderOfTransient(), true);
  }

  /**
   *  Defines the Result
   */
  public void SetResult( Standard_Transient  res) {
    OCCwrapJavaJNI.Transfer_SimpleBinderOfTransient_SetResult(swigCPtr, this,  Standard_Transient.getCPtr(res) , res);
  }

  public  Standard_Transient  Result() {
    return new Standard_Transient ( OCCwrapJavaJNI.Transfer_SimpleBinderOfTransient_Result(swigCPtr, this), true );
  }

  /**
   *  Returns a transient result according to its type (IsKind)
   *  i.e. the result itself if IsKind(atype), else searches in
   *  NextResult, until first found, then returns True
   *  If not found, returns False (res is NOT touched)
   * 
   *  This syntactic form avoids to do DownCast : if a result is
   *  found with the good type, it is loaded in <res> and can be
   *  immediately used, well initialised
   */
  public static long GetTypedResult( Transfer_Binder  bnd,  Standard_Type  atype,  Standard_Transient  res) {
    return OCCwrapJavaJNI.Transfer_SimpleBinderOfTransient_GetTypedResult( Transfer_Binder.getCPtr(bnd) , bnd,  Standard_Type.getCPtr(atype) , atype,  Standard_Transient.getCPtr(res) , res);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Transfer_SimpleBinderOfTransient_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Transfer_SimpleBinderOfTransient_get_type_descriptor(), true );
  }

  public static  Transfer_SimpleBinderOfTransient  DownCast( Standard_Transient  T) {
    return new Transfer_SimpleBinderOfTransient ( OCCwrapJavaJNI.Transfer_SimpleBinderOfTransient_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Transfer_SimpleBinderOfTransient_TypeOf(), true );
  }

}
