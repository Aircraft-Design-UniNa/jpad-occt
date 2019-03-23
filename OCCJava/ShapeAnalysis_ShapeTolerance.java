package opencascade;

/**
 *  Tool for computing shape tolerances (minimal, maximal, average),
 *  finding shape with tolerance matching given criteria,
 *  setting or limitating tolerances.
 */
public class ShapeAnalysis_ShapeTolerance {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeAnalysis_ShapeTolerance(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeAnalysis_ShapeTolerance(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeAnalysis_ShapeTolerance obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeAnalysis_ShapeTolerance(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor
   */
  public ShapeAnalysis_ShapeTolerance() {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_ShapeTolerance(), true);
  }

  /**
   *  Determines a tolerance from the ones stored in a shape
   *  Remark : calls InitTolerance and AddTolerance,
   *  hence, can be used to start a series for cumulating tolerance
   *  <mode> = 0 : returns the average value between sub-shapes,
   *  <mode> > 0 : returns the maximal found,
   *  <mode> < 0 : returns the minimal found.
   *  <type> defines what kinds of sub-shapes to consider:
   *  SHAPE (default) : all : VERTEX, EDGE, FACE,
   *  VERTEX : only vertices,
   *  EDGE   : only edges,
   *  FACE   : only faces,
   *  SHELL  : combined SHELL + FACE, for each face (and containing
   *  shell), also checks EDGE and VERTEX
   */
  public double Tolerance( TopoDS_Shape  shape, int mode, TopAbs_ShapeEnum type) {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeTolerance_Tolerance__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, mode, type.swigValue());
  }

  public double Tolerance( TopoDS_Shape  shape, int mode) {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeTolerance_Tolerance__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, mode);
  }

  public  TopTools_HSequenceOfShape  OverTolerance( TopoDS_Shape  shape, double value, TopAbs_ShapeEnum type) {
    return new TopTools_HSequenceOfShape ( OCCwrapJavaJNI.ShapeAnalysis_ShapeTolerance_OverTolerance__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, value, type.swigValue()), true );
  }

  public  TopTools_HSequenceOfShape  OverTolerance( TopoDS_Shape  shape, double value) {
    return new TopTools_HSequenceOfShape ( OCCwrapJavaJNI.ShapeAnalysis_ShapeTolerance_OverTolerance__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, value), true );
  }

  public  TopTools_HSequenceOfShape  InTolerance( TopoDS_Shape  shape, double valmin, double valmax, TopAbs_ShapeEnum type) {
    return new TopTools_HSequenceOfShape ( OCCwrapJavaJNI.ShapeAnalysis_ShapeTolerance_InTolerance__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, valmin, valmax, type.swigValue()), true );
  }

  public  TopTools_HSequenceOfShape  InTolerance( TopoDS_Shape  shape, double valmin, double valmax) {
    return new TopTools_HSequenceOfShape ( OCCwrapJavaJNI.ShapeAnalysis_ShapeTolerance_InTolerance__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, valmin, valmax), true );
  }

  /**
   *  Initializes computation of cumulated tolerance
   */
  public void InitTolerance() {
    OCCwrapJavaJNI.ShapeAnalysis_ShapeTolerance_InitTolerance(swigCPtr, this);
  }

  /**
   *  Adds data on new Shape to compute Cumulated Tolerance
   *  (prepares three computations : maximal, average, minimal)
   */
  public void AddTolerance( TopoDS_Shape  shape, TopAbs_ShapeEnum type) {
    OCCwrapJavaJNI.ShapeAnalysis_ShapeTolerance_AddTolerance__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, type.swigValue());
  }

  public void AddTolerance( TopoDS_Shape  shape) {
    OCCwrapJavaJNI.ShapeAnalysis_ShapeTolerance_AddTolerance__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape);
  }

  /**
   *  Returns the computed tolerance according to the <mode>
   *  <mode> = 0 : average
   *  <mode> > 0 : maximal
   *  <mode> < 0 : minimal
   */
  public double GlobalTolerance(int mode) {
    return OCCwrapJavaJNI.ShapeAnalysis_ShapeTolerance_GlobalTolerance(swigCPtr, this, mode);
  }

}
