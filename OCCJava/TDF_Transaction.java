package opencascade;

/**
 *  This class offers services to open, commit or
 *  abort a transaction in a more secure way than
 *  using Data from TDF. If you forget to close a
 *  transaction, it will be automaticaly aborted at
 *  the destruction of this object, at the closure of
 *  its scope.
 * 
 *  In case of catching errors, the effect will be the
 *  same: aborting transactions until the good current
 *  one.
 */
public class TDF_Transaction {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TDF_Transaction(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TDF_Transaction(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TDF_Transaction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TDF_Transaction(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an empty transaction context, unable to be
   *  opened.
   */
  public TDF_Transaction( TCollection_AsciiString  aName) {
    this(OCCwrapJavaJNI.new_TDF_Transaction__SWIG_0(TCollection_AsciiString.getCPtr(aName), aName), true);
  }

  /**
   *  Creates a transaction context on <aDF>, ready to
   *  be opened.
   */
  public TDF_Transaction() {
    this(OCCwrapJavaJNI.new_TDF_Transaction__SWIG_1(), true);
  }

  public TDF_Transaction( TDF_Data  aDF,  TCollection_AsciiString  aName) {
    this(OCCwrapJavaJNI.new_TDF_Transaction__SWIG_2( TDF_Data.getCPtr(aDF) , aDF, TCollection_AsciiString.getCPtr(aName), aName), true);
  }

  /**
   *  Private to avoid copy.
   */
  public TDF_Transaction( TDF_Data  aDF) {
    this(OCCwrapJavaJNI.new_TDF_Transaction__SWIG_3( TDF_Data.getCPtr(aDF) , aDF), true);
  }

  /**
   *  Aborts all the transactions on <myDF> and sets
   *  <aDF> to build a transaction context on <aDF>,
   *  ready to be opened.
   */
  public void Initialize( TDF_Data  aDF) {
    OCCwrapJavaJNI.TDF_Transaction_Initialize(swigCPtr, this,  TDF_Data.getCPtr(aDF) , aDF);
  }

  /**
   *  If not yet done, opens a new transaction on
   *  <myDF>. Returns the index of the just opened
   *  transaction.
   * 
   *  It raises DomainError if the transaction is
   *  already open, and NullObject if there is no
   *  current Data framework.
   */
  public int Open() {
    return OCCwrapJavaJNI.TDF_Transaction_Open(swigCPtr, this);
  }

  public  TDF_Delta  Commit(long withDelta) {
    return new TDF_Delta ( OCCwrapJavaJNI.TDF_Transaction_Commit__SWIG_0(swigCPtr, this, withDelta), true );
  }

  public  TDF_Delta  Commit() {
    return new TDF_Delta ( OCCwrapJavaJNI.TDF_Transaction_Commit__SWIG_1(swigCPtr, this), true );
  }

  /**
   *  Aborts the transactions until AND including the
   *  current opened one.
   */
  public void Abort() {
    OCCwrapJavaJNI.TDF_Transaction_Abort(swigCPtr, this);
  }

  public  TDF_Data  Data() {
    return new TDF_Data ( OCCwrapJavaJNI.TDF_Transaction_Data(swigCPtr, this), true );
  }

  /**
   *  Returns the number of the transaction opened by <me>.
   */
  public int Transaction() {
    return OCCwrapJavaJNI.TDF_Transaction_Transaction(swigCPtr, this);
  }

  /**
   *  Returns the transaction name.
   */
  public  TCollection_AsciiString  Name() {
    TCollection_AsciiString ret = new TCollection_AsciiString(OCCwrapJavaJNI.TDF_Transaction_Name(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns true if the transaction is open.
   */
  public long IsOpen() {
    return OCCwrapJavaJNI.TDF_Transaction_IsOpen(swigCPtr, this);
  }

}
