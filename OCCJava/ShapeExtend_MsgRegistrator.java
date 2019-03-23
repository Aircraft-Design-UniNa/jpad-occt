package opencascade;

/**
 *  Attaches messages to the objects (generic Transient or shape).
 *  The objects of this class are transmitted to the Shape Healing
 *  algorithms so that they could collect messages occurred during
 *  processing.
 * 
 *  Messages are added to the Maps (stored as a field) that can be
 *  used, for instance, by Data Exchange processors to attach those
 *  messages to initial file entities.
 */
public class ShapeExtend_MsgRegistrator extends ShapeExtend_BasicMsgRegistrator {
  ShapeExtend_MsgRegistrator(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates an object.
   */
  public ShapeExtend_MsgRegistrator() {
    this(OCCwrapJavaJNI.new_ShapeExtend_MsgRegistrator(), true);
  }

  /**
   *  Sends a message to be attached to the object.
   *  If the object is in the map then the message is added to the
   *  list, otherwise the object is firstly added to the map.
   */
  public void Send( Standard_Transient  object,  Message_Msg  message, Message_Gravity gravity) {
    OCCwrapJavaJNI.ShapeExtend_MsgRegistrator_Send__SWIG_0(swigCPtr, this,  Standard_Transient.getCPtr(object) , object, Message_Msg.getCPtr(message), message, gravity.swigValue());
  }

  /**
   *  Sends a message to be attached to the shape.
   *  If the shape is in the map then the message is added to the
   *  list, otherwise the shape is firstly added to the map.
   */
  public void Send( TopoDS_Shape  shape,  Message_Msg  message, Message_Gravity gravity) {
    OCCwrapJavaJNI.ShapeExtend_MsgRegistrator_Send__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, Message_Msg.getCPtr(message), message, gravity.swigValue());
  }

  /**
   *  Returns a Map of objects and message list
   */
  public  ShapeExtend_DataMapOfTransientListOfMsg  MapTransient() {
    ShapeExtend_DataMapOfTransientListOfMsg ret = new ShapeExtend_DataMapOfTransientListOfMsg(OCCwrapJavaJNI.ShapeExtend_MsgRegistrator_MapTransient(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns a Map of shapes and message list
   */
  public  ShapeExtend_DataMapOfShapeListOfMsg  MapShape() {
    ShapeExtend_DataMapOfShapeListOfMsg ret = new ShapeExtend_DataMapOfShapeListOfMsg(OCCwrapJavaJNI.ShapeExtend_MsgRegistrator_MapShape(swigCPtr, this), false, this);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeExtend_MsgRegistrator_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeExtend_MsgRegistrator_get_type_descriptor(), true );
  }

  public static  ShapeExtend_MsgRegistrator  DownCast( Standard_Transient  T) {
    return new ShapeExtend_MsgRegistrator ( OCCwrapJavaJNI.ShapeExtend_MsgRegistrator_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeExtend_MsgRegistrator_TypeOf(), true );
  }

}
