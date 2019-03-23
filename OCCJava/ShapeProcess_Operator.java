package opencascade;

/**
 *  Abstract Operator class providing a tool to
 *  perform an operation on Context
 */
public class ShapeProcess_Operator extends Standard_Transient {
  ShapeProcess_Operator(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Performs operation and eventually records
   *  changes in the context
   */
  public long Perform( ShapeProcess_Context  context) {
    return OCCwrapJavaJNI.ShapeProcess_Operator_Perform(swigCPtr, this,  ShapeProcess_Context.getCPtr(context) , context);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeProcess_Operator_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeProcess_Operator_get_type_descriptor(), true );
  }

  public static  ShapeProcess_Operator  DownCast( Standard_Transient  T) {
    return new ShapeProcess_Operator ( OCCwrapJavaJNI.ShapeProcess_Operator_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeProcess_Operator_TypeOf(), true );
  }

}
