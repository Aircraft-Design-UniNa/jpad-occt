package opencascade;

/**
 *  Root class for fixing operations
 *  Provides context for recording changes (optional),
 *  basic precision value and limit (minimal and
 *  maximal) values for tolerances,
 *  and message registrator
 */
public class ShapeFix_Root extends Standard_Transient {
  ShapeFix_Root(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty Constructor (no context is created)
   */
  public ShapeFix_Root() {
    this(OCCwrapJavaJNI.new_ShapeFix_Root(), true);
  }

  /**
   *  Copy all fields from another Root object
   */
  public void Set( ShapeFix_Root  Root) {
    OCCwrapJavaJNI.ShapeFix_Root_Set(swigCPtr, this,  ShapeFix_Root.getCPtr(Root) , Root);
  }

  /**
   *  Sets context
   */
  public void SetContext( ShapeBuild_ReShape  context) {
    OCCwrapJavaJNI.ShapeFix_Root_SetContext(swigCPtr, this,  ShapeBuild_ReShape.getCPtr(context) , context);
  }

  public  ShapeBuild_ReShape  Context() {
    return new ShapeBuild_ReShape ( OCCwrapJavaJNI.ShapeFix_Root_Context(swigCPtr, this), true );
  }

  /**
   *  Sets message registrator
   */
  public void SetMsgRegistrator( ShapeExtend_BasicMsgRegistrator  msgreg) {
    OCCwrapJavaJNI.ShapeFix_Root_SetMsgRegistrator(swigCPtr, this,  ShapeExtend_BasicMsgRegistrator.getCPtr(msgreg) , msgreg);
  }

  public  ShapeExtend_BasicMsgRegistrator  MsgRegistrator() {
    return new ShapeExtend_BasicMsgRegistrator ( OCCwrapJavaJNI.ShapeFix_Root_MsgRegistrator(swigCPtr, this), true );
  }

  /**
   *  Sets basic precision value
   */
  public void SetPrecision(double preci) {
    OCCwrapJavaJNI.ShapeFix_Root_SetPrecision(swigCPtr, this, preci);
  }

  /**
   *  Returns basic precision value
   */
  public double Precision() {
    return OCCwrapJavaJNI.ShapeFix_Root_Precision(swigCPtr, this);
  }

  /**
   *  Sets minimal allowed tolerance
   */
  public void SetMinTolerance(double mintol) {
    OCCwrapJavaJNI.ShapeFix_Root_SetMinTolerance(swigCPtr, this, mintol);
  }

  /**
   *  Returns minimal allowed tolerance
   */
  public double MinTolerance() {
    return OCCwrapJavaJNI.ShapeFix_Root_MinTolerance(swigCPtr, this);
  }

  /**
   *  Sets maximal allowed tolerance
   */
  public void SetMaxTolerance(double maxtol) {
    OCCwrapJavaJNI.ShapeFix_Root_SetMaxTolerance(swigCPtr, this, maxtol);
  }

  /**
   *  Returns maximal allowed tolerance
   */
  public double MaxTolerance() {
    return OCCwrapJavaJNI.ShapeFix_Root_MaxTolerance(swigCPtr, this);
  }

  /**
   *  Returns tolerance limited by [myMinTol,myMaxTol]
   */
  public double LimitTolerance(double toler) {
    return OCCwrapJavaJNI.ShapeFix_Root_LimitTolerance(swigCPtr, this, toler);
  }

  /**
   *  Sends a message to be attached to the shape.
   *  Calls corresponding message of message registrator.
   */
  public void SendMsg( TopoDS_Shape  shape,  Message_Msg  message, Message_Gravity gravity) {
    OCCwrapJavaJNI.ShapeFix_Root_SendMsg__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, Message_Msg.getCPtr(message), message, gravity.swigValue());
  }

  /**
   *  Sends a message to be attached to myShape.
   *  Calls previous method.
   */
  public void SendMsg( TopoDS_Shape  shape,  Message_Msg  message) {
    OCCwrapJavaJNI.ShapeFix_Root_SendMsg__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, Message_Msg.getCPtr(message), message);
  }

  public void SendMsg( Message_Msg  message, Message_Gravity gravity) {
    OCCwrapJavaJNI.ShapeFix_Root_SendMsg__SWIG_2(swigCPtr, this, Message_Msg.getCPtr(message), message, gravity.swigValue());
  }

  public void SendMsg( Message_Msg  message) {
    OCCwrapJavaJNI.ShapeFix_Root_SendMsg__SWIG_3(swigCPtr, this, Message_Msg.getCPtr(message), message);
  }

  /**
   *  Sends a warning to be attached to the shape.
   *  Calls SendMsg with gravity set to Message_Warning.
   */
  public void SendWarning( TopoDS_Shape  shape,  Message_Msg  message) {
    OCCwrapJavaJNI.ShapeFix_Root_SendWarning__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, Message_Msg.getCPtr(message), message);
  }

  /**
   *  Calls previous method for myShape.
   */
  public void SendWarning( Message_Msg  message) {
    OCCwrapJavaJNI.ShapeFix_Root_SendWarning__SWIG_1(swigCPtr, this, Message_Msg.getCPtr(message), message);
  }

  /**
   *  Sends a fail to be attached to the shape.
   *  Calls SendMsg with gravity set to Message_Fail.
   */
  public void SendFail( TopoDS_Shape  shape,  Message_Msg  message) {
    OCCwrapJavaJNI.ShapeFix_Root_SendFail__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, Message_Msg.getCPtr(message), message);
  }

  /**
   *  Calls previous method for myShape.
   */
  public void SendFail( Message_Msg  message) {
    OCCwrapJavaJNI.ShapeFix_Root_SendFail__SWIG_1(swigCPtr, this, Message_Msg.getCPtr(message), message);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeFix_Root_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_Root_get_type_descriptor(), true );
  }

  public static  ShapeFix_Root  DownCast( Standard_Transient  T) {
    return new ShapeFix_Root ( OCCwrapJavaJNI.ShapeFix_Root_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_Root_TypeOf(), true );
  }

}
