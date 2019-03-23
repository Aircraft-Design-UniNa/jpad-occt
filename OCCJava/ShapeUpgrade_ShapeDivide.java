package opencascade;

/**
 *  Divides a all faces in shell with given criteria Shell.
 */
public class ShapeUpgrade_ShapeDivide {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeUpgrade_ShapeDivide(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeUpgrade_ShapeDivide(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeUpgrade_ShapeDivide obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeUpgrade_ShapeDivide(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ShapeUpgrade_ShapeDivide() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_ShapeDivide__SWIG_0(), true);
  }

  /**
   *  Initialize by a Shape.
   */
  public ShapeUpgrade_ShapeDivide( TopoDS_Shape  S) {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_ShapeDivide__SWIG_1(TopoDS_Shape.getCPtr(S), S), true);
  }

  /**
   *  Initialize by a Shape.
   */
  public void Init( TopoDS_Shape  S) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivide_Init(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

  /**
   *  Defines the spatial precision used for splitting
   */
  public void SetPrecision(double Prec) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivide_SetPrecision(swigCPtr, this, Prec);
  }

  /**
   *  Sets maximal allowed tolerance
   */
  public void SetMaxTolerance(double maxtol) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivide_SetMaxTolerance(swigCPtr, this, maxtol);
  }

  /**
   *  Sets minimal allowed tolerance
   */
  public void SetMinTolerance(double mintol) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivide_SetMinTolerance(swigCPtr, this, mintol);
  }

  /**
   *  Purpose sets mode for trimming (segment) surface by
   *  wire UV bounds.
   */
  public void SetSurfaceSegmentMode(long Segment) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivide_SetSurfaceSegmentMode(swigCPtr, this, Segment);
  }

  /**
   *  Performs splitting and computes the resulting shape
   *  If newContext is True (default), the internal context
   *  will be cleared at start, else previous substitutions
   *  will be acting.
   */
  public long Perform(long newContext) {
    return OCCwrapJavaJNI.ShapeUpgrade_ShapeDivide_Perform__SWIG_0(swigCPtr, this, newContext);
  }

  public long Perform() {
    return OCCwrapJavaJNI.ShapeUpgrade_ShapeDivide_Perform__SWIG_1(swigCPtr, this);
  }

  /**
   *  Gives the resulting Shape, or Null shape if not done.
   */
  public TopoDS_Shape Result() {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeUpgrade_ShapeDivide_Result(swigCPtr, this), true);
  }

  public  ShapeBuild_ReShape  GetContext() {
    return new ShapeBuild_ReShape ( OCCwrapJavaJNI.ShapeUpgrade_ShapeDivide_GetContext(swigCPtr, this), true );
  }

  /**
   *  Sets context with recorded modifications to be applied
   *  during next call(s) to Perform(shape,Standard_False)
   */
  public void SetContext( ShapeBuild_ReShape  context) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivide_SetContext(swigCPtr, this,  ShapeBuild_ReShape.getCPtr(context) , context);
  }

  /**
   *  Sets message registrator
   */
  public void SetMsgRegistrator( ShapeExtend_BasicMsgRegistrator  msgreg) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivide_SetMsgRegistrator(swigCPtr, this,  ShapeExtend_BasicMsgRegistrator.getCPtr(msgreg) , msgreg);
  }

  public  ShapeExtend_BasicMsgRegistrator  MsgRegistrator() {
    return new ShapeExtend_BasicMsgRegistrator ( OCCwrapJavaJNI.ShapeUpgrade_ShapeDivide_MsgRegistrator(swigCPtr, this), true );
  }

  /**
   *  Sends a message to be attached to the shape.
   *  Calls corresponding message of message registrator.
   */
  public void SendMsg( TopoDS_Shape  shape,  Message_Msg  message, Message_Gravity gravity) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivide_SendMsg__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, Message_Msg.getCPtr(message), message, gravity.swigValue());
  }

  public void SendMsg( TopoDS_Shape  shape,  Message_Msg  message) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivide_SendMsg__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, Message_Msg.getCPtr(message), message);
  }

  /**
   *  Queries the status of last call to Perform
   *  OK   : no splitting was done (or no call to Perform)
   *  DONE1: some edges were splitted
   *  DONE2: surface was splitted
   *  FAIL1: some errors occured
   */
  public long Status(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeUpgrade_ShapeDivide_Status(swigCPtr, this, status.swigValue());
  }

  /**
   *  Sets the tool for splitting faces.
   */
  public void SetSplitFaceTool( ShapeUpgrade_FaceDivide  splitFaceTool) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivide_SetSplitFaceTool(swigCPtr, this,  ShapeUpgrade_FaceDivide.getCPtr(splitFaceTool) , splitFaceTool);
  }

  /**
   *  Sets mode for splitting 3d curves from edges.
   *  0 - only curve 3d from free edges.
   *  1 - only curve 3d from shared edges.
   *  2 -  all curve 3d.
   */
  public void SetEdgeMode(int aEdgeMode) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivide_SetEdgeMode(swigCPtr, this, aEdgeMode);
  }

}
