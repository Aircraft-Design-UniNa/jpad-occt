package opencascade;

/**
 *  Describes functions to build BRepBuilder vertices directly
 *  from 3D geometric points. A vertex built using a
 *  MakeVertex object is only composed of a 3D point and
 *  a default precision value (Precision::Confusion()).
 *  Later on, 2D representations can be added, for example,
 *  when inserting a vertex in an edge.
 *  A MakeVertex object provides a framework for:
 *  -   defining and implementing the construction of a vertex, and
 *  -   consulting the result.
 */
public class BRepBuilderAPI_MakeVertex extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepBuilderAPI_MakeVertex(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_MakeVertex_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepBuilderAPI_MakeVertex(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_MakeVertex_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepBuilderAPI_MakeVertex obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepBuilderAPI_MakeVertex(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Constructs a vertex from point P.
   *  Example create a vertex from a 3D point.
   *  gp_Pnt P(0,0,10);
   *  TopoDS_Vertex V = BRepBuilderAPI_MakeVertex(P);
   */
  public BRepBuilderAPI_MakeVertex( gp_Pnt  P) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeVertex(gp_Pnt.getCPtr(P), P), true);
  }

  /**
   *  Returns the constructed vertex.
   */
  public  TopoDS_Vertex  Vertex() {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.BRepBuilderAPI_MakeVertex_Vertex(swigCPtr, this), true);
    return ret;
  }

}
