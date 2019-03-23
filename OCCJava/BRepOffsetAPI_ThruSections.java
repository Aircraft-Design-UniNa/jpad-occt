package opencascade;

/**
 *  Describes functions to build a loft. This is a shell or a
 *  solid passing through a set of sections in a given
 *  sequence. Usually sections are wires, but the first and
 *  the last sections may be vertices (punctual sections).
 */
public class BRepOffsetAPI_ThruSections extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepOffsetAPI_ThruSections(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepOffsetAPI_ThruSections(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepOffsetAPI_ThruSections obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepOffsetAPI_ThruSections(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Initializes an algorithm for building a shell or a solid
   *  passing through a set of sections, where:
   *  -          isSolid is set to true if the construction algorithm is
   *  required to build a solid or to false if it is required to build
   *  a shell (the default value),
   *  -          ruled is set to true if the faces generated between
   *  the edges of two consecutive wires are ruled surfaces or to
   *  false (the default value) if they are smoothed out by approximation,
   *  -          pres3d defines the precision criterion used by the
   *  approximation algorithm; the default value is 1.0e-6.
   *  Use AddWire and AddVertex to define the
   *  successive sections of the shell or solid to be built.
   */
  public BRepOffsetAPI_ThruSections(long isSolid, long ruled, double pres3d) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_ThruSections__SWIG_0(isSolid, ruled, pres3d), true);
  }

  public BRepOffsetAPI_ThruSections(long isSolid, long ruled) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_ThruSections__SWIG_1(isSolid, ruled), true);
  }

  public BRepOffsetAPI_ThruSections(long isSolid) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_ThruSections__SWIG_2(isSolid), true);
  }

  public BRepOffsetAPI_ThruSections() {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_ThruSections__SWIG_3(), true);
  }

  /**
   *  Initializes this algorithm for building a shell or a solid
   *  passing through a set of sections, where:
   *  - isSolid is set to true if this construction algorithm is
   *  required to build a solid or to false if it is required to
   *  build a shell. false is the default value;
   *  - ruled is set to true if the faces generated between the
   *  edges of two consecutive wires are ruled surfaces or
   *  to false (the default value) if they are smoothed out by approximation,
   *  - pres3d defines the precision criterion used by the
   *  approximation algorithm; the default value is 1.0e-6.
   *  Use AddWire and AddVertex to define the successive
   *  sections of the shell or solid to be built.
   */
  public void Init(long isSolid, long ruled, double pres3d) {
    OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_Init__SWIG_0(swigCPtr, this, isSolid, ruled, pres3d);
  }

  public void Init(long isSolid, long ruled) {
    OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_Init__SWIG_1(swigCPtr, this, isSolid, ruled);
  }

  public void Init(long isSolid) {
    OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_Init__SWIG_2(swigCPtr, this, isSolid);
  }

  public void Init() {
    OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_Init__SWIG_3(swigCPtr, this);
  }

  /**
   *  Adds the wire wire to the set of
   *  sections through which the shell or solid is built.
   *  Use the Build function to construct the shape.
   */
  public void AddWire( TopoDS_Wire  wire) {
    OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_AddWire(swigCPtr, this, TopoDS_Wire.getCPtr(wire), wire);
  }

  /**
   *  Adds the vertex Vertex (punctual section) to the set of sections
   *  through which the shell or solid is built. A vertex may be added to the
   *  set of sections only as first or last section. At least one wire
   *  must be added to the set of sections by the method AddWire.
   *  Use the Build function to construct the shape.
   */
  public void AddVertex( TopoDS_Vertex  aVertex) {
    OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_AddVertex(swigCPtr, this, TopoDS_Vertex.getCPtr(aVertex), aVertex);
  }

  /**
   *  Sets/unsets the option to
   *  compute origin and orientation on wires to avoid twisted results
   *  and update wires to have same number of edges.
   */
  public void CheckCompatibility(long check) {
    OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_CheckCompatibility__SWIG_0(swigCPtr, this, check);
  }

  public void CheckCompatibility() {
    OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_CheckCompatibility__SWIG_1(swigCPtr, this);
  }

  /**
   *  Define the approximation algorithm
   */
  public void SetSmoothing(long UseSmoothing) {
    OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_SetSmoothing(swigCPtr, this, UseSmoothing);
  }

  /**
   *  Define the type of parametrization   used in the approximation
   */
  public void SetParType(Approx_ParametrizationType ParType) {
    OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_SetParType(swigCPtr, this, ParType.swigValue());
  }

  /**
   *  Define the Continuity used in the approximation
   */
  public void SetContinuity(GeomAbs_Shape C) {
    OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_SetContinuity(swigCPtr, this, C.swigValue());
  }

  /**
   *  define the Weights  associed to the criterium used in
   *  the  optimization.
   * 
   *  if Wi <= 0
   */
  public void SetCriteriumWeight(double W1, double W2, double W3) {
    OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_SetCriteriumWeight(swigCPtr, this, W1, W2, W3);
  }

  /**
   *  Define the maximal U degree of result surface
   */
  public void SetMaxDegree(int MaxDeg) {
    OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_SetMaxDegree(swigCPtr, this, MaxDeg);
  }

  /**
   *  returns the type of parametrization used in the approximation
   */
  public Approx_ParametrizationType ParType() {
    return Approx_ParametrizationType.swigToEnum(OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_ParType(swigCPtr, this));
  }

  /**
   *  returns the Continuity used in the approximation
   */
  public GeomAbs_Shape Continuity() {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_Continuity(swigCPtr, this));
  }

  /**
   *  returns the maximal U degree of result surface
   */
  public int MaxDegree() {
    return OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_MaxDegree(swigCPtr, this);
  }

  /**
   *  Define the approximation algorithm
   */
  public long UseSmoothing() {
    return OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_UseSmoothing(swigCPtr, this);
  }

  /**
   *  returns the Weights associed  to the criterium used in
   *  the  optimization.
   */
  public void CriteriumWeight(double[] W1, double[] W2, double[] W3) {
    OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_CriteriumWeight(swigCPtr, this, W1, W2, W3);
  }

  /**
   *  Returns the TopoDS Shape of the bottom of the loft if solid
   */
  public  TopoDS_Shape  FirstShape() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_FirstShape(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the TopoDS Shape of the top of the loft if solid
   */
  public  TopoDS_Shape  LastShape() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_LastShape(swigCPtr, this), true);
    return ret;
  }

  /**
   *  if Ruled
   *  Returns the Face generated by each edge
   *  except the last wire
   *  if smoothed
   *  Returns the Face generated by each edge of the first wire
   */
  public TopoDS_Shape GeneratedFace( TopoDS_Shape  Edge) {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_GeneratedFace(swigCPtr, this, TopoDS_Shape.getCPtr(Edge), Edge), true);
  }

  /**
   *  Returns the list of original wires
   */
  public  TopTools_ListOfShape  Wires() {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BRepOffsetAPI_ThruSections_Wires(swigCPtr, this), false, this);
    return ret;
  }

}
