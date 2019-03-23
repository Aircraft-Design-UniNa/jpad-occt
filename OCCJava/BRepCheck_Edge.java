package opencascade;

public class BRepCheck_Edge extends BRepCheck_Result {
  BRepCheck_Edge(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public BRepCheck_Edge( TopoDS_Edge  E) {
    this(OCCwrapJavaJNI.new_BRepCheck_Edge(TopoDS_Edge.getCPtr(E), E), true);
  }

  public long GeometricControls() {
    return OCCwrapJavaJNI.BRepCheck_Edge_GeometricControls__SWIG_0(swigCPtr, this);
  }

  public void GeometricControls(long B) {
    OCCwrapJavaJNI.BRepCheck_Edge_GeometricControls__SWIG_1(swigCPtr, this, B);
  }

  public double Tolerance() {
    return OCCwrapJavaJNI.BRepCheck_Edge_Tolerance(swigCPtr, this);
  }

  /**
   *  Sets status of Edge;
   */
  public void SetStatus(BRepCheck_Status theStatus) {
    OCCwrapJavaJNI.BRepCheck_Edge_SetStatus(swigCPtr, this, theStatus.swigValue());
  }

  /**
   *  Checks, if polygon on triangulation of heEdge
   *  is out of 3D-curve of this edge.
   */
  public BRepCheck_Status CheckPolygonOnTriangulation( TopoDS_Edge  theEdge) {
    return BRepCheck_Status.swigToEnum(OCCwrapJavaJNI.BRepCheck_Edge_CheckPolygonOnTriangulation(swigCPtr, this, TopoDS_Edge.getCPtr(theEdge), theEdge));
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.BRepCheck_Edge_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepCheck_Edge_get_type_descriptor(), true );
  }

  public static  BRepCheck_Edge  DownCast( Standard_Transient  T) {
    return new BRepCheck_Edge ( OCCwrapJavaJNI.BRepCheck_Edge_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepCheck_Edge_TypeOf(), true );
  }

}
