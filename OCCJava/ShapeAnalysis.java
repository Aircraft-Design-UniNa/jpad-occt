package opencascade;

/**
 *  This package is intended to analyze geometrical objects
 *  and topological shapes. Analysis domain includes both
 *  exploring geometrical and topological properties of
 *  shapes and checking their conformance to Open CASCADE requirements.
 *  The directions of analysis provided by tools of this package are:
 *  computing quantities of subshapes,
 *  computing parameters of points on curve and surface,
 *  computing surface singularities,
 *  checking edge and wire consistency,
 *  checking edges order in the wire,
 *  checking face bounds orientation,
 *  checking small faces,
 *  analyzing shape tolerances,
 *  analyzing of free bounds of the shape.
 */
public class ShapeAnalysis {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeAnalysis(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeAnalysis(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeAnalysis obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeAnalysis(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Returns the outer wire on the face <Face>.
   *  This is replacement of the method BRepTools::OuterWire
   *  until it works badly.
   *  Returns the first wire oriented as outer according to
   *  FClass2d_Classifier. If none, last wire is returned.
   */
  public static TopoDS_Wire OuterWire( TopoDS_Face  face) {
    return new TopoDS_Wire(OCCwrapJavaJNI.ShapeAnalysis_OuterWire(TopoDS_Face.getCPtr(face), face), true);
  }

  /**
   *  Returns a total area of 2d wire
   */
  public static double TotCross2D( ShapeExtend_WireData  sewd,  TopoDS_Face  aFace) {
    return OCCwrapJavaJNI.ShapeAnalysis_TotCross2D( ShapeExtend_WireData.getCPtr(sewd) , sewd, TopoDS_Face.getCPtr(aFace), aFace);
  }

  /**
   *  Returns a total area of 3d wire
   */
  public static double ContourArea( TopoDS_Wire  theWire) {
    return OCCwrapJavaJNI.ShapeAnalysis_ContourArea(TopoDS_Wire.getCPtr(theWire), theWire);
  }

  /**
   *  Returns True if <F> has outer bound.
   */
  public static long IsOuterBound( TopoDS_Face  face) {
    return OCCwrapJavaJNI.ShapeAnalysis_IsOuterBound(TopoDS_Face.getCPtr(face), face);
  }

  /**
   *  Returns a shift required to move point
   *  <Val> to the range [ToVal-Period/2,ToVal+Period/2].
   *  This shift will be the divisible by Period.
   *  Intended for adjusting parameters on periodic surfaces.
   */
  public static double AdjustByPeriod(double Val, double ToVal, double Period) {
    return OCCwrapJavaJNI.ShapeAnalysis_AdjustByPeriod(Val, ToVal, Period);
  }

  /**
   *  Returns a shift required to move point
   *  <Val> to the range [ValMin,ValMax].
   *  This shift will be the divisible by Period
   *  with Period = ValMax - ValMin.
   *  Intended for adjusting parameters on periodic surfaces.
   */
  public static double AdjustToPeriod(double Val, double ValMin, double ValMax) {
    return OCCwrapJavaJNI.ShapeAnalysis_AdjustToPeriod(Val, ValMin, ValMax);
  }

  /**
   *  Finds the start and end vertices of the shape
   *  Shape can be of the following type:
   *  vertex: V1 and V2 are the same and equal to <shape>,
   *  edge  : V1 is start and V2 is end vertex (see ShapeAnalysis_Edge
   *  methods FirstVertex and LastVertex),
   *  wire  : V1 is start vertex of the first edge, V2 is end vertex
   *  of the last edge (also see ShapeAnalysis_Edge).
   *  If wire contains no edges V1 and V2 are nullified
   *  If none of the above V1 and V2 are nullified
   */
  public static void FindBounds( TopoDS_Shape  shape, TopoDS_Vertex V1, TopoDS_Vertex V2) {
    OCCwrapJavaJNI.ShapeAnalysis_FindBounds(TopoDS_Shape.getCPtr(shape), shape, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2);
  }

  /**
   *  Computes exact UV bounds of all wires on the face
   */
  public static void GetFaceUVBounds( TopoDS_Face  F, double[] Umin, double[] Umax, double[] Vmin, double[] Vmax) {
    OCCwrapJavaJNI.ShapeAnalysis_GetFaceUVBounds(TopoDS_Face.getCPtr(F), F, Umin, Umax, Vmin, Vmax);
  }

  public ShapeAnalysis() {
    this(OCCwrapJavaJNI.new_ShapeAnalysis(), true);
  }

}
