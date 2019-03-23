package opencascade;

public class StepShape_FaceSurface extends StepShape_Face {
  StepShape_FaceSurface(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a FaceSurface
   */
  public StepShape_FaceSurface() {
    this(OCCwrapJavaJNI.new_StepShape_FaceSurface(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepShape_HArray1OfFaceBound  aBounds,  StepGeom_Surface  aFaceGeometry, long aSameSense) {
    OCCwrapJavaJNI.StepShape_FaceSurface_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepShape_HArray1OfFaceBound.getCPtr(aBounds) , aBounds,  StepGeom_Surface.getCPtr(aFaceGeometry) , aFaceGeometry, aSameSense);
  }

  public void SetFaceGeometry( StepGeom_Surface  aFaceGeometry) {
    OCCwrapJavaJNI.StepShape_FaceSurface_SetFaceGeometry(swigCPtr, this,  StepGeom_Surface.getCPtr(aFaceGeometry) , aFaceGeometry);
  }

  public  StepGeom_Surface  FaceGeometry() {
    return new StepGeom_Surface ( OCCwrapJavaJNI.StepShape_FaceSurface_FaceGeometry(swigCPtr, this), true );
  }

  public void SetSameSense(long aSameSense) {
    OCCwrapJavaJNI.StepShape_FaceSurface_SetSameSense(swigCPtr, this, aSameSense);
  }

  public long SameSense() {
    return OCCwrapJavaJNI.StepShape_FaceSurface_SameSense(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_FaceSurface_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_FaceSurface_get_type_descriptor(), true );
  }

  public static  StepShape_FaceSurface  DownCast( Standard_Transient  T) {
    return new StepShape_FaceSurface ( OCCwrapJavaJNI.StepShape_FaceSurface_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_FaceSurface_TypeOf(), true );
  }

}
