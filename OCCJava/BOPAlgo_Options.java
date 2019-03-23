package opencascade;

/**
 *  The class provides the following options for the algorithms in Boolean Component:
 *  - *Memory allocation tool* - tool for memory allocations;
 *  - *Error and warning reporting* - allows recording warnings and errors occurred 
 *                               during the operation.
 *                               Error means that the algorithm has failed.
 *  - *Parallel processing mode* - provides the possibility to perform operation in parallel mode;
 *  - *Fuzzy tolerance* - additional tolerance for the operation to detect
 *                        touching or coinciding cases;
 *  - *Progress indicator* - provides interface to track the progress of
 *                           operation and stop the operation by user's break.
 *  - *Using the Oriented Bounding Boxes* - Allows using the Oriented Bounding Boxes of the shapes
 *                           for filtering the intersections.
 * 
 */
public class BOPAlgo_Options {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BOPAlgo_Options(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BOPAlgo_Options(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BOPAlgo_Options obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPAlgo_Options(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor
   */
  public BOPAlgo_Options() {
    this(OCCwrapJavaJNI.new_BOPAlgo_Options__SWIG_0(), true);
  }

  /**
   *  Constructor with allocator
   */
  public BOPAlgo_Options( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_BOPAlgo_Options__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  public  NCollection_BaseAllocator  Allocator() {
    return new NCollection_BaseAllocator ( OCCwrapJavaJNI.BOPAlgo_Options_Allocator(swigCPtr, this), true );
  }

  /**
   *  Clears all warnings and errors, and any data cached by the algorithm.
   *  User defined options are not cleared.
   */
  public void Clear() {
    OCCwrapJavaJNI.BOPAlgo_Options_Clear(swigCPtr, this);
  }

  /**
   *  Adds the alert as error (fail)
   */
  public void AddError(SWIGTYPE_p_opencascade__handleT_Message_Alert_t theAlert) {
    OCCwrapJavaJNI.BOPAlgo_Options_AddError(swigCPtr, this, SWIGTYPE_p_opencascade__handleT_Message_Alert_t.getCPtr(theAlert));
  }

  /**
   *  Adds the alert as warning
   */
  public void AddWarning(SWIGTYPE_p_opencascade__handleT_Message_Alert_t theAlert) {
    OCCwrapJavaJNI.BOPAlgo_Options_AddWarning(swigCPtr, this, SWIGTYPE_p_opencascade__handleT_Message_Alert_t.getCPtr(theAlert));
  }

  /**
   *  Returns true if algorithm has failed
   */
  public long HasErrors() {
    return OCCwrapJavaJNI.BOPAlgo_Options_HasErrors(swigCPtr, this);
  }

  /**
   *  Returns true if algorithm has generated error of specified type
   */
  public long HasError( Standard_Type  theType) {
    return OCCwrapJavaJNI.BOPAlgo_Options_HasError(swigCPtr, this,  Standard_Type.getCPtr(theType) , theType);
  }

  /**
   *  Returns true if algorithm has generated some warning alerts
   */
  public long HasWarnings() {
    return OCCwrapJavaJNI.BOPAlgo_Options_HasWarnings(swigCPtr, this);
  }

  /**
   *  Returns true if algorithm has generated warning of specified type
   */
  public long HasWarning( Standard_Type  theType) {
    return OCCwrapJavaJNI.BOPAlgo_Options_HasWarning(swigCPtr, this,  Standard_Type.getCPtr(theType) , theType);
  }

  public SWIGTYPE_p_opencascade__handleT_Message_Report_t GetReport() {
    return new SWIGTYPE_p_opencascade__handleT_Message_Report_t(OCCwrapJavaJNI.BOPAlgo_Options_GetReport(swigCPtr, this), false);
  }

  /**
   *  Dumps the error status into the given stream
   */
  public void DumpErrors(SWIGTYPE_p_Standard_OStream theOS) {
    OCCwrapJavaJNI.BOPAlgo_Options_DumpErrors(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(theOS));
  }

  /**
   *  Dumps the warning statuses into the given stream
   */
  public void DumpWarnings(SWIGTYPE_p_Standard_OStream theOS) {
    OCCwrapJavaJNI.BOPAlgo_Options_DumpWarnings(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(theOS));
  }

  /**
   *  Clears the warnings of the algorithm
   */
  public void ClearWarnings() {
    OCCwrapJavaJNI.BOPAlgo_Options_ClearWarnings(swigCPtr, this);
  }

  /**
   *  Gets the global parallel mode
   */
  public static long GetParallelMode() {
    return OCCwrapJavaJNI.BOPAlgo_Options_GetParallelMode();
  }

  /**
   *  Sets the global parallel mode
   */
  public static void SetParallelMode(long theNewMode) {
    OCCwrapJavaJNI.BOPAlgo_Options_SetParallelMode(theNewMode);
  }

  /**
   *  Set the flag of parallel processing
   *  if <theFlag> is true  the parallel processing is switched on
   *  if <theFlag> is false the parallel processing is switched off
   */
  public void SetRunParallel(long theFlag) {
    OCCwrapJavaJNI.BOPAlgo_Options_SetRunParallel(swigCPtr, this, theFlag);
  }

  /**
   *  Returns the flag of parallel processing
   */
  public long RunParallel() {
    return OCCwrapJavaJNI.BOPAlgo_Options_RunParallel(swigCPtr, this);
  }

  /**
   *  Sets the additional tolerance
   */
  public void SetFuzzyValue(double theFuzz) {
    OCCwrapJavaJNI.BOPAlgo_Options_SetFuzzyValue(swigCPtr, this, theFuzz);
  }

  /**
   *  Returns the additional tolerance
   */
  public double FuzzyValue() {
    return OCCwrapJavaJNI.BOPAlgo_Options_FuzzyValue(swigCPtr, this);
  }

  /**
   *  Set the Progress Indicator object.
   */
  public void SetProgressIndicator( Message_ProgressIndicator  theObj) {
    OCCwrapJavaJNI.BOPAlgo_Options_SetProgressIndicator(swigCPtr, this,  Message_ProgressIndicator.getCPtr(theObj) , theObj);
  }

  /**
   *  Enables/Disables the usage of OBB
   */
  public void SetUseOBB(long theUseOBB) {
    OCCwrapJavaJNI.BOPAlgo_Options_SetUseOBB(swigCPtr, this, theUseOBB);
  }

  /**
   *  Returns the flag defining usage of OBB
   */
  public long UseOBB() {
    return OCCwrapJavaJNI.BOPAlgo_Options_UseOBB(swigCPtr, this);
  }

}
