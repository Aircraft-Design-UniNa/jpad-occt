package opencascade;

/**
 *  This class provides analysis of a wire to be compliant to
 *  CAS.CADE requirements.
 * 
 *  The functionalities provided are the following:
 *  1. consistency of 2d and 3d edge curve senses
 *  2. connection of adjacent edges regarding to:
 *  a. their vertices
 *  b. their pcurves
 *  c. their 3d curves
 *  3. adjacency of the edge vertices to its pcurve and 3d curve
 *  4. if a wire is closed or not (considering its 3d and 2d
 *  contour)
 *  5. if a wire is outer on its face (considering pcurves)
 * 
 *  This class can be used in conjunction with class
 *  ShapeFix_Wire, which will fix the problems detected by this class.
 * 
 *  The methods of the given class match to ones of the class
 *  ShapeFix_Wire, e.g., CheckSmall and FixSmall.
 *  This class also includes some auxilary methods
 *  (e.g., CheckOuterBound, etc.),
 *  which have no pair in ShapeFix_Wire.
 * 
 *  Like methods of ShapeFix_Wire the ones of this class are
 *  grouped into two levels:
 *  - Public which are recommended for use (the most global
 *  method is Perform),
 *  - Advanced, for optional use only
 * 
 *  For analyzing result of Public API checking methods use
 *  corresponding Status... method.
 *  The 'advanced' functions share the single status field which
 *  contains the result of the last performed 'advanced' method.
 *  It is quried by the method LastCheckStatus().
 * 
 *  In order to prepare an analyzer, it is necessary to load a wire,
 *  set face and precision.
 */
public class ShapeAnalysis_Wire extends Standard_Transient {
  ShapeAnalysis_Wire(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor
   */
  public ShapeAnalysis_Wire() {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_Wire__SWIG_0(), true);
  }

