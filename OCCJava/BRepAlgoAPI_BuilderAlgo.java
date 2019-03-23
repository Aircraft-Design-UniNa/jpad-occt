package opencascade;

/**
 *  The class contains API level of the General Fuse algorithm.
 * 
 *  Additionally to the options defined in the base class, the algorithm has
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
 *  It returns the following Error statuses:
 *  - 0 - in case of success;
 *  - *BOPAlgo_AlertTooFewArguments* - in case there are no enough arguments to perform the operation;
 *  - *BOPAlgo_AlertIntersectionFailed* - in case the intersection of the arguments has failed;
 *  - *BOPAlgo_AlertBuilderFailed* - in case building of the result shape has failed.
 * 
 *  Warnings statuses from underlying DS Filler and Builder algorithms
 *  are collected in the report.
 */
public class BRepAlgoAPI_BuilderAlgo extends BRepAlgoAPI_Algo {

  private long swigCPtr;
  BRepAlgoAPI_BuilderAlgo(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepAlgoAPI_BuilderAlgo_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepAlgoAPI_BuilderAlgo(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepAlgoAPI_BuilderAlgo_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepAlgoAPI_BuilderAlgo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepAlgoAPI_BuilderAlgo(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Empty constructor
   */
  public BRepAlgoAPI_BuilderAlgo() {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_BuilderAlgo__SWIG_0(), true);
  }

  public BRepAlgoAPI_BuilderAlgo( BOPAlgo_PaveFiller  thePF) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_BuilderAlgo__SWIG_1(BOPAlgo_PaveFiller.getCPtr(thePF), thePF), true);
  }

  /**
   *  Sets the flag that defines the mode of treatment.
   *  In non-destructive mode the argument shapes are not modified. Instead
   *  a copy of a sub-shape is created in the result if it is needed to be updated.
   */
  public void SetNonDestructive(long theFlag) {
    OCCwrapJavaJNI.BRepAlgoAPI_BuilderAlgo_SetNonDestructive(swigCPtr, this, theFlag);
  }

  /**
   *  Returns the flag that defines the mode of treatment.
   *  In non-destructive mode the argument shapes are not modified. Instead
   *  a copy of a sub-shape is created in the result if it is needed to be updated.
   */
  public long NonDestructive() {
    return OCCwrapJavaJNI.BRepAlgoAPI_BuilderAlgo_NonDestructive(swigCPtr, this);
  }

  /**
   *  Sets the glue option for the algorithm
   */
  public void SetGlue(SWIGTYPE_p_BOPAlgo_GlueEnum theGlue) {
    OCCwrapJavaJNI.BRepAlgoAPI_BuilderAlgo_SetGlue(swigCPtr, this, SWIGTYPE_p_BOPAlgo_GlueEnum.getCPtr(theGlue));
  }

  /**
   *  Returns the glue option of the algorithm
   */
  public SWIGTYPE_p_BOPAlgo_GlueEnum Glue() {
    return new SWIGTYPE_p_BOPAlgo_GlueEnum(OCCwrapJavaJNI.BRepAlgoAPI_BuilderAlgo_Glue(swigCPtr, this), true);
  }

  /**
   *  Enables/Disables the check of the input solids for inverted status
   */
  public void SetCheckInverted(long theCheck) {
    OCCwrapJavaJNI.BRepAlgoAPI_BuilderAlgo_SetCheckInverted(swigCPtr, this, theCheck);
  }

  /**
   *  Returns the flag defining whether the check for input solids on inverted status
   *  should be performed or not.
   */
  public long CheckInverted() {
    return OCCwrapJavaJNI.BRepAlgoAPI_BuilderAlgo_CheckInverted(swigCPtr, this);
  }

  /**
   *  Sets the arguments
   */
  public void SetArguments( TopTools_ListOfShape  theLS) {
    OCCwrapJavaJNI.BRepAlgoAPI_BuilderAlgo_SetArguments(swigCPtr, this, TopTools_ListOfShape.getCPtr(theLS), theLS);
  }

  /**
   *  Gets the arguments
   */
  public  TopTools_ListOfShape  Arguments() {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BRepAlgoAPI_BuilderAlgo_Arguments(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns true if there is at least one modified shape.
   *  For use in BRepNaming.
   */
  public long HasModified() {
    return OCCwrapJavaJNI.BRepAlgoAPI_BuilderAlgo_HasModified(swigCPtr, this);
  }

  /**
   *  Returns true if there is at least one generated shape.
   *  For use in BRepNaming.
   */
  public long HasGenerated() {
    return OCCwrapJavaJNI.BRepAlgoAPI_BuilderAlgo_HasGenerated(swigCPtr, this);
  }

  /**
   *  Returns true if there is at least one deleted shape.
   *  For use in BRepNaming.
   * 
   *  protected methods
   */
  public long HasDeleted() {
    return OCCwrapJavaJNI.BRepAlgoAPI_BuilderAlgo_HasDeleted(swigCPtr, this);
  }

  /**
   *  Returns the Intersection tool
   */
  public BOPAlgo_PaveFiller DSFiller() {
    long cPtr = OCCwrapJavaJNI.BRepAlgoAPI_BuilderAlgo_DSFiller(swigCPtr, this);
    return (cPtr == 0) ? null : new BOPAlgo_PaveFiller(cPtr, false);
  }

  /**
   *  Returns the Building tool
   */
  public SWIGTYPE_p_BOPAlgo_PBuilder Builder() {
    return new SWIGTYPE_p_BOPAlgo_PBuilder(OCCwrapJavaJNI.BRepAlgoAPI_BuilderAlgo_Builder(swigCPtr, this), false);
  }

}
