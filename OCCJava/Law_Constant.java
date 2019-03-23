package opencascade;

/**
 *  Loi constante
 */
public class Law_Constant extends Law_Function {
  Law_Constant(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public Law_Constant() {
    this(OCCwrapJavaJNI.new_Law_Constant(), true);
  }

  /**
   *  Set the radius and the range of the constant Law.
   */
  public void Set(double Radius, double PFirst, double PLast) {
    OCCwrapJavaJNI.Law_Constant_Set(swigCPtr, this, Radius, PFirst, PLast);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Law_Constant_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Law_Constant_get_type_descriptor(), true );
  }

  public static  Law_Constant  DownCast( Standard_Transient  T) {
    return new Law_Constant ( OCCwrapJavaJNI.Law_Constant_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Law_Constant_TypeOf(), true );
  }

}
