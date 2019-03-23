package opencascade;

public class TColGeom_Array2OfSurface_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TColGeom_Array2OfSurface_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TColGeom_Array2OfSurface_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TColGeom_Array2OfSurface_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TColGeom_Array2OfSurface_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TColGeom_Array2OfSurface_Iterator(TColGeom_Array2OfSurface arg0) {
    this(OCCwrapJavaJNI.new_TColGeom_Array2OfSurface_Iterator(TColGeom_Array2OfSurface.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.TColGeom_Array2OfSurface_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.TColGeom_Array2OfSurface_Iterator_Next(swigCPtr, this);
  }

  public  Geom_Surface  Value() {
    return new Geom_Surface ( OCCwrapJavaJNI.TColGeom_Array2OfSurface_Iterator_Value(swigCPtr, this), true );
  }

  public  Geom_Surface  ChangeValue() {
    return new Geom_Surface ( OCCwrapJavaJNI.TColGeom_Array2OfSurface_Iterator_ChangeValue(swigCPtr, this), true );
  }

}
