package opencascade;

/**
 *  Computes the global properties of a face in 3D space.
 *  The face 's requirements to evaluate the global properties
 *  are defined in the template FaceTool from package GProp.
 */
public class BRepGProp_Sinert extends GProp_GProps {

  private long swigCPtr;
  BRepGProp_Sinert(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepGProp_Sinert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepGProp_Sinert(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepGProp_Sinert_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepGProp_Sinert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepGProp_Sinert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BRepGProp_Sinert() {
    this(OCCwrapJavaJNI.new_BRepGProp_Sinert__SWIG_0(), true);
  }

  public BRepGProp_Sinert( BRepGProp_Face  S,  gp_Pnt  SLocation) {
    this(OCCwrapJavaJNI.new_BRepGProp_Sinert__SWIG_1(BRepGProp_Face.getCPtr(S), S, gp_Pnt.getCPtr(SLocation), SLocation), true);
  }

  /**
   *  Builds a Sinert to evaluate the global properties of
   *  the face <S>. If isNaturalRestriction is true the domain of S is defined
   *  with the natural bounds, else it defined with an iterator
   *  of Edge from TopoDS (see DomainTool from GProp)
   */
  public BRepGProp_Sinert( BRepGProp_Face  S,  BRepGProp_Domain  D,  gp_Pnt  SLocation) {
    this(OCCwrapJavaJNI.new_BRepGProp_Sinert__SWIG_2(BRepGProp_Face.getCPtr(S), S, BRepGProp_Domain.getCPtr(D), D, gp_Pnt.getCPtr(SLocation), SLocation), true);
  }

  public BRepGProp_Sinert( BRepGProp_Face  S,  gp_Pnt  SLocation, double Eps) {
    this(OCCwrapJavaJNI.new_BRepGProp_Sinert__SWIG_3(BRepGProp_Face.getCPtr(S), S, gp_Pnt.getCPtr(SLocation), SLocation, Eps), true);
  }

  public BRepGProp_Sinert( BRepGProp_Face  S,  BRepGProp_Domain  D,  gp_Pnt  SLocation, double Eps) {
    this(OCCwrapJavaJNI.new_BRepGProp_Sinert__SWIG_4(BRepGProp_Face.getCPtr(S), S, BRepGProp_Domain.getCPtr(D), D, gp_Pnt.getCPtr(SLocation), SLocation, Eps), true);
  }

  public void SetLocation( gp_Pnt  SLocation) {
    OCCwrapJavaJNI.BRepGProp_Sinert_SetLocation(swigCPtr, this, gp_Pnt.getCPtr(SLocation), SLocation);
  }

  public void Perform( BRepGProp_Face  S) {
    OCCwrapJavaJNI.BRepGProp_Sinert_Perform__SWIG_0(swigCPtr, this, BRepGProp_Face.getCPtr(S), S);
  }

  public void Perform( BRepGProp_Face  S,  BRepGProp_Domain  D) {
    OCCwrapJavaJNI.BRepGProp_Sinert_Perform__SWIG_1(swigCPtr, this, BRepGProp_Face.getCPtr(S), S, BRepGProp_Domain.getCPtr(D), D);
  }

  public double Perform( BRepGProp_Face  S, double Eps) {
    return OCCwrapJavaJNI.BRepGProp_Sinert_Perform__SWIG_2(swigCPtr, this, BRepGProp_Face.getCPtr(S), S, Eps);
  }

  public double Perform( BRepGProp_Face  S,  BRepGProp_Domain  D, double Eps) {
    return OCCwrapJavaJNI.BRepGProp_Sinert_Perform__SWIG_3(swigCPtr, this, BRepGProp_Face.getCPtr(S), S, BRepGProp_Domain.getCPtr(D), D, Eps);
  }

  /**
   *  If previously used method contained Eps parameter
   *  get actual relative error of the computation, else return  1.0.
   */
  public double GetEpsilon() {
    return OCCwrapJavaJNI.BRepGProp_Sinert_GetEpsilon(swigCPtr, this);
  }

}
