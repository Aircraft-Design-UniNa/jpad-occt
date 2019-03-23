package opencascade;

public class Quantity_Array1OfColor_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Quantity_Array1OfColor_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Quantity_Array1OfColor_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Quantity_Array1OfColor_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Quantity_Array1OfColor_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Quantity_Array1OfColor_Iterator(Quantity_Array1OfColor arg0) {
    this(OCCwrapJavaJNI.new_Quantity_Array1OfColor_Iterator(Quantity_Array1OfColor.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.Quantity_Array1OfColor_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.Quantity_Array1OfColor_Iterator_Next(swigCPtr, this);
  }

  public  Quantity_Color  Value() {
    Quantity_Color ret = new Quantity_Color(OCCwrapJavaJNI.Quantity_Array1OfColor_Iterator_Value(swigCPtr, this), true);
    return ret;
  }

  public Quantity_Color ChangeValue() {
    Quantity_Color ret = new Quantity_Color(OCCwrapJavaJNI.Quantity_Array1OfColor_Iterator_ChangeValue(swigCPtr, this), false, this);
    return ret; //new Quantity_Color.CRef (ret);
  }

}
