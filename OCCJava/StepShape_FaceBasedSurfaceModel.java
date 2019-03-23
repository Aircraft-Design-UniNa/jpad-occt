package opencascade;

/**
 *  Representation of STEP entity FaceBasedSurfaceModel
 */
public class StepShape_FaceBasedSurfaceModel extends StepGeom_GeometricRepresentationItem {
  StepShape_FaceBasedSurfaceModel(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor
   */
  public StepShape_FaceBasedSurfaceModel() {
    this(OCCwrapJavaJNI.new_StepShape_FaceBasedSurfaceModel(), true);
  }

  /**
   *  Initialize all fields (own and inherited)
   */
  public void Init( TCollection_HAsciiString  aRepresentationItem_Name,  StepShape_HArray1OfConnectedFaceSet  aFbsmFaces) {
    OCCwrapJavaJNI.StepShape_FaceBasedSurfaceModel_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aRepresentationItem_Name) , aRepresentationItem_Name,  StepShape_HArray1OfConnectedFaceSet.getCPtr(aFbsmFaces) , aFbsmFaces);
  }

  public  StepShape_HArray1OfConnectedFaceSet  FbsmFaces() {
    return new StepShape_HArray1OfConnectedFaceSet ( OCCwrapJavaJNI.StepShape_FaceBasedSurfaceModel_FbsmFaces(swigCPtr, this), true );
  }

  /**
   *  Set field FbsmFaces
   */
  public void SetFbsmFaces( StepShape_HArray1OfConnectedFaceSet  FbsmFaces) {
    OCCwrapJavaJNI.StepShape_FaceBasedSurfaceModel_SetFbsmFaces(swigCPtr, this,  StepShape_HArray1OfConnectedFaceSet.getCPtr(FbsmFaces) , FbsmFaces);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_FaceBasedSurfaceModel_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_FaceBasedSurfaceModel_get_type_descriptor(), true );
  }

  public static  StepShape_FaceBasedSurfaceModel  DownCast( Standard_Transient  T) {
    return new StepShape_FaceBasedSurfaceModel ( OCCwrapJavaJNI.StepShape_FaceBasedSurfaceModel_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_FaceBasedSurfaceModel_TypeOf(), true );
  }

}
