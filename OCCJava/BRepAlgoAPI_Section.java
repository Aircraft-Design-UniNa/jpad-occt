package opencascade;

/**
 *  The algorithm is to build a Secton operation between arguments and tools.
 *  The result of Section operation consists of vertices and edges.
 *  The result of Section operation contains:
 *  1. new vertices that are subjects of V/V, E/E, E/F, F/F interferences
 *  2. vertices that are subjects of V/E, V/F interferences
 *  3. new edges that are subjects of F/F interferences
 *  4. edges that are Common Blocks
 */
public class BRepAlgoAPI_Section extends BRepAlgoAPI_BooleanOperation {

  private long swigCPtr;
  BRepAlgoAPI_Section(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepAlgoAPI_Section_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepAlgoAPI_Section(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepAlgoAPI_Section_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepAlgoAPI_Section obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepAlgoAPI_Section(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Empty constructor
   */
  public BRepAlgoAPI_Section() {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Section__SWIG_0(), true);
  }

  public BRepAlgoAPI_Section( BOPAlgo_PaveFiller  PF) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Section__SWIG_1(BOPAlgo_PaveFiller.getCPtr(PF), PF), true);
  }

  /**
   *  Empty constructor
   *  <PF> - PaveFiller object that is carried out
   */
  public BRepAlgoAPI_Section( TopoDS_Shape  S1,  TopoDS_Shape  S2, long PerformNow) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Section__SWIG_2(TopoDS_Shape.getCPtr(S1), S1, TopoDS_Shape.getCPtr(S2), S2, PerformNow), true);
  }

  /**
   *  Constructor with two shapes
   *  <S1>  -argument
   *  <S2>  -tool
   *  <PerformNow> - the flag:
   *  if <PerformNow>=True - the algorithm is performed immediatly
   *  Obsolete
   */
  public BRepAlgoAPI_Section( TopoDS_Shape  S1,  TopoDS_Shape  S2) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Section__SWIG_3(TopoDS_Shape.getCPtr(S1), S1, TopoDS_Shape.getCPtr(S2), S2), true);
  }

  /**
   *  Constructor with two shapes
   *  <S1>  -argument
   *  <S2>  -tool
   *  <PF> - PaveFiller object that is carried out
   *  <PerformNow> - the flag:
   *  if <PerformNow>=True - the algorithm is performed immediatly
   *  Obsolete
   */
  public BRepAlgoAPI_Section( TopoDS_Shape  S1,  TopoDS_Shape  S2,  BOPAlgo_PaveFiller  aDSF, long PerformNow) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Section__SWIG_4(TopoDS_Shape.getCPtr(S1), S1, TopoDS_Shape.getCPtr(S2), S2, BOPAlgo_PaveFiller.getCPtr(aDSF), aDSF, PerformNow), true);
  }

  /**
   *  Constructor with two shapes
   *  <S1>  - argument
   *  <Pl>  - tool
   *  <PerformNow> - the flag:
   *  if <PerformNow>=True - the algorithm is performed immediatly
   *  Obsolete
   */
  public BRepAlgoAPI_Section( TopoDS_Shape  S1,  TopoDS_Shape  S2,  BOPAlgo_PaveFiller  aDSF) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Section__SWIG_5(TopoDS_Shape.getCPtr(S1), S1, TopoDS_Shape.getCPtr(S2), S2, BOPAlgo_PaveFiller.getCPtr(aDSF), aDSF), true);
  }

  /**
   *  Constructor with two shapes
   *  <S1>  - argument
   *  <Sf>  - tool
   *  <PerformNow> - the flag:
   *  if <PerformNow>=True - the algorithm is performed immediatly
   *  Obsolete
   */
  public BRepAlgoAPI_Section( TopoDS_Shape  S1,  gp_Pln  Pl, long PerformNow) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Section__SWIG_6(TopoDS_Shape.getCPtr(S1), S1, gp_Pln.getCPtr(Pl), Pl, PerformNow), true);
  }

  /**
   *  Constructor with two shapes
   *  <Sf>  - argument
   *  <S2>  - tool
   *  <PerformNow> - the flag:
   *  if <PerformNow>=True - the algorithm is performed immediatly
   *  Obsolete
   */
  public BRepAlgoAPI_Section( TopoDS_Shape  S1,  gp_Pln  Pl) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Section__SWIG_7(TopoDS_Shape.getCPtr(S1), S1, gp_Pln.getCPtr(Pl), Pl), true);
  }

  /**
   *  Constructor with two shapes
   *  <Sf1>  - argument
   *  <Sf2>  - tool
   *  <PerformNow> - the flag:
   *  if <PerformNow>=True - the algorithm is performed immediatly
   *  Obsolete
   */
  public BRepAlgoAPI_Section( TopoDS_Shape  S1,  Geom_Surface  Sf, long PerformNow) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Section__SWIG_8(TopoDS_Shape.getCPtr(S1), S1,  Geom_Surface.getCPtr(Sf) , Sf, PerformNow), true);
  }

  public BRepAlgoAPI_Section( TopoDS_Shape  S1,  Geom_Surface  Sf) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Section__SWIG_9(TopoDS_Shape.getCPtr(S1), S1,  Geom_Surface.getCPtr(Sf) , Sf), true);
  }

  public BRepAlgoAPI_Section( Geom_Surface  Sf,  TopoDS_Shape  S2, long PerformNow) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Section__SWIG_10( Geom_Surface.getCPtr(Sf) , Sf, TopoDS_Shape.getCPtr(S2), S2, PerformNow), true);
  }

  public BRepAlgoAPI_Section( Geom_Surface  Sf,  TopoDS_Shape  S2) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Section__SWIG_11( Geom_Surface.getCPtr(Sf) , Sf, TopoDS_Shape.getCPtr(S2), S2), true);
  }

  public BRepAlgoAPI_Section( Geom_Surface  Sf1,  Geom_Surface  Sf2, long PerformNow) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Section__SWIG_12( Geom_Surface.getCPtr(Sf1) , Sf1,  Geom_Surface.getCPtr(Sf2) , Sf2, PerformNow), true);
  }

  public BRepAlgoAPI_Section( Geom_Surface  Sf1,  Geom_Surface  Sf2) {
    this(OCCwrapJavaJNI.new_BRepAlgoAPI_Section__SWIG_13( Geom_Surface.getCPtr(Sf1) , Sf1,  Geom_Surface.getCPtr(Sf2) , Sf2), true);
  }

  /**
   *  initialize the argument
   *  <S1>  - argument
   *  Obsolete
   */
  public void Init1( TopoDS_Shape  S1) {
    OCCwrapJavaJNI.BRepAlgoAPI_Section_Init1__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(S1), S1);
  }

  /**
   *  initialize the argument
   *  <Pl>  - argument
   *  Obsolete
   */
  public void Init1( gp_Pln  Pl) {
    OCCwrapJavaJNI.BRepAlgoAPI_Section_Init1__SWIG_1(swigCPtr, this, gp_Pln.getCPtr(Pl), Pl);
  }

  /**
   *  initialize the argument
   *  <Sf>  - argument
   *  Obsolete
   */
  public void Init1( Geom_Surface  Sf) {
    OCCwrapJavaJNI.BRepAlgoAPI_Section_Init1__SWIG_2(swigCPtr, this,  Geom_Surface.getCPtr(Sf) , Sf);
  }

  /**
   *  initialize the tool
   *  <S2>  - tool
   *  Obsolete
   */
  public void Init2( TopoDS_Shape  S2) {
    OCCwrapJavaJNI.BRepAlgoAPI_Section_Init2__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(S2), S2);
  }

  /**
   *  initialize the tool
   *  <Pl>  - tool
   *  Obsolete
   */
  public void Init2( gp_Pln  Pl) {
    OCCwrapJavaJNI.BRepAlgoAPI_Section_Init2__SWIG_1(swigCPtr, this, gp_Pln.getCPtr(Pl), Pl);
  }

  /**
   *  initialize the tool
   *  <Sf>  - tool
   *  Obsolete
   */
  public void Init2( Geom_Surface  Sf) {
    OCCwrapJavaJNI.BRepAlgoAPI_Section_Init2__SWIG_2(swigCPtr, this,  Geom_Surface.getCPtr(Sf) , Sf);
  }

  public void Approximation(long B) {
    OCCwrapJavaJNI.BRepAlgoAPI_Section_Approximation(swigCPtr, this, B);
  }

  /**
   *  Indicates whether the P-Curve should be (or not)
   *  performed on the argument.
   *  By default, no parametric 2D curve (pcurve) is defined for the
   *  edges of the result.
   *  If ComputePCurve1 equals true, further computations performed
   *  to attach an P-Curve in the parametric space of the argument
   *  to the constructed edges.
   *  Obsolete
   */
  public void ComputePCurveOn1(long B) {
    OCCwrapJavaJNI.BRepAlgoAPI_Section_ComputePCurveOn1(swigCPtr, this, B);
  }

  /**
   *  Indicates whether the P-Curve should be (or not)
   *  performed on the tool.
   *  By default, no parametric 2D curve (pcurve) is defined for the
   *  edges of the result.
   *  If ComputePCurve1 equals true, further computations performed
   *  to attach an P-Curve in the parametric space of the tool
   *  to the constructed edges.
   *  Obsolete
   */
  public void ComputePCurveOn2(long B) {
    OCCwrapJavaJNI.BRepAlgoAPI_Section_ComputePCurveOn2(swigCPtr, this, B);
  }

  /**
   *  get the face of the first part giving section edge <E>.
   *  Returns True on the 3 following conditions :
   *  1/ <E> is an edge returned by the Shape() metwod.
   *  2/ First part of section performed is a shape.
   *  3/ <E> is built on a intersection curve (i.e <E>
   *  is not the result of common edges)
   *  When False, F remains untouched.
   *  Obsolete
   */
  public long HasAncestorFaceOn1( TopoDS_Shape  E, TopoDS_Shape F) {
    return OCCwrapJavaJNI.BRepAlgoAPI_Section_HasAncestorFaceOn1(swigCPtr, this, TopoDS_Shape.getCPtr(E), E, TopoDS_Shape.getCPtr(F), F);
  }

  /**
   *  Identifies the ancestor faces of
   *  the intersection edge E resulting from the last
   *  computation performed in this framework, that is, the faces of
   *  the two original shapes on which the edge E lies:
   *  -      HasAncestorFaceOn1 gives the ancestor face in the first shape, and
   *  -      HasAncestorFaceOn2 gives the ancestor face in the second shape.
   *  These functions return true if an ancestor face F is found, or false if not.
   *  An ancestor face is identifiable for the edge E if the following
   *  conditions are satisfied:
   *  -  the first part on which this algorithm performed its
   *  last computation is a shape, that is, it was not given as
   *  a surface or a plane at the time of construction of this
   *  algorithm or at a later time by the Init1 function,
   *  - E is one of the elementary edges built by the
   *  last computation of this section algorithm.
   *  To use these functions properly, you have to test the returned
   *  Boolean value before using the ancestor face: F is significant
   *  only if the returned Boolean value equals true.
   *  Obsolete
   */
  public long HasAncestorFaceOn2( TopoDS_Shape  E, TopoDS_Shape F) {
    return OCCwrapJavaJNI.BRepAlgoAPI_Section_HasAncestorFaceOn2(swigCPtr, this, TopoDS_Shape.getCPtr(E), E, TopoDS_Shape.getCPtr(F), F);
  }

}
