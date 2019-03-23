package opencascade;

/**
 *  Provides  the required  methods    to instantiate
 *  CGProps from GProp with a Curve from BRepAdaptor.
 */
public class BRepGProp_EdgeTool {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  BRepGProp_EdgeTool(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  BRepGProp_EdgeTool(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(BRepGProp_EdgeTool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepGProp_EdgeTool(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Returns the parametric value of the start point of
   *  the curve.  The curve is oriented from the start point
   *  to the end point.
   */
  public static double FirstParameter( BRepAdaptor_Curve  C) {
    return OCCwrapJavaJNI.BRepGProp_EdgeTool_FirstParameter(BRepAdaptor_Curve.getCPtr(C), C);
  }

  /**
   *  Returns the parametric value of the end point of
   *  the curve.  The curve is oriented from the start point
   *  to the end point.
   */
  public static double LastParameter( BRepAdaptor_Curve  C) {
    return OCCwrapJavaJNI.BRepGProp_EdgeTool_LastParameter(BRepAdaptor_Curve.getCPtr(C), C);
  }

  /**
   *  Returns the number of Gauss points required to do
   *  the integration with a good accuracy using the
   *  Gauss method.  For a polynomial curve of degree n
   *  the maxima of accuracy is obtained with an order
   *  of integration equal to 2*n-1.
   */
  public static int IntegrationOrder( BRepAdaptor_Curve  C) {
    return OCCwrapJavaJNI.BRepGProp_EdgeTool_IntegrationOrder(BRepAdaptor_Curve.getCPtr(C), C);
  }

  /**
   *  Returns the point of parameter U on the loaded curve.
   */
  public static gp_Pnt Value( BRepAdaptor_Curve  C, double U) {
    return new gp_Pnt(OCCwrapJavaJNI.BRepGProp_EdgeTool_Value(BRepAdaptor_Curve.getCPtr(C), C, U), true);
  }

  /**
   *  Returns the point of parameter U and the first derivative
   *  at this point.
   */
  public static void D1( BRepAdaptor_Curve  C, double U, gp_Pnt P, gp_Vec V1) {
    OCCwrapJavaJNI.BRepGProp_EdgeTool_D1(BRepAdaptor_Curve.getCPtr(C), C, U, gp_Pnt.getCPtr(P), P, gp_Vec.getCPtr(V1), V1);
  }

  /**
   *  Returns  the number  of  intervals for  continuity
   *  <S>. May be one if Continuity(me) >= <S>
   */
  public static int NbIntervals( BRepAdaptor_Curve  C, GeomAbs_Shape S) {
    return OCCwrapJavaJNI.BRepGProp_EdgeTool_NbIntervals(BRepAdaptor_Curve.getCPtr(C), C, S.swigValue());
  }

  /**
   *  Stores in <T> the  parameters bounding the intervals
   *  of continuity <S>.
   * 
   *  The array must provide  enough room to  accomodate
   *  for the parameters. i.e. T.Length() > NbIntervals()
   */
  public static void Intervals( BRepAdaptor_Curve  C,  TColStd_Array1OfReal  T, GeomAbs_Shape S) {
    OCCwrapJavaJNI.BRepGProp_EdgeTool_Intervals(BRepAdaptor_Curve.getCPtr(C), C, TColStd_Array1OfReal.getCPtr(T), T, S.swigValue());
  }

  public BRepGProp_EdgeTool() {
    this(OCCwrapJavaJNI.new_BRepGProp_EdgeTool(), true);
  }

}
