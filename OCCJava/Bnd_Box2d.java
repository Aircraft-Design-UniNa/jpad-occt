package opencascade;

/**
 *  Describes a bounding box in 2D space.
 *  A bounding box is parallel to the axes of the coordinates
 *  system. If it is finite, it is defined by the two intervals:
 *  -   [ Xmin,Xmax ], and
 *  -   [ Ymin,Ymax ].
 *  A bounding box may be infinite (i.e. open) in one or more
 *  directions. It is said to be:
 *  -   OpenXmin if it is infinite on the negative side of the   "X Direction";
 *  -   OpenXmax if it is infinite on the positive side of the   "X Direction";
 *  -   OpenYmin if it is infinite on the negative side of the   "Y Direction";
 *  -   OpenYmax if it is infinite on the positive side of the   "Y Direction";
 *  -   WholeSpace if it is infinite in all four directions. In
 *  this case, any point of the space is inside the box;
 *  -   Void if it is empty. In this case, there is no point included in the box.
 *  A bounding box is defined by four bounds (Xmin, Xmax, Ymin and Ymax) which
 *  limit the bounding box if it is finite, six flags (OpenXmin, OpenXmax, OpenYmin,
 *  OpenYmax, WholeSpace and Void) which describe the bounding box if it is infinite or empty, and
 *  -   a gap, which is included on both sides in any direction when consulting the finite bounds of the box.
 */
public class Bnd_Box2d {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Bnd_Box2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Bnd_Box2d(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Bnd_Box2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (Bnd_Box2d ptr) { Ptr = ptr; }
    public Bnd_Box2d AsReference () { return Ptr; }
    public Bnd_Box2d AsCopy () { return Ptr.MakeCopy(); }
    public Bnd_Box2d Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Bnd_Box2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an empty 2D bounding box.
   *  The constructed box is qualified Void. Its gap is null.
   */
  public Bnd_Box2d() {
    this(OCCwrapJavaJNI.new_Bnd_Box2d(), true);
  }

  /**
   *  Sets this bounding box so that it covers the whole 2D
   *  space, i.e. it is infinite in all directions.
   */
  public void SetWhole() {
    OCCwrapJavaJNI.Bnd_Box2d_SetWhole(swigCPtr, this);
  }

  /**
   *  Sets this 2D bounding box so that it is empty. All points are outside a void box.
   */
  public void SetVoid() {
    OCCwrapJavaJNI.Bnd_Box2d_SetVoid(swigCPtr, this);
  }

  /**
   *  Sets this 2D bounding box so that it bounds
   *  the point P. This involves first setting this bounding box
   *  to be void and then adding the point PThe rectangle bounds   the  point <P>.
   */
  public void Set( gp_Pnt2d  thePnt) {
    OCCwrapJavaJNI.Bnd_Box2d_Set__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(thePnt), thePnt);
  }

