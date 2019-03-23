package opencascade;

/**
 *  This  class  is  used  to  interpolate a  BsplineCurve
 *  passing   through  an  array  of  points,  with  a  C2
 *  Continuity if tangency is not requested at the point.
 *  If tangency is requested at the point the continuity will
 *  be C1.  If Perodicity is requested the curve will be closed
 *  and the junction will be the first point given. The curve will than be only C1
 *  The curve is defined by a table of points through which it passes, and if required
 *  by a parallel table of reals which gives the value of the parameter of each point through
 *  which the resulting BSpline curve passes, and by vectors tangential to these points.
 *  An Interpolate object provides a framework for: defining the constraints of the BSpline curve,
 *  -   implementing the interpolation algorithm, and consulting the results.
 */
public class Geom2dAPI_Interpolate {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Geom2dAPI_Interpolate(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Geom2dAPI_Interpolate(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Geom2dAPI_Interpolate obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Geom2dAPI_Interpolate(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Tolerance is to check if the points are not too close to one an other
   *  It is also used to check if the tangent vector is not too small.
   *  There should be at least 2 points
   *  if PeriodicFlag is True then the curve will be periodic.
   */
  public Geom2dAPI_Interpolate( TColgp_HArray1OfPnt2d  Points, long PeriodicFlag, double Tolerance) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_Interpolate__SWIG_0( TColgp_HArray1OfPnt2d.getCPtr(Points) , Points, PeriodicFlag, Tolerance), true);
  }

  /**
   *  if PeriodicFlag is True then the curve will be periodic
   *  Warning:
   *  There should be as many parameters as there are points
   *  except if PeriodicFlag is True : then there should be one more
   *  parameter to close the curve
   */
  public Geom2dAPI_Interpolate( TColgp_HArray1OfPnt2d  Points,  TColStd_HArray1OfReal  Parameters, long PeriodicFlag, double Tolerance) {
    this(OCCwrapJavaJNI.new_Geom2dAPI_Interpolate__SWIG_1( TColgp_HArray1OfPnt2d.getCPtr(Points) , Points,  TColStd_HArray1OfReal.getCPtr(Parameters) , Parameters, PeriodicFlag, Tolerance), true);
  }

  /**
   *  Assigns this constrained BSpline curve to be
   *  tangential to vectors InitialTangent and FinalTangent
   *  at its first and last points respectively (i.e.
   *  the first and last points of the table of
   *  points through which the curve passes, as
   *  defined at the time of initialization).
   *  <Scale> - boolean flag defining whether tangent vectors are to
   *  be scaled according to derivatives of lagrange interpolation.
   */
  public void Load( gp_Vec2d  InitialTangent,  gp_Vec2d  FinalTangent, long Scale) {
    OCCwrapJavaJNI.Geom2dAPI_Interpolate_Load__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(InitialTangent), InitialTangent, gp_Vec2d.getCPtr(FinalTangent), FinalTangent, Scale);
  }

  /**
   *  Assigns this constrained BSpline curve to be
   *  tangential to vectors defined in the table Tangents,
   *  which is parallel to the table of points
   *  through which the curve passes, as
   *  defined at the time of initialization. Vectors
   *  in the table Tangents are defined only if
   *  the flag given in the parallel table
   *  TangentFlags is true: only these vectors
   *  are set as tangency constraints.
   *  <Scale> - boolean flag defining whether tangent vectors are to
   *  be scaled according to derivatives of lagrange interpolation.
   */
  public void Load( gp_Vec2d  InitialTangent,  gp_Vec2d  FinalTangent) {
    OCCwrapJavaJNI.Geom2dAPI_Interpolate_Load__SWIG_1(swigCPtr, this, gp_Vec2d.getCPtr(InitialTangent), InitialTangent, gp_Vec2d.getCPtr(FinalTangent), FinalTangent);
  }

  public void Load( TColgp_Array1OfVec2d  Tangents,  TColStd_HArray1OfBoolean  TangentFlags, long Scale) {
    OCCwrapJavaJNI.Geom2dAPI_Interpolate_Load__SWIG_2(swigCPtr, this, TColgp_Array1OfVec2d.getCPtr(Tangents), Tangents,  TColStd_HArray1OfBoolean.getCPtr(TangentFlags) , TangentFlags, Scale);
  }

  public void Load( TColgp_Array1OfVec2d  Tangents,  TColStd_HArray1OfBoolean  TangentFlags) {
    OCCwrapJavaJNI.Geom2dAPI_Interpolate_Load__SWIG_3(swigCPtr, this, TColgp_Array1OfVec2d.getCPtr(Tangents), Tangents,  TColStd_HArray1OfBoolean.getCPtr(TangentFlags) , TangentFlags);
  }

  /**
   *  Computes the constrained BSpline curve. Use the function IsDone to verify that the
   *  computation is successful, and then the function Curve to obtain the result.
   */
  public void Perform() {
    OCCwrapJavaJNI.Geom2dAPI_Interpolate_Perform(swigCPtr, this);
  }

  public  Geom2d_BSplineCurve  Curve() {
    return new Geom2d_BSplineCurve ( OCCwrapJavaJNI.Geom2dAPI_Interpolate_Curve(swigCPtr, this), true );
  }

  /**
   *  Returns true if the constrained BSpline curve is successfully constructed.
   *  Note: in this case, the result is given by the function Curve.
   */
  public long IsDone() {
    return OCCwrapJavaJNI.Geom2dAPI_Interpolate_IsDone(swigCPtr, this);
  }

}
