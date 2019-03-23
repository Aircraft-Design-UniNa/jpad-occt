package opencascade;

public class BRepOffset_MakeOffset {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepOffset_MakeOffset(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepOffset_MakeOffset(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepOffset_MakeOffset obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepOffset_MakeOffset(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BRepOffset_MakeOffset() {
    this(OCCwrapJavaJNI.new_BRepOffset_MakeOffset__SWIG_0(), true);
  }

  public BRepOffset_MakeOffset( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection, long SelfInter, GeomAbs_JoinType Join, long Thickening, long RemoveIntEdges) {
    this(OCCwrapJavaJNI.new_BRepOffset_MakeOffset__SWIG_1(TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue(), Intersection, SelfInter, Join.swigValue(), Thickening, RemoveIntEdges), true);
  }

  public BRepOffset_MakeOffset( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection, long SelfInter, GeomAbs_JoinType Join, long Thickening) {
    this(OCCwrapJavaJNI.new_BRepOffset_MakeOffset__SWIG_2(TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue(), Intersection, SelfInter, Join.swigValue(), Thickening), true);
  }

  public BRepOffset_MakeOffset( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection, long SelfInter, GeomAbs_JoinType Join) {
    this(OCCwrapJavaJNI.new_BRepOffset_MakeOffset__SWIG_3(TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue(), Intersection, SelfInter, Join.swigValue()), true);
  }

  public BRepOffset_MakeOffset( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection, long SelfInter) {
    this(OCCwrapJavaJNI.new_BRepOffset_MakeOffset__SWIG_4(TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue(), Intersection, SelfInter), true);
  }

  public BRepOffset_MakeOffset( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection) {
    this(OCCwrapJavaJNI.new_BRepOffset_MakeOffset__SWIG_5(TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue(), Intersection), true);
  }

  public BRepOffset_MakeOffset( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode) {
    this(OCCwrapJavaJNI.new_BRepOffset_MakeOffset__SWIG_6(TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue()), true);
  }

  public BRepOffset_MakeOffset( TopoDS_Shape  S, double Offset, double Tol) {
    this(OCCwrapJavaJNI.new_BRepOffset_MakeOffset__SWIG_7(TopoDS_Shape.getCPtr(S), S, Offset, Tol), true);
  }

  public void Initialize( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection, long SelfInter, GeomAbs_JoinType Join, long Thickening, long RemoveIntEdges) {
    OCCwrapJavaJNI.BRepOffset_MakeOffset_Initialize__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue(), Intersection, SelfInter, Join.swigValue(), Thickening, RemoveIntEdges);
  }

  public void Initialize( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection, long SelfInter, GeomAbs_JoinType Join, long Thickening) {
    OCCwrapJavaJNI.BRepOffset_MakeOffset_Initialize__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue(), Intersection, SelfInter, Join.swigValue(), Thickening);
  }

  public void Initialize( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection, long SelfInter, GeomAbs_JoinType Join) {
    OCCwrapJavaJNI.BRepOffset_MakeOffset_Initialize__SWIG_2(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue(), Intersection, SelfInter, Join.swigValue());
  }

  public void Initialize( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection, long SelfInter) {
    OCCwrapJavaJNI.BRepOffset_MakeOffset_Initialize__SWIG_3(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue(), Intersection, SelfInter);
  }

  public void Initialize( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection) {
    OCCwrapJavaJNI.BRepOffset_MakeOffset_Initialize__SWIG_4(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue(), Intersection);
  }

  public void Initialize( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode) {
    OCCwrapJavaJNI.BRepOffset_MakeOffset_Initialize__SWIG_5(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue());
  }

  public void Initialize( TopoDS_Shape  S, double Offset, double Tol) {
    OCCwrapJavaJNI.BRepOffset_MakeOffset_Initialize__SWIG_6(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, Offset, Tol);
  }

  public void Clear() {
    OCCwrapJavaJNI.BRepOffset_MakeOffset_Clear(swigCPtr, this);
  }

  /**
   *  Add Closing Faces,  <F>  has to be  in  the initial
   *  shape S.
   */
  public void AddFace( TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepOffset_MakeOffset_AddFace(swigCPtr, this, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  set the offset <Off> on the Face <F>
   */
  public void SetOffsetOnFace( TopoDS_Face  F, double Off) {
    OCCwrapJavaJNI.BRepOffset_MakeOffset_SetOffsetOnFace(swigCPtr, this, TopoDS_Face.getCPtr(F), F, Off);
  }

  public void MakeOffsetShape() {
    OCCwrapJavaJNI.BRepOffset_MakeOffset_MakeOffsetShape(swigCPtr, this);
  }

  public void MakeThickSolid() {
    OCCwrapJavaJNI.BRepOffset_MakeOffset_MakeThickSolid(swigCPtr, this);
  }

  public long IsDone() {
    return OCCwrapJavaJNI.BRepOffset_MakeOffset_IsDone(swigCPtr, this);
  }

  public  TopoDS_Shape  Shape() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepOffset_MakeOffset_Shape(swigCPtr, this), true);
    return ret;
  }

  /**
   *  returns information about offset state.
   */
  public BRepOffset_Error Error() {
    return BRepOffset_Error.swigToEnum(OCCwrapJavaJNI.BRepOffset_MakeOffset_Error(swigCPtr, this));
  }

  /**
   *  Returns <Image> containing links between initials
   *  shapes and offset faces.
   */
  public  BRepAlgo_Image  OffsetFacesFromShapes() {
    BRepAlgo_Image ret = new BRepAlgo_Image(OCCwrapJavaJNI.BRepOffset_MakeOffset_OffsetFacesFromShapes(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns myJoin.
   */
  public GeomAbs_JoinType GetJoinType() {
    return GeomAbs_JoinType.swigToEnum(OCCwrapJavaJNI.BRepOffset_MakeOffset_GetJoinType(swigCPtr, this));
  }

  /**
   *  Returns <Image> containing links between initials
   *  shapes and offset edges.
   */
  public  BRepAlgo_Image  OffsetEdgesFromShapes() {
    BRepAlgo_Image ret = new BRepAlgo_Image(OCCwrapJavaJNI.BRepOffset_MakeOffset_OffsetEdgesFromShapes(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the list of closing faces stores by AddFace
   */
  public  TopTools_IndexedMapOfShape  ClosingFaces() {
    TopTools_IndexedMapOfShape ret = new TopTools_IndexedMapOfShape(OCCwrapJavaJNI.BRepOffset_MakeOffset_ClosingFaces(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Makes pre analysis of possibility offset perform. Use method Error() to get more information.
   *  Finds first error. List of checks:
   *  1) Check for existence object with non-null offset.
   *  2) Check for connectivity in offset shell.
   *  3) Check continuity of input surfaces.
   *  4) Check for normals existence on grid.
   *  @return True if possible make computations and false otherwise.
   */
  public long CheckInputData() {
    return OCCwrapJavaJNI.BRepOffset_MakeOffset_CheckInputData(swigCPtr, this);
  }

  /**
   *  Return bad shape, which obtained in CheckInputData.
   */
  public  TopoDS_Shape  GetBadShape() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepOffset_MakeOffset_GetBadShape(swigCPtr, this), true);
    return ret;
  }

}
