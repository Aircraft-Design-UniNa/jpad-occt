package opencascade;

/**
 *  Provides natural constructors to build BRepSweep
 *  rotated swept Primitives.
 */
public class BRepSweep_Revol {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepSweep_Revol(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepSweep_Revol(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepSweep_Revol obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepSweep_Revol(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Builds the Revol of meridian S axis A  and angle D. If
   *  C is true S is copied.
   */
  public BRepSweep_Revol( TopoDS_Shape  S,  gp_Ax1  A, double D, long C) {
    this(OCCwrapJavaJNI.new_BRepSweep_Revol__SWIG_0(TopoDS_Shape.getCPtr(S), S, gp_Ax1.getCPtr(A), A, D, C), true);
  }

  /**
   *  Builds the Revol of meridian S  axis A and angle 2*Pi.
   *  If C is true S is copied.
   */
  public BRepSweep_Revol( TopoDS_Shape  S,  gp_Ax1  A, double D) {
    this(OCCwrapJavaJNI.new_BRepSweep_Revol__SWIG_1(TopoDS_Shape.getCPtr(S), S, gp_Ax1.getCPtr(A), A, D), true);
  }

  public BRepSweep_Revol( TopoDS_Shape  S,  gp_Ax1  A, long C) {
    this(OCCwrapJavaJNI.new_BRepSweep_Revol__SWIG_2(TopoDS_Shape.getCPtr(S), S, gp_Ax1.getCPtr(A), A, C), true);
  }

  public BRepSweep_Revol( TopoDS_Shape  S,  gp_Ax1  A) {
    this(OCCwrapJavaJNI.new_BRepSweep_Revol__SWIG_3(TopoDS_Shape.getCPtr(S), S, gp_Ax1.getCPtr(A), A), true);
  }

  /**
   *  Returns the TopoDS Shape attached to the Revol.
   */
  public TopoDS_Shape Shape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepSweep_Revol_Shape__SWIG_0(swigCPtr, this), true);
  }

  /**
   *  Returns    the  TopoDS  Shape   generated  with  aGenS
   *  (subShape  of the generating shape).
   */
  public TopoDS_Shape Shape( TopoDS_Shape  aGenS) {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepSweep_Revol_Shape__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(aGenS), aGenS), true);
  }

  /**
   *  Returns the first shape of the revol  (coinciding with
   *  the generating shape).
   */
  public TopoDS_Shape FirstShape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepSweep_Revol_FirstShape__SWIG_0(swigCPtr, this), true);
  }

  /**
   *  Returns the first shape of the revol  (coinciding with
   *  the generating shape).
   */
  public TopoDS_Shape FirstShape( TopoDS_Shape  aGenS) {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepSweep_Revol_FirstShape__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(aGenS), aGenS), true);
  }

  /**
   *  Returns the TopoDS Shape of the top of the prism.
   */
  public TopoDS_Shape LastShape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepSweep_Revol_LastShape__SWIG_0(swigCPtr, this), true);
  }

  /**
   *  Returns the  TopoDS  Shape of the top  of  the  prism.
   *  generated  with  aGenS  (subShape  of  the  generating
   *  shape).
   */
  public TopoDS_Shape LastShape( TopoDS_Shape  aGenS) {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepSweep_Revol_LastShape__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(aGenS), aGenS), true);
  }

  /**
   *  returns the axis
   */
  public gp_Ax1 Axe() {
    return new gp_Ax1(OCCwrapJavaJNI.BRepSweep_Revol_Axe(swigCPtr, this), true);
  }

  /**
   *  returns the angle.
   */
  public double Angle() {
    return OCCwrapJavaJNI.BRepSweep_Revol_Angle(swigCPtr, this);
  }

}
