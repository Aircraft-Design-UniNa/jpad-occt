package opencascade;

/**
 *  This package is intended to
 *  convert geometrical objects and topological. The
 *  modifications of one geometrical object to another
 *  (one) geometrical object are provided. The supported
 *  modifications are the following:
 *  conversion of BSpline and Bezier surfaces to analytical form,
 *  conversion of indirect elementary surfaces (with left-handed
 *  coordinate systems) into  direct ones,
 *  conversion of elementary surfaces to surfaces of revolution,
 *  conversion of surface of linear extrusion, revolution, offset
 *  surface to bspline,
 *  modification of parameterization, degree, number of segments of bspline
 *  surfaces,  scale the shape.
 */
public class ShapeCustom {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeCustom(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeCustom(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeCustom obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeCustom(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Applies modifier to shape and checks sharing in the case assemblies.
   */
  public static TopoDS_Shape ApplyModifier( TopoDS_Shape  S,  BRepTools_Modification  M,  TopTools_DataMapOfShapeShape  context,  BRepTools_Modifier  MD,  Message_ProgressIndicator  aProgress,  ShapeBuild_ReShape  aReShape) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeCustom_ApplyModifier__SWIG_0(TopoDS_Shape.getCPtr(S), S,  BRepTools_Modification.getCPtr(M) , M, TopTools_DataMapOfShapeShape.getCPtr(context), context, BRepTools_Modifier.getCPtr(MD), MD,  Message_ProgressIndicator.getCPtr(aProgress) , aProgress,  ShapeBuild_ReShape.getCPtr(aReShape) , aReShape), true);
  }

  public static TopoDS_Shape ApplyModifier( TopoDS_Shape  S,  BRepTools_Modification  M,  TopTools_DataMapOfShapeShape  context,  BRepTools_Modifier  MD,  Message_ProgressIndicator  aProgress) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeCustom_ApplyModifier__SWIG_1(TopoDS_Shape.getCPtr(S), S,  BRepTools_Modification.getCPtr(M) , M, TopTools_DataMapOfShapeShape.getCPtr(context), context, BRepTools_Modifier.getCPtr(MD), MD,  Message_ProgressIndicator.getCPtr(aProgress) , aProgress), true);
  }

  public static TopoDS_Shape ApplyModifier( TopoDS_Shape  S,  BRepTools_Modification  M,  TopTools_DataMapOfShapeShape  context,  BRepTools_Modifier  MD) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeCustom_ApplyModifier__SWIG_2(TopoDS_Shape.getCPtr(S), S,  BRepTools_Modification.getCPtr(M) , M, TopTools_DataMapOfShapeShape.getCPtr(context), context, BRepTools_Modifier.getCPtr(MD), MD), true);
  }

  /**
   *  Returns a new shape without indirect surfaces.
   */
  public static TopoDS_Shape DirectFaces( TopoDS_Shape  S) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeCustom_DirectFaces(TopoDS_Shape.getCPtr(S), S), true);
  }

  /**
   *  Returns a new shape which is scaled original
   */
  public static TopoDS_Shape ScaleShape( TopoDS_Shape  S, double scale) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeCustom_ScaleShape(TopoDS_Shape.getCPtr(S), S, scale), true);
  }

  public static TopoDS_Shape ApplyBSplineRestriction( TopoDS_Shape  S, double Tol3d, double Tol2d, int MaxDegree, int MaxNbSegment, GeomAbs_Shape Continuity3d, GeomAbs_Shape Continuity2d, long Degree, long Rational,  ShapeCustom_RestrictionParameters  aParameters) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeCustom_ApplyBSplineRestriction(TopoDS_Shape.getCPtr(S), S, Tol3d, Tol2d, MaxDegree, MaxNbSegment, Continuity3d.swigValue(), Continuity2d.swigValue(), Degree, Rational,  ShapeCustom_RestrictionParameters.getCPtr(aParameters) , aParameters), true);
  }

  public static TopoDS_Shape ApplyConvertToRevolution( TopoDS_Shape  S) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeCustom_ApplyConvertToRevolution(TopoDS_Shape.getCPtr(S), S), true);
  }

  public static TopoDS_Shape ApplySweptToElementary( TopoDS_Shape  S) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeCustom_ApplySweptToElementary(TopoDS_Shape.getCPtr(S), S), true);
  }

  public static TopoDS_Shape ApplyConvertToBSpline( TopoDS_Shape  S, long extrMode, long revolMode, long offsetMode, long planeMode) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeCustom_ApplyConvertToBSpline__SWIG_0(TopoDS_Shape.getCPtr(S), S, extrMode, revolMode, offsetMode, planeMode), true);
  }

  public static TopoDS_Shape ApplyConvertToBSpline( TopoDS_Shape  S, long extrMode, long revolMode, long offsetMode) {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeCustom_ApplyConvertToBSpline__SWIG_1(TopoDS_Shape.getCPtr(S), S, extrMode, revolMode, offsetMode), true);
  }

  public ShapeCustom() {
    this(OCCwrapJavaJNI.new_ShapeCustom(), true);
  }

}
