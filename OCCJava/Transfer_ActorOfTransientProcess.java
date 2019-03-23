package opencascade;

/**
 *  The original class was renamed. Compatibility only
 */
public class Transfer_ActorOfTransientProcess extends Transfer_ActorOfProcessForTransient {
  Transfer_ActorOfTransientProcess(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public Transfer_ActorOfTransientProcess() {
    this(OCCwrapJavaJNI.new_Transfer_ActorOfTransientProcess(), true);
  }

  public  Transfer_Binder  Transfer( Standard_Transient  start,  Transfer_TransientProcess  TP) {
    return new Transfer_Binder ( OCCwrapJavaJNI.Transfer_ActorOfTransientProcess_Transfer(swigCPtr, this,  Standard_Transient.getCPtr(start) , start,  Transfer_TransientProcess.getCPtr(TP) , TP), true );
  }

  public  Standard_Transient  TransferTransient( Standard_Transient  start,  Transfer_TransientProcess  TP) {
    return new Standard_Transient ( OCCwrapJavaJNI.Transfer_ActorOfTransientProcess_TransferTransient(swigCPtr, this,  Standard_Transient.getCPtr(start) , start,  Transfer_TransientProcess.getCPtr(TP) , TP), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Transfer_ActorOfTransientProcess_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Transfer_ActorOfTransientProcess_get_type_descriptor(), true );
  }

  public static  Transfer_ActorOfTransientProcess  DownCast( Standard_Transient  T) {
    return new Transfer_ActorOfTransientProcess ( OCCwrapJavaJNI.Transfer_ActorOfTransientProcess_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Transfer_ActorOfTransientProcess_TypeOf(), true );
  }

}
