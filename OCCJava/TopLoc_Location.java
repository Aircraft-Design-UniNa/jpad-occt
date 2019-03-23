package opencascade;

/**
 *  A Location is a composite transition. It comprises a
 *  series of elementary reference coordinates, i.e.
 *  objects of type TopLoc_Datum3D, and the powers to
 *  which these objects are raised.
 */
public class TopLoc_Location {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TopLoc_Location(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TopLoc_Location(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TopLoc_Location obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (TopLoc_Location ptr) { Ptr = ptr; }
    public TopLoc_Location AsReference () { return Ptr; }
    public TopLoc_Location AsCopy () { return Ptr.MakeCopy(); }
    public TopLoc_Location Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopLoc_Location(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructs an empty local coordinate system object.
   *  Note: A Location constructed from a default datum is said to be "empty".
   */
  public TopLoc_Location() {
    this(OCCwrapJavaJNI.new_TopLoc_Location__SWIG_0(), true);
  }

  /**
   *  Constructs the local coordinate system object defined
   *  by the transformation T. T invokes in turn, a TopLoc_Datum3D object.
   */
  public TopLoc_Location( gp_Trsf  T) {
    this(OCCwrapJavaJNI.new_TopLoc_Location__SWIG_1(gp_Trsf.getCPtr(T), T), true);
  }

  /**
   *  Returns true if this location is equal to the Identity transformation.
   */
  public long IsIdentity() {
    return OCCwrapJavaJNI.TopLoc_Location_IsIdentity(swigCPtr, this);
  }

  /**
   *  Resets this location to the Identity transformation.
   */
  public void Identity() {
    OCCwrapJavaJNI.TopLoc_Location_Identity(swigCPtr, this);
  }

  /**
   *  Returns   the  power  elevation  of    the   first
   *  elementary datum.
   *  Exceptions
   *  Standard_NoSuchObject if this location is empty.
   */
  public int FirstPower() {
    return OCCwrapJavaJNI.TopLoc_Location_FirstPower(swigCPtr, this);
  }

  /**
   *  Returns  a Location representing  <me> without the
   *  first datum. We have the relation :
   * 
   *  <me> = NextLocation() * FirstDatum() ^ FirstPower()
   *  Exceptions
   *  Standard_NoSuchObject if this location is empty.
   */
  public  TopLoc_Location  NextLocation() {
    TopLoc_Location ret = new TopLoc_Location(OCCwrapJavaJNI.TopLoc_Location_NextLocation(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns  the transformation    associated  to  the
   *  coordinate system.
   */
  public  gp_Trsf  Transformation() {
    gp_Trsf ret = new gp_Trsf(OCCwrapJavaJNI.TopLoc_Location_Transformation(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the inverse of <me>.
   * 
   *  <me> * Inverted() is an Identity.
   */
  public TopLoc_Location Inverted() {
    return new TopLoc_Location(OCCwrapJavaJNI.TopLoc_Location_Inverted(swigCPtr, this), true);
  }

  /**
   *  Returns <me> * <Other>, the  elementary datums are
   *  concatenated.
   */
  public TopLoc_Location Multiplied( TopLoc_Location  Other) {
    return new TopLoc_Location(OCCwrapJavaJNI.TopLoc_Location_Multiplied(swigCPtr, this, TopLoc_Location.getCPtr(Other), Other), true);
  }

  /**
   *  Returns  <me> / <Other>.
   */
  public TopLoc_Location Divided( TopLoc_Location  Other) {
    return new TopLoc_Location(OCCwrapJavaJNI.TopLoc_Location_Divided(swigCPtr, this, TopLoc_Location.getCPtr(Other), Other), true);
  }

  /**
   *  Returns <Other>.Inverted() * <me>.
   */
  public TopLoc_Location Predivided( TopLoc_Location  Other) {
    return new TopLoc_Location(OCCwrapJavaJNI.TopLoc_Location_Predivided(swigCPtr, this, TopLoc_Location.getCPtr(Other), Other), true);
  }

  /**
   *  Returns me at the power <pwr>.   If <pwr>  is zero
   *  returns  Identity.  <pwr> can  be lower  than zero
   *  (usual meaning for powers).
   */
  public TopLoc_Location Powered(int pwr) {
    return new TopLoc_Location(OCCwrapJavaJNI.TopLoc_Location_Powered(swigCPtr, this, pwr), true);
  }

  /**
   *  Returns a hashed value for this local coordinate system.
   *  This value is used, with map tables, to store and
   *  retrieve the object easily, and is in the range [ 1..Upper ].
   */
  public int HashCode(int Upper) {
    return OCCwrapJavaJNI.TopLoc_Location_HashCode(swigCPtr, this, Upper);
  }

  /**
   *  Returns true if this location and the location Other
   *  have the same elementary data, i.e. contain the same
   *  series of TopLoc_Datum3D and respective powers.
   *  This method is an alias for operator ==.
   */
  public long IsEqual( TopLoc_Location  Other) {
    return OCCwrapJavaJNI.TopLoc_Location_IsEqual(swigCPtr, this, TopLoc_Location.getCPtr(Other), Other);
  }

  /**
   *  Returns true if this location and the location Other do
   *  not have the same elementary data, i.e. do not
   *  contain the same series of TopLoc_Datum3D and respective powers.
   *  This method is an alias for operator !=.
   */
  public long IsDifferent( TopLoc_Location  Other) {
    return OCCwrapJavaJNI.TopLoc_Location_IsDifferent(swigCPtr, this, TopLoc_Location.getCPtr(Other), Other);
  }

}
