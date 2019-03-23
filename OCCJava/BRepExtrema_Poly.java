package opencascade;

public class BRepExtrema_Poly {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepExtrema_Poly(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepExtrema_Poly(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepExtrema_Poly obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepExtrema_Poly(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  returns Standard_True if OK.
   */
  public static long Distance( TopoDS_Shape  S1,  TopoDS_Shape  S2, gp_Pnt P1, gp_Pnt P2, double[] dist) {
    return OCCwrapJavaJNI.BRepExtrema_Poly_Distance(TopoDS_Shape.getCPtr(S1), S1, TopoDS_Shape.getCPtr(S2), S2, gp_Pnt.getCPtr(P1), P1, gp_Pnt.getCPtr(P2), P2, dist);
  }

  public BRepExtrema_Poly() {
    this(OCCwrapJavaJNI.new_BRepExtrema_Poly(), true);
  }

}
