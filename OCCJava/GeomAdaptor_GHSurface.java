package opencascade;

public class GeomAdaptor_GHSurface extends Adaptor3d_HSurface {
  GeomAdaptor_GHSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates an empty GenHSurface.
   */
  public GeomAdaptor_GHSurface() {
    this(OCCwrapJavaJNI.new_GeomAdaptor_GHSurface__SWIG_0(), true);
  }

  /**
   *  Creates a GenHSurface from a Surface.
   */
  public GeomAdaptor_GHSurface( GeomAdaptor_Surface  S) {
    this(OCCwrapJavaJNI.new_GeomAdaptor_GHSurface__SWIG_1(GeomAdaptor_Surface.getCPtr(S), S), true);
  }

  /**
   *  Sets the field of the GenHSurface.
   */
  public void Set( GeomAdaptor_Surface  S) {
    OCCwrapJavaJNI.GeomAdaptor_GHSurface_Set(swigCPtr, this, GeomAdaptor_Surface.getCPtr(S), S);
  }

  /**
   *  Returns the surface used to create the GenHSurface.
   */
  public  GeomAdaptor_Surface  ChangeSurface() {
    GeomAdaptor_Surface ret = new GeomAdaptor_Surface(OCCwrapJavaJNI.GeomAdaptor_GHSurface_ChangeSurface(swigCPtr, this), false, this);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.GeomAdaptor_GHSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.GeomAdaptor_GHSurface_get_type_descriptor(), true );
  }

  public static  GeomAdaptor_GHSurface  DownCast( Standard_Transient  T) {
    return new GeomAdaptor_GHSurface ( OCCwrapJavaJNI.GeomAdaptor_GHSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.GeomAdaptor_GHSurface_TypeOf(), true );
  }

}
