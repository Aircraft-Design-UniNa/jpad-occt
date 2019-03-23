package opencascade;

/**
 *  One of the most significant aspects of BRepFeat functionality is the use of local
 *  operations as opposed to global ones. In a global operation, you would first construct a
 *  form of the type you wanted in your final feature, and then remove matter so that it could
 *  fit into your initial basis object. In a local operation, however, you specify the domain of
 *  the feature construction with aspects of the shape on which the feature is being created.
 *  These semantics are expressed in terms of a member shape of the basis shape from which -
 *  or up to which - matter will be added or removed. As a result, local operations make
 *  calculations simpler and faster than global operations.
 *  In BRepFeat, the semantics of local operations define features constructed from a contour or a
 *  part of the basis shape referred to as the tool. In a SplitShape object, wires or edges of a
 *  face in the basis shape to be used as a part of the feature are cut out and projected to a plane
 *  outside or inside the basis shape. By rebuilding the initial shape incorporating the edges and
 *  the faces of the tool, protrusion or depression features can be constructed.
 */
public class BRepFeat_SplitShape extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepFeat_SplitShape(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepFeat_SplitShape_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepFeat_SplitShape(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepFeat_SplitShape_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepFeat_SplitShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepFeat_SplitShape(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Empty constructor
   */
  public BRepFeat_SplitShape() {
    this(OCCwrapJavaJNI.new_BRepFeat_SplitShape__SWIG_0(), true);
  }

  /**
   *  Creates the process  with the shape <S>.
   */
  public BRepFeat_SplitShape( TopoDS_Shape  S) {
    this(OCCwrapJavaJNI.new_BRepFeat_SplitShape__SWIG_1(TopoDS_Shape.getCPtr(S), S), true);
  }

  /**
   *  Add splitting edges or wires for whole initial shape
   *  withot additional specification edge->face, edge->edge
   *  This method puts edge on the corresponding faces from initial shape
   */
  public long Add( TopTools_SequenceOfShape  theEdges) {
    return OCCwrapJavaJNI.BRepFeat_SplitShape_Add__SWIG_0(swigCPtr, this, TopTools_SequenceOfShape.getCPtr(theEdges), theEdges);
  }

  /**
   *  Initializes the process on the shape <S>.
   */
  public void Init( TopoDS_Shape  S) {
    OCCwrapJavaJNI.BRepFeat_SplitShape_Init(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

  /**
   *  Set the flag of check internal intersections
   *  default value is True (to check)
   */
  public void SetCheckInterior(long ToCheckInterior) {
    OCCwrapJavaJNI.BRepFeat_SplitShape_SetCheckInterior(swigCPtr, this, ToCheckInterior);
  }

  /**
   *  Adds the wire <W> on the face <F>.
   *  Raises NoSuchObject  if <F> does not belong to the original shape.
   */
  public void Add( TopoDS_Wire  W,  TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepFeat_SplitShape_Add__SWIG_1(swigCPtr, this, TopoDS_Wire.getCPtr(W), W, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Adds the edge <E> on the face <F>.
   */
  public void Add( TopoDS_Edge  E,  TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepFeat_SplitShape_Add__SWIG_2(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Adds the compound <Comp> on the face <F>. The
   *  compound <Comp> must consist of edges lying on the
   *  face <F>. If edges are geometrically connected,
   *  they must be connected topologically, i.e. they
   *  must share common vertices.
   * 
   *  Raises NoSuchObject  if <F> does not belong to the original shape.
   */
  public void Add( TopoDS_Compound  Comp,  TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepFeat_SplitShape_Add__SWIG_3(swigCPtr, this, TopoDS_Compound.getCPtr(Comp), Comp, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Adds the edge <E> on the existing edge <EOn>.
   */
  public void Add( TopoDS_Edge  E,  TopoDS_Edge  EOn) {
    OCCwrapJavaJNI.BRepFeat_SplitShape_Add__SWIG_4(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, TopoDS_Edge.getCPtr(EOn), EOn);
  }

  /**
   *  Returns  the faces   which  are the  left of   the
   *  projected wires.
   */
  public  TopTools_ListOfShape  DirectLeft() {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BRepFeat_SplitShape_DirectLeft(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the faces of the "left" part on the shape.
   *  (It  is build   from  DirectLeft,  with  the faces
   *  connected to this set, and so on...).
   *  Raises NotDone if IsDone returns <Standard_False>.
   */
  public  TopTools_ListOfShape  Left() {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BRepFeat_SplitShape_Left(swigCPtr, this), false, this);
    return ret;
  }

}
