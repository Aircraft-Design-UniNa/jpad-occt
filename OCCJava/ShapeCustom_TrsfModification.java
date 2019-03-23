package opencascade;

/**
 *  Complements BRepTools_TrsfModification to provide reversible
 *  scaling regarding tolerances.
 *  Uses actual tolerances (attached to the shapes) not ones
 *  returned by BRep_Tool::Tolerance to work with tolerances
 *  lower than Precision::Confusion.
 */
public class ShapeCustom_TrsfModification extends BRepTools_TrsfModification {
  ShapeCustom_TrsfModification(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor
   */
  public ShapeCustom_TrsfModification( gp_Trsf  T) {
    this(OCCwrapJavaJNI.new_ShapeCustom_TrsfModification(gp_Trsf.getCPtr(T), T), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeCustom_TrsfModification_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeCustom_TrsfModification_get_type_descriptor(), true );
  }

  public static  ShapeCustom_TrsfModification  DownCast( Standard_Transient  T) {
    return new ShapeCustom_TrsfModification ( OCCwrapJavaJNI.ShapeCustom_TrsfModification_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeCustom_TrsfModification_TypeOf(), true );
  }

}
