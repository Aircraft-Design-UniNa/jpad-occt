package opencascade;

/**
 *  Provides global functions to compute a shape's global
 *  properties for lines, surfaces or volumes, and bring
 *  them together with the global properties already
 *  computed for a geometric system.
 *  The global properties computed for a system are :
 *  - its mass,
 *  - its center of mass,
 *  - its matrix of inertia,
 *  - its moment about an axis,
 *  - its radius of gyration about an axis,
 *  - and its principal properties of inertia such as
 *  principal axis, principal moments, principal radius of gyration.
 */
public class BRepGProp {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepGProp(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepGProp(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepGProp obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepGProp(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Computes the linear global properties of the shape S,
   *  i.e. the global properties induced by each edge of the
   *  shape S, and brings them together with the global
   *  properties still retained by the framework LProps. If
   *  the current system of LProps was empty, its global
   *  properties become equal to the linear global
   *  properties of S.
   *  For this computation no linear density is attached to
   *  the edges. So, for example, the added mass
   *  corresponds to the sum of the lengths of the edges of
   *  S. The density of the composed systems, i.e. that of
   *  each component of the current system of LProps, and
   *  that of S which is considered to be equal to 1, must be coherent.
   *  Note that this coherence cannot be checked. You are
   *  advised to use a separate framework for each
   *  density, and then to bring these frameworks together
   *  into a global one.
   *  The point relative to which the inertia of the system is
   *  computed is the reference point of the framework LProps.
   *  Note: if your programming ensures that the framework
   *  LProps retains only linear global properties (brought
   *  together for example, by the function
   *  LinearProperties) for objects the density of which is
   *  equal to 1 (or is not defined), the function Mass will
   *  return the total length of edges of the system analysed by LProps.
   *  Warning
   *  No check is performed to verify that the shape S
   *  retains truly linear properties. If S is simply a vertex, it
   *  is not considered to present any additional global properties.
   *  SkipShared is special flag, which allows to take in calculation shared topological entities or not
   *  For ex., if SkipShared = True, edges, shared by two or more faces, are taken into calculation only once.
   *  If we have cube with sizes 1, 1, 1, its linear properties = 12 for SkipEdges = true and 24 for SkipEdges = false.
   */
  public static void LinearProperties( TopoDS_Shape  S, GProp_GProps LProps, long SkipShared) {
    OCCwrapJavaJNI.BRepGProp_LinearProperties__SWIG_0(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(LProps), LProps, SkipShared);
  }

  public static void LinearProperties( TopoDS_Shape  S, GProp_GProps LProps) {
    OCCwrapJavaJNI.BRepGProp_LinearProperties__SWIG_1(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(LProps), LProps);
  }

  /**
   *  Computes the surface global properties of the
   *  shape S, i.e. the global properties induced by each
   *  face of the shape S, and brings them together with
   *  the global properties still retained by the framework
   *  SProps. If the current system of SProps was empty,
   *  its global properties become equal to the surface
   *  global properties of S.
   *  For this computation, no surface density is attached
   *  to the faces. Consequently, the added mass
   *  corresponds to the sum of the areas of the faces of
   *  S. The density of the component systems, i.e. that
   *  of each component of the current system of
   *  SProps, and that of S which is considered to be
   *  equal to 1, must be coherent.
   *  Note that this coherence cannot be checked. You
   *  are advised to use a framework for each different
   *  value of density, and then to bring these
   *  frameworks together into a global one.
   *  The point relative to which the inertia of the system
   *  is computed is the reference point of the framework SProps.
   *  Note : if your programming ensures that the
   *  framework SProps retains only surface global
   *  properties, brought together, for example, by the
   *  function SurfaceProperties, for objects the density
   *  of which is equal to 1 (or is not defined), the
   *  function Mass will return the total area of faces of
   *  the system analysed by SProps.
   *  Warning
   *  No check is performed to verify that the shape S
   *  retains truly surface properties. If S is simply a
   *  vertex, an edge or a wire, it is not considered to
   *  present any additional global properties.
   *  SkipShared is special flag, which allows to take in calculation shared topological entities or not
   *  For ex., if SkipShared = True, faces, shared by two or more shells, are taken into calculation only once.
   */
  public static void SurfaceProperties( TopoDS_Shape  S, GProp_GProps SProps, long SkipShared) {
    OCCwrapJavaJNI.BRepGProp_SurfaceProperties__SWIG_0(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(SProps), SProps, SkipShared);
  }

  /**
   *  Updates <SProps> with the shape <S>, that contains its pricipal properties.
   *  The surface properties of all the faces in <S> are computed.
   *  Adaptive 2D Gauss integration is used.
   *  Parameter Eps sets maximal relative error of computed mass (area) for each face.
   *  Error is calculated as Abs((M(i+1)-M(i))/M(i+1)), M(i+1) and M(i) are values
   *  for two successive steps of adaptive integration.
   *  Method returns estimation of relative error reached for whole shape.
   *  WARNING: if Eps > 0.001 algorithm performs non-adaptive integration.
   *  SkipShared is special flag, which allows to take in calculation shared topological entities or not
   *  For ex., if SkipShared = True, faces, shared by two or more shells, are taken into calculation only once.
   */
  public static void SurfaceProperties( TopoDS_Shape  S, GProp_GProps SProps) {
    OCCwrapJavaJNI.BRepGProp_SurfaceProperties__SWIG_1(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(SProps), SProps);
  }

  public static double SurfaceProperties( TopoDS_Shape  S, GProp_GProps SProps, double Eps, long SkipShared) {
    return OCCwrapJavaJNI.BRepGProp_SurfaceProperties__SWIG_2(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(SProps), SProps, Eps, SkipShared);
  }

  public static double SurfaceProperties( TopoDS_Shape  S, GProp_GProps SProps, double Eps) {
    return OCCwrapJavaJNI.BRepGProp_SurfaceProperties__SWIG_3(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(SProps), SProps, Eps);
  }

  /**
   * 
   *  Computes the global volume properties of the solid
   *  S, and brings them together with the global
   *  properties still retained by the framework VProps. If
   *  the current system of VProps was empty, its global
   *  properties become equal to the global properties of S for volume.
   *  For this computation, no volume density is attached
   *  to the solid. Consequently, the added mass
   *  corresponds to the volume of S. The density of the
   *  component systems, i.e. that of each component of
   *  the current system of VProps, and that of S which
   *  is considered to be equal to 1, must be coherent to each other.
   *  Note that this coherence cannot be checked. You
   *  are advised to use a separate framework for each
   *  density, and then to bring these frameworks
   *  together into a global one.
   *  The point relative to which the inertia of the system
   *  is computed is the reference point of the framework VProps.
   *  Note: if your programming ensures that the
   *  framework VProps retains only global properties of
   *  volume (brought together for example, by the
   *  function VolumeProperties) for objects the density
   *  of which is equal to 1 (or is not defined), the
   *  function Mass will return the total volume of the
   *  solids of the system analysed by VProps.
   *  Warning
   *  The shape S must represent an object whose
   *  global volume properties can be computed. It may
   *  be a finite solid, or a series of finite solids all
   *  oriented in a coherent way. Nonetheless, S must be
   *  exempt of any free boundary. Note that these
   *  conditions of coherence are not checked by this
   *  algorithm, and results will be false if they are not respected. 
   *  SkipShared is special flag, which allows to take in calculation shared topological entities or not
   *  For ex., if SkipShared = True, the volumes formed by the equal (the same TShape, location and orientation) faces are taken into calculation only once.
   */
  public static void VolumeProperties( TopoDS_Shape  S, GProp_GProps VProps, long OnlyClosed, long SkipShared) {
    OCCwrapJavaJNI.BRepGProp_VolumeProperties__SWIG_0(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(VProps), VProps, OnlyClosed, SkipShared);
  }

  /**
   *  Updates <VProps> with the shape <S>, that contains its pricipal properties.
   *  The volume properties of all the FORWARD and REVERSED faces in <S> are computed.
   *  If OnlyClosed is True then computed faces must belong to closed Shells.
   *  Adaptive 2D Gauss integration is used.
   *  Parameter Eps sets maximal relative error of computed mass (volume) for each face.
   *  Error is calculated as Abs((M(i+1)-M(i))/M(i+1)), M(i+1) and M(i) are values
   *  for two successive steps of adaptive integration.
   *  Method returns estimation of relative error reached for whole shape.
   *  WARNING: if Eps > 0.001 algorithm performs non-adaptive integration.
   *  SkipShared is special flag, which allows to take in calculation shared topological entities or not
   *  For ex., if SkipShared = True, the volumes formed by the equal (the same TShape, location and orientation) faces are taken into calculation only once.
   */
  public static void VolumeProperties( TopoDS_Shape  S, GProp_GProps VProps, long OnlyClosed) {
    OCCwrapJavaJNI.BRepGProp_VolumeProperties__SWIG_1(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(VProps), VProps, OnlyClosed);
  }

  public static void VolumeProperties( TopoDS_Shape  S, GProp_GProps VProps) {
    OCCwrapJavaJNI.BRepGProp_VolumeProperties__SWIG_2(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(VProps), VProps);
  }

  public static double VolumeProperties( TopoDS_Shape  S, GProp_GProps VProps, double Eps, long OnlyClosed, long SkipShared) {
    return OCCwrapJavaJNI.BRepGProp_VolumeProperties__SWIG_3(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(VProps), VProps, Eps, OnlyClosed, SkipShared);
  }

  public static double VolumeProperties( TopoDS_Shape  S, GProp_GProps VProps, double Eps, long OnlyClosed) {
    return OCCwrapJavaJNI.BRepGProp_VolumeProperties__SWIG_4(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(VProps), VProps, Eps, OnlyClosed);
  }

  public static double VolumeProperties( TopoDS_Shape  S, GProp_GProps VProps, double Eps) {
    return OCCwrapJavaJNI.BRepGProp_VolumeProperties__SWIG_5(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(VProps), VProps, Eps);
  }

  /**
   *  Updates <VProps> with the shape <S>, that contains its pricipal properties.
   *  The volume properties of all the FORWARD and REVERSED faces in <S> are computed.
   *  If OnlyClosed is True then computed faces must belong to closed Shells.
   *  Adaptive 2D Gauss integration is used.
   *  Parameter IsUseSpan says if it is necessary to define spans on a face.
   *  This option has an effect only for BSpline faces.
   *  Parameter Eps sets maximal relative error of computed property for each face.
   *  Error is delivered by the adaptive Gauss-Kronrod method of integral computation
   *  that is used for properties computation.
   *  Method returns estimation of relative error reached for whole shape.
   *  Returns negative value if the computation is failed.
   *  SkipShared is special flag, which allows to take in calculation shared topological entities or not
   *  For ex., if SkipShared = True, the volumes formed by the equal (the same TShape, location and orientation) faces are taken into calculation only once.
   */
  public static double VolumePropertiesGK( TopoDS_Shape  S, GProp_GProps VProps, double Eps, long OnlyClosed, long IsUseSpan, long CGFlag, long IFlag, long SkipShared) {
    return OCCwrapJavaJNI.BRepGProp_VolumePropertiesGK__SWIG_0(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(VProps), VProps, Eps, OnlyClosed, IsUseSpan, CGFlag, IFlag, SkipShared);
  }

  public static double VolumePropertiesGK( TopoDS_Shape  S, GProp_GProps VProps, double Eps, long OnlyClosed, long IsUseSpan, long CGFlag, long IFlag) {
    return OCCwrapJavaJNI.BRepGProp_VolumePropertiesGK__SWIG_1(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(VProps), VProps, Eps, OnlyClosed, IsUseSpan, CGFlag, IFlag);
  }

  public static double VolumePropertiesGK( TopoDS_Shape  S, GProp_GProps VProps, double Eps, long OnlyClosed, long IsUseSpan, long CGFlag) {
    return OCCwrapJavaJNI.BRepGProp_VolumePropertiesGK__SWIG_2(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(VProps), VProps, Eps, OnlyClosed, IsUseSpan, CGFlag);
  }

  public static double VolumePropertiesGK( TopoDS_Shape  S, GProp_GProps VProps, double Eps, long OnlyClosed, long IsUseSpan) {
    return OCCwrapJavaJNI.BRepGProp_VolumePropertiesGK__SWIG_3(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(VProps), VProps, Eps, OnlyClosed, IsUseSpan);
  }

  public static double VolumePropertiesGK( TopoDS_Shape  S, GProp_GProps VProps, double Eps, long OnlyClosed) {
    return OCCwrapJavaJNI.BRepGProp_VolumePropertiesGK__SWIG_4(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(VProps), VProps, Eps, OnlyClosed);
  }

  public static double VolumePropertiesGK( TopoDS_Shape  S, GProp_GProps VProps, double Eps) {
    return OCCwrapJavaJNI.BRepGProp_VolumePropertiesGK__SWIG_5(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(VProps), VProps, Eps);
  }

  public static double VolumePropertiesGK( TopoDS_Shape  S, GProp_GProps VProps) {
    return OCCwrapJavaJNI.BRepGProp_VolumePropertiesGK__SWIG_6(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(VProps), VProps);
  }

  public static double VolumePropertiesGK( TopoDS_Shape  S, GProp_GProps VProps,  gp_Pln  thePln, double Eps, long OnlyClosed, long IsUseSpan, long CGFlag, long IFlag, long SkipShared) {
    return OCCwrapJavaJNI.BRepGProp_VolumePropertiesGK__SWIG_7(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(VProps), VProps, gp_Pln.getCPtr(thePln), thePln, Eps, OnlyClosed, IsUseSpan, CGFlag, IFlag, SkipShared);
  }

  public static double VolumePropertiesGK( TopoDS_Shape  S, GProp_GProps VProps,  gp_Pln  thePln, double Eps, long OnlyClosed, long IsUseSpan, long CGFlag, long IFlag) {
    return OCCwrapJavaJNI.BRepGProp_VolumePropertiesGK__SWIG_8(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(VProps), VProps, gp_Pln.getCPtr(thePln), thePln, Eps, OnlyClosed, IsUseSpan, CGFlag, IFlag);
  }

  public static double VolumePropertiesGK( TopoDS_Shape  S, GProp_GProps VProps,  gp_Pln  thePln, double Eps, long OnlyClosed, long IsUseSpan, long CGFlag) {
    return OCCwrapJavaJNI.BRepGProp_VolumePropertiesGK__SWIG_9(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(VProps), VProps, gp_Pln.getCPtr(thePln), thePln, Eps, OnlyClosed, IsUseSpan, CGFlag);
  }

  public static double VolumePropertiesGK( TopoDS_Shape  S, GProp_GProps VProps,  gp_Pln  thePln, double Eps, long OnlyClosed, long IsUseSpan) {
    return OCCwrapJavaJNI.BRepGProp_VolumePropertiesGK__SWIG_10(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(VProps), VProps, gp_Pln.getCPtr(thePln), thePln, Eps, OnlyClosed, IsUseSpan);
  }

  public static double VolumePropertiesGK( TopoDS_Shape  S, GProp_GProps VProps,  gp_Pln  thePln, double Eps, long OnlyClosed) {
    return OCCwrapJavaJNI.BRepGProp_VolumePropertiesGK__SWIG_11(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(VProps), VProps, gp_Pln.getCPtr(thePln), thePln, Eps, OnlyClosed);
  }

  public static double VolumePropertiesGK( TopoDS_Shape  S, GProp_GProps VProps,  gp_Pln  thePln, double Eps) {
    return OCCwrapJavaJNI.BRepGProp_VolumePropertiesGK__SWIG_12(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(VProps), VProps, gp_Pln.getCPtr(thePln), thePln, Eps);
  }

  public static double VolumePropertiesGK( TopoDS_Shape  S, GProp_GProps VProps,  gp_Pln  thePln) {
    return OCCwrapJavaJNI.BRepGProp_VolumePropertiesGK__SWIG_13(TopoDS_Shape.getCPtr(S), S, GProp_GProps.getCPtr(VProps), VProps, gp_Pln.getCPtr(thePln), thePln);
  }

  public BRepGProp() {
    this(OCCwrapJavaJNI.new_BRepGProp(), true);
  }

}
