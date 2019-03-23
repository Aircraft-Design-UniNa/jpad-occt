package opencascade;

/**
 *  Describes a bounding box in 3D space.
 *  A bounding box is parallel to the axes of the coordinates
 *  system. If it is finite, it is defined by the three intervals:
 *  -   [ Xmin,Xmax ],
 *  -   [ Ymin,Ymax ],
 *  -   [ Zmin,Zmax ].
 *  A bounding box may be infinite (i.e. open) in one or more
 *  directions. It is said to be:
 *  -   OpenXmin if it is infinite on the negative side of the   "X Direction";
 *  -   OpenXmax if it is infinite on the positive side of the "X Direction";
 *  -   OpenYmin if it is infinite on the negative side of the   "Y Direction";
 *  -   OpenYmax if it is infinite on the positive side of the "Y Direction";
 *  -   OpenZmin if it is infinite on the negative side of the   "Z Direction";
 *  -   OpenZmax if it is infinite on the positive side of the "Z Direction";
 *  -   WholeSpace if it is infinite in all six directions. In this
 *  case, any point of the space is inside the box;
 *  -   Void if it is empty. In this case, there is no point included in the box.
 *  A bounding box is defined by:
 *  -   six bounds (Xmin, Xmax, Ymin, Ymax, Zmin and
 *  Zmax) which limit the bounding box if it is finite,
 *  -   eight flags (OpenXmin, OpenXmax, OpenYmin,
 *  OpenYmax, OpenZmin, OpenZmax,
 *  WholeSpace and Void) which describe the
 *  bounding box if it is infinite or empty, and
 *  -   a gap, which is included on both sides in any direction
 *  when consulting the finite bounds of the box.
 */
