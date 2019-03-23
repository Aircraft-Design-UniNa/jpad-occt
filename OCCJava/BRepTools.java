package opencascade;

/**
 *  The BRepTools package provides  utilities for BRep
 *  data structures.
 * 
 *  * WireExplorer : A tool to explore the topology of
 *  a wire in the order of the edges.
 * 
 *  * ShapeSet :  Tools used for  dumping, writing and
 *  reading.
 * 
 *  * UVBounds : Methods to compute the  limits of the
 *  boundary  of a  face,  a wire or   an edge in  the
 *  parametric space of a face.
 * 
 *  *  Update : Methods  to call when   a topology has
 *  been created to compute all missing data.
 * 
 *  * UpdateFaceUVPoints: Method to update the UV points
 *  stored with the edges on a face.
 * 
 *  * Compare : Method to compare two vertices.
 * 
 *  * Compare : Method to compare two edges.
 * 
 *  * OuterWire : A method to find the outer wire of a
 *  face.
 * 
 *  * Map3DEdges : A method to map all the 3D Edges of
 *  a Shape.
 * 
 *  * Dump : A method to dump a BRep object.
 */
public class BRepTools {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepTools(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepTools(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepTools obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepTools(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Returns in UMin,  UMax, VMin,  VMax  the  bounding
   *  values in the parametric space of F.
   */
  public static void UVBounds( TopoDS_Face  F, double[] UMin, double[] UMax, double[] VMin, double[] VMax) {
    OCCwrapJavaJNI.BRepTools_UVBounds__SWIG_0(TopoDS_Face.getCPtr(F), F, UMin, UMax, VMin, VMax);
  }

  /**
   *  Returns in UMin,  UMax, VMin,  VMax  the  bounding
   *  values of the wire in the parametric space of F.
   */
  public static void UVBounds( TopoDS_Face  F,  TopoDS_Wire  W, double[] UMin, double[] UMax, double[] VMin, double[] VMax) {
    OCCwrapJavaJNI.BRepTools_UVBounds__SWIG_1(TopoDS_Face.getCPtr(F), F, TopoDS_Wire.getCPtr(W), W, UMin, UMax, VMin, VMax);
  }

  /**
   *  Returns in UMin,  UMax, VMin,  VMax  the  bounding
   *  values of the edge in the parametric space of F.
   */
  public static void UVBounds( TopoDS_Face  F,  TopoDS_Edge  E, double[] UMin, double[] UMax, double[] VMin, double[] VMax) {
    OCCwrapJavaJNI.BRepTools_UVBounds__SWIG_2(TopoDS_Face.getCPtr(F), F, TopoDS_Edge.getCPtr(E), E, UMin, UMax, VMin, VMax);
  }

  /**
   *  Adds  to  the box <B>  the bounding values in  the
   *  parametric space of F.
   */
  public static void AddUVBounds( TopoDS_Face  F, Bnd_Box2d B) {
    OCCwrapJavaJNI.BRepTools_AddUVBounds__SWIG_0(TopoDS_Face.getCPtr(F), F, Bnd_Box2d.getCPtr(B), B);
  }

  /**
   *  Adds  to the box  <B>  the bounding  values of the
   *  wire in the parametric space of F.
   */
  public static void AddUVBounds( TopoDS_Face  F,  TopoDS_Wire  W, Bnd_Box2d B) {
    OCCwrapJavaJNI.BRepTools_AddUVBounds__SWIG_1(TopoDS_Face.getCPtr(F), F, TopoDS_Wire.getCPtr(W), W, Bnd_Box2d.getCPtr(B), B);
  }

  /**
   *  Adds to  the box <B>  the  bounding values  of the
   *  edge in the parametric space of F.
   */
  public static void AddUVBounds( TopoDS_Face  F,  TopoDS_Edge  E, Bnd_Box2d B) {
    OCCwrapJavaJNI.BRepTools_AddUVBounds__SWIG_2(TopoDS_Face.getCPtr(F), F, TopoDS_Edge.getCPtr(E), E, Bnd_Box2d.getCPtr(B), B);
  }

  /**
   *  Update a vertex (nothing is done)
   */
  public static void Update( TopoDS_Vertex  V) {
    OCCwrapJavaJNI.BRepTools_Update__SWIG_0(TopoDS_Vertex.getCPtr(V), V);
  }

  /**
   *  Update an edge, compute 2d bounding boxes.
   */
  public static void Update( TopoDS_Edge  E) {
    OCCwrapJavaJNI.BRepTools_Update__SWIG_1(TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Update a wire (nothing is done)
   */
  public static void Update( TopoDS_Wire  W) {
    OCCwrapJavaJNI.BRepTools_Update__SWIG_2(TopoDS_Wire.getCPtr(W), W);
  }

  /**
   *  Update a Face, update UV points.
   */
  public static void Update( TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepTools_Update__SWIG_3(TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Update a shell (nothing is done)
   */
  public static void Update( TopoDS_Shell  S) {
    OCCwrapJavaJNI.BRepTools_Update__SWIG_4(TopoDS_Shell.getCPtr(S), S);
  }

  /**
   *  Update a solid (nothing is done)
   */
  public static void Update( TopoDS_Solid  S) {
    OCCwrapJavaJNI.BRepTools_Update__SWIG_5(TopoDS_Solid.getCPtr(S), S);
  }

  /**
   *  Update a composite solid (nothing is done)
   */
  public static void Update( TopoDS_CompSolid  C) {
    OCCwrapJavaJNI.BRepTools_Update__SWIG_6(TopoDS_CompSolid.getCPtr(C), C);
  }

  /**
   *  Update a compound (nothing is done)
   */
  public static void Update( TopoDS_Compound  C) {
    OCCwrapJavaJNI.BRepTools_Update__SWIG_7(TopoDS_Compound.getCPtr(C), C);
  }

  /**
   *  Update a shape, call the corect update.
   */
  public static void Update( TopoDS_Shape  S) {
    OCCwrapJavaJNI.BRepTools_Update__SWIG_8(TopoDS_Shape.getCPtr(S), S);
  }

  /**
   *  For each edge of the face <F> reset the UV points
   *  to the bounding points of the parametric curve of the
   *  edge on the face.
   */
  public static void UpdateFaceUVPoints( TopoDS_Face  theF) {
    OCCwrapJavaJNI.BRepTools_UpdateFaceUVPoints(TopoDS_Face.getCPtr(theF), theF);
  }

  /**
   *  Removes all the triangulations of the faces of <S>
   *  and removes all polygons on triangulations of the
   *  edges.
   */
  public static void Clean( TopoDS_Shape  S) {
    OCCwrapJavaJNI.BRepTools_Clean(TopoDS_Shape.getCPtr(S), S);
  }

  /**
   *  Removes all the pcurves of the edges of <S> that
   *  refer to surfaces not belonging to any face of <S>
   */
  public static void RemoveUnusedPCurves( TopoDS_Shape  S) {
    OCCwrapJavaJNI.BRepTools_RemoveUnusedPCurves(TopoDS_Shape.getCPtr(S), S);
  }

  /**
   *  verifies that each face from the shape <S> has got
   *  a triangulation  with a  deflection <= deflec  and
   *  the edges a discretisation on  this triangulation.
   */
  public static long Triangulation( TopoDS_Shape  S, double deflec) {
    return OCCwrapJavaJNI.BRepTools_Triangulation(TopoDS_Shape.getCPtr(S), S, deflec);
  }

  /**
   *  Returns  True if  the    distance between the  two
   *  vertices is lower than their tolerance.
   */
  public static long Compare( TopoDS_Vertex  V1,  TopoDS_Vertex  V2) {
    return OCCwrapJavaJNI.BRepTools_Compare__SWIG_0(TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2);
  }

  /**
   *  Returns  True if  the    distance between the  two
   *  edges is lower than their tolerance.
   */
  public static long Compare( TopoDS_Edge  E1,  TopoDS_Edge  E2) {
    return OCCwrapJavaJNI.BRepTools_Compare__SWIG_1(TopoDS_Edge.getCPtr(E1), E1, TopoDS_Edge.getCPtr(E2), E2);
  }

  /**
   *  Returns the outer most wire of <F>. Returns a Null
   *  wire if <F> has no wires.
   */
  public static TopoDS_Wire OuterWire( TopoDS_Face  F) {
    return new TopoDS_Wire(OCCwrapJavaJNI.BRepTools_OuterWire(TopoDS_Face.getCPtr(F), F), true);
  }

  /**
   *  Stores in the map  <M> all the 3D topology edges
   *  of <S>.
   */
  public static void Map3DEdges( TopoDS_Shape  S,  TopTools_IndexedMapOfShape  M) {
    OCCwrapJavaJNI.BRepTools_Map3DEdges(TopoDS_Shape.getCPtr(S), S, TopTools_IndexedMapOfShape.getCPtr(M), M);
  }

  /**
   *  Verifies that the edge  <E> is found two  times on
   *  the face <F> before calling BRep_Tool::IsClosed.
   */
  public static long IsReallyClosed( TopoDS_Edge  E,  TopoDS_Face  F) {
    return OCCwrapJavaJNI.BRepTools_IsReallyClosed(TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Detect closedness of face in U and V directions
   */
  public static void DetectClosedness( TopoDS_Face  theFace, long[] theUclosed, long[] theVclosed) {
    OCCwrapJavaJNI.BRepTools_DetectClosedness(TopoDS_Face.getCPtr(theFace), theFace, theUclosed, theVclosed);
  }

  /**
   *  Dumps the topological structure and the geometry
   *  of <Sh> on the stream <S>.
   */
  public static void Dump( TopoDS_Shape  Sh, SWIGTYPE_p_Standard_OStream S) {
    OCCwrapJavaJNI.BRepTools_Dump(TopoDS_Shape.getCPtr(Sh), Sh, SWIGTYPE_p_Standard_OStream.getCPtr(S));
  }

  /**
   *  Writes <Sh> on <S> in an ASCII format.
   */
  public static void Write( TopoDS_Shape  Sh, SWIGTYPE_p_Standard_OStream S,  Message_ProgressIndicator  PR) {
    OCCwrapJavaJNI.BRepTools_Write__SWIG_0(TopoDS_Shape.getCPtr(Sh), Sh, SWIGTYPE_p_Standard_OStream.getCPtr(S),  Message_ProgressIndicator.getCPtr(PR) , PR);
  }

  /**
   *  Writes <Sh> in <File>.
   */
  public static void Write( TopoDS_Shape  Sh, SWIGTYPE_p_Standard_OStream S) {
    OCCwrapJavaJNI.BRepTools_Write__SWIG_1(TopoDS_Shape.getCPtr(Sh), Sh, SWIGTYPE_p_Standard_OStream.getCPtr(S));
  }

  /**
   *  Reads a Shape  from <S> in  returns it in  <Sh>.
   *  <B> is used to build the shape.
   */
  public static void Read(TopoDS_Shape Sh, SWIGTYPE_p_Standard_IStream S,  BRep_Builder  B,  Message_ProgressIndicator  PR) {
    OCCwrapJavaJNI.BRepTools_Read__SWIG_0(TopoDS_Shape.getCPtr(Sh), Sh, SWIGTYPE_p_Standard_IStream.getCPtr(S), BRep_Builder.getCPtr(B), B,  Message_ProgressIndicator.getCPtr(PR) , PR);
  }

  /**
   *  Reads a Shape  from <File>,  returns it in  <Sh>.
   *  <B> is used to build the shape.
   */
  public static void Read(TopoDS_Shape Sh, SWIGTYPE_p_Standard_IStream S,  BRep_Builder  B) {
    OCCwrapJavaJNI.BRepTools_Read__SWIG_1(TopoDS_Shape.getCPtr(Sh), Sh, SWIGTYPE_p_Standard_IStream.getCPtr(S), BRep_Builder.getCPtr(B), B);
  }

  public static long Write( TopoDS_Shape  Sh, String File,  Message_ProgressIndicator  PR) {
    return OCCwrapJavaJNI.BRepTools_Write__SWIG_2(TopoDS_Shape.getCPtr(Sh), Sh, File,  Message_ProgressIndicator.getCPtr(PR) , PR);
  }

  public static long Write( TopoDS_Shape  Sh, String File) {
    return OCCwrapJavaJNI.BRepTools_Write__SWIG_3(TopoDS_Shape.getCPtr(Sh), Sh, File);
  }

  public static long Read(TopoDS_Shape Sh, String File,  BRep_Builder  B,  Message_ProgressIndicator  PR) {
    return OCCwrapJavaJNI.BRepTools_Read__SWIG_2(TopoDS_Shape.getCPtr(Sh), Sh, File, BRep_Builder.getCPtr(B), B,  Message_ProgressIndicator.getCPtr(PR) , PR);
  }

  public static long Read(TopoDS_Shape Sh, String File,  BRep_Builder  B) {
    return OCCwrapJavaJNI.BRepTools_Read__SWIG_3(TopoDS_Shape.getCPtr(Sh), Sh, File, BRep_Builder.getCPtr(B), B);
  }

  /**
   *  Evals real tolerance of edge  <theE>.
   *  <theC3d>, <theC2d>, <theS>, <theF>, <theL> are
   *  correspondently 3d curve of edge, 2d curve on surface <theS> and
   *  rang of edge
   *  If calculated tolerance is more then current edge tolerance, edge is updated.
   *  Method returns actual tolerance of edge
   */
  public static double EvalAndUpdateTol( TopoDS_Edge  theE,  Geom_Curve  theC3d,  Geom2d_Curve  theC2d,  Geom_Surface  theS, double theF, double theL) {
    return OCCwrapJavaJNI.BRepTools_EvalAndUpdateTol(TopoDS_Edge.getCPtr(theE), theE,  Geom_Curve.getCPtr(theC3d) , theC3d,  Geom2d_Curve.getCPtr(theC2d) , theC2d,  Geom_Surface.getCPtr(theS) , theS, theF, theL);
  }

  public BRepTools() {
    this(OCCwrapJavaJNI.new_BRepTools(), true);
  }

}
