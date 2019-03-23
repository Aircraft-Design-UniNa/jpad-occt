package opencascade;

/**
 *  Describes functions to build revolved shapes.
 *  A MakeRevolution object provides a framework for:
 *  -   defining the construction of a revolved shape,
 *  -   implementing the construction algorithm, and
 *  -   consulting the result.
 */
public class BRepPrimAPI_MakeRevolution extends BRepPrimAPI_MakeOneAxis {

  private long swigCPtr;
  BRepPrimAPI_MakeRevolution(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeRevolution_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepPrimAPI_MakeRevolution(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeRevolution_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepPrimAPI_MakeRevolution obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepPrimAPI_MakeRevolution(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Make a revolution body by rotating a curve around Z.
   */
  public BRepPrimAPI_MakeRevolution( Geom_Curve  Meridian) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeRevolution__SWIG_0( Geom_Curve.getCPtr(Meridian) , Meridian), true);
  }

  /**
   *  Make a revolution body by rotating a curve around Z.
   */
  public BRepPrimAPI_MakeRevolution( Geom_Curve  Meridian, double angle) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeRevolution__SWIG_1( Geom_Curve.getCPtr(Meridian) , Meridian, angle), true);
  }

  /**
   *  Make a revolution body by rotating a curve around Z.
   */
  public BRepPrimAPI_MakeRevolution( Geom_Curve  Meridian, double VMin, double VMax) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeRevolution__SWIG_2( Geom_Curve.getCPtr(Meridian) , Meridian, VMin, VMax), true);
  }

  /**
   *  Make a revolution body by rotating a curve around Z.
   */
  public BRepPrimAPI_MakeRevolution( Geom_Curve  Meridian, double VMin, double VMax, double angle) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeRevolution__SWIG_3( Geom_Curve.getCPtr(Meridian) , Meridian, VMin, VMax, angle), true);
  }

  /**
   *  Make a revolution body by rotating a curve around Z.
   */
  public BRepPrimAPI_MakeRevolution( gp_Ax2  Axes,  Geom_Curve  Meridian) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeRevolution__SWIG_4(gp_Ax2.getCPtr(Axes), Axes,  Geom_Curve.getCPtr(Meridian) , Meridian), true);
  }

  /**
   *  Make a revolution body by rotating a curve around Z.
   */
  public BRepPrimAPI_MakeRevolution( gp_Ax2  Axes,  Geom_Curve  Meridian, double angle) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeRevolution__SWIG_5(gp_Ax2.getCPtr(Axes), Axes,  Geom_Curve.getCPtr(Meridian) , Meridian, angle), true);
  }

  /**
   *  Make a revolution body by rotating a curve around Z.
   */
  public BRepPrimAPI_MakeRevolution( gp_Ax2  Axes,  Geom_Curve  Meridian, double VMin, double VMax) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeRevolution__SWIG_6(gp_Ax2.getCPtr(Axes), Axes,  Geom_Curve.getCPtr(Meridian) , Meridian, VMin, VMax), true);
  }

  /**
   *  Make a revolution body by rotating a curve around Z.
   *  For all algorithms the resulting shape is composed of
   *  -   a lateral revolved face,
   *  -   two planar faces in planes parallel to the plane z =
   *  0, and passing by the extremities of the revolved
   *  portion of Meridian, if these points are not on the Z
   *  axis (in case of a complete revolved shape, these faces are circles),
   *  -   and in the case of a portion of a revolved shape, two
   *  planar faces to close the shape (in the planes u = 0 and u = angle).
   */
  public BRepPrimAPI_MakeRevolution( gp_Ax2  Axes,  Geom_Curve  Meridian, double VMin, double VMax, double angle) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeRevolution__SWIG_7(gp_Ax2.getCPtr(Axes), Axes,  Geom_Curve.getCPtr(Meridian) , Meridian, VMin, VMax, angle), true);
  }

  /**
   *  Returns the algorithm.
   */
  public  BRepPrim_Revolution  Revolution() {
    BRepPrim_Revolution ret = new BRepPrim_Revolution(OCCwrapJavaJNI.BRepPrimAPI_MakeRevolution_Revolution(swigCPtr, this), false, this);
    return ret;
  }

}
