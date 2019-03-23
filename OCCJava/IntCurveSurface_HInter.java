package opencascade;

public class IntCurveSurface_HInter extends IntCurveSurface_Intersection {

  private long swigCPtr;
  IntCurveSurface_HInter(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.IntCurveSurface_HInter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  IntCurveSurface_HInter(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.IntCurveSurface_HInter_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(IntCurveSurface_HInter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntCurveSurface_HInter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Empty Constructor
   */
  public IntCurveSurface_HInter() {
    this(OCCwrapJavaJNI.new_IntCurveSurface_HInter(), true);
  }

  /**
   *  Compute the Intersection between the curve and the
   *  surface
   */
  public void Perform( Adaptor3d_HCurve  Curve,  Adaptor3d_HSurface  Surface) {
    OCCwrapJavaJNI.IntCurveSurface_HInter_Perform__SWIG_0(swigCPtr, this,  Adaptor3d_HCurve.getCPtr(Curve) , Curve,  Adaptor3d_HSurface.getCPtr(Surface) , Surface);
  }

  /**
   *  Compute the Intersection  between the curve  and
   *  the surface. The   Curve is already  sampled and
   *  its polygon : <Polygon> is given.
   */
  public void Perform( Adaptor3d_HCurve  Curve,  IntCurveSurface_ThePolygonOfHInter  Polygon,  Adaptor3d_HSurface  Surface) {
    OCCwrapJavaJNI.IntCurveSurface_HInter_Perform__SWIG_1(swigCPtr, this,  Adaptor3d_HCurve.getCPtr(Curve) , Curve, IntCurveSurface_ThePolygonOfHInter.getCPtr(Polygon), Polygon,  Adaptor3d_HSurface.getCPtr(Surface) , Surface);
  }

  /**
   *  Compute the Intersection  between the curve  and
   *  the surface. The   Curve is already  sampled and
   *  its polygon : <Polygon> is given. The Surface is
   *  also sampled and <Polyhedron> is given.
   */
  public void Perform( Adaptor3d_HCurve  Curve,  IntCurveSurface_ThePolygonOfHInter  ThePolygon,  Adaptor3d_HSurface  Surface,  IntCurveSurface_ThePolyhedronOfHInter  Polyhedron) {
    OCCwrapJavaJNI.IntCurveSurface_HInter_Perform__SWIG_2(swigCPtr, this,  Adaptor3d_HCurve.getCPtr(Curve) , Curve, IntCurveSurface_ThePolygonOfHInter.getCPtr(ThePolygon), ThePolygon,  Adaptor3d_HSurface.getCPtr(Surface) , Surface, IntCurveSurface_ThePolyhedronOfHInter.getCPtr(Polyhedron), Polyhedron);
  }

  /**
   *  Compute the Intersection  between the curve  and
   *  the surface. The   Curve is already  sampled and
   *  its polygon : <Polygon> is given. The Surface is
   *  also sampled and <Polyhedron> is given.
   */
  public void Perform( Adaptor3d_HCurve  Curve,  IntCurveSurface_ThePolygonOfHInter  ThePolygon,  Adaptor3d_HSurface  Surface,  IntCurveSurface_ThePolyhedronOfHInter  Polyhedron,  Bnd_BoundSortBox  BndBSB) {
    OCCwrapJavaJNI.IntCurveSurface_HInter_Perform__SWIG_3(swigCPtr, this,  Adaptor3d_HCurve.getCPtr(Curve) , Curve, IntCurveSurface_ThePolygonOfHInter.getCPtr(ThePolygon), ThePolygon,  Adaptor3d_HSurface.getCPtr(Surface) , Surface, IntCurveSurface_ThePolyhedronOfHInter.getCPtr(Polyhedron), Polyhedron, Bnd_BoundSortBox.getCPtr(BndBSB), BndBSB);
  }

  /**
   *  Compute the Intersection  between the curve  and
   *  the surface. The Surface is already  sampled and
   *  its polyhedron : <Polyhedron> is given.
   */
  public void Perform( Adaptor3d_HCurve  Curve,  Adaptor3d_HSurface  Surface,  IntCurveSurface_ThePolyhedronOfHInter  Polyhedron) {
    OCCwrapJavaJNI.IntCurveSurface_HInter_Perform__SWIG_4(swigCPtr, this,  Adaptor3d_HCurve.getCPtr(Curve) , Curve,  Adaptor3d_HSurface.getCPtr(Surface) , Surface, IntCurveSurface_ThePolyhedronOfHInter.getCPtr(Polyhedron), Polyhedron);
  }

}
