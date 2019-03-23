package opencascade;

/**
 *  implements a modification for the BRepTools
 *  Modifier algortihm. Will redress indirect
 *  surfaces.
 */
public class ShapeCustom_DirectModification extends ShapeCustom_Modification {
  ShapeCustom_DirectModification(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public ShapeCustom_DirectModification() {
    this(OCCwrapJavaJNI.new_ShapeCustom_DirectModification(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeCustom_DirectModification_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeCustom_DirectModification_get_type_descriptor(), true );
  }

  public static  ShapeCustom_DirectModification  DownCast( Standard_Transient  T) {
    return new ShapeCustom_DirectModification ( OCCwrapJavaJNI.ShapeCustom_DirectModification_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeCustom_DirectModification_TypeOf(), true );
  }

}
