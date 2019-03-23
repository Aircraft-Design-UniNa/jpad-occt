package opencascade;

/**
 *  The  BRepBuilderAPI  package   provides  an   Application
 *  Programming Interface  for the BRep  topology data
 *  structure.
 * 
 *  The API is a set of classes aiming to provide :
 * 
 *  * High level and simple calls  for the most common
 *  operations.
 * 
 *  *    Keeping   an   access  on    the    low-level
 *  implementation of high-level calls.
 * 
 *  * Examples  of programming of high-level operations
 *  from low-level operations.
 * 
 *  * A complete coverage of modelling :
 * 
 *  - Creating vertices ,edges, faces, solids.
 * 
 *  - Sweeping operations.
 * 
 *  - Boolean operations.
 * 
 *  - Global properties computation.
 * 
 *  The API provides  classes to  build  objects:
 * 
 *  * The  constructors  of the classes  provides  the
 *  different constructions methods.
 * 
 *  * The  class keeps as fields the   different tools
 *  used to build the object.
 * 
 *  *   The class  provides  a  casting  method to get
 *  automatically the  result  with  a   function-like
 *  call.
 * 
 *  For example to make a  vertex <V> from a point <P>
 *  one can writes :
 * 
 *  V = BRepBuilderAPI_MakeVertex(P);
 * 
 *  or
 * 
 *  BRepBuilderAPI_MakeVertex MV(P);
 *  V = MV.Vertex();
 * 
 *  For tolerances  a default precision is  used which
 *  can    be   changed    by    the   packahe  method
 *  BRepBuilderAPI::Precision.
 * 
 *  For error handling the BRepBuilderAPI commands raise only
 *  the NotDone error. When Done is false on a command
 *  the error description can be asked to the command.
 * 
 *  In  theory  the  comands can be    called with any
 *  arguments, argument  checking  is performed by the
 *  command.
 */
public class BRepBuilderAPI {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepBuilderAPI(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepBuilderAPI(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepBuilderAPI obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepBuilderAPI(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Sets    the current plane.
   */
  public static void Plane( Geom_Plane  P) {
    OCCwrapJavaJNI.BRepBuilderAPI_Plane__SWIG_0( Geom_Plane.getCPtr(P) , P);
  }

  public static  Geom_Plane  Plane() {
    return new Geom_Plane ( OCCwrapJavaJNI.BRepBuilderAPI_Plane__SWIG_1(), true );
  }

  /**
   *  Sets the default precision.  The current Precision
   *  is returned.
   */
  public static void Precision(double P) {
    OCCwrapJavaJNI.BRepBuilderAPI_Precision__SWIG_0(P);
  }

  /**
   *  Returns the default precision.
   */
  public static double Precision() {
    return OCCwrapJavaJNI.BRepBuilderAPI_Precision__SWIG_1();
  }

  public BRepBuilderAPI() {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI(), true);
  }

}
