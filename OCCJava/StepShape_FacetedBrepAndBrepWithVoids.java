package opencascade;

public class StepShape_FacetedBrepAndBrepWithVoids extends StepShape_ManifoldSolidBrep {
  StepShape_FacetedBrepAndBrepWithVoids(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a FacetedBrepAndBrepWithVoids
   */
  public StepShape_FacetedBrepAndBrepWithVoids() {
    this(OCCwrapJavaJNI.new_StepShape_FacetedBrepAndBrepWithVoids(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepShape_ClosedShell  aOuter,  StepShape_FacetedBrep  aFacetedBrep,  StepShape_BrepWithVoids  aBrepWithVoids) {
    OCCwrapJavaJNI.StepShape_FacetedBrepAndBrepWithVoids_Init__SWIG_0(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepShape_ClosedShell.getCPtr(aOuter) , aOuter,  StepShape_FacetedBrep.getCPtr(aFacetedBrep) , aFacetedBrep,  StepShape_BrepWithVoids.getCPtr(aBrepWithVoids) , aBrepWithVoids);
  }

  public void Init( TCollection_HAsciiString  aName,  StepShape_ClosedShell  aOuter,  StepShape_HArray1OfOrientedClosedShell  aVoids) {
    OCCwrapJavaJNI.StepShape_FacetedBrepAndBrepWithVoids_Init__SWIG_1(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepShape_ClosedShell.getCPtr(aOuter) , aOuter,  StepShape_HArray1OfOrientedClosedShell.getCPtr(aVoids) , aVoids);
  }

  public void SetFacetedBrep( StepShape_FacetedBrep  aFacetedBrep) {
    OCCwrapJavaJNI.StepShape_FacetedBrepAndBrepWithVoids_SetFacetedBrep(swigCPtr, this,  StepShape_FacetedBrep.getCPtr(aFacetedBrep) , aFacetedBrep);
  }

  public  StepShape_FacetedBrep  FacetedBrep() {
    return new StepShape_FacetedBrep ( OCCwrapJavaJNI.StepShape_FacetedBrepAndBrepWithVoids_FacetedBrep(swigCPtr, this), true );
  }

  public void SetBrepWithVoids( StepShape_BrepWithVoids  aBrepWithVoids) {
    OCCwrapJavaJNI.StepShape_FacetedBrepAndBrepWithVoids_SetBrepWithVoids(swigCPtr, this,  StepShape_BrepWithVoids.getCPtr(aBrepWithVoids) , aBrepWithVoids);
  }

  public  StepShape_BrepWithVoids  BrepWithVoids() {
    return new StepShape_BrepWithVoids ( OCCwrapJavaJNI.StepShape_FacetedBrepAndBrepWithVoids_BrepWithVoids(swigCPtr, this), true );
  }

  public void SetVoids( StepShape_HArray1OfOrientedClosedShell  aVoids) {
    OCCwrapJavaJNI.StepShape_FacetedBrepAndBrepWithVoids_SetVoids(swigCPtr, this,  StepShape_HArray1OfOrientedClosedShell.getCPtr(aVoids) , aVoids);
  }

  public  StepShape_HArray1OfOrientedClosedShell  Voids() {
    return new StepShape_HArray1OfOrientedClosedShell ( OCCwrapJavaJNI.StepShape_FacetedBrepAndBrepWithVoids_Voids(swigCPtr, this), true );
  }

  public  StepShape_OrientedClosedShell  VoidsValue(int num) {
    return new StepShape_OrientedClosedShell ( OCCwrapJavaJNI.StepShape_FacetedBrepAndBrepWithVoids_VoidsValue(swigCPtr, this, num), true );
  }

  public int NbVoids() {
    return OCCwrapJavaJNI.StepShape_FacetedBrepAndBrepWithVoids_NbVoids(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_FacetedBrepAndBrepWithVoids_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_FacetedBrepAndBrepWithVoids_get_type_descriptor(), true );
  }

  public static  StepShape_FacetedBrepAndBrepWithVoids  DownCast( Standard_Transient  T) {
    return new StepShape_FacetedBrepAndBrepWithVoids ( OCCwrapJavaJNI.StepShape_FacetedBrepAndBrepWithVoids_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_FacetedBrepAndBrepWithVoids_TypeOf(), true );
  }

}
