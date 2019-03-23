package opencascade;

/**
 *  This class is intended to represent free bound and to store
 *  its properties.
 * 
 *  This class is used by ShapeAnalysis_FreeBoundsProperties
 *  class when storing each free bound and its properties.
 * 
 *  The properties stored in this class are the following:
 *  - area of the contour,
 *  - perimeter of the contour,
 *  - ratio of average length to average width of the contour,
 *  - average width of contour,
 *  - notches (narrow 'V'-like sub-contours) on the contour and
 *  their maximum width.
 * 
 *  This class provides methods for setting and getting fields
 *  only.
 */
public class ShapeAnalysis_FreeBoundData extends Standard_Transient {
  ShapeAnalysis_FreeBoundData(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor
   */
  public ShapeAnalysis_FreeBoundData() {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_FreeBoundData__SWIG_0(), true);
  }

  /**
   *  Creates object with contour given in the form of TopoDS_Wire
   */
  public ShapeAnalysis_FreeBoundData( TopoDS_Wire  freebound) {
    this(OCCwrapJavaJNI.new_ShapeAnalysis_FreeBoundData__SWIG_1(TopoDS_Wire.getCPtr(freebound), freebound), true);
  }

  /**
   *  Clears all properties of the contour.
   *  Contour bound itself is not cleared.
   */
  public void Clear() {
    OCCwrapJavaJNI.ShapeAnalysis_FreeBoundData_Clear(swigCPtr, this);
  }

  /**
   *  Sets contour
   */
  public void SetFreeBound( TopoDS_Wire  freebound) {
    OCCwrapJavaJNI.ShapeAnalysis_FreeBoundData_SetFreeBound(swigCPtr, this, TopoDS_Wire.getCPtr(freebound), freebound);
  }

  /**
   *  Sets area of the contour
   */
  public void SetArea(double area) {
    OCCwrapJavaJNI.ShapeAnalysis_FreeBoundData_SetArea(swigCPtr, this, area);
  }

  /**
   *  Sets perimeter of the contour
   */
  public void SetPerimeter(double perimeter) {
    OCCwrapJavaJNI.ShapeAnalysis_FreeBoundData_SetPerimeter(swigCPtr, this, perimeter);
  }

  /**
   *  Sets ratio of average length to average width of the contour
   */
  public void SetRatio(double ratio) {
    OCCwrapJavaJNI.ShapeAnalysis_FreeBoundData_SetRatio(swigCPtr, this, ratio);
  }

  /**
   *  Sets average width of the contour
   */
  public void SetWidth(double width) {
    OCCwrapJavaJNI.ShapeAnalysis_FreeBoundData_SetWidth(swigCPtr, this, width);
  }

  /**
   *  Adds notch on the contour with its maximum width
   */
  public void AddNotch( TopoDS_Wire  notch, double width) {
    OCCwrapJavaJNI.ShapeAnalysis_FreeBoundData_AddNotch(swigCPtr, this, TopoDS_Wire.getCPtr(notch), notch, width);
  }

  /**
   *  Returns contour
   */
  public TopoDS_Wire FreeBound() {
    return new TopoDS_Wire(OCCwrapJavaJNI.ShapeAnalysis_FreeBoundData_FreeBound(swigCPtr, this), true);
  }

  /**
   *  Returns area of the contour
   */
  public double Area() {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundData_Area(swigCPtr, this);
  }

  /**
   *  Returns perimeter of the contour
   */
  public double Perimeter() {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundData_Perimeter(swigCPtr, this);
  }

  /**
   *  Returns ratio of average length to average width of the contour
   */
  public double Ratio() {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundData_Ratio(swigCPtr, this);
  }

  /**
   *  Returns average width of the contour
   */
  public double Width() {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundData_Width(swigCPtr, this);
  }

  /**
   *  Returns number of notches on the contour
   */
  public int NbNotches() {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundData_NbNotches(swigCPtr, this);
  }

  public  TopTools_HSequenceOfShape  Notches() {
    return new TopTools_HSequenceOfShape ( OCCwrapJavaJNI.ShapeAnalysis_FreeBoundData_Notches(swigCPtr, this), true );
  }

  /**
   *  Returns notch on the contour
   */
  public TopoDS_Wire Notch(int index) {
    return new TopoDS_Wire(OCCwrapJavaJNI.ShapeAnalysis_FreeBoundData_Notch(swigCPtr, this, index), true);
  }

  /**
   *  Returns maximum width of notch specified by its rank number
   *  on the contour
   */
  public double NotchWidth(int index) {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundData_NotchWidth__SWIG_0(swigCPtr, this, index);
  }

  /**
   *  Returns maximum width of notch specified as TopoDS_Wire
   *  on the contour
   */
  public double NotchWidth( TopoDS_Wire  notch) {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundData_NotchWidth__SWIG_1(swigCPtr, this, TopoDS_Wire.getCPtr(notch), notch);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeAnalysis_FreeBoundData_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeAnalysis_FreeBoundData_get_type_descriptor(), true );
  }

  public static  ShapeAnalysis_FreeBoundData  DownCast( Standard_Transient  T) {
    return new ShapeAnalysis_FreeBoundData ( OCCwrapJavaJNI.ShapeAnalysis_FreeBoundData_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeAnalysis_FreeBoundData_TypeOf(), true );
  }

}
