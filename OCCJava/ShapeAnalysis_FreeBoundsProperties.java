package opencascade;

/**
 *  This class is intended to calculate shape free bounds
 *  properties.
 *  This class provides the following functionalities:
 *  - calculates area of the contour,
 *  - calculates perimeter of the contour,
 *  - calculates ratio of average length to average width of the
 *  contour,
 *  - estimates average width of contour,
 *  - finds the notches (narrow 'V'-like sub-contour) on the
 *  contour.
 * 
 *  For getting free bounds this class uses
 *  ShapeAnalysis_FreeBounds class.
 * 
 *  For description of parameters used for initializing this
 *  class refer to CDL of ShapeAnalysis_FreeBounds.
 * 
 *  Properties of each contour are stored in the data structure
 *  ShapeAnalysis_FreeBoundData.
 */
public class ShapeAnalysis_FreeBoundsProperties {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeAnalysis_FreeBoundsProperties(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeAnalysis_FreeBoundsProperties(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeAnalysis_FreeBoundsProperties obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeAnalysis_FreeBoundsProperties(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty constructor
   */
  public ShapeAnalysis_FreeBoundsProperties() {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_FreeBoundsProperties__SWIG_0(), true);
  }

  /**
   *  Creates the object and calls corresponding Init.
   *  <shape> should be a compound of faces.
   */
  public ShapeAnalysis_FreeBoundsProperties( TopoDS_Shape  shape, double tolerance, long splitclosed, long splitopen) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_FreeBoundsProperties__SWIG_1(TopoDS_Shape.getCPtr(shape), shape, tolerance, splitclosed, splitopen), true);
  }

