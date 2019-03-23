package opencascade;

/**
 *  This class provides a set of tools for repairing a wire.
 * 
 *  These are methods Fix...(), organised in two levels:
 * 
 *  Level 1: Advanced - each method in this level fixes one separate problem,
 *  usually dealing with either single edge or connection of the
 *  two adjacent edges. These methods should be used carefully and
 *  called in right sequence, because some of them depend on others.
 * 
 *  Level 2: Public (API) - methods which group several methods of level 1
 *  and call them in a proper sequence in order to make some
 *  consistent set of fixes for a whole wire. It is possible to
 *  control calls to methods of the advanced level from methods of
 *  the public level by use of flags Fix..Mode() (see below).
 * 
 *  Fixes can be made in three ways:
 *  1. Increasing tolerance of an edge or a vertex
 *  2. Changing topology (adding/removing/replacing edge in the wire
 *  and/or replacing the vertex in the edge)
 *  3. Changing geometry (shifting vertex or adjusting ends of edge
 *  curve to vertices, or recomputing curves of the edge)
 * 
 *  When fix can be made in more than one way (e.g., either
 *  by increasing tolerance or shifting a vertex), it is choosen
 *  according to the flags:
 *  ModifyTopologyMode - allows modification of the topology.
 *  This flag can be set when fixing a wire on
 *  the separate (free) face, and should be
 *  unset for face which is part of shell.
 *  ModifyGeometryMode - allows modification of the geometry.
 * 
 *  The order of descriptions of Fix() methods in this CDL
 *  approximately corresponds to the optimal order of calls.
 * 
 *  NOTE: most of fixing methods expect edges in the
 *  ShapeExtend_WireData to be ordered, so it is necessary to make
 *  call to FixReorder() before any other fixes
 * 
 *  ShapeFix_Wire should be initialized prior to any fix by the
 *  following data:
 *  a) Wire (ether TopoDS_Wire or ShapeExtend_Wire)
 *  b) Face or surface
 *  c) Precision
 *  d) Maximal tail angle and width
 *  This can be done either by calling corresponding methods
 *  (LoadWire, SetFace or SetSurface, SetPrecision, SetMaxTailAngle
 *  and SetMaxTailWidth), or
 *  by loading already filled ShapeAnalisis_Wire with method Load
 */
