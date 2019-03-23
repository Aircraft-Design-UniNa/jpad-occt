package opencascade;

/**
 *  Internal data structure for scale in ProgressIndicator
 * 
 *  Basically it defines three things:
 *  - name that can be used for generating user messages
 *  - limits and characteristics of the current scale,
 *  along with derived coefficients to map it into basic scale [0-1]
 *  - methods for conversion of values from current scale
 *  to basic one and back
 * 
 *  NOTE: There is no special protection against bad input data
 *  like min > max etc. except cases when it can cause exception
 */
public class Message_ProgressScale {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Message_ProgressScale(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Message_ProgressScale(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Message_ProgressScale obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Message_ProgressScale(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates scale ranged from 0 to 100 with step 1
   */
  public Message_ProgressScale() {
    this(OCCwrapJavaJNI.new_Message_ProgressScale(), true);
  }

  public void SetName(String theName) {
    OCCwrapJavaJNI.Message_ProgressScale_SetName__SWIG_0(swigCPtr, this, theName);
  }

  /**
   *  Sets scale name
   */
  public void SetName( TCollection_HAsciiString  theName) {
    OCCwrapJavaJNI.Message_ProgressScale_SetName__SWIG_1(swigCPtr, this,  TCollection_HAsciiString.getCPtr(theName) , theName);
  }

  public  TCollection_HAsciiString  GetName() {
    return new TCollection_HAsciiString ( OCCwrapJavaJNI.Message_ProgressScale_GetName(swigCPtr, this), true );
  }

  /**
   *  Sets minimum value of scale
   */
  public void SetMin(double theMin) {
    OCCwrapJavaJNI.Message_ProgressScale_SetMin(swigCPtr, this, theMin);
  }

  /**
   *  Gets minimum value of scale
   */
  public double GetMin() {
    return OCCwrapJavaJNI.Message_ProgressScale_GetMin(swigCPtr, this);
  }

  /**
   *  Sets minimum value of scale
   */
  public void SetMax(double theMax) {
    OCCwrapJavaJNI.Message_ProgressScale_SetMax(swigCPtr, this, theMax);
  }

  /**
   *  Gets minimum value of scale
   */
  public double GetMax() {
    return OCCwrapJavaJNI.Message_ProgressScale_GetMax(swigCPtr, this);
  }

  /**
   *  Set both min and max
   */
  public void SetRange(double min, double max) {
    OCCwrapJavaJNI.Message_ProgressScale_SetRange(swigCPtr, this, min, max);
  }

  /**
   *  Sets default step
   */
  public void SetStep(double theStep) {
    OCCwrapJavaJNI.Message_ProgressScale_SetStep(swigCPtr, this, theStep);
  }

  /**
   *  Gets default step
   */
  public double GetStep() {
    return OCCwrapJavaJNI.Message_ProgressScale_GetStep(swigCPtr, this);
  }

  /**
   *  Sets flag for infinite scale
   */
  public void SetInfinite(long theInfinite) {
    OCCwrapJavaJNI.Message_ProgressScale_SetInfinite__SWIG_0(swigCPtr, this, theInfinite);
  }

  public void SetInfinite() {
    OCCwrapJavaJNI.Message_ProgressScale_SetInfinite__SWIG_1(swigCPtr, this);
  }

  /**
   *  Gets flag for infinite scale
   */
  public long GetInfinite() {
    return OCCwrapJavaJNI.Message_ProgressScale_GetInfinite(swigCPtr, this);
  }

  /**
   *  Set all scale parameters
   */
  public void SetScale(double min, double max, double step, long theInfinite) {
    OCCwrapJavaJNI.Message_ProgressScale_SetScale__SWIG_0(swigCPtr, this, min, max, step, theInfinite);
  }

  public void SetScale(double min, double max, double step) {
    OCCwrapJavaJNI.Message_ProgressScale_SetScale__SWIG_1(swigCPtr, this, min, max, step);
  }

  /**
   *  Defines span occupied by the scale on the basis scale
   */
  public void SetSpan(double first, double last) {
    OCCwrapJavaJNI.Message_ProgressScale_SetSpan(swigCPtr, this, first, last);
  }

  public double GetFirst() {
    return OCCwrapJavaJNI.Message_ProgressScale_GetFirst(swigCPtr, this);
  }

  /**
   *  Return information on span occupied by the scale on the base scale
   */
  public double GetLast() {
    return OCCwrapJavaJNI.Message_ProgressScale_GetLast(swigCPtr, this);
  }

  public double LocalToBase(double val) {
    return OCCwrapJavaJNI.Message_ProgressScale_LocalToBase(swigCPtr, this, val);
  }

  /**
   *  Convert value from this scale to base one and back
   */
  public double BaseToLocal(double val) {
    return OCCwrapJavaJNI.Message_ProgressScale_BaseToLocal(swigCPtr, this, val);
  }

}
