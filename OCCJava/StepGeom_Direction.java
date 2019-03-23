package opencascade;

public class StepGeom_Direction extends StepGeom_GeometricRepresentationItem {
  StepGeom_Direction(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Direction
   */
  public StepGeom_Direction() {
    this(OCCwrapJavaJNI.new_StepGeom_Direction(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  TColStd_HArray1OfReal  aDirectionRatios) {
    OCCwrapJavaJNI.StepGeom_Direction_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  TColStd_HArray1OfReal.getCPtr(aDirectionRatios) , aDirectionRatios);
  }

  public void SetDirectionRatios( TColStd_HArray1OfReal  aDirectionRatios) {
    OCCwrapJavaJNI.StepGeom_Direction_SetDirectionRatios(swigCPtr, this,  TColStd_HArray1OfReal.getCPtr(aDirectionRatios) , aDirectionRatios);
  }

  public  TColStd_HArray1OfReal  DirectionRatios() {
    return new TColStd_HArray1OfReal ( OCCwrapJavaJNI.StepGeom_Direction_DirectionRatios(swigCPtr, this), true );
  }

  public double DirectionRatiosValue(int num) {
    return OCCwrapJavaJNI.StepGeom_Direction_DirectionRatiosValue(swigCPtr, this, num);
  }

  public int NbDirectionRatios() {
    return OCCwrapJavaJNI.StepGeom_Direction_NbDirectionRatios(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_Direction_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Direction_get_type_descriptor(), true );
  }

  public static  StepGeom_Direction  DownCast( Standard_Transient  T) {
    return new StepGeom_Direction ( OCCwrapJavaJNI.StepGeom_Direction_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Direction_TypeOf(), true );
  }

}