public class ShapeFix_Wire extends ShapeFix_Root {
  ShapeFix_Wire(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty Constructor, creates clear object with default flags
   */
  public ShapeFix_Wire() {
    this(OCCwrapJavaJNI.new_ShapeFix_Wire__SWIG_0(), true);
  }

  /**
   *  Create new object with default flags and prepare it for use
   *  (Loads analyzer with all the data for the wire and face)
   */
  public ShapeFix_Wire( TopoDS_Wire  wire,  TopoDS_Face  face, double prec) {
    this(OCCwrapJavaJNI.new_ShapeFix_Wire__SWIG_1(TopoDS_Wire.getCPtr(wire), wire, TopoDS_Face.getCPtr(face), face, prec), true);
  }

  /**
   *  Sets all modes to default
   */
  public void ClearModes() {
    OCCwrapJavaJNI.ShapeFix_Wire_ClearModes(swigCPtr, this);
  }

  /**
   *  Clears all statuses
   */
  public void ClearStatuses() {
    OCCwrapJavaJNI.ShapeFix_Wire_ClearStatuses(swigCPtr, this);
  }

  /**
   *  Load analyzer with all the data for the wire and face
   *  and drops all fixing statuses
   */
  public void Init( TopoDS_Wire  wire,  TopoDS_Face  face, double prec) {
    OCCwrapJavaJNI.ShapeFix_Wire_Init__SWIG_0(swigCPtr, this, TopoDS_Wire.getCPtr(wire), wire, TopoDS_Face.getCPtr(face), face, prec);
  }

  /**
   *  Load analyzer with all the data already prepared
   *  and drops all fixing statuses
   *  If analyzer contains face, there is no need to set it
   *  by SetFace or SetSurface
   */
  public void Init( ShapeAnalysis_Wire  saw) {
    OCCwrapJavaJNI.ShapeFix_Wire_Init__SWIG_1(swigCPtr, this,  ShapeAnalysis_Wire.getCPtr(saw) , saw);
  }

  /**
   *  Load data for the wire, and drops all fixing statuses
   */
  public void Load( TopoDS_Wire  wire) {
    OCCwrapJavaJNI.ShapeFix_Wire_Load__SWIG_0(swigCPtr, this, TopoDS_Wire.getCPtr(wire), wire);
  }

  /**
   *  Load data for the wire, and drops all fixing statuses
   */
  public void Load( ShapeExtend_WireData  sbwd) {
    OCCwrapJavaJNI.ShapeFix_Wire_Load__SWIG_1(swigCPtr, this,  ShapeExtend_WireData.getCPtr(sbwd) , sbwd);
  }

  /**
   *  Set working face for the wire
   */
  public void SetFace( TopoDS_Face  face) {
    OCCwrapJavaJNI.ShapeFix_Wire_SetFace(swigCPtr, this, TopoDS_Face.getCPtr(face), face);
  }

  /**
   *  Set surface for the wire
   */
  public void SetSurface( Geom_Surface  surf) {
    OCCwrapJavaJNI.ShapeFix_Wire_SetSurface__SWIG_0(swigCPtr, this,  Geom_Surface.getCPtr(surf) , surf);
  }

  /**
   *  Set surface for the wire
   */
  public void SetSurface( Geom_Surface  surf,  TopLoc_Location  loc) {
    OCCwrapJavaJNI.ShapeFix_Wire_SetSurface__SWIG_1(swigCPtr, this,  Geom_Surface.getCPtr(surf) , surf, TopLoc_Location.getCPtr(loc), loc);
  }

  /**
   *  Sets the maximal allowed angle of the tails in radians.
   */
  public void SetMaxTailAngle(double theMaxTailAngle) {
    OCCwrapJavaJNI.ShapeFix_Wire_SetMaxTailAngle(swigCPtr, this, theMaxTailAngle);
  }

  /**
   *  Sets the maximal allowed width of the tails.
   */
  public void SetMaxTailWidth(double theMaxTailWidth) {
    OCCwrapJavaJNI.ShapeFix_Wire_SetMaxTailWidth(swigCPtr, this, theMaxTailWidth);
  }

  /**
   *  Tells if the wire is loaded
   */
  public long IsLoaded() {
    return OCCwrapJavaJNI.ShapeFix_Wire_IsLoaded(swigCPtr, this);
  }

  /**
   *  Tells if the wire and face are loaded
   */
  public long IsReady() {
    return OCCwrapJavaJNI.ShapeFix_Wire_IsReady(swigCPtr, this);
  }

  /**
   *  returns number of edges in the working wire
   */
  public int NbEdges() {
    return OCCwrapJavaJNI.ShapeFix_Wire_NbEdges(swigCPtr, this);
  }

  /**
   *  Makes the resulting Wire (by basic Brep_Builder)
   */
  public TopoDS_Wire Wire() {
    return new TopoDS_Wire(OCCwrapJavaJNI.ShapeFix_Wire_Wire(swigCPtr, this), true);
  }

  /**
   *  Makes the resulting Wire (by BRepAPI_MakeWire)
   */
  public TopoDS_Wire WireAPIMake() {
    return new TopoDS_Wire(OCCwrapJavaJNI.ShapeFix_Wire_WireAPIMake(swigCPtr, this), true);
  }

  public  ShapeAnalysis_Wire  Analyzer() {
    return new ShapeAnalysis_Wire ( OCCwrapJavaJNI.ShapeFix_Wire_Analyzer(swigCPtr, this), true );
  }

  public  ShapeExtend_WireData  WireData() {
    return new ShapeExtend_WireData ( OCCwrapJavaJNI.ShapeFix_Wire_WireData(swigCPtr, this), true );
  }

  /**
   *  returns working face (Analyzer.Face())
   */
  public  TopoDS_Face  Face() {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.ShapeFix_Wire_Face(swigCPtr, this), true);
    return ret;
  }

