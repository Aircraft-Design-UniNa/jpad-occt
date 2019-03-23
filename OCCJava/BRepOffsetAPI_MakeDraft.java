package opencascade;

/**
 *  Build a draft surface along a wire
 */
public class BRepOffsetAPI_MakeDraft extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepOffsetAPI_MakeDraft(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepOffsetAPI_MakeDraft_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepOffsetAPI_MakeDraft(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepOffsetAPI_MakeDraft_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepOffsetAPI_MakeDraft obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepOffsetAPI_MakeDraft(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Constructs the draft surface object defined by the shape
   *  Shape, the direction Dir, and the angle Angle.
   *  Shape must be a TopoDS_Wire, Topo_DS_Face or
   *  TopoDS_Shell with free boundaries.
   *  Exceptions
   *  Standard_NotDone if Shape is not a TopoDS_Wire,
   *  Topo_DS_Face or TopoDS_Shell with free boundaries.
   */
  public BRepOffsetAPI_MakeDraft( TopoDS_Shape  Shape,  gp_Dir  Dir, double Angle) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakeDraft(TopoDS_Shape.getCPtr(Shape), Shape, gp_Dir.getCPtr(Dir), Dir, Angle), true);
  }

  /**
   *  Sets the options of this draft tool.
   *  If a transition has to be performed, it can be defined by
   *  the mode Style as RightCorner or RoundCorner,
   *  RightCorner being a corner defined by a sharp angle,
   *  and RoundCorner being a rounded corner.
   *  AngleMin is an angular tolerance used to detect
   *  whether a transition has to be performed or not.
   *  AngleMax sets the maximum value within which a
   *  RightCorner transition can be performed.
   *  AngleMin and AngleMax are expressed in radians.
   */
  public void SetOptions(BRepBuilderAPI_TransitionMode Style, double AngleMin, double AngleMax) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeDraft_SetOptions__SWIG_0(swigCPtr, this, Style.swigValue(), AngleMin, AngleMax);
  }

  public void SetOptions(BRepBuilderAPI_TransitionMode Style, double AngleMin) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeDraft_SetOptions__SWIG_1(swigCPtr, this, Style.swigValue(), AngleMin);
  }

  public void SetOptions(BRepBuilderAPI_TransitionMode Style) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeDraft_SetOptions__SWIG_2(swigCPtr, this, Style.swigValue());
  }

  public void SetOptions() {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeDraft_SetOptions__SWIG_3(swigCPtr, this);
  }

  /**
   *  Sets the direction of the draft for this object.
   *  If IsInternal is true, the draft is internal to the argument
   *  Shape used in the constructor.
   */
  public void SetDraft(long IsInternal) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeDraft_SetDraft__SWIG_0(swigCPtr, this, IsInternal);
  }

  public void SetDraft() {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeDraft_SetDraft__SWIG_1(swigCPtr, this);
  }

  /**
   *  Performs the draft using the length LengthMax as the
   *  maximum length for the corner edge between two draft faces.
   */
  public void Perform(double LengthMax) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeDraft_Perform__SWIG_0(swigCPtr, this, LengthMax);
  }

  /**
   *  Performs the draft up to the surface Surface.
   *  If KeepInsideSurface is true, the part of Surface inside
   *  the draft is kept in the result.
   */
  public void Perform( Geom_Surface  Surface, long KeepInsideSurface) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeDraft_Perform__SWIG_1(swigCPtr, this,  Geom_Surface.getCPtr(Surface) , Surface, KeepInsideSurface);
  }

  /**
   *  Performs the draft up to the shape StopShape.
   *  If KeepOutSide is true, the part of StopShape which is
   *  outside the Draft is kept in the result.
   */
  public void Perform( Geom_Surface  Surface) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeDraft_Perform__SWIG_2(swigCPtr, this,  Geom_Surface.getCPtr(Surface) , Surface);
  }

  public void Perform( TopoDS_Shape  StopShape, long KeepOutSide) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeDraft_Perform__SWIG_3(swigCPtr, this, TopoDS_Shape.getCPtr(StopShape), StopShape, KeepOutSide);
  }

  public void Perform( TopoDS_Shape  StopShape) {
    OCCwrapJavaJNI.BRepOffsetAPI_MakeDraft_Perform__SWIG_4(swigCPtr, this, TopoDS_Shape.getCPtr(StopShape), StopShape);
  }

  /**
   *  Returns the shell resulting from performance of the
   *  draft along the wire.
   */
  public TopoDS_Shell Shell() {
    return new TopoDS_Shell(OCCwrapJavaJNI.BRepOffsetAPI_MakeDraft_Shell(swigCPtr, this), true);
  }

}
