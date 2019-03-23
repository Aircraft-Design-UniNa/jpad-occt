package opencascade;

public class NCollection_BaseAllocator extends Standard_Transient {
  NCollection_BaseAllocator(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public  long  Allocate(long size) { return OCCwrapJavaJNI.NCollection_BaseAllocator_Allocate(swigCPtr, this, size); }

  public void Free( long  anAddress) {
    OCCwrapJavaJNI.NCollection_BaseAllocator_Free(swigCPtr, this,  anAddress );
  }

  public static  NCollection_BaseAllocator  CommonBaseAllocator() {
    return new NCollection_BaseAllocator ( OCCwrapJavaJNI.NCollection_BaseAllocator_CommonBaseAllocator(), true );
  }

  public static void StandardCallBack(long theIsAlloc,  long  theStorage, long theRoundSize, long theSize) {
    OCCwrapJavaJNI.NCollection_BaseAllocator_StandardCallBack(theIsAlloc,  theStorage , theRoundSize, theSize);
  }

  /**
   *  Prints memory usage statistics cumulated by StandardCallBack
   */
  public static void PrintMemUsageStatistics() {
    OCCwrapJavaJNI.NCollection_BaseAllocator_PrintMemUsageStatistics();
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.NCollection_BaseAllocator_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.NCollection_BaseAllocator_get_type_descriptor(), true );
  }

  public static  NCollection_BaseAllocator  DownCast( Standard_Transient  T) {
    return new NCollection_BaseAllocator ( OCCwrapJavaJNI.NCollection_BaseAllocator_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.NCollection_BaseAllocator_TypeOf(), true );
  }

}
