package opencascade;

/**
 *  The abstract class Geometry for 3D space is the root
 *  class of all geometric objects from the Geom
 *  package. It describes the common behavior of these objects when:
 *  - applying geometric transformations to objects, and
 *  - constructing objects by geometric transformation (including copying).
 *  Warning
 *  Only transformations which do not modify the nature
 *  of the geometry can be applied to Geom objects: this
 *  is the case with translations, rotations, symmetries
 *  and scales; this is also the case with gp_Trsf
 *  composite transformations which are used to define
 *  the geometric transformations applied using the
 *  Transform or Transformed functions.
 *  Note: Geometry defines the "prototype" of the
 *  abstract method Transform which is defined for each
 *  concrete type of derived object. All other
 *  transformations are implemented using the Transform method.
 */
public class Geom_Geometry extends Standard_Transient {
  Geom_Geometry(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Performs the symmetrical transformation of a Geometry
   *  with respect to the point P which is the center of the
   *  symmetry.
   */
  public void Mirror( gp_Pnt  P) {
    OCCwrapJavaJNI.Geom_Geometry_Mirror__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of a Geometry
   *  with respect to an axis placement which is the axis of the
   *  symmetry.
   */
  public void Mirror( gp_Ax1  A1) {
    OCCwrapJavaJNI.Geom_Geometry_Mirror__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Performs the symmetrical transformation of a Geometry
   *  with respect to a plane. The axis placement A2 locates
   *  the plane of the symmetry : (Location, XDirection, YDirection).
   */
  public void Mirror( gp_Ax2  A2) {
    OCCwrapJavaJNI.Geom_Geometry_Mirror__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Rotates a Geometry. A1 is the axis of the rotation.
   *  Ang is the angular value of the rotation in radians.
   */
  public void Rotate( gp_Ax1  A1, double Ang) {
    OCCwrapJavaJNI.Geom_Geometry_Rotate(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang);
  }

  /**
   *  Scales a Geometry. S is the scaling value.
   */
  public void Scale( gp_Pnt  P, double S) {
    OCCwrapJavaJNI.Geom_Geometry_Scale(swigCPtr, this, gp_Pnt.getCPtr(P), P, S);
  }

  /**
   *  Translates a Geometry.  V is the vector of the tanslation.
   */
  public void Translate( gp_Vec  V) {
    OCCwrapJavaJNI.Geom_Geometry_Translate__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V);
  }

  /**
   *  Translates a Geometry from the point P1 to the point P2.
   */
  public void Translate( gp_Pnt  P1,  gp_Pnt  P2) {
    OCCwrapJavaJNI.Geom_Geometry_Translate__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Transformation of a geometric object. This tansformation
   *  can be a translation, a rotation, a symmetry, a scaling
   *  or a complex transformation obtained by combination of
   *  the previous elementaries transformations.
   *  (see class Transformation of the package Geom).
   */
  public void Transform( gp_Trsf  T) {
    OCCwrapJavaJNI.Geom_Geometry_Transform(swigCPtr, this, gp_Trsf.getCPtr(T), T);
  }

  public  Geom_Geometry  Mirrored( gp_Pnt  P) {
    return new Geom_Geometry ( OCCwrapJavaJNI.Geom_Geometry_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P), true );
  }

  public  Geom_Geometry  Mirrored( gp_Ax1  A1) {
    return new Geom_Geometry ( OCCwrapJavaJNI.Geom_Geometry_Mirrored__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1), true );
  }

  public  Geom_Geometry  Mirrored( gp_Ax2  A2) {
    return new Geom_Geometry ( OCCwrapJavaJNI.Geom_Geometry_Mirrored__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2), true );
  }

  public  Geom_Geometry  Rotated( gp_Ax1  A1, double Ang) {
    return new Geom_Geometry ( OCCwrapJavaJNI.Geom_Geometry_Rotated(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang), true );
  }

  public  Geom_Geometry  Scaled( gp_Pnt  P, double S) {
    return new Geom_Geometry ( OCCwrapJavaJNI.Geom_Geometry_Scaled(swigCPtr, this, gp_Pnt.getCPtr(P), P, S), true );
  }

  public  Geom_Geometry  Transformed( gp_Trsf  T) {
    return new Geom_Geometry ( OCCwrapJavaJNI.Geom_Geometry_Transformed(swigCPtr, this, gp_Trsf.getCPtr(T), T), true );
  }

  public  Geom_Geometry  Translated( gp_Vec  V) {
    return new Geom_Geometry ( OCCwrapJavaJNI.Geom_Geometry_Translated__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V), true );
  }

  public  Geom_Geometry  Translated( gp_Pnt  P1,  gp_Pnt  P2) {
    return new Geom_Geometry ( OCCwrapJavaJNI.Geom_Geometry_Translated__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true );
  }

  public  Geom_Geometry  Copy() {
    return new Geom_Geometry ( OCCwrapJavaJNI.Geom_Geometry_Copy(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_Geometry_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Geometry_get_type_descriptor(), true );
  }

  public static  Geom_Geometry  DownCast( Standard_Transient  T) {
    return new Geom_Geometry ( OCCwrapJavaJNI.Geom_Geometry_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Geometry_TypeOf(), true );
  }

}
