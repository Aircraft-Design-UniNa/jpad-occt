package opencascade;

/**
 *  Defines a 3d curve as a boundary for a
 *  GeomFill_ConstrainedFilling algorithm.
 *  This curve is unattached to an existing surface.D
 *  Contains fields to allow a reparametrization of curve.
 */
public class GeomFill_SimpleBound extends GeomFill_Boundary {
  GeomFill_SimpleBound(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Constructs the boundary object defined by the 3d curve.
   *  The surface to be built along this boundary will be in the
   *  tolerance range defined by Tol3d.
   *  This object is to be used as a boundary for a
   *  GeomFill_ConstrainedFilling framework.
   *  Dummy is initialized but has no function in this class.
   *  Warning
   *  Curve is an adapted curve, that is, an object which is an interface between:
   *  -   the services provided by a 3D curve from the package Geom
   *  -   and those required of the curve by the computation
   *  algorithm which uses it.
   *  The adapted curve is created in one of the following ways:
   *  -   First sequence:
   *  Handle(Geom_Curve) myCurve = ... ;
   *  Handle(GeomAdaptor_HCurve)
   *  Curve = new
   *  GeomAdaptor_HCurve(myCurve);
   *  -   Second sequence:
   *  // Step 1
   *  Handle(Geom_Curve) myCurve = ... ;
   *  GeomAdaptor_Curve Crv (myCurve);
   *  // Step 2
   *  Handle(GeomAdaptor_HCurve)
   *  Curve = new
   *  GeomAdaptor_HCurve(Crv);
   *  You use the second part of this sequence if you already
   *  have the adapted curve Crv.
   *  The boundary is then constructed with the Curve object:
   *  Standard_Real Tol = ... ;
   *  Standard_Real dummy = 0. ;
   *  myBoundary = GeomFill_SimpleBound
   *  (Curve,Tol,dummy);
   */
  public GeomFill_SimpleBound( Adaptor3d_HCurve  Curve, double Tol3d, double Tolang) {
    this(OCCwrapJavaJNI.new_GeomFill_SimpleBound( Adaptor3d_HCurve.getCPtr(Curve) , Curve, Tol3d, Tolang), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.GeomFill_SimpleBound_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.GeomFill_SimpleBound_get_type_descriptor(), true );
  }

  public static  GeomFill_SimpleBound  DownCast( Standard_Transient  T) {
    return new GeomFill_SimpleBound ( OCCwrapJavaJNI.GeomFill_SimpleBound_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.GeomFill_SimpleBound_TypeOf(), true );
  }

}
