package opencascade;

/**
 *  Describes functions to build fillets on the broken edges of a shell or solid.
 *  A MakeFillet object provides a framework for:
 *  -   initializing the construction algorithm with a given shape,
 *  -   acquiring the data characterizing the fillets,
 *  -   building the fillets and constructing the resulting shape, and
 *  -   consulting the result.
 */
public class BRepFilletAPI_MakeFillet extends BRepFilletAPI_LocalOperation {

  private long swigCPtr;
  BRepFilletAPI_MakeFillet(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepFilletAPI_MakeFillet(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepFilletAPI_MakeFillet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepFilletAPI_MakeFillet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Initializes   the computation    of   the  fillets.
   *  <FShape> sets   the type   of fillet  surface. The
   *  default value is ChFi3d_Rational (classical  nurbs
   *  representation of  circles).   ChFi3d_QuasiAngular
   *  corresponds to  a  nurbs representation of circles
   *  which   parameterisation matches  the  circle one.
   *  ChFi3d_Polynomial  corresponds to  a    polynomial
   *  representation of circles.
   */
  public BRepFilletAPI_MakeFillet( TopoDS_Shape  S, ChFi3d_FilletShape FShape) {
    this(OCCwrapJavaJNI.new_BRepFilletAPI_MakeFillet__SWIG_0(TopoDS_Shape.getCPtr(S), S, FShape.swigValue()), true);
  }

  public BRepFilletAPI_MakeFillet( TopoDS_Shape  S) {
    this(OCCwrapJavaJNI.new_BRepFilletAPI_MakeFillet__SWIG_1(TopoDS_Shape.getCPtr(S), S), true);
  }

  public void SetParams(double Tang, double Tesp, double T2d, double TApp3d, double TolApp2d, double Fleche) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_SetParams(swigCPtr, this, Tang, Tesp, T2d, TApp3d, TolApp2d, Fleche);
  }

  /**
   *  Changes     the      parameters     of  continiuity
   *  InternalContinuity to produce fillet'surfaces with
   *  an continuity   Ci (i=0,1 or    2).
   *  By defaultInternalContinuity = GeomAbs_C1.
   *  AngularTolerance  is the G1 tolerance between fillet
   *  and support'faces.
   */
  public void SetContinuity(GeomAbs_Shape InternalContinuity, double AngularTolerance) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_SetContinuity(swigCPtr, this, InternalContinuity.swigValue(), AngularTolerance);
  }

