package opencascade;

public class TColStd_PackedMapOfInteger {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColStd_PackedMapOfInteger(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColStd_PackedMapOfInteger(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColStd_PackedMapOfInteger obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColStd_PackedMapOfInteger(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static public class Iterator extends TCollection_BasicMapIterator {
    private transient long swigCPtr;
  
    protected Iterator(long cPtr, boolean cMemoryOwn) {
      super(OCCwrapJavaJNI.TColStd_PackedMapOfInteger_Iterator_SWIGUpcast(cPtr), cMemoryOwn);
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(Iterator obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OCCwrapJavaJNI.delete_TColStd_PackedMapOfInteger_Iterator(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
    /**
     *  Empty Constructor.
     */
    public Iterator() {
      this(OCCwrapJavaJNI.new_TColStd_PackedMapOfInteger_Iterator__SWIG_0(), true);
    }
  
    /**
     *  Constructor.
     */
    public Iterator( TColStd_PackedMapOfInteger  theMap) {
      this(OCCwrapJavaJNI.new_TColStd_PackedMapOfInteger_Iterator__SWIG_1(TColStd_PackedMapOfInteger.getCPtr(theMap), theMap), true);
    }
  
    /**
     *  Re-initialize with the same or another Map instance.
     */
    public void Initialize( TColStd_PackedMapOfInteger  theMap) {
      OCCwrapJavaJNI.TColStd_PackedMapOfInteger_Iterator_Initialize(swigCPtr, this, TColStd_PackedMapOfInteger.getCPtr(theMap), theMap);
    }
  
    /**
     *  Restart the iteration
     */
    public void Reset() {
      OCCwrapJavaJNI.TColStd_PackedMapOfInteger_Iterator_Reset(swigCPtr, this);
    }
  
    /**
     *  Query the iterated key.
     */
    public int Key() {
      return OCCwrapJavaJNI.TColStd_PackedMapOfInteger_Iterator_Key(swigCPtr, this);
    }
  
    /**
     *  Increment the iterator
     */
    public void Next() {
      OCCwrapJavaJNI.TColStd_PackedMapOfInteger_Iterator_Next(swigCPtr, this);
    }
  
  }

  /**
   *  Constructor
   */
  public TColStd_PackedMapOfInteger(int NbBuckets) {
    this(OCCwrapJavaJNI.new_TColStd_PackedMapOfInteger__SWIG_0(NbBuckets), true);
  }

  /**
   *  Copy constructor
   */
  public TColStd_PackedMapOfInteger() {
    this(OCCwrapJavaJNI.new_TColStd_PackedMapOfInteger__SWIG_1(), true);
  }

  public TColStd_PackedMapOfInteger( TColStd_PackedMapOfInteger  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_PackedMapOfInteger__SWIG_2(TColStd_PackedMapOfInteger.getCPtr(theOther), theOther), true);
  }

  public  TColStd_PackedMapOfInteger  Assign( TColStd_PackedMapOfInteger  arg0) {
    TColStd_PackedMapOfInteger ret = new TColStd_PackedMapOfInteger(OCCwrapJavaJNI.TColStd_PackedMapOfInteger_Assign(swigCPtr, this, TColStd_PackedMapOfInteger.getCPtr(arg0), arg0), false, this);
    return ret;
  }

  public void ReSize(int NbBuckets) {
    OCCwrapJavaJNI.TColStd_PackedMapOfInteger_ReSize(swigCPtr, this, NbBuckets);
  }

  public void Clear() {
    OCCwrapJavaJNI.TColStd_PackedMapOfInteger_Clear(swigCPtr, this);
  }

  public long Add(int aKey) {
    return OCCwrapJavaJNI.TColStd_PackedMapOfInteger_Add(swigCPtr, this, aKey);
  }

  public long Contains(int aKey) {
    return OCCwrapJavaJNI.TColStd_PackedMapOfInteger_Contains(swigCPtr, this, aKey);
  }

  public long Remove(int aKey) {
    return OCCwrapJavaJNI.TColStd_PackedMapOfInteger_Remove(swigCPtr, this, aKey);
  }

  public int NbBuckets() {
    return OCCwrapJavaJNI.TColStd_PackedMapOfInteger_NbBuckets(swigCPtr, this);
  }

  public int Extent() {
    return OCCwrapJavaJNI.TColStd_PackedMapOfInteger_Extent(swigCPtr, this);
  }

  public long IsEmpty() {
    return OCCwrapJavaJNI.TColStd_PackedMapOfInteger_IsEmpty(swigCPtr, this);
  }

  public void Statistics(SWIGTYPE_p_Standard_OStream outStream) {
    OCCwrapJavaJNI.TColStd_PackedMapOfInteger_Statistics(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(outStream));
  }

  public int GetMinimalMapped() {
    return OCCwrapJavaJNI.TColStd_PackedMapOfInteger_GetMinimalMapped(swigCPtr, this);
  }

  public int GetMaximalMapped() {
    return OCCwrapJavaJNI.TColStd_PackedMapOfInteger_GetMaximalMapped(swigCPtr, this);
  }

  public void Union( TColStd_PackedMapOfInteger  arg0,  TColStd_PackedMapOfInteger  arg1) {
    OCCwrapJavaJNI.TColStd_PackedMapOfInteger_Union(swigCPtr, this, TColStd_PackedMapOfInteger.getCPtr(arg0), arg0, TColStd_PackedMapOfInteger.getCPtr(arg1), arg1);
  }

  public long Unite( TColStd_PackedMapOfInteger  arg0) {
    return OCCwrapJavaJNI.TColStd_PackedMapOfInteger_Unite(swigCPtr, this, TColStd_PackedMapOfInteger.getCPtr(arg0), arg0);
  }

  public void Intersection( TColStd_PackedMapOfInteger  arg0,  TColStd_PackedMapOfInteger  arg1) {
    OCCwrapJavaJNI.TColStd_PackedMapOfInteger_Intersection(swigCPtr, this, TColStd_PackedMapOfInteger.getCPtr(arg0), arg0, TColStd_PackedMapOfInteger.getCPtr(arg1), arg1);
  }

  public long Intersect( TColStd_PackedMapOfInteger  arg0) {
    return OCCwrapJavaJNI.TColStd_PackedMapOfInteger_Intersect(swigCPtr, this, TColStd_PackedMapOfInteger.getCPtr(arg0), arg0);
  }

  public void Subtraction( TColStd_PackedMapOfInteger  arg0,  TColStd_PackedMapOfInteger  arg1) {
    OCCwrapJavaJNI.TColStd_PackedMapOfInteger_Subtraction(swigCPtr, this, TColStd_PackedMapOfInteger.getCPtr(arg0), arg0, TColStd_PackedMapOfInteger.getCPtr(arg1), arg1);
  }

  public long Subtract( TColStd_PackedMapOfInteger  arg0) {
    return OCCwrapJavaJNI.TColStd_PackedMapOfInteger_Subtract(swigCPtr, this, TColStd_PackedMapOfInteger.getCPtr(arg0), arg0);
  }

  public void Difference( TColStd_PackedMapOfInteger  arg0,  TColStd_PackedMapOfInteger  arg1) {
    OCCwrapJavaJNI.TColStd_PackedMapOfInteger_Difference(swigCPtr, this, TColStd_PackedMapOfInteger.getCPtr(arg0), arg0, TColStd_PackedMapOfInteger.getCPtr(arg1), arg1);
  }

  public long Differ( TColStd_PackedMapOfInteger  arg0) {
    return OCCwrapJavaJNI.TColStd_PackedMapOfInteger_Differ(swigCPtr, this, TColStd_PackedMapOfInteger.getCPtr(arg0), arg0);
  }

  public long IsEqual( TColStd_PackedMapOfInteger  arg0) {
    return OCCwrapJavaJNI.TColStd_PackedMapOfInteger_IsEqual(swigCPtr, this, TColStd_PackedMapOfInteger.getCPtr(arg0), arg0);
  }

  public long IsSubset( TColStd_PackedMapOfInteger  arg0) {
    return OCCwrapJavaJNI.TColStd_PackedMapOfInteger_IsSubset(swigCPtr, this, TColStd_PackedMapOfInteger.getCPtr(arg0), arg0);
  }

  public long HasIntersection( TColStd_PackedMapOfInteger  arg0) {
    return OCCwrapJavaJNI.TColStd_PackedMapOfInteger_HasIntersection(swigCPtr, this, TColStd_PackedMapOfInteger.getCPtr(arg0), arg0);
  }

}
