package opencascade;

/**
 *  This class provides for a framework to construct a shell
 *  or a solid along a spine consisting in a wire.
 *  To produce a solid, the initial wire must be closed.
 *  Two approaches are used:
 *  - definition by section
 *  - by a section and a scaling law
 *  - by addition of successive intermediary sections
 *  - definition by sweep mode.
 *  - pseudo-Frenet
 *  - constant
 *  - binormal constant
 *  - normal defined by a surface support
 *  - normal defined by a guiding contour.
 *  The two global approaches can also be combined.
 *  You can also close the surface later in order to form a solid.
 *  Warning: some limitations exist
 *  -- Mode with auxilary spine is incompatible with hometetic laws
 *  -- Mode with auxilary spine and keep contact produce only CO surface.
 */
public class BRepOffsetAPI_MakePipeShell extends BRepPrimAPI_MakeSweep {

  private long swigCPtr;
  BRepOffsetAPI_MakePipeShell(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepOffsetAPI_MakePipeShell(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepOffsetAPI_MakePipeShell obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepOffsetAPI_MakePipeShell(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Constructs the shell-generating framework defined by the wire Spine.
   *  Sets an sweep's mode
   *  If no mode are setted, the mode use in MakePipe is used
   */
  public BRepOffsetAPI_MakePipeShell( TopoDS_Wire  Spine) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakePipeShell(TopoDS_Wire.getCPtr(Spine), Spine), true);
  }

  /**
   *  Sets a Frenet or a CorrectedFrenet trihedron
   *  to  perform  the  sweeping
   *  If IsFrenet is false, a corrected Frenet trihedron is used.
   */
  public void SetMode(long IsFrenet) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetMode__SWIG_0(swigCPtr, this, IsFrenet);
  }

  /**
   *  Sets  a  fixed  trihedron  to  perform  the  sweeping
   *  all sections will be parallel.
   */
  public void SetMode() {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetMode__SWIG_1(swigCPtr, this);
  }

  /**
   *  Sets a Discrete trihedron
   *  to  perform  the  sweeping
   */
  public void SetDiscreteMode() {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetDiscreteMode(swigCPtr, this);
  }

