package opencascade;

/**
 *  Construction of fillets on the edges of a Shell.
 */
public class BRepFilletAPI_LocalOperation extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepFilletAPI_LocalOperation(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepFilletAPI_LocalOperation_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepFilletAPI_LocalOperation(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepFilletAPI_LocalOperation_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepFilletAPI_LocalOperation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepFilletAPI_LocalOperation(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Adds a  contour in  the  builder  (builds a
   *  contour  of tangent edges).
   */
  public void Add( TopoDS_Edge  E) {
    OCCwrapJavaJNI.BRepFilletAPI_LocalOperation_Add(swigCPtr, this, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Reset the contour of index IC, there is nomore
   *  information in the contour.
   */
  public void ResetContour(int IC) {
    OCCwrapJavaJNI.BRepFilletAPI_LocalOperation_ResetContour(swigCPtr, this, IC);
  }

  /**
   *  Number of contours.
   */
  public int NbContours() {
    return OCCwrapJavaJNI.BRepFilletAPI_LocalOperation_NbContours(swigCPtr, this);
  }

  /**
   *  Returns the index of  the  contour containing the edge
   *  E, returns 0 if E doesn't belong to any contour.
   */
  public int Contour( TopoDS_Edge  E) {
    return OCCwrapJavaJNI.BRepFilletAPI_LocalOperation_Contour(swigCPtr, this, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Number of Edges in the contour I.
   */
  public int NbEdges(int I) {
    return OCCwrapJavaJNI.BRepFilletAPI_LocalOperation_NbEdges(swigCPtr, this, I);
  }

  /**
   *  Returns the Edge J in the contour I.
   */
  public  TopoDS_Edge  Edge(int I, int J) {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepFilletAPI_LocalOperation_Edge(swigCPtr, this, I, J), true);
    return ret;
  }

  /**
   *  remove the contour containing the Edge E.
   */
  public void Remove( TopoDS_Edge  E) {
    OCCwrapJavaJNI.BRepFilletAPI_LocalOperation_Remove(swigCPtr, this, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  returns the length the contour of index IC.
   */
  public double Length(int IC) {
    return OCCwrapJavaJNI.BRepFilletAPI_LocalOperation_Length(swigCPtr, this, IC);
  }

  /**
   *  Returns the first Vertex of the contour of index IC.
   */
  public TopoDS_Vertex FirstVertex(int IC) {
    return new TopoDS_Vertex(OCCwrapJavaJNI.BRepFilletAPI_LocalOperation_FirstVertex(swigCPtr, this, IC), true);
  }

  /**
   *  Returns the last Vertex of the contour of index IC.
   */
  public TopoDS_Vertex LastVertex(int IC) {
    return new TopoDS_Vertex(OCCwrapJavaJNI.BRepFilletAPI_LocalOperation_LastVertex(swigCPtr, this, IC), true);
  }

  /**
   *  returns the abscissa of the vertex V on
   *  the contour of index IC.
   */
  public double Abscissa(int IC,  TopoDS_Vertex  V) {
    return OCCwrapJavaJNI.BRepFilletAPI_LocalOperation_Abscissa(swigCPtr, this, IC, TopoDS_Vertex.getCPtr(V), V);
  }

  /**
   *  returns the relative abscissa([0.,1.]) of the
   *  vertex V on the contour of index IC.
   */
  public double RelativeAbscissa(int IC,  TopoDS_Vertex  V) {
    return OCCwrapJavaJNI.BRepFilletAPI_LocalOperation_RelativeAbscissa(swigCPtr, this, IC, TopoDS_Vertex.getCPtr(V), V);
  }

  /**
   *  returns true if the contour of index IC is closed
   *  an tangent.
   */
  public long ClosedAndTangent(int IC) {
    return OCCwrapJavaJNI.BRepFilletAPI_LocalOperation_ClosedAndTangent(swigCPtr, this, IC);
  }

  /**
   *  returns true if the contour of index IC is closed
   */
  public long Closed(int IC) {
    return OCCwrapJavaJNI.BRepFilletAPI_LocalOperation_Closed(swigCPtr, this, IC);
  }

  /**
   *  Reset all the fields updated   by Build operation  and
   *  leave the  algorithm in  the  same state  than  before
   *  build    call.  It   allows   contours    and   radius
   *  modifications  to build the result another time.
   */
  public void Reset() {
    OCCwrapJavaJNI.BRepFilletAPI_LocalOperation_Reset(swigCPtr, this);
  }

  public void Simulate(int IC) {
    OCCwrapJavaJNI.BRepFilletAPI_LocalOperation_Simulate(swigCPtr, this, IC);
  }

  public int NbSurf(int IC) {
    return OCCwrapJavaJNI.BRepFilletAPI_LocalOperation_NbSurf(swigCPtr, this, IC);
  }

}
