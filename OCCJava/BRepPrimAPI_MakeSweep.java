package opencascade;

/**
 *  The abstract class MakeSweep is
 *  the root class of swept primitives.
 *  Sweeps are objects you obtain by sweeping a profile along a path.
 *  The profile can be any topology and the path is usually a curve or
 *  a wire. The profile generates objects according to the following rules:
 *  -      Vertices generate Edges
 *  -      Edges generate Faces.
 *  -      Wires generate Shells.
 *  -      Faces generate Solids.
 *  -      Shells generate Composite  Solids.
 *  You are not allowed to sweep Solids and Composite Solids.
 *  Two kinds of sweeps are implemented in the BRepPrimAPI package:
 *  -      The linear sweep called a   Prism
 *  -      The rotational sweep    called a Revol
 *  Swept constructions along complex profiles such as BSpline curves
 *  are also available in the BRepOffsetAPI package..
 */
public class BRepPrimAPI_MakeSweep extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepPrimAPI_MakeSweep(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeSweep_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepPrimAPI_MakeSweep(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeSweep_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepPrimAPI_MakeSweep obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepPrimAPI_MakeSweep(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Returns the  TopoDS  Shape of the bottom of the sweep.
   */
  public TopoDS_Shape FirstShape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepPrimAPI_MakeSweep_FirstShape(swigCPtr, this), true);
  }

  /**
   *  Returns the TopoDS Shape of the top of the sweep.
   */
  public TopoDS_Shape LastShape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepPrimAPI_MakeSweep_LastShape(swigCPtr, this), true);
  }

}
