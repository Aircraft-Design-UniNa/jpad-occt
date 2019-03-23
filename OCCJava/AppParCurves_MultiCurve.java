package opencascade;

/**
 *  This class describes a MultiCurve approximating a Multiline.
 *  As a Multiline is a set of n lines, a MultiCurve is a set
 *  of n curves. These curves are Bezier curves.
 *  A MultiCurve is composed of m MultiPoint.
 *  The approximating degree of these n curves is the same for
 *  each one.
 * 
 *  Example of a MultiCurve composed of MultiPoints:
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
 */
public class AppParCurves_MultiCurve {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  AppParCurves_MultiCurve(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  AppParCurves_MultiCurve(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(AppParCurves_MultiCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_AppParCurves_MultiCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  returns an indefinite MultiCurve.
   */
  public AppParCurves_MultiCurve() {
    this(OCCwrapJavaJNI.new_AppParCurves_MultiCurve__SWIG_0(), true);
  }

  /**
   *  creates a MultiCurve, describing Bezier curves all
   *  containing the same number of MultiPoint.
   *  An exception is raised if Degree < 0.
   */
  public AppParCurves_MultiCurve(int NbPol) {
    this(OCCwrapJavaJNI.new_AppParCurves_MultiCurve__SWIG_1(NbPol), true);
  }

  /**
   *  creates a MultiCurve, describing Bezier curves all
   *  containing the same number of MultiPoint.
   *  Each MultiPoint must have NbCurves Poles.
   */
  public AppParCurves_MultiCurve( AppParCurves_Array1OfMultiPoint  tabMU) {
    this(OCCwrapJavaJNI.new_AppParCurves_MultiCurve__SWIG_2(AppParCurves_Array1OfMultiPoint.getCPtr(tabMU), tabMU), true);
  }

  /**
   *  The number of poles of the MultiCurve
   *  will be set to <nbPoles>.
   */
  public void SetNbPoles(int nbPoles) {
    OCCwrapJavaJNI.AppParCurves_MultiCurve_SetNbPoles(swigCPtr, this, nbPoles);
  }

  /**
   *  sets the MultiPoint of range Index to the value
   *  <MPoint>.
   *  An exception is raised if Index <0 or Index >NbMPoint.
   */
  public void SetValue(int Index,  AppParCurves_MultiPoint  MPoint) {
    OCCwrapJavaJNI.AppParCurves_MultiCurve_SetValue(swigCPtr, this, Index, AppParCurves_MultiPoint.getCPtr(MPoint), MPoint);
  }

  /**
   *  Returns the number of curves resulting from the
   *  approximation of a MultiLine.
   */
  public int NbCurves() {
    return OCCwrapJavaJNI.AppParCurves_MultiCurve_NbCurves(swigCPtr, this);
  }

  /**
   *  Returns the number of poles on curves resulting from the approximation of a MultiLine.
   */
  public int NbPoles() {
    return OCCwrapJavaJNI.AppParCurves_MultiCurve_NbPoles(swigCPtr, this);
  }

  /**
   *  returns the degree of the curves.
   */
  public int Degree() {
    return OCCwrapJavaJNI.AppParCurves_MultiCurve_Degree(swigCPtr, this);
  }

  /**
   *  returns the dimension of the CuIndex curve.
   *  An exception is raised if CuIndex<0 or CuIndex>NbCurves.
   */
  public int Dimension(int CuIndex) {
    return OCCwrapJavaJNI.AppParCurves_MultiCurve_Dimension(swigCPtr, this, CuIndex);
  }

  /**
   *  returns the Pole array of the curve of range CuIndex.
   *  An exception is raised if the dimension of the curve
   *  is 2d.
   */
  public void Curve(int CuIndex,  TColgp_Array1OfPnt  TabPnt) {
    OCCwrapJavaJNI.AppParCurves_MultiCurve_Curve__SWIG_0(swigCPtr, this, CuIndex, TColgp_Array1OfPnt.getCPtr(TabPnt), TabPnt);
  }

  /**
   *  returns the Pole array of the curve of range CuIndex.
   *  An exception is raised if the dimension of the curve
   *  is 3d.
   */
  public void Curve(int CuIndex,  TColgp_Array1OfPnt2d  TabPnt) {
    OCCwrapJavaJNI.AppParCurves_MultiCurve_Curve__SWIG_1(swigCPtr, this, CuIndex, TColgp_Array1OfPnt2d.getCPtr(TabPnt), TabPnt);
  }

  /**
   *  returns the Index MultiPoint.
   *  An exception is raised if Index <0 or Index >Degree+1.
   */
  public  AppParCurves_MultiPoint  Value(int Index) {
    AppParCurves_MultiPoint ret = new AppParCurves_MultiPoint(OCCwrapJavaJNI.AppParCurves_MultiCurve_Value__SWIG_0(swigCPtr, this, Index), false, this);
    return ret;
  }

  /**
   *  returns the Nieme pole of the CuIndex curve.
   *  the curve must be a 3D curve.
   */
  public  gp_Pnt  Pole(int CuIndex, int Nieme) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.AppParCurves_MultiCurve_Pole(swigCPtr, this, CuIndex, Nieme), true);
    return ret;
  }

  /**
   *  returns the Nieme pole of the CuIndex curve.
   *  the curve must be a 2D curve.
   */
  public  gp_Pnt2d  Pole2d(int CuIndex, int Nieme) {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.AppParCurves_MultiCurve_Pole2d(swigCPtr, this, CuIndex, Nieme), true);
    return ret;
  }

