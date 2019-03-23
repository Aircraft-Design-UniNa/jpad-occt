package opencascade;

public class ShapeUpgrade_EdgeDivide extends ShapeUpgrade_Tool {
  ShapeUpgrade_EdgeDivide(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor
   */
  public ShapeUpgrade_EdgeDivide() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_EdgeDivide(), true);
  }

  public void Clear() {
    OCCwrapJavaJNI.ShapeUpgrade_EdgeDivide_Clear(swigCPtr, this);
  }

  /**
   *  Sets supporting surface by face
   */
  public void SetFace( TopoDS_Face  F) {
    OCCwrapJavaJNI.ShapeUpgrade_EdgeDivide_SetFace(swigCPtr, this, TopoDS_Face.getCPtr(F), F);
  }

  public long Compute( TopoDS_Edge  E) {
    return OCCwrapJavaJNI.ShapeUpgrade_EdgeDivide_Compute(swigCPtr, this, TopoDS_Edge.getCPtr(E), E);
  }

  public long HasCurve2d() {
    return OCCwrapJavaJNI.ShapeUpgrade_EdgeDivide_HasCurve2d(swigCPtr, this);
  }

  public long HasCurve3d() {
    return OCCwrapJavaJNI.ShapeUpgrade_EdgeDivide_HasCurve3d(swigCPtr, this);
  }

  public  TColStd_HSequenceOfReal  Knots2d() {
    return new TColStd_HSequenceOfReal ( OCCwrapJavaJNI.ShapeUpgrade_EdgeDivide_Knots2d(swigCPtr, this), true );
  }

  public  TColStd_HSequenceOfReal  Knots3d() {
    return new TColStd_HSequenceOfReal ( OCCwrapJavaJNI.ShapeUpgrade_EdgeDivide_Knots3d(swigCPtr, this), true );
  }

  /**
   *  Sets the tool for splitting pcurves.
   */
  public void SetSplitCurve2dTool( ShapeUpgrade_SplitCurve2d  splitCurve2dTool) {
    OCCwrapJavaJNI.ShapeUpgrade_EdgeDivide_SetSplitCurve2dTool(swigCPtr, this,  ShapeUpgrade_SplitCurve2d.getCPtr(splitCurve2dTool) , splitCurve2dTool);
  }

  /**
   *  Sets the tool for splitting 3D curves.
   */
  public void SetSplitCurve3dTool( ShapeUpgrade_SplitCurve3d  splitCurve3dTool) {
    OCCwrapJavaJNI.ShapeUpgrade_EdgeDivide_SetSplitCurve3dTool(swigCPtr, this,  ShapeUpgrade_SplitCurve3d.getCPtr(splitCurve3dTool) , splitCurve3dTool);
  }

  public  ShapeUpgrade_SplitCurve2d  GetSplitCurve2dTool() {
    return new ShapeUpgrade_SplitCurve2d ( OCCwrapJavaJNI.ShapeUpgrade_EdgeDivide_GetSplitCurve2dTool(swigCPtr, this), true );
  }

  public  ShapeUpgrade_SplitCurve3d  GetSplitCurve3dTool() {
    return new ShapeUpgrade_SplitCurve3d ( OCCwrapJavaJNI.ShapeUpgrade_EdgeDivide_GetSplitCurve3dTool(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_EdgeDivide_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_EdgeDivide_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_EdgeDivide  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_EdgeDivide ( OCCwrapJavaJNI.ShapeUpgrade_EdgeDivide_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_EdgeDivide_TypeOf(), true );
  }

}
