package opencascade;

/**
 *  Divides edges in the wire lying on the face or free wires or
 *  free edges with a criterion.
 *  Splits 3D curve and pcurve(s) of the edge on the face.
 *  Other pcurves which may be associated with the edge are simply
 *  copied.
 *  If 3D curve is splitted then pcurve on the face is splitted as
 *  well, and wice-versa.
 *  Input shape is not modified.
 *  The modifications made are recorded in external context
 *  (ShapeBuild_ReShape). This tool is applied to all edges
 *  before splitting them in order to keep sharing.
 */
public class ShapeUpgrade_WireDivide extends ShapeUpgrade_Tool {
  ShapeUpgrade_WireDivide(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor
   */
  public ShapeUpgrade_WireDivide() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_WireDivide(), true);
  }

  /**
   *  Initializes by wire and face
   */
  public void Init( TopoDS_Wire  W,  TopoDS_Face  F) {
    OCCwrapJavaJNI.ShapeUpgrade_WireDivide_Init__SWIG_0(swigCPtr, this, TopoDS_Wire.getCPtr(W), W, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Initializes by wire and surface
   */
  public void Init( TopoDS_Wire  W,  Geom_Surface  S) {
    OCCwrapJavaJNI.ShapeUpgrade_WireDivide_Init__SWIG_1(swigCPtr, this, TopoDS_Wire.getCPtr(W), W,  Geom_Surface.getCPtr(S) , S);
  }

  /**
   *  Loads working wire
   */
  public void Load( TopoDS_Wire  W) {
    OCCwrapJavaJNI.ShapeUpgrade_WireDivide_Load__SWIG_0(swigCPtr, this, TopoDS_Wire.getCPtr(W), W);
  }

  /**
   *  Creates wire of one edge and calls Load for wire
   */
  public void Load( TopoDS_Edge  E) {
    OCCwrapJavaJNI.ShapeUpgrade_WireDivide_Load__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Sets supporting surface by face
   */
  public void SetFace( TopoDS_Face  F) {
    OCCwrapJavaJNI.ShapeUpgrade_WireDivide_SetFace(swigCPtr, this, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Sets supporting surface
   */
  public void SetSurface( Geom_Surface  S) {
    OCCwrapJavaJNI.ShapeUpgrade_WireDivide_SetSurface__SWIG_0(swigCPtr, this,  Geom_Surface.getCPtr(S) , S);
  }

  /**
   *  Sets supporting surface with location
   */
  public void SetSurface( Geom_Surface  S,  TopLoc_Location  L) {
    OCCwrapJavaJNI.ShapeUpgrade_WireDivide_SetSurface__SWIG_1(swigCPtr, this,  Geom_Surface.getCPtr(S) , S, TopLoc_Location.getCPtr(L), L);
  }

  /**
   *  Computes the resulting wire by splitting all the edges
   *  according to splitting criteria.
   *  All the modifications made are recorded in context
   *  (ShapeBuild_ReShape). This tool is applied to all edges
   *  before splitting them in order to keep sharings.
   *  If no supporting face or surface is defined, only 3d
   *  splitting criteria are used.
   */
  public void Perform() {
    OCCwrapJavaJNI.ShapeUpgrade_WireDivide_Perform(swigCPtr, this);
  }

  /**
   *  Gives the resulting Wire (equal to initial one if not done
   *  or Null if not loaded)
   */
  public  TopoDS_Wire  Wire() {
    TopoDS_Wire ret = new TopoDS_Wire(OCCwrapJavaJNI.ShapeUpgrade_WireDivide_Wire(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Queries status of last call to Perform()
   *  OK - no edges were splitted, wire left untouched
   *  DONE1 - some edges were splitted
   *  FAIL1 - some edges have no 3d curve (skipped)
   *  FAIL2 - some edges have no pcurve (skipped)
   */
  public long Status(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeUpgrade_WireDivide_Status(swigCPtr, this, status.swigValue());
  }

  /**
   *  Sets the tool for splitting 3D curves.
   */
  public void SetSplitCurve3dTool( ShapeUpgrade_SplitCurve3d  splitCurve3dTool) {
    OCCwrapJavaJNI.ShapeUpgrade_WireDivide_SetSplitCurve3dTool(swigCPtr, this,  ShapeUpgrade_SplitCurve3d.getCPtr(splitCurve3dTool) , splitCurve3dTool);
  }

  /**
   *  Sets the tool for splitting pcurves.
   */
  public void SetSplitCurve2dTool( ShapeUpgrade_SplitCurve2d  splitCurve2dTool) {
    OCCwrapJavaJNI.ShapeUpgrade_WireDivide_SetSplitCurve2dTool(swigCPtr, this,  ShapeUpgrade_SplitCurve2d.getCPtr(splitCurve2dTool) , splitCurve2dTool);
  }

  /**
   *  Sets the tool for Transfer parameters between curves and pcurves.
   */
  public void SetTransferParamTool( ShapeAnalysis_TransferParameters  TransferParam) {
    OCCwrapJavaJNI.ShapeUpgrade_WireDivide_SetTransferParamTool(swigCPtr, this,  ShapeAnalysis_TransferParameters.getCPtr(TransferParam) , TransferParam);
  }

  /**
   *  Sets tool for splitting edge
   */
  public void SetEdgeDivideTool( ShapeUpgrade_EdgeDivide  edgeDivideTool) {
    OCCwrapJavaJNI.ShapeUpgrade_WireDivide_SetEdgeDivideTool(swigCPtr, this,  ShapeUpgrade_EdgeDivide.getCPtr(edgeDivideTool) , edgeDivideTool);
  }

  public  ShapeUpgrade_EdgeDivide  GetEdgeDivideTool() {
    return new ShapeUpgrade_EdgeDivide ( OCCwrapJavaJNI.ShapeUpgrade_WireDivide_GetEdgeDivideTool(swigCPtr, this), true );
  }

  public  ShapeAnalysis_TransferParameters  GetTransferParamTool() {
    return new ShapeAnalysis_TransferParameters ( OCCwrapJavaJNI.ShapeUpgrade_WireDivide_GetTransferParamTool(swigCPtr, this), true );
  }

  /**
   *  Sets mode for splitting 3d curves from edges.
   *  0 - only curve 3d from free edges.
   *  1 - only curve 3d from shared edges.
   *  2 -  all curve 3d.
   */
  public void SetEdgeMode(int EdgeMode) {
    OCCwrapJavaJNI.ShapeUpgrade_WireDivide_SetEdgeMode(swigCPtr, this, EdgeMode);
  }

  /**
   *  Sets tool for fixing small curves with specified min tolerance;
   */
  public void SetFixSmallCurveTool( ShapeUpgrade_FixSmallCurves  FixSmallCurvesTool) {
    OCCwrapJavaJNI.ShapeUpgrade_WireDivide_SetFixSmallCurveTool(swigCPtr, this,  ShapeUpgrade_FixSmallCurves.getCPtr(FixSmallCurvesTool) , FixSmallCurvesTool);
  }

  public  ShapeUpgrade_FixSmallCurves  GetFixSmallCurveTool() {
    return new ShapeUpgrade_FixSmallCurves ( OCCwrapJavaJNI.ShapeUpgrade_WireDivide_GetFixSmallCurveTool(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_WireDivide_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_WireDivide_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_WireDivide  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_WireDivide ( OCCwrapJavaJNI.ShapeUpgrade_WireDivide_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_WireDivide_TypeOf(), true );
  }

}
