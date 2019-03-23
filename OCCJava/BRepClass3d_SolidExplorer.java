package opencascade;

/**
 *  Provide an exploration of a BRep Shape for the classification.
 *  Provide access to the special UB tree to obtain fast search.
 */
public class BRepClass3d_SolidExplorer {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepClass3d_SolidExplorer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepClass3d_SolidExplorer(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepClass3d_SolidExplorer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepClass3d_SolidExplorer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BRepClass3d_SolidExplorer() {
    this(OCCwrapJavaJNI.new_BRepClass3d_SolidExplorer__SWIG_0(), true);
  }

  public BRepClass3d_SolidExplorer( TopoDS_Shape  S) {
    this(OCCwrapJavaJNI.new_BRepClass3d_SolidExplorer__SWIG_1(TopoDS_Shape.getCPtr(S), S), true);
  }

  public void InitShape( TopoDS_Shape  S) {
    OCCwrapJavaJNI.BRepClass3d_SolidExplorer_InitShape(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

  /**
   *  Should return True if P outside of bounding vol. of the shape
   */
  public long Reject( gp_Pnt  P) {
    return OCCwrapJavaJNI.BRepClass3d_SolidExplorer_Reject(swigCPtr, this, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  compute a point P in the face  F. Param is a Real in
   *  ]0,1[ and   is  used to  initialise  the algorithm. For
   *  different values , different points are returned.
   */
  public static long FindAPointInTheFace( TopoDS_Face  F, gp_Pnt P, double[] Param) {
    return OCCwrapJavaJNI.BRepClass3d_SolidExplorer_FindAPointInTheFace__SWIG_0(TopoDS_Face.getCPtr(F), F, gp_Pnt.getCPtr(P), P, Param);
  }

  public static long FindAPointInTheFace( TopoDS_Face  F, gp_Pnt P, double[] u, double[] v, double[] Param) {
    return OCCwrapJavaJNI.BRepClass3d_SolidExplorer_FindAPointInTheFace__SWIG_1(TopoDS_Face.getCPtr(F), F, gp_Pnt.getCPtr(P), P, u, v, Param);
  }

  public static long FindAPointInTheFace( TopoDS_Face  F, gp_Pnt P, double[] u, double[] v, double[] Param, gp_Vec theVecD1U, gp_Vec theVecD1V) {
    return OCCwrapJavaJNI.BRepClass3d_SolidExplorer_FindAPointInTheFace__SWIG_2(TopoDS_Face.getCPtr(F), F, gp_Pnt.getCPtr(P), P, u, v, Param, gp_Vec.getCPtr(theVecD1U), theVecD1U, gp_Vec.getCPtr(theVecD1V), theVecD1V);
  }

  public static long FindAPointInTheFace( TopoDS_Face  F, gp_Pnt P, double[] u, double[] v) {
    return OCCwrapJavaJNI.BRepClass3d_SolidExplorer_FindAPointInTheFace__SWIG_3(TopoDS_Face.getCPtr(F), F, gp_Pnt.getCPtr(P), P, u, v);
  }

  public static long FindAPointInTheFace( TopoDS_Face  F, gp_Pnt P) {
    return OCCwrapJavaJNI.BRepClass3d_SolidExplorer_FindAPointInTheFace__SWIG_4(TopoDS_Face.getCPtr(F), F, gp_Pnt.getCPtr(P), P);
  }

  public static long FindAPointInTheFace( TopoDS_Face  F, double[] u, double[] v) {
    return OCCwrapJavaJNI.BRepClass3d_SolidExplorer_FindAPointInTheFace__SWIG_5(TopoDS_Face.getCPtr(F), F, u, v);
  }

  public long PointInTheFace( TopoDS_Face  F, gp_Pnt P, double[] u, double[] v, double[] Param, int[] Index) {
    return OCCwrapJavaJNI.BRepClass3d_SolidExplorer_PointInTheFace__SWIG_0(swigCPtr, this, TopoDS_Face.getCPtr(F), F, gp_Pnt.getCPtr(P), P, u, v, Param, Index);
  }

  public long PointInTheFace( TopoDS_Face  F, gp_Pnt P, double[] u, double[] v, double[] Param, int[] Index,  BRepAdaptor_HSurface  surf, double u1, double v1, double u2, double v2) {
    return OCCwrapJavaJNI.BRepClass3d_SolidExplorer_PointInTheFace__SWIG_1(swigCPtr, this, TopoDS_Face.getCPtr(F), F, gp_Pnt.getCPtr(P), P, u, v, Param, Index,  BRepAdaptor_HSurface.getCPtr(surf) , surf, u1, v1, u2, v2);
  }

  /**
   *  <Index> gives point index  to  search from and returns
   *  point index of succeseful search
   */
  public long PointInTheFace( TopoDS_Face  F, gp_Pnt P, double[] u, double[] v, double[] Param, int[] Index,  BRepAdaptor_HSurface  surf, double u1, double v1, double u2, double v2, gp_Vec theVecD1U, gp_Vec theVecD1V) {
    return OCCwrapJavaJNI.BRepClass3d_SolidExplorer_PointInTheFace__SWIG_2(swigCPtr, this, TopoDS_Face.getCPtr(F), F, gp_Pnt.getCPtr(P), P, u, v, Param, Index,  BRepAdaptor_HSurface.getCPtr(surf) , surf, u1, v1, u2, v2, gp_Vec.getCPtr(theVecD1U), theVecD1U, gp_Vec.getCPtr(theVecD1V), theVecD1V);
  }

  /**
   *  Starts an exploration of the shells.
   */
  public void InitShell() {
    OCCwrapJavaJNI.BRepClass3d_SolidExplorer_InitShell(swigCPtr, this);
  }

  /**
   *  Returns True if there is a current shell.
   */
  public long MoreShell() {
    return OCCwrapJavaJNI.BRepClass3d_SolidExplorer_MoreShell(swigCPtr, this);
  }

  /**
   *  Sets the explorer to the next shell.
   */
  public void NextShell() {
    OCCwrapJavaJNI.BRepClass3d_SolidExplorer_NextShell(swigCPtr, this);
  }

  /**
   *  Returns the current shell.
   */
  public TopoDS_Shell CurrentShell() {
    return new TopoDS_Shell(OCCwrapJavaJNI.BRepClass3d_SolidExplorer_CurrentShell(swigCPtr, this), true);
  }

  /**
   *  Returns True if the Shell is rejected.
   */
  public long RejectShell( gp_Lin  L) {
    return OCCwrapJavaJNI.BRepClass3d_SolidExplorer_RejectShell(swigCPtr, this, gp_Lin.getCPtr(L), L);
  }

  /**
   *  Starts an exploration of the faces of the current shell.
   */
  public void InitFace() {
    OCCwrapJavaJNI.BRepClass3d_SolidExplorer_InitFace(swigCPtr, this);
  }

  /**
   *  Returns True if current face in current shell.
   */
  public long MoreFace() {
    return OCCwrapJavaJNI.BRepClass3d_SolidExplorer_MoreFace(swigCPtr, this);
  }

  /**
   *  Sets the explorer to the next Face of the current shell.
   */
  public void NextFace() {
    OCCwrapJavaJNI.BRepClass3d_SolidExplorer_NextFace(swigCPtr, this);
  }

  /**
   *  Returns the current face.
   */
  public TopoDS_Face CurrentFace() {
    return new TopoDS_Face(OCCwrapJavaJNI.BRepClass3d_SolidExplorer_CurrentFace(swigCPtr, this), true);
  }

  /**
   *  returns True if the face is rejected.
   */
  public long RejectFace( gp_Lin  L) {
    return OCCwrapJavaJNI.BRepClass3d_SolidExplorer_RejectFace(swigCPtr, this, gp_Lin.getCPtr(L), L);
  }

  /**
   *  Returns  in <L>, <Par>  a segment having at least
   *  one  intersection  with  the  shape  boundary  to
   *  compute  intersections.
   */
  public int Segment( gp_Pnt  P, gp_Lin L, double[] Par) {
    return OCCwrapJavaJNI.BRepClass3d_SolidExplorer_Segment(swigCPtr, this, gp_Pnt.getCPtr(P), P, gp_Lin.getCPtr(L), L, Par);
  }

  /**
   *  Returns  in <L>, <Par>  a segment having at least
   *  one  intersection  with  the  shape  boundary  to
   *  compute  intersections.
   * 
   *  The First Call to this method returns a line which
   *  point to a point of the first face of the shape.
   *  The Second Call provide a line to the second face
   *  and so on.
   */
  public int OtherSegment( gp_Pnt  P, gp_Lin L, double[] Par) {
    return OCCwrapJavaJNI.BRepClass3d_SolidExplorer_OtherSegment(swigCPtr, this, gp_Pnt.getCPtr(P), P, gp_Lin.getCPtr(L), L, Par);
  }

  /**
   *  Returns the index of face for which
   *  last segment is calculated.
   */
  public int GetFaceSegmentIndex() {
    return OCCwrapJavaJNI.BRepClass3d_SolidExplorer_GetFaceSegmentIndex(swigCPtr, this);
  }

  public void DumpSegment( gp_Pnt  P,  gp_Lin  L, double Par, TopAbs_State S) {
    OCCwrapJavaJNI.BRepClass3d_SolidExplorer_DumpSegment(swigCPtr, this, gp_Pnt.getCPtr(P), P, gp_Lin.getCPtr(L), L, Par, S.swigValue());
  }

  public  Bnd_Box  Box() {
    Bnd_Box ret = new Bnd_Box(OCCwrapJavaJNI.BRepClass3d_SolidExplorer_Box(swigCPtr, this), true);
    return ret;
  }

  public  TopoDS_Shape  GetShape() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepClass3d_SolidExplorer_GetShape(swigCPtr, this), true);
    return ret;
  }

  public  IntCurvesFace_Intersector  Intersector( TopoDS_Face  F) {
    IntCurvesFace_Intersector ret = new IntCurvesFace_Intersector(OCCwrapJavaJNI.BRepClass3d_SolidExplorer_Intersector(swigCPtr, this, TopoDS_Face.getCPtr(F), F), false, this);
    return ret;
  }

  /**
   *  Return UB-tree instance which is used for edge / vertex checks.
   */
  public SWIGTYPE_p_BRepClass3d_BndBoxTree GetTree() {
    return new SWIGTYPE_p_BRepClass3d_BndBoxTree(OCCwrapJavaJNI.BRepClass3d_SolidExplorer_GetTree(swigCPtr, this), false);
  }

  /**
   *  Return edge/vertices map for current shape.
   */
  public  TopTools_IndexedMapOfShape  GetMapEV() {
    TopTools_IndexedMapOfShape ret = new TopTools_IndexedMapOfShape(OCCwrapJavaJNI.BRepClass3d_SolidExplorer_GetMapEV(swigCPtr, this), false, this);
    return ret;
  }

  public void Destroy() {
    OCCwrapJavaJNI.BRepClass3d_SolidExplorer_Destroy(swigCPtr, this);
  }

}
