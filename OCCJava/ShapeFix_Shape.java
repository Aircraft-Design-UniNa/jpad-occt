package opencascade;

/**
 *  Fixing shape in general
 */
public class ShapeFix_Shape extends ShapeFix_Root {
  ShapeFix_Shape(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty Constructor
   */
  public ShapeFix_Shape() {
    this(OCCwrapJavaJNI.new_ShapeFix_Shape__SWIG_0(), true);
  }

  /**
   *  Initislises by shape.
   */
  public ShapeFix_Shape( TopoDS_Shape  shape) {
    this(OCCwrapJavaJNI.new_ShapeFix_Shape__SWIG_1(TopoDS_Shape.getCPtr(shape), shape), true);
  }

  /**
   *  Initislises by shape.
   */
  public void Init( TopoDS_Shape  shape) {
    OCCwrapJavaJNI.ShapeFix_Shape_Init(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape);
  }

  /**
   *  Iterates on sub- shape and performs fixes
   */
  public long Perform( Message_ProgressIndicator  theProgress) {
    return OCCwrapJavaJNI.ShapeFix_Shape_Perform__SWIG_0(swigCPtr, this,  Message_ProgressIndicator.getCPtr(theProgress) , theProgress);
  }

  public long Perform() {
    return OCCwrapJavaJNI.ShapeFix_Shape_Perform__SWIG_1(swigCPtr, this);
  }

  /**
   *  Returns resulting shape
   */
  public TopoDS_Shape Shape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeFix_Shape_Shape(swigCPtr, this), true);
  }

  public  ShapeFix_Solid  FixSolidTool() {
    return new ShapeFix_Solid ( OCCwrapJavaJNI.ShapeFix_Shape_FixSolidTool(swigCPtr, this), true );
  }

  public  ShapeFix_Shell  FixShellTool() {
    return new ShapeFix_Shell ( OCCwrapJavaJNI.ShapeFix_Shape_FixShellTool(swigCPtr, this), true );
  }

  public  ShapeFix_Face  FixFaceTool() {
    return new ShapeFix_Face ( OCCwrapJavaJNI.ShapeFix_Shape_FixFaceTool(swigCPtr, this), true );
  }

  public  ShapeFix_Wire  FixWireTool() {
    return new ShapeFix_Wire ( OCCwrapJavaJNI.ShapeFix_Shape_FixWireTool(swigCPtr, this), true );
  }

  public  ShapeFix_Edge  FixEdgeTool() {
    return new ShapeFix_Edge ( OCCwrapJavaJNI.ShapeFix_Shape_FixEdgeTool(swigCPtr, this), true );
  }

  /**
   *  Returns the status of the last Fix.
   *  This can be a combination of the following flags:
   *  ShapeExtend_DONE1: some free edges were fixed
   *  ShapeExtend_DONE2: some free wires were fixed
   *  ShapeExtend_DONE3: some free faces were fixed
   *  ShapeExtend_DONE4: some free shells were fixed
   *  ShapeExtend_DONE5: some free solids were fixed
   *  ShapeExtend_DONE6: shapes in compound(s) were fixed
   */
  public long Status(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeFix_Shape_Status(swigCPtr, this, status.swigValue());
  }

  public int[] FixSolidMode() {return OCCwrapJavaJNI.ShapeFix_Shape_FixSolidMode(swigCPtr, this);}

  public int[] FixFreeShellMode() {return OCCwrapJavaJNI.ShapeFix_Shape_FixFreeShellMode(swigCPtr, this);}

  public int[] FixFreeFaceMode() {return OCCwrapJavaJNI.ShapeFix_Shape_FixFreeFaceMode(swigCPtr, this);}

  public int[] FixFreeWireMode() {return OCCwrapJavaJNI.ShapeFix_Shape_FixFreeWireMode(swigCPtr, this);}

  public int[] FixSameParameterMode() {return OCCwrapJavaJNI.ShapeFix_Shape_FixSameParameterMode(swigCPtr, this);}

  public int[] FixVertexPositionMode() {return OCCwrapJavaJNI.ShapeFix_Shape_FixVertexPositionMode(swigCPtr, this);}

  public int[] FixVertexTolMode() {return OCCwrapJavaJNI.ShapeFix_Shape_FixVertexTolMode(swigCPtr, this);}

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeFix_Shape_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_Shape_get_type_descriptor(), true );
  }

  public static  ShapeFix_Shape  DownCast( Standard_Transient  T) {
    return new ShapeFix_Shape ( OCCwrapJavaJNI.ShapeFix_Shape_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_Shape_TypeOf(), true );
  }

}
