package opencascade;

/**
 *  Describes functions to build wedges, i.e. boxes with inclined faces.
 *  A MakeWedge object provides a framework for:
 *  -   defining the construction of a wedge,
 *  -   implementing the construction algorithm, and
 *  -   consulting the result.
 */
public class BRepPrimAPI_MakeWedge extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepPrimAPI_MakeWedge(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeWedge_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepPrimAPI_MakeWedge(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeWedge_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepPrimAPI_MakeWedge obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepPrimAPI_MakeWedge(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Make a STEP right angular wedge. (ltx >= 0)
   */
  public BRepPrimAPI_MakeWedge(double dx, double dy, double dz, double ltx) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeWedge__SWIG_0(dx, dy, dz, ltx), true);
  }

  /**
   *  Make a STEP right angular wedge. (ltx >= 0)
   */
  public BRepPrimAPI_MakeWedge( gp_Ax2  Axes, double dx, double dy, double dz, double ltx) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeWedge__SWIG_1(gp_Ax2.getCPtr(Axes), Axes, dx, dy, dz, ltx), true);
  }

  /**
   *  Make a wedge. The face at dy is xmin,zmin xmax,zmax
   */
  public BRepPrimAPI_MakeWedge(double dx, double dy, double dz, double xmin, double zmin, double xmax, double zmax) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeWedge__SWIG_2(dx, dy, dz, xmin, zmin, xmax, zmax), true);
  }

  /**
   *  Make a wedge. The face at dy is xmin,zmin xmax,zmax
   */
  public BRepPrimAPI_MakeWedge( gp_Ax2  Axes, double dx, double dy, double dz, double xmin, double zmin, double xmax, double zmax) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeWedge__SWIG_3(gp_Ax2.getCPtr(Axes), Axes, dx, dy, dz, xmin, zmin, xmax, zmax), true);
  }

  /**
   *  Returns the internal algorithm.
   */
  public  BRepPrim_Wedge  Wedge() {
    BRepPrim_Wedge ret = new BRepPrim_Wedge(OCCwrapJavaJNI.BRepPrimAPI_MakeWedge_Wedge(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the constructed box in the form of a shell.
   */
  public  TopoDS_Shell  Shell() {
    TopoDS_Shell ret = new TopoDS_Shell(OCCwrapJavaJNI.BRepPrimAPI_MakeWedge_Shell(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the constructed box in the form of a solid.
   */
  public  TopoDS_Solid  Solid() {
    TopoDS_Solid ret = new TopoDS_Solid(OCCwrapJavaJNI.BRepPrimAPI_MakeWedge_Solid(swigCPtr, this), true);
    return ret;
  }

}
