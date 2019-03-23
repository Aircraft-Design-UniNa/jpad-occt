package opencascade;

/**
 *  Provides a triangulation for a surface, a set of surfaces, or
 *  more generally a shape.
 *  A triangulation consists of an approximate representation
 *  of the actual shape, using a collection of points and
 *  triangles. The points are located on the surface. The
 *  edges of the triangles connect adjacent points with a
 *  straight line that approximates the true curve on the surface.
 *  A triangulation comprises:
 *  -   A table of 3D nodes (3D points on the surface).
 *  -   A table of triangles. Each triangle (Poly_Triangle
 *  object) comprises a triplet of indices in the table of 3D
 *  nodes specific to the triangulation.
 *  -   A table of 2D nodes (2D points), parallel to the table of
 *  3D nodes. This table is optional. If it exists, the
 *  coordinates of a 2D point are the (u, v) parameters
 *  of the corresponding 3D point on the surface
 *  approximated by the triangulation.
 *  -   A deflection (optional), which maximizes the distance
 *  from a point on the surface to the corresponding point
 *  on its approximate triangulation.
 *  In many cases, algorithms do not need to work with the
 *  exact representation of a surface. A triangular
 *  representation induces simpler and more robust adjusting,
 *  faster performances, and the results are as good.
 *  This is a Transient class.
 */
public class Poly_Triangulation extends Standard_Transient {
  Poly_Triangulation(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public static String get_type_name() {
    return OCCwrapJavaJNI.Poly_Triangulation_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.Poly_Triangulation_get_type_descriptor(), true );
  }

  /**
   *  Constructs a triangulation from a set of triangles. The
   *  triangulation is initialized without a triangle or a node, but capable of
   *  containing nbNodes nodes, and nbTriangles
   *  triangles. Here the UVNodes flag indicates whether
   *  2D nodes will be associated with 3D ones, (i.e. to
   *  enable a 2D representation).
   */
  public Poly_Triangulation(int nbNodes, int nbTriangles, long UVNodes) {
    this(OCCwrapJavaJNI.new_Poly_Triangulation__SWIG_0(nbNodes, nbTriangles, UVNodes), true);
  }

  /**
   *  Constructs a triangulation from a set of triangles. The
   *  triangulation is initialized with 3D points from Nodes and triangles
   *  from Triangles.
   */
  public Poly_Triangulation( TColgp_Array1OfPnt  Nodes,  Poly_Array1OfTriangle  Triangles) {
    this(OCCwrapJavaJNI.new_Poly_Triangulation__SWIG_1(TColgp_Array1OfPnt.getCPtr(Nodes), Nodes, Poly_Array1OfTriangle.getCPtr(Triangles), Triangles), true);
  }

  /**
   *  Constructs a triangulation from a set of triangles. The
   *  triangulation is initialized with 3D points from Nodes, 2D points from
   *  UVNodes and triangles from Triangles, where
   *  coordinates of a 2D point from UVNodes are the
   *  (u, v) parameters of the corresponding 3D point
   *  from Nodes on the surface approximated by the
   *  constructed triangulation.
   */
  public Poly_Triangulation( TColgp_Array1OfPnt  Nodes,  TColgp_Array1OfPnt2d  UVNodes,  Poly_Array1OfTriangle  Triangles) {
    this(OCCwrapJavaJNI.new_Poly_Triangulation__SWIG_2(TColgp_Array1OfPnt.getCPtr(Nodes), Nodes, TColgp_Array1OfPnt2d.getCPtr(UVNodes), UVNodes, Poly_Array1OfTriangle.getCPtr(Triangles), Triangles), true);
  }

  public  Poly_Triangulation  Copy() {
    return new Poly_Triangulation ( OCCwrapJavaJNI.Poly_Triangulation_Copy(swigCPtr, this), true );
  }

  /**
   *  Copy constructor for triangulation.
   */
  public Poly_Triangulation( Poly_Triangulation  theTriangulation) {
    this(OCCwrapJavaJNI.new_Poly_Triangulation__SWIG_3( Poly_Triangulation.getCPtr(theTriangulation) , theTriangulation), true);
  }

