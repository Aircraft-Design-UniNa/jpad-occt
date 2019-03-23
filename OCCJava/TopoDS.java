package opencascade;

/**
 *  Provides methods to cast objects of class
 *  TopoDS_Shape to be onjects of more specialized
 *  sub-classes. Types are verified, thus in the example
 *  below, the first two blocks are correct but the third is
 *  rejected by the compiler.
 */
public class TopoDS {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TopoDS(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TopoDS(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TopoDS obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopoDS(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static TopoDS_Vertex ToVertex( TopoDS_Shape  theShape) {
    return new TopoDS_Vertex(OCCwrapJavaJNI.TopoDS_ToVertex(TopoDS_Shape.getCPtr(theShape), theShape), true);
  }

  public static TopoDS_Edge ToEdge( TopoDS_Shape  theShape) {
    return new TopoDS_Edge(OCCwrapJavaJNI.TopoDS_ToEdge(TopoDS_Shape.getCPtr(theShape), theShape), true);
  }

  public static TopoDS_Wire ToWire( TopoDS_Shape  theShape) {
    return new TopoDS_Wire(OCCwrapJavaJNI.TopoDS_ToWire(TopoDS_Shape.getCPtr(theShape), theShape), true);
  }

  public static TopoDS_Face ToFace( TopoDS_Shape  theShape) {
    return new TopoDS_Face(OCCwrapJavaJNI.TopoDS_ToFace(TopoDS_Shape.getCPtr(theShape), theShape), true);
  }

  public static TopoDS_Shell ToShell( TopoDS_Shape  theShape) {
    return new TopoDS_Shell(OCCwrapJavaJNI.TopoDS_ToShell(TopoDS_Shape.getCPtr(theShape), theShape), true);
  }

  public static TopoDS_Solid ToSolid( TopoDS_Shape  theShape) {
    return new TopoDS_Solid(OCCwrapJavaJNI.TopoDS_ToSolid(TopoDS_Shape.getCPtr(theShape), theShape), true);
  }

  public static TopoDS_CompSolid ToCompSolid( TopoDS_Shape  theShape) {
    return new TopoDS_CompSolid(OCCwrapJavaJNI.TopoDS_ToCompSolid(TopoDS_Shape.getCPtr(theShape), theShape), true);
  }

  public static TopoDS_Compound ToCompound( TopoDS_Shape  theShape) {
    return new TopoDS_Compound(OCCwrapJavaJNI.TopoDS_ToCompound(TopoDS_Shape.getCPtr(theShape), theShape), true);
  }

  public TopoDS() {
    this(OCCwrapJavaJNI.new_TopoDS(), true);
  }

}