  /**
   *  Creates object with standard TopoDS_Wire, face
   *  and precision
   */
  public ShapeAnalysis_Wire( TopoDS_Wire  wire,  TopoDS_Face  face, double precision) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_Wire__SWIG_1(TopoDS_Wire.getCPtr(wire), wire, TopoDS_Face.getCPtr(face), face, precision), true);
  }

  /**
   *  Creates the object with WireData object, face
   *  and precision
   */
  public ShapeAnalysis_Wire( ShapeExtend_WireData  sbwd,  TopoDS_Face  face, double precision) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_Wire__SWIG_2( ShapeExtend_WireData.getCPtr(sbwd) , sbwd, TopoDS_Face.getCPtr(face), face, precision), true);
  }

  /**
   *  Initializes the object with standard TopoDS_Wire, face
   *  and precision
   */
  public void Init( TopoDS_Wire  wire,  TopoDS_Face  face, double precision) {
    OCCwrapJavaJNI.ShapeAnalysis_Wire_Init__SWIG_0(swigCPtr, this, TopoDS_Wire.getCPtr(wire), wire, TopoDS_Face.getCPtr(face), face, precision);
  }

  /**
   *  Initializes the object with WireData object, face
   *  and precision
   */
  public void Init( ShapeExtend_WireData  sbwd,  TopoDS_Face  face, double precision) {
    OCCwrapJavaJNI.ShapeAnalysis_Wire_Init__SWIG_1(swigCPtr, this,  ShapeExtend_WireData.getCPtr(sbwd) , sbwd, TopoDS_Face.getCPtr(face), face, precision);
  }

  /**
   *  Loads the object with standard TopoDS_Wire
   */
  public void Load( TopoDS_Wire  wire) {
    OCCwrapJavaJNI.ShapeAnalysis_Wire_Load__SWIG_0(swigCPtr, this, TopoDS_Wire.getCPtr(wire), wire);
  }

  /**
   *  Loads the object with WireData object
   */
  public void Load( ShapeExtend_WireData  sbwd) {
    OCCwrapJavaJNI.ShapeAnalysis_Wire_Load__SWIG_1(swigCPtr, this,  ShapeExtend_WireData.getCPtr(sbwd) , sbwd);
  }

  /**
   *  Loads the face the wire lies on
   */
  public void SetFace( TopoDS_Face  face) {
    OCCwrapJavaJNI.ShapeAnalysis_Wire_SetFace(swigCPtr, this, TopoDS_Face.getCPtr(face), face);
  }

  /**
   *  Loads the surface the wire lies on
   */
  public void SetSurface( Geom_Surface  surface) {
    OCCwrapJavaJNI.ShapeAnalysis_Wire_SetSurface__SWIG_0(swigCPtr, this,  Geom_Surface.getCPtr(surface) , surface);
  }

  /**
   *  Loads the surface the wire lies on
   */
  public void SetSurface( Geom_Surface  surface,  TopLoc_Location  location) {
    OCCwrapJavaJNI.ShapeAnalysis_Wire_SetSurface__SWIG_1(swigCPtr, this,  Geom_Surface.getCPtr(surface) , surface, TopLoc_Location.getCPtr(location), location);
  }

  public void SetPrecision(double precision) {
    OCCwrapJavaJNI.ShapeAnalysis_Wire_SetPrecision(swigCPtr, this, precision);
  }

  /**
   *  Unsets all the status and distance fields
   *  wire, face and precision are not cleared
   */
  public void ClearStatuses() {
    OCCwrapJavaJNI.ShapeAnalysis_Wire_ClearStatuses(swigCPtr, this);
  }

  /**
   *  Returns True if wire is loaded and has number of edges >0
   */
  public long IsLoaded() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_IsLoaded(swigCPtr, this);
  }

  /**
   *  Returns True if IsLoaded and underlying face is not null
   */
  public long IsReady() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_IsReady(swigCPtr, this);
  }

  /**
   *  Returns the value of precision
   */
  public double Precision() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_Precision(swigCPtr, this);
  }

  public  ShapeExtend_WireData  WireData() {
    return new ShapeExtend_WireData ( OCCwrapJavaJNI.ShapeAnalysis_Wire_WireData(swigCPtr, this), true );
  }

  /**
   *  Returns the number of edges in the wire, or 0 if it is not loaded
   */
  public int NbEdges() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_NbEdges(swigCPtr, this);
  }

  /**
   *  Returns the working face
   */
  public  TopoDS_Face  Face() {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.ShapeAnalysis_Wire_Face(swigCPtr, this), true);
    return ret;
  }

  public  ShapeAnalysis_Surface  Surface() {
    return new ShapeAnalysis_Surface ( OCCwrapJavaJNI.ShapeAnalysis_Wire_Surface(swigCPtr, this), true );
  }

  /**
   *  Performs all the checks in the following order :
   *  CheckOrder, CheckSmall, CheckConected, CheckEdgeCurves,
   *  CheckDegenerated, CheckSelfIntersection, CheckLacking,
   *  CheckClosed
   *  Returns: True if at least one method returned True;
   *  For deeper analysis use Status...(status) methods
   */
  public long Perform() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_Perform(swigCPtr, this);
  }

  /**
   *  Calls CheckOrder and returns False if wire is already
   *  ordered (tail-to-head), True otherwise
   *  Flag <isClosed> defines if the wire is closed or not
   *  Flag <mode3d> defines which mode is used (3d or 2d)
   */
  public long CheckOrder(long isClosed, long mode3d) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckOrder__SWIG_0(swigCPtr, this, isClosed, mode3d);
  }

  /**
   *  Analyzes the order of the edges in the wire,
   *  uses class WireOrder for that purpose.
   *  Flag <isClosed> defines if the wire is closed or not
   *  Flag <mode3d> defines which mode is used (3d or 2d)
   *  Returns False if wire is already ordered (tail-to-head),
   *  True otherwise.
   *  Use returned WireOrder object for deeper analysis.
   *  Status:
   *  OK   : the same edges orientation, the same edges sequence
   *  DONE1: the same edges orientation, not the same edges sequence
   *  DONE2: as DONE1 and gaps more than myPrecision
   *  DONE3: not the same edges orientation (some need to be reversed)
   *  DONE4: as DONE3 and gaps more than myPrecision
   *  FAIL : algorithm failed (could not detect order)
   */
  public long CheckOrder(long isClosed) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckOrder__SWIG_1(swigCPtr, this, isClosed);
  }

  public long CheckOrder() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckOrder__SWIG_2(swigCPtr, this);
  }

  /**
   *  Calls to CheckConnected for each edge
   *  Returns: True if at least one pair of disconnected edges (not sharing the
   *  same vertex) was detected
   */
  public long CheckConnected(double prec) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckConnected__SWIG_0(swigCPtr, this, prec);
  }

  /**
   *  Checks connected edges (num-th and preceeding).
   *  Tests with starting preci from <SBWD> or  with <prec> if
   *  it is greater.
   *  Considers Vertices.
   *  Returns: False if edges are connected by the common vertex, else True
   *  Status  :
   *  OK    : Vertices (end of num-1 th edge and start on num-th one)
   *  are already the same
   *  DONE1 : Absolutely confused (gp::Resolution)
   *  DONE2 : Confused at starting <preci> from <SBWD>
   *  DONE3 : Confused at <prec> but not <preci>
   *  FAIL1 : Not confused
   *  FAIL2 : Not confused but confused with <preci> if reverse num-th edge
   */
  public long CheckConnected() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckConnected__SWIG_1(swigCPtr, this);
  }

  /**
   *  Calls to CheckSmall for each edge
   *  Returns: True if at least one small edge was detected
   */
  public long CheckSmall(double precsmall) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckSmall__SWIG_0(swigCPtr, this, precsmall);
  }

  /**
   *  Checks if an edge has a length not greater than myPreci or
   *  precsmall (if it is smaller)
   *  Returns: False if its length is greater than precision
   *  Status:
   *  OK   : edge is not small or degenerated
   *  DONE1: edge is small, vertices are the same
   *  DONE2: edge is small, vertices are not the same
   *  FAIL : no 3d curve and pcurve
   */
  public long CheckSmall() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckSmall__SWIG_1(swigCPtr, this);
  }

  /**
   *  Checks edges geometry (consitency of 2d and 3d senses, adjasment
   *  of curves to the vertices, etc.).
   *  The order of the checks :
   *  Call ShapeAnalysis_Wire to check:
   *  ShapeAnalysis_Edge::CheckCurve3dWithPCurve  (1),
   *  ShapeAnalysis_Edge::CheckVertcesWithPCurve  (2),
   *  ShapeAnalysis_Edge::CheckVertcesWithCurve3d (3),
   *  CheckSeam                                   (4)
   *  Additional:
   *  CheckGap3d                                  (5),
   *  CheckGap2d                                  (6),
   *  ShapeAnalysis_Edge::CheckSameParameter      (7)
   *  Returns: True if at least one check returned True
   *  Remark:  The numbers in brackets show with what DONEi or FAILi
   *  the status can be queried
   */
  public long CheckEdgeCurves() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckEdgeCurves(swigCPtr, this);
  }

  /**
   *  Calls to CheckDegenerated for each edge
   *  Returns: True if at least one incorrect degenerated edge was detected
   */
  public long CheckDegenerated() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckDegenerated__SWIG_0(swigCPtr, this);
  }

  /**
   *  Checks if wire is closed, performs CheckConnected,
   *  CheckDegenerated and CheckLacking for the first and the last edges
   *  Returns: True if at least one check returned True
   *  Status:
   *  FAIL1 or DONE1: see CheckConnected
   *  FAIL2 or DONE2: see CheckDegenerated
   */
  public long CheckClosed(double prec) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckClosed__SWIG_0(swigCPtr, this, prec);
  }

  public long CheckClosed() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckClosed__SWIG_1(swigCPtr, this);
  }

  /**
   *  Checks self-intersection of the wire (considering pcurves)
   *  Looks for self-intersecting edges and each pair of intersecting
   *  edges.
   *  Warning: It does not check each edge with any other one (only each two
   *  adjacent edges)
   *  The order of the checks :
   *  CheckSelfIntersectingEdge, CheckIntersectingEdges
   *  Returns: True if at least one check returned True
   *  Status:  FAIL1 or DONE1 - see CheckSelfIntersectingEdge
   *  FAIL2 or DONE2 - see CheckIntersectingEdges
   */
  public long CheckSelfIntersection() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckSelfIntersection(swigCPtr, this);
  }

  /**
   *  Calls to CheckLacking for each edge
   *  Returns: True if at least one lacking edge was detected
   */
  public long CheckLacking() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckLacking__SWIG_0(swigCPtr, this);
  }

  public long CheckGaps3d() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckGaps3d(swigCPtr, this);
  }

  public long CheckGaps2d() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckGaps2d(swigCPtr, this);
  }

  public long CheckCurveGaps() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckCurveGaps(swigCPtr, this);
  }

  public long CheckOrder(ShapeAnalysis_WireOrder sawo, long isClosed, long mode3d) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckOrder__SWIG_3(swigCPtr, this, ShapeAnalysis_WireOrder.getCPtr(sawo), sawo, isClosed, mode3d);
  }

  public long CheckOrder(ShapeAnalysis_WireOrder sawo, long isClosed) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckOrder__SWIG_4(swigCPtr, this, ShapeAnalysis_WireOrder.getCPtr(sawo), sawo, isClosed);
  }

  public long CheckOrder(ShapeAnalysis_WireOrder sawo) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckOrder__SWIG_5(swigCPtr, this, ShapeAnalysis_WireOrder.getCPtr(sawo), sawo);
  }

  public long CheckConnected(int num, double prec) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckConnected__SWIG_2(swigCPtr, this, num, prec);
  }

  public long CheckConnected(int num) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckConnected__SWIG_3(swigCPtr, this, num);
  }

  public long CheckSmall(int num, double precsmall) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckSmall__SWIG_2(swigCPtr, this, num, precsmall);
  }

  public long CheckSmall(int num) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckSmall__SWIG_3(swigCPtr, this, num);
  }

  /**
   *  Checks if a seam pcurves are correct oriented
   *  Returns: False (status OK) if given edge is not a seam or if it is OK
   *  C1 - current pcurve for FORWARD edge,
   *  C2 - current pcurve for REVERSED edge (if returns True they
   *  should be swapped for the seam),
   *  cf, cl - first and last parameters on curves
   *  Status:
   *  OK   : Pcurves are correct or edge is not seam
   *  DONE : Seam pcurves should be swapped
   */
  public long CheckSeam(int num,  Geom2d_Curve  C1,  Geom2d_Curve  C2, double[] cf, double[] cl) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckSeam__SWIG_0(swigCPtr, this, num,  Geom2d_Curve.getCPtr(C1) , C1,  Geom2d_Curve.getCPtr(C2) , C2, cf, cl);
  }

  /**
   *  Checks if a seam pcurves are correct oriented
   *  See previous functions for details
   */
  public long CheckSeam(int num) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckSeam__SWIG_1(swigCPtr, this, num);
  }

  /**
   *  Checks for degenerated edge between two adjacent ones.
   *  Fills parameters dgnr1 and dgnr2 with points in paramterical
   *  space that correspond to the singularity (either gap that
   *  needs to be filled by degenerated edge or that already filled)
   *  Returns: False if no singularity or edge is already degenerated,
   *  otherwise True
   *  Status:
   *  OK   : No surface singularity, or edge is already degenerated
   *  DONE1: Degenerated edge should be inserted (gap in 2D)
   *  DONE2: Edge <num> should be made degenerated (recompute pcurve
   *  and set the flag)
   *  FAIL1: One of edges neighbouring to degenerated one has
   *  no pcurve
   *  FAIL2: Edge marked as degenerated and has no pcurve
   *  but singularity is not detected
   */
  public long CheckDegenerated(int num, gp_Pnt2d dgnr1, gp_Pnt2d dgnr2) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckDegenerated__SWIG_1(swigCPtr, this, num, gp_Pnt2d.getCPtr(dgnr1), dgnr1, gp_Pnt2d.getCPtr(dgnr2), dgnr2);
  }

  /**
   *  Checks for degenerated edge between two adjacent ones.
   *  Remark : Calls previous function
   *  Status : See the function above for details
   */
  public long CheckDegenerated(int num) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckDegenerated__SWIG_2(swigCPtr, this, num);
  }

  /**
   *  Checks gap between edges in 3D (3d curves).
   *  Checks the distance between ends of 3d curves of the num-th
   *  and preceeding edge.
   *  The distance can be queried by MinDistance3d.
   * 
   *  Returns: True if status is DONE
   *  Status:
   *  OK   : Gap is less than myPrecision
   *  DONE : Gap is greater than myPrecision
   *  FAIL : No 3d curve(s) on the edge(s)
   */
  public long CheckGap3d(int num) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckGap3d__SWIG_0(swigCPtr, this, num);
  }

  public long CheckGap3d() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckGap3d__SWIG_1(swigCPtr, this);
  }

  /**
   *  Checks gap between edges in 2D (pcurves).
   *  Checks the distance between ends of pcurves of the num-th
   *  and preceeding edge.
   *  The distance can be queried by MinDistance2d.
   * 
   *  Returns: True if status is DONE
   *  Status:
   *  OK   : Gap is less than parametric precision out of myPrecision
   *  DONE : Gap is greater than parametric precision out of myPrecision
   *  FAIL : No pcurve(s) on the edge(s)
   */
  public long CheckGap2d(int num) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckGap2d__SWIG_0(swigCPtr, this, num);
  }

  public long CheckGap2d() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckGap2d__SWIG_1(swigCPtr, this);
  }

  /**
   *  Checks gap between points on 3D curve and points on surface
   *  generated by pcurve of the num-th edge.
   *  The distance can be queried by MinDistance3d.
   * 
   *  Returns: True if status is DONE
   *  Status:
   *  OK   : Gap is less than myPrecision
   *  DONE : Gap is greater than myPrecision
   *  FAIL : No 3d curve(s) on the edge(s)
   */
  public long CheckCurveGap(int num) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckCurveGap__SWIG_0(swigCPtr, this, num);
  }

  public long CheckCurveGap() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckCurveGap__SWIG_1(swigCPtr, this);
  }

  /**
   *  Checks if num-th edge is self-intersecting.
   *  Self-intersection is reported only if intersection point lies outside
   *  of both end vertices of the edge.
   *  Returns: True if edge is self-intersecting.
   *  If returns True it also fills the sequences of intersection points
   *  and corresponding 3d points (only that are not enclosed by a vertices)
   *  Status:
   *  FAIL1 : No pcurve
   *  FAIL2 : No vertices
   *  DONE1 : Self-intersection found
   */
  public long CheckSelfIntersectingEdge(int num,  IntRes2d_SequenceOfIntersectionPoint  points2d,  TColgp_SequenceOfPnt  points3d) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckSelfIntersectingEdge__SWIG_0(swigCPtr, this, num, IntRes2d_SequenceOfIntersectionPoint.getCPtr(points2d), points2d, TColgp_SequenceOfPnt.getCPtr(points3d), points3d);
  }

  public long CheckSelfIntersectingEdge(int num) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckSelfIntersectingEdge__SWIG_1(swigCPtr, this, num);
  }

  /**
   *  Checks two adjacent edges for intersecting.
   *  Intersection is reported only if intersection point is not enclosed
   *  by the common end vertex of the edges.
   *  Returns: True if intersection is found.
   *  If returns True it also fills the sequences of intersection points,
   *  corresponding 3d points, and errors for them (half-distances between
   *  intersection points in 3d calculated from one and from another edge)
   *  Status:
   *  FAIL1 : No pcurve
   *  FAIL2 : No vertices
   *  DONE1 : Self-intersection found
   */
  public long CheckIntersectingEdges(int num,  IntRes2d_SequenceOfIntersectionPoint  points2d,  TColgp_SequenceOfPnt  points3d,  TColStd_SequenceOfReal  errors) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckIntersectingEdges__SWIG_0(swigCPtr, this, num, IntRes2d_SequenceOfIntersectionPoint.getCPtr(points2d), points2d, TColgp_SequenceOfPnt.getCPtr(points3d), points3d, TColStd_SequenceOfReal.getCPtr(errors), errors);
  }

  /**
   *  Checks two adjacent edges for intersecting.
   *  Remark : Calls the previous method
   *  Status : See the function above for details
   */
  public long CheckIntersectingEdges(int num) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckIntersectingEdges__SWIG_1(swigCPtr, this, num);
  }

  /**
   *  Checks i-th and j-th edges for intersecting.
   *  Remark : See the previous method for details
   */
  public long CheckIntersectingEdges(int num1, int num2,  IntRes2d_SequenceOfIntersectionPoint  points2d,  TColgp_SequenceOfPnt  points3d,  TColStd_SequenceOfReal  errors) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckIntersectingEdges__SWIG_2(swigCPtr, this, num1, num2, IntRes2d_SequenceOfIntersectionPoint.getCPtr(points2d), points2d, TColgp_SequenceOfPnt.getCPtr(points3d), points3d, TColStd_SequenceOfReal.getCPtr(errors), errors);
  }

  /**
   *  Checks i-th and j-th edges for intersecting.
   *  Remark : Calls  previous method.
   *  Status : See the function above for details
   */
  public long CheckIntersectingEdges(int num1, int num2) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckIntersectingEdges__SWIG_3(swigCPtr, this, num1, num2);
  }

  /**
   *  Checks if there is a gap in 2d between edges, not comprised by
   *  the tolerance of their common vertex.
   *  If <Tolerance> is greater than 0. and less than tolerance of
   *  the vertex, then this value is used for check.
   *  Returns: True if not closed gap was detected
   *  p2d1 and p2d2 are the endpoint of <num-1>th edge and start of
   *  the <num>th edge in 2d.
   *  Status:
   *  OK: No edge is lacking (3d and 2d connection)
   *  FAIL1: edges have no vertices (at least one of them)
   *  FAIL2: edges are neither connected by common vertex, nor have
   *  coincided vertices
   *  FAIL1: edges have no pcurves
   *  DONE1: the gap is detected which cannot be closed by the tolerance
   *  of the common vertex (or with value of <Tolerance>)
   *  DONE2: is set (together with DONE1) if gap is detected and the
   *  vector (p2d2 - p2d1) goes in direction opposite to the pcurves
   *  of the edges (if angle is more than 0.9*PI).
   */
  public long CheckLacking(int num, double Tolerance, gp_Pnt2d p2d1, gp_Pnt2d p2d2) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckLacking__SWIG_1(swigCPtr, this, num, Tolerance, gp_Pnt2d.getCPtr(p2d1), p2d1, gp_Pnt2d.getCPtr(p2d2), p2d2);
  }

  /**
   *  Checks if there is a gap in 2D between edges and not comprised by vertex tolerance
   *  The value of SBWD.thepreci is used.
   *  Returns: False if no edge should be inserted
   *  Status:
   *  OK    : No edge is lacking (3d and 2d connection)
   *  DONE1 : The vertex tolerance should be increased only (2d gap is
   *  small)
   *  DONE2 : Edge can be inserted (3d and 2d gaps are large enough)
   */
  public long CheckLacking(int num, double Tolerance) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckLacking__SWIG_2(swigCPtr, this, num, Tolerance);
  }

  public long CheckLacking(int num) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckLacking__SWIG_3(swigCPtr, this, num);
  }

  /**
   *  Checks if wire defines an outer bound on the face
   *  Uses ShapeAnalysis::IsOuterBound for analysis
   *  If <APIMake> is True uses BRepAPI_MakeWire to build the
   *  wire, if False (to be used only when edges share common
   *  vertices) uses BRep_Builder to build the wire
   */
  public long CheckOuterBound(long APIMake) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckOuterBound__SWIG_0(swigCPtr, this, APIMake);
  }

  public long CheckOuterBound() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckOuterBound__SWIG_1(swigCPtr, this);
  }

  /**
   *  Detects a notch
   */
  public long CheckNotchedEdges(int num, int[] shortNum, double[] param, double Tolerance) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckNotchedEdges__SWIG_0(swigCPtr, this, num, shortNum, param, Tolerance);
  }

  public long CheckNotchedEdges(int num, int[] shortNum, double[] param) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckNotchedEdges__SWIG_1(swigCPtr, this, num, shortNum, param);
  }

  /**
   *  Checks if wire has parametric area less than precision.
   */
  public long CheckSmallArea( TopoDS_Wire  theWire) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckSmallArea(swigCPtr, this, TopoDS_Wire.getCPtr(theWire), theWire);
  }

  /**
   *  Checks with what orientation <shape> (wire or edge) can be
   *  connected to the wire.
   *  Tests distances with starting <preci> from <SBWD> (close confusion),
   *  but if given <prec> is greater, tests with <prec> (coarse confusion).
   *  The smallest found distance can be returned by MinDistance3d
   * 
   *  Returns: False if status is FAIL (see below)
   *  Status:
   *  DONE1 : If <shape> follows <SBWD>, direct sense (normal)
   *  DONE2 : If <shape> follows <SBWD>, but if reversed
   *  DONE3 : If <shape> preceeds <SBWD>, direct sense
   *  DONE4 : If <shape> preceeds <SBWD>, but if reversed
   *  FAIL1 : If <shape> is neither an edge nor a wire
   *  FAIL2 : If <shape> cannot be connected to <SBWD>
   * 
   *  DONE5 : To the tail of <SBWD> the <shape> is closer with
   *  direct sense
   *  DONE6 : To the head of <SBWD> the <shape> is closer with
   *  direct sense
   * 
   *  Remark:   Statuses DONE1 - DONE4, FAIL1 - FAIL2 are basic and
   *  describe the nearest connection of the <shape> to <SBWD>.
   *  Statuses DONE5 and DONE6 are advanced and are to be used when
   *  analyzing with what sense (direct or reversed) the <shape>
   *  should be connected to <SBWD>:
   *  For tail of <SBWD> if DONE4 is True <shape> should be direct,
   *  otherwise reversed.
   *  For head of <SBWD> if DONE5 is True <shape> should be direct,
   *  otherwise reversed.
   */
  public long CheckShapeConnect( TopoDS_Shape  shape, double prec) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckShapeConnect__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, prec);
  }

  /**
   *  The same as previous CheckShapeConnect but is more advanced.
   *  It returns the distances between each end of <sbwd> and each
   *  end of <shape>. For example, <tailhead> stores distance
   *  between tail of <sbwd> and head of <shape>
   *  Remark:  First method CheckShapeConnect calls this one
   */
  public long CheckShapeConnect( TopoDS_Shape  shape) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckShapeConnect__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape);
  }

  public long CheckShapeConnect(double[] tailhead, double[] tailtail, double[] headtail, double[] headhead,  TopoDS_Shape  shape, double prec) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckShapeConnect__SWIG_2(swigCPtr, this, tailhead, tailtail, headtail, headhead, TopoDS_Shape.getCPtr(shape), shape, prec);
  }

  public long CheckShapeConnect(double[] tailhead, double[] tailtail, double[] headtail, double[] headhead,  TopoDS_Shape  shape) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckShapeConnect__SWIG_3(swigCPtr, this, tailhead, tailtail, headtail, headhead, TopoDS_Shape.getCPtr(shape), shape);
  }

  /**
   *  Checks existance of loop on wire and return vertices wich are loop vertices
   *  (vertices belonging to a few pairs of edges)
   */
  public long CheckLoop( TopTools_IndexedMapOfShape  aMapLoopVertices,  TopTools_DataMapOfShapeListOfShape  aMapVertexEdges,  TopTools_MapOfShape  aMapSmallEdges,  TopTools_MapOfShape  aMapSeemEdges) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckLoop(swigCPtr, this, TopTools_IndexedMapOfShape.getCPtr(aMapLoopVertices), aMapLoopVertices, TopTools_DataMapOfShapeListOfShape.getCPtr(aMapVertexEdges), aMapVertexEdges, TopTools_MapOfShape.getCPtr(aMapSmallEdges), aMapSmallEdges, TopTools_MapOfShape.getCPtr(aMapSeemEdges), aMapSeemEdges);
  }

  public long CheckTail( TopoDS_Edge  theEdge1,  TopoDS_Edge  theEdge2, double theMaxSine, double theMaxWidth, double theMaxTolerance, TopoDS_Edge theEdge11, TopoDS_Edge theEdge12, TopoDS_Edge theEdge21, TopoDS_Edge theEdge22) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_CheckTail(swigCPtr, this, TopoDS_Edge.getCPtr(theEdge1), theEdge1, TopoDS_Edge.getCPtr(theEdge2), theEdge2, theMaxSine, theMaxWidth, theMaxTolerance, TopoDS_Edge.getCPtr(theEdge11), theEdge11, TopoDS_Edge.getCPtr(theEdge12), theEdge12, TopoDS_Edge.getCPtr(theEdge21), theEdge21, TopoDS_Edge.getCPtr(theEdge22), theEdge22);
  }

  public long StatusOrder(ShapeExtend_Status Status) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_StatusOrder(swigCPtr, this, Status.swigValue());
  }

  public long StatusConnected(ShapeExtend_Status Status) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_StatusConnected(swigCPtr, this, Status.swigValue());
  }

  public long StatusEdgeCurves(ShapeExtend_Status Status) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_StatusEdgeCurves(swigCPtr, this, Status.swigValue());
  }

  public long StatusDegenerated(ShapeExtend_Status Status) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_StatusDegenerated(swigCPtr, this, Status.swigValue());
  }

  public long StatusClosed(ShapeExtend_Status Status) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_StatusClosed(swigCPtr, this, Status.swigValue());
  }

  public long StatusSmall(ShapeExtend_Status Status) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_StatusSmall(swigCPtr, this, Status.swigValue());
  }

  public long StatusSelfIntersection(ShapeExtend_Status Status) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_StatusSelfIntersection(swigCPtr, this, Status.swigValue());
  }

  public long StatusLacking(ShapeExtend_Status Status) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_StatusLacking(swigCPtr, this, Status.swigValue());
  }

  public long StatusGaps3d(ShapeExtend_Status Status) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_StatusGaps3d(swigCPtr, this, Status.swigValue());
  }

  public long StatusGaps2d(ShapeExtend_Status Status) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_StatusGaps2d(swigCPtr, this, Status.swigValue());
  }

  public long StatusCurveGaps(ShapeExtend_Status Status) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_StatusCurveGaps(swigCPtr, this, Status.swigValue());
  }

  /**
   *  Querying the status of the LAST perfomed 'Advanced' checking procedure
   */
  public long LastCheckStatus(ShapeExtend_Status Status) {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_LastCheckStatus(swigCPtr, this, Status.swigValue());
  }

  /**
   *  Returns the last lowest distance in 3D computed by
   *  CheckOrientation, CheckConnected, CheckContinuity3d,
   *  CheckVertex, CheckNewVertex
   */
  public double MinDistance3d() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_MinDistance3d(swigCPtr, this);
  }

  /**
   *  Returns the last lowest distance in 2D-UV computed by
   *  CheckContinuity2d
   */
  public double MinDistance2d() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_MinDistance2d(swigCPtr, this);
  }

  /**
   *  Returns the last maximal distance in 3D computed by
   *  CheckOrientation, CheckConnected, CheckContinuity3d,
   *  CheckVertex, CheckNewVertex, CheckSameParameter
   */
  public double MaxDistance3d() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_MaxDistance3d(swigCPtr, this);
  }

  /**
   *  Returns the last maximal distance in 2D-UV computed by
   *  CheckContinuity2d
   */
  public double MaxDistance2d() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_MaxDistance2d(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeAnalysis_Wire_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeAnalysis_Wire_get_type_descriptor(), true );
  }

  public static  ShapeAnalysis_Wire  DownCast( Standard_Transient  T) {
    return new ShapeAnalysis_Wire ( OCCwrapJavaJNI.ShapeAnalysis_Wire_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeAnalysis_Wire_TypeOf(), true );
  }

}
