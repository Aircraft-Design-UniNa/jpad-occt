package opencascade;

/**
 *  The class BOPDS_Pave is to store
 *  information about vertex on an edge
 */
public class BOPDS_Pave {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BOPDS_Pave(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BOPDS_Pave(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BOPDS_Pave obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPDS_Pave(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty contructor
   */
  public BOPDS_Pave() {
    this(OCCwrapJavaJNI.new_BOPDS_Pave(), true);
  }

  /**
   *  Modifier
   *  Sets the index of vertex <theIndex>
   */
  public void SetIndex(int theIndex) {
    OCCwrapJavaJNI.BOPDS_Pave_SetIndex(swigCPtr, this, theIndex);
  }

  /**
   *  Selector
   *  Returns the index of vertex
   */
  public int Index() {
    return OCCwrapJavaJNI.BOPDS_Pave_Index(swigCPtr, this);
  }

  /**
   *  Modifier
   *  Sets the parameter of vertex <theParameter>
   */
  public void SetParameter(double theParameter) {
    OCCwrapJavaJNI.BOPDS_Pave_SetParameter(swigCPtr, this, theParameter);
  }

  /**
   *  Selector
   *  Returns the parameter of vertex
   */
  public double Parameter() {
    return OCCwrapJavaJNI.BOPDS_Pave_Parameter(swigCPtr, this);
  }

  /**
   *  Selector
   *  Returns the index of vertex <theIndex>
   *  Returns the parameter of vertex <theParameter>
   */
  public void Contents(int[] theIndex, double[] theParameter) {
    OCCwrapJavaJNI.BOPDS_Pave_Contents(swigCPtr, this, theIndex, theParameter);
  }

  /**
   *  Query
   *  Returns true if thr parameter od this is less
   *  than the parameter of  <theOther>
   */
  public long IsLess( BOPDS_Pave  theOther) {
    return OCCwrapJavaJNI.BOPDS_Pave_IsLess(swigCPtr, this, BOPDS_Pave.getCPtr(theOther), theOther);
  }

  /**
   *  Query
   *  Returns true if thr parameter od this is equal
   *  to the parameter of  <theOther>
   */
  public long IsEqual( BOPDS_Pave  theOther) {
    return OCCwrapJavaJNI.BOPDS_Pave_IsEqual(swigCPtr, this, BOPDS_Pave.getCPtr(theOther), theOther);
  }

  public void Dump() {
    OCCwrapJavaJNI.BOPDS_Pave_Dump(swigCPtr, this);
  }

}
