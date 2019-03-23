package opencascade;

public class Bnd_Array1OfBox_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Bnd_Array1OfBox_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Bnd_Array1OfBox_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Bnd_Array1OfBox_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Bnd_Array1OfBox_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Bnd_Array1OfBox_Iterator(Bnd_Array1OfBox arg0) {
    this(OCCwrapJavaJNI.new_Bnd_Array1OfBox_Iterator(Bnd_Array1OfBox.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.Bnd_Array1OfBox_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.Bnd_Array1OfBox_Iterator_Next(swigCPtr, this);
  }

  public  Bnd_Box  Value() {
    Bnd_Box ret = new Bnd_Box(OCCwrapJavaJNI.Bnd_Array1OfBox_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public Bnd_Box ChangeValue() {
    Bnd_Box ret = new Bnd_Box(OCCwrapJavaJNI.Bnd_Array1OfBox_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new Bnd_Box.CRef (ret);
  }

}
