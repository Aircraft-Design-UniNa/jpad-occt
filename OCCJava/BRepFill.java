package opencascade;

public class BRepFill {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepFill(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepFill(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepFill obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepFill(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Computes a ruled surface between two edges.
   */
  public static TopoDS_Face Face( TopoDS_Edge  Edge1,  TopoDS_Edge  Edge2) {
    return new TopoDS_Face(OCCwrapJavaJNI.BRepFill_Face(TopoDS_Edge.getCPtr(Edge1), Edge1, TopoDS_Edge.getCPtr(Edge2), Edge2), true);
  }

  /**
   *  Computes a ruled surface between two wires.
   *  The wires must have the same number of edges.
   */
  public static TopoDS_Shell Shell( TopoDS_Wire  Wire1,  TopoDS_Wire  Wire2) {
    return new TopoDS_Shell(OCCwrapJavaJNI.BRepFill_Shell(TopoDS_Wire.getCPtr(Wire1), Wire1, TopoDS_Wire.getCPtr(Wire2), Wire2), true);
  }

  /**
   *  Computes  <AxeProf>  as Follow. <Location> is
   *  the Position of the nearest vertex V  of <Profile>
   *  to <Spine>.<XDirection> is confused with the tangent
   *  to <Spine> at the projected point of V on the Spine.
   *  <Direction> is normal to <Spine>.
   *  <Spine> is a plane wire or a plane face.
   */
  public static void Axe( TopoDS_Shape  Spine,  TopoDS_Wire  Profile, gp_Ax3 AxeProf, long[] ProfOnSpine, double Tol) {
    OCCwrapJavaJNI.BRepFill_Axe(TopoDS_Shape.getCPtr(Spine), Spine, TopoDS_Wire.getCPtr(Profile), Profile, gp_Ax3.getCPtr(AxeProf), AxeProf, ProfOnSpine, Tol);
  }

  /**
   *  Compute ACR on a  wire
   */
  public static void ComputeACR( TopoDS_Wire  wire,  TColStd_Array1OfReal  ACR) {
    OCCwrapJavaJNI.BRepFill_ComputeACR(TopoDS_Wire.getCPtr(wire), wire, TColStd_Array1OfReal.getCPtr(ACR), ACR);
  }

  /**
   *  Insert ACR on a  wire
   */
  public static TopoDS_Wire InsertACR( TopoDS_Wire  wire,  TColStd_Array1OfReal  ACRcuts, double prec) {
    return new TopoDS_Wire(OCCwrapJavaJNI.BRepFill_InsertACR(TopoDS_Wire.getCPtr(wire), wire, TColStd_Array1OfReal.getCPtr(ACRcuts), ACRcuts, prec), true);
  }

  public BRepFill() {
    this(OCCwrapJavaJNI.new_BRepFill(), true);
  }

}
