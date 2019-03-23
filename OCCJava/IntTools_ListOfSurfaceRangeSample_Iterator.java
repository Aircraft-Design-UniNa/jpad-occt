package opencascade;

public class IntTools_ListOfSurfaceRangeSample_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntTools_ListOfSurfaceRangeSample_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntTools_ListOfSurfaceRangeSample_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntTools_ListOfSurfaceRangeSample_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntTools_ListOfSurfaceRangeSample_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntTools_ListOfSurfaceRangeSample_Iterator(IntTools_ListOfSurfaceRangeSample arg0) {
    this(OCCwrapJavaJNI.new_IntTools_ListOfSurfaceRangeSample_Iterator(IntTools_ListOfSurfaceRangeSample.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_Iterator_Next(swigCPtr, this);
  }

  public  IntTools_SurfaceRangeSample  Value() {
    IntTools_SurfaceRangeSample ret = new IntTools_SurfaceRangeSample(OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_Iterator_Value(swigCPtr, this), false, this);
    return ret;
  }

  public  IntTools_SurfaceRangeSample  ChangeValue() {
    IntTools_SurfaceRangeSample ret = new IntTools_SurfaceRangeSample(OCCwrapJavaJNI.IntTools_ListOfSurfaceRangeSample_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret;
  }

}
