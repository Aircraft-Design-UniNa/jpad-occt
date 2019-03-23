package opencascade;

/**
 *  Working on heterogeneous platforms
 *  we need to use the system call gettimeofday.
 *  This function is portable and it measures ELAPSED
 *  time and CPU time in seconds and microseconds.
 *  Example: OSD_Timer aTimer;
 *  aTimer.Start();   // Start  the timers (t1).
 *  .....            // Do something.
 *  aTimer.Stop();    // Stop the timers (t2).
 *  aTimer.Show();    // Give the elapsed time between t1 and t2.
 *  // Give also the process CPU time between
 *  // t1 and t2.
 */
public class OSD_Timer extends OSD_Chronometer {
  private long swigCPtr;
  OSD_Timer(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.OSD_Timer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn);
  }

  OSD_Timer(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.OSD_Timer_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
    //super(cPtr, cMemoryOwn, Parent);
  }

  static long getCPtr(OSD_Timer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object
  // requiring explicit decision to use it either as a reference or as a copy
  /*public class CRef {
    public CRef (OSD_Timer ptr) { Ptr = ptr; }
    public OSD_Timer AsReference () { return Ptr; }
    public OSD_Timer AsCopy () { return Ptr.MakeCopy(); }
    public OSD_Timer Ptr;
  }*/ 
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_OSD_Timer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Builds a Chronometer initialized and stopped.
   *  @param theThisThreadOnly when TRUE, measured CPU time will account time of the current thread only;
   *                           otherwise CPU of the process (all threads, and completed children) is measured;
   *                           this flag does NOT affect ElapsedTime() value, only values returned by OSD_Chronometer
   */
  public OSD_Timer(long theThisThreadOnly) {
    this(OCCwrapJavaJNI.new_OSD_Timer__SWIG_0(theThisThreadOnly), true);
  }

  public OSD_Timer() {
    this(OCCwrapJavaJNI.new_OSD_Timer__SWIG_1(), true);
  }

  /**
   *  Stops and reinitializes the timer with specified elapsed time.
   */
  public void Reset(double theTimeElapsedSec) {
    OCCwrapJavaJNI.OSD_Timer_Reset__SWIG_0(swigCPtr, this, theTimeElapsedSec);
  }

  /**
   *  Stops and reinitializes the timer with zero elapsed time.
   */
  public void Reset() {
    OCCwrapJavaJNI.OSD_Timer_Reset__SWIG_1(swigCPtr, this);
  }

  /**
   *  Shows both the elapsed time and CPU time on the standard output
   *  stream <cout>.The chronometer can be running (Lap Time) or
   *  stopped.
   */
  public void Show() {
    OCCwrapJavaJNI.OSD_Timer_Show__SWIG_0(swigCPtr, this);
  }

  /**
   *  Shows both the elapsed time and CPU  time on the
   *  output stream <OS>.
   */
  public void Show(SWIGTYPE_p_Standard_OStream os) {
    OCCwrapJavaJNI.OSD_Timer_Show__SWIG_1(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(os));
  }

  /**
   *  returns both the elapsed time(seconds,minutes,hours)
   *  and CPU  time.
   */
  public void Show(double[] theSeconds, int[] theMinutes, int[] theHours, double[] theCPUtime) {
    OCCwrapJavaJNI.OSD_Timer_Show__SWIG_2(swigCPtr, this, theSeconds, theMinutes, theHours, theCPUtime);
  }

  /**
   *  Returns elapsed time in seconds.
   */
  public double ElapsedTime() {
    return OCCwrapJavaJNI.OSD_Timer_ElapsedTime(swigCPtr, this);
  }

}
