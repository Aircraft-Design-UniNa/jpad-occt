package opencascade;

/**
 *  Defines  a non-persistent 2D cartesian point.
 */
public class gp_Pnt2d {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Pnt2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Pnt2d(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Pnt2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Pnt2d ptr) { Ptr = ptr; }
    public gp_Pnt2d AsReference () { return Ptr; }
    public gp_Pnt2d AsCopy () { return Ptr.MakeCopy(); }
    public gp_Pnt2d Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Pnt2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a point with zero coordinates.
   */
  public gp_Pnt2d() {
    this(OCCwrapJavaJNI.new_gp_Pnt2d__SWIG_0(), true);
  }

  /**
   *  Creates a point with a doublet of coordinates.
   */
  public gp_Pnt2d( gp_XY  Coord) {
    this(OCCwrapJavaJNI.new_gp_Pnt2d__SWIG_1(gp_XY.getCPtr(Coord), Coord), true);
  }

  /**
   *  Creates a  point with its 2 cartesian's coordinates : Xp, Yp.
   */
  public gp_Pnt2d(double Xp, double Yp) {
    this(OCCwrapJavaJNI.new_gp_Pnt2d__SWIG_2(Xp, Yp), true);
  }

  /**
   *  Assigns the value Xi to the coordinate that corresponds to Index:
   *  Index = 1 => X is modified
   *  Index = 2 => Y is modified
   *  Raises OutOfRange if Index != {1, 2}.
   */
  public void SetCoord(int Index, double Xi) {
    OCCwrapJavaJNI.gp_Pnt2d_SetCoord__SWIG_0(swigCPtr, this, Index, Xi);
  }

  /**
   *  For this point, assigns the values Xp and Yp to its two coordinates
   */
  public void SetCoord(double Xp, double Yp) {
    OCCwrapJavaJNI.gp_Pnt2d_SetCoord__SWIG_1(swigCPtr, this, Xp, Yp);
  }

  /**
   *  Assigns the given value to the X  coordinate of this point.
   */
  public void SetX(double X) {
    OCCwrapJavaJNI.gp_Pnt2d_SetX(swigCPtr, this, X);
  }

  /**
   *  Assigns the given value to the Y  coordinate of this point.
   */
  public void SetY(double Y) {
    OCCwrapJavaJNI.gp_Pnt2d_SetY(swigCPtr, this, Y);
  }

  /**
   *  Assigns the two coordinates of Coord to this point.
   */
  public void SetXY( gp_XY  Coord) {
    OCCwrapJavaJNI.gp_Pnt2d_SetXY(swigCPtr, this, gp_XY.getCPtr(Coord), Coord);
  }

  /**
   *  Returns the coordinate of range Index :
   *  Index = 1 => X is returned
   *  Index = 2 => Y is returned
   *  Raises OutOfRange if Index != {1, 2}.
   */
  public double Coord(int Index) {
    return OCCwrapJavaJNI.gp_Pnt2d_Coord__SWIG_0(swigCPtr, this, Index);
  }

  /**
   *  For this point returns its two coordinates as a number pair.
   */
  public void Coord(double[] Xp, double[] Yp) {
    OCCwrapJavaJNI.gp_Pnt2d_Coord__SWIG_1(swigCPtr, this, Xp, Yp);
  }

  /**
   *  For this point, returns its X  coordinate.
   */
  public double X() {
    return OCCwrapJavaJNI.gp_Pnt2d_X(swigCPtr, this);
  }

  /**
   *  For this point, returns its Y coordinate.
   */
  public double Y() {
    return OCCwrapJavaJNI.gp_Pnt2d_Y(swigCPtr, this);
  }

