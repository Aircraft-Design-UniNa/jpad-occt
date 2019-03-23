package opencascade;

/**
 *  Two wires have common vertex - this case is valid in BRep model
 *  and isn't valid in STEP => before writing into STEP it is necessary
 *  to split this vertex (each wire must has one vertex)
 */
public class ShapeFix_SplitCommonVertex extends ShapeFix_Root {
  ShapeFix_SplitCommonVertex(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public ShapeFix_SplitCommonVertex() {
    this(OCCwrapJavaJNI.new_ShapeFix_SplitCommonVertex(), true);
  }

  public void Init( TopoDS_Shape  S) {
    OCCwrapJavaJNI.ShapeFix_SplitCommonVertex_Init(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

  public void Perform() {
    OCCwrapJavaJNI.ShapeFix_SplitCommonVertex_Perform(swigCPtr, this);
  }

  public TopoDS_Shape Shape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeFix_SplitCommonVertex_Shape(swigCPtr, this), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeFix_SplitCommonVertex_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_SplitCommonVertex_get_type_descriptor(), true );
  }

  public static  ShapeFix_SplitCommonVertex  DownCast( Standard_Transient  T) {
    return new ShapeFix_SplitCommonVertex ( OCCwrapJavaJNI.ShapeFix_SplitCommonVertex_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_SplitCommonVertex_TypeOf(), true );
  }

}
