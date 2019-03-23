package opencascade;

/**
 *  Computes the  global properties of bounded curves
 *  in 3D space. The curve must have at least a continuity C1.
 *  It can be a curve as defined in the template CurveTool from
 *  package GProp. This template gives the minimum of methods
 *  required to evaluate the global properties of a curve 3D with
 *  the algorithmes of GProp.
 */
public class BRepGProp_Cinert extends GProp_GProps {

  private long swigCPtr;
  BRepGProp_Cinert(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepGProp_Cinert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepGProp_Cinert(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepGProp_Cinert_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepGProp_Cinert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepGProp_Cinert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BRepGProp_Cinert() {
    this(OCCwrapJavaJNI.new_BRepGProp_Cinert__SWIG_0(), true);
  }

  public BRepGProp_Cinert( BRepAdaptor_Curve  C,  gp_Pnt  CLocation) {
    this(OCCwrapJavaJNI.new_BRepGProp_Cinert__SWIG_1(BRepAdaptor_Curve.getCPtr(C), C, gp_Pnt.getCPtr(CLocation), CLocation), true);
  }

  public void SetLocation( gp_Pnt  CLocation) {
    OCCwrapJavaJNI.BRepGProp_Cinert_SetLocation(swigCPtr, this, gp_Pnt.getCPtr(CLocation), CLocation);
  }

  public void Perform( BRepAdaptor_Curve  C) {
    OCCwrapJavaJNI.BRepGProp_Cinert_Perform(swigCPtr, this, BRepAdaptor_Curve.getCPtr(C), C);
  }

}
