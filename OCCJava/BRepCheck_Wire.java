package opencascade;

public class BRepCheck_Wire extends BRepCheck_Result {
  BRepCheck_Wire(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public BRepCheck_Wire( TopoDS_Wire  W) {
    this(OCCwrapJavaJNI.new_BRepCheck_Wire(TopoDS_Wire.getCPtr(W), W), true);
  }

  /**
   *  Checks if the  oriented  edges of the wire  give a
   *  closed  wire.   If the  wire   is closed,  returns
   *  BRepCheck_NoError.    Warning :  if the first  and
   *  last  edge   are  infinite,   the  wire   will  be
   *  considered as a closed one.  If <Update> is set to
   *  Standard_True, registers the status in the list.
   *  May return (and registers):
   *  **BRepCheck_NotConnected,   if    wire    is   not
   *  topologically closed
   *  **BRepCheck_RedundantEdge, if an  edge  is in wire
   *  more than 3 times  or  in  case of 2 occurences if
   *  not with FORWARD and REVERSED orientation.
   *  **BRepCheck_NoError
   */
  public BRepCheck_Status Closed(long Update) {
    return BRepCheck_Status.swigToEnum(OCCwrapJavaJNI.BRepCheck_Wire_Closed__SWIG_0(swigCPtr, this, Update));
  }

  public BRepCheck_Status Closed() {
    return BRepCheck_Status.swigToEnum(OCCwrapJavaJNI.BRepCheck_Wire_Closed__SWIG_1(swigCPtr, this));
  }

  /**
   *  Checks if edges of the  wire give a wire closed in
   *  2d space.
   *  Returns BRepCheck_NoError,  or BRepCheck_NotClosed
   *  If <Update> is set to Standard_True, registers the
   *  status in the list.
   */
  public BRepCheck_Status Closed2d( TopoDS_Face  F, long Update) {
    return BRepCheck_Status.swigToEnum(OCCwrapJavaJNI.BRepCheck_Wire_Closed2d__SWIG_0(swigCPtr, this, TopoDS_Face.getCPtr(F), F, Update));
  }

  public BRepCheck_Status Closed2d( TopoDS_Face  F) {
    return BRepCheck_Status.swigToEnum(OCCwrapJavaJNI.BRepCheck_Wire_Closed2d__SWIG_1(swigCPtr, this, TopoDS_Face.getCPtr(F), F));
  }

  /**
   *  Checks   if  the oriented edges   of  the wire are
   *  correctly oriented.  An  internal call is made  to
   *  the  method Closed.   If no face  exists, call the
   *  method with   a  null  face  (TopoDS_face()).   If
   *  <Update> is  set  to Standard_True,  registers the
   *  status in the list.
   *  May return (and registers):
   *  BRepCheck_InvalidDegeneratedFlag,
   *  BRepCheck_BadOrientationOfSubshape,
   *  BRepCheck_NotClosed,
   *  BRepCheck_NoError
   */
  public BRepCheck_Status Orientation( TopoDS_Face  F, long Update) {
    return BRepCheck_Status.swigToEnum(OCCwrapJavaJNI.BRepCheck_Wire_Orientation__SWIG_0(swigCPtr, this, TopoDS_Face.getCPtr(F), F, Update));
  }

  public BRepCheck_Status Orientation( TopoDS_Face  F) {
    return BRepCheck_Status.swigToEnum(OCCwrapJavaJNI.BRepCheck_Wire_Orientation__SWIG_1(swigCPtr, this, TopoDS_Face.getCPtr(F), F));
  }

  /**
   *  Checks if  the wire intersect   itself on the face
   *  <F>.  <E1>  and <E2>   are the first  intersecting
   *  edges  found.  <E2>  may  be a  null  edge when  a
   *  self-intersecting edge is found.If <Update> is set
   *  to Standard_True,   registers  the  status in  the
   *  list.
   *  May return (and register):
   *  BRepCheck_EmptyWire,
   *  BRepCheck_SelfIntersectingWire,
   *  BRepCheck_NoCurveOnSurface,
   *  BRepCheck_NoError
   */
  public BRepCheck_Status SelfIntersect( TopoDS_Face  F, TopoDS_Edge E1, TopoDS_Edge E2, long Update) {
    return BRepCheck_Status.swigToEnum(OCCwrapJavaJNI.BRepCheck_Wire_SelfIntersect__SWIG_0(swigCPtr, this, TopoDS_Face.getCPtr(F), F, TopoDS_Edge.getCPtr(E1), E1, TopoDS_Edge.getCPtr(E2), E2, Update));
  }

  public BRepCheck_Status SelfIntersect( TopoDS_Face  F, TopoDS_Edge E1, TopoDS_Edge E2) {
    return BRepCheck_Status.swigToEnum(OCCwrapJavaJNI.BRepCheck_Wire_SelfIntersect__SWIG_1(swigCPtr, this, TopoDS_Face.getCPtr(F), F, TopoDS_Edge.getCPtr(E1), E1, TopoDS_Edge.getCPtr(E2), E2));
  }

  /**
   *  report SelfIntersect() check would be (is) done
   */
  public long GeometricControls() {
    return OCCwrapJavaJNI.BRepCheck_Wire_GeometricControls__SWIG_0(swigCPtr, this);
  }

  /**
   *  set SelfIntersect() to be checked
   */
  public void GeometricControls(long B) {
    OCCwrapJavaJNI.BRepCheck_Wire_GeometricControls__SWIG_1(swigCPtr, this, B);
  }

  /**
   *  Sets status of Wire;
   */
  public void SetStatus(BRepCheck_Status theStatus) {
    OCCwrapJavaJNI.BRepCheck_Wire_SetStatus(swigCPtr, this, theStatus.swigValue());
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.BRepCheck_Wire_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepCheck_Wire_get_type_descriptor(), true );
  }

  public static  BRepCheck_Wire  DownCast( Standard_Transient  T) {
    return new BRepCheck_Wire ( OCCwrapJavaJNI.BRepCheck_Wire_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepCheck_Wire_TypeOf(), true );
  }

}
