package opencascade;

public class BRepCheck_Face extends BRepCheck_Result {
  BRepCheck_Face(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public BRepCheck_Face( TopoDS_Face  F) {
    this(OCCwrapJavaJNI.new_BRepCheck_Face(TopoDS_Face.getCPtr(F), F), true);
  }

  public BRepCheck_Status IntersectWires(long Update) {
    return BRepCheck_Status.swigToEnum(OCCwrapJavaJNI.BRepCheck_Face_IntersectWires__SWIG_0(swigCPtr, this, Update));
  }

  public BRepCheck_Status IntersectWires() {
    return BRepCheck_Status.swigToEnum(OCCwrapJavaJNI.BRepCheck_Face_IntersectWires__SWIG_1(swigCPtr, this));
  }

  public BRepCheck_Status ClassifyWires(long Update) {
    return BRepCheck_Status.swigToEnum(OCCwrapJavaJNI.BRepCheck_Face_ClassifyWires__SWIG_0(swigCPtr, this, Update));
  }

  public BRepCheck_Status ClassifyWires() {
    return BRepCheck_Status.swigToEnum(OCCwrapJavaJNI.BRepCheck_Face_ClassifyWires__SWIG_1(swigCPtr, this));
  }

  public BRepCheck_Status OrientationOfWires(long Update) {
    return BRepCheck_Status.swigToEnum(OCCwrapJavaJNI.BRepCheck_Face_OrientationOfWires__SWIG_0(swigCPtr, this, Update));
  }

  public BRepCheck_Status OrientationOfWires() {
    return BRepCheck_Status.swigToEnum(OCCwrapJavaJNI.BRepCheck_Face_OrientationOfWires__SWIG_1(swigCPtr, this));
  }

  public void SetUnorientable() {
    OCCwrapJavaJNI.BRepCheck_Face_SetUnorientable(swigCPtr, this);
  }

  /**
   *  Sets status of Face;
   */
  public void SetStatus(BRepCheck_Status theStatus) {
    OCCwrapJavaJNI.BRepCheck_Face_SetStatus(swigCPtr, this, theStatus.swigValue());
  }

  public long IsUnorientable() {
    return OCCwrapJavaJNI.BRepCheck_Face_IsUnorientable(swigCPtr, this);
  }

  public long GeometricControls() {
    return OCCwrapJavaJNI.BRepCheck_Face_GeometricControls__SWIG_0(swigCPtr, this);
  }

  public void GeometricControls(long B) {
    OCCwrapJavaJNI.BRepCheck_Face_GeometricControls__SWIG_1(swigCPtr, this, B);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.BRepCheck_Face_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepCheck_Face_get_type_descriptor(), true );
  }

  public static  BRepCheck_Face  DownCast( Standard_Transient  T) {
    return new BRepCheck_Face ( OCCwrapJavaJNI.BRepCheck_Face_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepCheck_Face_TypeOf(), true );
  }

}
