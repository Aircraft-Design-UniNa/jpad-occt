package opencascade;

public class StepToGeom {
  
  protected long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object swigParent;

  StepToGeom(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  StepToGeom(long cPtr, boolean cMemoryOwn, Object Parent) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    if ( ! cMemoryOwn ) swigParent = Parent; // keep reference to assumed parent object
  }

  static long getCPtr(StepToGeom obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_StepToGeom(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static  Geom_Axis1Placement  MakeAxis1Placement( StepGeom_Axis1Placement  SA) {
    return new Geom_Axis1Placement ( OCCwrapJavaJNI.StepToGeom_MakeAxis1Placement( StepGeom_Axis1Placement.getCPtr(SA) , SA), true );
  }

  public static  Geom_Axis2Placement  MakeAxis2Placement( StepGeom_Axis2Placement3d  SA) {
    return new Geom_Axis2Placement ( OCCwrapJavaJNI.StepToGeom_MakeAxis2Placement( StepGeom_Axis2Placement3d.getCPtr(SA) , SA), true );
  }

  public static  Geom2d_AxisPlacement  MakeAxisPlacement( StepGeom_Axis2Placement2d  SA) {
    return new Geom2d_AxisPlacement ( OCCwrapJavaJNI.StepToGeom_MakeAxisPlacement( StepGeom_Axis2Placement2d.getCPtr(SA) , SA), true );
  }

  public static  Geom_BoundedCurve  MakeBoundedCurve( StepGeom_BoundedCurve  SC) {
    return new Geom_BoundedCurve ( OCCwrapJavaJNI.StepToGeom_MakeBoundedCurve( StepGeom_BoundedCurve.getCPtr(SC) , SC), true );
  }

  public static  Geom2d_BoundedCurve  MakeBoundedCurve2d( StepGeom_BoundedCurve  SC) {
    return new Geom2d_BoundedCurve ( OCCwrapJavaJNI.StepToGeom_MakeBoundedCurve2d( StepGeom_BoundedCurve.getCPtr(SC) , SC), true );
  }

  public static  Geom_BoundedSurface  MakeBoundedSurface( StepGeom_BoundedSurface  SS) {
    return new Geom_BoundedSurface ( OCCwrapJavaJNI.StepToGeom_MakeBoundedSurface( StepGeom_BoundedSurface.getCPtr(SS) , SS), true );
  }

  public static  Geom_BSplineCurve  MakeBSplineCurve( StepGeom_BSplineCurve  SC) {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.StepToGeom_MakeBSplineCurve( StepGeom_BSplineCurve.getCPtr(SC) , SC), true );
  }

  public static  Geom2d_BSplineCurve  MakeBSplineCurve2d( StepGeom_BSplineCurve  SC) {
    return new Geom2d_BSplineCurve ( OCCwrapJavaJNI.StepToGeom_MakeBSplineCurve2d( StepGeom_BSplineCurve.getCPtr(SC) , SC), true );
  }

  public static  Geom_BSplineSurface  MakeBSplineSurface( StepGeom_BSplineSurface  SS) {
    return new Geom_BSplineSurface ( OCCwrapJavaJNI.StepToGeom_MakeBSplineSurface( StepGeom_BSplineSurface.getCPtr(SS) , SS), true );
  }

  public static  Geom_CartesianPoint  MakeCartesianPoint( StepGeom_CartesianPoint  SP) {
    return new Geom_CartesianPoint ( OCCwrapJavaJNI.StepToGeom_MakeCartesianPoint( StepGeom_CartesianPoint.getCPtr(SP) , SP), true );
  }

  public static  Geom2d_CartesianPoint  MakeCartesianPoint2d( StepGeom_CartesianPoint  SP) {
    return new Geom2d_CartesianPoint ( OCCwrapJavaJNI.StepToGeom_MakeCartesianPoint2d( StepGeom_CartesianPoint.getCPtr(SP) , SP), true );
  }

  public static  Geom_Circle  MakeCircle( StepGeom_Circle  SC) {
    return new Geom_Circle ( OCCwrapJavaJNI.StepToGeom_MakeCircle( StepGeom_Circle.getCPtr(SC) , SC), true );
  }

  public static  Geom2d_Circle  MakeCircle2d( StepGeom_Circle  SC) {
    return new Geom2d_Circle ( OCCwrapJavaJNI.StepToGeom_MakeCircle2d( StepGeom_Circle.getCPtr(SC) , SC), true );
  }

  public static  Geom_Conic  MakeConic( StepGeom_Conic  SC) {
    return new Geom_Conic ( OCCwrapJavaJNI.StepToGeom_MakeConic( StepGeom_Conic.getCPtr(SC) , SC), true );
  }

  public static  Geom2d_Conic  MakeConic2d( StepGeom_Conic  SC) {
    return new Geom2d_Conic ( OCCwrapJavaJNI.StepToGeom_MakeConic2d( StepGeom_Conic.getCPtr(SC) , SC), true );
  }

  public static  Geom_ConicalSurface  MakeConicalSurface( StepGeom_ConicalSurface  SS) {
    return new Geom_ConicalSurface ( OCCwrapJavaJNI.StepToGeom_MakeConicalSurface( StepGeom_ConicalSurface.getCPtr(SS) , SS), true );
  }

  public static  Geom_Curve  MakeCurve( StepGeom_Curve  SC) {
    return new Geom_Curve ( OCCwrapJavaJNI.StepToGeom_MakeCurve( StepGeom_Curve.getCPtr(SC) , SC), true );
  }

  public static  Geom2d_Curve  MakeCurve2d( StepGeom_Curve  SC) {
    return new Geom2d_Curve ( OCCwrapJavaJNI.StepToGeom_MakeCurve2d( StepGeom_Curve.getCPtr(SC) , SC), true );
  }

  public static  Geom_CylindricalSurface  MakeCylindricalSurface( StepGeom_CylindricalSurface  SS) {
    return new Geom_CylindricalSurface ( OCCwrapJavaJNI.StepToGeom_MakeCylindricalSurface( StepGeom_CylindricalSurface.getCPtr(SS) , SS), true );
  }

  public static  Geom_Direction  MakeDirection( StepGeom_Direction  SD) {
    return new Geom_Direction ( OCCwrapJavaJNI.StepToGeom_MakeDirection( StepGeom_Direction.getCPtr(SD) , SD), true );
  }

  public static  Geom2d_Direction  MakeDirection2d( StepGeom_Direction  SD) {
    return new Geom2d_Direction ( OCCwrapJavaJNI.StepToGeom_MakeDirection2d( StepGeom_Direction.getCPtr(SD) , SD), true );
  }

  public static  Geom_ElementarySurface  MakeElementarySurface( StepGeom_ElementarySurface  SS) {
    return new Geom_ElementarySurface ( OCCwrapJavaJNI.StepToGeom_MakeElementarySurface( StepGeom_ElementarySurface.getCPtr(SS) , SS), true );
  }

  public static  Geom_Ellipse  MakeEllipse( StepGeom_Ellipse  SC) {
    return new Geom_Ellipse ( OCCwrapJavaJNI.StepToGeom_MakeEllipse( StepGeom_Ellipse.getCPtr(SC) , SC), true );
  }

  public static  Geom2d_Ellipse  MakeEllipse2d( StepGeom_Ellipse  SC) {
    return new Geom2d_Ellipse ( OCCwrapJavaJNI.StepToGeom_MakeEllipse2d( StepGeom_Ellipse.getCPtr(SC) , SC), true );
  }

  public static  Geom_Hyperbola  MakeHyperbola( StepGeom_Hyperbola  SC) {
    return new Geom_Hyperbola ( OCCwrapJavaJNI.StepToGeom_MakeHyperbola( StepGeom_Hyperbola.getCPtr(SC) , SC), true );
  }

  public static  Geom2d_Hyperbola  MakeHyperbola2d( StepGeom_Hyperbola  SC) {
    return new Geom2d_Hyperbola ( OCCwrapJavaJNI.StepToGeom_MakeHyperbola2d( StepGeom_Hyperbola.getCPtr(SC) , SC), true );
  }

  public static  Geom_Line  MakeLine( StepGeom_Line  SC) {
    return new Geom_Line ( OCCwrapJavaJNI.StepToGeom_MakeLine( StepGeom_Line.getCPtr(SC) , SC), true );
  }

  public static  Geom2d_Line  MakeLine2d( StepGeom_Line  SC) {
    return new Geom2d_Line ( OCCwrapJavaJNI.StepToGeom_MakeLine2d( StepGeom_Line.getCPtr(SC) , SC), true );
  }

  public static  Geom_Parabola  MakeParabola( StepGeom_Parabola  SC) {
    return new Geom_Parabola ( OCCwrapJavaJNI.StepToGeom_MakeParabola( StepGeom_Parabola.getCPtr(SC) , SC), true );
  }

  public static  Geom2d_Parabola  MakeParabola2d( StepGeom_Parabola  SC) {
    return new Geom2d_Parabola ( OCCwrapJavaJNI.StepToGeom_MakeParabola2d( StepGeom_Parabola.getCPtr(SC) , SC), true );
  }

  public static  Geom_Plane  MakePlane( StepGeom_Plane  SP) {
    return new Geom_Plane ( OCCwrapJavaJNI.StepToGeom_MakePlane( StepGeom_Plane.getCPtr(SP) , SP), true );
  }

  public static  Geom_BSplineCurve  MakePolyline( StepGeom_Polyline  SPL) {
    return new Geom_BSplineCurve ( OCCwrapJavaJNI.StepToGeom_MakePolyline( StepGeom_Polyline.getCPtr(SPL) , SPL), true );
  }

  public static  Geom2d_BSplineCurve  MakePolyline2d( StepGeom_Polyline  SPL) {
    return new Geom2d_BSplineCurve ( OCCwrapJavaJNI.StepToGeom_MakePolyline2d( StepGeom_Polyline.getCPtr(SPL) , SPL), true );
  }

  public static  Geom_RectangularTrimmedSurface  MakeRectangularTrimmedSurface( StepGeom_RectangularTrimmedSurface  SS) {
    return new Geom_RectangularTrimmedSurface ( OCCwrapJavaJNI.StepToGeom_MakeRectangularTrimmedSurface( StepGeom_RectangularTrimmedSurface.getCPtr(SS) , SS), true );
  }

  public static  Geom_SphericalSurface  MakeSphericalSurface( StepGeom_SphericalSurface  SS) {
    return new Geom_SphericalSurface ( OCCwrapJavaJNI.StepToGeom_MakeSphericalSurface( StepGeom_SphericalSurface.getCPtr(SS) , SS), true );
  }

  public static  Geom_Surface  MakeSurface( StepGeom_Surface  SS) {
    return new Geom_Surface ( OCCwrapJavaJNI.StepToGeom_MakeSurface( StepGeom_Surface.getCPtr(SS) , SS), true );
  }

  public static  Geom_SurfaceOfLinearExtrusion  MakeSurfaceOfLinearExtrusion( StepGeom_SurfaceOfLinearExtrusion  SS) {
    return new Geom_SurfaceOfLinearExtrusion ( OCCwrapJavaJNI.StepToGeom_MakeSurfaceOfLinearExtrusion( StepGeom_SurfaceOfLinearExtrusion.getCPtr(SS) , SS), true );
  }

  public static  Geom_SurfaceOfRevolution  MakeSurfaceOfRevolution( StepGeom_SurfaceOfRevolution  SS) {
    return new Geom_SurfaceOfRevolution ( OCCwrapJavaJNI.StepToGeom_MakeSurfaceOfRevolution( StepGeom_SurfaceOfRevolution.getCPtr(SS) , SS), true );
  }

  public static  Geom_SweptSurface  MakeSweptSurface( StepGeom_SweptSurface  SS) {
    return new Geom_SweptSurface ( OCCwrapJavaJNI.StepToGeom_MakeSweptSurface( StepGeom_SweptSurface.getCPtr(SS) , SS), true );
  }

  public static  Geom_ToroidalSurface  MakeToroidalSurface( StepGeom_ToroidalSurface  SS) {
    return new Geom_ToroidalSurface ( OCCwrapJavaJNI.StepToGeom_MakeToroidalSurface( StepGeom_ToroidalSurface.getCPtr(SS) , SS), true );
  }

  public static long MakeTransformation2d( StepGeom_CartesianTransformationOperator2d  SCTO, gp_Trsf2d CT) {
    return OCCwrapJavaJNI.StepToGeom_MakeTransformation2d( StepGeom_CartesianTransformationOperator2d.getCPtr(SCTO) , SCTO, gp_Trsf2d.getCPtr(CT), CT);
  }

  public static long MakeTransformation3d( StepGeom_CartesianTransformationOperator3d  SCTO, gp_Trsf CT) {
    return OCCwrapJavaJNI.StepToGeom_MakeTransformation3d( StepGeom_CartesianTransformationOperator3d.getCPtr(SCTO) , SCTO, gp_Trsf.getCPtr(CT), CT);
  }

  public static  Geom_TrimmedCurve  MakeTrimmedCurve( StepGeom_TrimmedCurve  SC) {
    return new Geom_TrimmedCurve ( OCCwrapJavaJNI.StepToGeom_MakeTrimmedCurve( StepGeom_TrimmedCurve.getCPtr(SC) , SC), true );
  }

  public static  Geom2d_BSplineCurve  MakeTrimmedCurve2d( StepGeom_TrimmedCurve  SC) {
    return new Geom2d_BSplineCurve ( OCCwrapJavaJNI.StepToGeom_MakeTrimmedCurve2d( StepGeom_TrimmedCurve.getCPtr(SC) , SC), true );
  }

  public static  Geom_VectorWithMagnitude  MakeVectorWithMagnitude( StepGeom_Vector  SV) {
    return new Geom_VectorWithMagnitude ( OCCwrapJavaJNI.StepToGeom_MakeVectorWithMagnitude( StepGeom_Vector.getCPtr(SV) , SV), true );
  }

  public static  Geom2d_VectorWithMagnitude  MakeVectorWithMagnitude2d( StepGeom_Vector  SV) {
    return new Geom2d_VectorWithMagnitude ( OCCwrapJavaJNI.StepToGeom_MakeVectorWithMagnitude2d( StepGeom_Vector.getCPtr(SV) , SV), true );
  }

  public StepToGeom() {
    this(OCCwrapJavaJNI.new_StepToGeom(), true);
  }

}
