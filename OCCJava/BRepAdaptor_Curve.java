package opencascade;

/**
 *  The Curve from BRepAdaptor  allows to use  an Edge
 *  of the BRep topology like a 3D curve.
 * 
 *  It has the methods the class Curve from Adaptor3d.
 * 
 *  It  is created or  Initialized  with  an Edge.  It
 *  takes  into account local  coordinate systems.  If
 *  the Edge has a 3D curve it is  use  with priority.
 *  If the edge  has no 3D curve one  of the curves on
 *  surface is used. It is possible to enforce using a
 *  curve on surface by creating  or initialising with
 *  an Edge and a Face.
 */
public class BRepAdaptor_Curve extends Adaptor3d_Curve {

  private long swigCPtr;
  BRepAdaptor_Curve(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepAdaptor_Curve_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepAdaptor_Curve(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepAdaptor_Curve_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepAdaptor_Curve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepAdaptor_Curve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Creates an undefined Curve with no Edge loaded.
   */
  public BRepAdaptor_Curve() {
    this(OCCwrapJavaJNI.new_BRepAdaptor_Curve__SWIG_0(), true);
  }

  /**
   *  Creates a Curve  to  acces to the geometry of edge
   *  <E>.
   */
  public BRepAdaptor_Curve( TopoDS_Edge  E) {
    this(OCCwrapJavaJNI.new_BRepAdaptor_Curve__SWIG_1(TopoDS_Edge.getCPtr(E), E), true);
  }

  /**
   *  Creates a Curve to acces to  the geometry  of edge
   *  <E>.   The geometry  will   be  computed using the
   *  parametric curve of <E> on the face  <F>. An Error
   *  is  raised if  the edge does  not have a pcurve on
   *  the face.
   */
  public BRepAdaptor_Curve( TopoDS_Edge  E,  TopoDS_Face  F) {
    this(OCCwrapJavaJNI.new_BRepAdaptor_Curve__SWIG_2(TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F), true);
  }

  /**
   *  Sets  the Curve <me>  to acces to the  geometry of
   *  edge <E>.
   */
  public void Initialize( TopoDS_Edge  E) {
    OCCwrapJavaJNI.BRepAdaptor_Curve_Initialize__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Sets the Curve <me>  to acces to  the  geometry of
   *  edge <E>.  The geometry will be computed using the
   *  parametric curve of <E>  on the face <F>. An Error
   *  is raised if the edge  does not  have a pcurve  on
   *  the face.
   */
  public void Initialize( TopoDS_Edge  E,  TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepAdaptor_Curve_Initialize__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Returns the coordinate system of the curve.
   */
  public  gp_Trsf  Trsf() {
    gp_Trsf ret = new gp_Trsf(OCCwrapJavaJNI.BRepAdaptor_Curve_Trsf(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns True if the edge geometry is computed from
   *  a 3D curve.
   */
  public long Is3DCurve() {
    return OCCwrapJavaJNI.BRepAdaptor_Curve_Is3DCurve(swigCPtr, this);
  }

  /**
   *  Returns True if the edge geometry is computed from
   *  a pcurve on a surface.
   */
  public long IsCurveOnSurface() {
    return OCCwrapJavaJNI.BRepAdaptor_Curve_IsCurveOnSurface(swigCPtr, this);
  }

  /**
   *  Returns the Curve of  the  edge.
   */
  public  GeomAdaptor_Curve  Curve() {
    GeomAdaptor_Curve ret = new GeomAdaptor_Curve(OCCwrapJavaJNI.BRepAdaptor_Curve_Curve(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the CurveOnSurface of the edge.
   */
  public  Adaptor3d_CurveOnSurface  CurveOnSurface() {
    Adaptor3d_CurveOnSurface ret = new Adaptor3d_CurveOnSurface(OCCwrapJavaJNI.BRepAdaptor_Curve_CurveOnSurface(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the edge.
   */
  public  TopoDS_Edge  Edge() {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepAdaptor_Curve_Edge(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the edge tolerance.
   */
  public double Tolerance() {
    return OCCwrapJavaJNI.BRepAdaptor_Curve_Tolerance(swigCPtr, this);
  }

}
