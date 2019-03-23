package opencascade;

/**
 *  Describes a line in 3D space.
 *  A line is positioned in space with an axis (a gp_Ax1
 *  object) which gives it an origin and a unit vector.
 *  A line and an axis are similar objects, thus, we can
 *  convert one into the other. A line provides direct access
 *  to the majority of the edit and query functions available
 *  on its positioning axis. In addition, however, a line has
 *  specific functions for computing distances and positions.
 *  See Also
 *  gce_MakeLin which provides functions for more complex
 *  line constructions
 *  Geom_Line which provides additional functions for
 *  constructing lines and works, in particular, with the
 *  parametric equations of lines
 */
public class gp_Lin {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Lin(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Lin(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Lin obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Lin ptr) { Ptr = ptr; }
    public gp_Lin AsReference () { return Ptr; }
    public gp_Lin AsCopy () { return Ptr.MakeCopy(); }
    public gp_Lin Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Lin(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a Line corresponding to Z axis of the
   *  reference coordinate system.
   */
  public gp_Lin() {
    this(OCCwrapJavaJNI.new_gp_Lin__SWIG_0(), true);
  }

  /**
   *  Creates a line defined by axis A1.
   */
  public gp_Lin( gp_Ax1  A1) {
    this(OCCwrapJavaJNI.new_gp_Lin__SWIG_1(gp_Ax1.getCPtr(A1), A1), true);
  }

  /**
   *  Creates a line passing through point P and parallel to
   *  vector V (P and V are, respectively, the origin and
   *  the unit vector of the positioning axis of the line).
   */
  public gp_Lin( gp_Pnt  P,  gp_Dir  V) {
    this(OCCwrapJavaJNI.new_gp_Lin__SWIG_2(gp_Pnt.getCPtr(P), P, gp_Dir.getCPtr(V), V), true);
  }

  public void Reverse() {
    OCCwrapJavaJNI.gp_Lin_Reverse(swigCPtr, this);
  }

  /**
   *  Reverses the direction of the line.
   *  Note:
   *  -   Reverse assigns the result to this line, while
   *  -   Reversed creates a new one.
   */
  public gp_Lin Reversed() {
    return new gp_Lin(OCCwrapJavaJNI.gp_Lin_Reversed(swigCPtr, this), true);
  }

  /**
   *  Changes the direction of the line.
   */
  public void SetDirection( gp_Dir  V) {
    OCCwrapJavaJNI.gp_Lin_SetDirection(swigCPtr, this, gp_Dir.getCPtr(V), V);
  }

  /**
   *  Changes the location point (origin) of the line.
   */
  public void SetLocation( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Lin_SetLocation(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Complete redefinition of the line.
   *  The "Location" point of <A1> is the origin of the line.
   *  The "Direction" of <A1> is  the direction of the line.
   */
  public void SetPosition( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Lin_SetPosition(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Returns the direction of the line.
   */
  public  gp_Dir  Direction() {
    gp_Dir ret = new gp_Dir(OCCwrapJavaJNI.gp_Lin_Direction(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the location point (origin) of the line.
   */
  public  gp_Pnt  Location() {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.gp_Lin_Location(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the axis placement one axis whith the same
   *  location and direction as <me>.
   */
  public  gp_Ax1  Position() {
    gp_Ax1 ret = new gp_Ax1(OCCwrapJavaJNI.gp_Lin_Position(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Computes the angle between two lines in radians.
   */
  public double Angle( gp_Lin  Other) {
    return OCCwrapJavaJNI.gp_Lin_Angle(swigCPtr, this, gp_Lin.getCPtr(Other), Other);
  }

  /**
   *  Returns true if this line contains the point P, that is, if the
   *  distance between point P and this line is less than or
   *  equal to LinearTolerance..
   */
  public long Contains( gp_Pnt  P, double LinearTolerance) {
    return OCCwrapJavaJNI.gp_Lin_Contains(swigCPtr, this, gp_Pnt.getCPtr(P), P, LinearTolerance);
  }

  /**
   *  Computes the distance between <me> and the point P.
   */
  public double Distance( gp_Pnt  P) {
    return OCCwrapJavaJNI.gp_Lin_Distance__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Computes the distance between two lines.
   */
  public double Distance( gp_Lin  Other) {
    return OCCwrapJavaJNI.gp_Lin_Distance__SWIG_1(swigCPtr, this, gp_Lin.getCPtr(Other), Other);
  }

  /**
   *  Computes the square distance between <me> and the point P.
   */
  public double SquareDistance( gp_Pnt  P) {
    return OCCwrapJavaJNI.gp_Lin_SquareDistance__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Computes the square distance between two lines.
   */
  public double SquareDistance( gp_Lin  Other) {
    return OCCwrapJavaJNI.gp_Lin_SquareDistance__SWIG_1(swigCPtr, this, gp_Lin.getCPtr(Other), Other);
  }

  /**
   *  Computes the line normal to the direction of <me>, passing
   *  through the point P.  Raises ConstructionError
   *  if the distance between <me> and the point P is lower
   *  or equal to Resolution from gp because there is an infinity of
   *  solutions in 3D space.
   */
  public gp_Lin Normal( gp_Pnt  P) {
    return new gp_Lin(OCCwrapJavaJNI.gp_Lin_Normal(swigCPtr, this, gp_Pnt.getCPtr(P), P), true);
  }

  public void Mirror( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Lin_Mirror__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of a line
   *  with respect to the point P which is the center of
   *  the symmetry.
   */
  public gp_Lin Mirrored( gp_Pnt  P) {
    return new gp_Lin(OCCwrapJavaJNI.gp_Lin_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P), true);
  }

  public void Mirror( gp_Ax1  A1) {
    OCCwrapJavaJNI.gp_Lin_Mirror__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Performs the symmetrical transformation of a line
   *  with respect to an axis placement which is the axis
   *  of the symmetry.
   */
  public gp_Lin Mirrored( gp_Ax1  A1) {
    return new gp_Lin(OCCwrapJavaJNI.gp_Lin_Mirrored__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1), true);
  }

  public void Mirror( gp_Ax2  A2) {
    OCCwrapJavaJNI.gp_Lin_Mirror__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Performs the symmetrical transformation of a line
   *  with respect to a plane. The axis placement  <A2>
   *  locates the plane of the symmetry :
   *  (Location, XDirection, YDirection).
   */
  public gp_Lin Mirrored( gp_Ax2  A2) {
    return new gp_Lin(OCCwrapJavaJNI.gp_Lin_Mirrored__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2), true);
  }

  public void Rotate( gp_Ax1  A1, double Ang) {
    OCCwrapJavaJNI.gp_Lin_Rotate(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang);
  }

  /**
   *  Rotates a line. A1 is the axis of the rotation.
   *  Ang is the angular value of the rotation in radians.
   */
  public gp_Lin Rotated( gp_Ax1  A1, double Ang) {
    return new gp_Lin(OCCwrapJavaJNI.gp_Lin_Rotated(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang), true);
  }

  public void Scale( gp_Pnt  P, double S) {
    OCCwrapJavaJNI.gp_Lin_Scale(swigCPtr, this, gp_Pnt.getCPtr(P), P, S);
  }

  /**
   *  Scales a line. S is the scaling value.
   *  The "Location" point (origin) of the line is modified.
   *  The "Direction" is reversed if the scale is negative.
   */
  public gp_Lin Scaled( gp_Pnt  P, double S) {
    return new gp_Lin(OCCwrapJavaJNI.gp_Lin_Scaled(swigCPtr, this, gp_Pnt.getCPtr(P), P, S), true);
  }

  public void Transform( gp_Trsf  T) {
    OCCwrapJavaJNI.gp_Lin_Transform(swigCPtr, this, gp_Trsf.getCPtr(T), T);
  }

  /**
   *  Transforms a line with the transformation T from class Trsf.
   */
  public gp_Lin Transformed( gp_Trsf  T) {
    return new gp_Lin(OCCwrapJavaJNI.gp_Lin_Transformed(swigCPtr, this, gp_Trsf.getCPtr(T), T), true);
  }

  public void Translate( gp_Vec  V) {
    OCCwrapJavaJNI.gp_Lin_Translate__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V);
  }

  /**
   *  Translates a line in the direction of the vector V.
   *  The magnitude of the translation is the vector's magnitude.
   */
  public gp_Lin Translated( gp_Vec  V) {
    return new gp_Lin(OCCwrapJavaJNI.gp_Lin_Translated__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V), true);
  }

  public void Translate( gp_Pnt  P1,  gp_Pnt  P2) {
    OCCwrapJavaJNI.gp_Lin_Translate__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  /**
   *  Translates a line from the point P1 to the point P2.
   */
  public gp_Lin Translated( gp_Pnt  P1,  gp_Pnt  P2) {
    return new gp_Lin(OCCwrapJavaJNI.gp_Lin_Translated__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

}
