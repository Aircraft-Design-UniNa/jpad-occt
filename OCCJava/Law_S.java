package opencascade;

/**
 *  Describes an "S" evolution law.
 */
public class Law_S extends Law_BSpFunc {
  Law_S(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Constructs an empty "S" evolution law.
   */
  public Law_S() {
    this(OCCwrapJavaJNI.new_Law_S(), true);
  }

  /**
   *  Defines this S evolution law by assigning both:
   *  -   the bounds Pdeb and Pfin of the parameter, and
   *  -   the values Valdeb and Valfin of the function at these
   *  two parametric bounds.
   *  The function is assumed to have the first derivatives
   *  equal to 0 at the two parameter points Pdeb and Pfin.
   */
  public void Set(double Pdeb, double Valdeb, double Pfin, double Valfin) {
    OCCwrapJavaJNI.Law_S_Set__SWIG_0(swigCPtr, this, Pdeb, Valdeb, Pfin, Valfin);
  }

  /**
   *  Defines this S evolution law by assigning
   *  -   the bounds Pdeb and Pfin of the parameter,
   *  -   the values Valdeb and Valfin of the function at these
   *  two parametric bounds, and
   *  -   the values Ddeb and Dfin of the first derivative of the
   *  function at these two parametric bounds.
   */
  public void Set(double Pdeb, double Valdeb, double Ddeb, double Pfin, double Valfin, double Dfin) {
    OCCwrapJavaJNI.Law_S_Set__SWIG_1(swigCPtr, this, Pdeb, Valdeb, Ddeb, Pfin, Valfin, Dfin);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Law_S_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Law_S_get_type_descriptor(), true );
  }

  public static  Law_S  DownCast( Standard_Transient  T) {
    return new Law_S ( OCCwrapJavaJNI.Law_S_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Law_S_TypeOf(), true );
  }

}