  /**
   *  Applies a transformation to the curve of range
   *  <CuIndex>.
   *  newx = x + dx*oldx
   *  newy = y + dy*oldy    for all points of the curve.
   *  newz = z + dz*oldz
   */
  public void Transform(int CuIndex, double x, double dx, double y, double dy, double z, double dz) {
    OCCwrapJavaJNI.AppParCurves_MultiCurve_Transform(swigCPtr, this, CuIndex, x, dx, y, dy, z, dz);
  }

  /**
   *  Applies a transformation to the Curve of range
   *  <CuIndex>.
   *  newx = x + dx*oldx
   *  newy = y + dy*oldy    for all points of the curve.
   */
  public void Transform2d(int CuIndex, double x, double dx, double y, double dy) {
    OCCwrapJavaJNI.AppParCurves_MultiCurve_Transform2d(swigCPtr, this, CuIndex, x, dx, y, dy);
  }

  /**
   *  returns the value of the point with a parameter U
   *  on the Bezier curve number CuIndex.
   *  An exception is raised if CuIndex <0 or > NbCurves.
   *  An exception is raised if the curve dimension is 2d.
   */
  public void Value(int CuIndex, double U, gp_Pnt Pt) {
    OCCwrapJavaJNI.AppParCurves_MultiCurve_Value__SWIG_1(swigCPtr, this, CuIndex, U, gp_Pnt.getCPtr(Pt), Pt);
  }

  /**
   *  returns the value of the point with a parameter U
   *  on the Bezier curve number CuIndex.
   *  An exception is raised if CuIndex <0 or > NbCurves.
   *  An exception is raised if the curve dimension is 3d.
   */
  public void Value(int CuIndex, double U, gp_Pnt2d Pt) {
    OCCwrapJavaJNI.AppParCurves_MultiCurve_Value__SWIG_2(swigCPtr, this, CuIndex, U, gp_Pnt2d.getCPtr(Pt), Pt);
  }

  /**
   *  returns the value of the point with a parameter U
   *  on the Bezier curve number CuIndex.
   *  An exception is raised if CuIndex <0 or > NbCurves.
   *  An exception is raised if the curve dimension is 3d.
   */
  public void D1(int CuIndex, double U, gp_Pnt Pt, gp_Vec V1) {
    OCCwrapJavaJNI.AppParCurves_MultiCurve_D1__SWIG_0(swigCPtr, this, CuIndex, U, gp_Pnt.getCPtr(Pt), Pt, gp_Vec.getCPtr(V1), V1);
  }

  /**
   *  returns the value of the point with a parameter U
   *  on the Bezier curve number CuIndex.
   *  An exception is raised if CuIndex <0 or > NbCurves.
   *  An exception is raised if the curve dimension is 2d.
   */
  public void D1(int CuIndex, double U, gp_Pnt2d Pt, gp_Vec2d V1) {
    OCCwrapJavaJNI.AppParCurves_MultiCurve_D1__SWIG_1(swigCPtr, this, CuIndex, U, gp_Pnt2d.getCPtr(Pt), Pt, gp_Vec2d.getCPtr(V1), V1);
  }

  /**
   *  returns the value of the point with a parameter U
   *  on the Bezier curve number CuIndex.
   *  An exception is raised if CuIndex <0 or > NbCurves.
   *  An exception is raised if the curve dimension is 3d.
   */
  public void D2(int CuIndex, double U, gp_Pnt Pt, gp_Vec V1, gp_Vec V2) {
    OCCwrapJavaJNI.AppParCurves_MultiCurve_D2__SWIG_0(swigCPtr, this, CuIndex, U, gp_Pnt.getCPtr(Pt), Pt, gp_Vec.getCPtr(V1), V1, gp_Vec.getCPtr(V2), V2);
  }

  /**
   *  returns the value of the point with a parameter U
   *  on the Bezier curve number CuIndex.
   *  An exception is raised if CuIndex <0 or > NbCurves.
   *  An exception is raised if the curve dimension is 2d.
   */
  public void D2(int CuIndex, double U, gp_Pnt2d Pt, gp_Vec2d V1, gp_Vec2d V2) {
    OCCwrapJavaJNI.AppParCurves_MultiCurve_D2__SWIG_1(swigCPtr, this, CuIndex, U, gp_Pnt2d.getCPtr(Pt), Pt, gp_Vec2d.getCPtr(V1), V1, gp_Vec2d.getCPtr(V2), V2);
  }

  /**
   *  Prints on the stream o information on the current
   *  state of the object.
   *  Is used to redefine the operator <<.
   */
  public void Dump(SWIGTYPE_p_Standard_OStream o) {
    OCCwrapJavaJNI.AppParCurves_MultiCurve_Dump(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(o));
  }

}
