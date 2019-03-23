package opencascade;

public class StepToTopoDS_TranslateShell extends StepToTopoDS_Root {

  private long swigCPtr;
  StepToTopoDS_TranslateShell(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_TranslateShell_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  StepToTopoDS_TranslateShell(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_TranslateShell_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(StepToTopoDS_TranslateShell obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_TranslateShell(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public StepToTopoDS_TranslateShell() {
    this(OCCwrapJavaJNI.new_StepToTopoDS_TranslateShell__SWIG_0(), true);
  }

  public StepToTopoDS_TranslateShell( StepShape_ConnectedFaceSet  CFS, StepToTopoDS_Tool T, StepToTopoDS_NMTool NMTool) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_TranslateShell__SWIG_1( StepShape_ConnectedFaceSet.getCPtr(CFS) , CFS, StepToTopoDS_Tool.getCPtr(T), T, StepToTopoDS_NMTool.getCPtr(NMTool), NMTool), true);
  }

  public void Init( StepShape_ConnectedFaceSet  CFS, StepToTopoDS_Tool T, StepToTopoDS_NMTool NMTool) {
    OCCwrapJavaJNI.StepToTopoDS_TranslateShell_Init(swigCPtr, this,  StepShape_ConnectedFaceSet.getCPtr(CFS) , CFS, StepToTopoDS_Tool.getCPtr(T), T, StepToTopoDS_NMTool.getCPtr(NMTool), NMTool);
  }

  public  TopoDS_Shape  Value() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_TranslateShell_Value(swigCPtr, this), true);
    return ret;
  }

  public StepToTopoDS_TranslateShellError Error() {
    return StepToTopoDS_TranslateShellError.swigToEnum(OCCwrapJavaJNI.StepToTopoDS_TranslateShell_Error(swigCPtr, this));
  }

}
