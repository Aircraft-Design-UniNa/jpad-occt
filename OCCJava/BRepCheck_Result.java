package opencascade;

public class BRepCheck_Result extends Standard_Transient {
  BRepCheck_Result(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public void Init( TopoDS_Shape  S) {
    OCCwrapJavaJNI.BRepCheck_Result_Init(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

  public void InContext( TopoDS_Shape  ContextShape) {
    OCCwrapJavaJNI.BRepCheck_Result_InContext(swigCPtr, this, TopoDS_Shape.getCPtr(ContextShape), ContextShape);
  }

  public void Minimum() {
    OCCwrapJavaJNI.BRepCheck_Result_Minimum(swigCPtr, this);
  }

  public void Blind() {
    OCCwrapJavaJNI.BRepCheck_Result_Blind(swigCPtr, this);
  }

  public void SetFailStatus( TopoDS_Shape  S) {
    OCCwrapJavaJNI.BRepCheck_Result_SetFailStatus(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

  public SWIGTYPE_p_BRepCheck_ListOfStatus Status() {
    return new SWIGTYPE_p_BRepCheck_ListOfStatus(OCCwrapJavaJNI.BRepCheck_Result_Status(swigCPtr, this), false);
  }

  public long IsMinimum() {
    return OCCwrapJavaJNI.BRepCheck_Result_IsMinimum(swigCPtr, this);
  }

  public long IsBlind() {
    return OCCwrapJavaJNI.BRepCheck_Result_IsBlind(swigCPtr, this);
  }

  /**
   *  If  not  already   done,  performs the   InContext
   *  control and returns the list of status.
   */
  public SWIGTYPE_p_BRepCheck_ListOfStatus StatusOnShape( TopoDS_Shape  S) {
    return new SWIGTYPE_p_BRepCheck_ListOfStatus(OCCwrapJavaJNI.BRepCheck_Result_StatusOnShape__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(S), S), false);
  }

  public void InitContextIterator() {
    OCCwrapJavaJNI.BRepCheck_Result_InitContextIterator(swigCPtr, this);
  }

  public long MoreShapeInContext() {
    return OCCwrapJavaJNI.BRepCheck_Result_MoreShapeInContext(swigCPtr, this);
  }

  public  TopoDS_Shape  ContextualShape() {
    TopoDS_Shape ret = new TopoDS_Shape(OCCwrapJavaJNI.BRepCheck_Result_ContextualShape(swigCPtr, this), true);
    return ret;
  }

  public SWIGTYPE_p_BRepCheck_ListOfStatus StatusOnShape() {
    return new SWIGTYPE_p_BRepCheck_ListOfStatus(OCCwrapJavaJNI.BRepCheck_Result_StatusOnShape__SWIG_1(swigCPtr, this), false);
  }

  public void NextShapeInContext() {
    OCCwrapJavaJNI.BRepCheck_Result_NextShapeInContext(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.BRepCheck_Result_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepCheck_Result_get_type_descriptor(), true );
  }

  public static  BRepCheck_Result  DownCast( Standard_Transient  T) {
    return new BRepCheck_Result ( OCCwrapJavaJNI.BRepCheck_Result_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepCheck_Result_TypeOf(), true );
  }

}
