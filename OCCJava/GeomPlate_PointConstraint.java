package opencascade;

/**
 *  Defines points as constraints to be used to deform a surface.
 */
public class GeomPlate_PointConstraint extends Standard_Transient {
  GeomPlate_PointConstraint(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Constructs a point constraint object defined by  Pt, a 3D point
   *  Order gives the order of constraint, one of:
   *  -   -1 i.e. none, or 0 i.e.G0 when assigned to Pt
   *  -   -1 i.e. none, 0 i.e. G0, 1 i.e. G1, 2 i.e. G2 when
   *  assigned to U, V and Surf.
   *  In this constructor, only TolDist is given.
   *  Distance tolerance represents the greatest distance
   *  allowed between the constraint and the target surface.
   *  Angular tolerance represents the largest angle allowed
   *  between the constraint and the target surface. Curvature
   *  tolerance represents the greatest difference in curvature
   *  allowed between the constraint and the target surface.
   *  Raises   ConstructionError if Order  is  not  0  or  -1
   */
  public GeomPlate_PointConstraint( gp_Pnt  Pt, int Order, double TolDist) {
    this(OCCwrapJavaJNI.new_GeomPlate_PointConstraint__SWIG_0(gp_Pnt.getCPtr(Pt), Pt, Order, TolDist), true);
  }

  /**
   *  Constructs a point constraint object defined by
   *  the intersection point of U and V on the surface Surf.
   *  Order gives the order of constraint, one of:
   *  -   -1 i.e. none, or 0 i.e.G0 when assigned to Pt
   *  -   -1 i.e. none, 0 i.e. G0, 1 i.e. G1, 2 i.e. G2 when
   *  assigned to U, V and Surf.
   *  In this constructor the surface to be generated must
   *  respect several tolerance values only:
   *  -   the distance tolerance TolDist
   *  -   the angular tolerance TolAng
   *  -   the curvature tolerance, TolCurv.
   *  Distance tolerance represents the greatest distance
   *  allowed between the constraint and the target surface.
   *  Angular tolerance represents the largest angle allowed
   *  between the constraint and the target surface. Curvature
   *  tolerance represents the greatest difference in curvature
   *  allowed between the constraint and the target surface.Creates a punctual constraint.
   */
  public GeomPlate_PointConstraint( gp_Pnt  Pt, int Order) {
    this(OCCwrapJavaJNI.new_GeomPlate_PointConstraint__SWIG_1(gp_Pnt.getCPtr(Pt), Pt, Order), true);
  }

  public GeomPlate_PointConstraint(double U, double V,  Geom_Surface  Surf, int Order, double TolDist, double TolAng, double TolCurv) {
    this(OCCwrapJavaJNI.new_GeomPlate_PointConstraint__SWIG_2(U, V,  Geom_Surface.getCPtr(Surf) , Surf, Order, TolDist, TolAng, TolCurv), true);
  }

  public GeomPlate_PointConstraint(double U, double V,  Geom_Surface  Surf, int Order, double TolDist, double TolAng) {
    this(OCCwrapJavaJNI.new_GeomPlate_PointConstraint__SWIG_3(U, V,  Geom_Surface.getCPtr(Surf) , Surf, Order, TolDist, TolAng), true);
  }

  public GeomPlate_PointConstraint(double U, double V,  Geom_Surface  Surf, int Order, double TolDist) {
    this(OCCwrapJavaJNI.new_GeomPlate_PointConstraint__SWIG_4(U, V,  Geom_Surface.getCPtr(Surf) , Surf, Order, TolDist), true);
  }

  public GeomPlate_PointConstraint(double U, double V,  Geom_Surface  Surf, int Order) {
    this(OCCwrapJavaJNI.new_GeomPlate_PointConstraint__SWIG_5(U, V,  Geom_Surface.getCPtr(Surf) , Surf, Order), true);
  }

  public void SetOrder(int Order) {
    OCCwrapJavaJNI.GeomPlate_PointConstraint_SetOrder(swigCPtr, this, Order);
  }

  /**
   *  Returns the order of constraint: G0, G1, and G2,
   *  controlled respectively by G0Criterion G1Criterion and G2Criterion.
   */
  public int Order() {
    return OCCwrapJavaJNI.GeomPlate_PointConstraint_Order(swigCPtr, this);
  }

  /**
   *  Allows you to set the G0 criterion. This is the law
   *  defining the greatest distance allowed between the
   *  constraint and the target surface. If this criterion is not
   *  set, {TolDist, the distance tolerance from the constructor, is used
   */
  public void SetG0Criterion(double TolDist) {
    OCCwrapJavaJNI.GeomPlate_PointConstraint_SetG0Criterion(swigCPtr, this, TolDist);
  }

  /**
   *  Allows you to set the G1 criterion. This is the law
   *  defining the greatest angle allowed between the
   *  constraint and the target surface. If this criterion is not
   *  set, TolAng, the angular tolerance from the constructor, is used.
   *  Raises   ConstructionError  if  the  point  is  not  on  the  surface
   */
  public void SetG1Criterion(double TolAng) {
    OCCwrapJavaJNI.GeomPlate_PointConstraint_SetG1Criterion(swigCPtr, this, TolAng);
  }

  /**
   *  Allows you to set the G2 criterion. This is the law
   *  defining the greatest difference in curvature allowed
   *  between the constraint and the target surface. If this
   *  criterion is not set, TolCurv, the curvature tolerance from
   *  the constructor, is used.
   *  Raises   ConstructionError if  the  point  is  not  on  the  surface
   */
  public void SetG2Criterion(double TolCurv) {
    OCCwrapJavaJNI.GeomPlate_PointConstraint_SetG2Criterion(swigCPtr, this, TolCurv);
  }

  /**
   *  Returns the G0 criterion. This is the greatest distance
   *  allowed between the constraint and the target surface.
   */
  public double G0Criterion() {
    return OCCwrapJavaJNI.GeomPlate_PointConstraint_G0Criterion(swigCPtr, this);
  }

  /**
   *  Returns the G1 criterion. This is the greatest angle
   *  allowed between the constraint and the target surface.
   *  Raises   ConstructionError if  the  point  is  not  on  the  surface.
   */
  public double G1Criterion() {
    return OCCwrapJavaJNI.GeomPlate_PointConstraint_G1Criterion(swigCPtr, this);
  }

  /**
   *  Returns the G2 criterion. This is the greatest difference
   *  in curvature allowed between the constraint and the target surface.
   *  Raises   ConstructionError if  the  point  is  not  on  the  surface
   */
  public double G2Criterion() {
    return OCCwrapJavaJNI.GeomPlate_PointConstraint_G2Criterion(swigCPtr, this);
  }

  public void D0(gp_Pnt P) {
    OCCwrapJavaJNI.GeomPlate_PointConstraint_D0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  public void D1(gp_Pnt P, gp_Vec V1, gp_Vec V2) {
    OCCwrapJavaJNI.GeomPlate_PointConstraint_D1(swigCPtr, this, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V1), V1, gp_Vec.getCPtr(V2), V2);
  }

  public void D2(gp_Pnt P, gp_Vec V1, gp_Vec V2, gp_Vec V3, gp_Vec V4, gp_Vec V5) {
    OCCwrapJavaJNI.GeomPlate_PointConstraint_D2(swigCPtr, this, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V1), V1, gp_Vec.getCPtr(V2), V2, gp_Vec.getCPtr(V3), V3, gp_Vec.getCPtr(V4), V4, gp_Vec.getCPtr(V5), V5);
  }

