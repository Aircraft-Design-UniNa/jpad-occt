package opencascade;

/**
 *  The Curve from BRepAdaptor allows to use a Wire
 *  of the BRep topology like a 3D curve.
 *  Warning: With this  class of curve,  C0 and C1 continuities
 *  are not assumed. So be careful with some algorithm!
 *  Please note that BRepAdaptor_CompCurve cannot be
 *  periodic curve at all (even if it contains single 
 *  periodic edge).
 * 
 *  BRepAdaptor_CompCurve can only work on valid wires where all edges are
 *  connected to each other to make a chain.
 */
public class BRepAdaptor_CompCurve extends Adaptor3d_Curve {

  private long swigCPtr;
  BRepAdaptor_CompCurve(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepAdaptor_CompCurve_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepAdaptor_CompCurve(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepAdaptor_CompCurve_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepAdaptor_CompCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepAdaptor_CompCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Creates an undefined Curve with no Wire loaded.
   */
  public BRepAdaptor_CompCurve() {
    this(OCCwrapJavaJNI.new_BRepAdaptor_CompCurve__SWIG_0(), true);
  }

  public BRepAdaptor_CompCurve( TopoDS_Wire  W, long KnotByCurvilinearAbcissa) {
    this(OCCwrapJavaJNI.new_BRepAdaptor_CompCurve__SWIG_1(TopoDS_Wire.getCPtr(W), W, KnotByCurvilinearAbcissa), true);
  }

  /**
   *  Creates a Curve  to  acces to the geometry of edge
   *  <W>.
   */
  public BRepAdaptor_CompCurve( TopoDS_Wire  W) {
    this(OCCwrapJavaJNI.new_BRepAdaptor_CompCurve__SWIG_2(TopoDS_Wire.getCPtr(W), W), true);
  }

  public BRepAdaptor_CompCurve( TopoDS_Wire  W, long KnotByCurvilinearAbcissa, double First, double Last, double Tol) {
    this(OCCwrapJavaJNI.new_BRepAdaptor_CompCurve__SWIG_3(TopoDS_Wire.getCPtr(W), W, KnotByCurvilinearAbcissa, First, Last, Tol), true);
  }

  /**
   *  Sets the  wire <W>.
   */
  public void Initialize( TopoDS_Wire  W, long KnotByCurvilinearAbcissa) {
    OCCwrapJavaJNI.BRepAdaptor_CompCurve_Initialize__SWIG_0(swigCPtr, this, TopoDS_Wire.getCPtr(W), W, KnotByCurvilinearAbcissa);
  }

  /**
   *  Sets wire <W> and trimmed  parameter.
   */
  public void Initialize( TopoDS_Wire  W, long KnotByCurvilinearAbcissa, double First, double Last, double Tol) {
    OCCwrapJavaJNI.BRepAdaptor_CompCurve_Initialize__SWIG_1(swigCPtr, this, TopoDS_Wire.getCPtr(W), W, KnotByCurvilinearAbcissa, First, Last, Tol);
  }

  /**
   *  Returns the wire.
   */
  public  TopoDS_Wire  Wire() {
    TopoDS_Wire ret = new TopoDS_Wire(OCCwrapJavaJNI.BRepAdaptor_CompCurve_Wire(swigCPtr, this), true);
    return ret;
  }

  /**
   *  returns an  edge  and   one  parameter on them
   *  corresponding to the parameter U.
   */
  public void Edge(double U, TopoDS_Edge E, double[] UonE) {
    OCCwrapJavaJNI.BRepAdaptor_CompCurve_Edge(swigCPtr, this, U, TopoDS_Edge.getCPtr(E), E, UonE);
  }

}
