package opencascade;

public class BRepAlgoAPI_Algo extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepAlgoAPI_Algo(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepAlgoAPI_Algo_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepAlgoAPI_Algo(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepAlgoAPI_Algo_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepAlgoAPI_Algo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void Clear() {
    OCCwrapJavaJNI.BRepAlgoAPI_Algo_Clear(swigCPtr, this);
  }

  public void SetRunParallel(long theFlag) {
    OCCwrapJavaJNI.BRepAlgoAPI_Algo_SetRunParallel(swigCPtr, this, theFlag);
  }

  public long RunParallel() {
    return OCCwrapJavaJNI.BRepAlgoAPI_Algo_RunParallel(swigCPtr, this);
  }

  public void SetFuzzyValue(double theFuzz) {
    OCCwrapJavaJNI.BRepAlgoAPI_Algo_SetFuzzyValue(swigCPtr, this, theFuzz);
  }

  public double FuzzyValue() {
    return OCCwrapJavaJNI.BRepAlgoAPI_Algo_FuzzyValue(swigCPtr, this);
  }

  public long HasErrors() {
    return OCCwrapJavaJNI.BRepAlgoAPI_Algo_HasErrors(swigCPtr, this);
  }

  public long HasWarnings() {
    return OCCwrapJavaJNI.BRepAlgoAPI_Algo_HasWarnings(swigCPtr, this);
  }

  public long HasError( Standard_Type  theType) {
    return OCCwrapJavaJNI.BRepAlgoAPI_Algo_HasError(swigCPtr, this,  Standard_Type.getCPtr(theType) , theType);
  }

  public long HasWarning( Standard_Type  theType) {
    return OCCwrapJavaJNI.BRepAlgoAPI_Algo_HasWarning(swigCPtr, this,  Standard_Type.getCPtr(theType) , theType);
  }

  public void DumpErrors(SWIGTYPE_p_Standard_OStream theOS) {
    OCCwrapJavaJNI.BRepAlgoAPI_Algo_DumpErrors(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(theOS));
  }

  public void DumpWarnings(SWIGTYPE_p_Standard_OStream theOS) {
    OCCwrapJavaJNI.BRepAlgoAPI_Algo_DumpWarnings(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(theOS));
  }

  public void ClearWarnings() {
    OCCwrapJavaJNI.BRepAlgoAPI_Algo_ClearWarnings(swigCPtr, this);
  }

  public SWIGTYPE_p_opencascade__handleT_Message_Report_t GetReport() {
    return new SWIGTYPE_p_opencascade__handleT_Message_Report_t(OCCwrapJavaJNI.BRepAlgoAPI_Algo_GetReport(swigCPtr, this), false);
  }

  public void SetProgressIndicator( Message_ProgressIndicator  theObj) {
    OCCwrapJavaJNI.BRepAlgoAPI_Algo_SetProgressIndicator(swigCPtr, this,  Message_ProgressIndicator.getCPtr(theObj) , theObj);
  }

  public void SetUseOBB(long theUseOBB) {
    OCCwrapJavaJNI.BRepAlgoAPI_Algo_SetUseOBB(swigCPtr, this, theUseOBB);
  }

}
