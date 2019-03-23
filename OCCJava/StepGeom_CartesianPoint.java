package opencascade;

public class StepGeom_CartesianPoint extends StepGeom_Point {
  StepGeom_CartesianPoint(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a CartesianPoint
   */
  public StepGeom_CartesianPoint() {
    this(OCCwrapJavaJNI.new_StepGeom_CartesianPoint(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  TColStd_HArray1OfReal  aCoordinates) {
    OCCwrapJavaJNI.StepGeom_CartesianPoint_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  TColStd_HArray1OfReal.getCPtr(aCoordinates) , aCoordinates);
  }

  public void Init2D( TCollection_HAsciiString  aName, double X, double Y) {
    OCCwrapJavaJNI.StepGeom_CartesianPoint_Init2D(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName, X, Y);
  }

  public void Init3D( TCollection_HAsciiString  aName, double X, double Y, double Z) {
    OCCwrapJavaJNI.StepGeom_CartesianPoint_Init3D(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName, X, Y, Z);
  }

  public void SetCoordinates( TColStd_HArray1OfReal  aCoordinates) {
    OCCwrapJavaJNI.StepGeom_CartesianPoint_SetCoordinates(swigCPtr, this,  TColStd_HArray1OfReal.getCPtr(aCoordinates) , aCoordinates);
  }

  public  TColStd_HArray1OfReal  Coordinates() {
    return new TColStd_HArray1OfReal ( OCCwrapJavaJNI.StepGeom_CartesianPoint_Coordinates(swigCPtr, this), true );
  }

  public double CoordinatesValue(int num) {
    return OCCwrapJavaJNI.StepGeom_CartesianPoint_CoordinatesValue(swigCPtr, this, num);
  }

  public int NbCoordinates() {
    return OCCwrapJavaJNI.StepGeom_CartesianPoint_NbCoordinates(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_CartesianPoint_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_CartesianPoint_get_type_descriptor(), true );
  }

  public static  StepGeom_CartesianPoint  DownCast( Standard_Transient  T) {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_CartesianPoint_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_CartesianPoint_TypeOf(), true );
  }

}
