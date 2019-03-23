package opencascade;

public class StepGeom_Vector extends StepGeom_GeometricRepresentationItem {
  StepGeom_Vector(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Vector
   */
  public StepGeom_Vector() {
    this(OCCwrapJavaJNI.new_StepGeom_Vector(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_Direction  aOrientation, double aMagnitude) {
    OCCwrapJavaJNI.StepGeom_Vector_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_Direction.getCPtr(aOrientation) , aOrientation, aMagnitude);
  }

  public void SetOrientation( StepGeom_Direction  aOrientation) {
    OCCwrapJavaJNI.StepGeom_Vector_SetOrientation(swigCPtr, this,  StepGeom_Direction.getCPtr(aOrientation) , aOrientation);
  }

  public  StepGeom_Direction  Orientation() {
    return new StepGeom_Direction ( OCCwrapJavaJNI.StepGeom_Vector_Orientation(swigCPtr, this), true );
  }

  public void SetMagnitude(double aMagnitude) {
    OCCwrapJavaJNI.StepGeom_Vector_SetMagnitude(swigCPtr, this, aMagnitude);
  }

  public double Magnitude() {
    return OCCwrapJavaJNI.StepGeom_Vector_Magnitude(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_Vector_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Vector_get_type_descriptor(), true );
  }

  public static  StepGeom_Vector  DownCast( Standard_Transient  T) {
    return new StepGeom_Vector ( OCCwrapJavaJNI.StepGeom_Vector_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Vector_TypeOf(), true );
  }

}
