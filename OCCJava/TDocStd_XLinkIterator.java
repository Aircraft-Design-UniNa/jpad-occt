package opencascade;

/**
 *  Iterates on Reference attributes.
 *  This is an iterator giving all the external references
 *  of a Document.
 */
public class TDocStd_XLinkIterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDocStd_XLinkIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDocStd_XLinkIterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDocStd_XLinkIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDocStd_XLinkIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Returns an empty iterator;
   */
  public TDocStd_XLinkIterator() {
    this(OCCwrapJavaJNI.new_TDocStd_XLinkIterator__SWIG_0(), true);
  }

  /**
   *  Creates an iterator on Reference of <D>.
   */
  public TDocStd_XLinkIterator( TDocStd_Document  D) {
    this(OCCwrapJavaJNI.new_TDocStd_XLinkIterator__SWIG_1( TDocStd_Document.getCPtr(D) , D), true);
  }

  /**
   *  Restarts an iteration with <D>.
   */
  public void Initialize( TDocStd_Document  D) {
    OCCwrapJavaJNI.TDocStd_XLinkIterator_Initialize(swigCPtr, this,  TDocStd_Document.getCPtr(D) , D);
  }

  /**
   *  Returns True if there is a current Item in the
   *  iteration.
   */
  public long More() {
    return OCCwrapJavaJNI.TDocStd_XLinkIterator_More(swigCPtr, this);
  }

  /**
   *  Move to the next item; raises if there is no more item.
   */
  public void Next() {
    OCCwrapJavaJNI.TDocStd_XLinkIterator_Next(swigCPtr, this);
  }

  /**
   *  Returns the current item; a null handle if there is none.
   */
  public TDocStd_XLink Value() {
    long cPtr = OCCwrapJavaJNI.TDocStd_XLinkIterator_Value(swigCPtr, this);
    return (cPtr == 0) ? null : new TDocStd_XLink(cPtr, false);
  }

}