  /**
   *  Adds a  fillet contour in  the  builder  (builds a
   *  contour  of tangent edges).
   *  The Radius must be set after.
   */
  public void Add( TopoDS_Edge  E) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_Add__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Adds a  fillet description in  the  builder
   *  - builds a contour  of tangent edges,
   *  - sets the radius.
   */
  public void Add(double Radius,  TopoDS_Edge  E) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_Add__SWIG_1(swigCPtr, this, Radius, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Adds a  fillet description in  the  builder
   *  - builds a contour  of tangent edges,
   *  - sets a linear radius evolution law between
   *  the first and last vertex of the spine.
   */
  public void Add(double R1, double R2,  TopoDS_Edge  E) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_Add__SWIG_2(swigCPtr, this, R1, R2, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Adds a  fillet description in  the  builder
   *  - builds a contour  of tangent edges,
   *  - sest the radius evolution law.
   */
  public void Add( Law_Function  L,  TopoDS_Edge  E) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_Add__SWIG_3(swigCPtr, this,  Law_Function.getCPtr(L) , L, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Adds a  fillet description in  the  builder
   *  - builds a contour  of tangent edges,
   *  - sets the radius evolution law interpolating the values
   *  given in the array UandR :
   * 
   *  p2d.X() = relative parameter on the spine [0,1]
   *  p2d.Y() = value of the radius.
   */
  public void Add( TColgp_Array1OfPnt2d  UandR,  TopoDS_Edge  E) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_Add__SWIG_4(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(UandR), UandR, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Sets the parameters of the fillet
   *  along the contour of index IC generated using the Add function
   *  in the internal data structure of
   *  this algorithm, where Radius is the radius of the fillet.
   */
  public void SetRadius(double Radius, int IC, int IinC) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_SetRadius__SWIG_0(swigCPtr, this, Radius, IC, IinC);
  }

  /**
   *  Sets the parameters of the fillet
   *  along the contour of index IC generated using the Add function
   *  in the internal data structure of this algorithm, where the radius of the
   *  fillet evolves according to a linear evolution law defined
   *  from R1 to R2, between the first and last vertices of the contour of index IC.
   */
  public void SetRadius(double R1, double R2, int IC, int IinC) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_SetRadius__SWIG_1(swigCPtr, this, R1, R2, IC, IinC);
  }

  /**
   *  Sets the parameters of the fillet
   *  along the contour of index IC generated using the Add function
   *  in the internal data structure of this algorithm, where the radius of the
   *  fillet evolves according to the evolution law L, between the
   *  first and last vertices of the contour of index IC.
   */
  public void SetRadius( Law_Function  L, int IC, int IinC) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_SetRadius__SWIG_2(swigCPtr, this,  Law_Function.getCPtr(L) , L, IC, IinC);
  }

  /**
   *  Sets the parameters of the fillet
   *  along the contour of index IC generated using the Add function
   *  in the internal data structure of this algorithm,
   *  where the radius of the fillet evolves according to the evolution law
   *  which interpolates the set of parameter and radius pairs given
   *  in the array UandR as follows:
   *  -   the X coordinate of a point in UandR defines a
   *  relative parameter on the contour (i.e. a parameter between 0 and 1),
   *  -          the Y coordinate of a point in UandR gives the
   *  corresponding value of the radius, and the radius evolves
   *  between the first and last vertices of the contour of index IC.
   */
  public void SetRadius( TColgp_Array1OfPnt2d  UandR, int IC, int IinC) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_SetRadius__SWIG_3(swigCPtr, this, TColgp_Array1OfPnt2d.getCPtr(UandR), UandR, IC, IinC);
  }

  /**
   *  Returns true if the radius of the fillet along the contour of index IC
   *  in the internal data structure of this algorithm is constant,
   *  Warning
   *  False is returned if IC is outside the bounds of the table
   *  of contours or if E does not belong to the contour of index IC.
   */
  public long IsConstant(int IC) {
    return OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_IsConstant__SWIG_0(swigCPtr, this, IC);
  }

  /**
   *  Returns the radius of the fillet along the contour of index IC in the
   *  internal data structure of this algorithm
   *  Warning
   *  -   Use this function only if the radius is constant.
   *  -   -1. is returned if IC is outside the bounds of the
   *  table of contours or if E does not belong to the contour of index IC.
   */
  public double Radius(int IC) {
    return OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_Radius__SWIG_0(swigCPtr, this, IC);
  }

  /**
   *  Returns true if the radius of the fillet along the edge E of the
   *  contour of index IC in the internal data structure of
   *  this algorithm is constant.
   *  Warning
   *  False is returned if IC is outside the bounds of the table
   *  of contours or if E does not belong to the contour of index IC.
   */
  public long IsConstant(int IC,  TopoDS_Edge  E) {
    return OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_IsConstant__SWIG_1(swigCPtr, this, IC, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Returns the radius of the fillet along the edge E of the contour of index
   *  IC in the internal data structure of this algorithm.
   *  Warning
   *  -   Use this function only if the radius is constant.
   *  -   -1 is returned if IC is outside the bounds of the
   *  table of contours or if E does not belong to the contour of index IC.
   */
  public double Radius(int IC,  TopoDS_Edge  E) {
    return OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_Radius__SWIG_1(swigCPtr, this, IC, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Assigns Radius as the radius of the fillet on the edge E
   */
  public void SetRadius(double Radius, int IC,  TopoDS_Edge  E) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_SetRadius__SWIG_4(swigCPtr, this, Radius, IC, TopoDS_Edge.getCPtr(E), E);
  }

  public void SetRadius(double Radius, int IC,  TopoDS_Vertex  V) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_SetRadius__SWIG_5(swigCPtr, this, Radius, IC, TopoDS_Vertex.getCPtr(V), V);
  }

  public long GetBounds(int IC,  TopoDS_Edge  E, double[] F, double[] L) {
    return OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_GetBounds(swigCPtr, this, IC, TopoDS_Edge.getCPtr(E), E, F, L);
  }

  public  Law_Function  GetLaw(int IC,  TopoDS_Edge  E) {
    return new Law_Function ( OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_GetLaw(swigCPtr, this, IC, TopoDS_Edge.getCPtr(E), E), true );
  }

  public void SetLaw(int IC,  TopoDS_Edge  E,  Law_Function  L) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_SetLaw(swigCPtr, this, IC, TopoDS_Edge.getCPtr(E), E,  Law_Function.getCPtr(L) , L);
  }

  /**
   *  Assigns FShape as the type of fillet shape built by this algorithm.
   */
  public void SetFilletShape(ChFi3d_FilletShape FShape) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_SetFilletShape(swigCPtr, this, FShape.swigValue());
  }

