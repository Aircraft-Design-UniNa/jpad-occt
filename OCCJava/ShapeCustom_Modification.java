package opencascade;

/**
 *  A base class of Modification's from ShapeCustom.
 *  Implements message sending mechanism.
 */
public class ShapeCustom_Modification extends BRepTools_Modification {
  ShapeCustom_Modification(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Sets message registrator
   */
  public void SetMsgRegistrator( ShapeExtend_BasicMsgRegistrator  msgreg) {
    OCCwrapJavaJNI.ShapeCustom_Modification_SetMsgRegistrator(swigCPtr, this,  ShapeExtend_BasicMsgRegistrator.getCPtr(msgreg) , msgreg);
  }

  public  ShapeExtend_BasicMsgRegistrator  MsgRegistrator() {
    return new ShapeExtend_BasicMsgRegistrator ( OCCwrapJavaJNI.ShapeCustom_Modification_MsgRegistrator(swigCPtr, this), true );
  }

  /**
   *  Sends a message to be attached to the shape.
   *  Calls corresponding message of message registrator.
   */
  public void SendMsg( TopoDS_Shape  shape,  Message_Msg  message, Message_Gravity gravity) {
    OCCwrapJavaJNI.ShapeCustom_Modification_SendMsg__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, Message_Msg.getCPtr(message), message, gravity.swigValue());
  }

  public void SendMsg( TopoDS_Shape  shape,  Message_Msg  message) {
    OCCwrapJavaJNI.ShapeCustom_Modification_SendMsg__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, Message_Msg.getCPtr(message), message);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeCustom_Modification_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeCustom_Modification_get_type_descriptor(), true );
  }

  public static  ShapeCustom_Modification  DownCast( Standard_Transient  T) {
    return new ShapeCustom_Modification ( OCCwrapJavaJNI.ShapeCustom_Modification_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeCustom_Modification_TypeOf(), true );
  }

}
