package opencascade;

/**
 *  This package provides general tools and data structures common
 *  for other packages in SHAPEWORKS and extending CAS.CADE
 *  structures.
 *  The following items are provided by this package:
 *  - enumeration Status used for coding status flags in methods
 *  inside the SHAPEWORKS
 *  - enumeration Parametrisation used for setting global parametrisation
 *  on the composite surface
 *  - class CompositeSurface representing a composite surface
 *  made of a grid of surface patches
 *  - class WireData representing a wire in the form of ordered
 *  list of edges
 *  - class MsgRegistrator for attaching messages to the objects
 *  - tools for exploring the shapes
 *  -       tools for creating       new shapes.
 */
public class ShapeExtend {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  ShapeExtend(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  ShapeExtend(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(ShapeExtend obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_ShapeExtend(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Inits using of ShapeExtend.
   *  Currently, loads messages output by ShapeHealing algorithms.
   */
  public static void Init() {
    OCCwrapJavaJNI.ShapeExtend_Init();
  }

  /**
   *  Encodes status (enumeration) to a bit flag
   */
  public static int EncodeStatus(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeExtend_EncodeStatus(status.swigValue());
  }

  /**
   *  Tells if a bit flag contains bit corresponding to enumerated status
   */
  public static long DecodeStatus(int flag, ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeExtend_DecodeStatus(flag, status.swigValue());
  }

  public ShapeExtend() {
    this(OCCwrapJavaJNI.new_ShapeExtend(), true);
  }

}
