package opencascade;

/**
 *  Describes functions to build pipes.
 *  A pipe is built a basis shape (called the profile) along
 *  a wire (called the spine) by sweeping.
 *  The profile must not contain solids.
 *  A MakePipe object provides a framework for:
 *  - defining the construction of a pipe,
 *  - implementing the construction algorithm, and
 *  - consulting the result.
 *  Warning
 *  The MakePipe class implements pipe constructions
 *  with G1 continuous spines only.
 */
public class BRepOffsetAPI_MakePipe extends BRepPrimAPI_MakeSweep {

  private long swigCPtr;
  BRepOffsetAPI_MakePipe(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepOffsetAPI_MakePipe_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepOffsetAPI_MakePipe(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepOffsetAPI_MakePipe_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepOffsetAPI_MakePipe obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepOffsetAPI_MakePipe(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Constructs a pipe by sweeping the shape Profile along
   *  the wire Spine.The angle made by the spine with the profile is
   *  maintained along the length of the pipe.
   *  Warning
   *  Spine must be G1 continuous; that is, on the connection
   *  vertex of two edges of the wire, the tangent vectors on
   *  the left and on the right must have the same direction,
   *  though not necessarily the same magnitude.
   *  Exceptions
   *  Standard_DomainError if the profile is a solid or a
   *  composite solid.
   */
  public BRepOffsetAPI_MakePipe( TopoDS_Wire  Spine,  TopoDS_Shape  Profile) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakePipe__SWIG_0(TopoDS_Wire.getCPtr(Spine), Spine, TopoDS_Shape.getCPtr(Profile), Profile), true);
  }

  /**
   *  the same as previous but with setting of
   *  mode of sweep and the flag that indicates attempt
   *  to approximate a C1-continuous surface if a swept
   *  surface proved to be C0.
   */
  public BRepOffsetAPI_MakePipe( TopoDS_Wire  Spine,  TopoDS_Shape  Profile, GeomFill_Trihedron aMode, long ForceApproxC1) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakePipe__SWIG_1(TopoDS_Wire.getCPtr(Spine), Spine, TopoDS_Shape.getCPtr(Profile), Profile, aMode.swigValue(), ForceApproxC1), true);
  }

  public BRepOffsetAPI_MakePipe( TopoDS_Wire  Spine,  TopoDS_Shape  Profile, GeomFill_Trihedron aMode) {
    this(OCCwrapJavaJNI.new_BRepOffsetAPI_MakePipe__SWIG_2(TopoDS_Wire.getCPtr(Spine), Spine, TopoDS_Shape.getCPtr(Profile), Profile, aMode.swigValue()), true);
  }

  public  BRepFill_Pipe  Pipe() {
    BRepFill_Pipe ret = new BRepFill_Pipe(OCCwrapJavaJNI.BRepOffsetAPI_MakePipe_Pipe(swigCPtr, this), false, this);
    return ret;
  }

  public  TopTools_ListOfShape  Generated( TopoDS_Shape  S) {
    TopTools_ListOfShape ret = new TopTools_ListOfShape(OCCwrapJavaJNI.BRepOffsetAPI_MakePipe_Generated__SWIG_0(swigCPtr, this, TopoDS_Shape.getCPtr(S), S), false, this);
    return ret;
  }

  public TopoDS_Shape Generated( TopoDS_Shape  SSpine,  TopoDS_Shape  SProfile) {
    return new TopoDS_Shape(OCCwrapJavaJNI.BRepOffsetAPI_MakePipe_Generated__SWIG_1(swigCPtr, this, TopoDS_Shape.getCPtr(SSpine), SSpine, TopoDS_Shape.getCPtr(SProfile), SProfile), true);
  }

  public double ErrorOnSurface() {
    return OCCwrapJavaJNI.BRepOffsetAPI_MakePipe_ErrorOnSurface(swigCPtr, this);
  }

}