  /**
   *  Returns the deflection of this triangulation.
   */
  public double Deflection() {
    return OCCwrapJavaJNI.Poly_Triangulation_Deflection__SWIG_0(swigCPtr, this);
  }

  /**
   *  Sets the deflection of this triangulation to theDeflection.
   *  See more on deflection in Polygon2D
   */
  public void Deflection(double theDeflection) {
    OCCwrapJavaJNI.Poly_Triangulation_Deflection__SWIG_1(swigCPtr, this, theDeflection);
  }

  /**
   *  Deallocates the UV nodes.
   */
  public void RemoveUVNodes() {
    OCCwrapJavaJNI.Poly_Triangulation_RemoveUVNodes(swigCPtr, this);
  }

  /**
   *  Returns the number of nodes for this triangulation.
   */
  public int NbNodes() {
    return OCCwrapJavaJNI.Poly_Triangulation_NbNodes(swigCPtr, this);
  }

  /**
   *  Returns the number of triangles for this triangulation.
   */
  public int NbTriangles() {
    return OCCwrapJavaJNI.Poly_Triangulation_NbTriangles(swigCPtr, this);
  }

  /**
   *  Returns Standard_True if 2D nodes are associated with 3D nodes for this triangulation.
   */
  public long HasUVNodes() {
    return OCCwrapJavaJNI.Poly_Triangulation_HasUVNodes(swigCPtr, this);
  }

