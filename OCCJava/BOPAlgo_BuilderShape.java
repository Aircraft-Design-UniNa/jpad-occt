package opencascade;

/**
 *  Root class for algorithms that has shape as result.
 *  The class provides the History mechanism, which allows
 *  tracking the modification of the input shapes during
 *  the operation.
 */
public class BOPAlgo_BuilderShape extends BOPAlgo_Algo {

  private long swigCPtr;
  BOPAlgo_BuilderShape(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BOPAlgo_BuilderShape_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BOPAlgo_BuilderShape(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BOPAlgo_BuilderShape_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BOPAlgo_BuilderShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Returns the result of algorithm
   */
  public  TopoDS_Shape  Shape() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BOPAlgo_BuilderShape_Shape(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the list of shapes generated from the
   *  shape theS.
   */
  public  TopTools_ListOfShape  Generated( TopoDS_Shape  theS) {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BOPAlgo_BuilderShape_Generated(swigCPtr, this, TopoDS_Shape.getCPtr(theS), theS), false, this);
    return ret;
  }

  /**
   *  Returns the list of shapes modified from the
   *  shape theS.
   */
  public  TopTools_ListOfShape  Modified( TopoDS_Shape  theS) {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BOPAlgo_BuilderShape_Modified(swigCPtr, this, TopoDS_Shape.getCPtr(theS), theS), false, this);
    return ret;
  }

  /**
   *  Returns true if the shape theS has been deleted.
   */
  public long IsDeleted( TopoDS_Shape  theS) {
    return OCCwrapJavaJNI.BOPAlgo_BuilderShape_IsDeleted(swigCPtr, this, TopoDS_Shape.getCPtr(theS), theS);
  }

  /**
   *  Returns true if the at least one shape(or subshape)
   *  of arguments has been deleted.
   */
  public long HasDeleted() {
    return OCCwrapJavaJNI.BOPAlgo_BuilderShape_HasDeleted(swigCPtr, this);
  }

  /**
   *  Returns true if the at least one shape(or subshape)
   *  of arguments has generated shapes.
   */
  public long HasGenerated() {
    return OCCwrapJavaJNI.BOPAlgo_BuilderShape_HasGenerated(swigCPtr, this);
  }

  /**
   *  Returns true if the at least one shape(or subshape)
   *  of arguments has modified shapes.
   */
  public long HasModified() {
    return OCCwrapJavaJNI.BOPAlgo_BuilderShape_HasModified(swigCPtr, this);
  }

  public  TopTools_IndexedDataMapOfShapeListOfShape  ImagesResult() {
    TopTools_IndexedDataMapOfShapeListOfShape ret = new TopTools_IndexedDataMapOfShapeListOfShape(OCCwrapJavaJNI.BOPAlgo_BuilderShape_ImagesResult(swigCPtr, this), false, this);
    return ret;
  }

}
