package opencascade;

/**
 *  This class implement a variationnal spline algorithm able
 *  to define a two variable function satisfying some constraints
 *  and minimizing an energy like criterion.
 */
public class Plate_Plate {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Plate_Plate(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Plate_Plate(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Plate_Plate obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (Plate_Plate ptr) { Ptr = ptr; }
    public Plate_Plate AsReference () { return Ptr; }
    public Plate_Plate AsCopy () { return Ptr.MakeCopy(); }
    public Plate_Plate Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Plate_Plate(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Plate_Plate() {
    this(OCCwrapJavaJNI.new_Plate_Plate__SWIG_0(), true);
  }

  public Plate_Plate( Plate_Plate  Ref) {
    this(OCCwrapJavaJNI.new_Plate_Plate__SWIG_1(Plate_Plate.getCPtr(Ref), Ref), true);
  }

  public Plate_Plate Copy( Plate_Plate  Ref) {
    Plate_Plate ret = new Plate_Plate(OCCwrapJavaJNI.Plate_Plate_Copy(swigCPtr, this, Plate_Plate.getCPtr(Ref), Ref), false, this);
    return ret; //new Plate_Plate.CRef (ret);
  }

  public void Load( Plate_PinpointConstraint  PConst) {
    OCCwrapJavaJNI.Plate_Plate_Load__SWIG_0(swigCPtr, this, Plate_PinpointConstraint.getCPtr(PConst), PConst);
  }

  public void Load( Plate_LinearXYZConstraint  LXYZConst) {
    OCCwrapJavaJNI.Plate_Plate_Load__SWIG_1(swigCPtr, this, Plate_LinearXYZConstraint.getCPtr(LXYZConst), LXYZConst);
  }

  public void Load( Plate_LinearScalarConstraint  LScalarConst) {
    OCCwrapJavaJNI.Plate_Plate_Load__SWIG_2(swigCPtr, this, Plate_LinearScalarConstraint.getCPtr(LScalarConst), LScalarConst);
  }

  public void Load( Plate_GlobalTranslationConstraint  GTConst) {
    OCCwrapJavaJNI.Plate_Plate_Load__SWIG_3(swigCPtr, this, Plate_GlobalTranslationConstraint.getCPtr(GTConst), GTConst);
  }

  public void Load( Plate_LineConstraint  LConst) {
    OCCwrapJavaJNI.Plate_Plate_Load__SWIG_4(swigCPtr, this, Plate_LineConstraint.getCPtr(LConst), LConst);
  }

  public void Load( Plate_PlaneConstraint  PConst) {
    OCCwrapJavaJNI.Plate_Plate_Load__SWIG_5(swigCPtr, this, Plate_PlaneConstraint.getCPtr(PConst), PConst);
  }

  public void Load( Plate_SampledCurveConstraint  SCConst) {
    OCCwrapJavaJNI.Plate_Plate_Load__SWIG_6(swigCPtr, this, Plate_SampledCurveConstraint.getCPtr(SCConst), SCConst);
  }

  public void Load( Plate_GtoCConstraint  GtoCConst) {
    OCCwrapJavaJNI.Plate_Plate_Load__SWIG_7(swigCPtr, this, Plate_GtoCConstraint.getCPtr(GtoCConst), GtoCConst);
  }

  public void Load( Plate_FreeGtoCConstraint  FGtoCConst) {
    OCCwrapJavaJNI.Plate_Plate_Load__SWIG_8(swigCPtr, this, Plate_FreeGtoCConstraint.getCPtr(FGtoCConst), FGtoCConst);
  }

  public void SolveTI(int ord, double anisotropie) {
    OCCwrapJavaJNI.Plate_Plate_SolveTI__SWIG_0(swigCPtr, this, ord, anisotropie);
  }

  public void SolveTI(int ord) {
    OCCwrapJavaJNI.Plate_Plate_SolveTI__SWIG_1(swigCPtr, this, ord);
  }

  public void SolveTI() {
    OCCwrapJavaJNI.Plate_Plate_SolveTI__SWIG_2(swigCPtr, this);
  }

  /**
   *  returns True if all has been correctly done.
   */
  public long IsDone() {
    return OCCwrapJavaJNI.Plate_Plate_IsDone(swigCPtr, this);
  }

  public void destroy() {
    OCCwrapJavaJNI.Plate_Plate_destroy(swigCPtr, this);
  }

  /**
   *  reset the Plate in the initial state
   *  ( same as after Create())
   */
  public void Init() {
    OCCwrapJavaJNI.Plate_Plate_Init(swigCPtr, this);
  }

  public gp_XYZ Evaluate( gp_XY  point2d) {
    return new gp_XYZ(OCCwrapJavaJNI.Plate_Plate_Evaluate(swigCPtr, this, gp_XY.getCPtr(point2d), point2d), true);
  }

  public gp_XYZ EvaluateDerivative( gp_XY  point2d, int iu, int iv) {
    return new gp_XYZ(OCCwrapJavaJNI.Plate_Plate_EvaluateDerivative(swigCPtr, this, gp_XY.getCPtr(point2d), point2d, iu, iv), true);
  }

  public void CoefPol( TColgp_HArray2OfXYZ  Coefs) {
    OCCwrapJavaJNI.Plate_Plate_CoefPol(swigCPtr, this,  TColgp_HArray2OfXYZ.getCPtr(Coefs) , Coefs);
  }

  public void SetPolynomialPartOnly(long PPOnly) {
    OCCwrapJavaJNI.Plate_Plate_SetPolynomialPartOnly__SWIG_0(swigCPtr, this, PPOnly);
  }

  public void SetPolynomialPartOnly() {
    OCCwrapJavaJNI.Plate_Plate_SetPolynomialPartOnly__SWIG_1(swigCPtr, this);
  }

  public int Continuity() {
    return OCCwrapJavaJNI.Plate_Plate_Continuity(swigCPtr, this);
  }

  public void UVBox(double[] UMin, double[] UMax, double[] VMin, double[] VMax) {
    OCCwrapJavaJNI.Plate_Plate_UVBox(swigCPtr, this, UMin, UMax, VMin, VMax);
  }

  public void UVConstraints( TColgp_SequenceOfXY  Seq) {
    OCCwrapJavaJNI.Plate_Plate_UVConstraints(swigCPtr, this, TColgp_SequenceOfXY.getCPtr(Seq), Seq);
  }

}
