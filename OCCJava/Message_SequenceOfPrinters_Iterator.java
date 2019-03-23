package opencascade;

public class Message_SequenceOfPrinters_Iterator {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Message_SequenceOfPrinters_Iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Message_SequenceOfPrinters_Iterator(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Message_SequenceOfPrinters_Iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Message_SequenceOfPrinters_Iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Message_SequenceOfPrinters_Iterator(Message_SequenceOfPrinters arg0) {
    this(OCCwrapJavaJNI.new_Message_SequenceOfPrinters_Iterator(Message_SequenceOfPrinters.getCPtr(arg0), arg0), true);
  }

  public long More() {
    return OCCwrapJavaJNI.Message_SequenceOfPrinters_Iterator_More(swigCPtr, this);
  }

  public void Next() {
    OCCwrapJavaJNI.Message_SequenceOfPrinters_Iterator_Next(swigCPtr, this);
  }

  public  Message_Printer  Value() {
    return new Message_Printer ( OCCwrapJavaJNI.Message_SequenceOfPrinters_Iterator_Value(swigCPtr, this), true );
  }

  public  Message_Printer  ChangeValue() {
    return new Message_Printer ( OCCwrapJavaJNI.Message_SequenceOfPrinters_Iterator_ChangeValue(swigCPtr, this), true );
  }

}