  /**
   *  Sets a fixed BiNormal  direction to perform the --
   *  sweeping.   Angular   relations   beetween  the
   *  section(s) and <BiNormal> will be constant
   */
  public void SetMode( gp_Ax2  Axe) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetMode__SWIG_2(swigCPtr, this, gp_Ax2.getCPtr(Axe), Axe);
  }

  /**
   *  Sets support to the spine to define the BiNormal of
   *  the trihedron, like the normal  to the surfaces.
   *  Warning:  To be effective, Each  edge of the <spine> must
   *  have an representaion on one face of<SpineSupport>
   */
  public void SetMode( gp_Dir  BiNormal) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetMode__SWIG_3(swigCPtr, this, gp_Dir.getCPtr(BiNormal), BiNormal);
  }

  /**
   *  Sets  an  auxiliary  spine  to  define  the Normal
   *  For  each  Point  of  the  Spine  P,  an  Point  Q  is  evalued
   *  on  <AuxiliarySpine>
   *  If <CurvilinearEquivalence>
   *  Q split <AuxiliarySpine> with  the  same  length ratio
   *  than P split  <Spline>.
   *  Else  the  plan  define  by  P  and  the  tangent  to  the  <Spine>
   *  intersect <AuxiliarySpine> in Q.
   *  If <KeepContact> equals BRepFill_NoContact: The Normal is defined
   *  by the vector PQ.
   *  If <KeepContact> equals BRepFill_Contact: The Normal is defined to
   *  achieve that the sweeped section is in contact to the
   *  auxiliarySpine. The width of section is constant all along the path.
   *  In other words, the auxiliary spine lies on the swept surface,
   *  but not necessarily is a boundary of this surface. However,
   *  the auxiliary spine has to be close enough to the main spine
   *  to provide intersection with any section all along the path.
   *  If <KeepContact> equals BRepFill_ContactOnBorder: The auxiliary spine
   *  becomes a boundary of the swept surface and the width of section varies
   *  along the path.
   *  Give section to sweep.
   *  Possibilities are :
   *  - Give one or sevral section
   *  - Give one profile and an homotetic law.
   *  - Automatic compute of correspondance beetween spine, and section
   *  on the sweeped shape
   *  - correspondance beetween spine, and section on the sweeped shape
   *  defined by a vertex of the spine
   */
  public long SetMode( TopoDS_Shape  SpineSupport) {
    return OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetMode__SWIG_4(swigCPtr, this, TopoDS_Shape.getCPtr(SpineSupport), SpineSupport);
  }

  public void SetMode( TopoDS_Wire  AuxiliarySpine, long CurvilinearEquivalence, BRepFill_TypeOfContact KeepContact) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetMode__SWIG_5(swigCPtr, this, TopoDS_Wire.getCPtr(AuxiliarySpine), AuxiliarySpine, CurvilinearEquivalence, KeepContact.swigValue());
  }

  public void SetMode( TopoDS_Wire  AuxiliarySpine, long CurvilinearEquivalence) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetMode__SWIG_6(swigCPtr, this, TopoDS_Wire.getCPtr(AuxiliarySpine), AuxiliarySpine, CurvilinearEquivalence);
  }

  /**
   *  Adds the section Profile to this framework. First and last
   *  sections may be punctual, so the shape Profile may be
   *  both wire and vertex. Correspondent point on spine is
   *  computed automatically.
   *  If WithContact is true, the section is translated to be in
   *  contact with the spine.
   *  If WithCorrection is true, the section is rotated to be
   *  orthogonal to the spine?s tangent in the correspondent
   *  point. This option has no sense if the section is punctual
   *  (Profile is of type TopoDS_Vertex).
   */
  public void Add( TopoDS_Shape  Profile, long WithContact, long WithCorrection) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_Add__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(Profile), Profile, WithContact, WithCorrection);
  }

  /**
   *  Adds the section Profile to this framework.
   *  Correspondent point on the spine is given by Location.
   *  Warning:
   *  To be effective, it is not recommended to combine methods Add and SetLaw.
   */
  public void Add( TopoDS_Shape  Profile, long WithContact) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_Add__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(Profile), Profile, WithContact);
  }

  public void Add( TopoDS_Shape  Profile) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_Add__SWIG_2(swigCPtr, this, TopoDS_Shape.getCPtr(Profile), Profile);
  }

  public void Add( TopoDS_Shape  Profile,  TopoDS_Vertex  Location, long WithContact, long WithCorrection) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_Add__SWIG_3(swigCPtr, this, TopoDS_Shape.getCPtr(Profile), Profile, TopoDS_Vertex.getCPtr(Location), Location, WithContact, WithCorrection);
  }

  public void Add( TopoDS_Shape  Profile,  TopoDS_Vertex  Location, long WithContact) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_Add__SWIG_4(swigCPtr, this, TopoDS_Shape.getCPtr(Profile), Profile, TopoDS_Vertex.getCPtr(Location), Location, WithContact);
  }

  public void Add( TopoDS_Shape  Profile,  TopoDS_Vertex  Location) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_Add__SWIG_5(swigCPtr, this, TopoDS_Shape.getCPtr(Profile), Profile, TopoDS_Vertex.getCPtr(Location), Location);
  }

  /**
   *  Sets the evolution law defined by the wire Profile with
   *  its position (Location, WithContact, WithCorrection
   *  are the same options as in methods Add) and a
   *  homotetic law defined by the function L.
   *  Warning:
   *  To be effective, it is not recommended to combine methods Add and SetLaw.
   */
  public void SetLaw( TopoDS_Shape  Profile,  Law_Function  L, long WithContact, long WithCorrection) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetLaw__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(Profile), Profile,  Law_Function.getCPtr(L) , L, WithContact, WithCorrection);
  }

  /**
   *  Sets the evolution law defined by the wire Profile with
   *  its position (Location, WithContact, WithCorrection
   *  are the same options as in methods Add) and a
   *  homotetic law defined by the function L.
   *  Warning:
   *  To be effective, it is not recommended to combine methods Add and SetLaw.
   */
  public void SetLaw( TopoDS_Shape  Profile,  Law_Function  L, long WithContact) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetLaw__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(Profile), Profile,  Law_Function.getCPtr(L) , L, WithContact);
  }

  public void SetLaw( TopoDS_Shape  Profile,  Law_Function  L) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetLaw__SWIG_2(swigCPtr, this, TopoDS_Shape.getCPtr(Profile), Profile,  Law_Function.getCPtr(L) , L);
  }

  public void SetLaw( TopoDS_Shape  Profile,  Law_Function  L,  TopoDS_Vertex  Location, long WithContact, long WithCorrection) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetLaw__SWIG_3(swigCPtr, this, TopoDS_Shape.getCPtr(Profile), Profile,  Law_Function.getCPtr(L) , L, TopoDS_Vertex.getCPtr(Location), Location, WithContact, WithCorrection);
  }

  public void SetLaw( TopoDS_Shape  Profile,  Law_Function  L,  TopoDS_Vertex  Location, long WithContact) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetLaw__SWIG_4(swigCPtr, this, TopoDS_Shape.getCPtr(Profile), Profile,  Law_Function.getCPtr(L) , L, TopoDS_Vertex.getCPtr(Location), Location, WithContact);
  }

  public void SetLaw( TopoDS_Shape  Profile,  Law_Function  L,  TopoDS_Vertex  Location) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetLaw__SWIG_5(swigCPtr, this, TopoDS_Shape.getCPtr(Profile), Profile,  Law_Function.getCPtr(L) , L, TopoDS_Vertex.getCPtr(Location), Location);
  }

  /**
   *  Removes the section Profile from this framework.
   */
  public void Delete( TopoDS_Shape  Profile) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_Delete(swigCPtr, this, TopoDS_Shape.getCPtr(Profile), Profile);
  }

  /**
   *  Returns true if this tool object is ready to build the
   *  shape, i.e. has a definition for the wire section Profile.
   */
  public long IsReady() {
    return OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_IsReady(swigCPtr, this);
  }

  /**
   *  Get a status, when Simulate or Build failed.       It can be
   *  BRepBuilderAPI_PipeDone,
   *  BRepBuilderAPI_PipeNotDone,
   *  BRepBuilderAPI_PlaneNotIntersectGuide,
   *  BRepBuilderAPI_ImpossibleContact.
   */
  public BRepBuilderAPI_PipeError GetStatus() {
    return BRepBuilderAPI_PipeError.swigToEnum(OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_GetStatus(swigCPtr, this));
  }

  /**
   *  Sets the following tolerance values
   *  - 3D tolerance Tol3d
   *  - boundary tolerance BoundTol
   *  - angular tolerance TolAngular.
   */
  public void SetTolerance(double Tol3d, double BoundTol, double TolAngular) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetTolerance__SWIG_0(swigCPtr, this, Tol3d, BoundTol, TolAngular);
  }

  public void SetTolerance(double Tol3d, double BoundTol) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetTolerance__SWIG_1(swigCPtr, this, Tol3d, BoundTol);
  }

  public void SetTolerance(double Tol3d) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetTolerance__SWIG_2(swigCPtr, this, Tol3d);
  }

  public void SetTolerance() {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetTolerance__SWIG_3(swigCPtr, this);
  }

  /**
   *  Define the maximum V degree of resulting surface
   */
  public void SetMaxDegree(int NewMaxDegree) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetMaxDegree(swigCPtr, this, NewMaxDegree);
  }

  /**
   *  Define the maximum number of spans in V-direction
   *  on resulting surface
   */
  public void SetMaxSegments(int NewMaxSegments) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetMaxSegments(swigCPtr, this, NewMaxSegments);
  }

  /**
   *  Set the flag that indicates attempt to approximate
   *  a C1-continuous surface if a swept surface proved
   *  to be C0.
   */
  public void SetForceApproxC1(long ForceApproxC1) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetForceApproxC1(swigCPtr, this, ForceApproxC1);
  }

  /**
   *  Sets the transition mode to manage discontinuities on
   *  the swept shape caused by fractures on the spine. The
   *  transition mode can be BRepBuilderAPI_Transformed
   *  (default value), BRepBuilderAPI_RightCorner,
   *  BRepBuilderAPI_RoundCorner:
   *  -              RepBuilderAPI_Transformed:
   *  discontinuities are treated by
   *  modification of the sweeping mode. The
   *  pipe is "transformed" at the fractures of
   *  the spine. This mode assumes building a
   *  self-intersected shell.
   *  -              BRepBuilderAPI_RightCorner:
   *  discontinuities are treated like right
   *  corner. Two pieces of the pipe
   *  corresponding to two adjacent
   *  segments of the spine are extended
   *  and intersected at a fracture of the spine.
   *  -              BRepBuilderAPI_RoundCorner:
   *  discontinuities are treated like round
   *  corner. The corner is treated as rotation
   *  of the profile around an axis which
   *  passes through the point of the spine?s
   *  fracture. This axis is based on cross
   *  product of directions tangent to the
   *  adjacent segments of the spine at their common point.
   *  Warnings
   *  The mode BRepBuilderAPI_RightCorner provides a
   *  valid result if intersection of two pieces of the pipe
   *  (corresponding to two adjacent segments of the spine)
   *  in the neighborhood of the spine?s fracture is
   *  connected and planar. This condition can be violated if
   *  the spine is non-linear in some neighborhood of the
   *  fracture or if the profile was set with a scaling law.
   *  The last mode, BRepBuilderAPI_RoundCorner, will
   *  assuredly provide a good result only if a profile was set
   *  with option WithCorrection = True, i.e. it is strictly
   *  orthogonal to the spine.
   */
  public void SetTransitionMode(BRepBuilderAPI_TransitionMode Mode) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetTransitionMode__SWIG_0(swigCPtr, this, Mode.swigValue());
  }

  public void SetTransitionMode() {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_SetTransitionMode__SWIG_1(swigCPtr, this);
  }

  /**
   *  Simulates the resulting shape by calculating its
   *  cross-sections. The spine is devided by this
   *  cross-sections into (NumberOfSection - 1) equal
   *  parts, the number of cross-sections is
   *  NumberOfSection. The cross-sections are wires and
   *  they are returned in the list Result.
   *  This gives a rapid preview of the resulting shape,
   *  which will be obtained using the settings you have provided.
   *  Raises  NotDone if  <me> it is not Ready
   */
  public void Simulate(int NumberOfSection,  TopTools_ListOfShape  Result) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_Simulate(swigCPtr, this, NumberOfSection, TopTools_ListOfShape.getCPtr(Result), Result);
  }

  /**
   *  Transforms the sweeping Shell in Solid.
   *  If a propfile is not closed returns False
   */
  public long MakeSolid() {
    return OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_MakeSolid(swigCPtr, this);
  }

  public double ErrorOnSurface() {
    return OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_ErrorOnSurface(swigCPtr, this);
  }

  /**
   *  Returns the list of original profiles
   */
  public void Profiles( TopTools_ListOfShape  theProfiles) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakePipeShell_Profiles(swigCPtr, this, TopTools_ListOfShape.getCPtr(theProfiles), theProfiles);
  }

}
