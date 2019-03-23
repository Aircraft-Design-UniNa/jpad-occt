package opencascade;

/**
 *  Removes all locations sub-shapes of specified shape
 */
public class ShapeUpgrade_RemoveLocations extends Standard_Transient {
  ShapeUpgrade_RemoveLocations(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empy constructor
   */
  public ShapeUpgrade_RemoveLocations() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_RemoveLocations(), true);
  }

  /**
   *  Removes all location correspodingly to RemoveLevel.
   */
  public long Remove( TopoDS_Shape  theShape) {
    return OCCwrapJavaJNI.ShapeUpgrade_RemoveLocations_Remove(swigCPtr, this, TopoDS_Shape.getCPtr(theShape), theShape);
  }

  /**
   *  Returns shape with removed locatins.
   */
  public TopoDS_Shape GetResult() {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeUpgrade_RemoveLocations_GetResult(swigCPtr, this), true);
  }

  /**
   *  sets level starting with that location will be removed,
   *  by default TopAbs_SHAPE. In this case locations will be kept for specified shape
   *  and if specified shape is TopAbs_COMPOUND for sub-shapes of first level.
   */
  public void SetRemoveLevel(TopAbs_ShapeEnum theLevel) {
    OCCwrapJavaJNI.ShapeUpgrade_RemoveLocations_SetRemoveLevel(swigCPtr, this, theLevel.swigValue());
  }

  /**
   *  sets level starting with that location will be removed.Value of level can be set to
   *  TopAbs_SHAPE,TopAbs_COMPOUND,TopAbs_SOLID,TopAbs_SHELL,TopAbs_FACE.By default TopAbs_SHAPE.
   *  In this case location will be removed for all shape types for exception of compound.
   */
  public TopAbs_ShapeEnum RemoveLevel() {
    return TopAbs_ShapeEnum.swigToEnum(OCCwrapJavaJNI.ShapeUpgrade_RemoveLocations_RemoveLevel(swigCPtr, this));
  }

  /**
   *  Returns modified shape obtained from initial shape.
   */
  public TopoDS_Shape ModifiedShape( TopoDS_Shape  theInitShape) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeUpgrade_RemoveLocations_ModifiedShape(swigCPtr, this, TopoDS_Shape.getCPtr(theInitShape), theInitShape), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_RemoveLocations_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_RemoveLocations_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_RemoveLocations  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_RemoveLocations ( OCCwrapJavaJNI.ShapeUpgrade_RemoveLocations_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_RemoveLocations_TypeOf(), true );
  }

}
