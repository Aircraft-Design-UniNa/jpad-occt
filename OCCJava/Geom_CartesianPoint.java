package opencascade;

/**
 *  Describes a point in 3D space. A
 *  Geom_CartesianPoint is defined by a gp_Pnt point,
 *  with its three Cartesian coordinates X, Y and Z.
 */
public class Geom_CartesianPoint extends Geom_Point {
  Geom_CartesianPoint(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a transient copy of P.
   */
  public Geom_CartesianPoint( gp_Pnt  P) {
    this(OCCwrapJavaJNI.new_Geom_CartesianPoint__SWIG_0(gp_Pnt.getCPtr(P), P), true);
  }

  /**
   *  Constructs a point defined by its three Cartesian coordinates X, Y and Z.
   */
  public Geom_CartesianPoint(double X, double Y, double Z) {
    this(OCCwrapJavaJNI.new_Geom_CartesianPoint__SWIG_1(X, Y, Z), true);
  }

  /**
   *  Assigns the coordinates X, Y and Z to this point.
   */
  public void SetCoord(double X, double Y, double Z) {
    OCCwrapJavaJNI.Geom_CartesianPoint_SetCoord(swigCPtr, this, X, Y, Z);
  }

  /**
   *  Set <me> to P.X(), P.Y(), P.Z() coordinates.
   */
  public void SetPnt( gp_Pnt  P) {
    OCCwrapJavaJNI.Geom_CartesianPoint_SetPnt(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Changes the X coordinate of me.
   */
  public void SetX(double X) {
    OCCwrapJavaJNI.Geom_CartesianPoint_SetX(swigCPtr, this, X);
  }

  /**
   *  Changes the Y coordinate of me.
   */
  public void SetY(double Y) {
    OCCwrapJavaJNI.Geom_CartesianPoint_SetY(swigCPtr, this, Y);
  }

  /**
   *  Changes the Z coordinate of me.
   */
  public void SetZ(double Z) {
    OCCwrapJavaJNI.Geom_CartesianPoint_SetZ(swigCPtr, this, Z);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_CartesianPoint_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_CartesianPoint_get_type_descriptor(), true );
  }

  public static  Geom_CartesianPoint  DownCast( Standard_Transient  T) {
    return new Geom_CartesianPoint ( OCCwrapJavaJNI.Geom_CartesianPoint_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_CartesianPoint_TypeOf(), true );
  }

}
