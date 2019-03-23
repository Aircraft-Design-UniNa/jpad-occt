package opencascade;

/**
 *  Implements a  projector object.
 *  To transform and project Points and Planes.
 *  This object is designed to be used in the
 *  removal of hidden lines and is returned by the
 *  Prs3d_Projector::Projector function.
 *  You define the projection of the selected shape
 *  by calling one of the following functions:
 *  -   HLRBRep_Algo::Projector, or
 *  -   HLRBRep_PolyAlgo::Projector
 *  The choice depends on the algorithm, which you are using.
 *  The parameters of the view are defined at the
 *  time of construction of a Prs3d_Projector object.
 */
public class HLRAlgo_Projector {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  HLRAlgo_Projector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  HLRAlgo_Projector(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(HLRAlgo_Projector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (HLRAlgo_Projector ptr) { Ptr = ptr; }
    public HLRAlgo_Projector AsReference () { return Ptr; }
    public HLRAlgo_Projector AsCopy () { return Ptr.MakeCopy(); }
    public HLRAlgo_Projector Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_HLRAlgo_Projector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public HLRAlgo_Projector() {
    this(OCCwrapJavaJNI.new_HLRAlgo_Projector__SWIG_0(), true);
  }

  /**
   *  Creates   an axonometric  projector.   <CS> is the
   *  viewing coordinate system.
   */
  public HLRAlgo_Projector( gp_Ax2  CS) {
    this(OCCwrapJavaJNI.new_HLRAlgo_Projector__SWIG_1(gp_Ax2.getCPtr(CS), CS), true);
  }

  /**
   *  Creates  a  perspective  projector.   <CS>  is the
   *  viewing coordinate system.
   */
  public HLRAlgo_Projector( gp_Ax2  CS, double Focus) {
    this(OCCwrapJavaJNI.new_HLRAlgo_Projector__SWIG_2(gp_Ax2.getCPtr(CS), CS, Focus), true);
  }

  /**
   *  build a Projector with automatic minmax directions.
   */
  public HLRAlgo_Projector( gp_Trsf  T, long Persp, double Focus) {
    this(OCCwrapJavaJNI.new_HLRAlgo_Projector__SWIG_3(gp_Trsf.getCPtr(T), T, Persp, Focus), true);
  }

  /**
   *  build a Projector with given minmax directions.
   */
  public HLRAlgo_Projector( gp_Trsf  T, long Persp, double Focus,  gp_Vec2d  v1,  gp_Vec2d  v2,  gp_Vec2d  v3) {
    this(OCCwrapJavaJNI.new_HLRAlgo_Projector__SWIG_4(gp_Trsf.getCPtr(T), T, Persp, Focus, gp_Vec2d.getCPtr(v1), v1, gp_Vec2d.getCPtr(v2), v2, gp_Vec2d.getCPtr(v3), v3), true);
  }

  public void Set( gp_Trsf  T, long Persp, double Focus) {
    OCCwrapJavaJNI.HLRAlgo_Projector_Set(swigCPtr, this, gp_Trsf.getCPtr(T), T, Persp, Focus);
  }

  public void Directions(gp_Vec2d D1, gp_Vec2d D2, gp_Vec2d D3) {
    OCCwrapJavaJNI.HLRAlgo_Projector_Directions(swigCPtr, this, gp_Vec2d.getCPtr(D1), D1, gp_Vec2d.getCPtr(D2), D2, gp_Vec2d.getCPtr(D3), D3);
  }

  /**
   *  to compute with the given scale and translation.
   */
  public void Scaled(long On) {
    OCCwrapJavaJNI.HLRAlgo_Projector_Scaled__SWIG_0(swigCPtr, this, On);
  }

  public void Scaled() {
    OCCwrapJavaJNI.HLRAlgo_Projector_Scaled__SWIG_1(swigCPtr, this);
  }

  /**
   *  Returns True if there is a perspective transformation.
   */
  public long Perspective() {
    return OCCwrapJavaJNI.HLRAlgo_Projector_Perspective(swigCPtr, this);
  }

  /**
   *  Returns the active transformation.
   */
  public  gp_Trsf  Transformation() {
    gp_Trsf ret = new gp_Trsf(OCCwrapJavaJNI.HLRAlgo_Projector_Transformation(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the active inverted transformation.
   */
  public  gp_Trsf  InvertedTransformation() {
    gp_Trsf ret = new gp_Trsf(OCCwrapJavaJNI.HLRAlgo_Projector_InvertedTransformation(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the original transformation.
   */
  public  gp_Trsf  FullTransformation() {
    gp_Trsf ret = new gp_Trsf(OCCwrapJavaJNI.HLRAlgo_Projector_FullTransformation(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the focal length.
   */
  public double Focus() {
    return OCCwrapJavaJNI.HLRAlgo_Projector_Focus(swigCPtr, this);
  }

  public void Transform(gp_Vec D) {
    OCCwrapJavaJNI.HLRAlgo_Projector_Transform__SWIG_0(swigCPtr, this, gp_Vec.getCPtr(D), D);
  }

  public void Transform(gp_Pnt Pnt) {
    OCCwrapJavaJNI.HLRAlgo_Projector_Transform__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(Pnt), Pnt);
  }

  /**
   *  Transform and apply perspective if needed.
   */
  public void Project( gp_Pnt  P, gp_Pnt2d Pout) {
    OCCwrapJavaJNI.HLRAlgo_Projector_Project__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(P), P, gp_Pnt2d.getCPtr(Pout), Pout);
  }

  /**
   *  Transform and apply perspective if needed.
   */
  public void Project( gp_Pnt  P, double[] X, double[] Y, double[] Z) {
    OCCwrapJavaJNI.HLRAlgo_Projector_Project__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(P), P, X, Y, Z);
  }

  /**
   *  Transform and apply perspective if needed.
   */
  public void Project( gp_Pnt  P,  gp_Vec  D1, gp_Pnt2d Pout, gp_Vec2d D1out) {
    OCCwrapJavaJNI.HLRAlgo_Projector_Project__SWIG_2(swigCPtr, this, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(D1), D1, gp_Pnt2d.getCPtr(Pout), Pout, gp_Vec2d.getCPtr(D1out), D1out);
  }

  /**
   *  return a line going through the eye towards the
   *  2d point <X,Y>.
   */
  public gp_Lin Shoot(double X, double Y) {
    return new gp_Lin(OCCwrapJavaJNI.HLRAlgo_Projector_Shoot(swigCPtr, this, X, Y), true);
  }

}
