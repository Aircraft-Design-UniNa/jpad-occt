package opencascade;

/**
 *  Implement  the OneAxis algoritm   for a revolution
 *  surface.
 */
public class BRepPrim_Revolution extends BRepPrim_OneAxis {

  private long swigCPtr;
  BRepPrim_Revolution(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepPrim_Revolution_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepPrim_Revolution(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepPrim_Revolution_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepPrim_Revolution obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepPrim_Revolution(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Create a  revolution body <M>  is the  meridian nd
   *  must   be in the XZ  plane   of <A>. <PM>  is  the
   *  meridian in the XZ plane.
   */
  public BRepPrim_Revolution( gp_Ax2  A, double VMin, double VMax,  Geom_Curve  M,  Geom2d_Curve  PM) {
    this(OCCwrapJavaJNI.new_BRepPrim_Revolution(gp_Ax2.getCPtr(A), A, VMin, VMax,  Geom_Curve.getCPtr(M) , M,  Geom2d_Curve.getCPtr(PM) , PM), true);
  }

}
