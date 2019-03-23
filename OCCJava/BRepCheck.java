package opencascade;

/**
 *  This package  provides tools to check the validity
 *  of the BRep.
 */
public class BRepCheck {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepCheck(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepCheck(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepCheck obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepCheck(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static void Add(SWIGTYPE_p_BRepCheck_ListOfStatus List, BRepCheck_Status Stat) {
    OCCwrapJavaJNI.BRepCheck_Add(SWIGTYPE_p_BRepCheck_ListOfStatus.getCPtr(List), Stat.swigValue());
  }

  public static void Print(BRepCheck_Status Stat, SWIGTYPE_p_Standard_OStream OS) {
    OCCwrapJavaJNI.BRepCheck_Print(Stat.swigValue(), SWIGTYPE_p_Standard_OStream.getCPtr(OS));
  }

  public static long SelfIntersection( TopoDS_Wire  W,  TopoDS_Face  F, TopoDS_Edge E1, TopoDS_Edge E2) {
    return OCCwrapJavaJNI.BRepCheck_SelfIntersection(TopoDS_Wire.getCPtr(W), W, TopoDS_Face.getCPtr(F), F, TopoDS_Edge.getCPtr(E1), E1, TopoDS_Edge.getCPtr(E2), E2);
  }

  public BRepCheck() {
    this(OCCwrapJavaJNI.new_BRepCheck(), true);
  }

}
