package opencascade;

/**
 *  Describes functions to find the plane in which the edges
 *  of a given shape are located.
 *  A FindPlane object provides a framework for:
 *  -   extracting the edges of a given shape,
 *  -   implementing the construction algorithm, and
 *  -   consulting the result.
 */
public class BRepBuilderAPI_FindPlane {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepBuilderAPI_FindPlane(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepBuilderAPI_FindPlane(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepBuilderAPI_FindPlane obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepBuilderAPI_FindPlane(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Initializes an empty algorithm. The function Init is then used to define the shape.
   */
  public BRepBuilderAPI_FindPlane() {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_FindPlane__SWIG_0(), true);
  }

  /**
   *  Constructs the plane containing the edges of the shape S.
   *  A plane is built only if all the edges are within a distance
   *  of less than or equal to tolerance from a planar surface.
   *  This tolerance value is equal to the larger of the following two values:
   *  -   Tol, where the default value is negative, or
   *  -   the largest of the tolerance values assigned to the individual edges of S.
   *  Use the function Found to verify that a plane is built.
   *  The resulting plane is then retrieved using the function Plane.
   */
  public BRepBuilderAPI_FindPlane( TopoDS_Shape  S, double Tol) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_FindPlane__SWIG_1(TopoDS_Shape.getCPtr(S), S, Tol), true);
  }

  public BRepBuilderAPI_FindPlane( TopoDS_Shape  S) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_FindPlane__SWIG_2(TopoDS_Shape.getCPtr(S), S), true);
  }

  /**
   *  Constructs the plane containing the edges of the shape S.
   *  A plane is built only if all the edges are within a distance
   *  of less than or equal to tolerance from a planar surface.
   *  This tolerance value is equal to the larger of the following two values:
   *  -   Tol, where the default value is negative, or
   *  -   the largest of the tolerance values assigned to the individual edges of S.
   *  Use the function Found to verify that a plane is built.
   *  The resulting plane is then retrieved using the function Plane.
   */
  public void Init( TopoDS_Shape  S, double Tol) {
    OCCwrapJavaJNI.BRepBuilderAPI_FindPlane_Init__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, Tol);
  }

  public void Init( TopoDS_Shape  S) {
    OCCwrapJavaJNI.BRepBuilderAPI_FindPlane_Init__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

  /**
   *  Returns true if a plane containing the edges of the
   *  shape is found and built. Use the function Plane to consult the result.
   */
  public long Found() {
    return OCCwrapJavaJNI.BRepBuilderAPI_FindPlane_Found(swigCPtr, this);
  }

  public  Geom_Plane  Plane() {
    return new Geom_Plane ( OCCwrapJavaJNI.BRepBuilderAPI_FindPlane_Plane(swigCPtr, this), true );
  }

}
