package opencascade;

/**
 *  Constructs an evolved volume from a spine (wire or face)
 *  and  a profile ( wire).
 */
public class BRepFill_Evolved {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepFill_Evolved(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepFill_Evolved(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepFill_Evolved obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepFill_Evolved(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BRepFill_Evolved() {
    this(OCCwrapJavaJNI.new_BRepFill_Evolved__SWIG_0(), true);
  }

  /**
   *  Creates an evolved shape by sweeping the <Profile>
   *  along the  <Spine>.  <AxeProf> is  used to set the
   *  position of <Profile> along  <Spine> as  follows:
   *  <AxeProf> slides on the profile with direction
   *  colinear to the normal to <Spine>, and its
   *  <XDirection> mixed with the tangent to <Spine>.
   */
  public BRepFill_Evolved( TopoDS_Wire  Spine,  TopoDS_Wire  Profile,  gp_Ax3  AxeProf, GeomAbs_JoinType Join, long Solid) {
    this(OCCwrapJavaJNI.new_BRepFill_Evolved__SWIG_1(TopoDS_Wire.getCPtr(Spine), Spine, TopoDS_Wire.getCPtr(Profile), Profile, gp_Ax3.getCPtr(AxeProf), AxeProf, Join.swigValue(), Solid), true);
  }

  /**
   *  Creates an  evolved shape  by sweeping the <Profile>
   *  along the <Spine>
   */
  public BRepFill_Evolved( TopoDS_Wire  Spine,  TopoDS_Wire  Profile,  gp_Ax3  AxeProf, GeomAbs_JoinType Join) {
    this(OCCwrapJavaJNI.new_BRepFill_Evolved__SWIG_2(TopoDS_Wire.getCPtr(Spine), Spine, TopoDS_Wire.getCPtr(Profile), Profile, gp_Ax3.getCPtr(AxeProf), AxeProf, Join.swigValue()), true);
  }

  public BRepFill_Evolved( TopoDS_Wire  Spine,  TopoDS_Wire  Profile,  gp_Ax3  AxeProf) {
    this(OCCwrapJavaJNI.new_BRepFill_Evolved__SWIG_3(TopoDS_Wire.getCPtr(Spine), Spine, TopoDS_Wire.getCPtr(Profile), Profile, gp_Ax3.getCPtr(AxeProf), AxeProf), true);
  }

  public BRepFill_Evolved( TopoDS_Face  Spine,  TopoDS_Wire  Profile,  gp_Ax3  AxeProf, GeomAbs_JoinType Join, long Solid) {
    this(OCCwrapJavaJNI.new_BRepFill_Evolved__SWIG_4(TopoDS_Face.getCPtr(Spine), Spine, TopoDS_Wire.getCPtr(Profile), Profile, gp_Ax3.getCPtr(AxeProf), AxeProf, Join.swigValue(), Solid), true);
  }

  public BRepFill_Evolved( TopoDS_Face  Spine,  TopoDS_Wire  Profile,  gp_Ax3  AxeProf, GeomAbs_JoinType Join) {
    this(OCCwrapJavaJNI.new_BRepFill_Evolved__SWIG_5(TopoDS_Face.getCPtr(Spine), Spine, TopoDS_Wire.getCPtr(Profile), Profile, gp_Ax3.getCPtr(AxeProf), AxeProf, Join.swigValue()), true);
  }

  public BRepFill_Evolved( TopoDS_Face  Spine,  TopoDS_Wire  Profile,  gp_Ax3  AxeProf) {
    this(OCCwrapJavaJNI.new_BRepFill_Evolved__SWIG_6(TopoDS_Face.getCPtr(Spine), Spine, TopoDS_Wire.getCPtr(Profile), Profile, gp_Ax3.getCPtr(AxeProf), AxeProf), true);
  }

  /**
   *  Performs an  evolved shape  by sweeping the <Profile>
   *  along the <Spine>
   */
  public void Perform( TopoDS_Wire  Spine,  TopoDS_Wire  Profile,  gp_Ax3  AxeProf, GeomAbs_JoinType Join, long Solid) {
    OCCwrapJavaJNI.BRepFill_Evolved_Perform__SWIG_0(swigCPtr, this, TopoDS_Wire.getCPtr(Spine), Spine, TopoDS_Wire.getCPtr(Profile), Profile, gp_Ax3.getCPtr(AxeProf), AxeProf, Join.swigValue(), Solid);
  }

  /**
   *  Performs an  evolved shape  by sweeping the <Profile>
   *  along the <Spine>
   */
  public void Perform( TopoDS_Wire  Spine,  TopoDS_Wire  Profile,  gp_Ax3  AxeProf, GeomAbs_JoinType Join) {
    OCCwrapJavaJNI.BRepFill_Evolved_Perform__SWIG_1(swigCPtr, this, TopoDS_Wire.getCPtr(Spine), Spine, TopoDS_Wire.getCPtr(Profile), Profile, gp_Ax3.getCPtr(AxeProf), AxeProf, Join.swigValue());
  }

  public void Perform( TopoDS_Wire  Spine,  TopoDS_Wire  Profile,  gp_Ax3  AxeProf) {
    OCCwrapJavaJNI.BRepFill_Evolved_Perform__SWIG_2(swigCPtr, this, TopoDS_Wire.getCPtr(Spine), Spine, TopoDS_Wire.getCPtr(Profile), Profile, gp_Ax3.getCPtr(AxeProf), AxeProf);
  }

  public void Perform( TopoDS_Face  Spine,  TopoDS_Wire  Profile,  gp_Ax3  AxeProf, GeomAbs_JoinType Join, long Solid) {
    OCCwrapJavaJNI.BRepFill_Evolved_Perform__SWIG_3(swigCPtr, this, TopoDS_Face.getCPtr(Spine), Spine, TopoDS_Wire.getCPtr(Profile), Profile, gp_Ax3.getCPtr(AxeProf), AxeProf, Join.swigValue(), Solid);
  }

  public void Perform( TopoDS_Face  Spine,  TopoDS_Wire  Profile,  gp_Ax3  AxeProf, GeomAbs_JoinType Join) {
    OCCwrapJavaJNI.BRepFill_Evolved_Perform__SWIG_4(swigCPtr, this, TopoDS_Face.getCPtr(Spine), Spine, TopoDS_Wire.getCPtr(Profile), Profile, gp_Ax3.getCPtr(AxeProf), AxeProf, Join.swigValue());
  }

  public void Perform( TopoDS_Face  Spine,  TopoDS_Wire  Profile,  gp_Ax3  AxeProf) {
    OCCwrapJavaJNI.BRepFill_Evolved_Perform__SWIG_5(swigCPtr, this, TopoDS_Face.getCPtr(Spine), Spine, TopoDS_Wire.getCPtr(Profile), Profile, gp_Ax3.getCPtr(AxeProf), AxeProf);
  }

  public long IsDone() {
    return OCCwrapJavaJNI.BRepFill_Evolved_IsDone(swigCPtr, this);
  }

  /**
   *  returns the generated shape.
   */
  public  TopoDS_Shape  Shape() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepFill_Evolved_Shape(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns   the  shapes  created  from   a  subshape
   *  <SpineShape>  of     the  spine   and   a subshape
   *  <ProfShape> on the profile.
   */
  public  TopTools_ListOfShape  GeneratedShapes( TopoDS_Shape  SpineShape,  TopoDS_Shape  ProfShape) {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BRepFill_Evolved_GeneratedShapes(swigCPtr, this, TopoDS_Shape.getCPtr(SpineShape), SpineShape, TopoDS_Shape.getCPtr(ProfShape), ProfShape), false, this);
    return ret;
  }

  public GeomAbs_JoinType JoinType() {
    return GeomAbs_JoinType.swigToEnum(OCCwrapJavaJNI.BRepFill_Evolved_JoinType(swigCPtr, this));
  }

  /**
   *  Return the face Top if <Solid> is True in the constructor.
   */
  public  TopoDS_Shape  Top() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepFill_Evolved_Top(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Return the face Bottom  if <Solid> is True in the constructor.
   */
  public  TopoDS_Shape  Bottom() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepFill_Evolved_Bottom(swigCPtr, this), true);
    return ret;
  }

}
