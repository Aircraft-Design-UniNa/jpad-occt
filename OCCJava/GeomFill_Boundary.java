package opencascade;

/**
 *  Root class to define a boundary  which will form part of a
 *  contour around a gap requiring filling.
 *  Any  new type  of  constrained boundary must inherit this class.
 *  The GeomFill package provides two classes to define constrained boundaries:
 *  -   GeomFill_SimpleBound to define an unattached boundary
 *  -   GeomFill_BoundWithSurf to define a boundary attached to a surface.
 *  These objects are used to define the boundaries for a
 *  GeomFill_ConstrainedFilling framework.
 */
public class GeomFill_Boundary extends Standard_Transient {
  GeomFill_Boundary(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public gp_Pnt Value(double U) {
    return new gp_Pnt(OCCwrapJavaJNI.GeomFill_Boundary_Value(swigCPtr, this, U), true);
  }

  public void D1(double U, gp_Pnt P, gp_Vec V) {
    OCCwrapJavaJNI.GeomFill_Boundary_D1(swigCPtr, this, U, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V), V);
  }

  public long HasNormals() {
    return OCCwrapJavaJNI.GeomFill_Boundary_HasNormals(swigCPtr, this);
  }

  public gp_Vec Norm(double U) {
    return new gp_Vec(OCCwrapJavaJNI.GeomFill_Boundary_Norm(swigCPtr, this, U), true);
  }

  public void D1Norm(double U, gp_Vec N, gp_Vec DN) {
    OCCwrapJavaJNI.GeomFill_Boundary_D1Norm(swigCPtr, this, U, gp_Vec.getCPtr(N), N, gp_Vec.getCPtr(DN), DN);
  }

  public void Reparametrize(double First, double Last, long HasDF, long HasDL, double DF, double DL, long Rev) {
    OCCwrapJavaJNI.GeomFill_Boundary_Reparametrize(swigCPtr, this, First, Last, HasDF, HasDL, DF, DL, Rev);
  }

  public void Points(gp_Pnt PFirst, gp_Pnt PLast) {
    OCCwrapJavaJNI.GeomFill_Boundary_Points(swigCPtr, this, gp_Pnt.getCPtr(PFirst), PFirst, gp_Pnt.getCPtr(PLast), PLast);
  }

  public void Bounds(double[] First, double[] Last) {
    OCCwrapJavaJNI.GeomFill_Boundary_Bounds(swigCPtr, this, First, Last);
  }

  public long IsDegenerated() {
    return OCCwrapJavaJNI.GeomFill_Boundary_IsDegenerated(swigCPtr, this);
  }

  public double Tol3d() {
    return OCCwrapJavaJNI.GeomFill_Boundary_Tol3d__SWIG_0(swigCPtr, this);
  }

  public void Tol3d(double Tol) {
    OCCwrapJavaJNI.GeomFill_Boundary_Tol3d__SWIG_1(swigCPtr, this, Tol);
  }

  public double Tolang() {
    return OCCwrapJavaJNI.GeomFill_Boundary_Tolang__SWIG_0(swigCPtr, this);
  }

  public void Tolang(double Tol) {
    OCCwrapJavaJNI.GeomFill_Boundary_Tolang__SWIG_1(swigCPtr, this, Tol);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.GeomFill_Boundary_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.GeomFill_Boundary_get_type_descriptor(), true );
  }

  public static  GeomFill_Boundary  DownCast( Standard_Transient  T) {
    return new GeomFill_Boundary ( OCCwrapJavaJNI.GeomFill_Boundary_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.GeomFill_Boundary_TypeOf(), true );
  }

}
