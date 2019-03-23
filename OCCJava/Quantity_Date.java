package opencascade;

/**
 *  This class provides services to manage date information.
 *  A date represents the following time intervals:
 *  year, month, day, hour, minute, second,
 *  millisecond and microsecond.
 *  Current time is expressed in elapsed seconds
 *  and microseconds beginning from 00:00 GMT,
 *  January 1, 1979 (zero hour). The valid date can
 *  only be later than this one.
 *  Note: a Period object gives the interval between two dates.
 */
public class Quantity_Date {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Quantity_Date(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Quantity_Date(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Quantity_Date obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (Quantity_Date ptr) { Ptr = ptr; }
    public Quantity_Date AsReference () { return Ptr; }
    public Quantity_Date AsCopy () { return Ptr.MakeCopy(); }
    public Quantity_Date Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Quantity_Date(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructs a default date
   *  (00:00 GMT, January 1, 1979 (zero hour)); use the function
   *  SetValues to define the required date; or
   */
  public Quantity_Date() {
    this(OCCwrapJavaJNI.new_Quantity_Date__SWIG_0(), true);
  }

  /**
   *  Constructs a date from the year yyyy, the
   *  month mm, the day dd, the hour hh, the minute
   *  mn, the second ss, the millisecond mis
   *  (defaulted to 0) and the microsecond mics (defaulted to 0)..
   *  With:      1 <= mm <= 12
   *  1 <= dd <= max number of days of <mm>
   *  1979 <= yyyy
   *  0 <= hh <= 23
   *  0 <= mn <= 59
   *  0 <= ss <= 59
   *  0 <= mis <= 999
   *  0 <= mics <= 999
   *  Exceptions
   *  Quantity_DateDefinitionError if mm, dd, hh,
   *  mn, ss, mis and mics are not the components of the valid date.
   */
  public Quantity_Date(int mm, int dd, int yyyy, int hh, int mn, int ss, int mis, int mics) {
    this(OCCwrapJavaJNI.new_Quantity_Date__SWIG_1(mm, dd, yyyy, hh, mn, ss, mis, mics), true);
  }

  public Quantity_Date(int mm, int dd, int yyyy, int hh, int mn, int ss, int mis) {
    this(OCCwrapJavaJNI.new_Quantity_Date__SWIG_2(mm, dd, yyyy, hh, mn, ss, mis), true);
  }

  public Quantity_Date(int mm, int dd, int yyyy, int hh, int mn, int ss) {
    this(OCCwrapJavaJNI.new_Quantity_Date__SWIG_3(mm, dd, yyyy, hh, mn, ss), true);
  }

  /**
   *  Gets a complete Date.
   *  -   in mm - the month,
   *  -   in dd - the day,
   *  -   in yyyy - the year,
   *  -   in hh - the hour,
   *  -   in mn - the minute,
   *  -   in ss - the second,
   *  -   in mis - the millisecond, and
   *  -   in mics - the microsecond
   */
  public void Values(int[] mm, int[] dd, int[] yy, int[] hh, int[] mn, int[] ss, int[] mis, int[] mics) {
    OCCwrapJavaJNI.Quantity_Date_Values(swigCPtr, this, mm, dd, yy, hh, mn, ss, mis, mics);
  }

  /**
   *  Assigns to this date the year yyyy, the month
   *  mm, the day dd, the hour hh, the minute mn, the
   *  second ss, the millisecond mis (defaulted to 0)
   *  and the microsecond mics (defaulted to 0).
   *  Exceptions
   *  Quantity_DateDefinitionError if mm, dd, hh,
   *  mn, ss, mis and mics are not components of a valid date.
   */
  public void SetValues(int mm, int dd, int yy, int hh, int mn, int ss, int mis, int mics) {
    OCCwrapJavaJNI.Quantity_Date_SetValues__SWIG_0(swigCPtr, this, mm, dd, yy, hh, mn, ss, mis, mics);
  }

  public void SetValues(int mm, int dd, int yy, int hh, int mn, int ss, int mis) {
    OCCwrapJavaJNI.Quantity_Date_SetValues__SWIG_1(swigCPtr, this, mm, dd, yy, hh, mn, ss, mis);
  }

  public void SetValues(int mm, int dd, int yy, int hh, int mn, int ss) {
    OCCwrapJavaJNI.Quantity_Date_SetValues__SWIG_2(swigCPtr, this, mm, dd, yy, hh, mn, ss);
  }

  /**
   *  Subtracts one Date from another one to find the period
   *  between and returns the value.
   *  The result is the absolute value between the difference
   *  of two dates.
   */
  public Quantity_Period Difference( Quantity_Date  anOther) {
    return new Quantity_Period(OCCwrapJavaJNI.Quantity_Date_Difference(swigCPtr, this, Quantity_Date.getCPtr(anOther), anOther), true);
  }

  /**
   *  Subtracts a period from a Date and returns the new Date.
   *  Raises an exception if the result date is anterior to
   *  Jan 1, 1979.
   */
  public Quantity_Date Subtract( Quantity_Period  aPeriod) {
    return new Quantity_Date(OCCwrapJavaJNI.Quantity_Date_Subtract(swigCPtr, this, Quantity_Period.getCPtr(aPeriod), aPeriod), true);
  }

  /**
   *  Adds a Period to a Date and returns the new Date.
   */
  public Quantity_Date Add( Quantity_Period  aPeriod) {
    return new Quantity_Date(OCCwrapJavaJNI.Quantity_Date_Add(swigCPtr, this, Quantity_Period.getCPtr(aPeriod), aPeriod), true);
  }

  /**
   *  Returns year of a Date.
   */
  public int Year() {
    return OCCwrapJavaJNI.Quantity_Date_Year(swigCPtr, this);
  }

  /**
   *  Returns month of a Date.
   */
  public int Month() {
    return OCCwrapJavaJNI.Quantity_Date_Month(swigCPtr, this);
  }

  /**
   *  Returns Day of a Date.
   */
  public int Day() {
    return OCCwrapJavaJNI.Quantity_Date_Day(swigCPtr, this);
  }

  /**
   *  Returns Hour of a Date.
   */
  public int Hour() {
    return OCCwrapJavaJNI.Quantity_Date_Hour(swigCPtr, this);
  }

  /**
   *  Returns minute of a Date.
   */
  public int Minute() {
    return OCCwrapJavaJNI.Quantity_Date_Minute(swigCPtr, this);
  }

  /**
   *  Returns seconde of a Date.
   */
  public int Second() {
    return OCCwrapJavaJNI.Quantity_Date_Second(swigCPtr, this);
  }

  /**
   *  Returns millisecond of a Date.
   */
  public int MilliSecond() {
    return OCCwrapJavaJNI.Quantity_Date_MilliSecond(swigCPtr, this);
  }

  /**
   *  Returns microsecond of a Date.
   */
  public int MicroSecond() {
    return OCCwrapJavaJNI.Quantity_Date_MicroSecond(swigCPtr, this);
  }

  /**
   *  Returns TRUE if both <me> and <other> are equal.
   *  This method is an alias of operator ==.
   */
  public long IsEqual( Quantity_Date  anOther) {
    return OCCwrapJavaJNI.Quantity_Date_IsEqual(swigCPtr, this, Quantity_Date.getCPtr(anOther), anOther);
  }

  /**
   *  Returns TRUE if <me> is earlier than <other>.
   */
  public long IsEarlier( Quantity_Date  anOther) {
    return OCCwrapJavaJNI.Quantity_Date_IsEarlier(swigCPtr, this, Quantity_Date.getCPtr(anOther), anOther);
  }

  /**
   *  Returns TRUE if <me> is later then <other>.
   */
  public long IsLater( Quantity_Date  anOther) {
    return OCCwrapJavaJNI.Quantity_Date_IsLater(swigCPtr, this, Quantity_Date.getCPtr(anOther), anOther);
  }

  /**
   *  Checks the validity of a date - returns true if a
   *  date defined from the year yyyy, the month mm,
   *  the day dd, the hour hh, the minute mn, the
   *  second ss, the millisecond mis (defaulted to 0)
   *  and the microsecond mics (defaulted to 0) is valid.
   *  A date must satisfy the conditions above:
   *  -   yyyy is greater than or equal to 1979,
   *  -   mm lies within the range [1, 12] (with 1
   *  corresponding to January and 12 to December),
   *  -   dd lies within a valid range for the month mm
   *  (from 1 to 28, 29, 30 or 31 depending on
   *  mm and whether yyyy is a leap year or not),
   *  -   hh lies within the range [0, 23],
   *  -   mn lies within the range [0, 59],
   *  -   ss lies within the range [0, 59],
   *  -   mis lies within the range [0, 999],
   *  -   mics lies within the range [0, 999].C
   */
  public static long IsValid(int mm, int dd, int yy, int hh, int mn, int ss, int mis, int mics) {
    return OCCwrapJavaJNI.Quantity_Date_IsValid__SWIG_0(mm, dd, yy, hh, mn, ss, mis, mics);
  }

  public static long IsValid(int mm, int dd, int yy, int hh, int mn, int ss, int mis) {
    return OCCwrapJavaJNI.Quantity_Date_IsValid__SWIG_1(mm, dd, yy, hh, mn, ss, mis);
  }

  public static long IsValid(int mm, int dd, int yy, int hh, int mn, int ss) {
    return OCCwrapJavaJNI.Quantity_Date_IsValid__SWIG_2(mm, dd, yy, hh, mn, ss);
  }

  /**
   *  Returns true if a year is a leap year.
   *  The leap years are divisable by 4 and not by 100 except
   *  the years divisable by 400.
   */
  public static long IsLeap(int yy) {
    return OCCwrapJavaJNI.Quantity_Date_IsLeap(yy);
  }

}
