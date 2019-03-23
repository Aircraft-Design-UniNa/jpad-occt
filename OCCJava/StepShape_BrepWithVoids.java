package opencascade;

public class StepShape_BrepWithVoids extends StepShape_ManifoldSolidBrep {
  StepShape_BrepWithVoids(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a BrepWithVoids
   */
  public StepShape_BrepWithVoids() {
    this(OCCwrapJavaJNI.new_StepShape_BrepWithVoids(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepShape_ClosedShell  aOuter,  StepShape_HArray1OfOrientedClosedShell  aVoids) {
    OCCwrapJavaJNI.StepShape_BrepWithVoids_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepShape_ClosedShell.getCPtr(aOuter) , aOuter,  StepShape_HArray1OfOrientedClosedShell.getCPtr(aVoids) , aVoids);
  }

  public void SetVoids( StepShape_HArray1OfOrientedClosedShell  aVoids) {
    OCCwrapJavaJNI.StepShape_BrepWithVoids_SetVoids(swigCPtr, this,  StepShape_HArray1OfOrientedClosedShell.getCPtr(aVoids) , aVoids);
  }

  public  StepShape_HArray1OfOrientedClosedShell  Voids() {
    return new StepShape_HArray1OfOrientedClosedShell ( OCCwrapJavaJNI.StepShape_BrepWithVoids_Voids(swigCPtr, this), true );
  }

  public  StepShape_OrientedClosedShell  VoidsValue(int num) {
    return new StepShape_OrientedClosedShell ( OCCwrapJavaJNI.StepShape_BrepWithVoids_VoidsValue(swigCPtr, this, num), true );
  }

  public int NbVoids() {
    return OCCwrapJavaJNI.StepShape_BrepWithVoids_NbVoids(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_BrepWithVoids_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_BrepWithVoids_get_type_descriptor(), true );
  }

  public static  StepShape_BrepWithVoids  DownCast( Standard_Transient  T) {
    return new StepShape_BrepWithVoids ( OCCwrapJavaJNI.StepShape_BrepWithVoids_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_BrepWithVoids_TypeOf(), true );
  }

}
