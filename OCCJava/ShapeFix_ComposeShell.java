package opencascade;

/**
 *  This class is intended to create a shell from the composite
 *  surface (grid of surfaces) and set of wires.
 *  It may be either division of the supporting surface of the
 *  face, or creating a shape corresponding to face on composite
 *  surface which is missing in CAS.CADE but exists in some other
 *  systems.
 * 
 *  It splits (if necessary) original face to several ones by
 *  splitting lines which are joint lines on a supplied grid of
 *  surfaces (U- and V- isolines of the  composite surface).
 *  There are two modes of work, which differ in the way of
 *  handling faces on periodic surfaces:
 * 
 *  - if ClosedMode is False (default), when splitting itself is
 *  done as if surface were not periodic. The periodicity of the
 *  underlying surface is taken into account by duplicating splitting
 *  lines in the periodic direction, as necessary to split all
 *  the wires (whole parametrical range of a face)
 *  In this mode, some regularization procedures are performed
 *  (indexation of splitted segments by patch numbers), and it is
 *  expected to be more reliable and robust in case of bad shapes
 * 
 *  - if ClosedMode is True, when everything on a periodic surfaces
 *  is considered as modulo period. This allows to deal with wires
 *  which are closed in 3d but not in 2d, with wires which may be
 *  shifted on several periods in 2d etc. However, this mode is
 *  less reliable since some regularizations do not work for it.
 * 
 *  The work is made basing on pcurves of the edges. These pcurves
 *  should already exist (for example, in the case of division of
 *  existing face), then they are taken as is. The existing pcurves
 *  should be assigned to one surface (face) for all edges,
 *  this surface (face) will be used only for accessing pcurves,
 *  and it may have any geometry.
 * 
 *  All the modifications are recorded in the context tool
 *  (ShapeBuild_ReShape).
 */
public class ShapeFix_ComposeShell extends ShapeFix_Root {
  ShapeFix_ComposeShell(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates empty tool.
   */
  public ShapeFix_ComposeShell() {
    this(OCCwrapJavaJNI.new_ShapeFix_ComposeShell(), true);
  }

  /**
   *  Initializes with composite surface, face and precision.
   *  Here face defines both set of wires and way of getting
   *  pcurves. Precision is used (together with tolerance of edges)
   *  for handling subtle cases, such as tangential intersections.
   */
  public void Init( ShapeExtend_CompositeSurface  Grid,  TopLoc_Location  L,  TopoDS_Face  Face, double Prec) {
    OCCwrapJavaJNI.ShapeFix_ComposeShell_Init(swigCPtr, this,  ShapeExtend_CompositeSurface.getCPtr(Grid) , Grid, TopLoc_Location.getCPtr(L), L, TopoDS_Face.getCPtr(Face), Face, Prec);
  }

  public long[] ClosedMode() {return OCCwrapJavaJNI.ShapeFix_ComposeShell_ClosedMode(swigCPtr, this);}

  /**
   *  Performs the work on already loaded data.
   */
  public long Perform() {
    return OCCwrapJavaJNI.ShapeFix_ComposeShell_Perform(swigCPtr, this);
  }

  /**
   *  Splits edges in the original shape by grid.
   *  This is a part of Perform() which does not produce any
   *  resulting shape; the only result is filled context
   *  where splittings are recorded.
   * 
   *  NOTE: If edge is splitted, it is replaced by wire, and
   *  order of edges in the wire corresponds to FORWARD orientation
   *  of the edge.
   */
  public void SplitEdges() {
    OCCwrapJavaJNI.ShapeFix_ComposeShell_SplitEdges(swigCPtr, this);
  }

  /**
   *  Returns resulting shell or face (or Null shape if not done)
   */
  public  TopoDS_Shape  Result() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.ShapeFix_ComposeShell_Result(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Queries status of last call to Perform()
   *  OK   : nothing done (some kind of error)
   *  DONE1: splitting is done, at least one new face created
   *  DONE2: splitting is done, several new faces obtained
   *  FAIL1: misoriented wire encountered (handled)
   *  FAIL2: recoverable parity error
   *  FAIL3: edge with no pcurve on supporting face
   *  FAIL4: unrecoverable algorithm error (parity check)
   */
  public long Status(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeFix_ComposeShell_Status(swigCPtr, this, status.swigValue());
  }

  /**
   *  Sets tool for transfer parameters from 3d to 2d and vice versa.
   */
  public void SetTransferParamTool( ShapeAnalysis_TransferParameters  TransferParam) {
    OCCwrapJavaJNI.ShapeFix_ComposeShell_SetTransferParamTool(swigCPtr, this,  ShapeAnalysis_TransferParameters.getCPtr(TransferParam) , TransferParam);
  }

  public  ShapeAnalysis_TransferParameters  GetTransferParamTool() {
    return new ShapeAnalysis_TransferParameters ( OCCwrapJavaJNI.ShapeFix_ComposeShell_GetTransferParamTool(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeFix_ComposeShell_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_ComposeShell_get_type_descriptor(), true );
  }

  public static  ShapeFix_ComposeShell  DownCast( Standard_Transient  T) {
    return new ShapeFix_ComposeShell ( OCCwrapJavaJNI.ShapeFix_ComposeShell_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_ComposeShell_TypeOf(), true );
  }

}