  /**
   *  Returns the type of fillet shape built by this algorithm.
   */
  public ChFi3d_FilletShape GetFilletShape() {
    return ChFi3d_FilletShape.swigToEnum(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_GetFilletShape(swigCPtr, this));
  }

  /**
   *  returns the number of surfaces
   *  after the shape creation.
   */
  public int NbSurfaces() {
    return OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_NbSurfaces(swigCPtr, this);
  }

  /**
   *  Return the faces created for surface <I>.
   */
  public  TopTools_ListOfShape  NewFaces(int I) {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_NewFaces(swigCPtr, this, I), false, this);
    return ret;
  }

  /**
   *  Returns the number of contours where the computation
   *  of the fillet failed
   */
  public int NbFaultyContours() {
    return OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_NbFaultyContours(swigCPtr, this);
  }

  /**
   *  for each I in [1.. NbFaultyContours] returns the index IC of
   *  the contour where the computation of the fillet failed.
   *  the method NbEdges(IC) gives the number of edges in the contour IC
   *  the method Edge(IC,ie) gives the edge number ie of the contour IC
   */
  public int FaultyContour(int I) {
    return OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_FaultyContour(swigCPtr, this, I);
  }

  /**
   *  returns the number of surfaces which have been
   *  computed on the contour IC
   */
  public int NbComputedSurfaces(int IC) {
    return OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_NbComputedSurfaces(swigCPtr, this, IC);
  }

  public  Geom_Surface  ComputedSurface(int IC, int IS) {
    return new Geom_Surface ( OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_ComputedSurface(swigCPtr, this, IC, IS), true );
  }

  /**
   *  returns the number of vertices where the computation failed
   */
  public int NbFaultyVertices() {
    return OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_NbFaultyVertices(swigCPtr, this);
  }

  /**
   *  returns the vertex where the computation failed
   */
  public TopoDS_Vertex FaultyVertex(int IV) {
    return new TopoDS_Vertex(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_FaultyVertex(swigCPtr, this, IV), true);
  }

  /**
   *  returns true if a part of the result has been computed
   *  if the filling in a corner failed a shape with a hole is returned
   */
  public long HasResult() {
    return OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_HasResult(swigCPtr, this);
  }

  /**
   *  if (HasResult()) returns the partial result
   */
  public TopoDS_Shape BadShape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_BadShape(swigCPtr, this), true);
  }

  /**
   *  returns the status concerning the contour IC in case of error
   *  ChFiDS_Ok : the computation is Ok
   *  ChFiDS_StartsolFailure : the computation can't start, perhaps the
   *  the radius is too big
   *  ChFiDS_TwistedSurface : the computation failed because of a twisted
   *  surface
   *  ChFiDS_WalkingFailure : there is a problem in the walking
   *  ChFiDS_Error:  other error different from above
   */
  public ChFiDS_ErrorStatus StripeStatus(int IC) {
    return ChFiDS_ErrorStatus.swigToEnum(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet_StripeStatus(swigCPtr, this, IC));
  }

}
