package opencascade;

/**
 *  Composite surface is represented by a grid of surfaces
 *  (patches) connected geometrically. Patches may have different
 *  parametrisation ranges, but they should be parametrised in
 *  the same manner so that parameter of each patch (u,v) can be converted
 *  to global parameter on the whole surface (U,V) with help of linear
 *  transformation:
 * 
 *  for any i,j-th patch
 *  U = Ui + ( u - uijmin ) * ( Ui+1 - Ui ) / ( uijmax - uijmin )
 *  V = Vj + ( v - vijmin ) * ( Vj+1 - Vj ) / ( vijmax - vijmin )
 * 
 *  where
 * 
 *  [uijmin, uijmax] * [ vijmin, vijmax] - parametric range of i,j-th patch,
 * 
 *  Ui (i=1,..,Nu+1), Vi (j=1,..,Nv+1) - values defining global
 *  parametrisation by U and V (correspond to points between patches and
 *  bounds, (Ui,Uj) corresponds to (uijmin,vijmin) on i,j-th patch) and to
 *  (u(i-1)(j-1)max,v(i-1)(j-1)max) on (i-1),(j-1)-th patch.
 * 
 *  Geometrical connectivity is expressed via global parameters:
 *  S[i,j](Ui+1,V) = S[i+1,j](Ui+1,V) for any i, j, V
 *  S[i,j](U,Vj+1) = S[i,j+1](U,Vj+1) for any i, j, U
 *  It is checked with Precision::Confusion() by default.
 * 
 *  NOTE 1: This class is inherited from Geom_Surface in order to
 *  make it more easy to store and deal with it. However, it should
 *  not be passed to standard methods dealing with geometry since
 *  this type is not known to them.
 *  NOTE 2: Not all the inherited methods are implemented, and some are
 *  implemented not in the full form.
 */
public class ShapeExtend_CompositeSurface extends Geom_Surface {
  ShapeExtend_CompositeSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor.
   */
  public ShapeExtend_CompositeSurface() {
    this(OCCwrapJavaJNI.new_ShapeExtend_CompositeSurface__SWIG_0(), true);
  }

  /**
   *  Initializes by a grid of surfaces (calls Init()).
   */
  public ShapeExtend_CompositeSurface( TColGeom_HArray2OfSurface  GridSurf, ShapeExtend_Parametrisation param) {
    this(OCCwrapJavaJNI.new_ShapeExtend_CompositeSurface__SWIG_1( TColGeom_HArray2OfSurface.getCPtr(GridSurf) , GridSurf, param.swigValue()), true);
  }

  /**
   *  Initializes by a grid of surfaces (calls Init()).
   */
  public ShapeExtend_CompositeSurface( TColGeom_HArray2OfSurface  GridSurf) {
    this(OCCwrapJavaJNI.new_ShapeExtend_CompositeSurface__SWIG_2( TColGeom_HArray2OfSurface.getCPtr(GridSurf) , GridSurf), true);
  }

  public ShapeExtend_CompositeSurface( TColGeom_HArray2OfSurface  GridSurf,  TColStd_Array1OfReal  UJoints,  TColStd_Array1OfReal  VJoints) {
    this(OCCwrapJavaJNI.new_ShapeExtend_CompositeSurface__SWIG_3( TColGeom_HArray2OfSurface.getCPtr(GridSurf) , GridSurf, TColStd_Array1OfReal.getCPtr(UJoints), UJoints, TColStd_Array1OfReal.getCPtr(VJoints), VJoints), true);
  }

  /**
   *  Initializes by a grid of surfaces.
   *  All the Surfaces of the grid must have geometrical
   *  connectivity as stated above.
   *  If geometrical connectivity is not satisfied, method
   *  returns False.
   *  However, class is initialized even in that case.
   * 
   *  Last parameter defines how global parametrisation
   *  (joint values) will be computed:
   *  ShapeExtend_Natural: U1 = u11min, Ui+1 = Ui + (ui1max-ui1min), etc.
   *  ShapeExtend_Uniform: Ui = i-1, Vj = j-1
   *  ShapeExtend_Unitary: Ui = (i-1)/Nu, Vi = (j-1)/Nv
   */
  public long Init( TColGeom_HArray2OfSurface  GridSurf, ShapeExtend_Parametrisation param) {
    return OCCwrapJavaJNI.ShapeExtend_CompositeSurface_Init__SWIG_0(swigCPtr, this,  TColGeom_HArray2OfSurface.getCPtr(GridSurf) , GridSurf, param.swigValue());
  }

  /**
   *  Initializes by a grid of surfaces with given global
   *  parametrisation defined by UJoints and VJoints arrays,
   *  each having langth equal to number of patches in corresponding
   *  direction + 1. Global joint values should be sorted in
   *  increasing order.
   *  All the Surfaces of the grid must have geometrical
   *  connectivity as stated above.
   *  If geometrical connectivity is not satisfied, method
   *  returns False.
   *  However, class is initialized even in that case.
   */
  public long Init( TColGeom_HArray2OfSurface  GridSurf) {
    return OCCwrapJavaJNI.ShapeExtend_CompositeSurface_Init__SWIG_1(swigCPtr, this,  TColGeom_HArray2OfSurface.getCPtr(GridSurf) , GridSurf);
  }

