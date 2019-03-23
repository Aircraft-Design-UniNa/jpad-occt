package opencascade;

public class BRepGProp_Face {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepGProp_Face(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepGProp_Face(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepGProp_Face obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepGProp_Face(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructor. Initializes the object with a flag IsUseSpan
   *  that says if it is necessary to define spans on a face.
   *  This option has an effect only for BSpline faces. Spans
   *  are returned by the methods GetUKnots and GetTKnots.
   */
  public BRepGProp_Face(long IsUseSpan) {
    this(OCCwrapJavaJNI.new_BRepGProp_Face__SWIG_0(IsUseSpan), true);
  }

  /**
   *  Constructor. Initializes the object with the face and the
   *  flag IsUseSpan that says if it is necessary to define
   *  spans on a face. This option has an effect only for
   *  BSpline faces. Spans are returned by the methods GetUKnots
   *  and GetTKnots.
   */
  public BRepGProp_Face() {
    this(OCCwrapJavaJNI.new_BRepGProp_Face__SWIG_1(), true);
  }

  public BRepGProp_Face( TopoDS_Face  F, long IsUseSpan) {
    this(OCCwrapJavaJNI.new_BRepGProp_Face__SWIG_2(TopoDS_Face.getCPtr(F), F, IsUseSpan), true);
  }

  public BRepGProp_Face( TopoDS_Face  F) {
    this(OCCwrapJavaJNI.new_BRepGProp_Face__SWIG_3(TopoDS_Face.getCPtr(F), F), true);
  }

  public void Load( TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepGProp_Face_Load__SWIG_0(swigCPtr, this, TopoDS_Face.getCPtr(F), F);
  }

  public int VIntegrationOrder() {
    return OCCwrapJavaJNI.BRepGProp_Face_VIntegrationOrder(swigCPtr, this);
  }

  /**
   *  Returns Standard_True if the face is not trimmed.
   */
  public long NaturalRestriction() {
    return OCCwrapJavaJNI.BRepGProp_Face_NaturalRestriction(swigCPtr, this);
  }

  /**
   *  Returns the TopoDS face.
   */
  public  TopoDS_Face  GetFace() {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.BRepGProp_Face_GetFace(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the value of the boundary curve of the face.
   */
  public gp_Pnt2d Value2d(double U) {
    return new gp_Pnt2d(OCCwrapJavaJNI.BRepGProp_Face_Value2d(swigCPtr, this, U), true);
  }

  public int SIntOrder(double Eps) {
    return OCCwrapJavaJNI.BRepGProp_Face_SIntOrder(swigCPtr, this, Eps);
  }

  public int SVIntSubs() {
    return OCCwrapJavaJNI.BRepGProp_Face_SVIntSubs(swigCPtr, this);
  }

  public int SUIntSubs() {
    return OCCwrapJavaJNI.BRepGProp_Face_SUIntSubs(swigCPtr, this);
  }

  public void UKnots( TColStd_Array1OfReal  Knots) {
    OCCwrapJavaJNI.BRepGProp_Face_UKnots(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Knots), Knots);
  }

  public void VKnots( TColStd_Array1OfReal  Knots) {
    OCCwrapJavaJNI.BRepGProp_Face_VKnots(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Knots), Knots);
  }

  public int LIntOrder(double Eps) {
    return OCCwrapJavaJNI.BRepGProp_Face_LIntOrder(swigCPtr, this, Eps);
  }

  public int LIntSubs() {
    return OCCwrapJavaJNI.BRepGProp_Face_LIntSubs(swigCPtr, this);
  }

  public void LKnots( TColStd_Array1OfReal  Knots) {
    OCCwrapJavaJNI.BRepGProp_Face_LKnots(swigCPtr, this, TColStd_Array1OfReal.getCPtr(Knots), Knots);
  }

  /**
   *  Returns the number of points required to do the
   *  integration in the U parametric direction with
   *  a good accuracy.
   */
  public int UIntegrationOrder() {
    return OCCwrapJavaJNI.BRepGProp_Face_UIntegrationOrder(swigCPtr, this);
  }

  /**
   *  Returns the parametric bounds of the Face.
   */
  public void Bounds(double[] U1, double[] U2, double[] V1, double[] V2) {
    OCCwrapJavaJNI.BRepGProp_Face_Bounds(swigCPtr, this, U1, U2, V1, V2);
  }

  /**
   *  Computes the point of parameter U, V on the Face <S> and
   *  the normal to the face at this point.
   */
  public void Normal(double U, double V, gp_Pnt P, gp_Vec VNor) {
    OCCwrapJavaJNI.BRepGProp_Face_Normal(swigCPtr, this, U, V, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(VNor), VNor);
  }

  /**
   *  Loading the boundary arc.
   */
  public void Load( TopoDS_Edge  E) {
    OCCwrapJavaJNI.BRepGProp_Face_Load__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Returns the parametric value of the start point of
   *  the current arc of curve.
   */
  public double FirstParameter() {
    return OCCwrapJavaJNI.BRepGProp_Face_FirstParameter(swigCPtr, this);
  }

  /**
   *  Returns the parametric value of the end point of
   *  the current arc of curve.
   */
  public double LastParameter() {
    return OCCwrapJavaJNI.BRepGProp_Face_LastParameter(swigCPtr, this);
  }

  /**
   *  Returns the number of points required to do the
   *  integration along the parameter of curve.
   */
  public int IntegrationOrder() {
    return OCCwrapJavaJNI.BRepGProp_Face_IntegrationOrder(swigCPtr, this);
  }

  /**
   *  Returns the point of parameter U and the first derivative
   *  at this point of a boundary curve.
   */
  public void D12d(double U, gp_Pnt2d P, gp_Vec2d V1) {
    OCCwrapJavaJNI.BRepGProp_Face_D12d(swigCPtr, this, U, gp_Pnt2d.getCPtr(P), P, gp_Vec2d.getCPtr(V1), V1);
  }

  /**
   *  Loading the boundary arc. This arc is either a top, bottom,
   *  left or right bound of a UV rectangle in which the
   *  parameters of surface are defined.
   *  If IsFirstParam is equal to Standard_True, the face is
   *  initialized by either left of bottom bound. Otherwise it is
   *  initialized by the top or right one.
   *  If theIsoType is equal to GeomAbs_IsoU, the face is
   *  initialized with either left or right bound. Otherwise -
   *  with either top or bottom one.
   */
  public void Load(long IsFirstParam, GeomAbs_IsoType theIsoType) {
    OCCwrapJavaJNI.BRepGProp_Face_Load__SWIG_2(swigCPtr, this, IsFirstParam, theIsoType.swigValue());
  }

  /**
   *  Returns an array of U knots of the face. The first and last
   *  elements of the array will be theUMin and theUMax. The
   *  middle elements will be the U Knots of the face greater
   *  then theUMin and lower then theUMax in increasing order.
   *  If the face is not a BSpline, the array initialized with
   *  theUMin and theUMax only.
   */
  public void GetUKnots(double theUMin, double theUMax,  TColStd_HArray1OfReal  theUKnots) {
    OCCwrapJavaJNI.BRepGProp_Face_GetUKnots(swigCPtr, this, theUMin, theUMax,  TColStd_HArray1OfReal.getCPtr(theUKnots) , theUKnots);
  }

  /**
   *  Returns an array of combination of T knots of the arc and
   *  V knots of the face. The first and last elements of the
   *  array will be theTMin and theTMax. The middle elements will
   *  be the Knots of the arc and the values of parameters of
   *  arc on which the value points have V coordinates close to V
   *  knots of face. All the parameter will be greater then
   *  theTMin and lower then theTMax in increasing order.
   *  If the face is not a BSpline, the array initialized with
   *  theTMin and theTMax only.
   */
  public void GetTKnots(double theTMin, double theTMax,  TColStd_HArray1OfReal  theTKnots) {
    OCCwrapJavaJNI.BRepGProp_Face_GetTKnots(swigCPtr, this, theTMin, theTMax,  TColStd_HArray1OfReal.getCPtr(theTKnots) , theTKnots);
  }

}
