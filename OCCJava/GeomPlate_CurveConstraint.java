package opencascade;

/**
 *  Defines curves as constraints to be used to deform a surface.
 */
public class GeomPlate_CurveConstraint extends Standard_Transient {
  GeomPlate_CurveConstraint(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Initializes an empty curve constraint object.
   */
  public GeomPlate_CurveConstraint() {
    this(OCCwrapJavaJNI.new_GeomPlate_CurveConstraint__SWIG_0(), true);
  }

  /**
   *  Create a constraint
   *  Order is the order of the constraint. The possible values for order are -1,0,1,2.
   *  Order i means constraints Gi
   *  Npt is the number of points associated with the constraint.
   *  TolDist is the maximum error to satisfy for G0 constraints
   *  TolAng is the maximum error to satisfy for G1 constraints
   *  TolCurv is the maximum error to satisfy for G2 constraints
   *  These errors can be replaced by laws of criterion.
   *  Raises    ConstructionError if Order is not -1 , 0,  1,  2
   */
  public GeomPlate_CurveConstraint( Adaptor3d_HCurve  Boundary, int Order, int NPt, double TolDist, double TolAng, double TolCurv) {
    this(OCCwrapJavaJNI.new_GeomPlate_CurveConstraint__SWIG_1( Adaptor3d_HCurve.getCPtr(Boundary) , Boundary, Order, NPt, TolDist, TolAng, TolCurv), true);
  }

  public GeomPlate_CurveConstraint( Adaptor3d_HCurve  Boundary, int Order, int NPt, double TolDist, double TolAng) {
    this(OCCwrapJavaJNI.new_GeomPlate_CurveConstraint__SWIG_2( Adaptor3d_HCurve.getCPtr(Boundary) , Boundary, Order, NPt, TolDist, TolAng), true);
  }

  public GeomPlate_CurveConstraint( Adaptor3d_HCurve  Boundary, int Order, int NPt, double TolDist) {
    this(OCCwrapJavaJNI.new_GeomPlate_CurveConstraint__SWIG_3( Adaptor3d_HCurve.getCPtr(Boundary) , Boundary, Order, NPt, TolDist), true);
  }

  public GeomPlate_CurveConstraint( Adaptor3d_HCurve  Boundary, int Order, int NPt) {
    this(OCCwrapJavaJNI.new_GeomPlate_CurveConstraint__SWIG_4( Adaptor3d_HCurve.getCPtr(Boundary) , Boundary, Order, NPt), true);
  }

  public GeomPlate_CurveConstraint( Adaptor3d_HCurve  Boundary, int Order) {
    this(OCCwrapJavaJNI.new_GeomPlate_CurveConstraint__SWIG_5( Adaptor3d_HCurve.getCPtr(Boundary) , Boundary, Order), true);
  }

  /**
   *  Allows you to set the order of continuity required for
   *  the constraints: G0, G1, and G2, controlled
   *  respectively by G0Criterion G1Criterion and G2Criterion.
   */
  public void SetOrder(int Order) {
    OCCwrapJavaJNI.GeomPlate_CurveConstraint_SetOrder(swigCPtr, this, Order);
  }

  /**
   *  Returns the order of constraint, one of G0, G1 or G2.
   */
  public int Order() {
    return OCCwrapJavaJNI.GeomPlate_CurveConstraint_Order(swigCPtr, this);
  }

  /**
   *  Returns the number of points on the curve used as a
   *  constraint. The default setting is 10. This parameter
   *  affects computation time, which increases by the cube of
   *  the number of points.
   */
  public int NbPoints() {
    return OCCwrapJavaJNI.GeomPlate_CurveConstraint_NbPoints(swigCPtr, this);
  }

  /**
   *  Allows you to set the number of points on the curve
   *  constraint. The default setting is 10. This parameter
   *  affects computation time, which increases by the cube of
   *  the number of points.
   */
  public void SetNbPoints(int NewNb) {
    OCCwrapJavaJNI.GeomPlate_CurveConstraint_SetNbPoints(swigCPtr, this, NewNb);
  }

  /**
   *  Allows you to set the G0 criterion. This is the law
   *  defining the greatest distance allowed between the
   *  constraint and the target surface for each point of the
   *  constraint. If this criterion is not set, TolDist, the
   *  distance tolerance from the constructor, is used.
   */
  public void SetG0Criterion( Law_Function  G0Crit) {
    OCCwrapJavaJNI.GeomPlate_CurveConstraint_SetG0Criterion(swigCPtr, this,  Law_Function.getCPtr(G0Crit) , G0Crit);
  }

  /**
   *  Allows you to set the G1 criterion. This is the law
   *  defining the greatest angle allowed between the
   *  constraint and the target surface. If this criterion is not
   *  set, TolAng, the angular tolerance from the constructor, is used.
   *  Raises  ConstructionError if  the  curve  is  not  on  a  surface
   */
  public void SetG1Criterion( Law_Function  G1Crit) {
    OCCwrapJavaJNI.GeomPlate_CurveConstraint_SetG1Criterion(swigCPtr, this,  Law_Function.getCPtr(G1Crit) , G1Crit);
  }

  public void SetG2Criterion( Law_Function  G2Crit) {
    OCCwrapJavaJNI.GeomPlate_CurveConstraint_SetG2Criterion(swigCPtr, this,  Law_Function.getCPtr(G2Crit) , G2Crit);
  }

  /**
   *  Returns the G0 criterion at the parametric point U on
   *  the curve. This is the greatest distance allowed between
   *  the constraint and the target surface at U.
   */
  public double G0Criterion(double U) {
    return OCCwrapJavaJNI.GeomPlate_CurveConstraint_G0Criterion(swigCPtr, this, U);
  }

  /**
   *  Returns the G1 criterion at the parametric point U on
   *  the curve. This is the greatest angle allowed between
   *  the constraint and the target surface at U.
   *  Raises  ConstructionError if  the  curve  is  not  on  a  surface
   */
  public double G1Criterion(double U) {
    return OCCwrapJavaJNI.GeomPlate_CurveConstraint_G1Criterion(swigCPtr, this, U);
  }

  /**
   *  Returns the G2 criterion at the parametric point U on
   *  the curve. This is the greatest difference in curvature
   *  allowed between the constraint and the target surface at U.
   *  Raises  ConstructionError if  the  curve  is  not  on  a  surface
   */
  public double G2Criterion(double U) {
    return OCCwrapJavaJNI.GeomPlate_CurveConstraint_G2Criterion(swigCPtr, this, U);
  }

  public double FirstParameter() {
    return OCCwrapJavaJNI.GeomPlate_CurveConstraint_FirstParameter(swigCPtr, this);
  }

  public double LastParameter() {
    return OCCwrapJavaJNI.GeomPlate_CurveConstraint_LastParameter(swigCPtr, this);
  }

  public double Length() {
    return OCCwrapJavaJNI.GeomPlate_CurveConstraint_Length(swigCPtr, this);
  }

  public  GeomLProp_SLProps  LPropSurf(double U) {
    GeomLProp_SLProps ret = new GeomLProp_SLProps(OCCwrapJavaJNI.GeomPlate_CurveConstraint_LPropSurf(swigCPtr, this, U), false, this);
    return ret;
  }

  public void D0(double U, gp_Pnt P) {
    OCCwrapJavaJNI.GeomPlate_CurveConstraint_D0(swigCPtr, this, U, gp_Pnt.getCPtr(P), P);
  }

  public void D1(double U, gp_Pnt P, gp_Vec V1, gp_Vec V2) {
    OCCwrapJavaJNI.GeomPlate_CurveConstraint_D1(swigCPtr, this, U, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V1), V1, gp_Vec.getCPtr(V2), V2);
  }

