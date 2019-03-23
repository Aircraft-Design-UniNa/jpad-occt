package opencascade;

/**
 *  This class is axuluary tool which contains parameters for
 *  BSplineRestriction class.
 */
public class ShapeCustom_RestrictionParameters extends Standard_Transient {
  ShapeCustom_RestrictionParameters(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Sets default parameters.
   */
  public ShapeCustom_RestrictionParameters() {
    this(OCCwrapJavaJNI.new_ShapeCustom_RestrictionParameters(), true);
  }

  public int[] GMaxDegree() {return OCCwrapJavaJNI.ShapeCustom_RestrictionParameters_GMaxDegree(swigCPtr, this);}

  public int[] GMaxSeg() {return OCCwrapJavaJNI.ShapeCustom_RestrictionParameters_GMaxSeg(swigCPtr, this);}

  public long[] ConvertPlane() {return OCCwrapJavaJNI.ShapeCustom_RestrictionParameters_ConvertPlane(swigCPtr, this);}

  public long[] ConvertBezierSurf() {return OCCwrapJavaJNI.ShapeCustom_RestrictionParameters_ConvertBezierSurf(swigCPtr, this);}

  public long[] ConvertRevolutionSurf() {return OCCwrapJavaJNI.ShapeCustom_RestrictionParameters_ConvertRevolutionSurf(swigCPtr, this);}

  public long[] ConvertExtrusionSurf() {return OCCwrapJavaJNI.ShapeCustom_RestrictionParameters_ConvertExtrusionSurf(swigCPtr, this);}

  public long[] ConvertOffsetSurf() {return OCCwrapJavaJNI.ShapeCustom_RestrictionParameters_ConvertOffsetSurf(swigCPtr, this);}

  public long[] ConvertCylindricalSurf() {return OCCwrapJavaJNI.ShapeCustom_RestrictionParameters_ConvertCylindricalSurf(swigCPtr, this);}

  public long[] ConvertConicalSurf() {return OCCwrapJavaJNI.ShapeCustom_RestrictionParameters_ConvertConicalSurf(swigCPtr, this);}

  public long[] ConvertToroidalSurf() {return OCCwrapJavaJNI.ShapeCustom_RestrictionParameters_ConvertToroidalSurf(swigCPtr, this);}

  public long[] ConvertSphericalSurf() {return OCCwrapJavaJNI.ShapeCustom_RestrictionParameters_ConvertSphericalSurf(swigCPtr, this);}

  public long[] SegmentSurfaceMode() {return OCCwrapJavaJNI.ShapeCustom_RestrictionParameters_SegmentSurfaceMode(swigCPtr, this);}

  public long[] ConvertCurve3d() {return OCCwrapJavaJNI.ShapeCustom_RestrictionParameters_ConvertCurve3d(swigCPtr, this);}

  public long[] ConvertOffsetCurv3d() {return OCCwrapJavaJNI.ShapeCustom_RestrictionParameters_ConvertOffsetCurv3d(swigCPtr, this);}

  public long[] ConvertCurve2d() {return OCCwrapJavaJNI.ShapeCustom_RestrictionParameters_ConvertCurve2d(swigCPtr, this);}

  public long[] ConvertOffsetCurv2d() {return OCCwrapJavaJNI.ShapeCustom_RestrictionParameters_ConvertOffsetCurv2d(swigCPtr, this);}

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeCustom_RestrictionParameters_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeCustom_RestrictionParameters_get_type_descriptor(), true );
  }

  public static  ShapeCustom_RestrictionParameters  DownCast( Standard_Transient  T) {
    return new ShapeCustom_RestrictionParameters ( OCCwrapJavaJNI.ShapeCustom_RestrictionParameters_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeCustom_RestrictionParameters_TypeOf(), true );
  }

}
