package opencascade;

/**
 *  This class describes Points composing a MultiPoint.
 *  These points can be 2D or 3D. The user must first give the
 *  3D Points and then the 2D Points.
 *  They are Poles of a Bezier Curve.
 *  This class is used either to define data input or
 *  results when performing the approximation of several lines in parallel.
 */
public class AppParCurves_MultiPoint {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  AppParCurves_MultiPoint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  AppParCurves_MultiPoint(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(AppParCurves_MultiPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_AppParCurves_MultiPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  creates an indefinite MultiPoint.
   */
  public AppParCurves_MultiPoint() {
    this(OCCwrapJavaJNI.new_AppParCurves_MultiPoint__SWIG_0(), true);
  }

  /**
   *  constructs a set of Points used to approximate a
   *  Multiline.
   *  These Points can be of 2 or 3 dimensions.
   *  Points will be initialized with SetPoint and SetPoint2d.
   *  NbPoints is the number of 3D Points.
   *  NbPoints2d is the number of 2D Points.
   */
  public AppParCurves_MultiPoint(int NbPoints, int NbPoints2d) {
    this(OCCwrapJavaJNI.new_AppParCurves_MultiPoint__SWIG_1(NbPoints, NbPoints2d), true);
  }

  /**
   *  creates a MultiPoint only composed of 3D points.
   */
  public AppParCurves_MultiPoint( TColgp_Array1OfPnt  tabP) {
    this(OCCwrapJavaJNI.new_AppParCurves_MultiPoint__SWIG_2(TColgp_Array1OfPnt.getCPtr(tabP), tabP), true);
  }

  /**
   *  creates a MultiPoint only composed of 2D points.
   */
  public AppParCurves_MultiPoint( TColgp_Array1OfPnt2d  tabP2d) {
    this(OCCwrapJavaJNI.new_AppParCurves_MultiPoint__SWIG_3(TColgp_Array1OfPnt2d.getCPtr(tabP2d), tabP2d), true);
  }

  /**
   *  constructs a set of Points used to approximate a
   *  Multiline.
   *  These Points can be of 2 or 3 dimensions.
   *  Points will be initialized with SetPoint and SetPoint2d.
   *  NbPoints is the total number of Points.
   */
  public AppParCurves_MultiPoint( TColgp_Array1OfPnt  tabP,  TColgp_Array1OfPnt2d  tabP2d) {
    this(OCCwrapJavaJNI.new_AppParCurves_MultiPoint__SWIG_4(TColgp_Array1OfPnt.getCPtr(tabP), tabP, TColgp_Array1OfPnt2d.getCPtr(tabP2d), tabP2d), true);
  }

  /**
   *  the 3d Point of range Index of this MultiPoint is
   *  set to <Point>.
   *  An exception is raised if Index < 0 or
   *  Index > number of 3d Points.
   */
  public void SetPoint(int Index,  gp_Pnt  Point) {
    OCCwrapJavaJNI.AppParCurves_MultiPoint_SetPoint(swigCPtr, this, Index, gp_Pnt.getCPtr(Point), Point);
  }

  /**
   *  returns the 3d Point of range Index.
   *  An exception is raised if Index < 0 or
   *  Index < number of 3d Points.
   */
  public  gp_Pnt  Point(int Index) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.AppParCurves_MultiPoint_Point(swigCPtr, this, Index), true);
    return ret;
  }

  /**
   *  The 2d Point of range Index is set to <Point>.
   *  An exception is raised if Index > 3d Points or
   *  Index > total number of Points.
   */
  public void SetPoint2d(int Index,  gp_Pnt2d  Point) {
    OCCwrapJavaJNI.AppParCurves_MultiPoint_SetPoint2d(swigCPtr, this, Index, gp_Pnt2d.getCPtr(Point), Point);
  }

  /**
   *  returns the 2d Point of range Index.
   *  An exception is raised if index <= number of
   *  3d Points or Index > total number of Points.
   */
  public  gp_Pnt2d  Point2d(int Index) {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.AppParCurves_MultiPoint_Point2d(swigCPtr, this, Index), true);
    return ret;
  }

  /**
   *  returns the dimension of the point of range Index.
   *  An exception is raised if Index <0 or Index > NbCurves.
   */
  public int Dimension(int Index) {
    return OCCwrapJavaJNI.AppParCurves_MultiPoint_Dimension(swigCPtr, this, Index);
  }

  /**
   *  returns the number of points of dimension 3D.
   */
  public int NbPoints() {
    return OCCwrapJavaJNI.AppParCurves_MultiPoint_NbPoints(swigCPtr, this);
  }

  /**
   *  returns the number of points of dimension 2D.
   */
  public int NbPoints2d() {
    return OCCwrapJavaJNI.AppParCurves_MultiPoint_NbPoints2d(swigCPtr, this);
  }

  /**
   *  Applies a transformation to the curve of range
   *  <CuIndex>.
   *  newx = x + dx*oldx
   *  newy = y + dy*oldy    for all points of the curve.
   *  newz = z + dz*oldz
   */
  public void Transform(int CuIndex, double x, double dx, double y, double dy, double z, double dz) {
    OCCwrapJavaJNI.AppParCurves_MultiPoint_Transform(swigCPtr, this, CuIndex, x, dx, y, dy, z, dz);
  }

  /**
   *  Applies a transformation to the Curve of range
   *  <CuIndex>.
   *  newx = x + dx*oldx
   *  newy = y + dy*oldy    for all points of the curve.
   */
  public void Transform2d(int CuIndex, double x, double dx, double y, double dy) {
    OCCwrapJavaJNI.AppParCurves_MultiPoint_Transform2d(swigCPtr, this, CuIndex, x, dx, y, dy);
  }

  /**
   *  Prints on the stream o information on the current
   *  state of the object.
   *  Is used to redefine the operator <<.
   */
  public void Dump(SWIGTYPE_p_Standard_OStream o) {
    OCCwrapJavaJNI.AppParCurves_MultiPoint_Dump(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(o));
  }

}
