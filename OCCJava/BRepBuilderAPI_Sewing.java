package opencascade;

/**
 *  Provides methods to
 * 
 *  - identify possible contigous boundaries (for control
 *  afterwards (of continuity: C0, C1, ...))
 * 
 *  - assemble contigous shapes into one shape.
 *  Only manifold shapes will be found. Sewing will not
 *  be done in case of multiple edges.
 * 
 *  For sewing, use this function as following:
 *  - create an empty object
 *  - default tolerance 1.E-06
 *  - with face analysis on
 *  - with sewing operation on
 *  - set the cutting option as you need (default True)
 *  - define a tolerance
 *  - add shapes to be sewed -> Add
 *  - compute -> Perfom
 *  - output the resulted shapes
 *  - output free edges if necessary
 *  - output multiple edges if necessary
 *  - output the problems if any
 */
public class BRepBuilderAPI_Sewing extends Standard_Transient {
  BRepBuilderAPI_Sewing(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates an object with
   *  tolerance of connexity
   *  option for sewing (if false only control)
   *  option for analysis of degenerated shapes
   *  option for cutting of free edges.
   *  option for non manifold processing
   */
  public BRepBuilderAPI_Sewing(double tolerance, long option1, long option2, long option3, long option4) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_Sewing__SWIG_0(tolerance, option1, option2, option3, option4), true);
  }

  public BRepBuilderAPI_Sewing(double tolerance, long option1, long option2, long option3) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_Sewing__SWIG_1(tolerance, option1, option2, option3), true);
  }

  public BRepBuilderAPI_Sewing(double tolerance, long option1, long option2) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_Sewing__SWIG_2(tolerance, option1, option2), true);
  }

  public BRepBuilderAPI_Sewing(double tolerance, long option1) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_Sewing__SWIG_3(tolerance, option1), true);
  }

  public BRepBuilderAPI_Sewing(double tolerance) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_Sewing__SWIG_4(tolerance), true);
  }

  public BRepBuilderAPI_Sewing() {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_Sewing__SWIG_5(), true);
  }

  /**
   *  initialize the parameters if necessary
   */
  public void Init(double tolerance, long option1, long option2, long option3, long option4) {
    OCCwrapJavaJNI.BRepBuilderAPI_Sewing_Init__SWIG_0(swigCPtr, this, tolerance, option1, option2, option3, option4);
  }

  public void Init(double tolerance, long option1, long option2, long option3) {
    OCCwrapJavaJNI.BRepBuilderAPI_Sewing_Init__SWIG_1(swigCPtr, this, tolerance, option1, option2, option3);
  }

  public void Init(double tolerance, long option1, long option2) {
    OCCwrapJavaJNI.BRepBuilderAPI_Sewing_Init__SWIG_2(swigCPtr, this, tolerance, option1, option2);
  }

  public void Init(double tolerance, long option1) {
    OCCwrapJavaJNI.BRepBuilderAPI_Sewing_Init__SWIG_3(swigCPtr, this, tolerance, option1);
  }

  public void Init(double tolerance) {
    OCCwrapJavaJNI.BRepBuilderAPI_Sewing_Init__SWIG_4(swigCPtr, this, tolerance);
  }

  public void Init() {
    OCCwrapJavaJNI.BRepBuilderAPI_Sewing_Init__SWIG_5(swigCPtr, this);
  }

  /**
   *  Loades the context shape.
   */
  public void Load( TopoDS_Shape  shape) {
    OCCwrapJavaJNI.BRepBuilderAPI_Sewing_Load(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape);
  }

  /**
   *  Defines the shapes to be sewed or controlled
   */
  public void Add( TopoDS_Shape  shape) {
    OCCwrapJavaJNI.BRepBuilderAPI_Sewing_Add(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape);
  }

  /**
   *  Computing
   *  thePI - progress indicator of algorithm
   */
  public void Perform( Message_ProgressIndicator  thePI) {
    OCCwrapJavaJNI.BRepBuilderAPI_Sewing_Perform__SWIG_0(swigCPtr, this,  Message_ProgressIndicator.getCPtr(thePI) , thePI);
  }

  public void Perform() {
    OCCwrapJavaJNI.BRepBuilderAPI_Sewing_Perform__SWIG_1(swigCPtr, this);
  }

  /**
   *  Gives the sewed shape
   *  a null shape if nothing constructed
   *  may be a face, a shell, a solid or a compound
   */
  public  TopoDS_Shape  SewedShape() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepBuilderAPI_Sewing_SewedShape(swigCPtr, this), true);
    return ret;
  }

  /**
   *  set context
   */
  public void SetContext( BRepTools_ReShape  theContext) {
    OCCwrapJavaJNI.BRepBuilderAPI_Sewing_SetContext(swigCPtr, this,  BRepTools_ReShape.getCPtr(theContext) , theContext);
  }

  public  BRepTools_ReShape  GetContext() {
    return new BRepTools_ReShape ( OCCwrapJavaJNI.BRepBuilderAPI_Sewing_GetContext(swigCPtr, this), true );
  }

  /**
   *  Gives the number of free edges (edge shared by one face)
   */
  public int NbFreeEdges() {
    return OCCwrapJavaJNI.BRepBuilderAPI_Sewing_NbFreeEdges(swigCPtr, this);
  }

  /**
   *  Gives each free edge
   */
  public  TopoDS_Edge  FreeEdge(int index) {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepBuilderAPI_Sewing_FreeEdge(swigCPtr, this, index), true);
    return ret;
  }

  /**
   *  Gives the number of multiple edges
   *  (edge shared by more than two faces)
   */
  public int NbMultipleEdges() {
    return OCCwrapJavaJNI.BRepBuilderAPI_Sewing_NbMultipleEdges(swigCPtr, this);
  }

  /**
   *  Gives each multiple edge
   */
  public  TopoDS_Edge  MultipleEdge(int index) {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepBuilderAPI_Sewing_MultipleEdge(swigCPtr, this, index), true);
    return ret;
  }

  /**
   *  Gives the number of contigous edges (edge shared by two faces)
   */
  public int NbContigousEdges() {
    return OCCwrapJavaJNI.BRepBuilderAPI_Sewing_NbContigousEdges(swigCPtr, this);
  }

  /**
   *  Gives each contigous edge
   */
  public  TopoDS_Edge  ContigousEdge(int index) {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepBuilderAPI_Sewing_ContigousEdge(swigCPtr, this, index), true);
    return ret;
  }

  /**
   *  Gives the sections (edge) belonging to a contigous edge
   */
  public  TopTools_ListOfShape  ContigousEdgeCouple(int index) {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BRepBuilderAPI_Sewing_ContigousEdgeCouple(swigCPtr, this, index), false, this);
    return ret;
  }

  /**
   *  Indicates if a section is bound (before use SectionToBoundary)
   */
  public long IsSectionBound( TopoDS_Edge  section) {
    return OCCwrapJavaJNI.BRepBuilderAPI_Sewing_IsSectionBound(swigCPtr, this, TopoDS_Edge.getCPtr(section), section);
  }

  /**
   *  Gives the original edge (free boundary) which becomes the
   *  the section. Remember that sections constitute  common edges.
   *  This imformation is important for control because with
   *  original edge we can find the surface to which the section
   *  is attached.
   */
  public  TopoDS_Edge  SectionToBoundary( TopoDS_Edge  section) {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepBuilderAPI_Sewing_SectionToBoundary(swigCPtr, this, TopoDS_Edge.getCPtr(section), section), true);
    return ret;
  }

  /**
   *  Gives the number of degenerated shapes
   */
  public int NbDegeneratedShapes() {
    return OCCwrapJavaJNI.BRepBuilderAPI_Sewing_NbDegeneratedShapes(swigCPtr, this);
  }

  /**
   *  Gives each degenerated shape
   */
  public  TopoDS_Shape  DegeneratedShape(int index) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepBuilderAPI_Sewing_DegeneratedShape(swigCPtr, this, index), true);
    return ret;
  }

  /**
   *  Indicates if a input shape is degenerated
   */
  public long IsDegenerated( TopoDS_Shape  shape) {
    return OCCwrapJavaJNI.BRepBuilderAPI_Sewing_IsDegenerated(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape);
  }

  /**
   *  Indicates if a input shape has been modified
   */
  public long IsModified( TopoDS_Shape  shape) {
    return OCCwrapJavaJNI.BRepBuilderAPI_Sewing_IsModified(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape);
  }

  /**
   *  Gives a modifieded shape
   */
  public  TopoDS_Shape  Modified( TopoDS_Shape  shape) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepBuilderAPI_Sewing_Modified(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape), true);
    return ret;
  }

  /**
   *  Indicates if a input subshape has been modified
   */
  public long IsModifiedSubShape( TopoDS_Shape  shape) {
    return OCCwrapJavaJNI.BRepBuilderAPI_Sewing_IsModifiedSubShape(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape);
  }

  /**
   *  Gives a modifieded subshape
   */
  public TopoDS_Shape ModifiedSubShape( TopoDS_Shape  shape) {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepBuilderAPI_Sewing_ModifiedSubShape(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape), true);
  }

  /**
   *  print the informations
   */
  public void Dump() {
    OCCwrapJavaJNI.BRepBuilderAPI_Sewing_Dump(swigCPtr, this);
  }

  /**
   *  Gives the number of deleted faces (faces smallest than tolerance)
   */
  public int NbDeletedFaces() {
    return OCCwrapJavaJNI.BRepBuilderAPI_Sewing_NbDeletedFaces(swigCPtr, this);
  }

  /**
   *  Gives each deleted face
   */
  public  TopoDS_Face  DeletedFace(int index) {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.BRepBuilderAPI_Sewing_DeletedFace(swigCPtr, this, index), true);
    return ret;
  }

  /**
   *  Gives a modified shape
   */
  public TopoDS_Face WhichFace( TopoDS_Edge  theEdg, int index) {
    return new TopoDS_Face(OCCwrapJavaJNI.BRepBuilderAPI_Sewing_WhichFace__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(theEdg), theEdg, index), true);
  }

  public TopoDS_Face WhichFace( TopoDS_Edge  theEdg) {
    return new TopoDS_Face(OCCwrapJavaJNI.BRepBuilderAPI_Sewing_WhichFace__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(theEdg), theEdg), true);
  }

  /**
   *  Gets same parameter mode.
   */
  public long SameParameterMode() {
    return OCCwrapJavaJNI.BRepBuilderAPI_Sewing_SameParameterMode(swigCPtr, this);
  }

  /**
   *  Sets same parameter mode.
   */
  public void SetSameParameterMode(long SameParameterMode) {
    OCCwrapJavaJNI.BRepBuilderAPI_Sewing_SetSameParameterMode(swigCPtr, this, SameParameterMode);
  }

  /**
   *  Gives set tolerance.
   */
  public double Tolerance() {
    return OCCwrapJavaJNI.BRepBuilderAPI_Sewing_Tolerance(swigCPtr, this);
  }

  /**
   *  Sets tolerance
   */
  public void SetTolerance(double theToler) {
    OCCwrapJavaJNI.BRepBuilderAPI_Sewing_SetTolerance(swigCPtr, this, theToler);
  }

  /**
   *  Gives set min tolerance.
   */
  public double MinTolerance() {
    return OCCwrapJavaJNI.BRepBuilderAPI_Sewing_MinTolerance(swigCPtr, this);
  }

  /**
   *  Sets min tolerance
   */
  public void SetMinTolerance(double theMinToler) {
    OCCwrapJavaJNI.BRepBuilderAPI_Sewing_SetMinTolerance(swigCPtr, this, theMinToler);
  }

  /**
   *  Gives set max tolerance
   */
  public double MaxTolerance() {
    return OCCwrapJavaJNI.BRepBuilderAPI_Sewing_MaxTolerance(swigCPtr, this);
  }

  /**
   *  Sets max tolerance.
   */
  public void SetMaxTolerance(double theMaxToler) {
    OCCwrapJavaJNI.BRepBuilderAPI_Sewing_SetMaxTolerance(swigCPtr, this, theMaxToler);
  }

  /**
   *  Returns mode for sewing faces By default - true.
   */
  public long FaceMode() {
    return OCCwrapJavaJNI.BRepBuilderAPI_Sewing_FaceMode(swigCPtr, this);
  }

  /**
   *  Sets mode for sewing faces By default - true.
   */
  public void SetFaceMode(long theFaceMode) {
    OCCwrapJavaJNI.BRepBuilderAPI_Sewing_SetFaceMode(swigCPtr, this, theFaceMode);
  }

  /**
   *  Returns mode for sewing floating edges By default - false.
   */
  public long FloatingEdgesMode() {
    return OCCwrapJavaJNI.BRepBuilderAPI_Sewing_FloatingEdgesMode(swigCPtr, this);
  }

  /**
   *  Sets mode for sewing floating edges By default - false.
   *  Returns mode for cutting floating edges By default - false.
   *  Sets mode for cutting floating edges By default - false.
   */
  public void SetFloatingEdgesMode(long theFloatingEdgesMode) {
    OCCwrapJavaJNI.BRepBuilderAPI_Sewing_SetFloatingEdgesMode(swigCPtr, this, theFloatingEdgesMode);
  }

  /**
   *  Returns mode for accounting of local tolerances
   *  of edges and vertices during of merging.
   */
  public long LocalTolerancesMode() {
    return OCCwrapJavaJNI.BRepBuilderAPI_Sewing_LocalTolerancesMode(swigCPtr, this);
  }

  /**
   *  Sets mode for accounting of local tolerances
   *  of edges and vertices during of merging
   *  in this case WorkTolerance = myTolerance + tolEdge1+ tolEdg2;
   */
  public void SetLocalTolerancesMode(long theLocalTolerancesMode) {
    OCCwrapJavaJNI.BRepBuilderAPI_Sewing_SetLocalTolerancesMode(swigCPtr, this, theLocalTolerancesMode);
  }

  /**
   *  Sets mode for non-manifold sewing.
   */
  public void SetNonManifoldMode(long theNonManifoldMode) {
    OCCwrapJavaJNI.BRepBuilderAPI_Sewing_SetNonManifoldMode(swigCPtr, this, theNonManifoldMode);
  }

  /**
   *  Gets mode for non-manifold sewing.
   * 
   *  INTERNAL FUCTIONS ---
   */
  public long NonManifoldMode() {
    return OCCwrapJavaJNI.BRepBuilderAPI_Sewing_NonManifoldMode(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.BRepBuilderAPI_Sewing_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepBuilderAPI_Sewing_get_type_descriptor(), true );
  }

  public static  BRepBuilderAPI_Sewing  DownCast( Standard_Transient  T) {
    return new BRepBuilderAPI_Sewing ( OCCwrapJavaJNI.BRepBuilderAPI_Sewing_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepBuilderAPI_Sewing_TypeOf(), true );
  }

}
