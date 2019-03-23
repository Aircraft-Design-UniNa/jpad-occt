package opencascade;

/**
 *  This class describes a MultiBSpCurve approximating a Multiline.
 *  Just as a Multiline is a set of a given number of lines, a MultiBSpCurve is a set
 *  of a specified number of bsplines defined by:
 *  -   A specified number of MultiPoints - the poles of a specified number of curves
 *  -   The degree of approximation identical for each of the specified number of curves.
 * 
 *  Example of a MultiBSpCurve composed of a specified number of MultiPoints:
 * 
 *  P1______P2_____P3______P4________........_____PNbMPoints
 * 
 *  Q1______Q2_____Q3______Q4________........_____QNbMPoints
 *  .                                               .
 *  .                                               .
 *  .                                               .
 *  R1______R2_____R3______R4________........_____RNbMPoints
 * 
 *  Pi, Qi, ..., Ri are points of dimension 2 or 3.
 * 
 *  (Pi, Qi, ...Ri), i= 1,...NbPoles are MultiPoints.
 *  each MultiPoint has got NbPol Poles.
 *  MultiBSpCurves are created by the SplineValue method in the ComputeLine
 *  class, and by the Value method in TheVariational class. MultiBSpCurve
 *  provides the information required to create the BSpline defined by the approximation.
 */
public class AppParCurves_MultiBSpCurve extends AppParCurves_MultiCurve {

