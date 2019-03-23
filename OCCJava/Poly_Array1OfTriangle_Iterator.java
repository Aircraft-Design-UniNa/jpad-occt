package opencascade;

public class Poly_Array1OfTriangle_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Poly_Array1OfTriangle_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Poly_Array1OfTriangle_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Poly_Array1OfTriangle_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Poly_Array1OfTriangle_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Poly_Array1OfTriangle_Iterator(Poly_Array1OfTriangle arg0) {
    this(OCCwrapJavaJNI.new_Poly_Array1OfTriangle_Iterator(Poly_Array1OfTriangle.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.Poly_Array1OfTriangle_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.Poly_Array1OfTriangle_Iterator_Next(swigCPtr, this);
  }

  public  Poly_Triangle  Value() {
    Poly_Triangle ret = new Poly_Triangle(OCCwrapJavaJNI.Poly_Array1OfTriangle_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public Poly_Triangle ChangeValue() {
    Poly_Triangle ret = new Poly_Triangle(OCCwrapJavaJNI.Poly_Array1OfTriangle_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new Poly_Triangle.CRef (ret);
  }

}
