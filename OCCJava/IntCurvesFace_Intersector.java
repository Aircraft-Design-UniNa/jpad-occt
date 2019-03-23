package opencascade;

public class IntCurvesFace_Intersector {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntCurvesFace_Intersector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntCurvesFace_Intersector(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntCurvesFace_Intersector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntCurvesFace_Intersector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Load a Face.
   * 
   *  The Tolerance <Tol> is used to determine if the
   *  first point of the segment is near the face. In
   *  that case, the parameter of the intersection point
   *  on the line can be a negative value (greater than -Tol).
   *  If aRestr = true UV bounding box of face is used to restrict 
   *  it's underlined surface,
   *  otherwise surface is not restricted.
   *  If UseBToler = false then the 2d-point of intersection is classified with null-tolerance
   *  (relative to face);
   *  otherwise it's using maximium between input tolerance(aTol) and tolerances of face bounds (edges).
   */
  public IntCurvesFace_Intersector( TopoDS_Face  F, double aTol, long aRestr, long UseBToler) {
    this(OCCwrapJavaJNI.new_IntCurvesFace_Intersector__SWIG_0(TopoDS_Face.getCPtr(F), F, aTol, aRestr, UseBToler), true);
  }

  public IntCurvesFace_Intersector( TopoDS_Face  F, double aTol, long aRestr) {
    this(OCCwrapJavaJNI.new_IntCurvesFace_Intersector__SWIG_1(TopoDS_Face.getCPtr(F), F, aTol, aRestr), true);
  }

  public IntCurvesFace_Intersector( TopoDS_Face  F, double aTol) {
    this(OCCwrapJavaJNI.new_IntCurvesFace_Intersector__SWIG_2(TopoDS_Face.getCPtr(F), F, aTol), true);
  }

  /**
   *  Perform the intersection between the
   *  segment L and the loaded face.
   * 
   *  PInf is the smallest parameter on the line
   *  PSup is the highest  parmaeter on the line
   * 
   *  For an infinite line PInf and PSup can be
   *  +/- RealLast.
   */
  public void Perform( gp_Lin  L, double PInf, double PSup) {
    OCCwrapJavaJNI.IntCurvesFace_Intersector_Perform__SWIG_0(swigCPtr, this, gp_Lin.getCPtr(L), L, PInf, PSup);
  }

  /**
   *  same method for a HCurve from Adaptor3d.
   *  PInf an PSup can also be - and + INF.
   */
  public void Perform( Adaptor3d_HCurve  HCu, double PInf, double PSup) {
    OCCwrapJavaJNI.IntCurvesFace_Intersector_Perform__SWIG_1(swigCPtr, this,  Adaptor3d_HCurve.getCPtr(HCu) , HCu, PInf, PSup);
  }

  /**
   *  Return the surface type
   */
  public GeomAbs_SurfaceType SurfaceType() {
    return GeomAbs_SurfaceType.swigToEnum(OCCwrapJavaJNI.IntCurvesFace_Intersector_SurfaceType(swigCPtr, this));
  }

  /**
   *  True is returned when the intersection have been computed.
   */
  public long IsDone() {
    return OCCwrapJavaJNI.IntCurvesFace_Intersector_IsDone(swigCPtr, this);
  }

  public int NbPnt() {
    return OCCwrapJavaJNI.IntCurvesFace_Intersector_NbPnt(swigCPtr, this);
  }

  /**
   *  Returns the U parameter of the ith intersection point
   *  on the surface.
   */
  public double UParameter(int I) {
    return OCCwrapJavaJNI.IntCurvesFace_Intersector_UParameter(swigCPtr, this, I);
  }

  /**
   *  Returns the V parameter of the ith intersection point
   *  on the surface.
   */
  public double VParameter(int I) {
    return OCCwrapJavaJNI.IntCurvesFace_Intersector_VParameter(swigCPtr, this, I);
  }

  /**
   *  Returns the parameter of the ith intersection point
   *  on the line.
   */
  public double WParameter(int I) {
    return OCCwrapJavaJNI.IntCurvesFace_Intersector_WParameter(swigCPtr, this, I);
  }

  /**
   *  Returns the geometric point of the ith intersection
   *  between the line and the surface.
   */
  public  gp_Pnt  Pnt(int I) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.IntCurvesFace_Intersector_Pnt(swigCPtr, this, I), true);
    return ret;
  }

  /**
   *  Returns the ith transition of the line on the surface.
   */
  public IntCurveSurface_TransitionOnCurve Transition(int I) {
    return IntCurveSurface_TransitionOnCurve.swigToEnum(OCCwrapJavaJNI.IntCurvesFace_Intersector_Transition(swigCPtr, this, I));
  }

  /**
   *  Returns the ith state of the point on the face.
   *  The values can be either TopAbs_IN
   *  ( the point is in the face)
   *  or TopAbs_ON
   *  ( the point is on a boudary of the face).
   */
  public TopAbs_State State(int I) {
    return TopAbs_State.swigToEnum(OCCwrapJavaJNI.IntCurvesFace_Intersector_State(swigCPtr, this, I));
  }

  /**
   *  Returns true if curve is parallel or belongs face surface
   *  This case is recognized only for some pairs 
   *  of analytical curves and surfaces (plane - line, ...)
   */
  public long IsParallel() {
    return OCCwrapJavaJNI.IntCurvesFace_Intersector_IsParallel(swigCPtr, this);
  }

  /**
   *  Returns the significant face used to determine
   *  the intersection.
   */
  public  TopoDS_Face  Face() {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.IntCurvesFace_Intersector_Face(swigCPtr, this), true);
    return ret;
  }

  public TopAbs_State ClassifyUVPoint( gp_Pnt2d  Puv) {
    return TopAbs_State.swigToEnum(OCCwrapJavaJNI.IntCurvesFace_Intersector_ClassifyUVPoint(swigCPtr, this, gp_Pnt2d.getCPtr(Puv), Puv));
  }

  public Bnd_Box Bounding() {
    return new Bnd_Box(OCCwrapJavaJNI.IntCurvesFace_Intersector_Bounding(swigCPtr, this), true);
  }

  /**
   *  Sets the boundary tolerance flag
   */
  public void SetUseBoundToler(long UseBToler) {
    OCCwrapJavaJNI.IntCurvesFace_Intersector_SetUseBoundToler(swigCPtr, this, UseBToler);
  }

  /**
   *  Returns the boundary tolerance flag
   */
  public long GetUseBoundToler() {
    return OCCwrapJavaJNI.IntCurvesFace_Intersector_GetUseBoundToler(swigCPtr, this);
  }

  public void Destroy() {
    OCCwrapJavaJNI.IntCurvesFace_Intersector_Destroy(swigCPtr, this);
  }

}
