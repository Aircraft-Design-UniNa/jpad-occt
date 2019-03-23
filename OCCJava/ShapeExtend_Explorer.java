package opencascade;

/**
 *  This class is intended to
 *  explore shapes and convert different representations
 *  (list, sequence, compound) of complex shapes. It provides tools for:
 *  - obtaining type of the shapes in context of TopoDS_Compound,
 *  - exploring shapes in context of  TopoDS_Compound,
 *  - converting different representations of shapes (list, sequence, compound).
 */
public class ShapeExtend_Explorer {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeExtend_Explorer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeExtend_Explorer(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeExtend_Explorer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeExtend_Explorer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an object Explorer
   */
  public ShapeExtend_Explorer() {
    this(OCCwrapJavaJNI.new_ShapeExtend_Explorer(), true);
  }

  /**
   *  Converts a sequence of Shapes to a Compound
   */
  public TopoDS_Shape CompoundFromSeq( TopTools_HSequenceOfShape  seqval) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeExtend_Explorer_CompoundFromSeq(swigCPtr, this,  TopTools_HSequenceOfShape.getCPtr(seqval) , seqval), true);
  }

  public  TopTools_HSequenceOfShape  SeqFromCompound( TopoDS_Shape  comp, long expcomp) {
    return new TopTools_HSequenceOfShape ( OCCwrapJavaJNI.ShapeExtend_Explorer_SeqFromCompound(swigCPtr, this, TopoDS_Shape.getCPtr(comp), comp, expcomp), true );
  }

  /**
   *  Converts a Sequence of Shapes to a List of Shapes
   *  <clear> if True (D), commands the list to start from scratch
   *  else, the list is cumulated
   */
  public void ListFromSeq( TopTools_HSequenceOfShape  seqval,  TopTools_ListOfShape  lisval, long clear) {
    OCCwrapJavaJNI.ShapeExtend_Explorer_ListFromSeq__SWIG_0(swigCPtr, this,  TopTools_HSequenceOfShape.getCPtr(seqval) , seqval, TopTools_ListOfShape.getCPtr(lisval), lisval, clear);
  }

  public void ListFromSeq( TopTools_HSequenceOfShape  seqval,  TopTools_ListOfShape  lisval) {
    OCCwrapJavaJNI.ShapeExtend_Explorer_ListFromSeq__SWIG_1(swigCPtr, this,  TopTools_HSequenceOfShape.getCPtr(seqval) , seqval, TopTools_ListOfShape.getCPtr(lisval), lisval);
  }

  public  TopTools_HSequenceOfShape  SeqFromList( TopTools_ListOfShape  lisval) {
    return new TopTools_HSequenceOfShape ( OCCwrapJavaJNI.ShapeExtend_Explorer_SeqFromList(swigCPtr, this, TopTools_ListOfShape.getCPtr(lisval), lisval), true );
  }

  /**
   *  Returns the type of a Shape: true type if <compound> is False
   *  If <compound> is True and <shape> is a Compound, iterates on
   *  its items. If all are of the same type, returns this type.
   *  Else, returns COMPOUND. If it is empty, returns SHAPE
   *  For a Null Shape, returns SHAPE
   */
  public TopAbs_ShapeEnum ShapeType( TopoDS_Shape  shape, long compound) {
    return TopAbs_ShapeEnum.swigToEnum(OCCwrapJavaJNI.ShapeExtend_Explorer_ShapeType(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, compound));
  }

  /**
   *  Builds a COMPOUND from the given shape.
   *  It explores the shape level by level, according to the
   *  <explore> argument. If <explore> is False, only COMPOUND
   *  items are explored, else all items are.
   *  The following shapes are added to resulting compound:
   *  - shapes which comply to <type>
   *  - if <type> is WIRE, considers also free edges (and makes wires)
   *  - if <type> is SHELL, considers also free faces (and makes shells)
   *  If <compound> is True, gathers items in compounds which
   *  correspond to starting COMPOUND,SOLID or SHELL containers, or
   *  items directly contained in a Compound
   */
  public TopoDS_Shape SortedCompound( TopoDS_Shape  shape, TopAbs_ShapeEnum type, long explore, long compound) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeExtend_Explorer_SortedCompound(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, type.swigValue(), explore, compound), true);
  }

  /**
   *  Dispatches starting list of shapes according to their type,
   *  to the appropriate resulting lists
   *  For each of these lists, if it is null, it is firstly created
   *  else, new items are appended to the already existing ones
   */
  public void DispatchList( TopTools_HSequenceOfShape  list,  TopTools_HSequenceOfShape  vertices,  TopTools_HSequenceOfShape  edges,  TopTools_HSequenceOfShape  wires,  TopTools_HSequenceOfShape  faces,  TopTools_HSequenceOfShape  shells,  TopTools_HSequenceOfShape  solids,  TopTools_HSequenceOfShape  compsols,  TopTools_HSequenceOfShape  compounds) {
    OCCwrapJavaJNI.ShapeExtend_Explorer_DispatchList(swigCPtr, this,  TopTools_HSequenceOfShape.getCPtr(list) , list,  TopTools_HSequenceOfShape.getCPtr(vertices) , vertices,  TopTools_HSequenceOfShape.getCPtr(edges) , edges,  TopTools_HSequenceOfShape.getCPtr(wires) , wires,  TopTools_HSequenceOfShape.getCPtr(faces) , faces,  TopTools_HSequenceOfShape.getCPtr(shells) , shells,  TopTools_HSequenceOfShape.getCPtr(solids) , solids,  TopTools_HSequenceOfShape.getCPtr(compsols) , compsols,  TopTools_HSequenceOfShape.getCPtr(compounds) , compounds);
  }

}
