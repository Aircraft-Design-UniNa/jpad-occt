package opencascade;

/**
 *  The intersection Context contains geometrical
 *  and topological toolkit (classifiers, projectors, etc).
 *  The intersection Context is for caching the tools
 *  to increase the performance.
 */
public class IntTools_Context extends Standard_Transient {
  IntTools_Context(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public IntTools_Context() {
    this(OCCwrapJavaJNI.new_IntTools_Context__SWIG_0(), true);
  }

  public IntTools_Context( NCollection_BaseAllocator  theAllocator) {
    this(OCCwrapJavaJNI.new_IntTools_Context__SWIG_1( NCollection_BaseAllocator.getCPtr(theAllocator) , theAllocator), true);
  }

  /**
   *  Returns a reference to point classifier
   *  for given face
   */
  public IntTools_FClass2d FClass2d( TopoDS_Face  aF) {
    return new IntTools_FClass2d(OCCwrapJavaJNI.IntTools_Context_FClass2d(swigCPtr, this, TopoDS_Face.getCPtr(aF), aF), false);
  }

  /**
   *  Returns a reference to point projector
   *  for given face
   */
  public  GeomAPI_ProjectPointOnSurf  ProjPS( TopoDS_Face  aF) {
    GeomAPI_ProjectPointOnSurf ret = new GeomAPI_ProjectPointOnSurf(OCCwrapJavaJNI.IntTools_Context_ProjPS(swigCPtr, this, TopoDS_Face.getCPtr(aF), aF), false, this);
    return ret;
  }

  /**
   *  Returns a reference to point projector
   *  for given edge
   */
  public  GeomAPI_ProjectPointOnCurve  ProjPC( TopoDS_Edge  aE) {
    GeomAPI_ProjectPointOnCurve ret = new GeomAPI_ProjectPointOnCurve(OCCwrapJavaJNI.IntTools_Context_ProjPC(swigCPtr, this, TopoDS_Edge.getCPtr(aE), aE), false, this);
    return ret;
  }

  /**
   *  Returns a reference to point projector
   *  for given curve
   */
  public  GeomAPI_ProjectPointOnCurve  ProjPT( Geom_Curve  aC) {
    GeomAPI_ProjectPointOnCurve ret = new GeomAPI_ProjectPointOnCurve(OCCwrapJavaJNI.IntTools_Context_ProjPT(swigCPtr, this,  Geom_Curve.getCPtr(aC) , aC), false, this);
    return ret;
  }

  /**
   *  Returns a reference to surface localization data
   *  for given face
   */
  public IntTools_SurfaceRangeLocalizeData SurfaceData( TopoDS_Face  aF) {
    return new IntTools_SurfaceRangeLocalizeData(OCCwrapJavaJNI.IntTools_Context_SurfaceData(swigCPtr, this, TopoDS_Face.getCPtr(aF), aF), false);
  }

  /**
   *  Returns a reference to solid classifier
   *  for given solid
   */
  public  BRepClass3d_SolidClassifier  SolidClassifier( TopoDS_Solid  aSolid) {
    BRepClass3d_SolidClassifier ret = new BRepClass3d_SolidClassifier(OCCwrapJavaJNI.IntTools_Context_SolidClassifier(swigCPtr, this, TopoDS_Solid.getCPtr(aSolid), aSolid), false, this);
    return ret;
  }

  /**
   *  Returns a reference to surface adaptor for given face
   */
  public  BRepAdaptor_Surface  SurfaceAdaptor( TopoDS_Face  theFace) {
    BRepAdaptor_Surface ret = new BRepAdaptor_Surface(OCCwrapJavaJNI.IntTools_Context_SurfaceAdaptor(swigCPtr, this, TopoDS_Face.getCPtr(theFace), theFace), false, this);
    return ret;
  }

  /**
   *  Builds and stores an Oriented Bounding Box for the shape.
   *  Returns a reference to OBB.
   */
  public SWIGTYPE_p_Bnd_OBB OBB( TopoDS_Shape  theShape, double theFuzzyValue) {
    return new SWIGTYPE_p_Bnd_OBB(OCCwrapJavaJNI.IntTools_Context_OBB__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(theShape), theShape, theFuzzyValue), false);
  }

