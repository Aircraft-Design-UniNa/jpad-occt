package opencascade;

public class StepGeom_Polyline extends StepGeom_BoundedCurve {
  StepGeom_Polyline(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Polyline
   */
  public StepGeom_Polyline() {
    this(OCCwrapJavaJNI.new_StepGeom_Polyline(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_HArray1OfCartesianPoint  aPoints) {
    OCCwrapJavaJNI.StepGeom_Polyline_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_HArray1OfCartesianPoint.getCPtr(aPoints) , aPoints);
  }

  public void SetPoints( StepGeom_HArray1OfCartesianPoint  aPoints) {
    OCCwrapJavaJNI.StepGeom_Polyline_SetPoints(swigCPtr, this,  StepGeom_HArray1OfCartesianPoint.getCPtr(aPoints) , aPoints);
  }

  public  StepGeom_HArray1OfCartesianPoint  Points() {
    return new StepGeom_HArray1OfCartesianPoint ( OCCwrapJavaJNI.StepGeom_Polyline_Points(swigCPtr, this), true );
  }

  public  StepGeom_CartesianPoint  PointsValue(int num) {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_Polyline_PointsValue(swigCPtr, this, num), true );
  }

  public int NbPoints() {
    return OCCwrapJavaJNI.StepGeom_Polyline_NbPoints(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_Polyline_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Polyline_get_type_descriptor(), true );
  }

  public static  StepGeom_Polyline  DownCast( Standard_Transient  T) {
    return new StepGeom_Polyline ( OCCwrapJavaJNI.StepGeom_Polyline_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Polyline_TypeOf(), true );
  }

}
