package opencascade;

/**
 *  This class measures CPU time (both user and system) consumed
 *  by current process or thread. The chronometer can be started
 *  and stopped multiple times, and measures cumulative time.
 * 
 *  If only the thread is measured, calls to Stop() and Show()
 *  must occur from the same thread where Start() was called
 *  (unless chronometer is stopped); otherwise measurement will
 *  yield false values.
 */
public class OSD_Chronometer {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  OSD_Chronometer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  OSD_Chronometer(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(OSD_Chronometer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (OSD_Chronometer ptr) { Ptr = ptr; }
    public OSD_Chronometer AsReference () { return Ptr; }
    public OSD_Chronometer AsCopy () { return Ptr.MakeCopy(); }
    public OSD_Chronometer Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_OSD_Chronometer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Initializes a stopped Chronometer.
   * 
   *  If ThisThreadOnly is True, measured CPU time will account
   *  time of the current thread only; otherwise CPU of the
   *  process (all threads, and completed children) is measured.
   */
  public OSD_Chronometer(long theThisThreadOnly) {
    this(OCCwrapJavaJNI.new_OSD_Chronometer__SWIG_0(theThisThreadOnly), true);
  }

  /**
   *  Destructor.
   */
  public OSD_Chronometer() {
    this(OCCwrapJavaJNI.new_OSD_Chronometer__SWIG_1(), true);
  }

  /**
   *  Return true if timer has been started.
   */
  public long IsStarted() {
    return OCCwrapJavaJNI.OSD_Chronometer_IsStarted(swigCPtr, this);
  }

  /**
   *  Stops and Reinitializes the Chronometer.
   */
  public void Reset() {
    OCCwrapJavaJNI.OSD_Chronometer_Reset(swigCPtr, this);
  }

  /**
   *  Restarts the Chronometer.
   */
  public void Restart() {
    OCCwrapJavaJNI.OSD_Chronometer_Restart(swigCPtr, this);
  }

  /**
   *  Stops the Chronometer.
   */
  public void Stop() {
    OCCwrapJavaJNI.OSD_Chronometer_Stop(swigCPtr, this);
  }

  /**
   *  Starts (after Create or Reset) or restarts (after Stop)
   *  the chronometer.
   */
  public void Start() {
    OCCwrapJavaJNI.OSD_Chronometer_Start(swigCPtr, this);
  }

  /**
   *  Shows the current CPU user and system time on the
   *  standard output stream <cout>.
   *  The chronometer can be running (laps Time) or stopped.
   */
  public void Show() {
    OCCwrapJavaJNI.OSD_Chronometer_Show__SWIG_0(swigCPtr, this);
  }

  /**
   *  Shows the current CPU user and system time on the output
   *  stream <os>.
   *  The chronometer can be running (laps Time) or stopped.
   */
  public void Show(SWIGTYPE_p_Standard_OStream theOStream) {
    OCCwrapJavaJNI.OSD_Chronometer_Show__SWIG_1(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(theOStream));
  }

  /**
   *  Returns the current CPU user time in seconds.
   *  The chronometer can be running (laps Time) or stopped.
   */
  public double UserTimeCPU() {
    return OCCwrapJavaJNI.OSD_Chronometer_UserTimeCPU(swigCPtr, this);
  }

  /**
   *  Returns the current CPU system time in seconds.
   *  The chronometer can be running (laps Time) or stopped.
   */
  public double SystemTimeCPU() {
    return OCCwrapJavaJNI.OSD_Chronometer_SystemTimeCPU(swigCPtr, this);
  }

  public void Show(double[] theUserSeconds) {
    OCCwrapJavaJNI.OSD_Chronometer_Show__SWIG_2(swigCPtr, this, theUserSeconds);
  }

  public void Show(double[] theUserSec, double[] theSystemSec) {
    OCCwrapJavaJNI.OSD_Chronometer_Show__SWIG_3(swigCPtr, this, theUserSec, theSystemSec);
  }

  /**
   *  Returns CPU time (user and system) consumed by the current
   *  process since its start, in seconds. The actual precision of
   *  the measurement depends on granularity provided by the system,
   *  and is platform-specific.
   */
  public static void GetProcessCPU(double[] UserSeconds, double[] SystemSeconds) {
    OCCwrapJavaJNI.OSD_Chronometer_GetProcessCPU(UserSeconds, SystemSeconds);
  }

  /**
   *  Returns CPU time (user and system) consumed by the current
   *  thread since its start. Note that this measurement is
   *  platform-specific, as threads are implemented and managed
   *  differently on different platforms and CPUs.
   */
  public static void GetThreadCPU(double[] UserSeconds, double[] SystemSeconds) {
    OCCwrapJavaJNI.OSD_Chronometer_GetThreadCPU(UserSeconds, SystemSeconds);
  }

}
