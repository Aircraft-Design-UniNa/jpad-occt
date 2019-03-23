package opencascade;

/**
 *  Abstract class that can be used for attaching messages
 *  to the objects (e.g. shapes).
 *  It is used by ShapeHealing algorithms to attach a message
 *  describing encountered case (e.g. removing small edge from
 *  a wire).
 * 
 *  The methods of this class are empty and redefined, for instance,
 *  in the classes for Data Exchange processors for attaching
 *  messages to interface file entities or CAS.CADE shapes.
 */
public class ShapeExtend_BasicMsgRegistrator extends Standard_Transient {
  ShapeExtend_BasicMsgRegistrator(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor.
   */
  public ShapeExtend_BasicMsgRegistrator() {
    this(OCCwrapJavaJNI.new_ShapeExtend_BasicMsgRegistrator(), true);
  }

  /**
   *  Sends a message to be attached to the object.
   *  Object can be of any type interpreted by redefined MsgRegistrator.
   */
  public void Send( Standard_Transient  object,  Message_Msg  message, Message_Gravity gravity) {
    OCCwrapJavaJNI.ShapeExtend_BasicMsgRegistrator_Send__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(object) , object, Message_Msg.getCPtr(message), message, gravity.swigValue());
  }

  /**
   *  Sends a message to be attached to the shape.
   */
  public void Send( TopoDS_Shape  shape,  Message_Msg  message, Message_Gravity gravity) {
    OCCwrapJavaJNI.ShapeExtend_BasicMsgRegistrator_Send__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, Message_Msg.getCPtr(message), message, gravity.swigValue());
  }

  /**
   *  Calls Send method with Null Transient.
   */
  public void Send( Message_Msg  message, Message_Gravity gravity) {
    OCCwrapJavaJNI.ShapeExtend_BasicMsgRegistrator_Send__SWIG_2(swigCPtr, this, Message_Msg.getCPtr(message), message, gravity.swigValue());
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeExtend_BasicMsgRegistrator_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeExtend_BasicMsgRegistrator_get_type_descriptor(), true );
  }

  public static  ShapeExtend_BasicMsgRegistrator  DownCast( Standard_Transient  T) {
    return new ShapeExtend_BasicMsgRegistrator ( OCCwrapJavaJNI.ShapeExtend_BasicMsgRegistrator_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeExtend_BasicMsgRegistrator_TypeOf(), true );
  }

}
