package opencascade;

/**
 *  The class provides Boolean fusion operation
 *  between arguments and tools  (Boolean Union).
 */
public class BRepAlgoAPI_Fuse extends BRepAlgoAPI_BooleanOperation {

  private long swigCPtr;
  BRepAlgoAPI_Fuse(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepAlgoAPI_Fuse_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepAlgoAPI_Fuse(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepAlgoAPI_Fuse_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepAlgoAPI_Fuse obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepAlgoAPI_Fuse(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Empty constructor
   */
  public BRepAlgoAPI_Fuse() {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Fuse__SWIG_0(), true);
  }

  public BRepAlgoAPI_Fuse( BOPAlgo_PaveFiller  PF) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Fuse__SWIG_1(BOPAlgo_PaveFiller.getCPtr(PF), PF), true);
  }

  /**
   *  Empty constructor
   *  <PF> - PaveFiller object that is carried out
   */
  public BRepAlgoAPI_Fuse( TopoDS_Shape  S1,  TopoDS_Shape  S2) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Fuse__SWIG_2(TopoDS_Shape.getCPtr(S1), S1, TopoDS_Shape.getCPtr(S2), S2), true);
  }

  /**
   *  Constructor with two shapes
   *  <S1>  -argument
   *  <S2>  -tool
   *  <anOperation> - the type of the operation
   *  Obsolete
   */
  public BRepAlgoAPI_Fuse( TopoDS_Shape  S1,  TopoDS_Shape  S2,  BOPAlgo_PaveFiller  aDSF) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Fuse__SWIG_3(TopoDS_Shape.getCPtr(S1), S1, TopoDS_Shape.getCPtr(S2), S2, BOPAlgo_PaveFiller.getCPtr(aDSF), aDSF), true);
  }

}
