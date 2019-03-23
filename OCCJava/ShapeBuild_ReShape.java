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
 */
public class ShapeBuild_ReShape extends BRepTools_ReShape {
  ShapeBuild_ReShape(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns an empty Reshape
   */
  public ShapeBuild_ReShape() {
    this(OCCwrapJavaJNI.new_ShapeBuild_ReShape(), true);
  }

  /**
   *  Applies the substitutions requests to a shape
   * 
   *  <until> gives the level of type until which requests are taken
   *  into account. For subshapes of the type <until> no rebuild
   *  and futher exploring are done.
   *  ACTUALLY, NOT IMPLEMENTED BELOW  TopAbs_FACE
   * 
   *  <buildmode> says how to do on a SOLID,SHELL ... if one of its
   *  sub-shapes has been changed:
   *  0: at least one Replace or Remove -> COMPOUND, else as such
   *  1: at least one Remove (Replace are ignored) -> COMPOUND
   *  2: Replace and Remove are both ignored
   *  If Replace/Remove are ignored or absent, the result as same
   *  type as the starting shape
   */
  public TopoDS_Shape Apply( TopoDS_Shape  shape, TopAbs_ShapeEnum until, int buildmode) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeBuild_ReShape_Apply__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, until.swigValue(), buildmode), true);
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
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeBuild_ReShape_Apply__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, until.swigValue()), true);
  }

  public TopoDS_Shape Apply( TopoDS_Shape  shape) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeBuild_ReShape_Apply__SWIG_2(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape), true);
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
    return OCCwrapJavaJNI.ShapeBuild_ReShape_Status__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, TopoDS_Shape.getCPtr(newsh), newsh, last);
  }

  /**
   *  Queries the status of last call to Apply(shape,enum)
   *  OK   : no (sub)shapes replaced or removed
   *  DONE1: source (starting) shape replaced
   *  DONE2: source (starting) shape removed
   *  DONE3: some subshapes replaced
   *  DONE4: some subshapes removed
   *  FAIL1: some replacements not done because of bad type of subshape
   */
  public int Status( TopoDS_Shape  shape, TopoDS_Shape newsh) {
    return OCCwrapJavaJNI.ShapeBuild_ReShape_Status__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, TopoDS_Shape.getCPtr(newsh), newsh);
  }

  public long Status(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeBuild_ReShape_Status__SWIG_2(swigCPtr, this, status.swigValue());
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeBuild_ReShape_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeBuild_ReShape_get_type_descriptor(), true );
  }

  public static  ShapeBuild_ReShape  DownCast( Standard_Transient  T) {
    return new ShapeBuild_ReShape ( OCCwrapJavaJNI.ShapeBuild_ReShape_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeBuild_ReShape_TypeOf(), true );
  }

}