  public long HasPnt2dOnSurf() {
    return OCCwrapJavaJNI.GeomPlate_PointConstraint_HasPnt2dOnSurf(swigCPtr, this);
  }

  public void SetPnt2dOnSurf( gp_Pnt2d  Pnt) {
    OCCwrapJavaJNI.GeomPlate_PointConstraint_SetPnt2dOnSurf(swigCPtr, this, gp_Pnt2d.getCPtr(Pnt), Pnt);
  }

  public gp_Pnt2d Pnt2dOnSurf() {
    return new gp_Pnt2d(OCCwrapJavaJNI.GeomPlate_PointConstraint_Pnt2dOnSurf(swigCPtr, this), true);
  }

  public  GeomLProp_SLProps  LPropSurf() {
    GeomLProp_SLProps ret = new GeomLProp_SLProps(OCCwrapJavaJNI.GeomPlate_PointConstraint_LPropSurf(swigCPtr, this), false, this);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.GeomPlate_PointConstraint_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.GeomPlate_PointConstraint_get_type_descriptor(), true );
  }

  public static  GeomPlate_PointConstraint  DownCast( Standard_Transient  T) {
    return new GeomPlate_PointConstraint ( OCCwrapJavaJNI.GeomPlate_PointConstraint_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.GeomPlate_PointConstraint_TypeOf(), true );
  }

}
