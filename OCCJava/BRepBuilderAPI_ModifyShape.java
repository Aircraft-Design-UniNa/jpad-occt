package opencascade;

/**
 *  Implements   the  methods   of MakeShape for   the
 *  constant  topology modifications.  The methods are
 *  implemented  when the modification uses a Modifier
 *  from BRepTools. Some of  them have to be redefined
 *  if  the  modification is  implemented with another
 *  tool (see Transform from BRepBuilderAPI for example).
 *  The BRepBuilderAPI package provides the following
 *  frameworks to perform modifications of this sort:
 *  -   BRepBuilderAPI_Copy to produce the copy of a shape,
 *  -   BRepBuilderAPI_Transform and
 *  BRepBuilderAPI_GTransform to apply a geometric
 *  transformation to a shape,
 *  -   BRepBuilderAPI_NurbsConvert to convert the
 *  whole geometry of a shape into NURBS geometry,
 *  -   BRepOffsetAPI_DraftAngle to build a tapered shape.
 */
public class BRepBuilderAPI_ModifyShape extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepBuilderAPI_ModifyShape(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_ModifyShape_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepBuilderAPI_ModifyShape(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_ModifyShape_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepBuilderAPI_ModifyShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepBuilderAPI_ModifyShape(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Returns the modified shape corresponding to <S>.
   *  S can correspond to the entire initial shape or to its subshape.
   *  Exceptions
   *  Standard_NoSuchObject if S is not the initial shape or
   *  a subshape of the initial shape to which the
   *  transformation has been applied. Raises NoSuchObject from Standard
   *  if S is not the initial shape or a sub-shape
   *  of the initial shape.
   */
  public TopoDS_Shape ModifiedShape( TopoDS_Shape  S) {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepBuilderAPI_ModifyShape_ModifiedShape(swigCPtr, this, TopoDS_Shape.getCPtr(S), S), true);
  }

}
