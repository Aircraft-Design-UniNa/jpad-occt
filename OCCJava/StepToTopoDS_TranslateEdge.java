package opencascade;

public class StepToTopoDS_TranslateEdge extends StepToTopoDS_Root {

  private long swigCPtr;
  StepToTopoDS_TranslateEdge(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_TranslateEdge_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  StepToTopoDS_TranslateEdge(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_TranslateEdge_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(StepToTopoDS_TranslateEdge obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_TranslateEdge(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public StepToTopoDS_TranslateEdge() {
    this(OCCwrapJavaJNI.new_StepToTopoDS_TranslateEdge__SWIG_0(), true);
  }

  public StepToTopoDS_TranslateEdge( StepShape_Edge  E, StepToTopoDS_Tool T, StepToTopoDS_NMTool NMTool) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_TranslateEdge__SWIG_1( StepShape_Edge.getCPtr(E) , E, StepToTopoDS_Tool.getCPtr(T), T, StepToTopoDS_NMTool.getCPtr(NMTool), NMTool), true);
  }

  public void Init( StepShape_Edge  E, StepToTopoDS_Tool T, StepToTopoDS_NMTool NMTool) {
    OCCwrapJavaJNI.StepToTopoDS_TranslateEdge_Init(swigCPtr, this,  StepShape_Edge.getCPtr(E) , E, StepToTopoDS_Tool.getCPtr(T), T, StepToTopoDS_NMTool.getCPtr(NMTool), NMTool);
  }

  /**
   *  Warning! C3D is assumed to be a Curve 3D ...
   *  other cases to checked before calling this
   */
  public void MakeFromCurve3D( StepGeom_Curve  C3D,  StepShape_EdgeCurve  EC,  StepShape_Vertex  Vend, double preci, TopoDS_Edge E, TopoDS_Vertex V1, TopoDS_Vertex V2, StepToTopoDS_Tool T) {
    OCCwrapJavaJNI.StepToTopoDS_TranslateEdge_MakeFromCurve3D(swigCPtr, this,  StepGeom_Curve.getCPtr(C3D) , C3D,  StepShape_EdgeCurve.getCPtr(EC) , EC,  StepShape_Vertex.getCPtr(Vend) , Vend, preci, TopoDS_Edge.getCPtr(E), E, TopoDS_Vertex.getCPtr(V1), V1, TopoDS_Vertex.getCPtr(V2), V2, StepToTopoDS_Tool.getCPtr(T), T);
  }

  public  Geom2d_Curve  MakePCurve( StepGeom_Pcurve  PCU,  Geom_Surface  ConvSurf) {
    return new Geom2d_Curve ( OCCwrapJavaJNI.StepToTopoDS_TranslateEdge_MakePCurve(swigCPtr, this,  StepGeom_Pcurve.getCPtr(PCU) , PCU,  Geom_Surface.getCPtr(ConvSurf) , ConvSurf), true );
  }

  public  TopoDS_Shape  Value() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_TranslateEdge_Value(swigCPtr, this), true);
    return ret;
  }

  public StepToTopoDS_TranslateEdgeError Error() {
    return StepToTopoDS_TranslateEdgeError.swigToEnum(OCCwrapJavaJNI.StepToTopoDS_TranslateEdge_Error(swigCPtr, this));
  }

}
