package opencascade;

/**
 *  A  Builder is used   to  create  Topological  Data
 *  Structures.It is the root of the Builder class hierarchy.
 * 
 *  There are three groups of methods in the Builder :
 * 
 *  The Make methods create Shapes.
 * 
 *  The Add method includes a Shape in another Shape.
 * 
 *  The Remove  method  removes a  Shape from an other
 *  Shape.
 * 
 *  The methods in Builder are not static. They can be
 *  redefined in inherited builders.
 * 
 *  This   Builder does not  provide   methods to Make
 *  Vertices,  Edges, Faces,  Shells  or Solids. These
 *  methods are  provided  in  the inherited  Builders
 *  as they must provide the geometry.
 * 
 *  The Add method check for the following rules :
 * 
 *  - Any SHAPE can be added in a COMPOUND.
 * 
 *  - Only SOLID can be added in a COMPSOLID.
 * 
 *  - Only SHELL, EDGE and VERTEX can be added in a SOLID.
 *  EDGE and VERTEX as to be INTERNAL or EXTERNAL.
 * 
 *  - Only FACE can be added in a SHELL.
 * 
 *  - Only WIRE and VERTEX can be added in a FACE.
 *  VERTEX as to be INTERNAL or EXTERNAL.
 * 
 *  - Only EDGE can be added in a WIRE.
 * 
 *  - Only VERTEX can be added in an EDGE.
 * 
 *  - Nothing can be added in a VERTEX.
 */
public class TopoDS_Builder {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  TopoDS_Builder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  TopoDS_Builder(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(TopoDS_Builder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_TopoDS_Builder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Make an empty Wire.
   */
  public void MakeWire(TopoDS_Wire W) {
    OCCwrapJavaJNI.TopoDS_Builder_MakeWire(swigCPtr, this, TopoDS_Wire.getCPtr(W), W);
  }

  /**
   *  Make an empty Shell.
   */
  public void MakeShell(TopoDS_Shell S) {
    OCCwrapJavaJNI.TopoDS_Builder_MakeShell(swigCPtr, this, TopoDS_Shell.getCPtr(S), S);
  }

  /**
   *  Make a Solid covering the whole 3D space.
   */
  public void MakeSolid(TopoDS_Solid S) {
    OCCwrapJavaJNI.TopoDS_Builder_MakeSolid(swigCPtr, this, TopoDS_Solid.getCPtr(S), S);
  }

  /**
   *  Make an empty Composite Solid.
   */
  public void MakeCompSolid(TopoDS_CompSolid C) {
    OCCwrapJavaJNI.TopoDS_Builder_MakeCompSolid(swigCPtr, this, TopoDS_CompSolid.getCPtr(C), C);
  }

  /**
   *  Make an empty Compound.
   */
  public void MakeCompound(TopoDS_Compound C) {
    OCCwrapJavaJNI.TopoDS_Builder_MakeCompound(swigCPtr, this, TopoDS_Compound.getCPtr(C), C);
  }

  /**
   *  Add the Shape C in the Shape S.
   *  Exceptions
   *  - TopoDS_FrozenShape if S is not free and cannot be modified.
   *  - TopoDS__UnCompatibleShapes if S and C are not compatible.
   */
  public void Add(TopoDS_Shape S,  TopoDS_Shape  C) {
    OCCwrapJavaJNI.TopoDS_Builder_Add(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, TopoDS_Shape.getCPtr(C), C);
  }

  /**
   *  Remove the Shape C from the Shape S.
   *  Exceptions
   *  TopoDS_FrozenShape if S is frozen and cannot be modified.
   */
  public void Remove(TopoDS_Shape S,  TopoDS_Shape  C) {
    OCCwrapJavaJNI.TopoDS_Builder_Remove(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, TopoDS_Shape.getCPtr(C), C);
  }

  public TopoDS_Builder() {
    this(OCCwrapJavaJNI.new_TopoDS_Builder(), true);
  }

}
