package opencascade;

/**
 *  Removes all internal wires having area less than specified min area
 */
public class ShapeUpgrade_RemoveInternalWires extends ShapeUpgrade_Tool {
  ShapeUpgrade_RemoveInternalWires(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates empty  constructor.
   */
  public ShapeUpgrade_RemoveInternalWires() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_RemoveInternalWires__SWIG_0(), true);
  }

  public ShapeUpgrade_RemoveInternalWires( TopoDS_Shape  theShape) {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_RemoveInternalWires__SWIG_1(TopoDS_Shape.getCPtr(theShape), theShape), true);
  }

  /**
   *  Initialize by a Shape.
   */
  public void Init( TopoDS_Shape  theShape) {
    OCCwrapJavaJNI.ShapeUpgrade_RemoveInternalWires_Init(swigCPtr, this, TopoDS_Shape.getCPtr(theShape), theShape);
  }

  /**
   *  Removes all internal wires having area less than area specified as minimal allowed area
   */
  public long Perform() {
    return OCCwrapJavaJNI.ShapeUpgrade_RemoveInternalWires_Perform__SWIG_0(swigCPtr, this);
  }

  /**
   *  If specified sequence of shape contains -
   *  1.wires then these wires will be removed if they have area less than allowed min area.
   *  2.faces than internal wires from these faces will be removed if they have area less than allowed min area.
   */
  public long Perform( TopTools_SequenceOfShape  theSeqShapes) {
    return OCCwrapJavaJNI.ShapeUpgrade_RemoveInternalWires_Perform__SWIG_1(swigCPtr, this, TopTools_SequenceOfShape.getCPtr(theSeqShapes), theSeqShapes);
  }

  /**
   *  Get result shape
   */
  public TopoDS_Shape GetResult() {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeUpgrade_RemoveInternalWires_GetResult(swigCPtr, this), true);
  }

  public double[] MinArea() {return OCCwrapJavaJNI.ShapeUpgrade_RemoveInternalWires_MinArea(swigCPtr, this);}

  public long[] RemoveFaceMode() {return OCCwrapJavaJNI.ShapeUpgrade_RemoveInternalWires_RemoveFaceMode(swigCPtr, this);}

  /**
   *  Returns sequence of removed faces.
   */
  public  TopTools_SequenceOfShape  RemovedFaces() {
    TopTools_SequenceOfShape ret = new TopTools_SequenceOfShape(OCCwrapJavaJNI.ShapeUpgrade_RemoveInternalWires_RemovedFaces(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns sequence of removed faces.
   */
  public  TopTools_SequenceOfShape  RemovedWires() {
    TopTools_SequenceOfShape ret = new TopTools_SequenceOfShape(OCCwrapJavaJNI.ShapeUpgrade_RemoveInternalWires_RemovedWires(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Queries status of last call to Perform()
   *  : OK - nothing was done
   *  :DONE1 - internal wires were removed
   *  :DONE2 - small faces were removed.
   *  :FAIL1 - initial shape is not specified
   *  :FAIL2 - specified sub-shape is not belonged to inotial shape.
   */
  public long Status(ShapeExtend_Status theStatus) {
    return OCCwrapJavaJNI.ShapeUpgrade_RemoveInternalWires_Status(swigCPtr, this, theStatus.swigValue());
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_RemoveInternalWires_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_RemoveInternalWires_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_RemoveInternalWires  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_RemoveInternalWires ( OCCwrapJavaJNI.ShapeUpgrade_RemoveInternalWires_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_RemoveInternalWires_TypeOf(), true );
  }

}
