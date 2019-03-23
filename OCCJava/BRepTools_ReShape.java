package opencascade;

/**
 *  Rebuilds a Shape by making pre-defined substitutions on some
 *  of its components
 * 
 *  In a first phase, it records requests to replace or remove
 *  some individual shapes
 *  For each shape, the last given request is recorded
 *  Requests may be applied "Oriented" (i.e. only to an item with
 *  the SAME orientation) or not (the orientation of replacing
 *  shape is respectful of that of the original one)
 * 
 *  Then, these requests may be applied to any shape which may
 *  contain one or more of these individual shapes
 * 
 *  Supports the 'BRepTools_History' history by method 'History'.
 */
public class BRepTools_ReShape extends Standard_Transient {
  BRepTools_ReShape(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns an empty Reshape
   */
  public BRepTools_ReShape() {
    this(OCCwrapJavaJNI.new_BRepTools_ReShape(), true);
  }

  /**
   *  Clears all substitutions requests
   */
  public void Clear() {
    OCCwrapJavaJNI.BRepTools_ReShape_Clear(swigCPtr, this);
  }

  /**
   *  Sets a request to Remove a Shape whatever the orientation
   */
  public void Remove( TopoDS_Shape  shape) {
    OCCwrapJavaJNI.BRepTools_ReShape_Remove(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape);
  }

  /**
   *  Sets a request to Replace a Shape by a new one.
   */
  public void Replace( TopoDS_Shape  shape,  TopoDS_Shape  newshape) {
    OCCwrapJavaJNI.BRepTools_ReShape_Replace(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, TopoDS_Shape.getCPtr(newshape), newshape);
  }

  /**
   *  Tells if a shape is recorded for Replace/Remove
   */
  public long IsRecorded( TopoDS_Shape  shape) {
    return OCCwrapJavaJNI.BRepTools_ReShape_IsRecorded(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape);
  }

  /**
   *  Returns the new value for an individual shape
   *  If not recorded, returns the original shape itself
   *  If to be Removed, returns a Null Shape
   *  Else, returns the replacing item
   */
  public TopoDS_Shape Value( TopoDS_Shape  shape) {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepTools_ReShape_Value(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape), true);
  }

  /**
   *  Returns a complete substitution status for a shape
   *  0  : not recorded,   <newsh> = original <shape>
   *  < 0: to be removed,  <newsh> is NULL
   *  > 0: to be replaced, <newsh> is a new item
   *  If <last> is False, returns status and new shape recorded in
   *  the map directly for the shape, if True and status > 0 then
   *  recursively searches for the last status and new shape.
   */
  public int Status( TopoDS_Shape  shape, TopoDS_Shape newsh, long last) {
    return OCCwrapJavaJNI.BRepTools_ReShape_Status__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, TopoDS_Shape.getCPtr(newsh), newsh, last);
  }

  public int Status( TopoDS_Shape  shape, TopoDS_Shape newsh) {
    return OCCwrapJavaJNI.BRepTools_ReShape_Status__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, TopoDS_Shape.getCPtr(newsh), newsh);
  }

  /**
   *  Applies the substitutions requests to a shape.
   * 
   *  <until> gives the level of type until which requests are taken
   *  into account. For subshapes of the type <until> no rebuild
   *  and futher exploring are done.
   * 
   *  NOTE: each subshape can be replaced by shape of the same type
   *  or by shape containing only shapes of that type (for
   *  example, TopoDS_Edge can be replaced by TopoDS_Edge,
   *  TopoDS_Wire or TopoDS_Compound containing TopoDS_Edges).
   *  If incompatible shape type is encountered, it is ignored
   *  and flag FAIL1 is set in Status.
   */
  public TopoDS_Shape Apply( TopoDS_Shape  shape, TopAbs_ShapeEnum until) {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepTools_ReShape_Apply__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, until.swigValue()), true);
  }

  public TopoDS_Shape Apply( TopoDS_Shape  shape) {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepTools_ReShape_Apply__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape), true);
  }

  public long[] ModeConsiderLocation() {return OCCwrapJavaJNI.BRepTools_ReShape_ModeConsiderLocation(swigCPtr, this);}

  public TopoDS_Vertex CopyVertex( TopoDS_Vertex  theV, double theTol) {
    return new TopoDS_Vertex(OCCwrapJavaJNI.BRepTools_ReShape_CopyVertex__SWIG_0(swigCPtr, this, TopoDS_Vertex.getCPtr(theV), theV, theTol), true);
  }

  public TopoDS_Vertex CopyVertex( TopoDS_Vertex  theV) {
    return new TopoDS_Vertex(OCCwrapJavaJNI.BRepTools_ReShape_CopyVertex__SWIG_1(swigCPtr, this, TopoDS_Vertex.getCPtr(theV), theV), true);
  }

  public TopoDS_Vertex CopyVertex( TopoDS_Vertex  theV,  gp_Pnt  theNewPos, double aTol) {
    return new TopoDS_Vertex(OCCwrapJavaJNI.BRepTools_ReShape_CopyVertex__SWIG_2(swigCPtr, this, TopoDS_Vertex.getCPtr(theV), theV, gp_Pnt.getCPtr(theNewPos), theNewPos, aTol), true);
  }

  public long IsNewShape( TopoDS_Shape  theShape) {
    return OCCwrapJavaJNI.BRepTools_ReShape_IsNewShape(swigCPtr, this, TopoDS_Shape.getCPtr(theShape), theShape);
  }

  public SWIGTYPE_p_opencascade__handleT_BRepTools_History_t History() {
    return new SWIGTYPE_p_opencascade__handleT_BRepTools_History_t(OCCwrapJavaJNI.BRepTools_ReShape_History(swigCPtr, this), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.BRepTools_ReShape_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepTools_ReShape_get_type_descriptor(), true );
  }

  public static  BRepTools_ReShape  DownCast( Standard_Transient  T) {
    return new BRepTools_ReShape ( OCCwrapJavaJNI.BRepTools_ReShape_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepTools_ReShape_TypeOf(), true );
  }

}
