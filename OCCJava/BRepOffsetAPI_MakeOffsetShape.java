package opencascade;

/**
 *  Describes functions to build a shell out of a shape. The
 *  result is an unlooped shape parallel to the source shape.
 *  A MakeOffsetShape object provides a framework for:
 *  - defining the construction of a shell
 *  - implementing the construction algorithm
 *  - consulting the result.
 */
public class BRepOffsetAPI_MakeOffsetShape extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepOffsetAPI_MakeOffsetShape(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepOffsetAPI_MakeOffsetShape_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepOffsetAPI_MakeOffsetShape(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepOffsetAPI_MakeOffsetShape_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepOffsetAPI_MakeOffsetShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepOffsetAPI_MakeOffsetShape(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Constructor does nothing.
   */
  public BRepOffsetAPI_MakeOffsetShape() {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeOffsetShape__SWIG_0(), true);
  }

  public BRepOffsetAPI_MakeOffsetShape( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection, long SelfInter, GeomAbs_JoinType Join, long RemoveIntEdges) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeOffsetShape__SWIG_1(TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue(), Intersection, SelfInter, Join.swigValue(), RemoveIntEdges), true);
  }

  public BRepOffsetAPI_MakeOffsetShape( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection, long SelfInter, GeomAbs_JoinType Join) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeOffsetShape__SWIG_2(TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue(), Intersection, SelfInter, Join.swigValue()), true);
  }

  public BRepOffsetAPI_MakeOffsetShape( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection, long SelfInter) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeOffsetShape__SWIG_3(TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue(), Intersection, SelfInter), true);
  }

  public BRepOffsetAPI_MakeOffsetShape( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeOffsetShape__SWIG_4(TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue(), Intersection), true);
  }

  public BRepOffsetAPI_MakeOffsetShape( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeOffsetShape__SWIG_5(TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue()), true);
  }

  public BRepOffsetAPI_MakeOffsetShape( TopoDS_Shape  S, double Offset, double Tol) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeOffsetShape__SWIG_6(TopoDS_Shape.getCPtr(S), S, Offset, Tol), true);
  }

  /**
   *  Constructs offset shape for the given one using simple algorithm without intersections computation.
   */
  public void PerformBySimple( TopoDS_Shape  theS, double theOffsetValue) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeOffsetShape_PerformBySimple(swigCPtr, this, TopoDS_Shape.getCPtr(theS), theS, theOffsetValue);
  }

  /**
   *  Constructs a shape parallel to the shape S, where
   *  - S may be a face, a shell, a solid or a compound of these shape kinds;
   *  - Offset is the offset value. The offset shape is constructed:
   *  - outside S, if Offset is positive,
   *  - inside S, if Offset is negative;
   *  - Tol defines the coincidence tolerance criterion for generated shapes;
   *  - Mode defines the construction type of parallels
   *  applied to the free edges of shape S; currently, only one
   *  construction type is implemented, namely the one where the free
   *  edges do not generate parallels; this corresponds to the default
   *  value BRepOffset_Skin;
   *  - Intersection specifies how the algorithm must work in
   *  order to limit the parallels to two adjacent shapes:
   *  - if Intersection is false (default value), the intersection
   *  is calculated with the parallels to the two adjacent shapes,
   *  - if Intersection is true, the intersection is calculated by
   *  taking all generated parallels into account; this computation method is
   *  more general as it avoids some self-intersections generated in the
   *  offset shape from features of small dimensions on shape S, however this
   *  method has not been completely implemented and therefore is not
   *  recommended for use;
   *  - SelfInter tells the algorithm whether a computation
   *  to eliminate self-intersections must be applied to the resulting
   *  shape; however, as this functionality is not yet
   *  implemented, it is recommended to use the default value (false);
   *  - Join defines how to fill the holes that may appear between
   *  parallels to the two adjacent faces. It may take values
   *  GeomAbs_Arc or GeomAbs_Intersection:
   *  - if Join is equal to GeomAbs_Arc, then pipes are generated
   *  between two free edges of two adjacent parallels,
   *  and spheres are generated on "images" of vertices;
   *  it is the default value,
   *  - if Join is equal to GeomAbs_Intersection, then the parallels to the
   *  two adjacent faces are enlarged and intersected,
   *  so that there are no free edges on parallels to faces.
   *  RemoveIntEdges flag defines whether to remove the INTERNAL edges 
   *  from the result or not.
   *  Warnings
   *  1. All the faces of the shape S should be based on the surfaces
   *  with continuity at least C1.
   *  2. The offset value should be sufficiently small to avoid
   *  self-intersections in resulting shape. Otherwise these
   *  self-intersections may appear inside an offset face if its
   *  initial surface is not plane or sphere or cylinder, also some
   *  non-adjacent offset faces may intersect each other. Also, some
   *  offset surfaces may "turn inside out".
   *  3. The algorithm may fail if the shape S contains vertices where
   *  more than 3 edges converge.
   *  4. Since 3d-offset algorithm involves intersection of surfaces,
   *  it is under limitations of surface intersection algorithm.
   *  5. A result cannot be generated if the underlying geometry of S is
   *  BSpline with continuity C0.
   *  Exceptions
   *  Geom_UndefinedDerivative if the underlying
   *  geometry of S is BSpline with continuity C0.
   */
  public void PerformByJoin( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection, long SelfInter, GeomAbs_JoinType Join, long RemoveIntEdges) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeOffsetShape_PerformByJoin__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue(), Intersection, SelfInter, Join.swigValue(), RemoveIntEdges);
  }

  public void PerformByJoin( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection, long SelfInter, GeomAbs_JoinType Join) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeOffsetShape_PerformByJoin__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue(), Intersection, SelfInter, Join.swigValue());
  }

  public void PerformByJoin( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection, long SelfInter) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeOffsetShape_PerformByJoin__SWIG_2(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue(), Intersection, SelfInter);
  }

  public void PerformByJoin( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeOffsetShape_PerformByJoin__SWIG_3(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue(), Intersection);
  }

  public void PerformByJoin( TopoDS_Shape  S, double Offset, double Tol, BRepOffset_Mode Mode) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeOffsetShape_PerformByJoin__SWIG_4(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, Offset, Tol, Mode.swigValue());
  }

  public void PerformByJoin( TopoDS_Shape  S, double Offset, double Tol) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeOffsetShape_PerformByJoin__SWIG_5(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, Offset, Tol);
  }

  /**
   *  Returns instance of the unrelying intersection / arc algorithm.
   */
  public  BRepOffset_MakeOffset  MakeOffset() {
    BRepOffset_MakeOffset ret = new BRepOffset_MakeOffset(OCCwrapJavaJNI.BRepOffsetAPI_MakeOffsetShape_MakeOffset(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the list of edges generated from the shape <S>.
   */
  public  TopTools_ListOfShape  GeneratedEdge( TopoDS_Shape  S) {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BRepOffsetAPI_MakeOffsetShape_GeneratedEdge(swigCPtr, this, TopoDS_Shape.getCPtr(S), S), false, this);
    return ret;
  }

  /**
   *  Returns offset join type.
   */
  public GeomAbs_JoinType GetJoinType() {
    return GeomAbs_JoinType.swigToEnum(OCCwrapJavaJNI.BRepOffsetAPI_MakeOffsetShape_GetJoinType(swigCPtr, this));
  }

}
