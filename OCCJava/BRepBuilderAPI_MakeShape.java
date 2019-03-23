package opencascade;

/**
 *  This    is  the  root     class for     all  shape
 *  constructions.  It stores the result.
 * 
 *  It  provides deferred methods to trace the history
 *  of sub-shapes.
 */
public class BRepBuilderAPI_MakeShape extends BRepBuilderAPI_Command {

  private long swigCPtr;
  BRepBuilderAPI_MakeShape(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_MakeShape_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepBuilderAPI_MakeShape(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_MakeShape_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepBuilderAPI_MakeShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepBuilderAPI_MakeShape(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  This is  called by  Shape().  It does  nothing but
   *  may be redefined.
   */
  public void Build() {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeShape_Build(swigCPtr, this);
  }

  /**
   *  Returns a shape built by the shape construction algorithm.
   *  Raises exception StdFail_NotDone if the shape was not built.
   */
  public  TopoDS_Shape  Shape() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepBuilderAPI_MakeShape_Shape(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the  list   of shapes generated   from the
   *  shape <S>.
   */
  public  TopTools_ListOfShape  Generated( TopoDS_Shape  S) {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BRepBuilderAPI_MakeShape_Generated(swigCPtr, this, TopoDS_Shape.getCPtr(S), S), false, this);
    return ret;
  }

  /**
   *  Returns the list  of shapes modified from the shape
   *  <S>.
   */
  public  TopTools_ListOfShape  Modified( TopoDS_Shape  S) {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BRepBuilderAPI_MakeShape_Modified(swigCPtr, this, TopoDS_Shape.getCPtr(S), S), false, this);
    return ret;
  }

  /**
   *  Returns true if the shape S has been deleted.
   */
  public long IsDeleted( TopoDS_Shape  S) {
    return OCCwrapJavaJNI.BRepBuilderAPI_MakeShape_IsDeleted(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

}
