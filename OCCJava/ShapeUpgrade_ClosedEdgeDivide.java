package opencascade;

public class ShapeUpgrade_ClosedEdgeDivide extends ShapeUpgrade_EdgeDivide {
  ShapeUpgrade_ClosedEdgeDivide(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  /**
   *  Empty constructor.
   */
  public ShapeUpgrade_ClosedEdgeDivide() {
    this(OCCwrapJavaJNI.new_ShapeUpgrade_ClosedEdgeDivide(), true);
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.ShapeUpgrade_ClosedEdgeDivide_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_ClosedEdgeDivide_get_type_descriptor(), true );
  }

  public static  ShapeUpgrade_ClosedEdgeDivide  DownCast( Standard_Transient  T) {
    return new ShapeUpgrade_ClosedEdgeDivide ( OCCwrapJavaJNI.ShapeUpgrade_ClosedEdgeDivide_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.ShapeUpgrade_ClosedEdgeDivide_TypeOf(), true );
  }

}
