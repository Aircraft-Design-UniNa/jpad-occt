package opencascade;

/**
 *  Shape Processing module
 *  allows to define and apply general Shape Processing as a
 *  customizable sequence of Shape Healing operators. The
 *  customization is implemented via user-editable resource
 *  file which defines sequence of operators to be executed
 *  and their parameters.
 */
public class ShapeProcess {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeProcess(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeProcess(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeProcess obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeProcess(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Registers operator to make it visible for Performer
   */
  public static long RegisterOperator(String name,  ShapeProcess_Operator  op) {
    return OCCwrapJavaJNI.ShapeProcess_RegisterOperator(name,  ShapeProcess_Operator.getCPtr(op) , op);
  }

  /**
   *  Finds operator by its name
   */
  public static long FindOperator(String name,  ShapeProcess_Operator  op) {
    return OCCwrapJavaJNI.ShapeProcess_FindOperator(name,  ShapeProcess_Operator.getCPtr(op) , op);
  }

  /**
   *  Performs a specified sequence of operators on Context
   *  Resource file and other data should be already loaded
   *  to Context (including description of sequence seq)
   */
  public static long Perform( ShapeProcess_Context  context, String seq) {
    return OCCwrapJavaJNI.ShapeProcess_Perform( ShapeProcess_Context.getCPtr(context) , context, seq);
  }

  public ShapeProcess() {
    this(OCCwrapJavaJNI.new_ShapeProcess(), true);
  }

}
