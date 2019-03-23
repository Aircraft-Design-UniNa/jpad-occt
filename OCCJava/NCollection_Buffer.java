package opencascade;

/**
 *  Low-level buffer object.
 */
public class NCollection_Buffer extends Standard_Transient {
  NCollection_Buffer(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Default constructor.
   *  When theData is NULL but theSize is not 0 than buffer of specified size will be allocated.
   *  @param theAlloc memory allocator
   *  @param theSize  buffer size
   *  @param theData  buffer data allocated by theAlloc
   */
  public NCollection_Buffer( NCollection_BaseAllocator  theAlloc, long theSize, SWIGTYPE_p_unsigned_char theData) {
    this(OCCwrapJavaJNI.new_NCollection_Buffer__SWIG_0( NCollection_BaseAllocator.getCPtr(theAlloc) , theAlloc, theSize, SWIGTYPE_p_unsigned_char.getCPtr(theData)), true);
  }

  /**
   *  Destructor.
   */
  public NCollection_Buffer( NCollection_BaseAllocator  theAlloc, long theSize) {
    this(OCCwrapJavaJNI.new_NCollection_Buffer__SWIG_1( NCollection_BaseAllocator.getCPtr(theAlloc) , theAlloc, theSize), true);
  }

  public NCollection_Buffer( NCollection_BaseAllocator  theAlloc) {
    this(OCCwrapJavaJNI.new_NCollection_Buffer__SWIG_2( NCollection_BaseAllocator.getCPtr(theAlloc) , theAlloc), true);
  }

  /**
   *  @return buffer data
   */
  public SWIGTYPE_p_unsigned_char Data() {
    long cPtr = OCCwrapJavaJNI.NCollection_Buffer_Data(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  /**
   *  @return buffer data
   */
  public SWIGTYPE_p_unsigned_char ChangeData() {
    long cPtr = OCCwrapJavaJNI.NCollection_Buffer_ChangeData(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  /**
   *  @return true if buffer is not allocated
   */
  public boolean IsEmpty() {
    return OCCwrapJavaJNI.NCollection_Buffer_IsEmpty(swigCPtr, this);
  }

  /**
   *  Return buffer length in bytes.
   */
  public long Size() {
    return OCCwrapJavaJNI.NCollection_Buffer_Size(swigCPtr, this);
  }

  public  NCollection_BaseAllocator  Allocator() {
    return new NCollection_BaseAllocator ( OCCwrapJavaJNI.NCollection_Buffer_Allocator(swigCPtr, this), true );
  }

  /**
   *  Assign new buffer allocator with de-allocation of buffer.
   */
  public void SetAllocator( NCollection_BaseAllocator  theAlloc) {
    OCCwrapJavaJNI.NCollection_Buffer_SetAllocator(swigCPtr, this,  NCollection_BaseAllocator.getCPtr(theAlloc) , theAlloc);
  }

  public boolean Allocate(long theSize) {
    return OCCwrapJavaJNI.NCollection_Buffer_Allocate(swigCPtr, this, theSize);
  }

  public void Free() {
    OCCwrapJavaJNI.NCollection_Buffer_Free(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.NCollection_Buffer_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.NCollection_Buffer_get_type_descriptor(), true );
  }

  public static  NCollection_Buffer  DownCast( Standard_Transient  T) {
    return new NCollection_Buffer ( OCCwrapJavaJNI.NCollection_Buffer_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.NCollection_Buffer_TypeOf(), true );
  }

}
