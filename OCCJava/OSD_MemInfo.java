package opencascade;

/**
 *  This class provide information about memory utilized by current process.
 *  This information includes:
 *   - Private Memory - synthetic value that tries to filter out the memory
 *                      usage only by the process itself (allocated for data
 *                      and stack), excluding dynamic libraries.
 *                      These pages may be in RAM or in SWAP.
 *   - Virtual Memory - amount of reserved and committed memory in the
 *                      user-mode portion of the virtual address space.
 *                      Notice that this counter includes reserved memory
 *                      (not yet in used) and shared between processes memory (libraries).
 *   - Working Set    - set of memory pages in the virtual address space of the process
 *                      that are currently resident in physical memory (RAM).
 *                      These pages are available for an application to use
 *                      without triggering a page fault.
 *   - Pagefile Usage - space allocated for the pagefile, in bytes.
 *                      Those pages may or may not be in memory (RAM)
 *                      thus this counter couldn't be used to estimate
 *                      how many active pages doesn't present in RAM.
 * 
 *  Notice that none of these counters can be used as absolute measure of
 *  application memory consumption!
 * 
 *  User should analyze all values in specific case to make correct decision
 *  about memory (over)usage. This is also prefferred to use specialized
 *  tools to detect memory leaks.
 * 
 *  This also means that these values should not be used for intellectual
 *  memory management by application itself.
 */
public class OSD_MemInfo {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  OSD_MemInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  OSD_MemInfo(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(OSD_MemInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (OSD_MemInfo ptr) { Ptr = ptr; }
    public OSD_MemInfo AsReference () { return Ptr; }
    public OSD_MemInfo AsCopy () { return Ptr.MakeCopy(); }
    public OSD_MemInfo Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_OSD_MemInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Create and initialize
   */
  public OSD_MemInfo() {
    this(OCCwrapJavaJNI.new_OSD_MemInfo(), true);
  }

  /**
   *  Update counters
   */
  public void Update() {
    OCCwrapJavaJNI.OSD_MemInfo_Update(swigCPtr, this);
  }

  public TCollection_AsciiString CountersToString() {
    return new TCollection_AsciiString(OCCwrapJavaJNI.OSD_MemInfo_CountersToString(swigCPtr, this), true);
  }

  /**
   *  Return value or specified counter in bytes.
   *  Notice that NOT all counters are available on various systems.
   *  Standard_Size(-1) means invalid (unavailable) value.
   */
  public long Value(OSD_MemInfo.Counter theCounter) {
    return OCCwrapJavaJNI.OSD_MemInfo_Value(swigCPtr, this, theCounter.swigValue());
  }

  /**
   *  Return value or specified counter in MiB.
   *  Notice that NOT all counters are available on various systems.
   *  Standard_Size(-1) means invalid (unavailable) value.
   */
  public long ValueMiB(OSD_MemInfo.Counter theCounter) {
    return OCCwrapJavaJNI.OSD_MemInfo_ValueMiB(swigCPtr, this, theCounter.swigValue());
  }

  /**
   *  Return the string representation for all available counter.
   */
  public static TCollection_AsciiString PrintInfo() {
    return new TCollection_AsciiString(OCCwrapJavaJNI.OSD_MemInfo_PrintInfo(), true);
  }

  public enum Counter {
    MemPrivate(OCCwrapJavaJNI.OSD_MemInfo_MemPrivate_get()),
    MemVirtual,
    MemWorkingSet,
    MemWorkingSetPeak,
    MemSwapUsage,
    MemSwapUsagePeak,
    MemHeapUsage,
    MemCounter_NB;

    public final int swigValue() {
      return swigValue;
    }

    public static Counter swigToEnum(int swigValue) {
      Counter[] swigValues = Counter.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Counter swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Counter.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Counter() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Counter(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Counter(Counter swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
