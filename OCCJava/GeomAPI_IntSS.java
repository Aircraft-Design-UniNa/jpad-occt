package opencascade;

/**
 *  This class implements methods for
 *  computing the intersection curves   between two surfaces.
 *  The result is curves from Geom.  The "domain" used for
 *  a surface   is the natural  parametric domain
 *  unless the surface is a  RectangularTrimmedSurface
 *  from Geom.
 */
public class GeomAPI_IntSS {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GeomAPI_IntSS(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GeomAPI_IntSS(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GeomAPI_IntSS obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomAPI_IntSS(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructs an empty object. Use the
   *  function Perform for further initialization algorithm by two surfaces.
   */
  public GeomAPI_IntSS() {
    this(OCCwrapJavaJNI.new_GeomAPI_IntSS__SWIG_0(), true);
  }

  /**
   *  Computes the intersection curves
   *  between the two surfaces S1 and S2. Parameter Tol defines the precision
   *  of curves computation. For most cases the value 1.0e-7 is recommended to use.
   *  Warning
   *  Use the function IsDone to verify that the intersections are successfully computed.I
   */
  public GeomAPI_IntSS( Geom_Surface  S1,  Geom_Surface  S2, double Tol) {
    this(OCCwrapJavaJNI.new_GeomAPI_IntSS__SWIG_1( Geom_Surface.getCPtr(S1) , S1,  Geom_Surface.getCPtr(S2) , S2, Tol), true);
  }

  /**
   *  Initializes an algorithm with the
   *  given arguments and computes the intersection curves between the two surfaces S1 and S2.
   *  Parameter Tol defines the precision of curves computation. For most
   *  cases the value 1.0e-7 is recommended to use.
   *  Warning
   *  Use function IsDone to verify that the intersections are successfully computed.
   */
  public void Perform( Geom_Surface  S1,  Geom_Surface  S2, double Tol) {
    OCCwrapJavaJNI.GeomAPI_IntSS_Perform(swigCPtr, this,  Geom_Surface.getCPtr(S1) , S1,  Geom_Surface.getCPtr(S2) , S2, Tol);
  }

  /**
   *  Returns True if the intersection was successful.
   */
  public long IsDone() {
    return OCCwrapJavaJNI.GeomAPI_IntSS_IsDone(swigCPtr, this);
  }

  /**
   *  Returns the number of computed intersection curves.
   *  Exceptions
   *  StdFail_NotDone if the computation fails.
   */
  public int NbLines() {
    return OCCwrapJavaJNI.GeomAPI_IntSS_NbLines(swigCPtr, this);
  }

  public  Geom_Curve  Line(int Index) {
    return new Geom_Curve ( OCCwrapJavaJNI.GeomAPI_IntSS_Line(swigCPtr, this, Index), true );
  }

}
