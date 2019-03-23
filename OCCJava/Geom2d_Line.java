package opencascade;

/**
 *  Describes an infinite line in the plane (2D space).
 *  A line is defined and positioned in the plane with an
 *  axis (gp_Ax2d object) which gives it an origin and a unit vector.
 *  The Geom2d_Line line is parameterized as follows:
 *  P (U) = O + U*Dir
 *  where:
 *  - P is the point of parameter U,
 *  - O is the origin and Dir the unit vector of its positioning axis.
 *  The parameter range is ] -infinite, +infinite [.
 *  The orientation of the line is given by the unit vector
 *  of its positioning axis.
 *  See Also
 *  GCE2d_MakeLine which provides functions for more
 *  complex line constructions
 *  gp_Ax2d
 *  gp_Lin2d for an equivalent, non-parameterized data structure.
 */
public class Geom2d_Line extends Geom2d_Curve {
  Geom2d_Line(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates a line located in 2D space with the axis placement A.
   *  The Location of A is the origin of the line.
   */
  public Geom2d_Line( gp_Ax2d  A) {
    this(OCCwrapJavaJNI.new_Geom2d_Line__SWIG_0(gp_Ax2d.getCPtr(A), A), true);
  }

  /**
   *  Creates a line by conversion of the gp_Lin2d line L.
   */
  public Geom2d_Line( gp_Lin2d  L) {
    this(OCCwrapJavaJNI.new_Geom2d_Line__SWIG_1(gp_Lin2d.getCPtr(L), L), true);
  }

  /**
   *  Constructs a line passing through point P and parallel to
   *  vector V (P and V are, respectively, the origin
   *  and the unit vector of the positioning axis of the line).
   */
  public Geom2d_Line( gp_Pnt2d  P,  gp_Dir2d  V) {
    this(OCCwrapJavaJNI.new_Geom2d_Line__SWIG_2(gp_Pnt2d.getCPtr(P), P, gp_Dir2d.getCPtr(V), V), true);
  }

  /**
   *  Set <me> so that <me> has the same geometric properties as L.
   */
  public void SetLin2d( gp_Lin2d  L) {
    OCCwrapJavaJNI.Geom2d_Line_SetLin2d(swigCPtr, this, gp_Lin2d.getCPtr(L), L);
  }

  /**
   *  changes the direction of the line.
   */
  public void SetDirection( gp_Dir2d  V) {
    OCCwrapJavaJNI.Geom2d_Line_SetDirection(swigCPtr, this, gp_Dir2d.getCPtr(V), V);
  }

  /**
   *  changes the direction of the line.
   */
  public  gp_Dir2d  Direction() {
    gp_Dir2d ret = new gp_Dir2d(OCCwrapJavaJNI.Geom2d_Line_Direction(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Changes the "Location" point (origin) of the line.
   */
  public void SetLocation( gp_Pnt2d  P) {
    OCCwrapJavaJNI.Geom2d_Line_SetLocation(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Changes the "Location" point (origin) of the line.
   */
  public  gp_Pnt2d  Location() {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.Geom2d_Line_Location(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Changes the "Location" and a the "Direction" of <me>.
   */
  public void SetPosition( gp_Ax2d  A) {
    OCCwrapJavaJNI.Geom2d_Line_SetPosition(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  public  gp_Ax2d  Position() {
    gp_Ax2d ret = new gp_Ax2d(OCCwrapJavaJNI.Geom2d_Line_Position(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns non persistent line from gp with the same geometric
   *  properties as <me>
   */
  public gp_Lin2d Lin2d() {
    return new gp_Lin2d(OCCwrapJavaJNI.Geom2d_Line_Lin2d(swigCPtr, this), true);
  }

  /**
   *  Computes the distance between <me> and the point P.
   */
  public double Distance( gp_Pnt2d  P) {
    return OCCwrapJavaJNI.Geom2d_Line_Distance(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Geom2d_Line_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Line_get_type_descriptor(), true );
  }

  public static  Geom2d_Line  DownCast( Standard_Transient  T) {
    return new Geom2d_Line ( OCCwrapJavaJNI.Geom2d_Line_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Geom2d_Line_TypeOf(), true );
  }

}
