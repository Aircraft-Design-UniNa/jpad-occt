package opencascade;

/**
 *  This class provides a description of Quadrics by their
 *  Coefficients in natural coordinate system.
 */
public class IntAna_Quadric {
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  IntAna_Quadric(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  IntAna_Quadric(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(IntAna_Quadric obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Auxiliary structure for holding wrapped C reference to object 
  // requiring explicit decision to use it either as reference or a copy
  /*public class CRef {
    public CRef (IntAna_Quadric ptr) { Ptr = ptr; }
    public IntAna_Quadric AsReference () { return Ptr; }
    public IntAna_Quadric AsCopy () { return Ptr.MakeCopy(); }
    public IntAna_Quadric Ptr;
  }*/
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_IntAna_Quadric(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Empty Constructor
   */
  public IntAna_Quadric() {
    this(OCCwrapJavaJNI.new_IntAna_Quadric__SWIG_0(), true);
  }

  /**
   *  Creates a Quadric from a Pln
   */
  public IntAna_Quadric( gp_Pln  P) {
    this(OCCwrapJavaJNI.new_IntAna_Quadric__SWIG_1(gp_Pln.getCPtr(P), P), true);
  }

  /**
   *  Creates a Quadric from a Sphere
   */
  public IntAna_Quadric( gp_Sphere  Sph) {
    this(OCCwrapJavaJNI.new_IntAna_Quadric__SWIG_2(gp_Sphere.getCPtr(Sph), Sph), true);
  }

  /**
   *  Creates a Quadric from a Cylinder
   */
  public IntAna_Quadric( gp_Cylinder  Cyl) {
    this(OCCwrapJavaJNI.new_IntAna_Quadric__SWIG_3(gp_Cylinder.getCPtr(Cyl), Cyl), true);
  }

  /**
   *  Creates a Quadric from a Cone
   */
  public IntAna_Quadric( gp_Cone  Cone) {
    this(OCCwrapJavaJNI.new_IntAna_Quadric__SWIG_4(gp_Cone.getCPtr(Cone), Cone), true);
  }

  /**
   *  Initializes the quadric with a Pln
   */
  public void SetQuadric( gp_Pln  P) {
    OCCwrapJavaJNI.IntAna_Quadric_SetQuadric__SWIG_0(swigCPtr, this, gp_Pln.getCPtr(P), P);
  }

  /**
   *  Initialize the quadric with a Sphere
   */
  public void SetQuadric( gp_Sphere  Sph) {
    OCCwrapJavaJNI.IntAna_Quadric_SetQuadric__SWIG_1(swigCPtr, this, gp_Sphere.getCPtr(Sph), Sph);
  }

  /**
   *  Initializes the quadric with a Cone
   */
  public void SetQuadric( gp_Cone  Con) {
    OCCwrapJavaJNI.IntAna_Quadric_SetQuadric__SWIG_2(swigCPtr, this, gp_Cone.getCPtr(Con), Con);
  }

  /**
   *  Initializes the quadric with a Cylinder
   */
  public void SetQuadric( gp_Cylinder  Cyl) {
    OCCwrapJavaJNI.IntAna_Quadric_SetQuadric__SWIG_3(swigCPtr, this, gp_Cylinder.getCPtr(Cyl), Cyl);
  }

  /**
   *  Returns the coefficients of the polynomial equation
   *  which define the quadric:
   *  xCXX x**2 + xCYY y**2 + xCZZ z**2
   *  + 2 ( xCXY x y  + xCXZ x z  + xCYZ y z  )
   *  + 2 ( xCX x + xCY y + xCZ z )
   *  + xCCte
   */
  public void Coefficients(double[] xCXX, double[] xCYY, double[] xCZZ, double[] xCXY, double[] xCXZ, double[] xCYZ, double[] xCX, double[] xCY, double[] xCZ, double[] xCCte) {
    OCCwrapJavaJNI.IntAna_Quadric_Coefficients(swigCPtr, this, xCXX, xCYY, xCZZ, xCXY, xCXZ, xCYZ, xCX, xCY, xCZ, xCCte);
  }

  /**
   *  Returns the coefficients of the polynomial equation
   *  ( written in the natural coordinates system )
   *  in the local coordinates system defined by Axis
   */
  public void NewCoefficients(double[] xCXX, double[] xCYY, double[] xCZZ, double[] xCXY, double[] xCXZ, double[] xCYZ, double[] xCX, double[] xCY, double[] xCZ, double[] xCCte,  gp_Ax3  Axis) {
    OCCwrapJavaJNI.IntAna_Quadric_NewCoefficients(swigCPtr, this, xCXX, xCYY, xCZZ, xCXY, xCXZ, xCYZ, xCX, xCY, xCZ, xCCte, gp_Ax3.getCPtr(Axis), Axis);
  }

}
