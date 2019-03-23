package opencascade;

/**
 *  Applies one of the sequence read from resource file.
 */
public class ShapeProcessAPI_ApplySequence {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeProcessAPI_ApplySequence(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeProcessAPI_ApplySequence(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeProcessAPI_ApplySequence obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeProcessAPI_ApplySequence(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates an object and loads resource file and sequence of
   *  operators given by their names.
   */
  public ShapeProcessAPI_ApplySequence(String rscName, String seqName) {
    this(OCCwrapJavaJNI.new_ShapeProcessAPI_ApplySequence__SWIG_0(rscName, seqName), true);
  }

  public ShapeProcessAPI_ApplySequence(String rscName) {
    this(OCCwrapJavaJNI.new_ShapeProcessAPI_ApplySequence__SWIG_1(rscName), true);
  }

  public  ShapeProcess_ShapeContext  Context() {
    return new ShapeProcess_ShapeContext ( OCCwrapJavaJNI.ShapeProcessAPI_ApplySequence_Context(swigCPtr, this), true );
  }

  /**
   *  Performs sequence of operators stored in myRsc.
   *  If <fillmap> is True adds history "shape-shape" into myMap
   *  for shape and its subshapes until level <until> (included).
   *  If <until> is TopAbs_SHAPE,  all the subshapes are considered.
   */
  public TopoDS_Shape PrepareShape( TopoDS_Shape  shape, long fillmap, TopAbs_ShapeEnum until) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeProcessAPI_ApplySequence_PrepareShape__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, fillmap, until.swigValue()), true);
  }

  public TopoDS_Shape PrepareShape( TopoDS_Shape  shape, long fillmap) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeProcessAPI_ApplySequence_PrepareShape__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape, fillmap), true);
  }

  public TopoDS_Shape PrepareShape( TopoDS_Shape  shape) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeProcessAPI_ApplySequence_PrepareShape__SWIG_2(swigCPtr, this, TopoDS_Shape.getCPtr(shape), shape), true);
  }

  /**
   *  Clears myMap with accumulated history.
   */
  public void ClearMap() {
    OCCwrapJavaJNI.ShapeProcessAPI_ApplySequence_ClearMap(swigCPtr, this);
  }

  /**
   *  Returns myMap with accumulated history.
   */
  public  TopTools_DataMapOfShapeShape  Map() {
    TopTools_DataMapOfShapeShape ret = new TopTools_DataMapOfShapeShape(OCCwrapJavaJNI.ShapeProcessAPI_ApplySequence_Map(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Prints result of preparation onto the messenger of the context.
   *  Note that results can be accumulated from previous preparations
   *  it method ClearMap was not called before PrepareShape.
   */
  public void PrintPreparationResult() {
    OCCwrapJavaJNI.ShapeProcessAPI_ApplySequence_PrintPreparationResult(swigCPtr, this);
  }

}
