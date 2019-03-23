package opencascade;

/**
 *  Provides methods for fixing wireframe of shape
 */
public class ShapeFix_Wireframe extends ShapeFix_Root {
  ShapeFix_Wireframe(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public ShapeFix_Wireframe() {
    this(OCCwrapJavaJNI.new_ShapeFix_Wireframe__SWIG_0(), true);
  }

  public ShapeFix_Wireframe( TopoDS_Shape  shape) {
    this(OCCwrapJavaJNI.new_ShapeFix_Wireframe__SWIG_1(TopoDS_Shape.getCPtr(shape), shape), true);
  }

  /**
   *  Clears all statuses
   */
  public void ClearStatuses() {
    OCCwrapJavaJNI.ShapeFix_Wireframe_ClearStatuses(swigCPtr, this);
  }

  /**
   *  Loads a shape, resets statuses
   */
  public void Load( TopoDS_Shape  shape) {
    OCCwrapJavaJNI.ShapeFix_Wireframe_Load(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape);
  }

  /**
   *  Fixes gaps between ends of curves of adjacent edges
   *  (both 3d and pcurves) in wires
   *  If precision is 0.0, uses Precision::Confusion().
   */
  public long FixWireGaps() {
    return OCCwrapJavaJNI.ShapeFix_Wireframe_FixWireGaps(swigCPtr, this);
  }

  /**
   *  Fixes small edges in shape by merging adjacent edges
   *  If precision is 0.0, uses Precision::Confusion().
   */
  public long FixSmallEdges() {
    return OCCwrapJavaJNI.ShapeFix_Wireframe_FixSmallEdges(swigCPtr, this);
  }

  /**
   *  Auxiliary tool for FixSmallEdges which checks for small edges and fills the maps.
   *  Returns True if at least one small edge has been found.
   */
  public long CheckSmallEdges( TopTools_MapOfShape  theSmallEdges,  TopTools_DataMapOfShapeListOfShape  theEdgeToFaces,  TopTools_DataMapOfShapeListOfShape  theFaceWithSmall,  TopTools_MapOfShape  theMultyEdges) {
    return OCCwrapJavaJNI.ShapeFix_Wireframe_CheckSmallEdges(swigCPtr, this, TopTools_MapOfShape.getCPtr(theSmallEdges), theSmallEdges, TopTools_DataMapOfShapeListOfShape.getCPtr(theEdgeToFaces), theEdgeToFaces, TopTools_DataMapOfShapeListOfShape.getCPtr(theFaceWithSmall), theFaceWithSmall, TopTools_MapOfShape.getCPtr(theMultyEdges), theMultyEdges);
  }

  /**
   *  Auxiliary tool for FixSmallEdges which merges small edges.
   *  If theModeDrop is equal to Standard_True then small edges,
   *  which cannot be connected with adjacent edges are dropped.
   *  Otherwise they are kept.
   *  theLimitAngle specifies maximum allowed tangency
   *  discontinuity between adjacent edges.
   *  If theLimitAngle is equal to -1, this angle is not taken into account.
   */
  public long MergeSmallEdges( TopTools_MapOfShape  theSmallEdges,  TopTools_DataMapOfShapeListOfShape  theEdgeToFaces,  TopTools_DataMapOfShapeListOfShape  theFaceWithSmall,  TopTools_MapOfShape  theMultyEdges, long theModeDrop, double theLimitAngle) {
    return OCCwrapJavaJNI.ShapeFix_Wireframe_MergeSmallEdges__SWIG_0(swigCPtr, this, TopTools_MapOfShape.getCPtr(theSmallEdges), theSmallEdges, TopTools_DataMapOfShapeListOfShape.getCPtr(theEdgeToFaces), theEdgeToFaces, TopTools_DataMapOfShapeListOfShape.getCPtr(theFaceWithSmall), theFaceWithSmall, TopTools_MapOfShape.getCPtr(theMultyEdges), theMultyEdges, theModeDrop, theLimitAngle);
  }

  public long MergeSmallEdges( TopTools_MapOfShape  theSmallEdges,  TopTools_DataMapOfShapeListOfShape  theEdgeToFaces,  TopTools_DataMapOfShapeListOfShape  theFaceWithSmall,  TopTools_MapOfShape  theMultyEdges, long theModeDrop) {
    return OCCwrapJavaJNI.ShapeFix_Wireframe_MergeSmallEdges__SWIG_1(swigCPtr, this, TopTools_MapOfShape.getCPtr(theSmallEdges), theSmallEdges, TopTools_DataMapOfShapeListOfShape.getCPtr(theEdgeToFaces), theEdgeToFaces, TopTools_DataMapOfShapeListOfShape.getCPtr(theFaceWithSmall), theFaceWithSmall, TopTools_MapOfShape.getCPtr(theMultyEdges), theMultyEdges, theModeDrop);
  }

  public long MergeSmallEdges( TopTools_MapOfShape  theSmallEdges,  TopTools_DataMapOfShapeListOfShape  theEdgeToFaces,  TopTools_DataMapOfShapeListOfShape  theFaceWithSmall,  TopTools_MapOfShape  theMultyEdges) {
    return OCCwrapJavaJNI.ShapeFix_Wireframe_MergeSmallEdges__SWIG_2(swigCPtr, this, TopTools_MapOfShape.getCPtr(theSmallEdges), theSmallEdges, TopTools_DataMapOfShapeListOfShape.getCPtr(theEdgeToFaces), theEdgeToFaces, TopTools_DataMapOfShapeListOfShape.getCPtr(theFaceWithSmall), theFaceWithSmall, TopTools_MapOfShape.getCPtr(theMultyEdges), theMultyEdges);
  }

  /**
   *  Decodes the status of the last FixWireGaps.
   *  OK - No gaps were found
   *  DONE1 - Some gaps in 3D were fixed
   *  DONE2 - Some gaps in 2D were fixed
   *  FAIL1 - Failed to fix some gaps in 3D
   *  FAIL2 - Failed to fix some gaps in 2D
   */
  public long StatusWireGaps(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeFix_Wireframe_StatusWireGaps(swigCPtr, this, status.swigValue());
  }

  /**
   *  Decodes the status of the last FixSmallEdges.
   *  OK - No small edges were found
   *  DONE1 - Some small edges were fixed
   *  FAIL1 - Failed to fix some small edges
   */
  public long StatusSmallEdges(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeFix_Wireframe_StatusSmallEdges(swigCPtr, this, status.swigValue());
  }

  public TopoDS_Shape Shape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeFix_Wireframe_Shape(swigCPtr, this), true);
  }

  public long[] ModeDropSmallEdges() {return OCCwrapJavaJNI.ShapeFix_Wireframe_ModeDropSmallEdges(swigCPtr, this);}

  /**
   *  Set limit angle for merging edges.
   */
  public void SetLimitAngle(double theLimitAngle) {
    OCCwrapJavaJNI.ShapeFix_Wireframe_SetLimitAngle(swigCPtr, this, theLimitAngle);
  }

  /**
   *  Get limit angle for merging edges.
   */
  public double LimitAngle() {
    return OCCwrapJavaJNI.ShapeFix_Wireframe_LimitAngle(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeFix_Wireframe_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_Wireframe_get_type_descriptor(), true );
  }

  public static  ShapeFix_Wireframe  DownCast( Standard_Transient  T) {
    return new ShapeFix_Wireframe ( OCCwrapJavaJNI.ShapeFix_Wireframe_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_Wireframe_TypeOf(), true );
  }

}
