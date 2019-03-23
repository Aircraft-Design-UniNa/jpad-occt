package opencascade;

/**
 *  This package   provides  basic tools  to   explore the
 *  topological data structures.
 * 
 *  * Explorer : A tool to find all sub-shapes of  a given
 *  type. e.g. all faces of a solid.
 * 
 *  * Package methods to map sub-shapes of a shape.
 * 
 *  Level : Public
 *  All methods of all  classes will be public.
 */
public class TopExp {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TopExp(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TopExp(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TopExp obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopExp(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Tool to explore a topological data structure.
   *  Stores in the map <M> all  the sub-shapes of <S>
   *  of type <T>.
   * 
   *  Warning: The map is not cleared at first.
   */
  public static void MapShapes( TopoDS_Shape  S, TopAbs_ShapeEnum T,  TopTools_IndexedMapOfShape  M) {
    OCCwrapJavaJNI.TopExp_MapShapes__SWIG_0(TopoDS_Shape.getCPtr(S), S, T.swigValue(), TopTools_IndexedMapOfShape.getCPtr(M), M);
  }

  /**
   *  Stores in the map <M> all  the sub-shapes of <S>.
   */
  public static void MapShapes( TopoDS_Shape  S,  TopTools_IndexedMapOfShape  M) {
    OCCwrapJavaJNI.TopExp_MapShapes__SWIG_1(TopoDS_Shape.getCPtr(S), S, TopTools_IndexedMapOfShape.getCPtr(M), M);
  }

  /**
   *  Stores in the map <M> all  the sub-shapes of <S>.
   */
  public static void MapShapes( TopoDS_Shape  S,  TopTools_MapOfShape  M) {
    OCCwrapJavaJNI.TopExp_MapShapes__SWIG_2(TopoDS_Shape.getCPtr(S), S, TopTools_MapOfShape.getCPtr(M), M);
  }

  /**
   *  Stores in the map <M> all the subshape of <S> of
   *  type <TS>  for each one append  to  the list all
   *  the ancestors of type <TA>.  For example map all
   *  the edges and bind the list of faces.
   *  Warning: The map is not cleared at first.
   */
  public static void MapShapesAndAncestors( TopoDS_Shape  S, TopAbs_ShapeEnum TS, TopAbs_ShapeEnum TA,  TopTools_IndexedDataMapOfShapeListOfShape  M) {
    OCCwrapJavaJNI.TopExp_MapShapesAndAncestors(TopoDS_Shape.getCPtr(S), S, TS.swigValue(), TA.swigValue(), TopTools_IndexedDataMapOfShapeListOfShape.getCPtr(M), M);
  }

  /**
   *  Stores in the map <M> all the subshape of <S> of
   *  type <TS> for each one append to the list all
   *  unique ancestors of type <TA>.  For example map all
   *  the edges and bind the list of faces.
   *  useOrientation = True : taking account the ancestor orientation
   *  Warning: The map is not cleared at first.
   */
  public static void MapShapesAndUniqueAncestors( TopoDS_Shape  S, TopAbs_ShapeEnum TS, TopAbs_ShapeEnum TA,  TopTools_IndexedDataMapOfShapeListOfShape  M, long useOrientation) {
    OCCwrapJavaJNI.TopExp_MapShapesAndUniqueAncestors__SWIG_0(TopoDS_Shape.getCPtr(S), S, TS.swigValue(), TA.swigValue(), TopTools_IndexedDataMapOfShapeListOfShape.getCPtr(M), M, useOrientation);
  }

  public static void MapShapesAndUniqueAncestors( TopoDS_Shape  S, TopAbs_ShapeEnum TS, TopAbs_ShapeEnum TA,  TopTools_IndexedDataMapOfShapeListOfShape  M) {
    OCCwrapJavaJNI.TopExp_MapShapesAndUniqueAncestors__SWIG_1(TopoDS_Shape.getCPtr(S), S, TS.swigValue(), TA.swigValue(), TopTools_IndexedDataMapOfShapeListOfShape.getCPtr(M), M);
  }

  /**
   *  Returns the Vertex of orientation FORWARD in E. If
   *  there is none returns a Null Shape.
   *  CumOri = True : taking account the edge orientation
   */
  public static TopoDS_Vertex FirstVertex( TopoDS_Edge  E, long CumOri) {
    return new TopoDS_Vertex(OCCwrapJavaJNI.TopExp_FirstVertex__SWIG_0(TopoDS_Edge.getCPtr(E), E, CumOri), true);
  }

  public static TopoDS_Vertex FirstVertex( TopoDS_Edge  E) {
    return new TopoDS_Vertex(OCCwrapJavaJNI.TopExp_FirstVertex__SWIG_1(TopoDS_Edge.getCPtr(E), E), true);
  }

  /**
   *  Returns the Vertex of orientation REVERSED in E. If
   *  there is none returns a Null Shape.
   *  CumOri = True : taking account the edge orientation
   */
  public static TopoDS_Vertex LastVertex( TopoDS_Edge  E, long CumOri) {
    return new TopoDS_Vertex(OCCwrapJavaJNI.TopExp_LastVertex__SWIG_0(TopoDS_Edge.getCPtr(E), E, CumOri), true);
  }

  public static TopoDS_Vertex LastVertex( TopoDS_Edge  E) {
    return new TopoDS_Vertex(OCCwrapJavaJNI.TopExp_LastVertex__SWIG_1(TopoDS_Edge.getCPtr(E), E), true);
  }

  /**
   *  Returns in Vfirst, Vlast the  FORWARD and REVERSED
   *  vertices of the edge <E>. May be null shapes.
   *  CumOri = True : taking account the edge orientation
   */
  public static void Vertices( TopoDS_Edge  E, TopoDS_Vertex Vfirst, TopoDS_Vertex Vlast, long CumOri) {
    OCCwrapJavaJNI.TopExp_Vertices__SWIG_0(TopoDS_Edge.getCPtr(E), E, TopoDS_Vertex.getCPtr(Vfirst), Vfirst, TopoDS_Vertex.getCPtr(Vlast), Vlast, CumOri);
  }

  /**
   *  Returns  in  Vfirst,  Vlast   the first   and last
   *  vertices of the open wire <W>. May be null shapes.
   *  if   <W>  is closed Vfirst and Vlast  are a same
   *  vertex on <W>.
   *  if <W> is no manifold. VFirst and VLast are null
   *  shapes.
   */
  public static void Vertices( TopoDS_Edge  E, TopoDS_Vertex Vfirst, TopoDS_Vertex Vlast) {
    OCCwrapJavaJNI.TopExp_Vertices__SWIG_1(TopoDS_Edge.getCPtr(E), E, TopoDS_Vertex.getCPtr(Vfirst), Vfirst, TopoDS_Vertex.getCPtr(Vlast), Vlast);
  }

  public static void Vertices( TopoDS_Wire  W, TopoDS_Vertex Vfirst, TopoDS_Vertex Vlast) {
    OCCwrapJavaJNI.TopExp_Vertices__SWIG_2(TopoDS_Wire.getCPtr(W), W, TopoDS_Vertex.getCPtr(Vfirst), Vfirst, TopoDS_Vertex.getCPtr(Vlast), Vlast);
  }

  /**
   *  Finds   the  vertex <V> common   to  the two edges
   *  <E1,E2>, returns True if this vertex exists.
   * 
   *  Warning: <V> has sense only if the value <True> is returned
   */
  public static long CommonVertex( TopoDS_Edge  E1,  TopoDS_Edge  E2, TopoDS_Vertex V) {
    return OCCwrapJavaJNI.TopExp_CommonVertex(TopoDS_Edge.getCPtr(E1), E1, TopoDS_Edge.getCPtr(E2), E2, TopoDS_Vertex.getCPtr(V), V);
  }

  public TopExp() {
    this(OCCwrapJavaJNI.new_TopExp(), true);
  }

}
