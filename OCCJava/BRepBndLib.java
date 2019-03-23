package opencascade;

/**
 *  This package provides the bounding boxes for curves
 *  and surfaces from BRepAdaptor.
 *  Functions to add a topological shape to a bounding box
 */
public class BRepBndLib {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepBndLib(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepBndLib(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepBndLib obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepBndLib(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Adds the shape S to the bounding box B.
   *  More precisely are successively added to B:
   *  -   each face of S; the triangulation of the face is used if it exists,
   *  -   then each edge of S which does not belong to a face,
   *  the polygon of the edge is used if it exists
   *  -   and last each vertex of S which does not belong to an edge.
   *  After each elementary operation, the bounding box B is
   *  enlarged by the tolerance value of the relative sub-shape.
   *  When working with the triangulation of a face this value of
   *  enlargement is the sum of the triangulation deflection and
   *  the face tolerance. When working with the
   *  polygon of an edge this value of enlargement is
   *  the sum of the polygon deflection and the edge tolerance.
   *  Warning
   *  -   This algorithm is time consuming if triangulation has not
   *  been inserted inside the data structure of the shape S.
   *  -   The resulting bounding box may be somewhat larger than the object.
   */
  public static void Add( TopoDS_Shape  S, Bnd_Box B, long useTriangulation) {
    OCCwrapJavaJNI.BRepBndLib_Add__SWIG_0(TopoDS_Shape.getCPtr(S), S, Bnd_Box.getCPtr(B), B, useTriangulation);
  }

  public static void Add( TopoDS_Shape  S, Bnd_Box B) {
    OCCwrapJavaJNI.BRepBndLib_Add__SWIG_1(TopoDS_Shape.getCPtr(S), S, Bnd_Box.getCPtr(B), B);
  }

  /**
   *  Adds the shape S to the bounding box B.
   *  This is a quick algorithm but only works if the shape S is
   *  composed of polygonal planar faces, as is the case if S is
   *  an approached polyhedral representation of an exact
   *  shape. Pay particular attention to this because this
   *  condition is not checked and, if it not respected, an error
   *  may occur in the algorithm for which the bounding box is built.
   *  Note that the resulting bounding box is not enlarged by the
   *  tolerance value of the sub-shapes as is the case with the
   *  Add function. So the added part of the resulting bounding
   *  box is closer to the shape S.
   */
  public static void AddClose( TopoDS_Shape  S, Bnd_Box B) {
    OCCwrapJavaJNI.BRepBndLib_AddClose(TopoDS_Shape.getCPtr(S), S, Bnd_Box.getCPtr(B), B);
  }

  /**
   *  Adds the shape S to the bounding box B.
   *  This algorith builds precise bounding box,
   *  which differs from exact geometry boundaries of shape only on shape entities tolerances
   *  Algorithm is the same as for method Add(..), but uses more precise methods for building boxes 
   *  for geometry objects.
   *  If useShapeTolerance = True, bounding box is enlardged by shape tolerances and 
   *  these tolerances are used for numerical methods of bounding box size calculations, 
   *  otherwise bounding box is built according to sizes of uderlined geometrical entities,
   *  numerical calculation use tolerance Precision::Confusion().
   */
  public static void AddOptimal( TopoDS_Shape  S, Bnd_Box B, long useTriangulation, long useShapeTolerance) {
    OCCwrapJavaJNI.BRepBndLib_AddOptimal__SWIG_0(TopoDS_Shape.getCPtr(S), S, Bnd_Box.getCPtr(B), B, useTriangulation, useShapeTolerance);
  }

  public static void AddOptimal( TopoDS_Shape  S, Bnd_Box B, long useTriangulation) {
    OCCwrapJavaJNI.BRepBndLib_AddOptimal__SWIG_1(TopoDS_Shape.getCPtr(S), S, Bnd_Box.getCPtr(B), B, useTriangulation);
  }

  public static void AddOptimal( TopoDS_Shape  S, Bnd_Box B) {
    OCCwrapJavaJNI.BRepBndLib_AddOptimal__SWIG_2(TopoDS_Shape.getCPtr(S), S, Bnd_Box.getCPtr(B), B);
  }

  public static void AddOBB( TopoDS_Shape  theS, SWIGTYPE_p_Bnd_OBB theOBB, long theIsTriangulationUsed, long theIsOptimal, long theIsShapeToleranceUsed) {
    OCCwrapJavaJNI.BRepBndLib_AddOBB__SWIG_0(TopoDS_Shape.getCPtr(theS), theS, SWIGTYPE_p_Bnd_OBB.getCPtr(theOBB), theIsTriangulationUsed, theIsOptimal, theIsShapeToleranceUsed);
  }

  public static void AddOBB( TopoDS_Shape  theS, SWIGTYPE_p_Bnd_OBB theOBB, long theIsTriangulationUsed, long theIsOptimal) {
    OCCwrapJavaJNI.BRepBndLib_AddOBB__SWIG_1(TopoDS_Shape.getCPtr(theS), theS, SWIGTYPE_p_Bnd_OBB.getCPtr(theOBB), theIsTriangulationUsed, theIsOptimal);
  }

  public static void AddOBB( TopoDS_Shape  theS, SWIGTYPE_p_Bnd_OBB theOBB, long theIsTriangulationUsed) {
    OCCwrapJavaJNI.BRepBndLib_AddOBB__SWIG_2(TopoDS_Shape.getCPtr(theS), theS, SWIGTYPE_p_Bnd_OBB.getCPtr(theOBB), theIsTriangulationUsed);
  }

  public static void AddOBB( TopoDS_Shape  theS, SWIGTYPE_p_Bnd_OBB theOBB) {
    OCCwrapJavaJNI.BRepBndLib_AddOBB__SWIG_3(TopoDS_Shape.getCPtr(theS), theS, SWIGTYPE_p_Bnd_OBB.getCPtr(theOBB));
  }

  public BRepBndLib() {
    this(OCCwrapJavaJNI.new_BRepBndLib(), true);
  }

}
