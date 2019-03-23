package opencascade;

/**
 *  NCollection allocator with managed memory alignment capabilities.
 */
public class NCollection_AlignedAllocator extends NCollection_BaseAllocator {
  NCollection_AlignedAllocator(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Constructor. The alignment should be specified explicitly:
   *  16 bytes for SSE instructions
   *  32 bytes for AVX instructions
   */
  public NCollection_AlignedAllocator(long theAlignment) {
    this(OCCwrapJavaJNI.new_NCollection_AlignedAllocator(theAlignment), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.NCollection_AlignedAllocator_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.NCollection_AlignedAllocator_get_type_descriptor(), true );
  }

  public static  NCollection_AlignedAllocator  DownCast( Standard_Transient  T) {
    return new NCollection_AlignedAllocator ( OCCwrapJavaJNI.NCollection_AlignedAllocator_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.NCollection_AlignedAllocator_TypeOf(), true );
  }

}
