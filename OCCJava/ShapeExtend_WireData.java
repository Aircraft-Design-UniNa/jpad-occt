package opencascade;

/**
 *  This class provides a data structure necessary for work with the wire as with
 *  ordered list of edges, what is required for many algorithms. The advantage of
 *  this class is that it allows to work with wires which are not correct.
 *  The object of the class ShapeExtend_WireData can be initialized by
 *  TopoDS_Wire, and converted back to TopoDS_Wire.
 *  An edge in the wire is defined by its rank number. Operations of accessing,
 *  adding and removing edge at the given rank number are provided. On the whole
 *  wire, operations of circular permutation and reversing (both orientations of
 *  all edges and order of edges) are provided as well.
 *  This class also provides a method to check if the edge in the wire is a seam
 *  (if the wire lies on a face).
 *  This class is handled by reference. Such an approach gives the following advantages:
 *  1.    Sharing the object of this class strongly optimizes the processes of
 *  analysis and fixing performed in parallel on the wire stored in the form
 *  of this class. Fixing tool (e.g. ShapeFix_Wire) fixes problems one by
 *  one using analyzing tool (e.g. ShapeAnalysis_Wire). Sharing allows not
 *  to reinitialize each time the analyzing tool with modified
 *  ShapeExtend_WireData what consumes certain time.
 *  2.    No copying of contents. The object of ShapeExtend_WireData class has
 *  quite big size, returning it as a result of the function would cause
 *  additional copying of contents if this class were one handled by value.
 *  Moreover, this class is stored as a field in other classes which are
 *  they returned as results of functions, storing only a handle to
 *  ShapeExtend_WireData saves time and memory.
 */
public class ShapeExtend_WireData extends Standard_Transient {
  ShapeExtend_WireData(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor, creates empty wire with no edges
   */
  public ShapeExtend_WireData() {
    this(OCCwrapJavaJNI.new_ShapeExtend_WireData__SWIG_0(), true);
  }

  /**
   *  Constructor initializing the data from TopoDS_Wire. Calls Init(wire,chained).
   */
  public ShapeExtend_WireData( TopoDS_Wire  wire, long chained, long theManifoldMode) {
    this(OCCwrapJavaJNI.new_ShapeExtend_WireData__SWIG_1(TopoDS_Wire.getCPtr(wire), wire, chained, theManifoldMode), true);
  }

  public ShapeExtend_WireData( TopoDS_Wire  wire, long chained) {
    this(OCCwrapJavaJNI.new_ShapeExtend_WireData__SWIG_2(TopoDS_Wire.getCPtr(wire), wire, chained), true);
  }

  public ShapeExtend_WireData( TopoDS_Wire  wire) {
    this(OCCwrapJavaJNI.new_ShapeExtend_WireData__SWIG_3(TopoDS_Wire.getCPtr(wire), wire), true);
  }

  /**
   *  Copies data from another WireData
   */
  public void Init( ShapeExtend_WireData  other) {
    OCCwrapJavaJNI.ShapeExtend_WireData_Init__SWIG_0(swigCPtr, this,  ShapeExtend_WireData.getCPtr(other) , other);
  }

  /**
   *  Loads an already existing wire
   *  If <chained> is True (default), edges are added in the
   *  sequence as they are explored by TopoDS_Iterator
   *  Else, if <chained> is False, wire is explored by
   *  BRepTools_WireExplorer and it is guaranteed that edges will
   *  be sequencially connected.
   *  Remark : In the latter case it can happen that not all edges
   *  will be found (because of limitations of
   *  BRepTools_WireExplorer for disconnected wires and wires
   *  with seam edges).
   */
  public long Init( TopoDS_Wire  wire, long chained, long theManifoldMode) {
    return OCCwrapJavaJNI.ShapeExtend_WireData_Init__SWIG_1(swigCPtr, this, TopoDS_Wire.getCPtr(wire), wire, chained, theManifoldMode);
  }

  public long Init( TopoDS_Wire  wire, long chained) {
    return OCCwrapJavaJNI.ShapeExtend_WireData_Init__SWIG_2(swigCPtr, this, TopoDS_Wire.getCPtr(wire), wire, chained);
  }

  public long Init( TopoDS_Wire  wire) {
    return OCCwrapJavaJNI.ShapeExtend_WireData_Init__SWIG_3(swigCPtr, this, TopoDS_Wire.getCPtr(wire), wire);
  }

  /**
   *  Clears data about Wire.
   */
  public void Clear() {
    OCCwrapJavaJNI.ShapeExtend_WireData_Clear(swigCPtr, this);
  }

  /**
   *  Computes the list of seam edges
   *  By default (direct call), computing is enforced
   *  For indirect call (from IsSeam) it is redone only if not yet
   *  already done or if the list of edges has changed
   *  Remark : A Seam Edge is an Edge present twice in the list, once as
   *  FORWARD and once as REVERSED
   *  Each sense has its own PCurve, the one for FORWARD
   *  must be set in first
   */
  public void ComputeSeams(long enforce) {
    OCCwrapJavaJNI.ShapeExtend_WireData_ComputeSeams__SWIG_0(swigCPtr, this, enforce);
  }

  public void ComputeSeams() {
    OCCwrapJavaJNI.ShapeExtend_WireData_ComputeSeams__SWIG_1(swigCPtr, this);
  }

  /**
   *  Does a circular permutation in order to set <num>th edge last
   */
  public void SetLast(int num) {
    OCCwrapJavaJNI.ShapeExtend_WireData_SetLast(swigCPtr, this, num);
  }

  /**
   *  When the wire contains at least one degenerated edge, sets it
   *  as last one
   *  Note   : It is useful to process pcurves, for instance, while the pcurve
   *  of a DGNR may not be computed from its 3D part (there is none)
   *  it is computed after the other edges have been computed and
   *  chained.
   */
  public void SetDegeneratedLast() {
    OCCwrapJavaJNI.ShapeExtend_WireData_SetDegeneratedLast(swigCPtr, this);
  }

  /**
   *  Adds an edge to a wire, being defined (not yet ended)
   *  This is the plain, basic, function to add an edge
   *  <num> = 0 (D): Appends at end
   *  <num> = 1: Preprends at start
   *  else, Insert before <num>
   *  Remark : Null Edge is simply ignored
   */
  public void Add( TopoDS_Edge  edge, int atnum) {
    OCCwrapJavaJNI.ShapeExtend_WireData_Add__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, atnum);
  }

