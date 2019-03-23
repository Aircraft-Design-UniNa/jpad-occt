package opencascade;

public class StepGeom_Pcurve extends StepGeom_Curve {
  StepGeom_Pcurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Pcurve
   */
  public StepGeom_Pcurve() {
    this(OCCwrapJavaJNI.new_StepGeom_Pcurve(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_Surface  aBasisSurface,  StepRepr_DefinitionalRepresentation  aReferenceToCurve) {
    OCCwrapJavaJNI.StepGeom_Pcurve_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_Surface.getCPtr(aBasisSurface) , aBasisSurface,  StepRepr_DefinitionalRepresentation.getCPtr(aReferenceToCurve) , aReferenceToCurve);
  }

  public void SetBasisSurface( StepGeom_Surface  aBasisSurface) {
    OCCwrapJavaJNI.StepGeom_Pcurve_SetBasisSurface(swigCPtr, this,  StepGeom_Surface.getCPtr(aBasisSurface) , aBasisSurface);
  }

  public  StepGeom_Surface  BasisSurface() {
    return new StepGeom_Surface ( OCCwrapJavaJNI.StepGeom_Pcurve_BasisSurface(swigCPtr, this), true );
  }

  public void SetReferenceToCurve( StepRepr_DefinitionalRepresentation  aReferenceToCurve) {
    OCCwrapJavaJNI.StepGeom_Pcurve_SetReferenceToCurve(swigCPtr, this,  StepRepr_DefinitionalRepresentation.getCPtr(aReferenceToCurve) , aReferenceToCurve);
  }

  public  StepRepr_DefinitionalRepresentation  ReferenceToCurve() {
    return new StepRepr_DefinitionalRepresentation ( OCCwrapJavaJNI.StepGeom_Pcurve_ReferenceToCurve(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_Pcurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Pcurve_get_type_descriptor(), true );
  }

  public static  StepGeom_Pcurve  DownCast( Standard_Transient  T) {
    return new StepGeom_Pcurve ( OCCwrapJavaJNI.StepGeom_Pcurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Pcurve_TypeOf(), true );
  }

}
