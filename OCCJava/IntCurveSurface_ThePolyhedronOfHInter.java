package opencascade;

public class IntCurveSurface_ThePolyhedronOfHInter {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntCurveSurface_ThePolyhedronOfHInter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntCurveSurface_ThePolyhedronOfHInter(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntCurveSurface_ThePolyhedronOfHInter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (IntCurveSurface_ThePolyhedronOfHInter ptr) { Ptr = ptr; }
    public IntCurveSurface_ThePolyhedronOfHInter AsReference () { return Ptr; }
    public IntCurveSurface_ThePolyhedronOfHInter AsCopy () { return Ptr.MakeCopy(); }
    public IntCurveSurface_ThePolyhedronOfHInter Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntCurveSurface_ThePolyhedronOfHInter(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntCurveSurface_ThePolyhedronOfHInter( Adaptor3d_HSurface  Surface, int nbdU, int nbdV, double U1, double V1, double U2, double V2) {
    this(OCCwrapJavaJNI.new_IntCurveSurface_ThePolyhedronOfHInter__SWIG_0( Adaptor3d_HSurface.getCPtr(Surface) , Surface, nbdU, nbdV, U1, V1, U2, V2), true);
  }

  public IntCurveSurface_ThePolyhedronOfHInter( Adaptor3d_HSurface  Surface,  TColStd_Array1OfReal  Upars,  TColStd_Array1OfReal  Vpars) {
    this(OCCwrapJavaJNI.new_IntCurveSurface_ThePolyhedronOfHInter__SWIG_1( Adaptor3d_HSurface.getCPtr(Surface) , Surface, TColStd_Array1OfReal.getCPtr(Upars), Upars, TColStd_Array1OfReal.getCPtr(Vpars), Vpars), true);
  }

  public void Destroy() {
    OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_Destroy(swigCPtr, this);
  }

  public void DeflectionOverEstimation(double flec) {
    OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_DeflectionOverEstimation__SWIG_0(swigCPtr, this, flec);
  }

  public double DeflectionOnTriangle( Adaptor3d_HSurface  Surface, int Index) {
    return OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_DeflectionOnTriangle(swigCPtr, this,  Adaptor3d_HSurface.getCPtr(Surface) , Surface, Index);
  }

  /**
   *  get the size of the discretization.
   */
  public void Size(int[] nbdu, int[] nbdv) {
    OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_Size(swigCPtr, this, nbdu, nbdv);
  }

  /**
   *  Give the number of triangles in this double array of
   */
  public int NbTriangles() {
    return OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_NbTriangles(swigCPtr, this);
  }

  /**
   *  Give the 3 points of the triangle of addresse Index in
   *  the double array of triangles.
   */
  public void Triangle(int Index, int[] P1, int[] P2, int[] P3) {
    OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_Triangle(swigCPtr, this, Index, P1, P2, P3);
  }

  /**
   *  Give the addresse Tricon of the triangle connexe to the
   *  triangle of address Triang by the edge Pivot Pedge and
   *  the third point of this connexe triangle. When we are
   *  on a free edge TriCon==0 but the function return the
   *  value of the triangle in the other side of Pivot on
   *  the free edge. Used to turn around a vertex.
   */
  public int TriConnex(int Triang, int Pivot, int Pedge, int[] TriCon, int[] OtherP) {
    return OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_TriConnex(swigCPtr, this, Triang, Pivot, Pedge, TriCon, OtherP);
  }

  /**
   *  Give the number of point in the double array of
   *  triangles ((nbdu+1)*(nbdv+1)).
   */
  public int NbPoints() {
    return OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_NbPoints(swigCPtr, this);
  }

  /**
   *  Set the value of a field of the double array of
   *  points.
   */
  public void Point( gp_Pnt  thePnt, int lig, int col, double U, double V) {
    OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_Point__SWIG_0(swigCPtr, this, gp_Pnt.getCPtr(thePnt), thePnt, lig, col, U, V);
  }

  /**
   *  Give the point of index i in the MaTriangle.
   */
  public  gp_Pnt  Point(int Index, double[] U, double[] V) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_Point__SWIG_1(swigCPtr, this, Index, U, V), true);
    return ret;
  }

  /**
   *  Give the point of index i in the MaTriangle.
   */
  public  gp_Pnt  Point(int Index) {
    gp_Pnt ret = new gp_Pnt(OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_Point__SWIG_2(swigCPtr, this, Index), true);
    return ret;
  }

  /**
   *  Give the point of index i in the MaTriangle.
   */
  public void Point(int Index, gp_Pnt P) {
    OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_Point__SWIG_3(swigCPtr, this, Index, gp_Pnt.getCPtr(P), P);
  }

  /**
   *  Give the bounding box of the MaTriangle.
   */
  public  Bnd_Box  Bounding() {
    Bnd_Box ret = new Bnd_Box(OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_Bounding(swigCPtr, this), true);
    return ret;
  }

  /**
   *  Compute the array of boxes. The box <n> corresponding
   *  to the triangle <n>.
   */
  public void FillBounding() {
    OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_FillBounding(swigCPtr, this);
  }

  public  Bnd_HArray1OfBox  ComponentsBounding() {
    return new Bnd_HArray1OfBox ( OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_ComponentsBounding(swigCPtr, this), true );
  }

  public double DeflectionOverEstimation() {
    return OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_DeflectionOverEstimation__SWIG_1(swigCPtr, this);
  }

  /**
   *  Give the plane equation of the triangle of addresse Triang.
   */
  public void PlaneEquation(int Triang, gp_XYZ NormalVector, double[] PolarDistance) {
    OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_PlaneEquation(swigCPtr, this, Triang, gp_XYZ.getCPtr(NormalVector), NormalVector, PolarDistance);
  }

  /**
   *  Give the plane equation of the triangle of addresse Triang.
   */
  public long Contain(int Triang,  gp_Pnt  ThePnt) {
    return OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_Contain(swigCPtr, this, Triang, gp_Pnt.getCPtr(ThePnt), ThePnt);
  }

  public void Parameters(int Index, double[] U, double[] V) {
    OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_Parameters(swigCPtr, this, Index, U, V);
  }

  /**
   *  This method returns true if the edge based on points with
   *  indices Index1 and Index2 represents a boundary edge. It is
   *  necessary to take into account the boundary deflection for
   *  this edge.
   */
  public long IsOnBound(int Index1, int Index2) {
    return OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_IsOnBound(swigCPtr, this, Index1, Index2);
  }

  /**
   *  This method returns a border deflection.
   */
  public double GetBorderDeflection() {
    return OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_GetBorderDeflection(swigCPtr, this);
  }

  public void Dump() {
    OCCwrapJavaJNI.IntCurveSurface_ThePolyhedronOfHInter_Dump(swigCPtr, this);
  }

}
