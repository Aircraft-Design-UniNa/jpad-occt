package opencascade;

/**
 *  Describes a unit vector in the plane (2D space). This unit
 *  vector is also called "Direction".
 *  See Also
 *  gce_MakeDir2d which provides functions for more
 *  complex unit vector constructions
 *  Geom2d_Direction which provides additional functions
 *  for constructing unit vectors and works, in particular, with
 *  the parametric equations of unit vectors
 */
public class gp_Dir2d {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Dir2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Dir2d(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Dir2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Dir2d ptr) { Ptr = ptr; }
    public gp_Dir2d AsReference () { return Ptr; }
    public gp_Dir2d AsCopy () { return Ptr.MakeCopy(); }
    public gp_Dir2d Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Dir2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a direction corresponding to X axis.
   */
  public gp_Dir2d() {
    this(OCCwrapJavaJNI.new_gp_Dir2d__SWIG_0(), true);
  }

  /**
   *  Normalizes the vector V and creates a Direction. Raises ConstructionError if V.Magnitude() <= Resolution from gp.
   */
  public gp_Dir2d( gp_Vec2d  V) {
    this(OCCwrapJavaJNI.new_gp_Dir2d__SWIG_1(gp_Vec2d.getCPtr(V), V), true);
  }

  /**
   *  Creates a Direction from a doublet of coordinates. Raises ConstructionError if Coord.Modulus() <= Resolution from gp.
   */
  public gp_Dir2d( gp_XY  Coord) {
    this(OCCwrapJavaJNI.new_gp_Dir2d__SWIG_2(gp_XY.getCPtr(Coord), Coord), true);
  }

  /**
   *  Creates a Direction with its 2 cartesian coordinates. Raises ConstructionError if Sqrt(Xv*Xv + Yv*Yv) <= Resolution from gp.
   */
  public gp_Dir2d(double Xv, double Yv) {
    this(OCCwrapJavaJNI.new_gp_Dir2d__SWIG_3(Xv, Yv), true);
  }

  /**
   *  For this unit vector, assigns:
   *  the value Xi to:
   *  -   the X coordinate if Index is 1, or
   *  -   the Y coordinate if Index is 2, and then normalizes it.
   *  Warning
   *  Remember that all the coordinates of a unit vector are
   *  implicitly modified when any single one is changed directly.
   *  Exceptions
   *  Standard_OutOfRange if Index is not 1 or 2.
   *  Standard_ConstructionError if either of the following
   *  is less than or equal to gp::Resolution():
   *  -   Sqrt(Xv*Xv + Yv*Yv), or
   *  -   the modulus of the number pair formed by the new
   *  value Xi and the other coordinate of this vector that
   *  was not directly modified.
   *  Raises OutOfRange if Index != {1, 2}.
   */
  public void SetCoord(int Index, double Xi) {
    OCCwrapJavaJNI.gp_Dir2d_SetCoord__SWIG_0(swigCPtr, this, Index, Xi);
  }

  /**
   *  For this unit vector, assigns:
   *  -   the values Xv and Yv to its two coordinates,
   *  Warning
   *  Remember that all the coordinates of a unit vector are
   *  implicitly modified when any single one is changed directly.
   *  Exceptions
   *  Standard_OutOfRange if Index is not 1 or 2.
   *  Standard_ConstructionError if either of the following
   *  is less than or equal to gp::Resolution():
   *  -   Sqrt(Xv*Xv + Yv*Yv), or
   *  -   the modulus of the number pair formed by the new
   *  value Xi and the other coordinate of this vector that
   *  was not directly modified.
   *  Raises OutOfRange if Index != {1, 2}.
   */
  public void SetCoord(double Xv, double Yv) {
    OCCwrapJavaJNI.gp_Dir2d_SetCoord__SWIG_1(swigCPtr, this, Xv, Yv);
  }

