package opencascade;

/**
 *  Describes functions to build parallelepiped boxes.
 *  A MakeBox object provides a framework for:
 *  -   defining the construction of a box,
 *  -   implementing the construction algorithm, and
 *  -   consulting the result.
 */
public class BRepPrimAPI_MakeBox extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepPrimAPI_MakeBox(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeBox_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepPrimAPI_MakeBox(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeBox_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepPrimAPI_MakeBox obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepPrimAPI_MakeBox(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Make a box with a corner at 0,0,0 and the other dx,dy,dz
   */
  public BRepPrimAPI_MakeBox(double dx, double dy, double dz) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeBox__SWIG_0(dx, dy, dz), true);
  }

  /**
   *  Make a box with a corner at P and size dx, dy, dz.
   */
  public BRepPrimAPI_MakeBox( gp_Pnt  P, double dx, double dy, double dz) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeBox__SWIG_1(gp_Pnt.getCPtr(P), P, dx, dy, dz), true);
  }

  /**
   *  Make a box with corners P1,P2.
   */
  public BRepPrimAPI_MakeBox( gp_Pnt  P1,  gp_Pnt  P2) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeBox__SWIG_2(gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

  /**
   *  Ax2 is the left corner and the axis.
   *  Constructs a box such that its sides are parallel to the axes of
   *  -   the global coordinate system, or
   *  -   the local coordinate system Axis. and
   *  -   with a corner at (0, 0, 0) and of size (dx, dy, dz), or
   *  -   with a corner at point P and of size (dx, dy, dz), or
   *  -   with corners at points P1 and P2.
   *  Exceptions
   *  Standard_DomainError if: dx, dy, dz are less than or equal to
   *  Precision::Confusion(), or
   *  -   the vector joining the points P1 and P2 has a
   *  component projected onto the global coordinate
   *  system less than or equal to Precision::Confusion().
   *  In these cases, the box would be flat.
   */
  public BRepPrimAPI_MakeBox( gp_Ax2  Axes, double dx, double dy, double dz) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeBox__SWIG_3(gp_Ax2.getCPtr(Axes), Axes, dx, dy, dz), true);
  }

  /**
   *  Returns the internal algorithm.
   */
  public  BRepPrim_Wedge  Wedge() {
    BRepPrim_Wedge ret = new BRepPrim_Wedge(OCCwrapJavaJNI.BRepPrimAPI_MakeBox_Wedge(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the constructed box as a shell.
   */
  public  TopoDS_Shell  Shell() {
    TopoDS_Shell ret = new TopoDS_Shell(OCCwrapJavaJNI.BRepPrimAPI_MakeBox_Shell(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the constructed box as a solid.
   */
  public  TopoDS_Solid  Solid() {
    TopoDS_Solid ret = new TopoDS_Solid(OCCwrapJavaJNI.BRepPrimAPI_MakeBox_Solid(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns ZMin face
   */
  public  TopoDS_Face  BottomFace() {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.BRepPrimAPI_MakeBox_BottomFace(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns XMin face
   */
  public  TopoDS_Face  BackFace() {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.BRepPrimAPI_MakeBox_BackFace(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns XMax face
   */
  public  TopoDS_Face  FrontFace() {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.BRepPrimAPI_MakeBox_FrontFace(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns YMin face
   */
  public  TopoDS_Face  LeftFace() {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.BRepPrimAPI_MakeBox_LeftFace(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns YMax face
   */
  public  TopoDS_Face  RightFace() {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.BRepPrimAPI_MakeBox_RightFace(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns ZMax face
   */
  public  TopoDS_Face  TopFace() {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.BRepPrimAPI_MakeBox_TopFace(swigCPtr, this), true);
    return ret;
  }

}
