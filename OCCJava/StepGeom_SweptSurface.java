package opencascade;

public class StepGeom_SweptSurface extends StepGeom_Surface {
  StepGeom_SweptSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a SweptSurface
   */
  public StepGeom_SweptSurface() {
    this(OCCwrapJavaJNI.new_StepGeom_SweptSurface(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_Curve  aSweptCurve) {
    OCCwrapJavaJNI.StepGeom_SweptSurface_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_Curve.getCPtr(aSweptCurve) , aSweptCurve);
  }

  public void SetSweptCurve( StepGeom_Curve  aSweptCurve) {
    OCCwrapJavaJNI.StepGeom_SweptSurface_SetSweptCurve(swigCPtr, this,  StepGeom_Curve.getCPtr(aSweptCurve) , aSweptCurve);
  }

  public  StepGeom_Curve  SweptCurve() {
    return new StepGeom_Curve ( OCCwrapJavaJNI.StepGeom_SweptSurface_SweptCurve(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_SweptSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_SweptSurface_get_type_descriptor(), true );
  }

  public static  StepGeom_SweptSurface  DownCast( Standard_Transient  T) {
    return new StepGeom_SweptSurface ( OCCwrapJavaJNI.StepGeom_SweptSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_SweptSurface_TypeOf(), true );
  }

}
