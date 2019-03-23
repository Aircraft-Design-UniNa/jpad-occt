package opencascade;

public class StepGeom_TrimmedCurve extends StepGeom_BoundedCurve {
  StepGeom_TrimmedCurve(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a TrimmedCurve
   */
  public StepGeom_TrimmedCurve() {
    this(OCCwrapJavaJNI.new_StepGeom_TrimmedCurve(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_Curve  aBasisCurve,  StepGeom_HArray1OfTrimmingSelect  aTrim1,  StepGeom_HArray1OfTrimmingSelect  aTrim2, long aSenseAgreement, StepGeom_TrimmingPreference aMasterRepresentation) {
    OCCwrapJavaJNI.StepGeom_TrimmedCurve_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_Curve.getCPtr(aBasisCurve) , aBasisCurve,  StepGeom_HArray1OfTrimmingSelect.getCPtr(aTrim1) , aTrim1,  StepGeom_HArray1OfTrimmingSelect.getCPtr(aTrim2) , aTrim2, aSenseAgreement, aMasterRepresentation.swigValue());
  }

  public void SetBasisCurve( StepGeom_Curve  aBasisCurve) {
    OCCwrapJavaJNI.StepGeom_TrimmedCurve_SetBasisCurve(swigCPtr, this,  StepGeom_Curve.getCPtr(aBasisCurve) , aBasisCurve);
  }

  public  StepGeom_Curve  BasisCurve() {
    return new StepGeom_Curve ( OCCwrapJavaJNI.StepGeom_TrimmedCurve_BasisCurve(swigCPtr, this), true );
  }

  public void SetTrim1( StepGeom_HArray1OfTrimmingSelect  aTrim1) {
    OCCwrapJavaJNI.StepGeom_TrimmedCurve_SetTrim1(swigCPtr, this,  StepGeom_HArray1OfTrimmingSelect.getCPtr(aTrim1) , aTrim1);
  }

  public  StepGeom_HArray1OfTrimmingSelect  Trim1() {
    return new StepGeom_HArray1OfTrimmingSelect ( OCCwrapJavaJNI.StepGeom_TrimmedCurve_Trim1(swigCPtr, this), true );
  }

  public StepGeom_TrimmingSelect Trim1Value(int num) {
    return new StepGeom_TrimmingSelect(OCCwrapJavaJNI.StepGeom_TrimmedCurve_Trim1Value(swigCPtr, this, num), true);
  }

  public int NbTrim1() {
    return OCCwrapJavaJNI.StepGeom_TrimmedCurve_NbTrim1(swigCPtr, this);
  }

  public void SetTrim2( StepGeom_HArray1OfTrimmingSelect  aTrim2) {
    OCCwrapJavaJNI.StepGeom_TrimmedCurve_SetTrim2(swigCPtr, this,  StepGeom_HArray1OfTrimmingSelect.getCPtr(aTrim2) , aTrim2);
  }

  public  StepGeom_HArray1OfTrimmingSelect  Trim2() {
    return new StepGeom_HArray1OfTrimmingSelect ( OCCwrapJavaJNI.StepGeom_TrimmedCurve_Trim2(swigCPtr, this), true );
  }

  public StepGeom_TrimmingSelect Trim2Value(int num) {
    return new StepGeom_TrimmingSelect(OCCwrapJavaJNI.StepGeom_TrimmedCurve_Trim2Value(swigCPtr, this, num), true);
  }

  public int NbTrim2() {
    return OCCwrapJavaJNI.StepGeom_TrimmedCurve_NbTrim2(swigCPtr, this);
  }

  public void SetSenseAgreement(long aSenseAgreement) {
    OCCwrapJavaJNI.StepGeom_TrimmedCurve_SetSenseAgreement(swigCPtr, this, aSenseAgreement);
  }

  public long SenseAgreement() {
    return OCCwrapJavaJNI.StepGeom_TrimmedCurve_SenseAgreement(swigCPtr, this);
  }

  public void SetMasterRepresentation(StepGeom_TrimmingPreference aMasterRepresentation) {
    OCCwrapJavaJNI.StepGeom_TrimmedCurve_SetMasterRepresentation(swigCPtr, this, aMasterRepresentation.swigValue());
  }

  public StepGeom_TrimmingPreference MasterRepresentation() {
    return StepGeom_TrimmingPreference.swigToEnum(OCCwrapJavaJNI.StepGeom_TrimmedCurve_MasterRepresentation(swigCPtr, this));
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_TrimmedCurve_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_TrimmedCurve_get_type_descriptor(), true );
  }

  public static  StepGeom_TrimmedCurve  DownCast( Standard_Transient  T) {
    return new StepGeom_TrimmedCurve ( OCCwrapJavaJNI.StepGeom_TrimmedCurve_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_TrimmedCurve_TypeOf(), true );
  }

}
