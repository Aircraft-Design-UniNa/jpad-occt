package opencascade;

/**
 *  An interface between the services provided by any
 *  surface from the package Geom and those required
 *  of the surface by algorithms which use it.
 *  Provides a  surface handled by reference.
 */
public class GeomAdaptor_HSurface extends GeomAdaptor_GHSurface {
  GeomAdaptor_HSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public GeomAdaptor_HSurface() {
    this(OCCwrapJavaJNI.new_GeomAdaptor_HSurface__SWIG_0(), true);
  }

  public GeomAdaptor_HSurface( GeomAdaptor_Surface  AS) {
    this(OCCwrapJavaJNI.new_GeomAdaptor_HSurface__SWIG_1(GeomAdaptor_Surface.getCPtr(AS), AS), true);
  }

  public GeomAdaptor_HSurface( Geom_Surface  S) {
    this(OCCwrapJavaJNI.new_GeomAdaptor_HSurface__SWIG_2( Geom_Surface.getCPtr(S) , S), true);
  }

  /**
   *  ConstructionError is raised if UFirst>ULast or VFirst>VLast
   */
  public GeomAdaptor_HSurface( Geom_Surface  S, double UFirst, double ULast, double VFirst, double VLast, double TolU, double TolV) {
    this(OCCwrapJavaJNI.new_GeomAdaptor_HSurface__SWIG_3( Geom_Surface.getCPtr(S) , S, UFirst, ULast, VFirst, VLast, TolU, TolV), true);
  }

  public GeomAdaptor_HSurface( Geom_Surface  S, double UFirst, double ULast, double VFirst, double VLast, double TolU) {
    this(OCCwrapJavaJNI.new_GeomAdaptor_HSurface__SWIG_4( Geom_Surface.getCPtr(S) , S, UFirst, ULast, VFirst, VLast, TolU), true);
  }

  public GeomAdaptor_HSurface( Geom_Surface  S, double UFirst, double ULast, double VFirst, double VLast) {
    this(OCCwrapJavaJNI.new_GeomAdaptor_HSurface__SWIG_5( Geom_Surface.getCPtr(S) , S, UFirst, ULast, VFirst, VLast), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.GeomAdaptor_HSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.GeomAdaptor_HSurface_get_type_descriptor(), true );
  }

  public static  GeomAdaptor_HSurface  DownCast( Standard_Transient  T) {
    return new GeomAdaptor_HSurface ( OCCwrapJavaJNI.GeomAdaptor_HSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.GeomAdaptor_HSurface_TypeOf(), true );
  }

}
