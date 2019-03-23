package opencascade;

/**
 *  This tool is used for transferring parameters
 *  from 3d curve of the edge to pcurve and vice versa.
 * 
 *  Default behaviour is to trsnafer parameters with help
 *  of linear transformation:
 * 
 *  T2d = myShift + myScale * T3d
 *  where
 *  myScale = ( Last2d - First2d ) / ( Last3d - First3d )
 *  myShift = First2d - First3d * myScale
 *  [First3d, Last3d] and [First2d, Last2d] are ranges of
 *  edge on curve and pcurve
 * 
 *  This behaviour can be redefined in derived classes, for example,
 *  using projection.
 */
public class ShapeAnalysis_TransferParameters extends Standard_Transient {
  ShapeAnalysis_TransferParameters(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates empty tool with myShift = 0 and myScale = 1
   */
  public ShapeAnalysis_TransferParameters() {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_TransferParameters__SWIG_0(), true);
  }

  /**
   *  Creates a tool and initializes it with edge and face
   */
  public ShapeAnalysis_TransferParameters( TopoDS_Edge  E,  TopoDS_Face  F) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_TransferParameters__SWIG_1(TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F), true);
  }

  /**
   *  Initialize a tool with edge and face
   */
  public void Init( TopoDS_Edge  E,  TopoDS_Face  F) {
    OCCwrapJavaJNI.ShapeAnalysis_TransferParameters_Init(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Sets maximal tolerance to use linear recomputation of
   *  parameters.
   */
  public void SetMaxTolerance(double maxtol) {
    OCCwrapJavaJNI.ShapeAnalysis_TransferParameters_SetMaxTolerance(swigCPtr, this, maxtol);
  }

  /**
   *  Transfers parameter given by sequence Params from 3d curve
   *  to pcurve (if To2d is True) or back (if To2d is False)
   */
  public  TColStd_HSequenceOfReal  Perform( TColStd_HSequenceOfReal  Params, long To2d) {
    return new TColStd_HSequenceOfReal ( OCCwrapJavaJNI.ShapeAnalysis_TransferParameters_Perform__SWIG_0(swigCPtr, this,  TColStd_HSequenceOfReal.getCPtr(Params) , Params, To2d), true );
  }

  public double Perform(double Param, long To2d) {
    return OCCwrapJavaJNI.ShapeAnalysis_TransferParameters_Perform__SWIG_1(swigCPtr, this, Param, To2d);
  }

  /**
   *  Recomputes range of curves from NewEdge.
   *  If Is2d equals True parameters are recomputed by curve2d else by curve3d.
   */
  public void TransferRange(TopoDS_Edge newEdge, double prevPar, double currPar, long To2d) {
    OCCwrapJavaJNI.ShapeAnalysis_TransferParameters_TransferRange(swigCPtr, this, TopoDS_Edge.getCPtr(newEdge), newEdge, prevPar, currPar, To2d);
  }

  /**
   *  Returns True if 3d curve of edge and pcurve are SameRange
   *  (in default implementation, if myScale == 1 and myShift == 0)
   */
  public long IsSameRange() {
    return OCCwrapJavaJNI.ShapeAnalysis_TransferParameters_IsSameRange(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeAnalysis_TransferParameters_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeAnalysis_TransferParameters_get_type_descriptor(), true );
  }

  public static  ShapeAnalysis_TransferParameters  DownCast( Standard_Transient  T) {
    return new ShapeAnalysis_TransferParameters ( OCCwrapJavaJNI.ShapeAnalysis_TransferParameters_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeAnalysis_TransferParameters_TypeOf(), true );
  }

}
