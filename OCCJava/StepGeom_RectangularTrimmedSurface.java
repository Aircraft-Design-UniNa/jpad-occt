package opencascade;

public class StepGeom_RectangularTrimmedSurface extends StepGeom_BoundedSurface {
  StepGeom_RectangularTrimmedSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a RectangularTrimmedSurface
   */
  public StepGeom_RectangularTrimmedSurface() {
    this(OCCwrapJavaJNI.new_StepGeom_RectangularTrimmedSurface(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_Surface  aBasisSurface, double aU1, double aU2, double aV1, double aV2, long aUsense, long aVsense) {
    OCCwrapJavaJNI.StepGeom_RectangularTrimmedSurface_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_Surface.getCPtr(aBasisSurface) , aBasisSurface, aU1, aU2, aV1, aV2, aUsense, aVsense);
  }

  public void SetBasisSurface( StepGeom_Surface  aBasisSurface) {
    OCCwrapJavaJNI.StepGeom_RectangularTrimmedSurface_SetBasisSurface(swigCPtr, this,  StepGeom_Surface.getCPtr(aBasisSurface) , aBasisSurface);
  }

  public  StepGeom_Surface  BasisSurface() {
    return new StepGeom_Surface ( OCCwrapJavaJNI.StepGeom_RectangularTrimmedSurface_BasisSurface(swigCPtr, this), true );
  }

  public void SetU1(double aU1) {
    OCCwrapJavaJNI.StepGeom_RectangularTrimmedSurface_SetU1(swigCPtr, this, aU1);
  }

  public double U1() {
    return OCCwrapJavaJNI.StepGeom_RectangularTrimmedSurface_U1(swigCPtr, this);
  }

  public void SetU2(double aU2) {
    OCCwrapJavaJNI.StepGeom_RectangularTrimmedSurface_SetU2(swigCPtr, this, aU2);
  }

  public double U2() {
    return OCCwrapJavaJNI.StepGeom_RectangularTrimmedSurface_U2(swigCPtr, this);
  }

  public void SetV1(double aV1) {
    OCCwrapJavaJNI.StepGeom_RectangularTrimmedSurface_SetV1(swigCPtr, this, aV1);
  }

  public double V1() {
    return OCCwrapJavaJNI.StepGeom_RectangularTrimmedSurface_V1(swigCPtr, this);
  }

  public void SetV2(double aV2) {
    OCCwrapJavaJNI.StepGeom_RectangularTrimmedSurface_SetV2(swigCPtr, this, aV2);
  }

  public double V2() {
    return OCCwrapJavaJNI.StepGeom_RectangularTrimmedSurface_V2(swigCPtr, this);
  }

  public void SetUsense(long aUsense) {
    OCCwrapJavaJNI.StepGeom_RectangularTrimmedSurface_SetUsense(swigCPtr, this, aUsense);
  }

  public long Usense() {
    return OCCwrapJavaJNI.StepGeom_RectangularTrimmedSurface_Usense(swigCPtr, this);
  }

  public void SetVsense(long aVsense) {
    OCCwrapJavaJNI.StepGeom_RectangularTrimmedSurface_SetVsense(swigCPtr, this, aVsense);
  }

  public long Vsense() {
    return OCCwrapJavaJNI.StepGeom_RectangularTrimmedSurface_Vsense(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_RectangularTrimmedSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_RectangularTrimmedSurface_get_type_descriptor(), true );
  }

  public static  StepGeom_RectangularTrimmedSurface  DownCast( Standard_Transient  T) {
    return new StepGeom_RectangularTrimmedSurface ( OCCwrapJavaJNI.StepGeom_RectangularTrimmedSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_RectangularTrimmedSurface_TypeOf(), true );
  }

}
