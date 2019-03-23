package opencascade;

/**
 *  Divides a Face with one or more seam edge to avoid closed faces.
 *  Splitting is performed by U and V direction. The number of
 *  resulting faces can be defined by user.
 */
public class ShapeUpgrade_ClosedFaceDivide extends ShapeUpgrade_FaceDivide {
  ShapeUpgrade_ClosedFaceDivide(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Creates empty  constructor.
   */
  public ShapeUpgrade_ClosedFaceDivide() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_ClosedFaceDivide__SWIG_0(), true);
  }

  /**
   *  Initialize by a Face.
   */
  public ShapeUpgrade_ClosedFaceDivide( TopoDS_Face  F) {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_ClosedFaceDivide__SWIG_1(TopoDS_Face.getCPtr(F), F), true);
  }

  /**
   *  Sets the number of cutting lines by which closed face
   *  will be splitted. The resulting faces will be num+1.
   */
  public void SetNbSplitPoints(int num) {
    OCCwrapJavaJNI.ShapeUpgrade_ClosedFaceDivide_SetNbSplitPoints(swigCPtr, this, num);
  }

  /**
   *  Returns the number of splitting points
   */
  public int GetNbSplitPoints() {
    return OCCwrapJavaJNI.ShapeUpgrade_ClosedFaceDivide_GetNbSplitPoints(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_ClosedFaceDivide_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_ClosedFaceDivide_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_ClosedFaceDivide  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_ClosedFaceDivide ( OCCwrapJavaJNI.ShapeUpgrade_ClosedFaceDivide_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_ClosedFaceDivide_TypeOf(), true );
  }

}
