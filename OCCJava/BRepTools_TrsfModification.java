package opencascade;

/**
 *  Describes a modification that uses a gp_Trsf to
 *  change the geometry of a shape. All functions return
 *  true and transform the geometry of the shape.
 */
public class BRepTools_TrsfModification extends BRepTools_Modification {
  BRepTools_TrsfModification(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public BRepTools_TrsfModification( gp_Trsf  T) {
    this(OCCwrapJavaJNI.new_BRepTools_TrsfModification(gp_Trsf.getCPtr(T), T), true);
  }

  /**
   *  Provides access to the gp_Trsf associated with this
   *  modification. The transformation can be changed.
   */
  public gp_Trsf Trsf() {
    gp_Trsf ret = new gp_Trsf(OCCwrapJavaJNI.BRepTools_TrsfModification_Trsf(swigCPtr, this), false, this);
    return ret; //new gp_Trsf.CRef (ret);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.BRepTools_TrsfModification_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepTools_TrsfModification_get_type_descriptor(), true );
  }

  public static  BRepTools_TrsfModification  DownCast( Standard_Transient  T) {
    return new BRepTools_TrsfModification ( OCCwrapJavaJNI.BRepTools_TrsfModification_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.BRepTools_TrsfModification_TypeOf(), true );
  }

}
