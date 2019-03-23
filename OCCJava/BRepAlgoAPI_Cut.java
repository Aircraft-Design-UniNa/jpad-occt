package opencascade;

/**
 *  The class Cut provides Boolean cut operation
 *  between arguments and tools (Boolean Subtraction).
 */
public class BRepAlgoAPI_Cut extends BRepAlgoAPI_BooleanOperation {

  private long swigCPtr;
  BRepAlgoAPI_Cut(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepAlgoAPI_Cut_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepAlgoAPI_Cut(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepAlgoAPI_Cut_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepAlgoAPI_Cut obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepAlgoAPI_Cut(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Empty constructor
   */
  public BRepAlgoAPI_Cut() {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Cut__SWIG_0(), true);
  }

  public BRepAlgoAPI_Cut( BOPAlgo_PaveFiller  PF) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Cut__SWIG_1(BOPAlgo_PaveFiller.getCPtr(PF), PF), true);
  }

  /**
   *  Empty constructor
   *  <PF> - PaveFiller object that is carried out
   */
  public BRepAlgoAPI_Cut( TopoDS_Shape  S1,  TopoDS_Shape  S2) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Cut__SWIG_2(TopoDS_Shape.getCPtr(S1), S1, TopoDS_Shape.getCPtr(S2), S2), true);
  }

  /**
   *  Constructor with two shapes
   *  <S1>  -argument
   *  <S2>  -tool
   *  <anOperation> - the type of the operation
   *  Obsolete
   */
  public BRepAlgoAPI_Cut( TopoDS_Shape  S1,  TopoDS_Shape  S2,  BOPAlgo_PaveFiller  aDSF, long bFWD) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Cut__SWIG_3(TopoDS_Shape.getCPtr(S1), S1, TopoDS_Shape.getCPtr(S2), S2, BOPAlgo_PaveFiller.getCPtr(aDSF), aDSF, bFWD), true);
  }

  /**
   *  Constructor with two shapes
   *  <S1>  -argument
   *  <S2>  -tool
   *  <anOperation> - the type of the operation
   *  <PF> - PaveFiller object that is carried out
   *  Obsolete
   */
  public BRepAlgoAPI_Cut( TopoDS_Shape  S1,  TopoDS_Shape  S2,  BOPAlgo_PaveFiller  aDSF) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Cut__SWIG_4(TopoDS_Shape.getCPtr(S1), S1, TopoDS_Shape.getCPtr(S2), S2, BOPAlgo_PaveFiller.getCPtr(aDSF), aDSF), true);
  }

}
