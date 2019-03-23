package opencascade;

/**
 *  This class  provides tools to compute minimum distance 
 *  between two Shapes (Compound,CompSolid, Solid, Shell, Face, Wire, Edge, Vertex). 
 */
public class BRepExtrema_DistShapeShape {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepExtrema_DistShapeShape(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepExtrema_DistShapeShape(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepExtrema_DistShapeShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepExtrema_DistShapeShape(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  create empty tool 
   */
  public BRepExtrema_DistShapeShape() {
    this(OCCwrapJavaJNI.new_BRepExtrema_DistShapeShape__SWIG_0(), true);
  }

  /**
   *  computation of the minimum distance (value and pair of points) using default deflection 
   *  Default value is Precision::Confusion(). 
   */
  public BRepExtrema_DistShapeShape( TopoDS_Shape  Shape1,  TopoDS_Shape  Shape2, Extrema_ExtFlag F, Extrema_ExtAlgo A) {
    this(OCCwrapJavaJNI.new_BRepExtrema_DistShapeShape__SWIG_1(TopoDS_Shape.getCPtr(Shape1), Shape1, TopoDS_Shape.getCPtr(Shape2), Shape2, F.swigValue(), A.swigValue()), true);
  }

  /**
   *  create tool and load both shapes into it 
   */
  public BRepExtrema_DistShapeShape( TopoDS_Shape  Shape1,  TopoDS_Shape  Shape2, Extrema_ExtFlag F) {
    this(OCCwrapJavaJNI.new_BRepExtrema_DistShapeShape__SWIG_2(TopoDS_Shape.getCPtr(Shape1), Shape1, TopoDS_Shape.getCPtr(Shape2), Shape2, F.swigValue()), true);
  }

  public BRepExtrema_DistShapeShape( TopoDS_Shape  Shape1,  TopoDS_Shape  Shape2) {
    this(OCCwrapJavaJNI.new_BRepExtrema_DistShapeShape__SWIG_3(TopoDS_Shape.getCPtr(Shape1), Shape1, TopoDS_Shape.getCPtr(Shape2), Shape2), true);
  }

  public BRepExtrema_DistShapeShape( TopoDS_Shape  Shape1,  TopoDS_Shape  Shape2, double theDeflection, Extrema_ExtFlag F, Extrema_ExtAlgo A) {
    this(OCCwrapJavaJNI.new_BRepExtrema_DistShapeShape__SWIG_4(TopoDS_Shape.getCPtr(Shape1), Shape1, TopoDS_Shape.getCPtr(Shape2), Shape2, theDeflection, F.swigValue(), A.swigValue()), true);
  }

  public BRepExtrema_DistShapeShape( TopoDS_Shape  Shape1,  TopoDS_Shape  Shape2, double theDeflection, Extrema_ExtFlag F) {
    this(OCCwrapJavaJNI.new_BRepExtrema_DistShapeShape__SWIG_5(TopoDS_Shape.getCPtr(Shape1), Shape1, TopoDS_Shape.getCPtr(Shape2), Shape2, theDeflection, F.swigValue()), true);
  }

  public BRepExtrema_DistShapeShape( TopoDS_Shape  Shape1,  TopoDS_Shape  Shape2, double theDeflection) {
    this(OCCwrapJavaJNI.new_BRepExtrema_DistShapeShape__SWIG_6(TopoDS_Shape.getCPtr(Shape1), Shape1, TopoDS_Shape.getCPtr(Shape2), Shape2, theDeflection), true);
  }

  public void SetDeflection(double theDeflection) {
    OCCwrapJavaJNI.BRepExtrema_DistShapeShape_SetDeflection(swigCPtr, this, theDeflection);
  }

  /**
   *  load first shape into extrema 
   */
  public void LoadS1( TopoDS_Shape  Shape1) {
    OCCwrapJavaJNI.BRepExtrema_DistShapeShape_LoadS1(swigCPtr, this, TopoDS_Shape.getCPtr(Shape1), Shape1);
  }

  /**
   *  load second shape into extrema 
   */
  public void LoadS2( TopoDS_Shape  Shape1) {
    OCCwrapJavaJNI.BRepExtrema_DistShapeShape_LoadS2(swigCPtr, this, TopoDS_Shape.getCPtr(Shape1), Shape1);
  }

  /**
   *  computation of  the minimum  distance  (value  and 
   *           couple  of points). Parameter theDeflection is used 
   *           to specify a maximum deviation of extreme distances 
   *           from the minimum one. 
   *           Returns IsDone status. 
   */
  public long Perform() {
    return OCCwrapJavaJNI.BRepExtrema_DistShapeShape_Perform(swigCPtr, this);
  }

  /**
   *  True if the minimum distance is found. 
   */
  public long IsDone() {
    return OCCwrapJavaJNI.BRepExtrema_DistShapeShape_IsDone(swigCPtr, this);
  }

  /**
   *  Returns the number of solutions satisfying the minimum distance. 
   */
  public int NbSolution() {
    return OCCwrapJavaJNI.BRepExtrema_DistShapeShape_NbSolution(swigCPtr, this);
  }

  /**
   *  Returns the value of the minimum distance. 
   */
  public double Value() {
    return OCCwrapJavaJNI.BRepExtrema_DistShapeShape_Value(swigCPtr, this);
  }

  /**
   *  True if one of the shapes is a solid and the other shape 
   *  is completely or partially inside the solid. 
   */
  public long InnerSolution() {
    return OCCwrapJavaJNI.BRepExtrema_DistShapeShape_InnerSolution(swigCPtr, this);
  }

  /**
   *  Returns the Point corresponding to the <N>th solution on the first Shape 
   */
  public  gp_Pnt  PointOnShape1(int N) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.BRepExtrema_DistShapeShape_PointOnShape1(swigCPtr, this, N), true);
    return ret;
  }

  /**
   *  Returns the Point corresponding to the <N>th solution on the second Shape 
   */
  public  gp_Pnt  PointOnShape2(int N) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.BRepExtrema_DistShapeShape_PointOnShape2(swigCPtr, this, N), true);
    return ret;
  }

  /**
   *  gives the type of the support where the Nth solution on the first shape is situated: 
   *    IsVertex => the Nth solution on the first shape is a Vertex 
   *    IsOnEdge => the Nth soluion on the first shape is on a Edge 
   *    IsInFace => the Nth solution on the first shape is inside a face 
   *  the corresponding support is obtained by the method SupportOnShape1 
   */
  public BRepExtrema_SupportType SupportTypeShape1(int N) {
    return BRepExtrema_SupportType.swigToEnum(OCCwrapJavaJNI.BRepExtrema_DistShapeShape_SupportTypeShape1(swigCPtr, this, N));
  }

  /**
   *  gives the type of the support where the Nth solution on the second shape is situated: 
   *    IsVertex => the Nth solution on the second shape is a Vertex 
   *    IsOnEdge => the Nth soluion on the secondt shape is on a Edge 
   *    IsInFace => the Nth solution on the second shape is inside a face 
   *  the corresponding support is obtained by the method SupportOnShape2 
   */
  public BRepExtrema_SupportType SupportTypeShape2(int N) {
    return BRepExtrema_SupportType.swigToEnum(OCCwrapJavaJNI.BRepExtrema_DistShapeShape_SupportTypeShape2(swigCPtr, this, N));
  }

  /**
   *  gives the support where the Nth solution on the first shape is situated. 
   *  This support can be a Vertex, an Edge or a Face. 
   */
  public TopoDS_Shape SupportOnShape1(int N) {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepExtrema_DistShapeShape_SupportOnShape1(swigCPtr, this, N), true);
  }

  /**
   *  gives the support where the Nth solution on the second shape is situated. 
   *  This support can be a Vertex, an Edge or a Face. 
   */
  public TopoDS_Shape SupportOnShape2(int N) {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepExtrema_DistShapeShape_SupportOnShape2(swigCPtr, this, N), true);
  }

  /**
   *  gives the corresponding parameter t if the Nth solution 
   *  is situated on an Egde of the first shape 
   */
  public void ParOnEdgeS1(int N, double[] t) {
    OCCwrapJavaJNI.BRepExtrema_DistShapeShape_ParOnEdgeS1(swigCPtr, this, N, t);
  }

  /**
   *  gives the corresponding parameter t if the Nth solution 
   *  is situated on an Egde of the first shape 
   */
  public void ParOnEdgeS2(int N, double[] t) {
    OCCwrapJavaJNI.BRepExtrema_DistShapeShape_ParOnEdgeS2(swigCPtr, this, N, t);
  }

  /**
   *  gives the corresponding parameters (U,V) if the Nth solution 
   *  is situated on an face of the first shape 
   */
  public void ParOnFaceS1(int N, double[] u, double[] v) {
    OCCwrapJavaJNI.BRepExtrema_DistShapeShape_ParOnFaceS1(swigCPtr, this, N, u, v);
  }

  /**
   *  gives the corresponding parameters (U,V) if the Nth solution 
   *  is situated on an Face of the second shape 
   */
  public void ParOnFaceS2(int N, double[] u, double[] v) {
    OCCwrapJavaJNI.BRepExtrema_DistShapeShape_ParOnFaceS2(swigCPtr, this, N, u, v);
  }

  /**
   *  Prints on the stream o information on the current state of the object. 
   */
  public void Dump(SWIGTYPE_p_Standard_OStream o) {
    OCCwrapJavaJNI.BRepExtrema_DistShapeShape_Dump(swigCPtr, this, SWIGTYPE_p_Standard_OStream.getCPtr(o));
  }

  public void SetFlag(Extrema_ExtFlag F) {
    OCCwrapJavaJNI.BRepExtrema_DistShapeShape_SetFlag(swigCPtr, this, F.swigValue());
  }

  public void SetAlgo(Extrema_ExtAlgo A) {
    OCCwrapJavaJNI.BRepExtrema_DistShapeShape_SetAlgo(swigCPtr, this, A.swigValue());
  }

}
