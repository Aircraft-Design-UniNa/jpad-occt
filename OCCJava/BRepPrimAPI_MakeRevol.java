package opencascade;

/**
 *  Class to make revolved sweep topologies.
 * 
 *  a revolved sweep is defined by :
 * 
 *  * A basis topology which is swept.
 * 
 *  The   basis topology  must   not  contain solids
 *  (neither composite solids.).
 * 
 *  The basis topology  may be copied  or  shared in
 *  the result.
 * 
 *  * A rotation axis and angle :
 * 
 *  - The axis is an Ax1 from gp.
 * 
 *  - The angle is in [0, 2*Pi].
 * 
 *  - The angle default value is 2*Pi.
 * 
 *  The result is a topology with a higher dimension :
 * 
 *  - Vertex -> Edge.
 *  - Edge   -> Face.
 *  - Wire   -> Shell.
 *  - Face   -> Solid.
 *  - Shell  -> CompSolid.
 * 
 *  Sweeping a Compound sweeps  the elements  of the
 *  compound  and creates    a  compound with    the
 *  results.
 */
public class BRepPrimAPI_MakeRevol extends BRepPrimAPI_MakeSweep {

  private long swigCPtr;
  BRepPrimAPI_MakeRevol(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeRevol_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepPrimAPI_MakeRevol(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakeRevol_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepPrimAPI_MakeRevol obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepPrimAPI_MakeRevol(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Builds the Revol of base S, axis  A and angle  D. If C
   *  is true, S is copied.
   */
  public BRepPrimAPI_MakeRevol( TopoDS_Shape  S,  gp_Ax1  A, double D, long Copy) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeRevol__SWIG_0(TopoDS_Shape.getCPtr(S), S, gp_Ax1.getCPtr(A), A, D, Copy), true);
  }

  /**
   *  Builds the Revol of base S, axis  A and angle 2*Pi. If
   *  C is true, S is copied.
   */
  public BRepPrimAPI_MakeRevol( TopoDS_Shape  S,  gp_Ax1  A, double D) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeRevol__SWIG_1(TopoDS_Shape.getCPtr(S), S, gp_Ax1.getCPtr(A), A, D), true);
  }

  public BRepPrimAPI_MakeRevol( TopoDS_Shape  S,  gp_Ax1  A, long Copy) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeRevol__SWIG_2(TopoDS_Shape.getCPtr(S), S, gp_Ax1.getCPtr(A), A, Copy), true);
  }

  public BRepPrimAPI_MakeRevol( TopoDS_Shape  S,  gp_Ax1  A) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakeRevol__SWIG_3(TopoDS_Shape.getCPtr(S), S, gp_Ax1.getCPtr(A), A), true);
  }

  /**
   *  Returns the internal sweeping algorithm.
   */
  public  BRepSweep_Revol  Revol() {
    BRepSweep_Revol ret = new BRepSweep_Revol(OCCwrapJavaJNI.BRepPrimAPI_MakeRevol_Revol(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the first shape of the revol  (coinciding with
   *  the generating shape).
   */
  public TopoDS_Shape FirstShape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepPrimAPI_MakeRevol_FirstShape__SWIG_0(swigCPtr, this), true);
  }

  /**
   *  Returns the TopoDS Shape of the end of the revol.
   */
  public TopoDS_Shape LastShape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepPrimAPI_MakeRevol_LastShape__SWIG_0(swigCPtr, this), true);
  }

  /**
   *  Returns the TopoDS Shape of the beginning of the revolution,
   *  generated with theShape  (subShape of the generating shape).
   */
  public TopoDS_Shape FirstShape( TopoDS_Shape  theShape) {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepPrimAPI_MakeRevol_FirstShape__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(theShape), theShape), true);
  }

  /**
   *  Returns the TopoDS Shape of the end of the revolution,
   *  generated with  theShape (subShape of the  generating shape).
   */
  public TopoDS_Shape LastShape( TopoDS_Shape  theShape) {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepPrimAPI_MakeRevol_LastShape__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(theShape), theShape), true);
  }

  /**
   *  Check if there are degenerated edges in the result.
   */
  public long HasDegenerated() {
    return OCCwrapJavaJNI.BRepPrimAPI_MakeRevol_HasDegenerated(swigCPtr, this);
  }

  public  TopTools_ListOfShape  Degenerated() {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BRepPrimAPI_MakeRevol_Degenerated(swigCPtr, this), false, this);
    return ret;
  }

}
