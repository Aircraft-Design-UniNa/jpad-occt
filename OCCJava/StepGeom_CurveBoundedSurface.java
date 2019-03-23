package opencascade;

/**
 *  Representation of STEP entity CurveBoundedSurface
 */
public class StepGeom_CurveBoundedSurface extends StepGeom_BoundedSurface {
  StepGeom_CurveBoundedSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor
   */
  public StepGeom_CurveBoundedSurface() {
    this(OCCwrapJavaJNI.new_StepGeom_CurveBoundedSurface(), true);
  }

  /**
   *  Initialize all fields (own and inherited)
   */
  public void Init( TCollection_HAsciiString  aRepresentationItem_Name,  StepGeom_Surface  aBasisSurface,  StepGeom_HArray1OfSurfaceBoundary  aBoundaries, long aImplicitOuter) {
    OCCwrapJavaJNI.StepGeom_CurveBoundedSurface_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aRepresentationItem_Name) , aRepresentationItem_Name,  StepGeom_Surface.getCPtr(aBasisSurface) , aBasisSurface,  StepGeom_HArray1OfSurfaceBoundary.getCPtr(aBoundaries) , aBoundaries, aImplicitOuter);
  }

  public  StepGeom_Surface  BasisSurface() {
    return new StepGeom_Surface ( OCCwrapJavaJNI.StepGeom_CurveBoundedSurface_BasisSurface(swigCPtr, this), true );
  }

  /**
   *  Set field BasisSurface
   */
  public void SetBasisSurface( StepGeom_Surface  BasisSurface) {
    OCCwrapJavaJNI.StepGeom_CurveBoundedSurface_SetBasisSurface(swigCPtr, this,  StepGeom_Surface.getCPtr(BasisSurface) , BasisSurface);
  }

  public  StepGeom_HArray1OfSurfaceBoundary  Boundaries() {
    return new StepGeom_HArray1OfSurfaceBoundary ( OCCwrapJavaJNI.StepGeom_CurveBoundedSurface_Boundaries(swigCPtr, this), true );
  }

  /**
   *  Set field Boundaries
   */
  public void SetBoundaries( StepGeom_HArray1OfSurfaceBoundary  Boundaries) {
    OCCwrapJavaJNI.StepGeom_CurveBoundedSurface_SetBoundaries(swigCPtr, this,  StepGeom_HArray1OfSurfaceBoundary.getCPtr(Boundaries) , Boundaries);
  }

  /**
   *  Returns field ImplicitOuter
   */
  public long ImplicitOuter() {
    return OCCwrapJavaJNI.StepGeom_CurveBoundedSurface_ImplicitOuter(swigCPtr, this);
  }

  /**
   *  Set field ImplicitOuter
   */
  public void SetImplicitOuter(long ImplicitOuter) {
    OCCwrapJavaJNI.StepGeom_CurveBoundedSurface_SetImplicitOuter(swigCPtr, this, ImplicitOuter);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_CurveBoundedSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_CurveBoundedSurface_get_type_descriptor(), true );
  }

  public static  StepGeom_CurveBoundedSurface  DownCast( Standard_Transient  T) {
    return new StepGeom_CurveBoundedSurface ( OCCwrapJavaJNI.StepGeom_CurveBoundedSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_CurveBoundedSurface_TypeOf(), true );
  }

}
