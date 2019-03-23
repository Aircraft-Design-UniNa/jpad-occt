package opencascade;

/**
 *  Defines a curve which consists of several segments.
 *  Implements basic interface to it.
 */
public class ShapeExtend_ComplexCurve extends Geom_Curve {
  ShapeExtend_ComplexCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns number of curves
   */
  public int NbCurves() {
    return OCCwrapJavaJNI.ShapeExtend_ComplexCurve_NbCurves(swigCPtr, this);
  }

  public  Geom_Curve  Curve(int index) {
    return new Geom_Curve ( OCCwrapJavaJNI.ShapeExtend_ComplexCurve_Curve(swigCPtr, this, index), true );
  }

  /**
   *  Returns number of the curve for the given parameter U
   *  and local paramete r UOut for the found curve
   */
  public int LocateParameter(double U, double[] UOut) {
    return OCCwrapJavaJNI.ShapeExtend_ComplexCurve_LocateParameter(swigCPtr, this, U, UOut);
  }

  /**
   *  Returns global parameter for the whole curve according
   *  to the segment and local parameter on it
   */
  public double LocalToGlobal(int index, double Ulocal) {
    return OCCwrapJavaJNI.ShapeExtend_ComplexCurve_LocalToGlobal(swigCPtr, this, index, Ulocal);
  }

  /**
   *  Returns scale factor for recomputing of deviatives.
   */
  public double GetScaleFactor(int ind) {
    return OCCwrapJavaJNI.ShapeExtend_ComplexCurve_GetScaleFactor(swigCPtr, this, ind);
  }

  /**
   *  Checks geometrical connectivity of the curves, including
   *  closure (sets fields myClosed)
   */
  public long CheckConnectivity(double Preci) {
    return OCCwrapJavaJNI.ShapeExtend_ComplexCurve_CheckConnectivity(swigCPtr, this, Preci);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeExtend_ComplexCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeExtend_ComplexCurve_get_type_descriptor(), true );
  }

  public static  ShapeExtend_ComplexCurve  DownCast( Standard_Transient  T) {
    return new ShapeExtend_ComplexCurve ( OCCwrapJavaJNI.ShapeExtend_ComplexCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeExtend_ComplexCurve_TypeOf(), true );
  }

}
