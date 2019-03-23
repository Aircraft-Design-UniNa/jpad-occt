package opencascade;

/**
 *  The class provides Boolean common operation
 *  between arguments and tools (Boolean Intersection).
 */
public class BRepAlgoAPI_Common extends BRepAlgoAPI_BooleanOperation {

  private long swigCPtr;
  BRepAlgoAPI_Common(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepAlgoAPI_Common_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepAlgoAPI_Common(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepAlgoAPI_Common_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepAlgoAPI_Common obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepAlgoAPI_Common(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Empty constructor
   */
  public BRepAlgoAPI_Common() {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Common__SWIG_0(), true);
  }

  public BRepAlgoAPI_Common( BOPAlgo_PaveFiller  PF) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Common__SWIG_1(BOPAlgo_PaveFiller.getCPtr(PF), PF), true);
  }

  /**
   *  Empty constructor
   *  <PF> - PaveFiller object that is carried out
   */
  public BRepAlgoAPI_Common( TopoDS_Shape  S1,  TopoDS_Shape  S2) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Common__SWIG_2(TopoDS_Shape.getCPtr(S1), S1, TopoDS_Shape.getCPtr(S2), S2), true);
  }

  /**
   *  Constructor with two shapes
   *  <S1>  -argument
   *  <S2>  -tool
   *  <anOperation> - the type of the operation
   *  Obsolete
   */
  public BRepAlgoAPI_Common( TopoDS_Shape  S1,  TopoDS_Shape  S2,  BOPAlgo_PaveFiller  PF) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Common__SWIG_3(TopoDS_Shape.getCPtr(S1), S1, TopoDS_Shape.getCPtr(S2), S2, BOPAlgo_PaveFiller.getCPtr(PF), PF), true);
  }

}
