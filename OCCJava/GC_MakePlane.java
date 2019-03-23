package opencascade;

/**
 *  This class implements the following algorithms used
 *  to create a Plane from gp.
 *  * Create a Plane parallel to another and passing
 *  through a point.
 *  * Create a Plane passing through 3 points.
 *  * Create a Plane by its normal
 *  A MakePlane object provides a framework for:
 *  -   defining the construction of the plane,
 *  -   implementing the construction algorithm, and
 *  -   consulting the results. In particular, the Value
 *  function returns the constructed plane.
 */
public class GC_MakePlane extends GC_Root {

  private long swigCPtr;
  GC_MakePlane(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.GC_MakePlane_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  GC_MakePlane(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.GC_MakePlane_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(GC_MakePlane obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GC_MakePlane(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Creates a plane from a non persistent plane from package gp.
   */
  public GC_MakePlane( gp_Pln  Pl) {
    this(OCCwrapJavaJNI.new_GC_MakePlane__SWIG_0(gp_Pln.getCPtr(Pl), Pl), true);
  }

  /**
   *  P is the "Location" point or origin of the plane.
   *  V is the direction normal to the plane.
   */
  public GC_MakePlane( gp_Pnt  P,  gp_Dir  V) {
    this(OCCwrapJavaJNI.new_GC_MakePlane__SWIG_1(gp_Pnt.getCPtr(P), P, gp_Dir.getCPtr(V), V), true);
  }

  /**
   *  Creates a plane from its cartesian equation :
   *  Ax + By + Cz + D = 0.0
   *  Status is "BadEquation" if Sqrt (A*A + B*B + C*C)
   *  <= Resolution from gp
   */
  public GC_MakePlane(double A, double B, double C, double D) {
    this(OCCwrapJavaJNI.new_GC_MakePlane__SWIG_2(A, B, C, D), true);
  }

  /**
   *  Make a Plane from Geom <ThePlane> parallel to another
   *  Pln <Pln> and passing through a Pnt <Point>.
   */
  public GC_MakePlane( gp_Pln  Pln,  gp_Pnt  Point) {
    this(OCCwrapJavaJNI.new_GC_MakePlane__SWIG_3(gp_Pln.getCPtr(Pln), Pln, gp_Pnt.getCPtr(Point), Point), true);
  }

  /**
   *  Make a Plane from Geom <ThePlane> parallel to another
   *  Pln <Pln> at the distance <Dist> which can be greater
   *  or lower than zero.
   *  In the first case the result is at the distance
   *  <Dist> to the plane <Pln> in the direction of the
   *  normal to <Pln>.
   *  Otherwize it is in the oposite direction.
   */
  public GC_MakePlane( gp_Pln  Pln, double Dist) {
    this(OCCwrapJavaJNI.new_GC_MakePlane__SWIG_4(gp_Pln.getCPtr(Pln), Pln, Dist), true);
  }

  /**
   *  Make a Plane from Geom <ThePlane> passing through 3
   *  Pnt <P1>,<P2>,<P3>.
   *  It returns false if <P1> <P2> <P3> are confused.
   */
  public GC_MakePlane( gp_Pnt  P1,  gp_Pnt  P2,  gp_Pnt  P3) {
    this(OCCwrapJavaJNI.new_GC_MakePlane__SWIG_5(gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2, gp_Pnt.getCPtr(P3), P3), true);
  }

  /**
   *  Make a Plane  passing through the location of <Axis>and
   *  normal to the Direction of <Axis>.
   */
  public GC_MakePlane( gp_Ax1  Axis) {
    this(OCCwrapJavaJNI.new_GC_MakePlane__SWIG_6(gp_Ax1.getCPtr(Axis), Axis), true);
  }

  public  Geom_Plane  Value() {
    return new Geom_Plane ( OCCwrapJavaJNI.GC_MakePlane_Value(swigCPtr, this), true );
  }

}
