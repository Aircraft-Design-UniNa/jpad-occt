package opencascade;

/**
 *  This class implements elementary construction algorithms for a
 *  translation in 3D space. The result is a
 *  Geom_Transformation transformation.
 *  A MakeTranslation object provides a framework for:
 *  -   defining the construction of the transformation,
 *  -   implementing the construction algorithm, and
 *  -   consulting the result.
 */
public class GC_MakeTranslation {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  GC_MakeTranslation(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  GC_MakeTranslation(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(GC_MakeTranslation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_GC_MakeTranslation(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructs a translation along the vector " Vect "
   */
  public GC_MakeTranslation( gp_Vec  Vect) {
    this(OCCwrapJavaJNI.new_GC_MakeTranslation__SWIG_0(gp_Vec.getCPtr(Vect), Vect), true);
  }

  /**
   *  Constructs a translation along the vector (Point1,Point2)
   *  defined from the point Point1 to the point Point2.
   */
  public GC_MakeTranslation( gp_Pnt  Point1,  gp_Pnt  Point2) {
    this(OCCwrapJavaJNI.new_GC_MakeTranslation__SWIG_1(gp_Pnt.getCPtr(Point1), Point1, gp_Pnt.getCPtr(Point2), Point2), true);
  }

  public  Geom_Transformation  Value() {
    return new Geom_Transformation ( OCCwrapJavaJNI.GC_MakeTranslation_Value(swigCPtr, this), true );
  }

}
