package opencascade;

/**
 *  Describes a unit vector in 3D space. This unit vector is also called "Direction".
 *  See Also
 *  gce_MakeDir which provides functions for more complex
 *  unit vector constructions
 *  Geom_Direction which provides additional functions for
 *  constructing unit vectors and works, in particular, with the
 *  parametric equations of unit vectors.
 */
public class gp_Dir {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Dir(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Dir(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Dir obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Dir ptr) { Ptr = ptr; }
    public gp_Dir AsReference () { return Ptr; }
    public gp_Dir AsCopy () { return Ptr.MakeCopy(); }
    public gp_Dir Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Dir(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a direction corresponding to X axis.
   */
  public gp_Dir() {
    this(OCCwrapJavaJNI.new_gp_Dir__SWIG_0(), true);
  }

  /**
   *  Normalizes the vector V and creates a direction. Raises ConstructionError if V.Magnitude() <= Resolution.
   */
  public gp_Dir( gp_Vec  V) {
    this(OCCwrapJavaJNI.new_gp_Dir__SWIG_1(gp_Vec.getCPtr(V), V), true);
  }

  /**
   *  Creates a direction from a triplet of coordinates. Raises ConstructionError if Coord.Modulus() <= Resolution from gp.
   */
  public gp_Dir( gp_XYZ  Coord) {
    this(OCCwrapJavaJNI.new_gp_Dir__SWIG_2(gp_XYZ.getCPtr(Coord), Coord), true);
  }

  /**
   *  Creates a direction with its 3 cartesian coordinates. Raises ConstructionError if Sqrt(Xv*Xv + Yv*Yv + Zv*Zv) <= Resolution
   *  Modification of the direction's coordinates
   *  If Sqrt (X*X + Y*Y + Z*Z) <= Resolution from gp where
   *  X, Y ,Z are the new coordinates it is not possible to
   *  construct the direction and the method raises the
   *  exception ConstructionError.
   */
  public gp_Dir(double Xv, double Yv, double Zv) {
    this(OCCwrapJavaJNI.new_gp_Dir__SWIG_3(Xv, Yv, Zv), true);
  }

  /**
   *  For this unit vector,  assigns the value Xi to:
   *  -   the X coordinate if Index is 1, or
   *  -   the Y coordinate if Index is 2, or
   *  -   the Z coordinate if Index is 3,
   *  and then normalizes it.
   *  Warning
   *  Remember that all the coordinates of a unit vector are
   *  implicitly modified when any single one is changed directly.
   *  Exceptions
   *  Standard_OutOfRange if Index is not 1, 2, or 3.
   *  Standard_ConstructionError if either of the following
   *  is less than or equal to gp::Resolution():
   *  -   Sqrt(Xv*Xv + Yv*Yv + Zv*Zv), or
   *  -   the modulus of the number triple formed by the new
   *  value Xi and the two other coordinates of this vector
   *  that were not directly modified.
   */
  public void SetCoord(int Index, double Xi) {
    OCCwrapJavaJNI.gp_Dir_SetCoord__SWIG_0(swigCPtr, this, Index, Xi);
  }

  /**
   *  For this unit vector,  assigns the values Xv, Yv and Zv to its three coordinates.
   *  Remember that all the coordinates of a unit vector are
   *  implicitly modified when any single one is changed directly.
   */
  public void SetCoord(double Xv, double Yv, double Zv) {
    OCCwrapJavaJNI.gp_Dir_SetCoord__SWIG_1(swigCPtr, this, Xv, Yv, Zv);
  }

  /**
   *  Assigns the given value to the X coordinate of this   unit vector.
   */
  public void SetX(double X) {
    OCCwrapJavaJNI.gp_Dir_SetX(swigCPtr, this, X);
  }

  /**
   *  Assigns the given value to the Y coordinate of this   unit vector.
   */
  public void SetY(double Y) {
    OCCwrapJavaJNI.gp_Dir_SetY(swigCPtr, this, Y);
  }

  /**
   *  Assigns the given value to the Z  coordinate of this   unit vector.
   */
  public void SetZ(double Z) {
    OCCwrapJavaJNI.gp_Dir_SetZ(swigCPtr, this, Z);
  }

  /**
   *  Assigns the three coordinates of Coord to this unit vector.
   */
  public void SetXYZ( gp_XYZ  Coord) {
    OCCwrapJavaJNI.gp_Dir_SetXYZ(swigCPtr, this, gp_XYZ.getCPtr(Coord), Coord);
  }

  /**
   *  Returns the coordinate of range Index :
   *  Index = 1 => X is returned
   *  Index = 2 => Y is returned
   *  Index = 3 => Z is returned
   *  Exceptions
   *  Standard_OutOfRange if Index is not 1, 2, or 3.
   */
  public double Coord(int Index) {
    return OCCwrapJavaJNI.gp_Dir_Coord__SWIG_0(swigCPtr, this, Index);
  }

  /**
   *  Returns for the  unit vector  its three coordinates Xv, Yv, and Zv.
   */
  public void Coord(double[] Xv, double[] Yv, double[] Zv) {
    OCCwrapJavaJNI.gp_Dir_Coord__SWIG_1(swigCPtr, this, Xv, Yv, Zv);
  }

  /**
   *  Returns the X coordinate for a  unit vector.
   */
  public double X() {
    return OCCwrapJavaJNI.gp_Dir_X(swigCPtr, this);
  }

  /**
   *  Returns the Y coordinate for a  unit vector.
   */
  public double Y() {
    return OCCwrapJavaJNI.gp_Dir_Y(swigCPtr, this);
  }

  /**
   *  Returns the Z coordinate for a  unit vector.
   */
  public double Z() {
    return OCCwrapJavaJNI.gp_Dir_Z(swigCPtr, this);
  }

  /**
   *  for this unit vector, returns  its three coordinates as a number triplea.
   */
  public  gp_XYZ  XYZ() {
    gp_XYZ ret = new gp_XYZ(OCCwrapJavaJNI.gp_Dir_XYZ(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns True if the angle between the two directions is
   *  lower or equal to AngularTolerance.
   */
  public long IsEqual( gp_Dir  Other, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Dir_IsEqual(swigCPtr, this, gp_Dir.getCPtr(Other), Other, AngularTolerance);
  }

  /**
   *  Returns True if  the angle between this unit vector and the unit vector Other is equal to Pi/2 (normal).
   */
  public long IsNormal( gp_Dir  Other, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Dir_IsNormal(swigCPtr, this, gp_Dir.getCPtr(Other), Other, AngularTolerance);
  }

  /**
   *  Returns True if  the angle between this unit vector and the unit vector Other is equal to  Pi (opposite).
   */
  public long IsOpposite( gp_Dir  Other, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Dir_IsOpposite(swigCPtr, this, gp_Dir.getCPtr(Other), Other, AngularTolerance);
  }

  /**
   *  Returns true if the angle between this unit vector and the
   *  unit vector Other is equal to 0 or to Pi.
   *  Note: the tolerance criterion is given by AngularTolerance.
   */
  public long IsParallel( gp_Dir  Other, double AngularTolerance) {
    return OCCwrapJavaJNI.gp_Dir_IsParallel(swigCPtr, this, gp_Dir.getCPtr(Other), Other, AngularTolerance);
  }

  /**
   *  Computes the angular value in radians between <me> and
   *  <Other>. This value is always positive in 3D space.
   *  Returns the angle in the range [0, PI]
   */
  public double Angle( gp_Dir  Other) {
    return OCCwrapJavaJNI.gp_Dir_Angle(swigCPtr, this, gp_Dir.getCPtr(Other), Other);
  }

  /**
   *  Computes the angular value between <me> and <Other>.
   *  <VRef> is the direction of reference normal to <me> and <Other>
   *  and its orientation gives the positive sense of rotation.
   *  If the cross product <me> ^ <Other> has the same orientation
   *  as <VRef> the angular value is positive else negative.
   *  Returns the angular value in the range -PI and PI (in radians). Raises  DomainError if <me> and <Other> are not parallel this exception is raised
   *  when <VRef> is in the same plane as <me> and <Other>
   *  The tolerance criterion is Resolution from package gp.
   */
  public double AngleWithRef( gp_Dir  Other,  gp_Dir  VRef) {
    return OCCwrapJavaJNI.gp_Dir_AngleWithRef(swigCPtr, this, gp_Dir.getCPtr(Other), Other, gp_Dir.getCPtr(VRef), VRef);
  }

  /**
   *  Computes the cross product between two directions
   *  Raises the exception ConstructionError if the two directions
   *  are parallel because the computed vector cannot be normalized
   *  to create a direction.
   */
  public void Cross( gp_Dir  Right) {
    OCCwrapJavaJNI.gp_Dir_Cross(swigCPtr, this, gp_Dir.getCPtr(Right), Right);
  }

  /**
   *  Computes the triple vector product.
   *  <me> ^ (V1 ^ V2)
   *  Raises the exception ConstructionError if V1 and V2 are parallel
   *  or <me> and (V1^V2) are parallel because the computed vector
   *  can't be normalized to create a direction.
   */
  public gp_Dir Crossed( gp_Dir  Right) {
    return new gp_Dir(OCCwrapJavaJNI.gp_Dir_Crossed(swigCPtr, this, gp_Dir.getCPtr(Right), Right), true);
  }

  public void CrossCross( gp_Dir  V1,  gp_Dir  V2) {
    OCCwrapJavaJNI.gp_Dir_CrossCross(swigCPtr, this, gp_Dir.getCPtr(V1), V1, gp_Dir.getCPtr(V2), V2);
  }

  /**
   *  Computes the double vector product this ^ (V1 ^ V2).
   *  -   CrossCrossed creates a new unit vector.
   *  Exceptions
   *  Standard_ConstructionError if:
   *  -   V1 and V2 are parallel, or
   *  -   this unit vector and (V1 ^ V2) are parallel.
   *  This is because, in these conditions, the computed vector
   *  is null and cannot be normalized.
   */
  public gp_Dir CrossCrossed( gp_Dir  V1,  gp_Dir  V2) {
    return new gp_Dir(OCCwrapJavaJNI.gp_Dir_CrossCrossed(swigCPtr, this, gp_Dir.getCPtr(V1), V1, gp_Dir.getCPtr(V2), V2), true);
  }

  /**
   *  Computes the scalar product
   */
  public double Dot( gp_Dir  Other) {
    return OCCwrapJavaJNI.gp_Dir_Dot(swigCPtr, this, gp_Dir.getCPtr(Other), Other);
  }

  /**
   *  Computes the triple scalar product <me> * (V1 ^ V2).
   *  Warnings :
   *  The computed vector V1' = V1 ^ V2 is not normalized
   *  to create a unitary vector. So this method never
   *  raises an exception even if V1 and V2 are parallel.
   */
  public double DotCross( gp_Dir  V1,  gp_Dir  V2) {
    return OCCwrapJavaJNI.gp_Dir_DotCross(swigCPtr, this, gp_Dir.getCPtr(V1), V1, gp_Dir.getCPtr(V2), V2);
  }

  public void Reverse() {
    OCCwrapJavaJNI.gp_Dir_Reverse(swigCPtr, this);
  }

  /**
   *  Reverses the orientation of a direction
   *  geometric transformations
   *  Performs the symmetrical transformation of a direction
   *  with respect to the direction V which is the center of
   *  the  symmetry.]
   */
  public gp_Dir Reversed() {
    return new gp_Dir(OCCwrapJavaJNI.gp_Dir_Reversed(swigCPtr, this), true);
  }

  public void Mirror( gp_Dir  V) {
    OCCwrapJavaJNI.gp_Dir_Mirror__SWIG_0(swigCPtr, this, gp_Dir.getCPtr(V), V);
  }

  /**
   *  Performs the symmetrical transformation of a direction
   *  with respect to the direction V which is the center of
   *  the  symmetry.
   */
  public gp_Dir Mirrored( gp_Dir  V) {
    return new gp_Dir(OCCwrapJavaJNI.gp_Dir_Mirrored__SWIG_0(swigCPtr, this, gp_Dir.getCPtr(V), V), true);
  }

  public void Mirror(gp_Ax1 A1) {
    OCCwrapJavaJNI.gp_Dir_Mirror__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1);
  }

  /**
   *  Performs the symmetrical transformation of a direction
   *  with respect to an axis placement which is the axis
   *  of the symmetry.
   */
  public gp_Dir Mirrored(gp_Ax1 A1) {
    return new gp_Dir(OCCwrapJavaJNI.gp_Dir_Mirrored__SWIG_1(swigCPtr, this, gp_Ax1.getCPtr(A1), A1), true);
  }

  public void Mirror(gp_Ax2 A2) {
    OCCwrapJavaJNI.gp_Dir_Mirror__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2);
  }

  /**
   *  Performs the symmetrical transformation of a direction
   *  with respect to a plane. The axis placement A2 locates
   *  the plane of the symmetry : (Location, XDirection, YDirection).
   */
  public gp_Dir Mirrored(gp_Ax2 A2) {
    return new gp_Dir(OCCwrapJavaJNI.gp_Dir_Mirrored__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(A2), A2), true);
  }

  public void Rotate(gp_Ax1 A1, double Ang) {
    OCCwrapJavaJNI.gp_Dir_Rotate(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang);
  }

  /**
   *  Rotates a direction. A1 is the axis of the rotation.
   *  Ang is the angular value of the rotation in radians.
   */
  public gp_Dir Rotated(gp_Ax1 A1, double Ang) {
    return new gp_Dir(OCCwrapJavaJNI.gp_Dir_Rotated(swigCPtr, this, gp_Ax1.getCPtr(A1), A1, Ang), true);
  }

  public void Transform( gp_Trsf  T) {
    OCCwrapJavaJNI.gp_Dir_Transform(swigCPtr, this, gp_Trsf.getCPtr(T), T);
  }

  /**
   *  Transforms a direction with a "Trsf" from gp.
   *  Warnings :
   *  If the scale factor of the "Trsf" T is negative then the
   *  direction <me> is reversed.
   */
  public gp_Dir Transformed( gp_Trsf  T) {
    return new gp_Dir(OCCwrapJavaJNI.gp_Dir_Transformed(swigCPtr, this, gp_Trsf.getCPtr(T), T), true);
  }

}
