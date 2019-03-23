package opencascade;

/**
 *  The class Direction specifies a vector that is never null.
 *  It is a unit vector.
 */
public class Geom_Direction extends Geom_Vector {
  Geom_Direction(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates a unit vector with it 3 cartesian coordinates.
   * 
   *  Raised if Sqrt( X*X + Y*Y + Z*Z) <= Resolution from gp.
   */
  public Geom_Direction(double X, double Y, double Z) {
    this(OCCwrapJavaJNI.new_Geom_Direction__SWIG_0(X, Y, Z), true);
  }

  /**
   *  Creates a transient copy of <me>.
   */
  public Geom_Direction( gp_Dir  V) {
    this(OCCwrapJavaJNI.new_Geom_Direction__SWIG_1(gp_Dir.getCPtr(V), V), true);
  }

  /**
   *  Sets <me> to X,Y,Z coordinates.
   * 
   *  Raised if Sqrt( X*X + Y*Y + Z*Z) <= Resolution from gp.
   */
  public void SetCoord(double X, double Y, double Z) {
    OCCwrapJavaJNI.Geom_Direction_SetCoord(swigCPtr, this, X, Y, Z);
  }

  /**
   *  Converts the gp_Dir unit vector V into this unit vector.
   */
  public void SetDir( gp_Dir  V) {
    OCCwrapJavaJNI.Geom_Direction_SetDir(swigCPtr, this, gp_Dir.getCPtr(V), V);
  }

  /**
   *  Changes the X coordinate of <me>.
   * 
   *  Raised if Sqrt( X*X + Y*Y + Z*Z) <= Resolution from gp.
   */
  public void SetX(double X) {
    OCCwrapJavaJNI.Geom_Direction_SetX(swigCPtr, this, X);
  }

  /**
   *  Changes the Y coordinate of <me>.
   * 
   *  Raised if Sqrt( X*X + Y*Y + Z*Z) <= Resolution from gp.
   */
  public void SetY(double Y) {
    OCCwrapJavaJNI.Geom_Direction_SetY(swigCPtr, this, Y);
  }

  /**
   *  Changes the Z coordinate of <me>.
   * 
   *  Raised if Sqrt( X*X + Y*Y + Z*Z) <= Resolution from gp.
   */
  public void SetZ(double Z) {
    OCCwrapJavaJNI.Geom_Direction_SetZ(swigCPtr, this, Z);
  }

  /**
   *  Returns the non transient direction with the same
   *  coordinates as <me>.
   */
  public gp_Dir Dir() {
    return new gp_Dir(OCCwrapJavaJNI.Geom_Direction_Dir(swigCPtr, this), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_Direction_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Direction_get_type_descriptor(), true );
  }

  public static  Geom_Direction  DownCast( Standard_Transient  T) {
    return new Geom_Direction ( OCCwrapJavaJNI.Geom_Direction_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Direction_TypeOf(), true );
  }

}
