package opencascade;

public class StepGeom_DegeneratePcurve extends StepGeom_Point {
  StepGeom_DegeneratePcurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a DegeneratePcurve
   */
  public StepGeom_DegeneratePcurve() {
    this(OCCwrapJavaJNI.new_StepGeom_DegeneratePcurve(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_Surface  aBasisSurface,  StepRepr_DefinitionalRepresentation  aReferenceToCurve) {
    OCCwrapJavaJNI.StepGeom_DegeneratePcurve_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_Surface.getCPtr(aBasisSurface) , aBasisSurface,  StepRepr_DefinitionalRepresentation.getCPtr(aReferenceToCurve) , aReferenceToCurve);
  }

  public void SetBasisSurface( StepGeom_Surface  aBasisSurface) {
    OCCwrapJavaJNI.StepGeom_DegeneratePcurve_SetBasisSurface(swigCPtr, this,  StepGeom_Surface.getCPtr(aBasisSurface) , aBasisSurface);
  }

  public  StepGeom_Surface  BasisSurface() {
    return new StepGeom_Surface ( OCCwrapJavaJNI.StepGeom_DegeneratePcurve_BasisSurface(swigCPtr, this), true );
  }

  public void SetReferenceToCurve( StepRepr_DefinitionalRepresentation  aReferenceToCurve) {
    OCCwrapJavaJNI.StepGeom_DegeneratePcurve_SetReferenceToCurve(swigCPtr, this,  StepRepr_DefinitionalRepresentation.getCPtr(aReferenceToCurve) , aReferenceToCurve);
  }

  public  StepRepr_DefinitionalRepresentation  ReferenceToCurve() {
    return new StepRepr_DefinitionalRepresentation ( OCCwrapJavaJNI.StepGeom_DegeneratePcurve_ReferenceToCurve(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_DegeneratePcurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_DegeneratePcurve_get_type_descriptor(), true );
  }

  public static  StepGeom_DegeneratePcurve  DownCast( Standard_Transient  T) {
    return new StepGeom_DegeneratePcurve ( OCCwrapJavaJNI.StepGeom_DegeneratePcurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_DegeneratePcurve_TypeOf(), true );
  }

}
