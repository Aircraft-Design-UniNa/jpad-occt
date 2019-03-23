package opencascade;

/**
 *  Divides face by max area criterium.
 */
public class ShapeUpgrade_FaceDivideArea extends ShapeUpgrade_FaceDivide {
  ShapeUpgrade_FaceDivideArea(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates empty  constructor.
   */
  public ShapeUpgrade_FaceDivideArea() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_FaceDivideArea__SWIG_0(), true);
  }

  public ShapeUpgrade_FaceDivideArea( TopoDS_Face  F) {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_FaceDivideArea__SWIG_1(TopoDS_Face.getCPtr(F), F), true);
  }

  public double[] MaxArea() {return OCCwrapJavaJNI.ShapeUpgrade_FaceDivideArea_MaxArea(swigCPtr, this);}

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_FaceDivideArea_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_FaceDivideArea_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_FaceDivideArea  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_FaceDivideArea ( OCCwrapJavaJNI.ShapeUpgrade_FaceDivideArea_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_FaceDivideArea_TypeOf(), true );
  }

}
