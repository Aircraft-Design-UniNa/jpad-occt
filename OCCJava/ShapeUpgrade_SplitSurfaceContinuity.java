package opencascade;

/**
 *  Splits a Surface with a continuity criterion.
 *  At the present moment C1 criterion is used only.
 *  This tool works with tolerance. If C0 surface can be corrected
 *  at a knot with given tolerance then the surface is corrected,
 *  otherwise it is spltted at that knot.
 */
public class ShapeUpgrade_SplitSurfaceContinuity extends ShapeUpgrade_SplitSurface {
  ShapeUpgrade_SplitSurfaceContinuity(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor.
   */
  public ShapeUpgrade_SplitSurfaceContinuity() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_SplitSurfaceContinuity(), true);
  }

  /**
   *  Sets criterion for splitting.
   */
  public void SetCriterion(GeomAbs_Shape Criterion) {
    OCCwrapJavaJNI.ShapeUpgrade_SplitSurfaceContinuity_SetCriterion(swigCPtr, this, Criterion.swigValue());
  }

  /**
   *  Sets tolerance.
   */
  public void SetTolerance(double Tol) {
    OCCwrapJavaJNI.ShapeUpgrade_SplitSurfaceContinuity_SetTolerance(swigCPtr, this, Tol);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_SplitSurfaceContinuity_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_SplitSurfaceContinuity_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_SplitSurfaceContinuity  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_SplitSurfaceContinuity ( OCCwrapJavaJNI.ShapeUpgrade_SplitSurfaceContinuity_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_SplitSurfaceContinuity_TypeOf(), true );
  }

}