  public long Init( TColGeom_HArray2OfSurface  GridSurf,  TColStd_Array1OfReal  UJoints,  TColStd_Array1OfReal  VJoints) {
    return OCCwrapJavaJNI.ShapeExtend_CompositeSurface_Init__SWIG_2(swigCPtr, this,  TColGeom_HArray2OfSurface.getCPtr(GridSurf) , GridSurf, TColStd_Array1OfReal.getCPtr(UJoints), UJoints, TColStd_Array1OfReal.getCPtr(VJoints), VJoints);
  }

  /**
   *  Returns number of patches in U direction.
   */
  public int NbUPatches() {
    return OCCwrapJavaJNI.ShapeExtend_CompositeSurface_NbUPatches(swigCPtr, this);
  }

  /**
   *  Returns number of patches in V direction.
   */
  public int NbVPatches() {
    return OCCwrapJavaJNI.ShapeExtend_CompositeSurface_NbVPatches(swigCPtr, this);
  }

  public  Geom_Surface  Patch(int i, int j) {
    return new Geom_Surface ( OCCwrapJavaJNI.ShapeExtend_CompositeSurface_Patch__SWIG_0(swigCPtr, this, i, j), true );
  }

  public  TColGeom_HArray2OfSurface  Patches() {
    return new TColGeom_HArray2OfSurface ( OCCwrapJavaJNI.ShapeExtend_CompositeSurface_Patches(swigCPtr, this), true );
  }

  public  TColStd_HArray1OfReal  UJointValues() {
    return new TColStd_HArray1OfReal ( OCCwrapJavaJNI.ShapeExtend_CompositeSurface_UJointValues(swigCPtr, this), true );
  }

  public  TColStd_HArray1OfReal  VJointValues() {
    return new TColStd_HArray1OfReal ( OCCwrapJavaJNI.ShapeExtend_CompositeSurface_VJointValues(swigCPtr, this), true );
  }

  /**
   *  Returns i-th joint value in U direction
   *  (1-st is global Umin, (NbUPatches()+1)-th is global Umax
   *  on the composite surface)
   */
  public double UJointValue(int i) {
    return OCCwrapJavaJNI.ShapeExtend_CompositeSurface_UJointValue(swigCPtr, this, i);
  }

  /**
   *  Returns j-th joint value in V direction
   *  (1-st is global Vmin, (NbVPatches()+1)-th is global Vmax
   *  on the composite surface)
   */
  public double VJointValue(int j) {
    return OCCwrapJavaJNI.ShapeExtend_CompositeSurface_VJointValue(swigCPtr, this, j);
  }

  /**
   *  Sets the array of U values corresponding to joint
   *  points, which define global parametrisation of the surface.
   *  Number of values in array should be equal to NbUPatches()+1.
   *  All the values should be sorted in increasing order.
   *  If this is not satisfied, does nothing and returns False.
   */
  public long SetUJointValues( TColStd_Array1OfReal  UJoints) {
    return OCCwrapJavaJNI.ShapeExtend_CompositeSurface_SetUJointValues(swigCPtr, this, TColStd_Array1OfReal.getCPtr(UJoints), UJoints);
  }

  /**
   *  Sets the array of V values corresponding to joint
   *  points, which define global parametrisation of the surface
   *  Number of values in array should be equal to NbVPatches()+1.
   *  All the values should be sorted in increasing order.
   *  If this is not satisfied, does nothing and returns False.
   */
  public long SetVJointValues( TColStd_Array1OfReal  VJoints) {
    return OCCwrapJavaJNI.ShapeExtend_CompositeSurface_SetVJointValues(swigCPtr, this, TColStd_Array1OfReal.getCPtr(VJoints), VJoints);
  }

  /**
   *  Changes starting value for global U parametrisation (all
   *  other joint values are shifted accordingly)
   */
  public void SetUFirstValue(double UFirst) {
    OCCwrapJavaJNI.ShapeExtend_CompositeSurface_SetUFirstValue(swigCPtr, this, UFirst);
  }

  /**
   *  Changes starting value for global V parametrisation (all
   *  other joint values are shifted accordingly)
   */
  public void SetVFirstValue(double VFirst) {
    OCCwrapJavaJNI.ShapeExtend_CompositeSurface_SetVFirstValue(swigCPtr, this, VFirst);
  }

  /**
   *  Returns number of col that contains given (global) parameter
   */
  public int LocateUParameter(double U) {
    return OCCwrapJavaJNI.ShapeExtend_CompositeSurface_LocateUParameter(swigCPtr, this, U);
  }

  /**
   *  Returns number of row that contains given (global) parameter
   */
  public int LocateVParameter(double V) {
    return OCCwrapJavaJNI.ShapeExtend_CompositeSurface_LocateVParameter(swigCPtr, this, V);
  }

