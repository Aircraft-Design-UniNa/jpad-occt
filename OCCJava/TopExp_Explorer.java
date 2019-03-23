package opencascade;

/**
 *  An Explorer is a Tool to visit  a Topological Data
 *  Structure form the TopoDS package.
 * 
 *  An Explorer is built with :
 * 
 *  * The Shape to explore.
 * 
 *  * The type of Shapes to find : e.g VERTEX, EDGE.
 *  This type cannot be SHAPE.
 * 
 *  * The type of Shapes to avoid. e.g  SHELL, EDGE.
 *  By default   this type is  SHAPE which  means no
 *  restriction on the exploration.
 * 
 *  The Explorer  visits  all the  structure   to find
 *  shapes of the   requested  type  which   are   not
 *  contained in the type to avoid.
 * 
 *  Example to find all the Faces in the Shape S :
 * 
 *  TopExp_Explorer Ex;
 *  for (Ex.Init(S,TopAbs_FACE); Ex.More(); Ex.Next()) {
 *  ProcessFace(Ex.Current());
 *  }
 * 
 *  // an other way
 *  TopExp_Explorer Ex(S,TopAbs_FACE);
 *  while (Ex.More()) {
 *  ProcessFace(Ex.Current());
 *  Ex.Next();
 *  }
 * 
 *  To find all the vertices which are not in an edge :
 * 
 *  for (Ex.Init(S,TopAbs_VERTEX,TopAbs_EDGE); ...)
 * 
 *  To  find all the faces  in   a SHELL, then all the
 *  faces not in a SHELL :
 * 
 *  TopExp_Explorer Ex1, Ex2;
 * 
 *  for (Ex1.Init(S,TopAbs_SHELL),...) {
 *  // visit all shells
 *  for (Ex2.Init(Ex1.Current(),TopAbs_FACE),...) {
 *  // visit all the faces of the current shell
 *  }
 *  }
 * 
 *  for (Ex1.Init(S,TopAbs_FACE,TopAbs_SHELL),...) {
 *  // visit all faces not in a shell
 *  }
 * 
 *  If   the type  to avoid  is   the same  or is less
 *  complex than the type to find it has no effect.
 * 
 *  For example searching edges  not in a vertex  does
 *  not make a difference.
 */
public class TopExp_Explorer {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TopExp_Explorer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TopExp_Explorer(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TopExp_Explorer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopExp_Explorer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an empty explorer, becomes usefull after Init.
   */
  public TopExp_Explorer() {
    this(OCCwrapJavaJNI.new_TopExp_Explorer__SWIG_0(), true);
  }

  /**
   *  Creates an Explorer on the Shape <S>.
   * 
   *  <ToFind> is the type of shapes to search.
   *  TopAbs_VERTEX, TopAbs_EDGE, ...
   * 
   *  <ToAvoid>   is the type   of shape to  skip in the
   *  exploration.   If   <ToAvoid>  is  equal  or  less
   *  complex than <ToFind> or if  <ToAVoid> is SHAPE it
   *  has no effect on the exploration.
   */
  public TopExp_Explorer( TopoDS_Shape  S, TopAbs_ShapeEnum ToFind, TopAbs_ShapeEnum ToAvoid) {
    this(OCCwrapJavaJNI.new_TopExp_Explorer__SWIG_1(TopoDS_Shape.getCPtr(S), S, ToFind.swigValue(), ToAvoid.swigValue()), true);
  }

  public TopExp_Explorer( TopoDS_Shape  S, TopAbs_ShapeEnum ToFind) {
    this(OCCwrapJavaJNI.new_TopExp_Explorer__SWIG_2(TopoDS_Shape.getCPtr(S), S, ToFind.swigValue()), true);
  }

  /**
   *  Resets this explorer on the shape S. It is initialized to
   *  search the shape S, for shapes of type ToFind, that
   *  are not part of a shape ToAvoid.
   *  If the shape ToAvoid is equal to TopAbs_SHAPE, or
   *  if it is the same as, or less complex than, the shape
   *  ToFind it has no effect on the search.
   */
  public void Init( TopoDS_Shape  S, TopAbs_ShapeEnum ToFind, TopAbs_ShapeEnum ToAvoid) {
    OCCwrapJavaJNI.TopExp_Explorer_Init__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, ToFind.swigValue(), ToAvoid.swigValue());
  }

  public void Init( TopoDS_Shape  S, TopAbs_ShapeEnum ToFind) {
    OCCwrapJavaJNI.TopExp_Explorer_Init__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, ToFind.swigValue());
  }

  /**
   *  Returns  True if  there are   more  shapes in  the
   *  exploration.
   */
  public long More() {
    return OCCwrapJavaJNI.TopExp_Explorer_More(swigCPtr, this);
  }

  /**
   *  Moves to the next Shape in the exploration.
   *  Exceptions
   *  Standard_NoMoreObject if there are no more shapes to explore.
   */
  public void Next() {
    OCCwrapJavaJNI.TopExp_Explorer_Next(swigCPtr, this);
  }

  /**
   *  Returns the current shape in the exploration.
   *  Exceptions
   *  Standard_NoSuchObject if this explorer has no more shapes to explore.
   */
  public  TopoDS_Shape  Current() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.TopExp_Explorer_Current(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Reinitialize  the    exploration with the original
   *  arguments.
   */
  public void ReInit() {
    OCCwrapJavaJNI.TopExp_Explorer_ReInit(swigCPtr, this);
  }

  /**
   *  Returns the current depth of the exploration. 0 is
   *  the shape to explore itself.
   */
  public int Depth() {
    return OCCwrapJavaJNI.TopExp_Explorer_Depth(swigCPtr, this);
  }

  /**
   *  Clears the content of the explorer. It will return
   *  False on More().
   */
  public void Clear() {
    OCCwrapJavaJNI.TopExp_Explorer_Clear(swigCPtr, this);
  }

  public void Destroy() {
    OCCwrapJavaJNI.TopExp_Explorer_Destroy(swigCPtr, this);
  }

}
