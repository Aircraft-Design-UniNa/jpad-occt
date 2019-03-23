package opencascade;

/**
 *  Computes the global properties of a geometric solid
 *  (3D closed region of space) delimited with :
 *  . a surface
 *  . a point and a surface
 *  . a plane and a surface
 * 
 *  The surface can be :
 *  . a surface limited with its parametric values U-V,
 *  . a surface limited in U-V space with its curves of restriction,
 * 
 *  The surface 's requirements to evaluate the global properties
 *  are defined in the template SurfaceTool from package GProp.
 */
public class BRepGProp_Vinert extends GProp_GProps {

  private long swigCPtr;
  BRepGProp_Vinert(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepGProp_Vinert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepGProp_Vinert(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepGProp_Vinert_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepGProp_Vinert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepGProp_Vinert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BRepGProp_Vinert() {
    this(OCCwrapJavaJNI.new_BRepGProp_Vinert__SWIG_0(), true);
  }

  /**
   *  Computes the global properties of a region of 3D space
   *  delimited with the surface <S> and the point VLocation. S can be closed
   *  The method is quick and its precision is enough for many cases of analytical
   *  surfaces.
   *  Non-adaptive 2D Gauss integration with predefined numbers of Gauss points
   *  is used. Numbers of points depend on types of surfaces and  curves.
   *  Errror of the computation is not calculated.
   */
  public BRepGProp_Vinert( BRepGProp_Face  S,  gp_Pnt  VLocation) {
    this(OCCwrapJavaJNI.new_BRepGProp_Vinert__SWIG_1(BRepGProp_Face.getCPtr(S), S, gp_Pnt.getCPtr(VLocation), VLocation), true);
  }

  /**
   *  Computes the global properties of a region of 3D space
   *  delimited with the surface <S> and the point VLocation. S can be closed
   *  Adaptive 2D Gauss integration is used.
   *  Parameter Eps sets maximal relative error of computed mass (volume) for face.
   *  Error is calculated as Abs((M(i+1)-M(i))/M(i+1)), M(i+1) and M(i) are values
   *  for two successive steps of adaptive integration.
   */
  public BRepGProp_Vinert( BRepGProp_Face  S,  gp_Pnt  VLocation, double Eps) {
    this(OCCwrapJavaJNI.new_BRepGProp_Vinert__SWIG_2(BRepGProp_Face.getCPtr(S), S, gp_Pnt.getCPtr(VLocation), VLocation, Eps), true);
  }

  /**
   *  Computes the global properties of the region of 3D space
   *  delimited with the surface <S> and the point VLocation.
   *  The method is quick and its precision is enough for many cases of analytical
   *  surfaces.
   *  Non-adaptive 2D Gauss integration with predefined numbers of Gauss points
   *  is used. Numbers of points depend on types of surfaces and  curves.
   *  Error of the computation is not calculated.
   */
  public BRepGProp_Vinert( BRepGProp_Face  S,  gp_Pnt  O,  gp_Pnt  VLocation) {
    this(OCCwrapJavaJNI.new_BRepGProp_Vinert__SWIG_3(BRepGProp_Face.getCPtr(S), S, gp_Pnt.getCPtr(O), O, gp_Pnt.getCPtr(VLocation), VLocation), true);
  }

  /**
   *  Computes the global properties of the region of 3D space
   *  delimited with the surface <S> and the point VLocation.
   *  Adaptive 2D Gauss integration is used.
   *  Parameter Eps sets maximal relative error of computed mass (volume) for face.
   *  Error is calculated as Abs((M(i+1)-M(i))/M(i+1)), M(i+1) and M(i) are values
   *  for two successive steps of adaptive integration.
   *  WARNING: if Eps > 0.001 algorithm performs non-adaptive integration.
   */
  public BRepGProp_Vinert( BRepGProp_Face  S,  gp_Pnt  O,  gp_Pnt  VLocation, double Eps) {
    this(OCCwrapJavaJNI.new_BRepGProp_Vinert__SWIG_4(BRepGProp_Face.getCPtr(S), S, gp_Pnt.getCPtr(O), O, gp_Pnt.getCPtr(VLocation), VLocation, Eps), true);
  }

  /**
   *  Computes the global properties of the region of 3D space
   *  delimited with the surface <S> and the plane Pln.
   *  The method is quick and its precision is enough for many cases of analytical
   *  surfaces.
   *  Non-adaptive 2D Gauss integration with predefined numbers of Gauss points
   *  is used. Numbers of points depend on types of surfaces and  curves.
   *  Error of the computation is not calculated.
   */
  public BRepGProp_Vinert( BRepGProp_Face  S,  gp_Pln  Pl,  gp_Pnt  VLocation) {
    this(OCCwrapJavaJNI.new_BRepGProp_Vinert__SWIG_5(BRepGProp_Face.getCPtr(S), S, gp_Pln.getCPtr(Pl), Pl, gp_Pnt.getCPtr(VLocation), VLocation), true);
  }

  /**
   *  Computes the global properties of the region of 3D space
   *  delimited with the surface <S> and the plane Pln.
   *  Adaptive 2D Gauss integration is used.
   *  Parameter Eps sets maximal relative error of computed mass (volume) for face.
   *  Error is calculated as Abs((M(i+1)-M(i))/M(i+1)), M(i+1) and M(i) are values
   *  for two successive steps of adaptive integration.
   *  WARNING: if Eps > 0.001 algorithm performs non-adaptive integration.
   */
  public BRepGProp_Vinert( BRepGProp_Face  S,  gp_Pln  Pl,  gp_Pnt  VLocation, double Eps) {
    this(OCCwrapJavaJNI.new_BRepGProp_Vinert__SWIG_6(BRepGProp_Face.getCPtr(S), S, gp_Pln.getCPtr(Pl), Pl, gp_Pnt.getCPtr(VLocation), VLocation, Eps), true);
  }

  /**
   *  Computes the global properties of a region of 3D space
   *  delimited with the surface <S> and the point VLocation. S can be closed
   *  The method is quick and its precision is enough for many cases of analytical
   *  surfaces.
   *  Non-adaptive 2D Gauss integration with predefined numbers of Gauss points
   *  is used. Numbers of points depend on types of surfaces and  curves.
   *  Errror of the computation is not calculated.
   */
  public BRepGProp_Vinert( BRepGProp_Face  S,  BRepGProp_Domain  D,  gp_Pnt  VLocation) {
    this(OCCwrapJavaJNI.new_BRepGProp_Vinert__SWIG_7(BRepGProp_Face.getCPtr(S), S, BRepGProp_Domain.getCPtr(D), D, gp_Pnt.getCPtr(VLocation), VLocation), true);
  }

  /**
   *  Computes the global properties of a region of 3D space
   *  delimited with the surface <S> and the point VLocation. S can be closed
   *  Adaptive 2D Gauss integration is used.
   *  Parameter Eps sets maximal relative error of computed mass (volume) for face.
   *  Error is calculated as Abs((M(i+1)-M(i))/M(i+1)), M(i+1) and M(i) are values
   *  for two successive steps of adaptive integration.
   */
  public BRepGProp_Vinert( BRepGProp_Face  S,  BRepGProp_Domain  D,  gp_Pnt  VLocation, double Eps) {
    this(OCCwrapJavaJNI.new_BRepGProp_Vinert__SWIG_8(BRepGProp_Face.getCPtr(S), S, BRepGProp_Domain.getCPtr(D), D, gp_Pnt.getCPtr(VLocation), VLocation, Eps), true);
  }

  /**
   *  Computes the global properties of the region of 3D space
   *  delimited with the surface <S> and the point VLocation.
   *  The method is quick and its precision is enough for many cases of analytical
   *  surfaces.
   *  Non-adaptive 2D Gauss integration with predefined numbers of Gauss points
   *  is used. Numbers of points depend on types of surfaces and  curves.
   *  Error of the computation is not calculated.
   */
  public BRepGProp_Vinert( BRepGProp_Face  S,  BRepGProp_Domain  D,  gp_Pnt  O,  gp_Pnt  VLocation) {
    this(OCCwrapJavaJNI.new_BRepGProp_Vinert__SWIG_9(BRepGProp_Face.getCPtr(S), S, BRepGProp_Domain.getCPtr(D), D, gp_Pnt.getCPtr(O), O, gp_Pnt.getCPtr(VLocation), VLocation), true);
  }

  /**
   *  Computes the global properties of the region of 3D space
   *  delimited with the surface <S> and the point VLocation.
   *  Adaptive 2D Gauss integration is used.
   *  Parameter Eps sets maximal relative error of computed mass (volume) for face.
   *  Error is calculated as Abs((M(i+1)-M(i))/M(i+1)), M(i+1) and M(i) are values
   *  for two successive steps of adaptive integration.
   *  WARNING: if Eps > 0.001 algorithm performs non-adaptive integration.
   */
  public BRepGProp_Vinert( BRepGProp_Face  S,  BRepGProp_Domain  D,  gp_Pnt  O,  gp_Pnt  VLocation, double Eps) {
    this(OCCwrapJavaJNI.new_BRepGProp_Vinert__SWIG_10(BRepGProp_Face.getCPtr(S), S, BRepGProp_Domain.getCPtr(D), D, gp_Pnt.getCPtr(O), O, gp_Pnt.getCPtr(VLocation), VLocation, Eps), true);
  }

  /**
   *  Computes the global properties of the region of 3D space
   *  delimited with the surface <S> and the plane Pln.
   *  The method is quick and its precision is enough for many cases of analytical
   *  surfaces.
   *  Non-adaptive 2D Gauss integration with predefined numbers of Gauss points
   *  is used. Numbers of points depend on types of surfaces and  curves.
   *  Error of the computation is not calculated.
   */
  public BRepGProp_Vinert( BRepGProp_Face  S,  BRepGProp_Domain  D,  gp_Pln  Pl,  gp_Pnt  VLocation) {
    this(OCCwrapJavaJNI.new_BRepGProp_Vinert__SWIG_11(BRepGProp_Face.getCPtr(S), S, BRepGProp_Domain.getCPtr(D), D, gp_Pln.getCPtr(Pl), Pl, gp_Pnt.getCPtr(VLocation), VLocation), true);
  }

  /**
   *  Computes the global properties of the region of 3D space
   *  delimited with the surface <S> and the plane Pln.
   *  Adaptive 2D Gauss integration is used.
   *  Parameter Eps sets maximal relative error of computed mass (volume) for face.
   *  Error is calculated as Abs((M(i+1)-M(i))/M(i+1)), M(i+1) and M(i) are values
   *  for two successive steps of adaptive integration.
   *  WARNING: if Eps > 0.001 algorithm performs non-adaptive integration.
   */
  public BRepGProp_Vinert( BRepGProp_Face  S,  BRepGProp_Domain  D,  gp_Pln  Pl,  gp_Pnt  VLocation, double Eps) {
    this(OCCwrapJavaJNI.new_BRepGProp_Vinert__SWIG_12(BRepGProp_Face.getCPtr(S), S, BRepGProp_Domain.getCPtr(D), D, gp_Pln.getCPtr(Pl), Pl, gp_Pnt.getCPtr(VLocation), VLocation, Eps), true);
  }

  public void SetLocation( gp_Pnt  VLocation) {
    OCCwrapJavaJNI.BRepGProp_Vinert_SetLocation(swigCPtr, this, gp_Pnt.getCPtr(VLocation), VLocation);
  }

  public void Perform( BRepGProp_Face  S) {
    OCCwrapJavaJNI.BRepGProp_Vinert_Perform__SWIG_0(swigCPtr, this, BRepGProp_Face.getCPtr(S), S);
  }

  public double Perform( BRepGProp_Face  S, double Eps) {
    return OCCwrapJavaJNI.BRepGProp_Vinert_Perform__SWIG_1(swigCPtr, this, BRepGProp_Face.getCPtr(S), S, Eps);
  }

  public void Perform( BRepGProp_Face  S,  gp_Pnt  O) {
    OCCwrapJavaJNI.BRepGProp_Vinert_Perform__SWIG_2(swigCPtr, this, BRepGProp_Face.getCPtr(S), S, gp_Pnt.getCPtr(O), O);
  }

  public double Perform( BRepGProp_Face  S,  gp_Pnt  O, double Eps) {
    return OCCwrapJavaJNI.BRepGProp_Vinert_Perform__SWIG_3(swigCPtr, this, BRepGProp_Face.getCPtr(S), S, gp_Pnt.getCPtr(O), O, Eps);
  }

  public void Perform( BRepGProp_Face  S,  gp_Pln  Pl) {
    OCCwrapJavaJNI.BRepGProp_Vinert_Perform__SWIG_4(swigCPtr, this, BRepGProp_Face.getCPtr(S), S, gp_Pln.getCPtr(Pl), Pl);
  }

  public double Perform( BRepGProp_Face  S,  gp_Pln  Pl, double Eps) {
    return OCCwrapJavaJNI.BRepGProp_Vinert_Perform__SWIG_5(swigCPtr, this, BRepGProp_Face.getCPtr(S), S, gp_Pln.getCPtr(Pl), Pl, Eps);
  }

  public void Perform( BRepGProp_Face  S,  BRepGProp_Domain  D) {
    OCCwrapJavaJNI.BRepGProp_Vinert_Perform__SWIG_6(swigCPtr, this, BRepGProp_Face.getCPtr(S), S, BRepGProp_Domain.getCPtr(D), D);
  }

  public double Perform( BRepGProp_Face  S,  BRepGProp_Domain  D, double Eps) {
    return OCCwrapJavaJNI.BRepGProp_Vinert_Perform__SWIG_7(swigCPtr, this, BRepGProp_Face.getCPtr(S), S, BRepGProp_Domain.getCPtr(D), D, Eps);
  }

  public void Perform( BRepGProp_Face  S,  BRepGProp_Domain  D,  gp_Pnt  O) {
    OCCwrapJavaJNI.BRepGProp_Vinert_Perform__SWIG_8(swigCPtr, this, BRepGProp_Face.getCPtr(S), S, BRepGProp_Domain.getCPtr(D), D, gp_Pnt.getCPtr(O), O);
  }

  public double Perform( BRepGProp_Face  S,  BRepGProp_Domain  D,  gp_Pnt  O, double Eps) {
    return OCCwrapJavaJNI.BRepGProp_Vinert_Perform__SWIG_9(swigCPtr, this, BRepGProp_Face.getCPtr(S), S, BRepGProp_Domain.getCPtr(D), D, gp_Pnt.getCPtr(O), O, Eps);
  }

  public void Perform( BRepGProp_Face  S,  BRepGProp_Domain  D,  gp_Pln  Pl) {
    OCCwrapJavaJNI.BRepGProp_Vinert_Perform__SWIG_10(swigCPtr, this, BRepGProp_Face.getCPtr(S), S, BRepGProp_Domain.getCPtr(D), D, gp_Pln.getCPtr(Pl), Pl);
  }

  public double Perform( BRepGProp_Face  S,  BRepGProp_Domain  D,  gp_Pln  Pl, double Eps) {
    return OCCwrapJavaJNI.BRepGProp_Vinert_Perform__SWIG_11(swigCPtr, this, BRepGProp_Face.getCPtr(S), S, BRepGProp_Domain.getCPtr(D), D, gp_Pln.getCPtr(Pl), Pl, Eps);
  }

  /**
   *  If previously used methods containe Eps parameter
   *  gets actual relative error of the computation, else returns  1.0.
   */
  public double GetEpsilon() {
    return OCCwrapJavaJNI.BRepGProp_Vinert_GetEpsilon(swigCPtr, this);
  }

}
