package opencascade;

/**
 *  Extension of TColStd_PackedMapOfInteger class to be manipulated by handle.
 */
public class TColStd_HPackedMapOfInteger extends Standard_Transient {
  TColStd_HPackedMapOfInteger(long cPtr, boolean cMemoryOwn){super(cPtr, cMemoryOwn);}
   
  public synchronized void disposeUnused() {}

  public TColStd_HPackedMapOfInteger(int NbBuckets) {
    this(OCCwrapJavaJNI.new_TColStd_HPackedMapOfInteger__SWIG_0(NbBuckets), true);
  }

  public TColStd_HPackedMapOfInteger() {
    this(OCCwrapJavaJNI.new_TColStd_HPackedMapOfInteger__SWIG_1(), true);
  }

  public TColStd_HPackedMapOfInteger( TColStd_PackedMapOfInteger  theOther) {
    this(OCCwrapJavaJNI.new_TColStd_HPackedMapOfInteger__SWIG_2(TColStd_PackedMapOfInteger.getCPtr(theOther), theOther), true);
  }

  public  TColStd_PackedMapOfInteger  Map() {
    TColStd_PackedMapOfInteger ret = new TColStd_PackedMapOfInteger(OCCwrapJavaJNI.TColStd_HPackedMapOfInteger_Map(swigCPtr, this), false, this);
    return ret;
  }

  public  TColStd_PackedMapOfInteger  ChangeMap() {
    TColStd_PackedMapOfInteger ret = new TColStd_PackedMapOfInteger(OCCwrapJavaJNI.TColStd_HPackedMapOfInteger_ChangeMap(swigCPtr, this), false, this);
    return ret;
  }

  public static String get_type_name() {
    return OCCwrapJavaJNI.TColStd_HPackedMapOfInteger_get_type_name();
  }

  public static  Standard_Type  get_type_descriptor() {
    return new Standard_Type ( OCCwrapJavaJNI.TColStd_HPackedMapOfInteger_get_type_descriptor(), true );
  }

  public static  TColStd_HPackedMapOfInteger  DownCast( Standard_Transient  T) {
    return new TColStd_HPackedMapOfInteger ( OCCwrapJavaJNI.TColStd_HPackedMapOfInteger_DownCast( Standard_Transient.getCPtr(T) , T), true );
  }

  public static  Standard_Type  TypeOf() {
    return new Standard_Type ( OCCwrapJavaJNI.TColStd_HPackedMapOfInteger_TypeOf(), true );
  }

}
