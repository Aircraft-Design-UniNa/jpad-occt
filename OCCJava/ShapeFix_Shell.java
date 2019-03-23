package opencascade;

/**
 *  Fixing orientation of faces in shell
 */
public class ShapeFix_Shell extends ShapeFix_Root {
  ShapeFix_Shell(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor
   */
  public ShapeFix_Shell() {
    this(OCCwrapJavaJNI.new_ShapeFix_Shell__SWIG_0(), true);
  }

  /**
   *  Initializes by shell.
   */
  public ShapeFix_Shell( TopoDS_Shell  shape) {
    this(OCCwrapJavaJNI.new_ShapeFix_Shell__SWIG_1(TopoDS_Shell.getCPtr(shape), shape), true);
  }

  /**
   *  Initializes by shell.
   */
  public void Init( TopoDS_Shell  shell) {
    OCCwrapJavaJNI.ShapeFix_Shell_Init(swigCPtr, this, TopoDS_Shell.getCPtr(shell), shell);
  }

  /**
   *  Iterates on subshapes and performs fixes
   *  (for each face calls ShapeFix_Face::Perform and
   *  then calls FixFaceOrientation). The passed progress
   *  indicator allows user to consult the current progress
   *  stage and abort algorithm if needed.
   */
  public long Perform( Message_ProgressIndicator  theProgress) {
    return OCCwrapJavaJNI.ShapeFix_Shell_Perform__SWIG_0(swigCPtr, this,  Message_ProgressIndicator.getCPtr(theProgress) , theProgress);
  }

  public long Perform() {
    return OCCwrapJavaJNI.ShapeFix_Shell_Perform__SWIG_1(swigCPtr, this);
  }

  /**
   *  Fixes orientation of faces in shell.
   *  Changes orientation of face in the shell, if it is oriented opposite
   *  to neigbouring faces. If it is not possible to orient all faces in the
   *  shell (like in case of mebious band), this method orients only subset
   *  of faces. Other faces are stored in Error compound.
   *  Modes :
   *  isAccountMultiConex - mode for account cases of multiconnexity.
   *  If this mode is equal to Standard_True, separate shells will be created
   *  in the cases of multiconnexity. If this mode is equal to Standard_False,
   *  one shell will be created without account of multiconnexity.By defautt - Standard_True;
   *  NonManifold - mode for creation of non-manifold shells.
   *  If this mode is equal to Standard_True one non-manifold will be created from shell
   *  contains multishared edges. Else if this mode is equal to Standard_False only
   *  manifold shells will be created. By default - Standard_False.
   */
  public long FixFaceOrientation( TopoDS_Shell  shell, long isAccountMultiConex, long NonManifold) {
    return OCCwrapJavaJNI.ShapeFix_Shell_FixFaceOrientation__SWIG_0(swigCPtr, this, TopoDS_Shell.getCPtr(shell), shell, isAccountMultiConex, NonManifold);
  }

  public long FixFaceOrientation( TopoDS_Shell  shell, long isAccountMultiConex) {
    return OCCwrapJavaJNI.ShapeFix_Shell_FixFaceOrientation__SWIG_1(swigCPtr, this, TopoDS_Shell.getCPtr(shell), shell, isAccountMultiConex);
  }

  public long FixFaceOrientation( TopoDS_Shell  shell) {
    return OCCwrapJavaJNI.ShapeFix_Shell_FixFaceOrientation__SWIG_2(swigCPtr, this, TopoDS_Shell.getCPtr(shell), shell);
  }

  /**
   *  Returns fixed shell (or subset of oriented faces).
   */
  public TopoDS_Shell Shell() {
    return new TopoDS_Shell(OCCwrapJavaJNI.ShapeFix_Shell_Shell(swigCPtr, this), true);
  }

  /**
   *  In case of multiconnexity returns compound of fixed shells
   *  else returns one shell..
   */
  public TopoDS_Shape Shape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeFix_Shell_Shape(swigCPtr, this), true);
  }

  /**
   *  Returns Number of obtainrd shells;
   */
  public int NbShells() {
    return OCCwrapJavaJNI.ShapeFix_Shell_NbShells(swigCPtr, this);
  }

  /**
   *  Returns not oriented subset of faces.
   */
  public TopoDS_Compound ErrorFaces() {
    return new TopoDS_Compound(OCCwrapJavaJNI.ShapeFix_Shell_ErrorFaces(swigCPtr, this), true);
  }

  /**
   *  Returns the status of the last Fix.
   */
  public long Status(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeFix_Shell_Status(swigCPtr, this, status.swigValue());
  }

  public  ShapeFix_Face  FixFaceTool() {
    return new ShapeFix_Face ( OCCwrapJavaJNI.ShapeFix_Shell_FixFaceTool(swigCPtr, this), true );
  }

  public int[] FixFaceMode() {return OCCwrapJavaJNI.ShapeFix_Shell_FixFaceMode(swigCPtr, this);}

  public int[] FixOrientationMode() {return OCCwrapJavaJNI.ShapeFix_Shell_FixOrientationMode(swigCPtr, this);}

  /**
   *  Sets NonManifold flag
   */
  public void SetNonManifoldFlag(long isNonManifold) {
    OCCwrapJavaJNI.ShapeFix_Shell_SetNonManifoldFlag(swigCPtr, this, isNonManifold);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeFix_Shell_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_Shell_get_type_descriptor(), true );
  }

  public static  ShapeFix_Shell  DownCast( Standard_Transient  T) {
    return new ShapeFix_Shell ( OCCwrapJavaJNI.ShapeFix_Shell_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_Shell_TypeOf(), true );
  }

}