  /**
   *  Returns the table of 3D nodes (3D points) for this triangulation.
   */
  public  TColgp_Array1OfPnt  Nodes() {
    TColgp_Array1OfPnt ret = new TColgp_Array1OfPnt(OCCwrapJavaJNI.Poly_Triangulation_Nodes(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the table of 3D nodes (3D points) for this triangulation.
   *  The returned array is
   *  shared. Therefore if the table is selected by reference, you
   *  can, by simply modifying it, directly modify the data
   *  structure of this triangulation.
   */
  public  TColgp_Array1OfPnt  ChangeNodes() {
    TColgp_Array1OfPnt ret = new TColgp_Array1OfPnt(OCCwrapJavaJNI.Poly_Triangulation_ChangeNodes(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns node at the given index.
   *  Raises Standard_OutOfRange exception if theIndex is less than 1 or greater than NbNodes.
   */
  public  gp_Pnt  Node(int theIndex) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.Poly_Triangulation_Node(swigCPtr, this, theIndex), true);
    return ret;
  }

  /**
   *  Give access to the node at the given index.
   *  Raises Standard_OutOfRange exception if theIndex is less than 1 or greater than NbNodes.
   */
  public gp_Pnt ChangeNode(int theIndex) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.Poly_Triangulation_ChangeNode(swigCPtr, this, theIndex), false, this);
    return ret; //new gp_Pnt.CRef (ret);
  }

  /**
   *  Returns the table of 2D nodes (2D points) associated with
   *  each 3D node of this triangulation.
   *  The function HasUVNodes  checks if 2D nodes
   *  are associated with the 3D nodes of this triangulation.
   *  Const reference on the 2d nodes values.
   */
  public  TColgp_Array1OfPnt2d  UVNodes() {
    TColgp_Array1OfPnt2d ret = new TColgp_Array1OfPnt2d(OCCwrapJavaJNI.Poly_Triangulation_UVNodes(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the table of 2D nodes (2D points) associated with
   *  each 3D node of this triangulation.
   *  Function ChangeUVNodes shares  the returned array.
   *  Therefore if the table is selected by reference,
   *  you can, by simply modifying it, directly modify the data
   *  structure of this triangulation.
   */
  public  TColgp_Array1OfPnt2d  ChangeUVNodes() {
    TColgp_Array1OfPnt2d ret = new TColgp_Array1OfPnt2d(OCCwrapJavaJNI.Poly_Triangulation_ChangeUVNodes(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns UVNode at the given index.
   *  Raises Standard_OutOfRange exception if theIndex is less than 1 or greater than NbNodes.
   */
  public  gp_Pnt2d  UVNode(int theIndex) {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.Poly_Triangulation_UVNode(swigCPtr, this, theIndex), true);
    return ret;
  }

  /**
   *  Give access to the UVNode at the given index.
   *  Raises Standard_OutOfRange exception if theIndex is less than 1 or greater than NbNodes.
   */
  public gp_Pnt2d ChangeUVNode(int theIndex) {
    gp_Pnt2d ret = new gp_Pnt2d(OCCwrapJavaJNI.Poly_Triangulation_ChangeUVNode(swigCPtr, this, theIndex), false, this);
    return ret; //new gp_Pnt2d.CRef (ret);
  }

  /**
   *  Returns the table of triangles for this triangulation.
   */
  public  Poly_Array1OfTriangle  Triangles() {
    Poly_Array1OfTriangle ret = new Poly_Array1OfTriangle(OCCwrapJavaJNI.Poly_Triangulation_Triangles(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the table of triangles for this triangulation.
   *  Function ChangeUVNodes shares  the returned array.
   *  Therefore if the table is selected by reference,
   *  you can, by simply modifying it, directly modify the data
   *  structure of this triangulation.
   */
  public  Poly_Array1OfTriangle  ChangeTriangles() {
    Poly_Array1OfTriangle ret = new Poly_Array1OfTriangle(OCCwrapJavaJNI.Poly_Triangulation_ChangeTriangles(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns triangle at the given index.
   *  Raises Standard_OutOfRange exception if theIndex is less than 1 or greater than NbTriangles.
   */
  public  Poly_Triangle  Triangle(int theIndex) {
    Poly_Triangle ret = new Poly_Triangle(OCCwrapJavaJNI.Poly_Triangulation_Triangle(swigCPtr, this, theIndex), true);
    return ret;
  }

  /**
   *  Give access to the triangle at the given index.
   *  Raises Standard_OutOfRange exception if theIndex is less than 1 or greater than NbTriangles.
   */
  public Poly_Triangle ChangeTriangle(int theIndex) {
    Poly_Triangle ret = new Poly_Triangle(OCCwrapJavaJNI.Poly_Triangulation_ChangeTriangle(swigCPtr, this, theIndex), false, this);
    return ret; //new Poly_Triangle.CRef (ret);
  }

  /**
   *  Sets the table of node normals.
   *  raises exception if length of theNormals != 3*NbNodes
   */
  public void SetNormals( TShort_HArray1OfShortReal  theNormals) {
    OCCwrapJavaJNI.Poly_Triangulation_SetNormals(swigCPtr, this,  TShort_HArray1OfShortReal.getCPtr(theNormals) , theNormals);
  }

  /**
   *  Returns the table of node normals.
   */
  public  TShort_Array1OfShortReal  Normals() {
    TShort_Array1OfShortReal ret = new TShort_Array1OfShortReal(OCCwrapJavaJNI.Poly_Triangulation_Normals(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Gives access to the table of node normals.
   */
  public  TShort_Array1OfShortReal  ChangeNormals() {
    TShort_Array1OfShortReal ret = new TShort_Array1OfShortReal(OCCwrapJavaJNI.Poly_Triangulation_ChangeNormals(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns Standard_True if nodal normals are defined.
   */
  public long HasNormals() {
    return OCCwrapJavaJNI.Poly_Triangulation_HasNormals(swigCPtr, this);
  }

  /**
   *  @return normal at the given index.
   *  Raises Standard_OutOfRange exception.
   */
  public gp_Dir Normal(int theIndex) {
    return new gp_Dir(OCCwrapJavaJNI.Poly_Triangulation_Normal(swigCPtr, this, theIndex), true);
  }

  /**
   *  Changes normal at the given index.
   *  Raises Standard_OutOfRange exception.
   */
  public void SetNormal(int theIndex,  gp_Dir  theNormal) {
    OCCwrapJavaJNI.Poly_Triangulation_SetNormal(swigCPtr, this, theIndex, gp_Dir.getCPtr(theNormal), theNormal);
  }

  public static  Poly_Triangulation  DownCast( Standard_Transient  T) {
    return new Poly_Triangulation ( OCCwrapJavaJNI.Poly_Triangulation_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.Poly_Triangulation_TypeOf(), true );
  }

}
