package opencascade;

/**
 *  API Tool for converting shapes with C0 geometry into C1 ones
 */
public class ShapeUpgrade_ShapeDivideContinuity extends ShapeUpgrade_ShapeDivide {

  private long swigCPtr;
  ShapeUpgrade_ShapeDivideContinuity(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideContinuity_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  ShapeUpgrade_ShapeDivideContinuity(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideContinuity_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(ShapeUpgrade_ShapeDivideContinuity obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeUpgrade_ShapeDivideContinuity(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ShapeUpgrade_ShapeDivideContinuity() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_ShapeDivideContinuity__SWIG_0(), true);
  }

  /**
   *  Initialize by a Shape.
   */
  public ShapeUpgrade_ShapeDivideContinuity( TopoDS_Shape  S) {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_ShapeDivideContinuity__SWIG_1(TopoDS_Shape.getCPtr(S), S), true);
  }

  /**
   *  Sets tolerance.
   */
  public void SetTolerance(double Tol) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideContinuity_SetTolerance(swigCPtr, this, Tol);
  }

  /**
   *  Sets tolerance.
   */
  public void SetTolerance2d(double Tol) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideContinuity_SetTolerance2d(swigCPtr, this, Tol);
  }

  /**
   *  Defines a criterion of continuity for the boundary (all the
   *  Wires)
   * 
   *  The possible values are C0, G1, C1, G2, C2, C3, CN The
   *  default is C1 to respect the Cas.Cade Shape Validity.  G1
   *  and G2 are not authorized.
   */
  public void SetBoundaryCriterion(GeomAbs_Shape Criterion) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideContinuity_SetBoundaryCriterion__SWIG_0(swigCPtr, this, Criterion.swigValue());
  }

  public void SetBoundaryCriterion() {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideContinuity_SetBoundaryCriterion__SWIG_1(swigCPtr, this);
  }

  /**
   *  Defines a criterion of continuity for the boundary (all the
   *  pcurves of Wires)
   * 
   *  The possible values are C0, G1, C1, G2, C2, C3, CN The
   *  default is C1 to respect the Cas.Cade Shape Validity.  G1
   *  and G2 are not authorized.
   */
  public void SetPCurveCriterion(GeomAbs_Shape Criterion) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideContinuity_SetPCurveCriterion__SWIG_0(swigCPtr, this, Criterion.swigValue());
  }

  public void SetPCurveCriterion() {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideContinuity_SetPCurveCriterion__SWIG_1(swigCPtr, this);
  }

  /**
   *  Defines a criterion of continuity for the boundary (all the
   *  Wires)
   * 
   *  The possible values are C0, G1, C1, G2, C2, C3, CN The
   *  default is C1 to respect the Cas.Cade Shape Validity.  G1
   *  and G2 are not authorized.
   */
  public void SetSurfaceCriterion(GeomAbs_Shape Criterion) {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideContinuity_SetSurfaceCriterion__SWIG_0(swigCPtr, this, Criterion.swigValue());
  }

  public void SetSurfaceCriterion() {
    OCCwrapJavaJNI.ShapeUpgrade_ShapeDivideContinuity_SetSurfaceCriterion__SWIG_1(swigCPtr, this);
  }

}
