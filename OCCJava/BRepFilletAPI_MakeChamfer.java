package opencascade;

/**
 *  Describes functions to build chamfers on edges of a shell or solid.
 *  Chamfered Edge of a Shell or Solid
 *  A MakeChamfer object provides a framework for:
 *  -   initializing the construction algorithm with a given shape,
 *  -   acquiring the data characterizing the chamfers,
 *  -   building the chamfers and constructing the resulting shape, and
 *  -   consulting the result.
 */
public class BRepFilletAPI_MakeChamfer extends BRepFilletAPI_LocalOperation {

  private long swigCPtr;
  BRepFilletAPI_MakeChamfer(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepFilletAPI_MakeChamfer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepFilletAPI_MakeChamfer(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepFilletAPI_MakeChamfer_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepFilletAPI_MakeChamfer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepFilletAPI_MakeChamfer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Initializes an algorithm for computing chamfers on the shape S.
   *  The edges on which chamfers are built are defined using the Add function.
   */
  public BRepFilletAPI_MakeChamfer( TopoDS_Shape  S) {
    this(OCCwrapJavaJNI.new_BRepFilletAPI_MakeChamfer(TopoDS_Shape.getCPtr(S), S), true);
  }

  /**
   *  Adds edge E to the table of edges used by this
   *  algorithm to build chamfers, where the parameters
   *  of the chamfer must be set after the
   */
  public void Add( TopoDS_Edge  E) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeChamfer_Add__SWIG_0(swigCPtr, this, TopoDS_Edge.getCPtr(E), E);
  }

  /**
   *  Adds edge E to the table of edges used by this
   *  algorithm to build chamfers, where
   *  the parameters of the chamfer are given by the two
   *  distances Dis1 and Dis2; the face F identifies the side
   *  where Dis1 is measured.
   *  The Add function results in a contour being built by
   *  propagation from the edge E (i.e. the contour contains at
   *  least this edge). This contour is composed of edges of
   *  the shape which are tangential to one another and
   *  which delimit two series of tangential faces, with one
   *  series of faces being located on either side of the contour.
   *  Warning
   *  Nothing is done if edge E or the face F does not belong to the initial shape.
   */
  public void Add(double Dis,  TopoDS_Edge  E,  TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeChamfer_Add__SWIG_1(swigCPtr, this, Dis, TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Sets the distances Dis1 and Dis2 which give the
   *  parameters of the chamfer along the contour of index
   *  IC generated using the Add function in the internal
   *  data structure of this algorithm. The face F identifies
   *  the side where Dis1 is measured.
   *  Warning
   *  Nothing is done if either the edge E or the face F
   *  does not belong to the initial shape.
   */
  public void SetDist(double Dis, int IC,  TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeChamfer_SetDist(swigCPtr, this, Dis, IC, TopoDS_Face.getCPtr(F), F);
  }

  public void GetDist(int IC, double[] Dis) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeChamfer_GetDist(swigCPtr, this, IC, Dis);
  }

  /**
   *  Adds a  fillet contour in  the  builder  (builds a
   *  contour  of tangent edges to <E> and sets the two
   *  distances <Dis1> and <Dis2> ( parameters of the chamfer ) ).
   */
  public void Add(double Dis1, double Dis2,  TopoDS_Edge  E,  TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeChamfer_Add__SWIG_2(swigCPtr, this, Dis1, Dis2, TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Sets the distances Dis1 and Dis2 which give the
   *  parameters of the chamfer along the contour of index
   *  IC generated using the Add function in the internal
   *  data structure of this algorithm. The face F identifies
   *  the side where Dis1 is measured.
   *  Warning
   *  Nothing is done if either the edge E or the face F
   *  does not belong to the initial shape.
   */
  public void SetDists(double Dis1, double Dis2, int IC,  TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeChamfer_SetDists(swigCPtr, this, Dis1, Dis2, IC, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  Returns the distances Dis1 and Dis2 which give the
   *  parameters of the chamfer along the contour of index IC
   *  in the internal data structure of this algorithm.
   *  Warning
   *  -1. is returned if IC is outside the bounds of the table of contours.
   */
  public void Dists(int IC, double[] Dis1, double[] Dis2) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeChamfer_Dists(swigCPtr, this, IC, Dis1, Dis2);
  }

  /**
   *  Adds a  fillet contour in  the  builder  (builds a
   *  contour  of tangent edges to <E> and sets the
   *  distance <Dis1> and angle <Angle> ( parameters of the chamfer ) ).
   */
  public void AddDA(double Dis, double Angle,  TopoDS_Edge  E,  TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeChamfer_AddDA(swigCPtr, this, Dis, Angle, TopoDS_Edge.getCPtr(E), E, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  set the distance <Dis> and <Angle> of the fillet
   *  contour of index <IC> in the DS with <Dis> on <F>.
   *  if the face <F> is not one of common faces
   *  of an edge of the contour <IC>
   */
  public void SetDistAngle(double Dis, double Angle, int IC,  TopoDS_Face  F) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeChamfer_SetDistAngle(swigCPtr, this, Dis, Angle, IC, TopoDS_Face.getCPtr(F), F);
  }

  /**
   *  gives the distances <Dis> and <Angle> of the fillet
   *  contour of index <IC> in the DS
   */
  public void GetDistAngle(int IC, double[] Dis, double[] Angle, long[] DisOnFace1) {
    OCCwrapJavaJNI.BRepFilletAPI_MakeChamfer_GetDistAngle(swigCPtr, this, IC, Dis, Angle, DisOnFace1);
  }

  /**
   *  return True if chamfer symetric false else.
   */
  public long IsSymetric(int IC) {
    return OCCwrapJavaJNI.BRepFilletAPI_MakeChamfer_IsSymetric(swigCPtr, this, IC);
  }

  /**
   *  return True if chamfer is made with two distances false else.
   */
  public long IsTwoDistances(int IC) {
    return OCCwrapJavaJNI.BRepFilletAPI_MakeChamfer_IsTwoDistances(swigCPtr, this, IC);
  }

  /**
   *  return True if chamfer is made with distance and angle false else.
   */
  public long IsDistanceAngle(int IC) {
    return OCCwrapJavaJNI.BRepFilletAPI_MakeChamfer_IsDistanceAngle(swigCPtr, this, IC);
  }

}
