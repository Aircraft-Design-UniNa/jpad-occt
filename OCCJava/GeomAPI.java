package opencascade;

/**
 *  The   GeomAPI   package  provides  an  Application
 *  Programming Interface for the Geometry.
 * 
 *  The API is a set of  classes and methods aiming to
 *  provide :
 * 
 *  * High level and simple calls  for the most common
 *  operations.
 * 
 *  *    Keeping   an   access  on    the    low-level
 *  implementation of high-level calls.
 * 
 *  The API  provides classes to  call the algorithmes
 *  of the Geometry
 * 
 *  * The  constructors  of the classes  provides  the
 *  different constructions methods.
 * 
 *  * The  class keeps as fields the   different tools
 *  used by the algorithmes
 * 
 *  *   The class  provides  a  casting  method to get
 *  automatically the  result  with  a   function-like
 *  call.
 * 
 *  For example to evaluate the distance <D> between a
 *  point <P> and a curve <C>, one can writes :
 * 
 *  D = GeomAPI_ProjectPointOnCurve(P,C);
 * 
 *  or
 * 
 *  GeomAPI_ProjectPointOnCurve PonC(P,C);
 *  D = PonC.LowerDistance();
 */
public class GeomAPI {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GeomAPI(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GeomAPI(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GeomAPI obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GeomAPI(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static  Geom2d_Curve  To2d( Geom_Curve  C,  gp_Pln  P) {
    return new Geom2d_Curve ( OCCwrapJavaJNI.GeomAPI_To2d( Geom_Curve.getCPtr(C) , C, gp_Pln.getCPtr(P), P), true );
  }

  public static  Geom_Curve  To3d( Geom2d_Curve  C,  gp_Pln  P) {
    return new Geom_Curve ( OCCwrapJavaJNI.GeomAPI_To3d( Geom2d_Curve.getCPtr(C) , C, gp_Pln.getCPtr(P), P), true );
  }

  public GeomAPI() {
    this(OCCwrapJavaJNI.new_GeomAPI(), true);
  }

}
