package opencascade;

/**
 *  Describes functions to build linear swept topologies, called prisms.
 *  A prism is defined by:
 *  -   a basis shape, which is swept, and
 *  -   a sweeping direction, which is:
 *  -   a vector for finite prisms, or
 *  -   a direction for infinite or semi-infinite prisms.
 *  The basis shape must not contain any solids.
 *  The profile generates objects according to the following rules:
 *  -   Vertices generate Edges
 *  -   Edges generate Faces.
 *  -   Wires generate Shells.
 *  -   Faces generate Solids.
 *  -   Shells generate Composite Solids
 *  A MakePrism object provides a framework for:
 *  -   defining the construction of a prism,
 *  -   implementing the construction algorithm, and
 *  -   consulting the result.
 */
public class BRepPrimAPI_MakePrism extends BRepPrimAPI_MakeSweep {

  private long swigCPtr;
  BRepPrimAPI_MakePrism(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakePrism_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepPrimAPI_MakePrism(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepPrimAPI_MakePrism_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepPrimAPI_MakePrism obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepPrimAPI_MakePrism(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Builds the prism of base S and vector V. If C is true,
   *  S is copied. If Canonize is true then generated surfaces
   *  are attempted to be canonized in simple types
   */
  public BRepPrimAPI_MakePrism( TopoDS_Shape  S,  gp_Vec  V, long Copy, long Canonize) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakePrism__SWIG_0(TopoDS_Shape.getCPtr(S), S, gp_Vec.getCPtr(V), V, Copy, Canonize), true);
  }

  /**
   *  Builds a semi-infinite or an infinite prism of base S.
   *  If Inf is true the prism  is infinite, if Inf is false
   *  the prism is semi-infinite (in the direction D).  If C
   *  is true S is copied (for semi-infinite prisms).
   *  If Canonize is true then generated surfaces
   *  are attempted to be canonized in simple types
   */
  public BRepPrimAPI_MakePrism( TopoDS_Shape  S,  gp_Vec  V, long Copy) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakePrism__SWIG_1(TopoDS_Shape.getCPtr(S), S, gp_Vec.getCPtr(V), V, Copy), true);
  }

  public BRepPrimAPI_MakePrism( TopoDS_Shape  S,  gp_Vec  V) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakePrism__SWIG_2(TopoDS_Shape.getCPtr(S), S, gp_Vec.getCPtr(V), V), true);
  }

  public BRepPrimAPI_MakePrism( TopoDS_Shape  S,  gp_Dir  D, long Inf, long Copy, long Canonize) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakePrism__SWIG_3(TopoDS_Shape.getCPtr(S), S, gp_Dir.getCPtr(D), D, Inf, Copy, Canonize), true);
  }

  public BRepPrimAPI_MakePrism( TopoDS_Shape  S,  gp_Dir  D, long Inf, long Copy) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakePrism__SWIG_4(TopoDS_Shape.getCPtr(S), S, gp_Dir.getCPtr(D), D, Inf, Copy), true);
  }

  public BRepPrimAPI_MakePrism( TopoDS_Shape  S,  gp_Dir  D, long Inf) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakePrism__SWIG_5(TopoDS_Shape.getCPtr(S), S, gp_Dir.getCPtr(D), D, Inf), true);
  }

  public BRepPrimAPI_MakePrism( TopoDS_Shape  S,  gp_Dir  D) {
    this(OCCwrapJavaJNI.new_BRepPrimAPI_MakePrism__SWIG_6(TopoDS_Shape.getCPtr(S), S, gp_Dir.getCPtr(D), D), true);
  }

  /**
   *  Returns the internal sweeping algorithm.
   */
  public  BRepSweep_Prism  Prism() {
    BRepSweep_Prism ret = new BRepSweep_Prism(OCCwrapJavaJNI.BRepPrimAPI_MakePrism_Prism(swigCPtr, this), false, this);
    return ret;
  }

  /**
   *  Returns the  TopoDS  Shape of the bottom of the prism.
   */
  public TopoDS_Shape FirstShape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepPrimAPI_MakePrism_FirstShape__SWIG_0(swigCPtr, this), true);
  }

  /**
   *  Returns the TopoDS Shape of the top of the prism.
   *  In the case of a finite prism, FirstShape returns the
   *  basis of the prism, in other words, S if Copy is false;
   *  otherwise, the copy of S belonging to the prism.
   *  LastShape returns the copy of S translated by V at the
   *  time of construction.
   */
  public TopoDS_Shape LastShape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepPrimAPI_MakePrism_LastShape__SWIG_0(swigCPtr, this), true);
  }

  /**
   *  Returns the TopoDS Shape of the bottom  of the  prism.
   *  generated  with  theShape (subShape of the  generating shape).
   */
  public TopoDS_Shape FirstShape( TopoDS_Shape  theShape) {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepPrimAPI_MakePrism_FirstShape__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(theShape), theShape), true);
  }

  /**
   *  Returns the  TopoDS  Shape of the top  of  the  prism.
   *  generated  with  theShape (subShape of the  generating shape).
   */
  public TopoDS_Shape LastShape( TopoDS_Shape  theShape) {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepPrimAPI_MakePrism_LastShape__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(theShape), theShape), true);
  }

}