  /**
   *  For this point, returns its two coordinates as a number pair.
   */
  public  gp_XY  XY() {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.gp_Pnt2d_XY(swigCPtr, this), true);
    return ret;
  }

  /**
   *  For this point, returns its two coordinates as a number pair.
   */
  public  gp_XY  Coord() {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.gp_Pnt2d_Coord__SWIG_2(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the coordinates of this point.
   *  Note: This syntax allows direct modification of the returned value.
   */
  public gp_XY ChangeCoord() {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.gp_Pnt2d_ChangeCoord(swigCPtr, this), false, this);
    return ret; //new gp_XY.CRef (ret);
  }

  /**
   *  Comparison
   *  Returns True if the distance between the two
   *  points is lower or equal to LinearTolerance.
   */
  public long IsEqual( gp_Pnt2d  Other, double LinearTolerance) {
    return OCCwrapJavaJNI.gp_Pnt2d_IsEqual(swigCPtr, this, gp_Pnt2d.getCPtr(Other), Other, LinearTolerance);
  }

  /**
   *  Computes the distance between two points.
   */
  public double Distance( gp_Pnt2d  Other) {
    return OCCwrapJavaJNI.gp_Pnt2d_Distance(swigCPtr, this, gp_Pnt2d.getCPtr(Other), Other);
  }

  /**
   *  Computes the square distance between two points.
   */
  public double SquareDistance( gp_Pnt2d  Other) {
    return OCCwrapJavaJNI.gp_Pnt2d_SquareDistance(swigCPtr, this, gp_Pnt2d.getCPtr(Other), Other);
  }

  /**
   *  Performs the symmetrical transformation of a point
   *  with respect to the point P which is the center of
   *  the  symmetry.
   */
  public void Mirror( gp_Pnt2d  P) {
    OCCwrapJavaJNI.gp_Pnt2d_Mirror__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of a point
   *  with respect to an axis placement which is the axis
   */
  public gp_Pnt2d Mirrored( gp_Pnt2d  P) {
    return new gp_Pnt2d(OCCwrapJavaJNI.gp_Pnt2d_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P), true);
  }

  public void Mirror(gp_Ax2d A) {
    OCCwrapJavaJNI.gp_Pnt2d_Mirror__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  Rotates a point. A1 is the axis of the rotation.
   *  Ang is the angular value of the rotation in radians.
   */
  public gp_Pnt2d Mirrored(gp_Ax2d A) {
    return new gp_Pnt2d(OCCwrapJavaJNI.gp_Pnt2d_Mirrored__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A), true);
  }

  public void Rotate( gp_Pnt2d  P, double Ang) {
    OCCwrapJavaJNI.gp_Pnt2d_Rotate(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, Ang);
  }

  /**
   *  Scales a point. S is the scaling value.
   */
  public gp_Pnt2d Rotated( gp_Pnt2d  P, double Ang) {
    return new gp_Pnt2d(OCCwrapJavaJNI.gp_Pnt2d_Rotated(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, Ang), true);
  }

  public void Scale( gp_Pnt2d  P, double S) {
    OCCwrapJavaJNI.gp_Pnt2d_Scale(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, S);
  }

  /**
   *  Transforms a point with the transformation T.
   */
  public gp_Pnt2d Scaled( gp_Pnt2d  P, double S) {
    return new gp_Pnt2d(OCCwrapJavaJNI.gp_Pnt2d_Scaled(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, S), true);
  }

  public void Transform( gp_Trsf2d  T) {
    OCCwrapJavaJNI.gp_Pnt2d_Transform(swigCPtr, this, gp_Trsf2d.getCPtr(T), T);
  }

  /**
   *  Translates a point in the direction of the vector V.
   *  The magnitude of the translation is the vector's magnitude.
   */
  public gp_Pnt2d Transformed( gp_Trsf2d  T) {
    return new gp_Pnt2d(OCCwrapJavaJNI.gp_Pnt2d_Transformed(swigCPtr, this, gp_Trsf2d.getCPtr(T), T), true);
  }

  public void Translate(gp_Vec2d V) {
    OCCwrapJavaJNI.gp_Pnt2d_Translate__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V);
  }

  /**
   *  Translates a point from the point P1 to the point P2.
   */
  public gp_Pnt2d Translated(gp_Vec2d V) {
    return new gp_Pnt2d(OCCwrapJavaJNI.gp_Pnt2d_Translated__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V), true);
  }

  public void Translate( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    OCCwrapJavaJNI.gp_Pnt2d_Translate__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2);
  }

  public gp_Pnt2d Translated( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    return new gp_Pnt2d(OCCwrapJavaJNI.gp_Pnt2d_Translated__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2), true);
  }

}
