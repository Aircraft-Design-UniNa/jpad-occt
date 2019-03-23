package opencascade;

/**
 *  Describes an infinite line.
 *  A line is defined and positioned in space with an axis
 *  (gp_Ax1 object) which gives it an origin and a unit vector.
 *  The Geom_Line line is parameterized:
 *  P (U) = O + U*Dir, where:
 *  - P is the point of parameter U,
 *  - O is the origin and Dir the unit vector of its positioning axis.
 *  The parameter range is ] -infinite, +infinite [.
 *  The orientation of the line is given by the unit vector
 *  of its positioning axis.
 */
public class Geom_Line extends Geom_Curve {
  Geom_Line(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates a line located in 3D space with the axis placement A1.
   *  The Location of A1 is the origin of the line.
   */
  public Geom_Line( gp_Ax1  A1) {
    this(OCCwrapJavaJNI.new_Geom_Line__SWIG_0(gp_Ax1.getCPtr(A1), A1), true);
  }

  /**
   *  Creates a line from a non transient line from package gp.
   */
  public Geom_Line( gp_Lin  L) {
    this(OCCwrapJavaJNI.new_Geom_Line__SWIG_1(gp_Lin.getCPtr(L), L), true);
  }

  /**
   *  Constructs a line passing through point P and parallel to vector V
   *  (P and V are, respectively, the origin and the unit
   *  vector of the positioning axis of the line).
   */
  public Geom_Line( gp_Pnt  P,  gp_Dir  V) {
    this(OCCwrapJavaJNI.new_Geom_Line__SWIG_2(gp_Pnt.getCPtr(P), P, gp_Dir.getCPtr(V), V), true);
  }

  /**
   *  Set <me> so that <me> has the same geometric properties as L.
   */
  public void SetLin( gp_Lin  L) {
    OCCwrapJavaJNI.Geom_Line_SetLin(swigCPtr, this, gp_Lin.getCPtr(L), L);
  }

  /**
   *  changes the direction of the line.
   */
  public void SetDirection( gp_Dir  V) {
    OCCwrapJavaJNI.Geom_Line_SetDirection(swigCPtr, this, gp_Dir.getCPtr(V), V);
  }

  /**
   *  changes the "Location" point (origin) of the line.
   */
  public void SetLocation( gp_Pnt  P) {
    OCCwrapJavaJNI.Geom_Line_SetLocation(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  changes the "Location" and a the "Direction" of <me>.
   */
  public void SetPosition( gp_Ax1  A1) {
    OCCwrapJavaJNI.Geom_Line_SetPosition(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Returns non transient line from gp with the same geometric
   *  properties as <me>
   */
  public gp_Lin Lin() {
    return new gp_Lin(OCCwrapJavaJNI.Geom_Line_Lin(swigCPtr, this), true);
  }

  /**
   *  Returns the positioning axis of this line; this is also its local coordinate system.
   */
  public  gp_Ax1  Position() {
    gp_Ax1 ret = new gp_Ax1(OCCwrapJavaJNI.Geom_Line_Position(swigCPtr, this), true);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom_Line_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Line_get_type_descriptor(), true );
  }

  public static  Geom_Line  DownCast( Standard_Transient  T) {
    return new Geom_Line ( OCCwrapJavaJNI.Geom_Line_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom_Line_TypeOf(), true );
  }

}
