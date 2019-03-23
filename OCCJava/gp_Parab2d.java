package opencascade;

/**
 *  Describes a parabola in the plane (2D space).
 *  A parabola is defined by its focal length (that is, the
 *  distance between its focus and apex) and positioned in
 *  the plane with a coordinate system (a gp_Ax22d object) where:
 *  -   the origin of the coordinate system is on the apex of
 *  the parabola, and
 *  -   the "X Axis" of the coordinate system is the axis of
 *  symmetry; the parabola is on the positive side of this axis.
 *  This coordinate system is the "local coordinate system"
 *  of the parabola. Its orientation (direct or indirect sense)
 *  gives an implicit orientation to the parabola.
 *  In this coordinate system, the equation for the parabola is:
 *  Y**2 = (2*P) * X.
 *  where P, referred to as the parameter of the parabola, is
 *  the distance between the focus and the directrix (P is
 *  twice the focal length).
 *  See Also
 *  GCE2d_MakeParab2d which provides functions for
 *  more complex parabola constructions
 *  Geom2d_Parabola which provides additional functions
 *  for constructing parabolas and works, in particular, with
 *  the parametric equations of parabolas
 */
public class gp_Parab2d {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  gp_Parab2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  gp_Parab2d(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(gp_Parab2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (gp_Parab2d ptr) { Ptr = ptr; }
    public gp_Parab2d AsReference () { return Ptr; }
    public gp_Parab2d AsCopy () { return Ptr.MakeCopy(); }
    public gp_Parab2d Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_gp_Parab2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an indefinite parabola.
   */
  public gp_Parab2d() {
    this(OCCwrapJavaJNI.new_gp_Parab2d__SWIG_0(), true);
  }

  /**
   *  Creates a parabola with its vertex point, its axis of symmetry
   *  ("XAxis") and its focal length.
   *  The sense of parametrization is given by theSense. If theSense == TRUE
   *  (by default) then right-handed coordinate system is used,
   *  otherwise - left-handed.
   *  Warnings : It is possible to have FocalLength = 0. In this case,
   *  the parabola looks like a line, which is parallel to the symmetry-axis.
   *  Raises ConstructionError if FocalLength < 0.0
   */
  public gp_Parab2d( gp_Ax2d  theMirrorAxis, double theFocalLength, long theSense) {
    this(OCCwrapJavaJNI.new_gp_Parab2d__SWIG_1(gp_Ax2d.getCPtr(theMirrorAxis), theMirrorAxis, theFocalLength, theSense), true);
  }

  /**
   *  Creates a parabola with its vertex point, its axis of symmetry
   *  ("XAxis"), correspond Y-axis and its focal length.
   *  Warnings : It is possible to have FocalLength = 0. In this case,
   *  the parabola looks like a line, which is parallel to the symmetry-axis.
   *  Raises ConstructionError if Focal < 0.0
   */
  public gp_Parab2d( gp_Ax2d  theMirrorAxis, double theFocalLength) {
    this(OCCwrapJavaJNI.new_gp_Parab2d__SWIG_2(gp_Ax2d.getCPtr(theMirrorAxis), theMirrorAxis, theFocalLength), true);
  }

  /**
   *  Creates a parabola with the directrix and the focus point.
   *  Y-axis of the parabola (in User Coordinate System - UCS) is
   *  the direction of theDirectrix. X-axis always directs from theDirectrix
   *  to theFocus point and always comes through theFocus.
   *  Apex of the parabola is a middle point between the theFocus and the
   *  intersection point of theDirectrix and the X-axis.
   *  Warnings : It is possible to have FocalLength = 0 (when theFocus lies
   *  in theDirectrix). In this case, X-direction of the parabola is defined 
   *  by theSense parameter. If theSense == TRUE (by default) then right-handed
   *  coordinate system is used, otherwise - left-handed. Result parabola will look
   *  like a line, which is perpendicular to the directrix.
   */
  public gp_Parab2d( gp_Ax22d  theAxes, double theFocalLength) {
    this(OCCwrapJavaJNI.new_gp_Parab2d__SWIG_3(gp_Ax22d.getCPtr(theAxes), theAxes, theFocalLength), true);
  }

  public gp_Parab2d( gp_Ax2d  theDirectrix,  gp_Pnt2d  theFocus, long theSense) {
    this(OCCwrapJavaJNI.new_gp_Parab2d__SWIG_4(gp_Ax2d.getCPtr(theDirectrix), theDirectrix, gp_Pnt2d.getCPtr(theFocus), theFocus, theSense), true);
  }

  public gp_Parab2d( gp_Ax2d  theDirectrix,  gp_Pnt2d  theFocus) {
    this(OCCwrapJavaJNI.new_gp_Parab2d__SWIG_5(gp_Ax2d.getCPtr(theDirectrix), theDirectrix, gp_Pnt2d.getCPtr(theFocus), theFocus), true);
  }

  /**
   *  Changes the focal distance of the parabola
   *  Warnings : It is possible to have Focal = 0.
   *  Raises ConstructionError if Focal < 0.0
   */
  public void SetFocal(double Focal) {
    OCCwrapJavaJNI.gp_Parab2d_SetFocal(swigCPtr, this, Focal);
  }

  /**
   *  Changes the "Location" point of the parabola. It is the
   *  vertex of the parabola.
   */
  public void SetLocation( gp_Pnt2d  P) {
    OCCwrapJavaJNI.gp_Parab2d_SetLocation(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Modifies this parabola, by redefining its local coordinate system so that
   *  its origin and "X Direction" become those of the axis
   *  MA. The "Y Direction" of the local coordinate system is
   *  then recomputed. The orientation of the local
   *  coordinate system is not modified.
   */
  public void SetMirrorAxis( gp_Ax2d  A) {
    OCCwrapJavaJNI.gp_Parab2d_SetMirrorAxis(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  Changes the local coordinate system of the parabola.
   *  The "Location" point of A becomes the vertex of the parabola.
   */
  public void SetAxis( gp_Ax22d  A) {
    OCCwrapJavaJNI.gp_Parab2d_SetAxis(swigCPtr, this, gp_Ax22d.getCPtr(A), A);
  }

  /**
   *  Computes the coefficients of the implicit equation of the parabola
   *  (in WCS - World Coordinate System).
   *  A * (X**2) + B * (Y**2) + 2*C*(X*Y) + 2*D*X + 2*E*Y + F = 0.
   */
  public void Coefficients(double[] A, double[] B, double[] C, double[] D, double[] E, double[] F) {
    OCCwrapJavaJNI.gp_Parab2d_Coefficients(swigCPtr, this, A, B, C, D, E, F);
  }

  /**
   *  Computes the directrix of the parabola.
   *  The directrix is:
   *  -   a line parallel to the "Y Direction" of the local
   *  coordinate system of this parabola, and
   *  -   located on the negative side of the axis of symmetry,
   *  at a distance from the apex which is equal to the focal  length of this parabola.
   *  The directrix is returned as an axis (a gp_Ax2d object),
   *  the origin of which is situated on the "X Axis" of this parabola.
   */
  public gp_Ax2d Directrix() {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Parab2d_Directrix(swigCPtr, this), true);
  }

  /**
   *  Returns the distance between the vertex and the focus
   *  of the parabola.
   */
  public double Focal() {
    return OCCwrapJavaJNI.gp_Parab2d_Focal(swigCPtr, this);
  }

  /**
   *  Returns the focus of the parabola.
   */
  public gp_Pnt2d Focus() {
    return new gp_Pnt2d(OCCwrapJavaJNI.gp_Parab2d_Focus(swigCPtr, this), true);
  }

  /**
   *  Returns the vertex of the parabola.
   */
  public gp_Pnt2d Location() {
    return new gp_Pnt2d(OCCwrapJavaJNI.gp_Parab2d_Location(swigCPtr, this), true);
  }

  /**
   *  Returns the symmetry axis of the parabola.
   *  The "Location" point of this axis is the vertex of the parabola.
   */
  public gp_Ax2d MirrorAxis() {
    return new gp_Ax2d(OCCwrapJavaJNI.gp_Parab2d_MirrorAxis(swigCPtr, this), true);
  }

  /**
   *  Returns the local coordinate system of the parabola.
   *  The "Location" point of this axis is the vertex of the parabola.
   */
  public gp_Ax22d Axis() {
    return new gp_Ax22d(OCCwrapJavaJNI.gp_Parab2d_Axis(swigCPtr, this), true);
  }

  /**
   *  Returns the distance between the focus and the
   *  directrix of the parabola.
   */
  public double Parameter() {
    return OCCwrapJavaJNI.gp_Parab2d_Parameter(swigCPtr, this);
  }

  public void Reverse() {
    OCCwrapJavaJNI.gp_Parab2d_Reverse(swigCPtr, this);
  }

  /**
   *  Reverses the orientation of the local coordinate system
   *  of this parabola (the "Y Direction" is reversed).
   *  Therefore, the implicit orientation of this parabola is reversed.
   *  Note:
   *  -   Reverse assigns the result to this parabola, while
   *  -   Reversed creates a new one.
   */
  public gp_Parab2d Reversed() {
    return new gp_Parab2d(OCCwrapJavaJNI.gp_Parab2d_Reversed(swigCPtr, this), true);
  }

  /**
   *  Returns true if the local coordinate system is direct
   *  and false in the other case.
   */
  public long IsDirect() {
    return OCCwrapJavaJNI.gp_Parab2d_IsDirect(swigCPtr, this);
  }

  public void Mirror( gp_Pnt2d  P) {
    OCCwrapJavaJNI.gp_Parab2d_Mirror__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Performs the symmetrical transformation of a parabola with respect
   *  to the point P which is the center of the symmetry
   */
  public gp_Parab2d Mirrored( gp_Pnt2d  P) {
    return new gp_Parab2d(OCCwrapJavaJNI.gp_Parab2d_Mirrored__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P), true);
  }

  public void Mirror( gp_Ax2d  A) {
    OCCwrapJavaJNI.gp_Parab2d_Mirror__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A);
  }

  /**
   *  Performs the symmetrical transformation of a parabola with respect
   *  to an axis placement which is the axis of the symmetry.
   */
  public gp_Parab2d Mirrored( gp_Ax2d  A) {
    return new gp_Parab2d(OCCwrapJavaJNI.gp_Parab2d_Mirrored__SWIG_1(swigCPtr, this, gp_Ax2d.getCPtr(A), A), true);
  }

  public void Rotate( gp_Pnt2d  P, double Ang) {
    OCCwrapJavaJNI.gp_Parab2d_Rotate(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, Ang);
  }

  /**
   *  Rotates a parabola. P is the center of the rotation.
   *  Ang is the angular value of the rotation in radians.
   */
  public gp_Parab2d Rotated( gp_Pnt2d  P, double Ang) {
    return new gp_Parab2d(OCCwrapJavaJNI.gp_Parab2d_Rotated(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, Ang), true);
  }

  public void Scale( gp_Pnt2d  P, double S) {
    OCCwrapJavaJNI.gp_Parab2d_Scale(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, S);
  }

  /**
   *  Scales a parabola. S is the scaling value.
   *  If S is negative the direction of the symmetry axis
   *  "XAxis" is reversed and the direction of the "YAxis" too.
   */
  public gp_Parab2d Scaled( gp_Pnt2d  P, double S) {
    return new gp_Parab2d(OCCwrapJavaJNI.gp_Parab2d_Scaled(swigCPtr, this, gp_Pnt2d.getCPtr(P), P, S), true);
  }

  public void Transform( gp_Trsf2d  T) {
    OCCwrapJavaJNI.gp_Parab2d_Transform(swigCPtr, this, gp_Trsf2d.getCPtr(T), T);
  }

  /**
   *  Transforms an parabola with the transformation T from class Trsf2d.
   */
  public gp_Parab2d Transformed( gp_Trsf2d  T) {
    return new gp_Parab2d(OCCwrapJavaJNI.gp_Parab2d_Transformed(swigCPtr, this, gp_Trsf2d.getCPtr(T), T), true);
  }

  public void Translate( gp_Vec2d  V) {
    OCCwrapJavaJNI.gp_Parab2d_Translate__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V);
  }

  /**
   *  Translates a parabola in the direction of the vector V.
   *  The magnitude of the translation is the vector's magnitude.
   */
  public gp_Parab2d Translated( gp_Vec2d  V) {
    return new gp_Parab2d(OCCwrapJavaJNI.gp_Parab2d_Translated__SWIG_0(swigCPtr, this, gp_Vec2d.getCPtr(V), V), true);
  }

  public void Translate( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    OCCwrapJavaJNI.gp_Parab2d_Translate__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2);
  }

  /**
   *  Translates a parabola from the point P1 to the point P2.
   */
  public gp_Parab2d Translated( gp_Pnt2d  P1,  gp_Pnt2d  P2) {
    return new gp_Parab2d(OCCwrapJavaJNI.gp_Parab2d_Translated__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(P1), P1, gp_Pnt2d.getCPtr(P2), P2), true);
  }

}
