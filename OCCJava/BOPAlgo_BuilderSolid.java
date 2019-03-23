package opencascade;

/**
 *  Solid Builder is the algorithm for building solids from set of faces.
 *  The given faces should be non-intersecting, i.e. all coinciding parts
 *  of the faces should be shared among them.
 * 
 *  The algorithm performs the following steps to build the solids:
 *  1. Find:
 *     - faces orientated INTERNAL;
 *     - alone faces given twice with different orientation;
 *  2. Build all possible closed shells from the rest of the faces
 *     (*BOPAlgo_ShellSplitter* is used for that);
 *  3. Classify the obtained shells on the Holes and Growths;
 *  4. Build solids from the Growth shells, put Hole shells into closest Growth solids;
 *  5. Classify all unused faces relatively created solids and put them as internal
 *     shells into the closest solids;
 *  6. Find all unclassified faces, i.e. faces outside of all created solids,
 *     make internal shells from them and put these shells into a warning.
 * 
 *  It is possible to avoid all internal shells in the resulting solids.
 *  For that it is necessary to use the method SetAvoidInternalShapes(true)
 *  of the base class. In this case the steps 5 and 6 will not be performed at all.
 * 
 *  The algorithm may return the following warnings:
 *  - *BOPAlgo_AlertShellSplitterFailed* in case the ShellSplitter algorithm has failed;
 *  - *BOPAlgo_AlertSolidBuilderUnusedFaces* in case there are some faces outside of
 *    created solids left.
 * 
 *  Example of usage of the algorithm:
 *  ~~~~
 *  const TopTools_ListOfShape& aFaces = ...;     // Faces to build the solids
 *  Standard_Boolean isAvoidInternals = ...;      // Flag which defines whether to create the internal shells or not
 *  BOPAlgo_BuilderSolid aBS;                     // Solid Builder tool
 *  aBS.SetShapes(aFaces);                        // Set the faces
 *  aBS.SetAvoidInternalShapes(isAvoidInternals); // Set the AvoidInternalShapesFlag
 *  aBS.Perform();                                // Perform the operation
 *  if (!aBS.IsDone())                            // Check for the errors
 *  {
 *    // error treatment
 *    Standard_SStream aSStream;
 *    aBS.DumpErrors(aSStream);
 *    return;
 *  }
 *  if (aBS.HasWarnings())                        // Check for the warnings
 *  {
 *    // warnings treatment
 *    Standard_SStream aSStream;
 *    aBS.DumpWarnings(aSStream);
 *  }
 * 
 *  const TopTools_ListOfShape& aSolids = aBS.Areas(); // Obtaining the result solids
 *  ~~~~
 * 
 */
public class BOPAlgo_BuilderSolid extends BOPAlgo_BuilderArea {

  private long swigCPtr;
  BOPAlgo_BuilderSolid(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BOPAlgo_BuilderSolid_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BOPAlgo_BuilderSolid(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BOPAlgo_BuilderSolid_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BOPAlgo_BuilderSolid obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPAlgo_BuilderSolid(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Empty constructor
   */
  public BOPAlgo_BuilderSolid() {
    this(OCCwrapJavaJNI.new_BOPAlgo_BuilderSolid__SWIG_0(), true);
  }

  public BOPAlgo_BuilderSolid( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_BOPAlgo_BuilderSolid__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  /**
   *  For classification purposes the algorithm builds the bounding boxes
   *  for all created solids. This method returns the data map of solid - box pairs.
   */
  public SWIGTYPE_p_TopTools_DataMapOfShapeBox GetBoxesMap() {
    return new SWIGTYPE_p_TopTools_DataMapOfShapeBox(OCCwrapJavaJNI.BOPAlgo_BuilderSolid_GetBoxesMap(swigCPtr, this), false);
  }

}
