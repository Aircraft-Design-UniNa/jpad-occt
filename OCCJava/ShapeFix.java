package opencascade;

/**
 *  This package provides algorithms for fixing
 *  problematic (violating Open CASCADE requirements) shapes.
 *  Tools from package ShapeAnalysis are used for detecting the problems. The
 *  detecting and fixing is done taking in account various
 *  criteria implemented in BRepCheck package.
 *  Each class of package ShapeFix deals with one
 *  certain type of shapes or with some family of problems.
 */
public class ShapeFix {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeFix(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeFix(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeFix obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeFix(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Runs SameParameter from BRepLib with these adaptations :
   *  <enforce> forces computations, else they are made only on
   *  Edges with flag SameParameter false
   *  <preci>, if not precised, is taken for each EDge as its own
   *  Tolerance
   *  Returns True when done, False if an exception has been raised
   *  In case of exception anyway, as many edges as possible have
   *  been processed. The passed progress indicator allows user
   *  to consult the current progress stage and abort algorithm
   *  if needed.
   */
  public static long SameParameter( TopoDS_Shape  shape, long enforce, double preci,  Message_ProgressIndicator  theProgress,  ShapeExtend_BasicMsgRegistrator  theMsgReg) {
    return OCCwrapJavaJNI.ShapeFix_SameParameter__SWIG_0(TopoDS_Shape.getCPtr(shape), shape, enforce, preci,  Message_ProgressIndicator.getCPtr(theProgress) , theProgress,  ShapeExtend_BasicMsgRegistrator.getCPtr(theMsgReg) , theMsgReg);
  }

  public static long SameParameter( TopoDS_Shape  shape, long enforce, double preci,  Message_ProgressIndicator  theProgress) {
    return OCCwrapJavaJNI.ShapeFix_SameParameter__SWIG_1(TopoDS_Shape.getCPtr(shape), shape, enforce, preci,  Message_ProgressIndicator.getCPtr(theProgress) , theProgress);
  }

  public static long SameParameter( TopoDS_Shape  shape, long enforce, double preci) {
    return OCCwrapJavaJNI.ShapeFix_SameParameter__SWIG_2(TopoDS_Shape.getCPtr(shape), shape, enforce, preci);
  }

  public static long SameParameter( TopoDS_Shape  shape, long enforce) {
    return OCCwrapJavaJNI.ShapeFix_SameParameter__SWIG_3(TopoDS_Shape.getCPtr(shape), shape, enforce);
  }

  /**
   *  Runs EncodeRegularity from BRepLib taking into account
   *  shared components of assemblies, so that each component
   *  is processed only once
   */
  public static void EncodeRegularity( TopoDS_Shape  shape, double tolang) {
    OCCwrapJavaJNI.ShapeFix_EncodeRegularity__SWIG_0(TopoDS_Shape.getCPtr(shape), shape, tolang);
  }

  public static void EncodeRegularity( TopoDS_Shape  shape) {
    OCCwrapJavaJNI.ShapeFix_EncodeRegularity__SWIG_1(TopoDS_Shape.getCPtr(shape), shape);
  }

  /**
   *  Removes edges which are less than given tolerance from shape
   *  with help of ShapeFix_Wire::FixSmall()
   */
  public static TopoDS_Shape RemoveSmallEdges(TopoDS_Shape shape, double Tolerance,  ShapeBuild_ReShape  context) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeFix_RemoveSmallEdges(TopoDS_Shape.getCPtr(shape), shape, Tolerance,  ShapeBuild_ReShape.getCPtr(context) , context), true);
  }

  /**
   *  Fix position of the vertices having tolerance more tnan specified one.;
   */
  public static long FixVertexPosition(TopoDS_Shape theshape, double theTolerance,  ShapeBuild_ReShape  thecontext) {
    return OCCwrapJavaJNI.ShapeFix_FixVertexPosition(TopoDS_Shape.getCPtr(theshape), theshape, theTolerance,  ShapeBuild_ReShape.getCPtr(thecontext) , thecontext);
  }

  /**
   *  Calculate size of least edge;
   */
  public static double LeastEdgeSize(TopoDS_Shape theshape) {
    return OCCwrapJavaJNI.ShapeFix_LeastEdgeSize(TopoDS_Shape.getCPtr(theshape), theshape);
  }

  public ShapeFix() {
    this(OCCwrapJavaJNI.new_ShapeFix(), true);
  }

}
