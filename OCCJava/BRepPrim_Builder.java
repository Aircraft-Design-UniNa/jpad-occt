package opencascade;

/**
 *  implements the abstract Builder with the BRep Builder
 */
public class BRepPrim_Builder {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepPrim_Builder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepPrim_Builder(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepPrim_Builder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepPrim_Builder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an empty, useless  Builder. Necesseray for
   *  compilation.
   */
  public BRepPrim_Builder() {
    this(OCCwrapJavaJNI.new_BRepPrim_Builder__SWIG_0(), true);
  }

  /**
   *  Creates from a Builder.
   */
  public BRepPrim_Builder( BRep_Builder  B) {
    this(OCCwrapJavaJNI.new_BRepPrim_Builder__SWIG_1(BRep_Builder.getCPtr(B), B), true);
  }

  public  BRep_Builder  Builder() {
    BRep_Builder ret = new BRep_Builder(OCCwrapJavaJNI.BRepPrim_Builder_Builder(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Make a empty Shell.
   */
  public void MakeShell(TopoDS_Shell S) {
    OCCwrapJavaJNI.BRepPrim_Builder_MakeShell(swigCPtr, this, TopoDS_Shell.getCPtr(S), S);
  }

  /**
   *  Returns in   <F> a  Face  built  with   the  plane
   *  equation <P>. Used by all primitives.
   */
  public void MakeFace(TopoDS_Face F,  gp_Pln  P) {
    OCCwrapJavaJNI.BRepPrim_Builder_MakeFace(swigCPtr, this, TopoDS_Face.getCPtr(F), F, gp_Pln.getCPtr(P), P);
  }

  /**
   *  Returns in <W> an empty Wire.
   */
  public void MakeWire(TopoDS_Wire W) {
    OCCwrapJavaJNI.BRepPrim_Builder_MakeWire(swigCPtr, this, TopoDS_Wire.getCPtr(W), W);
  }

  /**
   *  Returns in <E> a degenerated edge.
   */
  public void MakeDegeneratedEdge(TopoDS_Edge E) {
    OCCwrapJavaJNI.BRepPrim_Builder_MakeDegeneratedEdge(swigCPtr, this, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Returns   in <E>  an  Edge  built  with  the  line
   *  equation  <L>.
   */
  public void MakeEdge(TopoDS_Edge E,  gp_Lin  L) {
    OCCwrapJavaJNI.BRepPrim_Builder_MakeEdge__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, gp_Lin.getCPtr(L), L);
  }

  /**
   *  Returns  in <E>   an  Edge  built  with the circle
   *  equation  <C>.
   */
  public void MakeEdge(TopoDS_Edge E,  gp_Circ  C) {
    OCCwrapJavaJNI.BRepPrim_Builder_MakeEdge__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, gp_Circ.getCPtr(C), C);
  }

  /**
   *  Sets the line <L> to be the curve representing the
   *  edge <E> in the parametric space of the surface of
   *  <F>.
   */
  public void SetPCurve(TopoDS_Edge E,  TopoDS_Face  F,  gp_Lin2d  L) {
    OCCwrapJavaJNI.BRepPrim_Builder_SetPCurve__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F, gp_Lin2d.getCPtr(L), L);
  }

  /**
   *  Sets the    lines  <L1,L2>  to   be     the curves
   *  representing the edge <E>  in the parametric space
   *  of the closed surface of <F>.
   */
  public void SetPCurve(TopoDS_Edge E,  TopoDS_Face  F,  gp_Lin2d  L1,  gp_Lin2d  L2) {
    OCCwrapJavaJNI.BRepPrim_Builder_SetPCurve__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F, gp_Lin2d.getCPtr(L1), L1, gp_Lin2d.getCPtr(L2), L2);
  }

  /**
   *  Sets the  circle <C> to  be the curve representing
   *  the  edge <E>  in   the  parametric  space of  the
   *  surface of <F>.
   */
  public void SetPCurve(TopoDS_Edge E,  TopoDS_Face  F,  gp_Circ2d  C) {
    OCCwrapJavaJNI.BRepPrim_Builder_SetPCurve__SWIG_2(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F, gp_Circ2d.getCPtr(C), C);
  }

  /**
   *  Returns in <V> a Vertex built with the point <P>.
   */
  public void MakeVertex(TopoDS_Vertex V,  gp_Pnt  P) {
    OCCwrapJavaJNI.BRepPrim_Builder_MakeVertex(swigCPtr, this, TopoDS_Vertex.getCPtr(V), V, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Reverses the Face <F>.
   */
  public void ReverseFace(TopoDS_Face F) {
    OCCwrapJavaJNI.BRepPrim_Builder_ReverseFace(swigCPtr, this, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Adds the Vertex <V> in the Edge <E>.  <P> is the
   *  parameter of the vertex on the  edge.  If direct
   *  is False the Vertex is reversed.
   */
  public void AddEdgeVertex(TopoDS_Edge E,  TopoDS_Vertex  V, double P, long direct) {
    OCCwrapJavaJNI.BRepPrim_Builder_AddEdgeVertex__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, TopoDS_Vertex.getCPtr(V), V, P, direct);
  }

  /**
   *  Adds  the Vertex <V>  in the Edge <E>.   <P1,P2>
   *  are the  parameters of the  vertex on the closed
   *  edge.
   */
  public void AddEdgeVertex(TopoDS_Edge E,  TopoDS_Vertex  V, double P1, double P2) {
    OCCwrapJavaJNI.BRepPrim_Builder_AddEdgeVertex__SWIG_1(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, TopoDS_Vertex.getCPtr(V), V, P1, P2);
  }

  /**
   *  <P1,P2> are the parameters of the  vertex on the
   *  edge.  The edge is a closed curve.
   */
  public void SetParameters(TopoDS_Edge E,  TopoDS_Vertex  V, double P1, double P2) {
    OCCwrapJavaJNI.BRepPrim_Builder_SetParameters(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, TopoDS_Vertex.getCPtr(V), V, P1, P2);
  }

  /**
   *  Adds the Edge <E> in the  Wire <W>, if direct is
   *  False the Edge is reversed.
   */
  public void AddWireEdge(TopoDS_Wire W,  TopoDS_Edge  E, long direct) {
    OCCwrapJavaJNI.BRepPrim_Builder_AddWireEdge(swigCPtr, this, TopoDS_Wire.getCPtr(W), W, TopoDS_Edge.getCPtr(E), E, direct);
  }

  /**
   *  Adds the Wire <W> in  the Face <F>.
   */
  public void AddFaceWire(TopoDS_Face F,  TopoDS_Wire  W) {
    OCCwrapJavaJNI.BRepPrim_Builder_AddFaceWire(swigCPtr, this, TopoDS_Face.getCPtr(F), F, TopoDS_Wire.getCPtr(W), W);
  }

  /**
   *  Adds the Face <F>  in the Shell <Sh>.
   */
  public void AddShellFace(TopoDS_Shell Sh,  TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepPrim_Builder_AddShellFace(swigCPtr, this, TopoDS_Shell.getCPtr(Sh), Sh, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  This is called once an edge is completed. It gives
   *  the opportunity to perform any post treatment.
   */
  public void CompleteEdge(TopoDS_Edge E) {
    OCCwrapJavaJNI.BRepPrim_Builder_CompleteEdge(swigCPtr, this, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  This is called once a wire is  completed. It gives
   *  the opportunity to perform any post treatment.
   */
  public void CompleteWire(TopoDS_Wire W) {
    OCCwrapJavaJNI.BRepPrim_Builder_CompleteWire(swigCPtr, this, TopoDS_Wire.getCPtr(W), W);
  }

  /**
   *  This is called once a face is  completed. It gives
   *  the opportunity to perform any post treatment.
   */
  public void CompleteFace(TopoDS_Face F) {
    OCCwrapJavaJNI.BRepPrim_Builder_CompleteFace(swigCPtr, this, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  This is called once a shell is  completed. It gives
   *  the opportunity to perform any post treatment.
   */
  public void CompleteShell(TopoDS_Shell S) {
    OCCwrapJavaJNI.BRepPrim_Builder_CompleteShell(swigCPtr, this, TopoDS_Shell.getCPtr(S), S);
  }

}
