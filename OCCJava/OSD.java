package opencascade;

/**
 *  Set of Operating Sytem Dependent Tools
 *  (O)perating (S)ystem (D)ependent
 */
public class OSD {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  OSD(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  OSD(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(OSD obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_OSD(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Sets signal and exception handlers.
   * 
   *  ### Windows-specific notes
   * 
   *  Compiled with MS VC++ sets 3 main handlers:
   *  @li Signal handlers (via ::signal() functions) that translate system signals
   *  (SIGSEGV, SIGFPE, SIGILL) into C++ exceptions (classes inheriting
   *  Standard_Failure). They only be called if user calls ::raise() function
   *  with one of supported signal type set.
   *  @li Exception handler OSD::WntHandler() (via ::SetUnhandledExceptionFilter())
   *  that will be used when user's code is compiled with /EHs option.
   *  @li Structured exception (SE) translator (via _set_se_translator()) that
   *  translates SE exceptions (aka asynchronous exceptions) into the
   *  C++ exceptions inheriting Standard_Failure. This translator will be
   *  used when user's code is compiled with /EHa option.
   * 
   *  This approach ensures that regardless of the option the user chooses to
   *  compile his code with (/EHs or /EHa), signals (or SE exceptions) will be
   *  translated into Open CASCADE C++ exceptions.
   * 
   *  If @a theFloatingSignal is TRUE then floating point exceptions will be
   *  generated in accordance with the mask
   *  <tt>_EM_INVALID | _EM_DENORMAL | _EM_ZERODIVIDE | _EM_OVERFLOW</tt> that is
   *  used to call ::_controlfp() system function. If @a theFloatingSignal is FALSE
   *  corresponding operations (e.g. division by zero) will gracefully complete
   *  without an exception.
   * 
   *  ### Unix-specific notes
   * 
   *  OSD::SetSignal() sets handlers (via ::sigaction()) for multiple signals
   *  (SIGFPE, SIGSEGV, etc). Currently the number of handled signals is much
   *  greater than for Windows, in the future this may change to provide better
   *  consistency with Windows.
   * 
   *  @a theFloatingSignal is recognized on Sun Solaris, Linux, and SGI Irix to
   *  generate floating-point exception according to the mask
   *  <tt>FE_INVALID | FE_DIVBYZERO | FE_OVERFLOW</tt> (in Linux conventions).
   *  When compiled with OBJS macro defined, already set signal handlers (e.g.
   *  by Data Base Managers) are not redefined.
   * 
   *  ### Common notes
   * 
   *  If OSD::SetSignal() method is used in at least one thread, it must also be
   *  called in any other thread where Open CASCADE will be used, to ensure
   *  consistency of behavior. Its @a aFloatingSignal argument must be consistent
   *  across threads.
   * 
   *  Keep in mind that whether the C++ exception will really be thrown (i.e.
   *  ::throw() will be called) is regulated by the
   *  OCC_CONVERT_SIGNALS macro used during compilation of Open CASCADE and
   *  user's code. Refer to Foundation Classes User's Guide for further details.
   * 
   */
  public static void SetSignal(long theFloatingSignal) {
    OCCwrapJavaJNI.OSD_SetSignal__SWIG_0(theFloatingSignal);
  }

  public static void SetSignal() {
    OCCwrapJavaJNI.OSD_SetSignal__SWIG_1();
  }

  /**
   *  Commands the process to sleep for a number of seconds.
   */
  public static void SecSleep(int aDelay) {
    OCCwrapJavaJNI.OSD_SecSleep(aDelay);
  }

  /**
   *  Commands the process to sleep for a number of milliseconds
   */
  public static void MilliSecSleep(int aDelay) {
    OCCwrapJavaJNI.OSD_MilliSecSleep(aDelay);
  }

  /**
   *  Converts aCstring representing a real with a period as
   *  decimal point, no thousand separator and no grouping of digits
   *  into aReal .
   *  The conversion is independant from the current locale.
   */
  public static long CStringToReal(String aString, double[] aReal) {
    return OCCwrapJavaJNI.OSD_CStringToReal(aString, aReal);
  }

  /**
   *  since Windows NT does not support 'SIGINT' signal like UNIX,
   *  then this method checks whether Ctrl-Break keystroke was or
   *  not. If yes then raises Exception_CTRL_BREAK.
   */
  public static void ControlBreak() {
    OCCwrapJavaJNI.OSD_ControlBreak();
  }

  public OSD() {
    this(OCCwrapJavaJNI.new_OSD(), true);
  }

}
