package opencascade;

/**
 *  This class provides an algorithm for constructing such a plate surface that
 *  it conforms to given curve and/or point constraints.
 *  The algorithm accepts or constructs an initial surface
 *  and looks for a deformation of it satisfying the
 *  constraints and minimizing energy input.
 *  A BuildPlateSurface object provides a framework for:
 *  -   defining or setting constraints
 *  -   implementing the construction algorithm
 *  -   consulting the result.
 */
public class GeomPlate_BuildPlateSurface {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GeomPlate_BuildPlateSurface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GeomPlate_BuildPlateSurface(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GeomPlate_BuildPlateSurface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomPlate_BuildPlateSurface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructor  compatible  with  the  old  version
   *  with this constructor the constraint are given in a Array of Curve on Surface
   *  The array NbPoints  contains the number of points for each constraint.
   *  The Array Tang contains the order of constraint for each Constraint: The possible values for this
   *  order has to be -1 , 0 , 1 , 2 . Order i means constraint Gi.
   *  NbIter is the maximum number of iteration to optimise the number of points for resolution
   *  Degree is the degree of resolution for Plate
   *  Tol2d is the tolerance used to test if two points of different constraint are identical in the
   *  parametric space of the initial surface
   *  Tol3d is used to test if two identical points in the 2d space are identical in 3d space
   *  TolAng is used to compare the angle between normal of two identical points in the 2d space
   *  Raises  ConstructionError;
   */
  public GeomPlate_BuildPlateSurface( TColStd_HArray1OfInteger  NPoints, SWIGTYPE_p_opencascade__handleT_GeomPlate_HArray1OfHCurve_t TabCurve,  TColStd_HArray1OfInteger  Tang, int Degree, int NbIter, double Tol2d, double Tol3d, double TolAng, double TolCurv, long Anisotropie) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_0( TColStd_HArray1OfInteger.getCPtr(NPoints) , NPoints, SWIGTYPE_p_opencascade__handleT_GeomPlate_HArray1OfHCurve_t.getCPtr(TabCurve),  TColStd_HArray1OfInteger.getCPtr(Tang) , Tang, Degree, NbIter, Tol2d, Tol3d, TolAng, TolCurv, Anisotropie), true);
  }

  public GeomPlate_BuildPlateSurface( TColStd_HArray1OfInteger  NPoints, SWIGTYPE_p_opencascade__handleT_GeomPlate_HArray1OfHCurve_t TabCurve,  TColStd_HArray1OfInteger  Tang, int Degree, int NbIter, double Tol2d, double Tol3d, double TolAng, double TolCurv) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_1( TColStd_HArray1OfInteger.getCPtr(NPoints) , NPoints, SWIGTYPE_p_opencascade__handleT_GeomPlate_HArray1OfHCurve_t.getCPtr(TabCurve),  TColStd_HArray1OfInteger.getCPtr(Tang) , Tang, Degree, NbIter, Tol2d, Tol3d, TolAng, TolCurv), true);
  }

  /**
   *  Initializes the BuildPlateSurface framework for
   *  deforming plate surfaces using curve and point
   *  constraints. You use the first constructor if you have
   *  an initial surface to work with at construction time. If
   *  not, you use the second. You can add one later by
   *  using the method LoadInitSurface. If no initial
   *  surface is loaded, one will automatically be computed.
   *  The curve and point constraints will be defined by
   *  using the method Add.
   *  Before the call to the algorithm, the curve constraints
   *  will be transformed into sequences of discrete points.
   *  Each curve defined as a constraint will be given the
   *  value of NbPtsOnCur as the average number of points on it.
   *  Several arguments serve to improve performance of
   *  the algorithm. NbIter, for example, expresses the
   *  number of iterations allowed and is used to control the
   *  duration of computation. To optimize resolution,
   *  Degree will have the default value of 3.
   *  The surface generated must respect several tolerance values:
   *  -   2d tolerance given by Tol2d, with a default value of 0.00001
   *  -   3d tolerance expressed by Tol3d, with a default value of 0.0001
   *  -   angular tolerance given by TolAng, with a default
   *  value of 0.01, defining the greatest angle allowed
   *  between the constraint and the target surface.
   *  Exceptions
   *  Standard_ConstructionError if NbIter is less than 1 or Degree is less than 3.
   */
  public GeomPlate_BuildPlateSurface( TColStd_HArray1OfInteger  NPoints, SWIGTYPE_p_opencascade__handleT_GeomPlate_HArray1OfHCurve_t TabCurve,  TColStd_HArray1OfInteger  Tang, int Degree, int NbIter, double Tol2d, double Tol3d, double TolAng) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_2( TColStd_HArray1OfInteger.getCPtr(NPoints) , NPoints, SWIGTYPE_p_opencascade__handleT_GeomPlate_HArray1OfHCurve_t.getCPtr(TabCurve),  TColStd_HArray1OfInteger.getCPtr(Tang) , Tang, Degree, NbIter, Tol2d, Tol3d, TolAng), true);
  }

  public GeomPlate_BuildPlateSurface( TColStd_HArray1OfInteger  NPoints, SWIGTYPE_p_opencascade__handleT_GeomPlate_HArray1OfHCurve_t TabCurve,  TColStd_HArray1OfInteger  Tang, int Degree, int NbIter, double Tol2d, double Tol3d) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_3( TColStd_HArray1OfInteger.getCPtr(NPoints) , NPoints, SWIGTYPE_p_opencascade__handleT_GeomPlate_HArray1OfHCurve_t.getCPtr(TabCurve),  TColStd_HArray1OfInteger.getCPtr(Tang) , Tang, Degree, NbIter, Tol2d, Tol3d), true);
  }

  public GeomPlate_BuildPlateSurface( TColStd_HArray1OfInteger  NPoints, SWIGTYPE_p_opencascade__handleT_GeomPlate_HArray1OfHCurve_t TabCurve,  TColStd_HArray1OfInteger  Tang, int Degree, int NbIter, double Tol2d) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_4( TColStd_HArray1OfInteger.getCPtr(NPoints) , NPoints, SWIGTYPE_p_opencascade__handleT_GeomPlate_HArray1OfHCurve_t.getCPtr(TabCurve),  TColStd_HArray1OfInteger.getCPtr(Tang) , Tang, Degree, NbIter, Tol2d), true);
  }

  public GeomPlate_BuildPlateSurface( TColStd_HArray1OfInteger  NPoints, SWIGTYPE_p_opencascade__handleT_GeomPlate_HArray1OfHCurve_t TabCurve,  TColStd_HArray1OfInteger  Tang, int Degree, int NbIter) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_5( TColStd_HArray1OfInteger.getCPtr(NPoints) , NPoints, SWIGTYPE_p_opencascade__handleT_GeomPlate_HArray1OfHCurve_t.getCPtr(TabCurve),  TColStd_HArray1OfInteger.getCPtr(Tang) , Tang, Degree, NbIter), true);
  }

  public GeomPlate_BuildPlateSurface( TColStd_HArray1OfInteger  NPoints, SWIGTYPE_p_opencascade__handleT_GeomPlate_HArray1OfHCurve_t TabCurve,  TColStd_HArray1OfInteger  Tang, int Degree) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_6( TColStd_HArray1OfInteger.getCPtr(NPoints) , NPoints, SWIGTYPE_p_opencascade__handleT_GeomPlate_HArray1OfHCurve_t.getCPtr(TabCurve),  TColStd_HArray1OfInteger.getCPtr(Tang) , Tang, Degree), true);
  }

  public GeomPlate_BuildPlateSurface( Geom_Surface  Surf, int Degree, int NbPtsOnCur, int NbIter, double Tol2d, double Tol3d, double TolAng, double TolCurv, long Anisotropie) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_7( Geom_Surface.getCPtr(Surf) , Surf, Degree, NbPtsOnCur, NbIter, Tol2d, Tol3d, TolAng, TolCurv, Anisotropie), true);
  }

  public GeomPlate_BuildPlateSurface( Geom_Surface  Surf, int Degree, int NbPtsOnCur, int NbIter, double Tol2d, double Tol3d, double TolAng, double TolCurv) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_8( Geom_Surface.getCPtr(Surf) , Surf, Degree, NbPtsOnCur, NbIter, Tol2d, Tol3d, TolAng, TolCurv), true);
  }

  public GeomPlate_BuildPlateSurface( Geom_Surface  Surf, int Degree, int NbPtsOnCur, int NbIter, double Tol2d, double Tol3d, double TolAng) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_9( Geom_Surface.getCPtr(Surf) , Surf, Degree, NbPtsOnCur, NbIter, Tol2d, Tol3d, TolAng), true);
  }

  public GeomPlate_BuildPlateSurface( Geom_Surface  Surf, int Degree, int NbPtsOnCur, int NbIter, double Tol2d, double Tol3d) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_10( Geom_Surface.getCPtr(Surf) , Surf, Degree, NbPtsOnCur, NbIter, Tol2d, Tol3d), true);
  }

  public GeomPlate_BuildPlateSurface( Geom_Surface  Surf, int Degree, int NbPtsOnCur, int NbIter, double Tol2d) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_11( Geom_Surface.getCPtr(Surf) , Surf, Degree, NbPtsOnCur, NbIter, Tol2d), true);
  }

  public GeomPlate_BuildPlateSurface( Geom_Surface  Surf, int Degree, int NbPtsOnCur, int NbIter) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_12( Geom_Surface.getCPtr(Surf) , Surf, Degree, NbPtsOnCur, NbIter), true);
  }

  public GeomPlate_BuildPlateSurface( Geom_Surface  Surf, int Degree, int NbPtsOnCur) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_13( Geom_Surface.getCPtr(Surf) , Surf, Degree, NbPtsOnCur), true);
  }

  public GeomPlate_BuildPlateSurface( Geom_Surface  Surf, int Degree) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_14( Geom_Surface.getCPtr(Surf) , Surf, Degree), true);
  }

  public GeomPlate_BuildPlateSurface( Geom_Surface  Surf) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_15( Geom_Surface.getCPtr(Surf) , Surf), true);
  }

  public GeomPlate_BuildPlateSurface(int Degree, int NbPtsOnCur, int NbIter, double Tol2d, double Tol3d, double TolAng, double TolCurv, long Anisotropie) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_16(Degree, NbPtsOnCur, NbIter, Tol2d, Tol3d, TolAng, TolCurv, Anisotropie), true);
  }

  public GeomPlate_BuildPlateSurface(int Degree, int NbPtsOnCur, int NbIter, double Tol2d, double Tol3d, double TolAng, double TolCurv) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_17(Degree, NbPtsOnCur, NbIter, Tol2d, Tol3d, TolAng, TolCurv), true);
  }

  public GeomPlate_BuildPlateSurface(int Degree, int NbPtsOnCur, int NbIter, double Tol2d, double Tol3d, double TolAng) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_18(Degree, NbPtsOnCur, NbIter, Tol2d, Tol3d, TolAng), true);
  }

  public GeomPlate_BuildPlateSurface(int Degree, int NbPtsOnCur, int NbIter, double Tol2d, double Tol3d) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_19(Degree, NbPtsOnCur, NbIter, Tol2d, Tol3d), true);
  }

  public GeomPlate_BuildPlateSurface(int Degree, int NbPtsOnCur, int NbIter, double Tol2d) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_20(Degree, NbPtsOnCur, NbIter, Tol2d), true);
  }

  public GeomPlate_BuildPlateSurface(int Degree, int NbPtsOnCur, int NbIter) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_21(Degree, NbPtsOnCur, NbIter), true);
  }

  public GeomPlate_BuildPlateSurface(int Degree, int NbPtsOnCur) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_22(Degree, NbPtsOnCur), true);
  }

  public GeomPlate_BuildPlateSurface(int Degree) {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_23(Degree), true);
  }

  public GeomPlate_BuildPlateSurface() {
    this(OCCwrapJavaJNI.new_GeomPlate_BuildPlateSurface__SWIG_24(), true);
  }

  /**
   *  Resets all constraints
   */
  public void Init() {
    OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_Init(swigCPtr, this);
  }

  /**
   *  Loads the initial Surface
   */
  public void LoadInitSurface( Geom_Surface  Surf) {
    OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_LoadInitSurface(swigCPtr, this,  Geom_Surface.getCPtr(Surf) , Surf);
  }

  /**
   *  Adds the linear constraint cont.
   */
  public void Add( GeomPlate_CurveConstraint  Cont) {
    OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_Add__SWIG_0(swigCPtr, this,  GeomPlate_CurveConstraint.getCPtr(Cont) , Cont);
  }

  public void SetNbBounds(int NbBounds) {
    OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_SetNbBounds(swigCPtr, this, NbBounds);
  }

  /**
   *  Adds the point constraint cont.
   */
  public void Add( GeomPlate_PointConstraint  Cont) {
    OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_Add__SWIG_1(swigCPtr, this,  GeomPlate_PointConstraint.getCPtr(Cont) , Cont);
  }

  /**
   *  Calls the algorithm and computes the plate surface using
   *  the loaded constraints. If no initial surface is given, the
   *  algorithm automatically computes one.
   *  Exceptions
   *  Standard_RangeError if the value of the constraint is
   *  null or if plate is not done.
   */
  public void Perform() {
    OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_Perform(swigCPtr, this);
  }

  public  GeomPlate_CurveConstraint  CurveConstraint(int order) {
    return new GeomPlate_CurveConstraint ( OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_CurveConstraint(swigCPtr, this, order), true );
  }

  public  GeomPlate_PointConstraint  PointConstraint(int order) {
    return new GeomPlate_PointConstraint ( OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_PointConstraint(swigCPtr, this, order), true );
  }

  public void Disc2dContour(int nbp,  TColgp_SequenceOfXY  Seq2d) {
    OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_Disc2dContour(swigCPtr, this, nbp, TColgp_SequenceOfXY.getCPtr(Seq2d), Seq2d);
  }

  public void Disc3dContour(int nbp, int iordre,  TColgp_SequenceOfXYZ  Seq3d) {
    OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_Disc3dContour(swigCPtr, this, nbp, iordre, TColgp_SequenceOfXYZ.getCPtr(Seq3d), Seq3d);
  }

  /**
   *  Tests whether computation of the plate has been completed.
   */
  public long IsDone() {
    return OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_IsDone(swigCPtr, this);
  }

  public  GeomPlate_Surface  Surface() {
    return new GeomPlate_Surface ( OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_Surface(swigCPtr, this), true );
  }

  public  Geom_Surface  SurfInit() {
    return new Geom_Surface ( OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_SurfInit(swigCPtr, this), true );
  }

  public  TColStd_HArray1OfInteger  Sense() {
    return new TColStd_HArray1OfInteger ( OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_Sense(swigCPtr, this), true );
  }

  public  TColGeom2d_HArray1OfCurve  Curves2d() {
    return new TColGeom2d_HArray1OfCurve ( OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_Curves2d(swigCPtr, this), true );
  }

  public  TColStd_HArray1OfInteger  Order() {
    return new TColStd_HArray1OfInteger ( OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_Order(swigCPtr, this), true );
  }

  /**
   *  Returns the max distance betwen the result and the constraints
   */
  public double G0Error() {
    return OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_G0Error__SWIG_0(swigCPtr, this);
  }

  /**
   *  Returns  the max angle betwen the result and the constraints
   */
  public double G1Error() {
    return OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_G1Error__SWIG_0(swigCPtr, this);
  }

  /**
   *  Returns  the max difference of curvature betwen the result and the constraints
   */
  public double G2Error() {
    return OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_G2Error__SWIG_0(swigCPtr, this);
  }

  /**
   *  Returns   the max distance between the result and the constraint Index
   */
  public double G0Error(int Index) {
    return OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_G0Error__SWIG_1(swigCPtr, this, Index);
  }

  /**
   *  Returns the max angle between the result and the constraint Index
   */
  public double G1Error(int Index) {
    return OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_G1Error__SWIG_1(swigCPtr, this, Index);
  }

  /**
   *  Returns the max difference of curvature between the result and the constraint Index
   */
  public double G2Error(int Index) {
    return OCCwrapJavaJNI.GeomPlate_BuildPlateSurface_G2Error__SWIG_1(swigCPtr, this, Index);
  }

}
