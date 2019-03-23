package opencascade;

/**
 *  Fixing face with small size
 */
public class ShapeFix_FixSmallFace extends ShapeFix_Root {
  ShapeFix_FixSmallFace(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public ShapeFix_FixSmallFace() {
    this(OCCwrapJavaJNI.new_ShapeFix_FixSmallFace(), true);
  }

  public void Init( TopoDS_Shape  S) {
    OCCwrapJavaJNI.ShapeFix_FixSmallFace_Init(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

  /**
   *  Fixing case of spot face
   */
  public void Perform() {
    OCCwrapJavaJNI.ShapeFix_FixSmallFace_Perform(swigCPtr, this);
  }

  /**
   *  Fixing case of spot face, if tol = -1 used local tolerance.
   */
  public TopoDS_Shape FixSpotFace() {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeFix_FixSmallFace_FixSpotFace(swigCPtr, this), true);
  }

  /**
   *  Compute average vertex and replacing vertices by new one.
   */
  public long ReplaceVerticesInCaseOfSpot(TopoDS_Face F, double tol) {
    return OCCwrapJavaJNI.ShapeFix_FixSmallFace_ReplaceVerticesInCaseOfSpot(swigCPtr, this, TopoDS_Face.getCPtr(F), F, tol);
  }

  /**
   *  Remove spot face from compound
   */
  public long RemoveFacesInCaseOfSpot( TopoDS_Face  F) {
    return OCCwrapJavaJNI.ShapeFix_FixSmallFace_RemoveFacesInCaseOfSpot(swigCPtr, this, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Fixing case of strip face, if tol = -1 used local tolerance
   */
  public TopoDS_Shape FixStripFace(long wasdone) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeFix_FixSmallFace_FixStripFace__SWIG_0(swigCPtr, this, wasdone), true);
  }

  public TopoDS_Shape FixStripFace() {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeFix_FixSmallFace_FixStripFace__SWIG_1(swigCPtr, this), true);
  }

  /**
   *  Replace veretces and edges.
   */
  public long ReplaceInCaseOfStrip(TopoDS_Face F, TopoDS_Edge E1, TopoDS_Edge E2, double tol) {
    return OCCwrapJavaJNI.ShapeFix_FixSmallFace_ReplaceInCaseOfStrip(swigCPtr, this, TopoDS_Face.getCPtr(F), F, TopoDS_Edge.getCPtr(E1), E1, TopoDS_Edge.getCPtr(E2), E2, tol);
  }

  /**
   *  Remove strip face from compound.
   */
  public long RemoveFacesInCaseOfStrip( TopoDS_Face  F) {
    return OCCwrapJavaJNI.ShapeFix_FixSmallFace_RemoveFacesInCaseOfStrip(swigCPtr, this, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Compute average edge for strip face
   */
  public TopoDS_Edge ComputeSharedEdgeForStripFace( TopoDS_Face  F,  TopoDS_Edge  E1,  TopoDS_Edge  E2,  TopoDS_Face  F1, double tol) {
    return new TopoDS_Edge(OCCwrapJavaJNI.ShapeFix_FixSmallFace_ComputeSharedEdgeForStripFace(swigCPtr, this, TopoDS_Face.getCPtr(F), F, TopoDS_Edge.getCPtr(E1), E1, TopoDS_Edge.getCPtr(E2), E2, TopoDS_Face.getCPtr(F1), F1, tol), true);
  }

  public TopoDS_Shape FixSplitFace( TopoDS_Shape  S) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeFix_FixSmallFace_FixSplitFace(swigCPtr, this, TopoDS_Shape.getCPtr(S), S), true);
  }

  /**
   *  Compute data for face splitting.
   */
  public long SplitOneFace(TopoDS_Face F, TopoDS_Compound theSplittedFaces) {
    return OCCwrapJavaJNI.ShapeFix_FixSmallFace_SplitOneFace(swigCPtr, this, TopoDS_Face.getCPtr(F), F, TopoDS_Compound.getCPtr(theSplittedFaces), theSplittedFaces);
  }

  public TopoDS_Face FixFace( TopoDS_Face  F) {
    return new TopoDS_Face(OCCwrapJavaJNI.ShapeFix_FixSmallFace_FixFace(swigCPtr, this, TopoDS_Face.getCPtr(F), F), true);
  }

  public TopoDS_Shape FixShape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeFix_FixSmallFace_FixShape(swigCPtr, this), true);
  }

  public TopoDS_Shape Shape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeFix_FixSmallFace_Shape(swigCPtr, this), true);
  }

  public long FixPinFace(TopoDS_Face F) {
    return OCCwrapJavaJNI.ShapeFix_FixSmallFace_FixPinFace(swigCPtr, this, TopoDS_Face.getCPtr(F), F);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeFix_FixSmallFace_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_FixSmallFace_get_type_descriptor(), true );
  }

  public static  ShapeFix_FixSmallFace  DownCast( Standard_Transient  T) {
    return new ShapeFix_FixSmallFace ( OCCwrapJavaJNI.ShapeFix_FixSmallFace_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_FixSmallFace_TypeOf(), true );
  }

}
