package opencascade;

public class StepGeom_SurfaceOfLinearExtrusion extends StepGeom_SweptSurface {
  StepGeom_SurfaceOfLinearExtrusion(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a SurfaceOfLinearExtrusion
   */
  public StepGeom_SurfaceOfLinearExtrusion() {
    this(OCCwrapJavaJNI.new_StepGeom_SurfaceOfLinearExtrusion(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_Curve  aSweptCurve,  StepGeom_Vector  aExtrusionAxis) {
    OCCwrapJavaJNI.StepGeom_SurfaceOfLinearExtrusion_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_Curve.getCPtr(aSweptCurve) , aSweptCurve,  StepGeom_Vector.getCPtr(aExtrusionAxis) , aExtrusionAxis);
  }

  public void SetExtrusionAxis( StepGeom_Vector  aExtrusionAxis) {
    OCCwrapJavaJNI.StepGeom_SurfaceOfLinearExtrusion_SetExtrusionAxis(swigCPtr, this,  StepGeom_Vector.getCPtr(aExtrusionAxis) , aExtrusionAxis);
  }

  public  StepGeom_Vector  ExtrusionAxis() {
    return new StepGeom_Vector ( OCCwrapJavaJNI.StepGeom_SurfaceOfLinearExtrusion_ExtrusionAxis(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_SurfaceOfLinearExtrusion_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_SurfaceOfLinearExtrusion_get_type_descriptor(), true );
  }

  public static  StepGeom_SurfaceOfLinearExtrusion  DownCast( Standard_Transient  T) {
    return new StepGeom_SurfaceOfLinearExtrusion ( OCCwrapJavaJNI.StepGeom_SurfaceOfLinearExtrusion_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_SurfaceOfLinearExtrusion_TypeOf(), true );
  }

}
