package opencascade;

/**
 *  Algorithm to  build  primitives with  one  axis of
 *  revolution.
 * 
 *  The revolution  body is described by :
 * 
 *  A coordinate  system (Ax2 from  gp). The Z axis is
 *  the rotational axis.
 * 
 *  An Angle around the Axis, When  the Angle  is 2*PI
 *  the primitive is not limited  by planar faces. The
 *  U parameter range from 0 to Angle.
 * 
 *  A parameter range VMin, VMax on the meridian.
 * 
 *  A meridian : The  meridian is a curve described by
 *  a set of deferred methods.
 * 
 *  The  topology consists of  A shell,  Faces,  Wires,
 *  Edges and Vertices.  Methods  are provided to build
 *  all the elements.  Building an element  implies the
 *  automatic building  of  all its  sub-elements.
 * 
 *  So building the shell builds everything.
 * 
 *  There are at most 5 faces :
 * 
 *  - The LateralFace.
 * 
 *  - The TopFace and the BottomFace.
 * 
 *  - The StartFace and the EndFace.
 */
public class BRepPrim_OneAxis {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepPrim_OneAxis(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepPrim_OneAxis(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepPrim_OneAxis obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepPrim_OneAxis(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  The MeridianOffset is added  to the  parameters on
   *  the meridian curve and  to  the  V values  of  the
   *  pcurves. This is  used for the sphere for example,
   *  to give a range on the meridian  edge which is not
   *  VMin, VMax.
   */
  public void SetMeridianOffset(double MeridianOffset) {
    OCCwrapJavaJNI.BRepPrim_OneAxis_SetMeridianOffset__SWIG_0(swigCPtr, this, MeridianOffset);
  }

  public void SetMeridianOffset() {
    OCCwrapJavaJNI.BRepPrim_OneAxis_SetMeridianOffset__SWIG_1(swigCPtr, this);
  }

  /**
   *  Returns the Ax2 from <me>.
   */
  public  gp_Ax2  Axes() {
    gp_Ax2 ret = new gp_Ax2(OCCwrapJavaJNI.BRepPrim_OneAxis_Axes__SWIG_0(swigCPtr, this), true);
    return ret;
  }

  public void Axes( gp_Ax2  A) {
    OCCwrapJavaJNI.BRepPrim_OneAxis_Axes__SWIG_1(swigCPtr, this, gp_Ax2.getCPtr(A), A);
  }

  public double Angle() {
    return OCCwrapJavaJNI.BRepPrim_OneAxis_Angle__SWIG_0(swigCPtr, this);
  }

  public void Angle(double A) {
    OCCwrapJavaJNI.BRepPrim_OneAxis_Angle__SWIG_1(swigCPtr, this, A);
  }

  public double VMin() {
    return OCCwrapJavaJNI.BRepPrim_OneAxis_VMin__SWIG_0(swigCPtr, this);
  }

  public void VMin(double V) {
    OCCwrapJavaJNI.BRepPrim_OneAxis_VMin__SWIG_1(swigCPtr, this, V);
  }

  public double VMax() {
    return OCCwrapJavaJNI.BRepPrim_OneAxis_VMax__SWIG_0(swigCPtr, this);
  }

  public void VMax(double V) {
    OCCwrapJavaJNI.BRepPrim_OneAxis_VMax__SWIG_1(swigCPtr, this, V);
  }

  /**
   *  Returns a face with  no edges.  The surface is the
   *  lateral surface with normals pointing outward. The
   *  U parameter is the angle with the  origin on the X
   *  axis. The  V parameter is   the  parameter of  the
   *  meridian.
   */
  public TopoDS_Face MakeEmptyLateralFace() {
    return new TopoDS_Face(OCCwrapJavaJNI.BRepPrim_OneAxis_MakeEmptyLateralFace(swigCPtr, this), true);
  }

  /**
   *  Returns  an  edge with  a 3D curve   made from the
   *  meridian  in the XZ  plane rotated by <Ang> around
   *  the Z-axis. Ang may be 0 or myAngle.
   */
  public TopoDS_Edge MakeEmptyMeridianEdge(double Ang) {
    return new TopoDS_Edge(OCCwrapJavaJNI.BRepPrim_OneAxis_MakeEmptyMeridianEdge(swigCPtr, this, Ang), true);
  }

  /**
   *  Sets the  parametric curve of the  edge <E> in the
   *  face  <F> to be  the   2d representation  of   the
   *  meridian.
   */
  public void SetMeridianPCurve(TopoDS_Edge E,  TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepPrim_OneAxis_SetMeridianPCurve(swigCPtr, this, TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Returns the meridian point at parameter <V> in the
   *  plane XZ.
   */
  public gp_Pnt2d MeridianValue(double V) {
    return new gp_Pnt2d(OCCwrapJavaJNI.BRepPrim_OneAxis_MeridianValue(swigCPtr, this, V), true);
  }

  /**
   *  Returns True if the point of  parameter <V> on the
   *  meridian is on the Axis. Default implementation is
   *  Abs(MeridianValue(V).X()) < Precision::Confusion()
   */
  public long MeridianOnAxis(double V) {
    return OCCwrapJavaJNI.BRepPrim_OneAxis_MeridianOnAxis(swigCPtr, this, V);
  }

  /**
   *  Returns True  if the  meridian is  closed. Default
   *  implementation                                  is
   *  MeridianValue(VMin).IsEqual(MeridianValue(VMax),
   *  Precision::Confusion())
   */
  public long MeridianClosed() {
    return OCCwrapJavaJNI.BRepPrim_OneAxis_MeridianClosed(swigCPtr, this);
  }

  /**
   *  Returns  True   if  VMax    is  infinite.  Default
   *  Precision::IsPositiveInfinite(VMax);
   */
  public long VMaxInfinite() {
    return OCCwrapJavaJNI.BRepPrim_OneAxis_VMaxInfinite(swigCPtr, this);
  }

  /**
   *  Returns  True   if  VMin    is  infinite.  Default
   *  Precision::IsNegativeInfinite(VMax);
   */
  public long VMinInfinite() {
    return OCCwrapJavaJNI.BRepPrim_OneAxis_VMinInfinite(swigCPtr, this);
  }

  /**
   *  Returns True if  there is  a top  face.
   * 
   *  That is neither : VMaxInfinite()
   *  MeridianClosed()
   *  MeridianOnAxis(VMax)
   */
  public long HasTop() {
    return OCCwrapJavaJNI.BRepPrim_OneAxis_HasTop(swigCPtr, this);
  }

  /**
   *  Returns   True if there is   a bottom  face.
   * 
   *  That is neither : VMinInfinite()
   *  MeridianClosed()
   *  MeridianOnAxis(VMin)
   */
  public long HasBottom() {
    return OCCwrapJavaJNI.BRepPrim_OneAxis_HasBottom(swigCPtr, this);
  }

  /**
   *  Returns True if  there are Start   and  End faces.
   * 
   *  That is : 2*PI  - Angle > Precision::Angular()
   */
  public long HasSides() {
    return OCCwrapJavaJNI.BRepPrim_OneAxis_HasSides(swigCPtr, this);
  }

  /**
   *  Returns the Shell containing all the  Faces of the
   *  primitive.
   */
  public  TopoDS_Shell  Shell() {
    TopoDS_Shell ret = new TopoDS_Shell(OCCwrapJavaJNI.BRepPrim_OneAxis_Shell(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns  the lateral Face.   It is oriented toward
   *  the outside of the primitive.
   */
  public  TopoDS_Face  LateralFace() {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.BRepPrim_OneAxis_LateralFace(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the   top planar  Face.    It  is Oriented
   *  toward the +Z axis (outside).
   */
  public  TopoDS_Face  TopFace() {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.BRepPrim_OneAxis_TopFace(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns  the Bottom planar Face.   It is  Oriented
   *  toward the -Z axis (outside).
   */
  public  TopoDS_Face  BottomFace() {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.BRepPrim_OneAxis_BottomFace(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns  the  Face   starting   the slice, it   is
   *  oriented toward the exterior of the primitive.
   */
  public  TopoDS_Face  StartFace() {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.BRepPrim_OneAxis_StartFace(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the Face ending the slice, it  is oriented
   *  toward the exterior of the primitive.
   */
  public  TopoDS_Face  EndFace() {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.BRepPrim_OneAxis_EndFace(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns  the wire in the lateral face.
   */
  public  TopoDS_Wire  LateralWire() {
    TopoDS_Wire ret = new TopoDS_Wire(OCCwrapJavaJNI.BRepPrim_OneAxis_LateralWire(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the   wire in the   lateral  face with the
   *  start edge.
   */
  public  TopoDS_Wire  LateralStartWire() {
    TopoDS_Wire ret = new TopoDS_Wire(OCCwrapJavaJNI.BRepPrim_OneAxis_LateralStartWire(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the wire with in lateral face with the end
   *  edge.
   */
  public  TopoDS_Wire  LateralEndWire() {
    TopoDS_Wire ret = new TopoDS_Wire(OCCwrapJavaJNI.BRepPrim_OneAxis_LateralEndWire(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the wire in the top face.
   */
  public  TopoDS_Wire  TopWire() {
    TopoDS_Wire ret = new TopoDS_Wire(OCCwrapJavaJNI.BRepPrim_OneAxis_TopWire(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the wire in the bottom face.
   */
  public  TopoDS_Wire  BottomWire() {
    TopoDS_Wire ret = new TopoDS_Wire(OCCwrapJavaJNI.BRepPrim_OneAxis_BottomWire(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the wire  in the  start face.
   */
  public  TopoDS_Wire  StartWire() {
    TopoDS_Wire ret = new TopoDS_Wire(OCCwrapJavaJNI.BRepPrim_OneAxis_StartWire(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns  the wire   in the  start   face  with the
   *  AxisEdge.
   */
  public  TopoDS_Wire  AxisStartWire() {
    TopoDS_Wire ret = new TopoDS_Wire(OCCwrapJavaJNI.BRepPrim_OneAxis_AxisStartWire(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the Wire in   the end face.
   */
  public  TopoDS_Wire  EndWire() {
    TopoDS_Wire ret = new TopoDS_Wire(OCCwrapJavaJNI.BRepPrim_OneAxis_EndWire(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns  the Wire  in  the   end   face  with  the
   *  AxisEdge.
   */
  public  TopoDS_Wire  AxisEndWire() {
    TopoDS_Wire ret = new TopoDS_Wire(OCCwrapJavaJNI.BRepPrim_OneAxis_AxisEndWire(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the Edge built along the Axis and oriented
   *  on +Z of the Axis.
   */
  public  TopoDS_Edge  AxisEdge() {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepPrim_OneAxis_AxisEdge(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the   Edge at angle 0.
   */
  public  TopoDS_Edge  StartEdge() {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepPrim_OneAxis_StartEdge(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the  Edge at  angle Angle.  If !HasSides()
   *  the StartEdge and the EndEdge are the same edge.
   */
  public  TopoDS_Edge  EndEdge() {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepPrim_OneAxis_EndEdge(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the linear Edge between start Face and top
   *  Face.
   */
  public  TopoDS_Edge  StartTopEdge() {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepPrim_OneAxis_StartTopEdge(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the linear  Edge between  start  Face  and
   *  bottom Face.
   */
  public  TopoDS_Edge  StartBottomEdge() {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepPrim_OneAxis_StartBottomEdge(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the linear Edge  between end Face and  top
   *  Face.
   */
  public  TopoDS_Edge  EndTopEdge() {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepPrim_OneAxis_EndTopEdge(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns  the  linear  Edge  between end  Face  and
   *  bottom Face.
   */
  public  TopoDS_Edge  EndBottomEdge() {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepPrim_OneAxis_EndBottomEdge(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the edge at VMax. If  MeridianClosed() the
   *  TopEdge and the BottomEdge are the same edge.
   */
  public  TopoDS_Edge  TopEdge() {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepPrim_OneAxis_TopEdge(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the edge  at VMin. If MeridianClosed() the
   *  TopEdge and the BottomEdge are the same edge.
   */
  public  TopoDS_Edge  BottomEdge() {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepPrim_OneAxis_BottomEdge(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the Vertex at the Top altitude on the axis.
   */
  public  TopoDS_Vertex  AxisTopVertex() {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.BRepPrim_OneAxis_AxisTopVertex(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the Vertex  at the Bottom  altitude on the
   *  axis.
   */
  public  TopoDS_Vertex  AxisBottomVertex() {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.BRepPrim_OneAxis_AxisBottomVertex(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the vertex (0,VMax)
   */
  public  TopoDS_Vertex  TopStartVertex() {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.BRepPrim_OneAxis_TopStartVertex(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the vertex (angle,VMax)
   */
  public  TopoDS_Vertex  TopEndVertex() {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.BRepPrim_OneAxis_TopEndVertex(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the vertex (0,VMin)
   */
  public  TopoDS_Vertex  BottomStartVertex() {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.BRepPrim_OneAxis_BottomStartVertex(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns the vertex (angle,VMax)
   */
  public  TopoDS_Vertex  BottomEndVertex() {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.BRepPrim_OneAxis_BottomEndVertex(swigCPtr, this), true);
    return ret;
  }

}
