package opencascade;

/**
 *  Describes functions to build hollowed solids.
 *  A hollowed solid is built from an initial solid and a set of
 *  faces on this solid, which are to be removed. The
 *  remaining faces of the solid become the walls of the
 *  hollowed solid, their thickness defined at the time of construction.
 *  the solid is built from an initial
 *  solid  <S> and a  set of  faces {Fi} from  <S>,
 *  builds a   solid  composed  by two shells closed  by
 *  the {Fi}. First shell <SS>   is composed by all
 *  the faces of <S> expected {Fi}.  Second shell is
 *  the offset shell of <SS>.
 *  A MakeThickSolid object provides a framework for:
 *  - defining the cross-section of a hollowed solid,
 *  - implementing the construction algorithm, and
 *  - consulting the result.
 */
public class BRepOffsetAPI_MakeThickSolid extends BRepOffsetAPI_MakeOffsetShape {

  private long swigCPtr;
  BRepOffsetAPI_MakeThickSolid(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepOffsetAPI_MakeThickSolid_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepOffsetAPI_MakeThickSolid(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepOffsetAPI_MakeThickSolid_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepOffsetAPI_MakeThickSolid obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepOffsetAPI_MakeThickSolid(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Constructor does nothing.
   */
  public BRepOffsetAPI_MakeThickSolid() {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeThickSolid__SWIG_0(), true);
  }

  public BRepOffsetAPI_MakeThickSolid( TopoDS_Shape  S,  TopTools_ListOfShape  ClosingFaces, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection, long SelfInter, GeomAbs_JoinType Join, long RemoveIntEdges) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeThickSolid__SWIG_1(TopoDS_Shape.getCPtr(S), S, TopTools_ListOfShape.getCPtr(ClosingFaces), ClosingFaces, Offset, Tol, Mode.swigValue(), Intersection, SelfInter, Join.swigValue(), RemoveIntEdges), true);
  }

