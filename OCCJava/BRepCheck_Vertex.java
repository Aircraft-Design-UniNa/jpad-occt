package opencascade;

public class BRepCheck_Vertex extends BRepCheck_Result {
  BRepCheck_Vertex(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public BRepCheck_Vertex( TopoDS_Vertex  V) {
    this(OCCwrapJavaJNI.new_BRepCheck_Vertex(TopoDS_Vertex.getCPtr(V), V), true);
  }

  public double Tolerance() {
    return OCCwrapJavaJNI.BRepCheck_Vertex_Tolerance(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.BRepCheck_Vertex_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepCheck_Vertex_get_type_descriptor(), true );
  }

  public static  BRepCheck_Vertex  DownCast( Standard_Transient  T) {
    return new BRepCheck_Vertex ( OCCwrapJavaJNI.BRepCheck_Vertex_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepCheck_Vertex_TypeOf(), true );
  }

}
