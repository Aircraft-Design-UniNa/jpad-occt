package opencascade;

/**
 *  Describes functions to build wires from edges. A wire can
 *  be built from any number of edges.
 *  To build a wire you first initialize the construction, then
 *  add edges in sequence. An unlimited number of edges
 *  can be added. The initialization of construction is done with:
 *  -   no edge (an empty wire), or
 *  -   edges of an existing wire, or
 *  -   up to four connectable edges.
 *  In order to be added to a wire under construction, an
 *  edge (unless it is the first one) must satisfy the following
 *  condition: one of its vertices must be geometrically
 *  coincident with one of the vertices of the wire (provided
 *  that the highest tolerance factor is assigned to the two
 *  vertices). It could also be the same vertex.
 *  -   The given edge is shared by the wire if it contains:
 *  -   two vertices, identical to two vertices of the wire
 *  under construction (a general case of the wire closure), or
 *  -   one vertex, identical to a vertex of the wire under
 *  construction; the other vertex not being
 *  geometrically coincident with another vertex of the wire.
 *  -   In other cases, when one of the vertices of the edge
 *  is simply geometrically coincident with a vertex of the
 *  wire under construction (provided that the highest
 *  tolerance factor is assigned to the two vertices), the
 *  given edge is first copied and the coincident vertex is
 *  replaced in this new edge, by the coincident vertex of the wire.
 *  Note: it is possible to build non manifold wires using this construction tool.
 *  A MakeWire object provides a framework for:
 *  -   initializing the construction of a wire,
 *  -   adding edges to the wire under construction, and
 *  -   consulting the result.
 */
