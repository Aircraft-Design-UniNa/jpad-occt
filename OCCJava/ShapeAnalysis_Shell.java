package opencascade;

/**
 *  This class provides operators to analyze edges orientation
 *  in the shell.
 */
public class ShapeAnalysis_Shell {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeAnalysis_Shell(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeAnalysis_Shell(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeAnalysis_Shell obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeAnalysis_Shell(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Clears data about loaded shells and performed checks
   */
  public void Clear() {
    OCCwrapJavaJNI.ShapeAnalysis_Shell_Clear(swigCPtr, this);
  }

  /**
   *  Adds shells contained in the <shape> to the list of loaded shells
   */
  public void LoadShells( TopoDS_Shape  shape) {
    OCCwrapJavaJNI.ShapeAnalysis_Shell_LoadShells(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape);
  }

  /**
   *  Checks if shells fulfill orientation condition, i.e. if each
   *  edge is, either present once (free edge) or twice (connected
   *  edge) but with different orientations (FORWARD/REVERSED)
   *  Edges which do not fulfill these conditions are bad
   * 
   *  If <alsofree> is True free edges are considered.
   *  Free edges can be queried but are not bad
   */
  public long CheckOrientedShells( TopoDS_Shape  shape, long alsofree, long checkinternaledges) {
    return OCCwrapJavaJNI.ShapeAnalysis_Shell_CheckOrientedShells__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, alsofree, checkinternaledges);
  }

  public long CheckOrientedShells( TopoDS_Shape  shape, long alsofree) {
    return OCCwrapJavaJNI.ShapeAnalysis_Shell_CheckOrientedShells__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, alsofree);
  }

  public long CheckOrientedShells( TopoDS_Shape  shape) {
    return OCCwrapJavaJNI.ShapeAnalysis_Shell_CheckOrientedShells__SWIG_2(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape);
  }

  /**
   *  Tells if a shape is loaded (only shells are checked)
   */
  public long IsLoaded( TopoDS_Shape  shape) {
    return OCCwrapJavaJNI.ShapeAnalysis_Shell_IsLoaded(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape);
  }

  /**
   *  Returns the actual number of loaded shapes (i.e. shells)
   */
  public int NbLoaded() {
    return OCCwrapJavaJNI.ShapeAnalysis_Shell_NbLoaded(swigCPtr, this);
  }

  /**
   *  Returns a loaded shape specified by its rank number.
   *  Returns null shape if <num> is out of range
   */
  public TopoDS_Shape Loaded(int num) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeAnalysis_Shell_Loaded(swigCPtr, this, num), true);
  }

  /**
   *  Tells if at least one edge is recorded as bad
   */
  public long HasBadEdges() {
    return OCCwrapJavaJNI.ShapeAnalysis_Shell_HasBadEdges(swigCPtr, this);
  }

  /**
   *  Returns the list of bad edges as a Compound
   *  It is empty (not null) if no edge are recorded as bad
   */
  public TopoDS_Compound BadEdges() {
    return new TopoDS_Compound(OCCwrapJavaJNI.ShapeAnalysis_Shell_BadEdges(swigCPtr, this), true);
  }

  /**
   *  Tells if at least one edge is recorded as free (not connected)
   */
  public long HasFreeEdges() {
    return OCCwrapJavaJNI.ShapeAnalysis_Shell_HasFreeEdges(swigCPtr, this);
  }

  /**
   *  Returns the list of free (not connected) edges as a Compound
   *  It is empty (not null) if no edge are recorded as free
   */
  public TopoDS_Compound FreeEdges() {
    return new TopoDS_Compound(OCCwrapJavaJNI.ShapeAnalysis_Shell_FreeEdges(swigCPtr, this), true);
  }

  /**
   *  Tells if at least one edge is connected (shared twice or more)
   */
  public long HasConnectedEdges() {
    return OCCwrapJavaJNI.ShapeAnalysis_Shell_HasConnectedEdges(swigCPtr, this);
  }

  public ShapeAnalysis_Shell() {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_Shell(), true);
  }

}