  /**
   *  Sets this 2D bounding box so that it bounds
   *  the half-line defined by point P and direction D, i.e. all
   *  points M defined by M=P+u*D, where u is greater than
   *  or equal to 0, are inside the bounding area. This involves
   *  first setting this 2D box to be void and then adding the   half-line.
   */
  public void Set( gp_Pnt2d  thePnt,  gp_Dir2d  theDir) {
    OCCwrapJavaJNI.Bnd_Box2d_Set__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(thePnt), thePnt, gp_Dir2d.getCPtr(theDir), theDir);
  }

  /**
   *  Enlarges this 2D bounding box, if required, so that it
   *  contains at least:
   *  -   interval [ aXmin,aXmax ] in the "X Direction",
   *  -   interval [ aYmin,aYmax ] in the "Y Direction"
   */
  public void Update(double aXmin, double aYmin, double aXmax, double aYmax) {
    OCCwrapJavaJNI.Bnd_Box2d_Update__SWIG_0(swigCPtr, this, aXmin, aYmin, aXmax, aYmax);
  }

  /**
   *  Adds a point of coordinates (X,Y) to this bounding box.
   */
  public void Update(double X, double Y) {
    OCCwrapJavaJNI.Bnd_Box2d_Update__SWIG_1(swigCPtr, this, X, Y);
  }

  /**
   *  Returns the gap of this 2D bounding box.
   */
  public double GetGap() {
    return OCCwrapJavaJNI.Bnd_Box2d_GetGap(swigCPtr, this);
  }

  /**
   *  Set the gap of this 2D bounding box to abs(Tol).
   */
  public void SetGap(double Tol) {
    OCCwrapJavaJNI.Bnd_Box2d_SetGap(swigCPtr, this, Tol);
  }

  /**
   *  Enlarges     the  box  with    a  tolerance  value.
   *  This means that the minimum values of its X and Y
   *  intervals of definition, when they are finite, are reduced by
   *  the absolute value of Tol, while the maximum values are
   *  increased by the same amount.
   */
  public void Enlarge(double theTol) {
    OCCwrapJavaJNI.Bnd_Box2d_Enlarge(swigCPtr, this, theTol);
  }

  /**
   *  Returns the bounds of this 2D bounding box.
   *  The gap is included. If this bounding box is infinite (i.e. "open"), returned values
   *  may be equal to +/- Precision::Infinite().
   *  if IsVoid()
   */
  public void Get(double[] aXmin, double[] aYmin, double[] aXmax, double[] aYmax) {
    OCCwrapJavaJNI.Bnd_Box2d_Get(swigCPtr, this, aXmin, aYmin, aXmax, aYmax);
  }

  /**
   *  The Box will be infinitely long in the Xmin direction.
   */
  public void OpenXmin() {
    OCCwrapJavaJNI.Bnd_Box2d_OpenXmin(swigCPtr, this);
  }

  /**
   *  The Box will be infinitely long in the Xmax direction.
   */
  public void OpenXmax() {
    OCCwrapJavaJNI.Bnd_Box2d_OpenXmax(swigCPtr, this);
  }

  /**
   *  The Box will be infinitely long in the Ymin direction.
   */
  public void OpenYmin() {
    OCCwrapJavaJNI.Bnd_Box2d_OpenYmin(swigCPtr, this);
  }

  /**
   *  The Box will be infinitely long in the Ymax direction.
   */
  public void OpenYmax() {
    OCCwrapJavaJNI.Bnd_Box2d_OpenYmax(swigCPtr, this);
  }

  /**
   *  Returns true if this bounding box is open in the Xmin direction.
   */
  public long IsOpenXmin() {
    return OCCwrapJavaJNI.Bnd_Box2d_IsOpenXmin(swigCPtr, this);
  }

  /**
   *  Returns true if this bounding box is open in the Xmax direction.
   */
  public long IsOpenXmax() {
    return OCCwrapJavaJNI.Bnd_Box2d_IsOpenXmax(swigCPtr, this);
  }

  /**
   *  Returns true if this bounding box is open in the Ymin direction.
   */
  public long IsOpenYmin() {
    return OCCwrapJavaJNI.Bnd_Box2d_IsOpenYmin(swigCPtr, this);
  }

  /**
   *  Returns true if this bounding box is open in the Ymax direction.
   */
  public long IsOpenYmax() {
    return OCCwrapJavaJNI.Bnd_Box2d_IsOpenYmax(swigCPtr, this);
  }

  /**
   *  Returns true if this bounding box is infinite in all 4
   *  directions (Whole Space flag).
   */
  public long IsWhole() {
    return OCCwrapJavaJNI.Bnd_Box2d_IsWhole(swigCPtr, this);
  }

  /**
   *  Returns true if this 2D bounding box is empty (Void flag).
   */
  public long IsVoid() {
    return OCCwrapJavaJNI.Bnd_Box2d_IsVoid(swigCPtr, this);
  }

  /**
   *  Returns a bounding box which is the result of applying the
   *  transformation T to this bounding box.
   *  Warning
   *  Applying a geometric transformation (for example, a
   *  rotation) to a bounding box generally increases its
   *  dimensions. This is not optimal for algorithms which use it.
   */
  public Bnd_Box2d Transformed( gp_Trsf2d  T) {
    return new Bnd_Box2d(OCCwrapJavaJNI.Bnd_Box2d_Transformed(swigCPtr, this, gp_Trsf2d.getCPtr(T), T), true);
  }

  public void Add( Bnd_Box2d  Other) {
    OCCwrapJavaJNI.Bnd_Box2d_Add__SWIG_0(swigCPtr, this, Bnd_Box2d.getCPtr(Other), Other);
  }

  public void Add( gp_Pnt2d  thePnt) {
    OCCwrapJavaJNI.Bnd_Box2d_Add__SWIG_1(swigCPtr, this, gp_Pnt2d.getCPtr(thePnt), thePnt);
  }

  /**
   *  Adds the 2d box <Other> to <me>.
   */
  public void Add( gp_Pnt2d  thePnt,  gp_Dir2d  theDir) {
    OCCwrapJavaJNI.Bnd_Box2d_Add__SWIG_2(swigCPtr, this, gp_Pnt2d.getCPtr(thePnt), thePnt, gp_Dir2d.getCPtr(theDir), theDir);
  }

  /**
   *  Adds the 2d point.
   */
  public void Add( gp_Dir2d  D) {
    OCCwrapJavaJNI.Bnd_Box2d_Add__SWIG_3(swigCPtr, this, gp_Dir2d.getCPtr(D), D);
  }

  /**
   *  Returns True if the 2d pnt <P> is out <me>.
   */
  public long IsOut( gp_Pnt2d  P) {
    return OCCwrapJavaJNI.Bnd_Box2d_IsOut__SWIG_0(swigCPtr, this, gp_Pnt2d.getCPtr(P), P);
  }

  /**
   *  Returns True if <Box2d> is out <me>.
   */
  public long IsOut( Bnd_Box2d  Other) {
    return OCCwrapJavaJNI.Bnd_Box2d_IsOut__SWIG_1(swigCPtr, this, Bnd_Box2d.getCPtr(Other), Other);
  }

  /**
   *  Returns True if transformed <Box2d> is out <me>.
   */
  public long IsOut( Bnd_Box2d  theOther,  gp_Trsf2d  theTrsf) {
    return OCCwrapJavaJNI.Bnd_Box2d_IsOut__SWIG_2(swigCPtr, this, Bnd_Box2d.getCPtr(theOther), theOther, gp_Trsf2d.getCPtr(theTrsf), theTrsf);
  }

  public long IsOut( gp_Trsf2d  T1,  Bnd_Box2d  Other,  gp_Trsf2d  T2) {
    return OCCwrapJavaJNI.Bnd_Box2d_IsOut__SWIG_3(swigCPtr, this, gp_Trsf2d.getCPtr(T1), T1, Bnd_Box2d.getCPtr(Other), Other, gp_Trsf2d.getCPtr(T2), T2);
  }

  public void Dump() {
    OCCwrapJavaJNI.Bnd_Box2d_Dump(swigCPtr, this);
  }

  /**
   *  Computes the squared diagonal of me.
   */
  public double SquareExtent() {
    return OCCwrapJavaJNI.Bnd_Box2d_SquareExtent(swigCPtr, this);
  }

}
