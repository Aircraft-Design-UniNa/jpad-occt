package opencascade;

/**
 *  This class is used to manipulate a complete
 *  independant, self sufficient data structure and
 *  its services:
 * 
 *  Access to the root label;
 * 
 *  Opens, aborts, commits a transaction;
 * 
 *  Generation and use of Delta, depending on the time.
 *  This class uses a special allocator
 *  (see LabelNodeAllocator() method)
 *  for more efficient allocation of
 *  objects in memory.
 */
public class TDF_Data extends Standard_Transient {
  TDF_Data(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  A new and empty Data structure.
   */
  public TDF_Data() {
    this(OCCwrapJavaJNI.new_TDF_Data(), true);
  }

  /**
   *  Returns the root label of the Data structure.
   */
  public TDF_Label Root() {
    return new TDF_Label(OCCwrapJavaJNI.TDF_Data_Root(swigCPtr, this), true);
  }

  /**
   *  Returns the current transaction number.
   */
  public int Transaction() {
    return OCCwrapJavaJNI.TDF_Data_Transaction(swigCPtr, this);
  }

  /**
   *  Returns the current tick. It is incremented each Commit.
   */
  public int Time() {
    return OCCwrapJavaJNI.TDF_Data_Time(swigCPtr, this);
  }

  /**
   *  Returns true if <aDelta> is applicable HERE and NOW.
   */
  public long IsApplicable( TDF_Delta  aDelta) {
    return OCCwrapJavaJNI.TDF_Data_IsApplicable(swigCPtr, this,  TDF_Delta.getCPtr(aDelta) , aDelta);
  }

  public  TDF_Delta  Undo( TDF_Delta  aDelta, long withDelta) {
    return new TDF_Delta ( OCCwrapJavaJNI.TDF_Data_Undo__SWIG_0(swigCPtr, this,  TDF_Delta.getCPtr(aDelta) , aDelta, withDelta), true );
  }

  public  TDF_Delta  Undo( TDF_Delta  aDelta) {
    return new TDF_Delta ( OCCwrapJavaJNI.TDF_Data_Undo__SWIG_1(swigCPtr, this,  TDF_Delta.getCPtr(aDelta) , aDelta), true );
  }

  public void Destroy() {
    OCCwrapJavaJNI.TDF_Data_Destroy(swigCPtr, this);
  }

  /**
   *  Returns the undo mode status.
   */
  public long NotUndoMode() {
    return OCCwrapJavaJNI.TDF_Data_NotUndoMode(swigCPtr, this);
  }

  /**
   *  Dumps the Data on <aStream>.
   */
  public SWIGTYPE_p_Standard_OStream Dump(SWIGTYPE_p_Standard_OStream anOS) {
    return new SWIGTYPE_p_Standard_OStream(OCCwrapJavaJNI.TDF_Data_Dump(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(anOS)), false);
  }

  /**
   *  Sets modification mode.
   */
  public void AllowModification(long isAllowed) {
    OCCwrapJavaJNI.TDF_Data_AllowModification(swigCPtr, this, isAllowed);
  }

  /**
   *  returns modification mode.
   */
  public long IsModificationAllowed() {
    return OCCwrapJavaJNI.TDF_Data_IsModificationAllowed(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TDF_Data_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_Data_get_type_descriptor(), true );
  }

  public static  TDF_Data  DownCast( Standard_Transient  T) {
    return new TDF_Data ( OCCwrapJavaJNI.TDF_Data_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TDF_Data_TypeOf(), true );
  }

}
