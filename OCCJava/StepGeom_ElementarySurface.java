package opencascade;

public class StepGeom_ElementarySurface extends StepGeom_Surface {
  StepGeom_ElementarySurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a ElementarySurface
   */
  public StepGeom_ElementarySurface() {
    this(OCCwrapJavaJNI.new_StepGeom_ElementarySurface(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_Axis2Placement3d  aPosition) {
    OCCwrapJavaJNI.StepGeom_ElementarySurface_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_Axis2Placement3d.getCPtr(aPosition) , aPosition);
  }

  public void SetPosition( StepGeom_Axis2Placement3d  aPosition) {
    OCCwrapJavaJNI.StepGeom_ElementarySurface_SetPosition(swigCPtr, this,  StepGeom_Axis2Placement3d.getCPtr(aPosition) , aPosition);
  }

  public  StepGeom_Axis2Placement3d  Position() {
    return new StepGeom_Axis2Placement3d ( OCCwrapJavaJNI.StepGeom_ElementarySurface_Position(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_ElementarySurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_ElementarySurface_get_type_descriptor(), true );
  }

  public static  StepGeom_ElementarySurface  DownCast( Standard_Transient  T) {
    return new StepGeom_ElementarySurface ( OCCwrapJavaJNI.StepGeom_ElementarySurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_ElementarySurface_TypeOf(), true );
  }

}
