package opencascade;

public class StepShape_GeometricSetSelect extends StepData_SelectType {

  private long swigCPtr;
  StepShape_GeometricSetSelect(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.StepShape_GeometricSetSelect_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  StepShape_GeometricSetSelect(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.StepShape_GeometricSetSelect_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(StepShape_GeometricSetSelect obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepShape_GeometricSetSelect(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Returns a GeometricSetSelect SelectType
   */
  public StepShape_GeometricSetSelect() {
    this(OCCwrapJavaJNI.new_StepShape_GeometricSetSelect(), true);
  }

  public  StepGeom_Point  Point() {
    return new StepGeom_Point ( OCCwrapJavaJNI.StepShape_GeometricSetSelect_Point(swigCPtr, this), true );
  }

  public  StepGeom_Curve  Curve() {
    return new StepGeom_Curve ( OCCwrapJavaJNI.StepShape_GeometricSetSelect_Curve(swigCPtr, this), true );
  }

  public  StepGeom_Surface  Surface() {
    return new StepGeom_Surface ( OCCwrapJavaJNI.StepShape_GeometricSetSelect_Surface(swigCPtr, this), true );
  }

}