  public BRepOffsetAPI_MakeThickSolid( TopoDS_Shape  S,  TopTools_ListOfShape  ClosingFaces, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection, long SelfInter, GeomAbs_JoinType Join) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeThickSolid__SWIG_2(TopoDS_Shape.getCPtr(S), S, TopTools_ListOfShape.getCPtr(ClosingFaces), ClosingFaces, Offset, Tol, Mode.swigValue(), Intersection, SelfInter, Join.swigValue()), true);
  }

  public BRepOffsetAPI_MakeThickSolid( TopoDS_Shape  S,  TopTools_ListOfShape  ClosingFaces, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection, long SelfInter) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeThickSolid__SWIG_3(TopoDS_Shape.getCPtr(S), S, TopTools_ListOfShape.getCPtr(ClosingFaces), ClosingFaces, Offset, Tol, Mode.swigValue(), Intersection, SelfInter), true);
  }

  public BRepOffsetAPI_MakeThickSolid( TopoDS_Shape  S,  TopTools_ListOfShape  ClosingFaces, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeThickSolid__SWIG_4(TopoDS_Shape.getCPtr(S), S, TopTools_ListOfShape.getCPtr(ClosingFaces), ClosingFaces, Offset, Tol, Mode.swigValue(), Intersection), true);
  }

  public BRepOffsetAPI_MakeThickSolid( TopoDS_Shape  S,  TopTools_ListOfShape  ClosingFaces, double Offset, double Tol, BRepOffset_Mode Mode) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeThickSolid__SWIG_5(TopoDS_Shape.getCPtr(S), S, TopTools_ListOfShape.getCPtr(ClosingFaces), ClosingFaces, Offset, Tol, Mode.swigValue()), true);
  }

  public BRepOffsetAPI_MakeThickSolid( TopoDS_Shape  S,  TopTools_ListOfShape  ClosingFaces, double Offset, double Tol) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeThickSolid__SWIG_6(TopoDS_Shape.getCPtr(S), S, TopTools_ListOfShape.getCPtr(ClosingFaces), ClosingFaces, Offset, Tol), true);
  }

  /**
   *  Constructs solid using simple algorithm. 
   *  According to its nature it is not possible to set list of the closing faces.
   *  This algorithm does not support faces removing. It is caused by fact that 
   *  intersections are not computed during offset creation.
   *  Non-closed shell or face is expected as input.
   */
  public void MakeThickSolidBySimple( TopoDS_Shape  theS, double theOffsetValue) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeThickSolid_MakeThickSolidBySimple(swigCPtr, this, TopoDS_Shape.getCPtr(theS), theS, theOffsetValue);
  }

  /**
   *  Constructs a hollowed solid from
   *  the solid S by removing the set of faces ClosingFaces from S, where:
   *  Offset defines the thickness of the walls. Its sign indicates
   *  which side of the surface of the solid the hollowed shape is built on;
   *  - Tol defines the tolerance criterion for coincidence in generated shapes;
   *  - Mode defines the construction type of parallels applied to free
   *  edges of shape S. Currently, only one construction type is
   *  implemented, namely the one where the free edges do not generate
   *  parallels; this corresponds to the default value BRepOffset_Skin;
   *  Intersection specifies how the algorithm must work in order to
   *  limit the parallels to two adjacent shapes:
   *  - if Intersection is false (default value), the intersection
   *  is calculated with the parallels to the two adjacent shapes,
   *  -     if Intersection is true, the intersection is calculated by
   *  taking account of all parallels generated; this computation
   *  method is more general as it avoids self-intersections
   *  generated in the offset shape from features of small dimensions
   *  on shape S, however this method has not been completely
   *  implemented and therefore is not recommended for use;
   *  -     SelfInter tells the algorithm whether a computation to
   *  eliminate self-intersections needs to be applied to the
   *  resulting shape. However, as this functionality is not yet
   *  implemented, you should use the default value (false);
   *  - Join defines how to fill the holes that may appear between
   *  parallels to the two adjacent faces. It may take values
   *  GeomAbs_Arc or GeomAbs_Intersection:
   *  - if Join is equal to GeomAbs_Arc, then pipes are generated
   *  between two free edges of two adjacent parallels,
   *  and spheres are generated on "images" of vertices;
   *  it is the default value,
   *  - if Join is equal to GeomAbs_Intersection,
   *  then the parallels to the two adjacent faces are
   *  enlarged and intersected, so that there are no free
   *  edges on parallels to faces.
   *  RemoveIntEdges flag defines whether to remove the INTERNAL edges 
   *  from the result or not.
   *  Warnings
   *  Since the algorithm of MakeThickSolid is based on
   *  MakeOffsetShape algorithm, the warnings are the same as for
   *  MakeOffsetShape.
   */
  public void MakeThickSolidByJoin( TopoDS_Shape  S,  TopTools_ListOfShape  ClosingFaces, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection, long SelfInter, GeomAbs_JoinType Join, long RemoveIntEdges) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeThickSolid_MakeThickSolidByJoin__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, TopTools_ListOfShape.getCPtr(ClosingFaces), ClosingFaces, Offset, Tol, Mode.swigValue(), Intersection, SelfInter, Join.swigValue(), RemoveIntEdges);
  }

  public void MakeThickSolidByJoin( TopoDS_Shape  S,  TopTools_ListOfShape  ClosingFaces, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection, long SelfInter, GeomAbs_JoinType Join) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeThickSolid_MakeThickSolidByJoin__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, TopTools_ListOfShape.getCPtr(ClosingFaces), ClosingFaces, Offset, Tol, Mode.swigValue(), Intersection, SelfInter, Join.swigValue());
  }

  public void MakeThickSolidByJoin( TopoDS_Shape  S,  TopTools_ListOfShape  ClosingFaces, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection, long SelfInter) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeThickSolid_MakeThickSolidByJoin__SWIG_2(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, TopTools_ListOfShape.getCPtr(ClosingFaces), ClosingFaces, Offset, Tol, Mode.swigValue(), Intersection, SelfInter);
  }

  public void MakeThickSolidByJoin( TopoDS_Shape  S,  TopTools_ListOfShape  ClosingFaces, double Offset, double Tol, BRepOffset_Mode Mode, long Intersection) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeThickSolid_MakeThickSolidByJoin__SWIG_3(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, TopTools_ListOfShape.getCPtr(ClosingFaces), ClosingFaces, Offset, Tol, Mode.swigValue(), Intersection);
  }

  public void MakeThickSolidByJoin( TopoDS_Shape  S,  TopTools_ListOfShape  ClosingFaces, double Offset, double Tol, BRepOffset_Mode Mode) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeThickSolid_MakeThickSolidByJoin__SWIG_4(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, TopTools_ListOfShape.getCPtr(ClosingFaces), ClosingFaces, Offset, Tol, Mode.swigValue());
  }

  public void MakeThickSolidByJoin( TopoDS_Shape  S,  TopTools_ListOfShape  ClosingFaces, double Offset, double Tol) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeThickSolid_MakeThickSolidByJoin__SWIG_5(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, TopTools_ListOfShape.getCPtr(ClosingFaces), ClosingFaces, Offset, Tol);
  }

}
