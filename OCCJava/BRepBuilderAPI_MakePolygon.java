package opencascade;

/**
 *  Describes functions to build polygonal wires. A
 *  polygonal wire can be built from any number of points
 *  or vertices, and consists of a sequence of connected
 *  rectilinear edges.
 *  When a point or vertex is added to the  polygon if
 *  it is identic  to the previous  point no  edge  is
 *  built. The method added can be used to test it.
 *  Construction of a Polygonal Wire
 *  You can construct:
 *  -   a complete polygonal wire by defining all its points
 *  or vertices (limited to four), or
 *  -   an empty polygonal wire and add its points or
 *  vertices in sequence (unlimited number).
 *  A MakePolygon object provides a framework for:
 *  -   initializing the construction of a polygonal wire,
 *  -   adding points or vertices to the polygonal wire under construction, and
 *  -   consulting the result.
 */
public class BRepBuilderAPI_MakePolygon extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepBuilderAPI_MakePolygon(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_MakePolygon_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepBuilderAPI_MakePolygon(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_MakePolygon_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepBuilderAPI_MakePolygon obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepBuilderAPI_MakePolygon(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Initializes an empty polygonal wire, to which points or
   *  vertices are added using the Add function.
   *  As soon as the polygonal wire under construction
   *  contains vertices, it can be consulted using the Wire function.
   */
  public BRepBuilderAPI_MakePolygon() {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakePolygon__SWIG_0(), true);
  }

  public BRepBuilderAPI_MakePolygon( gp_Pnt  P1,  gp_Pnt  P2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakePolygon__SWIG_1(gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2), true);
  }

  public BRepBuilderAPI_MakePolygon( gp_Pnt  P1,  gp_Pnt  P2,  gp_Pnt  P3, long Close) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakePolygon__SWIG_2(gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2, gp_Pnt.getCPtr(P3), P3, Close), true);
  }

  /**
   *  Constructs a polygonal wire from 2, 3 or 4 points. Vertices are
   *  automatically created on the given points. The polygonal wire is
   *  closed if Close is true; otherwise it is open. Further vertices can
   *  be added using the Add function. The polygonal wire under
   *  construction can be consulted at any time by using the Wire function.
   *  Example
   *  //an open polygon from four points
   *  TopoDS_Wire W = BRepBuilderAPI_MakePolygon(P1,P2,P3,P4);
   *  Warning: The process is equivalent to:
   *  - initializing an empty polygonal wire,
   *  - and adding the given points in sequence.
   *  Consequently, be careful when using this function: if the
   *  sequence of points p1 - p2 - p1 is found among the arguments of the
   *  constructor, you will create a polygonal wire with two
   *  consecutive coincident edges.
   */
  public BRepBuilderAPI_MakePolygon( gp_Pnt  P1,  gp_Pnt  P2,  gp_Pnt  P3) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakePolygon__SWIG_3(gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2, gp_Pnt.getCPtr(P3), P3), true);
  }

  public BRepBuilderAPI_MakePolygon( gp_Pnt  P1,  gp_Pnt  P2,  gp_Pnt  P3,  gp_Pnt  P4, long Close) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakePolygon__SWIG_4(gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2, gp_Pnt.getCPtr(P3), P3, gp_Pnt.getCPtr(P4), P4, Close), true);
  }

  public BRepBuilderAPI_MakePolygon( gp_Pnt  P1,  gp_Pnt  P2,  gp_Pnt  P3,  gp_Pnt  P4) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakePolygon__SWIG_5(gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2, gp_Pnt.getCPtr(P3), P3, gp_Pnt.getCPtr(P4), P4), true);
  }

  /**
   *  Constructs a polygonal wire from
   *  2, 3 or 4 vertices. The polygonal wire is closed if Close is true;
   *  otherwise it is open (default value). Further vertices can be
   *  added using the Add function. The polygonal wire under
   *  construction can be consulted at any time by using the Wire function.
   *  Example
   *  //a closed triangle from three vertices
   *  TopoDS_Wire W = BRepBuilderAPI_MakePolygon(V1,V2,V3,Standard_True);
   *  Warning
   *  The process is equivalent to:
   *  -      initializing an empty polygonal wire,
   *  -      then adding the given points in sequence.
   *  So be careful, as when using this function, you could create a
   *  polygonal wire with two consecutive coincident edges if
   *  the sequence of vertices v1 - v2 - v1 is found among the
   *  constructor's arguments.
   */
  public BRepBuilderAPI_MakePolygon( TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakePolygon__SWIG_6(TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2), true);
  }

  public BRepBuilderAPI_MakePolygon( TopoDS_Vertex  V1,  TopoDS_Vertex  V2,  TopoDS_Vertex  V3, long Close) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakePolygon__SWIG_7(TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2, TopoDS_Vertex.getCPtr(V3), V3, Close), true);
  }

  public BRepBuilderAPI_MakePolygon( TopoDS_Vertex  V1,  TopoDS_Vertex  V2,  TopoDS_Vertex  V3) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakePolygon__SWIG_8(TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2, TopoDS_Vertex.getCPtr(V3), V3), true);
  }

  public BRepBuilderAPI_MakePolygon( TopoDS_Vertex  V1,  TopoDS_Vertex  V2,  TopoDS_Vertex  V3,  TopoDS_Vertex  V4, long Close) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakePolygon__SWIG_9(TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2, TopoDS_Vertex.getCPtr(V3), V3, TopoDS_Vertex.getCPtr(V4), V4, Close), true);
  }

  public BRepBuilderAPI_MakePolygon( TopoDS_Vertex  V1,  TopoDS_Vertex  V2,  TopoDS_Vertex  V3,  TopoDS_Vertex  V4) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakePolygon__SWIG_10(TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2, TopoDS_Vertex.getCPtr(V3), V3, TopoDS_Vertex.getCPtr(V4), V4), true);
  }

  public void Add( gp_Pnt  P) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakePolygon_Add__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Adds the point P or the vertex V at the end of the
   *  polygonal wire under construction. A vertex is
   *  automatically created on the point P.
   *  Warning
   *  -   When P or V is coincident to the previous vertex,
   *  no edge is built. The method Added can be used to
   *  test for this. Neither P nor V is checked to verify
   *  that it is coincident with another vertex than the last
   *  one, of the polygonal wire under construction. It is
   *  also possible to add vertices on a closed polygon
   *  (built for example by using a constructor which
   *  declares the polygon closed, or after the use of the Close function).
   *  Consequently, be careful using this function: you might create:
   *  -      a polygonal wire with two consecutive coincident edges, or
   *  -      a non manifold polygonal wire.
   *  -      P or V is not checked to verify if it is
   *  coincident with another vertex but the last one, of
   *  the polygonal wire under construction. It is also
   *  possible to add vertices on a closed polygon (built
   *  for example by using a constructor which declares
   *  the polygon closed, or after the use of the Close function).
   *  Consequently, be careful when using this function: you might create:
   *  -   a polygonal wire with two consecutive coincident edges, or
   *  -   a non-manifold polygonal wire.
   */
  public void Add( TopoDS_Vertex  V) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakePolygon_Add__SWIG_1(swigCPtr, this, TopoDS_Vertex.getCPtr(V), V);
  }

  /**
   *  Returns true if the last vertex added to the constructed
   *  polygonal wire is not coincident with the previous one.
   */
  public long Added() {
    return OCCwrapJavaJNI.BRepBuilderAPI_MakePolygon_Added(swigCPtr, this);
  }

  /**
   *  Closes the polygonal wire under construction. Note - this
   *  is equivalent to adding the first vertex to the polygonal
   *  wire under construction.
   */
  public void Close() {
    OCCwrapJavaJNI.BRepBuilderAPI_MakePolygon_Close(swigCPtr, this);
  }

  public  TopoDS_Vertex  FirstVertex() {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.BRepBuilderAPI_MakePolygon_FirstVertex(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the first or the last vertex of the polygonal wire under construction.
   *  If the constructed polygonal wire is closed, the first and the last vertices are identical.
   */
  public  TopoDS_Vertex  LastVertex() {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.BRepBuilderAPI_MakePolygon_LastVertex(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the edge built between the last two points or
   *  vertices added to the constructed polygonal wire under construction.
   *  Warning
   *  If there is only one vertex in the polygonal wire, the result is a null edge.
   */
  public  TopoDS_Edge  Edge() {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepBuilderAPI_MakePolygon_Edge(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the constructed polygonal wire, or the already
   *  built part of the polygonal wire under construction.
   *  Exceptions
   *  StdFail_NotDone if the wire is not built, i.e. if fewer than
   *  two vertices have been chained together by this construction algorithm.
   */
  public  TopoDS_Wire  Wire() {
    TopoDS_Wire ret = new TopoDS_Wire(OCCwrapJavaJNI.BRepBuilderAPI_MakePolygon_Wire(swigCPtr, this), true);
    return ret;
  }

}
