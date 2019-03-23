package opencascade;

/**
 *  Provides method to build a solid from a shells and
 *  orients them in order to have a valid solid with finite volume
 */
public class ShapeFix_Solid extends ShapeFix_Root {
  ShapeFix_Solid(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor;
   */
  public ShapeFix_Solid() {
    this(OCCwrapJavaJNI.new_ShapeFix_Solid__SWIG_0(), true);
  }

  /**
   *  Initializes by solid.
   */
  public ShapeFix_Solid( TopoDS_Solid  solid) {
    this(OCCwrapJavaJNI.new_ShapeFix_Solid__SWIG_1(TopoDS_Solid.getCPtr(solid), solid), true);
  }

  /**
   *  Initializes by solid .
   */
  public void Init( TopoDS_Solid  solid) {
    OCCwrapJavaJNI.ShapeFix_Solid_Init(swigCPtr, this, TopoDS_Solid.getCPtr(solid), solid);
  }

  /**
   *  Iterates on shells and performs fixes
   *  (calls ShapeFix_Shell for each subshell). The passed
   *  progress indicator allows user to consult the current
   *  progress stage and abort algorithm if needed.
   */
  public long Perform( Message_ProgressIndicator  theProgress) {
    return OCCwrapJavaJNI.ShapeFix_Solid_Perform__SWIG_0(swigCPtr, this,  Message_ProgressIndicator.getCPtr(theProgress) , theProgress);
  }

  public long Perform() {
    return OCCwrapJavaJNI.ShapeFix_Solid_Perform__SWIG_1(swigCPtr, this);
  }

  /**
   *  Calls MakeSolid and orients the solid to be "not infinite"
   */
  public TopoDS_Solid SolidFromShell( TopoDS_Shell  shell) {
    return new TopoDS_Solid(OCCwrapJavaJNI.ShapeFix_Solid_SolidFromShell(swigCPtr, this, TopoDS_Shell.getCPtr(shell), shell), true);
  }

  /**
   *  Returns the status of the last Fix.
   */
  public long Status(ShapeExtend_Status status) {
    return OCCwrapJavaJNI.ShapeFix_Solid_Status(swigCPtr, this, status.swigValue());
  }

  /**
   *  Returns resulting solid.
   */
  public TopoDS_Shape Solid() {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeFix_Solid_Solid(swigCPtr, this), true);
  }

  public  ShapeFix_Shell  FixShellTool() {
    return new ShapeFix_Shell ( OCCwrapJavaJNI.ShapeFix_Solid_FixShellTool(swigCPtr, this), true );
  }

  public int[] FixShellMode() {return OCCwrapJavaJNI.ShapeFix_Solid_FixShellMode(swigCPtr, this);}

  public int[] FixShellOrientationMode() {return OCCwrapJavaJNI.ShapeFix_Solid_FixShellOrientationMode(swigCPtr, this);}

  public long[] CreateOpenSolidMode() {return OCCwrapJavaJNI.ShapeFix_Solid_CreateOpenSolidMode(swigCPtr, this);}

  /**
   *  In case of multiconnexity returns compound of fixed solids
   *  else returns one solid.
   */
  public TopoDS_Shape Shape() {
    return new TopoDS_Shape(OCCwrapJavaJNI.ShapeFix_Solid_Shape(swigCPtr, this), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeFix_Solid_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_Solid_get_type_descriptor(), true );
  }

  public static  ShapeFix_Solid  DownCast( Standard_Transient  T) {
    return new ShapeFix_Solid ( OCCwrapJavaJNI.ShapeFix_Solid_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeFix_Solid_TypeOf(), true );
  }

}
