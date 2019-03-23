package opencascade;

/**
 * 
 *  The class is a General Fuse algorithm - base algorithm for the
 *  algorithms in the Boolean Component. Its main purpose is to build
 *  the split parts of the argument shapes from which the result of
 *  the operations is combined.
 *  The result of the General Fuse algorithm itself is a compound
 *  containing all split parts of the arguments. 
 * 
 *  Additionally to the options of the base classes, the algorithm has
 *  the following options:
 *  - *Safe processing mode* - allows to avoid modification of the input
 *                             shapes during the operation (by default it is off);
 *  - *Gluing options* - allows to speed up the calculation of the intersections
 *                       on the special cases, in which some sub-shapes are coinciding.
 *  - *Disabling the check for inverted solids* - Disables/Enables the check of the input solids
 *                           for inverted status (holes in the space). The default value is TRUE,
 *                           i.e. the check is performed. Setting this flag to FALSE for inverted solids,
 *                           most likely will lead to incorrect results.
 * 
 *  The algorithm returns the following warnings:
 *  - *BOPAlgo_AlertUnableToOrientTheShape* - in case the check on the orientation of the split shape
 *                                            to match the orientation of the original shape has failed.
 * 
 *  The algorithm returns the following Error statuses:
 *  - *BOPAlgo_AlertTooFewArguments* - in case there are no enough arguments to perform the operation;
 *  - *BOPAlgo_AlertNoFiller* - in case the intersection tool has not been created;
 *  - *BOPAlgo_AlertIntersectionFailed* - in case the intersection of the arguments has failed;
 *  - *BOPAlgo_AlertBuilderFailed* - in case building splits of arguments has failed with some unexpected error.
 * 
 */
public class BOPAlgo_Builder extends BOPAlgo_BuilderShape {

  private long swigCPtr;
  BOPAlgo_Builder(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BOPAlgo_Builder_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BOPAlgo_Builder(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BOPAlgo_Builder_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BOPAlgo_Builder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPAlgo_Builder(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Empty constructor.
   */
  public BOPAlgo_Builder() {
    this(OCCwrapJavaJNI.new_BOPAlgo_Builder__SWIG_0(), true);
  }

  public BOPAlgo_Builder( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_BOPAlgo_Builder__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  /**
   *  Returns the PaveFiller, algorithm for sub-shapes intersection.
   */
  public BOPAlgo_PaveFiller PPaveFiller() {
    long cPtr = OCCwrapJavaJNI.BOPAlgo_Builder_PPaveFiller(swigCPtr, this);
    return (cPtr == 0) ? null : new BOPAlgo_PaveFiller(cPtr, false);
  }

  /**
   *  Returns the Data Structure, holder of intersection information.
   */
  public BOPDS_DS PDS() {
    long cPtr = OCCwrapJavaJNI.BOPAlgo_Builder_PDS(swigCPtr, this);
    return (cPtr == 0) ? null : new BOPDS_DS(cPtr, false);
  }

  public  IntTools_Context  Context() {
    return new IntTools_Context ( OCCwrapJavaJNI.BOPAlgo_Builder_Context(swigCPtr, this), true );
  }

  /**
   *  Adds the argument to the operation.
   */
  public void AddArgument( TopoDS_Shape  theShape) {
    OCCwrapJavaJNI.BOPAlgo_Builder_AddArgument(swigCPtr, this, TopoDS_Shape.getCPtr(theShape), theShape);
  }

  /**
   *  Sets the list of arguments for the operation.
   */
  public void SetArguments( TopTools_ListOfShape  theLS) {
    OCCwrapJavaJNI.BOPAlgo_Builder_SetArguments(swigCPtr, this, TopTools_ListOfShape.getCPtr(theLS), theLS);
  }

  /**
   *  Returns the list of arguments.
   */
  public  TopTools_ListOfShape  Arguments() {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BOPAlgo_Builder_Arguments(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Sets the flag that defines the mode of treatment.
   *  In non-destructive mode the argument shapes are not modified. Instead
   *  a copy of a sub-shape is created in the result if it is needed to be updated.
   *  This flag is taken into account if internal PaveFiller is used only.
   *  In the case of calling PerformWithFiller the corresponding flag of that PaveFiller
   *  is in force.
   */
  public void SetNonDestructive(long theFlag) {
    OCCwrapJavaJNI.BOPAlgo_Builder_SetNonDestructive(swigCPtr, this, theFlag);
  }

  /**
   *  Returns the flag that defines the mode of treatment.
   *  In non-destructive mode the argument shapes are not modified. Instead
   *  a copy of a sub-shape is created in the result if it is needed to be updated.
   */
  public long NonDestructive() {
    return OCCwrapJavaJNI.BOPAlgo_Builder_NonDestructive(swigCPtr, this);
  }

  /**
   *  Sets the glue option for the algorithm
   */
  public void SetGlue(SWIGTYPE_p_BOPAlgo_GlueEnum theGlue) {
    OCCwrapJavaJNI.BOPAlgo_Builder_SetGlue(swigCPtr, this, SWIGTYPE_p_BOPAlgo_GlueEnum.getCPtr(theGlue));
  }

  /**
   *  Returns the glue option of the algorithm
   */
  public SWIGTYPE_p_BOPAlgo_GlueEnum Glue() {
    return new SWIGTYPE_p_BOPAlgo_GlueEnum(OCCwrapJavaJNI.BOPAlgo_Builder_Glue(swigCPtr, this), true);
  }

  /**
   *  Enables/Disables the check of the input solids for inverted status
   */
  public void SetCheckInverted(long theCheck) {
    OCCwrapJavaJNI.BOPAlgo_Builder_SetCheckInverted(swigCPtr, this, theCheck);
  }

  /**
   *  Returns the flag defining whether the check for input solids on inverted status
   *  should be performed or not.
   */
  public long CheckInverted() {
    return OCCwrapJavaJNI.BOPAlgo_Builder_CheckInverted(swigCPtr, this);
  }

  /**
   *  Performs the operation with the prepared filler.
   *  The intersection will not be performed in this case.
   */
  public void PerformWithFiller(BOPAlgo_PaveFiller theFiller) {
    OCCwrapJavaJNI.BOPAlgo_Builder_PerformWithFiller(swigCPtr, this, BOPAlgo_PaveFiller.getCPtr(theFiller), theFiller);
  }

  /**
   *  Returns the map of images.
   */
  public  TopTools_DataMapOfShapeListOfShape  Images() {
    TopTools_DataMapOfShapeListOfShape ret = new TopTools_DataMapOfShapeListOfShape(OCCwrapJavaJNI.BOPAlgo_Builder_Images(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the map of origins.
   */
  public  TopTools_DataMapOfShapeListOfShape  Origins() {
    TopTools_DataMapOfShapeListOfShape ret = new TopTools_DataMapOfShapeListOfShape(OCCwrapJavaJNI.BOPAlgo_Builder_Origins(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the map of Same Domain (SD) shapes - coinciding shapes
   *  from different arguments.
   */
  public  TopTools_DataMapOfShapeShape  ShapesSD() {
    TopTools_DataMapOfShapeShape ret = new TopTools_DataMapOfShapeShape(OCCwrapJavaJNI.BOPAlgo_Builder_ShapesSD(swigCPtr, this), false, this);
    return ret;
  }

}
