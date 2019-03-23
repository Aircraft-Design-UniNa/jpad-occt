package opencascade;

/**
 *  This class contains some algorithmic services
 *  specific to the mapping STEP to CAS.CADE
 */
public class StepToTopoDS_GeometricTool {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepToTopoDS_GeometricTool(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepToTopoDS_GeometricTool(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepToTopoDS_GeometricTool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToTopoDS_GeometricTool(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static int PCurve( StepGeom_SurfaceCurve  SC,  StepGeom_Surface  S,  StepGeom_Pcurve  PC, int last) {
    return OCCwrapJavaJNI.StepToTopoDS_GeometricTool_PCurve__SWIG_0( StepGeom_SurfaceCurve.getCPtr(SC) , SC,  StepGeom_Surface.getCPtr(S) , S,  StepGeom_Pcurve.getCPtr(PC) , PC, last);
  }

  public static int PCurve( StepGeom_SurfaceCurve  SC,  StepGeom_Surface  S,  StepGeom_Pcurve  PC) {
    return OCCwrapJavaJNI.StepToTopoDS_GeometricTool_PCurve__SWIG_1( StepGeom_SurfaceCurve.getCPtr(SC) , SC,  StepGeom_Surface.getCPtr(S) , S,  StepGeom_Pcurve.getCPtr(PC) , PC);
  }

  public static long IsSeamCurve( StepGeom_SurfaceCurve  SC,  StepGeom_Surface  S,  StepShape_Edge  E,  StepShape_EdgeLoop  EL) {
    return OCCwrapJavaJNI.StepToTopoDS_GeometricTool_IsSeamCurve( StepGeom_SurfaceCurve.getCPtr(SC) , SC,  StepGeom_Surface.getCPtr(S) , S,  StepShape_Edge.getCPtr(E) , E,  StepShape_EdgeLoop.getCPtr(EL) , EL);
  }

  public static long IsLikeSeam( StepGeom_SurfaceCurve  SC,  StepGeom_Surface  S,  StepShape_Edge  E,  StepShape_EdgeLoop  EL) {
    return OCCwrapJavaJNI.StepToTopoDS_GeometricTool_IsLikeSeam( StepGeom_SurfaceCurve.getCPtr(SC) , SC,  StepGeom_Surface.getCPtr(S) , S,  StepShape_Edge.getCPtr(E) , E,  StepShape_EdgeLoop.getCPtr(EL) , EL);
  }

  public static long UpdateParam3d( Geom_Curve  C, double[] w1, double[] w2, double preci) {
    return OCCwrapJavaJNI.StepToTopoDS_GeometricTool_UpdateParam3d( Geom_Curve.getCPtr(C) , C, w1, w2, preci);
  }

  public StepToTopoDS_GeometricTool() {
    this(OCCwrapJavaJNI.new_StepToTopoDS_GeometricTool(), true);
  }

}
