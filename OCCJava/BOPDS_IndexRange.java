package opencascade;

/**
 *  The class BOPDS_IndexRange is to store
 *  the information about range of two indices
 */
public class BOPDS_IndexRange {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BOPDS_IndexRange(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BOPDS_IndexRange(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BOPDS_IndexRange obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPDS_IndexRange(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty contructor
   */
  public BOPDS_IndexRange() {
    this(OCCwrapJavaJNI.new_BOPDS_IndexRange(), true);
  }

  /**
   *  Modifier
   *  Sets the first index <theI1>  of the range
   */
  public void SetFirst(int theI1) {
    OCCwrapJavaJNI.BOPDS_IndexRange_SetFirst(swigCPtr, this, theI1);
  }

  /**
   *  Modifier
   *  Sets the second index <theI2>  of the range
   */
  public void SetLast(int theI2) {
    OCCwrapJavaJNI.BOPDS_IndexRange_SetLast(swigCPtr, this, theI2);
  }

  /**
   *  Selector
   *  Returns the first index of the range
   */
  public int First() {
    return OCCwrapJavaJNI.BOPDS_IndexRange_First(swigCPtr, this);
  }

  /**
   *  Selector
   *  Returns the second index of the range
   */
  public int Last() {
    return OCCwrapJavaJNI.BOPDS_IndexRange_Last(swigCPtr, this);
  }

  /**
   *  Modifier
   *  Sets the first index of the range  <theI1>
   *  Sets the second index of the range <theI2>
   */
  public void SetIndices(int theI1, int theI2) {
    OCCwrapJavaJNI.BOPDS_IndexRange_SetIndices(swigCPtr, this, theI1, theI2);
  }

  /**
   *  Selector
   *  Returns the first index of the range  <theI1>
   *  Returns the second index of the range <theI2>
   */
  public void Indices(int[] theI1, int[] theI2) {
    OCCwrapJavaJNI.BOPDS_IndexRange_Indices(swigCPtr, this, theI1, theI2);
  }

  /**
   *  Query
   *  Returns true if the range contains <theIndex>
   */
  public long Contains(int theIndex) {
    return OCCwrapJavaJNI.BOPDS_IndexRange_Contains(swigCPtr, this, theIndex);
  }

  public void Dump() {
    OCCwrapJavaJNI.BOPDS_IndexRange_Dump(swigCPtr, this);
  }

}
