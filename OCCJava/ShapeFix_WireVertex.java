package opencascade;

/**
 *  Fixing disconnected edges in the wire
 *  Fixes vertices in the wire on the basis of pre-analysis
 *  made by ShapeAnalysis_WireVertex (given as argument).
 *  The Wire has formerly been loaded in a ShapeExtend_WireData.
 */
public class ShapeFix_WireVertex {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeFix_WireVertex(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeFix_WireVertex(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeFix_WireVertex obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeFix_WireVertex(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ShapeFix_WireVertex() {
    this(OCCwrapJavaJNI.new_ShapeFix_WireVertex(), true);
  }

  /**
   *  Loads the wire, ininializes internal analyzer
   *  (ShapeAnalysis_WireVertex) with the given precision,
   *  and performs analysis
   */
  public void Init( TopoDS_Wire  wire, double preci) {
    OCCwrapJavaJNI.ShapeFix_WireVertex_Init__SWIG_0(swigCPtr, this, TopoDS_Wire.getCPtr(wire), wire, preci);
  }

  /**
   *  Loads the wire, ininializes internal analyzer
   *  (ShapeAnalysis_WireVertex) with the given precision,
   *  and performs analysis
   */
  public void Init( ShapeExtend_WireData  sbwd, double preci) {
    OCCwrapJavaJNI.ShapeFix_WireVertex_Init__SWIG_1(swigCPtr, this,  ShapeExtend_WireData.getCPtr(sbwd) , sbwd, preci);
  }

  /**
   *  Loads all the data on wire, already analysed by
   *  ShapeAnalysis_WireVertex
   */
  public void Init( ShapeAnalysis_WireVertex  sawv) {
    OCCwrapJavaJNI.ShapeFix_WireVertex_Init__SWIG_2(swigCPtr, this, ShapeAnalysis_WireVertex.getCPtr(sawv), sawv);
  }

  /**
   *  returns internal analyzer
   */
  public  ShapeAnalysis_WireVertex  Analyzer() {
    ShapeAnalysis_WireVertex ret = new ShapeAnalysis_WireVertex(OCCwrapJavaJNI.ShapeFix_WireVertex_Analyzer(swigCPtr, this), false, this);
    return ret;
  }

  public  ShapeExtend_WireData  WireData() {
    return new ShapeExtend_WireData ( OCCwrapJavaJNI.ShapeFix_WireVertex_WireData(swigCPtr, this), true );
  }

  /**
   *  returns resulting wire (fixed)
   */
  public TopoDS_Wire Wire() {
    return new TopoDS_Wire(OCCwrapJavaJNI.ShapeFix_WireVertex_Wire(swigCPtr, this), true);
  }

  /**
   *  Fixes "Same" or "Close" status (same vertex may be set,
   *  without changing parameters)
   *  Returns the count of fixed vertices, 0 if none
   */
  public int FixSame() {
    return OCCwrapJavaJNI.ShapeFix_WireVertex_FixSame(swigCPtr, this);
  }

  /**
   *  Fixes all statuses except "Disjoined", i.e. the cases in which a
   *  common value has been set, with or without changing parameters
   *  Returns the count of fixed vertices, 0 if none
   */
  public int Fix() {
    return OCCwrapJavaJNI.ShapeFix_WireVertex_Fix(swigCPtr, this);
  }

}
