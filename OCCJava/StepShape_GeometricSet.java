package opencascade;

public class StepShape_GeometricSet extends StepGeom_GeometricRepresentationItem {
  StepShape_GeometricSet(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a GeometricSet
   */
  public StepShape_GeometricSet() {
    this(OCCwrapJavaJNI.new_StepShape_GeometricSet(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepShape_HArray1OfGeometricSetSelect  aElements) {
    OCCwrapJavaJNI.StepShape_GeometricSet_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepShape_HArray1OfGeometricSetSelect.getCPtr(aElements) , aElements);
  }

  public void SetElements( StepShape_HArray1OfGeometricSetSelect  aElements) {
    OCCwrapJavaJNI.StepShape_GeometricSet_SetElements(swigCPtr, this,  StepShape_HArray1OfGeometricSetSelect.getCPtr(aElements) , aElements);
  }

  public  StepShape_HArray1OfGeometricSetSelect  Elements() {
    return new StepShape_HArray1OfGeometricSetSelect ( OCCwrapJavaJNI.StepShape_GeometricSet_Elements(swigCPtr, this), true );
  }

  public StepShape_GeometricSetSelect ElementsValue(int num) {
    return new StepShape_GeometricSetSelect(OCCwrapJavaJNI.StepShape_GeometricSet_ElementsValue(swigCPtr, this, num), true);
  }

  public int NbElements() {
    return OCCwrapJavaJNI.StepShape_GeometricSet_NbElements(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_GeometricSet_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_GeometricSet_get_type_descriptor(), true );
  }

  public static  StepShape_GeometricSet  DownCast( Standard_Transient  T) {
    return new StepShape_GeometricSet ( OCCwrapJavaJNI.StepShape_GeometricSet_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_GeometricSet_TypeOf(), true );
  }

}
