package opencascade;

/**
 *  Translate STEP entity composite_curve to TopoDS_Wire
 *  If surface is given, the curve is assumed to lie on that
 *  surface and in case if any segment of it is a
 *  curve_on_surface, the pcurve for that segment will be taken.
 *  Note: a segment of composite_curve may be itself
 *  composite_curve. Only one-level protection against
 *  cyclic references is implemented.
 */
public class StepToTopoDS_TranslateCompositeCurve extends StepToTopoDS_Root {

  private long swigCPtr;
  StepToTopoDS_TranslateCompositeCurve(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_TranslateCompositeCurve_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  StepToTopoDS_TranslateCompositeCurve(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_TranslateCompositeCurve_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(StepToTopoDS_TranslateCompositeCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_TranslateCompositeCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Empty constructor
   */
  public StepToTopoDS_TranslateCompositeCurve() {
    this(OCCwrapJavaJNI.new_StepToTopoDS_TranslateCompositeCurve__SWIG_0(), true);
  }

  /**
   *  Translates standalone composite_curve
   */
  public StepToTopoDS_TranslateCompositeCurve( StepGeom_CompositeCurve  CC,  Transfer_TransientProcess  TP) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_TranslateCompositeCurve__SWIG_1( StepGeom_CompositeCurve.getCPtr(CC) , CC,  Transfer_TransientProcess.getCPtr(TP) , TP), true);
  }

  /**
   *  Translates composite_curve lying on surface
   */
  public StepToTopoDS_TranslateCompositeCurve( StepGeom_CompositeCurve  CC,  Transfer_TransientProcess  TP,  StepGeom_Surface  S,  Geom_Surface  Surf) {
    this(OCCwrapJavaJNI.new_StepToTopoDS_TranslateCompositeCurve__SWIG_2( StepGeom_CompositeCurve.getCPtr(CC) , CC,  Transfer_TransientProcess.getCPtr(TP) , TP,  StepGeom_Surface.getCPtr(S) , S,  Geom_Surface.getCPtr(Surf) , Surf), true);
  }

  /**
   *  Translates standalone composite_curve
   */
  public long Init( StepGeom_CompositeCurve  CC,  Transfer_TransientProcess  TP) {
    return OCCwrapJavaJNI.StepToTopoDS_TranslateCompositeCurve_Init__SWIG_0(swigCPtr, this,  StepGeom_CompositeCurve.getCPtr(CC) , CC,  Transfer_TransientProcess.getCPtr(TP) , TP);
  }

  /**
   *  Translates composite_curve lying on surface
   */
  public long Init( StepGeom_CompositeCurve  CC,  Transfer_TransientProcess  TP,  StepGeom_Surface  S,  Geom_Surface  Surf) {
    return OCCwrapJavaJNI.StepToTopoDS_TranslateCompositeCurve_Init__SWIG_1(swigCPtr, this,  StepGeom_CompositeCurve.getCPtr(CC) , CC,  Transfer_TransientProcess.getCPtr(TP) , TP,  StepGeom_Surface.getCPtr(S) , S,  Geom_Surface.getCPtr(Surf) , Surf);
  }

  /**
   *  Returns result of last translation or null wire if failed.
   */
  public  TopoDS_Wire  Value() {
    TopoDS_Wire ret = new TopoDS_Wire(OCCwrapJavaJNI.StepToTopoDS_TranslateCompositeCurve_Value(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns True if composite_curve contains a segment with infinite parameters.
   */
  public long IsInfiniteSegment() {
    return OCCwrapJavaJNI.StepToTopoDS_TranslateCompositeCurve_IsInfiniteSegment(swigCPtr, this);
  }

}
