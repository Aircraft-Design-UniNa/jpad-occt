package opencascade;

/**
 *  A wedge is defined by  :
 * 
 *  Axes : an Axis2 (coordinate system)
 * 
 *  YMin, YMax the  coordinates of the  ymin and ymax
 *  rectangular faces parallel to the ZX plane (of the
 *  coordinate systems)
 * 
 *  ZMin,ZMax,XMin,XMax the rectangular
 *  left (YMin) face parallel to the Z and X axes.
 * 
 *  Z2Min,Z2Max,X2Min,X2Max the rectangular
 *  right (YMax) face parallel to the Z and X axes.
 * 
 *  For a box Z2Min = ZMin, Z2Max = ZMax,
 *  X2Min = XMin, X2Max = XMax
 * 
 *  The wedge can be open in the corresponding direction
 *  of its Boolean myInfinite
 */
public class BRepPrim_GWedge {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepPrim_GWedge(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepPrim_GWedge(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepPrim_GWedge obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepPrim_GWedge(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Creates a  GWedge  algorithm.   <Axes> is  the axis
   *  system for the primitive.
   * 
   *  XMin, YMin, ZMin are set to 0
   *  XMax, YMax, ZMax are set to dx, dy, dz
   *  Z2Min = ZMin
   *  Z2Max = ZMax
   *  X2Min = XMin
   *  X2Max = XMax
   *  The result is a box
   *  dx,dy,dz should be positive
   */
  public BRepPrim_GWedge( BRepPrim_Builder  B,  gp_Ax2  Axes, double dx, double dy, double dz) {
    this(OCCwrapJavaJNI.new_BRepPrim_GWedge__SWIG_0(BRepPrim_Builder.getCPtr(B), B, gp_Ax2.getCPtr(Axes), Axes, dx, dy, dz), true);
  }

  /**
   *  Creates  a GWedge  primitive. <Axes> is   the  axis
   *  system for the primitive.
   * 
   *  XMin, YMin, ZMin are set to 0
   *  XMax, YMax, ZMax are set to dx, dy, dz
   *  Z2Min = ZMin
   *  Z2Max = ZMax
   *  X2Min = ltx
   *  X2Max = ltx
   *  The result is a STEP right angular wedge
   *  dx,dy,dz should be positive
   *  ltx should not be negative
   */
  public BRepPrim_GWedge( BRepPrim_Builder  B,  gp_Ax2  Axes, double dx, double dy, double dz, double ltx) {
    this(OCCwrapJavaJNI.new_BRepPrim_GWedge__SWIG_1(BRepPrim_Builder.getCPtr(B), B, gp_Ax2.getCPtr(Axes), Axes, dx, dy, dz, ltx), true);
  }

  /**
   *  Create  a GWedge primitive.   <Axes>  is  the  axis
   *  system for the primitive.
   * 
   *  all the fields are set to the corresponding value
   *  XYZMax - XYZMin should be positive
   *  ZX2Max - ZX2Min should not be negative
   */
  public BRepPrim_GWedge( BRepPrim_Builder  B,  gp_Ax2  Axes, double xmin, double ymin, double zmin, double z2min, double x2min, double xmax, double ymax, double zmax, double z2max, double x2max) {
    this(OCCwrapJavaJNI.new_BRepPrim_GWedge__SWIG_2(BRepPrim_Builder.getCPtr(B), B, gp_Ax2.getCPtr(Axes), Axes, xmin, ymin, zmin, z2min, x2min, xmax, ymax, zmax, z2max, x2max), true);
  }

  /**
   *  Returns the coordinates system from <me>.
   */
  public gp_Ax2 Axes() {
    return new gp_Ax2(OCCwrapJavaJNI.BRepPrim_GWedge_Axes(swigCPtr, this), true);
  }

  /**
   *  Returns Xmin value from <me>.
   */
  public double GetXMin() {
    return OCCwrapJavaJNI.BRepPrim_GWedge_GetXMin(swigCPtr, this);
  }

  /**
   *  Returns YMin value from <me>.
   */
  public double GetYMin() {
    return OCCwrapJavaJNI.BRepPrim_GWedge_GetYMin(swigCPtr, this);
  }

  /**
   *  Returns ZMin value from <me>.
   */
  public double GetZMin() {
    return OCCwrapJavaJNI.BRepPrim_GWedge_GetZMin(swigCPtr, this);
  }

  /**
   *  Returns Z2Min value from <me>.
   */
  public double GetZ2Min() {
    return OCCwrapJavaJNI.BRepPrim_GWedge_GetZ2Min(swigCPtr, this);
  }

  /**
   *  Returns X2Min value from <me>.
   */
  public double GetX2Min() {
    return OCCwrapJavaJNI.BRepPrim_GWedge_GetX2Min(swigCPtr, this);
  }

  /**
   *  Returns XMax value from <me>.
   */
  public double GetXMax() {
    return OCCwrapJavaJNI.BRepPrim_GWedge_GetXMax(swigCPtr, this);
  }

  /**
   *  Returns YMax value from <me>.
   */
  public double GetYMax() {
    return OCCwrapJavaJNI.BRepPrim_GWedge_GetYMax(swigCPtr, this);
  }

  /**
   *  Returns ZMax value from <me>.
   */
  public double GetZMax() {
    return OCCwrapJavaJNI.BRepPrim_GWedge_GetZMax(swigCPtr, this);
  }

  /**
   *  Returns Z2Max value from <me>.
   */
  public double GetZ2Max() {
    return OCCwrapJavaJNI.BRepPrim_GWedge_GetZ2Max(swigCPtr, this);
  }

  /**
   *  Returns X2Max value from <me>.
   */
  public double GetX2Max() {
    return OCCwrapJavaJNI.BRepPrim_GWedge_GetX2Max(swigCPtr, this);
  }

  /**
   *  Opens <me> in <d1> direction. A face and its edges
   *  or vertices are said nonexistant.
   */
  public void Open(BRepPrim_Direction d1) {
    OCCwrapJavaJNI.BRepPrim_GWedge_Open(swigCPtr, this, d1.swigValue());
  }

  /**
   *  Closes   <me>  in <d1>  direction.  A face and its
   *  edges or vertices are said existant.
   */
  public void Close(BRepPrim_Direction d1) {
    OCCwrapJavaJNI.BRepPrim_GWedge_Close(swigCPtr, this, d1.swigValue());
  }

  /**
   *  Returns True if <me> is open in <d1> direction.
   */
  public long IsInfinite(BRepPrim_Direction d1) {
    return OCCwrapJavaJNI.BRepPrim_GWedge_IsInfinite(swigCPtr, this, d1.swigValue());
  }

  /**
   *  Returns the Shell containing the Faces of <me>.
   */
  public  TopoDS_Shell  Shell() {
    TopoDS_Shell ret = new TopoDS_Shell(OCCwrapJavaJNI.BRepPrim_GWedge_Shell(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Returns True if <me> has a Face in <d1> direction.
   */
  public long HasFace(BRepPrim_Direction d1) {
    return OCCwrapJavaJNI.BRepPrim_GWedge_HasFace(swigCPtr, this, d1.swigValue());
  }

  /**
   *  Returns the Face of <me> located in <d1> direction.
   */
  public  TopoDS_Face  Face(BRepPrim_Direction d1) {
    TopoDS_Face ret = new TopoDS_Face(OCCwrapJavaJNI.BRepPrim_GWedge_Face(swigCPtr, this, d1.swigValue()), true);
    return ret;
  }

  /**
   *  Returns the plane  of the Face  of <me> located in
   *  <d1> direction.
   */
  public gp_Pln Plane(BRepPrim_Direction d1) {
    return new gp_Pln(OCCwrapJavaJNI.BRepPrim_GWedge_Plane(swigCPtr, this, d1.swigValue()), true);
  }

  /**
   *  Returns True if <me> has a Wire in <d1> direction.
   */
  public long HasWire(BRepPrim_Direction d1) {
    return OCCwrapJavaJNI.BRepPrim_GWedge_HasWire(swigCPtr, this, d1.swigValue());
  }

  /**
   *  Returns the Wire of <me> located in <d1> direction.
   */
  public  TopoDS_Wire  Wire(BRepPrim_Direction d1) {
    TopoDS_Wire ret = new TopoDS_Wire(OCCwrapJavaJNI.BRepPrim_GWedge_Wire(swigCPtr, this, d1.swigValue()), true);
    return ret;
  }

  /**
   *  Returns True if <me> has an Edge in <d1><d2> direction.
   */
  public long HasEdge(BRepPrim_Direction d1, BRepPrim_Direction d2) {
    return OCCwrapJavaJNI.BRepPrim_GWedge_HasEdge(swigCPtr, this, d1.swigValue(), d2.swigValue());
  }

  /**
   *  Returns the Edge of <me> located in <d1><d2> direction.
   */
  public  TopoDS_Edge  Edge(BRepPrim_Direction d1, BRepPrim_Direction d2) {
    TopoDS_Edge ret = new TopoDS_Edge(OCCwrapJavaJNI.BRepPrim_GWedge_Edge(swigCPtr, this, d1.swigValue(), d2.swigValue()), true);
    return ret;
  }

  /**
   *  Returns the line of  the Edge of <me>  located  in
   *  <d1><d2> direction.
   */
  public gp_Lin Line(BRepPrim_Direction d1, BRepPrim_Direction d2) {
    return new gp_Lin(OCCwrapJavaJNI.BRepPrim_GWedge_Line(swigCPtr, this, d1.swigValue(), d2.swigValue()), true);
  }

  /**
   *  Returns True if <me> has a  Vertex in <d1><d2><d3>
   *  direction.
   */
  public long HasVertex(BRepPrim_Direction d1, BRepPrim_Direction d2, BRepPrim_Direction d3) {
    return OCCwrapJavaJNI.BRepPrim_GWedge_HasVertex(swigCPtr, this, d1.swigValue(), d2.swigValue(), d3.swigValue());
  }

  /**
   *  Returns the Vertex of <me> located in <d1><d2><d3>
   *  direction.
   */
  public  TopoDS_Vertex  Vertex(BRepPrim_Direction d1, BRepPrim_Direction d2, BRepPrim_Direction d3) {
    TopoDS_Vertex ret = new TopoDS_Vertex(OCCwrapJavaJNI.BRepPrim_GWedge_Vertex(swigCPtr, this, d1.swigValue(), d2.swigValue(), d3.swigValue()), true);
    return ret;
  }

  /**
   *  Returns the point of the Vertex of <me> located in
   *  <d1><d2><d3> direction.
   */
  public gp_Pnt Point(BRepPrim_Direction d1, BRepPrim_Direction d2, BRepPrim_Direction d3) {
    return new gp_Pnt(OCCwrapJavaJNI.BRepPrim_GWedge_Point(swigCPtr, this, d1.swigValue(), d2.swigValue(), d3.swigValue()), true);
  }

}
