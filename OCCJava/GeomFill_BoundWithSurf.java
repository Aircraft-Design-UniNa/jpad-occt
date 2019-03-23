package opencascade;

/**
 *  Defines a 3d curve as a boundary for a
 *  GeomFill_ConstrainedFilling algorithm.
 *  This curve is attached to an existing surface.
 *  Defines a  constrained boundary for  filling
 *  the computations are done with a CurveOnSurf and a
 *  normals field  defined by the normalized normal to
 *  the surface along the PCurve.
 *  Contains fields  to allow a reparametrization of curve
 *  and normals field.
 */
public class GeomFill_BoundWithSurf extends GeomFill_Boundary {
  GeomFill_BoundWithSurf(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Constructs a boundary object defined by the 3d curve CurveOnSurf.
   *  The surface to be filled along this boundary will be in the
   *  tolerance range defined by Tol3d.
   *  What's more, at each point of CurveOnSurf, the angle
   *  between the normal to the surface to be filled along this
   *  boundary, and the normal to the surface on which
   *  CurveOnSurf lies, must not be greater than TolAng.
   *  This object is to be used as a boundary for a
   *  GeomFill_ConstrainedFilling framework.
   *  Warning
   *  CurveOnSurf is an adapted curve, that is, an object
   *  which is an interface between:
   *  -   the services provided by a curve lying on a surface from the package Geom
   *  -   and those required of the curve by the computation algorithm which uses it.
   *  The adapted curve is created in the following way:
   *  Handle(Geom_Surface) mySurface = ... ;
   *  Handle(Geom2d_Curve) myParamCurve = ... ;
   *  // where myParamCurve is a 2D curve in the parametric space of the surface mySurface
   *  Handle(GeomAdaptor_HSurface)
   *  Surface = new
   *  GeomAdaptor_HSurface(mySurface);
   *  Handle(Geom2dAdaptor_HCurve)
   *  ParamCurve = new
   *  Geom2dAdaptor_HCurve(myParamCurve);
   *  CurveOnSurf = Adaptor3d_CurveOnSurface(ParamCurve,Surface);
   *  The boundary is then constructed with the CurveOnSurf object:
   *  Standard_Real Tol = ... ;
   *  Standard_Real TolAng = ... ;
   *  myBoundary =  GeomFill_BoundWithSurf (
   *  CurveOnSurf, Tol, TolAng );
   */
  public GeomFill_BoundWithSurf( Adaptor3d_CurveOnSurface  CurveOnSurf, double Tol3d, double Tolang) {
    this(OCCwrapJavaJNI.new_GeomFill_BoundWithSurf(Adaptor3d_CurveOnSurface.getCPtr(CurveOnSurf), CurveOnSurf, Tol3d, Tolang), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.GeomFill_BoundWithSurf_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.GeomFill_BoundWithSurf_get_type_descriptor(), true );
  }

  public static  GeomFill_BoundWithSurf  DownCast( Standard_Transient  T) {
    return new GeomFill_BoundWithSurf ( OCCwrapJavaJNI.GeomFill_BoundWithSurf_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.GeomFill_BoundWithSurf_TypeOf(), true );
  }

}
