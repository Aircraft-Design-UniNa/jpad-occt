package opencascade;

/**
 *  Corrects/splits a 2d curve with a continuity criterion.
 *  Tolerance is used to correct the curve at a knot that respects
 *  geometrically the criterion, in order to reduce the
 *  multiplicity of the knot.
 */
public class ShapeUpgrade_SplitCurve3dContinuity extends ShapeUpgrade_SplitCurve3d {
  ShapeUpgrade_SplitCurve3dContinuity(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor.
   */
  public ShapeUpgrade_SplitCurve3dContinuity() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_SplitCurve3dContinuity(), true);
  }

  /**
   *  Sets criterion for splitting.
   */
  public void SetCriterion(GeomAbs_Shape Criterion) {
    OCCwrapJavaJNI.ShapeUpgrade_SplitCurve3dContinuity_SetCriterion(swigCPtr, this, Criterion.swigValue());
  }

  /**
   *  Sets tolerance.
   */
  public void SetTolerance(double Tol) {
    OCCwrapJavaJNI.ShapeUpgrade_SplitCurve3dContinuity_SetTolerance(swigCPtr, this, Tol);
  }

  public  Geom_Curve  GetCurve() {
    return new Geom_Curve ( OCCwrapJavaJNI.ShapeUpgrade_SplitCurve3dContinuity_GetCurve(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_SplitCurve3dContinuity_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_SplitCurve3dContinuity_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_SplitCurve3dContinuity  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_SplitCurve3dContinuity ( OCCwrapJavaJNI.ShapeUpgrade_SplitCurve3dContinuity_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_SplitCurve3dContinuity_TypeOf(), true );
  }

}
