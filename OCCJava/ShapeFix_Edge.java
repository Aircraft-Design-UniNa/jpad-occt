package opencascade;

/**
 *  Fixing invalid edge.
 *  Geometrical and/or topological inconsistency:
 *  - no 3d curve or pcurve,
 *  - mismatching orientation of 3d curve and pcurve,
 *  - incorrect SameParameter flag (curve deviation is greater than
 *  edge tolerance),
 *  - not adjacent curves (3d or pcurve) to the vertices.
 */
public class ShapeFix_Edge extends Standard_Transient {
  ShapeFix_Edge(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor
   */
  public ShapeFix_Edge() {
    this(OCCwrapJavaJNI.new_ShapeFix_Edge(), true);
  }

  public  ShapeConstruct_ProjectCurveOnSurface  Projector() {
    return new ShapeConstruct_ProjectCurveOnSurface ( OCCwrapJavaJNI.ShapeFix_Edge_Projector(swigCPtr, this), true );
  }

  public long FixRemovePCurve( TopoDS_Edge  edge,  TopoDS_Face  face) {
    return OCCwrapJavaJNI.ShapeFix_Edge_FixRemovePCurve__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, TopoDS_Face.getCPtr(face), face);
  }

  /**
   *  Removes the pcurve(s) of the edge if it does not match the
   *  vertices
   *  Check is done
   *  Use    : It is to be called when pcurve of an edge can be wrong
   *  (e.g., after import from IGES)
   *  Returns: True, if does not match, removed (status DONE)
   *  False, (status OK) if matches or (status FAIL) if no pcurve,
   *  nothing done
   */
  public long FixRemovePCurve( TopoDS_Edge  edge,  Geom_Surface  surface,  TopLoc_Location  location) {
    return OCCwrapJavaJNI.ShapeFix_Edge_FixRemovePCurve__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom_Surface.getCPtr(surface) , surface, TopLoc_Location.getCPtr(location), location);
  }

  /**
   *  Removes 3d curve of the edge if it does not match the vertices
   *  Returns: True,  if does not match, removed (status DONE)
   *  False, (status OK) if matches or (status FAIL) if no 3d curve,
   *  nothing done
   */
  public long FixRemoveCurve3d( TopoDS_Edge  edge) {
    return OCCwrapJavaJNI.ShapeFix_Edge_FixRemoveCurve3d(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge);
  }

  /**
   *  Tries to build 3d curve of the edge if missing
   *  Use    : It is to be called after FixRemoveCurve3d (if removed) or in any
   *  case when edge can have no 3d curve
   *  Returns: True if 3d curve was added, else False
   *  Status :
   *  OK   : 3d curve exists
   *  FAIL1: BRepLib::BuildCurve3d() has failed
   *  DONE1: 3d curve was added
   */
  public long FixAddCurve3d( TopoDS_Edge  edge) {
    return OCCwrapJavaJNI.ShapeFix_Edge_FixAddCurve3d(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge);
  }

  public long FixVertexTolerance( TopoDS_Edge  edge,  TopoDS_Face  face) {
    return OCCwrapJavaJNI.ShapeFix_Edge_FixVertexTolerance__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, TopoDS_Face.getCPtr(face), face);
  }

  /**
   *  Increases the tolerances of the edge vertices to comprise
   *  the ends of 3d curve and pcurve on the given face
   *  (first method) or all pcurves stored in an edge (second one)
   *  Returns: True, if tolerances have been increased, otherwise False
   *  Status:
   *  OK   : the original tolerances have not been changed
   *  DONE1: the tolerance of first vertex has been increased
   *  DONE2: the tolerance of last  vertex has been increased
   */
  public long FixVertexTolerance( TopoDS_Edge  edge) {
    return OCCwrapJavaJNI.ShapeFix_Edge_FixVertexTolerance__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge);
  }

  public long FixReversed2d( TopoDS_Edge  edge,  TopoDS_Face  face) {
    return OCCwrapJavaJNI.ShapeFix_Edge_FixReversed2d__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, TopoDS_Face.getCPtr(face), face);
  }

  /**
   *  Fixes edge if pcurve is directed opposite to 3d curve
   *  Check is done by call to the function
   *  ShapeAnalysis_Edge::CheckCurve3dWithPCurve()
   *  Warning: For seam edge this method will check and fix the pcurve in only
   *  one direction. Hence, it should be called twice for seam edge:
   *  once with edge orientation FORWARD and once with REVERSED.
   *  Returns: False if nothing done, True if reversed (status DONE)
   *  Status:  OK    - pcurve OK, nothing done
   *  FAIL1 - no pcurve
   *  FAIL2 - no 3d curve
   *  DONE1 - pcurve was reversed
   */
  public long FixReversed2d( TopoDS_Edge  edge,  Geom_Surface  surface,  TopLoc_Location  location) {
    return OCCwrapJavaJNI.ShapeFix_Edge_FixReversed2d__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge,  Geom_Surface.getCPtr(surface) , surface, TopLoc_Location.getCPtr(location), location);
  }

  /**
   *  Tries to make edge SameParameter and sets corresponding
   *  tolerance and SameParameter flag.
   *  First, it makes edge same range if SameRange flag is not set.
   * 
   *  If flag SameParameter is set, this method calls the
   *  function ShapeAnalysis_Edge::CheckSameParameter() that
   *  calculates the maximal deviation of pcurves of the edge from
   *  its 3d curve. If deviation > tolerance, the tolerance of edge
   *  is increased to a value of deviation. If deviation < tolerance
   *  nothing happens.
   * 
   *  If flag SameParameter is not set, this method chooses the best
   *  variant (one that has minimal tolerance), either
   *  a. only after computing deviation (as above) or
   *  b. after calling standard procedure BRepLib::SameParameter
   *  and computing deviation (as above). If <tolerance> > 0, it is
   *  used as parameter for BRepLib::SameParameter, otherwise,
   *  tolerance of the edge is used.
   * 
   *  Use    : Is to be called after all pcurves and 3d curve of the edge are
   *  correctly computed
   *  Remark : SameParameter flag is always set to True after this method
   *  Returns: True, if something done, else False
   *  Status : OK    - edge was initially SameParameter, nothing is done
   *  FAIL1 - computation of deviation of pcurves from 3d curve has failed
   *  FAIL2 - BRepLib::SameParameter() has failed
   *  DONE1 - tolerance of the edge was increased
   *  DONE2 - flag SameParameter was set to True (only if
   *  BRepLib::SameParameter() did not set it)
   *  DONE3 - edge was modified by BRepLib::SameParameter() to SameParameter
   *  DONE4 - not used anymore
   *  DONE5 - if the edge resulting from BRepLib has been chosen, i.e. variant b. above
   *  (only for edges with not set SameParameter)
   */
  public long FixSameParameter( TopoDS_Edge  edge, double tolerance) {
    return OCCwrapJavaJNI.ShapeFix_Edge_FixSameParameter__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, tolerance);
  }

  /**
   *  Tries to make edge SameParameter and sets corresponding
   *  tolerance and SameParameter flag.
   *  First, it makes edge same range if SameRange flag is not set.
   * 
   *  If flag SameParameter is set, this method calls the
   *  function ShapeAnalysis_Edge::CheckSameParameter() that
   *  calculates the maximal deviation of pcurves of the edge from
   *  its 3d curve. If deviation > tolerance, the tolerance of edge
   *  is increased to a value of deviation. If deviation < tolerance
   *  nothing happens.
   * 
   *  If flag SameParameter is not set, this method chooses the best
   *  variant (one that has minimal tolerance), either
   *  a. only after computing deviation (as above) or
   *  b. after calling standard procedure BRepLib::SameParameter
   *  and computing deviation (as above). If <tolerance> > 0, it is
   *  used as parameter for BRepLib::SameParameter, otherwise,
   *  tolerance of the edge is used.
   * 
   *  Use    : Is to be called after all pcurves and 3d curve of the edge are
   *  correctly computed
   *  Remark : SameParameter flag is always set to True after this method
   *  Returns: True, if something done, else False
   *  Status : OK    - edge was initially SameParameter, nothing is done
   *  FAIL1 - computation of deviation of pcurves from 3d curve has failed
   *  FAIL2 - BRepLib::SameParameter() has failed
   *  DONE1 - tolerance of the edge was increased
   *  DONE2 - flag SameParameter was set to True (only if
   *  BRepLib::SameParameter() did not set it)
   *  DONE3 - edge was modified by BRepLib::SameParameter() to SameParameter
   *  DONE4 - not used anymore
   *  DONE5 - if the edge resulting from BRepLib has been chosen, i.e. variant b. above
   *  (only for edges with not set SameParameter)
   */
  public long FixSameParameter( TopoDS_Edge  edge) {
    return OCCwrapJavaJNI.ShapeFix_Edge_FixSameParameter__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge);
  }

  public long FixSameParameter( TopoDS_Edge  edge,  TopoDS_Face  face, double tolerance) {
    return OCCwrapJavaJNI.ShapeFix_Edge_FixSameParameter__SWIG_2(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, TopoDS_Face.getCPtr(face), face, tolerance);
  }

  public long FixSameParameter( TopoDS_Edge  edge,  TopoDS_Face  face) {
    return OCCwrapJavaJNI.ShapeFix_Edge_FixSameParameter__SWIG_3(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, TopoDS_Face.getCPtr(face), face);
  }

  /**
   *  Returns the status (in the form of True/False) of last Fix
   */
  public long Status(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeFix_Edge_Status(swigCPtr, this, status.swigValue());
  }

  /**
   *  Sets context
   */
  public void SetContext( ShapeBuild_ReShape  context) {
    OCCwrapJavaJNI.ShapeFix_Edge_SetContext(swigCPtr, this,  ShapeBuild_ReShape.getCPtr(context) , context);
  }

  public  ShapeBuild_ReShape  Context() {
    return new ShapeBuild_ReShape ( OCCwrapJavaJNI.ShapeFix_Edge_Context(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeFix_Edge_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_Edge_get_type_descriptor(), true );
  }

  public static  ShapeFix_Edge  DownCast( Standard_Transient  T) {
    return new ShapeFix_Edge ( OCCwrapJavaJNI.ShapeFix_Edge_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_Edge_TypeOf(), true );
  }

}