  /**
   *  Adds an entire wire, considered as a list of edges
   *  Remark : The wire is assumed to be ordered (TopoDS_Iterator
   *  is used)
   */
  public void Add( TopoDS_Edge  edge) {
    OCCwrapJavaJNI.ShapeExtend_WireData_Add__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge);
  }

  /**
   *  Adds a wire in the form of WireData
   */
  public void Add( TopoDS_Wire  wire, int atnum) {
    OCCwrapJavaJNI.ShapeExtend_WireData_Add__SWIG_2(swigCPtr, this, TopoDS_Wire.getCPtr(wire), wire, atnum);
  }

  /**
   *  Adds an edge or a wire invoking corresponding method Add
   */
  public void Add( TopoDS_Wire  wire) {
    OCCwrapJavaJNI.ShapeExtend_WireData_Add__SWIG_3(swigCPtr, this, TopoDS_Wire.getCPtr(wire), wire);
  }

  public void Add( ShapeExtend_WireData  wire, int atnum) {
    OCCwrapJavaJNI.ShapeExtend_WireData_Add__SWIG_4(swigCPtr, this,  ShapeExtend_WireData.getCPtr(wire) , wire, atnum);
  }

  public void Add( ShapeExtend_WireData  wire) {
    OCCwrapJavaJNI.ShapeExtend_WireData_Add__SWIG_5(swigCPtr, this,  ShapeExtend_WireData.getCPtr(wire) , wire);
  }

  public void Add( TopoDS_Shape  shape, int atnum) {
    OCCwrapJavaJNI.ShapeExtend_WireData_Add__SWIG_6(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, atnum);
  }

  public void Add( TopoDS_Shape  shape) {
    OCCwrapJavaJNI.ShapeExtend_WireData_Add__SWIG_7(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape);
  }

  /**
   *  Adds an edge to start or end of <me>, according to <mode>
   *  0: at end, as direct
   *  1: at end, as reversed
   *  2: at start, as direct
   *  3: at start, as reversed
   *  < 0: no adding
   */
  public void AddOriented( TopoDS_Edge  edge, int mode) {
    OCCwrapJavaJNI.ShapeExtend_WireData_AddOriented__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, mode);
  }

  /**
   *  Adds a wire to start or end of <me>, according to <mode>
   *  0: at end, as direct
   *  1: at end, as reversed
   *  2: at start, as direct
   *  3: at start, as reversed
   *  < 0: no adding
   */
  public void AddOriented( TopoDS_Wire  wire, int mode) {
    OCCwrapJavaJNI.ShapeExtend_WireData_AddOriented__SWIG_1(swigCPtr, this, TopoDS_Wire.getCPtr(wire), wire, mode);
  }

  /**
   *  Adds an edge or a wire invoking corresponding method
   *  AddOriented
   */
  public void AddOriented( TopoDS_Shape  shape, int mode) {
    OCCwrapJavaJNI.ShapeExtend_WireData_AddOriented__SWIG_2(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, mode);
  }

  /**
   *  Removes an Edge, given its rank. By default removes the last edge.
   */
  public void Remove(int num) {
    OCCwrapJavaJNI.ShapeExtend_WireData_Remove__SWIG_0(swigCPtr, this, num);
  }

  public void Remove() {
    OCCwrapJavaJNI.ShapeExtend_WireData_Remove__SWIG_1(swigCPtr, this);
  }

  /**
   *  Replaces an edge at the given
   *  rank number <num> with new one. Default is last edge (<num> = 0).
   */
  public void Set( TopoDS_Edge  edge, int num) {
    OCCwrapJavaJNI.ShapeExtend_WireData_Set__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge, num);
  }

  public void Set( TopoDS_Edge  edge) {
    OCCwrapJavaJNI.ShapeExtend_WireData_Set__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge);
  }

  /**
   *  Reverses the sense of the list and the orientation of each Edge
   *  This method should be called when either wire has no seam edges
   *  or face is not available
   */
  public void Reverse() {
    OCCwrapJavaJNI.ShapeExtend_WireData_Reverse__SWIG_0(swigCPtr, this);
  }

  /**
   *  Reverses the sense of the list and the orientation of each Edge
   *  The face is necessary for swapping pcurves for seam edges
   *  (first pcurve corresponds to orientation FORWARD, and second to
   *  REVERSED; when edge is reversed, pcurves must be swapped)
   *  If face is NULL, no swapping is performed
   */
  public void Reverse( TopoDS_Face  face) {
    OCCwrapJavaJNI.ShapeExtend_WireData_Reverse__SWIG_1(swigCPtr, this, TopoDS_Face.getCPtr(face), face);
  }

  /**
   *  Returns the count of currently recorded edges
   */
  public int NbEdges() {
    return OCCwrapJavaJNI.ShapeExtend_WireData_NbEdges(swigCPtr, this);
  }

  /**
   *  Returns the count of currently recorded non-manifold edges
   */
  public int NbNonManifoldEdges() {
    return OCCwrapJavaJNI.ShapeExtend_WireData_NbNonManifoldEdges(swigCPtr, this);
  }

  /**
   *  Returns <num>th nonmanifold Edge
   */
  public TopoDS_Edge NonmanifoldEdge(int num) {
    return new TopoDS_Edge(OCCwrapJavaJNI.ShapeExtend_WireData_NonmanifoldEdge(swigCPtr, this, num), true);
  }

  public  TopTools_HSequenceOfShape  NonmanifoldEdges() {
    return new TopTools_HSequenceOfShape ( OCCwrapJavaJNI.ShapeExtend_WireData_NonmanifoldEdges(swigCPtr, this), true );
  }

  public long[] ManifoldMode() {return OCCwrapJavaJNI.ShapeExtend_WireData_ManifoldMode(swigCPtr, this);}

  /**
   *  Returns <num>th Edge
   */
  public TopoDS_Edge Edge(int num) {
    return new TopoDS_Edge(OCCwrapJavaJNI.ShapeExtend_WireData_Edge(swigCPtr, this, num), true);
  }

  /**
   *  Returns the index of the edge
   *  If the edge is a seam the orientation is also checked
   *  Returns 0 if the edge is not found in the list
   */
  public int Index( TopoDS_Edge  edge) {
    return OCCwrapJavaJNI.ShapeExtend_WireData_Index(swigCPtr, this, TopoDS_Edge.getCPtr(edge), edge);
  }

  /**
   *  Tells if an Edge is seam (see ComputeSeams)
   *  An edge is considered as seam if it presents twice in
   *  the edge list, once as FORWARD and once as REVERSED.
   */
  public long IsSeam(int num) {
    return OCCwrapJavaJNI.ShapeExtend_WireData_IsSeam(swigCPtr, this, num);
  }

  /**
   *  Makes TopoDS_Wire using
   *  BRep_Builder (just creates the TopoDS_Wire object and adds
   *  all edges into it). This method should be called when
   *  the wire is correct (for example, after successful
   *  fixes by ShapeFix_Wire) and adjacent edges share common
   *  vertices. In case if adjacent edges do not share the same
   *  vertices the resulting TopoDS_Wire will be invalid.
   */
  public TopoDS_Wire Wire() {
    return new TopoDS_Wire(OCCwrapJavaJNI.ShapeExtend_WireData_Wire(swigCPtr, this), true);
  }

  /**
   *  Makes TopoDS_Wire using
   *  BRepAPI_MakeWire. Class BRepAPI_MakeWire merges
   *  geometrically coincided vertices and can disturb
   *  correct order of edges in the wire. If this class fails,
   *  null shape is returned.
   */
  public TopoDS_Wire WireAPIMake() {
    return new TopoDS_Wire(OCCwrapJavaJNI.ShapeExtend_WireData_WireAPIMake(swigCPtr, this), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeExtend_WireData_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeExtend_WireData_get_type_descriptor(), true );
  }

  public static  ShapeExtend_WireData  DownCast( Standard_Transient  T) {
    return new ShapeExtend_WireData ( OCCwrapJavaJNI.ShapeExtend_WireData_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeExtend_WireData_TypeOf(), true );
  }

}
