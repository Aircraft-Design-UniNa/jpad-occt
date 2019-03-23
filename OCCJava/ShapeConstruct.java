package opencascade;

/**
 *  This package provides new algorithms for constructing
 *  new geometrical objects and topological shapes. It
 *  complements and extends algorithms available in Open
 *  CASCADE topological and geometrical toolkist.
 *  The functionality provided by this package are the
 *  following:
 *  projecting curves on surface,
 *  adjusting curve to have given start and end points. P
 */
public class ShapeConstruct {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeConstruct(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeConstruct(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeConstruct obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeConstruct(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static  Geom_BSplineCurve  ConvertCurveToBSpline( Geom_Curve  C3D, double First, double Last, double Tol3d, GeomAbs_Shape Continuity, int MaxSegments, int MaxDegree) {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.ShapeConstruct_ConvertCurveToBSpline__SWIG_0( Geom_Curve.getCPtr(C3D) , C3D, First, Last, Tol3d, Continuity.swigValue(), MaxSegments, MaxDegree), true );
  }

  public static  Geom2d_BSplineCurve  ConvertCurveToBSpline( Geom2d_Curve  C2D, double First, double Last, double Tol2d, GeomAbs_Shape Continuity, int MaxSegments, int MaxDegree) {
    return new Geom2d_BSplineCurve ( OCCwrapJavaJNI.ShapeConstruct_ConvertCurveToBSpline__SWIG_1( Geom2d_Curve.getCPtr(C2D) , C2D, First, Last, Tol2d, Continuity.swigValue(), MaxSegments, MaxDegree), true );
  }

  public static  Geom_BSplineSurface  ConvertSurfaceToBSpline( Geom_Surface  surf, double UF, double UL, double VF, double VL, double Tol3d, GeomAbs_Shape Continuity, int MaxSegments, int MaxDegree) {
    return new Geom_BSplineSurface ( OCCwrapJavaJNI.ShapeConstruct_ConvertSurfaceToBSpline( Geom_Surface.getCPtr(surf) , surf, UF, UL, VF, VL, Tol3d, Continuity.swigValue(), MaxSegments, MaxDegree), true );
  }

  /**
   *  join pcurves of the <theEdge> on the <theFace>
   *  try to use pcurves from originas edges <theEdges>
   *  Returns false if cannot join pcurves
   */
  public static long JoinPCurves( TopTools_HSequenceOfShape  theEdges,  TopoDS_Face  theFace, TopoDS_Edge theEdge) {
    return OCCwrapJavaJNI.ShapeConstruct_JoinPCurves( TopTools_HSequenceOfShape.getCPtr(theEdges) , theEdges, TopoDS_Face.getCPtr(theFace), theFace, TopoDS_Edge.getCPtr(theEdge), theEdge);
  }

  /**
   *  Method for joininig curves 3D.
   *  Parameters : c3d1,ac3d2 - initial curves
   *  Orient1, Orient2 - initial edges orientations.
   *  first1,last1,first2,last2 - parameters for trimming curves
   *  (re-calculate with account of orientation edges)
   *  c3dOut - result curve
   *  isRev1,isRev2 - out parameters indicative on possible errors.
   *  Return value : True - if curves were joined successfully,
   *  else - False.
   */
  public static long JoinCurves( Geom_Curve  c3d1,  Geom_Curve  ac3d2, TopAbs_Orientation Orient1, TopAbs_Orientation Orient2, double[] first1, double[] last1, double[] first2, double[] last2,  Geom_Curve  c3dOut, long[] isRev1, long[] isRev2) {
    return OCCwrapJavaJNI.ShapeConstruct_JoinCurves__SWIG_0( Geom_Curve.getCPtr(c3d1) , c3d1,  Geom_Curve.getCPtr(ac3d2) , ac3d2, Orient1.swigValue(), Orient2.swigValue(), first1, last1, first2, last2,  Geom_Curve.getCPtr(c3dOut) , c3dOut, isRev1, isRev2);
  }

  /**
   *  Method for joininig curves 3D.
   *  Parameters : c3d1,ac3d2 - initial curves
   *  Orient1, Orient2 - initial edges orientations.
   *  first1,last1,first2,last2 - parameters for trimming curves
   *  (re-calculate with account of orientation edges)
   *  c3dOut - result curve
   *  isRev1,isRev2 - out parameters indicative on possible errors.
   *  isError - input parameter indicative possible errors due to that one from edges have one vertex
   *  Return value : True - if curves were joined successfully,
   *  else - False.
   */
  public static long JoinCurves( Geom2d_Curve  c2d1,  Geom2d_Curve  ac2d2, TopAbs_Orientation Orient1, TopAbs_Orientation Orient2, double[] first1, double[] last1, double[] first2, double[] last2,  Geom2d_Curve  c2dOut, long[] isRev1, long[] isRev2, long isError) {
    return OCCwrapJavaJNI.ShapeConstruct_JoinCurves__SWIG_1( Geom2d_Curve.getCPtr(c2d1) , c2d1,  Geom2d_Curve.getCPtr(ac2d2) , ac2d2, Orient1.swigValue(), Orient2.swigValue(), first1, last1, first2, last2,  Geom2d_Curve.getCPtr(c2dOut) , c2dOut, isRev1, isRev2, isError);
  }

  public static long JoinCurves( Geom2d_Curve  c2d1,  Geom2d_Curve  ac2d2, TopAbs_Orientation Orient1, TopAbs_Orientation Orient2, double[] first1, double[] last1, double[] first2, double[] last2,  Geom2d_Curve  c2dOut, long[] isRev1, long[] isRev2) {
    return OCCwrapJavaJNI.ShapeConstruct_JoinCurves__SWIG_2( Geom2d_Curve.getCPtr(c2d1) , c2d1,  Geom2d_Curve.getCPtr(ac2d2) , ac2d2, Orient1.swigValue(), Orient2.swigValue(), first1, last1, first2, last2,  Geom2d_Curve.getCPtr(c2dOut) , c2dOut, isRev1, isRev2);
  }

  public ShapeConstruct() {
    this(OCCwrapJavaJNI.new_ShapeConstruct(), true);
  }

}
