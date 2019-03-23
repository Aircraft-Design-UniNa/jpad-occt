package opencascade;

/**
 *  Defines a 3D cartesian point.
 */
public class gp_Pnt {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Pnt(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Pnt(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Pnt obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Pnt ptr) { Ptr = ptr; }
    public gp_Pnt AsReference () { return Ptr; }
    public gp_Pnt AsCopy () { return Ptr.MakeCopy(); }
    public gp_Pnt Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Pnt(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a point with zero coordinates.
   */
  public gp_Pnt() {
    this(OCCwrapJavaJNI.new_gp_Pnt__SWIG_0(), true);
  }

  /**
   *  Creates a point from a XYZ object.
   */
  public gp_Pnt( gp_XYZ  Coord) {
    this(OCCwrapJavaJNI.new_gp_Pnt__SWIG_1(gp_XYZ.getCPtr(Coord), Coord), true);
  }

  /**
   *  Creates a  point with its 3 cartesian's coordinates : Xp, Yp, Zp.
   */
  public gp_Pnt(double Xp, double Yp, double Zp) {
    this(OCCwrapJavaJNI.new_gp_Pnt__SWIG_2(Xp, Yp, Zp), true);
  }

  /**
   *  Changes the coordinate of range Index :
   *  Index = 1 => X is modified
   *  Index = 2 => Y is modified
   *  Index = 3 => Z is modified
   *  Raised if Index != {1, 2, 3}.
   */
  public void SetCoord(int Index, double Xi) {
    OCCwrapJavaJNI.gp_Pnt_SetCoord__SWIG_0(swigCPtr, this, Index, Xi);
  }

  /**
   *  For this point, assigns  the values Xp, Yp and Zp to its three coordinates.
   */
  public void SetCoord(double Xp, double Yp, double Zp) {
    OCCwrapJavaJNI.gp_Pnt_SetCoord__SWIG_1(swigCPtr, this, Xp, Yp, Zp);
  }

  /**
   *  Assigns the given value to the X coordinate of this point.
   */
  public void SetX(double X) {
    OCCwrapJavaJNI.gp_Pnt_SetX(swigCPtr, this, X);
  }

  /**
   *  Assigns the given value to the Y coordinate of this point.
   */
  public void SetY(double Y) {
    OCCwrapJavaJNI.gp_Pnt_SetY(swigCPtr, this, Y);
  }

  /**
   *  Assigns the given value to the Z coordinate of this point.
   */
  public void SetZ(double Z) {
    OCCwrapJavaJNI.gp_Pnt_SetZ(swigCPtr, this, Z);
  }

  /**
   *  Assigns the three coordinates of Coord to this point.
   */
  public void SetXYZ( gp_XYZ  Coord) {
    OCCwrapJavaJNI.gp_Pnt_SetXYZ(swigCPtr, this, gp_XYZ.getCPtr(Coord), Coord);
  }

  /**
   *  Returns the coordinate of corresponding to the value of  Index :
   *  Index = 1 => X is returned
   *  Index = 2 => Y is returned
   *  Index = 3 => Z is returned
   *  Raises OutOfRange if Index != {1, 2, 3}.
   *  Raised if Index != {1, 2, 3}.
   */
  public double Coord(int Index) {
    return OCCwrapJavaJNI.gp_Pnt_Coord__SWIG_0(swigCPtr, this, Index);
  }

  /**
   *  For this point gives its three coordinates Xp, Yp and Zp.
   */
  public void Coord(double[] Xp, double[] Yp, double[] Zp) {
    OCCwrapJavaJNI.gp_Pnt_Coord__SWIG_1(swigCPtr, this, Xp, Yp, Zp);
  }

  /**
   *  For this point, returns its X coordinate.
   */
  public double X() {
    return OCCwrapJavaJNI.gp_Pnt_X(swigCPtr, this);
  }

  /**
   *  For this point, returns its Y coordinate.
   */
  public double Y() {
    return OCCwrapJavaJNI.gp_Pnt_Y(swigCPtr, this);
  }

  /**
   *  For this point, returns its Z coordinate.
   */
  public double Z() {
    return OCCwrapJavaJNI.gp_Pnt_Z(swigCPtr, this);
  }

  /**
   *  For this point, returns its three coordinates as a XYZ object.
   */
  public  gp_XYZ  XYZ() {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.gp_Pnt_XYZ(swigCPtr, this), true);
    return ret;
  }

  /**
   *  For this point, returns its three coordinates as a XYZ object.
   */
  public  gp_XYZ  Coord() {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.gp_Pnt_Coord__SWIG_2(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the coordinates of this point.
   *  Note: This syntax allows direct modification of the returned value.
   */
  public gp_XYZ ChangeCoord() {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.gp_Pnt_ChangeCoord(swigCPtr, this), false, this);
    return ret; //new gp_XYZ.CRef (ret);
  }

  /**
   *  Assigns the result of the following expression to this point
   *  (Alpha*this + Beta*P) / (Alpha + Beta)
   */
  public void BaryCenter(double Alpha,  gp_Pnt  P, double Beta) {
    OCCwrapJavaJNI.gp_Pnt_BaryCenter(swigCPtr, this, Alpha, gp_Pnt.getCPtr(P), P, Beta);
  }

  /**
   *  Comparison
   *  Returns True if the distance between the two points is
   *  lower or equal to LinearTolerance.
   */
  public long IsEqual( gp_Pnt  Other, double LinearTolerance) {
    return OCCwrapJavaJNI.gp_Pnt_IsEqual(swigCPtr, this, gp_Pnt.getCPtr(Other), Other, LinearTolerance);
  }

  /**
   *  Computes the distance between two points.
   */
  public double Distance( gp_Pnt  Other) {
    return OCCwrapJavaJNI.gp_Pnt_Distance(swigCPtr, this, gp_Pnt.getCPtr(Other), Other);
  }

  /**
   *  Computes the square distance between two points.
   */
  public double SquareDistance( gp_Pnt  Other) {
    return OCCwrapJavaJNI.gp_Pnt_SquareDistance(swigCPtr, this, gp_Pnt.getCPtr(Other), Other);
  }

  /**
   *  Performs the symmetrical transformation of a point
   *  with respect to the point P which is the center of
   *  the  symmetry.
   */
  public void Mirror( gp_Pnt  P) {
    OCCwrapJavaJNI.gp_Pnt_Mirror__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of a point
   *  with respect to an axis placement which is the axis
   *  of the symmetry.
   */
  public gp_Pnt Mirrored( gp_Pnt  P) {
    return new gp_Pnt(OCCwrapJavaJNI.gp_Pnt_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P), true);
  }

  public void Mirror(gp_Ax1 A1) {
    OCCwrapJavaJNI.gp_Pnt_Mirror__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Performs the symmetrical transformation of a point
   *  with respect to a plane. The axis placement A2 locates
   *  the plane of the symmetry : (Location, XDirection, YDirection).
   */
  public gp_Pnt Mirrored(gp_Ax1 A1) {
    return new gp_Pnt(OCCwrapJavaJNI.gp_Pnt_Mirrored__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1), true);
  }

  public void Mirror(gp_Ax2 A2) {
    OCCwrapJavaJNI.gp_Pnt_Mirror__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Rotates a point. A1 is the axis of the rotation.
   *  Ang is the angular value of the rotation in radians.
   */
  public gp_Pnt Mirrored(gp_Ax2 A2) {
    return new gp_Pnt(OCCwrapJavaJNI.gp_Pnt_Mirrored__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2), true);
  }

  public void Rotate(gp_Ax1 A1, double Ang) {
    OCCwrapJavaJNI.gp_Pnt_Rotate(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang);
  }

  /**
   *  Scales a point. S is the scaling value.
   */
  public gp_Pnt Rotated(gp_Ax1 A1, double Ang) {
    return new gp_Pnt(OCCwrapJavaJNI.gp_Pnt_Rotated(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang), true);
  }

  public void Scale( gp_Pnt  P, double S) {
    OCCwrapJavaJNI.gp_Pnt_Scale(swigCPtr, this, gp_Pnt.getCPtr(P), P, S);
  }

  /**
   *  Transforms a point with the transformation T.
   */
  public gp_Pnt Scaled( gp_Pnt  P, double S) {
    return new gp_Pnt(OCCwrapJavaJNI.gp_Pnt_Scaled(swigCPtr, this, gp_Pnt.getCPtr(P), P, S), true);
  }

  public void Transform( gp_Trsf  T) {
    OCCwrapJavaJNI.gp_Pnt_Transform(swigCPtr, this, gp_Trsf.getCPtr(T), T);
  }

  /**
   *  Translates a point in the direction of the vector V.
   *  The magnitude of the translation is the vector's magnitude.
   */
  public gp_Pnt Transformed( gp_Trsf  T) {
    return new gp_Pnt(OCCwrapJavaJNI.gp_Pnt_Transformed(swigCPtr, this, gp_Trsf.getCPtr(T), T), true);
  }

  public void Translate(gp_Vec V) {
    OCCwrapJavaJNI.gp_Pnt_Translate__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V);
  }

  /**
   *  Translates a point from the point P1 to the point P2.
   */
  public gp_Pnt Translated(gp_Vec V) {
    return new gp_Pnt(OCCwrapJavaJNI.gp_Pnt_Translated__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(V), V), true);
  }

  public void Translate( gp_Pnt  P1,  gp_Pnt  P2) {
    OCCwrapJavaJNI.gp_Pnt_Translate__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2);
  }

  public gp_Pnt Translated( gp_Pnt  P1,  gp_Pnt  P2) {
    return new gp_Pnt(OCCwrapJavaJNI.gp_Pnt_Translated__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

}
