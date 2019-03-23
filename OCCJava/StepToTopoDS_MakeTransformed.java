package opencascade;

/**
 *  Produces instances by Transformation of a basic item
 */
public class StepToTopoDS_MakeTransformed extends StepToTopoDS_Root {

  private long swigCPtr;
  StepToTopoDS_MakeTransformed(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_MakeTransformed_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  StepToTopoDS_MakeTransformed(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.StepToTopoDS_MakeTransformed_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(StepToTopoDS_MakeTransformed obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_MakeTransformed(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public StepToTopoDS_MakeTransformed() {
    this(OCCwrapJavaJNI.new_StepToTopoDS_MakeTransformed(), true);
  }

  /**
   *  Computes a transformation to pass from an Origin placement to
   *  a Target placement. Returns True when done
   *  If not done, the transformation will by Identity
   */
  public long Compute( StepGeom_Axis2Placement3d  Origin,  StepGeom_Axis2Placement3d  Target) {
    return OCCwrapJavaJNI.StepToTopoDS_MakeTransformed_Compute__SWIG_0(swigCPtr, this,  StepGeom_Axis2Placement3d.getCPtr(Origin) , Origin,  StepGeom_Axis2Placement3d.getCPtr(Target) , Target);
  }

  /**
   *  Computes a transformation defined by an operator 3D
   */
  public long Compute( StepGeom_CartesianTransformationOperator3d  Operator) {
    return OCCwrapJavaJNI.StepToTopoDS_MakeTransformed_Compute__SWIG_1(swigCPtr, this,  StepGeom_CartesianTransformationOperator3d.getCPtr(Operator) , Operator);
  }

  /**
   *  Returns the computed transformation (Identity if not yet or
   *  if failed)
   */
  public  gp_Trsf  Transformation() {
    gp_Trsf ret = new gp_Trsf(OCCwrapJavaJNI.StepToTopoDS_MakeTransformed_Transformation(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Applies the computed transformation to a shape
   *  Returns False if the transformation is Identity
   */
  public long Transform(TopoDS_Shape shape) {
    return OCCwrapJavaJNI.StepToTopoDS_MakeTransformed_Transform(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape);
  }

  /**
   *  Translates a MappedItem. More precisely
   *  A MappedItem has a MappingSource and a MappingTarget
   *  MappingSource has a MappedRepresentation and a MappingOrigin
   *  MappedRepresentation is the basic item to be instanced
   *  MappingOrigin is the starting placement
   *  MappingTarget is the final placement
   * 
   *  Hence, the transformation from MappingOrigin and MappingTarget
   *  is computed, the MappedRepr. is converted to a Shape, then
   *  transformed as an instance of this Shape
   */
  public TopoDS_Shape TranslateMappedItem( StepRepr_MappedItem  mapit,  Transfer_TransientProcess  TP) {
    return new TopoDS_Shape(OCCwrapJavaJNI.StepToTopoDS_MakeTransformed_TranslateMappedItem(swigCPtr, this,  StepRepr_MappedItem.getCPtr(mapit) , mapit,  Transfer_TransientProcess.getCPtr(TP) , TP), true);
  }

}
