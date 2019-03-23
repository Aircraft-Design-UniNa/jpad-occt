package opencascade;

/**
 *  Extends Context to handle shapes
 *  Contains map of shape-shape, and messages
 *  attached to shapes
 */
public class ShapeProcess_ShapeContext extends ShapeProcess_Context {
  ShapeProcess_ShapeContext(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public ShapeProcess_ShapeContext(String file, String seq) {
    this(OCCwrapJavaJNI.new_ShapeProcess_ShapeContext__SWIG_0(file, seq), true);
  }

  /**
   *  Initializes a tool by resource file and shape
   *  to be processed
   */
  public ShapeProcess_ShapeContext(String file) {
    this(OCCwrapJavaJNI.new_ShapeProcess_ShapeContext__SWIG_1(file), true);
  }

  public ShapeProcess_ShapeContext( TopoDS_Shape  S, String file, String seq) {
    this(OCCwrapJavaJNI.new_ShapeProcess_ShapeContext__SWIG_2(TopoDS_Shape.getCPtr(S), S, file, seq), true);
  }

  public ShapeProcess_ShapeContext( TopoDS_Shape  S, String file) {
    this(OCCwrapJavaJNI.new_ShapeProcess_ShapeContext__SWIG_3(TopoDS_Shape.getCPtr(S), S, file), true);
  }

  /**
   *  Initializes tool by a new shape and clears all results
   */
  public void Init( TopoDS_Shape  S) {
    OCCwrapJavaJNI.ShapeProcess_ShapeContext_Init(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

  /**
   *  Returns shape being processed
   */
  public  TopoDS_Shape  Shape() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.ShapeProcess_ShapeContext_Shape(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns current result
   */
  public  TopoDS_Shape  Result() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.ShapeProcess_ShapeContext_Result(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns map of replacements shape -> shape
   *  This map is not recursive
   */
  public  TopTools_DataMapOfShapeShape  Map() {
    TopTools_DataMapOfShapeShape ret = new TopTools_DataMapOfShapeShape(OCCwrapJavaJNI.ShapeProcess_ShapeContext_Map(swigCPtr, this), false, this);
    return ret;
  }

  public  ShapeExtend_MsgRegistrator  Messages() {
    return new ShapeExtend_MsgRegistrator ( OCCwrapJavaJNI.ShapeProcess_ShapeContext_Messages(swigCPtr, this), true );
  }

  public void SetDetalisation(TopAbs_ShapeEnum level) {
    OCCwrapJavaJNI.ShapeProcess_ShapeContext_SetDetalisation(swigCPtr, this, level.swigValue());
  }

  /**
   *  Set and get value for detalisation level
   *  Only shapes of types from TopoDS_COMPOUND and until
   *  specified detalisation level will be recorded in maps
   *  To cancel mapping, use TopAbs_SHAPE
   *  To force full mapping, use TopAbs_VERTEX
   *  The default level is TopAbs_FACE
   */
  public TopAbs_ShapeEnum GetDetalisation() {
    return TopAbs_ShapeEnum.swigToEnum(OCCwrapJavaJNI.ShapeProcess_ShapeContext_GetDetalisation(swigCPtr, this));
  }

  /**
   *  Sets a new result shape
   *  NOTE: this method should be used very carefully
   *  to keep consistency of modifications
   *  It is recommended to use RecordModification() methods
   *  with explicit definition of mapping from current
   *  result to a new one
   */
  public void SetResult( TopoDS_Shape  S) {
    OCCwrapJavaJNI.ShapeProcess_ShapeContext_SetResult(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

  public void RecordModification( TopTools_DataMapOfShapeShape  repl,  ShapeExtend_MsgRegistrator  msg) {
    OCCwrapJavaJNI.ShapeProcess_ShapeContext_RecordModification__SWIG_0(swigCPtr, this, TopTools_DataMapOfShapeShape.getCPtr(repl), repl,  ShapeExtend_MsgRegistrator.getCPtr(msg) , msg);
  }

  public void RecordModification( TopTools_DataMapOfShapeShape  repl) {
    OCCwrapJavaJNI.ShapeProcess_ShapeContext_RecordModification__SWIG_1(swigCPtr, this, TopTools_DataMapOfShapeShape.getCPtr(repl), repl);
  }

  public void RecordModification( ShapeBuild_ReShape  repl,  ShapeExtend_MsgRegistrator  msg) {
    OCCwrapJavaJNI.ShapeProcess_ShapeContext_RecordModification__SWIG_2(swigCPtr, this,  ShapeBuild_ReShape.getCPtr(repl) , repl,  ShapeExtend_MsgRegistrator.getCPtr(msg) , msg);
  }

  /**
   *  Records modifications and resets result accordingly
   *  NOTE: modification of resulting shape should be explicitly
   *  defined in the maps along with modifications of subshapes
   * 
   *  In the last function, sh is the shape on which Modifier
   *  was run. It can be different from the whole shape,
   *  but in that case result as a whole should be reset later
   *  either by call to SetResult(), or by another call to
   *  RecordModification() which contains mapping of current
   *  result to a new one explicitly
   */
  public void RecordModification( ShapeBuild_ReShape  repl) {
    OCCwrapJavaJNI.ShapeProcess_ShapeContext_RecordModification__SWIG_3(swigCPtr, this,  ShapeBuild_ReShape.getCPtr(repl) , repl);
  }

  public void RecordModification( TopoDS_Shape  sh,  BRepTools_Modifier  repl,  ShapeExtend_MsgRegistrator  msg) {
    OCCwrapJavaJNI.ShapeProcess_ShapeContext_RecordModification__SWIG_4(swigCPtr, this, TopoDS_Shape.getCPtr(sh), sh, BRepTools_Modifier.getCPtr(repl), repl,  ShapeExtend_MsgRegistrator.getCPtr(msg) , msg);
  }

  public void RecordModification( TopoDS_Shape  sh,  BRepTools_Modifier  repl) {
    OCCwrapJavaJNI.ShapeProcess_ShapeContext_RecordModification__SWIG_5(swigCPtr, this, TopoDS_Shape.getCPtr(sh), sh, BRepTools_Modifier.getCPtr(repl), repl);
  }

  /**
   *  Record a message for shape S
   *  Shape S should be one of subshapes of original shape
   *  (or whole one), but not one of intermediate shapes
   *  Records only if Message() is not Null
   */
  public void AddMessage( TopoDS_Shape  S,  Message_Msg  msg, Message_Gravity gravity) {
    OCCwrapJavaJNI.ShapeProcess_ShapeContext_AddMessage__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, Message_Msg.getCPtr(msg), msg, gravity.swigValue());
  }

  public void AddMessage( TopoDS_Shape  S,  Message_Msg  msg) {
    OCCwrapJavaJNI.ShapeProcess_ShapeContext_AddMessage__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, Message_Msg.getCPtr(msg), msg);
  }

  /**
   *  Get value of parameter as being of the type GeomAbs_Shape
   *  Returns False if parameter is not defined or has a wrong type
   */
  public long GetContinuity(String param, int[] val) {
    return OCCwrapJavaJNI.ShapeProcess_ShapeContext_GetContinuity(swigCPtr, this, param, val);
  }

  /**
   *  Get value of parameter as being of the type GeomAbs_Shape
   *  If parameter is not defined or does not have expected
   *  type, returns default value as specified
   */
  public GeomAbs_Shape ContinuityVal(String param, GeomAbs_Shape def) {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.ShapeProcess_ShapeContext_ContinuityVal(swigCPtr, this, param, def.swigValue()));
  }

  /**
   *  Prints statistics on Shape Processing onto the current Messenger.
   */
  public void PrintStatistics() {
    OCCwrapJavaJNI.ShapeProcess_ShapeContext_PrintStatistics(swigCPtr, this);
  }

  /**
   *  Set NonManifold flag
   */
  public void SetNonManifold(long theNonManifold) {
    OCCwrapJavaJNI.ShapeProcess_ShapeContext_SetNonManifold(swigCPtr, this, theNonManifold);
  }

  /**
   *  Get NonManifold flag
   */
  public long IsNonManifold() {
    return OCCwrapJavaJNI.ShapeProcess_ShapeContext_IsNonManifold(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeProcess_ShapeContext_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeProcess_ShapeContext_get_type_descriptor(), true );
  }

  public static  ShapeProcess_ShapeContext  DownCast( Standard_Transient  T) {
    return new ShapeProcess_ShapeContext ( OCCwrapJavaJNI.ShapeProcess_ShapeContext_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeProcess_ShapeContext_TypeOf(), true );
  }

}
