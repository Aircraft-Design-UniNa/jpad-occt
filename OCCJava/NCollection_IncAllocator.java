package opencascade;

public class NCollection_IncAllocator extends NCollection_BaseAllocator {
  NCollection_IncAllocator(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Constructor
   */
  public NCollection_IncAllocator(long theBlockSize) {
    this(OCCwrapJavaJNI.new_NCollection_IncAllocator__SWIG_0(theBlockSize), true);
  }

  /**
   *  Destructor (calls Clean() internally)
   */
  public NCollection_IncAllocator() {
    this(OCCwrapJavaJNI.new_NCollection_IncAllocator__SWIG_1(), true);
  }

  /**
   *  Diagnostic method, returns the total allocated size
   */
  public long GetMemSize() {
    return OCCwrapJavaJNI.NCollection_IncAllocator_GetMemSize(swigCPtr, this);
  }

  /**
   *  Reallocation: it is always allowed but is only efficient with the
   *  last allocated item
   */
  public  long  Reallocate( long  anAddress, long oldSize, long newSize) { return OCCwrapJavaJNI.NCollection_IncAllocator_Reallocate(swigCPtr, this,  anAddress , oldSize, newSize); }

  /**
   *  Re-initialize the allocator so that the next Allocate call should
   *  start allocating in the very begining as though the allocator is just
   *  constructed. Warning: make sure that all previously allocated data are
   *  no more used in your code!
   *  @param doReleaseMem
   *    True - release all previously allocated memory, False - preserve it
   *    for future allocations.
   */
  public void Reset(long doReleaseMem) {
    OCCwrapJavaJNI.NCollection_IncAllocator_Reset__SWIG_0(swigCPtr, this, doReleaseMem);
  }

  public void Reset() {
    OCCwrapJavaJNI.NCollection_IncAllocator_Reset__SWIG_1(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.NCollection_IncAllocator_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.NCollection_IncAllocator_get_type_descriptor(), true );
  }

  public static  NCollection_IncAllocator  DownCast( Standard_Transient  T) {
    return new NCollection_IncAllocator ( OCCwrapJavaJNI.NCollection_IncAllocator_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.NCollection_IncAllocator_TypeOf(), true );
  }

  public final static long DefaultBlockSize = OCCwrapJavaJNI.NCollection_IncAllocator_DefaultBlockSize_get();
}
