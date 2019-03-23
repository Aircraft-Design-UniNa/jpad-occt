package opencascade;

public class StepShape_Face extends StepShape_TopologicalRepresentationItem {
  StepShape_Face(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Face
   */
  public StepShape_Face() {
    this(OCCwrapJavaJNI.new_StepShape_Face(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepShape_HArray1OfFaceBound  aBounds) {
    OCCwrapJavaJNI.StepShape_Face_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepShape_HArray1OfFaceBound.getCPtr(aBounds) , aBounds);
  }

  public void SetBounds( StepShape_HArray1OfFaceBound  aBounds) {
    OCCwrapJavaJNI.StepShape_Face_SetBounds(swigCPtr, this,  StepShape_HArray1OfFaceBound.getCPtr(aBounds) , aBounds);
  }

  public  StepShape_HArray1OfFaceBound  Bounds() {
    return new StepShape_HArray1OfFaceBound ( OCCwrapJavaJNI.StepShape_Face_Bounds(swigCPtr, this), true );
  }

  public  StepShape_FaceBound  BoundsValue(int num) {
    return new StepShape_FaceBound ( OCCwrapJavaJNI.StepShape_Face_BoundsValue(swigCPtr, this, num), true );
  }

  public int NbBounds() {
    return OCCwrapJavaJNI.StepShape_Face_NbBounds(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepShape_Face_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_Face_get_type_descriptor(), true );
  }

  public static  StepShape_Face  DownCast( Standard_Transient  T) {
    return new StepShape_Face ( OCCwrapJavaJNI.StepShape_Face_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepShape_Face_TypeOf(), true );
  }

}
