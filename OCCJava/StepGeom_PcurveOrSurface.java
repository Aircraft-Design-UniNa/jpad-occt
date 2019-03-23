package opencascade;

public class StepGeom_PcurveOrSurface extends StepData_SelectType {

  private long swigCPtr;
  StepGeom_PcurveOrSurface(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.StepGeom_PcurveOrSurface_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  StepGeom_PcurveOrSurface(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.StepGeom_PcurveOrSurface_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(StepGeom_PcurveOrSurface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepGeom_PcurveOrSurface(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Returns a PcurveOrSurface SelectType
   */
  public StepGeom_PcurveOrSurface() {
    this(OCCwrapJavaJNI.new_StepGeom_PcurveOrSurface(), true);
  }

  public  StepGeom_Pcurve  Pcurve() {
    return new StepGeom_Pcurve ( OCCwrapJavaJNI.StepGeom_PcurveOrSurface_Pcurve(swigCPtr, this), true );
  }

  public  StepGeom_Surface  Surface() {
    return new StepGeom_Surface ( OCCwrapJavaJNI.StepGeom_PcurveOrSurface_Surface(swigCPtr, this), true );
  }

}