  /**
   *  Creates the object and calls corresponding Init.
   *  <shape> should be a compound of shells.
   */
  public ShapeAnalysis_FreeBoundsProperties( TopoDS_Shape  shape, double tolerance, long splitclosed) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_FreeBoundsProperties__SWIG_2(TopoDS_Shape.getCPtr(shape), shape, tolerance, splitclosed), true);
  }

  public ShapeAnalysis_FreeBoundsProperties( TopoDS_Shape  shape, double tolerance) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_FreeBoundsProperties__SWIG_3(TopoDS_Shape.getCPtr(shape), shape, tolerance), true);
  }

  public ShapeAnalysis_FreeBoundsProperties( TopoDS_Shape  shape, long splitclosed, long splitopen) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_FreeBoundsProperties__SWIG_4(TopoDS_Shape.getCPtr(shape), shape, splitclosed, splitopen), true);
  }

  public ShapeAnalysis_FreeBoundsProperties( TopoDS_Shape  shape, long splitclosed) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_FreeBoundsProperties__SWIG_5(TopoDS_Shape.getCPtr(shape), shape, splitclosed), true);
  }

  public ShapeAnalysis_FreeBoundsProperties( TopoDS_Shape  shape) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_FreeBoundsProperties__SWIG_6(TopoDS_Shape.getCPtr(shape), shape), true);
  }

  /**
   *  Initializes the object with given parameters.
   *  <shape> should be a compound of faces.
   */
  public void Init( TopoDS_Shape  shape, double tolerance, long splitclosed, long splitopen) {
    OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_Init__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, tolerance, splitclosed, splitopen);
  }

  /**
   *  Initializes the object with given parameters.
   *  <shape> should be a compound of shells.
   */
  public void Init( TopoDS_Shape  shape, double tolerance, long splitclosed) {
    OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_Init__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, tolerance, splitclosed);
  }

  public void Init( TopoDS_Shape  shape, double tolerance) {
    OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_Init__SWIG_2(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, tolerance);
  }

  public void Init( TopoDS_Shape  shape, long splitclosed, long splitopen) {
    OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_Init__SWIG_3(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, splitclosed, splitopen);
  }

  public void Init( TopoDS_Shape  shape, long splitclosed) {
    OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_Init__SWIG_4(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, splitclosed);
  }

  public void Init( TopoDS_Shape  shape) {
    OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_Init__SWIG_5(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape);
  }

  /**
   *  Builds and analyzes free bounds of the shape.
   *  First calls ShapeAnalysis_FreeBounds for building free
   *  bounds.
   *  Then on each free bound computes its properties:
   *  - area of the contour,
   *  - perimeter of the contour,
   *  - ratio of average length to average width of the contour,
   *  - average width of contour,
   *  - notches on the contour and for each notch
   *  - maximum width of the notch.
   */
  public long Perform() {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_Perform(swigCPtr, this);
  }

  /**
   *  Returns True if shape is loaded
   */
  public long IsLoaded() {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_IsLoaded(swigCPtr, this);
  }

  /**
   *  Returns shape
   */
  public TopoDS_Shape Shape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_Shape(swigCPtr, this), true);
  }

  /**
   *  Returns tolerance
   */
  public double Tolerance() {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_Tolerance(swigCPtr, this);
  }

  /**
   *  Returns number of free bounds
   */
  public int NbFreeBounds() {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_NbFreeBounds(swigCPtr, this);
  }

  /**
   *  Returns number of closed free bounds
   */
  public int NbClosedFreeBounds() {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_NbClosedFreeBounds(swigCPtr, this);
  }

  /**
   *  Returns number of open free bounds
   */
  public int NbOpenFreeBounds() {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_NbOpenFreeBounds(swigCPtr, this);
  }

  public  ShapeAnalysis_HSequenceOfFreeBounds  ClosedFreeBounds() {
    return new ShapeAnalysis_HSequenceOfFreeBounds ( OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_ClosedFreeBounds(swigCPtr, this), true );
  }

  public  ShapeAnalysis_HSequenceOfFreeBounds  OpenFreeBounds() {
    return new ShapeAnalysis_HSequenceOfFreeBounds ( OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_OpenFreeBounds(swigCPtr, this), true );
  }

  public  ShapeAnalysis_FreeBoundData  ClosedFreeBound(int index) {
    return new ShapeAnalysis_FreeBoundData ( OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_ClosedFreeBound(swigCPtr, this, index), true );
  }

  public  ShapeAnalysis_FreeBoundData  OpenFreeBound(int index) {
    return new ShapeAnalysis_FreeBoundData ( OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_OpenFreeBound(swigCPtr, this, index), true );
  }

  public long DispatchBounds() {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_DispatchBounds(swigCPtr, this);
  }

  public long CheckContours(double prec) {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_CheckContours__SWIG_0(swigCPtr, this, prec);
  }

  public long CheckContours() {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_CheckContours__SWIG_1(swigCPtr, this);
  }

  public long CheckNotches(double prec) {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_CheckNotches__SWIG_0(swigCPtr, this, prec);
  }

  public long CheckNotches() {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_CheckNotches__SWIG_1(swigCPtr, this);
  }

  public long CheckNotches( ShapeAnalysis_FreeBoundData  fbData, double prec) {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_CheckNotches__SWIG_2(swigCPtr, this,  ShapeAnalysis_FreeBoundData.getCPtr(fbData) , fbData, prec);
  }

  public long CheckNotches( ShapeAnalysis_FreeBoundData  fbData) {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_CheckNotches__SWIG_3(swigCPtr, this,  ShapeAnalysis_FreeBoundData.getCPtr(fbData) , fbData);
  }

  public long CheckNotches( TopoDS_Wire  freebound, int num, TopoDS_Wire notch, double[] distMax, double prec) {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_CheckNotches__SWIG_4(swigCPtr, this, TopoDS_Wire.getCPtr(freebound), freebound, num, TopoDS_Wire.getCPtr(notch), notch, distMax, prec);
  }

  public long CheckNotches( TopoDS_Wire  freebound, int num, TopoDS_Wire notch, double[] distMax) {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_CheckNotches__SWIG_5(swigCPtr, this, TopoDS_Wire.getCPtr(freebound), freebound, num, TopoDS_Wire.getCPtr(notch), notch, distMax);
  }

  public long FillProperties( ShapeAnalysis_FreeBoundData  fbData, double prec) {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_FillProperties__SWIG_0(swigCPtr, this,  ShapeAnalysis_FreeBoundData.getCPtr(fbData) , fbData, prec);
  }

  public long FillProperties( ShapeAnalysis_FreeBoundData  fbData) {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundsProperties_FillProperties__SWIG_1(swigCPtr, this,  ShapeAnalysis_FreeBoundData.getCPtr(fbData) , fbData);
  }

}
