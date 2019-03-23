package opencascade;

/**
 *  check the validity of argument(s) for Boolean Operations
 */
public class BOPAlgo_ArgumentAnalyzer extends BOPAlgo_Algo {

  private long swigCPtr;
  BOPAlgo_ArgumentAnalyzer(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BOPAlgo_ArgumentAnalyzer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BOPAlgo_ArgumentAnalyzer(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BOPAlgo_ArgumentAnalyzer_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BOPAlgo_ArgumentAnalyzer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BOPAlgo_ArgumentAnalyzer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  empty constructor
   */
  public BOPAlgo_ArgumentAnalyzer() {
    this(OCCwrapJavaJNI.new_BOPAlgo_ArgumentAnalyzer(), true);
  }

  /**
   *  sets object shape
   */
  public void SetShape1( TopoDS_Shape  TheShape) {
    OCCwrapJavaJNI.BOPAlgo_ArgumentAnalyzer_SetShape1(swigCPtr, this, TopoDS_Shape.getCPtr(TheShape), TheShape);
  }

  /**
   *  sets tool shape
   */
  public void SetShape2( TopoDS_Shape  TheShape) {
    OCCwrapJavaJNI.BOPAlgo_ArgumentAnalyzer_SetShape2(swigCPtr, this, TopoDS_Shape.getCPtr(TheShape), TheShape);
  }

  /**
   *  returns object shape;
   */
  public  TopoDS_Shape  GetShape1() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BOPAlgo_ArgumentAnalyzer_GetShape1(swigCPtr, this), true);
    return ret;
  }

  /**
   *  returns tool shape
   */
  public  TopoDS_Shape  GetShape2() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BOPAlgo_ArgumentAnalyzer_GetShape2(swigCPtr, this), true);
    return ret;
  }

  public int[] OperationType() {
    return OCCwrapJavaJNI.BOPAlgo_ArgumentAnalyzer_OperationType(swigCPtr, this);
  }

  public long[] StopOnFirstFaulty() {return OCCwrapJavaJNI.BOPAlgo_ArgumentAnalyzer_StopOnFirstFaulty(swigCPtr, this);}

  public long[] ArgumentTypeMode() {return OCCwrapJavaJNI.BOPAlgo_ArgumentAnalyzer_ArgumentTypeMode(swigCPtr, this);}

  public long[] SelfInterMode() {return OCCwrapJavaJNI.BOPAlgo_ArgumentAnalyzer_SelfInterMode(swigCPtr, this);}

  public long[] SmallEdgeMode() {return OCCwrapJavaJNI.BOPAlgo_ArgumentAnalyzer_SmallEdgeMode(swigCPtr, this);}

  public long[] RebuildFaceMode() {return OCCwrapJavaJNI.BOPAlgo_ArgumentAnalyzer_RebuildFaceMode(swigCPtr, this);}

  public long[] TangentMode() {return OCCwrapJavaJNI.BOPAlgo_ArgumentAnalyzer_TangentMode(swigCPtr, this);}

  public long[] MergeVertexMode() {return OCCwrapJavaJNI.BOPAlgo_ArgumentAnalyzer_MergeVertexMode(swigCPtr, this);}

  public long[] MergeEdgeMode() {return OCCwrapJavaJNI.BOPAlgo_ArgumentAnalyzer_MergeEdgeMode(swigCPtr, this);}

  public long[] ContinuityMode() {return OCCwrapJavaJNI.BOPAlgo_ArgumentAnalyzer_ContinuityMode(swigCPtr, this);}

  public long[] CurveOnSurfaceMode() {return OCCwrapJavaJNI.BOPAlgo_ArgumentAnalyzer_CurveOnSurfaceMode(swigCPtr, this);}

  /**
   *  result of test
   */
  public long HasFaulty() {
    return OCCwrapJavaJNI.BOPAlgo_ArgumentAnalyzer_HasFaulty(swigCPtr, this);
  }

  /**
   *  returns a result of test
   */
  public  BOPAlgo_ListOfCheckResult  GetCheckResult() {
    BOPAlgo_ListOfCheckResult ret = new BOPAlgo_ListOfCheckResult(OCCwrapJavaJNI.BOPAlgo_ArgumentAnalyzer_GetCheckResult(swigCPtr, this), false, this);
    return ret;
  }

}
