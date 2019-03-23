package opencascade;

/**
 *  Describes a component triangle of a triangulation
 *  (Poly_Triangulation object).
 *  A Triangle is defined by a triplet of nodes. Each node is an
 *  index in the table of nodes specific to an existing
 *  triangulation of a shape, and represents a point on the surface.
 */
public class Poly_Triangle {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  Poly_Triangle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  Poly_Triangle(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(Poly_Triangle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (Poly_Triangle ptr) { Ptr = ptr; }
    public Poly_Triangle AsReference () { return Ptr; }
    public Poly_Triangle AsCopy () { return Ptr.MakeCopy(); }
    public Poly_Triangle Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_Poly_Triangle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructs a triangle and sets all indices to zero.
   */
  public Poly_Triangle() {
    this(OCCwrapJavaJNI.new_Poly_Triangle__SWIG_0(), true);
  }

  /**
   *  Constructs a triangle and sets its three indices
   *  to N1, N2 and N3 respectively, where these node values
   *  are indices in the table of nodes specific to an existing
   *  triangulation of a shape.
   */
  public Poly_Triangle(int N1, int N2, int N3) {
    this(OCCwrapJavaJNI.new_Poly_Triangle__SWIG_1(N1, N2, N3), true);
  }

  /**
   *  Sets the value of  the three nodes of this triangle to N1, N2 and N3   respectively.
   */
  public void Set(int N1, int N2, int N3) {
    OCCwrapJavaJNI.Poly_Triangle_Set__SWIG_0(swigCPtr, this, N1, N2, N3);
  }

  /**
   *  Sets the value of  the Indexth node of this triangle to Node.
   *  Raises OutOfRange if Index is not in 1,2,3
   */
  public void Set(int Index, int Node) {
    OCCwrapJavaJNI.Poly_Triangle_Set__SWIG_1(swigCPtr, this, Index, Node);
  }

  /**
   *  Returns the node indices of this triangle in N1, N2 and N3.
   */
  public void Get(int[] N1, int[] N2, int[] N3) {
    OCCwrapJavaJNI.Poly_Triangle_Get(swigCPtr, this, N1, N2, N3);
  }

  /**
   *  Get the node of given Index.
   *  Raises OutOfRange from Standard if Index is not in 1,2,3
   */
  public int Value(int Index) {
    return OCCwrapJavaJNI.Poly_Triangle_Value(swigCPtr, this, Index);
  }

  public int[] ChangeValue(int Index) {return OCCwrapJavaJNI.Poly_Triangle_ChangeValue(swigCPtr, this, Index);}

}
