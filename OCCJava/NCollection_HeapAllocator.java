package opencascade;

public class NCollection_HeapAllocator extends NCollection_BaseAllocator {
  NCollection_HeapAllocator(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static  NCollection_HeapAllocator  GlobalHeapAllocator() {
    return new NCollection_HeapAllocator ( OCCwrapJavaJNI.NCollection_HeapAllocator_GlobalHeapAllocator(), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.NCollection_HeapAllocator_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.NCollection_HeapAllocator_get_type_descriptor(), true );
  }

  public static  NCollection_HeapAllocator  DownCast( Standard_Transient  T) {
    return new NCollection_HeapAllocator ( OCCwrapJavaJNI.NCollection_HeapAllocator_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.NCollection_HeapAllocator_TypeOf(), true );
  }

}
