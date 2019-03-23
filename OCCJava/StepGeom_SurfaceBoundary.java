package opencascade;

/**
 *  Representation of STEP SELECT type SurfaceBoundary
 */
public class StepGeom_SurfaceBoundary extends StepData_SelectType {

  private long swigCPtr;
  StepGeom_SurfaceBoundary(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.StepGeom_SurfaceBoundary_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  StepGeom_SurfaceBoundary(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.StepGeom_SurfaceBoundary_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(StepGeom_SurfaceBoundary obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepGeom_SurfaceBoundary(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Empty constructor
   */
  public StepGeom_SurfaceBoundary() {
    this(OCCwrapJavaJNI.new_StepGeom_SurfaceBoundary(), true);
  }

  public  StepGeom_BoundaryCurve  BoundaryCurve() {
    return new StepGeom_BoundaryCurve ( OCCwrapJavaJNI.StepGeom_SurfaceBoundary_BoundaryCurve(swigCPtr, this), true );
  }

  public  StepGeom_DegeneratePcurve  DegeneratePcurve() {
    return new StepGeom_DegeneratePcurve ( OCCwrapJavaJNI.StepGeom_SurfaceBoundary_DegeneratePcurve(swigCPtr, this), true );
  }

}
