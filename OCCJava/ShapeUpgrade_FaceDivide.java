package opencascade;

/**
 *  Divides a Face (both edges in the wires, by splitting
 *  curves and pcurves, and the face itself, by splitting
 *  supporting surface) according to splitting criteria.
 *  * The domain of the face to divide is defined by the PCurves
 *  of the wires on the Face.
 * 
 *  * all the PCurves are supposed to be defined (in the parametric
 *  space of the supporting surface).
 * 
 *  The result is available after the call to the Build method.
 *  It is a Shell containing all the resulting Faces.
 * 
 *  All the modifications made during splitting are recorded in the
 *  external context (ShapeBuild_ReShape).
 */
public class ShapeUpgrade_FaceDivide extends ShapeUpgrade_Tool {
  ShapeUpgrade_FaceDivide(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates empty  constructor.
   */
  public ShapeUpgrade_FaceDivide() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_FaceDivide__SWIG_0(), true);
  }

  /**
   *  Initialize by a Face.
   */
  public ShapeUpgrade_FaceDivide( TopoDS_Face  F) {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_FaceDivide__SWIG_1(TopoDS_Face.getCPtr(F), F), true);
  }

  /**
   *  Initialize by a Face.
   */
  public void Init( TopoDS_Face  F) {
    OCCwrapJavaJNI.ShapeUpgrade_FaceDivide_Init(swigCPtr, this, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Purpose sets mode for trimming (segment) surface by
   *  wire UV bounds.
   */
  public void SetSurfaceSegmentMode(long Segment) {
    OCCwrapJavaJNI.ShapeUpgrade_FaceDivide_SetSurfaceSegmentMode(swigCPtr, this, Segment);
  }

  /**
   *  Performs splitting and computes the resulting shell
   *  The context is used to keep track of former splittings
   *  in order to keep sharings. It is updated according to
   *  modifications made.
   */
  public long Perform() {
    return OCCwrapJavaJNI.ShapeUpgrade_FaceDivide_Perform(swigCPtr, this);
  }

  /**
   *  Performs splitting of surface and computes the shell
   *  from source face.
   */
  public long SplitSurface() {
    return OCCwrapJavaJNI.ShapeUpgrade_FaceDivide_SplitSurface(swigCPtr, this);
  }

  /**
   *  Performs splitting of curves of all the edges in the
   *  shape and divides these edges.
   */
  public long SplitCurves() {
    return OCCwrapJavaJNI.ShapeUpgrade_FaceDivide_SplitCurves(swigCPtr, this);
  }

  /**
   *  Gives the resulting Shell, or Face, or Null shape if not done.
   */
  public TopoDS_Shape Result() {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeUpgrade_FaceDivide_Result(swigCPtr, this), true);
  }

  /**
   *  Queries the status of last call to Perform
   *  OK   : no splitting was done (or no call to Perform)
   *  DONE1: some edges were splitted
   *  DONE2: surface was splitted
   *  DONE3: surface was modified without splitting
   *  FAIL1: some fails encountered during splitting wires
   *  FAIL2: face cannot be splitted
   */
  public long Status(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeUpgrade_FaceDivide_Status(swigCPtr, this, status.swigValue());
  }

  /**
   *  Sets the tool for splitting surfaces.
   */
  public void SetSplitSurfaceTool( ShapeUpgrade_SplitSurface  splitSurfaceTool) {
    OCCwrapJavaJNI.ShapeUpgrade_FaceDivide_SetSplitSurfaceTool(swigCPtr, this,  ShapeUpgrade_SplitSurface.getCPtr(splitSurfaceTool) , splitSurfaceTool);
  }

  /**
   *  Sets the tool for dividing edges on Face.
   */
  public void SetWireDivideTool( ShapeUpgrade_WireDivide  wireDivideTool) {
    OCCwrapJavaJNI.ShapeUpgrade_FaceDivide_SetWireDivideTool(swigCPtr, this,  ShapeUpgrade_WireDivide.getCPtr(wireDivideTool) , wireDivideTool);
  }

  public  ShapeUpgrade_SplitSurface  GetSplitSurfaceTool() {
    return new ShapeUpgrade_SplitSurface ( OCCwrapJavaJNI.ShapeUpgrade_FaceDivide_GetSplitSurfaceTool(swigCPtr, this), true );
  }

  public  ShapeUpgrade_WireDivide  GetWireDivideTool() {
    return new ShapeUpgrade_WireDivide ( OCCwrapJavaJNI.ShapeUpgrade_FaceDivide_GetWireDivideTool(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_FaceDivide_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_FaceDivide_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_FaceDivide  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_FaceDivide ( OCCwrapJavaJNI.ShapeUpgrade_FaceDivide_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_FaceDivide_TypeOf(), true );
  }

}
