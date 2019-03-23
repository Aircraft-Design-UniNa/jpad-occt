package opencascade;

/**
 *  The general abstract class Geometry in 2D space describes
 *  the common behaviour of all the geometric entities.
 * 
 *  All the objects derived from this class can be move with a
 *  geometric transformation. Only the transformations which
 *  doesn't modify the nature of the geometry are available in
 *  this package.
 *  The method Transform which defines a general transformation
 *  is deferred. The other specifics transformations used the
 *  method Transform.
 *  All the following transformations modify the object itself.
 *  Warning
 *  Only transformations which do not modify the nature
 *  of the geometry can be applied to Geom2d objects:
 *  this is the case with translations, rotations,
 *  symmetries and scales; this is also the case with
 *  gp_Trsf2d composite transformations which are
 *  used to define the geometric transformations applied
 *  using the Transform or Transformed functions.
 *  Note: Geometry defines the "prototype" of the
 *  abstract method Transform which is defined for each
 *  concrete type of derived object. All other
 *  transformations are implemented using the Transform method.
 */
public class Geom2d_Geometry extends Standard_Transient {
  Geom2d_Geometry(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Performs the symmetrical transformation of a Geometry
   *  with respect to the point P which is the center of the
   *  symmetry and assigns the result to this geometric object.
   */
  public void Mirror( gp_Pnt2d  P) {
    OCCwrapJavaJNI.Geom2d_Geometry_Mirror__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of a Geometry
   *  with respect to an axis placement which is the axis of the symmetry.
   */
  public void Mirror( gp_Ax2d  A) {
    OCCwrapJavaJNI.Geom2d_Geometry_Mirror__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  Rotates a Geometry. P is the center of the rotation.
   *  Ang is the angular value of the rotation in radians.
   */
  public void Rotate( gp_Pnt2d  P, double Ang) {
    OCCwrapJavaJNI.Geom2d_Geometry_Rotate(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, Ang);
  }

  /**
   *  Scales a Geometry. S is the scaling value.
   */
  public void Scale( gp_Pnt2d  P, double S) {
    OCCwrapJavaJNI.Geom2d_Geometry_Scale(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, S);
  }

  /**
   *  Translates a Geometry.  V is the vector of the tanslation.
   */
  public void Translate( gp_Vec2d  V) {
    OCCwrapJavaJNI.Geom2d_Geometry_Translate__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V);
  }

  /**
   *  Translates a Geometry from the point P1 to the point P2.
   */
  public void Translate( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    OCCwrapJavaJNI.Geom2d_Geometry_Translate__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2);
  }

  /**
   *  Transformation of a geometric object. This tansformation
   *  can be a translation, a rotation, a symmetry, a scaling
   *  or a complex transformation obtained by combination of
   *  the previous elementaries transformations.
   *  (see class Transformation of the package Geom2d).
   *  The following transformations have the same properties
   *  as the previous ones but they don't modified the object
   *  itself. A copy of the object is returned.
   */
  public void Transform( gp_Trsf2d  T) {
    OCCwrapJavaJNI.Geom2d_Geometry_Transform(swigCPtr, this, gp_Trsf2d.getCPtr(T), T);
  }

  public  Geom2d_Geometry  Mirrored( gp_Pnt2d  P) {
    return new Geom2d_Geometry ( OCCwrapJavaJNI.Geom2d_Geometry_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P), true );
  }

  public  Geom2d_Geometry  Mirrored( gp_Ax2d  A) {
    return new Geom2d_Geometry ( OCCwrapJavaJNI.Geom2d_Geometry_Mirrored__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A), true );
  }

  public  Geom2d_Geometry  Rotated( gp_Pnt2d  P, double Ang) {
    return new Geom2d_Geometry ( OCCwrapJavaJNI.Geom2d_Geometry_Rotated(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, Ang), true );
  }

  public  Geom2d_Geometry  Scaled( gp_Pnt2d  P, double S) {
    return new Geom2d_Geometry ( OCCwrapJavaJNI.Geom2d_Geometry_Scaled(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, S), true );
  }

  public  Geom2d_Geometry  Transformed( gp_Trsf2d  T) {
    return new Geom2d_Geometry ( OCCwrapJavaJNI.Geom2d_Geometry_Transformed(swigCPtr, this, gp_Trsf2d.getCPtr(T), T), true );
  }

  public  Geom2d_Geometry  Translated( gp_Vec2d  V) {
    return new Geom2d_Geometry ( OCCwrapJavaJNI.Geom2d_Geometry_Translated__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V), true );
  }

  public  Geom2d_Geometry  Translated( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    return new Geom2d_Geometry ( OCCwrapJavaJNI.Geom2d_Geometry_Translated__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2), true );
  }

  public  Geom2d_Geometry  Copy() {
    return new Geom2d_Geometry ( OCCwrapJavaJNI.Geom2d_Geometry_Copy(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom2d_Geometry_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Geometry_get_type_descriptor(), true );
  }

  public static  Geom2d_Geometry  DownCast( Standard_Transient  T) {
    return new Geom2d_Geometry ( OCCwrapJavaJNI.Geom2d_Geometry_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Geometry_TypeOf(), true );
  }

}
