package opencascade;

/**
 *  Duplication of a shape.
 *  A Copy object provides a framework for:
 *  -   defining the construction of a duplicate shape,
 *  -   implementing the construction algorithm, and
 *  -   consulting the result.
 */
public class BRepBuilderAPI_Copy extends BRepBuilderAPI_ModifyShape {

  private long swigCPtr;
  BRepBuilderAPI_Copy(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_Copy_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepBuilderAPI_Copy(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_Copy_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepBuilderAPI_Copy obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepBuilderAPI_Copy(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Constructs an empty copy framework. Use the function
   *  Perform to copy shapes.
   */
  public BRepBuilderAPI_Copy() {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_Copy__SWIG_0(), true);
  }

  /**
   *  Constructs a copy framework and copies the shape S.
   *  Use the function Shape to access the result.
   *  If copyMesh is True, triangulation contained in original shape will be 
   *  copied along with geometry (by default, triangulation gets lost).
   *  If copyGeom is False, only topological objects will be copied, while 
   *  geometry and triangulation will be shared with original shape.
   *  Note: the constructed framework can be reused to copy
   *  other shapes: just specify them with the function Perform.
   */
  public BRepBuilderAPI_Copy( TopoDS_Shape  S, long copyGeom, long copyMesh) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_Copy__SWIG_1(TopoDS_Shape.getCPtr(S), S, copyGeom, copyMesh), true);
  }

  public BRepBuilderAPI_Copy( TopoDS_Shape  S, long copyGeom) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_Copy__SWIG_2(TopoDS_Shape.getCPtr(S), S, copyGeom), true);
  }

  public BRepBuilderAPI_Copy( TopoDS_Shape  S) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_Copy__SWIG_3(TopoDS_Shape.getCPtr(S), S), true);
  }

  /**
   *  Copies the shape S.
   *  Use the function Shape to access the result.
   *  If copyMesh is True, triangulation contained in original shape will be 
   *  copied along with geometry (by default, triangulation gets lost).
   *  If copyGeom is False, only topological objects will be copied, while 
   *  geometry and triangulation will be shared with original shape.
   */
  public void Perform( TopoDS_Shape  S, long copyGeom, long copyMesh) {
    OCCwrapJavaJNI.BRepBuilderAPI_Copy_Perform__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, copyGeom, copyMesh);
  }

  public void Perform( TopoDS_Shape  S, long copyGeom) {
    OCCwrapJavaJNI.BRepBuilderAPI_Copy_Perform__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, copyGeom);
  }

  public void Perform( TopoDS_Shape  S) {
    OCCwrapJavaJNI.BRepBuilderAPI_Copy_Perform__SWIG_2(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

}
