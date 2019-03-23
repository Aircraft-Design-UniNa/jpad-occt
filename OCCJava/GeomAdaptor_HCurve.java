package opencascade;

/**
 *  An interface between the services provided by any
 *  curve from the package Geom and those required of
 *  the curve by algorithms which use it.
 */
public class GeomAdaptor_HCurve extends GeomAdaptor_GHCurve {
  GeomAdaptor_HCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public GeomAdaptor_HCurve() {
    this(OCCwrapJavaJNI.new_GeomAdaptor_HCurve__SWIG_0(), true);
  }

  public GeomAdaptor_HCurve( GeomAdaptor_Curve  AS) {
    this(OCCwrapJavaJNI.new_GeomAdaptor_HCurve__SWIG_1(GeomAdaptor_Curve.getCPtr(AS), AS), true);
  }

  public GeomAdaptor_HCurve( Geom_Curve  S) {
    this(OCCwrapJavaJNI.new_GeomAdaptor_HCurve__SWIG_2( Geom_Curve.getCPtr(S) , S), true);
  }

  /**
   *  ConstructionError is raised if UFirst>ULast or VFirst>VLast
   */
  public GeomAdaptor_HCurve( Geom_Curve  S, double UFirst, double ULast) {
    this(OCCwrapJavaJNI.new_GeomAdaptor_HCurve__SWIG_3( Geom_Curve.getCPtr(S) , S, UFirst, ULast), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.GeomAdaptor_HCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.GeomAdaptor_HCurve_get_type_descriptor(), true );
  }

  public static  GeomAdaptor_HCurve  DownCast( Standard_Transient  T) {
    return new GeomAdaptor_HCurve ( OCCwrapJavaJNI.GeomAdaptor_HCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.GeomAdaptor_HCurve_TypeOf(), true );
  }

}
