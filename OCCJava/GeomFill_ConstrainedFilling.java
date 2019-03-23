package opencascade;

/**
 *  An algorithm for constructing a BSpline surface filled
 *  from a series of boundaries which serve as path
 *  constraints and optionally, as tangency constraints.
 *  The algorithm accepts three or four curves as the
 *  boundaries of the target surface.
 *  The only FillingStyle used is Coons.
 *  A ConstrainedFilling object provides a framework for:
 *  -   defining the boundaries of the surface
 *  -   implementing the construction algorithm
 *  -   consulting the result.
 *  Warning
 *  This surface filling algorithm is specifically designed to
 *  be used in connection with fillets. Satisfactory results
 *  cannot be guaranteed for other uses.
 */
public class GeomFill_ConstrainedFilling {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GeomFill_ConstrainedFilling(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GeomFill_ConstrainedFilling(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GeomFill_ConstrainedFilling obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomFill_ConstrainedFilling(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructs an empty framework for filling a surface from boundaries.
   *  The boundaries of the surface will be defined, and the
   *  surface will be built by using the function Init.
   *  The surface will respect the following constraints:
   *  -   its degree will not be greater than MaxDeg
   *  -   the maximum number of segments MaxSeg which
   *  BSpline surfaces can have.
   */
  public GeomFill_ConstrainedFilling(int MaxDeg, int MaxSeg) {
    this(OCCwrapJavaJNI.new_GeomFill_ConstrainedFilling(MaxDeg, MaxSeg), true);
  }

  public void Init( GeomFill_Boundary  B1,  GeomFill_Boundary  B2,  GeomFill_Boundary  B3, long NoCheck) {
    OCCwrapJavaJNI.GeomFill_ConstrainedFilling_Init__SWIG_0(swigCPtr, this,  GeomFill_Boundary.getCPtr(B1) , B1,  GeomFill_Boundary.getCPtr(B2) , B2,  GeomFill_Boundary.getCPtr(B3) , B3, NoCheck);
  }

  /**
   *  Constructs a BSpline surface filled from the series of
   *  boundaries B1, B2, B3 and, if need be, B4, which serve:
   *  -   as path constraints
   *  -   and optionally, as tangency constraints if they are
   *  GeomFill_BoundWithSurf curves.
   *  The boundaries may be given in any order: they are
   *  classified and if necessary, reversed and reparameterized.
   *  The surface will also respect the following constraints:
   *  -   its degree will not be greater than the maximum
   *  degree defined at the time of construction of this framework, and
   *  -   the maximum number of segments MaxSeg which BSpline surfaces can have
   */
  public void Init( GeomFill_Boundary  B1,  GeomFill_Boundary  B2,  GeomFill_Boundary  B3) {
    OCCwrapJavaJNI.GeomFill_ConstrainedFilling_Init__SWIG_1(swigCPtr, this,  GeomFill_Boundary.getCPtr(B1) , B1,  GeomFill_Boundary.getCPtr(B2) , B2,  GeomFill_Boundary.getCPtr(B3) , B3);
  }

  public void Init( GeomFill_Boundary  B1,  GeomFill_Boundary  B2,  GeomFill_Boundary  B3,  GeomFill_Boundary  B4, long NoCheck) {
    OCCwrapJavaJNI.GeomFill_ConstrainedFilling_Init__SWIG_2(swigCPtr, this,  GeomFill_Boundary.getCPtr(B1) , B1,  GeomFill_Boundary.getCPtr(B2) , B2,  GeomFill_Boundary.getCPtr(B3) , B3,  GeomFill_Boundary.getCPtr(B4) , B4, NoCheck);
  }

  public void Init( GeomFill_Boundary  B1,  GeomFill_Boundary  B2,  GeomFill_Boundary  B3,  GeomFill_Boundary  B4) {
    OCCwrapJavaJNI.GeomFill_ConstrainedFilling_Init__SWIG_3(swigCPtr, this,  GeomFill_Boundary.getCPtr(B1) , B1,  GeomFill_Boundary.getCPtr(B2) , B2,  GeomFill_Boundary.getCPtr(B3) , B3,  GeomFill_Boundary.getCPtr(B4) , B4);
  }

  /**
   *  Allows to modify domain on witch the blending function
   *  associated to  the constrained boundary B  will propag
   *  the  influence   of the  field   of  tangency.  Can be
   *  usefull to  reduce  influence of boundaries  on whitch
   *  the Coons compatibility  conditions are not respected.
   *  l is a  relative value of  the parametric range of  B.
   *  Default value for l is 1 (used in Init).
   *  Warning: Must be called after  Init with a constrained boundary
   *  used in the call to Init.
   */
  public void SetDomain(double l,  GeomFill_BoundWithSurf  B) {
    OCCwrapJavaJNI.GeomFill_ConstrainedFilling_SetDomain(swigCPtr, this, l,  GeomFill_BoundWithSurf.getCPtr(B) , B);
  }

  /**
   *  Computes the  new poles  of  the surface using the  new
   *  blending  functions set by several calls to SetDomain.
   */
  public void ReBuild() {
    OCCwrapJavaJNI.GeomFill_ConstrainedFilling_ReBuild(swigCPtr, this);
  }

  public  GeomFill_Boundary  Boundary(int I) {
    return new GeomFill_Boundary ( OCCwrapJavaJNI.GeomFill_ConstrainedFilling_Boundary(swigCPtr, this, I), true );
  }

  public  Geom_BSplineSurface  Surface() {
    return new Geom_BSplineSurface ( OCCwrapJavaJNI.GeomFill_ConstrainedFilling_Surface(swigCPtr, this), true );
  }

  /**
   *  Internal use for Advmath approximation call.
   */
  public int Eval(double W, int Ord, double[] Result) {
    return OCCwrapJavaJNI.GeomFill_ConstrainedFilling_Eval(swigCPtr, this, W, Ord, Result);
  }

  /**
   *  Computes the fields of tangents on 30 points along the
   *  bound  I, these  are  not the  constraint tangents but
   *  gives an idea of the coonsAlgPatch regularity.
   */
  public void CheckCoonsAlgPatch(int I) {
    OCCwrapJavaJNI.GeomFill_ConstrainedFilling_CheckCoonsAlgPatch(swigCPtr, this, I);
  }

  /**
   *  Computes  the fields  of tangents  and  normals on  30
   *  points along the bound  I, draw them, and computes the
   *  max dot product that must be near than 0.
   */
  public void CheckTgteField(int I) {
    OCCwrapJavaJNI.GeomFill_ConstrainedFilling_CheckTgteField(swigCPtr, this, I);
  }

  /**
   *  Computes  values  and normals  along  the bound  I and
   *  compare  them to the  approx  result curves (bound and
   *  tgte field) , draw  the normals and tangents.
   */
  public void CheckApprox(int I) {
    OCCwrapJavaJNI.GeomFill_ConstrainedFilling_CheckApprox(swigCPtr, this, I);
  }

  /**
   *  Computes values and normals along the  bound I on both
   *  constraint  surface    and result  surface,  draw  the
   *  normals, and  computes the max distance between values
   *  and the max angle  between normals.
   */
  public void CheckResult(int I) {
    OCCwrapJavaJNI.GeomFill_ConstrainedFilling_CheckResult(swigCPtr, this, I);
  }

}
