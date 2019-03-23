package opencascade;

/**
 *  N-Side Filling
 *  This algorithm avoids to build a face from:
 *  * a set of edges defining the bounds of the face and some
 *  constraints the surface of the face has to satisfy
 *  * a set of edges and points defining some constraints
 *  the support surface has to satisfy
 *  * an initial surface to deform for satisfying the constraints
 *  * a set of parameters to control the constraints.
 * 
 *  The support surface of the face is computed by deformation
 *  of the initial surface in order to satisfy the given constraints.
 *  The set of bounding edges defines the wire of the face.
 * 
 *  If no initial surface is given, the algorithm computes it
 *  automatically.
 *  If the set of edges is not connected (Free constraint)
 *  missing edges are automatically computed.
 * 
 *  Limitations:
 *  * If some constraints are not compatible
 *  The algorithm does not take them into account.
 *  So the constraints will not be satisfyed in an area containing
 *  the incompatibilitries.
 *  * The constraints defining the bound of the face have to be
 *  entered in order to have a continuous wire.
 * 
 *  Other Applications:
 *  * Deformation of a face to satisfy internal constraints
 *  * Deformation of a face to improve Gi continuity with
 *  connected faces
 */
public class BRepOffsetAPI_MakeFilling extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepOffsetAPI_MakeFilling(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepOffsetAPI_MakeFilling(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepOffsetAPI_MakeFilling obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepOffsetAPI_MakeFilling(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Constructs a wire filling object defined by
   *  - the energy minimizing criterion Degree
   *  - the number of points on the curve NbPntsOnCur
   *  - the number of iterations NbIter
   *  - the Boolean Anisotropie
   *  - the 2D tolerance Tol2d
   *  - the 3D tolerance Tol3d
   *  - the angular tolerance TolAng
   *  - the tolerance for curvature TolCur
   *  - the highest polynomial degree MaxDeg
   *  - the greatest number of segments MaxSeg.
   *  If the Boolean Anistropie is true, the algorithm's
   *  performance is better in cases where the ratio of the
   *  length U and the length V indicate a great difference
   *  between the two. In other words, when the surface is, for
   *  example, extremely long.
   */
  public BRepOffsetAPI_MakeFilling(int Degree, int NbPtsOnCur, int NbIter, long Anisotropie, double Tol2d, double Tol3d, double TolAng, double TolCurv, int MaxDeg, int MaxSegments) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeFilling__SWIG_0(Degree, NbPtsOnCur, NbIter, Anisotropie, Tol2d, Tol3d, TolAng, TolCurv, MaxDeg, MaxSegments), true);
  }

  public BRepOffsetAPI_MakeFilling(int Degree, int NbPtsOnCur, int NbIter, long Anisotropie, double Tol2d, double Tol3d, double TolAng, double TolCurv, int MaxDeg) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeFilling__SWIG_1(Degree, NbPtsOnCur, NbIter, Anisotropie, Tol2d, Tol3d, TolAng, TolCurv, MaxDeg), true);
  }

  public BRepOffsetAPI_MakeFilling(int Degree, int NbPtsOnCur, int NbIter, long Anisotropie, double Tol2d, double Tol3d, double TolAng, double TolCurv) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeFilling__SWIG_2(Degree, NbPtsOnCur, NbIter, Anisotropie, Tol2d, Tol3d, TolAng, TolCurv), true);
  }

  public BRepOffsetAPI_MakeFilling(int Degree, int NbPtsOnCur, int NbIter, long Anisotropie, double Tol2d, double Tol3d, double TolAng) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeFilling__SWIG_3(Degree, NbPtsOnCur, NbIter, Anisotropie, Tol2d, Tol3d, TolAng), true);
  }

  public BRepOffsetAPI_MakeFilling(int Degree, int NbPtsOnCur, int NbIter, long Anisotropie, double Tol2d, double Tol3d) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeFilling__SWIG_4(Degree, NbPtsOnCur, NbIter, Anisotropie, Tol2d, Tol3d), true);
  }

  public BRepOffsetAPI_MakeFilling(int Degree, int NbPtsOnCur, int NbIter, long Anisotropie, double Tol2d) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeFilling__SWIG_5(Degree, NbPtsOnCur, NbIter, Anisotropie, Tol2d), true);
  }

  public BRepOffsetAPI_MakeFilling(int Degree, int NbPtsOnCur, int NbIter, long Anisotropie) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeFilling__SWIG_6(Degree, NbPtsOnCur, NbIter, Anisotropie), true);
  }

  public BRepOffsetAPI_MakeFilling(int Degree, int NbPtsOnCur, int NbIter) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeFilling__SWIG_7(Degree, NbPtsOnCur, NbIter), true);
  }

  public BRepOffsetAPI_MakeFilling(int Degree, int NbPtsOnCur) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeFilling__SWIG_8(Degree, NbPtsOnCur), true);
  }

  public BRepOffsetAPI_MakeFilling(int Degree) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeFilling__SWIG_9(Degree), true);
  }

  public BRepOffsetAPI_MakeFilling() {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeFilling__SWIG_10(), true);
  }

  /**
   *  Sets the values of Tolerances used to control the constraint.
   *  Tol2d:
   *  Tol3d:   it is the maximum distance allowed between the support surface
   *  and the constraints
   *  TolAng:  it is the maximum angle allowed between the normal of the surface
   *  and the constraints
   *  TolCurv: it is the maximum difference of curvature allowed between
   *  the surface and the constraint
   */
  public void SetConstrParam(double Tol2d, double Tol3d, double TolAng, double TolCurv) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_SetConstrParam__SWIG_0(swigCPtr, this, Tol2d, Tol3d, TolAng, TolCurv);
  }

  public void SetConstrParam(double Tol2d, double Tol3d, double TolAng) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_SetConstrParam__SWIG_1(swigCPtr, this, Tol2d, Tol3d, TolAng);
  }

  public void SetConstrParam(double Tol2d, double Tol3d) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_SetConstrParam__SWIG_2(swigCPtr, this, Tol2d, Tol3d);
  }

  public void SetConstrParam(double Tol2d) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_SetConstrParam__SWIG_3(swigCPtr, this, Tol2d);
  }

  public void SetConstrParam() {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_SetConstrParam__SWIG_4(swigCPtr, this);
  }

  /**
   *  Sets the parameters used for resolution.
   *  The default values of these parameters have been chosen for a good
   *  ratio quality/performance.
   *  Degree:      it is the order of energy criterion to minimize for computing
   *  the deformation of the surface.
   *  The default value is 3
   *  The recommanded value is i+2 where i is the maximum order of the
   *  constraints.
   *  NbPtsOnCur:  it is the average number of points for discretisation
   *  of the edges.
   *  NbIter:      it is the maximum number of iterations of the process.
   *  For each iteration the number of discretisation points is
   *  increased.
   *  Anisotropie:
   */
  public void SetResolParam(int Degree, int NbPtsOnCur, int NbIter, long Anisotropie) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_SetResolParam__SWIG_0(swigCPtr, this, Degree, NbPtsOnCur, NbIter, Anisotropie);
  }

  public void SetResolParam(int Degree, int NbPtsOnCur, int NbIter) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_SetResolParam__SWIG_1(swigCPtr, this, Degree, NbPtsOnCur, NbIter);
  }

  public void SetResolParam(int Degree, int NbPtsOnCur) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_SetResolParam__SWIG_2(swigCPtr, this, Degree, NbPtsOnCur);
  }

  public void SetResolParam(int Degree) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_SetResolParam__SWIG_3(swigCPtr, this, Degree);
  }

  public void SetResolParam() {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_SetResolParam__SWIG_4(swigCPtr, this);
  }

  /**
   *  Sets the parameters used to approximate the filling
   *  surface. These include:
   *  - MaxDeg - the highest degree which the polynomial
   *  defining the filling surface can have
   *  - MaxSegments - the greatest number of segments
   *  which the filling surface can have.
   */
  public void SetApproxParam(int MaxDeg, int MaxSegments) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_SetApproxParam__SWIG_0(swigCPtr, this, MaxDeg, MaxSegments);
  }

  public void SetApproxParam(int MaxDeg) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_SetApproxParam__SWIG_1(swigCPtr, this, MaxDeg);
  }

  public void SetApproxParam() {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_SetApproxParam__SWIG_2(swigCPtr, this);
  }

  /**
   *  Loads the initial surface Surf to
   *  begin the construction of the surface.
   *  This optional function is useful if the surface resulting from
   *  construction for the algorithm is likely to be complex.
   *  The support surface of the face under construction is computed by a
   *  deformation of Surf which satisfies the given constraints.
   *  The set of bounding edges defines the wire of the face.
   *  If no initial surface is given, the algorithm computes it
   *  automatically. If the set of edges is not connected (Free constraint),
   *  missing edges are automatically computed.
   *  Important: the initial surface must have orthogonal local coordinates,
   *  i.e. partial derivatives dS/du and dS/dv must be orthogonal
   *  at each point of surface.
   *  If this condition breaks, distortions of resulting surface
   *  are possible.
   */
  public void LoadInitSurface( TopoDS_Face  Surf) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_LoadInitSurface(swigCPtr, this, TopoDS_Face.getCPtr(Surf), Surf);
  }

  /**
   *  Adds a new constraint which also defines an edge of the wire
   *  of the face
   *  Order: Order of the constraint:
   *  GeomAbs_C0 : the surface has to pass by 3D representation
   *  of the edge
   *  GeomAbs_G1 : the surface has to pass by 3D representation
   *  of the edge and to respect tangency with the first
   *  face of the edge
   *  GeomAbs_G2 : the surface has to pass by 3D representation
   *  of the edge and to respect tangency and curvature
   *  with the first face of the edge.
   *  Raises ConstructionError if the edge has no representation on a face and Order is
   *  GeomAbs_G1 or GeomAbs_G2.
   */
  public int Add( TopoDS_Edge  Constr, GeomAbs_Shape Order, long IsBound) {
    return OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_Add__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(Constr), Constr, Order.swigValue(), IsBound);
  }

  /**
   *  Adds a new constraint which also defines an edge of the wire
   *  of the face
   *  Order: Order of the constraint:
   *  GeomAbs_C0 : the surface has to pass by 3D representation
   *  of the edge
   *  GeomAbs_G1 : the surface has to pass by 3D representation
   *  of the edge and to respect tangency with the
   *  given face
   *  GeomAbs_G2 : the surface has to pass by 3D representation
   *  of the edge and to respect tangency and curvature
   *  with the given face.
   *  Raises ConstructionError if the edge has no 2d representation on the given face
   */
  public int Add( TopoDS_Edge  Constr, GeomAbs_Shape Order) {
    return OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_Add__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(Constr), Constr, Order.swigValue());
  }

  /**
   *  Adds a free constraint on a face. The corresponding edge has to
   *  be automatically recomputed. It is always a bound.
   */
  public int Add( TopoDS_Edge  Constr,  TopoDS_Face  Support, GeomAbs_Shape Order, long IsBound) {
    return OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_Add__SWIG_2(swigCPtr, this, TopoDS_Edge.getCPtr(Constr), Constr, TopoDS_Face.getCPtr(Support), Support, Order.swigValue(), IsBound);
  }

  /**
   *  Adds a punctual constraint.
   */
  public int Add( TopoDS_Edge  Constr,  TopoDS_Face  Support, GeomAbs_Shape Order) {
    return OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_Add__SWIG_3(swigCPtr, this, TopoDS_Edge.getCPtr(Constr), Constr, TopoDS_Face.getCPtr(Support), Support, Order.swigValue());
  }

  /**
   *  Adds a punctual constraint.
   */
  public int Add( TopoDS_Face  Support, GeomAbs_Shape Order) {
    return OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_Add__SWIG_4(swigCPtr, this, TopoDS_Face.getCPtr(Support), Support, Order.swigValue());
  }

  public int Add( gp_Pnt  Point) {
    return OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_Add__SWIG_5(swigCPtr, this, gp_Pnt.getCPtr(Point), Point);
  }

  public int Add(double U, double V,  TopoDS_Face  Support, GeomAbs_Shape Order) {
    return OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_Add__SWIG_6(swigCPtr, this, U, V, TopoDS_Face.getCPtr(Support), Support, Order.swigValue());
  }

  /**
   *  Returns the maximum distance between the result and
   *  the constraints. This is set at construction time.
   */
  public double G0Error() {
    return OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_G0Error__SWIG_0(swigCPtr, this);
  }

  /**
   *  Returns the maximum angle between the result and the
   *  constraints. This is set at construction time.
   */
  public double G1Error() {
    return OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_G1Error__SWIG_0(swigCPtr, this);
  }

  /**
   *  Returns the maximum angle between the result and the
   *  constraints. This is set at construction time.
   */
  public double G2Error() {
    return OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_G2Error__SWIG_0(swigCPtr, this);
  }

  /**
   *  Returns the maximum distance attained between the
   *  result and the constraint Index. This is set at construction time.
   */
  public double G0Error(int Index) {
    return OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_G0Error__SWIG_1(swigCPtr, this, Index);
  }

  /**
   *  Returns the maximum angle between the result and the
   *  constraints. This is set at construction time.
   */
  public double G1Error(int Index) {
    return OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_G1Error__SWIG_1(swigCPtr, this, Index);
  }

  /**
   *  Returns the greatest difference in curvature found
   *  between the result and the constraint Index.
   */
  public double G2Error(int Index) {
    return OCCwrapJavaJNI.BRepOffsetAPI_MakeFilling_G2Error__SWIG_1(swigCPtr, this, Index);
  }

}