  /**
   *  Returns number of row and col of surface that contains
   *  given point
   */
  public void LocateUVPoint( gp_Pnt2d  pnt, int[] i, int[] j) {
    OCCwrapJavaJNI.ShapeExtend_CompositeSurface_LocateUVPoint(swigCPtr, this, gp_Pnt2d.getCPtr(pnt), pnt, i, j);
  }

  public  Geom_Surface  Patch(double U, double V) {
    return new Geom_Surface ( OCCwrapJavaJNI.ShapeExtend_CompositeSurface_Patch__SWIG_1(swigCPtr, this, U, V), true );
  }

  public  Geom_Surface  Patch( gp_Pnt2d  pnt) {
    return new Geom_Surface ( OCCwrapJavaJNI.ShapeExtend_CompositeSurface_Patch__SWIG_2(swigCPtr, this, gp_Pnt2d.getCPtr(pnt), pnt), true );
  }

  /**
   *  Converts local parameter u on patch i,j to global parameter U
   */
  public double ULocalToGlobal(int i, int j, double u) {
    return OCCwrapJavaJNI.ShapeExtend_CompositeSurface_ULocalToGlobal(swigCPtr, this, i, j, u);
  }

  /**
   *  Converts local parameter v on patch i,j to global parameter V
   */
  public double VLocalToGlobal(int i, int j, double v) {
    return OCCwrapJavaJNI.ShapeExtend_CompositeSurface_VLocalToGlobal(swigCPtr, this, i, j, v);
  }

  /**
   *  Converts local parameters uv on patch i,j to global parameters UV
   */
  public gp_Pnt2d LocalToGlobal(int i, int j,  gp_Pnt2d  uv) {
    return new gp_Pnt2d(OCCwrapJavaJNI.ShapeExtend_CompositeSurface_LocalToGlobal(swigCPtr, this, i, j, gp_Pnt2d.getCPtr(uv), uv), true);
  }

  /**
   *  Converts global parameter U to local parameter u on patch i,j
   */
  public double UGlobalToLocal(int i, int j, double U) {
    return OCCwrapJavaJNI.ShapeExtend_CompositeSurface_UGlobalToLocal(swigCPtr, this, i, j, U);
  }

  /**
   *  Converts global parameter V to local parameter v on patch i,j
   */
  public double VGlobalToLocal(int i, int j, double V) {
    return OCCwrapJavaJNI.ShapeExtend_CompositeSurface_VGlobalToLocal(swigCPtr, this, i, j, V);
  }

  /**
   *  Converts global parameters UV to local parameters uv on patch i,j
   */
  public gp_Pnt2d GlobalToLocal(int i, int j,  gp_Pnt2d  UV) {
    return new gp_Pnt2d(OCCwrapJavaJNI.ShapeExtend_CompositeSurface_GlobalToLocal(swigCPtr, this, i, j, gp_Pnt2d.getCPtr(UV), UV), true);
  }

  /**
   *  Computes transformation operator and uFactor descrinbing affine
   *  transformation required to convert global parameters on composite
   *  surface to local parameters on patch (i,j):
   *  uv = ( uFactor, 1. ) X Trsf * UV;
   *  NOTE: Thus Trsf contains shift and scale by V, scale by U is stored in uFact.
   *  Returns True if transformation is not an identity
   */
  public long GlobalToLocalTransformation(int i, int j, double[] uFact, gp_Trsf2d Trsf) {
    return OCCwrapJavaJNI.ShapeExtend_CompositeSurface_GlobalToLocalTransformation(swigCPtr, this, i, j, uFact, gp_Trsf2d.getCPtr(Trsf), Trsf);
  }

  /**
   *  Computes the point of parameter pnt on the grid.
   */
  public gp_Pnt Value( gp_Pnt2d  pnt) {
    return new gp_Pnt(OCCwrapJavaJNI.ShapeExtend_CompositeSurface_Value(swigCPtr, this, gp_Pnt2d.getCPtr(pnt), pnt), true);
  }

  /**
   *  Computes Joint values according to parameter
   */
  public void ComputeJointValues(ShapeExtend_Parametrisation param) {
    OCCwrapJavaJNI.ShapeExtend_CompositeSurface_ComputeJointValues__SWIG_0(swigCPtr, this, param.swigValue());
  }

  public void ComputeJointValues() {
    OCCwrapJavaJNI.ShapeExtend_CompositeSurface_ComputeJointValues__SWIG_1(swigCPtr, this);
  }

  /**
   *  Checks geometrical connectivity of the patches, including
   *  closedness (sets fields muUClosed and myVClosed)
   */
  public long CheckConnectivity(double prec) {
    return OCCwrapJavaJNI.ShapeExtend_CompositeSurface_CheckConnectivity(swigCPtr, this, prec);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeExtend_CompositeSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeExtend_CompositeSurface_get_type_descriptor(), true );
  }

  public static  ShapeExtend_CompositeSurface  DownCast( Standard_Transient  T) {
    return new ShapeExtend_CompositeSurface ( OCCwrapJavaJNI.ShapeExtend_CompositeSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeExtend_CompositeSurface_TypeOf(), true );
  }

}
