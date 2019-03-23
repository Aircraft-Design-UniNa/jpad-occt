package opencascade;

/**
 *  This is a common interface for meshing algorithms 
 *  instantiated by Mesh Factory and implemented by plugins.
 */
public class BRepMesh_DiscretRoot extends Standard_Transient {
  BRepMesh_DiscretRoot(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Set the shape to triangulate.
   */
  public void SetShape( TopoDS_Shape  theShape) {
    OCCwrapJavaJNI.BRepMesh_DiscretRoot_SetShape(swigCPtr, this, TopoDS_Shape.getCPtr(theShape), theShape);
  }

  public  TopoDS_Shape  Shape() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepMesh_DiscretRoot_Shape(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns true if triangualtion was performed and has success.
   */
  public long IsDone() {
    return OCCwrapJavaJNI.BRepMesh_DiscretRoot_IsDone(swigCPtr, this);
  }

  /**
   *  Compute triangulation for set shape.
   */
  public void Perform() {
    OCCwrapJavaJNI.BRepMesh_DiscretRoot_Perform(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.BRepMesh_DiscretRoot_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepMesh_DiscretRoot_get_type_descriptor(), true );
  }

  public static  BRepMesh_DiscretRoot  DownCast( Standard_Transient  T) {
    return new BRepMesh_DiscretRoot ( OCCwrapJavaJNI.BRepMesh_DiscretRoot_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepMesh_DiscretRoot_TypeOf(), true );
  }

}
