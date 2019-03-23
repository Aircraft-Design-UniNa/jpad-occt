package opencascade;

/**
 *  Geometric transformation on a shape.
 *  The transformation to be applied is defined as a gp_GTrsf
 *  transformation. It may be:
 *  -      a transformation equivalent to a gp_Trsf transformation, the
 *  most common case: you should , however, use a BRepAPI_Transform
 *  object to perform this kind of transformation; or
 *  -      an affinity, or
 *  -      more generally, any type of point transformation which may
 *  be defined by a three row, four column matrix of transformation.
 *  In the last two cases, the underlying geometry of the
 *  following shapes may change:
 *  -      a curve which supports an edge of the shape, or
 *  -      a surface which supports a face of the shape;
 *  For example, a circle may be transformed into an ellipse when
 *  applying an affinity transformation.
 *  The transformation is applied to:
 *  -      all the curves which support edges of the shape, and
 *  -      all the surfaces which support faces of the shape.
 *  A GTransform object provides a framework for:
 *  -      defining the geometric transformation to be applied,
 *  -      implementing the transformation algorithm, and
 *  -      consulting the result.
 */
public class BRepBuilderAPI_GTransform extends BRepBuilderAPI_ModifyShape {

  private long swigCPtr;
  BRepBuilderAPI_GTransform(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_GTransform_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepBuilderAPI_GTransform(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_GTransform_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepBuilderAPI_GTransform obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepBuilderAPI_GTransform(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Constructs a framework for applying the geometric
   *  transformation T to a shape. Use the function
   *  Perform to define the shape to transform.
   */
  public BRepBuilderAPI_GTransform( gp_GTrsf  T) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_GTransform__SWIG_0(gp_GTrsf.getCPtr(T), T), true);
  }

  /**
   *  Constructs a framework for applying the geometric
   *  transformation T to a shape, and applies it to the shape S.
   *  -   If the transformation T is direct and isometric (i.e. if
   *  the determinant of the vectorial part of T is equal to
   *  1.), and if Copy equals false (default value), the
   *  resulting shape is the same as the original but with
   *  a new location assigned to it.
   *  -   In all other cases, the transformation is applied to
   *  a duplicate of S.
   *  Use the function Shape to access the result.
   *  Note: the constructed framework can be reused to
   *  apply the same geometric transformation to other
   *  shapes: just specify them with the function Perform.
   */
  public BRepBuilderAPI_GTransform( TopoDS_Shape  S,  gp_GTrsf  T, long Copy) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_GTransform__SWIG_1(TopoDS_Shape.getCPtr(S), S, gp_GTrsf.getCPtr(T), T, Copy), true);
  }

  public BRepBuilderAPI_GTransform( TopoDS_Shape  S,  gp_GTrsf  T) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_GTransform__SWIG_2(TopoDS_Shape.getCPtr(S), S, gp_GTrsf.getCPtr(T), T), true);
  }

  /**
   *  Applies the geometric transformation defined at the
   *  time of construction of this framework to the shape S.
   *  -   If the transformation T is direct and isometric (i.e. if
   *  the determinant of the vectorial part of T is equal to
   *  1.), and if Copy equals false (default value), the
   *  resulting shape is the same as the original but with
   *  a new location assigned to it.
   *  -   In all other cases, the transformation is applied to a duplicate of S.
   *  Use the function Shape to access the result.
   *  Note: this framework can be reused to apply the same
   *  geometric transformation to other shapes: just specify
   *  them by calling the function Perform again.
   */
  public void Perform( TopoDS_Shape  S, long Copy) {
    OCCwrapJavaJNI.BRepBuilderAPI_GTransform_Perform__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, Copy);
  }

  public void Perform( TopoDS_Shape  S) {
    OCCwrapJavaJNI.BRepBuilderAPI_GTransform_Perform__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

}
