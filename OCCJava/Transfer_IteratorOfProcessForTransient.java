package opencascade;

public class Transfer_IteratorOfProcessForTransient extends Transfer_TransferIterator {

  private long swigCPtr;
  Transfer_IteratorOfProcessForTransient(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.Transfer_IteratorOfProcessForTransient_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  Transfer_IteratorOfProcessForTransient(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.Transfer_IteratorOfProcessForTransient_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(Transfer_IteratorOfProcessForTransient obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Transfer_IteratorOfProcessForTransient(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Creates an empty Iterator
   *  if withstarts is True, each Binder to be iterated will
   *  be associated to its corresponding Starting Object
   */
  public Transfer_IteratorOfProcessForTransient(long withstarts) {
    this(OCCwrapJavaJNI.new_Transfer_IteratorOfProcessForTransient(withstarts), true);
  }

  /**
   *  Adds a Binder to the iteration list (construction)
   *  with no corresponding Starting Object
   *  (note that Result is brought by Binder)
   */
  public void Add( Transfer_Binder  binder) {
    OCCwrapJavaJNI.Transfer_IteratorOfProcessForTransient_Add__SWIG_0(swigCPtr, this,  Transfer_Binder.getCPtr(binder) , binder);
  }

  /**
   *  Adds a Binder to the iteration list, associated with
   *  its corresponding Starting Object "start"
   *  Starting Object is ignored if not required at
   *  Creation time
   */
  public void Add( Transfer_Binder  binder,  Standard_Transient  start) {
    OCCwrapJavaJNI.Transfer_IteratorOfProcessForTransient_Add__SWIG_1(swigCPtr, this,  Transfer_Binder.getCPtr(binder) , binder,  Standard_Transient.getCPtr(start) , start);
  }

  /**
   *  After having added all items, keeps or rejects items
   *  which are attached to starting data given by <only>
   *  <keep> = True (D) : keeps. <keep> = False : rejects
   *  Does nothing if <withstarts> was False
   */
  public void Filter( TColStd_HSequenceOfTransient  list, long keep) {
    OCCwrapJavaJNI.Transfer_IteratorOfProcessForTransient_Filter__SWIG_0(swigCPtr, this,  TColStd_HSequenceOfTransient.getCPtr(list) , list, keep);
  }

  public void Filter( TColStd_HSequenceOfTransient  list) {
    OCCwrapJavaJNI.Transfer_IteratorOfProcessForTransient_Filter__SWIG_1(swigCPtr, this,  TColStd_HSequenceOfTransient.getCPtr(list) , list);
  }

  /**
   *  Returns True if Starting Object is available
   *  (defined at Creation Time)
   */
  public long HasStarting() {
    return OCCwrapJavaJNI.Transfer_IteratorOfProcessForTransient_HasStarting(swigCPtr, this);
  }

  public  Standard_Transient  Starting() {
    return new Standard_Transient ( OCCwrapJavaJNI.Transfer_IteratorOfProcessForTransient_Starting(swigCPtr, this), true );
  }

}
