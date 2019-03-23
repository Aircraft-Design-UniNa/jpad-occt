package opencascade;

/**
 *  This class makes the projection  of a wire on a
 *  shape.
 */
public class BRepAlgo_NormalProjection {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepAlgo_NormalProjection(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepAlgo_NormalProjection(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepAlgo_NormalProjection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepAlgo_NormalProjection(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BRepAlgo_NormalProjection() {
    this(OCCwrapJavaJNI.new_BRepAlgo_NormalProjection__SWIG_0(), true);
  }

  public BRepAlgo_NormalProjection( TopoDS_Shape  S) {
    this(OCCwrapJavaJNI.new_BRepAlgo_NormalProjection__SWIG_1(TopoDS_Shape.getCPtr(S), S), true);
  }

  public void Init( TopoDS_Shape  S) {
    OCCwrapJavaJNI.BRepAlgo_NormalProjection_Init(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

  /**
   *  Add an edge or a wire to the list of shape to project
   */
  public void Add( TopoDS_Shape  ToProj) {
    OCCwrapJavaJNI.BRepAlgo_NormalProjection_Add(swigCPtr, this, TopoDS_Shape.getCPtr(ToProj), ToProj);
  }

  /**
   *  Set the parameters  used  for computation
   *  Tol3d is the requiered  tolerance between the  3d projected
   *  curve  and its 2d representation
   *  InternalContinuity  is the order of constraints
   *  used for  approximation.
   *  MaxDeg and MaxSeg are the maximum degree and the maximum
   *  number of segment for BSpline resulting of an approximation.
   */
  public void SetParams(double Tol3D, double Tol2D, GeomAbs_Shape InternalContinuity, int MaxDegree, int MaxSeg) {
    OCCwrapJavaJNI.BRepAlgo_NormalProjection_SetParams(swigCPtr, this, Tol3D, Tol2D, InternalContinuity.swigValue(), MaxDegree, MaxSeg);
  }

  /**
   *  Set the parameters  used  for computation
   *  in their default values
   */
  public void SetDefaultParams() {
    OCCwrapJavaJNI.BRepAlgo_NormalProjection_SetDefaultParams(swigCPtr, this);
  }

  /**
   *  Sets the maximum distance between target shape and
   *  shape to project. If this condition is not satisfied then
   *  corresponding part of solution is discarded.
   *  if MaxDist < 0 then this method does not affect the algorithm
   */
  public void SetMaxDistance(double MaxDist) {
    OCCwrapJavaJNI.BRepAlgo_NormalProjection_SetMaxDistance(swigCPtr, this, MaxDist);
  }

  /**
   *  if  With3d = Standard_False the 3dcurve is not computed
   *  the  initial 3dcurve is kept  to  build the  resulting edges.
   */
  public void Compute3d(long With3d) {
    OCCwrapJavaJNI.BRepAlgo_NormalProjection_Compute3d__SWIG_0(swigCPtr, this, With3d);
  }

  public void Compute3d() {
    OCCwrapJavaJNI.BRepAlgo_NormalProjection_Compute3d__SWIG_1(swigCPtr, this);
  }

  /**
   *  Manage  limitation  of  projected  edges.
   */
  public void SetLimit(long FaceBoundaries) {
    OCCwrapJavaJNI.BRepAlgo_NormalProjection_SetLimit__SWIG_0(swigCPtr, this, FaceBoundaries);
  }

  public void SetLimit() {
    OCCwrapJavaJNI.BRepAlgo_NormalProjection_SetLimit__SWIG_1(swigCPtr, this);
  }

  /**
   *  Builds the result as a  compound.
   */
  public void Build() {
    OCCwrapJavaJNI.BRepAlgo_NormalProjection_Build(swigCPtr, this);
  }

  public long IsDone() {
    return OCCwrapJavaJNI.BRepAlgo_NormalProjection_IsDone(swigCPtr, this);
  }

  /**
   *  returns the result
   */
  public  TopoDS_Shape  Projection() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepAlgo_NormalProjection_Projection(swigCPtr, this), true);
    return ret;
  }

  /**
   *  For a resulting edge, returns the corresponding initial edge.
   */
  public  TopoDS_Shape  Ancestor( TopoDS_Edge  E) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepAlgo_NormalProjection_Ancestor(swigCPtr, this, TopoDS_Edge.getCPtr(E), E), true);
    return ret;
  }

  /**
   *  For a projected edge, returns the corresponding initial face.
   */
  public  TopoDS_Shape  Couple( TopoDS_Edge  E) {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepAlgo_NormalProjection_Couple(swigCPtr, this, TopoDS_Edge.getCPtr(E), E), true);
    return ret;
  }

  /**
   *  Returns the  list   of shapes generated   from the
   *  shape <S>.
   */
  public  TopTools_ListOfShape  Generated( TopoDS_Shape  S) {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BRepAlgo_NormalProjection_Generated(swigCPtr, this, TopoDS_Shape.getCPtr(S), S), false, this);
    return ret;
  }

  public long IsElementary( Adaptor3d_Curve  C) {
    return OCCwrapJavaJNI.BRepAlgo_NormalProjection_IsElementary(swigCPtr, this, Adaptor3d_Curve.getCPtr(C), C);
  }

  /**
   *  build the result as a list of wire if possible in --
   *  a first returns a wire only if there is only a wire.
   */
  public long BuildWire( TopTools_ListOfShape  Liste) {
    return OCCwrapJavaJNI.BRepAlgo_NormalProjection_BuildWire(swigCPtr, this, TopTools_ListOfShape.getCPtr(Liste), Liste);
  }

}
