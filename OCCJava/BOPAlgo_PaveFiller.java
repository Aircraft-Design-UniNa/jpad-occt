package opencascade;

/**
 * 
 *  The class represents the Intersection phase of the
 *  Boolean Operations algorithm.
 *  It performs the pairwise intersection of the sub-shapes of
 *  the arguments in the following order:
 *  1. Vertex/Vertex;
 *  2. Vertex/Edge;
 *  3. Edge/Edge;
 *  4. Vertex/Face;
 *  5. Edge/Face;
 *  6. Face/Face.
 * 
 *  The results of intersection are stored into the Data Structure
 *  of the algorithm.
 * 
 *  Additionally to the options provided by the parent class,
 *  the algorithm has the following options:
 *  - *Section attributes* - allows to customize the intersection of the faces
 *                           (avoid approximation or building 2d curves);
 *  - *Safe processing mode* - allows to avoid modification of the input
 *                             shapes during the operation (by default it is off);
 *  - *Gluing options* - allows to speed up the calculation on the special
 *                       cases, in which some sub-shapes are coincide.
 * 
 *  The algorithm returns the following Warning statuses:
 *  - *BOPAlgo_AlertSelfInterferingShape* - in case some of the argument shapes are self-interfering shapes;
 *  - *BOPAlgo_AlertTooSmallEdge* - in case some edges of the input shapes have no valid range;
 *  - *BOPAlgo_AlertNotSplittableEdge* - in case some edges of the input shapes has such a small
 *                                       valid range so it cannot be split;
 *  - *BOPAlgo_AlertBadPositioning* - in case the positioning of the input shapes leads to creation
 *                                    of small edges;
 *  - *BOPAlgo_AlertIntersectionOfPairOfShapesFailed* - in case intersection of some of the
 *                                                      sub-shapes has failed;
 *  - *BOPAlgo_AlertAcquiredSelfIntersection* - in case some sub-shapes of the argument become connected
 *                                              through other shapes;
 *  - *BOPAlgo_AlertBuildingPCurveFailed* - in case building 2D curve for some of the edges
 *                                          on the faces has failed.
 * 
 *  The algorithm returns the following Error alerts:
 *  - *BOPAlgo_AlertTooFewArguments* - in case there are no enough arguments to
 *                       perform the operation;
 *  - *BOPAlgo_AlertIntersectionFailed* - in case some unexpected error occurred;
 *  - *BOPAlgo_AlertNullInputShapes* - in case some of the arguments are null shapes.
 * 
 */
public class BOPAlgo_PaveFiller extends BOPAlgo_Algo {

  private long swigCPtr;
  BOPAlgo_PaveFiller(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BOPAlgo_PaveFiller_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BOPAlgo_PaveFiller(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BOPAlgo_PaveFiller_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BOPAlgo_PaveFiller obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPAlgo_PaveFiller(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BOPAlgo_PaveFiller() {
    this(OCCwrapJavaJNI.new_BOPAlgo_PaveFiller__SWIG_0(), true);
  }

  public BOPAlgo_PaveFiller( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_BOPAlgo_PaveFiller__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public  BOPDS_DS  DS() {
    BOPDS_DS ret = new BOPDS_DS(OCCwrapJavaJNI.BOPAlgo_PaveFiller_DS(swigCPtr, this), false, this);
    return ret;
  }

  public BOPDS_DS PDS() {
    long cPtr = OCCwrapJavaJNI.BOPAlgo_PaveFiller_PDS(swigCPtr, this);
    return (cPtr == 0) ? null : new BOPDS_DS(cPtr, false);
  }

  public void SetArguments( TopTools_ListOfShape  theLS) {
    OCCwrapJavaJNI.BOPAlgo_PaveFiller_SetArguments(swigCPtr, this, TopTools_ListOfShape.getCPtr(theLS), theLS);
  }

  public  TopTools_ListOfShape  Arguments() {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BOPAlgo_PaveFiller_Arguments(swigCPtr, this), false, this);
    return ret;
  }

  public  IntTools_Context  Context() {
    return new IntTools_Context ( OCCwrapJavaJNI.BOPAlgo_PaveFiller_Context(swigCPtr, this), true );
  }

  public void SetSectionAttribute( BOPAlgo_SectionAttribute  theSecAttr) {
    OCCwrapJavaJNI.BOPAlgo_PaveFiller_SetSectionAttribute(swigCPtr, this, BOPAlgo_SectionAttribute.getCPtr(theSecAttr), theSecAttr);
  }

  /**
   *  Sets the flag that defines the mode of treatment.
   *  In non-destructive mode the argument shapes are not modified. Instead
   *  a copy of a sub-shape is created in the result if it is needed to be updated.
   */
  public void SetNonDestructive(long theFlag) {
    OCCwrapJavaJNI.BOPAlgo_PaveFiller_SetNonDestructive(swigCPtr, this, theFlag);
  }

  /**
   *  Returns the flag that defines the mode of treatment.
   *  In non-destructive mode the argument shapes are not modified. Instead
   *  a copy of a sub-shape is created in the result if it is needed to be updated.
   */
  public long NonDestructive() {
    return OCCwrapJavaJNI.BOPAlgo_PaveFiller_NonDestructive(swigCPtr, this);
  }

  /**
   *  Sets the glue option for the algorithm
   */
  public void SetGlue(SWIGTYPE_p_BOPAlgo_GlueEnum theGlue) {
    OCCwrapJavaJNI.BOPAlgo_PaveFiller_SetGlue(swigCPtr, this, SWIGTYPE_p_BOPAlgo_GlueEnum.getCPtr(theGlue));
  }

  /**
   *  Returns the glue option of the algorithm
   */
  public SWIGTYPE_p_BOPAlgo_GlueEnum Glue() {
    return new SWIGTYPE_p_BOPAlgo_GlueEnum(OCCwrapJavaJNI.BOPAlgo_PaveFiller_Glue(swigCPtr, this), true);
  }

  /**
   *  Sets the flag to avoid building of p-curves of edges on faces
   */
  public void SetAvoidBuildPCurve(long theValue) {
    OCCwrapJavaJNI.BOPAlgo_PaveFiller_SetAvoidBuildPCurve(swigCPtr, this, theValue);
  }

  /**
   *  Returns the flag to avoid building of p-curves of edges on faces
   */
  public long IsAvoidBuildPCurve() {
    return OCCwrapJavaJNI.BOPAlgo_PaveFiller_IsAvoidBuildPCurve(swigCPtr, this);
  }

}
