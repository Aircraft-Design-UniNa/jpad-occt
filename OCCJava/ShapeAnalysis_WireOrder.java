package opencascade;

/**
 *  This class is intended to control and, if possible, redefine
 *  the order of a list of edges which define a wire
 *  Edges are not given directly, but as their bounds (start,end)
 * 
 *  This allows to use this tool, either on existing wire, or on
 *  data just taken from a file (coordinates are easy to get)
 * 
 *  It can work, either in 2D, or in 3D, but not miscible
 *  Warning about tolerance : according to the mode (2D/3D), it
 *  must be given as 2D or 3D (i.e. metric) tolerance, uniform
 *  on the whole list
 * 
 *  Two phases : firstly add the couples (start,end)
 *  secondly perform then get the result
 */
public class ShapeAnalysis_WireOrder {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeAnalysis_WireOrder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeAnalysis_WireOrder(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeAnalysis_WireOrder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeAnalysis_WireOrder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor
   */
  public ShapeAnalysis_WireOrder() {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_WireOrder__SWIG_0(), true);
  }

  /**
   *  Creates a WireOrder in 3D (if mode3d is True) or 2D (if False)
   *  with a tolerance
   */
  public ShapeAnalysis_WireOrder(long mode3d, double tol) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_WireOrder__SWIG_1(mode3d, tol), true);
  }

  /**
   *  Sets new values. Clears the connexion list
   *  If <mode3d> changes, also clears the edge list (else, doesnt)
   */
  public void SetMode(long mode3d, double tol) {
    OCCwrapJavaJNI.ShapeAnalysis_WireOrder_SetMode(swigCPtr, this, mode3d, tol);
  }

  /**
   *  Returns the working tolerance
   */
  public double Tolerance() {
    return OCCwrapJavaJNI.ShapeAnalysis_WireOrder_Tolerance(swigCPtr, this);
  }

  /**
   *  Clears the list of edges, but not mode and tol
   */
  public void Clear() {
    OCCwrapJavaJNI.ShapeAnalysis_WireOrder_Clear(swigCPtr, this);
  }

  /**
   *  Adds a couple of points 3D (start,end)
   */
  public void Add( gp_XYZ  start3d,  gp_XYZ  end3d) {
    OCCwrapJavaJNI.ShapeAnalysis_WireOrder_Add__SWIG_0(swigCPtr, this, gp_XYZ.getCPtr(start3d), start3d, gp_XYZ.getCPtr(end3d), end3d);
  }

  /**
   *  Adds a couple of points 2D (start,end)
   */
  public void Add( gp_XY  start2d,  gp_XY  end2d) {
    OCCwrapJavaJNI.ShapeAnalysis_WireOrder_Add__SWIG_1(swigCPtr, this, gp_XY.getCPtr(start2d), start2d, gp_XY.getCPtr(end2d), end2d);
  }

  /**
   *  Returns the count of added couples of points (one per edges)
   */
  public int NbEdges() {
    return OCCwrapJavaJNI.ShapeAnalysis_WireOrder_NbEdges(swigCPtr, this);
  }

  public long[] KeepLoopsMode() {return OCCwrapJavaJNI.ShapeAnalysis_WireOrder_KeepLoopsMode(swigCPtr, this);}

  /**
   *  Computes the better order
   *  If <closed> is True (D) considers also closure
   *  Optimised if the couples were already in order
   *  The criterium is : two couples in order if distance between
   *  end-prec and start-cur is less then starting tolerance <tol>
   *  Else, the smallest distance is reached
   *  Gap corresponds to a smallest distance greater than <tol>
   */
  public void Perform(long closed) {
    OCCwrapJavaJNI.ShapeAnalysis_WireOrder_Perform__SWIG_0(swigCPtr, this, closed);
  }

  public void Perform() {
    OCCwrapJavaJNI.ShapeAnalysis_WireOrder_Perform__SWIG_1(swigCPtr, this);
  }

  /**
   *  Tells if Perform has been done
   *  Else, the following methods returns original values
   */
  public long IsDone() {
    return OCCwrapJavaJNI.ShapeAnalysis_WireOrder_IsDone(swigCPtr, this);
  }

  /**
   *  Returns the status of the order (0 if not done) :
   *  0 : all edges are direct and in sequence
   *  1 : all edges are direct but some are not in sequence
   *  2 : in addition, unresolved gaps remain
   *  -1 : some edges are reversed, but no gap remain
   *  -2 : some edges are reversed and some gaps remain
   *  -10 : COULD NOT BE RESOLVED, Failure on Reorder
   *  gap : regarding starting <tol>
   */
  public int Status() {
    return OCCwrapJavaJNI.ShapeAnalysis_WireOrder_Status(swigCPtr, this);
  }

  /**
   *  Returns the number of original edge which correspond to the
   *  newly ordered number <n>
   *  Warning : the returned value is NEGATIVE if edge should be reversed
   */
  public int Ordered(int n) {
    return OCCwrapJavaJNI.ShapeAnalysis_WireOrder_Ordered(swigCPtr, this, n);
  }

  /**
   *  Returns the values of the couple <num>, as 3D values
   */
  public void XYZ(int num, gp_XYZ start3d, gp_XYZ end3d) {
    OCCwrapJavaJNI.ShapeAnalysis_WireOrder_XYZ(swigCPtr, this, num, gp_XYZ.getCPtr(start3d), start3d, gp_XYZ.getCPtr(end3d), end3d);
  }

  /**
   *  Returns the values of the couple <num>, as 2D values
   */
  public void XY(int num, gp_XY start2d, gp_XY end2d) {
    OCCwrapJavaJNI.ShapeAnalysis_WireOrder_XY(swigCPtr, this, num, gp_XY.getCPtr(start2d), start2d, gp_XY.getCPtr(end2d), end2d);
  }

  /**
   *  Returns the gap between a couple and its preceeding
   *  <num> is considered ordered
   *  If <num> = 0 (D), returns the greatest gap found
   */
  public double Gap(int num) {
    return OCCwrapJavaJNI.ShapeAnalysis_WireOrder_Gap__SWIG_0(swigCPtr, this, num);
  }

  public double Gap() {
    return OCCwrapJavaJNI.ShapeAnalysis_WireOrder_Gap__SWIG_1(swigCPtr, this);
  }

  /**
   *  Determines the chains inside which successive edges have a gap
   *  less than a given value. Queried by NbChains and Chain
   */
  public void SetChains(double gap) {
    OCCwrapJavaJNI.ShapeAnalysis_WireOrder_SetChains(swigCPtr, this, gap);
  }

  /**
   *  Returns the count of computed chains
   */
  public int NbChains() {
    return OCCwrapJavaJNI.ShapeAnalysis_WireOrder_NbChains(swigCPtr, this);
  }

  /**
   *  Returns, for the chain n0 num, starting and ending numbers of
   *  edges. In the list of ordered edges (see Ordered for originals)
   */
  public void Chain(int num, int[] n1, int[] n2) {
    OCCwrapJavaJNI.ShapeAnalysis_WireOrder_Chain(swigCPtr, this, num, n1, n2);
  }

  /**
   *  Determines the couples of edges for which end and start fit
   *  inside a given gap. Queried by NbCouples and Couple
   */
  public void SetCouples(double gap) {
    OCCwrapJavaJNI.ShapeAnalysis_WireOrder_SetCouples(swigCPtr, this, gap);
  }

  /**
   *  Returns the count of computed couples
   */
  public int NbCouples() {
    return OCCwrapJavaJNI.ShapeAnalysis_WireOrder_NbCouples(swigCPtr, this);
  }

  /**
   *  Returns, for the couple n0 num, the two implied edges
   *  In the list of ordered edges
   */
  public void Couple(int num, int[] n1, int[] n2) {
    OCCwrapJavaJNI.ShapeAnalysis_WireOrder_Couple(swigCPtr, this, num, n1, n2);
  }

}
