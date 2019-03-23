package opencascade;

/**
 *  implements a modification for the BRepTools
 *  Modifier algortihm. Converts all elementary
 *  surfaces into surfaces of revolution.
 */
public class ShapeCustom_ConvertToRevolution extends ShapeCustom_Modification {
  ShapeCustom_ConvertToRevolution(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public ShapeCustom_ConvertToRevolution() {
    this(OCCwrapJavaJNI.new_ShapeCustom_ConvertToRevolution(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeCustom_ConvertToRevolution_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeCustom_ConvertToRevolution_get_type_descriptor(), true );
  }

  public static  ShapeCustom_ConvertToRevolution  DownCast( Standard_Transient  T) {
    return new ShapeCustom_ConvertToRevolution ( OCCwrapJavaJNI.ShapeCustom_ConvertToRevolution_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeCustom_ConvertToRevolution_TypeOf(), true );
  }

}
