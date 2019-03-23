package opencascade;

/**
 *  Provides an algorithm to compute a point on a curve
 *  situated at a given distance from another point on the
 *  curve, the distance being measured along the curve
 *  (curvilinear abscissa on the curve).
 *  This algorithm is also used to compute the length of a curve.
 *  An AbscissaPoint object provides a framework for:
 *  -   defining the point to compute
 *  -   implementing the construction algorithm
 *  -   consulting the result.
 */
public class GCPnts_AbscissaPoint {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GCPnts_AbscissaPoint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GCPnts_AbscissaPoint(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GCPnts_AbscissaPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GCPnts_AbscissaPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Computes the length of the Curve <C>.
   */
  public static double Length( Adaptor3d_Curve  C) {
    return OCCwrapJavaJNI.GCPnts_AbscissaPoint_Length__SWIG_0(Adaptor3d_Curve.getCPtr(C), C);
  }

  /**
   *  Computes the length of the Curve <C>.
   */
  public static double Length( Adaptor2d_Curve2d  C) {
    return OCCwrapJavaJNI.GCPnts_AbscissaPoint_Length__SWIG_1(Adaptor2d_Curve2d.getCPtr(C), C);
  }

  /**
   *  Computes the length of the Curve <C> with the given tolerance.
   */
  public static double Length( Adaptor3d_Curve  C, double Tol) {
    return OCCwrapJavaJNI.GCPnts_AbscissaPoint_Length__SWIG_2(Adaptor3d_Curve.getCPtr(C), C, Tol);
  }

  /**
   *  Computes the length of the Curve <C> with the given tolerance.
   */
  public static double Length( Adaptor2d_Curve2d  C, double Tol) {
    return OCCwrapJavaJNI.GCPnts_AbscissaPoint_Length__SWIG_3(Adaptor2d_Curve2d.getCPtr(C), C, Tol);
  }

  /**
   *  Computes the length of the Curve <C>.
   */
  public static double Length( Adaptor3d_Curve  C, double U1, double U2) {
    return OCCwrapJavaJNI.GCPnts_AbscissaPoint_Length__SWIG_4(Adaptor3d_Curve.getCPtr(C), C, U1, U2);
  }

  /**
   *  Computes the length of the Curve <C>.
   */
  public static double Length( Adaptor2d_Curve2d  C, double U1, double U2) {
    return OCCwrapJavaJNI.GCPnts_AbscissaPoint_Length__SWIG_5(Adaptor2d_Curve2d.getCPtr(C), C, U1, U2);
  }

  /**
   *  Computes the length of the Curve <C> with the given tolerance.
   */
  public static double Length( Adaptor3d_Curve  C, double U1, double U2, double Tol) {
    return OCCwrapJavaJNI.GCPnts_AbscissaPoint_Length__SWIG_6(Adaptor3d_Curve.getCPtr(C), C, U1, U2, Tol);
  }

  /**
   *  Computes the length of the Curve <C> with the given tolerance.
   *  Constructs an empty algorithm. This function is used
   *  only for initializing a framework to compute the length
   *  of a curve (or a series of curves).
   *  Warning
   *  The function IsDone will return the value false after the use of this function.
   */
  public static double Length( Adaptor2d_Curve2d  C, double U1, double U2, double Tol) {
    return OCCwrapJavaJNI.GCPnts_AbscissaPoint_Length__SWIG_7(Adaptor2d_Curve2d.getCPtr(C), C, U1, U2, Tol);
  }

  public GCPnts_AbscissaPoint() {
    this(OCCwrapJavaJNI.new_GCPnts_AbscissaPoint__SWIG_0(), true);
  }

  /**
   *  the algorithm computes a point on a curve <Curve> at the
   *  distance <Abscissa> from the point of parameter <U0>.
   */
  public GCPnts_AbscissaPoint( Adaptor3d_Curve  C, double Abscissa, double U0) {
    this(OCCwrapJavaJNI.new_GCPnts_AbscissaPoint__SWIG_1(Adaptor3d_Curve.getCPtr(C), C, Abscissa, U0), true);
  }

  /**
   *  the  algorithm computes a point on  a curve <Curve> at
   *  the distance  <Abscissa> from the  point of parameter
   *  <U0> with the given  tolerance.
   */
  public GCPnts_AbscissaPoint(double Tol,  Adaptor3d_Curve  C, double Abscissa, double U0) {
    this(OCCwrapJavaJNI.new_GCPnts_AbscissaPoint__SWIG_2(Tol, Adaptor3d_Curve.getCPtr(C), C, Abscissa, U0), true);
  }

  /**
   *  the  algorithm computes a point on  a curve <Curve> at
   *  the distance  <Abscissa> from the  point of parameter
   *  <U0> with the given  tolerance.
   */
  public GCPnts_AbscissaPoint(double Tol,  Adaptor2d_Curve2d  C, double Abscissa, double U0) {
    this(OCCwrapJavaJNI.new_GCPnts_AbscissaPoint__SWIG_3(Tol, Adaptor2d_Curve2d.getCPtr(C), C, Abscissa, U0), true);
  }

  /**
   *  the algorithm computes a point on a curve <Curve> at the
   *  distance <Abscissa> from the point of parameter <U0>.
   */
  public GCPnts_AbscissaPoint( Adaptor2d_Curve2d  C, double Abscissa, double U0) {
    this(OCCwrapJavaJNI.new_GCPnts_AbscissaPoint__SWIG_4(Adaptor2d_Curve2d.getCPtr(C), C, Abscissa, U0), true);
  }

  /**
   *  the algorithm computes a point on a curve <Curve> at the
   *  distance <Abscissa> from the point of parameter <U0>.
   *  <Ui> is the starting value used in the iterative process
   *  which find the solution, it must be close to the final
   *  solution
   */
  public GCPnts_AbscissaPoint( Adaptor3d_Curve  C, double Abscissa, double U0, double Ui) {
    this(OCCwrapJavaJNI.new_GCPnts_AbscissaPoint__SWIG_5(Adaptor3d_Curve.getCPtr(C), C, Abscissa, U0, Ui), true);
  }

  /**
   *  the algorithm computes a point on a curve <Curve> at the
   *  distance <Abscissa> from the point of parameter <U0>.
   *  <Ui> is the starting value used in the iterative process
   *  which find the solution, it must be closed to the final
   *  solution
   */
  public GCPnts_AbscissaPoint( Adaptor2d_Curve2d  C, double Abscissa, double U0, double Ui) {
    this(OCCwrapJavaJNI.new_GCPnts_AbscissaPoint__SWIG_6(Adaptor2d_Curve2d.getCPtr(C), C, Abscissa, U0, Ui), true);
  }

  /**
   *  the algorithm computes a point on a curve <Curve> at the
   *  distance <Abscissa> from the point of parameter <U0>.
   *  <Ui> is the starting value used in the iterative process
   *  which find the solution, it must be close to the final
   *  solution
   */
  public GCPnts_AbscissaPoint( Adaptor3d_Curve  C, double Abscissa, double U0, double Ui, double Tol) {
    this(OCCwrapJavaJNI.new_GCPnts_AbscissaPoint__SWIG_7(Adaptor3d_Curve.getCPtr(C), C, Abscissa, U0, Ui, Tol), true);
  }

  /**
   *  the algorithm computes a point on a curve <Curve> at the
   *  distance <Abscissa> from the point of parameter <U0>.
   *  <Ui> is the starting value used in the iterative process
   *  which find the solution, it must be close to the final
   *  solution
   */
  public GCPnts_AbscissaPoint( Adaptor2d_Curve2d  C, double Abscissa, double U0, double Ui, double Tol) {
    this(OCCwrapJavaJNI.new_GCPnts_AbscissaPoint__SWIG_8(Adaptor2d_Curve2d.getCPtr(C), C, Abscissa, U0, Ui, Tol), true);
  }

  /**
   *  True if the computation was successful, False otherwise.
   *  IsDone is a protection against:
   *  -   non-convergence of the algorithm
   *  -   querying the results before computation.
   */
  public long IsDone() {
    return OCCwrapJavaJNI.GCPnts_AbscissaPoint_IsDone(swigCPtr, this);
  }

  /**
   *  Returns the parameter on the curve of the point
   *  solution of this algorithm.
   *  Exceptions
   *  StdFail_NotDone if the computation was not
   *  successful, or was not done.
   */
  public double Parameter() {
    return OCCwrapJavaJNI.GCPnts_AbscissaPoint_Parameter(swigCPtr, this);
  }

}
