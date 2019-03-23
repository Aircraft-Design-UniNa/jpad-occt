package opencascade;

/**
 *  Describes functions to build fillets and chamfers on the
 *  vertices of a planar face.
 *  Fillets and Chamfers on the Vertices of a Planar Face
 *  A MakeFillet2d object provides a framework for:
 *  - initializing the construction algorithm with a given face,
 *  - acquiring the data characterizing the fillets and chamfers,
 *  -   building the fillets and chamfers, and constructing the
 *  resulting shape, and
 *  -   consulting the result.
 *  Warning
 *  Only segments of straight lines and arcs of circles are
 *  treated. BSplines are not processed.
 */
public class BRepFilletAPI_MakeFillet2d extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepFilletAPI_MakeFillet2d(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepFilletAPI_MakeFillet2d(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepFilletAPI_MakeFillet2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepFilletAPI_MakeFillet2d(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Initializes an empty algorithm for computing fillets and
   *  chamfers. The face on which the fillets and
   *  chamfers are built is defined using the Init function.
   *  The vertices on which fillets or chamfers are built are
   *  defined using the AddFillet or AddChamfer function.
   *  Warning
   *  The status of the initialization, as given by the Status
   *  function, can be one of the following:
   *  -   ChFi2d_Ready if the initialization is correct,
   *  -   ChFi2d_NotPlanar if F is not planar,
   *  -   ChFi2d_NoFace if F is a null face.
   */
  public BRepFilletAPI_MakeFillet2d() {
    this(OCCwrapJavaJNI.new_BRepFilletAPI_MakeFillet2d__SWIG_0(), true);
  }

  /**
   *  Initializes an algorithm for computing fillets and chamfers on the face F.
   *  The vertices on which fillets or chamfers are built are
   *  defined using the AddFillet or AddChamfer function.
   *  Warning
   *  The status of the initialization, as given by the Status
   *  function, can be one of the following:
   *  -   ChFi2d_Ready if the initialization is correct,
   *  -   ChFi2d_NotPlanar if F is not planar,
   *  -   ChFi2d_NoFace if F is a null face.
   */
  public BRepFilletAPI_MakeFillet2d( TopoDS_Face  F) {
    this(OCCwrapJavaJNI.new_BRepFilletAPI_MakeFillet2d__SWIG_1(TopoDS_Face.getCPtr(F), F), true);
  }

  /**
   *  Initializes this algorithm for constructing fillets or
   *  chamfers with the face F.
   *  Warning
   *  The status of the initialization, as given by the Status
   *  function, can be one of the following:
   *  -   ChFi2d_Ready if the initialization is correct,
   *  -   ChFi2d_NotPlanar if F is not planar,
   *  -   ChFi2d_NoFace if F is a null face.
   */
  public void Init( TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_Init__SWIG_0(swigCPtr, this, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  This initialize  method allow  to init the builder
   *  from a  face <RefFace> and  another face <ModFace>
   *  which derive from  <RefFace>.  This  is usefull to
   *  modify a fillet or   a chamfer already created  on
   *  <ModFace> .
   */
  public void Init( TopoDS_Face  RefFace,  TopoDS_Face  ModFace) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_Init__SWIG_1(swigCPtr, this, TopoDS_Face.getCPtr(RefFace), RefFace, TopoDS_Face.getCPtr(ModFace), ModFace);
  }

  /**
   *  Adds a fillet of radius Radius between the two edges
   *  adjacent to the vertex V on the face modified by this
   *  algorithm. The two edges do not need to be rectilinear.
   *  This function returns the fillet and builds the resulting face.
   *  Warning
   *  The status of the construction, as given by the Status
   *  function, can be one of the following:
   *  - ChFi2d_IsDone if the fillet is built,
   *  - ChFi2d_ConnexionError if V does not belong to the initial face,
   *  -   ChFi2d_ComputationError if Radius is too large
   *  to build a fillet between the two adjacent edges,
   *  -   ChFi2d_NotAuthorized
   *  -   if one of the two edges connected to V is a fillet or chamfer, or
   *  -   if a curve other than a straight line or an arc of a
   *  circle is used as E, E1 or E2.
   *  Do not use the returned fillet if the status of the construction is not ChFi2d_IsDone.
   *  Exceptions
   *  Standard_NegativeValue if Radius is less than or equal to zero.
   */
  public TopoDS_Edge AddFillet( TopoDS_Vertex  V, double Radius) {
    return new TopoDS_Edge(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_AddFillet(swigCPtr, this, TopoDS_Vertex.getCPtr(V), V, Radius), true);
  }

  /**
   *  Assigns the radius Radius to the fillet Fillet already
   *  built on the face modified by this algorithm.
   *  This function returns the new fillet and modifies the existing face.
   *  Warning
   *  The status of the construction, as given by the Status
   *  function, can be one of the following:
   *  -   ChFi2d_IsDone if the new fillet is built,
   *  -   ChFi2d_ConnexionError if Fillet does not
   *  belong to the existing face,
   *  -   ChFi2d_ComputationError if Radius is too
   *  large to build a fillet between the two adjacent edges.
   *  Do not use the returned fillet if the status of the
   *  construction is not ChFi2d_IsDone.
   *  Exceptions
   *  Standard_NegativeValue if Radius is less than or equal to zero.
   */
  public TopoDS_Edge ModifyFillet( TopoDS_Edge  Fillet, double Radius) {
    return new TopoDS_Edge(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_ModifyFillet(swigCPtr, this, TopoDS_Edge.getCPtr(Fillet), Fillet, Radius), true);
  }

  /**
   *  Removes the fillet Fillet already built on the face
   *  modified by this algorithm.
   *  This function returns the vertex connecting the two
   *  adjacent edges of Fillet and modifies the existing face.
   *  Warning
   *  -   The returned vertex is only valid if the Status
   *  function returns ChFi2d_IsDone.
   *  -   A null vertex is returned if the edge Fillet does not
   *  belong to the initial face.
   */
  public TopoDS_Vertex RemoveFillet( TopoDS_Edge  Fillet) {
    return new TopoDS_Vertex(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_RemoveFillet(swigCPtr, this, TopoDS_Edge.getCPtr(Fillet), Fillet), true);
  }

  /**
   *  Adds a chamfer on the face modified by this algorithm
   *  between the two adjacent edges E1 and E2, where
   *  the extremities of the chamfer are on E1 and E2 at
   *  distances D1 and D2 respectively
   *  In cases where the edges are not rectilinear, distances
   *  are measured using the curvilinear abscissa of the
   *  edges and the angle is measured with respect to the
   *  tangent at the corresponding point.
   *  The angle Ang is given in radians.
   *  This function returns the chamfer and builds the resulting face.
   */
  public TopoDS_Edge AddChamfer( TopoDS_Edge  E1,  TopoDS_Edge  E2, double D1, double D2) {
    return new TopoDS_Edge(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_AddChamfer__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(E1), E1, TopoDS_Edge.getCPtr(E2), E2, D1, D2), true);
  }

  /**
   *  Adds a chamfer on the face modified by this algorithm
   *  between the two edges connected by the vertex V,
   *  where E is one of the two edges. The chamfer makes
   *  an angle Ang with E and one of its extremities is on
   *  E at distance D from V.
   *  In cases where the edges are not rectilinear, distances
   *  are measured using the curvilinear abscissa of the
   *  edges and the angle is measured with respect to the
   *  tangent at the corresponding point.
   *  The angle Ang is given in radians.
   *  This function returns the chamfer and builds the resulting face.
   *  Warning
   *  The status of the construction, as given by the Status function, can
   *  be one of the following:
   *  -          ChFi2d_IsDone if the chamfer is built,
   *  -  ChFi2d_ParametersError if D1, D2, D or Ang is less than or equal to zero,
   *  -          ChFi2d_ConnexionError if:
   *  - the edge E, E1 or E2 does not belong to the initial face, or
   *  -  the edges E1 and E2 are not adjacent, or
   *  -  the vertex V is not one of the limit points of the edge E,
   *  -          ChFi2d_ComputationError if the parameters of the chamfer
   *  are too large to build a chamfer between the two adjacent edges,
   *  -          ChFi2d_NotAuthorized if:
   *  - the edge E1, E2 or one of the two edges connected to V is a fillet or chamfer, or
   *  - a curve other than a straight line or an arc of a circle is used as E, E1 or E2.
   *  Do not use the returned chamfer if
   *  the status of the construction is not ChFi2d_IsDone.
   */
  public TopoDS_Edge AddChamfer( TopoDS_Edge  E,  TopoDS_Vertex  V, double D, double Ang) {
    return new TopoDS_Edge(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_AddChamfer__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, TopoDS_Vertex.getCPtr(V), V, D, Ang), true);
  }

  /**
   *  Modifies the chamfer Chamfer on the face modified
   *  by this algorithm, where:
   *  E1 and E2 are the two adjacent edges on which
   *  Chamfer is already built; the extremities of the new
   *  chamfer are on E1 and E2 at distances D1 and D2 respectively.
   */
  public TopoDS_Edge ModifyChamfer( TopoDS_Edge  Chamfer,  TopoDS_Edge  E1,  TopoDS_Edge  E2, double D1, double D2) {
    return new TopoDS_Edge(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_ModifyChamfer__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(Chamfer), Chamfer, TopoDS_Edge.getCPtr(E1), E1, TopoDS_Edge.getCPtr(E2), E2, D1, D2), true);
  }

  /**
   *  Modifies the chamfer Chamfer on the face modified
   *  by this algorithm, where:
   *  E is one of the two adjacent edges on which
   *  Chamfer is already built; the new chamfer makes
   *  an angle Ang with E and one of its extremities is
   *  on E at distance D from the vertex on which the chamfer is built.
   *  In cases where the edges are not rectilinear, the
   *  distances are measured using the curvilinear abscissa
   *  of the edges and the angle is measured with respect
   *  to the tangent at the corresponding point.
   *  The angle Ang is given in radians.
   *  This function returns the new chamfer and modifies the existing face.
   *  Warning
   *  The status of the construction, as given by the Status
   *  function, can be one of the following:
   *  -   ChFi2d_IsDone if the chamfer is built,
   *  -   ChFi2d_ParametersError if D1, D2, D or Ang is less than or equal to zero,
   *  -   ChFi2d_ConnexionError if:
   *  -   the edge E, E1, E2 or Chamfer does not belong
   *  to the existing face, or
   *  -   the edges E1 and E2 are not adjacent,
   *  -   ChFi2d_ComputationError if the parameters of
   *  the chamfer are too large to build a chamfer
   *  between the two adjacent edges,
   *  -   ChFi2d_NotAuthorized if E1 or E2 is a fillet or chamfer.
   *  Do not use the returned chamfer if the status of the
   *  construction is not ChFi2d_IsDone.
   */
  public TopoDS_Edge ModifyChamfer( TopoDS_Edge  Chamfer,  TopoDS_Edge  E, double D, double Ang) {
    return new TopoDS_Edge(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_ModifyChamfer__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(Chamfer), Chamfer, TopoDS_Edge.getCPtr(E), E, D, Ang), true);
  }

  /**
   *  Removes the chamfer Chamfer already built on the face
   *  modified by this algorithm.
   *  This function returns the vertex connecting the two
   *  adjacent edges of Chamfer and modifies the existing face.
   *  Warning
   *  -   The returned vertex is only valid if the Status
   *  function returns ChFi2d_IsDone.
   *  -   A null vertex is returned if the edge Chamfer does
   *  not belong to the initial face.
   */
  public TopoDS_Vertex RemoveChamfer( TopoDS_Edge  Chamfer) {
    return new TopoDS_Vertex(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_RemoveChamfer(swigCPtr, this, TopoDS_Edge.getCPtr(Chamfer), Chamfer), true);
  }

  /**
   *  Returns true if the edge E on the face modified by this
   *  algorithm is chamfered or filleted.
   *  Warning
   *  Returns false if E does not belong to the face modified by this algorithm.
   */
  public long IsModified( TopoDS_Edge  E) {
    return OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_IsModified(swigCPtr, this, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Returns the table of fillets on the face modified by this algorithm.
   */
  public  TopTools_SequenceOfShape  FilletEdges() {
    TopTools_SequenceOfShape ret = new TopTools_SequenceOfShape(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_FilletEdges(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the number of fillets on the face modified by this algorithm.
   */
  public int NbFillet() {
    return OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_NbFillet(swigCPtr, this);
  }

  /**
   *  Returns the table of chamfers on the face modified by this algorithm.
   */
  public  TopTools_SequenceOfShape  ChamferEdges() {
    TopTools_SequenceOfShape ret = new TopTools_SequenceOfShape(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_ChamferEdges(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the number of chamfers on the face modified by this algorithm.
   */
  public int NbChamfer() {
    return OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_NbChamfer(swigCPtr, this);
  }

  /**
   *  returns the number of new curves
   *  after the shape creation.
   */
  public int NbCurves() {
    return OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_NbCurves(swigCPtr, this);
  }

  /**
   *  Return the Edges created for curve I.
   */
  public  TopTools_ListOfShape  NewEdges(int I) {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_NewEdges(swigCPtr, this, I), false, this);
    return ret;
  }

  public long HasDescendant( TopoDS_Edge  E) {
    return OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_HasDescendant(swigCPtr, this, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Returns the chamfered or filleted edge built from the
   *  edge E on the face modified by this algorithm. If E has
   *  not been modified, this function returns E.
   *  Exceptions
   *  Standard_NoSuchObject if the edge E does not
   *  belong to the initial face.
   */
  public  TopoDS_Edge  DescendantEdge( TopoDS_Edge  E) {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_DescendantEdge(swigCPtr, this, TopoDS_Edge.getCPtr(E), E), true);
    return ret;
  }

  /**
   *  Returns the basis edge on the face modified by this
   *  algorithm from which the chamfered or filleted edge E is
   *  built. If E has not been modified, this function returns E.
   *  Warning
   *  E is returned if it does not belong to the initial face.
   */
  public  TopoDS_Edge  BasisEdge( TopoDS_Edge  E) {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_BasisEdge(swigCPtr, this, TopoDS_Edge.getCPtr(E), E), true);
    return ret;
  }

  public ChFi2d_ConstructionError Status() {
    return ChFi2d_ConstructionError.swigToEnum(OCCwrapJavaJNI.BRepFilletAPI_MakeFillet2d_Status(swigCPtr, this));
  }

}
