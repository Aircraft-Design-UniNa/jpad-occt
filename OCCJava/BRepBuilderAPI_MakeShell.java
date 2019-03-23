package opencascade;

/**
 *  Describes functions to build a
 *  shape corresponding to the skin of a surface.
 *  Note that the term shell in the class name has the same definition
 *  as that of a shell in STEP, in other words the skin of a shape,
 *  and not a solid model defined by surface and thickness. If you want
 *  to build the second sort of shell, you must use
 *  BRepOffsetAPI_MakeOffsetShape. A shell is made of a series of
 *  faces connected by their common edges.
 *  If the underlying surface of a face is not C2 continuous and
 *  the flag Segment is True, MakeShell breaks the surface down into
 *  several faces which are all C2 continuous and which are
 *  connected along the non-regular curves on the surface.
 *  The resulting shell contains all these faces.
 *  Construction of a Shell from a non-C2 continuous Surface
 *  A MakeShell object provides a framework for:
 *  -      defining the construction of a shell,
 *  -      implementing the construction algorithm, and
 *  -      consulting the result.
 *  Warning
 *  The connected C2 faces in the shell resulting from a decomposition of
 *  the surface are not sewn. For a sewn result, you need to use
 *  BRepOffsetAPI_Sewing. For a shell with thickness, you need to use
 *  BRepOffsetAPI_MakeOffsetShape.
 */
public class BRepBuilderAPI_MakeShell extends BRepBuilderAPI_MakeShape {

  private long swigCPtr;
  BRepBuilderAPI_MakeShell(long cPtr, boolean cMemoryOwn) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_MakeShell_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  BRepBuilderAPI_MakeShell(long cPtr, boolean cMemoryOwn, Object Parent) 
  {
    super(OCCwrapJavaJNI.BRepBuilderAPI_MakeShell_SWIGUpcast(cPtr), cMemoryOwn, Parent);
    swigCPtr = cPtr;
  }

  static long getCPtr(BRepBuilderAPI_MakeShell obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCwrapJavaJNI.delete_BRepBuilderAPI_MakeShell(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Constructs an empty shell framework. The Init
   *  function is used to define the construction arguments.
   *  Warning
   *  The function Error will return
   *  BRepBuilderAPI_EmptyShell if it is called before the function Init.
   */
  public BRepBuilderAPI_MakeShell() {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeShell__SWIG_0(), true);
  }

  /**
   *  Constructs a shell from the surface S.
   */
  public BRepBuilderAPI_MakeShell( Geom_Surface  S, long Segment) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeShell__SWIG_1( Geom_Surface.getCPtr(S) , S, Segment), true);
  }

  /**
   *  Constructs a shell from the surface S,
   *  limited in the u parametric direction by the two
   *  parameter values UMin and UMax, and limited in the v
   *  parametric direction by the two parameter values VMin and VMax.
   */
  public BRepBuilderAPI_MakeShell( Geom_Surface  S) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeShell__SWIG_2( Geom_Surface.getCPtr(S) , S), true);
  }

  public BRepBuilderAPI_MakeShell( Geom_Surface  S, double UMin, double UMax, double VMin, double VMax, long Segment) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeShell__SWIG_3( Geom_Surface.getCPtr(S) , S, UMin, UMax, VMin, VMax, Segment), true);
  }

  public BRepBuilderAPI_MakeShell( Geom_Surface  S, double UMin, double UMax, double VMin, double VMax) {
    this(OCCwrapJavaJNI.new_BRepBuilderAPI_MakeShell__SWIG_4( Geom_Surface.getCPtr(S) , S, UMin, UMax, VMin, VMax), true);
  }

  /**
   *  Defines or redefines the arguments
   *  for the construction of a shell. The construction is initialized
   *  with the surface S, limited in the u parametric direction by the
   *  two parameter values UMin and UMax, and in the v parametric
   *  direction by the two parameter values VMin and VMax.
   *  Warning
   *  The function Error returns:
   *  -      BRepBuilderAPI_ShellParametersOutOfRange
   *  when the given parameters are outside the bounds of the
   *  surface or the basis surface if S is trimmed
   */
  public void Init( Geom_Surface  S, double UMin, double UMax, double VMin, double VMax, long Segment) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeShell_Init__SWIG_0(swigCPtr, this,  Geom_Surface.getCPtr(S) , S, UMin, UMax, VMin, VMax, Segment);
  }

  public void Init( Geom_Surface  S, double UMin, double UMax, double VMin, double VMax) {
    OCCwrapJavaJNI.BRepBuilderAPI_MakeShell_Init__SWIG_1(swigCPtr, this,  Geom_Surface.getCPtr(S) , S, UMin, UMax, VMin, VMax);
  }

  /**
   *  Returns the construction status:
   *  -   BRepBuilderAPI_ShellDone if the shell is built, or
   *  -   another value of the BRepBuilderAPI_ShellError
   *  enumeration indicating why the construction failed.
   *  This is frequently BRepBuilderAPI_ShellParametersOutOfRange
   *  indicating that the given parameters are outside the bounds of the surface.
   */
  public BRepBuilderAPI_ShellError Error() {
    return BRepBuilderAPI_ShellError.swigToEnum(OCCwrapJavaJNI.BRepBuilderAPI_MakeShell_Error(swigCPtr, this));
  }

  /**
   *  Returns the new Shell.
   */
  public  TopoDS_Shell  Shell() {
    TopoDS_Shell ret = new TopoDS_Shell(OCCwrapJavaJNI.BRepBuilderAPI_MakeShell_Shell(swigCPtr, this), true);
    return ret;
  }

}