  private long swigCPtr;
  AppParCurves_MultiBSpCurve(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.AppParCurves_MultiBSpCurve_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  AppParCurves_MultiBSpCurve(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.AppParCurves_MultiBSpCurve_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(AppParCurves_MultiBSpCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_AppParCurves_MultiBSpCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  returns an indefinite MultiBSpCurve.
   */
  public AppParCurves_MultiBSpCurve() {
    this(OCCwrapJavaJNI.new_AppParCurves_MultiBSpCurve__SWIG_0(), true);
  }

  /**
   *  creates a MultiBSpCurve, describing BSpline curves all
   *  containing the same number of MultiPoint.
   *  An exception is raised if Degree < 0.
   */
  public AppParCurves_MultiBSpCurve(int NbPol) {
    this(OCCwrapJavaJNI.new_AppParCurves_MultiBSpCurve__SWIG_1(NbPol), true);
  }

  /**
   *  creates a MultiBSpCurve, describing BSpline curves all
   *  containing the same number of MultiPoint.
   *  Each MultiPoint must have NbCurves Poles.
   */
  public AppParCurves_MultiBSpCurve( AppParCurves_Array1OfMultiPoint  tabMU,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults) {
    this(OCCwrapJavaJNI.new_AppParCurves_MultiBSpCurve__SWIG_2(AppParCurves_Array1OfMultiPoint.getCPtr(tabMU), tabMU, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults), true);
  }

  /**
   *  creates a MultiBSpCurve, describing BSpline
   *  curves, taking control points from <SC>.
   */
  public AppParCurves_MultiBSpCurve( AppParCurves_MultiCurve  SC,  TColStd_Array1OfReal  Knots,  TColStd_Array1OfInteger  Mults) {
    this(OCCwrapJavaJNI.new_AppParCurves_MultiBSpCurve__SWIG_3(AppParCurves_MultiCurve.getCPtr(SC), SC, TColStd_Array1OfReal.getCPtr(Knots), Knots, TColStd_Array1OfInteger.getCPtr(Mults), Mults), true);
  }

  /**
   *  Knots of the multiBSpCurve are assigned to <theknots>.
   */
  public void SetKnots( TColStd_Array1OfReal  theKnots) {
    OCCwrapJavaJNI.AppParCurves_MultiBSpCurve_SetKnots(swigCPtr, this, TColStd_Array1OfReal.getCPtr(theKnots), theKnots);
  }

  /**
   *  Multiplicities of the multiBSpCurve are assigned
   *  to <theMults>.
   */
  public void SetMultiplicities( TColStd_Array1OfInteger  theMults) {
    OCCwrapJavaJNI.AppParCurves_MultiBSpCurve_SetMultiplicities(swigCPtr, this, TColStd_Array1OfInteger.getCPtr(theMults), theMults);
  }

  /**
   *  Returns an array of Reals containing
   *  the multiplicities of curves resulting from the approximation.
   */
  public  TColStd_Array1OfReal  Knots() {
    TColStd_Array1OfReal ret = new TColStd_Array1OfReal(OCCwrapJavaJNI.AppParCurves_MultiBSpCurve_Knots(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns an array of Reals containing the
   *  multiplicities of curves resulting from the approximation.
   */
  public  TColStd_Array1OfInteger  Multiplicities() {
    TColStd_Array1OfInteger ret = new TColStd_Array1OfInteger(OCCwrapJavaJNI.AppParCurves_MultiBSpCurve_Multiplicities(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  returns the value of the point with a parameter U
   *  on the BSpline curve number CuIndex.
   *  An exception is raised if CuIndex <0 or > NbCurves.
   *  An exception is raised if the curve dimension is 2d.
   */
  public void Value(int CuIndex, double U, gp_Pnt Pt) {
    OCCwrapJavaJNI.AppParCurves_MultiBSpCurve_Value__SWIG_0(swigCPtr, this, CuIndex, U, gp_Pnt.getCPtr(Pt), Pt);
  }

  /**
   *  returns the value of the point with a parameter U
   *  on the BSpline curve number CuIndex.
   *  An exception is raised if CuIndex <0 or > NbCurves.
   *  An exception is raised if the curve dimension is 3d.
   */
  public void Value(int CuIndex, double U, gp_Pnt2d Pt) {
    OCCwrapJavaJNI.AppParCurves_MultiBSpCurve_Value__SWIG_1(swigCPtr, this, CuIndex, U, gp_Pnt2d.getCPtr(Pt), Pt);
  }

  /**
   *  returns the value of the point with a parameter U
   *  on the BSpline curve number CuIndex.
   *  An exception is raised if CuIndex <0 or > NbCurves.
   *  An exception is raised if the curve dimension is 3d.
   */
  public void D1(int CuIndex, double U, gp_Pnt Pt, gp_Vec V1) {
    OCCwrapJavaJNI.AppParCurves_MultiBSpCurve_D1__SWIG_0(swigCPtr, this, CuIndex, U, gp_Pnt.getCPtr(Pt), Pt, gp_Vec.getCPtr(V1), V1);
  }

  /**
   *  returns the value of the point with a parameter U
   *  on the BSpline curve number CuIndex.
   *  An exception is raised if CuIndex <0 or > NbCurves.
   *  An exception is raised if the curve dimension is 2d.
   */
  public void D1(int CuIndex, double U, gp_Pnt2d Pt, gp_Vec2d V1) {
    OCCwrapJavaJNI.AppParCurves_MultiBSpCurve_D1__SWIG_1(swigCPtr, this, CuIndex, U, gp_Pnt2d.getCPtr(Pt), Pt, gp_Vec2d.getCPtr(V1), V1);
  }

  /**
   *  returns the value of the point with a parameter U
   *  on the BSpline curve number CuIndex.
   *  An exception is raised if CuIndex <0 or > NbCurves.
   *  An exception is raised if the curve dimension is 3d.
   */
  public void D2(int CuIndex, double U, gp_Pnt Pt, gp_Vec V1, gp_Vec V2) {
    OCCwrapJavaJNI.AppParCurves_MultiBSpCurve_D2__SWIG_0(swigCPtr, this, CuIndex, U, gp_Pnt.getCPtr(Pt), Pt, gp_Vec.getCPtr(V1), V1, gp_Vec.getCPtr(V2), V2);
  }

  /**
   *  returns the value of the point with a parameter U
   *  on the BSpline curve number CuIndex.
   *  An exception is raised if CuIndex <0 or > NbCurves.
   *  An exception is raised if the curve dimension is 2d.
   */
  public void D2(int CuIndex, double U, gp_Pnt2d Pt, gp_Vec2d V1, gp_Vec2d V2) {
    OCCwrapJavaJNI.AppParCurves_MultiBSpCurve_D2__SWIG_1(swigCPtr, this, CuIndex, U, gp_Pnt2d.getCPtr(Pt), Pt, gp_Vec2d.getCPtr(V1), V1, gp_Vec2d.getCPtr(V2), V2);
  }

}
