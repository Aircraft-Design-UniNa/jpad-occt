package opencascade;

/**
 *  Describes a MultiPointConstraint used in a
 *  Multiline. MultiPointConstraints are composed
 *  of several two or three-dimensional points.
 *  The purpose is to define the corresponding
 *  points that share a common constraint in order
 *  to compute the approximation of several lines in parallel.
 *  Notes:
 *  -   The order of points of a MultiPointConstraints is very important.
 *  Users must give 3D points first, and then 2D points.
 *  -   The constraints for the points included in a
 *  MultiPointConstraint are always identical for
 *  all points, including the parameter.
 *  -   If a MultiPointConstraint is a "tangency"
 *  point, the point is also a "passing" point.
 */
public class AppDef_MultiPointConstraint extends AppParCurves_MultiPoint {

  private long swigCPtr;
  AppDef_MultiPointConstraint(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.AppDef_MultiPointConstraint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  AppDef_MultiPointConstraint(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.AppDef_MultiPointConstraint_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(AppDef_MultiPointConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_AppDef_MultiPointConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  creates an undefined MultiPointConstraint.
   */
  public AppDef_MultiPointConstraint() {
    this(OCCwrapJavaJNI.new_AppDef_MultiPointConstraint__SWIG_0(), true);
  }

  /**
   *  constructs a set of Points used to approximate a Multiline.
   *  These Points can be of 2 or 3 dimensions.
   *  Points will be initialized with SetPoint and SetPoint2d.
   */
  public AppDef_MultiPointConstraint(int NbPoints, int NbPoints2d) {
    this(OCCwrapJavaJNI.new_AppDef_MultiPointConstraint__SWIG_1(NbPoints, NbPoints2d), true);
  }

  /**
   *  creates a MultiPoint only composed of 3D points.
   */
  public AppDef_MultiPointConstraint( TColgp_Array1OfPnt  tabP) {
    this(OCCwrapJavaJNI.new_AppDef_MultiPointConstraint__SWIG_2(TColgp_Array1OfPnt.getCPtr(tabP), tabP), true);
  }

  /**
   *  creates a MultiPoint only composed of 2D points.
   */
  public AppDef_MultiPointConstraint( TColgp_Array1OfPnt2d  tabP) {
    this(OCCwrapJavaJNI.new_AppDef_MultiPointConstraint__SWIG_3(TColgp_Array1OfPnt2d.getCPtr(tabP), tabP), true);
  }

  /**
   *  constructs a set of Points used to approximate a Multiline.
   *  These Points can be of 2 or 3 dimensions.
   *  Points will be initialized with SetPoint and SetPoint2d.
   */
  public AppDef_MultiPointConstraint( TColgp_Array1OfPnt  tabP,  TColgp_Array1OfPnt2d  tabP2d) {
    this(OCCwrapJavaJNI.new_AppDef_MultiPointConstraint__SWIG_4(TColgp_Array1OfPnt.getCPtr(tabP), tabP, TColgp_Array1OfPnt2d.getCPtr(tabP2d), tabP2d), true);
  }

  /**
   *  creates a MultiPointConstraint with a constraint of
   *  Curvature.
   *  An exception is raised if
   *  (length of <tabP> + length of <tabP2d> ) is different
   *  from (length of <tabVec> + length of <tabVec2d> ) or
   *  from (length of <tabCur> + length of <tabCur2d> )
   */
  public AppDef_MultiPointConstraint( TColgp_Array1OfPnt  tabP,  TColgp_Array1OfPnt2d  tabP2d,  TColgp_Array1OfVec  tabVec,  TColgp_Array1OfVec2d  tabVec2d,  TColgp_Array1OfVec  tabCur,  TColgp_Array1OfVec2d  tabCur2d) {
    this(OCCwrapJavaJNI.new_AppDef_MultiPointConstraint__SWIG_5(TColgp_Array1OfPnt.getCPtr(tabP), tabP, TColgp_Array1OfPnt2d.getCPtr(tabP2d), tabP2d, TColgp_Array1OfVec.getCPtr(tabVec), tabVec, TColgp_Array1OfVec2d.getCPtr(tabVec2d), tabVec2d, TColgp_Array1OfVec.getCPtr(tabCur), tabCur, TColgp_Array1OfVec2d.getCPtr(tabCur2d), tabCur2d), true);
  }

  /**
   *  creates a MultiPointConstraint with a constraint of
   *  Tangency.
   *  An exception is raised if
   *  (length of <tabP> + length of <tabP2d> ) is different
   *  from (length of <tabVec> + length of <tabVec2d> )
   */
  public AppDef_MultiPointConstraint( TColgp_Array1OfPnt  tabP,  TColgp_Array1OfPnt2d  tabP2d,  TColgp_Array1OfVec  tabVec,  TColgp_Array1OfVec2d  tabVec2d) {
    this(OCCwrapJavaJNI.new_AppDef_MultiPointConstraint__SWIG_6(TColgp_Array1OfPnt.getCPtr(tabP), tabP, TColgp_Array1OfPnt2d.getCPtr(tabP2d), tabP2d, TColgp_Array1OfVec.getCPtr(tabVec), tabVec, TColgp_Array1OfVec2d.getCPtr(tabVec2d), tabVec2d), true);
  }

  /**
   *  creates a MultiPointConstraint only composed of 3d points
   *  with constraints of curvature.
   *  An exception is raised if the length of tabP is different
   *  from the length of tabVec or from tabCur.
   */
  public AppDef_MultiPointConstraint( TColgp_Array1OfPnt  tabP,  TColgp_Array1OfVec  tabVec,  TColgp_Array1OfVec  tabCur) {
    this(OCCwrapJavaJNI.new_AppDef_MultiPointConstraint__SWIG_7(TColgp_Array1OfPnt.getCPtr(tabP), tabP, TColgp_Array1OfVec.getCPtr(tabVec), tabVec, TColgp_Array1OfVec.getCPtr(tabCur), tabCur), true);
  }

  /**
   *  creates a MultiPointConstraint only composed of 3d points
   *  with constraints of tangency.
   *  An exception is raised if the length of tabP is different
   *  from the length of tabVec.
   */
  public AppDef_MultiPointConstraint( TColgp_Array1OfPnt  tabP,  TColgp_Array1OfVec  tabVec) {
    this(OCCwrapJavaJNI.new_AppDef_MultiPointConstraint__SWIG_8(TColgp_Array1OfPnt.getCPtr(tabP), tabP, TColgp_Array1OfVec.getCPtr(tabVec), tabVec), true);
  }

  /**
   *  creates a MultiPointConstraint only composed of 2d points
   *  with constraints of tangency.
   *  An exception is raised if the length of tabP is different
   *  from the length of tabVec2d.
   */
  public AppDef_MultiPointConstraint( TColgp_Array1OfPnt2d  tabP2d,  TColgp_Array1OfVec2d  tabVec2d) {
    this(OCCwrapJavaJNI.new_AppDef_MultiPointConstraint__SWIG_9(TColgp_Array1OfPnt2d.getCPtr(tabP2d), tabP2d, TColgp_Array1OfVec2d.getCPtr(tabVec2d), tabVec2d), true);
  }

  /**
   *  creates a MultiPointConstraint only composed of 2d points
   *  with constraints of curvature.
   *  An exception is raised if the length of tabP is different
   *  from the length of tabVec2d or from tabCur2d.
   */
  public AppDef_MultiPointConstraint( TColgp_Array1OfPnt2d  tabP2d,  TColgp_Array1OfVec2d  tabVec2d,  TColgp_Array1OfVec2d  tabCur2d) {
    this(OCCwrapJavaJNI.new_AppDef_MultiPointConstraint__SWIG_10(TColgp_Array1OfPnt2d.getCPtr(tabP2d), tabP2d, TColgp_Array1OfVec2d.getCPtr(tabVec2d), tabVec2d, TColgp_Array1OfVec2d.getCPtr(tabCur2d), tabCur2d), true);
  }

  /**
   *  sets the value of the tangency of the point of range
   *  Index.
   *  An exception is raised if Index <0 or if Index > number
   *  of 3d points.
   *  An exception is raised if Tang has an incorrect number of
   *  dimensions.
   */
  public void SetTang(int Index,  gp_Vec  Tang) {
    OCCwrapJavaJNI.AppDef_MultiPointConstraint_SetTang(swigCPtr, this, Index, gp_Vec.getCPtr(Tang), Tang);
  }

  /**
   *  returns the tangency value of the point of range Index.
   *  An exception is raised if Index < 0 or if Index > number
   *  of 3d points.
   */
  public gp_Vec Tang(int Index) {
    return new gp_Vec(OCCwrapJavaJNI.AppDef_MultiPointConstraint_Tang(swigCPtr, this, Index), true);
  }

  /**
   *  sets the value of the tangency of the point of range
   *  Index.
   *  An exception is raised if Index <number of 3d points or if
   *  Index > total number of Points
   *  An exception is raised if Tang has an incorrect number of
   *  dimensions.
   */
  public void SetTang2d(int Index,  gp_Vec2d  Tang2d) {
    OCCwrapJavaJNI.AppDef_MultiPointConstraint_SetTang2d(swigCPtr, this, Index, gp_Vec2d.getCPtr(Tang2d), Tang2d);
  }

  /**
   *  returns the tangency value of the point of range Index.
   *  An exception is raised if Index < number  of 3d points or
   *  if Index > total number of points.
   */
  public gp_Vec2d Tang2d(int Index) {
    return new gp_Vec2d(OCCwrapJavaJNI.AppDef_MultiPointConstraint_Tang2d(swigCPtr, this, Index), true);
  }

  /**
   *  Vec sets the value of the normal vector at the
   *  point of index Index. The norm of the normal
   *  vector at the point of position Index is set to the normal curvature.
   *  An exception is raised if Index <0 or if Index > number
   *  of 3d points.
   *  An exception is raised if Curv has an incorrect number of
   *  dimensions.
   */
  public void SetCurv(int Index,  gp_Vec  Curv) {
    OCCwrapJavaJNI.AppDef_MultiPointConstraint_SetCurv(swigCPtr, this, Index, gp_Vec.getCPtr(Curv), Curv);
  }

  /**
   *  returns the normal vector at the point of range Index.
   *  An exception is raised if Index < 0 or if Index > number
   *  of 3d points.
   */
  public gp_Vec Curv(int Index) {
    return new gp_Vec(OCCwrapJavaJNI.AppDef_MultiPointConstraint_Curv(swigCPtr, this, Index), true);
  }

  /**
   *  Vec sets the value of the normal vector at the
   *  point of index Index. The norm of the normal
   *  vector at the point of position Index is set to the normal curvature.
   *  An exception is raised if Index <0 or if Index > number
   *  of 3d points.
   *  An exception is raised if Curv has an incorrect number of
   *  dimensions.
   */
  public void SetCurv2d(int Index,  gp_Vec2d  Curv2d) {
    OCCwrapJavaJNI.AppDef_MultiPointConstraint_SetCurv2d(swigCPtr, this, Index, gp_Vec2d.getCPtr(Curv2d), Curv2d);
  }

  /**
   *  returns the normal vector at the point of range Index.
   *  An exception is raised if Index < 0 or if Index > number
   *  of 3d points.
   */
  public gp_Vec2d Curv2d(int Index) {
    return new gp_Vec2d(OCCwrapJavaJNI.AppDef_MultiPointConstraint_Curv2d(swigCPtr, this, Index), true);
  }

  /**
   *  returns True if the MultiPoint has a tangency value.
   */
  public long IsTangencyPoint() {
    return OCCwrapJavaJNI.AppDef_MultiPointConstraint_IsTangencyPoint(swigCPtr, this);
  }

  /**
   *  returns True if the MultiPoint has a curvature value.
   */
  public long IsCurvaturePoint() {
    return OCCwrapJavaJNI.AppDef_MultiPointConstraint_IsCurvaturePoint(swigCPtr, this);
  }

}
