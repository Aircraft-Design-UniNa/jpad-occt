package opencascade;

/**
 *  Provides constructors without Builders.
 */
public class BRepPrim_Wedge extends BRepPrim_GWedge {

  private long swigCPtr;
  BRepPrim_Wedge(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepPrim_Wedge_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepPrim_Wedge(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepPrim_Wedge_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepPrim_Wedge obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepPrim_Wedge(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Creates a  Wedge  algorithm.   <Axes> is  the axis
   *  system for the primitive.
   * 
   *  XMin, YMin, ZMin are set to 0
   *  XMax, YMax, ZMax are set to dx, dy, dz
   *  Z2Min = ZMin
   *  Z2Max = ZMax
   *  X2Min = XMin
   *  X2Max = XMax
   *  The result is a box
   *  dx,dy,dz should be positive
   */
  public BRepPrim_Wedge( gp_Ax2  Axes, double dx, double dy, double dz) {
    this(OCCwrapJavaJNI.new_BRepPrim_Wedge__SWIG_0(gp_Ax2.getCPtr(Axes), Axes, dx, dy, dz), true);
  }

  /**
   *  Creates  a Wedge  primitive. <Axes> is   the  axis
   *  system for the primitive.
   * 
   *  XMin, YMin, ZMin are set to 0
   *  XMax, YMax, ZMax are set to dx, dy, dz
   *  Z2Min = ZMin
   *  Z2Max = ZMax
   *  X2Min = ltx
   *  X2Max = ltx
   *  The result is a STEP right angular wedge
   *  dx,dy,dz should be positive
   *  ltx should not be negative
   */
  public BRepPrim_Wedge( gp_Ax2  Axes, double dx, double dy, double dz, double ltx) {
    this(OCCwrapJavaJNI.new_BRepPrim_Wedge__SWIG_1(gp_Ax2.getCPtr(Axes), Axes, dx, dy, dz, ltx), true);
  }

  /**
   *  Create  a Wedge primitive.   <Axes>  is  the  axis
   *  system for the primitive.
   * 
   *  all the fields are set to the corresponding value
   *  XYZMax - XYZMin should be positive
   *  ZX2Max - ZX2Min should not be negative
   */
  public BRepPrim_Wedge( gp_Ax2  Axes, double xmin, double ymin, double zmin, double z2min, double x2min, double xmax, double ymax, double zmax, double z2max, double x2max) {
    this(OCCwrapJavaJNI.new_BRepPrim_Wedge__SWIG_2(gp_Ax2.getCPtr(Axes), Axes, xmin, ymin, zmin, z2min, x2min, xmax, ymax, zmax, z2max, x2max), true);
  }

}