  /**
   *  Assigns the given value to the X coordinate of this unit   vector,
   *  and then normalizes it.
   *  Warning
   *  Remember that all the coordinates of a unit vector are
   *  implicitly modified when any single one is changed directly.
   *  Exceptions
   *  Standard_ConstructionError if either of the following
   *  is less than or equal to gp::Resolution():
   *  -   the modulus of Coord, or
   *  -   the modulus of the number pair formed from the new
   *  X or Y coordinate and the other coordinate of this
   *  vector that was not directly modified.
   */
  public void SetX(double X) {
    OCCwrapJavaJNI.gp_Dir2d_SetX(swigCPtr, this, X);
  }

  /**
   *  Assigns  the given value to the Y coordinate of this unit   vector,
   *  and then normalizes it.
   *  Warning
   *  Remember that all the coordinates of a unit vector are
   *  implicitly modified when any single one is changed directly.
   *  Exceptions
   *  Standard_ConstructionError if either of the following
   *  is less than or equal to gp::Resolution():
   *  -   the modulus of Coord, or
   *  -   the modulus of the number pair formed from the new
   *  X or Y coordinate and the other coordinate of this
   *  vector that was not directly modified.
   */
  public void SetY(double Y) {
    OCCwrapJavaJNI.gp_Dir2d_SetY(swigCPtr, this, Y);
  }

  /**
   *  Assigns:
   *  -   the two coordinates of Coord to this unit vector,
   *  and then normalizes it.
   *  Warning
   *  Remember that all the coordinates of a unit vector are
   *  implicitly modified when any single one is changed directly.
   *  Exceptions
   *  Standard_ConstructionError if either of the following
   *  is less than or equal to gp::Resolution():
   *  -   the modulus of Coord, or
   *  -   the modulus of the number pair formed from the new
   *  X or Y coordinate and the other coordinate of this
   *  vector that was not directly modified.
   */
  public void SetXY( gp_XY  Coord) {
    OCCwrapJavaJNI.gp_Dir2d_SetXY(swigCPtr, this, gp_XY.getCPtr(Coord), Coord);
  }

  /**
   *  For this unit vector returns the coordinate of range Index :
   *  Index = 1 => X is returned
   *  Index = 2 => Y is returned
   *  Raises OutOfRange if Index != {1, 2}.
   */
  public double Coord(int Index) {
    return OCCwrapJavaJNI.gp_Dir2d_Coord__SWIG_0(swigCPtr, this, Index);
  }

  /**
   *  For this unit vector returns its two coordinates Xv and Yv.
   *  Raises OutOfRange if Index != {1, 2}.
   */
  public void Coord(double[] Xv, double[] Yv) {
    OCCwrapJavaJNI.gp_Dir2d_Coord__SWIG_1(swigCPtr, this, Xv, Yv);
  }

  /**
   *  For this unit vector, returns its X coordinate.
   */
  public double X() {
    return OCCwrapJavaJNI.gp_Dir2d_X(swigCPtr, this);
  }

  /**
   *  For this unit vector, returns its Y coordinate.
   */
  public double Y() {
    return OCCwrapJavaJNI.gp_Dir2d_Y(swigCPtr, this);
  }

