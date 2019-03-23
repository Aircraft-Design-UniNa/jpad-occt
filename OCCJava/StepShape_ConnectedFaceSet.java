package opencascade;

public class StepShape_ConnectedFaceSet extends StepShape_TopologicalRepresentationItem {
  StepShape_ConnectedFaceSet(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a ConnectedFaceSet
   */
  public StepShape_ConnectedFaceSet() {
    this(OCCwrapJavaJNI.new_StepShape_ConnectedFaceSet(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepShape_HArray1OfFace  aCfsFaces) {
    OCCwrapJavaJNI.StepShape_ConnectedFaceSet_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepShape_HArray1OfFace.getCPtr(aCfsFaces) , aCfsFaces);
  }

  public void SetCfsFaces( StepShape_HArray1OfFace  aCfsFaces) {
    OCCwrapJavaJNI.StepShape_ConnectedFaceSet_SetCfsFaces(swigCPtr, this,  StepShape_HArray1OfFace.getCPtr(aCfsFaces) , aCfsFaces);
  }

  public  StepShape_HArray1OfFace  CfsFaces() {
    return new StepShape_HArray1OfFace ( OCCwrapJavaJNI.StepShape_ConnectedFaceSet_CfsFaces(swigCPtr, this), true );
  }

  public  StepShape_Face  CfsFacesValue(int num) {
    return new StepShape_Face ( OCCwrapJavaJNI.StepShape_ConnectedFaceSet_CfsFacesValue(swigCPtr, this, num), true );
  }

  public int NbCfsFaces() {
    return OCCwrapJavaJNI.StepShape_ConnectedFaceSet_NbCfsFaces(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_ConnectedFaceSet_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_ConnectedFaceSet_get_type_descriptor(), true );
  }

  public static  StepShape_ConnectedFaceSet  DownCast( Standard_Transient  T) {
    return new StepShape_ConnectedFaceSet ( OCCwrapJavaJNI.StepShape_ConnectedFaceSet_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_ConnectedFaceSet_TypeOf(), true );
  }

}
