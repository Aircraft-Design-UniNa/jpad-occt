package opencascade;

/**
 *  Provides natural constructors to build BRepSweep
 *  translated swept Primitives.
 */
public class BRepSweep_Prism {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepSweep_Prism(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepSweep_Prism(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepSweep_Prism obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepSweep_Prism(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Builds the prism of base S and vector V. If C is true,
   *  S is copied. If Canonize is true then generated surfaces
   *  are attempted to be canonized in simple types
   */
  public BRepSweep_Prism( TopoDS_Shape  S,  gp_Vec  V, long Copy, long Canonize) {
    this(OCCwrapJavaJNI.new_BRepSweep_Prism__SWIG_0(TopoDS_Shape.getCPtr(S), S, gp_Vec.getCPtr(V), V, Copy, Canonize), true);
  }

  /**
   *  Builds a semi-infinite or an infinite prism of base S.
   *  If Copy is true S is copied.  If Inf is true the prism
   *  is infinite, if Inf is false the  prism is infinite in
   *  the direction D. If Canonize is true then generated surfaces
   *  are attempted to be canonized in simple types
   */
  public BRepSweep_Prism( TopoDS_Shape  S,  gp_Vec  V, long Copy) {
    this(OCCwrapJavaJNI.new_BRepSweep_Prism__SWIG_1(TopoDS_Shape.getCPtr(S), S, gp_Vec.getCPtr(V), V, Copy), true);
  }

  public BRepSweep_Prism( TopoDS_Shape  S,  gp_Vec  V) {
    this(OCCwrapJavaJNI.new_BRepSweep_Prism__SWIG_2(TopoDS_Shape.getCPtr(S), S, gp_Vec.getCPtr(V), V), true);
  }

  public BRepSweep_Prism( TopoDS_Shape  S,  gp_Dir  D, long Inf, long Copy, long Canonize) {
    this(OCCwrapJavaJNI.new_BRepSweep_Prism__SWIG_3(TopoDS_Shape.getCPtr(S), S, gp_Dir.getCPtr(D), D, Inf, Copy, Canonize), true);
  }

  public BRepSweep_Prism( TopoDS_Shape  S,  gp_Dir  D, long Inf, long Copy) {
    this(OCCwrapJavaJNI.new_BRepSweep_Prism__SWIG_4(TopoDS_Shape.getCPtr(S), S, gp_Dir.getCPtr(D), D, Inf, Copy), true);
  }

  public BRepSweep_Prism( TopoDS_Shape  S,  gp_Dir  D, long Inf) {
    this(OCCwrapJavaJNI.new_BRepSweep_Prism__SWIG_5(TopoDS_Shape.getCPtr(S), S, gp_Dir.getCPtr(D), D, Inf), true);
  }

  public BRepSweep_Prism( TopoDS_Shape  S,  gp_Dir  D) {
    this(OCCwrapJavaJNI.new_BRepSweep_Prism__SWIG_6(TopoDS_Shape.getCPtr(S), S, gp_Dir.getCPtr(D), D), true);
  }

  /**
   *  Returns the TopoDS Shape attached to the prism.
   */
  public TopoDS_Shape Shape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepSweep_Prism_Shape__SWIG_0(swigCPtr, this), true);
  }

  /**
   *  Returns    the  TopoDS  Shape   generated  with  aGenS
   *  (subShape  of the generating shape).
   */
  public TopoDS_Shape Shape( TopoDS_Shape  aGenS) {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepSweep_Prism_Shape__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(aGenS), aGenS), true);
  }

  /**
   *  Returns the  TopoDS  Shape of the bottom of the prism.
   */
  public TopoDS_Shape FirstShape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepSweep_Prism_FirstShape__SWIG_0(swigCPtr, this), true);
  }

  /**
   *  Returns the TopoDS Shape of the bottom  of the  prism.
   *  generated  with  aGenS  (subShape  of  the  generating
   *  shape).
   */
  public TopoDS_Shape FirstShape( TopoDS_Shape  aGenS) {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepSweep_Prism_FirstShape__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(aGenS), aGenS), true);
  }

  /**
   *  Returns the TopoDS Shape of the top of the prism.
   */
  public TopoDS_Shape LastShape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepSweep_Prism_LastShape__SWIG_0(swigCPtr, this), true);
  }

  /**
   *  Returns the  TopoDS  Shape of the top  of  the  prism.
   *  generated  with  aGenS  (subShape  of  the  generating
   *  shape).
   */
  public TopoDS_Shape LastShape( TopoDS_Shape  aGenS) {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepSweep_Prism_LastShape__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(aGenS), aGenS), true);
  }

  /**
   *  Returns the Vector of the Prism,  if it is an infinite
   *  prism the Vec is unitar.
   */
  public gp_Vec Vec() {
    return new gp_Vec(OCCwrapJavaJNI.BRepSweep_Prism_Vec(swigCPtr, this), true);
  }

}