  public SWIGTYPE_p_Bnd_OBB OBB( TopoDS_Shape  theShape) {
    return new SWIGTYPE_p_Bnd_OBB(OCCwrapJavaJNI.IntTools_Context_OBB__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(theShape), theShape), false);
  }

  /**
   *  Computes the boundaries of the face using surface adaptor
   */
  public void UVBounds( TopoDS_Face  theFace, double[] UMin, double[] UMax, double[] VMin, double[] VMax) {
    OCCwrapJavaJNI.IntTools_Context_UVBounds(swigCPtr, this, TopoDS_Face.getCPtr(theFace), theFace, UMin, UMax, VMin, VMax);
  }

  /**
   *  Computes parameter of the Point theP on
   *  the edge aE.
   *  Returns zero if the distance between point
   *  and edge is less than sum of tolerance value of edge and theTopP,
   *  otherwise and for following conditions returns
   *  negative value
   *  1. the edge is degenerated (-1)
   *  2. the edge does not contain 3d curve and pcurves (-2)
   *  3. projection algorithm failed (-3)
   */
  public int ComputePE( gp_Pnt  theP, double theTolP,  TopoDS_Edge  theE, double[] theT, double[] theDist) {
    return OCCwrapJavaJNI.IntTools_Context_ComputePE(swigCPtr, this, gp_Pnt.getCPtr(theP), theP, theTolP, TopoDS_Edge.getCPtr(theE), theE, theT, theDist);
  }

  /**
   *  Computes parameter of the vertex aV on
   *  the edge aE and correct tolerance value for 
   *  the vertex on the edge.
   *  Returns zero if the distance between vertex
   *  and edge is less than sum of tolerances and the fuzzy value,
   *  otherwise and for following conditions returns
   *  negative value: 
   *  1. the edge is degenerated (-1) 
   *  2. the edge does not contain 3d curve and pcurves (-2) 
   *  3. projection algorithm failed (-3)
   */
  public int ComputeVE( TopoDS_Vertex  theV,  TopoDS_Edge  theE, double[] theT, double[] theTol, double theFuzz) {
    return OCCwrapJavaJNI.IntTools_Context_ComputeVE__SWIG_0(swigCPtr, this, TopoDS_Vertex.getCPtr(theV), theV, TopoDS_Edge.getCPtr(theE), theE, theT, theTol, theFuzz);
  }

  public int ComputeVE( TopoDS_Vertex  theV,  TopoDS_Edge  theE, double[] theT, double[] theTol) {
    return OCCwrapJavaJNI.IntTools_Context_ComputeVE__SWIG_1(swigCPtr, this, TopoDS_Vertex.getCPtr(theV), theV, TopoDS_Edge.getCPtr(theE), theE, theT, theTol);
  }

  /**
   *  Computes UV parameters of the vertex aV on face aF
   *  and correct tolerance value for the vertex on the face.
   *  Returns zero if the distance between vertex and face is
   *  less than or equal the sum of tolerances and the fuzzy value 
   *  and the projection point lays inside boundaries of the face.
   *  For following conditions returns negative value 
   *  1. projection algorithm failed (-1) 
   *  2. distance is more than sum of tolerances (-2) 
   *  3. projection point out or on the boundaries of face (-3)
   */
  public int ComputeVF( TopoDS_Vertex  theVertex,  TopoDS_Face  theFace, double[] theU, double[] theV, double[] theTol, double theFuzz) {
    return OCCwrapJavaJNI.IntTools_Context_ComputeVF__SWIG_0(swigCPtr, this, TopoDS_Vertex.getCPtr(theVertex), theVertex, TopoDS_Face.getCPtr(theFace), theFace, theU, theV, theTol, theFuzz);
  }

  public int ComputeVF( TopoDS_Vertex  theVertex,  TopoDS_Face  theFace, double[] theU, double[] theV, double[] theTol) {
    return OCCwrapJavaJNI.IntTools_Context_ComputeVF__SWIG_1(swigCPtr, this, TopoDS_Vertex.getCPtr(theVertex), theVertex, TopoDS_Face.getCPtr(theFace), theFace, theU, theV, theTol);
  }

  /**
   *  Returns the state of the point aP2D
   *  relative to face aF
   */
  public TopAbs_State StatePointFace( TopoDS_Face  aF,  gp_Pnt2d  aP2D) {
    return TopAbs_State.swigToEnum(OCCwrapJavaJNI.IntTools_Context_StatePointFace(swigCPtr, this, TopoDS_Face.getCPtr(aF), aF, gp_Pnt2d.getCPtr(aP2D), aP2D));
  }

  /**
   *  Returns true if the point aP2D is
   *  inside the boundaries of the face aF,
   *  otherwise returns false
   */
  public long IsPointInFace( TopoDS_Face  aF,  gp_Pnt2d  aP2D) {
    return OCCwrapJavaJNI.IntTools_Context_IsPointInFace__SWIG_0(swigCPtr, this, TopoDS_Face.getCPtr(aF), aF, gp_Pnt2d.getCPtr(aP2D), aP2D);
  }

  /**
   *  Returns true if the point aP2D is
   *  inside the boundaries of the face aF,
   *  otherwise returns false
   */
  public long IsPointInFace( gp_Pnt  aP3D,  TopoDS_Face  aF, double aTol) {
    return OCCwrapJavaJNI.IntTools_Context_IsPointInFace__SWIG_1(swigCPtr, this, gp_Pnt.getCPtr(aP3D), aP3D, TopoDS_Face.getCPtr(aF), aF, aTol);
  }

  /**
   *  Returns true if the point aP2D is
   *  inside or on the boundaries of aF
   */
  public long IsPointInOnFace( TopoDS_Face  aF,  gp_Pnt2d  aP2D) {
    return OCCwrapJavaJNI.IntTools_Context_IsPointInOnFace(swigCPtr, this, TopoDS_Face.getCPtr(aF), aF, gp_Pnt2d.getCPtr(aP2D), aP2D);
  }

  /**
   *  Returns true if the distance between point aP3D
   *  and face aF is less or equal to tolerance aTol
   *  and projection point is inside or on the boundaries
   *  of the face aF
   */
  public long IsValidPointForFace( gp_Pnt  aP3D,  TopoDS_Face  aF, double aTol) {
    return OCCwrapJavaJNI.IntTools_Context_IsValidPointForFace(swigCPtr, this, gp_Pnt.getCPtr(aP3D), aP3D, TopoDS_Face.getCPtr(aF), aF, aTol);
  }

  /**
   *  Returns true if IsValidPointForFace returns true
   *  for both face aF1 and aF2
   */
  public long IsValidPointForFaces( gp_Pnt  aP3D,  TopoDS_Face  aF1,  TopoDS_Face  aF2, double aTol) {
    return OCCwrapJavaJNI.IntTools_Context_IsValidPointForFaces(swigCPtr, this, gp_Pnt.getCPtr(aP3D), aP3D, TopoDS_Face.getCPtr(aF1), aF1, TopoDS_Face.getCPtr(aF2), aF2, aTol);
  }

  /**
   *  Returns true if IsValidPointForFace returns true
   *  for some 3d point that lay on the curve aIC bounded by
   *  parameters aT1 and aT2
   */
  public long IsValidBlockForFace(double aT1, double aT2, IntTools_Curve aIC,  TopoDS_Face  aF, double aTol) {
    return OCCwrapJavaJNI.IntTools_Context_IsValidBlockForFace(swigCPtr, this, aT1, aT2, IntTools_Curve.getCPtr(aIC), aIC, TopoDS_Face.getCPtr(aF), aF, aTol);
  }

  /**
   *  Returns true if IsValidBlockForFace returns true
   *  for both faces aF1 and aF2
   */
  public long IsValidBlockForFaces(double aT1, double aT2, IntTools_Curve aIC,  TopoDS_Face  aF1,  TopoDS_Face  aF2, double aTol) {
    return OCCwrapJavaJNI.IntTools_Context_IsValidBlockForFaces(swigCPtr, this, aT1, aT2, IntTools_Curve.getCPtr(aIC), aIC, TopoDS_Face.getCPtr(aF1), aF1, TopoDS_Face.getCPtr(aF2), aF2, aTol);
  }

  /**
   *  Computes parameter of the vertex aV on
   *  the curve aIC.
   *  Returns true if the distance between vertex and
   *  curve is less than sum of tolerance of aV and aTolC,
   *  otherwise or if projection algorithm failed
   *  returns false (in this case aT isn't significant)
   */
  public long IsVertexOnLine( TopoDS_Vertex  aV, IntTools_Curve aIC, double aTolC, double[] aT) {
    return OCCwrapJavaJNI.IntTools_Context_IsVertexOnLine__SWIG_0(swigCPtr, this, TopoDS_Vertex.getCPtr(aV), aV, IntTools_Curve.getCPtr(aIC), aIC, aTolC, aT);
  }

  /**
   *  Computes parameter of the vertex aV on
   *  the curve aIC.
   *  Returns true if the distance between vertex and
   *  curve is less than sum of tolerance of aV and aTolC,
   *  otherwise or if projection algorithm failed
   *  returns false (in this case aT isn't significant)
   */
  public long IsVertexOnLine( TopoDS_Vertex  aV, double aTolV, IntTools_Curve aIC, double aTolC, double[] aT) {
    return OCCwrapJavaJNI.IntTools_Context_IsVertexOnLine__SWIG_1(swigCPtr, this, TopoDS_Vertex.getCPtr(aV), aV, aTolV, IntTools_Curve.getCPtr(aIC), aIC, aTolC, aT);
  }

  /**
   *  Computes parameter of the point aP on
   *  the edge aE.
   *  Returns false if projection algorithm failed
   *  other wiese returns true.
   */
  public long ProjectPointOnEdge( gp_Pnt  aP,  TopoDS_Edge  aE, double[] aT) {
    return OCCwrapJavaJNI.IntTools_Context_ProjectPointOnEdge(swigCPtr, this, gp_Pnt.getCPtr(aP), aP, TopoDS_Edge.getCPtr(aE), aE, aT);
  }

  public Bnd_Box BndBox( TopoDS_Shape  theS) {
    Bnd_Box ret = new Bnd_Box(OCCwrapJavaJNI.IntTools_Context_BndBox(swigCPtr, this, TopoDS_Shape.getCPtr(theS), theS), false, this);
    return ret; //new Bnd_Box.CRef (ret);
  }

  /**
   *  Returns true if the solid <theFace> has
   *  infinite bounds
   */
  public long IsInfiniteFace( TopoDS_Face  theFace) {
    return OCCwrapJavaJNI.IntTools_Context_IsInfiniteFace(swigCPtr, this, TopoDS_Face.getCPtr(theFace), theFace);
  }

  /**
   *  Sets tolerance to be used for projection of point on surface.
   *  Clears map of already cached projectors in order to maintain
   *  correct value for all projectors
   */
  public void SetPOnSProjectionTolerance(double theValue) {
    OCCwrapJavaJNI.IntTools_Context_SetPOnSProjectionTolerance(swigCPtr, this, theValue);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.IntTools_Context_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.IntTools_Context_get_type_descriptor(), true );
  }

  public static  IntTools_Context  DownCast( Standard_Transient  T) {
    return new IntTools_Context ( OCCwrapJavaJNI.IntTools_Context_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.IntTools_Context_TypeOf(), true );
  }

}
