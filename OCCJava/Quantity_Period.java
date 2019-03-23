package opencascade;

/**
 *  Manages date intervals. For example, a Period object
 *  gives the interval between two dates.
 *  A period is expressed in seconds and microseconds.
 */
public class Quantity_Period {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Quantity_Period(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Quantity_Period(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Quantity_Period obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (Quantity_Period ptr) { Ptr = ptr; }
    public Quantity_Period AsReference () { return Ptr; }
    public Quantity_Period AsCopy () { return Ptr.MakeCopy(); }
    public Quantity_Period Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Quantity_Period(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a Period
   *  With:      0 <= dd
   *  0 <= hh
   *  0 <= mn
   *  0 <= ss
   *  0 <= mis
   *  0 <= mics
   */
  public Quantity_Period(int dd, int hh, int mn, int ss, int mis, int mics) {
    this(OCCwrapJavaJNI.new_Quantity_Period__SWIG_0(dd, hh, mn, ss, mis, mics), true);
  }

  /**
   *  Creates a Period with a number of seconds and microseconds.
   *  Exceptions
   *  Quantity_PeriodDefinitionError:
   *  -   if the number of seconds expressed either by:
   *  -   dd days, hh hours, mn minutes and ss seconds, or
   *  -   Ss
   *  is less than 0.
   *  -   if the number of microseconds expressed either by:
   *  -   mis milliseconds and mics microseconds, or
   *  -   Mics
   *  is less than 0.
   */
  public Quantity_Period(int dd, int hh, int mn, int ss, int mis) {
    this(OCCwrapJavaJNI.new_Quantity_Period__SWIG_1(dd, hh, mn, ss, mis), true);
  }

  public Quantity_Period(int dd, int hh, int mn, int ss) {
    this(OCCwrapJavaJNI.new_Quantity_Period__SWIG_2(dd, hh, mn, ss), true);
  }

  public Quantity_Period(int ss, int mics) {
    this(OCCwrapJavaJNI.new_Quantity_Period__SWIG_3(ss, mics), true);
  }

  public Quantity_Period(int ss) {
    this(OCCwrapJavaJNI.new_Quantity_Period__SWIG_4(ss), true);
  }

  /**
   *  Decomposes this period into a number of days,hours,
   *  minutes,seconds,milliseconds and microseconds
   *  Example of return values:
   *  2 days, 15 hours, 0 minute , 0 second
   *  0 millisecond and 0 microsecond
   */
  public void Values(int[] dd, int[] hh, int[] mn, int[] ss, int[] mis, int[] mics) {
    OCCwrapJavaJNI.Quantity_Period_Values__SWIG_0(swigCPtr, this, dd, hh, mn, ss, mis, mics);
  }

  /**
   *  Returns the number of seconds in Ss and the
   *  number of remainding microseconds in Mics of this period.
   *  Example of return values: 3600 seconds and 0 microseconds
   */
  public void Values(int[] ss, int[] mics) {
    OCCwrapJavaJNI.Quantity_Period_Values__SWIG_1(swigCPtr, this, ss, mics);
  }

  /**
   *  Assigns to this period the time interval defined
   *  -   with dd days, hh hours, mn minutes, ss
   *  seconds, mis (defaulted to 0) milliseconds and
   *  mics (defaulted to 0) microseconds; or
   */
  public void SetValues(int dd, int hh, int mn, int ss, int mis, int mics) {
    OCCwrapJavaJNI.Quantity_Period_SetValues__SWIG_0(swigCPtr, this, dd, hh, mn, ss, mis, mics);
  }

  /**
   *  Assigns to this period the time interval defined
   *  -   with Ss seconds and Mics (defaulted to 0) microseconds.
   *  Exceptions
   *  Quantity_PeriodDefinitionError:
   *  -   if the number of seconds expressed either by:
   *  -   dd days, hh hours, mn minutes and ss seconds, or
   *  -   Ss
   *  is less than 0.
   *  -   if the number of microseconds expressed either by:
   *  -   mis milliseconds and mics microseconds, or
   *  -   Mics
   *  is less than 0.
   */
  public void SetValues(int dd, int hh, int mn, int ss, int mis) {
    OCCwrapJavaJNI.Quantity_Period_SetValues__SWIG_1(swigCPtr, this, dd, hh, mn, ss, mis);
  }

  public void SetValues(int dd, int hh, int mn, int ss) {
    OCCwrapJavaJNI.Quantity_Period_SetValues__SWIG_2(swigCPtr, this, dd, hh, mn, ss);
  }

  public void SetValues(int ss, int mics) {
    OCCwrapJavaJNI.Quantity_Period_SetValues__SWIG_3(swigCPtr, this, ss, mics);
  }

  public void SetValues(int ss) {
    OCCwrapJavaJNI.Quantity_Period_SetValues__SWIG_4(swigCPtr, this, ss);
  }

  /**
   *  Subtracts one Period from another and returns the difference.
   */
  public Quantity_Period Subtract( Quantity_Period  anOther) {
    return new Quantity_Period(OCCwrapJavaJNI.Quantity_Period_Subtract(swigCPtr, this, Quantity_Period.getCPtr(anOther), anOther), true);
  }

  /**
   *  Adds one Period to another one.
   */
  public Quantity_Period Add( Quantity_Period  anOther) {
    return new Quantity_Period(OCCwrapJavaJNI.Quantity_Period_Add(swigCPtr, this, Quantity_Period.getCPtr(anOther), anOther), true);
  }

  /**
   *  Returns TRUE if both <me> and <other> are equal.
   */
  public long IsEqual( Quantity_Period  anOther) {
    return OCCwrapJavaJNI.Quantity_Period_IsEqual(swigCPtr, this, Quantity_Period.getCPtr(anOther), anOther);
  }

  /**
   *  Returns TRUE if <me> is shorter than <other>.
   */
  public long IsShorter( Quantity_Period  anOther) {
    return OCCwrapJavaJNI.Quantity_Period_IsShorter(swigCPtr, this, Quantity_Period.getCPtr(anOther), anOther);
  }

  /**
   *  Returns TRUE if <me> is longer then <other>.
   */
  public long IsLonger( Quantity_Period  anOther) {
    return OCCwrapJavaJNI.Quantity_Period_IsLonger(swigCPtr, this, Quantity_Period.getCPtr(anOther), anOther);
  }

  /**
   *  Checks the validity of a Period in form (dd,hh,mn,ss,mil,mic)
   *  With:      0 <= dd
   *  0 <= hh
   *  0 <= mn
   *  0 <= ss
   *  0 <= mis
   *  0 <= mics
   */
  public static long IsValid(int dd, int hh, int mn, int ss, int mis, int mics) {
    return OCCwrapJavaJNI.Quantity_Period_IsValid__SWIG_0(dd, hh, mn, ss, mis, mics);
  }

  /**
   *  Checks the validity of a Period in form (ss,mic)
   *  With:      0 <= ss
   *  0 <= mics
   */
  public static long IsValid(int dd, int hh, int mn, int ss, int mis) {
    return OCCwrapJavaJNI.Quantity_Period_IsValid__SWIG_1(dd, hh, mn, ss, mis);
  }

  public static long IsValid(int dd, int hh, int mn, int ss) {
    return OCCwrapJavaJNI.Quantity_Period_IsValid__SWIG_2(dd, hh, mn, ss);
  }

  public static long IsValid(int ss, int mics) {
    return OCCwrapJavaJNI.Quantity_Period_IsValid__SWIG_3(ss, mics);
  }

  public static long IsValid(int ss) {
    return OCCwrapJavaJNI.Quantity_Period_IsValid__SWIG_4(ss);
  }

}
