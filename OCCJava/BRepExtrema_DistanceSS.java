package opencascade;

/**
 *   This class allows to compute minimum distance between two shapes 
 *  (face edge vertex) and is used in DistShapeShape class. 
 */
public class BRepExtrema_DistanceSS {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepExtrema_DistanceSS(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepExtrema_DistanceSS(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepExtrema_DistanceSS obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepExtrema_DistanceSS(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  computes the distance between two Shapes ( face edge vertex). 
   */
  public BRepExtrema_DistanceSS( TopoDS_Shape  S1,  TopoDS_Shape  S2,  Bnd_Box  B1,  Bnd_Box  B2, double DstRef, Extrema_ExtFlag F, Extrema_ExtAlgo A) {
    this(OCCwrapJavaJNI.new_BRepExtrema_DistanceSS__SWIG_0(TopoDS_Shape.getCPtr(S1), S1, TopoDS_Shape.getCPtr(S2), S2, Bnd_Box.getCPtr(B1), B1, Bnd_Box.getCPtr(B2), B2, DstRef, F.swigValue(), A.swigValue()), true);
  }

  /**
   *  computes the distance between two Shapes ( face edge vertex). 
   *  Parameter theDeflection is used to specify a maximum deviation 
   *  of extreme distances from the minimum one. 
   *  Default value is Precision::Confusion(). 
   */
  public BRepExtrema_DistanceSS( TopoDS_Shape  S1,  TopoDS_Shape  S2,  Bnd_Box  B1,  Bnd_Box  B2, double DstRef, Extrema_ExtFlag F) {
    this(OCCwrapJavaJNI.new_BRepExtrema_DistanceSS__SWIG_1(TopoDS_Shape.getCPtr(S1), S1, TopoDS_Shape.getCPtr(S2), S2, Bnd_Box.getCPtr(B1), B1, Bnd_Box.getCPtr(B2), B2, DstRef, F.swigValue()), true);
  }

  public BRepExtrema_DistanceSS( TopoDS_Shape  S1,  TopoDS_Shape  S2,  Bnd_Box  B1,  Bnd_Box  B2, double DstRef) {
    this(OCCwrapJavaJNI.new_BRepExtrema_DistanceSS__SWIG_2(TopoDS_Shape.getCPtr(S1), S1, TopoDS_Shape.getCPtr(S2), S2, Bnd_Box.getCPtr(B1), B1, Bnd_Box.getCPtr(B2), B2, DstRef), true);
  }

  public BRepExtrema_DistanceSS( TopoDS_Shape  S1,  TopoDS_Shape  S2,  Bnd_Box  B1,  Bnd_Box  B2, double DstRef, double aDeflection, Extrema_ExtFlag F, Extrema_ExtAlgo A) {
    this(OCCwrapJavaJNI.new_BRepExtrema_DistanceSS__SWIG_3(TopoDS_Shape.getCPtr(S1), S1, TopoDS_Shape.getCPtr(S2), S2, Bnd_Box.getCPtr(B1), B1, Bnd_Box.getCPtr(B2), B2, DstRef, aDeflection, F.swigValue(), A.swigValue()), true);
  }

  public BRepExtrema_DistanceSS( TopoDS_Shape  S1,  TopoDS_Shape  S2,  Bnd_Box  B1,  Bnd_Box  B2, double DstRef, double aDeflection, Extrema_ExtFlag F) {
    this(OCCwrapJavaJNI.new_BRepExtrema_DistanceSS__SWIG_4(TopoDS_Shape.getCPtr(S1), S1, TopoDS_Shape.getCPtr(S2), S2, Bnd_Box.getCPtr(B1), B1, Bnd_Box.getCPtr(B2), B2, DstRef, aDeflection, F.swigValue()), true);
  }

  public BRepExtrema_DistanceSS( TopoDS_Shape  S1,  TopoDS_Shape  S2,  Bnd_Box  B1,  Bnd_Box  B2, double DstRef, double aDeflection) {
    this(OCCwrapJavaJNI.new_BRepExtrema_DistanceSS__SWIG_5(TopoDS_Shape.getCPtr(S1), S1, TopoDS_Shape.getCPtr(S2), S2, Bnd_Box.getCPtr(B1), B1, Bnd_Box.getCPtr(B2), B2, DstRef, aDeflection), true);
  }

  /**
   *  True if the distance has been computed 
   */
  public long IsDone() {
    return OCCwrapJavaJNI.BRepExtrema_DistanceSS_IsDone(swigCPtr, this);
  }

  /**
   *  returns the distance value 
   */
  public double DistValue() {
    return OCCwrapJavaJNI.BRepExtrema_DistanceSS_DistValue(swigCPtr, this);
  }

  /**
   *  returns the list of solutions on the first shape 
   */
  public  BRepExtrema_SeqOfSolution  Seq1Value() {
    BRepExtrema_SeqOfSolution ret = new BRepExtrema_SeqOfSolution(OCCwrapJavaJNI.BRepExtrema_DistanceSS_Seq1Value(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  returns the list of solutions on the second shape 
   */
  public  BRepExtrema_SeqOfSolution  Seq2Value() {
    BRepExtrema_SeqOfSolution ret = new BRepExtrema_SeqOfSolution(OCCwrapJavaJNI.BRepExtrema_DistanceSS_Seq2Value(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  sets the flag controlling minimum and maximum search
   */
  public void SetFlag(Extrema_ExtFlag F) {
    OCCwrapJavaJNI.BRepExtrema_DistanceSS_SetFlag(swigCPtr, this, F.swigValue());
  }

  /**
   *  sets the flag controlling ...
   */
  public void SetAlgo(Extrema_ExtAlgo A) {
    OCCwrapJavaJNI.BRepExtrema_DistanceSS_SetAlgo(swigCPtr, this, A.swigValue());
  }

}