public class BRepBuilderAPI_MakeWire extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepBuilderAPI_MakeWire(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_MakeWire_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepBuilderAPI_MakeWire(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_MakeWire_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepBuilderAPI_MakeWire obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepBuilderAPI_MakeWire(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Constructs an empty wire framework, to which edges
   *  are added using the Add function.
   *  As soon as the wire contains one edge, it can return
   *  with the use of the function Wire.
   *  Warning
   *  The function Error will return
   *  BRepBuilderAPI_EmptyWire if it is called before at
   *  least one edge is added to the wire under construction.
   */
  public BRepBuilderAPI_MakeWire() {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeWire__SWIG_0(), true);
  }

  /**
   *  Make a Wire from an edge.
   */
  public BRepBuilderAPI_MakeWire( TopoDS_Edge  E) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeWire__SWIG_1(TopoDS_Edge.getCPtr(E), E), true);
  }

  /**
   *  Make a Wire from two edges.
   */
  public BRepBuilderAPI_MakeWire( TopoDS_Edge  E1,  TopoDS_Edge  E2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeWire__SWIG_2(TopoDS_Edge.getCPtr(E1), E1, TopoDS_Edge.getCPtr(E2), E2), true);
  }

  /**
   *  Make a Wire from three edges.
   */
  public BRepBuilderAPI_MakeWire( TopoDS_Edge  E1,  TopoDS_Edge  E2,  TopoDS_Edge  E3) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeWire__SWIG_3(TopoDS_Edge.getCPtr(E1), E1, TopoDS_Edge.getCPtr(E2), E2, TopoDS_Edge.getCPtr(E3), E3), true);
  }

  /**
   *  Make a Wire from four edges.
   *  Constructs a wire
   *  -   from the TopoDS_Wire W composed of the edge E, or
   *  -   from edge E, or
   *  -   from two edges E1 and E2, or
   *  -   from three edges E1, E2 and E3, or
   *  -   from four edges E1, E2, E3 and E4.
   *  Further edges can be added using the function Add.
   *  Given edges are added in a sequence. Each of them
   *  must be connectable to the wire under construction,
   *  and so must satisfy the following condition (unless it is
   *  the first edge of the wire): one of its vertices must be
   *  geometrically coincident with one of the vertices of the
   *  wire (provided that the highest tolerance factor is
   *  assigned to the two vertices). It could also be the same vertex.
   *  Warning
   *  If an edge is not connectable to the wire under
   *  construction it is not added. The function Error will
   *  return BRepBuilderAPI_DisconnectedWire, the
   *  function IsDone will return false and the function Wire
   *  will raise an error, until a new connectable edge is added.
   */
  public BRepBuilderAPI_MakeWire( TopoDS_Edge  E1,  TopoDS_Edge  E2,  TopoDS_Edge  E3,  TopoDS_Edge  E4) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeWire__SWIG_4(TopoDS_Edge.getCPtr(E1), E1, TopoDS_Edge.getCPtr(E2), E2, TopoDS_Edge.getCPtr(E3), E3, TopoDS_Edge.getCPtr(E4), E4), true);
  }

  /**
   *  Make a Wire from a Wire. Usefull for adding later.
   */
  public BRepBuilderAPI_MakeWire( TopoDS_Wire  W) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeWire__SWIG_5(TopoDS_Wire.getCPtr(W), W), true);
  }

  /**
   *  Add an edge to a wire.
   */
  public BRepBuilderAPI_MakeWire( TopoDS_Wire  W,  TopoDS_Edge  E) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeWire__SWIG_6(TopoDS_Wire.getCPtr(W), W, TopoDS_Edge.getCPtr(E), E), true);
  }

  /**
   *  Adds the edge E to the wire under construction.
   *  E must be connectable to the wire under construction, and, unless it
   *  is the first edge of the wire, must satisfy the following
   *  condition: one of its vertices must be geometrically coincident
   *  with one of the vertices of the wire (provided that the highest
   *  tolerance factor is assigned to the two vertices). It could also
   *  be the same vertex.
   *  Warning
   *  If E is not connectable to the wire under construction it is not
   *  added. The function Error will return
   *  BRepBuilderAPI_DisconnectedWire, the function IsDone will return
   *  false and the function Wire will raise an error, until a new
   *  connectable edge is added.
   */
  public void Add( TopoDS_Edge  E) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeWire_Add__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Add the edges of <W> to the current wire.
   */
  public void Add( TopoDS_Wire  W) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeWire_Add__SWIG_1(swigCPtr, this, TopoDS_Wire.getCPtr(W), W);
  }

  /**
   *  Adds  the edges of <L>   to the current  wire.  The
   *  edges are not to be consecutive.   But they are to
   *  be  all  connected geometrically or topologically.
   *  If some of them are  not connected the Status give
   *  DisconnectedWire but the "Maker" is Done() and you
   *  can get the  partial result. (ie connected to  the
   *  first edgeof the list <L>)
   */
  public void Add( TopTools_ListOfShape  L) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeWire_Add__SWIG_2(swigCPtr, this, TopTools_ListOfShape.getCPtr(L), L);
  }

  /**
   *  Returns the construction status
   *  -   BRepBuilderAPI_WireDone if the wire is built, or
   *  -   another value of the BRepBuilderAPI_WireError
   *  enumeration indicating why the construction failed.
   */
  public BRepBuilderAPI_WireError Error() {
    return BRepBuilderAPI_WireError.swigToEnum(OCCwrapJavaJNI.BRepBuilderAPI_MakeWire_Error(swigCPtr, this));
  }

  /**
   *  Returns the constructed wire; or the part of the wire
   *  under construction already built.
   *  Exceptions StdFail_NotDone if a wire is not built.
   */
  public  TopoDS_Wire  Wire() {
    TopoDS_Wire ret = new TopoDS_Wire(OCCwrapJavaJNI.BRepBuilderAPI_MakeWire_Wire(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the last edge added to the wire under construction.
   *  Warning
   *  -   This edge can be different from the original one (the
   *  argument of the function Add, for instance,)
   *  -   A null edge is returned if there are no edges in the
   *  wire under construction, or if the last edge which you
   *  tried to add was not connectable..
   */
  public  TopoDS_Edge  Edge() {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepBuilderAPI_MakeWire_Edge(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the last vertex of the last edge added to the
   *  wire under construction.
   *  Warning
   *  A null vertex is returned if there are no edges in the wire
   *  under construction, or if the last edge which you tried to
   *  add was not connectableR
   */
  public  TopoDS_Vertex  Vertex() {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.BRepBuilderAPI_MakeWire_Vertex(swigCPtr, this), true);
    return ret;
  }

}
