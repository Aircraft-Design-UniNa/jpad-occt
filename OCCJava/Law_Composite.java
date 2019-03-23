package opencascade;

/**
 *  Loi  composite constituee  d une liste  de lois de
 *  ranges consecutifs.
 *  Cette implementation un peu lourde permet de reunir
 *  en une seule loi des portions de loi construites de
 *  facon independantes (par exemple en interactif) et
 *  de lancer le walking d un coup a l echelle d une
 *  ElSpine.
 *  CET OBJET REPOND DONC A UN PROBLEME D IMPLEMENTATION
 *  SPECIFIQUE AUX CONGES!!!
 */
public class Law_Composite extends Law_Function {
  Law_Composite(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Construct an empty Law
   */
  public Law_Composite() {
    this(OCCwrapJavaJNI.new_Law_Composite__SWIG_0(), true);
  }

  /**
   *  Construct an empty, trimed Law
   */
  public Law_Composite(double First, double Last, double Tol) {
    this(OCCwrapJavaJNI.new_Law_Composite__SWIG_1(First, Last, Tol), true);
  }

  public  Law_Function  ChangeElementaryLaw(double W) {
    return new Law_Function ( OCCwrapJavaJNI.Law_Composite_ChangeElementaryLaw(swigCPtr, this, W), true );
  }

  public  Law_Laws  ChangeLaws() {
    Law_Laws ret = new Law_Laws(OCCwrapJavaJNI.Law_Composite_ChangeLaws(swigCPtr, this), false, this);
    return ret;
  }

  public long IsPeriodic() {
    return OCCwrapJavaJNI.Law_Composite_IsPeriodic(swigCPtr, this);
  }

  public void SetPeriodic() {
    OCCwrapJavaJNI.Law_Composite_SetPeriodic(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.Law_Composite_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Law_Composite_get_type_descriptor(), true );
  }

  public static  Law_Composite  DownCast( Standard_Transient  T) {
    return new Law_Composite ( OCCwrapJavaJNI.Law_Composite_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Law_Composite_TypeOf(), true );
  }

}
