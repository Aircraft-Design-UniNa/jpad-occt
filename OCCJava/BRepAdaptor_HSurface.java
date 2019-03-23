package opencascade;

public class BRepAdaptor_HSurface extends Adaptor3d_HSurface {
  BRepAdaptor_HSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates an empty GenHSurface.
   */
  public BRepAdaptor_HSurface() {
    this(OCCwrapJavaJNI.new_BRepAdaptor_HSurface__SWIG_0(), true);
  }

  /**
   *  Creates a GenHSurface from a Surface.
   */
  public BRepAdaptor_HSurface( BRepAdaptor_Surface  S) {
    this(OCCwrapJavaJNI.new_BRepAdaptor_HSurface__SWIG_1(BRepAdaptor_Surface.getCPtr(S), S), true);
  }

  /**
   *  Sets the field of the GenHSurface.
   */
  public void Set( BRepAdaptor_Surface  S) {
    OCCwrapJavaJNI.BRepAdaptor_HSurface_Set(swigCPtr, this, BRepAdaptor_Surface.getCPtr(S), S);
  }

  /**
   *  Returns the surface used to create the GenHSurface.
   */
  public  BRepAdaptor_Surface  ChangeSurface() {
    BRepAdaptor_Surface ret = new BRepAdaptor_Surface(OCCwrapJavaJNI.BRepAdaptor_HSurface_ChangeSurface(swigCPtr, this), false, this);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.BRepAdaptor_HSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepAdaptor_HSurface_get_type_descriptor(), true );
  }

  public static  BRepAdaptor_HSurface  DownCast( Standard_Transient  T) {
    return new BRepAdaptor_HSurface ( OCCwrapJavaJNI.BRepAdaptor_HSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepAdaptor_HSurface_TypeOf(), true );
  }

}
