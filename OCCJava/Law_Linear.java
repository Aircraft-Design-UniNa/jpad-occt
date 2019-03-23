package opencascade;

/**
 *  Describes an linear evolution law.
 */
public class Law_Linear extends Law_Function {
  Law_Linear(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Constructs an empty linear evolution law.
   */
  public Law_Linear() {
    this(OCCwrapJavaJNI.new_Law_Linear(), true);
  }

  /**
   *  Defines this linear evolution law by assigning both:
   *  -   the bounds Pdeb and Pfin of the parameter, and
   *  -   the values Valdeb and Valfin of the function at these
   *  two parametric bounds.
   */
  public void Set(double Pdeb, double Valdeb, double Pfin, double Valfin) {
    OCCwrapJavaJNI.Law_Linear_Set(swigCPtr, this, Pdeb, Valdeb, Pfin, Valfin);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Law_Linear_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Law_Linear_get_type_descriptor(), true );
  }

  public static  Law_Linear  DownCast( Standard_Transient  T) {
    return new Law_Linear ( OCCwrapJavaJNI.Law_Linear_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Law_Linear_TypeOf(), true );
  }

}
