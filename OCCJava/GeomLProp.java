package opencascade;

/**
 *  These global functions compute the degree of
 *  continuity of a 3D curve built by concatenation of two
 *  other curves (or portions of curves) at their junction point.
 */
public class GeomLProp {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GeomLProp(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GeomLProp(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GeomLProp obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomLProp(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Computes the regularity at the junction between C1 and
   *  C2. The booleans r1 and r2 are true if the curves must
   *  be taken reversed.  The point u1 on C1 and the point
   *  u2 on C2 must be confused.
   *  tl and ta are the linear and angular tolerance used two
   *  compare the derivative.
   */
  public static GeomAbs_Shape Continuity( Geom_Curve  C1,  Geom_Curve  C2, double u1, double u2, long r1, long r2, double tl, double ta) {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.GeomLProp_Continuity__SWIG_0( Geom_Curve.getCPtr(C1) , C1,  Geom_Curve.getCPtr(C2) , C2, u1, u2, r1, r2, tl, ta));
  }

  /**
   *  The  same  as  preciding   but   using  the   standard
   *  tolerances from package Precision.
   */
  public static GeomAbs_Shape Continuity( Geom_Curve  C1,  Geom_Curve  C2, double u1, double u2, long r1, long r2) {
    return GeomAbs_Shape.swigToEnum(OCCwrapJavaJNI.GeomLProp_Continuity__SWIG_1( Geom_Curve.getCPtr(C1) , C1,  Geom_Curve.getCPtr(C2) , C2, u1, u2, r1, r2));
  }

  public GeomLProp() {
    this(OCCwrapJavaJNI.new_GeomLProp(), true);
  }

}
