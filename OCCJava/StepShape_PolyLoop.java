package opencascade;

public class StepShape_PolyLoop extends StepShape_Loop {
  StepShape_PolyLoop(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a PolyLoop
   */
  public StepShape_PolyLoop() {
    this(OCCwrapJavaJNI.new_StepShape_PolyLoop(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_HArray1OfCartesianPoint  aPolygon) {
    OCCwrapJavaJNI.StepShape_PolyLoop_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_HArray1OfCartesianPoint.getCPtr(aPolygon) , aPolygon);
  }

  public void SetPolygon( StepGeom_HArray1OfCartesianPoint  aPolygon) {
    OCCwrapJavaJNI.StepShape_PolyLoop_SetPolygon(swigCPtr, this,  StepGeom_HArray1OfCartesianPoint.getCPtr(aPolygon) , aPolygon);
  }

  public  StepGeom_HArray1OfCartesianPoint  Polygon() {
    return new StepGeom_HArray1OfCartesianPoint ( OCCwrapJavaJNI.StepShape_PolyLoop_Polygon(swigCPtr, this), true );
  }

  public  StepGeom_CartesianPoint  PolygonValue(int num) {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepShape_PolyLoop_PolygonValue(swigCPtr, this, num), true );
  }

  public int NbPolygon() {
    return OCCwrapJavaJNI.StepShape_PolyLoop_NbPolygon(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_PolyLoop_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_PolyLoop_get_type_descriptor(), true );
  }

  public static  StepShape_PolyLoop  DownCast( Standard_Transient  T) {
    return new StepShape_PolyLoop ( OCCwrapJavaJNI.StepShape_PolyLoop_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_PolyLoop_TypeOf(), true );
  }

}
