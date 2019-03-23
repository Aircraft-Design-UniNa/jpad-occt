package opencascade;

/**
 *  This  class  is  used  to  interpolate a  BsplineCurve
 *  passing   through  an  array  of  points,  with  a  C2
 *  Continuity if tangency is not requested at the point.
 *  If tangency is requested at the point the continuity will
 *  be C1.  If Perodicity is requested the curve will be closed
 *  and the junction will be the first point given. The curve
 *  will than be only C1
 *  Describes functions for building a constrained 3D BSpline curve.
 *  The curve is defined by a table of points
 *  through which it passes, and if required:
 *  -   by a parallel table of reals which gives the
 *  value of the parameter of each point through
 *  which the resulting BSpline curve passes, and
 *  -   by vectors tangential to these points.
 *  An Interpolate object provides a framework for:
 *  -   defining the constraints of the BSpline curve,
 *  -   implementing the interpolation algorithm, and
 *  -   consulting the results.
 */
public class GeomAPI_Interpolate {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GeomAPI_Interpolate(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GeomAPI_Interpolate(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GeomAPI_Interpolate obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomAPI_Interpolate(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Initializes an algorithm for constructing a
   *  constrained BSpline curve passing through the points of the table   Points.
   *  Tangential vectors can then be assigned, using the function Load.
   *  If PeriodicFlag is true, the constrained BSpline
   *  curve will be periodic and closed. In this case,
   *  the junction point is the first point of the table Points.
   *  The tolerance value Tolerance is used to check that:
   *  -   points are not too close to each other, or
   *  -   tangential vectors (defined using the
   *  function Load) are not too small.
   *  The resulting BSpline curve will be "C2"
   *  continuous, except where a tangency
   *  constraint is defined on a point through which
   *  the curve passes (by using the Load function).
   *  In this case, it will be only "C1" continuous.
   *  Once all the constraints are defined, use the
   *  function Perform to compute the curve.
   *  Warning
   *  -   There must be at least 2 points in the table Points.
   *  -   If PeriodicFlag is false, there must be as
   *  many parameters in the array Parameters as
   *  there are points in the array Points.
   *  -   If PeriodicFlag is true, there must be one
   *  more parameter in the table Parameters: this
   *  is used to give the parameter on the
   *  resulting BSpline curve of the junction point
   *  of the curve (which is also the first point of the table Points).
   *  Exceptions
   *  -   Standard_ConstructionError if the
   *  distance between two consecutive points in
   *  the table Points is less than or equal to Tolerance.
   *  -   Standard_OutOfRange if:
   *  -   there are less than two points in the table Points, or
   *  -   conditions relating to the respective
   *  number of elements in the parallel tables
   *  Points and Parameters are not respected.
   */
  public GeomAPI_Interpolate( TColgp_HArray1OfPnt  Points, long PeriodicFlag, double Tolerance) {
    this(OCCwrapJavaJNI.new_GeomAPI_Interpolate__SWIG_0( TColgp_HArray1OfPnt.getCPtr(Points) , Points, PeriodicFlag, Tolerance), true);
  }

  /**
   *  Initializes an algorithm for constructing a
   *  constrained BSpline curve passing through the points of the table
   *  Points, where the parameters of each of its
   *  points are given by the parallel table Parameters.
   *  Tangential vectors can then be assigned, using the function Load.
   *  If PeriodicFlag is true, the constrained BSpline
   *  curve will be periodic and closed. In this case,
   *  the junction point is the first point of the table Points.
   *  The tolerance value Tolerance is used to check that:
   *  -   points are not too close to each other, or
   *  -   tangential vectors (defined using the
   *  function Load) are not too small.
   *  The resulting BSpline curve will be "C2"
   *  continuous, except where a tangency
   *  constraint is defined on a point through which
   *  the curve passes (by using the Load function).
   *  In this case, it will be only "C1" continuous.
   *  Once all the constraints are defined, use the
   *  function Perform to compute the curve.
   *  Warning
   *  -   There must be at least 2 points in the table Points.
   *  -   If PeriodicFlag is false, there must be as
   *  many parameters in the array Parameters as
   *  there are points in the array Points.
   *  -   If PeriodicFlag is true, there must be one
   *  more parameter in the table Parameters: this
   *  is used to give the parameter on the
   *  resulting BSpline curve of the junction point
   *  of the curve (which is also the first point of the table Points).
   *  Exceptions
   *  -   Standard_ConstructionError if the
   *  distance between two consecutive points in
   *  the table Points is less than or equal to Tolerance.
   *  -   Standard_OutOfRange if:
   *  -   there are less than two points in the table Points, or
   *  -   conditions relating to the respective
   *  number of elements in the parallel tables
   *  Points and Parameters are not respected.
   */
  public GeomAPI_Interpolate( TColgp_HArray1OfPnt  Points,  TColStd_HArray1OfReal  Parameters, long PeriodicFlag, double Tolerance) {
    this(OCCwrapJavaJNI.new_GeomAPI_Interpolate__SWIG_1( TColgp_HArray1OfPnt.getCPtr(Points) , Points,  TColStd_HArray1OfReal.getCPtr(Parameters) , Parameters, PeriodicFlag, Tolerance), true);
  }

  /**
   *  Assigns this constrained BSpline curve to be
   *  tangential to vectors InitialTangent and FinalTangent
   *  at its first and last points respectively (i.e.
   *  the first and last points of the table of
   *  points through which the curve passes, as
   *  defined at the time of initialization).
   */
  public void Load( gp_Vec  InitialTangent,  gp_Vec  FinalTangent, long Scale) {
    OCCwrapJavaJNI.GeomAPI_Interpolate_Load__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(InitialTangent), InitialTangent, gp_Vec.getCPtr(FinalTangent), FinalTangent, Scale);
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
   */
  public void Load( gp_Vec  InitialTangent,  gp_Vec  FinalTangent) {
    OCCwrapJavaJNI.GeomAPI_Interpolate_Load__SWIG_1(swigCPtr, this, gp_Vec.getCPtr(InitialTangent), InitialTangent, gp_Vec.getCPtr(FinalTangent), FinalTangent);
  }

  public void Load( TColgp_Array1OfVec  Tangents,  TColStd_HArray1OfBoolean  TangentFlags, long Scale) {
    OCCwrapJavaJNI.GeomAPI_Interpolate_Load__SWIG_2(swigCPtr, this, TColgp_Array1OfVec.getCPtr(Tangents), Tangents,  TColStd_HArray1OfBoolean.getCPtr(TangentFlags) , TangentFlags, Scale);
  }

  public void Load( TColgp_Array1OfVec  Tangents,  TColStd_HArray1OfBoolean  TangentFlags) {
    OCCwrapJavaJNI.GeomAPI_Interpolate_Load__SWIG_3(swigCPtr, this, TColgp_Array1OfVec.getCPtr(Tangents), Tangents,  TColStd_HArray1OfBoolean.getCPtr(TangentFlags) , TangentFlags);
  }

  /**
   *  Computes the constrained BSpline curve.
   *  Use the function IsDone to verify that the
   *  computation is successful, and then the function Curve to obtain the result.
   */
  public void Perform() {
    OCCwrapJavaJNI.GeomAPI_Interpolate_Perform(swigCPtr, this);
  }

  public  Geom_BSplineCurve  Curve() {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.GeomAPI_Interpolate_Curve(swigCPtr, this), true );
  }

  /**
   *  Returns true if the constrained BSpline curve is successfully constructed.
   *  Note: in this case, the result is given by the function Curve.
   */
  public long IsDone() {
    return OCCwrapJavaJNI.GeomAPI_Interpolate_IsDone(swigCPtr, this);
  }

}
