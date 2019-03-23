package opencascade;

/**
 *  Implement the cone primitive.
 */
public class BRepPrim_Cone extends BRepPrim_Revolution {

  private long swigCPtr;
  BRepPrim_Cone(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepPrim_Cone_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepPrim_Cone(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepPrim_Cone_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepPrim_Cone obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepPrim_Cone(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  the STEP definition
   *  Angle = semi-angle of the cone
   *  Position : the coordinate system
   *  Height : height of the cone.
   *  Radius : radius of truncated face at z = 0
   * 
   *  The apex is on z < 0
   * 
   *  Errors : Height < Resolution
   *  Angle < Resolution / Height
   *  Angle > PI/2 - Resolution / Height
   */
  public BRepPrim_Cone(double Angle,  gp_Ax2  Position, double Height, double Radius) {
    this(OCCwrapJavaJNI.new_BRepPrim_Cone__SWIG_0(Angle, gp_Ax2.getCPtr(Position), Position, Height, Radius), true);
  }

  /**
   *  infinite cone at origin on Z negative
   */
  public BRepPrim_Cone(double Angle,  gp_Ax2  Position, double Height) {
    this(OCCwrapJavaJNI.new_BRepPrim_Cone__SWIG_1(Angle, gp_Ax2.getCPtr(Position), Position, Height), true);
  }

  /**
   *  infinite cone at Apex on Z negative
   */
  public BRepPrim_Cone(double Angle) {
    this(OCCwrapJavaJNI.new_BRepPrim_Cone__SWIG_2(Angle), true);
  }

  /**
   *  infinite cone with Axes
   */
  public BRepPrim_Cone(double Angle,  gp_Pnt  Apex) {
    this(OCCwrapJavaJNI.new_BRepPrim_Cone__SWIG_3(Angle, gp_Pnt.getCPtr(Apex), Apex), true);
  }

  /**
   *  create a  Cone at origin  on Z axis, of height  H,
   *  radius R1 at Z = 0, R2 at  Z = H, X is  the origin
   *  of angles.  If R1 or  R2 is 0   there is  an apex.
   *  Otherwise, it is a truncated cone.
   * 
   *  Error  : R1 and R2  < Resolution
   *  R1 or R2 negative
   *  Abs(R1-R2) < Resolution
   *  H < Resolution
   *  H negative
   */
  public BRepPrim_Cone(double Angle,  gp_Ax2  Axes) {
    this(OCCwrapJavaJNI.new_BRepPrim_Cone__SWIG_4(Angle, gp_Ax2.getCPtr(Axes), Axes), true);
  }

  /**
   *  same as above but at a given point
   */
  public BRepPrim_Cone(double R1, double R2, double H) {
    this(OCCwrapJavaJNI.new_BRepPrim_Cone__SWIG_5(R1, R2, H), true);
  }

  /**
   *  same as above with given axes system.
   */
  public BRepPrim_Cone( gp_Pnt  Center, double R1, double R2, double H) {
    this(OCCwrapJavaJNI.new_BRepPrim_Cone__SWIG_6(gp_Pnt.getCPtr(Center), Center, R1, R2, H), true);
  }

  public BRepPrim_Cone( gp_Ax2  Axes, double R1, double R2, double H) {
    this(OCCwrapJavaJNI.new_BRepPrim_Cone__SWIG_7(gp_Ax2.getCPtr(Axes), Axes, R1, R2, H), true);
  }

}
