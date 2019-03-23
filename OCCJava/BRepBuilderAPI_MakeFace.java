package opencascade;

/**
 *  Provides methods to build faces.
 * 
 *  A face may be built :
 * 
 *  * From a surface.
 * 
 *  - Elementary surface from gp.
 * 
 *  - Surface from Geom.
 * 
 *  * From a surface and U,V values.
 * 
 *  * From a wire.
 * 
 *  - Find the surface automatically if possible.
 * 
 *  * From a surface and a wire.
 * 
 *  - A flag Inside is given, when this flag is True
 *  the  wire is  oriented to bound a finite area on
 *  the surface.
 * 
 *  * From a face and a wire.
 * 
 *  - The new wire is a perforation.
 */
public class BRepBuilderAPI_MakeFace extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepBuilderAPI_MakeFace(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_MakeFace_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepBuilderAPI_MakeFace(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_MakeFace_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepBuilderAPI_MakeFace obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepBuilderAPI_MakeFace(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Not done.
   */
  public BRepBuilderAPI_MakeFace() {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_0(), true);
  }

  /**
   *  Load a face. Usefull to add wires.
   */
  public BRepBuilderAPI_MakeFace( TopoDS_Face  F) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_1(TopoDS_Face.getCPtr(F), F), true);
  }

  /**
   *  Make a face from a plane.
   */
  public BRepBuilderAPI_MakeFace( gp_Pln  P) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_2(gp_Pln.getCPtr(P), P), true);
  }

  /**
   *  Make a face from a cylinder.
   */
  public BRepBuilderAPI_MakeFace( gp_Cylinder  C) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_3(gp_Cylinder.getCPtr(C), C), true);
  }

  /**
   *  Make a face from a cone.
   */
  public BRepBuilderAPI_MakeFace( gp_Cone  C) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_4(gp_Cone.getCPtr(C), C), true);
  }

  /**
   *  Make a face from a sphere.
   */
  public BRepBuilderAPI_MakeFace( gp_Sphere  S) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_5(gp_Sphere.getCPtr(S), S), true);
  }

  /**
   *  Make a face from a torus.
   */
  public BRepBuilderAPI_MakeFace( gp_Torus  C) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_6(gp_Torus.getCPtr(C), C), true);
  }

  /**
   *  Make a face from a Surface. Accepts tolerance value (TolDegen)
   *  for resolution of degenerated edges.
   */
  public BRepBuilderAPI_MakeFace( Geom_Surface  S, double TolDegen) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_7( Geom_Surface.getCPtr(S) , S, TolDegen), true);
  }

  /**
   *  Make a face from a plane.
   */
  public BRepBuilderAPI_MakeFace( gp_Pln  P, double UMin, double UMax, double VMin, double VMax) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_8(gp_Pln.getCPtr(P), P, UMin, UMax, VMin, VMax), true);
  }

  /**
   *  Make a face from a cylinder.
   */
  public BRepBuilderAPI_MakeFace( gp_Cylinder  C, double UMin, double UMax, double VMin, double VMax) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_9(gp_Cylinder.getCPtr(C), C, UMin, UMax, VMin, VMax), true);
  }

  /**
   *  Make a face from a cone.
   */
  public BRepBuilderAPI_MakeFace( gp_Cone  C, double UMin, double UMax, double VMin, double VMax) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_10(gp_Cone.getCPtr(C), C, UMin, UMax, VMin, VMax), true);
  }

  /**
   *  Make a face from a sphere.
   */
  public BRepBuilderAPI_MakeFace( gp_Sphere  S, double UMin, double UMax, double VMin, double VMax) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_11(gp_Sphere.getCPtr(S), S, UMin, UMax, VMin, VMax), true);
  }

  /**
   *  Make a face from a torus.
   */
  public BRepBuilderAPI_MakeFace( gp_Torus  C, double UMin, double UMax, double VMin, double VMax) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_12(gp_Torus.getCPtr(C), C, UMin, UMax, VMin, VMax), true);
  }

  /**
   *  Make a face from a Surface. Accepts tolerance value (TolDegen)
   *  for resolution of degenerated edges.
   */
  public BRepBuilderAPI_MakeFace( Geom_Surface  S, double UMin, double UMax, double VMin, double VMax, double TolDegen) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_13( Geom_Surface.getCPtr(S) , S, UMin, UMax, VMin, VMax, TolDegen), true);
  }

  /**
   *  Find a surface from the wire and make a face.
   *  if <OnlyPlane> is true, the computed surface will be
   *  a plane. If it is not possible to find a plane, the
   *  flag NotDone will be set.
   */
  public BRepBuilderAPI_MakeFace( TopoDS_Wire  W, long OnlyPlane) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_14(TopoDS_Wire.getCPtr(W), W, OnlyPlane), true);
  }

  /**
   *  Make a face from a plane and a wire.
   */
  public BRepBuilderAPI_MakeFace( TopoDS_Wire  W) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_15(TopoDS_Wire.getCPtr(W), W), true);
  }

  /**
   *  Make a face from a cylinder and a wire.
   */
  public BRepBuilderAPI_MakeFace( gp_Pln  P,  TopoDS_Wire  W, long Inside) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_16(gp_Pln.getCPtr(P), P, TopoDS_Wire.getCPtr(W), W, Inside), true);
  }

  /**
   *  Make a face from a cone and a wire.
   */
  public BRepBuilderAPI_MakeFace( gp_Pln  P,  TopoDS_Wire  W) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_17(gp_Pln.getCPtr(P), P, TopoDS_Wire.getCPtr(W), W), true);
  }

  /**
   *  Make a face from a sphere and a wire.
   */
  public BRepBuilderAPI_MakeFace( gp_Cylinder  C,  TopoDS_Wire  W, long Inside) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_18(gp_Cylinder.getCPtr(C), C, TopoDS_Wire.getCPtr(W), W, Inside), true);
  }

  /**
   *  Make a face from a torus and a wire.
   */
  public BRepBuilderAPI_MakeFace( gp_Cylinder  C,  TopoDS_Wire  W) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_19(gp_Cylinder.getCPtr(C), C, TopoDS_Wire.getCPtr(W), W), true);
  }

  /**
   *  Make a face from a Surface and a wire.
   */
  public BRepBuilderAPI_MakeFace( gp_Cone  C,  TopoDS_Wire  W, long Inside) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_20(gp_Cone.getCPtr(C), C, TopoDS_Wire.getCPtr(W), W, Inside), true);
  }

  /**
   *  Adds the wire <W> in the face <F>
   *  A general method to create a face is to give
   *  -      a surface S as the support (the geometric domain) of the face,
   *  -      and a wire W to bound it.
   *  The bounds of the face can also be defined by four parameter values
   *  umin, umax, vmin, vmax which determine isoparametric limitations on
   *  the parametric space of the surface. In this way, a patch is
   *  defined. The parameter values are optional. If they are omitted, the
   *  natural bounds of the surface are used. A wire is automatically
   *  built using the defined bounds. Up to four edges and four vertices
   *  are created with this wire (no edge is created when the
   *  corresponding parameter value is infinite).
   *  Wires can then be added using the function Add to define other
   *  restrictions on the face. These restrictions represent holes. More
   *  than one wire may be added by this way, provided that the wires do
   *  not cross each other and that they define only one area on the
   *  surface. (Be careful, however, as this is not checked).
   *  Forbidden addition of wires
   *  Note that in this schema, the third case is valid if edges of the
   *  wire W are declared internal to the face. As a result, these edges
   *  are no longer bounds of the face.
   *  A default tolerance (Precision::Confusion()) is given to the face,
   *  this tolerance may be increased during construction of the face
   *  using various algorithms.
   *  Rules applied to the arguments
   *  For the surface:
   *  -      The surface must not be a 'null handle'.
   *  -      If the surface is a trimmed surface, the basis surface is used.
   *  -      For the wire: the wire is composed of connected edges, each
   *  edge having a parametric curve description in the parametric
   *  domain of the surface; in other words, as a pcurve.
   *  For the parameters:
   *  -      The parameter values must be in the parametric range of the
   *  surface (or the basis surface, if the surface is trimmed). If this
   *  condition is not satisfied, the face is not built, and the Error
   *  function will return BRepBuilderAPI_ParametersOutOfRange.
   *  -      The bounding parameters p1 and p2 are adjusted on a periodic
   *  surface in a given parametric direction by adding or subtracting
   *  the period to obtain p1 in the parametric range of the surface and
   *  such p2, that p2 - p1 <= Period, where Period is the period of the
   *  surface in this parametric direction.
   *  -      A parameter value may be infinite. There will be no edge and
   *  no vertex in the corresponding direction.
   */
  public BRepBuilderAPI_MakeFace( gp_Cone  C,  TopoDS_Wire  W) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_21(gp_Cone.getCPtr(C), C, TopoDS_Wire.getCPtr(W), W), true);
  }

  public BRepBuilderAPI_MakeFace( gp_Sphere  S,  TopoDS_Wire  W, long Inside) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_22(gp_Sphere.getCPtr(S), S, TopoDS_Wire.getCPtr(W), W, Inside), true);
  }

  public BRepBuilderAPI_MakeFace( gp_Sphere  S,  TopoDS_Wire  W) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_23(gp_Sphere.getCPtr(S), S, TopoDS_Wire.getCPtr(W), W), true);
  }

  public BRepBuilderAPI_MakeFace( gp_Torus  C,  TopoDS_Wire  W, long Inside) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_24(gp_Torus.getCPtr(C), C, TopoDS_Wire.getCPtr(W), W, Inside), true);
  }

  public BRepBuilderAPI_MakeFace( gp_Torus  C,  TopoDS_Wire  W) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_25(gp_Torus.getCPtr(C), C, TopoDS_Wire.getCPtr(W), W), true);
  }

  public BRepBuilderAPI_MakeFace( Geom_Surface  S,  TopoDS_Wire  W, long Inside) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_26( Geom_Surface.getCPtr(S) , S, TopoDS_Wire.getCPtr(W), W, Inside), true);
  }

  public BRepBuilderAPI_MakeFace( Geom_Surface  S,  TopoDS_Wire  W) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_27( Geom_Surface.getCPtr(S) , S, TopoDS_Wire.getCPtr(W), W), true);
  }

  public BRepBuilderAPI_MakeFace( TopoDS_Face  F,  TopoDS_Wire  W) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeFace__SWIG_28(TopoDS_Face.getCPtr(F), F, TopoDS_Wire.getCPtr(W), W), true);
  }

  /**
   *  Initializes (or reinitializes) the
   *  construction of a face by creating a new object which is a copy of
   *  the face F, in order to add wires to it, using the function Add.
   *  Note: this complete copy of the geometry is only required if you
   *  want to work on the geometries of the two faces independently.
   */
  public void Init( TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeFace_Init__SWIG_0(swigCPtr, this, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Initializes (or reinitializes) the construction of a face on
   *  the surface S. If Bound is true, a wire is
   *  automatically created from the natural bounds of the
   *  surface S and added to the face in order to bound it. If
   *  Bound is false, no wire is added. This option is used
   *  when real bounds are known. These will be added to
   *  the face after this initialization, using the function Add.
   *  TolDegen parameter is used for resolution of degenerated edges
   *  if calculation of natural bounds is turned on.
   */
  public void Init( Geom_Surface  S, long Bound, double TolDegen) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeFace_Init__SWIG_1(swigCPtr, this,  Geom_Surface.getCPtr(S) , S, Bound, TolDegen);
  }

  /**
   *  Initializes (or reinitializes) the construction of a face on
   *  the surface S, limited in the u parametric direction by
   *  the two parameter values UMin and UMax and in the
   *  v parametric direction by the two parameter values VMin and VMax.
   *  Warning
   *  Error returns:
   *  -      BRepBuilderAPI_ParametersOutOfRange
   *  when the parameters given are outside the bounds of the
   *  surface or the basis surface of a trimmed surface.
   *  TolDegen parameter is used for resolution of degenerated edges.
   */
  public void Init( Geom_Surface  S, double UMin, double UMax, double VMin, double VMax, double TolDegen) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeFace_Init__SWIG_2(swigCPtr, this,  Geom_Surface.getCPtr(S) , S, UMin, UMax, VMin, VMax, TolDegen);
  }

  /**
   *  Adds the wire W to the constructed face as a hole.
   *  Warning
   *  W must not cross the other bounds of the face, and all
   *  the bounds must define only one area on the surface.
   *  (Be careful, however, as this is not checked.)
   *  Example
   *  // a cylinder
   *  gp_Cylinder C = ..;
   *  // a wire
   *  TopoDS_Wire W = ...;
   *  BRepBuilderAPI_MakeFace MF(C);
   *  MF.Add(W);
   *  TopoDS_Face F = MF;
   */
  public void Add( TopoDS_Wire  W) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeFace_Add(swigCPtr, this, TopoDS_Wire.getCPtr(W), W);
  }

  /**
   *  Returns the construction status
   *  BRepBuilderAPI_FaceDone if the face is built, or
   *  -   another value of the BRepBuilderAPI_FaceError
   *  enumeration indicating why the construction failed, in
   *  particular when the given parameters are outside the
   *  bounds of the surface.
   */
  public BRepBuilderAPI_FaceError Error() {
    return BRepBuilderAPI_FaceError.swigToEnum(OCCwrapJavaJNI.BRepBuilderAPI_MakeFace_Error(swigCPtr, this));
  }

  /**
   *  Returns the constructed face.
   *  Exceptions
   *  StdFail_NotDone if no face is built.
   */
  public  TopoDS_Face  Face() {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.BRepBuilderAPI_MakeFace_Face(swigCPtr, this), true);
    return ret;
  }

}
