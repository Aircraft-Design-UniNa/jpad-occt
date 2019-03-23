package opencascade;

/**
 *  Splits a Surface with a criterion.
 */
public class ShapeUpgrade_SplitSurface extends Standard_Transient {
  ShapeUpgrade_SplitSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor.
   */
  public ShapeUpgrade_SplitSurface() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_SplitSurface(), true);
  }

  /**
   *  Initializes with single supporting surface.
   */
  public void Init( Geom_Surface  S) {
    OCCwrapJavaJNI.ShapeUpgrade_SplitSurface_Init__SWIG_0(swigCPtr, this,  Geom_Surface.getCPtr(S) , S);
  }

  /**
   *  Initializes with single supporting surface with bounding parameters.
   */
  public void Init( Geom_Surface  S, double UFirst, double ULast, double VFirst, double VLast) {
    OCCwrapJavaJNI.ShapeUpgrade_SplitSurface_Init__SWIG_1(swigCPtr, this,  Geom_Surface.getCPtr(S) , S, UFirst, ULast, VFirst, VLast);
  }

  /**
   *  Sets U parameters where splitting has to be done
   */
  public void SetUSplitValues( TColStd_HSequenceOfReal  UValues) {
    OCCwrapJavaJNI.ShapeUpgrade_SplitSurface_SetUSplitValues(swigCPtr, this,  TColStd_HSequenceOfReal.getCPtr(UValues) , UValues);
  }

  /**
   *  Sets V parameters where splitting has to be done
   */
  public void SetVSplitValues( TColStd_HSequenceOfReal  VValues) {
    OCCwrapJavaJNI.ShapeUpgrade_SplitSurface_SetVSplitValues(swigCPtr, this,  TColStd_HSequenceOfReal.getCPtr(VValues) , VValues);
  }

  /**
   *  Performs splitting of the supporting surface.
   *  If resulting surface is B-Spline and Segment is True,
   *  the result is composed with segments of the surface bounded
   *  by the U and V SplitValues (method Geom_BSplineSurface::Segment
   *  is used).
   *  If Segment is False, the result is composed with
   *  Geom_RectangularTrimmedSurface all based on the same complete
   *  surface.
   *  Fields myNbResultingRow and myNbResultingCol must be set to
   *  specify the size of resulting grid of surfaces.
   */
  public void Build(long Segment) {
    OCCwrapJavaJNI.ShapeUpgrade_SplitSurface_Build(swigCPtr, this, Segment);
  }

  /**
   *  Calculates points for correction/splitting of the surface.
   */
  public void Compute(long Segment) {
    OCCwrapJavaJNI.ShapeUpgrade_SplitSurface_Compute__SWIG_0(swigCPtr, this, Segment);
  }

  public void Compute() {
    OCCwrapJavaJNI.ShapeUpgrade_SplitSurface_Compute__SWIG_1(swigCPtr, this);
  }

  /**
   *  Performs correction/splitting of the surface.
   *  First defines splitting values by method Compute(), then calls method Build().
   */
  public void Perform(long Segment) {
    OCCwrapJavaJNI.ShapeUpgrade_SplitSurface_Perform__SWIG_0(swigCPtr, this, Segment);
  }

  public void Perform() {
    OCCwrapJavaJNI.ShapeUpgrade_SplitSurface_Perform__SWIG_1(swigCPtr, this);
  }

  public  TColStd_HSequenceOfReal  USplitValues() {
    return new TColStd_HSequenceOfReal ( OCCwrapJavaJNI.ShapeUpgrade_SplitSurface_USplitValues(swigCPtr, this), true );
  }

  public  TColStd_HSequenceOfReal  VSplitValues() {
    return new TColStd_HSequenceOfReal ( OCCwrapJavaJNI.ShapeUpgrade_SplitSurface_VSplitValues(swigCPtr, this), true );
  }

  /**
   *  Returns the status
   *  OK    - no splitting is needed
   *  DONE1 - splitting required and gives more than one patch
   *  DONE2 - splitting is required, but gives only single patch (initial)
   *  DONE3 - geometric form of the surface or parametrisation is modified
   */
  public long Status(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeUpgrade_SplitSurface_Status(swigCPtr, this, status.swigValue());
  }

  public  ShapeExtend_CompositeSurface  ResSurfaces() {
    return new ShapeExtend_CompositeSurface ( OCCwrapJavaJNI.ShapeUpgrade_SplitSurface_ResSurfaces(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_SplitSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_SplitSurface_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_SplitSurface  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_SplitSurface ( OCCwrapJavaJNI.ShapeUpgrade_SplitSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_SplitSurface_TypeOf(), true );
  }

}
