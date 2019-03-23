package opencascade;

/**
 *  Describes a shape which
 *  - references an underlying shape with the potential
 *  to be given a location and an orientation
 *  - has a location for the underlying shape, giving its
 *  placement in the local coordinate system
 *  - has an orientation for the underlying shape, in
 *  terms of its geometry (as opposed to orientation in
 *  relation to other shapes).
 *  Note: A Shape is empty if it references an underlying
 *  shape which has an empty list of shapes.
 */
public class TopoDS_Shape {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TopoDS_Shape(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TopoDS_Shape(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TopoDS_Shape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (TopoDS_Shape ptr) { Ptr = ptr; }
    public TopoDS_Shape AsReference () { return Ptr; }
    public TopoDS_Shape AsCopy () { return Ptr.MakeCopy(); }
    public TopoDS_Shape Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopoDS_Shape(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a NULL Shape referring to nothing.
   */
  public TopoDS_Shape() {
    this(OCCwrapJavaJNI.new_TopoDS_Shape(), true);
  }

  /**
   *  Returns true if this shape is null. In other words, it
   *  references no underlying shape with the potential to
   *  be given a location and an orientation.
   */
  public long IsNull() {
    return OCCwrapJavaJNI.TopoDS_Shape_IsNull(swigCPtr, this);
  }

  /**
   *  Destroys the reference to the underlying shape
   *  stored in this shape. As a result, this shape becomes null.
   */
  public void Nullify() {
    OCCwrapJavaJNI.TopoDS_Shape_Nullify(swigCPtr, this);
  }

  /**
   *  Returns the shape local coordinate system.
   */
  public  TopLoc_Location  Location() {
    TopLoc_Location ret = new TopLoc_Location(OCCwrapJavaJNI.TopoDS_Shape_Location__SWIG_0(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Sets the shape local coordinate system.
   */
  public void Location( TopLoc_Location  Loc) {
    OCCwrapJavaJNI.TopoDS_Shape_Location__SWIG_1(swigCPtr, this, TopLoc_Location.getCPtr(Loc), Loc);
  }

  /**
   *  Returns a  shape  similar to <me> with   the local
   *  coordinate system set to <Loc>.
   */
  public TopoDS_Shape Located( TopLoc_Location  Loc) {
    return new TopoDS_Shape(OCCwrapJavaJNI.TopoDS_Shape_Located(swigCPtr, this, TopLoc_Location.getCPtr(Loc), Loc), true);
  }

  /**
   *  Returns the shape orientation.
   */
  public TopAbs_Orientation Orientation() {
    return TopAbs_Orientation.swigToEnum(OCCwrapJavaJNI.TopoDS_Shape_Orientation__SWIG_0(swigCPtr, this));
  }

  /**
   *  Sets the shape orientation.
   */
  public void Orientation(TopAbs_Orientation Orient) {
    OCCwrapJavaJNI.TopoDS_Shape_Orientation__SWIG_1(swigCPtr, this, Orient.swigValue());
  }

  /**
   *  Returns  a    shape  similar  to  <me>   with  the
   *  orientation set to <Or>.
   */
  public TopoDS_Shape Oriented(TopAbs_Orientation Or) {
    return new TopoDS_Shape(OCCwrapJavaJNI.TopoDS_Shape_Oriented(swigCPtr, this, Or.swigValue()), true);
  }

  /**
   *  Returns the value of the TopAbs_ShapeEnum
   *  enumeration that corresponds to this shape, for
   *  example VERTEX, EDGE, and so on.
   *  Exceptions
   *  Standard_NullObject if this shape is null.
   */
  public TopAbs_ShapeEnum ShapeType() {
    return TopAbs_ShapeEnum.swigToEnum(OCCwrapJavaJNI.TopoDS_Shape_ShapeType(swigCPtr, this));
  }

  /**
   *  Returns the free flag.
   */
  public long Free() {
    return OCCwrapJavaJNI.TopoDS_Shape_Free__SWIG_0(swigCPtr, this);
  }

  /**
   *  Sets the free flag.
   */
  public void Free(long F) {
    OCCwrapJavaJNI.TopoDS_Shape_Free__SWIG_1(swigCPtr, this, F);
  }

  /**
   *  Returns the locked flag.
   */
  public long Locked() {
    return OCCwrapJavaJNI.TopoDS_Shape_Locked__SWIG_0(swigCPtr, this);
  }

  /**
   *  Sets the locked flag.
   */
  public void Locked(long F) {
    OCCwrapJavaJNI.TopoDS_Shape_Locked__SWIG_1(swigCPtr, this, F);
  }

  /**
   *  Returns the modification flag.
   */
  public long Modified() {
    return OCCwrapJavaJNI.TopoDS_Shape_Modified__SWIG_0(swigCPtr, this);
  }

  /**
   *  Sets the modification flag.
   */
  public void Modified(long M) {
    OCCwrapJavaJNI.TopoDS_Shape_Modified__SWIG_1(swigCPtr, this, M);
  }

  /**
   *  Returns the checked flag.
   */
  public long Checked() {
    return OCCwrapJavaJNI.TopoDS_Shape_Checked__SWIG_0(swigCPtr, this);
  }

  /**
   *  Sets the checked flag.
   */
  public void Checked(long C) {
    OCCwrapJavaJNI.TopoDS_Shape_Checked__SWIG_1(swigCPtr, this, C);
  }

  /**
   *  Returns the orientability flag.
   */
  public long Orientable() {
    return OCCwrapJavaJNI.TopoDS_Shape_Orientable__SWIG_0(swigCPtr, this);
  }

  /**
   *  Sets the orientability flag.
   */
  public void Orientable(long C) {
    OCCwrapJavaJNI.TopoDS_Shape_Orientable__SWIG_1(swigCPtr, this, C);
  }

  /**
   *  Returns the closedness flag.
   */
  public long Closed() {
    return OCCwrapJavaJNI.TopoDS_Shape_Closed__SWIG_0(swigCPtr, this);
  }

  /**
   *  Sets the closedness flag.
   */
  public void Closed(long C) {
    OCCwrapJavaJNI.TopoDS_Shape_Closed__SWIG_1(swigCPtr, this, C);
  }

  /**
   *  Returns the infinity flag.
   */
  public long Infinite() {
    return OCCwrapJavaJNI.TopoDS_Shape_Infinite__SWIG_0(swigCPtr, this);
  }

  /**
   *  Sets the infinity flag.
   */
  public void Infinite(long C) {
    OCCwrapJavaJNI.TopoDS_Shape_Infinite__SWIG_1(swigCPtr, this, C);
  }

  /**
   *  Returns the convexness flag.
   */
  public long Convex() {
    return OCCwrapJavaJNI.TopoDS_Shape_Convex__SWIG_0(swigCPtr, this);
  }

  /**
   *  Sets the convexness flag.
   */
  public void Convex(long C) {
    OCCwrapJavaJNI.TopoDS_Shape_Convex__SWIG_1(swigCPtr, this, C);
  }

  /**
   *  Multiplies the Shape location by <position>.
   */
  public void Move( TopLoc_Location  position) {
    OCCwrapJavaJNI.TopoDS_Shape_Move(swigCPtr, this, TopLoc_Location.getCPtr(position), position);
  }

  /**
   *  Returns  a shape similar  to  <me> with a location
   *  multiplied  by <position>.
   */
  public TopoDS_Shape Moved( TopLoc_Location  position) {
    return new TopoDS_Shape(OCCwrapJavaJNI.TopoDS_Shape_Moved(swigCPtr, this, TopLoc_Location.getCPtr(position), position), true);
  }

  /**
   *  Reverses the orientation, using the Reverse method
   *  from the TopAbs package.
   */
  public void Reverse() {
    OCCwrapJavaJNI.TopoDS_Shape_Reverse(swigCPtr, this);
  }

  /**
   *  Returns    a shape  similar    to  <me>  with  the
   *  orientation  reversed, using  the   Reverse method
   *  from the TopAbs package.
   */
  public TopoDS_Shape Reversed() {
    return new TopoDS_Shape(OCCwrapJavaJNI.TopoDS_Shape_Reversed(swigCPtr, this), true);
  }

  /**
   *  Complements the orientation, using the  Complement
   *  method from the TopAbs package.
   */
  public void Complement() {
    OCCwrapJavaJNI.TopoDS_Shape_Complement(swigCPtr, this);
  }

  /**
   *  Returns  a   shape  similar  to   <me>   with  the
   *  orientation complemented,  using   the  Complement
   *  method from the TopAbs package.
   */
  public TopoDS_Shape Complemented() {
    return new TopoDS_Shape(OCCwrapJavaJNI.TopoDS_Shape_Complemented(swigCPtr, this), true);
  }

  /**
   *  Updates the  Shape Orientation by composition with
   *  <Orient>, using the Compose method from the TopAbs
   *  package.
   */
  public void Compose(TopAbs_Orientation Orient) {
    OCCwrapJavaJNI.TopoDS_Shape_Compose(swigCPtr, this, Orient.swigValue());
  }

  /**
   *  Returns  a  shape   similar   to  <me>   with  the
   *  orientation  composed  with <Orient>,   using  the
   *  Compose method from the TopAbs package.
   */
  public TopoDS_Shape Composed(TopAbs_Orientation Orient) {
    return new TopoDS_Shape(OCCwrapJavaJNI.TopoDS_Shape_Composed(swigCPtr, this, Orient.swigValue()), true);
  }

  /**
   *  Returns True if two shapes  are partners, i.e.  if
   *  they   share   the   same  TShape.  Locations  and
   *  Orientations may differ.
   */
  public long IsPartner( TopoDS_Shape  other) {
    return OCCwrapJavaJNI.TopoDS_Shape_IsPartner(swigCPtr, this, TopoDS_Shape.getCPtr(other), other);
  }

  /**
   *  Returns True if two shapes are same, i.e.  if they
   *  share  the  same TShape  with the same  Locations.
   *  Orientations may differ.
   */
  public long IsSame( TopoDS_Shape  other) {
    return OCCwrapJavaJNI.TopoDS_Shape_IsSame(swigCPtr, this, TopoDS_Shape.getCPtr(other), other);
  }

  /**
   *  Returns True if two shapes are equal, i.e. if they
   *  share the same TShape with  the same Locations and
   *  Orientations.
   */
  public long IsEqual( TopoDS_Shape  other) {
    return OCCwrapJavaJNI.TopoDS_Shape_IsEqual(swigCPtr, this, TopoDS_Shape.getCPtr(other), other);
  }

  /**
   *  Negation of the IsEqual method.
   */
  public long IsNotEqual( TopoDS_Shape  other) {
    return OCCwrapJavaJNI.TopoDS_Shape_IsNotEqual(swigCPtr, this, TopoDS_Shape.getCPtr(other), other);
  }

  /**
   *  Returns a hashed value  denoting <me>.  This value
   *  is in the range  1..<Upper>.  It is  computed from
   *  the  TShape  and the  Location. The Orientation is
   *  not used.
   */
  public int HashCode(int Upper) {
    return OCCwrapJavaJNI.TopoDS_Shape_HashCode(swigCPtr, this, Upper);
  }

  /**
   *  Replace   <me> by  a  new   Shape with the    same
   *  Orientation and Location and a new TShape with the
   *  same geometry and no sub-shapes.
   */
  public void EmptyCopy() {
    OCCwrapJavaJNI.TopoDS_Shape_EmptyCopy(swigCPtr, this);
  }

  /**
   *  Returns a new Shape with the  same Orientation and
   *  Location and  a new TShape  with the same geometry
   *  and no sub-shapes.
   */
  public TopoDS_Shape EmptyCopied() {
    return new TopoDS_Shape(OCCwrapJavaJNI.TopoDS_Shape_EmptyCopied(swigCPtr, this), true);
  }

}
