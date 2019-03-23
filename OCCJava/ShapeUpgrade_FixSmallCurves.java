package opencascade;

public class ShapeUpgrade_FixSmallCurves extends ShapeUpgrade_Tool {
  ShapeUpgrade_FixSmallCurves(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public ShapeUpgrade_FixSmallCurves() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_FixSmallCurves(), true);
  }

  public void Init( TopoDS_Edge  theEdge,  TopoDS_Face  theFace) {
    OCCwrapJavaJNI.ShapeUpgrade_FixSmallCurves_Init(swigCPtr, this, TopoDS_Edge.getCPtr(theEdge), theEdge, TopoDS_Face.getCPtr(theFace), theFace);
  }

  public long Approx( Geom_Curve  Curve3d,  Geom2d_Curve  Curve2d,  Geom2d_Curve  Curve2dR, double[] First, double[] Last) {
    return OCCwrapJavaJNI.ShapeUpgrade_FixSmallCurves_Approx(swigCPtr, this,  Geom_Curve.getCPtr(Curve3d) , Curve3d,  Geom2d_Curve.getCPtr(Curve2d) , Curve2d,  Geom2d_Curve.getCPtr(Curve2dR) , Curve2dR, First, Last);
  }

  /**
   *  Sets the tool for splitting 3D curves.
   */
  public void SetSplitCurve3dTool( ShapeUpgrade_SplitCurve3d  splitCurve3dTool) {
    OCCwrapJavaJNI.ShapeUpgrade_FixSmallCurves_SetSplitCurve3dTool(swigCPtr, this,  ShapeUpgrade_SplitCurve3d.getCPtr(splitCurve3dTool) , splitCurve3dTool);
  }

  /**
   *  Sets the tool for splitting pcurves.
   */
  public void SetSplitCurve2dTool( ShapeUpgrade_SplitCurve2d  splitCurve2dTool) {
    OCCwrapJavaJNI.ShapeUpgrade_FixSmallCurves_SetSplitCurve2dTool(swigCPtr, this,  ShapeUpgrade_SplitCurve2d.getCPtr(splitCurve2dTool) , splitCurve2dTool);
  }

  /**
   *  Queries the status of last call to Perform
   *  OK   :
   *  DONE1:
   *  DONE2:
   *  FAIL1:
   */
  public long Status(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeUpgrade_FixSmallCurves_Status(swigCPtr, this, status.swigValue());
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_FixSmallCurves_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_FixSmallCurves_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_FixSmallCurves  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_FixSmallCurves ( OCCwrapJavaJNI.ShapeUpgrade_FixSmallCurves_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_FixSmallCurves_TypeOf(), true );
  }

}
