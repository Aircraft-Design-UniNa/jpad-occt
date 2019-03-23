package opencascade;

/**
 *  Builds the mesh of a shape with respect of their 
 *  correctly triangulated parts 
 */
public class BRepMesh_IncrementalMesh extends BRepMesh_DiscretRoot {
  BRepMesh_IncrementalMesh(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Default constructor
   */
  public BRepMesh_IncrementalMesh() {
    this(OCCwrapJavaJNI.new_BRepMesh_IncrementalMesh__SWIG_0(), true);
  }

  /**
   *  Destructor
   */
  public BRepMesh_IncrementalMesh( TopoDS_Shape  theShape, double theLinDeflection, long isRelative, double theAngDeflection, long isInParallel, long adaptiveMin) {
    this(OCCwrapJavaJNI.new_BRepMesh_IncrementalMesh__SWIG_1(TopoDS_Shape.getCPtr(theShape), theShape, theLinDeflection, isRelative, theAngDeflection, isInParallel, adaptiveMin), true);
  }

  /**
   *  Constructor.
   *  Automatically calls method Perform.
   *  @param theShape shape to be meshed.
   *  @param theLinDeflection linear deflection.
   *  @param isRelative if TRUE deflection used for discretization of 
   *  each edge will be <theLinDeflection> * <size of edge>. Deflection 
   *  used for the faces will be the maximum deflection of their edges.
   *  @param theAngDeflection angular deflection.
   *  @param isInParallel if TRUE shape will be meshed in parallel.
   */
  public BRepMesh_IncrementalMesh( TopoDS_Shape  theShape, double theLinDeflection, long isRelative, double theAngDeflection, long isInParallel) {
    this(OCCwrapJavaJNI.new_BRepMesh_IncrementalMesh__SWIG_2(TopoDS_Shape.getCPtr(theShape), theShape, theLinDeflection, isRelative, theAngDeflection, isInParallel), true);
  }

  /**
   *  Constructor.
   *  Automatically calls method Perform.
   *  @param theShape shape to be meshed.
   *  @param theParameters - parameters of meshing
   */
  public BRepMesh_IncrementalMesh( TopoDS_Shape  theShape, double theLinDeflection, long isRelative, double theAngDeflection) {
    this(OCCwrapJavaJNI.new_BRepMesh_IncrementalMesh__SWIG_3(TopoDS_Shape.getCPtr(theShape), theShape, theLinDeflection, isRelative, theAngDeflection), true);
  }

  public BRepMesh_IncrementalMesh( TopoDS_Shape  theShape, double theLinDeflection, long isRelative) {
    this(OCCwrapJavaJNI.new_BRepMesh_IncrementalMesh__SWIG_4(TopoDS_Shape.getCPtr(theShape), theShape, theLinDeflection, isRelative), true);
  }

  public BRepMesh_IncrementalMesh( TopoDS_Shape  theShape, double theLinDeflection) {
    this(OCCwrapJavaJNI.new_BRepMesh_IncrementalMesh__SWIG_5(TopoDS_Shape.getCPtr(theShape), theShape, theLinDeflection), true);
  }

  public BRepMesh_IncrementalMesh( TopoDS_Shape  theShape, SWIGTYPE_p_BRepMesh_FastDiscret__Parameters theParameters) {
    this(OCCwrapJavaJNI.new_BRepMesh_IncrementalMesh__SWIG_6(TopoDS_Shape.getCPtr(theShape), theShape, SWIGTYPE_p_BRepMesh_FastDiscret__Parameters.getCPtr(theParameters)), true);
  }

  /**
   *  Returns meshing parameters
   */
  public SWIGTYPE_p_BRepMesh_FastDiscret__Parameters Parameters() {
    return new SWIGTYPE_p_BRepMesh_FastDiscret__Parameters(OCCwrapJavaJNI.BRepMesh_IncrementalMesh_Parameters(swigCPtr, this), false);
  }

  /**
   *  Returns modifiable meshing parameters
   */
  public SWIGTYPE_p_BRepMesh_FastDiscret__Parameters ChangeParameters() {
    return new SWIGTYPE_p_BRepMesh_FastDiscret__Parameters(OCCwrapJavaJNI.BRepMesh_IncrementalMesh_ChangeParameters(swigCPtr, this), false);
  }

  /**
   *  Returns modified flag.
   */
  public long IsModified() {
    return OCCwrapJavaJNI.BRepMesh_IncrementalMesh_IsModified(swigCPtr, this);
  }

  /**
   *  Returns accumulated status flags faced during meshing.
   */
  public int GetStatusFlags() {
    return OCCwrapJavaJNI.BRepMesh_IncrementalMesh_GetStatusFlags(swigCPtr, this);
  }

  /**
   *  Returns multi-threading usage flag set by default in 
   *  Discret() static method (thus applied only to Mesh Factories).
   */
  public static long IsParallelDefault() {
    return OCCwrapJavaJNI.BRepMesh_IncrementalMesh_IsParallelDefault();
  }

  /**
   *  Setup multi-threading usage flag set by default in 
   *  Discret() static method (thus applied only to Mesh Factories).
   */
  public static void SetParallelDefault(long isInParallel) {
    OCCwrapJavaJNI.BRepMesh_IncrementalMesh_SetParallelDefault(isInParallel);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.BRepMesh_IncrementalMesh_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepMesh_IncrementalMesh_get_type_descriptor(), true );
  }

  public static  BRepMesh_IncrementalMesh  DownCast( Standard_Transient  T) {
    return new BRepMesh_IncrementalMesh ( OCCwrapJavaJNI.BRepMesh_IncrementalMesh_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepMesh_IncrementalMesh_TypeOf(), true );
  }

}