public class Bnd_Box {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Bnd_Box(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Bnd_Box(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Bnd_Box obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (Bnd_Box ptr) { Ptr = ptr; }
    public Bnd_Box AsReference () { return Ptr; }
    public Bnd_Box AsCopy () { return Ptr.MakeCopy(); }
    public Bnd_Box Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Bnd_Box(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an empty Box.
   *  The constructed box is qualified Void. Its gap is null.
   */
  public Bnd_Box() {
    this(OCCwrapJavaJNI.new_Bnd_Box(), true);
  }

  /**
   *  Sets this bounding box so that it  covers the whole of 3D space.
   *  It is infinitely  long in all directions.
   */
  public void SetWhole() {
    OCCwrapJavaJNI.Bnd_Box_SetWhole(swigCPtr, this);
  }

  /**
   *  Sets this bounding box so that it is empty. All points are outside a void box.
   */
  public void SetVoid() {
    OCCwrapJavaJNI.Bnd_Box_SetVoid(swigCPtr, this);
  }

  /**
   *  Sets this bounding box so that it bounds
   *  -   the point P. This involves first setting this bounding box
   *  to be void and then adding the point P.
   */
  public void Set( gp_Pnt  P) {
    OCCwrapJavaJNI.Bnd_Box_Set__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Sets this bounding box so that it bounds
   *  the half-line defined by point P and direction D, i.e. all
   *  points M defined by M=P+u*D, where u is greater than
   *  or equal to 0, are inside the bounding volume. This
   *  involves first setting this box to be void and then adding   the half-line.
   */
  public void Set( gp_Pnt  P,  gp_Dir  D) {
    OCCwrapJavaJNI.Bnd_Box_Set__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P), P, gp_Dir.getCPtr(D), D);
  }

  /**
   *  Enlarges this bounding box, if required, so that it
   *  contains at least:
   *  -   interval [ aXmin,aXmax ] in the "X Direction",
   *  -   interval [ aYmin,aYmax ] in the "Y Direction",
   *  -   interval [ aZmin,aZmax ] in the "Z Direction";
   */
  public void Update(double aXmin, double aYmin, double aZmin, double aXmax, double aYmax, double aZmax) {
    OCCwrapJavaJNI.Bnd_Box_Update__SWIG_0(swigCPtr, this, aXmin, aYmin, aZmin, aXmax, aYmax, aZmax);
  }

  /**
   *  Adds a point of coordinates (X,Y,Z) to this bounding box.
   */
  public void Update(double X, double Y, double Z) {
    OCCwrapJavaJNI.Bnd_Box_Update__SWIG_1(swigCPtr, this, X, Y, Z);
  }

  /**
   *  Returns the gap of this bounding box.
   */
  public double GetGap() {
    return OCCwrapJavaJNI.Bnd_Box_GetGap(swigCPtr, this);
  }

  /**
   *  Set the gap of this bounding box to abs(Tol).
   */
  public void SetGap(double Tol) {
    OCCwrapJavaJNI.Bnd_Box_SetGap(swigCPtr, this, Tol);
  }

  /**
   *  Enlarges the      box    with    a   tolerance   value.
   *  (minvalues-Abs(<tol>) and maxvalues+Abs(<tol>))
   *  This means that the minimum values of its X, Y and Z
   *  intervals of definition, when they are finite, are reduced by
   *  the absolute value of Tol, while the maximum values are
   *  increased by the same amount.
   */
  public void Enlarge(double Tol) {
    OCCwrapJavaJNI.Bnd_Box_Enlarge(swigCPtr, this, Tol);
  }

  /**
   *  Returns the bounds of this bounding box. The gap is included.
   *  If this bounding box is infinite (i.e. "open"), returned values
   *  may be equal to +/- Precision::Infinite().
   *  Standard_ConstructionError exception will be thrown if the box is void.
   *  if IsVoid()
   */
  public void Get(double[] theXmin, double[] theYmin, double[] theZmin, double[] theXmax, double[] theYmax, double[] theZmax) {
    OCCwrapJavaJNI.Bnd_Box_Get(swigCPtr, this, theXmin, theYmin, theZmin, theXmax, theYmax, theZmax);
  }

  /**
   *  Returns the lower corner of this bounding box. The gap is included.
   *  If this bounding box is infinite (i.e. "open"), returned values
   *  may be equal to +/- Precision::Infinite().
   *  Standard_ConstructionError exception will be thrown if the box is void.
   *  if IsVoid()
   */
  public gp_Pnt CornerMin() {
    return new gp_Pnt(OCCwrapJavaJNI.Bnd_Box_CornerMin(swigCPtr, this), true);
  }

  /**
   *  Returns the upper corner of this bounding box. The gap is included.
   *  If this bounding box is infinite (i.e. "open"), returned values
   *  may be equal to +/- Precision::Infinite().
   *  Standard_ConstructionError exception will be thrown if the box is void.
   *  if IsVoid()
   */
  public gp_Pnt CornerMax() {
    return new gp_Pnt(OCCwrapJavaJNI.Bnd_Box_CornerMax(swigCPtr, this), true);
  }

  /**
   *  The   Box will be   infinitely   long  in the Xmin
   *  direction.
   */
  public void OpenXmin() {
    OCCwrapJavaJNI.Bnd_Box_OpenXmin(swigCPtr, this);
  }

  /**
   *  The   Box will be   infinitely   long  in the Xmax
   *  direction.
   */
  public void OpenXmax() {
    OCCwrapJavaJNI.Bnd_Box_OpenXmax(swigCPtr, this);
  }

  /**
   *  The   Box will be   infinitely   long  in the Ymin
   *  direction.
   */
  public void OpenYmin() {
    OCCwrapJavaJNI.Bnd_Box_OpenYmin(swigCPtr, this);
  }

  /**
   *  The   Box will be   infinitely   long  in the Ymax
   *  direction.
   */
  public void OpenYmax() {
    OCCwrapJavaJNI.Bnd_Box_OpenYmax(swigCPtr, this);
  }

  /**
   *  The   Box will be   infinitely   long  in the Zmin
   *  direction.
   */
  public void OpenZmin() {
    OCCwrapJavaJNI.Bnd_Box_OpenZmin(swigCPtr, this);
  }

  /**
   *  The   Box will be   infinitely   long  in the Zmax
   *  direction.
   */
  public void OpenZmax() {
    OCCwrapJavaJNI.Bnd_Box_OpenZmax(swigCPtr, this);
  }

  /**
   *  Returns true if this bounding box is open in the  Xmin direction.
   */
  public long IsOpenXmin() {
    return OCCwrapJavaJNI.Bnd_Box_IsOpenXmin(swigCPtr, this);
  }

  /**
   *  Returns true if this bounding box is open in the  Xmax direction.
   */
  public long IsOpenXmax() {
    return OCCwrapJavaJNI.Bnd_Box_IsOpenXmax(swigCPtr, this);
  }

  /**
   *  Returns true if this bounding box is open in the  Ymix direction.
   */
  public long IsOpenYmin() {
    return OCCwrapJavaJNI.Bnd_Box_IsOpenYmin(swigCPtr, this);
  }

  /**
   *  Returns true if this bounding box is open in the  Ymax direction.
   */
  public long IsOpenYmax() {
    return OCCwrapJavaJNI.Bnd_Box_IsOpenYmax(swigCPtr, this);
  }

  /**
   *  Returns true if this bounding box is open in the  Zmin direction.
   */
  public long IsOpenZmin() {
    return OCCwrapJavaJNI.Bnd_Box_IsOpenZmin(swigCPtr, this);
  }

  /**
   *  Returns true if this bounding box is open in the  Zmax  direction.
   */
  public long IsOpenZmax() {
    return OCCwrapJavaJNI.Bnd_Box_IsOpenZmax(swigCPtr, this);
  }

  /**
   *  Returns true if this bounding box is infinite in all 6 directions (WholeSpace flag).
   */
  public long IsWhole() {
    return OCCwrapJavaJNI.Bnd_Box_IsWhole(swigCPtr, this);
  }

  /**
   *  Returns true if this bounding box is empty (Void flag).
   */
  public long IsVoid() {
    return OCCwrapJavaJNI.Bnd_Box_IsVoid(swigCPtr, this);
  }

  /**
   *  true if xmax-xmin < tol.
   */
  public long IsXThin(double tol) {
    return OCCwrapJavaJNI.Bnd_Box_IsXThin(swigCPtr, this, tol);
  }

  /**
   *  true if ymax-ymin < tol.
   */
  public long IsYThin(double tol) {
    return OCCwrapJavaJNI.Bnd_Box_IsYThin(swigCPtr, this, tol);
  }

  /**
   *  true if zmax-zmin < tol.
   */
  public long IsZThin(double tol) {
    return OCCwrapJavaJNI.Bnd_Box_IsZThin(swigCPtr, this, tol);
  }

  /**
   *  Returns true if IsXThin, IsYThin and IsZThin are all true,
   *  i.e. if the box is thin in all three dimensions.
   */
  public long IsThin(double tol) {
    return OCCwrapJavaJNI.Bnd_Box_IsThin(swigCPtr, this, tol);
  }

  /**
   *  Returns a bounding box which is the result of applying the
   *  transformation T to this bounding box.
   *  Warning
   *  Applying a geometric transformation (for example, a
   *  rotation) to a bounding box generally increases its
   *  dimensions. This is not optimal for algorithms which use it.
   */
  public Bnd_Box Transformed( gp_Trsf  T) {
    return new Bnd_Box(OCCwrapJavaJNI.Bnd_Box_Transformed(swigCPtr, this, gp_Trsf.getCPtr(T), T), true);
  }

  /**
   *  Adds the box <Other> to <me>.
   */
  public void Add( Bnd_Box  Other) {
    OCCwrapJavaJNI.Bnd_Box_Add__SWIG_0(swigCPtr, this, Bnd_Box.getCPtr(Other), Other);
  }

  /**
   *  Adds a Pnt to the box.
   */
  public void Add( gp_Pnt  P) {
    OCCwrapJavaJNI.Bnd_Box_Add__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Extends  <me> from the Pnt <P> in the direction <D>.
   */
  public void Add( gp_Pnt  P,  gp_Dir  D) {
    OCCwrapJavaJNI.Bnd_Box_Add__SWIG_2(swigCPtr, this, gp_Pnt.getCPtr(P), P, gp_Dir.getCPtr(D), D);
  }

  /**
   *  Extends the Box  in the given Direction, i.e. adds
   *  an  half-line. The   box  may become   infinite in
   *  1,2 or 3 directions.
   */
  public void Add( gp_Dir  D) {
    OCCwrapJavaJNI.Bnd_Box_Add__SWIG_3(swigCPtr, this, gp_Dir.getCPtr(D), D);
  }

  /**
   *  Returns True if the Pnt is out the box.
   */
  public long IsOut( gp_Pnt  P) {
    return OCCwrapJavaJNI.Bnd_Box_IsOut__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Returns False if the line intersects the box.
   */
  public long IsOut( gp_Lin  L) {
    return OCCwrapJavaJNI.Bnd_Box_IsOut__SWIG_1(swigCPtr, this, gp_Lin.getCPtr(L), L);
  }

  /**
   *  Returns False if the plane intersects the box.
   */
  public long IsOut( gp_Pln  P) {
    return OCCwrapJavaJNI.Bnd_Box_IsOut__SWIG_2(swigCPtr, this, gp_Pln.getCPtr(P), P);
  }

  /**
   *  Returns False if the <Box> intersects or is inside <me>.
   */
  public long IsOut( Bnd_Box  Other) {
    return OCCwrapJavaJNI.Bnd_Box_IsOut__SWIG_3(swigCPtr, this, Bnd_Box.getCPtr(Other), Other);
  }

  /**
   *  Returns False if  the transformed <Box> intersects
   *  or  is inside <me>.
   */
  public long IsOut( Bnd_Box  Other,  gp_Trsf  T) {
    return OCCwrapJavaJNI.Bnd_Box_IsOut__SWIG_4(swigCPtr, this, Bnd_Box.getCPtr(Other), Other, gp_Trsf.getCPtr(T), T);
  }

  /**
   *  Returns False  if the transformed <Box> intersects
   *  or  is inside the transformed box <me>.
   */
  public long IsOut( gp_Trsf  T1,  Bnd_Box  Other,  gp_Trsf  T2) {
    return OCCwrapJavaJNI.Bnd_Box_IsOut__SWIG_5(swigCPtr, this, gp_Trsf.getCPtr(T1), T1, Bnd_Box.getCPtr(Other), Other, gp_Trsf.getCPtr(T2), T2);
  }

  /**
   *  Returns False  if the flat band lying between two parallel
   *  lines represented by their reference points <P1>, <P2> and
   *  direction <D> intersects the box.
   */
  public long IsOut( gp_Pnt  P1,  gp_Pnt  P2,  gp_Dir  D) {
    return OCCwrapJavaJNI.Bnd_Box_IsOut__SWIG_6(swigCPtr, this, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2, gp_Dir.getCPtr(D), D);
  }

  /**
   *  Computes the minimum distance between two boxes.
   */
  public double Distance( Bnd_Box  Other) {
    return OCCwrapJavaJNI.Bnd_Box_Distance(swigCPtr, this, Bnd_Box.getCPtr(Other), Other);
  }

  public void Dump() {
    OCCwrapJavaJNI.Bnd_Box_Dump(swigCPtr, this);
  }

  /**
   *  Computes the squared diagonal of me.
   */
  public double SquareExtent() {
    return OCCwrapJavaJNI.Bnd_Box_SquareExtent(swigCPtr, this);
  }

}