  public void D2(double U, gp_Pnt P, gp_Vec V1, gp_Vec V2, gp_Vec V3, gp_Vec V4, gp_Vec V5) {
    OCCwrapJavaJNI.GeomPlate_CurveConstraint_D2(swigCPtr, this, U, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V1), V1, gp_Vec.getCPtr(V2), V2, gp_Vec.getCPtr(V3), V3, gp_Vec.getCPtr(V4), V4, gp_Vec.getCPtr(V5), V5);
  }

  public  Adaptor3d_HCurve  Curve3d() {
    return new Adaptor3d_HCurve ( OCCwrapJavaJNI.GeomPlate_CurveConstraint_Curve3d(swigCPtr, this), true );
  }

  /**
   *  loads a 2d curve associated the surface resulting of the constraints
   */
  public void SetCurve2dOnSurf( Geom2d_Curve  Curve2d) {
    OCCwrapJavaJNI.GeomPlate_CurveConstraint_SetCurve2dOnSurf(swigCPtr, this,  Geom2d_Curve.getCPtr(Curve2d) , Curve2d);
  }

  public  Geom2d_Curve  Curve2dOnSurf() {
    return new Geom2d_Curve ( OCCwrapJavaJNI.GeomPlate_CurveConstraint_Curve2dOnSurf(swigCPtr, this), true );
  }

  /**
   *  loads a 2d curve  resulting from the normal projection of
   *  the curve on the initial surface
   */
  public void SetProjectedCurve( Adaptor2d_HCurve2d  Curve2d, double TolU, double TolV) {
    OCCwrapJavaJNI.GeomPlate_CurveConstraint_SetProjectedCurve(swigCPtr, this,  Adaptor2d_HCurve2d.getCPtr(Curve2d) , Curve2d, TolU, TolV);
  }

  public  Adaptor2d_HCurve2d  ProjectedCurve() {
    return new Adaptor2d_HCurve2d ( OCCwrapJavaJNI.GeomPlate_CurveConstraint_ProjectedCurve(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.GeomPlate_CurveConstraint_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.GeomPlate_CurveConstraint_get_type_descriptor(), true );
  }

  public static  GeomPlate_CurveConstraint  DownCast( Standard_Transient  T) {
    return new GeomPlate_CurveConstraint ( OCCwrapJavaJNI.GeomPlate_CurveConstraint_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.GeomPlate_CurveConstraint_TypeOf(), true );
  }

}
