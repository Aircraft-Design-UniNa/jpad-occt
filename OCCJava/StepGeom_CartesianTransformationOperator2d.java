package opencascade;

/**
 *  Added from StepGeom Rev2 to Rev4
 */
public class StepGeom_CartesianTransformationOperator2d extends StepGeom_CartesianTransformationOperator {
  StepGeom_CartesianTransformationOperator2d(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public StepGeom_CartesianTransformationOperator2d() {
    this(OCCwrapJavaJNI.new_StepGeom_CartesianTransformationOperator2d(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator2d_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator2d_get_type_descriptor(), true );
  }

  public static  StepGeom_CartesianTransformationOperator2d  DownCast( Standard_Transient  T) {
    return new StepGeom_CartesianTransformationOperator2d ( OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator2d_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_CartesianTransformationOperator2d_TypeOf(), true );
  }

}
