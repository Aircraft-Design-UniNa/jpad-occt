package opencascade;

/**
 *  The abstract class MakeOneAxis is the root class of
 *  algorithms used to construct rotational primitives.
 */
public class BRepPrimAPI_MakeOneAxis extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepPrimAPI_MakeOneAxis(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeOneAxis_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepPrimAPI_MakeOneAxis(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeOneAxis_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepPrimAPI_MakeOneAxis obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepPrimAPI_MakeOneAxis(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  The inherited commands should provide the algorithm.
   *  Returned as a pointer.
   */
  public  long  OneAxis() { return OCCwrapJavaJNI.BRepPrimAPI_MakeOneAxis_OneAxis(swigCPtr, this); }

  /**
   *  Returns the lateral face of the rotational primitive.
   */
  public  TopoDS_Face  Face() {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.BRepPrimAPI_MakeOneAxis_Face(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the constructed rotational primitive as a shell.
   */
  public  TopoDS_Shell  Shell() {
    TopoDS_Shell ret = new TopoDS_Shell(OCCwrapJavaJNI.BRepPrimAPI_MakeOneAxis_Shell(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the constructed rotational primitive as a solid.
   */
  public  TopoDS_Solid  Solid() {
    TopoDS_Solid ret = new TopoDS_Solid(OCCwrapJavaJNI.BRepPrimAPI_MakeOneAxis_Solid(swigCPtr, this), true);
    return ret;
  }

}
