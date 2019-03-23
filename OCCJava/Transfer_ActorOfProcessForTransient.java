package opencascade;

public class Transfer_ActorOfProcessForTransient extends Standard_Transient {
  Transfer_ActorOfProcessForTransient(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public Transfer_ActorOfProcessForTransient() {
    this(OCCwrapJavaJNI.new_Transfer_ActorOfProcessForTransient(), true);
  }

  /**
   *  Prerequesite for Transfer : the method Transfer is
   *  called on a starting object only if Recognize has
   *  returned True on it
   *  This allows to define a list of Actors, each one
   *  processing a definite kind of data
   *  TransferProcess calls Recognize on each one before
   *  calling Transfer. But even if Recognize has returned
   *  True, Transfer can reject by returning a Null Binder
   *  (afterwards rejection), the next actor is then invoked
   * 
   *  The provided default returns True, can be redefined
   */
  public long Recognize( Standard_Transient  start) {
    return OCCwrapJavaJNI.Transfer_ActorOfProcessForTransient_Recognize(swigCPtr, this,  Standard_Transient.getCPtr(start) , start);
  }

  public  Transfer_Binder  Transferring( Standard_Transient  start,  Transfer_ProcessForTransient  TP) {
    return new Transfer_Binder ( OCCwrapJavaJNI.Transfer_ActorOfProcessForTransient_Transferring(swigCPtr, this,  Standard_Transient.getCPtr(start) , start,  Transfer_ProcessForTransient.getCPtr(TP) , TP), true );
  }

  public  Transfer_SimpleBinderOfTransient  TransientResult( Standard_Transient  res) {
    return new Transfer_SimpleBinderOfTransient ( OCCwrapJavaJNI.Transfer_ActorOfProcessForTransient_TransientResult(swigCPtr, this,  Standard_Transient.getCPtr(res) , res), true );
  }

  public  Transfer_Binder  NullResult() {
    return new Transfer_Binder ( OCCwrapJavaJNI.Transfer_ActorOfProcessForTransient_NullResult(swigCPtr, this), true );
  }

  /**
   *  If <mode> is True, commands an Actor to be set at the
   *  end of the list of Actors (see SetNext)
   *  If it is False (creation default), each add Actor is
   *  set at the beginning of the list
   *  This allows to define default Actors (which are Last)
   */
  public void SetLast(long mode) {
    OCCwrapJavaJNI.Transfer_ActorOfProcessForTransient_SetLast__SWIG_0(swigCPtr, this, mode);
  }

  public void SetLast() {
    OCCwrapJavaJNI.Transfer_ActorOfProcessForTransient_SetLast__SWIG_1(swigCPtr, this);
  }

  /**
   *  Returns the Last status (see SetLast).
   */
  public long IsLast() {
    return OCCwrapJavaJNI.Transfer_ActorOfProcessForTransient_IsLast(swigCPtr, this);
  }

  /**
   *  Defines a Next Actor : it can then be asked to work if
   *  <me> produces no result for a given type of Object.
   *  If Next is already set and is not "Last", calls
   *  SetNext on it. If Next defined and "Last", the new
   *  actor is added before it in the list
   */
  public void SetNext( Transfer_ActorOfProcessForTransient  next) {
    OCCwrapJavaJNI.Transfer_ActorOfProcessForTransient_SetNext(swigCPtr, this,  Transfer_ActorOfProcessForTransient.getCPtr(next) , next);
  }

  public  Transfer_ActorOfProcessForTransient  Next() {
    return new Transfer_ActorOfProcessForTransient ( OCCwrapJavaJNI.Transfer_ActorOfProcessForTransient_Next(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Transfer_ActorOfProcessForTransient_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Transfer_ActorOfProcessForTransient_get_type_descriptor(), true );
  }

  public static  Transfer_ActorOfProcessForTransient  DownCast( Standard_Transient  T) {
    return new Transfer_ActorOfProcessForTransient ( OCCwrapJavaJNI.Transfer_ActorOfProcessForTransient_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Transfer_ActorOfProcessForTransient_TypeOf(), true );
  }

}
