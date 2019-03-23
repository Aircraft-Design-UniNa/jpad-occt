package opencascade;

/**
 *  A tool to compare a bounding box or a plane with a set of
 *  bounding boxes. It sorts the set of bounding boxes to give
 *  the list of boxes which intersect the element being compared.
 *  The boxes being sorted generally bound a set of shapes,
 *  while the box being compared bounds a shape to be
 *  compared. The resulting list of intersecting boxes therefore
 *  gives the list of items which potentially intersect the shape to be compared.
 */
public class Bnd_BoundSortBox {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Bnd_BoundSortBox(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Bnd_BoundSortBox(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Bnd_BoundSortBox obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Bnd_BoundSortBox(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructs an empty comparison algorithm for bounding boxes.
   *  The bounding boxes are then defined using the Initialize function.
   */
  public Bnd_BoundSortBox() {
    this(OCCwrapJavaJNI.new_Bnd_BoundSortBox(), true);
  }

  /**
   *  Initializes this comparison algorithm with
   *  -   the set of bounding boxes SetOfBox.
   */
  public void Initialize( Bnd_Box  CompleteBox,  Bnd_HArray1OfBox  SetOfBox) {
    OCCwrapJavaJNI.Bnd_BoundSortBox_Initialize__SWIG_0(swigCPtr, this, Bnd_Box.getCPtr(CompleteBox), CompleteBox,  Bnd_HArray1OfBox.getCPtr(SetOfBox) , SetOfBox);
  }

  /**
   *  Initializes this comparison algorithm with
   *  -   the set of bounding boxes SetOfBox, where
   *  CompleteBox is given as the global bounding box of SetOfBox.
   */
  public void Initialize( Bnd_HArray1OfBox  SetOfBox) {
    OCCwrapJavaJNI.Bnd_BoundSortBox_Initialize__SWIG_1(swigCPtr, this,  Bnd_HArray1OfBox.getCPtr(SetOfBox) , SetOfBox);
  }

  /**
   *  Initializes this comparison algorithm, giving it only
   *  -   the maximum number nbComponents
   *  of the bounding boxes to be managed. Use the Add
   *  function to define the array of bounding boxes to be sorted by this algorithm.
   */
  public void Initialize( Bnd_Box  CompleteBox, int nbComponents) {
    OCCwrapJavaJNI.Bnd_BoundSortBox_Initialize__SWIG_2(swigCPtr, this, Bnd_Box.getCPtr(CompleteBox), CompleteBox, nbComponents);
  }

  /**
   *  Adds the bounding box theBox at position boxIndex in
   *  the array of boxes to be sorted by this comparison algorithm.
   *  This function is used only in conjunction with the third
   *  syntax described in the synopsis of Initialize.
   * 
   *  Exceptions:
   * 
   *  - Standard_OutOfRange if boxIndex is not in the
   *  range [ 1,nbComponents ] where
   *  nbComponents is the maximum number of bounding
   *  boxes declared for this comparison algorithm at
   *  initialization.
   * 
   *  - Standard_MultiplyDefined if a box already exists at
   *  position boxIndex in the array of boxes to be sorted by
   *  this comparison algorithm.
   */
  public void Add( Bnd_Box  theBox, int boxIndex) {
    OCCwrapJavaJNI.Bnd_BoundSortBox_Add(swigCPtr, this, Bnd_Box.getCPtr(theBox), theBox, boxIndex);
  }

  /**
   *  Compares the bounding box theBox,
   *  with the set of bounding boxes to be sorted by this
   *  comparison algorithm, and returns the list of intersecting
   *  bounding boxes as a list of indexes on the array of
   *  bounding boxes used by this algorithm.
   */
  public  TColStd_ListOfInteger  Compare( Bnd_Box  theBox) {
    TColStd_ListOfInteger ret = new TColStd_ListOfInteger(OCCwrapJavaJNI.Bnd_BoundSortBox_Compare__SWIG_0(swigCPtr, this, Bnd_Box.getCPtr(theBox), theBox), false, this);
    return ret;
  }

  /**
   *  Compares the plane P
   *  with the set of bounding boxes to be sorted by this
   *  comparison algorithm, and returns the list of intersecting
   *  bounding boxes as a list of indexes on the array of
   *  bounding boxes used by this algorithm.
   */
  public  TColStd_ListOfInteger  Compare( gp_Pln  P) {
    TColStd_ListOfInteger ret = new TColStd_ListOfInteger(OCCwrapJavaJNI.Bnd_BoundSortBox_Compare__SWIG_1(swigCPtr, this, gp_Pln.getCPtr(P), P), false, this);
    return ret;
  }

  public void Dump() {
    OCCwrapJavaJNI.Bnd_BoundSortBox_Dump(swigCPtr, this);
  }

  public void Destroy() {
    OCCwrapJavaJNI.Bnd_BoundSortBox_Destroy(swigCPtr, this);
  }

}