  public long[] ModifyTopologyMode() {return OCCwrapJavaJNI.ShapeFix_Wire_ModifyTopologyMode(swigCPtr, this);}

  public long[] ModifyGeometryMode() {return OCCwrapJavaJNI.ShapeFix_Wire_ModifyGeometryMode(swigCPtr, this);}

  public int[] ModifyRemoveLoopMode() {return OCCwrapJavaJNI.ShapeFix_Wire_ModifyRemoveLoopMode(swigCPtr, this);}

  public long[] ClosedWireMode() {return OCCwrapJavaJNI.ShapeFix_Wire_ClosedWireMode(swigCPtr, this);}

  public long[] PreferencePCurveMode() {return OCCwrapJavaJNI.ShapeFix_Wire_PreferencePCurveMode(swigCPtr, this);}

  public long[] FixGapsByRangesMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixGapsByRangesMode(swigCPtr, this);}

  public int[] FixReorderMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixReorderMode(swigCPtr, this);}

  public int[] FixSmallMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixSmallMode(swigCPtr, this);}

  public int[] FixConnectedMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixConnectedMode(swigCPtr, this);}

  public int[] FixEdgeCurvesMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixEdgeCurvesMode(swigCPtr, this);}

  public int[] FixDegeneratedMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixDegeneratedMode(swigCPtr, this);}

  public int[] FixSelfIntersectionMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixSelfIntersectionMode(swigCPtr, this);}

  public int[] FixLackingMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixLackingMode(swigCPtr, this);}

  public int[] FixGaps3dMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixGaps3dMode(swigCPtr, this);}

  public int[] FixGaps2dMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixGaps2dMode(swigCPtr, this);}

  public int[] FixReversed2dMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixReversed2dMode(swigCPtr, this);}

  public int[] FixRemovePCurveMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixRemovePCurveMode(swigCPtr, this);}

  public int[] FixAddPCurveMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixAddPCurveMode(swigCPtr, this);}

  public int[] FixRemoveCurve3dMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixRemoveCurve3dMode(swigCPtr, this);}

  public int[] FixAddCurve3dMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixAddCurve3dMode(swigCPtr, this);}

  public int[] FixSeamMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixSeamMode(swigCPtr, this);}

  public int[] FixShiftedMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixShiftedMode(swigCPtr, this);}

  public int[] FixSameParameterMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixSameParameterMode(swigCPtr, this);}

  public int[] FixVertexToleranceMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixVertexToleranceMode(swigCPtr, this);}

  public int[] FixNotchedEdgesMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixNotchedEdgesMode(swigCPtr, this);}

  public int[] FixSelfIntersectingEdgeMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixSelfIntersectingEdgeMode(swigCPtr, this);}

  public int[] FixIntersectingEdgesMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixIntersectingEdgesMode(swigCPtr, this);}

  public int[] FixNonAdjacentIntersectingEdgesMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixNonAdjacentIntersectingEdgesMode(swigCPtr, this);}

  public int[] FixTailMode() {return OCCwrapJavaJNI.ShapeFix_Wire_FixTailMode(swigCPtr, this);}

  /**
   *  This method performs all the available fixes.
   *  If some fix is turned on or off explicitly by the Fix..Mode() flag,
   *  this fix is either called or not depending on that flag.
   *  Else (i.e. if flag is default) fix is called depending on the
   *  situation: some fixes are not called or are limited if order of
   *  edges in the wire is not OK, or depending on modes
   * 
   *  The order of the fixes and default behaviour of Perform() are:
   *  FixReorder
   *  FixSmall (with lockvtx true if ! TopoMode or if wire is not ordered)
   *  FixConnected (if wire is ordered)
   *  FixEdgeCurves (without FixShifted if wire is not ordered)
   *  FixDegenerated (if wire is ordered)
   *  FixSelfIntersection (if wire is ordered and ClosedMode is True)
   *  FixLacking (if wire is ordered)
   */
  public long Perform() {
    return OCCwrapJavaJNI.ShapeFix_Wire_Perform(swigCPtr, this);
  }

  /**
   *  Performs an analysis and reorders edges in the wire using
   *  class WireOrder
   */
  public long FixReorder() {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixReorder__SWIG_0(swigCPtr, this);
  }

  /**
   *  Applies FixSmall(num) to all edges in the wire
   */
  public int FixSmall(long lockvtx, double precsmall) {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixSmall__SWIG_0(swigCPtr, this, lockvtx, precsmall);
  }

  /**
   *  Fixes Null Length Edge to be removed
   *  If an Edge has Null Length (regarding preci, or <precsmall>
   *  - what is smaller), it should be removed
   *  It can be with no problem if its two vertices are the same
   *  Else, if lockvtx is False, it is removed and its end vertex
   *  is put on the preceeding edge
   *  But if lockvtx is True, this edge must be kept ...
   */
  public int FixSmall(long lockvtx) {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixSmall__SWIG_1(swigCPtr, this, lockvtx);
  }

  /**
   *  Applies FixConnected(num) to all edges in the wire
   *  Connection between first and last edges is treated only if
   *  flag ClosedMode is True
   *  If <prec> is -1 then MaxTolerance() is taken.
   */
  public long FixConnected(double prec) {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixConnected__SWIG_0(swigCPtr, this, prec);
  }

  /**
   *  Fixes connected edges (preceeding and current)
   *  Forces Vertices (end of preceeding-begin of current) to be
   *  the same one
   *  Tests with starting preci or, if given greater, <prec>
   *  If <prec> is -1 then MaxTolerance() is taken.
   */
  public long FixConnected() {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixConnected__SWIG_1(swigCPtr, this);
  }

  /**
   *  Groups the fixes dealing with 3d and pcurves of the edges.
   *  The order of the fixes and the default behaviour are:
   *  ShapeFix_Edge::FixReversed2d
   *  ShapeFix_Edge::FixRemovePCurve (only if forced)
   *  ShapeFix_Edge::FixAddPCurve
   *  ShapeFix_Edge::FixRemoveCurve3d (only if forced)
   *  ShapeFix_Edge::FixAddCurve3d
   *  FixSeam,
   *  FixShifted,
   *  ShapeFix_Edge::FixSameParameter
   */
  public long FixEdgeCurves() {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixEdgeCurves(swigCPtr, this);
  }

  /**
   *  Applies FixDegenerated(num) to all edges in the wire
   *  Connection between first and last edges is treated only if
   *  flag ClosedMode is True
   */
  public long FixDegenerated() {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixDegenerated__SWIG_0(swigCPtr, this);
  }

  /**
   *  Applies FixSelfIntersectingEdge(num) and
   *  FixIntersectingEdges(num) to all edges in the wire and
   *  FixIntersectingEdges(num1, num2) for all pairs num1 and num2
   *  such that num2 >= num1 + 2
   *  and removes wrong edges if any
   */
  public long FixSelfIntersection() {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixSelfIntersection(swigCPtr, this);
  }

  /**
   *  Applies FixLacking(num) to all edges in the wire
   *  Connection between first and last edges is treated only if
   *  flag ClosedMode is True
   *  If <force> is False (default), test for connectness is done with
   *  precision of vertex between edges, else it is done with minimal
   *  value of vertex tolerance and Analyzer.Precision().
   *  Hence, <force> will lead to inserting lacking edges in replacement
   *  of vertices which have big tolerances.
   */
  public long FixLacking(long force) {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixLacking__SWIG_0(swigCPtr, this, force);
  }

  /**
   *  Fixes Lacking Edge
   *  Test if two adjucent edges are disconnected in 2d (while
   *  connected in 3d), and in that case either increase tolerance
   *  of the vertex or add a new edge (straight in 2d space), in
   *  order to close wire in 2d.
   *  Returns True if edge was added or tolerance was increased.
   */
  public long FixLacking() {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixLacking__SWIG_1(swigCPtr, this);
  }

  /**
   *  Fixes a wire to be well closed
   *  It performs FixConnected, FixDegenerated and FixLacking between
   *  last and first edges (independingly on flag ClosedMode and modes
   *  for these fixings)
   *  If <prec> is -1 then MaxTolerance() is taken.
   */
  public long FixClosed(double prec) {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixClosed__SWIG_0(swigCPtr, this, prec);
  }

  public long FixClosed() {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixClosed__SWIG_1(swigCPtr, this);
  }

  /**
   *  Fixes gaps between ends of 3d curves on adjacent edges
   *  myPrecision is used to detect the gaps.
   */
  public long FixGaps3d() {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixGaps3d(swigCPtr, this);
  }

  /**
   *  Fixes gaps between ends of pcurves on adjacent edges
   *  myPrecision is used to detect the gaps.
   */
  public long FixGaps2d() {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixGaps2d(swigCPtr, this);
  }

  /**
   *  Reorder edges in the wire as determined by WireOrder
   *  that should be filled and computed before
   */
  public long FixReorder( ShapeAnalysis_WireOrder  wi) {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixReorder__SWIG_1(swigCPtr, this, ShapeAnalysis_WireOrder.getCPtr(wi), wi);
  }

  public long FixSmall(int num, long lockvtx, double precsmall) {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixSmall__SWIG_2(swigCPtr, this, num, lockvtx, precsmall);
  }

  public long FixConnected(int num, double prec) {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixConnected__SWIG_2(swigCPtr, this, num, prec);
  }

  /**
   *  Fixes a seam edge
   *  A Seam edge has two pcurves, one for forward. one for reversed
   *  The forward pcurve must be set as first
   * 
   *  NOTE that correct order of pcurves in the seam edge depends on
   *  its orientation (i.e., on orientation of the wire, method of
   *  exploration of edges etc.).
   *  Since wire represented by the ShapeExtend_WireData is always forward
   *  (orientation is accounted by edges), it will work correct if:
   *  1. Wire created from ShapeExtend_WireData with methods
   *  ShapeExtend_WireData::Wire..() is added into the FORWARD face
   *  (orientation can be applied later)
   *  2. Wire is extracted from the face with orientation not composed
   *  with orientation of the face
   */
  public long FixSeam(int num) {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixSeam(swigCPtr, this, num);
  }

  /**
   *  Fixes edges which have pcurves shifted by whole parameter
   *  range on the closed surface (the case may occur if pcurve
   *  of edge was computed by projecting 3d curve, which goes
   *  along the seam).
   *  It compares each two consequent edges and tries to connect them
   *  if distance between ends is near to range of the surface.
   *  It also can detect and fix the case if all pcurves are connected,
   *  but lie out of parametric bounds of the surface.
   *  In addition to FixShifted from ShapeFix_Wire, more
   *  sophisticated check of degenerate points is performed,
   *  and special cases like sphere given by two meridians
   *  are treated.
   */
  public long FixShifted() {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixShifted(swigCPtr, this);
  }

  /**
   *  Fixes Degenerated Edge
   *  Checks an <num-th> edge or a point between <num>th-1 and <num>th
   *  edges for a singularity on a supporting surface.
   *  If singularity is detected, either adds new degenerated edge
   *  (before <num>th), or makes <num>th edge to be degenerated.
   */
  public long FixDegenerated(int num) {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixDegenerated__SWIG_1(swigCPtr, this, num);
  }

  public long FixLacking(int num, long force) {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixLacking__SWIG_2(swigCPtr, this, num, force);
  }

  public long FixLacking(int num) {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixLacking__SWIG_3(swigCPtr, this, num);
  }

  public long FixNotchedEdges() {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixNotchedEdges(swigCPtr, this);
  }

  /**
   *  Fixes gap between ends of 3d curves on num-1 and num-th edges.
   *  myPrecision is used to detect the gap.
   *  If convert is True, converts curves to bsplines to bend.
   */
  public long FixGap3d(int num, long convert) {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixGap3d__SWIG_0(swigCPtr, this, num, convert);
  }

  public long FixGap3d(int num) {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixGap3d__SWIG_1(swigCPtr, this, num);
  }

  /**
   *  Fixes gap between ends of pcurves on num-1 and num-th edges.
   *  myPrecision is used to detect the gap.
   *  If convert is True, converts pcurves to bsplines to bend.
   */
  public long FixGap2d(int num, long convert) {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixGap2d__SWIG_0(swigCPtr, this, num, convert);
  }

  public long FixGap2d(int num) {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixGap2d__SWIG_1(swigCPtr, this, num);
  }

  public long FixTails() {
    return OCCwrapJavaJNI.ShapeFix_Wire_FixTails(swigCPtr, this);
  }

  public long StatusReorder(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeFix_Wire_StatusReorder(swigCPtr, this, status.swigValue());
  }

  public long StatusSmall(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeFix_Wire_StatusSmall(swigCPtr, this, status.swigValue());
  }

  public long StatusConnected(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeFix_Wire_StatusConnected(swigCPtr, this, status.swigValue());
  }

  public long StatusEdgeCurves(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeFix_Wire_StatusEdgeCurves(swigCPtr, this, status.swigValue());
  }

  public long StatusDegenerated(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeFix_Wire_StatusDegenerated(swigCPtr, this, status.swigValue());
  }

  public long StatusSelfIntersection(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeFix_Wire_StatusSelfIntersection(swigCPtr, this, status.swigValue());
  }

  public long StatusLacking(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeFix_Wire_StatusLacking(swigCPtr, this, status.swigValue());
  }

  public long StatusClosed(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeFix_Wire_StatusClosed(swigCPtr, this, status.swigValue());
  }

  public long StatusGaps3d(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeFix_Wire_StatusGaps3d(swigCPtr, this, status.swigValue());
  }

  public long StatusGaps2d(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeFix_Wire_StatusGaps2d(swigCPtr, this, status.swigValue());
  }

  public long StatusNotches(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeFix_Wire_StatusNotches(swigCPtr, this, status.swigValue());
  }

  /**
   *  Querying the status of perfomed API fixing procedures
   *  Each Status..() methods gives information about the last call to
   *  the corresponding Fix..() method of API level:
   *  OK  : no problems detected; nothing done
   *  DONE: some problem(s) was(were) detected and successfully fixed
   *  FAIL: some problem(s) cannot be fixed
   */
  public long StatusRemovedSegment() {
    return OCCwrapJavaJNI.ShapeFix_Wire_StatusRemovedSegment(swigCPtr, this);
  }

  public long StatusFixTails(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeFix_Wire_StatusFixTails(swigCPtr, this, status.swigValue());
  }

  /**
   *  Queries the status of last call to methods Fix... of
   *  advanced level
   *  For details see corresponding methods; universal statuses are:
   *  OK  : problem not detected; nothing done
   *  DONE: problem was detected and successfully fixed
   *  FAIL: problem cannot be fixed
   */
  public long LastFixStatus(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeFix_Wire_LastFixStatus(swigCPtr, this, status.swigValue());
  }

  public  ShapeFix_Edge  FixEdgeTool() {
    return new ShapeFix_Edge ( OCCwrapJavaJNI.ShapeFix_Wire_FixEdgeTool(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeFix_Wire_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_Wire_get_type_descriptor(), true );
  }

  public static  ShapeFix_Wire  DownCast( Standard_Transient  T) {
    return new ShapeFix_Wire ( OCCwrapJavaJNI.ShapeFix_Wire_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_Wire_TypeOf(), true );
  }

}
