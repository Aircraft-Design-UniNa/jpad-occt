package opencascade;

public class StepGeom_SurfaceCurve extends StepGeom_Curve {
  StepGeom_SurfaceCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a SurfaceCurve
   */
  public StepGeom_SurfaceCurve() {
    this(OCCwrapJavaJNI.new_StepGeom_SurfaceCurve(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_Curve  aCurve3d,  StepGeom_HArray1OfPcurveOrSurface  aAssociatedGeometry, StepGeom_PreferredSurfaceCurveRepresentation aMasterRepresentation) {
    OCCwrapJavaJNI.StepGeom_SurfaceCurve_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_Curve.getCPtr(aCurve3d) , aCurve3d,  StepGeom_HArray1OfPcurveOrSurface.getCPtr(aAssociatedGeometry) , aAssociatedGeometry, aMasterRepresentation.swigValue());
  }

  public void SetCurve3d( StepGeom_Curve  aCurve3d) {
    OCCwrapJavaJNI.StepGeom_SurfaceCurve_SetCurve3d(swigCPtr, this,  StepGeom_Curve.getCPtr(aCurve3d) , aCurve3d);
  }

  public  StepGeom_Curve  Curve3d() {
    return new StepGeom_Curve ( OCCwrapJavaJNI.StepGeom_SurfaceCurve_Curve3d(swigCPtr, this), true );
  }

  public void SetAssociatedGeometry( StepGeom_HArray1OfPcurveOrSurface  aAssociatedGeometry) {
    OCCwrapJavaJNI.StepGeom_SurfaceCurve_SetAssociatedGeometry(swigCPtr, this,  StepGeom_HArray1OfPcurveOrSurface.getCPtr(aAssociatedGeometry) , aAssociatedGeometry);
  }

  public  StepGeom_HArray1OfPcurveOrSurface  AssociatedGeometry() {
    return new StepGeom_HArray1OfPcurveOrSurface ( OCCwrapJavaJNI.StepGeom_SurfaceCurve_AssociatedGeometry(swigCPtr, this), true );
  }

  public StepGeom_PcurveOrSurface AssociatedGeometryValue(int num) {
    return new StepGeom_PcurveOrSurface(OCCwrapJavaJNI.StepGeom_SurfaceCurve_AssociatedGeometryValue(swigCPtr, this, num), true);
  }

  public int NbAssociatedGeometry() {
    return OCCwrapJavaJNI.StepGeom_SurfaceCurve_NbAssociatedGeometry(swigCPtr, this);
  }

  public void SetMasterRepresentation(StepGeom_PreferredSurfaceCurveRepresentation aMasterRepresentation) {
    OCCwrapJavaJNI.StepGeom_SurfaceCurve_SetMasterRepresentation(swigCPtr, this, aMasterRepresentation.swigValue());
  }

  public StepGeom_PreferredSurfaceCurveRepresentation MasterRepresentation() {
    return StepGeom_PreferredSurfaceCurveRepresentation.swigToEnum(OCCwrapJavaJNI.StepGeom_SurfaceCurve_MasterRepresentation(swigCPtr, this));
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_SurfaceCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_SurfaceCurve_get_type_descriptor(), true );
  }

  public static  StepGeom_SurfaceCurve  DownCast( Standard_Transient  T) {
    return new StepGeom_SurfaceCurve ( OCCwrapJavaJNI.StepGeom_SurfaceCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_SurfaceCurve_TypeOf(), true );
  }

}
