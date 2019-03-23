package opencascade;

/**
 *  Conversion of the complete geometry of a shape
 *  (all 3D analytical representation of surfaces and curves)
 *  into NURBS geometry (execpt for Planes). For example,
 *  all curves supporting edges of the basis shape are converted
 *  into BSpline curves, and all surfaces supporting its faces are
 *  converted into BSpline surfaces.
 */
public class BRepBuilderAPI_NurbsConvert extends BRepBuilderAPI_ModifyShape {

  private long swigCPtr;
  BRepBuilderAPI_NurbsConvert(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_NurbsConvert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepBuilderAPI_NurbsConvert(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_NurbsConvert_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepBuilderAPI_NurbsConvert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepBuilderAPI_NurbsConvert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Constructs a framework for converting the geometry of a
   *  shape into NURBS geometry. Use the function Perform
   *  to define the shape to convert.
   */
  public BRepBuilderAPI_NurbsConvert() {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_NurbsConvert__SWIG_0(), true);
  }

  /**
   *  Builds a new shape by converting the geometry of the
   *  shape S into NURBS geometry. Specifically, all curves
   *  supporting edges of S are converted into BSpline
   *  curves, and all surfaces supporting its faces are
   *  converted into BSpline surfaces.
   *  Use the function Shape to access the new shape.
   *  Note: the constructed framework can be reused to
   *  convert other shapes. You specify these with the
   *  function Perform.
   */
  public BRepBuilderAPI_NurbsConvert( TopoDS_Shape  S, long Copy) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_NurbsConvert__SWIG_1(TopoDS_Shape.getCPtr(S), S, Copy), true);
  }

  public BRepBuilderAPI_NurbsConvert( TopoDS_Shape  S) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_NurbsConvert__SWIG_2(TopoDS_Shape.getCPtr(S), S), true);
  }

  /**
   *  Builds a new shape by converting the geometry of the
   *  shape S into NURBS geometry.
   *  Specifically, all curves supporting edges of S are
   *  converted into BSpline curves, and all surfaces
   *  supporting its faces are converted into BSpline surfaces.
   *  Use the function Shape to access the new shape.
   *  Note: this framework can be reused to convert other
   *  shapes: you specify them by calling the function Perform again.
   */
  public void Perform( TopoDS_Shape  S, long Copy) {
    OCCwrapJavaJNI.BRepBuilderAPI_NurbsConvert_Perform__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(S), S, Copy);
  }

  public void Perform( TopoDS_Shape  S) {
    OCCwrapJavaJNI.BRepBuilderAPI_NurbsConvert_Perform__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(S), S);
  }

}
