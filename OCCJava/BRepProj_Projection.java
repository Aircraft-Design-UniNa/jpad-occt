package opencascade;

/**
 *  The  Projection   class provides  conical  and
 *  cylindrical projections of  Edge  or  Wire  on
 *  a Shape from TopoDS. The result will be a Edge
 *  or  Wire  from  TopoDS.
 */
public class BRepProj_Projection {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepProj_Projection(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepProj_Projection(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepProj_Projection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepProj_Projection(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Makes a Cylindrical projection of Wire om Shape
   */
  public BRepProj_Projection( TopoDS_Shape  Wire,  TopoDS_Shape  Shape,  gp_Dir  D) {
    this(OCCwrapJavaJNI.new_BRepProj_Projection__SWIG_0(TopoDS_Shape.getCPtr(Wire), Wire, TopoDS_Shape.getCPtr(Shape), Shape, gp_Dir.getCPtr(D), D), true);
  }

  /**
   *  Makes a Conical projection of Wire om Shape
   */
  public BRepProj_Projection( TopoDS_Shape  Wire,  TopoDS_Shape  Shape,  gp_Pnt  P) {
    this(OCCwrapJavaJNI.new_BRepProj_Projection__SWIG_1(TopoDS_Shape.getCPtr(Wire), Wire, TopoDS_Shape.getCPtr(Shape), Shape, gp_Pnt.getCPtr(P), P), true);
  }

  /**
   *  returns False if the section failed
   */
  public long IsDone() {
    return OCCwrapJavaJNI.BRepProj_Projection_IsDone(swigCPtr, this);
  }

  /**
   *  Resets the iterator by resulting wires.
   */
  public void Init() {
    OCCwrapJavaJNI.BRepProj_Projection_Init(swigCPtr, this);
  }

  /**
   *  Returns True if there is a current result wire
   */
  public long More() {
    return OCCwrapJavaJNI.BRepProj_Projection_More(swigCPtr, this);
  }

  /**
   *  Move to the next result wire.
   */
  public void Next() {
    OCCwrapJavaJNI.BRepProj_Projection_Next(swigCPtr, this);
  }

  /**
   *  Returns the current result wire.
   */
  public TopoDS_Wire Current() {
    return new TopoDS_Wire(OCCwrapJavaJNI.BRepProj_Projection_Current(swigCPtr, this), true);
  }

  /**
   *  Returns the complete result as compound of wires.
   */
  public TopoDS_Compound Shape() {
    return new TopoDS_Compound(OCCwrapJavaJNI.BRepProj_Projection_Shape(swigCPtr, this), true);
  }

}
