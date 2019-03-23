package opencascade;

/**
 *  Describes functions to build half-spaces.
 *  A half-space is an infinite solid, limited by a surface. It
 *  is built from a face or a shell, which bounds it, and with
 *  a reference point, which specifies the side of the
 *  surface where the matter of the half-space is located.
 *  A half-space is a tool commonly used in topological
 *  operations to cut another shape.
 *  A MakeHalfSpace object provides a framework for:
 *  -   defining and implementing the construction of a half-space, and
 *  -   consulting the result.
 */
public class BRepPrimAPI_MakeHalfSpace extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepPrimAPI_MakeHalfSpace(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeHalfSpace_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepPrimAPI_MakeHalfSpace(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeHalfSpace_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepPrimAPI_MakeHalfSpace obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepPrimAPI_MakeHalfSpace(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Make a HalfSpace defined with a Face and a Point.
   */
  public BRepPrimAPI_MakeHalfSpace( TopoDS_Face  Face,  gp_Pnt  RefPnt) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeHalfSpace__SWIG_0(TopoDS_Face.getCPtr(Face), Face, gp_Pnt.getCPtr(RefPnt), RefPnt), true);
  }

  /**
   *  Make a HalfSpace defined with a Shell and a Point.
   */
  public BRepPrimAPI_MakeHalfSpace( TopoDS_Shell  Shell,  gp_Pnt  RefPnt) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeHalfSpace__SWIG_1(TopoDS_Shell.getCPtr(Shell), Shell, gp_Pnt.getCPtr(RefPnt), RefPnt), true);
  }

  /**
   *  Returns the constructed half-space as a solid.
   */
  public  TopoDS_Solid  Solid() {
    TopoDS_Solid ret = new TopoDS_Solid(OCCwrapJavaJNI.BRepPrimAPI_MakeHalfSpace_Solid(swigCPtr, this), true);
    return ret;
  }

}
