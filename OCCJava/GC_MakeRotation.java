package opencascade;

/**
 *  This class implements elementary construction algorithms for a
 *  rotation in 3D space. The result is a
 *  Geom_Transformation transformation.
 *  A MakeRotation object provides a framework for:
 *  -   defining the construction of the transformation,
 *  -   implementing the construction algorithm, and
 *  -   consulting the result.
 */
public class GC_MakeRotation {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GC_MakeRotation(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GC_MakeRotation(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GC_MakeRotation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GC_MakeRotation(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructs a rotation through angle Angle about the axis defined by the line Line.
   */
  public GC_MakeRotation( gp_Lin  Line, double Angle) {
    this(OCCwrapJavaJNI.new_GC_MakeRotation__SWIG_0(gp_Lin.getCPtr(Line), Line, Angle), true);
  }

  /**
   *  Constructs a rotation through angle Angle about the axis defined by the axis Axis.
   */
  public GC_MakeRotation( gp_Ax1  Axis, double Angle) {
    this(OCCwrapJavaJNI.new_GC_MakeRotation__SWIG_1(gp_Ax1.getCPtr(Axis), Axis, Angle), true);
  }

  /**
   *  Constructs a rotation through angle Angle about the axis
   *  defined by the point Point and the unit vector Direc.
   */
  public GC_MakeRotation( gp_Pnt  Point,  gp_Dir  Direc, double Angle) {
    this(OCCwrapJavaJNI.new_GC_MakeRotation__SWIG_2(gp_Pnt.getCPtr(Point), Point, gp_Dir.getCPtr(Direc), Direc, Angle), true);
  }

  public  Geom_Transformation  Value() {
    return new Geom_Transformation ( OCCwrapJavaJNI.GC_MakeRotation_Value(swigCPtr, this), true );
  }

}
