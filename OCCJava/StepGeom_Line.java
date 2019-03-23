package opencascade;

public class StepGeom_Line extends StepGeom_Curve {
  StepGeom_Line(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Returns a Line
   */
  public StepGeom_Line() {
    this(OCCwrapJavaJNI.new_StepGeom_Line(), true);
  }

  public void Init( TCollection_HAsciiString  aName,  StepGeom_CartesianPoint  aPnt,  StepGeom_Vector  aDir) {
    OCCwrapJavaJNI.StepGeom_Line_Init(swigCPtr, this,  TCollection_HAsciiString.getCPtr(aName) , aName,  StepGeom_CartesianPoint.getCPtr(aPnt) , aPnt,  StepGeom_Vector.getCPtr(aDir) , aDir);
  }

  public void SetPnt( StepGeom_CartesianPoint  aPnt) {
    OCCwrapJavaJNI.StepGeom_Line_SetPnt(swigCPtr, this,  StepGeom_CartesianPoint.getCPtr(aPnt) , aPnt);
  }

  public  StepGeom_CartesianPoint  Pnt() {
    return new StepGeom_CartesianPoint ( OCCwrapJavaJNI.StepGeom_Line_Pnt(swigCPtr, this), true );
  }

  public void SetDir( StepGeom_Vector  aDir) {
    OCCwrapJavaJNI.StepGeom_Line_SetDir(swigCPtr, this,  StepGeom_Vector.getCPtr(aDir) , aDir);
  }

  public  StepGeom_Vector  Dir() {
    return new StepGeom_Vector ( OCCwrapJavaJNI.StepGeom_Line_Dir(swigCPtr, this), true );
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.StepGeom_Line_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Line_get_type_descriptor(), true );
  }

  public static  StepGeom_Line  DownCast( Standard_Transient  T) {
    return new StepGeom_Line ( OCCwrapJavaJNI.StepGeom_Line_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.StepGeom_Line_TypeOf(), true );
  }

}
