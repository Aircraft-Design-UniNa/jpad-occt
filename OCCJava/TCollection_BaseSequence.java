package opencascade;

/**
 *  Definition of a base class for all instanciations
 *  of sequence.
 * 
 *  The methods : Clear, Remove accepts a pointer to a
 *  function  to use  to delete the  nodes. This allow
 *  proper    call of  the  destructor  on  the Items.
 *  Without adding a  virtual function pointer to each
 *  node or each sequence.
 */
public class TCollection_BaseSequence {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TCollection_BaseSequence(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TCollection_BaseSequence(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TCollection_BaseSequence obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TCollection_BaseSequence(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  returns True if the sequence <me> contains no elements.
   */
  public long IsEmpty() {
    return OCCwrapJavaJNI.TCollection_BaseSequence_IsEmpty(swigCPtr, this);
  }

  /**
   *  Returns  the  number  of element(s) in the
   *  sequence.  Returns zero if the sequence is empty.
   */
  public int Length() {
    return OCCwrapJavaJNI.TCollection_BaseSequence_Length(swigCPtr, this);
  }

  /**
   *  Reverses the order of items on <me>.
   *  Example:
   *  before
   *  me = (A B C)
   *  after
   *  me = (C B A)
   */
  public void Reverse() {
    OCCwrapJavaJNI.TCollection_BaseSequence_Reverse(swigCPtr, this);
  }

  /**
   *  Swaps  elements  which    are  located  at
   *  positions <I> and <J> in <me>.
   *  Raises an exception if I or J is out of bound.
   *  Example:
   *  before
   *  me = (A B C), I = 1, J = 3
   *  after
   *  me = (C B A)
   */
  public void Exchange(int I, int J) {
    OCCwrapJavaJNI.TCollection_BaseSequence_Exchange(swigCPtr, this, I, J);
  }

}