  /**
   *  For this unit vector, returns its two coordinates as a number pair.
   *  Comparison between Directions
   *  The precision value is an input data.
   */
  public  gp_XY  XY() {
    gp_XY ret = new gp_XY(OCCwrapJavaJNI.gp_Dir2d_XY(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns True if the two vectors have the same direction
   *  i.e. the angle between this unit vector and the
   *  unit vector Other is less than or equal to AngularTolerance.
   */
  public long IsEqual( gp_Dir2d  Other, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Dir2d_IsEqual(swigCPtr, this, gp_Dir2d.getCPtr(Other), Other, AngularTolerance);
  }

  /**
   *  Returns True if the angle between this unit vector and the
   *  unit vector Other is equal to Pi/2 or -Pi/2 (normal)
   *  i.e. Abs(Abs(<me>.Angle(Other)) - PI/2.) <= AngularTolerance
   */
  public long IsNormal( gp_Dir2d  Other, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Dir2d_IsNormal(swigCPtr, this, gp_Dir2d.getCPtr(Other), Other, AngularTolerance);
  }

  /**
   *  Returns True if the angle between this unit vector and the
   *  unit vector Other is equal to Pi or -Pi (opposite).
   *  i.e.  PI - Abs(<me>.Angle(Other)) <= AngularTolerance
   */
  public long IsOpposite( gp_Dir2d  Other, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Dir2d_IsOpposite(swigCPtr, this, gp_Dir2d.getCPtr(Other), Other, AngularTolerance);
  }

  /**
   *  returns true if if the angle between this unit vector and unit
   *  vector Other is equal to 0, Pi or -Pi.
   *  i.e.  Abs(Angle(<me>, Other)) <= AngularTolerance or
   *  PI - Abs(Angle(<me>, Other)) <= AngularTolerance
   */
  public long IsParallel( gp_Dir2d  Other, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Dir2d_IsParallel(swigCPtr, this, gp_Dir2d.getCPtr(Other), Other, AngularTolerance);
  }

  /**
   *  Computes the angular value in radians between <me> and
   *  <Other>. Returns the angle in the range [-PI, PI].
   */
  public double Angle( gp_Dir2d  Other) {
    return OCCwrapJavaJNI.gp_Dir2d_Angle(swigCPtr, this, gp_Dir2d.getCPtr(Other), Other);
  }

  /**
   *  Computes the cross product between two directions.
   */
  public double Crossed( gp_Dir2d  Right) {
    return OCCwrapJavaJNI.gp_Dir2d_Crossed(swigCPtr, this, gp_Dir2d.getCPtr(Right), Right);
  }

  /**
   *  Computes the scalar product
   */
  public double Dot( gp_Dir2d  Other) {
    return OCCwrapJavaJNI.gp_Dir2d_Dot(swigCPtr, this, gp_Dir2d.getCPtr(Other), Other);
  }

  public void Reverse() {
    OCCwrapJavaJNI.gp_Dir2d_Reverse(swigCPtr, this);
  }

  /**
   *  Reverses the orientation of a direction
   */
  public gp_Dir2d Reversed() {
    return new gp_Dir2d(OCCwrapJavaJNI.gp_Dir2d_Reversed(swigCPtr, this), true);
  }

  public void Mirror( gp_Dir2d  V) {
    OCCwrapJavaJNI.gp_Dir2d_Mirror__SWIG_0(swigCPtr, this, gp_Dir2d.getCPtr(V), V);
  }

  /**
   *  Performs the symmetrical transformation of a direction
   *  with respect to the direction V which is the center of
   *  the  symmetry.
   */
  public gp_Dir2d Mirrored( gp_Dir2d  V) {
    return new gp_Dir2d(OCCwrapJavaJNI.gp_Dir2d_Mirrored__SWIG_0(swigCPtr, this, gp_Dir2d.getCPtr(V), V), true);
  }

  public void Mirror(gp_Ax2d A) {
    OCCwrapJavaJNI.gp_Dir2d_Mirror__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  Performs the symmetrical transformation of a direction
   *  with respect to an axis placement which is the axis
   *  of the symmetry.
   */
  public gp_Dir2d Mirrored(gp_Ax2d A) {
    return new gp_Dir2d(OCCwrapJavaJNI.gp_Dir2d_Mirrored__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A), true);
  }

  public void Rotate(double Ang) {
    OCCwrapJavaJNI.gp_Dir2d_Rotate(swigCPtr, this, Ang);
  }

  /**
   *  Rotates a direction.  Ang is the angular value of
   *  the rotation in radians.
   */
  public gp_Dir2d Rotated(double Ang) {
    return new gp_Dir2d(OCCwrapJavaJNI.gp_Dir2d_Rotated(swigCPtr, this, Ang), true);
  }

  public void Transform( gp_Trsf2d  T) {
    OCCwrapJavaJNI.gp_Dir2d_Transform(swigCPtr, this, gp_Trsf2d.getCPtr(T), T);
  }

  /**
   *  Transforms a direction with the "Trsf" T.
   *  Warnings :
   *  If the scale factor of the "Trsf" T is negative then the
   *  direction <me> is reversed.
   */
  public gp_Dir2d Transformed( gp_Trsf2d  T) {
    return new gp_Dir2d(OCCwrapJavaJNI.gp_Dir2d_Transformed(swigCPtr, this, gp_Trsf2d.getCPtr(T), T), true);
  }

}
