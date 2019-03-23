package opencascade;

/**
 *  Split surface in the parametric space
 *  in according specified number of splits on the
 */
public class ShapeUpgrade_SplitSurfaceArea extends ShapeUpgrade_SplitSurface {
  ShapeUpgrade_SplitSurfaceArea(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor.
   */
  public ShapeUpgrade_SplitSurfaceArea() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_SplitSurfaceArea(), true);
  }

  public int[] NbParts() {return OCCwrapJavaJNI.ShapeUpgrade_SplitSurfaceArea_NbParts(swigCPtr, this);}

  public void Compute(long Segment) {
    OCCwrapJavaJNI.ShapeUpgrade_SplitSurfaceArea_Compute__SWIG_0(swigCPtr, this, Segment);
  }

  public void Compute() {
    OCCwrapJavaJNI.ShapeUpgrade_SplitSurfaceArea_Compute__SWIG_1(swigCPtr, this);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_SplitSurfaceArea_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_SplitSurfaceArea_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_SplitSurfaceArea  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_SplitSurfaceArea ( OCCwrapJavaJNI.ShapeUpgrade_SplitSurfaceArea_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_SplitSurfaceArea_TypeOf(), true );
  }

}
