package opencascade;

/**
 *  Geometric transformation on a shape.
 *  The transformation to be applied is defined as a
 *  gp_Trsf transformation, i.e. a transformation which does
 *  not modify the underlying geometry of shapes.
 *  The transformation is applied to:
 *  -   all curves which support edges of a shape, and
 *  -   all surfaces which support its faces.
 *  A Transform object provides a framework for:
 *  -   defining the geometric transformation to be applied,
 *  -   implementing the transformation algorithm, and
 *  -   consulting the results.
 */
public class BRepBuilderAPI_Transform extends BRepBuilderAPI_ModifyShape {

  private long swigCPtr;
  BRepBuilderAPI_Transform(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_Transform_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepBuilderAPI_Transform(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_Transform_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepBuilderAPI_Transform obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepBuilderAPI_Transform(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Constructs a framework for applying the geometric
   *  transformation T to a shape. Use the function Perform
   *  to define the shape to transform.
   */
  public BRepBuilderAPI_Transform( gp_Trsf  T) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_Transform__SWIG_0(gp_Trsf.getCPtr(T), T), true);
  }

  /**
   *  Creates a transformation from the gp_Trsf <T>, and
   *  applies it to the shape <S>. If the transformation
   *  is  direct   and isometric (determinant  =  1) and
   *  <Copy> =  Standard_False,  the resulting shape  is
   *  <S> on   which  a  new  location has    been  set.
   *  Otherwise,  the   transformation is applied   on a
   *  duplication of <S>.
   */
  public BRepBuilderAPI_Transform( TopoDS_Shape  S,  gp_Trsf  T, long Copy) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_Transform__SWIG_1(TopoDS_Shape.getCPtr(S), S, gp_Trsf.getCPtr(T), T, Copy), true);
  }

  public BRepBuilderAPI_Transform( TopoDS_Shape  S,  gp_Trsf  T) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_Transform__SWIG_2(TopoDS_Shape.getCPtr(S), S, gp_Trsf.getCPtr(T), T), true);
  }

  /**
   *  pplies the geometric transformation defined at the
   *  time of construction of this framework to the shape S.
   *  - If the transformation T is direct and isometric, in
   *  other words, if the determinant of the vectorial part
   *  of T is equal to 1., and if Copy equals false (the
   *  default value), the resulting shape is the same as
   *  the original but with a new location assigned to it.
   *  -   In all other cases, the transformation is applied to a duplicate of S.
   *  Use the function Shape to access the result.
   *  Note: this framework can be reused to apply the same
   *  geometric transformation to other shapes. You only
   *  need to specify them by calling the function Perform again.
   */
  public void Perform( TopoDS_Shape  S, long Copy) {
    OCCwrapJavaJNI.BRepBuilderAPI_Transform_Perform__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, Copy);
  }

  public void Perform( TopoDS_Shape  S) {
    OCCwrapJavaJNI.BRepBuilderAPI_Transform_Perform__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

}
